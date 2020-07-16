/* --------------------------------------------------------------------------------------------------------------------
 * Participant.java
 *
 * Copyright (c) 2015-2020 RHEA System S.A.
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
 * Static resource that allows to change representation of the {@link Participant} class.
 */
public class Participant {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.Participant} to {@link CDP4.SiteDirectoryData.Participant}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.Participant}
     */
    public static CDP4.SiteDirectoryData.Participant toEmf(cdp4common.sitedirectorydata.Participant thing) {       
        
        CDP4.SiteDirectoryData.Participant emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipant();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getDomain().addAll(thing.getDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setIsActive(thing.isActive());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setPerson(thing.getPerson() != null ? cdp4emfconnector.Person.toEmf(thing.getPerson()) : null);        
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setRole(thing.getRole() != null ? cdp4emfconnector.ParticipantRole.toEmf(thing.getRole()) : null);        
        
        emf.setSelectedDomain(thing.getSelectedDomain() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getSelectedDomain()) : null);        
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.Participant} to {@link cdp4common.sitedirectorydata.Participant}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.Participant}
     */
    public static cdp4common.sitedirectorydata.Participant toPojo(CDP4.SiteDirectoryData.Participant emfThing) {
        
        cdp4common.sitedirectorydata.Participant pojo = new cdp4common.sitedirectorydata.Participant();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getDomain().addAll(emfThing.getDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setActive(emfThing.getIsActive());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setPerson(emfThing.getPerson() != null ? cdp4emfconnector.Person.toPojo(emfThing.getPerson()) : null);        
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setRole(emfThing.getRole() != null ? cdp4emfconnector.ParticipantRole.toPojo(emfThing.getRole()) : null);        
        
        pojo.setSelectedDomain(emfThing.getSelectedDomain() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getSelectedDomain()) : null);        
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.Participant} from a {@link CDP4.SiteDirectoryData.Participant}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.Participant}.
    * @return A new {@link cdp4common.sitedirectorydata.Participant}
    */
    public static cdp4common.sitedirectorydata.Participant instiatePojo(CDP4.SiteDirectoryData.Participant thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.Participant(UUID.fromString(thing.getIid()), cache, uri);
    }
}
