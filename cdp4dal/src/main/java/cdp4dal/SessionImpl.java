/*
 * SessionImpl.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

package cdp4dal;

import static cdp4common.helpers.Utils.as;

import cdp4common.Version;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.exceptions.IncompleteModelException;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.types.CacheKey;
import cdp4dal.dal.Credentials;
import cdp4dal.dal.Dal;
import cdp4dal.dal.DalQueryAttributes;
import cdp4dal.events.DomainChangedEvent;
import cdp4dal.events.SessionEvent;
import cdp4dal.events.SessionStatus;
import cdp4dal.operations.OperationContainer;
import cdp4dal.permission.PermissionService;
import cdp4dal.permission.PermissionServiceImpl;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The {@link cdp4dal.Session} class encapsulates the {@link cdp4dal.dal.Credentials}, {@link Dal}
 * and {@link cdp4dal.Assembler} that constitute a user session with a data-source.
 */
@Log4j2
public class SessionImpl implements Session {

  /**
   * Backing field for active{@link #getActivePerson}.
   */
  private Person activePerson;

  /**
   * The cancellation flag.
   */
  private AtomicBoolean cancelled;

  /**
   * Backing field for {@link #getOpenReferenceDataLibraries}.
   */
  private final List<ReferenceDataLibrary> openReferenceDataLibraries;

  /**
   * Contains the open {@link Iteration} along with the active {@link DomainOfExpertise} and {@link
   * Participant}.
   */
  private final Map<Iteration, Pair<DomainOfExpertise, Participant>> openIterations;

  /**
   * Initializes a new instance of the {@link cdp4dal.Session} class.
   *
   * @param dal The associated {@link Dal} that is used to communicate with the data-source.
   * @param credentials The {@link Credentials} associated to the {@link Dal}.
   */
  public SessionImpl(Dal dal, Credentials credentials) {
    this.credentials = credentials;
    this.dal = dal;
    this.dal.setSession(this);
    this.assembler = new Assembler(credentials.getUri());
    this.permissionService = new PermissionServiceImpl(this);
    this.openReferenceDataLibraries = new ArrayList<>();
    this.openIterations = new HashMap<>();
  }

  /**
   * The {@link Credentials} that are used to connect to the data source
   */
  private cdp4dal.dal.Credentials credentials;

  /**
   * The {@link PermissionService} that handles access permissions for this {@link Session}.
   */
  private PermissionService permissionService;

  /**
   * The {@link Dal} that the current {@link cdp4dal.Session} communicates with.
   */
  private Dal dal;

  /**
   * {@inheritDoc}
   */
  @Override
  public Version getDalVersion() {
    return this.dal.getDalVersion();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isVersionSupported(Version version) {
    int comparison = version.compareTo(this.getDalVersion());
    return comparison <= 0;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Participant> getActivePersonParticipants() {
    return this.openIterations.values()
        .stream()
        .map(Pair::getRight)
        .collect(Collectors.toList());
  }

  /**
   * The {@link cdp4dal.Assembler} associated with the current {@link cdp4dal.Session} containing
   * the Cache.
   */
  private Assembler assembler;

  /**
   * {@inheritDoc}
   */
  @Override
  public Person getActivePerson() {
    return this.activePerson;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Credentials getCredentials() {
    return this.credentials;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PermissionService getPermissionService() {
    return this.permissionService;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Dal getDal() {
    return this.dal;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Assembler getAssembler() {
    return this.assembler;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getDataSourceUri() {
    if (this.credentials != null) {
      return this.credentials.getUri().toString();
    }

    return "";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getName() {
    String personName = this.getActivePerson() != null ? this.getActivePerson().getName() : "";
    return String.format("%s - %s", this.getDataSourceUri(), personName);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<ReferenceDataLibrary> getOpenReferenceDataLibraries() {
    return Lists.newArrayList(this.openReferenceDataLibraries);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ImmutableMap<Iteration, Pair<DomainOfExpertise, Participant>> getOpenIterations() {
    return ImmutableMap.copyOf(this.openIterations);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public SiteDirectory retrieveSiteDirectory() {
    return this.assembler.retrieveSiteDirectory();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public DomainOfExpertise querySelectedDomainOfExpertise(Iteration iteration) {
    Entry<Iteration, Pair<DomainOfExpertise, Participant>> iterationDomainPair = this.openIterations
        .entrySet()
        .stream()
        .filter(x -> x.getKey().getIid().equals(iteration.getIid()))
        .collect(MoreCollectors.toOptional()).orElse(null);

    if (iterationDomainPair == null) {
      return null;
    }

    return
        (iterationDomainPair.getValue() == null || iterationDomainPair.getValue().getLeft() == null)
            ? null : iterationDomainPair.getValue().getLeft();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<ReferenceDataLibrary> getEngineeringModelRdlChain(
      EngineeringModel engineeringModel) {
    return this.getEngineeringModelSetupRdlChain(engineeringModel.getEngineeringModelSetup());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<ReferenceDataLibrary> getEngineeringModelSetupRdlChain(
      EngineeringModelSetup engineeringModelSetup) {
    ModelReferenceDataLibrary requiredRdl = engineeringModelSetup.getRequiredRdl()
        .stream()
        .collect(MoreCollectors.toOptional()).orElse(null);

    if (requiredRdl == null) {
      return null;
    }

    List<ReferenceDataLibrary> rdls = Lists.newArrayList(requiredRdl);
    rdls.addAll(requiredRdl.getRequiredRdls());

    return rdls;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> open() {
    return CompletableFuture.runAsync(() -> {
      Stopwatch sw = Stopwatch.createStarted();
      log.info("Open request {}", this.getDataSourceUri());

      // Create the cancellation flag
      this.cancelled = new AtomicBoolean();
      List<cdp4common.dto.Thing> dtoThings;
      try {
        dtoThings = this.dal.open(this.credentials, this.cancelled).get();
      } catch (InterruptedException e) {
        log.info("Open request cancelled {}", this.getDataSourceUri());
        this.cancelled = null;
        return;
      } catch (ExecutionException e) {
        log.error("Open request for {} unexpectedly finished with an exception {}",
            this.getDataSourceUri(), e.getMessage());
        this.cancelled = null;
        return;
      }

      if (dtoThings.size() == 0) {
        log.warn("No data returned upon open on {}", this.getDataSourceUri());
      }

      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.BEGIN_UPDATE), null, null);
      this.assembler.synchronize(dtoThings, true).join();

      this.activePerson = this.assembler.getCache()
          .asMap()
          .values()
          .stream()
          .filter(x -> x instanceof Person)
          .map(x -> (Person) x)
          .filter(x -> x.getShortName().equals(this.credentials.getUserName()))
          .collect(MoreCollectors.toOptional()).orElse(null);

      if (this.activePerson == null) {
        // clear cache
        this.assembler.clear().join();

        throw new IncompleteModelException(
            "The Person object that matches the user specified in the Credentials could not be found");
      }

      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.END_UPDATE), null, null);

      log.info("Synchronization with the {} server done in {} [ms]", this.getDataSourceUri(),
          sw.elapsed(TimeUnit.MILLISECONDS));

      SessionEvent sessionChange = new SessionEvent(this, SessionStatus.OPEN);
      CDPMessageBus.getCurrent().sendMessage(sessionChange, null, null);

      log.info("cdp4dal.Session {} opened successfully in {} [ms]", this.getDataSourceUri(),
          sw.elapsed(TimeUnit.MILLISECONDS));
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void switchDomain(UUID iterationId, DomainOfExpertise domain) {
    Entry<Iteration, Pair<DomainOfExpertise, Participant>> iterationPair = this.openIterations
        .entrySet()
        .stream()
        .filter(x -> x.getKey().getIid().equals(iterationId))
        .collect(MoreCollectors.toOptional()).orElse(null);

    if (iterationPair != null && iterationPair.getValue().getLeft() != domain) {
      Pair<DomainOfExpertise, Participant> selectedParticipation = Pair.of(domain, iterationPair.getValue().getRight());
      this.openIterations.remove(iterationPair.getKey());
      this.openIterations.put(iterationPair.getKey(), selectedParticipation);
      CDPMessageBus.getCurrent()
          .sendMessage(new DomainChangedEvent(iterationPair.getKey(), domain), null, null);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> read(Iteration iteration, DomainOfExpertise domain) {
    if (this.activePerson == null) {
      throw new IllegalStateException(
          "The Iteration cannot be read when the ActivePerson is null; The Open method must be called prior to any of the Read methods");
    }

    return CompletableFuture.runAsync(() -> {

      // check if iteration is already open
      // if so check that the domain is not different
      Entry<Iteration, Pair<DomainOfExpertise, Participant>> iterationDomainPair = this.openIterations
          .entrySet()
          .stream()
          .filter(x -> x.getKey().getIid().equals(iteration.getIid()))
          .collect(MoreCollectors.toOptional()).orElse(null);

      if (iterationDomainPair != null) {
        if (iterationDomainPair.getValue().getLeft() != domain) {
          throw new IllegalArgumentException("The iteration is already open with another domain.");
        }
      }

      // Create the token source
      this.cancelled = new AtomicBoolean();
      List<cdp4common.dto.Thing> dtoThings;
      try {
        cdp4common.dto.Iteration iterationDto = (cdp4common.dto.Iteration) iteration.toDto();
        this.dal.setSession(this);
        dtoThings = this.dal.read(iterationDto, this.cancelled, null).get();
      } catch (InterruptedException e) {
        log.info("Session.read {} {} cancelled", iteration.getClassKind(), iteration.getIid());
        this.cancelled = null;
        return;
      } catch (ExecutionException e) {
        log.error("Session.read {} {} unexpectedly finished with an exception {}",
            iteration.getClassKind(), iteration.getIid(), e.getMessage());
        this.cancelled = null;
        return;
      }

      // proceed if no problem
      List list = dtoThings != null ? dtoThings : new ArrayList();
      if (list.size() == 0) {
        log.warn("No data returned upon read on {}", this.getDataSourceUri());
      }

      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.BEGIN_UPDATE), null, null);
      this.assembler.synchronize(list, true).join();

      this.addIterationToOpenList(iteration.getIid(), domain);

      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.END_UPDATE), null, null);
      log.info("Synchronization with the {} server done", this.getDataSourceUri());
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> read(ReferenceDataLibrary rdl) {
    if (this.activePerson == null) {
      throw new IllegalStateException(
          "The ReferenceDataLibrary cannot be read when the ActivePerson is null; The Open method must be called prior to any of the Read methods");
    }

    return this.read((Thing) rdl).thenAccept((x) -> this.addRdlToOpenList(rdl));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> read(Thing thing) {
    if (this.activePerson == null) {
      throw new IllegalStateException(String.format(
          "The %s cannot be read when the ActivePerson is null; The Open method must be called prior to any of the Read methods",
          thing.getClassKind()));
    }

    return CompletableFuture.runAsync(() -> {
      log.info("cdp4dal.Session.Read {} {}", thing.getClassKind(), thing.getIid());
      cdp4common.dto.Thing dto = thing.toDto();

      // Create the token source
      this.cancelled = new AtomicBoolean();
      List<cdp4common.dto.Thing> dtoThings;
      try {
        dtoThings = this.dal.read(dto, this.cancelled, null).get();
      } catch (InterruptedException e) {
        log.info("cdp4dal.Session.Read {} {} cancelled", thing.getClassKind(), thing.getIid());
        this.cancelled = null;
        return;
      } catch (ExecutionException e) {
        log.error("cdp4dal.Session.Read {} {} unexpectedly finished with an exception {}",
            thing.getClassKind(), thing.getIid(), e.getMessage());
        this.cancelled = null;
        return;
      }

      // proceed if no problem
      List list = dtoThings != null ? dtoThings : new ArrayList();
      if (list.size() == 0) {
        log.warn("No data returned upon read on {}", this.getDataSourceUri());
      }

      Stopwatch sw = Stopwatch.createStarted();
      log.info("Synchronization of DTOs for read from server {} started", this.getDataSourceUri());
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.BEGIN_UPDATE), null, null);
      this.assembler.synchronize(list, true).join();
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.END_UPDATE), null, null);

      log.info("Synchronization of DTOs for Read from server {} done in {} [ms]",
          this.getDataSourceUri(), sw.elapsed(TimeUnit.MILLISECONDS));
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> write(OperationContainer operationContainer) {
    if (this.activePerson == null) {
      throw new IllegalStateException(
          "The Write operation cannot be performed when the ActivePerson is null; The Open method must be called prior to performing a Write.");
    }

    return CompletableFuture.runAsync(() -> {
      this.dal.setSession(this);
      List<cdp4common.dto.Thing> dtoThings = null;
      dtoThings = this.dal.write(operationContainer, null).join();

      List list = dtoThings != null ? dtoThings : new ArrayList();
      if (list.size() == 0) {
        log.warn("No data returned upon write on {}", this.getDataSourceUri());
      }

      Stopwatch sw = Stopwatch.createStarted();
      log.info("Synchronization of DTOs for Write to server {} started", this.getDataSourceUri());
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.BEGIN_UPDATE), null, null);
      this.assembler.synchronize(list, true).join();
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.END_UPDATE), null, null);
      log.info("Synchronization of DTOs for Write to server {} done in {} [ms]",
          this.getDataSourceUri(), sw.elapsed(TimeUnit.MILLISECONDS));
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> refresh() {
    if (this.activePerson == null) {
      throw new IllegalStateException(
          "The Refresh operation cannot be performed when the ActivePerson is null; The Open method must be called prior to performing a Write.");
    }

    return CompletableFuture.runAsync(() -> {
      for (Thing topContainer : this.getSiteDirectoryAndActiveIterations()) {
        this.update(topContainer, true).join();
      }
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> reload() {
    if (this.activePerson == null) {
      throw new IllegalStateException(
          "The Reload operation cannot be performed when the ActivePerson is null; The Open method must be called prior to performing a Write.");
    }

    return CompletableFuture.runAsync(() -> {
      for (Thing topContainer : this.getSiteDirectoryAndActiveIterations()) {
        this.update(topContainer, false).join();
      }
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void cancel() {
    if (this.cancelled != null) {
      this.cancelled.set(true);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> close() {
    return CompletableFuture.runAsync(() -> {
      this.dal.close();
      this.assembler.clear().join();
      SessionEvent sessionChange = new SessionEvent(this, SessionStatus.CLOSED);
      CDPMessageBus.getCurrent().sendMessage(sessionChange, null, null);

      log.info("cdp4dal.Session {} closed successfully.", this.getDataSourceUri());
      this.openReferenceDataLibraries.clear();

      this.activePerson = null;
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> closeRdl(SiteReferenceDataLibrary sRdl) {
    return CompletableFuture.runAsync(() -> {
      // Add a delay for the loading panel to appear. Looks like client specific.
      // TimeUnit.MILLISECONDS.sleep(10);

      if (!this.openReferenceDataLibraries.contains(sRdl)) {
        return;
      }

      // Cannot close a SiteRdl that is required by a ModelRdl
      List<ReferenceDataLibrary> mRdls = this.openReferenceDataLibraries
          .stream()
          .filter(x -> x instanceof ModelReferenceDataLibrary)
          .collect(Collectors.toList());
      if (mRdls.stream().anyMatch(
          modelReferenceDataLibrary -> modelReferenceDataLibrary.getRequiredRdls()
              .contains(sRdl))) {
        return;
      }

      // Close all SiteRdl that Requires this SiteRdl
      List<ReferenceDataLibrary> sRdls = this.openReferenceDataLibraries
          .stream()
          .filter(x -> x instanceof SiteReferenceDataLibrary)
          .collect(Collectors.toList());

      List<ReferenceDataLibrary> sRdlsToClose = sRdls
          .stream()
          .filter(rdl -> rdl.getRequiredRdls().contains(sRdl))
          .collect(Collectors.toList());

      sRdlsToClose.add(sRdl);

      // Close from bottom to top
      List<ReferenceDataLibrary> orderedRdlsToClose = sRdlsToClose
          .stream()
          .sorted(
              (o1, o2) -> Integer.compare(o2.getRequiredRdls().size(), o1.getRequiredRdls().size()))
          .collect(Collectors.toList());

      ArrayList<CompletableFuture> tasks = new ArrayList<CompletableFuture>();
      for (ReferenceDataLibrary siteReferenceDataLibrary : orderedRdlsToClose) {
        tasks.add(this.assembler.closeRdl(siteReferenceDataLibrary));
      }

      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.BEGIN_UPDATE), null, null);
      CompletableFuture[] arr = new CompletableFuture[tasks.size()];
      CompletableFuture.allOf(tasks.toArray(arr)).join();
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.END_UPDATE), null, null);

      for (ReferenceDataLibrary siteReferenceDataLibrary : orderedRdlsToClose) {
        this.openReferenceDataLibraries.remove(siteReferenceDataLibrary);
      }

      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.RDL_CLOSED), null, null);
    });
  }

  /**
   * Read the new content of the {@link Dal}.
   *
   * @param thing The instance of {@link Thing} that is to be updated.
   * @param isRefresh is True if the RevisionNumber is taken into account in the update.
   * @return A {@link java.util.concurrent.CompletableFuture}.
   */
  private CompletableFuture<Void> update(Thing thing, boolean isRefresh) {
    return CompletableFuture.runAsync(() -> {
      int revisionNumber = isRefresh ? thing.getRevisionNumber() : 0;

      DalQueryAttributes queryAttribute = new DalQueryAttributes();
      queryAttribute.setRevisionNumber(revisionNumber);

      // Create the token source
      this.cancelled = new AtomicBoolean();
      List<cdp4common.dto.Thing> dtoThings;
      try {
        dtoThings = this.dal.read(thing.toDto(), this.cancelled, queryAttribute).get();
      } catch (InterruptedException e) {
        log.info("Open request cancelled {}", this.getDataSourceUri());
        this.cancelled = null;
        return;
      } catch (ExecutionException e) {
        log.error("Open request for {} unexpectedly finished with an exception {}",
            this.getDataSourceUri(), e.getMessage());
        this.cancelled = null;
        return;
      }

      // proceed if no problem
      List list = dtoThings != null ? dtoThings : new ArrayList();
      if (list.size() == 0) {
        log.warn("No data returned upon update on {}", this.getDataSourceUri());
      }

      Stopwatch sw = Stopwatch.createStarted();
      log.info("Synchronization of DTOs for update to server {} started", this.getDataSourceUri());
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.BEGIN_UPDATE), null, null);
      this.assembler.synchronize(list, true);
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.END_UPDATE), null, null);
      log.info("Synchronization of DTOs for Update to server {} done in {} [ms]",
          this.getDataSourceUri(), sw.elapsed(TimeUnit.MILLISECONDS));
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> closeModelRdl(ModelReferenceDataLibrary modelRdl) {
    return CompletableFuture.runAsync(() -> {
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.BEGIN_UPDATE), null, null);
      this.assembler.closeRdl(modelRdl).join();
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.END_UPDATE), null, null);
      this.openReferenceDataLibraries.remove(modelRdl);
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.RDL_CLOSED), null, null);
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<Void> closeIterationSetup(IterationSetup iterationSetup) {
    return CompletableFuture.runAsync(() -> {
      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.BEGIN_UPDATE), null, null);

      this.assembler.closeIterationSetup(iterationSetup).join();

      this.openIterations
          .keySet()
          .stream()
          .filter(x -> x.getIid().equals(iterationSetup.getIterationIid()))
          .collect(MoreCollectors.toOptional()).ifPresent(this.openIterations::remove);

      CDPMessageBus.getCurrent()
          .sendMessage(new SessionEvent(this, SessionStatus.END_UPDATE), null, null);
    });
  }

  /**
   * Gets the {@link SiteDirectory} and all active {@link Iteration}s from the Assembler's cache for
   * this {@link cdp4dal.Session}.
   *
   * @return The {@link List} of the collected {@link SiteDirectory} and all {@link Iteration}s from
   * the Assembler's cache for this {@link cdp4dal.Session}.
   */
  private List<Thing> getSiteDirectoryAndActiveIterations() {
    return this.assembler.getCache()
        .asMap()
        .values()
        .stream()
        .filter(x -> x instanceof SiteDirectory || (x instanceof Iteration
            && ((Iteration) x).getIterationSetup().getFrozenOn() == null && this.openIterations
            .containsKey(x)))
        .collect(Collectors.toList());
  }

  /**
   * Add RDL to the openReferenceDataLibraries list.
   *
   * @param thing The RDL thing to add.
   */
  private void addRdlToOpenList(Thing thing) {
    Thing thingFromCache = this.assembler.getCache()
        .getIfPresent(new CacheKey(thing.getIid(), null));
    if (thingFromCache == null) {
      return;
    }

    ReferenceDataLibrary rdl = as(thingFromCache, ReferenceDataLibrary.class);

    if (rdl == null) {
      return;
    }

    if (this.openReferenceDataLibraries.contains(rdl)) {
      return;
    }

    this.openReferenceDataLibraries.add(rdl);
    Collection<ReferenceDataLibrary> rdls = rdl.getRequiredRdls();
    rdls.removeAll(this.openReferenceDataLibraries);
    this.openReferenceDataLibraries.addAll(rdls);

    CDPMessageBus.getCurrent()
        .sendMessage(new SessionEvent(this, SessionStatus.RDL_OPENED), null, null);
  }

  /**
   * Add an open {@link Iteration} along its active {@link DomainOfExpertise}.
   *
   * @param iterationId The {@link UUID} of the open {@link Iteration}.
   * @param activeDomain The active {@link DomainOfExpertise} in this {@link cdp4dal.Session}.
   */
  private void addIterationToOpenList(UUID iterationId, DomainOfExpertise activeDomain) {
    Thing iterationFromCache = this.assembler.getCache()
        .getIfPresent(new CacheKey(iterationId, null));
    if (iterationFromCache == null) {
      return;
    }

    Iteration iteration = as(iterationFromCache, Iteration.class);
    if (iteration == null) {
      log.warn(
          "The iteration {} is not present in the Cache and is therefore not added to the open iterations",
          iterationId);
      return;
    }

    if (this.openIterations.containsKey(iteration)) {
      return;
    }

    Participant activeParticipant = ((EngineeringModel) iteration.getContainer()).getEngineeringModelSetup()
        .getParticipant()
        .stream()
        .filter(x -> x.getPerson().equals(this.getActivePerson()))
        .collect(MoreCollectors.toOptional()).orElseThrow(() -> new IllegalArgumentException(
            "The iteration does not have an active associated participant."));

    this.openIterations.put(iteration, Pair.of(activeDomain, activeParticipant));

    ModelReferenceDataLibrary modelRdl = ((EngineeringModel) iteration.getContainer()).getEngineeringModelSetup()
        .getRequiredRdl().stream().collect(MoreCollectors.onlyElement());
    this.addRdlToOpenList(modelRdl);
  }
}
