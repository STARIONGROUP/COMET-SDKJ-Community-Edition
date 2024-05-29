/* --------------------------------------------------------------------------------------------------------------------
 * SiteDirectory.java
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
 * Static resource that allows to change representation of the {@link SiteDirectory} class.
 */
public class SiteDirectory {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.SiteDirectory} to {@link CDP4.SiteDirectoryData.SiteDirectory}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.SiteDirectory}
     */
    public static CDP4.SiteDirectoryData.SiteDirectory toEmf(cdp4common.sitedirectorydata.SiteDirectory thing) {       
        
        CDP4.SiteDirectoryData.SiteDirectory emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteDirectory();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getAnnotation().addAll(thing.getAnnotation().stream().map(item -> cdp4emfconnector.SiteDirectoryDataAnnotation.toEmf(item)).collect(Collectors.toList()));
        
        emf.setCreatedOn(thing.getCreatedOn());
        
        emf.setDefaultParticipantRole(thing.getDefaultParticipantRole() != null ? cdp4emfconnector.ParticipantRole.toEmf(thing.getDefaultParticipantRole()) : null);
        emf.setDefaultPersonRole(thing.getDefaultPersonRole() != null ? cdp4emfconnector.PersonRole.toEmf(thing.getDefaultPersonRole()) : null);
        emf.getDomain().addAll(thing.getDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDomainGroup().addAll(thing.getDomainGroup().stream().map(item -> cdp4emfconnector.DomainOfExpertiseGroup.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setLastModifiedOn(thing.getLastModifiedOn());
        
        emf.getLogEntry().addAll(thing.getLogEntry().stream().map(item -> cdp4emfconnector.SiteLogEntry.toEmf(item)).collect(Collectors.toList()));
        
        emf.getModel().addAll(thing.getModel().stream().map(item -> cdp4emfconnector.EngineeringModelSetup.toEmf(item)).collect(Collectors.toList()));
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.getNaturalLanguage().addAll(thing.getNaturalLanguage().stream().map(item -> cdp4emfconnector.NaturalLanguage.toEmf(item)).collect(Collectors.toList()));
        
        emf.getOrganization().addAll(thing.getOrganization().stream().map(item -> cdp4emfconnector.Organization.toEmf(item)).collect(Collectors.toList()));
        
        emf.getParticipantRole().addAll(thing.getParticipantRole().stream().map(item -> cdp4emfconnector.ParticipantRole.toEmf(item)).collect(Collectors.toList()));
        
        emf.getPerson().addAll(thing.getPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getPersonRole().addAll(thing.getPersonRole().stream().map(item -> cdp4emfconnector.PersonRole.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setShortName(thing.getShortName());
        
        emf.getSiteReferenceDataLibrary().addAll(thing.getSiteReferenceDataLibrary().stream().map(item -> cdp4emfconnector.SiteReferenceDataLibrary.toEmf(item)).collect(Collectors.toList()));
        
        emf.setThingPreference(thing.getThingPreference());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.SiteDirectory} to {@link cdp4common.sitedirectorydata.SiteDirectory}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.SiteDirectory}
     */
    public static cdp4common.sitedirectorydata.SiteDirectory toPojo(CDP4.SiteDirectoryData.SiteDirectory emfThing) {
        
        cdp4common.sitedirectorydata.SiteDirectory pojo = new cdp4common.sitedirectorydata.SiteDirectory();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getAnnotation().addAll(emfThing.getAnnotation().stream().map(item -> cdp4emfconnector.SiteDirectoryDataAnnotation.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setCreatedOn(emfThing.getCreatedOn());
        
        pojo.setDefaultParticipantRole(emfThing.getDefaultParticipantRole() != null ? cdp4emfconnector.ParticipantRole.toPojo(emfThing.getDefaultParticipantRole()) : null);
        pojo.setDefaultPersonRole(emfThing.getDefaultPersonRole() != null ? cdp4emfconnector.PersonRole.toPojo(emfThing.getDefaultPersonRole()) : null);
        pojo.getDomain().addAll(emfThing.getDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDomainGroup().addAll(emfThing.getDomainGroup().stream().map(item -> cdp4emfconnector.DomainOfExpertiseGroup.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setLastModifiedOn(emfThing.getLastModifiedOn());
        
        pojo.getLogEntry().addAll(emfThing.getLogEntry().stream().map(item -> cdp4emfconnector.SiteLogEntry.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getModel().addAll(emfThing.getModel().stream().map(item -> cdp4emfconnector.EngineeringModelSetup.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.getNaturalLanguage().addAll(emfThing.getNaturalLanguage().stream().map(item -> cdp4emfconnector.NaturalLanguage.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getOrganization().addAll(emfThing.getOrganization().stream().map(item -> cdp4emfconnector.Organization.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getParticipantRole().addAll(emfThing.getParticipantRole().stream().map(item -> cdp4emfconnector.ParticipantRole.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getPerson().addAll(emfThing.getPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getPersonRole().addAll(emfThing.getPersonRole().stream().map(item -> cdp4emfconnector.PersonRole.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setShortName(emfThing.getShortName());
        
        pojo.getSiteReferenceDataLibrary().addAll(emfThing.getSiteReferenceDataLibrary().stream().map(item -> cdp4emfconnector.SiteReferenceDataLibrary.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.SiteDirectory} from a {@link CDP4.SiteDirectoryData.SiteDirectory}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.SiteDirectory}.
    * @return A new {@link cdp4common.sitedirectorydata.SiteDirectory}
    */
    public static cdp4common.sitedirectorydata.SiteDirectory instiatePojo(CDP4.SiteDirectoryData.SiteDirectory thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.SiteDirectory(UUID.fromString(thing.getIid()), cache, uri);
    }
}
