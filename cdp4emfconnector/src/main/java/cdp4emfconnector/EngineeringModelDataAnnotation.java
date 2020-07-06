/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelDataAnnotation.java
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

public abstract class EngineeringModelDataAnnotation {

    public static CDP4.ReportingData.EngineeringModelDataAnnotation toEmf(cdp4common.reportingdata.EngineeringModelDataAnnotation thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        
        
        case "cdp4common.reportingdata.RequestForWaiver":
        CDP4.ReportingData.EngineeringModelDataAnnotation emfRequestForWaiver =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForWaiver();    
        
        emfRequestForWaiver.setIid(thing.getIid().toString()); 
        
        emfRequestForWaiver.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfRequestForWaiver.setContent(thing.getContent());
        
        emfRequestForWaiver.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfRequestForWaiver.setLanguageCode(thing.getLanguageCode());
        
        emfRequestForWaiver.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForWaiver.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfRequestForWaiver.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRequestForWaiver;   
        
        
        case "cdp4common.reportingdata.RequestForDeviation":
        CDP4.ReportingData.EngineeringModelDataAnnotation emfRequestForDeviation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForDeviation();    
        
        emfRequestForDeviation.setIid(thing.getIid().toString()); 
        
        emfRequestForDeviation.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfRequestForDeviation.setContent(thing.getContent());
        
        emfRequestForDeviation.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfRequestForDeviation.setLanguageCode(thing.getLanguageCode());
        
        emfRequestForDeviation.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForDeviation.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfRequestForDeviation.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRequestForDeviation;   
        
        
        case "cdp4common.reportingdata.ChangeRequest":
        CDP4.ReportingData.EngineeringModelDataAnnotation emfChangeRequest =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeRequest();    
        
        emfChangeRequest.setIid(thing.getIid().toString()); 
        
        emfChangeRequest.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfChangeRequest.setContent(thing.getContent());
        
        emfChangeRequest.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfChangeRequest.setLanguageCode(thing.getLanguageCode());
        
        emfChangeRequest.setModifiedOn(thing.getModifiedOn());
        
        emfChangeRequest.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfChangeRequest.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfChangeRequest;   
        
        
        case "cdp4common.reportingdata.ReviewItemDiscrepancy":
        CDP4.ReportingData.EngineeringModelDataAnnotation emfReviewItemDiscrepancy =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createReviewItemDiscrepancy();    
        
        emfReviewItemDiscrepancy.setIid(thing.getIid().toString()); 
        
        emfReviewItemDiscrepancy.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfReviewItemDiscrepancy.setContent(thing.getContent());
        
        emfReviewItemDiscrepancy.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfReviewItemDiscrepancy.setLanguageCode(thing.getLanguageCode());
        
        emfReviewItemDiscrepancy.setModifiedOn(thing.getModifiedOn());
        
        emfReviewItemDiscrepancy.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfReviewItemDiscrepancy.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfReviewItemDiscrepancy;   
        
        
        case "cdp4common.reportingdata.ActionItem":
        CDP4.ReportingData.EngineeringModelDataAnnotation emfActionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createActionItem();    
        
        emfActionItem.setIid(thing.getIid().toString()); 
        
        emfActionItem.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfActionItem.setContent(thing.getContent());
        
        emfActionItem.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfActionItem.setLanguageCode(thing.getLanguageCode());
        
        emfActionItem.setModifiedOn(thing.getModifiedOn());
        
        emfActionItem.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfActionItem.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfActionItem;   
        
        
        case "cdp4common.reportingdata.ChangeProposal":
        CDP4.ReportingData.EngineeringModelDataAnnotation emfChangeProposal =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeProposal();    
        
        emfChangeProposal.setIid(thing.getIid().toString()); 
        
        emfChangeProposal.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfChangeProposal.setContent(thing.getContent());
        
        emfChangeProposal.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfChangeProposal.setLanguageCode(thing.getLanguageCode());
        
        emfChangeProposal.setModifiedOn(thing.getModifiedOn());
        
        emfChangeProposal.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfChangeProposal.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfChangeProposal;   
        
        
        case "cdp4common.reportingdata.ContractChangeNotice":
        CDP4.ReportingData.EngineeringModelDataAnnotation emfContractChangeNotice =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createContractChangeNotice();    
        
        emfContractChangeNotice.setIid(thing.getIid().toString()); 
        
        emfContractChangeNotice.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfContractChangeNotice.setContent(thing.getContent());
        
        emfContractChangeNotice.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfContractChangeNotice.setLanguageCode(thing.getLanguageCode());
        
        emfContractChangeNotice.setModifiedOn(thing.getModifiedOn());
        
        emfContractChangeNotice.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfContractChangeNotice.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfContractChangeNotice;   
        
        
        case "cdp4common.reportingdata.EngineeringModelDataNote":
        CDP4.ReportingData.EngineeringModelDataAnnotation emfEngineeringModelDataNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createEngineeringModelDataNote();    
        
        emfEngineeringModelDataNote.setIid(thing.getIid().toString()); 
        
        emfEngineeringModelDataNote.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Participant.toEmf(thing.getAuthor()) : null);        
        
        emfEngineeringModelDataNote.setContent(thing.getContent());
        
        emfEngineeringModelDataNote.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        emfEngineeringModelDataNote.setLanguageCode(thing.getLanguageCode());
        
        emfEngineeringModelDataNote.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelDataNote.setPrimaryAnnotatedThing(thing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toEmf(thing.getPrimaryAnnotatedThing()) : null);
        
        emfEngineeringModelDataNote.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEngineeringModelDataNote;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.reportingdata.EngineeringModelDataAnnotation toPojo(CDP4.ReportingData.EngineeringModelDataAnnotation emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        
        
        case "CDP4.reportingdata.RequestForWaiver":                
        cdp4common.reportingdata.EngineeringModelDataAnnotation pojoRequestForWaiver = new cdp4common.reportingdata.RequestForWaiver();	    
        
        pojoRequestForWaiver.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForWaiver.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoRequestForWaiver.setContent(emfThing.getContent());
        
        pojoRequestForWaiver.setCreatedOn(emfThing.getCreatedOn());
        
        pojoRequestForWaiver.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.setLanguageCode(emfThing.getLanguageCode());
        
        pojoRequestForWaiver.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForWaiver.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoRequestForWaiver.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRequestForWaiver;   
        
        
        case "CDP4.reportingdata.RequestForDeviation":                
        cdp4common.reportingdata.EngineeringModelDataAnnotation pojoRequestForDeviation = new cdp4common.reportingdata.RequestForDeviation();	    
        
        pojoRequestForDeviation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForDeviation.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoRequestForDeviation.setContent(emfThing.getContent());
        
        pojoRequestForDeviation.setCreatedOn(emfThing.getCreatedOn());
        
        pojoRequestForDeviation.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.setLanguageCode(emfThing.getLanguageCode());
        
        pojoRequestForDeviation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForDeviation.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoRequestForDeviation.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRequestForDeviation;   
        
        
        case "CDP4.reportingdata.ChangeRequest":                
        cdp4common.reportingdata.EngineeringModelDataAnnotation pojoChangeRequest = new cdp4common.reportingdata.ChangeRequest();	    
        
        pojoChangeRequest.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeRequest.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoChangeRequest.setContent(emfThing.getContent());
        
        pojoChangeRequest.setCreatedOn(emfThing.getCreatedOn());
        
        pojoChangeRequest.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.setLanguageCode(emfThing.getLanguageCode());
        
        pojoChangeRequest.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeRequest.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoChangeRequest.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoChangeRequest;   
        
        
        case "CDP4.reportingdata.ReviewItemDiscrepancy":                
        cdp4common.reportingdata.EngineeringModelDataAnnotation pojoReviewItemDiscrepancy = new cdp4common.reportingdata.ReviewItemDiscrepancy();	    
        
        pojoReviewItemDiscrepancy.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReviewItemDiscrepancy.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoReviewItemDiscrepancy.setContent(emfThing.getContent());
        
        pojoReviewItemDiscrepancy.setCreatedOn(emfThing.getCreatedOn());
        
        pojoReviewItemDiscrepancy.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.setLanguageCode(emfThing.getLanguageCode());
        
        pojoReviewItemDiscrepancy.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReviewItemDiscrepancy.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoReviewItemDiscrepancy.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoReviewItemDiscrepancy;   
        
        
        case "CDP4.reportingdata.ActionItem":                
        cdp4common.reportingdata.EngineeringModelDataAnnotation pojoActionItem = new cdp4common.reportingdata.ActionItem();	    
        
        pojoActionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActionItem.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoActionItem.setContent(emfThing.getContent());
        
        pojoActionItem.setCreatedOn(emfThing.getCreatedOn());
        
        pojoActionItem.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.setLanguageCode(emfThing.getLanguageCode());
        
        pojoActionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActionItem.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoActionItem.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoActionItem;   
        
        
        case "CDP4.reportingdata.ChangeProposal":                
        cdp4common.reportingdata.EngineeringModelDataAnnotation pojoChangeProposal = new cdp4common.reportingdata.ChangeProposal();	    
        
        pojoChangeProposal.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeProposal.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoChangeProposal.setContent(emfThing.getContent());
        
        pojoChangeProposal.setCreatedOn(emfThing.getCreatedOn());
        
        pojoChangeProposal.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.setLanguageCode(emfThing.getLanguageCode());
        
        pojoChangeProposal.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeProposal.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoChangeProposal.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoChangeProposal;   
        
        
        case "CDP4.reportingdata.ContractChangeNotice":                
        cdp4common.reportingdata.EngineeringModelDataAnnotation pojoContractChangeNotice = new cdp4common.reportingdata.ContractChangeNotice();	    
        
        pojoContractChangeNotice.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoContractChangeNotice.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoContractChangeNotice.setContent(emfThing.getContent());
        
        pojoContractChangeNotice.setCreatedOn(emfThing.getCreatedOn());
        
        pojoContractChangeNotice.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.setLanguageCode(emfThing.getLanguageCode());
        
        pojoContractChangeNotice.setModifiedOn(emfThing.getModifiedOn());
        
        pojoContractChangeNotice.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoContractChangeNotice.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoContractChangeNotice;   
        
        
        case "CDP4.reportingdata.EngineeringModelDataNote":                
        cdp4common.reportingdata.EngineeringModelDataAnnotation pojoEngineeringModelDataNote = new cdp4common.reportingdata.EngineeringModelDataNote();	    
        
        pojoEngineeringModelDataNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelDataNote.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Participant.toPojo(emfThing.getAuthor()) : null);        
        
        pojoEngineeringModelDataNote.setContent(emfThing.getContent());
        
        pojoEngineeringModelDataNote.setCreatedOn(emfThing.getCreatedOn());
        
        pojoEngineeringModelDataNote.getDiscussion().addAll(emfThing.getDiscussion().stream().map(item -> cdp4emfconnector.EngineeringModelDataDiscussionItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.setLanguageCode(emfThing.getLanguageCode());
        
        pojoEngineeringModelDataNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelDataNote.setPrimaryAnnotatedThing(emfThing.getPrimaryAnnotatedThing() != null ? cdp4emfconnector.ModellingThingReference.toPojo(emfThing.getPrimaryAnnotatedThing()) : null);
        pojoEngineeringModelDataNote.getRelatedThing().addAll(emfThing.getRelatedThing().stream().map(item -> cdp4emfconnector.ModellingThingReference.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEngineeringModelDataNote;   
        
        	
    }
        return null;
        
        
     }

        
}
