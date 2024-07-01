/* --------------------------------------------------------------------------------------------------------------------
 * ChangeProposal.java
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
 * Static resource that allows to change representation of the {@link ChangeProposal} class.
 */
public class ChangeProposal {
   
    /**
     * Convert from {@link cdp4common.reportingdata.ChangeProposal} to {@link CDP4.ReportingData.ChangeProposal}
     *
     * @return Generated {@link CDP4.ReportingData.ChangeProposal}
     */
    public static CDP4.ReportingData.ChangeProposal toEmf(cdp4common.reportingdata.ChangeProposal thing) {       
        
        CDP4.ReportingData.ChangeProposal emf =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeProposal();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getApprovedBy().addAll(thing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toEmf(item)).collect(Collectors.toList()));
        
        emf.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emf.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emf.setChangeRequest(thing.getChangeRequest() != null ? cdp4emfconnector.ChangeRequest.toEmf(thing.getChangeRequest()) : null);        
        
        if (thing.getClassification() != null) {emf.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                          
        
        emf.setContent(thing.getContent());
        
        emf.setCreatedOn(thing.getCreatedOn());
        
        emf.getDiscussion().addAll(thing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setLanguageCode(thing.getLanguageCode());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emf.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        emf.getRelatedThing().addAll(thing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setShortName(thing.getShortName());
        
        emf.getSourceAnnotation().addAll(thing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getStatus() != null) {emf.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                          
        
        emf.setThingPreference(thing.getThingPreference());
        
        emf.setTitle(thing.getTitle());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.ReportingData.ChangeProposal} to {@link cdp4common.reportingdata.ChangeProposal}
     *
     * @return Generated {@link cdp4common.reportingdata.ChangeProposal}
     */
    public static cdp4common.reportingdata.ChangeProposal toPojo(CDP4.ReportingData.ChangeProposal emfThing) {
        
        cdp4common.reportingdata.ChangeProposal pojo = new cdp4common.reportingdata.ChangeProposal();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getApprovedBy().addAll(emfThing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojo.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setChangeRequest(emfThing.getChangeRequest() != null ? cdp4emfconnector.ChangeRequest.toPojo(emfThing.getChangeRequest()) : null);        
        
        if (emfThing.getClassification() != null) {pojo.setClassification(cdp4common.reportingdata.AnnotationClassificationKind.valueOf(emfThing.getClassification().toString()));}  
        
        pojo.setContent(emfThing.getContent());
        
        pojo.setCreatedOn(emfThing.getCreatedOn());
        
        pojo.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setLanguageCode(emfThing.getLanguageCode());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojo.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojo.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setShortName(emfThing.getShortName());
        
        pojo.getSourceAnnotation().addAll(emfThing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getStatus() != null) {pojo.setStatus(cdp4common.reportingdata.AnnotationStatusKind.valueOf(emfThing.getStatus().toString()));}  
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        pojo.setTitle(emfThing.getTitle());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.reportingdata.ChangeProposal} from a {@link CDP4.ReportingData.ChangeProposal}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.reportingdata.ChangeProposal}.
    * @return A new {@link cdp4common.reportingdata.ChangeProposal}
    */
    public static cdp4common.reportingdata.ChangeProposal instiatePojo(CDP4.ReportingData.ChangeProposal thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.reportingdata.ChangeProposal(UUID.fromString(thing.getIid()), cache, uri);
    }
}
