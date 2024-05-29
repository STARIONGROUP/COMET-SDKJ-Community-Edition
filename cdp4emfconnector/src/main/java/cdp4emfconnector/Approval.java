/* --------------------------------------------------------------------------------------------------------------------
 * Approval.java
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
 * Static resource that allows to change representation of the {@link Approval} class.
 */
public class Approval {
   
    /**
     * Convert from {@link cdp4common.reportingdata.Approval} to {@link CDP4.ReportingData.Approval}
     *
     * @return Generated {@link CDP4.ReportingData.Approval}
     */
    public static CDP4.ReportingData.Approval toEmf(cdp4common.reportingdata.Approval thing) {       
        
        CDP4.ReportingData.Approval emf =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createApproval();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        if (thing.getClassification() != null) {emf.setClassification(CDP4.ReportingData.AnnotationApprovalKind.valueOf(thing.getClassification().toString()));}                          
        
        emf.setContent(thing.getContent());
        
        emf.setCreatedOn(thing.getCreatedOn());
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setLanguageCode(thing.getLanguageCode());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setThingPreference(thing.getThingPreference());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.ReportingData.Approval} to {@link cdp4common.reportingdata.Approval}
     *
     * @return Generated {@link cdp4common.reportingdata.Approval}
     */
    public static cdp4common.reportingdata.Approval toPojo(CDP4.ReportingData.Approval emfThing) {
        
        cdp4common.reportingdata.Approval pojo = new cdp4common.reportingdata.Approval();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        if (emfThing.getClassification() != null) {pojo.setClassification(cdp4common.reportingdata.AnnotationApprovalKind.valueOf(emfThing.getClassification().toString()));}  
        
        pojo.setContent(emfThing.getContent());
        
        pojo.setCreatedOn(emfThing.getCreatedOn());
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setLanguageCode(emfThing.getLanguageCode());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.reportingdata.Approval} from a {@link CDP4.ReportingData.Approval}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.reportingdata.Approval}.
    * @return A new {@link cdp4common.reportingdata.Approval}
    */
    public static cdp4common.reportingdata.Approval instiatePojo(CDP4.ReportingData.Approval thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.reportingdata.Approval(UUID.fromString(thing.getIid()), cache, uri);
    }
}
