/* --------------------------------------------------------------------------------------------------------------------
 * ModellingAnnotationItem.java
 *
 * Copyright (c) 2015-2020 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Kamil Wojnowski
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

public abstract class ModellingAnnotationItem {

    public static CDP4.ReportingData.ModellingAnnotationItem toEmf(cdp4common.reportingdata.ModellingAnnotationItem thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        
        case "cdp4common.reportingdata.RequestForWaiver":
        CDP4.ReportingData.ModellingAnnotationItem emfRequestForWaiver =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForWaiver();    
        
        emfRequestForWaiver.setIid(thing.getIid().toString()); 
        
        
        emfRequestForWaiver.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        
        if (thing.getClassification() != null) {emfRequestForWaiver.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfRequestForWaiver.setContent(thing.getContent());
        
        emfRequestForWaiver.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfRequestForWaiver.setLanguageCode(thing.getLanguageCode());
        
        emfRequestForWaiver.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForWaiver.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfRequestForWaiver.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfRequestForWaiver.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequestForWaiver.setShortName(thing.getShortName());
        
        
        if (thing.getStatus() != null) {emfRequestForWaiver.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfRequestForWaiver.setTitle(thing.getTitle());
        		        
        return emfRequestForWaiver;   
        
        
        case "cdp4common.reportingdata.RequestForDeviation":
        CDP4.ReportingData.ModellingAnnotationItem emfRequestForDeviation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForDeviation();    
        
        emfRequestForDeviation.setIid(thing.getIid().toString()); 
        
        
        emfRequestForDeviation.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        
        if (thing.getClassification() != null) {emfRequestForDeviation.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfRequestForDeviation.setContent(thing.getContent());
        
        emfRequestForDeviation.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfRequestForDeviation.setLanguageCode(thing.getLanguageCode());
        
        emfRequestForDeviation.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForDeviation.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfRequestForDeviation.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfRequestForDeviation.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequestForDeviation.setShortName(thing.getShortName());
        
        
        if (thing.getStatus() != null) {emfRequestForDeviation.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfRequestForDeviation.setTitle(thing.getTitle());
        		        
        return emfRequestForDeviation;   
        
        
        case "cdp4common.reportingdata.ChangeRequest":
        CDP4.ReportingData.ModellingAnnotationItem emfChangeRequest =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeRequest();    
        
        emfChangeRequest.setIid(thing.getIid().toString()); 
        
        
        emfChangeRequest.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        
        if (thing.getClassification() != null) {emfChangeRequest.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfChangeRequest.setContent(thing.getContent());
        
        emfChangeRequest.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfChangeRequest.setLanguageCode(thing.getLanguageCode());
        
        emfChangeRequest.setModifiedOn(thing.getModifiedOn());
        
        emfChangeRequest.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfChangeRequest.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfChangeRequest.setRevisionNumber(thing.getRevisionNumber());
        
        emfChangeRequest.setShortName(thing.getShortName());
        
        
        if (thing.getStatus() != null) {emfChangeRequest.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfChangeRequest.setTitle(thing.getTitle());
        		        
        return emfChangeRequest;   
        
        
        case "cdp4common.reportingdata.ReviewItemDiscrepancy":
        CDP4.ReportingData.ModellingAnnotationItem emfReviewItemDiscrepancy =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createReviewItemDiscrepancy();    
        
        emfReviewItemDiscrepancy.setIid(thing.getIid().toString()); 
        
        
        emfReviewItemDiscrepancy.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        
        if (thing.getClassification() != null) {emfReviewItemDiscrepancy.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfReviewItemDiscrepancy.setContent(thing.getContent());
        
        emfReviewItemDiscrepancy.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfReviewItemDiscrepancy.setLanguageCode(thing.getLanguageCode());
        
        emfReviewItemDiscrepancy.setModifiedOn(thing.getModifiedOn());
        
        emfReviewItemDiscrepancy.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfReviewItemDiscrepancy.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfReviewItemDiscrepancy.setRevisionNumber(thing.getRevisionNumber());
        
        emfReviewItemDiscrepancy.setShortName(thing.getShortName());
        
        
        if (thing.getStatus() != null) {emfReviewItemDiscrepancy.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfReviewItemDiscrepancy.setTitle(thing.getTitle());
        		        
        return emfReviewItemDiscrepancy;   
        
        
        case "cdp4common.reportingdata.ActionItem":
        CDP4.ReportingData.ModellingAnnotationItem emfActionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createActionItem();    
        
        emfActionItem.setIid(thing.getIid().toString()); 
        
        
        emfActionItem.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        
        if (thing.getClassification() != null) {emfActionItem.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfActionItem.setContent(thing.getContent());
        
        emfActionItem.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfActionItem.setLanguageCode(thing.getLanguageCode());
        
        emfActionItem.setModifiedOn(thing.getModifiedOn());
        
        emfActionItem.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfActionItem.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfActionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfActionItem.setShortName(thing.getShortName());
        
        
        if (thing.getStatus() != null) {emfActionItem.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfActionItem.setTitle(thing.getTitle());
        		        
        return emfActionItem;   
        
        
        case "cdp4common.reportingdata.ChangeProposal":
        CDP4.ReportingData.ModellingAnnotationItem emfChangeProposal =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeProposal();    
        
        emfChangeProposal.setIid(thing.getIid().toString()); 
        
        
        emfChangeProposal.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        
        if (thing.getClassification() != null) {emfChangeProposal.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfChangeProposal.setContent(thing.getContent());
        
        emfChangeProposal.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfChangeProposal.setLanguageCode(thing.getLanguageCode());
        
        emfChangeProposal.setModifiedOn(thing.getModifiedOn());
        
        emfChangeProposal.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfChangeProposal.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfChangeProposal.setRevisionNumber(thing.getRevisionNumber());
        
        emfChangeProposal.setShortName(thing.getShortName());
        
        
        if (thing.getStatus() != null) {emfChangeProposal.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfChangeProposal.setTitle(thing.getTitle());
        		        
        return emfChangeProposal;   
        
        
        case "cdp4common.reportingdata.ContractChangeNotice":
        CDP4.ReportingData.ModellingAnnotationItem emfContractChangeNotice =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createContractChangeNotice();    
        
        emfContractChangeNotice.setIid(thing.getIid().toString()); 
        
        
        emfContractChangeNotice.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        
        if (thing.getClassification() != null) {emfContractChangeNotice.setClassification(CDP4.ReportingData.AnnotationClassificationKind.valueOf(thing.getClassification().toString()));}                        
        
        emfContractChangeNotice.setContent(thing.getContent());
        
        emfContractChangeNotice.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfContractChangeNotice.setLanguageCode(thing.getLanguageCode());
        
        emfContractChangeNotice.setModifiedOn(thing.getModifiedOn());
        
        emfContractChangeNotice.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfContractChangeNotice.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfContractChangeNotice.setRevisionNumber(thing.getRevisionNumber());
        
        emfContractChangeNotice.setShortName(thing.getShortName());
        
        
        if (thing.getStatus() != null) {emfContractChangeNotice.setStatus(CDP4.ReportingData.AnnotationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfContractChangeNotice.setTitle(thing.getTitle());
        		        
        return emfContractChangeNotice;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.reportingdata.ModellingAnnotationItem toPojo(CDP4.ReportingData.ModellingAnnotationItem emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        
        case "CDP4.reportingdata.RequestForWaiver":                
        cdp4common.reportingdata.ModellingAnnotationItem pojoRequestForWaiver = new cdp4common.reportingdata.RequestForWaiver();	    
        
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
        cdp4common.reportingdata.ModellingAnnotationItem pojoRequestForDeviation = new cdp4common.reportingdata.RequestForDeviation();	    
        
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
        cdp4common.reportingdata.ModellingAnnotationItem pojoChangeRequest = new cdp4common.reportingdata.ChangeRequest();	    
        
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
        
        
        case "CDP4.reportingdata.ReviewItemDiscrepancy":                
        cdp4common.reportingdata.ModellingAnnotationItem pojoReviewItemDiscrepancy = new cdp4common.reportingdata.ReviewItemDiscrepancy();	    
        
        pojoReviewItemDiscrepancy.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReviewItemDiscrepancy.getApprovedBy().addAll(emfThing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoReviewItemDiscrepancy.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getClassification() != null) {pojoReviewItemDiscrepancy.setClassification(cdp4common.reportingdata.AnnotationClassificationKind.valueOf(emfThing.getClassification().toString()));}        
        
        pojoReviewItemDiscrepancy.setContent(emfThing.getContent());
        
        pojoReviewItemDiscrepancy.setCreatedOn(emfThing.getCreatedOn());
        
        pojoReviewItemDiscrepancy.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.setLanguageCode(emfThing.getLanguageCode());
        
        pojoReviewItemDiscrepancy.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReviewItemDiscrepancy.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoReviewItemDiscrepancy.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoReviewItemDiscrepancy.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoReviewItemDiscrepancy.setShortName(emfThing.getShortName());
        
        pojoReviewItemDiscrepancy.getSourceAnnotation().addAll(emfThing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getStatus() != null) {pojoReviewItemDiscrepancy.setStatus(cdp4common.reportingdata.AnnotationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoReviewItemDiscrepancy.setTitle(emfThing.getTitle());
        		        
        return pojoReviewItemDiscrepancy;   
        
        
        case "CDP4.reportingdata.ActionItem":                
        cdp4common.reportingdata.ModellingAnnotationItem pojoActionItem = new cdp4common.reportingdata.ActionItem();	    
        
        pojoActionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActionItem.getApprovedBy().addAll(emfThing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoActionItem.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getClassification() != null) {pojoActionItem.setClassification(cdp4common.reportingdata.AnnotationClassificationKind.valueOf(emfThing.getClassification().toString()));}        
        
        pojoActionItem.setContent(emfThing.getContent());
        
        pojoActionItem.setCreatedOn(emfThing.getCreatedOn());
        
        pojoActionItem.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.setLanguageCode(emfThing.getLanguageCode());
        
        pojoActionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActionItem.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoActionItem.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoActionItem.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoActionItem.setShortName(emfThing.getShortName());
        
        pojoActionItem.getSourceAnnotation().addAll(emfThing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getStatus() != null) {pojoActionItem.setStatus(cdp4common.reportingdata.AnnotationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoActionItem.setTitle(emfThing.getTitle());
        		        
        return pojoActionItem;   
        
        
        case "CDP4.reportingdata.ChangeProposal":                
        cdp4common.reportingdata.ModellingAnnotationItem pojoChangeProposal = new cdp4common.reportingdata.ChangeProposal();	    
        
        pojoChangeProposal.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeProposal.getApprovedBy().addAll(emfThing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoChangeProposal.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getClassification() != null) {pojoChangeProposal.setClassification(cdp4common.reportingdata.AnnotationClassificationKind.valueOf(emfThing.getClassification().toString()));}        
        
        pojoChangeProposal.setContent(emfThing.getContent());
        
        pojoChangeProposal.setCreatedOn(emfThing.getCreatedOn());
        
        pojoChangeProposal.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.setLanguageCode(emfThing.getLanguageCode());
        
        pojoChangeProposal.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeProposal.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoChangeProposal.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoChangeProposal.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoChangeProposal.setShortName(emfThing.getShortName());
        
        pojoChangeProposal.getSourceAnnotation().addAll(emfThing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getStatus() != null) {pojoChangeProposal.setStatus(cdp4common.reportingdata.AnnotationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoChangeProposal.setTitle(emfThing.getTitle());
        		        
        return pojoChangeProposal;   
        
        
        case "CDP4.reportingdata.ContractChangeNotice":                
        cdp4common.reportingdata.ModellingAnnotationItem pojoContractChangeNotice = new cdp4common.reportingdata.ContractChangeNotice();	    
        
        pojoContractChangeNotice.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoContractChangeNotice.getApprovedBy().addAll(emfThing.getApprovedBy().stream().map(item -> cdp4emfconnector.Approval.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoContractChangeNotice.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getClassification() != null) {pojoContractChangeNotice.setClassification(cdp4common.reportingdata.AnnotationClassificationKind.valueOf(emfThing.getClassification().toString()));}        
        
        pojoContractChangeNotice.setContent(emfThing.getContent());
        
        pojoContractChangeNotice.setCreatedOn(emfThing.getCreatedOn());
        
        pojoContractChangeNotice.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.setLanguageCode(emfThing.getLanguageCode());
        
        pojoContractChangeNotice.setModifiedOn(emfThing.getModifiedOn());
        
        pojoContractChangeNotice.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoContractChangeNotice.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoContractChangeNotice.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoContractChangeNotice.setShortName(emfThing.getShortName());
        
        pojoContractChangeNotice.getSourceAnnotation().addAll(emfThing.getSourceAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getStatus() != null) {pojoContractChangeNotice.setStatus(cdp4common.reportingdata.AnnotationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoContractChangeNotice.setTitle(emfThing.getTitle());
        		        
        return pojoContractChangeNotice;   
        
        	
    }
        return null;
        
        
     }

        
}
