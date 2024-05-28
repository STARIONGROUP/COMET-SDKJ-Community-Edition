/* --------------------------------------------------------------------------------------------------------------------
 * Person.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Kamil Wojnowski, Alexander van Delft, Nathanael Smiechowski
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
 *
 * This is an auto-generated EMF Converter Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4emfconnector;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import com.google.common.cache.Cache;
import lombok.EqualsAndHashCode;

/**
 * Static resource that allows to change representation of the {@link Person} class.
 */
public class Person {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.Person} to {@link CDP4.SiteDirectoryData.Person}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.Person}
     */
    public static CDP4.SiteDirectoryData.Person toEmf(cdp4common.sitedirectorydata.Person thing) {       
        
        CDP4.SiteDirectoryData.Person emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPerson();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.setDefaultDomain(thing.getDefaultDomain() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getDefaultDomain()) : null);
        emf.setDefaultEmailAddress(thing.getDefaultEmailAddress() != null ? cdp4emfconnector.EmailAddress.toEmf(thing.getDefaultEmailAddress()) : null);
        emf.setDefaultTelephoneNumber(thing.getDefaultTelephoneNumber() != null ? cdp4emfconnector.TelephoneNumber.toEmf(thing.getDefaultTelephoneNumber()) : null);
        emf.getEmailAddress().addAll(thing.getEmailAddress().stream().map(item -> cdp4emfconnector.EmailAddress.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setGivenName(thing.getGivenName());
        
        emf.setIsActive(thing.isActive());
        
        emf.setIsDeprecated(thing.isDeprecated());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setOrganization(thing.getOrganization() != null ? cdp4emfconnector.Organization.toEmf(thing.getOrganization()) : null);
        emf.setOrganizationalUnit(thing.getOrganizationalUnit());
        
        emf.setPassword(thing.getPassword());
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setRole(thing.getRole() != null ? cdp4emfconnector.PersonRole.toEmf(thing.getRole()) : null);
        emf.setShortName(thing.getShortName());
        
        emf.setSurname(thing.getSurname());
        
        emf.getTelephoneNumber().addAll(thing.getTelephoneNumber().stream().map(item -> cdp4emfconnector.TelephoneNumber.toEmf(item)).collect(Collectors.toList()));
        
        emf.setThingPreference(thing.getThingPreference());
        
        emf.getUserPreference().addAll(thing.getUserPreference().stream().map(item -> cdp4emfconnector.UserPreference.toEmf(item)).collect(Collectors.toList()));
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.Person} to {@link cdp4common.sitedirectorydata.Person}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.Person}
     */
    public static cdp4common.sitedirectorydata.Person toPojo(CDP4.SiteDirectoryData.Person emfThing) {
        
        cdp4common.sitedirectorydata.Person pojo = new cdp4common.sitedirectorydata.Person();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.setDefaultDomain(emfThing.getDefaultDomain() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getDefaultDomain()) : null);
        pojo.setDefaultEmailAddress(emfThing.getDefaultEmailAddress() != null ? cdp4emfconnector.EmailAddress.toPojo(emfThing.getDefaultEmailAddress()) : null);
        pojo.setDefaultTelephoneNumber(emfThing.getDefaultTelephoneNumber() != null ? cdp4emfconnector.TelephoneNumber.toPojo(emfThing.getDefaultTelephoneNumber()) : null);
        pojo.getEmailAddress().addAll(emfThing.getEmailAddress().stream().map(item -> cdp4emfconnector.EmailAddress.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setGivenName(emfThing.getGivenName());
        
        pojo.setActive(emfThing.getIsActive());
        
        pojo.setDeprecated(emfThing.getIsDeprecated());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setOrganization(emfThing.getOrganization() != null ? cdp4emfconnector.Organization.toPojo(emfThing.getOrganization()) : null);
        pojo.setOrganizationalUnit(emfThing.getOrganizationalUnit());
        
        pojo.setPassword(emfThing.getPassword());
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setRole(emfThing.getRole() != null ? cdp4emfconnector.PersonRole.toPojo(emfThing.getRole()) : null);
        pojo.setShortName(emfThing.getShortName());
        
        pojo.setSurname(emfThing.getSurname());
        
        pojo.getTelephoneNumber().addAll(emfThing.getTelephoneNumber().stream().map(item -> cdp4emfconnector.TelephoneNumber.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        pojo.getUserPreference().addAll(emfThing.getUserPreference().stream().map(item -> cdp4emfconnector.UserPreference.toPojo(item)).collect(Collectors.toList()));              
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.Person} from a {@link CDP4.SiteDirectoryData.Person}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.Person}.
    * @return A new {@link cdp4common.sitedirectorydata.Person}
    */
    public static cdp4common.sitedirectorydata.Person instiatePojo(CDP4.SiteDirectoryData.Person thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.Person(UUID.fromString(thing.getIid()), cache, uri);
    }
}
