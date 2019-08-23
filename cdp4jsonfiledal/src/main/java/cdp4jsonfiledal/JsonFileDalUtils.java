/*
 * JsonFileDalUtils.java
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

import static cdp4common.helpers.Utils.as;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4jsonfiledal.json.ExchangeFileHeader;
import cdp4jsonfiledal.json.ExchangeFileInitiator;
import cdp4jsonfiledal.json.OrganizationInfo;
import com.google.common.base.Strings;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Utility class for JSON File Data-Access-Layer.
 */
class JsonFileDalUtils {

  /**
   * A remark to be included in the exchange header file.
   */
  private final static String EXCHANGE_HEADER_REMARK = "This is an ECSS-E-TM-10-25 exchange file";

  /**
   * The copyright text to be included in the exchange header file.
   */
  private final static String EXCHANGE_HEADER_COPYRIGHT = "Copyright 2016 © RHEA.";

  /**
   * Adds the {@code referenceDataLibraries} to the target {@code siteReferenceDataLibraries} or
   * {@code modelReferenceDataLibraries} depending on the type and whether the targets already
   * contain them or not.
   *
   * @param referenceDataLibraries The {@link ReferenceDataLibrary}s that are to be added to the
   * target {@link Set<ReferenceDataLibrary>}
   * @param siteReferenceDataLibraries The target {@link Set<SiteReferenceDataLibrary>}
   * @param modelReferenceDataLibraries The target {@link Set<ModelReferenceDataLibrary>}
   */
  static void addReferenceDataLibraries(
      Collection<ReferenceDataLibrary> referenceDataLibraries,
      Set<SiteReferenceDataLibrary> siteReferenceDataLibraries,
      Set<ModelReferenceDataLibrary> modelReferenceDataLibraries) {
    for (var referenceDataLibrary : referenceDataLibraries) {
      var modelReferenceDataLibrary = as(referenceDataLibrary, ModelReferenceDataLibrary.class);
      if (modelReferenceDataLibrary != null) {
        modelReferenceDataLibraries.add(modelReferenceDataLibrary);
      }

      var siteReferenceDataLibrary = as(referenceDataLibrary, SiteReferenceDataLibrary.class);
      if (siteReferenceDataLibrary != null) {
        siteReferenceDataLibraries.add(siteReferenceDataLibrary);
      }
    }
  }

  /**
   * Adds the provided {@code iteration} to the {@code iterations} if this does not already contain
   * it.
   *
   * @param iteration The {@link Iteration} that is to be added.
   * @param iterations The target {@link Set<Iteration>}.
   */
  static void addIteration(Iteration iteration, Set<Iteration> iterations) {
    iterations.add(iteration);
  }

  /**
   * Adds the provided {@code engineeringModelSetup} to the {@code engineeringModelSetups} if this
   * does not already contain it.
   *
   * @param engineeringModelSetup The {@link EngineeringModelSetup} that is to be added.
   * @param engineeringModelSetups The target {@link Set<EngineeringModelSetup>}.
   */
  static void addEngineeringModelSetup(EngineeringModelSetup engineeringModelSetup,
      Set<EngineeringModelSetup> engineeringModelSetups) {
    engineeringModelSetups.add(engineeringModelSetup);
  }

  /**
   * Adds the provided {@code iterationSetup} to the {@code iterationSetups} if this does not
   * already contain it.
   *
   * @param iterationSetup The {@link IterationSetup} that is to be added.
   * @param iterationSetups The target {@link Set<IterationSetup>}.
   */
  static void addIterationSetup(IterationSetup iterationSetup,
      Set<IterationSetup> iterationSetups) {
    iterationSetups.add(iterationSetup);
  }

  /**
   * Adds the active {@link DomainOfExpertise} to the target {@link Set<DomainOfExpertise>} if this
   * does not already contain them.
   *
   * @param engineeringModelSetup The {@link EngineeringModelSetup} that contains the active {@link
   * DomainOfExpertise} instances.
   * @param domainOfExpertises The target {@link Set<DomainOfExpertise>}.
   */
  static void addDomainsOfExpertise(EngineeringModelSetup engineeringModelSetup,
      Set<DomainOfExpertise> domainOfExpertises) {
    domainOfExpertises.addAll(engineeringModelSetup.getActiveDomain());
  }

  /**
   * Adds the {@link Person} of the {@link Participant} of the {@code engineeringModelSetup} to the
   * target {@link Set{Person}} if this does not already contain them.
   *
   * @param engineeringModelSetup The {@link EngineeringModelSetup} that contains the active {@link
   * DomainOfExpertise} instances.
   * @param persons The target {@link Set{Person}}
   */
  static void addPersons(EngineeringModelSetup engineeringModelSetup, Set<Person> persons) {
    for (var participant : engineeringModelSetup.getParticipant()) {
      persons.add(participant.getPerson());
    }
  }

  /**
   * Creates a  {@link List<Thing>} that contains references to those objects that are to be
   * included in the JSON file.
   *
   * @param siteDirectory The {@link SiteDirectory} object that is to be serialized to the JSON
   * file.
   * @param siteReferenceDataLibraries The {@link SiteReferenceDataLibrary} instances that are to be
   * included.
   * @param domainOfExpertises The {@link DomainOfExpertise} instances that are to be included.
   * @param persons The {@link Person} instances that are to be included.
   * @param engineeringModelSetups The engineering Model Setups.
   * @param iterIterationSetups The Iteration Setups.
   * @return The pruned {@link Thing} collection.
   */
  static List<cdp4common.dto.Thing> createSiteDirectoryAndPrunedContainedThingDtos(
      SiteDirectory siteDirectory,
      Set<SiteReferenceDataLibrary> siteReferenceDataLibraries,
      Set<DomainOfExpertise> domainOfExpertises,
      Set<Person> persons,
      Set<EngineeringModelSetup> engineeringModelSetups,
      Set<IterationSetup> iterIterationSetups) {
    var dtos = new ArrayList<cdp4common.dto.Thing>();

    cdp4common.dto.SiteDirectory siteDirectoryDto = null;

    // collect the SiteDirectory objec graph, except for the graph branches that need to be pruned
    for (var siteDirectoryItem : siteDirectory.queryContainedThingsDeep()) {
      if (siteDirectoryItem.getClass() == SiteDirectory.class) {
        // include the SiteDirectory shallow DTO
        siteDirectoryDto = (cdp4common.dto.SiteDirectory) siteDirectoryItem.toDto();
        dtos.add(siteDirectoryDto);
      } else if (siteDirectoryItem.getClass() == SiteReferenceDataLibrary.class) {
        // include the SiteReferenceDataLibrary shallow DTO
        dtos.add(siteDirectoryItem.toDto());
      } else if (
          siteDirectoryItem.getContainerOfType(SiteReferenceDataLibrary.class) == null &&
              siteDirectoryItem.getContainerOfType(DomainOfExpertise.class) == null &&
              siteDirectoryItem.getContainerOfType(Person.class) == null &&
              siteDirectoryItem.getContainerOfType(EngineeringModelSetup.class) == null) {
        if (dtos.stream().allMatch(x -> x.getIid().equals(siteDirectoryItem.getIid()))) {
          dtos.add(siteDirectoryItem.toDto());
        }
      }
    }

    // remove the domains-of-expertise that should not be included in the cloned SiteDirectory
    siteDirectoryDto.getDomain().clear();
    for (var domainOfExpertise : domainOfExpertises) {
      var pocos = domainOfExpertise.queryContainedThingsDeep();

      for (var thing : pocos) {
        if (dtos.stream().noneMatch(x -> x.getIid().equals(thing.getIid()))) {
          dtos.add(thing.toDto());
        }
      }

      siteDirectoryDto.getDomain().add(domainOfExpertise.getIid());
    }

    // remove the persons that should not be included in SiteDirectory DTO from the DTO
    siteDirectoryDto.getPerson().clear();
    for (var person : persons) {
      var pojos = person.queryContainedThingsDeep();

      for (var thing : pojos) {
        if (dtos.stream().noneMatch(x -> x.getIid().equals(thing.getIid()))) {
          dtos.add(thing.toDto());
        }
      }

      siteDirectoryDto.getPerson().add(person.getIid());
    }

    // remove the EngineeringModelSetup instances and replace with pruned ones only including the required iterationSetups
    var clonedEngineeringModelSetups = new ArrayList<EngineeringModelSetup>();
    for (var engineeringModelSetup : engineeringModelSetups) {
      var clonedEngineeringModelSetup = engineeringModelSetup.clone(false);
      clonedEngineeringModelSetup.getIterationSetup().clear();

      for (var iterIterationSetup : iterIterationSetups) {
        if (iterIterationSetup.getContainer().equals(engineeringModelSetup)) {
          clonedEngineeringModelSetup.getIterationSetup().add(iterIterationSetup);
        }
      }

      clonedEngineeringModelSetups.add(clonedEngineeringModelSetup);
    }

    siteDirectoryDto.getModel().clear();
    for (var engineeringModelSetup : clonedEngineeringModelSetups) {
      // retrieve the EngineeringModelSetup contained object graph, including a shallow copy of the ModelReferenceDataLibrary
      // the ModelReferenceDataLibrary contained objects are written to its respective JSON file
      var nonModelReferenceLibrary = engineeringModelSetup.queryContainedThingsDeep().stream()
          .filter(x ->
              x.getClass() == ModelReferenceDataLibrary.class ||
                  x.getContainerOfType(ModelReferenceDataLibrary.class) == null)
          .collect(Collectors.toList());

      dtos.addAll(nonModelReferenceLibrary.stream()
          .map(Thing::toDto)
          .collect(Collectors.toList()));

      siteDirectoryDto.getModel().add(engineeringModelSetup.getIid());
    }

    return dtos;
  }

  /**
   * Queries the Person from the cache that is associated to the {@link SiteDirectory}.
   *
   * @param userName The username of the {@link Person} that is to be retrieved.
   * @param siteDirectory The {@link SiteDirectory} that references the cache to get the {@link
   * Person} from.
   * @return A instance of {@link Person}.
   */
  static Person queryActivePerson(String userName, SiteDirectory siteDirectory) {

    Person person = siteDirectory.getCache().asMap().values().stream()
        .filter(x -> x instanceof Person)
        .map(x -> (Person) x)
        .filter(pers -> pers.getShortName().equals(userName))
        .collect(MoreCollectors.toOptional()).orElse(null);

    return person;
  }

  /**
   * Factory method that creates a {@link ExchangeFileHeader} based on the provided {@code person}.
   *
   * @param person The {@link Person} that is used to create the {@link ExchangeFileHeader}.
   * @return An instance of {@link ExchangeFileHeader}.
   */
  static ExchangeFileHeader createExchangeFileHeader(Person person) {
    var exchangeFileInitiator = new ExchangeFileInitiator(
        person.getIid(),
        person.getGivenName(),
        person.getSurname(),
        person.getDefaultEmailAddress() != null ? person.getDefaultEmailAddress().getValue() : null
    );

    var organization = person.getOrganization() != null
        ? new OrganizationInfo(
        person.getOrganization().getIid(),
        person.getOrganization().getName(),
        null,
        !Strings.isNullOrEmpty(person.getOrganizationalUnit()) ? person.getOrganizationalUnit()
            : null
    )
        : null;

    var exchangeFileHeader = new ExchangeFileHeader();
    exchangeFileHeader.setDataModelVersion("2.4.1");
    exchangeFileHeader.setRemark(EXCHANGE_HEADER_REMARK);
    exchangeFileHeader.setCopyright(EXCHANGE_HEADER_COPYRIGHT);
    exchangeFileHeader.setExtensions(null);
    exchangeFileHeader.setCreatorPerson(exchangeFileInitiator);
    exchangeFileHeader.setCreatorOrganization(organization);

    return exchangeFileHeader;
  }
}
