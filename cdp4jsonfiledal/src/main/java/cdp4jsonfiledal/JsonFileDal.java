/*
 * JsonFileDal.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cdp4jsonfiledal;

/**
 * Provides the Data Access Layer for file based import/export
 */
import static cdp4common.helpers.Utils.as;

import cdp4common.commondata.ClassKind;
import cdp4common.comparators.UuidComparator;
import cdp4common.dto.Person;
import cdp4common.dto.Thing;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.types.CacheKey;
import cdp4dal.UriUtils;
import cdp4dal.composition.DalExport;
import cdp4dal.composition.DalType;
import cdp4dal.dal.Credentials;
import cdp4dal.dal.DalBase;
import cdp4dal.dal.QueryAttributes;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4jsonfiledal.json.ExchangeFileHeader;
import cdp4jsonserializer.Cdp4JsonSerializer;
import cdp4jsonserializer.Cdp4JsonSerializerImpl;
import com.google.common.base.Stopwatch;
import com.google.common.cache.Cache;
import com.google.common.collect.MoreCollectors;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.io.inputstream.ZipInputStream;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.ZipParameters;

@DalExport(name = "JSON File Based", description = "A file based JSON Data Access Layer", cdpVersion = "1.1.0", dalType = DalType.FILE)
@Log4j2
public class JsonFileDal extends DalBase {

  /**
   * The site RDL zip location.
   */
  private final String siteRdlZipLocation = "SiteReferenceDataLibraries";

  /**
   * The model RDL zip location.
   */
  private final String modelRdlZipLocation = "ModelReferenceDataLibraries";

  /**
   * The engineering model zip location.
   */
  private final String engineeringModelZipLocation = "EngineeringModels";

  /**
   * The iteration zip location.
   */
  private final String iterationZipLocation = "Iterations";

  /**
   * The FileRevisions zip location.
   */
  private final String fileRevisionZipLocation = "FileRevisions";

  /**
   * Initializes a new instance of the {@link JsonFileDal} class.
   */
  public JsonFileDal() {
    this.serializer = new Cdp4JsonSerializerImpl(this.getDalVersion());
  }

  /**
   * Gets the {@link Cdp4JsonSerializer}
   */
  @Getter
  private Cdp4JsonSerializer serializer;

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isReadOnly() {
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<List<Thing>> write(List<OperationContainer> operationContainers,
      List<String> files) {
    this.validateOperationContainers(operationContainers);

    return CompletableFuture.supplyAsync(() -> {
      cdp4common.sitedirectorydata.SiteDirectory siteDirectory = null;
      HashSet<Iteration> iterations = new HashSet<Iteration>();
      HashSet<SiteReferenceDataLibrary> siteReferenceDataLibraries = new HashSet<cdp4common.sitedirectorydata.SiteReferenceDataLibrary>();
      HashSet<ModelReferenceDataLibrary> modelReferenceDataLibraries = new HashSet<cdp4common.sitedirectorydata.ModelReferenceDataLibrary>();
      HashSet<DomainOfExpertise> domainsOfExpertises = new HashSet<cdp4common.sitedirectorydata.DomainOfExpertise>();
      HashSet<cdp4common.sitedirectorydata.Person> persons = new HashSet<cdp4common.sitedirectorydata.Person>();
      HashSet<EngineeringModelSetup> engineeringModelSetups = new HashSet<cdp4common.sitedirectorydata.EngineeringModelSetup>();
      HashSet<IterationSetup> iterationSetups = new HashSet<cdp4common.sitedirectorydata.IterationSetup>();

      for (OperationContainer operationContainer : operationContainers) {
        Operation operation = operationContainer.getOperations().stream()
            .filter(x -> x.getModifiedThing() instanceof cdp4common.dto.Iteration)
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("Iteration is not present as a modified thing"));

        cdp4common.dto.Iteration iterationDto = (cdp4common.dto.Iteration) operation.getModifiedThing();
        Iteration iterationPojo = (cdp4common.engineeringmodeldata.Iteration) iterationDto
            .querySourceThing();

        JsonFileDalUtils.addIteration(iterationPojo, iterations);

        IterationSetup iterationSetup = iterationPojo.getIterationSetup();
        JsonFileDalUtils.addIterationSetup(iterationSetup, iterationSetups);

        Collection<ReferenceDataLibrary> iterationRequiredRls = iterationPojo.getRequiredRdls();
        JsonFileDalUtils
            .addReferenceDataLibraries(iterationRequiredRls, siteReferenceDataLibraries,
                modelReferenceDataLibraries);

        EngineeringModelSetup engineeringModelSetup = (cdp4common.sitedirectorydata.EngineeringModelSetup) iterationSetup
            .getContainer();
        JsonFileDalUtils
            .addEngineeringModelSetup(engineeringModelSetup, engineeringModelSetups);

        if (siteDirectory == null) {
          siteDirectory = (cdp4common.sitedirectorydata.SiteDirectory) engineeringModelSetup
              .getContainer();
        }

        // add the domains-of-expertise that are to be included in the File
        JsonFileDalUtils
            .addDomainsOfExpertise(engineeringModelSetup, domainsOfExpertises);

        // add the Persons that are to be included in the File
        JsonFileDalUtils.addPersons(engineeringModelSetup, persons);
      }

      String path = UriUtils.getFilePathFromUri(this.getSession().getCredentials().getUri())
          .toString();

      List<Thing> prunedSiteDirectoryDtos = JsonFileDalUtils
          .createSiteDirectoryAndPrunedContainedThingDtos(
              siteDirectory,
              siteReferenceDataLibraries,
              domainsOfExpertises,
              persons,
              engineeringModelSetups,
              iterationSetups);

      cdp4common.sitedirectorydata.Person activePerson = JsonFileDalUtils
          .queryActivePerson(this.getSession().getCredentials().getUserName(), siteDirectory);

      ExchangeFileHeader exchangeFileHeader = JsonFileDalUtils.createExchangeFileHeader(activePerson);

      try {
        ZipFile zipFile = new ZipFile(Paths.get(path, "ExportedModel.zip").toString(),
            this.getSession().getCredentials().getPassword().toCharArray());

        this.writeHeaderToZipFile(exchangeFileHeader, zipFile);

        this.writeSiteDirectoryToZipFile(prunedSiteDirectoryDtos, zipFile);

        this.writeSiteReferenceDataLibraryToZipFile(siteReferenceDataLibraries, zipFile);

        this.writeModelReferenceDataLibraryToZipFile(modelReferenceDataLibraries,
            zipFile);

        this.writeIterationsToZipFile(iterations, zipFile);

        log.info("Successfully exported the open session {} to {}.",
            this.getSession().getCredentials().getUri(), path);
      } catch (Exception ex) {
        log.error("Failed to export the open session to {}. Error: {}", path, ex.getMessage());
      }

      return new ArrayList<>();
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<List<Thing>> write(OperationContainer operationContainer,
      List<String> files) {
    throw new UnsupportedOperationException();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends Thing> CompletableFuture<List<Thing>> read(T thing, AtomicBoolean cancelled,
      QueryAttributes queryAttributes) {
    return CompletableFuture.supplyAsync(() -> {
      // only read Iterations in a file Dal
      if (!(thing instanceof cdp4common.dto.Iteration)) {
        throw new UnsupportedOperationException(
            "The JSONFileDal only supports Read on Iteration instances.");
      }

      if (this.getCredentials().getUri() == null) {
        throw new NullPointerException("The Credentials URI may not be null");
      }

      Path filePath = UriUtils.getFilePathFromUri(this.getCredentials().getUri());

      if (!Files.exists(filePath)) {
        throw new RuntimeException(
            "The specified filepath does not exist or you do not have access to it: "
                + filePath);
      }

      try {
        // re-read the to extract the reference data libraries that have not yet been fully dereferenced
        // and that are part of the required RDL's
        List<Thing> siteDirectoryData = this
            .readSiteDirectoryJson(filePath.toString(), this.getCredentials());

        // read file, SiteDirectory first.

        // get all relevant info from the selected iteration
        SiteDirectory siteDir = this.getSession().retrieveSiteDirectory();
        cdp4common.dto.Iteration iteration = as(thing, cdp4common.dto.Iteration.class);
        Optional<EngineeringModelSetup> engineeringModelSetup =
            siteDir.getModel().stream()
                .filter(x -> x.getIterationSetup().stream()
                    .anyMatch(y -> y.getIterationIid().equals(iteration.getIid())))
                .collect(MoreCollectors.toOptional());

        if (!engineeringModelSetup.isPresent()) {
          throw new IllegalArgumentException(
              "Could not locate the engineeringModel setup information");
        }

        // read engineeringModel
        String engineeringModelFilePath = String
            .format("%s.json", engineeringModelSetup.get().getEngineeringModelIid());
        List<Thing> listOfDtos = this.readInfoFromArchive(filePath.toString(), engineeringModelFilePath,
            this.getCredentials().getPassword().toCharArray());

        String iterationFilePath = String.format("%s.json", iteration.getIid());
        listOfDtos.addAll(this.readIterationArchiveEntry(filePath.toString(), iterationFilePath,
            this.getCredentials().getPassword().toCharArray()));

        // use the loaded siteDirectory information to determine the required model reference data library
        ModelReferenceDataLibrary modelRdl = engineeringModelSetup.get().getRequiredRdl().stream()
            .collect(MoreCollectors.onlyElement());

        // add the modelRdlDto to the returned collection to make sure it's content gets dereferenced
        if (listOfDtos.stream().noneMatch(x -> x.getIid().equals(modelRdl.getIid()))) {
          Thing modelRdlDto = siteDirectoryData.stream()
              .filter(x -> x.getIid().equals(modelRdl.getIid()))
              .collect(MoreCollectors.onlyElement());

          listOfDtos.add(modelRdlDto);
        }

        // based on engineering model setup load rdl chain
        String modelRdlFilePath = String.format("%s.json", modelRdl.getIid());
        List<Thing> modelRdlItems = this
            .readInfoFromArchive(filePath.toString(), modelRdlFilePath,
                this.getCredentials().getPassword().toCharArray());
        listOfDtos.addAll(modelRdlItems);

        // load the reference data libraries as per the containment chain
        SiteReferenceDataLibrary requiredRdl = modelRdl.getRequiredRdl();
        while (requiredRdl != null) {
          SiteReferenceDataLibrary tmpRequiredRdl = requiredRdl;

          // add the rdlDto to the returned collection to make sure it's content gets dereferenced
          Thing requiredRdlDto = siteDirectoryData.stream()
              .filter(x -> x.getIid().equals(tmpRequiredRdl.getIid()))
              .collect(MoreCollectors.onlyElement());

          listOfDtos.add(requiredRdlDto);

          String siteRdlFilePath = String.format("%s.json", requiredRdl.getIid());
          List<Thing> siteRdlItems = this
              .readInfoFromArchive(filePath.toString(), siteRdlFilePath,
                  this.getCredentials().getPassword().toCharArray());
          listOfDtos.addAll(siteRdlItems);

          // set the requiredRdl for the next iteration
          requiredRdl = requiredRdl.getRequiredRdl();
        }

        return listOfDtos;
      } catch (Exception ex) {
        String msg = "Failed to load file. Error: " + ex.getMessage();
        log.error(msg);

        if (this.getCredentials() != null) {
          this.close();
        }

        throw new RuntimeException(msg);
      }
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<List<Thing>> read(cdp4common.dto.Iteration iteration,
      AtomicBoolean cancelled, QueryAttributes queryAttributes) {
    return this.read((Thing) iteration, cancelled, queryAttributes);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends Thing> List<Thing> create(T thing) {
    throw new UnsupportedOperationException(
        "The Create operation is not supported by the file datasource.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends Thing> List<Thing> update(T thing) {
    throw new UnsupportedOperationException(
        "The Update operation is not supported by the file datasource.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends Thing> List<Thing> delete(T thing) {
    throw new UnsupportedOperationException(
        "The Delete operation is not supported by the file datasource.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<List<Thing>> open(Credentials credentials, AtomicBoolean cancelled) {
    // make sure the uri is not null
    if (credentials == null) {
      throw new NullPointerException("The Credentials URI may not be null");
    }

    Path filePath = UriUtils.getFilePathFromUri(credentials.getUri());

    if (!Files.exists(filePath)) {
      throw new RuntimeException(
          "The specified filepath does not exist or you do not have access to it: " + filePath);
    }

    return CompletableFuture.supplyAsync(() -> {
      try {
        List<Thing> returned = this.readSiteDirectoryJson(filePath.toString(), credentials);

        log.debug("The SiteDirectory contains {} Things", returned.size());

        // check for credentials in the returned DTO to see if the current Person is authorised to look into this SiteDirectory
        Optional<Person> person = returned.stream()
            .filter(p -> p.getClassKind() == ClassKind.Person && ((cdp4common.dto.Person) p)
                .getShortName().equals(credentials.getUserName()))
            .map(p -> (cdp4common.dto.Person) p)
            .collect(MoreCollectors.toOptional());

        if (!person.isPresent()) {
          String msg = String.format("%s is unauthorized", credentials.getUserName());
          log.error(msg);

          throw new IllegalAccessError(msg);
        }

        // set the credentials
        this.setCredentials(credentials);

        return returned;
      } catch (IllegalAccessError ex) {
        log.error(ex);
        this.closeSession();
        throw ex;
      } catch (Exception ex) {
        this.closeSession();

        String msg = String.format("Failed to load file. Error: %s", ex.getMessage());
        log.error(msg);

        throw new RuntimeException(msg, ex);
      }
    });
  }

  /**
   * Close the {@link JsonFileDal}.
   *
   * @throws IllegalArgumentException If the Data Access Layer is already closed.
   */
  @Override
  public void close() {
    if (this.getCredentials() == null) {
      throw new IllegalArgumentException(
          "An already closed Data Access Layer may not be closed again.");
    }

    this.closeSession();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isValidURI(String uri) {
    return Files.exists(Paths.get(uri));
  }

  /**
   * Retrieve the associated Cache from the operation original Thing instance.
   *
   * @param operation A operation instance holding the export information.
   * @return The associated cache of the Thing in the operation.
   */
  static Cache<CacheKey, cdp4common.commondata.Thing> getAssociatedCache(
      Operation operation) {
    cdp4common.commondata.Thing sourceThing = operation.getOriginalThing().querySourceThing();

    if (sourceThing == null) {
      throw new IllegalStateException(
          "The supplied OriginalThing DTO must be created from a POJO instance.");
    }

    // set the associated cache for this export request (is always one)
    return sourceThing.getCache();
  }

  private void validateOperationContainers(List<OperationContainer> operationContainers) {
    if (operationContainers == null) {
      throw new NullPointerException("The operationContainer may not be null");
    }

    if (operationContainers.isEmpty()) {
      throw new IllegalArgumentException("The operationContainers may not be empty");
    }

    if (operationContainers.stream()
        .anyMatch(operationContainer -> operationContainer.getOperations().isEmpty())) {
      throw new IllegalArgumentException("None of the OperationContainers contain Operations");
    }

    for (OperationContainer operationContainer : operationContainers) {
      if (operationContainer.getOperations().stream().anyMatch(
          operation -> operation.getModifiedThing().getClass()
              != cdp4common.dto.Iteration.class)) {
        throw new IllegalArgumentException(
            "Only instances of Things of type cdp4common.dto.Iteration are eligible for export");
      }
    }
  }

  /**
   * Write the header file to the zip export archive.
   *
   * @param echExchangeFileHeader The {@link ExchangeFileHeader} that is to be written to the {@link
   * ZipFile}.
   * @param zipFile The zip archive instance to add the information to.
   */
  private void writeHeaderToZipFile(ExchangeFileHeader echExchangeFileHeader, ZipFile zipFile)
      throws IOException {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.serializer.serializeToStream(echExchangeFileHeader, outputStream);

    ZipParameters zipParameters = new ZipParameters();
    zipParameters.setFileNameInZip("Header.json");
    zipFile.addStream(new ByteArrayInputStream(outputStream.toByteArray()), zipParameters);
  }

  /**
   * Writes the pruned {@link cdp4common.sitedirectorydata.SiteDirectory} to the {@link ZipFile}.
   *
   * @param prunedSiteDirectoryContents The {@link cdp4common.sitedirectorydata.SiteDirectory} that
   * has been pruned of all unnecessary data.
   * @param zipFile The target {@link ZipFile}.
   */
  private void writeSiteDirectoryToZipFile
  (List<cdp4common.dto.Thing> prunedSiteDirectoryContents,
      ZipFile zipFile)
      throws IOException {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    List<Thing> orderedContents = prunedSiteDirectoryContents.stream()
        .sorted((t1, t2) -> UuidComparator.compareUuid(t1.getIid(), t2.getIid()))
        .collect(Collectors.toList());
    this.serializer.serializeToStream(orderedContents, outputStream);

    ZipParameters zipParameters = new ZipParameters();
    zipParameters.setFileNameInZip("SiteDirectory.json");
    zipFile.addStream(new ByteArrayInputStream(outputStream.toByteArray()), zipParameters);
  }

  /**
   * Writes the {@link cdp4common.sitedirectorydata.SiteReferenceDataLibrary} to the {@link
   * ZipFile}
   *
   * @param siteReferenceDataLibraries The {@link cdp4common.sitedirectorydata.SiteReferenceDataLibrary}
   * that are to be written to the {@link ZipFile}
   * @param zipFile The target {@link ZipFile} that the {@code siteReferenceDataLibraries} are
   * written to.
   */
  private void writeSiteReferenceDataLibraryToZipFile(
      Set<SiteReferenceDataLibrary> siteReferenceDataLibraries, ZipFile zipFile)
      throws IOException {
    for (SiteReferenceDataLibrary siteReferenceDataLibrary : siteReferenceDataLibraries) {
      List<cdp4common.commondata.Thing> containmentPojos = siteReferenceDataLibrary.queryContainedThingsDeep();
      containmentPojos.remove(siteReferenceDataLibrary);

      List<Thing> dtos = containmentPojos.stream().map(cdp4common.commondata.Thing::toDto)
          .sorted((t1, t2) -> UuidComparator.compareUuid(t1.getIid(), t2.getIid()))
          .collect(Collectors.toList());

      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      this.serializer.serializeToStream(dtos, outputStream);

      String siteReferenceDataLibraryFilename = String
          .format("%s/%s.json", siteRdlZipLocation, siteReferenceDataLibrary.getIid());
      ZipParameters zipParameters = new ZipParameters();
      zipParameters.setFileNameInZip(siteReferenceDataLibraryFilename);
      zipFile.addStream(new ByteArrayInputStream(outputStream.toByteArray()), zipParameters);
    }
  }

  /**
   * Writes the {@link cdp4common.sitedirectorydata.ModelReferenceDataLibrary} to the {@link
   * ZipFile}.
   *
   * @param modelReferenceDataLibraries The {@link cdp4common.sitedirectorydata.ModelReferenceDataLibrary}
   * that are to be written to the {@link ZipFile}
   * @param zipFile The target {@link ZipFile} that the {@code modelReferenceDataLibraries} are
   * written to.
   */
  private void writeModelReferenceDataLibraryToZipFile(
      Set<cdp4common.sitedirectorydata.ModelReferenceDataLibrary> modelReferenceDataLibraries,
      ZipFile zipFile)
      throws IOException {
    for (ModelReferenceDataLibrary modelReferenceDataLibrary : modelReferenceDataLibraries) {
      List<cdp4common.commondata.Thing> containmentPojos = modelReferenceDataLibrary.queryContainedThingsDeep();
      containmentPojos.remove(modelReferenceDataLibrary);

      List<Thing> dtos = containmentPojos.stream().map(cdp4common.commondata.Thing::toDto)
          .sorted((t1, t2) -> UuidComparator.compareUuid(t1.getIid(), t2.getIid()))
          .collect(Collectors.toList());

      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      this.serializer.serializeToStream(dtos, outputStream);

      String modelReferenceDataLibraryFilename = String
          .format("%s/%s.json", modelRdlZipLocation, modelReferenceDataLibrary.getIid());
      ZipParameters zipParameters = new ZipParameters();
      zipParameters.setFileNameInZip(modelReferenceDataLibraryFilename);
      zipFile.addStream(new ByteArrayInputStream(outputStream.toByteArray()), zipParameters);
    }
  }

  /**
   * Writes the {@link cdp4common.engineeringmodeldata.Iteration} to the {@link ZipFile}
   *
   * @param iterations The {@link cdp4common.engineeringmodeldata.Iteration} that are to be written
   * to the {@link ZipFile}
   * @param zipFile The target {@link ZipFile} that the {@code iterations} are written to.
   */
  private void writeIterationsToZipFile
  (Set<cdp4common.engineeringmodeldata.Iteration> iterations,
      ZipFile zipFile)
      throws IOException {
    ArrayList<EngineeringModel> engineeringModels = new ArrayList<cdp4common.engineeringmodeldata.EngineeringModel>();

    for (Iteration iteration : iterations) {
      EngineeringModel engineeringModel = (cdp4common.engineeringmodeldata.EngineeringModel) iteration
          .getContainer();
      Thing engineeringModelDto = engineeringModel.toDto();

      if (!engineeringModels.contains(engineeringModel)) {
        ByteArrayOutputStream engineeringModelOutputStream = new ByteArrayOutputStream();
        this.serializer.serializeToStream(Collections.singletonList(engineeringModelDto),
            engineeringModelOutputStream);

        String engineeringModelFilename = String
            .format("%s/%s/%s.json", engineeringModelZipLocation, engineeringModelDto.getIid(),
                engineeringModelDto.getIid());
        ZipParameters zipParameters = new ZipParameters();
        zipParameters.setFileNameInZip(engineeringModelFilename);
        zipFile.addStream(new ByteArrayInputStream(engineeringModelOutputStream.toByteArray()),
            zipParameters);

        engineeringModels.add(engineeringModel);
      }

      List<cdp4common.commondata.Thing> containmentPojos = iteration.queryContainedThingsDeep();
      List<Thing> dtos = containmentPojos.stream().map(cdp4common.commondata.Thing::toDto)
          .sorted((t1, t2) -> UuidComparator.compareUuid(t1.getIid(), t2.getIid()))
          .collect(Collectors.toList());

      ByteArrayOutputStream iterationOutputStream = new ByteArrayOutputStream();
      this.serializer.serializeToStream(dtos, iterationOutputStream);

      String iterationFilename = String
          .format("%s/%s/%s/%s.json", engineeringModelZipLocation, engineeringModelDto.getIid(),
              iterationZipLocation, iteration.getIid());
      ZipParameters zipParameters = new ZipParameters();
      zipParameters.setFileNameInZip(iterationFilename);
      zipFile
          .addStream(new ByteArrayInputStream(iterationOutputStream.toByteArray()),
              zipParameters);
    }
  }

  private List<Thing> readSiteDirectoryJson(String filePath, Credentials credentials)
      throws IOException {
    String siteDirectoryFilePath = "SiteDirectory.json";

    return this.readInfoFromArchive(filePath, siteDirectoryFilePath,
        credentials.getPassword().toCharArray());
  }

  /**
   * Read an iteration file from the specified archive entry.
   *
   * @param filePath A path to the archive to read.
   * @param entryPath A path of an enry to read inside of the archive.
   * @param password A password to the archive.
   * @return A {@link List<Thing>} of deserialized dtos.
   * @throws IOException if there is a problem with input stream or deserialization process.
   */
  private List<Thing> readIterationArchiveEntry(String filePath, String entryPath, char[] password)
      throws IOException {
    List<Thing> listOfDtos = this.readInfoFromArchive(filePath, entryPath, password);

    // set the iteration id for returned objects
    UUID iterationId = listOfDtos.get(0).getIid();
    this.setIterationContainer(listOfDtos, iterationId);

    return listOfDtos;
  }

  /**
   * Read info from a specified archive entry.
   *
   * @param filePath A path to the archive to read.
   * @param entryPath A path of an enry to read inside of the archive.
   * @param password A password to the archive.
   * @return A {@link List<Thing>} of deserialized dtos.
   * @throws IOException if there is a problem with input stream or deserialization process.
   */
  private List<Thing> readInfoFromArchive(String filePath, String entryPath, char[] password)
      throws IOException {
    if (filePath == null) {
      throw new NullPointerException("Supplied file path is invalid.");
    }

    if (entryPath == null) {
      throw new NullPointerException("Supplied entry path is invalid.");
    }

    Stopwatch watch = Stopwatch.createStarted();

    LocalFileHeader localFileHeader;
    List<Thing> listOfDtos = new ArrayList<>();
    int readLen;
    byte[] readBuffer = new byte[4096];

    try (FileInputStream fileInputStream = new FileInputStream(filePath);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream, password)) {
      while ((localFileHeader = zipInputStream.getNextEntry()) != null) {
        if (localFileHeader.getFileName().endsWith(entryPath)) {
          watch.stop();
          log.info("ZipEntry {} retrieved in {} [ms]", localFileHeader.getFileName(),
              watch.elapsed(TimeUnit.MILLISECONDS));

          watch = Stopwatch.createStarted();

          listOfDtos = this.serializer.deserialize(zipInputStream);

          watch.stop();
          log.info("JSON Deserializer of {} completed in {} [ms]", localFileHeader.getFileName(),
              watch.elapsed(TimeUnit.MILLISECONDS));
          break;
        } else {
          // Make sure that you have the below while condition to read the entry completely
          // If you skip this while block, you will only get the first entry in the zip file
          log.info("{} from zip archive is skipped.", localFileHeader.getFileName());
          while (zipInputStream.read(readBuffer) != -1) {
          }
        }
      }

      return listOfDtos;
    }
  }
}
