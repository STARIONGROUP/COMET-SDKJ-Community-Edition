/* --------------------------------------------------------------------------------------------------------------------
 * GenericAnnotation.java
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
 * Static resource that allows to change representation of the {@link GenericAnnotation} class.
 */
public abstract class GenericAnnotation {
   
    /**
     * Convert from {@link cdp4common.reportingdata.GenericAnnotation} to {@link CDP4.ReportingData.GenericAnnotation}
     *
     * @return Generated {@link CDP4.ReportingData.GenericAnnotation}
     */
    public static CDP4.ReportingData.GenericAnnotation toEmf(cdp4common.reportingdata.GenericAnnotation thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.reportingdata.Solution":
        CDP4.ReportingData.GenericAnnotation emfSolution =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSolution();    
        
        emfSolution.setIid(thing.getIid().toString()); 
        
        emfSolution.setContent(thing.getContent());
        
        emfSolution.setCreatedOn(thing.getCreatedOn());
        
        emfSolution.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSolution.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSolution.setLanguageCode(thing.getLanguageCode());
        
        emfSolution.setModifiedOn(thing.getModifiedOn());
        
        emfSolution.setRevisionNumber(thing.getRevisionNumber());
        
        emfSolution.setThingPreference(thing.getThingPreference());
        		        
        return emfSolution;
        
        case "cdp4common.reportingdata.SiteDirectoryDataAnnotation":
        CDP4.ReportingData.GenericAnnotation emfSiteDirectoryDataAnnotation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryDataAnnotation();    
        
        emfSiteDirectoryDataAnnotation.setIid(thing.getIid().toString()); 
        
        emfSiteDirectoryDataAnnotation.setContent(thing.getContent());
        
        emfSiteDirectoryDataAnnotation.setCreatedOn(thing.getCreatedOn());
        
        emfSiteDirectoryDataAnnotation.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataAnnotation.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataAnnotation.setLanguageCode(thing.getLanguageCode());
        
        emfSiteDirectoryDataAnnotation.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryDataAnnotation.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteDirectoryDataAnnotation.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteDirectoryDataAnnotation;
        
        
        
        
        case "cdp4common.reportingdata.RequestForWaiver":
        CDP4.ReportingData.GenericAnnotation emfRequestForWaiver =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForWaiver();    
        
        emfRequestForWaiver.setIid(thing.getIid().toString()); 
        
        emfRequestForWaiver.setContent(thing.getContent());
        
        emfRequestForWaiver.setCreatedOn(thing.getCreatedOn());
        
        emfRequestForWaiver.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.setLanguageCode(thing.getLanguageCode());
        
        emfRequestForWaiver.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForWaiver.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequestForWaiver.setThingPreference(thing.getThingPreference());
        		        
        return emfRequestForWaiver;
        
        case "cdp4common.reportingdata.RequestForDeviation":
        CDP4.ReportingData.GenericAnnotation emfRequestForDeviation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForDeviation();    
        
        emfRequestForDeviation.setIid(thing.getIid().toString()); 
        
        emfRequestForDeviation.setContent(thing.getContent());
        
        emfRequestForDeviation.setCreatedOn(thing.getCreatedOn());
        
        emfRequestForDeviation.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.setLanguageCode(thing.getLanguageCode());
        
        emfRequestForDeviation.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForDeviation.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequestForDeviation.setThingPreference(thing.getThingPreference());
        		        
        return emfRequestForDeviation;
        
        case "cdp4common.reportingdata.ChangeRequest":
        CDP4.ReportingData.GenericAnnotation emfChangeRequest =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeRequest();    
        
        emfChangeRequest.setIid(thing.getIid().toString()); 
        
        emfChangeRequest.setContent(thing.getContent());
        
        emfChangeRequest.setCreatedOn(thing.getCreatedOn());
        
        emfChangeRequest.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.setLanguageCode(thing.getLanguageCode());
        
        emfChangeRequest.setModifiedOn(thing.getModifiedOn());
        
        emfChangeRequest.setRevisionNumber(thing.getRevisionNumber());
        
        emfChangeRequest.setThingPreference(thing.getThingPreference());
        		        
        return emfChangeRequest;
        
        case "cdp4common.reportingdata.ReviewItemDiscrepancy":
        CDP4.ReportingData.GenericAnnotation emfReviewItemDiscrepancy =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createReviewItemDiscrepancy();    
        
        emfReviewItemDiscrepancy.setIid(thing.getIid().toString()); 
        
        emfReviewItemDiscrepancy.setContent(thing.getContent());
        
        emfReviewItemDiscrepancy.setCreatedOn(thing.getCreatedOn());
        
        emfReviewItemDiscrepancy.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfReviewItemDiscrepancy.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfReviewItemDiscrepancy.setLanguageCode(thing.getLanguageCode());
        
        emfReviewItemDiscrepancy.setModifiedOn(thing.getModifiedOn());
        
        emfReviewItemDiscrepancy.setRevisionNumber(thing.getRevisionNumber());
        
        emfReviewItemDiscrepancy.setThingPreference(thing.getThingPreference());
        		        
        return emfReviewItemDiscrepancy;
        
        case "cdp4common.reportingdata.ActionItem":
        CDP4.ReportingData.GenericAnnotation emfActionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createActionItem();    
        
        emfActionItem.setIid(thing.getIid().toString()); 
        
        emfActionItem.setContent(thing.getContent());
        
        emfActionItem.setCreatedOn(thing.getCreatedOn());
        
        emfActionItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfActionItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfActionItem.setLanguageCode(thing.getLanguageCode());
        
        emfActionItem.setModifiedOn(thing.getModifiedOn());
        
        emfActionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfActionItem.setThingPreference(thing.getThingPreference());
        		        
        return emfActionItem;
        
        case "cdp4common.reportingdata.ChangeProposal":
        CDP4.ReportingData.GenericAnnotation emfChangeProposal =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeProposal();    
        
        emfChangeProposal.setIid(thing.getIid().toString()); 
        
        emfChangeProposal.setContent(thing.getContent());
        
        emfChangeProposal.setCreatedOn(thing.getCreatedOn());
        
        emfChangeProposal.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeProposal.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeProposal.setLanguageCode(thing.getLanguageCode());
        
        emfChangeProposal.setModifiedOn(thing.getModifiedOn());
        
        emfChangeProposal.setRevisionNumber(thing.getRevisionNumber());
        
        emfChangeProposal.setThingPreference(thing.getThingPreference());
        		        
        return emfChangeProposal;
        
        case "cdp4common.reportingdata.ContractChangeNotice":
        CDP4.ReportingData.GenericAnnotation emfContractChangeNotice =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createContractChangeNotice();    
        
        emfContractChangeNotice.setIid(thing.getIid().toString()); 
        
        emfContractChangeNotice.setContent(thing.getContent());
        
        emfContractChangeNotice.setCreatedOn(thing.getCreatedOn());
        
        emfContractChangeNotice.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfContractChangeNotice.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfContractChangeNotice.setLanguageCode(thing.getLanguageCode());
        
        emfContractChangeNotice.setModifiedOn(thing.getModifiedOn());
        
        emfContractChangeNotice.setRevisionNumber(thing.getRevisionNumber());
        
        emfContractChangeNotice.setThingPreference(thing.getThingPreference());
        		        
        return emfContractChangeNotice;
        
        case "cdp4common.reportingdata.EngineeringModelDataNote":
        CDP4.ReportingData.GenericAnnotation emfEngineeringModelDataNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createEngineeringModelDataNote();    
        
        emfEngineeringModelDataNote.setIid(thing.getIid().toString()); 
        
        emfEngineeringModelDataNote.setContent(thing.getContent());
        
        emfEngineeringModelDataNote.setCreatedOn(thing.getCreatedOn());
        
        emfEngineeringModelDataNote.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataNote.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataNote.setLanguageCode(thing.getLanguageCode());
        
        emfEngineeringModelDataNote.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelDataNote.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModelDataNote.setThingPreference(thing.getThingPreference());
        		        
        return emfEngineeringModelDataNote;
        
        case "cdp4common.reportingdata.Approval":
        CDP4.ReportingData.GenericAnnotation emfApproval =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createApproval();    
        
        emfApproval.setIid(thing.getIid().toString()); 
        
        emfApproval.setContent(thing.getContent());
        
        emfApproval.setCreatedOn(thing.getCreatedOn());
        
        emfApproval.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfApproval.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfApproval.setLanguageCode(thing.getLanguageCode());
        
        emfApproval.setModifiedOn(thing.getModifiedOn());
        
        emfApproval.setRevisionNumber(thing.getRevisionNumber());
        
        emfApproval.setThingPreference(thing.getThingPreference());
        		        
        return emfApproval;
        
        
        case "cdp4common.reportingdata.EngineeringModelDataDiscussionItem":
        CDP4.ReportingData.GenericAnnotation emfEngineeringModelDataDiscussionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createEngineeringModelDataDiscussionItem();    
        
        emfEngineeringModelDataDiscussionItem.setIid(thing.getIid().toString()); 
        
        emfEngineeringModelDataDiscussionItem.setContent(thing.getContent());
        
        emfEngineeringModelDataDiscussionItem.setCreatedOn(thing.getCreatedOn());
        
        emfEngineeringModelDataDiscussionItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataDiscussionItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataDiscussionItem.setLanguageCode(thing.getLanguageCode());
        
        emfEngineeringModelDataDiscussionItem.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelDataDiscussionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModelDataDiscussionItem.setThingPreference(thing.getThingPreference());
        		        
        return emfEngineeringModelDataDiscussionItem;
        
        case "cdp4common.reportingdata.SiteDirectoryDataDiscussionItem":
        CDP4.ReportingData.GenericAnnotation emfSiteDirectoryDataDiscussionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryDataDiscussionItem();    
        
        emfSiteDirectoryDataDiscussionItem.setIid(thing.getIid().toString()); 
        
        emfSiteDirectoryDataDiscussionItem.setContent(thing.getContent());
        
        emfSiteDirectoryDataDiscussionItem.setCreatedOn(thing.getCreatedOn());
        
        emfSiteDirectoryDataDiscussionItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataDiscussionItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataDiscussionItem.setLanguageCode(thing.getLanguageCode());
        
        emfSiteDirectoryDataDiscussionItem.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryDataDiscussionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteDirectoryDataDiscussionItem.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteDirectoryDataDiscussionItem;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.ReportingData.GenericAnnotation} to {@link cdp4common.reportingdata.GenericAnnotation}
     *
     * @return Generated {@link cdp4common.reportingdata.GenericAnnotation}
     */
    public static cdp4common.reportingdata.GenericAnnotation toPojo(CDP4.ReportingData.GenericAnnotation emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.reportingdata.Solution":                
        cdp4common.reportingdata.GenericAnnotation pojoSolution = new cdp4common.reportingdata.Solution();	    
        
        pojoSolution.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSolution.setContent(emfThing.getContent());
        
        pojoSolution.setCreatedOn(emfThing.getCreatedOn());
        
        pojoSolution.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSolution.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSolution.setLanguageCode(emfThing.getLanguageCode());
        
        pojoSolution.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSolution.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSolution.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSolution;
        
        case "CDP4.reportingdata.SiteDirectoryDataAnnotation":                
        cdp4common.reportingdata.GenericAnnotation pojoSiteDirectoryDataAnnotation = new cdp4common.reportingdata.SiteDirectoryDataAnnotation();	    
        
        pojoSiteDirectoryDataAnnotation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryDataAnnotation.setContent(emfThing.getContent());
        
        pojoSiteDirectoryDataAnnotation.setCreatedOn(emfThing.getCreatedOn());
        
        pojoSiteDirectoryDataAnnotation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataAnnotation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataAnnotation.setLanguageCode(emfThing.getLanguageCode());
        
        pojoSiteDirectoryDataAnnotation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryDataAnnotation.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteDirectoryDataAnnotation.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteDirectoryDataAnnotation;
        
        
        
        
        case "CDP4.reportingdata.RequestForWaiver":                
        cdp4common.reportingdata.GenericAnnotation pojoRequestForWaiver = new cdp4common.reportingdata.RequestForWaiver();	    
        
        pojoRequestForWaiver.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForWaiver.setContent(emfThing.getContent());
        
        pojoRequestForWaiver.setCreatedOn(emfThing.getCreatedOn());
        
        pojoRequestForWaiver.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.setLanguageCode(emfThing.getLanguageCode());
        
        pojoRequestForWaiver.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForWaiver.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequestForWaiver.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequestForWaiver;
        
        case "CDP4.reportingdata.RequestForDeviation":                
        cdp4common.reportingdata.GenericAnnotation pojoRequestForDeviation = new cdp4common.reportingdata.RequestForDeviation();	    
        
        pojoRequestForDeviation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForDeviation.setContent(emfThing.getContent());
        
        pojoRequestForDeviation.setCreatedOn(emfThing.getCreatedOn());
        
        pojoRequestForDeviation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.setLanguageCode(emfThing.getLanguageCode());
        
        pojoRequestForDeviation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForDeviation.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequestForDeviation.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequestForDeviation;
        
        case "CDP4.reportingdata.ChangeRequest":                
        cdp4common.reportingdata.GenericAnnotation pojoChangeRequest = new cdp4common.reportingdata.ChangeRequest();	    
        
        pojoChangeRequest.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeRequest.setContent(emfThing.getContent());
        
        pojoChangeRequest.setCreatedOn(emfThing.getCreatedOn());
        
        pojoChangeRequest.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.setLanguageCode(emfThing.getLanguageCode());
        
        pojoChangeRequest.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeRequest.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoChangeRequest.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoChangeRequest;
        
        case "CDP4.reportingdata.ReviewItemDiscrepancy":                
        cdp4common.reportingdata.GenericAnnotation pojoReviewItemDiscrepancy = new cdp4common.reportingdata.ReviewItemDiscrepancy();	    
        
        pojoReviewItemDiscrepancy.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReviewItemDiscrepancy.setContent(emfThing.getContent());
        
        pojoReviewItemDiscrepancy.setCreatedOn(emfThing.getCreatedOn());
        
        pojoReviewItemDiscrepancy.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.setLanguageCode(emfThing.getLanguageCode());
        
        pojoReviewItemDiscrepancy.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReviewItemDiscrepancy.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoReviewItemDiscrepancy.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoReviewItemDiscrepancy;
        
        case "CDP4.reportingdata.ActionItem":                
        cdp4common.reportingdata.GenericAnnotation pojoActionItem = new cdp4common.reportingdata.ActionItem();	    
        
        pojoActionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActionItem.setContent(emfThing.getContent());
        
        pojoActionItem.setCreatedOn(emfThing.getCreatedOn());
        
        pojoActionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.setLanguageCode(emfThing.getLanguageCode());
        
        pojoActionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoActionItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoActionItem;
        
        case "CDP4.reportingdata.ChangeProposal":                
        cdp4common.reportingdata.GenericAnnotation pojoChangeProposal = new cdp4common.reportingdata.ChangeProposal();	    
        
        pojoChangeProposal.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeProposal.setContent(emfThing.getContent());
        
        pojoChangeProposal.setCreatedOn(emfThing.getCreatedOn());
        
        pojoChangeProposal.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.setLanguageCode(emfThing.getLanguageCode());
        
        pojoChangeProposal.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeProposal.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoChangeProposal.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoChangeProposal;
        
        case "CDP4.reportingdata.ContractChangeNotice":                
        cdp4common.reportingdata.GenericAnnotation pojoContractChangeNotice = new cdp4common.reportingdata.ContractChangeNotice();	    
        
        pojoContractChangeNotice.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoContractChangeNotice.setContent(emfThing.getContent());
        
        pojoContractChangeNotice.setCreatedOn(emfThing.getCreatedOn());
        
        pojoContractChangeNotice.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.setLanguageCode(emfThing.getLanguageCode());
        
        pojoContractChangeNotice.setModifiedOn(emfThing.getModifiedOn());
        
        pojoContractChangeNotice.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoContractChangeNotice.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoContractChangeNotice;
        
        case "CDP4.reportingdata.EngineeringModelDataNote":                
        cdp4common.reportingdata.GenericAnnotation pojoEngineeringModelDataNote = new cdp4common.reportingdata.EngineeringModelDataNote();	    
        
        pojoEngineeringModelDataNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelDataNote.setContent(emfThing.getContent());
        
        pojoEngineeringModelDataNote.setCreatedOn(emfThing.getCreatedOn());
        
        pojoEngineeringModelDataNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.setLanguageCode(emfThing.getLanguageCode());
        
        pojoEngineeringModelDataNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelDataNote.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEngineeringModelDataNote.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEngineeringModelDataNote;
        
        case "CDP4.reportingdata.Approval":                
        cdp4common.reportingdata.GenericAnnotation pojoApproval = new cdp4common.reportingdata.Approval();	    
        
        pojoApproval.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoApproval.setContent(emfThing.getContent());
        
        pojoApproval.setCreatedOn(emfThing.getCreatedOn());
        
        pojoApproval.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoApproval.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoApproval.setLanguageCode(emfThing.getLanguageCode());
        
        pojoApproval.setModifiedOn(emfThing.getModifiedOn());
        
        pojoApproval.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoApproval.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoApproval;
        
        
        case "CDP4.reportingdata.EngineeringModelDataDiscussionItem":                
        cdp4common.reportingdata.GenericAnnotation pojoEngineeringModelDataDiscussionItem = new cdp4common.reportingdata.EngineeringModelDataDiscussionItem();	    
        
        pojoEngineeringModelDataDiscussionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelDataDiscussionItem.setContent(emfThing.getContent());
        
        pojoEngineeringModelDataDiscussionItem.setCreatedOn(emfThing.getCreatedOn());
        
        pojoEngineeringModelDataDiscussionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataDiscussionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataDiscussionItem.setLanguageCode(emfThing.getLanguageCode());
        
        pojoEngineeringModelDataDiscussionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelDataDiscussionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEngineeringModelDataDiscussionItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEngineeringModelDataDiscussionItem;
        
        case "CDP4.reportingdata.SiteDirectoryDataDiscussionItem":                
        cdp4common.reportingdata.GenericAnnotation pojoSiteDirectoryDataDiscussionItem = new cdp4common.reportingdata.SiteDirectoryDataDiscussionItem();	    
        
        pojoSiteDirectoryDataDiscussionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryDataDiscussionItem.setContent(emfThing.getContent());
        
        pojoSiteDirectoryDataDiscussionItem.setCreatedOn(emfThing.getCreatedOn());
        
        pojoSiteDirectoryDataDiscussionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataDiscussionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataDiscussionItem.setLanguageCode(emfThing.getLanguageCode());
        
        pojoSiteDirectoryDataDiscussionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryDataDiscussionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteDirectoryDataDiscussionItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteDirectoryDataDiscussionItem;
        	
        }

        return null;
    }
    
}
