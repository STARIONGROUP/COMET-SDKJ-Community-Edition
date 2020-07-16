/* --------------------------------------------------------------------------------------------------------------------
 * ContractDeviation.java
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
 * Static resource that allows to change representation of the {@link ContractDeviation} class.
 */
public abstract class ContractDeviation {
   
    /**
     * Convert from {@link cdp4common.reportingdata.ContractDeviation} to {@link CDP4.ReportingData.ContractDeviation}
     *
     * @return Generated {@link CDP4.ReportingData.ContractDeviation}
     */
    public static CDP4.ReportingData.ContractDeviation toEmf(cdp4common.reportingdata.ContractDeviation thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.reportingdata.RequestForWaiver":
        CDP4.ReportingData.ContractDeviation emfRequestForWaiver =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForWaiver();    
        
        emfRequestForWaiver.setIid(thing.getIid().toString()); 
        
        emfRequestForWaiver.getApprovedBy().addAll(thing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfRequestForWaiver.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getClassification() != null) {emfRequestForWaiver.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfRequestForWaiver.setContent(thing.getContent());
        
        emfRequestForWaiver.setCreatedOn(thing.getCreatedOn());
        
        emfRequestForWaiver.getDiscussion().addAll(thing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.setLanguageCode(thing.getLanguageCode());
        
        emfRequestForWaiver.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForWaiver.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfRequestForWaiver.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        emfRequestForWaiver.getRelatedThing().addAll(thing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequestForWaiver.setShortName(thing.getShortName());
        
        emfRequestForWaiver.getSourceAnnotation().addAll(thing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getStatus() != null) {emfRequestForWaiver.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfRequestForWaiver.setTitle(thing.getTitle());
        		        
        return emfRequestForWaiver;
        
        case "cdp4common.reportingdata.RequestForDeviation":
        CDP4.ReportingData.ContractDeviation emfRequestForDeviation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForDeviation();    
        
        emfRequestForDeviation.setIid(thing.getIid().toString()); 
        
        emfRequestForDeviation.getApprovedBy().addAll(thing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfRequestForDeviation.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getClassification() != null) {emfRequestForDeviation.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfRequestForDeviation.setContent(thing.getContent());
        
        emfRequestForDeviation.setCreatedOn(thing.getCreatedOn());
        
        emfRequestForDeviation.getDiscussion().addAll(thing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.setLanguageCode(thing.getLanguageCode());
        
        emfRequestForDeviation.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForDeviation.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfRequestForDeviation.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        emfRequestForDeviation.getRelatedThing().addAll(thing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequestForDeviation.setShortName(thing.getShortName());
        
        emfRequestForDeviation.getSourceAnnotation().addAll(thing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getStatus() != null) {emfRequestForDeviation.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfRequestForDeviation.setTitle(thing.getTitle());
        		        
        return emfRequestForDeviation;
        
        case "cdp4common.reportingdata.ChangeRequest":
        CDP4.ReportingData.ContractDeviation emfChangeRequest =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeRequest();    
        
        emfChangeRequest.setIid(thing.getIid().toString()); 
        
        emfChangeRequest.getApprovedBy().addAll(thing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfChangeRequest.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getClassification() != null) {emfChangeRequest.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfChangeRequest.setContent(thing.getContent());
        
        emfChangeRequest.setCreatedOn(thing.getCreatedOn());
        
        emfChangeRequest.getDiscussion().addAll(thing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.setLanguageCode(thing.getLanguageCode());
        
        emfChangeRequest.setModifiedOn(thing.getModifiedOn());
        
        emfChangeRequest.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfChangeRequest.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        emfChangeRequest.getRelatedThing().addAll(thing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.setRevisionNumber(thing.getRevisionNumber());
        
        emfChangeRequest.setShortName(thing.getShortName());
        
        emfChangeRequest.getSourceAnnotation().addAll(thing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getStatus() != null) {emfChangeRequest.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfChangeRequest.setTitle(thing.getTitle());
        		        
        return emfChangeRequest;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.ReportingData.ContractDeviation} to {@link cdp4common.reportingdata.ContractDeviation}
     *
     * @return Generated {@link cdp4common.reportingdata.ContractDeviation}
     */
    public static cdp4common.reportingdata.ContractDeviation toPojo(CDP4.ReportingData.ContractDeviation emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.reportingdata.RequestForWaiver":                
        cdp4common.reportingdata.ContractDeviation pojoRequestForWaiver = new cdp4common.reportingdata.RequestForWaiver();	    
        
        pojoRequestForWaiver.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForWaiver.getApprovedBy().addAll(emfThing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoRequestForWaiver.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getClassification() != null) {pojoRequestForWaiver.setClassification(cdp4common.reportingdata.AnnotationClassificationKind.valueOf(emfThing.getClassification().toString()));}        
        
        pojoRequestForWaiver.setContent(emfThing.getContent());
        
        pojoRequestForWaiver.setCreatedOn(emfThing.getCreatedOn());
        
        pojoRequestForWaiver.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.setLanguageCode(emfThing.getLanguageCode());
        
        pojoRequestForWaiver.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForWaiver.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoRequestForWaiver.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoRequestForWaiver.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequestForWaiver.setShortName(emfThing.getShortName());
        
        pojoRequestForWaiver.getSourceAnnotation().addAll(emfThing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getStatus() != null) {pojoRequestForWaiver.setStatus(cdp4common.reportingdata.AnnotationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoRequestForWaiver.setTitle(emfThing.getTitle());
        		        
        return pojoRequestForWaiver;
        
        case "CDP4.reportingdata.RequestForDeviation":                
        cdp4common.reportingdata.ContractDeviation pojoRequestForDeviation = new cdp4common.reportingdata.RequestForDeviation();	    
        
        pojoRequestForDeviation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForDeviation.getApprovedBy().addAll(emfThing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoRequestForDeviation.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getClassification() != null) {pojoRequestForDeviation.setClassification(cdp4common.reportingdata.AnnotationClassificationKind.valueOf(emfThing.getClassification().toString()));}        
        
        pojoRequestForDeviation.setContent(emfThing.getContent());
        
        pojoRequestForDeviation.setCreatedOn(emfThing.getCreatedOn());
        
        pojoRequestForDeviation.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.setLanguageCode(emfThing.getLanguageCode());
        
        pojoRequestForDeviation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForDeviation.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoRequestForDeviation.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoRequestForDeviation.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequestForDeviation.setShortName(emfThing.getShortName());
        
        pojoRequestForDeviation.getSourceAnnotation().addAll(emfThing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getStatus() != null) {pojoRequestForDeviation.setStatus(cdp4common.reportingdata.AnnotationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoRequestForDeviation.setTitle(emfThing.getTitle());
        		        
        return pojoRequestForDeviation;
        
        case "CDP4.reportingdata.ChangeRequest":                
        cdp4common.reportingdata.ContractDeviation pojoChangeRequest = new cdp4common.reportingdata.ChangeRequest();	    
        
        pojoChangeRequest.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeRequest.getApprovedBy().addAll(emfThing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoChangeRequest.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getClassification() != null) {pojoChangeRequest.setClassification(cdp4common.reportingdata.AnnotationClassificationKind.valueOf(emfThing.getClassification().toString()));}        
        
        pojoChangeRequest.setContent(emfThing.getContent());
        
        pojoChangeRequest.setCreatedOn(emfThing.getCreatedOn());
        
        pojoChangeRequest.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.setLanguageCode(emfThing.getLanguageCode());
        
        pojoChangeRequest.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeRequest.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoChangeRequest.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoChangeRequest.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoChangeRequest.setShortName(emfThing.getShortName());
        
        pojoChangeRequest.getSourceAnnotation().addAll(emfThing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getStatus() != null) {pojoChangeRequest.setStatus(cdp4common.reportingdata.AnnotationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoChangeRequest.setTitle(emfThing.getTitle());
        		        
        return pojoChangeRequest;
        	
        }

        return null;
    }
    
}
