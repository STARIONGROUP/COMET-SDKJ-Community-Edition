/* --------------------------------------------------------------------------------------------------------------------
 * Thing.java
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
 * Static resource that allows to change representation of the {@link Thing} class.
 */
public abstract class Thing {
   
    /**
     * Convert from {@link cdp4common.commondata.Thing} to {@link CDP4.CommonData.Thing}
     *
     * @return Generated {@link CDP4.CommonData.Thing}
     */
    public static CDP4.CommonData.Thing toEmf(cdp4common.commondata.Thing thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.ParticipantPermission":
        CDP4.CommonData.Thing emfParticipantPermission =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipantPermission();    
        
        emfParticipantPermission.setIid(thing.getIid().toString()); 
        
        emfParticipantPermission.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantPermission.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantPermission.setModifiedOn(thing.getModifiedOn());
        
        emfParticipantPermission.setRevisionNumber(thing.getRevisionNumber());
        
        emfParticipantPermission.setThingPreference(thing.getThingPreference());
        		        
        return emfParticipantPermission;
        
        case "cdp4common.sitedirectorydata.Person":
        CDP4.CommonData.Thing emfPerson =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPerson();    
        
        emfPerson.setIid(thing.getIid().toString()); 
        
        emfPerson.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPerson.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPerson.setModifiedOn(thing.getModifiedOn());
        
        emfPerson.setRevisionNumber(thing.getRevisionNumber());
        
        emfPerson.setThingPreference(thing.getThingPreference());
        		        
        return emfPerson;
        
        case "cdp4common.sitedirectorydata.Organization":
        CDP4.CommonData.Thing emfOrganization =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrganization();    
        
        emfOrganization.setIid(thing.getIid().toString()); 
        
        emfOrganization.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOrganization.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOrganization.setModifiedOn(thing.getModifiedOn());
        
        emfOrganization.setRevisionNumber(thing.getRevisionNumber());
        
        emfOrganization.setThingPreference(thing.getThingPreference());
        		        
        return emfOrganization;
        
        case "cdp4common.sitedirectorydata.Participant":
        CDP4.CommonData.Thing emfParticipant =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipant();    
        
        emfParticipant.setIid(thing.getIid().toString()); 
        
        emfParticipant.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipant.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipant.setModifiedOn(thing.getModifiedOn());
        
        emfParticipant.setRevisionNumber(thing.getRevisionNumber());
        
        emfParticipant.setThingPreference(thing.getThingPreference());
        		        
        return emfParticipant;
        
        case "cdp4common.sitedirectorydata.ScaleReferenceQuantityValue":
        CDP4.CommonData.Thing emfScaleReferenceQuantityValue =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createScaleReferenceQuantityValue();    
        
        emfScaleReferenceQuantityValue.setIid(thing.getIid().toString()); 
        
        emfScaleReferenceQuantityValue.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleReferenceQuantityValue.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleReferenceQuantityValue.setModifiedOn(thing.getModifiedOn());
        
        emfScaleReferenceQuantityValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfScaleReferenceQuantityValue.setThingPreference(thing.getThingPreference());
        		        
        return emfScaleReferenceQuantityValue;
        
        case "cdp4common.sitedirectorydata.MappingToReferenceScale":
        CDP4.CommonData.Thing emfMappingToReferenceScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createMappingToReferenceScale();    
        
        emfMappingToReferenceScale.setIid(thing.getIid().toString()); 
        
        emfMappingToReferenceScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfMappingToReferenceScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfMappingToReferenceScale.setModifiedOn(thing.getModifiedOn());
        
        emfMappingToReferenceScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfMappingToReferenceScale.setThingPreference(thing.getThingPreference());
        		        
        return emfMappingToReferenceScale;
        
        case "cdp4common.sitedirectorydata.QuantityKindFactor":
        CDP4.CommonData.Thing emfQuantityKindFactor =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createQuantityKindFactor();    
        
        emfQuantityKindFactor.setIid(thing.getIid().toString()); 
        
        emfQuantityKindFactor.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfQuantityKindFactor.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfQuantityKindFactor.setModifiedOn(thing.getModifiedOn());
        
        emfQuantityKindFactor.setRevisionNumber(thing.getRevisionNumber());
        
        emfQuantityKindFactor.setThingPreference(thing.getThingPreference());
        		        
        return emfQuantityKindFactor;
        
        case "cdp4common.sitedirectorydata.UnitFactor":
        CDP4.CommonData.Thing emfUnitFactor =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createUnitFactor();    
        
        emfUnitFactor.setIid(thing.getIid().toString()); 
        
        emfUnitFactor.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitFactor.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitFactor.setModifiedOn(thing.getModifiedOn());
        
        emfUnitFactor.setRevisionNumber(thing.getRevisionNumber());
        
        emfUnitFactor.setThingPreference(thing.getThingPreference());
        		        
        return emfUnitFactor;
        
        case "cdp4common.sitedirectorydata.ParameterTypeComponent":
        CDP4.CommonData.Thing emfParameterTypeComponent =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParameterTypeComponent();    
        
        emfParameterTypeComponent.setIid(thing.getIid().toString()); 
        
        emfParameterTypeComponent.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterTypeComponent.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterTypeComponent.setModifiedOn(thing.getModifiedOn());
        
        emfParameterTypeComponent.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterTypeComponent.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterTypeComponent;
        
        case "cdp4common.sitedirectorydata.PersonPermission":
        CDP4.CommonData.Thing emfPersonPermission =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPersonPermission();    
        
        emfPersonPermission.setIid(thing.getIid().toString()); 
        
        emfPersonPermission.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonPermission.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonPermission.setModifiedOn(thing.getModifiedOn());
        
        emfPersonPermission.setRevisionNumber(thing.getRevisionNumber());
        
        emfPersonPermission.setThingPreference(thing.getThingPreference());
        		        
        return emfPersonPermission;
        
        case "cdp4common.sitedirectorydata.SiteLogEntry":
        CDP4.CommonData.Thing emfSiteLogEntry =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteLogEntry();    
        
        emfSiteLogEntry.setIid(thing.getIid().toString()); 
        
        emfSiteLogEntry.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteLogEntry.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteLogEntry.setModifiedOn(thing.getModifiedOn());
        
        emfSiteLogEntry.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteLogEntry.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteLogEntry;
        
        case "cdp4common.sitedirectorydata.IterationSetup":
        CDP4.CommonData.Thing emfIterationSetup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createIterationSetup();    
        
        emfIterationSetup.setIid(thing.getIid().toString()); 
        
        emfIterationSetup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfIterationSetup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfIterationSetup.setModifiedOn(thing.getModifiedOn());
        
        emfIterationSetup.setRevisionNumber(thing.getRevisionNumber());
        
        emfIterationSetup.setThingPreference(thing.getThingPreference());
        		        
        return emfIterationSetup;
        
        case "cdp4common.sitedirectorydata.TelephoneNumber":
        CDP4.CommonData.Thing emfTelephoneNumber =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTelephoneNumber();    
        
        emfTelephoneNumber.setIid(thing.getIid().toString()); 
        
        emfTelephoneNumber.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTelephoneNumber.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTelephoneNumber.setModifiedOn(thing.getModifiedOn());
        
        emfTelephoneNumber.setRevisionNumber(thing.getRevisionNumber());
        
        emfTelephoneNumber.setThingPreference(thing.getThingPreference());
        		        
        return emfTelephoneNumber;
        
        case "cdp4common.sitedirectorydata.EmailAddress":
        CDP4.CommonData.Thing emfEmailAddress =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEmailAddress();    
        
        emfEmailAddress.setIid(thing.getIid().toString()); 
        
        emfEmailAddress.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEmailAddress.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEmailAddress.setModifiedOn(thing.getModifiedOn());
        
        emfEmailAddress.setRevisionNumber(thing.getRevisionNumber());
        
        emfEmailAddress.setThingPreference(thing.getThingPreference());
        		        
        return emfEmailAddress;
        
        case "cdp4common.sitedirectorydata.UserPreference":
        CDP4.CommonData.Thing emfUserPreference =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createUserPreference();    
        
        emfUserPreference.setIid(thing.getIid().toString()); 
        
        emfUserPreference.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfUserPreference.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfUserPreference.setModifiedOn(thing.getModifiedOn());
        
        emfUserPreference.setRevisionNumber(thing.getRevisionNumber());
        
        emfUserPreference.setThingPreference(thing.getThingPreference());
        		        
        return emfUserPreference;
        
        case "cdp4common.sitedirectorydata.NaturalLanguage":
        CDP4.CommonData.Thing emfNaturalLanguage =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createNaturalLanguage();    
        
        emfNaturalLanguage.setIid(thing.getIid().toString()); 
        
        emfNaturalLanguage.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfNaturalLanguage.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfNaturalLanguage.setModifiedOn(thing.getModifiedOn());
        
        emfNaturalLanguage.setRevisionNumber(thing.getRevisionNumber());
        
        emfNaturalLanguage.setThingPreference(thing.getThingPreference());
        		        
        return emfNaturalLanguage;
        
        case "cdp4common.sitedirectorydata.DependentParameterTypeAssignment":
        CDP4.CommonData.Thing emfDependentParameterTypeAssignment =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDependentParameterTypeAssignment();    
        
        emfDependentParameterTypeAssignment.setIid(thing.getIid().toString()); 
        
        emfDependentParameterTypeAssignment.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDependentParameterTypeAssignment.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDependentParameterTypeAssignment.setModifiedOn(thing.getModifiedOn());
        
        emfDependentParameterTypeAssignment.setRevisionNumber(thing.getRevisionNumber());
        
        emfDependentParameterTypeAssignment.setThingPreference(thing.getThingPreference());
        		        
        return emfDependentParameterTypeAssignment;
        
        case "cdp4common.sitedirectorydata.IndependentParameterTypeAssignment":
        CDP4.CommonData.Thing emfIndependentParameterTypeAssignment =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createIndependentParameterTypeAssignment();    
        
        emfIndependentParameterTypeAssignment.setIid(thing.getIid().toString()); 
        
        emfIndependentParameterTypeAssignment.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfIndependentParameterTypeAssignment.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfIndependentParameterTypeAssignment.setModifiedOn(thing.getModifiedOn());
        
        emfIndependentParameterTypeAssignment.setRevisionNumber(thing.getRevisionNumber());
        
        emfIndependentParameterTypeAssignment.setThingPreference(thing.getThingPreference());
        		        
        return emfIndependentParameterTypeAssignment;
        
        case "cdp4common.sitedirectorydata.OrganizationalParticipant":
        CDP4.CommonData.Thing emfOrganizationalParticipant =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrganizationalParticipant();    
        
        emfOrganizationalParticipant.setIid(thing.getIid().toString()); 
        
        emfOrganizationalParticipant.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOrganizationalParticipant.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOrganizationalParticipant.setModifiedOn(thing.getModifiedOn());
        
        emfOrganizationalParticipant.setRevisionNumber(thing.getRevisionNumber());
        
        emfOrganizationalParticipant.setThingPreference(thing.getThingPreference());
        		        
        return emfOrganizationalParticipant;
        
        
        case "cdp4common.sitedirectorydata.ParticipantRole":
        CDP4.CommonData.Thing emfParticipantRole =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipantRole();    
        
        emfParticipantRole.setIid(thing.getIid().toString()); 
        
        emfParticipantRole.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantRole.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantRole.setModifiedOn(thing.getModifiedOn());
        
        emfParticipantRole.setRevisionNumber(thing.getRevisionNumber());
        
        emfParticipantRole.setThingPreference(thing.getThingPreference());
        		        
        return emfParticipantRole;
        
        case "cdp4common.sitedirectorydata.EngineeringModelSetup":
        CDP4.CommonData.Thing emfEngineeringModelSetup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEngineeringModelSetup();    
        
        emfEngineeringModelSetup.setIid(thing.getIid().toString()); 
        
        emfEngineeringModelSetup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelSetup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelSetup.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelSetup.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModelSetup.setThingPreference(thing.getThingPreference());
        		        
        return emfEngineeringModelSetup;
        
        case "cdp4common.sitedirectorydata.Glossary":
        CDP4.CommonData.Thing emfGlossary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createGlossary();    
        
        emfGlossary.setIid(thing.getIid().toString()); 
        
        emfGlossary.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfGlossary.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfGlossary.setModifiedOn(thing.getModifiedOn());
        
        emfGlossary.setRevisionNumber(thing.getRevisionNumber());
        
        emfGlossary.setThingPreference(thing.getThingPreference());
        		        
        return emfGlossary;
        
        
        case "cdp4common.sitedirectorydata.SiteReferenceDataLibrary":
        CDP4.CommonData.Thing emfSiteReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteReferenceDataLibrary();    
        
        emfSiteReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        emfSiteReferenceDataLibrary.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfSiteReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteReferenceDataLibrary.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteReferenceDataLibrary;
        
        case "cdp4common.sitedirectorydata.ModelReferenceDataLibrary":
        CDP4.CommonData.Thing emfModelReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createModelReferenceDataLibrary();    
        
        emfModelReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        emfModelReferenceDataLibrary.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfModelReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        
        emfModelReferenceDataLibrary.setThingPreference(thing.getThingPreference());
        		        
        return emfModelReferenceDataLibrary;
        
        case "cdp4common.sitedirectorydata.Term":
        CDP4.CommonData.Thing emfTerm =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTerm();    
        
        emfTerm.setIid(thing.getIid().toString()); 
        
        emfTerm.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTerm.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTerm.setModifiedOn(thing.getModifiedOn());
        
        emfTerm.setRevisionNumber(thing.getRevisionNumber());
        
        emfTerm.setThingPreference(thing.getThingPreference());
        		        
        return emfTerm;
        
        case "cdp4common.sitedirectorydata.FileType":
        CDP4.CommonData.Thing emfFileType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createFileType();    
        
        emfFileType.setIid(thing.getIid().toString()); 
        
        emfFileType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfFileType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfFileType.setModifiedOn(thing.getModifiedOn());
        
        emfFileType.setRevisionNumber(thing.getRevisionNumber());
        
        emfFileType.setThingPreference(thing.getThingPreference());
        		        
        return emfFileType;
        
        
        case "cdp4common.sitedirectorydata.OrdinalScale":
        CDP4.CommonData.Thing emfOrdinalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrdinalScale();    
        
        emfOrdinalScale.setIid(thing.getIid().toString()); 
        
        emfOrdinalScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.setModifiedOn(thing.getModifiedOn());
        
        emfOrdinalScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfOrdinalScale.setThingPreference(thing.getThingPreference());
        		        
        return emfOrdinalScale;
        
        case "cdp4common.sitedirectorydata.RatioScale":
        CDP4.CommonData.Thing emfRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createRatioScale();    
        
        emfRatioScale.setIid(thing.getIid().toString()); 
        
        emfRatioScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfRatioScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfRatioScale.setThingPreference(thing.getThingPreference());
        		        
        return emfRatioScale;
        
        case "cdp4common.sitedirectorydata.CyclicRatioScale":
        CDP4.CommonData.Thing emfCyclicRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCyclicRatioScale();    
        
        emfCyclicRatioScale.setIid(thing.getIid().toString()); 
        
        emfCyclicRatioScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfCyclicRatioScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfCyclicRatioScale.setThingPreference(thing.getThingPreference());
        		        
        return emfCyclicRatioScale;
        
        case "cdp4common.sitedirectorydata.IntervalScale":
        CDP4.CommonData.Thing emfIntervalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createIntervalScale();    
        
        emfIntervalScale.setIid(thing.getIid().toString()); 
        
        emfIntervalScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.setModifiedOn(thing.getModifiedOn());
        
        emfIntervalScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfIntervalScale.setThingPreference(thing.getThingPreference());
        		        
        return emfIntervalScale;
        
        case "cdp4common.sitedirectorydata.LogarithmicScale":
        CDP4.CommonData.Thing emfLogarithmicScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLogarithmicScale();    
        
        emfLogarithmicScale.setIid(thing.getIid().toString()); 
        
        emfLogarithmicScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.setModifiedOn(thing.getModifiedOn());
        
        emfLogarithmicScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfLogarithmicScale.setThingPreference(thing.getThingPreference());
        		        
        return emfLogarithmicScale;
        
        case "cdp4common.sitedirectorydata.DomainOfExpertise":
        CDP4.CommonData.Thing emfDomainOfExpertise =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDomainOfExpertise();    
        
        emfDomainOfExpertise.setIid(thing.getIid().toString()); 
        
        emfDomainOfExpertise.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertise.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertise.setModifiedOn(thing.getModifiedOn());
        
        emfDomainOfExpertise.setRevisionNumber(thing.getRevisionNumber());
        
        emfDomainOfExpertise.setThingPreference(thing.getThingPreference());
        		        
        return emfDomainOfExpertise;
        
        
        case "cdp4common.sitedirectorydata.CompoundParameterType":
        CDP4.CommonData.Thing emfCompoundParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCompoundParameterType();    
        
        emfCompoundParameterType.setIid(thing.getIid().toString()); 
        
        emfCompoundParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCompoundParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCompoundParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfCompoundParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfCompoundParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfCompoundParameterType;
        
        case "cdp4common.sitedirectorydata.ArrayParameterType":
        CDP4.CommonData.Thing emfArrayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createArrayParameterType();    
        
        emfArrayParameterType.setIid(thing.getIid().toString()); 
        
        emfArrayParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfArrayParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfArrayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfArrayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfArrayParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfArrayParameterType;
        
        
        case "cdp4common.sitedirectorydata.EnumerationParameterType":
        CDP4.CommonData.Thing emfEnumerationParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationParameterType();    
        
        emfEnumerationParameterType.setIid(thing.getIid().toString()); 
        
        emfEnumerationParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfEnumerationParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfEnumerationParameterType;
        
        case "cdp4common.sitedirectorydata.BooleanParameterType":
        CDP4.CommonData.Thing emfBooleanParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBooleanParameterType();    
        
        emfBooleanParameterType.setIid(thing.getIid().toString()); 
        
        emfBooleanParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfBooleanParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfBooleanParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfBooleanParameterType;
        
        case "cdp4common.sitedirectorydata.DateParameterType":
        CDP4.CommonData.Thing emfDateParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateParameterType();    
        
        emfDateParameterType.setIid(thing.getIid().toString()); 
        
        emfDateParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfDateParameterType;
        
        case "cdp4common.sitedirectorydata.TextParameterType":
        CDP4.CommonData.Thing emfTextParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTextParameterType();    
        
        emfTextParameterType.setIid(thing.getIid().toString()); 
        
        emfTextParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTextParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTextParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfTextParameterType;
        
        case "cdp4common.sitedirectorydata.DateTimeParameterType":
        CDP4.CommonData.Thing emfDateTimeParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateTimeParameterType();    
        
        emfDateTimeParameterType.setIid(thing.getIid().toString()); 
        
        emfDateTimeParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateTimeParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateTimeParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfDateTimeParameterType;
        
        case "cdp4common.sitedirectorydata.TimeOfDayParameterType":
        CDP4.CommonData.Thing emfTimeOfDayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTimeOfDayParameterType();    
        
        emfTimeOfDayParameterType.setIid(thing.getIid().toString()); 
        
        emfTimeOfDayParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTimeOfDayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTimeOfDayParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfTimeOfDayParameterType;
        
        
        case "cdp4common.sitedirectorydata.SpecializedQuantityKind":
        CDP4.CommonData.Thing emfSpecializedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSpecializedQuantityKind();    
        
        emfSpecializedQuantityKind.setIid(thing.getIid().toString()); 
        
        emfSpecializedQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSpecializedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSpecializedQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfSpecializedQuantityKind;
        
        case "cdp4common.sitedirectorydata.SimpleQuantityKind":
        CDP4.CommonData.Thing emfSimpleQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleQuantityKind();    
        
        emfSimpleQuantityKind.setIid(thing.getIid().toString()); 
        
        emfSimpleQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfSimpleQuantityKind;
        
        case "cdp4common.sitedirectorydata.DerivedQuantityKind":
        CDP4.CommonData.Thing emfDerivedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedQuantityKind();    
        
        emfDerivedQuantityKind.setIid(thing.getIid().toString()); 
        
        emfDerivedQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfDerivedQuantityKind;
        
        case "cdp4common.sitedirectorydata.SampledFunctionParameterType":
        CDP4.CommonData.Thing emfSampledFunctionParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSampledFunctionParameterType();    
        
        emfSampledFunctionParameterType.setIid(thing.getIid().toString()); 
        
        emfSampledFunctionParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSampledFunctionParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSampledFunctionParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfSampledFunctionParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfSampledFunctionParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfSampledFunctionParameterType;
        
        case "cdp4common.sitedirectorydata.ScaleValueDefinition":
        CDP4.CommonData.Thing emfScaleValueDefinition =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createScaleValueDefinition();    
        
        emfScaleValueDefinition.setIid(thing.getIid().toString()); 
        
        emfScaleValueDefinition.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleValueDefinition.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleValueDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfScaleValueDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfScaleValueDefinition.setThingPreference(thing.getThingPreference());
        		        
        return emfScaleValueDefinition;
        
        
        case "cdp4common.sitedirectorydata.DerivedUnit":
        CDP4.CommonData.Thing emfDerivedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedUnit();    
        
        emfDerivedUnit.setIid(thing.getIid().toString()); 
        
        emfDerivedUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfDerivedUnit;
        
        
        case "cdp4common.sitedirectorydata.LinearConversionUnit":
        CDP4.CommonData.Thing emfLinearConversionUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLinearConversionUnit();    
        
        emfLinearConversionUnit.setIid(thing.getIid().toString()); 
        
        emfLinearConversionUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.setModifiedOn(thing.getModifiedOn());
        
        emfLinearConversionUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfLinearConversionUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfLinearConversionUnit;
        
        case "cdp4common.sitedirectorydata.PrefixedUnit":
        CDP4.CommonData.Thing emfPrefixedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPrefixedUnit();    
        
        emfPrefixedUnit.setIid(thing.getIid().toString()); 
        
        emfPrefixedUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfPrefixedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfPrefixedUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfPrefixedUnit;
        
        case "cdp4common.sitedirectorydata.SimpleUnit":
        CDP4.CommonData.Thing emfSimpleUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleUnit();    
        
        emfSimpleUnit.setIid(thing.getIid().toString()); 
        
        emfSimpleUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfSimpleUnit;
        
        case "cdp4common.sitedirectorydata.Category":
        CDP4.CommonData.Thing emfCategory =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCategory();    
        
        emfCategory.setIid(thing.getIid().toString()); 
        
        emfCategory.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCategory.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCategory.setModifiedOn(thing.getModifiedOn());
        
        emfCategory.setRevisionNumber(thing.getRevisionNumber());
        
        emfCategory.setThingPreference(thing.getThingPreference());
        		        
        return emfCategory;
        
        case "cdp4common.sitedirectorydata.UnitPrefix":
        CDP4.CommonData.Thing emfUnitPrefix =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createUnitPrefix();    
        
        emfUnitPrefix.setIid(thing.getIid().toString()); 
        
        emfUnitPrefix.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitPrefix.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitPrefix.setModifiedOn(thing.getModifiedOn());
        
        emfUnitPrefix.setRevisionNumber(thing.getRevisionNumber());
        
        emfUnitPrefix.setThingPreference(thing.getThingPreference());
        		        
        return emfUnitPrefix;
        
        
        case "cdp4common.sitedirectorydata.ReferencerRule":
        CDP4.CommonData.Thing emfReferencerRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferencerRule();    
        
        emfReferencerRule.setIid(thing.getIid().toString()); 
        
        emfReferencerRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfReferencerRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfReferencerRule.setModifiedOn(thing.getModifiedOn());
        
        emfReferencerRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfReferencerRule.setThingPreference(thing.getThingPreference());
        		        
        return emfReferencerRule;
        
        case "cdp4common.sitedirectorydata.BinaryRelationshipRule":
        CDP4.CommonData.Thing emfBinaryRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBinaryRelationshipRule();    
        
        emfBinaryRelationshipRule.setIid(thing.getIid().toString()); 
        
        emfBinaryRelationshipRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationshipRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfBinaryRelationshipRule.setThingPreference(thing.getThingPreference());
        		        
        return emfBinaryRelationshipRule;
        
        case "cdp4common.sitedirectorydata.MultiRelationshipRule":
        CDP4.CommonData.Thing emfMultiRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createMultiRelationshipRule();    
        
        emfMultiRelationshipRule.setIid(thing.getIid().toString()); 
        
        emfMultiRelationshipRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationshipRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfMultiRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfMultiRelationshipRule.setThingPreference(thing.getThingPreference());
        		        
        return emfMultiRelationshipRule;
        
        case "cdp4common.sitedirectorydata.DecompositionRule":
        CDP4.CommonData.Thing emfDecompositionRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDecompositionRule();    
        
        emfDecompositionRule.setIid(thing.getIid().toString()); 
        
        emfDecompositionRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDecompositionRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDecompositionRule.setModifiedOn(thing.getModifiedOn());
        
        emfDecompositionRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfDecompositionRule.setThingPreference(thing.getThingPreference());
        		        
        return emfDecompositionRule;
        
        case "cdp4common.sitedirectorydata.ParameterizedCategoryRule":
        CDP4.CommonData.Thing emfParameterizedCategoryRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParameterizedCategoryRule();    
        
        emfParameterizedCategoryRule.setIid(thing.getIid().toString()); 
        
        emfParameterizedCategoryRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterizedCategoryRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterizedCategoryRule.setModifiedOn(thing.getModifiedOn());
        
        emfParameterizedCategoryRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterizedCategoryRule.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterizedCategoryRule;
        
        case "cdp4common.sitedirectorydata.EnumerationValueDefinition":
        CDP4.CommonData.Thing emfEnumerationValueDefinition =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationValueDefinition();    
        
        emfEnumerationValueDefinition.setIid(thing.getIid().toString()); 
        
        emfEnumerationValueDefinition.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationValueDefinition.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationValueDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationValueDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfEnumerationValueDefinition.setThingPreference(thing.getThingPreference());
        		        
        return emfEnumerationValueDefinition;
        
        case "cdp4common.sitedirectorydata.PersonRole":
        CDP4.CommonData.Thing emfPersonRole =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPersonRole();    
        
        emfPersonRole.setIid(thing.getIid().toString()); 
        
        emfPersonRole.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonRole.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonRole.setModifiedOn(thing.getModifiedOn());
        
        emfPersonRole.setRevisionNumber(thing.getRevisionNumber());
        
        emfPersonRole.setThingPreference(thing.getThingPreference());
        		        
        return emfPersonRole;
        
        case "cdp4common.sitedirectorydata.DomainOfExpertiseGroup":
        CDP4.CommonData.Thing emfDomainOfExpertiseGroup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDomainOfExpertiseGroup();    
        
        emfDomainOfExpertiseGroup.setIid(thing.getIid().toString()); 
        
        emfDomainOfExpertiseGroup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertiseGroup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertiseGroup.setModifiedOn(thing.getModifiedOn());
        
        emfDomainOfExpertiseGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfDomainOfExpertiseGroup.setThingPreference(thing.getThingPreference());
        		        
        return emfDomainOfExpertiseGroup;
        
        case "cdp4common.sitedirectorydata.ReferenceSource":
        CDP4.CommonData.Thing emfReferenceSource =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferenceSource();    
        
        emfReferenceSource.setIid(thing.getIid().toString()); 
        
        emfReferenceSource.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfReferenceSource.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfReferenceSource.setModifiedOn(thing.getModifiedOn());
        
        emfReferenceSource.setRevisionNumber(thing.getRevisionNumber());
        
        emfReferenceSource.setThingPreference(thing.getThingPreference());
        		        
        return emfReferenceSource;
        
        case "cdp4common.sitedirectorydata.Constant":
        CDP4.CommonData.Thing emfConstant =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createConstant();    
        
        emfConstant.setIid(thing.getIid().toString()); 
        
        emfConstant.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfConstant.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfConstant.setModifiedOn(thing.getModifiedOn());
        
        emfConstant.setRevisionNumber(thing.getRevisionNumber());
        
        emfConstant.setThingPreference(thing.getThingPreference());
        		        
        return emfConstant;
        
        case "cdp4common.engineeringmodeldata.PossibleFiniteState":
        CDP4.CommonData.Thing emfPossibleFiniteState =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPossibleFiniteState();    
        
        emfPossibleFiniteState.setIid(thing.getIid().toString()); 
        
        emfPossibleFiniteState.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteState.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteState.setModifiedOn(thing.getModifiedOn());
        
        emfPossibleFiniteState.setRevisionNumber(thing.getRevisionNumber());
        
        emfPossibleFiniteState.setThingPreference(thing.getThingPreference());
        		        
        return emfPossibleFiniteState;
        
        case "cdp4common.engineeringmodeldata.Option":
        CDP4.CommonData.Thing emfOption =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createOption();    
        
        emfOption.setIid(thing.getIid().toString()); 
        
        emfOption.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOption.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOption.setModifiedOn(thing.getModifiedOn());
        
        emfOption.setRevisionNumber(thing.getRevisionNumber());
        
        emfOption.setThingPreference(thing.getThingPreference());
        		        
        return emfOption;
        
        case "cdp4common.engineeringmodeldata.PossibleFiniteStateList":
        CDP4.CommonData.Thing emfPossibleFiniteStateList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPossibleFiniteStateList();    
        
        emfPossibleFiniteStateList.setIid(thing.getIid().toString()); 
        
        emfPossibleFiniteStateList.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteStateList.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteStateList.setModifiedOn(thing.getModifiedOn());
        
        emfPossibleFiniteStateList.setRevisionNumber(thing.getRevisionNumber());
        
        emfPossibleFiniteStateList.setThingPreference(thing.getThingPreference());
        		        
        return emfPossibleFiniteStateList;
        
        
        case "cdp4common.engineeringmodeldata.ElementDefinition":
        CDP4.CommonData.Thing emfElementDefinition =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementDefinition();    
        
        emfElementDefinition.setIid(thing.getIid().toString()); 
        
        emfElementDefinition.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfElementDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfElementDefinition.setThingPreference(thing.getThingPreference());
        		        
        return emfElementDefinition;
        
        case "cdp4common.engineeringmodeldata.ElementUsage":
        CDP4.CommonData.Thing emfElementUsage =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementUsage();    
        
        emfElementUsage.setIid(thing.getIid().toString()); 
        
        emfElementUsage.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.setModifiedOn(thing.getModifiedOn());
        
        emfElementUsage.setRevisionNumber(thing.getRevisionNumber());
        
        emfElementUsage.setThingPreference(thing.getThingPreference());
        		        
        return emfElementUsage;
        
        
        case "cdp4common.engineeringmodeldata.RequirementsSpecification":
        CDP4.CommonData.Thing emfRequirementsSpecification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsSpecification();    
        
        emfRequirementsSpecification.setIid(thing.getIid().toString()); 
        
        emfRequirementsSpecification.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsSpecification.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsSpecification.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirementsSpecification;
        
        case "cdp4common.engineeringmodeldata.RequirementsGroup":
        CDP4.CommonData.Thing emfRequirementsGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsGroup();    
        
        emfRequirementsGroup.setIid(thing.getIid().toString()); 
        
        emfRequirementsGroup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsGroup.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirementsGroup;
        
        
        case "cdp4common.engineeringmodeldata.Requirement":
        CDP4.CommonData.Thing emfRequirement =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirement();    
        
        emfRequirement.setIid(thing.getIid().toString()); 
        
        emfRequirement.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirement.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirement.setModifiedOn(thing.getModifiedOn());
        
        emfRequirement.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirement.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirement;
        
        case "cdp4common.engineeringmodeldata.RuleVerificationList":
        CDP4.CommonData.Thing emfRuleVerificationList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRuleVerificationList();    
        
        emfRuleVerificationList.setIid(thing.getIid().toString()); 
        
        emfRuleVerificationList.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleVerificationList.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleVerificationList.setModifiedOn(thing.getModifiedOn());
        
        emfRuleVerificationList.setRevisionNumber(thing.getRevisionNumber());
        
        emfRuleVerificationList.setThingPreference(thing.getThingPreference());
        		        
        return emfRuleVerificationList;
        
        case "cdp4common.engineeringmodeldata.Goal":
        CDP4.CommonData.Thing emfGoal =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createGoal();    
        
        emfGoal.setIid(thing.getIid().toString()); 
        
        emfGoal.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfGoal.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfGoal.setModifiedOn(thing.getModifiedOn());
        
        emfGoal.setRevisionNumber(thing.getRevisionNumber());
        
        emfGoal.setThingPreference(thing.getThingPreference());
        		        
        return emfGoal;
        
        case "cdp4common.engineeringmodeldata.Stakeholder":
        CDP4.CommonData.Thing emfStakeholder =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeholder();    
        
        emfStakeholder.setIid(thing.getIid().toString()); 
        
        emfStakeholder.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholder.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholder.setModifiedOn(thing.getModifiedOn());
        
        emfStakeholder.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeholder.setThingPreference(thing.getThingPreference());
        		        
        return emfStakeholder;
        
        case "cdp4common.engineeringmodeldata.ValueGroup":
        CDP4.CommonData.Thing emfValueGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createValueGroup();    
        
        emfValueGroup.setIid(thing.getIid().toString()); 
        
        emfValueGroup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfValueGroup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfValueGroup.setModifiedOn(thing.getModifiedOn());
        
        emfValueGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfValueGroup.setThingPreference(thing.getThingPreference());
        		        
        return emfValueGroup;
        
        case "cdp4common.engineeringmodeldata.StakeholderValue":
        CDP4.CommonData.Thing emfStakeholderValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeholderValue();    
        
        emfStakeholderValue.setIid(thing.getIid().toString()); 
        
        emfStakeholderValue.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholderValue.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholderValue.setModifiedOn(thing.getModifiedOn());
        
        emfStakeholderValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeholderValue.setThingPreference(thing.getThingPreference());
        		        
        return emfStakeholderValue;
        
        case "cdp4common.engineeringmodeldata.StakeHolderValueMap":
        CDP4.CommonData.Thing emfStakeHolderValueMap =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeHolderValueMap();    
        
        emfStakeHolderValueMap.setIid(thing.getIid().toString()); 
        
        emfStakeHolderValueMap.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMap.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMap.setModifiedOn(thing.getModifiedOn());
        
        emfStakeHolderValueMap.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeHolderValueMap.setThingPreference(thing.getThingPreference());
        		        
        return emfStakeHolderValueMap;
        
        case "cdp4common.commondata.HyperLink":
        CDP4.CommonData.Thing emfHyperLink =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createHyperLink();    
        
        emfHyperLink.setIid(thing.getIid().toString()); 
        
        emfHyperLink.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfHyperLink.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfHyperLink.setModifiedOn(thing.getModifiedOn());
        
        emfHyperLink.setRevisionNumber(thing.getRevisionNumber());
        
        emfHyperLink.setThingPreference(thing.getThingPreference());
        		        
        return emfHyperLink;
        
        case "cdp4common.commondata.Definition":
        CDP4.CommonData.Thing emfDefinition =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createDefinition();    
        
        emfDefinition.setIid(thing.getIid().toString()); 
        
        emfDefinition.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDefinition.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfDefinition.setThingPreference(thing.getThingPreference());
        		        
        return emfDefinition;
        
        case "cdp4common.commondata.Alias":
        CDP4.CommonData.Thing emfAlias =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createAlias();    
        
        emfAlias.setIid(thing.getIid().toString()); 
        
        emfAlias.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfAlias.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfAlias.setModifiedOn(thing.getModifiedOn());
        
        emfAlias.setRevisionNumber(thing.getRevisionNumber());
        
        emfAlias.setThingPreference(thing.getThingPreference());
        		        
        return emfAlias;
        
        case "cdp4common.commondata.Citation":
        CDP4.CommonData.Thing emfCitation =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createCitation();    
        
        emfCitation.setIid(thing.getIid().toString()); 
        
        emfCitation.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCitation.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCitation.setModifiedOn(thing.getModifiedOn());
        
        emfCitation.setRevisionNumber(thing.getRevisionNumber());
        
        emfCitation.setThingPreference(thing.getThingPreference());
        		        
        return emfCitation;
        
        
        case "cdp4common.sitedirectorydata.SiteDirectory":
        CDP4.CommonData.Thing emfSiteDirectory =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteDirectory();    
        
        emfSiteDirectory.setIid(thing.getIid().toString()); 
        
        emfSiteDirectory.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectory.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectory.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectory.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteDirectory.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteDirectory;
        
        case "cdp4common.engineeringmodeldata.EngineeringModel":
        CDP4.CommonData.Thing emfEngineeringModel =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createEngineeringModel();    
        
        emfEngineeringModel.setIid(thing.getIid().toString()); 
        
        emfEngineeringModel.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModel.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModel.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModel.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModel.setThingPreference(thing.getThingPreference());
        		        
        return emfEngineeringModel;
        
        case "cdp4common.commondata.LogEntryChangelogItem":
        CDP4.CommonData.Thing emfLogEntryChangelogItem =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createLogEntryChangelogItem();    
        
        emfLogEntryChangelogItem.setIid(thing.getIid().toString()); 
        
        emfLogEntryChangelogItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfLogEntryChangelogItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfLogEntryChangelogItem.setModifiedOn(thing.getModifiedOn());
        
        emfLogEntryChangelogItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfLogEntryChangelogItem.setThingPreference(thing.getThingPreference());
        		        
        return emfLogEntryChangelogItem;
        
        
        case "cdp4common.engineeringmodeldata.ParameterSubscription":
        CDP4.CommonData.Thing emfParameterSubscription =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterSubscription();    
        
        emfParameterSubscription.setIid(thing.getIid().toString()); 
        
        emfParameterSubscription.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterSubscription.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterSubscription.setModifiedOn(thing.getModifiedOn());
        
        emfParameterSubscription.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterSubscription.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterSubscription;
        
        
        case "cdp4common.engineeringmodeldata.Parameter":
        CDP4.CommonData.Thing emfParameter =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameter();    
        
        emfParameter.setIid(thing.getIid().toString()); 
        
        emfParameter.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameter.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameter.setModifiedOn(thing.getModifiedOn());
        
        emfParameter.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameter.setThingPreference(thing.getThingPreference());
        		        
        return emfParameter;
        
        case "cdp4common.engineeringmodeldata.ParameterOverride":
        CDP4.CommonData.Thing emfParameterOverride =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterOverride();    
        
        emfParameterOverride.setIid(thing.getIid().toString()); 
        
        emfParameterOverride.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterOverride.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterOverride.setModifiedOn(thing.getModifiedOn());
        
        emfParameterOverride.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterOverride.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterOverride;
        
        
        case "cdp4common.engineeringmodeldata.CommonFileStore":
        CDP4.CommonData.Thing emfCommonFileStore =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createCommonFileStore();    
        
        emfCommonFileStore.setIid(thing.getIid().toString()); 
        
        emfCommonFileStore.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCommonFileStore.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCommonFileStore.setModifiedOn(thing.getModifiedOn());
        
        emfCommonFileStore.setRevisionNumber(thing.getRevisionNumber());
        
        emfCommonFileStore.setThingPreference(thing.getThingPreference());
        		        
        return emfCommonFileStore;
        
        case "cdp4common.engineeringmodeldata.DomainFileStore":
        CDP4.CommonData.Thing emfDomainFileStore =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createDomainFileStore();    
        
        emfDomainFileStore.setIid(thing.getIid().toString()); 
        
        emfDomainFileStore.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainFileStore.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainFileStore.setModifiedOn(thing.getModifiedOn());
        
        emfDomainFileStore.setRevisionNumber(thing.getRevisionNumber());
        
        emfDomainFileStore.setThingPreference(thing.getThingPreference());
        		        
        return emfDomainFileStore;
        
        case "cdp4common.engineeringmodeldata.ParameterGroup":
        CDP4.CommonData.Thing emfParameterGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterGroup();    
        
        emfParameterGroup.setIid(thing.getIid().toString()); 
        
        emfParameterGroup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterGroup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterGroup.setModifiedOn(thing.getModifiedOn());
        
        emfParameterGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterGroup.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterGroup;
        
        case "cdp4common.engineeringmodeldata.Publication":
        CDP4.CommonData.Thing emfPublication =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPublication();    
        
        emfPublication.setIid(thing.getIid().toString()); 
        
        emfPublication.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPublication.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPublication.setModifiedOn(thing.getModifiedOn());
        
        emfPublication.setRevisionNumber(thing.getRevisionNumber());
        
        emfPublication.setThingPreference(thing.getThingPreference());
        		        
        return emfPublication;
        
        case "cdp4common.engineeringmodeldata.File":
        CDP4.CommonData.Thing emfFile =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createFile();    
        
        emfFile.setIid(thing.getIid().toString()); 
        
        emfFile.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfFile.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfFile.setModifiedOn(thing.getModifiedOn());
        
        emfFile.setRevisionNumber(thing.getRevisionNumber());
        
        emfFile.setThingPreference(thing.getThingPreference());
        		        
        return emfFile;
        
        case "cdp4common.engineeringmodeldata.ParametricConstraint":
        CDP4.CommonData.Thing emfParametricConstraint =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParametricConstraint();    
        
        emfParametricConstraint.setIid(thing.getIid().toString()); 
        
        emfParametricConstraint.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParametricConstraint.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParametricConstraint.setModifiedOn(thing.getModifiedOn());
        
        emfParametricConstraint.setRevisionNumber(thing.getRevisionNumber());
        
        emfParametricConstraint.setThingPreference(thing.getThingPreference());
        		        
        return emfParametricConstraint;
        
        case "cdp4common.engineeringmodeldata.ExternalIdentifierMap":
        CDP4.CommonData.Thing emfExternalIdentifierMap =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createExternalIdentifierMap();    
        
        emfExternalIdentifierMap.setIid(thing.getIid().toString()); 
        
        emfExternalIdentifierMap.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfExternalIdentifierMap.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfExternalIdentifierMap.setModifiedOn(thing.getModifiedOn());
        
        emfExternalIdentifierMap.setRevisionNumber(thing.getRevisionNumber());
        
        emfExternalIdentifierMap.setThingPreference(thing.getThingPreference());
        		        
        return emfExternalIdentifierMap;
        
        case "cdp4common.engineeringmodeldata.NestedElement":
        CDP4.CommonData.Thing emfNestedElement =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createNestedElement();    
        
        emfNestedElement.setIid(thing.getIid().toString()); 
        
        emfNestedElement.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfNestedElement.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfNestedElement.setModifiedOn(thing.getModifiedOn());
        
        emfNestedElement.setRevisionNumber(thing.getRevisionNumber());
        
        emfNestedElement.setThingPreference(thing.getThingPreference());
        		        
        return emfNestedElement;
        
        case "cdp4common.engineeringmodeldata.Folder":
        CDP4.CommonData.Thing emfFolder =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createFolder();    
        
        emfFolder.setIid(thing.getIid().toString()); 
        
        emfFolder.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfFolder.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfFolder.setModifiedOn(thing.getModifiedOn());
        
        emfFolder.setRevisionNumber(thing.getRevisionNumber());
        
        emfFolder.setThingPreference(thing.getThingPreference());
        		        
        return emfFolder;
        
        case "cdp4common.engineeringmodeldata.IdCorrespondence":
        CDP4.CommonData.Thing emfIdCorrespondence =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createIdCorrespondence();    
        
        emfIdCorrespondence.setIid(thing.getIid().toString()); 
        
        emfIdCorrespondence.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfIdCorrespondence.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfIdCorrespondence.setModifiedOn(thing.getModifiedOn());
        
        emfIdCorrespondence.setRevisionNumber(thing.getRevisionNumber());
        
        emfIdCorrespondence.setThingPreference(thing.getThingPreference());
        		        
        return emfIdCorrespondence;
        
        
        case "cdp4common.engineeringmodeldata.MultiRelationship":
        CDP4.CommonData.Thing emfMultiRelationship =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createMultiRelationship();    
        
        emfMultiRelationship.setIid(thing.getIid().toString()); 
        
        emfMultiRelationship.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationship.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationship.setModifiedOn(thing.getModifiedOn());
        
        emfMultiRelationship.setRevisionNumber(thing.getRevisionNumber());
        
        emfMultiRelationship.setThingPreference(thing.getThingPreference());
        		        
        return emfMultiRelationship;
        
        case "cdp4common.engineeringmodeldata.BinaryRelationship":
        CDP4.CommonData.Thing emfBinaryRelationship =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createBinaryRelationship();    
        
        emfBinaryRelationship.setIid(thing.getIid().toString()); 
        
        emfBinaryRelationship.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationship.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationship.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryRelationship.setRevisionNumber(thing.getRevisionNumber());
        
        emfBinaryRelationship.setThingPreference(thing.getThingPreference());
        		        
        return emfBinaryRelationship;
        
        case "cdp4common.engineeringmodeldata.SimpleParameterValue":
        CDP4.CommonData.Thing emfSimpleParameterValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createSimpleParameterValue();    
        
        emfSimpleParameterValue.setIid(thing.getIid().toString()); 
        
        emfSimpleParameterValue.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleParameterValue.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleParameterValue.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleParameterValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleParameterValue.setThingPreference(thing.getThingPreference());
        		        
        return emfSimpleParameterValue;
        
        case "cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet":
        CDP4.CommonData.Thing emfParameterSubscriptionValueSet =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterSubscriptionValueSet();    
        
        emfParameterSubscriptionValueSet.setIid(thing.getIid().toString()); 
        
        emfParameterSubscriptionValueSet.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterSubscriptionValueSet.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterSubscriptionValueSet.setModifiedOn(thing.getModifiedOn());
        
        emfParameterSubscriptionValueSet.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterSubscriptionValueSet.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterSubscriptionValueSet;
        
        case "cdp4common.engineeringmodeldata.ActualFiniteState":
        CDP4.CommonData.Thing emfActualFiniteState =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createActualFiniteState();    
        
        emfActualFiniteState.setIid(thing.getIid().toString()); 
        
        emfActualFiniteState.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfActualFiniteState.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfActualFiniteState.setModifiedOn(thing.getModifiedOn());
        
        emfActualFiniteState.setRevisionNumber(thing.getRevisionNumber());
        
        emfActualFiniteState.setThingPreference(thing.getThingPreference());
        		        
        return emfActualFiniteState;
        
        case "cdp4common.engineeringmodeldata.ModelLogEntry":
        CDP4.CommonData.Thing emfModelLogEntry =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createModelLogEntry();    
        
        emfModelLogEntry.setIid(thing.getIid().toString()); 
        
        emfModelLogEntry.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfModelLogEntry.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfModelLogEntry.setModifiedOn(thing.getModifiedOn());
        
        emfModelLogEntry.setRevisionNumber(thing.getRevisionNumber());
        
        emfModelLogEntry.setThingPreference(thing.getThingPreference());
        		        
        return emfModelLogEntry;
        
        case "cdp4common.engineeringmodeldata.Iteration":
        CDP4.CommonData.Thing emfIteration =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createIteration();    
        
        emfIteration.setIid(thing.getIid().toString()); 
        
        emfIteration.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfIteration.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfIteration.setModifiedOn(thing.getModifiedOn());
        
        emfIteration.setRevisionNumber(thing.getRevisionNumber());
        
        emfIteration.setThingPreference(thing.getThingPreference());
        		        
        return emfIteration;
        
        case "cdp4common.engineeringmodeldata.ActualFiniteStateList":
        CDP4.CommonData.Thing emfActualFiniteStateList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createActualFiniteStateList();    
        
        emfActualFiniteStateList.setIid(thing.getIid().toString()); 
        
        emfActualFiniteStateList.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfActualFiniteStateList.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfActualFiniteStateList.setModifiedOn(thing.getModifiedOn());
        
        emfActualFiniteStateList.setRevisionNumber(thing.getRevisionNumber());
        
        emfActualFiniteStateList.setThingPreference(thing.getThingPreference());
        		        
        return emfActualFiniteStateList;
        
        
        case "cdp4common.engineeringmodeldata.OrExpression":
        CDP4.CommonData.Thing emfOrExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createOrExpression();    
        
        emfOrExpression.setIid(thing.getIid().toString()); 
        
        emfOrExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOrExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOrExpression.setModifiedOn(thing.getModifiedOn());
        
        emfOrExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfOrExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfOrExpression;
        
        case "cdp4common.engineeringmodeldata.NotExpression":
        CDP4.CommonData.Thing emfNotExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createNotExpression();    
        
        emfNotExpression.setIid(thing.getIid().toString()); 
        
        emfNotExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfNotExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfNotExpression.setModifiedOn(thing.getModifiedOn());
        
        emfNotExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfNotExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfNotExpression;
        
        case "cdp4common.engineeringmodeldata.AndExpression":
        CDP4.CommonData.Thing emfAndExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createAndExpression();    
        
        emfAndExpression.setIid(thing.getIid().toString()); 
        
        emfAndExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfAndExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfAndExpression.setModifiedOn(thing.getModifiedOn());
        
        emfAndExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfAndExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfAndExpression;
        
        case "cdp4common.engineeringmodeldata.ExclusiveOrExpression":
        CDP4.CommonData.Thing emfExclusiveOrExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createExclusiveOrExpression();    
        
        emfExclusiveOrExpression.setIid(thing.getIid().toString()); 
        
        emfExclusiveOrExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfExclusiveOrExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfExclusiveOrExpression.setModifiedOn(thing.getModifiedOn());
        
        emfExclusiveOrExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfExclusiveOrExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfExclusiveOrExpression;
        
        case "cdp4common.engineeringmodeldata.RelationalExpression":
        CDP4.CommonData.Thing emfRelationalExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRelationalExpression();    
        
        emfRelationalExpression.setIid(thing.getIid().toString()); 
        
        emfRelationalExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRelationalExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRelationalExpression.setModifiedOn(thing.getModifiedOn());
        
        emfRelationalExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfRelationalExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfRelationalExpression;
        
        
        case "cdp4common.engineeringmodeldata.ParameterValueSet":
        CDP4.CommonData.Thing emfParameterValueSet =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterValueSet();    
        
        emfParameterValueSet.setIid(thing.getIid().toString()); 
        
        emfParameterValueSet.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterValueSet.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterValueSet.setModifiedOn(thing.getModifiedOn());
        
        emfParameterValueSet.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterValueSet.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterValueSet;
        
        case "cdp4common.engineeringmodeldata.ParameterOverrideValueSet":
        CDP4.CommonData.Thing emfParameterOverrideValueSet =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterOverrideValueSet();    
        
        emfParameterOverrideValueSet.setIid(thing.getIid().toString()); 
        
        emfParameterOverrideValueSet.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterOverrideValueSet.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterOverrideValueSet.setModifiedOn(thing.getModifiedOn());
        
        emfParameterOverrideValueSet.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterOverrideValueSet.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterOverrideValueSet;
        
        case "cdp4common.engineeringmodeldata.NestedParameter":
        CDP4.CommonData.Thing emfNestedParameter =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createNestedParameter();    
        
        emfNestedParameter.setIid(thing.getIid().toString()); 
        
        emfNestedParameter.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfNestedParameter.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfNestedParameter.setModifiedOn(thing.getModifiedOn());
        
        emfNestedParameter.setRevisionNumber(thing.getRevisionNumber());
        
        emfNestedParameter.setThingPreference(thing.getThingPreference());
        		        
        return emfNestedParameter;
        
        case "cdp4common.engineeringmodeldata.FileRevision":
        CDP4.CommonData.Thing emfFileRevision =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createFileRevision();    
        
        emfFileRevision.setIid(thing.getIid().toString()); 
        
        emfFileRevision.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfFileRevision.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfFileRevision.setModifiedOn(thing.getModifiedOn());
        
        emfFileRevision.setRevisionNumber(thing.getRevisionNumber());
        
        emfFileRevision.setThingPreference(thing.getThingPreference());
        		        
        return emfFileRevision;
        
        
        case "cdp4common.engineeringmodeldata.UserRuleVerification":
        CDP4.CommonData.Thing emfUserRuleVerification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createUserRuleVerification();    
        
        emfUserRuleVerification.setIid(thing.getIid().toString()); 
        
        emfUserRuleVerification.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfUserRuleVerification.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfUserRuleVerification.setModifiedOn(thing.getModifiedOn());
        
        emfUserRuleVerification.setRevisionNumber(thing.getRevisionNumber());
        
        emfUserRuleVerification.setThingPreference(thing.getThingPreference());
        		        
        return emfUserRuleVerification;
        
        case "cdp4common.engineeringmodeldata.BuiltInRuleVerification":
        CDP4.CommonData.Thing emfBuiltInRuleVerification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createBuiltInRuleVerification();    
        
        emfBuiltInRuleVerification.setIid(thing.getIid().toString()); 
        
        emfBuiltInRuleVerification.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBuiltInRuleVerification.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBuiltInRuleVerification.setModifiedOn(thing.getModifiedOn());
        
        emfBuiltInRuleVerification.setRevisionNumber(thing.getRevisionNumber());
        
        emfBuiltInRuleVerification.setThingPreference(thing.getThingPreference());
        		        
        return emfBuiltInRuleVerification;
        
        case "cdp4common.engineeringmodeldata.RuleViolation":
        CDP4.CommonData.Thing emfRuleViolation =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRuleViolation();    
        
        emfRuleViolation.setIid(thing.getIid().toString()); 
        
        emfRuleViolation.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleViolation.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleViolation.setModifiedOn(thing.getModifiedOn());
        
        emfRuleViolation.setRevisionNumber(thing.getRevisionNumber());
        
        emfRuleViolation.setThingPreference(thing.getThingPreference());
        		        
        return emfRuleViolation;
        
        case "cdp4common.engineeringmodeldata.StakeHolderValueMapSettings":
        CDP4.CommonData.Thing emfStakeHolderValueMapSettings =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeHolderValueMapSettings();    
        
        emfStakeHolderValueMapSettings.setIid(thing.getIid().toString()); 
        
        emfStakeHolderValueMapSettings.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMapSettings.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMapSettings.setModifiedOn(thing.getModifiedOn());
        
        emfStakeHolderValueMapSettings.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeHolderValueMapSettings.setThingPreference(thing.getThingPreference());
        		        
        return emfStakeHolderValueMapSettings;
        
        
        case "cdp4common.engineeringmodeldata.RequirementsContainerParameterValue":
        CDP4.CommonData.Thing emfRequirementsContainerParameterValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsContainerParameterValue();    
        
        emfRequirementsContainerParameterValue.setIid(thing.getIid().toString()); 
        
        emfRequirementsContainerParameterValue.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsContainerParameterValue.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsContainerParameterValue.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsContainerParameterValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsContainerParameterValue.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirementsContainerParameterValue;
        
        case "cdp4common.engineeringmodeldata.RelationshipParameterValue":
        CDP4.CommonData.Thing emfRelationshipParameterValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRelationshipParameterValue();    
        
        emfRelationshipParameterValue.setIid(thing.getIid().toString()); 
        
        emfRelationshipParameterValue.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRelationshipParameterValue.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRelationshipParameterValue.setModifiedOn(thing.getModifiedOn());
        
        emfRelationshipParameterValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfRelationshipParameterValue.setThingPreference(thing.getThingPreference());
        		        
        return emfRelationshipParameterValue;
        
        case "cdp4common.reportingdata.Book":
        CDP4.CommonData.Thing emfBook =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createBook();    
        
        emfBook.setIid(thing.getIid().toString()); 
        
        emfBook.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBook.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBook.setModifiedOn(thing.getModifiedOn());
        
        emfBook.setRevisionNumber(thing.getRevisionNumber());
        
        emfBook.setThingPreference(thing.getThingPreference());
        		        
        return emfBook;
        
        case "cdp4common.reportingdata.Section":
        CDP4.CommonData.Thing emfSection =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSection();    
        
        emfSection.setIid(thing.getIid().toString()); 
        
        emfSection.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSection.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSection.setModifiedOn(thing.getModifiedOn());
        
        emfSection.setRevisionNumber(thing.getRevisionNumber());
        
        emfSection.setThingPreference(thing.getThingPreference());
        		        
        return emfSection;
        
        case "cdp4common.reportingdata.Page":
        CDP4.CommonData.Thing emfPage =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createPage();    
        
        emfPage.setIid(thing.getIid().toString()); 
        
        emfPage.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPage.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPage.setModifiedOn(thing.getModifiedOn());
        
        emfPage.setRevisionNumber(thing.getRevisionNumber());
        
        emfPage.setThingPreference(thing.getThingPreference());
        		        
        return emfPage;
        
        
        case "cdp4common.reportingdata.BinaryNote":
        CDP4.CommonData.Thing emfBinaryNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createBinaryNote();    
        
        emfBinaryNote.setIid(thing.getIid().toString()); 
        
        emfBinaryNote.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryNote.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryNote.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryNote.setRevisionNumber(thing.getRevisionNumber());
        
        emfBinaryNote.setThingPreference(thing.getThingPreference());
        		        
        return emfBinaryNote;
        
        case "cdp4common.reportingdata.TextualNote":
        CDP4.CommonData.Thing emfTextualNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createTextualNote();    
        
        emfTextualNote.setIid(thing.getIid().toString()); 
        
        emfTextualNote.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTextualNote.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTextualNote.setModifiedOn(thing.getModifiedOn());
        
        emfTextualNote.setRevisionNumber(thing.getRevisionNumber());
        
        emfTextualNote.setThingPreference(thing.getThingPreference());
        		        
        return emfTextualNote;
        
        
        case "cdp4common.reportingdata.ModellingThingReference":
        CDP4.CommonData.Thing emfModellingThingReference =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createModellingThingReference();    
        
        emfModellingThingReference.setIid(thing.getIid().toString()); 
        
        emfModellingThingReference.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfModellingThingReference.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfModellingThingReference.setModifiedOn(thing.getModifiedOn());
        
        emfModellingThingReference.setRevisionNumber(thing.getRevisionNumber());
        
        emfModellingThingReference.setThingPreference(thing.getThingPreference());
        		        
        return emfModellingThingReference;
        
        case "cdp4common.reportingdata.SiteDirectoryThingReference":
        CDP4.CommonData.Thing emfSiteDirectoryThingReference =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryThingReference();    
        
        emfSiteDirectoryThingReference.setIid(thing.getIid().toString()); 
        
        emfSiteDirectoryThingReference.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryThingReference.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryThingReference.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryThingReference.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteDirectoryThingReference.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteDirectoryThingReference;
        
        
        case "cdp4common.reportingdata.Solution":
        CDP4.CommonData.Thing emfSolution =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSolution();    
        
        emfSolution.setIid(thing.getIid().toString()); 
        
        emfSolution.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSolution.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSolution.setModifiedOn(thing.getModifiedOn());
        
        emfSolution.setRevisionNumber(thing.getRevisionNumber());
        
        emfSolution.setThingPreference(thing.getThingPreference());
        		        
        return emfSolution;
        
        case "cdp4common.reportingdata.SiteDirectoryDataAnnotation":
        CDP4.CommonData.Thing emfSiteDirectoryDataAnnotation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryDataAnnotation();    
        
        emfSiteDirectoryDataAnnotation.setIid(thing.getIid().toString()); 
        
        emfSiteDirectoryDataAnnotation.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataAnnotation.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataAnnotation.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryDataAnnotation.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteDirectoryDataAnnotation.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteDirectoryDataAnnotation;
        
        
        
        
        case "cdp4common.reportingdata.RequestForWaiver":
        CDP4.CommonData.Thing emfRequestForWaiver =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForWaiver();    
        
        emfRequestForWaiver.setIid(thing.getIid().toString()); 
        
        emfRequestForWaiver.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForWaiver.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForWaiver.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequestForWaiver.setThingPreference(thing.getThingPreference());
        		        
        return emfRequestForWaiver;
        
        case "cdp4common.reportingdata.RequestForDeviation":
        CDP4.CommonData.Thing emfRequestForDeviation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForDeviation();    
        
        emfRequestForDeviation.setIid(thing.getIid().toString()); 
        
        emfRequestForDeviation.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequestForDeviation.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForDeviation.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequestForDeviation.setThingPreference(thing.getThingPreference());
        		        
        return emfRequestForDeviation;
        
        case "cdp4common.reportingdata.ChangeRequest":
        CDP4.CommonData.Thing emfChangeRequest =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeRequest();    
        
        emfChangeRequest.setIid(thing.getIid().toString()); 
        
        emfChangeRequest.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeRequest.setModifiedOn(thing.getModifiedOn());
        
        emfChangeRequest.setRevisionNumber(thing.getRevisionNumber());
        
        emfChangeRequest.setThingPreference(thing.getThingPreference());
        		        
        return emfChangeRequest;
        
        case "cdp4common.reportingdata.ReviewItemDiscrepancy":
        CDP4.CommonData.Thing emfReviewItemDiscrepancy =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createReviewItemDiscrepancy();    
        
        emfReviewItemDiscrepancy.setIid(thing.getIid().toString()); 
        
        emfReviewItemDiscrepancy.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfReviewItemDiscrepancy.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfReviewItemDiscrepancy.setModifiedOn(thing.getModifiedOn());
        
        emfReviewItemDiscrepancy.setRevisionNumber(thing.getRevisionNumber());
        
        emfReviewItemDiscrepancy.setThingPreference(thing.getThingPreference());
        		        
        return emfReviewItemDiscrepancy;
        
        case "cdp4common.reportingdata.ActionItem":
        CDP4.CommonData.Thing emfActionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createActionItem();    
        
        emfActionItem.setIid(thing.getIid().toString()); 
        
        emfActionItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfActionItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfActionItem.setModifiedOn(thing.getModifiedOn());
        
        emfActionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfActionItem.setThingPreference(thing.getThingPreference());
        		        
        return emfActionItem;
        
        case "cdp4common.reportingdata.ChangeProposal":
        CDP4.CommonData.Thing emfChangeProposal =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeProposal();    
        
        emfChangeProposal.setIid(thing.getIid().toString()); 
        
        emfChangeProposal.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeProposal.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfChangeProposal.setModifiedOn(thing.getModifiedOn());
        
        emfChangeProposal.setRevisionNumber(thing.getRevisionNumber());
        
        emfChangeProposal.setThingPreference(thing.getThingPreference());
        		        
        return emfChangeProposal;
        
        case "cdp4common.reportingdata.ContractChangeNotice":
        CDP4.CommonData.Thing emfContractChangeNotice =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createContractChangeNotice();    
        
        emfContractChangeNotice.setIid(thing.getIid().toString()); 
        
        emfContractChangeNotice.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfContractChangeNotice.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfContractChangeNotice.setModifiedOn(thing.getModifiedOn());
        
        emfContractChangeNotice.setRevisionNumber(thing.getRevisionNumber());
        
        emfContractChangeNotice.setThingPreference(thing.getThingPreference());
        		        
        return emfContractChangeNotice;
        
        case "cdp4common.reportingdata.EngineeringModelDataNote":
        CDP4.CommonData.Thing emfEngineeringModelDataNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createEngineeringModelDataNote();    
        
        emfEngineeringModelDataNote.setIid(thing.getIid().toString()); 
        
        emfEngineeringModelDataNote.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataNote.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataNote.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelDataNote.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModelDataNote.setThingPreference(thing.getThingPreference());
        		        
        return emfEngineeringModelDataNote;
        
        case "cdp4common.reportingdata.Approval":
        CDP4.CommonData.Thing emfApproval =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createApproval();    
        
        emfApproval.setIid(thing.getIid().toString()); 
        
        emfApproval.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfApproval.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfApproval.setModifiedOn(thing.getModifiedOn());
        
        emfApproval.setRevisionNumber(thing.getRevisionNumber());
        
        emfApproval.setThingPreference(thing.getThingPreference());
        		        
        return emfApproval;
        
        
        case "cdp4common.reportingdata.EngineeringModelDataDiscussionItem":
        CDP4.CommonData.Thing emfEngineeringModelDataDiscussionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createEngineeringModelDataDiscussionItem();    
        
        emfEngineeringModelDataDiscussionItem.setIid(thing.getIid().toString()); 
        
        emfEngineeringModelDataDiscussionItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataDiscussionItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataDiscussionItem.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelDataDiscussionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModelDataDiscussionItem.setThingPreference(thing.getThingPreference());
        		        
        return emfEngineeringModelDataDiscussionItem;
        
        case "cdp4common.reportingdata.SiteDirectoryDataDiscussionItem":
        CDP4.CommonData.Thing emfSiteDirectoryDataDiscussionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryDataDiscussionItem();    
        
        emfSiteDirectoryDataDiscussionItem.setIid(thing.getIid().toString()); 
        
        emfSiteDirectoryDataDiscussionItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataDiscussionItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataDiscussionItem.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryDataDiscussionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteDirectoryDataDiscussionItem.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteDirectoryDataDiscussionItem;
        
        
        case "cdp4common.diagramdata.Point":
        CDP4.CommonData.Thing emfPoint =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createPoint();    
        
        emfPoint.setIid(thing.getIid().toString()); 
        
        emfPoint.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPoint.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPoint.setModifiedOn(thing.getModifiedOn());
        
        emfPoint.setRevisionNumber(thing.getRevisionNumber());
        
        emfPoint.setThingPreference(thing.getThingPreference());
        		        
        return emfPoint;
        
        case "cdp4common.diagramdata.Bounds":
        CDP4.CommonData.Thing emfBounds =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createBounds();    
        
        emfBounds.setIid(thing.getIid().toString()); 
        
        emfBounds.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBounds.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBounds.setModifiedOn(thing.getModifiedOn());
        
        emfBounds.setRevisionNumber(thing.getRevisionNumber());
        
        emfBounds.setThingPreference(thing.getThingPreference());
        		        
        return emfBounds;
        
        case "cdp4common.diagramdata.Color":
        CDP4.CommonData.Thing emfColor =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createColor();    
        
        emfColor.setIid(thing.getIid().toString()); 
        
        emfColor.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfColor.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfColor.setModifiedOn(thing.getModifiedOn());
        
        emfColor.setRevisionNumber(thing.getRevisionNumber());
        
        emfColor.setThingPreference(thing.getThingPreference());
        		        
        return emfColor;
        
        
        case "cdp4common.diagramdata.OwnedStyle":
        CDP4.CommonData.Thing emfOwnedStyle =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createOwnedStyle();    
        
        emfOwnedStyle.setIid(thing.getIid().toString()); 
        
        emfOwnedStyle.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOwnedStyle.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOwnedStyle.setModifiedOn(thing.getModifiedOn());
        
        emfOwnedStyle.setRevisionNumber(thing.getRevisionNumber());
        
        emfOwnedStyle.setThingPreference(thing.getThingPreference());
        		        
        return emfOwnedStyle;
        
        case "cdp4common.diagramdata.SharedStyle":
        CDP4.CommonData.Thing emfSharedStyle =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createSharedStyle();    
        
        emfSharedStyle.setIid(thing.getIid().toString()); 
        
        emfSharedStyle.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSharedStyle.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSharedStyle.setModifiedOn(thing.getModifiedOn());
        
        emfSharedStyle.setRevisionNumber(thing.getRevisionNumber());
        
        emfSharedStyle.setThingPreference(thing.getThingPreference());
        		        
        return emfSharedStyle;
        
        
        
        case "cdp4common.diagramdata.DiagramEdge":
        CDP4.CommonData.Thing emfDiagramEdge =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramEdge();    
        
        emfDiagramEdge.setIid(thing.getIid().toString()); 
        
        emfDiagramEdge.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramEdge.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramEdge.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramEdge.setRevisionNumber(thing.getRevisionNumber());
        
        emfDiagramEdge.setThingPreference(thing.getThingPreference());
        		        
        return emfDiagramEdge;
        
        
        case "cdp4common.diagramdata.DiagramObject":
        CDP4.CommonData.Thing emfDiagramObject =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramObject();    
        
        emfDiagramObject.setIid(thing.getIid().toString()); 
        
        emfDiagramObject.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramObject.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramObject.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramObject.setRevisionNumber(thing.getRevisionNumber());
        
        emfDiagramObject.setThingPreference(thing.getThingPreference());
        		        
        return emfDiagramObject;
        
        case "cdp4common.diagramdata.DiagramCanvas":
        CDP4.CommonData.Thing emfDiagramCanvas =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramCanvas();    
        
        emfDiagramCanvas.setIid(thing.getIid().toString()); 
        
        emfDiagramCanvas.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramCanvas.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramCanvas.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramCanvas.setRevisionNumber(thing.getRevisionNumber());
        
        emfDiagramCanvas.setThingPreference(thing.getThingPreference());
        		        
        return emfDiagramCanvas;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.CommonData.Thing} to {@link cdp4common.commondata.Thing}
     *
     * @return Generated {@link cdp4common.commondata.Thing}
     */
    public static cdp4common.commondata.Thing toPojo(CDP4.CommonData.Thing emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.ParticipantPermission":                
        cdp4common.commondata.Thing pojoParticipantPermission = new cdp4common.sitedirectorydata.ParticipantPermission();	    
        
        pojoParticipantPermission.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParticipantPermission.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantPermission.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantPermission.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParticipantPermission.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParticipantPermission.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParticipantPermission;
        
        case "CDP4.sitedirectorydata.Person":                
        cdp4common.commondata.Thing pojoPerson = new cdp4common.sitedirectorydata.Person();	    
        
        pojoPerson.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPerson.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPerson.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPerson.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPerson.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPerson.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPerson;
        
        case "CDP4.sitedirectorydata.Organization":                
        cdp4common.commondata.Thing pojoOrganization = new cdp4common.sitedirectorydata.Organization();	    
        
        pojoOrganization.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrganization.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrganization.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrganization.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrganization.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOrganization.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoOrganization;
        
        case "CDP4.sitedirectorydata.Participant":                
        cdp4common.commondata.Thing pojoParticipant = new cdp4common.sitedirectorydata.Participant();	    
        
        pojoParticipant.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParticipant.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipant.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipant.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParticipant.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParticipant.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParticipant;
        
        case "CDP4.sitedirectorydata.ScaleReferenceQuantityValue":                
        cdp4common.commondata.Thing pojoScaleReferenceQuantityValue = new cdp4common.sitedirectorydata.ScaleReferenceQuantityValue();	    
        
        pojoScaleReferenceQuantityValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoScaleReferenceQuantityValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleReferenceQuantityValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleReferenceQuantityValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoScaleReferenceQuantityValue.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoScaleReferenceQuantityValue.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoScaleReferenceQuantityValue;
        
        case "CDP4.sitedirectorydata.MappingToReferenceScale":                
        cdp4common.commondata.Thing pojoMappingToReferenceScale = new cdp4common.sitedirectorydata.MappingToReferenceScale();	    
        
        pojoMappingToReferenceScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMappingToReferenceScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMappingToReferenceScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMappingToReferenceScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMappingToReferenceScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoMappingToReferenceScale.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoMappingToReferenceScale;
        
        case "CDP4.sitedirectorydata.QuantityKindFactor":                
        cdp4common.commondata.Thing pojoQuantityKindFactor = new cdp4common.sitedirectorydata.QuantityKindFactor();	    
        
        pojoQuantityKindFactor.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoQuantityKindFactor.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoQuantityKindFactor.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoQuantityKindFactor.setModifiedOn(emfThing.getModifiedOn());
        
        pojoQuantityKindFactor.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoQuantityKindFactor.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoQuantityKindFactor;
        
        case "CDP4.sitedirectorydata.UnitFactor":                
        cdp4common.commondata.Thing pojoUnitFactor = new cdp4common.sitedirectorydata.UnitFactor();	    
        
        pojoUnitFactor.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUnitFactor.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitFactor.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitFactor.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUnitFactor.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoUnitFactor.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoUnitFactor;
        
        case "CDP4.sitedirectorydata.ParameterTypeComponent":                
        cdp4common.commondata.Thing pojoParameterTypeComponent = new cdp4common.sitedirectorydata.ParameterTypeComponent();	    
        
        pojoParameterTypeComponent.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterTypeComponent.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterTypeComponent.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterTypeComponent.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterTypeComponent.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterTypeComponent.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterTypeComponent;
        
        case "CDP4.sitedirectorydata.PersonPermission":                
        cdp4common.commondata.Thing pojoPersonPermission = new cdp4common.sitedirectorydata.PersonPermission();	    
        
        pojoPersonPermission.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPersonPermission.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonPermission.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonPermission.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPersonPermission.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPersonPermission.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPersonPermission;
        
        case "CDP4.sitedirectorydata.SiteLogEntry":                
        cdp4common.commondata.Thing pojoSiteLogEntry = new cdp4common.sitedirectorydata.SiteLogEntry();	    
        
        pojoSiteLogEntry.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteLogEntry.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteLogEntry.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteLogEntry.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteLogEntry.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteLogEntry.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteLogEntry;
        
        case "CDP4.sitedirectorydata.IterationSetup":                
        cdp4common.commondata.Thing pojoIterationSetup = new cdp4common.sitedirectorydata.IterationSetup();	    
        
        pojoIterationSetup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIterationSetup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIterationSetup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIterationSetup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIterationSetup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoIterationSetup.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoIterationSetup;
        
        case "CDP4.sitedirectorydata.TelephoneNumber":                
        cdp4common.commondata.Thing pojoTelephoneNumber = new cdp4common.sitedirectorydata.TelephoneNumber();	    
        
        pojoTelephoneNumber.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTelephoneNumber.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTelephoneNumber.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTelephoneNumber.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTelephoneNumber.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTelephoneNumber.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoTelephoneNumber;
        
        case "CDP4.sitedirectorydata.EmailAddress":                
        cdp4common.commondata.Thing pojoEmailAddress = new cdp4common.sitedirectorydata.EmailAddress();	    
        
        pojoEmailAddress.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEmailAddress.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEmailAddress.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEmailAddress.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEmailAddress.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEmailAddress.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEmailAddress;
        
        case "CDP4.sitedirectorydata.UserPreference":                
        cdp4common.commondata.Thing pojoUserPreference = new cdp4common.sitedirectorydata.UserPreference();	    
        
        pojoUserPreference.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUserPreference.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserPreference.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserPreference.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUserPreference.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoUserPreference.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoUserPreference;
        
        case "CDP4.sitedirectorydata.NaturalLanguage":                
        cdp4common.commondata.Thing pojoNaturalLanguage = new cdp4common.sitedirectorydata.NaturalLanguage();	    
        
        pojoNaturalLanguage.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNaturalLanguage.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNaturalLanguage.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNaturalLanguage.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNaturalLanguage.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoNaturalLanguage.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoNaturalLanguage;
        
        case "CDP4.sitedirectorydata.DependentParameterTypeAssignment":                
        cdp4common.commondata.Thing pojoDependentParameterTypeAssignment = new cdp4common.sitedirectorydata.DependentParameterTypeAssignment();	    
        
        pojoDependentParameterTypeAssignment.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDependentParameterTypeAssignment.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDependentParameterTypeAssignment.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDependentParameterTypeAssignment.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDependentParameterTypeAssignment.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDependentParameterTypeAssignment.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDependentParameterTypeAssignment;
        
        case "CDP4.sitedirectorydata.IndependentParameterTypeAssignment":                
        cdp4common.commondata.Thing pojoIndependentParameterTypeAssignment = new cdp4common.sitedirectorydata.IndependentParameterTypeAssignment();	    
        
        pojoIndependentParameterTypeAssignment.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIndependentParameterTypeAssignment.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIndependentParameterTypeAssignment.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIndependentParameterTypeAssignment.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIndependentParameterTypeAssignment.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoIndependentParameterTypeAssignment.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoIndependentParameterTypeAssignment;
        
        case "CDP4.sitedirectorydata.OrganizationalParticipant":                
        cdp4common.commondata.Thing pojoOrganizationalParticipant = new cdp4common.sitedirectorydata.OrganizationalParticipant();	    
        
        pojoOrganizationalParticipant.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrganizationalParticipant.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrganizationalParticipant.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrganizationalParticipant.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrganizationalParticipant.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOrganizationalParticipant.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoOrganizationalParticipant;
        
        
        case "CDP4.sitedirectorydata.ParticipantRole":                
        cdp4common.commondata.Thing pojoParticipantRole = new cdp4common.sitedirectorydata.ParticipantRole();	    
        
        pojoParticipantRole.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParticipantRole.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParticipantRole.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParticipantRole.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParticipantRole;
        
        case "CDP4.sitedirectorydata.EngineeringModelSetup":                
        cdp4common.commondata.Thing pojoEngineeringModelSetup = new cdp4common.sitedirectorydata.EngineeringModelSetup();	    
        
        pojoEngineeringModelSetup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelSetup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelSetup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEngineeringModelSetup.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEngineeringModelSetup;
        
        case "CDP4.sitedirectorydata.Glossary":                
        cdp4common.commondata.Thing pojoGlossary = new cdp4common.sitedirectorydata.Glossary();	    
        
        pojoGlossary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoGlossary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoGlossary.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoGlossary.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoGlossary;
        
        
        case "CDP4.sitedirectorydata.SiteReferenceDataLibrary":                
        cdp4common.commondata.Thing pojoSiteReferenceDataLibrary = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary();	    
        
        pojoSiteReferenceDataLibrary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteReferenceDataLibrary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteReferenceDataLibrary.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteReferenceDataLibrary.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteReferenceDataLibrary;
        
        case "CDP4.sitedirectorydata.ModelReferenceDataLibrary":                
        cdp4common.commondata.Thing pojoModelReferenceDataLibrary = new cdp4common.sitedirectorydata.ModelReferenceDataLibrary();	    
        
        pojoModelReferenceDataLibrary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModelReferenceDataLibrary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModelReferenceDataLibrary.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoModelReferenceDataLibrary.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoModelReferenceDataLibrary;
        
        case "CDP4.sitedirectorydata.Term":                
        cdp4common.commondata.Thing pojoTerm = new cdp4common.sitedirectorydata.Term();	    
        
        pojoTerm.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTerm.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTerm.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTerm.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoTerm;
        
        case "CDP4.sitedirectorydata.FileType":                
        cdp4common.commondata.Thing pojoFileType = new cdp4common.sitedirectorydata.FileType();	    
        
        pojoFileType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFileType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFileType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoFileType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoFileType;
        
        
        case "CDP4.sitedirectorydata.OrdinalScale":                
        cdp4common.commondata.Thing pojoOrdinalScale = new cdp4common.sitedirectorydata.OrdinalScale();	    
        
        pojoOrdinalScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrdinalScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrdinalScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOrdinalScale.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoOrdinalScale;
        
        case "CDP4.sitedirectorydata.RatioScale":                
        cdp4common.commondata.Thing pojoRatioScale = new cdp4common.sitedirectorydata.RatioScale();	    
        
        pojoRatioScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRatioScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRatioScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRatioScale.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRatioScale;
        
        case "CDP4.sitedirectorydata.CyclicRatioScale":                
        cdp4common.commondata.Thing pojoCyclicRatioScale = new cdp4common.sitedirectorydata.CyclicRatioScale();	    
        
        pojoCyclicRatioScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCyclicRatioScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCyclicRatioScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCyclicRatioScale.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoCyclicRatioScale;
        
        case "CDP4.sitedirectorydata.IntervalScale":                
        cdp4common.commondata.Thing pojoIntervalScale = new cdp4common.sitedirectorydata.IntervalScale();	    
        
        pojoIntervalScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIntervalScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIntervalScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoIntervalScale.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoIntervalScale;
        
        case "CDP4.sitedirectorydata.LogarithmicScale":                
        cdp4common.commondata.Thing pojoLogarithmicScale = new cdp4common.sitedirectorydata.LogarithmicScale();	    
        
        pojoLogarithmicScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLogarithmicScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLogarithmicScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoLogarithmicScale.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoLogarithmicScale;
        
        case "CDP4.sitedirectorydata.DomainOfExpertise":                
        cdp4common.commondata.Thing pojoDomainOfExpertise = new cdp4common.sitedirectorydata.DomainOfExpertise();	    
        
        pojoDomainOfExpertise.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainOfExpertise.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainOfExpertise.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDomainOfExpertise.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDomainOfExpertise;
        
        
        case "CDP4.sitedirectorydata.CompoundParameterType":                
        cdp4common.commondata.Thing pojoCompoundParameterType = new cdp4common.sitedirectorydata.CompoundParameterType();	    
        
        pojoCompoundParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCompoundParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCompoundParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCompoundParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoCompoundParameterType;
        
        case "CDP4.sitedirectorydata.ArrayParameterType":                
        cdp4common.commondata.Thing pojoArrayParameterType = new cdp4common.sitedirectorydata.ArrayParameterType();	    
        
        pojoArrayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoArrayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoArrayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoArrayParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoArrayParameterType;
        
        
        case "CDP4.sitedirectorydata.EnumerationParameterType":                
        cdp4common.commondata.Thing pojoEnumerationParameterType = new cdp4common.sitedirectorydata.EnumerationParameterType();	    
        
        pojoEnumerationParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEnumerationParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEnumerationParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEnumerationParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEnumerationParameterType;
        
        case "CDP4.sitedirectorydata.BooleanParameterType":                
        cdp4common.commondata.Thing pojoBooleanParameterType = new cdp4common.sitedirectorydata.BooleanParameterType();	    
        
        pojoBooleanParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBooleanParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBooleanParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBooleanParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBooleanParameterType;
        
        case "CDP4.sitedirectorydata.DateParameterType":                
        cdp4common.commondata.Thing pojoDateParameterType = new cdp4common.sitedirectorydata.DateParameterType();	    
        
        pojoDateParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDateParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDateParameterType;
        
        case "CDP4.sitedirectorydata.TextParameterType":                
        cdp4common.commondata.Thing pojoTextParameterType = new cdp4common.sitedirectorydata.TextParameterType();	    
        
        pojoTextParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTextParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTextParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTextParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoTextParameterType;
        
        case "CDP4.sitedirectorydata.DateTimeParameterType":                
        cdp4common.commondata.Thing pojoDateTimeParameterType = new cdp4common.sitedirectorydata.DateTimeParameterType();	    
        
        pojoDateTimeParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateTimeParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateTimeParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDateTimeParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDateTimeParameterType;
        
        case "CDP4.sitedirectorydata.TimeOfDayParameterType":                
        cdp4common.commondata.Thing pojoTimeOfDayParameterType = new cdp4common.sitedirectorydata.TimeOfDayParameterType();	    
        
        pojoTimeOfDayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTimeOfDayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTimeOfDayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTimeOfDayParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoTimeOfDayParameterType;
        
        
        case "CDP4.sitedirectorydata.SpecializedQuantityKind":                
        cdp4common.commondata.Thing pojoSpecializedQuantityKind = new cdp4common.sitedirectorydata.SpecializedQuantityKind();	    
        
        pojoSpecializedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSpecializedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSpecializedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSpecializedQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSpecializedQuantityKind;
        
        case "CDP4.sitedirectorydata.SimpleQuantityKind":                
        cdp4common.commondata.Thing pojoSimpleQuantityKind = new cdp4common.sitedirectorydata.SimpleQuantityKind();	    
        
        pojoSimpleQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSimpleQuantityKind;
        
        case "CDP4.sitedirectorydata.DerivedQuantityKind":                
        cdp4common.commondata.Thing pojoDerivedQuantityKind = new cdp4common.sitedirectorydata.DerivedQuantityKind();	    
        
        pojoDerivedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDerivedQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDerivedQuantityKind;
        
        case "CDP4.sitedirectorydata.SampledFunctionParameterType":                
        cdp4common.commondata.Thing pojoSampledFunctionParameterType = new cdp4common.sitedirectorydata.SampledFunctionParameterType();	    
        
        pojoSampledFunctionParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSampledFunctionParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSampledFunctionParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSampledFunctionParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSampledFunctionParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSampledFunctionParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSampledFunctionParameterType;
        
        case "CDP4.sitedirectorydata.ScaleValueDefinition":                
        cdp4common.commondata.Thing pojoScaleValueDefinition = new cdp4common.sitedirectorydata.ScaleValueDefinition();	    
        
        pojoScaleValueDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoScaleValueDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoScaleValueDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoScaleValueDefinition.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoScaleValueDefinition;
        
        
        case "CDP4.sitedirectorydata.DerivedUnit":                
        cdp4common.commondata.Thing pojoDerivedUnit = new cdp4common.sitedirectorydata.DerivedUnit();	    
        
        pojoDerivedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDerivedUnit.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDerivedUnit;
        
        
        case "CDP4.sitedirectorydata.LinearConversionUnit":                
        cdp4common.commondata.Thing pojoLinearConversionUnit = new cdp4common.sitedirectorydata.LinearConversionUnit();	    
        
        pojoLinearConversionUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLinearConversionUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLinearConversionUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoLinearConversionUnit.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoLinearConversionUnit;
        
        case "CDP4.sitedirectorydata.PrefixedUnit":                
        cdp4common.commondata.Thing pojoPrefixedUnit = new cdp4common.sitedirectorydata.PrefixedUnit();	    
        
        pojoPrefixedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPrefixedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPrefixedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPrefixedUnit.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPrefixedUnit;
        
        case "CDP4.sitedirectorydata.SimpleUnit":                
        cdp4common.commondata.Thing pojoSimpleUnit = new cdp4common.sitedirectorydata.SimpleUnit();	    
        
        pojoSimpleUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleUnit.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSimpleUnit;
        
        case "CDP4.sitedirectorydata.Category":                
        cdp4common.commondata.Thing pojoCategory = new cdp4common.sitedirectorydata.Category();	    
        
        pojoCategory.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCategory.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCategory.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCategory.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoCategory;
        
        case "CDP4.sitedirectorydata.UnitPrefix":                
        cdp4common.commondata.Thing pojoUnitPrefix = new cdp4common.sitedirectorydata.UnitPrefix();	    
        
        pojoUnitPrefix.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUnitPrefix.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUnitPrefix.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoUnitPrefix.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoUnitPrefix;
        
        
        case "CDP4.sitedirectorydata.ReferencerRule":                
        cdp4common.commondata.Thing pojoReferencerRule = new cdp4common.sitedirectorydata.ReferencerRule();	    
        
        pojoReferencerRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReferencerRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReferencerRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoReferencerRule.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoReferencerRule;
        
        case "CDP4.sitedirectorydata.BinaryRelationshipRule":                
        cdp4common.commondata.Thing pojoBinaryRelationshipRule = new cdp4common.sitedirectorydata.BinaryRelationshipRule();	    
        
        pojoBinaryRelationshipRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryRelationshipRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryRelationshipRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBinaryRelationshipRule.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBinaryRelationshipRule;
        
        case "CDP4.sitedirectorydata.MultiRelationshipRule":                
        cdp4common.commondata.Thing pojoMultiRelationshipRule = new cdp4common.sitedirectorydata.MultiRelationshipRule();	    
        
        pojoMultiRelationshipRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMultiRelationshipRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMultiRelationshipRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoMultiRelationshipRule.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoMultiRelationshipRule;
        
        case "CDP4.sitedirectorydata.DecompositionRule":                
        cdp4common.commondata.Thing pojoDecompositionRule = new cdp4common.sitedirectorydata.DecompositionRule();	    
        
        pojoDecompositionRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDecompositionRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDecompositionRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDecompositionRule.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDecompositionRule;
        
        case "CDP4.sitedirectorydata.ParameterizedCategoryRule":                
        cdp4common.commondata.Thing pojoParameterizedCategoryRule = new cdp4common.sitedirectorydata.ParameterizedCategoryRule();	    
        
        pojoParameterizedCategoryRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterizedCategoryRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterizedCategoryRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterizedCategoryRule.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterizedCategoryRule;
        
        case "CDP4.sitedirectorydata.EnumerationValueDefinition":                
        cdp4common.commondata.Thing pojoEnumerationValueDefinition = new cdp4common.sitedirectorydata.EnumerationValueDefinition();	    
        
        pojoEnumerationValueDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEnumerationValueDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEnumerationValueDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEnumerationValueDefinition.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEnumerationValueDefinition;
        
        case "CDP4.sitedirectorydata.PersonRole":                
        cdp4common.commondata.Thing pojoPersonRole = new cdp4common.sitedirectorydata.PersonRole();	    
        
        pojoPersonRole.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPersonRole.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPersonRole.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPersonRole.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPersonRole;
        
        case "CDP4.sitedirectorydata.DomainOfExpertiseGroup":                
        cdp4common.commondata.Thing pojoDomainOfExpertiseGroup = new cdp4common.sitedirectorydata.DomainOfExpertiseGroup();	    
        
        pojoDomainOfExpertiseGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainOfExpertiseGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainOfExpertiseGroup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDomainOfExpertiseGroup.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDomainOfExpertiseGroup;
        
        case "CDP4.sitedirectorydata.ReferenceSource":                
        cdp4common.commondata.Thing pojoReferenceSource = new cdp4common.sitedirectorydata.ReferenceSource();	    
        
        pojoReferenceSource.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReferenceSource.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReferenceSource.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoReferenceSource.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoReferenceSource;
        
        case "CDP4.sitedirectorydata.Constant":                
        cdp4common.commondata.Thing pojoConstant = new cdp4common.sitedirectorydata.Constant();	    
        
        pojoConstant.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoConstant.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.setModifiedOn(emfThing.getModifiedOn());
        
        pojoConstant.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoConstant.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoConstant;
        
        case "CDP4.engineeringmodeldata.PossibleFiniteState":                
        cdp4common.commondata.Thing pojoPossibleFiniteState = new cdp4common.engineeringmodeldata.PossibleFiniteState();	    
        
        pojoPossibleFiniteState.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPossibleFiniteState.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPossibleFiniteState.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPossibleFiniteState.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPossibleFiniteState;
        
        case "CDP4.engineeringmodeldata.Option":                
        cdp4common.commondata.Thing pojoOption = new cdp4common.engineeringmodeldata.Option();	    
        
        pojoOption.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOption.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOption.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOption.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoOption;
        
        case "CDP4.engineeringmodeldata.PossibleFiniteStateList":                
        cdp4common.commondata.Thing pojoPossibleFiniteStateList = new cdp4common.engineeringmodeldata.PossibleFiniteStateList();	    
        
        pojoPossibleFiniteStateList.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPossibleFiniteStateList.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPossibleFiniteStateList.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPossibleFiniteStateList.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPossibleFiniteStateList;
        
        
        case "CDP4.engineeringmodeldata.ElementDefinition":                
        cdp4common.commondata.Thing pojoElementDefinition = new cdp4common.engineeringmodeldata.ElementDefinition();	    
        
        pojoElementDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoElementDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoElementDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoElementDefinition.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoElementDefinition;
        
        case "CDP4.engineeringmodeldata.ElementUsage":                
        cdp4common.commondata.Thing pojoElementUsage = new cdp4common.engineeringmodeldata.ElementUsage();	    
        
        pojoElementUsage.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoElementUsage.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.setModifiedOn(emfThing.getModifiedOn());
        
        pojoElementUsage.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoElementUsage.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoElementUsage;
        
        
        case "CDP4.engineeringmodeldata.RequirementsSpecification":                
        cdp4common.commondata.Thing pojoRequirementsSpecification = new cdp4common.engineeringmodeldata.RequirementsSpecification();	    
        
        pojoRequirementsSpecification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsSpecification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsSpecification.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirementsSpecification.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequirementsSpecification;
        
        case "CDP4.engineeringmodeldata.RequirementsGroup":                
        cdp4common.commondata.Thing pojoRequirementsGroup = new cdp4common.engineeringmodeldata.RequirementsGroup();	    
        
        pojoRequirementsGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsGroup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirementsGroup.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequirementsGroup;
        
        
        case "CDP4.engineeringmodeldata.Requirement":                
        cdp4common.commondata.Thing pojoRequirement = new cdp4common.engineeringmodeldata.Requirement();	    
        
        pojoRequirement.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirement.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirement.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirement.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequirement;
        
        case "CDP4.engineeringmodeldata.RuleVerificationList":                
        cdp4common.commondata.Thing pojoRuleVerificationList = new cdp4common.engineeringmodeldata.RuleVerificationList();	    
        
        pojoRuleVerificationList.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRuleVerificationList.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRuleVerificationList.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRuleVerificationList.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRuleVerificationList;
        
        case "CDP4.engineeringmodeldata.Goal":                
        cdp4common.commondata.Thing pojoGoal = new cdp4common.engineeringmodeldata.Goal();	    
        
        pojoGoal.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoGoal.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.setModifiedOn(emfThing.getModifiedOn());
        
        pojoGoal.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoGoal.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoGoal;
        
        case "CDP4.engineeringmodeldata.Stakeholder":                
        cdp4common.commondata.Thing pojoStakeholder = new cdp4common.engineeringmodeldata.Stakeholder();	    
        
        pojoStakeholder.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeholder.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeholder.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoStakeholder.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoStakeholder;
        
        case "CDP4.engineeringmodeldata.ValueGroup":                
        cdp4common.commondata.Thing pojoValueGroup = new cdp4common.engineeringmodeldata.ValueGroup();	    
        
        pojoValueGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoValueGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoValueGroup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoValueGroup.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoValueGroup;
        
        case "CDP4.engineeringmodeldata.StakeholderValue":                
        cdp4common.commondata.Thing pojoStakeholderValue = new cdp4common.engineeringmodeldata.StakeholderValue();	    
        
        pojoStakeholderValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeholderValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeholderValue.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoStakeholderValue.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoStakeholderValue;
        
        case "CDP4.engineeringmodeldata.StakeHolderValueMap":                
        cdp4common.commondata.Thing pojoStakeHolderValueMap = new cdp4common.engineeringmodeldata.StakeHolderValueMap();	    
        
        pojoStakeHolderValueMap.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeHolderValueMap.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeHolderValueMap.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoStakeHolderValueMap.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoStakeHolderValueMap;
        
        case "CDP4.commondata.HyperLink":                
        cdp4common.commondata.Thing pojoHyperLink = new cdp4common.commondata.HyperLink();	    
        
        pojoHyperLink.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoHyperLink.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoHyperLink.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoHyperLink.setModifiedOn(emfThing.getModifiedOn());
        
        pojoHyperLink.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoHyperLink.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoHyperLink;
        
        case "CDP4.commondata.Definition":                
        cdp4common.commondata.Thing pojoDefinition = new cdp4common.commondata.Definition();	    
        
        pojoDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDefinition.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDefinition;
        
        case "CDP4.commondata.Alias":                
        cdp4common.commondata.Thing pojoAlias = new cdp4common.commondata.Alias();	    
        
        pojoAlias.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoAlias.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAlias.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAlias.setModifiedOn(emfThing.getModifiedOn());
        
        pojoAlias.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoAlias.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoAlias;
        
        case "CDP4.commondata.Citation":                
        cdp4common.commondata.Thing pojoCitation = new cdp4common.commondata.Citation();	    
        
        pojoCitation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCitation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCitation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCitation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCitation.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCitation.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoCitation;
        
        
        case "CDP4.sitedirectorydata.SiteDirectory":                
        cdp4common.commondata.Thing pojoSiteDirectory = new cdp4common.sitedirectorydata.SiteDirectory();	    
        
        pojoSiteDirectory.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectory.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectory.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectory.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectory.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteDirectory.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteDirectory;
        
        case "CDP4.engineeringmodeldata.EngineeringModel":                
        cdp4common.commondata.Thing pojoEngineeringModel = new cdp4common.engineeringmodeldata.EngineeringModel();	    
        
        pojoEngineeringModel.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModel.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModel.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModel.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModel.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEngineeringModel.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEngineeringModel;
        
        case "CDP4.commondata.LogEntryChangelogItem":                
        cdp4common.commondata.Thing pojoLogEntryChangelogItem = new cdp4common.commondata.LogEntryChangelogItem();	    
        
        pojoLogEntryChangelogItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLogEntryChangelogItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogEntryChangelogItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogEntryChangelogItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLogEntryChangelogItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoLogEntryChangelogItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoLogEntryChangelogItem;
        
        
        case "CDP4.engineeringmodeldata.ParameterSubscription":                
        cdp4common.commondata.Thing pojoParameterSubscription = new cdp4common.engineeringmodeldata.ParameterSubscription();	    
        
        pojoParameterSubscription.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterSubscription.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscription.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscription.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterSubscription.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterSubscription.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterSubscription;
        
        
        case "CDP4.engineeringmodeldata.Parameter":                
        cdp4common.commondata.Thing pojoParameter = new cdp4common.engineeringmodeldata.Parameter();	    
        
        pojoParameter.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameter.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameter.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameter.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameter.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameter.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameter;
        
        case "CDP4.engineeringmodeldata.ParameterOverride":                
        cdp4common.commondata.Thing pojoParameterOverride = new cdp4common.engineeringmodeldata.ParameterOverride();	    
        
        pojoParameterOverride.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterOverride.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverride.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverride.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterOverride.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterOverride.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterOverride;
        
        
        case "CDP4.engineeringmodeldata.CommonFileStore":                
        cdp4common.commondata.Thing pojoCommonFileStore = new cdp4common.engineeringmodeldata.CommonFileStore();	    
        
        pojoCommonFileStore.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCommonFileStore.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCommonFileStore.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCommonFileStore.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCommonFileStore.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCommonFileStore.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoCommonFileStore;
        
        case "CDP4.engineeringmodeldata.DomainFileStore":                
        cdp4common.commondata.Thing pojoDomainFileStore = new cdp4common.engineeringmodeldata.DomainFileStore();	    
        
        pojoDomainFileStore.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainFileStore.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainFileStore.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainFileStore.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainFileStore.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDomainFileStore.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDomainFileStore;
        
        case "CDP4.engineeringmodeldata.ParameterGroup":                
        cdp4common.commondata.Thing pojoParameterGroup = new cdp4common.engineeringmodeldata.ParameterGroup();	    
        
        pojoParameterGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterGroup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterGroup.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterGroup;
        
        case "CDP4.engineeringmodeldata.Publication":                
        cdp4common.commondata.Thing pojoPublication = new cdp4common.engineeringmodeldata.Publication();	    
        
        pojoPublication.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPublication.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPublication.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPublication.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPublication.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPublication.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPublication;
        
        case "CDP4.engineeringmodeldata.File":                
        cdp4common.commondata.Thing pojoFile = new cdp4common.engineeringmodeldata.File();	    
        
        pojoFile.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFile.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFile.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFile.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFile.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoFile.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoFile;
        
        case "CDP4.engineeringmodeldata.ParametricConstraint":                
        cdp4common.commondata.Thing pojoParametricConstraint = new cdp4common.engineeringmodeldata.ParametricConstraint();	    
        
        pojoParametricConstraint.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParametricConstraint.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParametricConstraint.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParametricConstraint.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParametricConstraint.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParametricConstraint.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParametricConstraint;
        
        case "CDP4.engineeringmodeldata.ExternalIdentifierMap":                
        cdp4common.commondata.Thing pojoExternalIdentifierMap = new cdp4common.engineeringmodeldata.ExternalIdentifierMap();	    
        
        pojoExternalIdentifierMap.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoExternalIdentifierMap.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExternalIdentifierMap.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExternalIdentifierMap.setModifiedOn(emfThing.getModifiedOn());
        
        pojoExternalIdentifierMap.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoExternalIdentifierMap.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoExternalIdentifierMap;
        
        case "CDP4.engineeringmodeldata.NestedElement":                
        cdp4common.commondata.Thing pojoNestedElement = new cdp4common.engineeringmodeldata.NestedElement();	    
        
        pojoNestedElement.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNestedElement.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNestedElement.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNestedElement.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNestedElement.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoNestedElement.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoNestedElement;
        
        case "CDP4.engineeringmodeldata.Folder":                
        cdp4common.commondata.Thing pojoFolder = new cdp4common.engineeringmodeldata.Folder();	    
        
        pojoFolder.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFolder.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFolder.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFolder.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFolder.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoFolder.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoFolder;
        
        case "CDP4.engineeringmodeldata.IdCorrespondence":                
        cdp4common.commondata.Thing pojoIdCorrespondence = new cdp4common.engineeringmodeldata.IdCorrespondence();	    
        
        pojoIdCorrespondence.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIdCorrespondence.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIdCorrespondence.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIdCorrespondence.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIdCorrespondence.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoIdCorrespondence.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoIdCorrespondence;
        
        
        case "CDP4.engineeringmodeldata.MultiRelationship":                
        cdp4common.commondata.Thing pojoMultiRelationship = new cdp4common.engineeringmodeldata.MultiRelationship();	    
        
        pojoMultiRelationship.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMultiRelationship.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationship.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationship.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMultiRelationship.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoMultiRelationship.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoMultiRelationship;
        
        case "CDP4.engineeringmodeldata.BinaryRelationship":                
        cdp4common.commondata.Thing pojoBinaryRelationship = new cdp4common.engineeringmodeldata.BinaryRelationship();	    
        
        pojoBinaryRelationship.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryRelationship.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationship.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationship.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryRelationship.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBinaryRelationship.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBinaryRelationship;
        
        case "CDP4.engineeringmodeldata.SimpleParameterValue":                
        cdp4common.commondata.Thing pojoSimpleParameterValue = new cdp4common.engineeringmodeldata.SimpleParameterValue();	    
        
        pojoSimpleParameterValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleParameterValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleParameterValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleParameterValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleParameterValue.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleParameterValue.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSimpleParameterValue;
        
        case "CDP4.engineeringmodeldata.ParameterSubscriptionValueSet":                
        cdp4common.commondata.Thing pojoParameterSubscriptionValueSet = new cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet();	    
        
        pojoParameterSubscriptionValueSet.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterSubscriptionValueSet.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscriptionValueSet.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscriptionValueSet.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterSubscriptionValueSet.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterSubscriptionValueSet.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterSubscriptionValueSet;
        
        case "CDP4.engineeringmodeldata.ActualFiniteState":                
        cdp4common.commondata.Thing pojoActualFiniteState = new cdp4common.engineeringmodeldata.ActualFiniteState();	    
        
        pojoActualFiniteState.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActualFiniteState.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActualFiniteState.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActualFiniteState.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActualFiniteState.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoActualFiniteState.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoActualFiniteState;
        
        case "CDP4.engineeringmodeldata.ModelLogEntry":                
        cdp4common.commondata.Thing pojoModelLogEntry = new cdp4common.engineeringmodeldata.ModelLogEntry();	    
        
        pojoModelLogEntry.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModelLogEntry.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelLogEntry.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelLogEntry.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModelLogEntry.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoModelLogEntry.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoModelLogEntry;
        
        case "CDP4.engineeringmodeldata.Iteration":                
        cdp4common.commondata.Thing pojoIteration = new cdp4common.engineeringmodeldata.Iteration();	    
        
        pojoIteration.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIteration.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIteration.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIteration.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIteration.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoIteration.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoIteration;
        
        case "CDP4.engineeringmodeldata.ActualFiniteStateList":                
        cdp4common.commondata.Thing pojoActualFiniteStateList = new cdp4common.engineeringmodeldata.ActualFiniteStateList();	    
        
        pojoActualFiniteStateList.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActualFiniteStateList.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActualFiniteStateList.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActualFiniteStateList.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActualFiniteStateList.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoActualFiniteStateList.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoActualFiniteStateList;
        
        
        case "CDP4.engineeringmodeldata.OrExpression":                
        cdp4common.commondata.Thing pojoOrExpression = new cdp4common.engineeringmodeldata.OrExpression();	    
        
        pojoOrExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOrExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoOrExpression;
        
        case "CDP4.engineeringmodeldata.NotExpression":                
        cdp4common.commondata.Thing pojoNotExpression = new cdp4common.engineeringmodeldata.NotExpression();	    
        
        pojoNotExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNotExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNotExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNotExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNotExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoNotExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoNotExpression;
        
        case "CDP4.engineeringmodeldata.AndExpression":                
        cdp4common.commondata.Thing pojoAndExpression = new cdp4common.engineeringmodeldata.AndExpression();	    
        
        pojoAndExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoAndExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAndExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAndExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoAndExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoAndExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoAndExpression;
        
        case "CDP4.engineeringmodeldata.ExclusiveOrExpression":                
        cdp4common.commondata.Thing pojoExclusiveOrExpression = new cdp4common.engineeringmodeldata.ExclusiveOrExpression();	    
        
        pojoExclusiveOrExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoExclusiveOrExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExclusiveOrExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExclusiveOrExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoExclusiveOrExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoExclusiveOrExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoExclusiveOrExpression;
        
        case "CDP4.engineeringmodeldata.RelationalExpression":                
        cdp4common.commondata.Thing pojoRelationalExpression = new cdp4common.engineeringmodeldata.RelationalExpression();	    
        
        pojoRelationalExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRelationalExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationalExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationalExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRelationalExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRelationalExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRelationalExpression;
        
        
        case "CDP4.engineeringmodeldata.ParameterValueSet":                
        cdp4common.commondata.Thing pojoParameterValueSet = new cdp4common.engineeringmodeldata.ParameterValueSet();	    
        
        pojoParameterValueSet.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterValueSet.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterValueSet.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterValueSet.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterValueSet.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterValueSet.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterValueSet;
        
        case "CDP4.engineeringmodeldata.ParameterOverrideValueSet":                
        cdp4common.commondata.Thing pojoParameterOverrideValueSet = new cdp4common.engineeringmodeldata.ParameterOverrideValueSet();	    
        
        pojoParameterOverrideValueSet.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterOverrideValueSet.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverrideValueSet.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverrideValueSet.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterOverrideValueSet.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterOverrideValueSet.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterOverrideValueSet;
        
        case "CDP4.engineeringmodeldata.NestedParameter":                
        cdp4common.commondata.Thing pojoNestedParameter = new cdp4common.engineeringmodeldata.NestedParameter();	    
        
        pojoNestedParameter.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNestedParameter.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNestedParameter.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNestedParameter.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNestedParameter.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoNestedParameter.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoNestedParameter;
        
        case "CDP4.engineeringmodeldata.FileRevision":                
        cdp4common.commondata.Thing pojoFileRevision = new cdp4common.engineeringmodeldata.FileRevision();	    
        
        pojoFileRevision.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFileRevision.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileRevision.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileRevision.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFileRevision.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoFileRevision.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoFileRevision;
        
        
        case "CDP4.engineeringmodeldata.UserRuleVerification":                
        cdp4common.commondata.Thing pojoUserRuleVerification = new cdp4common.engineeringmodeldata.UserRuleVerification();	    
        
        pojoUserRuleVerification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUserRuleVerification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserRuleVerification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserRuleVerification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUserRuleVerification.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoUserRuleVerification.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoUserRuleVerification;
        
        case "CDP4.engineeringmodeldata.BuiltInRuleVerification":                
        cdp4common.commondata.Thing pojoBuiltInRuleVerification = new cdp4common.engineeringmodeldata.BuiltInRuleVerification();	    
        
        pojoBuiltInRuleVerification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBuiltInRuleVerification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBuiltInRuleVerification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBuiltInRuleVerification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBuiltInRuleVerification.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBuiltInRuleVerification.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBuiltInRuleVerification;
        
        case "CDP4.engineeringmodeldata.RuleViolation":                
        cdp4common.commondata.Thing pojoRuleViolation = new cdp4common.engineeringmodeldata.RuleViolation();	    
        
        pojoRuleViolation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRuleViolation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleViolation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleViolation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRuleViolation.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRuleViolation.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRuleViolation;
        
        case "CDP4.engineeringmodeldata.StakeHolderValueMapSettings":                
        cdp4common.commondata.Thing pojoStakeHolderValueMapSettings = new cdp4common.engineeringmodeldata.StakeHolderValueMapSettings();	    
        
        pojoStakeHolderValueMapSettings.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeHolderValueMapSettings.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMapSettings.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMapSettings.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeHolderValueMapSettings.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoStakeHolderValueMapSettings.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoStakeHolderValueMapSettings;
        
        
        case "CDP4.engineeringmodeldata.RequirementsContainerParameterValue":                
        cdp4common.commondata.Thing pojoRequirementsContainerParameterValue = new cdp4common.engineeringmodeldata.RequirementsContainerParameterValue();	    
        
        pojoRequirementsContainerParameterValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsContainerParameterValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsContainerParameterValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsContainerParameterValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsContainerParameterValue.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirementsContainerParameterValue.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequirementsContainerParameterValue;
        
        case "CDP4.engineeringmodeldata.RelationshipParameterValue":                
        cdp4common.commondata.Thing pojoRelationshipParameterValue = new cdp4common.engineeringmodeldata.RelationshipParameterValue();	    
        
        pojoRelationshipParameterValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRelationshipParameterValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationshipParameterValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationshipParameterValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRelationshipParameterValue.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRelationshipParameterValue.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRelationshipParameterValue;
        
        case "CDP4.reportingdata.Book":                
        cdp4common.commondata.Thing pojoBook = new cdp4common.reportingdata.Book();	    
        
        pojoBook.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBook.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBook.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBook.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBook.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBook.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBook;
        
        case "CDP4.reportingdata.Section":                
        cdp4common.commondata.Thing pojoSection = new cdp4common.reportingdata.Section();	    
        
        pojoSection.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSection.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSection.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSection.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSection.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSection.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSection;
        
        case "CDP4.reportingdata.Page":                
        cdp4common.commondata.Thing pojoPage = new cdp4common.reportingdata.Page();	    
        
        pojoPage.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPage.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPage.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPage.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPage.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPage.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPage;
        
        
        case "CDP4.reportingdata.BinaryNote":                
        cdp4common.commondata.Thing pojoBinaryNote = new cdp4common.reportingdata.BinaryNote();	    
        
        pojoBinaryNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryNote.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBinaryNote.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBinaryNote;
        
        case "CDP4.reportingdata.TextualNote":                
        cdp4common.commondata.Thing pojoTextualNote = new cdp4common.reportingdata.TextualNote();	    
        
        pojoTextualNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTextualNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextualNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextualNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTextualNote.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTextualNote.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoTextualNote;
        
        
        case "CDP4.reportingdata.ModellingThingReference":                
        cdp4common.commondata.Thing pojoModellingThingReference = new cdp4common.reportingdata.ModellingThingReference();	    
        
        pojoModellingThingReference.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModellingThingReference.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModellingThingReference.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModellingThingReference.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModellingThingReference.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoModellingThingReference.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoModellingThingReference;
        
        case "CDP4.reportingdata.SiteDirectoryThingReference":                
        cdp4common.commondata.Thing pojoSiteDirectoryThingReference = new cdp4common.reportingdata.SiteDirectoryThingReference();	    
        
        pojoSiteDirectoryThingReference.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryThingReference.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryThingReference.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryThingReference.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryThingReference.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteDirectoryThingReference.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteDirectoryThingReference;
        
        
        case "CDP4.reportingdata.Solution":                
        cdp4common.commondata.Thing pojoSolution = new cdp4common.reportingdata.Solution();	    
        
        pojoSolution.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSolution.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSolution.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSolution.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSolution.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSolution.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSolution;
        
        case "CDP4.reportingdata.SiteDirectoryDataAnnotation":                
        cdp4common.commondata.Thing pojoSiteDirectoryDataAnnotation = new cdp4common.reportingdata.SiteDirectoryDataAnnotation();	    
        
        pojoSiteDirectoryDataAnnotation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryDataAnnotation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataAnnotation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataAnnotation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryDataAnnotation.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteDirectoryDataAnnotation.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteDirectoryDataAnnotation;
        
        
        
        
        case "CDP4.reportingdata.RequestForWaiver":                
        cdp4common.commondata.Thing pojoRequestForWaiver = new cdp4common.reportingdata.RequestForWaiver();	    
        
        pojoRequestForWaiver.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForWaiver.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForWaiver.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequestForWaiver.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequestForWaiver;
        
        case "CDP4.reportingdata.RequestForDeviation":                
        cdp4common.commondata.Thing pojoRequestForDeviation = new cdp4common.reportingdata.RequestForDeviation();	    
        
        pojoRequestForDeviation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForDeviation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForDeviation.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequestForDeviation.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequestForDeviation;
        
        case "CDP4.reportingdata.ChangeRequest":                
        cdp4common.commondata.Thing pojoChangeRequest = new cdp4common.reportingdata.ChangeRequest();	    
        
        pojoChangeRequest.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeRequest.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeRequest.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoChangeRequest.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoChangeRequest;
        
        case "CDP4.reportingdata.ReviewItemDiscrepancy":                
        cdp4common.commondata.Thing pojoReviewItemDiscrepancy = new cdp4common.reportingdata.ReviewItemDiscrepancy();	    
        
        pojoReviewItemDiscrepancy.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReviewItemDiscrepancy.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReviewItemDiscrepancy.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoReviewItemDiscrepancy.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoReviewItemDiscrepancy;
        
        case "CDP4.reportingdata.ActionItem":                
        cdp4common.commondata.Thing pojoActionItem = new cdp4common.reportingdata.ActionItem();	    
        
        pojoActionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoActionItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoActionItem;
        
        case "CDP4.reportingdata.ChangeProposal":                
        cdp4common.commondata.Thing pojoChangeProposal = new cdp4common.reportingdata.ChangeProposal();	    
        
        pojoChangeProposal.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeProposal.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeProposal.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoChangeProposal.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoChangeProposal;
        
        case "CDP4.reportingdata.ContractChangeNotice":                
        cdp4common.commondata.Thing pojoContractChangeNotice = new cdp4common.reportingdata.ContractChangeNotice();	    
        
        pojoContractChangeNotice.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoContractChangeNotice.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.setModifiedOn(emfThing.getModifiedOn());
        
        pojoContractChangeNotice.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoContractChangeNotice.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoContractChangeNotice;
        
        case "CDP4.reportingdata.EngineeringModelDataNote":                
        cdp4common.commondata.Thing pojoEngineeringModelDataNote = new cdp4common.reportingdata.EngineeringModelDataNote();	    
        
        pojoEngineeringModelDataNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelDataNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelDataNote.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEngineeringModelDataNote.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEngineeringModelDataNote;
        
        case "CDP4.reportingdata.Approval":                
        cdp4common.commondata.Thing pojoApproval = new cdp4common.reportingdata.Approval();	    
        
        pojoApproval.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoApproval.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoApproval.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoApproval.setModifiedOn(emfThing.getModifiedOn());
        
        pojoApproval.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoApproval.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoApproval;
        
        
        case "CDP4.reportingdata.EngineeringModelDataDiscussionItem":                
        cdp4common.commondata.Thing pojoEngineeringModelDataDiscussionItem = new cdp4common.reportingdata.EngineeringModelDataDiscussionItem();	    
        
        pojoEngineeringModelDataDiscussionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelDataDiscussionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataDiscussionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataDiscussionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelDataDiscussionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEngineeringModelDataDiscussionItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEngineeringModelDataDiscussionItem;
        
        case "CDP4.reportingdata.SiteDirectoryDataDiscussionItem":                
        cdp4common.commondata.Thing pojoSiteDirectoryDataDiscussionItem = new cdp4common.reportingdata.SiteDirectoryDataDiscussionItem();	    
        
        pojoSiteDirectoryDataDiscussionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryDataDiscussionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataDiscussionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataDiscussionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryDataDiscussionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteDirectoryDataDiscussionItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteDirectoryDataDiscussionItem;
        
        
        case "CDP4.diagramdata.Point":                
        cdp4common.commondata.Thing pojoPoint = new cdp4common.diagramdata.Point();	    
        
        pojoPoint.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPoint.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPoint.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPoint.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPoint.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPoint.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPoint;
        
        case "CDP4.diagramdata.Bounds":                
        cdp4common.commondata.Thing pojoBounds = new cdp4common.diagramdata.Bounds();	    
        
        pojoBounds.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBounds.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBounds.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBounds.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBounds.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBounds.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBounds;
        
        case "CDP4.diagramdata.Color":                
        cdp4common.commondata.Thing pojoColor = new cdp4common.diagramdata.Color();	    
        
        pojoColor.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoColor.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoColor.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoColor.setModifiedOn(emfThing.getModifiedOn());
        
        pojoColor.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoColor.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoColor;
        
        
        case "CDP4.diagramdata.OwnedStyle":                
        cdp4common.commondata.Thing pojoOwnedStyle = new cdp4common.diagramdata.OwnedStyle();	    
        
        pojoOwnedStyle.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOwnedStyle.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOwnedStyle.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOwnedStyle.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOwnedStyle.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOwnedStyle.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoOwnedStyle;
        
        case "CDP4.diagramdata.SharedStyle":                
        cdp4common.commondata.Thing pojoSharedStyle = new cdp4common.diagramdata.SharedStyle();	    
        
        pojoSharedStyle.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSharedStyle.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSharedStyle.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSharedStyle.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSharedStyle.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSharedStyle.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSharedStyle;
        
        
        
        case "CDP4.diagramdata.DiagramEdge":                
        cdp4common.commondata.Thing pojoDiagramEdge = new cdp4common.diagramdata.DiagramEdge();	    
        
        pojoDiagramEdge.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramEdge.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramEdge.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDiagramEdge.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDiagramEdge;
        
        
        case "CDP4.diagramdata.DiagramObject":                
        cdp4common.commondata.Thing pojoDiagramObject = new cdp4common.diagramdata.DiagramObject();	    
        
        pojoDiagramObject.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramObject.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramObject.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDiagramObject.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDiagramObject;
        
        case "CDP4.diagramdata.DiagramCanvas":                
        cdp4common.commondata.Thing pojoDiagramCanvas = new cdp4common.diagramdata.DiagramCanvas();	    
        
        pojoDiagramCanvas.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramCanvas.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramCanvas.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramCanvas.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramCanvas.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDiagramCanvas.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDiagramCanvas;
        	
        }

        return null;
    }
    
}
