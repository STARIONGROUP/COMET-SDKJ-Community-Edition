/* --------------------------------------------------------------------------------------------------------------------
 * Thing.java
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

public abstract class Thing {

    public static CDP4.CommonData.Thing toEmf(cdp4common.commondata.Thing thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.ParticipantPermission":
        CDP4.CommonData.Thing emfParticipantPermission =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipantPermission();    
        
        emfParticipantPermission.setIid(thing.getIid().toString()); 
        
        
        
        emfParticipantPermission.setModifiedOn(thing.getModifiedOn());
        
        emfParticipantPermission.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParticipantPermission;   
        
        
        case "cdp4common.sitedirectorydata.Person":
        CDP4.CommonData.Thing emfPerson =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPerson();    
        
        emfPerson.setIid(thing.getIid().toString()); 
        
        
        
        emfPerson.setModifiedOn(thing.getModifiedOn());
        
        emfPerson.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPerson;   
        
        
        case "cdp4common.sitedirectorydata.Organization":
        CDP4.CommonData.Thing emfOrganization =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrganization();    
        
        emfOrganization.setIid(thing.getIid().toString()); 
        
        
        
        emfOrganization.setModifiedOn(thing.getModifiedOn());
        
        emfOrganization.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfOrganization;   
        
        
        case "cdp4common.sitedirectorydata.Participant":
        CDP4.CommonData.Thing emfParticipant =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipant();    
        
        emfParticipant.setIid(thing.getIid().toString()); 
        
        
        
        emfParticipant.setModifiedOn(thing.getModifiedOn());
        
        emfParticipant.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParticipant;   
        
        
        case "cdp4common.sitedirectorydata.ScaleReferenceQuantityValue":
        CDP4.CommonData.Thing emfScaleReferenceQuantityValue =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createScaleReferenceQuantityValue();    
        
        emfScaleReferenceQuantityValue.setIid(thing.getIid().toString()); 
        
        
        
        emfScaleReferenceQuantityValue.setModifiedOn(thing.getModifiedOn());
        
        emfScaleReferenceQuantityValue.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfScaleReferenceQuantityValue;   
        
        
        case "cdp4common.sitedirectorydata.MappingToReferenceScale":
        CDP4.CommonData.Thing emfMappingToReferenceScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createMappingToReferenceScale();    
        
        emfMappingToReferenceScale.setIid(thing.getIid().toString()); 
        
        
        
        emfMappingToReferenceScale.setModifiedOn(thing.getModifiedOn());
        
        emfMappingToReferenceScale.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfMappingToReferenceScale;   
        
        
        case "cdp4common.sitedirectorydata.QuantityKindFactor":
        CDP4.CommonData.Thing emfQuantityKindFactor =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createQuantityKindFactor();    
        
        emfQuantityKindFactor.setIid(thing.getIid().toString()); 
        
        
        
        emfQuantityKindFactor.setModifiedOn(thing.getModifiedOn());
        
        emfQuantityKindFactor.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfQuantityKindFactor;   
        
        
        case "cdp4common.sitedirectorydata.UnitFactor":
        CDP4.CommonData.Thing emfUnitFactor =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createUnitFactor();    
        
        emfUnitFactor.setIid(thing.getIid().toString()); 
        
        
        
        emfUnitFactor.setModifiedOn(thing.getModifiedOn());
        
        emfUnitFactor.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfUnitFactor;   
        
        
        case "cdp4common.sitedirectorydata.ParameterTypeComponent":
        CDP4.CommonData.Thing emfParameterTypeComponent =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParameterTypeComponent();    
        
        emfParameterTypeComponent.setIid(thing.getIid().toString()); 
        
        
        
        emfParameterTypeComponent.setModifiedOn(thing.getModifiedOn());
        
        emfParameterTypeComponent.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameterTypeComponent;   
        
        
        case "cdp4common.sitedirectorydata.PersonPermission":
        CDP4.CommonData.Thing emfPersonPermission =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPersonPermission();    
        
        emfPersonPermission.setIid(thing.getIid().toString()); 
        
        
        
        emfPersonPermission.setModifiedOn(thing.getModifiedOn());
        
        emfPersonPermission.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPersonPermission;   
        
        
        case "cdp4common.sitedirectorydata.SiteLogEntry":
        CDP4.CommonData.Thing emfSiteLogEntry =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteLogEntry();    
        
        emfSiteLogEntry.setIid(thing.getIid().toString()); 
        
        
        
        emfSiteLogEntry.setModifiedOn(thing.getModifiedOn());
        
        emfSiteLogEntry.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSiteLogEntry;   
        
        
        case "cdp4common.sitedirectorydata.IterationSetup":
        CDP4.CommonData.Thing emfIterationSetup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createIterationSetup();    
        
        emfIterationSetup.setIid(thing.getIid().toString()); 
        
        
        
        emfIterationSetup.setModifiedOn(thing.getModifiedOn());
        
        emfIterationSetup.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfIterationSetup;   
        
        
        case "cdp4common.sitedirectorydata.TelephoneNumber":
        CDP4.CommonData.Thing emfTelephoneNumber =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTelephoneNumber();    
        
        emfTelephoneNumber.setIid(thing.getIid().toString()); 
        
        
        
        emfTelephoneNumber.setModifiedOn(thing.getModifiedOn());
        
        emfTelephoneNumber.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfTelephoneNumber;   
        
        
        case "cdp4common.sitedirectorydata.EmailAddress":
        CDP4.CommonData.Thing emfEmailAddress =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEmailAddress();    
        
        emfEmailAddress.setIid(thing.getIid().toString()); 
        
        
        
        emfEmailAddress.setModifiedOn(thing.getModifiedOn());
        
        emfEmailAddress.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEmailAddress;   
        
        
        case "cdp4common.sitedirectorydata.UserPreference":
        CDP4.CommonData.Thing emfUserPreference =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createUserPreference();    
        
        emfUserPreference.setIid(thing.getIid().toString()); 
        
        
        
        emfUserPreference.setModifiedOn(thing.getModifiedOn());
        
        emfUserPreference.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfUserPreference;   
        
        
        case "cdp4common.sitedirectorydata.NaturalLanguage":
        CDP4.CommonData.Thing emfNaturalLanguage =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createNaturalLanguage();    
        
        emfNaturalLanguage.setIid(thing.getIid().toString()); 
        
        
        
        emfNaturalLanguage.setModifiedOn(thing.getModifiedOn());
        
        emfNaturalLanguage.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfNaturalLanguage;   
        
        
        
        case "cdp4common.sitedirectorydata.ParticipantRole":
        CDP4.CommonData.Thing emfParticipantRole =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipantRole();    
        
        emfParticipantRole.setIid(thing.getIid().toString()); 
        
        
        
        emfParticipantRole.setModifiedOn(thing.getModifiedOn());
        
        emfParticipantRole.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParticipantRole;   
        
        
        case "cdp4common.sitedirectorydata.EngineeringModelSetup":
        CDP4.CommonData.Thing emfEngineeringModelSetup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEngineeringModelSetup();    
        
        emfEngineeringModelSetup.setIid(thing.getIid().toString()); 
        
        
        
        emfEngineeringModelSetup.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelSetup.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEngineeringModelSetup;   
        
        
        case "cdp4common.sitedirectorydata.Glossary":
        CDP4.CommonData.Thing emfGlossary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createGlossary();    
        
        emfGlossary.setIid(thing.getIid().toString()); 
        
        
        
        emfGlossary.setModifiedOn(thing.getModifiedOn());
        
        emfGlossary.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfGlossary;   
        
        
        
        case "cdp4common.sitedirectorydata.SiteReferenceDataLibrary":
        CDP4.CommonData.Thing emfSiteReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteReferenceDataLibrary();    
        
        emfSiteReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        
        
        emfSiteReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfSiteReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSiteReferenceDataLibrary;   
        
        
        case "cdp4common.sitedirectorydata.ModelReferenceDataLibrary":
        CDP4.CommonData.Thing emfModelReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createModelReferenceDataLibrary();    
        
        emfModelReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        
        
        emfModelReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfModelReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfModelReferenceDataLibrary;   
        
        
        case "cdp4common.sitedirectorydata.Term":
        CDP4.CommonData.Thing emfTerm =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTerm();    
        
        emfTerm.setIid(thing.getIid().toString()); 
        
        
        
        emfTerm.setModifiedOn(thing.getModifiedOn());
        
        emfTerm.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfTerm;   
        
        
        case "cdp4common.sitedirectorydata.FileType":
        CDP4.CommonData.Thing emfFileType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createFileType();    
        
        emfFileType.setIid(thing.getIid().toString()); 
        
        
        
        emfFileType.setModifiedOn(thing.getModifiedOn());
        
        emfFileType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfFileType;   
        
        
        
        case "cdp4common.sitedirectorydata.OrdinalScale":
        CDP4.CommonData.Thing emfOrdinalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrdinalScale();    
        
        emfOrdinalScale.setIid(thing.getIid().toString()); 
        
        
        
        emfOrdinalScale.setModifiedOn(thing.getModifiedOn());
        
        emfOrdinalScale.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfOrdinalScale;   
        
        
        case "cdp4common.sitedirectorydata.RatioScale":
        CDP4.CommonData.Thing emfRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createRatioScale();    
        
        emfRatioScale.setIid(thing.getIid().toString()); 
        
        
        
        emfRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfRatioScale.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRatioScale;   
        
        
        case "cdp4common.sitedirectorydata.CyclicRatioScale":
        CDP4.CommonData.Thing emfCyclicRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCyclicRatioScale();    
        
        emfCyclicRatioScale.setIid(thing.getIid().toString()); 
        
        
        
        emfCyclicRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfCyclicRatioScale.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfCyclicRatioScale;   
        
        
        case "cdp4common.sitedirectorydata.IntervalScale":
        CDP4.CommonData.Thing emfIntervalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createIntervalScale();    
        
        emfIntervalScale.setIid(thing.getIid().toString()); 
        
        
        
        emfIntervalScale.setModifiedOn(thing.getModifiedOn());
        
        emfIntervalScale.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfIntervalScale;   
        
        
        case "cdp4common.sitedirectorydata.LogarithmicScale":
        CDP4.CommonData.Thing emfLogarithmicScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLogarithmicScale();    
        
        emfLogarithmicScale.setIid(thing.getIid().toString()); 
        
        
        
        emfLogarithmicScale.setModifiedOn(thing.getModifiedOn());
        
        emfLogarithmicScale.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfLogarithmicScale;   
        
        
        case "cdp4common.sitedirectorydata.DomainOfExpertise":
        CDP4.CommonData.Thing emfDomainOfExpertise =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDomainOfExpertise();    
        
        emfDomainOfExpertise.setIid(thing.getIid().toString()); 
        
        
        
        emfDomainOfExpertise.setModifiedOn(thing.getModifiedOn());
        
        emfDomainOfExpertise.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDomainOfExpertise;   
        
        
        
        case "cdp4common.sitedirectorydata.CompoundParameterType":
        CDP4.CommonData.Thing emfCompoundParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCompoundParameterType();    
        
        emfCompoundParameterType.setIid(thing.getIid().toString()); 
        
        
        
        emfCompoundParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfCompoundParameterType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfCompoundParameterType;   
        
        
        case "cdp4common.sitedirectorydata.ArrayParameterType":
        CDP4.CommonData.Thing emfArrayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createArrayParameterType();    
        
        emfArrayParameterType.setIid(thing.getIid().toString()); 
        
        
        
        emfArrayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfArrayParameterType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfArrayParameterType;   
        
        
        
        case "cdp4common.sitedirectorydata.EnumerationParameterType":
        CDP4.CommonData.Thing emfEnumerationParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationParameterType();    
        
        emfEnumerationParameterType.setIid(thing.getIid().toString()); 
        
        
        
        emfEnumerationParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationParameterType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEnumerationParameterType;   
        
        
        case "cdp4common.sitedirectorydata.BooleanParameterType":
        CDP4.CommonData.Thing emfBooleanParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBooleanParameterType();    
        
        emfBooleanParameterType.setIid(thing.getIid().toString()); 
        
        
        
        emfBooleanParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfBooleanParameterType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfBooleanParameterType;   
        
        
        case "cdp4common.sitedirectorydata.DateParameterType":
        CDP4.CommonData.Thing emfDateParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateParameterType();    
        
        emfDateParameterType.setIid(thing.getIid().toString()); 
        
        
        
        emfDateParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateParameterType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDateParameterType;   
        
        
        case "cdp4common.sitedirectorydata.TextParameterType":
        CDP4.CommonData.Thing emfTextParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTextParameterType();    
        
        emfTextParameterType.setIid(thing.getIid().toString()); 
        
        
        
        emfTextParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTextParameterType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfTextParameterType;   
        
        
        case "cdp4common.sitedirectorydata.DateTimeParameterType":
        CDP4.CommonData.Thing emfDateTimeParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateTimeParameterType();    
        
        emfDateTimeParameterType.setIid(thing.getIid().toString()); 
        
        
        
        emfDateTimeParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateTimeParameterType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDateTimeParameterType;   
        
        
        case "cdp4common.sitedirectorydata.TimeOfDayParameterType":
        CDP4.CommonData.Thing emfTimeOfDayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTimeOfDayParameterType();    
        
        emfTimeOfDayParameterType.setIid(thing.getIid().toString()); 
        
        
        
        emfTimeOfDayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTimeOfDayParameterType.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfTimeOfDayParameterType;   
        
        
        
        case "cdp4common.sitedirectorydata.SpecializedQuantityKind":
        CDP4.CommonData.Thing emfSpecializedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSpecializedQuantityKind();    
        
        emfSpecializedQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        emfSpecializedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSpecializedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSpecializedQuantityKind;   
        
        
        case "cdp4common.sitedirectorydata.SimpleQuantityKind":
        CDP4.CommonData.Thing emfSimpleQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleQuantityKind();    
        
        emfSimpleQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        emfSimpleQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSimpleQuantityKind;   
        
        
        case "cdp4common.sitedirectorydata.DerivedQuantityKind":
        CDP4.CommonData.Thing emfDerivedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedQuantityKind();    
        
        emfDerivedQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        emfDerivedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDerivedQuantityKind;   
        
        
        case "cdp4common.sitedirectorydata.ScaleValueDefinition":
        CDP4.CommonData.Thing emfScaleValueDefinition =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createScaleValueDefinition();    
        
        emfScaleValueDefinition.setIid(thing.getIid().toString()); 
        
        
        
        emfScaleValueDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfScaleValueDefinition.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfScaleValueDefinition;   
        
        
        
        case "cdp4common.sitedirectorydata.DerivedUnit":
        CDP4.CommonData.Thing emfDerivedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedUnit();    
        
        emfDerivedUnit.setIid(thing.getIid().toString()); 
        
        
        
        emfDerivedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedUnit.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDerivedUnit;   
        
        
        
        case "cdp4common.sitedirectorydata.LinearConversionUnit":
        CDP4.CommonData.Thing emfLinearConversionUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLinearConversionUnit();    
        
        emfLinearConversionUnit.setIid(thing.getIid().toString()); 
        
        
        
        emfLinearConversionUnit.setModifiedOn(thing.getModifiedOn());
        
        emfLinearConversionUnit.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfLinearConversionUnit;   
        
        
        case "cdp4common.sitedirectorydata.PrefixedUnit":
        CDP4.CommonData.Thing emfPrefixedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPrefixedUnit();    
        
        emfPrefixedUnit.setIid(thing.getIid().toString()); 
        
        
        
        emfPrefixedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfPrefixedUnit.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPrefixedUnit;   
        
        
        case "cdp4common.sitedirectorydata.SimpleUnit":
        CDP4.CommonData.Thing emfSimpleUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleUnit();    
        
        emfSimpleUnit.setIid(thing.getIid().toString()); 
        
        
        
        emfSimpleUnit.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleUnit.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSimpleUnit;   
        
        
        case "cdp4common.sitedirectorydata.Category":
        CDP4.CommonData.Thing emfCategory =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCategory();    
        
        emfCategory.setIid(thing.getIid().toString()); 
        
        
        
        emfCategory.setModifiedOn(thing.getModifiedOn());
        
        emfCategory.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfCategory;   
        
        
        case "cdp4common.sitedirectorydata.UnitPrefix":
        CDP4.CommonData.Thing emfUnitPrefix =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createUnitPrefix();    
        
        emfUnitPrefix.setIid(thing.getIid().toString()); 
        
        
        
        emfUnitPrefix.setModifiedOn(thing.getModifiedOn());
        
        emfUnitPrefix.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfUnitPrefix;   
        
        
        
        case "cdp4common.sitedirectorydata.ReferencerRule":
        CDP4.CommonData.Thing emfReferencerRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferencerRule();    
        
        emfReferencerRule.setIid(thing.getIid().toString()); 
        
        
        
        emfReferencerRule.setModifiedOn(thing.getModifiedOn());
        
        emfReferencerRule.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfReferencerRule;   
        
        
        case "cdp4common.sitedirectorydata.BinaryRelationshipRule":
        CDP4.CommonData.Thing emfBinaryRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBinaryRelationshipRule();    
        
        emfBinaryRelationshipRule.setIid(thing.getIid().toString()); 
        
        
        
        emfBinaryRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfBinaryRelationshipRule;   
        
        
        case "cdp4common.sitedirectorydata.MultiRelationshipRule":
        CDP4.CommonData.Thing emfMultiRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createMultiRelationshipRule();    
        
        emfMultiRelationshipRule.setIid(thing.getIid().toString()); 
        
        
        
        emfMultiRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfMultiRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfMultiRelationshipRule;   
        
        
        case "cdp4common.sitedirectorydata.DecompositionRule":
        CDP4.CommonData.Thing emfDecompositionRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDecompositionRule();    
        
        emfDecompositionRule.setIid(thing.getIid().toString()); 
        
        
        
        emfDecompositionRule.setModifiedOn(thing.getModifiedOn());
        
        emfDecompositionRule.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDecompositionRule;   
        
        
        case "cdp4common.sitedirectorydata.ParameterizedCategoryRule":
        CDP4.CommonData.Thing emfParameterizedCategoryRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParameterizedCategoryRule();    
        
        emfParameterizedCategoryRule.setIid(thing.getIid().toString()); 
        
        
        
        emfParameterizedCategoryRule.setModifiedOn(thing.getModifiedOn());
        
        emfParameterizedCategoryRule.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameterizedCategoryRule;   
        
        
        case "cdp4common.sitedirectorydata.EnumerationValueDefinition":
        CDP4.CommonData.Thing emfEnumerationValueDefinition =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationValueDefinition();    
        
        emfEnumerationValueDefinition.setIid(thing.getIid().toString()); 
        
        
        
        emfEnumerationValueDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationValueDefinition.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEnumerationValueDefinition;   
        
        
        case "cdp4common.sitedirectorydata.PersonRole":
        CDP4.CommonData.Thing emfPersonRole =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPersonRole();    
        
        emfPersonRole.setIid(thing.getIid().toString()); 
        
        
        
        emfPersonRole.setModifiedOn(thing.getModifiedOn());
        
        emfPersonRole.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPersonRole;   
        
        
        case "cdp4common.sitedirectorydata.DomainOfExpertiseGroup":
        CDP4.CommonData.Thing emfDomainOfExpertiseGroup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDomainOfExpertiseGroup();    
        
        emfDomainOfExpertiseGroup.setIid(thing.getIid().toString()); 
        
        
        
        emfDomainOfExpertiseGroup.setModifiedOn(thing.getModifiedOn());
        
        emfDomainOfExpertiseGroup.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDomainOfExpertiseGroup;   
        
        
        case "cdp4common.sitedirectorydata.ReferenceSource":
        CDP4.CommonData.Thing emfReferenceSource =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferenceSource();    
        
        emfReferenceSource.setIid(thing.getIid().toString()); 
        
        
        
        emfReferenceSource.setModifiedOn(thing.getModifiedOn());
        
        emfReferenceSource.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfReferenceSource;   
        
        
        case "cdp4common.sitedirectorydata.Constant":
        CDP4.CommonData.Thing emfConstant =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createConstant();    
        
        emfConstant.setIid(thing.getIid().toString()); 
        
        
        
        emfConstant.setModifiedOn(thing.getModifiedOn());
        
        emfConstant.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfConstant;   
        
        
        case "cdp4common.engineeringmodeldata.PossibleFiniteState":
        CDP4.CommonData.Thing emfPossibleFiniteState =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPossibleFiniteState();    
        
        emfPossibleFiniteState.setIid(thing.getIid().toString()); 
        
        
        
        emfPossibleFiniteState.setModifiedOn(thing.getModifiedOn());
        
        emfPossibleFiniteState.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPossibleFiniteState;   
        
        
        case "cdp4common.engineeringmodeldata.Option":
        CDP4.CommonData.Thing emfOption =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createOption();    
        
        emfOption.setIid(thing.getIid().toString()); 
        
        
        
        emfOption.setModifiedOn(thing.getModifiedOn());
        
        emfOption.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfOption;   
        
        
        case "cdp4common.engineeringmodeldata.PossibleFiniteStateList":
        CDP4.CommonData.Thing emfPossibleFiniteStateList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPossibleFiniteStateList();    
        
        emfPossibleFiniteStateList.setIid(thing.getIid().toString()); 
        
        
        
        emfPossibleFiniteStateList.setModifiedOn(thing.getModifiedOn());
        
        emfPossibleFiniteStateList.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPossibleFiniteStateList;   
        
        
        
        case "cdp4common.engineeringmodeldata.ElementDefinition":
        CDP4.CommonData.Thing emfElementDefinition =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementDefinition();    
        
        emfElementDefinition.setIid(thing.getIid().toString()); 
        
        
        
        emfElementDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfElementDefinition.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfElementDefinition;   
        
        
        case "cdp4common.engineeringmodeldata.ElementUsage":
        CDP4.CommonData.Thing emfElementUsage =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementUsage();    
        
        emfElementUsage.setIid(thing.getIid().toString()); 
        
        
        
        emfElementUsage.setModifiedOn(thing.getModifiedOn());
        
        emfElementUsage.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfElementUsage;   
        
        
        
        case "cdp4common.engineeringmodeldata.RequirementsSpecification":
        CDP4.CommonData.Thing emfRequirementsSpecification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsSpecification();    
        
        emfRequirementsSpecification.setIid(thing.getIid().toString()); 
        
        
        
        emfRequirementsSpecification.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsSpecification.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRequirementsSpecification;   
        
        
        case "cdp4common.engineeringmodeldata.RequirementsGroup":
        CDP4.CommonData.Thing emfRequirementsGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsGroup();    
        
        emfRequirementsGroup.setIid(thing.getIid().toString()); 
        
        
        
        emfRequirementsGroup.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsGroup.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRequirementsGroup;   
        
        
        
        case "cdp4common.engineeringmodeldata.Requirement":
        CDP4.CommonData.Thing emfRequirement =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirement();    
        
        emfRequirement.setIid(thing.getIid().toString()); 
        
        
        
        emfRequirement.setModifiedOn(thing.getModifiedOn());
        
        emfRequirement.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRequirement;   
        
        
        case "cdp4common.engineeringmodeldata.RuleVerificationList":
        CDP4.CommonData.Thing emfRuleVerificationList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRuleVerificationList();    
        
        emfRuleVerificationList.setIid(thing.getIid().toString()); 
        
        
        
        emfRuleVerificationList.setModifiedOn(thing.getModifiedOn());
        
        emfRuleVerificationList.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRuleVerificationList;   
        
        
        case "cdp4common.engineeringmodeldata.Goal":
        CDP4.CommonData.Thing emfGoal =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createGoal();    
        
        emfGoal.setIid(thing.getIid().toString()); 
        
        
        
        emfGoal.setModifiedOn(thing.getModifiedOn());
        
        emfGoal.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfGoal;   
        
        
        case "cdp4common.engineeringmodeldata.Stakeholder":
        CDP4.CommonData.Thing emfStakeholder =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeholder();    
        
        emfStakeholder.setIid(thing.getIid().toString()); 
        
        
        
        emfStakeholder.setModifiedOn(thing.getModifiedOn());
        
        emfStakeholder.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfStakeholder;   
        
        
        case "cdp4common.engineeringmodeldata.ValueGroup":
        CDP4.CommonData.Thing emfValueGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createValueGroup();    
        
        emfValueGroup.setIid(thing.getIid().toString()); 
        
        
        
        emfValueGroup.setModifiedOn(thing.getModifiedOn());
        
        emfValueGroup.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfValueGroup;   
        
        
        case "cdp4common.engineeringmodeldata.StakeholderValue":
        CDP4.CommonData.Thing emfStakeholderValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeholderValue();    
        
        emfStakeholderValue.setIid(thing.getIid().toString()); 
        
        
        
        emfStakeholderValue.setModifiedOn(thing.getModifiedOn());
        
        emfStakeholderValue.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfStakeholderValue;   
        
        
        case "cdp4common.engineeringmodeldata.StakeHolderValueMap":
        CDP4.CommonData.Thing emfStakeHolderValueMap =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeHolderValueMap();    
        
        emfStakeHolderValueMap.setIid(thing.getIid().toString()); 
        
        
        
        emfStakeHolderValueMap.setModifiedOn(thing.getModifiedOn());
        
        emfStakeHolderValueMap.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfStakeHolderValueMap;   
        
        
        case "cdp4common.commondata.HyperLink":
        CDP4.CommonData.Thing emfHyperLink =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createHyperLink();    
        
        emfHyperLink.setIid(thing.getIid().toString()); 
        
        
        
        emfHyperLink.setModifiedOn(thing.getModifiedOn());
        
        emfHyperLink.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfHyperLink;   
        
        
        case "cdp4common.commondata.Definition":
        CDP4.CommonData.Thing emfDefinition =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createDefinition();    
        
        emfDefinition.setIid(thing.getIid().toString()); 
        
        
        
        emfDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfDefinition.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDefinition;   
        
        
        case "cdp4common.commondata.Alias":
        CDP4.CommonData.Thing emfAlias =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createAlias();    
        
        emfAlias.setIid(thing.getIid().toString()); 
        
        
        
        emfAlias.setModifiedOn(thing.getModifiedOn());
        
        emfAlias.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfAlias;   
        
        
        case "cdp4common.commondata.Citation":
        CDP4.CommonData.Thing emfCitation =  CDP4.CommonData.impl.CommonDataFactoryImpl.eINSTANCE.createCitation();    
        
        emfCitation.setIid(thing.getIid().toString()); 
        
        
        
        emfCitation.setModifiedOn(thing.getModifiedOn());
        
        emfCitation.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfCitation;   
        
        
        
        case "cdp4common.sitedirectorydata.SiteDirectory":
        CDP4.CommonData.Thing emfSiteDirectory =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteDirectory();    
        
        emfSiteDirectory.setIid(thing.getIid().toString()); 
        
        
        
        emfSiteDirectory.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectory.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSiteDirectory;   
        
        
        case "cdp4common.engineeringmodeldata.EngineeringModel":
        CDP4.CommonData.Thing emfEngineeringModel =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createEngineeringModel();    
        
        emfEngineeringModel.setIid(thing.getIid().toString()); 
        
        
        
        emfEngineeringModel.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModel.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEngineeringModel;   
        
        
        
        case "cdp4common.engineeringmodeldata.ParameterSubscription":
        CDP4.CommonData.Thing emfParameterSubscription =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterSubscription();    
        
        emfParameterSubscription.setIid(thing.getIid().toString()); 
        
        
        
        emfParameterSubscription.setModifiedOn(thing.getModifiedOn());
        
        emfParameterSubscription.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameterSubscription;   
        
        
        
        case "cdp4common.engineeringmodeldata.Parameter":
        CDP4.CommonData.Thing emfParameter =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameter();    
        
        emfParameter.setIid(thing.getIid().toString()); 
        
        
        
        emfParameter.setModifiedOn(thing.getModifiedOn());
        
        emfParameter.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameter;   
        
        
        case "cdp4common.engineeringmodeldata.ParameterOverride":
        CDP4.CommonData.Thing emfParameterOverride =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterOverride();    
        
        emfParameterOverride.setIid(thing.getIid().toString()); 
        
        
        
        emfParameterOverride.setModifiedOn(thing.getModifiedOn());
        
        emfParameterOverride.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameterOverride;   
        
        
        
        case "cdp4common.engineeringmodeldata.CommonFileStore":
        CDP4.CommonData.Thing emfCommonFileStore =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createCommonFileStore();    
        
        emfCommonFileStore.setIid(thing.getIid().toString()); 
        
        
        
        emfCommonFileStore.setModifiedOn(thing.getModifiedOn());
        
        emfCommonFileStore.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfCommonFileStore;   
        
        
        case "cdp4common.engineeringmodeldata.DomainFileStore":
        CDP4.CommonData.Thing emfDomainFileStore =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createDomainFileStore();    
        
        emfDomainFileStore.setIid(thing.getIid().toString()); 
        
        
        
        emfDomainFileStore.setModifiedOn(thing.getModifiedOn());
        
        emfDomainFileStore.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDomainFileStore;   
        
        
        case "cdp4common.engineeringmodeldata.ParameterGroup":
        CDP4.CommonData.Thing emfParameterGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterGroup();    
        
        emfParameterGroup.setIid(thing.getIid().toString()); 
        
        
        
        emfParameterGroup.setModifiedOn(thing.getModifiedOn());
        
        emfParameterGroup.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameterGroup;   
        
        
        case "cdp4common.engineeringmodeldata.Publication":
        CDP4.CommonData.Thing emfPublication =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPublication();    
        
        emfPublication.setIid(thing.getIid().toString()); 
        
        
        
        emfPublication.setModifiedOn(thing.getModifiedOn());
        
        emfPublication.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPublication;   
        
        
        case "cdp4common.engineeringmodeldata.File":
        CDP4.CommonData.Thing emfFile =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createFile();    
        
        emfFile.setIid(thing.getIid().toString()); 
        
        
        
        emfFile.setModifiedOn(thing.getModifiedOn());
        
        emfFile.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfFile;   
        
        
        case "cdp4common.engineeringmodeldata.ParametricConstraint":
        CDP4.CommonData.Thing emfParametricConstraint =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParametricConstraint();    
        
        emfParametricConstraint.setIid(thing.getIid().toString()); 
        
        
        
        emfParametricConstraint.setModifiedOn(thing.getModifiedOn());
        
        emfParametricConstraint.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParametricConstraint;   
        
        
        case "cdp4common.engineeringmodeldata.ExternalIdentifierMap":
        CDP4.CommonData.Thing emfExternalIdentifierMap =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createExternalIdentifierMap();    
        
        emfExternalIdentifierMap.setIid(thing.getIid().toString()); 
        
        
        
        emfExternalIdentifierMap.setModifiedOn(thing.getModifiedOn());
        
        emfExternalIdentifierMap.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfExternalIdentifierMap;   
        
        
        case "cdp4common.engineeringmodeldata.NestedElement":
        CDP4.CommonData.Thing emfNestedElement =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createNestedElement();    
        
        emfNestedElement.setIid(thing.getIid().toString()); 
        
        
        
        emfNestedElement.setModifiedOn(thing.getModifiedOn());
        
        emfNestedElement.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfNestedElement;   
        
        
        case "cdp4common.engineeringmodeldata.Folder":
        CDP4.CommonData.Thing emfFolder =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createFolder();    
        
        emfFolder.setIid(thing.getIid().toString()); 
        
        
        
        emfFolder.setModifiedOn(thing.getModifiedOn());
        
        emfFolder.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfFolder;   
        
        
        case "cdp4common.engineeringmodeldata.IdCorrespondence":
        CDP4.CommonData.Thing emfIdCorrespondence =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createIdCorrespondence();    
        
        emfIdCorrespondence.setIid(thing.getIid().toString()); 
        
        
        
        emfIdCorrespondence.setModifiedOn(thing.getModifiedOn());
        
        emfIdCorrespondence.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfIdCorrespondence;   
        
        
        
        case "cdp4common.engineeringmodeldata.MultiRelationship":
        CDP4.CommonData.Thing emfMultiRelationship =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createMultiRelationship();    
        
        emfMultiRelationship.setIid(thing.getIid().toString()); 
        
        
        
        emfMultiRelationship.setModifiedOn(thing.getModifiedOn());
        
        emfMultiRelationship.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfMultiRelationship;   
        
        
        case "cdp4common.engineeringmodeldata.BinaryRelationship":
        CDP4.CommonData.Thing emfBinaryRelationship =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createBinaryRelationship();    
        
        emfBinaryRelationship.setIid(thing.getIid().toString()); 
        
        
        
        emfBinaryRelationship.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryRelationship.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfBinaryRelationship;   
        
        
        case "cdp4common.engineeringmodeldata.SimpleParameterValue":
        CDP4.CommonData.Thing emfSimpleParameterValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createSimpleParameterValue();    
        
        emfSimpleParameterValue.setIid(thing.getIid().toString()); 
        
        
        
        emfSimpleParameterValue.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleParameterValue.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSimpleParameterValue;   
        
        
        case "cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet":
        CDP4.CommonData.Thing emfParameterSubscriptionValueSet =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterSubscriptionValueSet();    
        
        emfParameterSubscriptionValueSet.setIid(thing.getIid().toString()); 
        
        
        
        emfParameterSubscriptionValueSet.setModifiedOn(thing.getModifiedOn());
        
        emfParameterSubscriptionValueSet.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameterSubscriptionValueSet;   
        
        
        case "cdp4common.engineeringmodeldata.ActualFiniteState":
        CDP4.CommonData.Thing emfActualFiniteState =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createActualFiniteState();    
        
        emfActualFiniteState.setIid(thing.getIid().toString()); 
        
        
        
        emfActualFiniteState.setModifiedOn(thing.getModifiedOn());
        
        emfActualFiniteState.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfActualFiniteState;   
        
        
        case "cdp4common.engineeringmodeldata.ModelLogEntry":
        CDP4.CommonData.Thing emfModelLogEntry =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createModelLogEntry();    
        
        emfModelLogEntry.setIid(thing.getIid().toString()); 
        
        
        
        emfModelLogEntry.setModifiedOn(thing.getModifiedOn());
        
        emfModelLogEntry.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfModelLogEntry;   
        
        
        case "cdp4common.engineeringmodeldata.Iteration":
        CDP4.CommonData.Thing emfIteration =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createIteration();    
        
        emfIteration.setIid(thing.getIid().toString()); 
        
        
        
        emfIteration.setModifiedOn(thing.getModifiedOn());
        
        emfIteration.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfIteration;   
        
        
        case "cdp4common.engineeringmodeldata.ActualFiniteStateList":
        CDP4.CommonData.Thing emfActualFiniteStateList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createActualFiniteStateList();    
        
        emfActualFiniteStateList.setIid(thing.getIid().toString()); 
        
        
        
        emfActualFiniteStateList.setModifiedOn(thing.getModifiedOn());
        
        emfActualFiniteStateList.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfActualFiniteStateList;   
        
        
        
        case "cdp4common.engineeringmodeldata.OrExpression":
        CDP4.CommonData.Thing emfOrExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createOrExpression();    
        
        emfOrExpression.setIid(thing.getIid().toString()); 
        
        
        
        emfOrExpression.setModifiedOn(thing.getModifiedOn());
        
        emfOrExpression.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfOrExpression;   
        
        
        case "cdp4common.engineeringmodeldata.NotExpression":
        CDP4.CommonData.Thing emfNotExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createNotExpression();    
        
        emfNotExpression.setIid(thing.getIid().toString()); 
        
        
        
        emfNotExpression.setModifiedOn(thing.getModifiedOn());
        
        emfNotExpression.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfNotExpression;   
        
        
        case "cdp4common.engineeringmodeldata.AndExpression":
        CDP4.CommonData.Thing emfAndExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createAndExpression();    
        
        emfAndExpression.setIid(thing.getIid().toString()); 
        
        
        
        emfAndExpression.setModifiedOn(thing.getModifiedOn());
        
        emfAndExpression.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfAndExpression;   
        
        
        case "cdp4common.engineeringmodeldata.ExclusiveOrExpression":
        CDP4.CommonData.Thing emfExclusiveOrExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createExclusiveOrExpression();    
        
        emfExclusiveOrExpression.setIid(thing.getIid().toString()); 
        
        
        
        emfExclusiveOrExpression.setModifiedOn(thing.getModifiedOn());
        
        emfExclusiveOrExpression.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfExclusiveOrExpression;   
        
        
        case "cdp4common.engineeringmodeldata.RelationalExpression":
        CDP4.CommonData.Thing emfRelationalExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRelationalExpression();    
        
        emfRelationalExpression.setIid(thing.getIid().toString()); 
        
        
        
        emfRelationalExpression.setModifiedOn(thing.getModifiedOn());
        
        emfRelationalExpression.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRelationalExpression;   
        
        
        
        case "cdp4common.engineeringmodeldata.ParameterValueSet":
        CDP4.CommonData.Thing emfParameterValueSet =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterValueSet();    
        
        emfParameterValueSet.setIid(thing.getIid().toString()); 
        
        
        
        emfParameterValueSet.setModifiedOn(thing.getModifiedOn());
        
        emfParameterValueSet.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameterValueSet;   
        
        
        case "cdp4common.engineeringmodeldata.ParameterOverrideValueSet":
        CDP4.CommonData.Thing emfParameterOverrideValueSet =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterOverrideValueSet();    
        
        emfParameterOverrideValueSet.setIid(thing.getIid().toString()); 
        
        
        
        emfParameterOverrideValueSet.setModifiedOn(thing.getModifiedOn());
        
        emfParameterOverrideValueSet.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfParameterOverrideValueSet;   
        
        
        case "cdp4common.engineeringmodeldata.NestedParameter":
        CDP4.CommonData.Thing emfNestedParameter =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createNestedParameter();    
        
        emfNestedParameter.setIid(thing.getIid().toString()); 
        
        
        
        emfNestedParameter.setModifiedOn(thing.getModifiedOn());
        
        emfNestedParameter.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfNestedParameter;   
        
        
        case "cdp4common.engineeringmodeldata.FileRevision":
        CDP4.CommonData.Thing emfFileRevision =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createFileRevision();    
        
        emfFileRevision.setIid(thing.getIid().toString()); 
        
        
        
        emfFileRevision.setModifiedOn(thing.getModifiedOn());
        
        emfFileRevision.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfFileRevision;   
        
        
        
        case "cdp4common.engineeringmodeldata.UserRuleVerification":
        CDP4.CommonData.Thing emfUserRuleVerification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createUserRuleVerification();    
        
        emfUserRuleVerification.setIid(thing.getIid().toString()); 
        
        
        
        emfUserRuleVerification.setModifiedOn(thing.getModifiedOn());
        
        emfUserRuleVerification.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfUserRuleVerification;   
        
        
        case "cdp4common.engineeringmodeldata.BuiltInRuleVerification":
        CDP4.CommonData.Thing emfBuiltInRuleVerification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createBuiltInRuleVerification();    
        
        emfBuiltInRuleVerification.setIid(thing.getIid().toString()); 
        
        
        
        emfBuiltInRuleVerification.setModifiedOn(thing.getModifiedOn());
        
        emfBuiltInRuleVerification.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfBuiltInRuleVerification;   
        
        
        case "cdp4common.engineeringmodeldata.RuleViolation":
        CDP4.CommonData.Thing emfRuleViolation =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRuleViolation();    
        
        emfRuleViolation.setIid(thing.getIid().toString()); 
        
        
        
        emfRuleViolation.setModifiedOn(thing.getModifiedOn());
        
        emfRuleViolation.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRuleViolation;   
        
        
        case "cdp4common.engineeringmodeldata.StakeHolderValueMapSettings":
        CDP4.CommonData.Thing emfStakeHolderValueMapSettings =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeHolderValueMapSettings();    
        
        emfStakeHolderValueMapSettings.setIid(thing.getIid().toString()); 
        
        
        
        emfStakeHolderValueMapSettings.setModifiedOn(thing.getModifiedOn());
        
        emfStakeHolderValueMapSettings.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfStakeHolderValueMapSettings;   
        
        
        
        case "cdp4common.engineeringmodeldata.RequirementsContainerParameterValue":
        CDP4.CommonData.Thing emfRequirementsContainerParameterValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsContainerParameterValue();    
        
        emfRequirementsContainerParameterValue.setIid(thing.getIid().toString()); 
        
        
        
        emfRequirementsContainerParameterValue.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsContainerParameterValue.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRequirementsContainerParameterValue;   
        
        
        case "cdp4common.engineeringmodeldata.RelationshipParameterValue":
        CDP4.CommonData.Thing emfRelationshipParameterValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRelationshipParameterValue();    
        
        emfRelationshipParameterValue.setIid(thing.getIid().toString()); 
        
        
        
        emfRelationshipParameterValue.setModifiedOn(thing.getModifiedOn());
        
        emfRelationshipParameterValue.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRelationshipParameterValue;   
        
        
        case "cdp4common.reportingdata.Book":
        CDP4.CommonData.Thing emfBook =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createBook();    
        
        emfBook.setIid(thing.getIid().toString()); 
        
        
        
        emfBook.setModifiedOn(thing.getModifiedOn());
        
        emfBook.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfBook;   
        
        
        case "cdp4common.reportingdata.Section":
        CDP4.CommonData.Thing emfSection =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSection();    
        
        emfSection.setIid(thing.getIid().toString()); 
        
        
        
        emfSection.setModifiedOn(thing.getModifiedOn());
        
        emfSection.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSection;   
        
        
        case "cdp4common.reportingdata.Page":
        CDP4.CommonData.Thing emfPage =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createPage();    
        
        emfPage.setIid(thing.getIid().toString()); 
        
        
        
        emfPage.setModifiedOn(thing.getModifiedOn());
        
        emfPage.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPage;   
        
        
        
        case "cdp4common.reportingdata.BinaryNote":
        CDP4.CommonData.Thing emfBinaryNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createBinaryNote();    
        
        emfBinaryNote.setIid(thing.getIid().toString()); 
        
        
        
        emfBinaryNote.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryNote.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfBinaryNote;   
        
        
        case "cdp4common.reportingdata.TextualNote":
        CDP4.CommonData.Thing emfTextualNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createTextualNote();    
        
        emfTextualNote.setIid(thing.getIid().toString()); 
        
        
        
        emfTextualNote.setModifiedOn(thing.getModifiedOn());
        
        emfTextualNote.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfTextualNote;   
        
        
        
        case "cdp4common.reportingdata.ModellingThingReference":
        CDP4.CommonData.Thing emfModellingThingReference =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createModellingThingReference();    
        
        emfModellingThingReference.setIid(thing.getIid().toString()); 
        
        
        
        emfModellingThingReference.setModifiedOn(thing.getModifiedOn());
        
        emfModellingThingReference.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfModellingThingReference;   
        
        
        case "cdp4common.reportingdata.SiteDirectoryThingReference":
        CDP4.CommonData.Thing emfSiteDirectoryThingReference =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryThingReference();    
        
        emfSiteDirectoryThingReference.setIid(thing.getIid().toString()); 
        
        
        
        emfSiteDirectoryThingReference.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryThingReference.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSiteDirectoryThingReference;   
        
        
        
        case "cdp4common.reportingdata.Solution":
        CDP4.CommonData.Thing emfSolution =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSolution();    
        
        emfSolution.setIid(thing.getIid().toString()); 
        
        
        
        emfSolution.setModifiedOn(thing.getModifiedOn());
        
        emfSolution.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSolution;   
        
        
        case "cdp4common.reportingdata.SiteDirectoryDataAnnotation":
        CDP4.CommonData.Thing emfSiteDirectoryDataAnnotation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryDataAnnotation();    
        
        emfSiteDirectoryDataAnnotation.setIid(thing.getIid().toString()); 
        
        
        
        emfSiteDirectoryDataAnnotation.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryDataAnnotation.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSiteDirectoryDataAnnotation;   
        
        
        
        
        
        case "cdp4common.reportingdata.RequestForWaiver":
        CDP4.CommonData.Thing emfRequestForWaiver =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForWaiver();    
        
        emfRequestForWaiver.setIid(thing.getIid().toString()); 
        
        
        
        emfRequestForWaiver.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForWaiver.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRequestForWaiver;   
        
        
        case "cdp4common.reportingdata.RequestForDeviation":
        CDP4.CommonData.Thing emfRequestForDeviation =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createRequestForDeviation();    
        
        emfRequestForDeviation.setIid(thing.getIid().toString()); 
        
        
        
        emfRequestForDeviation.setModifiedOn(thing.getModifiedOn());
        
        emfRequestForDeviation.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfRequestForDeviation;   
        
        
        case "cdp4common.reportingdata.ChangeRequest":
        CDP4.CommonData.Thing emfChangeRequest =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeRequest();    
        
        emfChangeRequest.setIid(thing.getIid().toString()); 
        
        
        
        emfChangeRequest.setModifiedOn(thing.getModifiedOn());
        
        emfChangeRequest.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfChangeRequest;   
        
        
        case "cdp4common.reportingdata.ReviewItemDiscrepancy":
        CDP4.CommonData.Thing emfReviewItemDiscrepancy =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createReviewItemDiscrepancy();    
        
        emfReviewItemDiscrepancy.setIid(thing.getIid().toString()); 
        
        
        
        emfReviewItemDiscrepancy.setModifiedOn(thing.getModifiedOn());
        
        emfReviewItemDiscrepancy.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfReviewItemDiscrepancy;   
        
        
        case "cdp4common.reportingdata.ActionItem":
        CDP4.CommonData.Thing emfActionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createActionItem();    
        
        emfActionItem.setIid(thing.getIid().toString()); 
        
        
        
        emfActionItem.setModifiedOn(thing.getModifiedOn());
        
        emfActionItem.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfActionItem;   
        
        
        case "cdp4common.reportingdata.ChangeProposal":
        CDP4.CommonData.Thing emfChangeProposal =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createChangeProposal();    
        
        emfChangeProposal.setIid(thing.getIid().toString()); 
        
        
        
        emfChangeProposal.setModifiedOn(thing.getModifiedOn());
        
        emfChangeProposal.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfChangeProposal;   
        
        
        case "cdp4common.reportingdata.ContractChangeNotice":
        CDP4.CommonData.Thing emfContractChangeNotice =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createContractChangeNotice();    
        
        emfContractChangeNotice.setIid(thing.getIid().toString()); 
        
        
        
        emfContractChangeNotice.setModifiedOn(thing.getModifiedOn());
        
        emfContractChangeNotice.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfContractChangeNotice;   
        
        
        case "cdp4common.reportingdata.EngineeringModelDataNote":
        CDP4.CommonData.Thing emfEngineeringModelDataNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createEngineeringModelDataNote();    
        
        emfEngineeringModelDataNote.setIid(thing.getIid().toString()); 
        
        
        
        emfEngineeringModelDataNote.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelDataNote.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEngineeringModelDataNote;   
        
        
        case "cdp4common.reportingdata.Approval":
        CDP4.CommonData.Thing emfApproval =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createApproval();    
        
        emfApproval.setIid(thing.getIid().toString()); 
        
        
        
        emfApproval.setModifiedOn(thing.getModifiedOn());
        
        emfApproval.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfApproval;   
        
        
        
        case "cdp4common.reportingdata.EngineeringModelDataDiscussionItem":
        CDP4.CommonData.Thing emfEngineeringModelDataDiscussionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createEngineeringModelDataDiscussionItem();    
        
        emfEngineeringModelDataDiscussionItem.setIid(thing.getIid().toString()); 
        
        
        
        emfEngineeringModelDataDiscussionItem.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelDataDiscussionItem.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEngineeringModelDataDiscussionItem;   
        
        
        case "cdp4common.reportingdata.SiteDirectoryDataDiscussionItem":
        CDP4.CommonData.Thing emfSiteDirectoryDataDiscussionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryDataDiscussionItem();    
        
        emfSiteDirectoryDataDiscussionItem.setIid(thing.getIid().toString()); 
        
        
        
        emfSiteDirectoryDataDiscussionItem.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryDataDiscussionItem.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSiteDirectoryDataDiscussionItem;   
        
        
        
        case "cdp4common.diagramdata.Point":
        CDP4.CommonData.Thing emfPoint =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createPoint();    
        
        emfPoint.setIid(thing.getIid().toString()); 
        
        
        
        emfPoint.setModifiedOn(thing.getModifiedOn());
        
        emfPoint.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPoint;   
        
        
        case "cdp4common.diagramdata.Bounds":
        CDP4.CommonData.Thing emfBounds =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createBounds();    
        
        emfBounds.setIid(thing.getIid().toString()); 
        
        
        
        emfBounds.setModifiedOn(thing.getModifiedOn());
        
        emfBounds.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfBounds;   
        
        
        case "cdp4common.diagramdata.Color":
        CDP4.CommonData.Thing emfColor =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createColor();    
        
        emfColor.setIid(thing.getIid().toString()); 
        
        
        
        emfColor.setModifiedOn(thing.getModifiedOn());
        
        emfColor.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfColor;   
        
        
        
        case "cdp4common.diagramdata.OwnedStyle":
        CDP4.CommonData.Thing emfOwnedStyle =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createOwnedStyle();    
        
        emfOwnedStyle.setIid(thing.getIid().toString()); 
        
        
        
        emfOwnedStyle.setModifiedOn(thing.getModifiedOn());
        
        emfOwnedStyle.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfOwnedStyle;   
        
        
        case "cdp4common.diagramdata.SharedStyle":
        CDP4.CommonData.Thing emfSharedStyle =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createSharedStyle();    
        
        emfSharedStyle.setIid(thing.getIid().toString()); 
        
        
        
        emfSharedStyle.setModifiedOn(thing.getModifiedOn());
        
        emfSharedStyle.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSharedStyle;   
        
        
        
        
        case "cdp4common.diagramdata.DiagramEdge":
        CDP4.CommonData.Thing emfDiagramEdge =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramEdge();    
        
        emfDiagramEdge.setIid(thing.getIid().toString()); 
        
        
        
        emfDiagramEdge.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramEdge.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramEdge;   
        
        
        
        case "cdp4common.diagramdata.DiagramObject":
        CDP4.CommonData.Thing emfDiagramObject =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramObject();    
        
        emfDiagramObject.setIid(thing.getIid().toString()); 
        
        
        
        emfDiagramObject.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramObject.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramObject;   
        
        
        case "cdp4common.diagramdata.DiagramCanvas":
        CDP4.CommonData.Thing emfDiagramCanvas =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramCanvas();    
        
        emfDiagramCanvas.setIid(thing.getIid().toString()); 
        
        
        
        emfDiagramCanvas.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramCanvas.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramCanvas;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.commondata.Thing toPojo(CDP4.CommonData.Thing emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.ParticipantPermission":                
        cdp4common.commondata.Thing pojoParticipantPermission = new cdp4common.sitedirectorydata.ParticipantPermission();	    
        
        pojoParticipantPermission.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParticipantPermission.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantPermission.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantPermission.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParticipantPermission.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParticipantPermission;   
        
        
        case "CDP4.sitedirectorydata.Person":                
        cdp4common.commondata.Thing pojoPerson = new cdp4common.sitedirectorydata.Person();	    
        
        pojoPerson.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPerson.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPerson.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPerson.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPerson.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPerson;   
        
        
        case "CDP4.sitedirectorydata.Organization":                
        cdp4common.commondata.Thing pojoOrganization = new cdp4common.sitedirectorydata.Organization();	    
        
        pojoOrganization.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrganization.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrganization.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrganization.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrganization.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoOrganization;   
        
        
        case "CDP4.sitedirectorydata.Participant":                
        cdp4common.commondata.Thing pojoParticipant = new cdp4common.sitedirectorydata.Participant();	    
        
        pojoParticipant.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParticipant.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipant.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipant.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParticipant.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParticipant;   
        
        
        case "CDP4.sitedirectorydata.ScaleReferenceQuantityValue":                
        cdp4common.commondata.Thing pojoScaleReferenceQuantityValue = new cdp4common.sitedirectorydata.ScaleReferenceQuantityValue();	    
        
        pojoScaleReferenceQuantityValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoScaleReferenceQuantityValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleReferenceQuantityValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleReferenceQuantityValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoScaleReferenceQuantityValue.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoScaleReferenceQuantityValue;   
        
        
        case "CDP4.sitedirectorydata.MappingToReferenceScale":                
        cdp4common.commondata.Thing pojoMappingToReferenceScale = new cdp4common.sitedirectorydata.MappingToReferenceScale();	    
        
        pojoMappingToReferenceScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMappingToReferenceScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMappingToReferenceScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMappingToReferenceScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMappingToReferenceScale.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoMappingToReferenceScale;   
        
        
        case "CDP4.sitedirectorydata.QuantityKindFactor":                
        cdp4common.commondata.Thing pojoQuantityKindFactor = new cdp4common.sitedirectorydata.QuantityKindFactor();	    
        
        pojoQuantityKindFactor.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoQuantityKindFactor.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoQuantityKindFactor.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoQuantityKindFactor.setModifiedOn(emfThing.getModifiedOn());
        
        pojoQuantityKindFactor.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoQuantityKindFactor;   
        
        
        case "CDP4.sitedirectorydata.UnitFactor":                
        cdp4common.commondata.Thing pojoUnitFactor = new cdp4common.sitedirectorydata.UnitFactor();	    
        
        pojoUnitFactor.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUnitFactor.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitFactor.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitFactor.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUnitFactor.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoUnitFactor;   
        
        
        case "CDP4.sitedirectorydata.ParameterTypeComponent":                
        cdp4common.commondata.Thing pojoParameterTypeComponent = new cdp4common.sitedirectorydata.ParameterTypeComponent();	    
        
        pojoParameterTypeComponent.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterTypeComponent.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterTypeComponent.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterTypeComponent.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterTypeComponent.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameterTypeComponent;   
        
        
        case "CDP4.sitedirectorydata.PersonPermission":                
        cdp4common.commondata.Thing pojoPersonPermission = new cdp4common.sitedirectorydata.PersonPermission();	    
        
        pojoPersonPermission.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPersonPermission.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonPermission.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonPermission.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPersonPermission.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPersonPermission;   
        
        
        case "CDP4.sitedirectorydata.SiteLogEntry":                
        cdp4common.commondata.Thing pojoSiteLogEntry = new cdp4common.sitedirectorydata.SiteLogEntry();	    
        
        pojoSiteLogEntry.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteLogEntry.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteLogEntry.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteLogEntry.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteLogEntry.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSiteLogEntry;   
        
        
        case "CDP4.sitedirectorydata.IterationSetup":                
        cdp4common.commondata.Thing pojoIterationSetup = new cdp4common.sitedirectorydata.IterationSetup();	    
        
        pojoIterationSetup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIterationSetup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIterationSetup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIterationSetup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIterationSetup.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoIterationSetup;   
        
        
        case "CDP4.sitedirectorydata.TelephoneNumber":                
        cdp4common.commondata.Thing pojoTelephoneNumber = new cdp4common.sitedirectorydata.TelephoneNumber();	    
        
        pojoTelephoneNumber.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTelephoneNumber.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTelephoneNumber.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTelephoneNumber.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTelephoneNumber.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoTelephoneNumber;   
        
        
        case "CDP4.sitedirectorydata.EmailAddress":                
        cdp4common.commondata.Thing pojoEmailAddress = new cdp4common.sitedirectorydata.EmailAddress();	    
        
        pojoEmailAddress.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEmailAddress.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEmailAddress.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEmailAddress.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEmailAddress.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEmailAddress;   
        
        
        case "CDP4.sitedirectorydata.UserPreference":                
        cdp4common.commondata.Thing pojoUserPreference = new cdp4common.sitedirectorydata.UserPreference();	    
        
        pojoUserPreference.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUserPreference.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserPreference.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserPreference.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUserPreference.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoUserPreference;   
        
        
        case "CDP4.sitedirectorydata.NaturalLanguage":                
        cdp4common.commondata.Thing pojoNaturalLanguage = new cdp4common.sitedirectorydata.NaturalLanguage();	    
        
        pojoNaturalLanguage.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNaturalLanguage.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNaturalLanguage.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNaturalLanguage.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNaturalLanguage.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoNaturalLanguage;   
        
        
        
        case "CDP4.sitedirectorydata.ParticipantRole":                
        cdp4common.commondata.Thing pojoParticipantRole = new cdp4common.sitedirectorydata.ParticipantRole();	    
        
        pojoParticipantRole.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParticipantRole.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParticipantRole.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParticipantRole;   
        
        
        case "CDP4.sitedirectorydata.EngineeringModelSetup":                
        cdp4common.commondata.Thing pojoEngineeringModelSetup = new cdp4common.sitedirectorydata.EngineeringModelSetup();	    
        
        pojoEngineeringModelSetup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelSetup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelSetup.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEngineeringModelSetup;   
        
        
        case "CDP4.sitedirectorydata.Glossary":                
        cdp4common.commondata.Thing pojoGlossary = new cdp4common.sitedirectorydata.Glossary();	    
        
        pojoGlossary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoGlossary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoGlossary.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoGlossary;   
        
        
        
        case "CDP4.sitedirectorydata.SiteReferenceDataLibrary":                
        cdp4common.commondata.Thing pojoSiteReferenceDataLibrary = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary();	    
        
        pojoSiteReferenceDataLibrary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteReferenceDataLibrary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteReferenceDataLibrary.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSiteReferenceDataLibrary;   
        
        
        case "CDP4.sitedirectorydata.ModelReferenceDataLibrary":                
        cdp4common.commondata.Thing pojoModelReferenceDataLibrary = new cdp4common.sitedirectorydata.ModelReferenceDataLibrary();	    
        
        pojoModelReferenceDataLibrary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModelReferenceDataLibrary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModelReferenceDataLibrary.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoModelReferenceDataLibrary;   
        
        
        case "CDP4.sitedirectorydata.Term":                
        cdp4common.commondata.Thing pojoTerm = new cdp4common.sitedirectorydata.Term();	    
        
        pojoTerm.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTerm.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTerm.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoTerm;   
        
        
        case "CDP4.sitedirectorydata.FileType":                
        cdp4common.commondata.Thing pojoFileType = new cdp4common.sitedirectorydata.FileType();	    
        
        pojoFileType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFileType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFileType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoFileType;   
        
        
        
        case "CDP4.sitedirectorydata.OrdinalScale":                
        cdp4common.commondata.Thing pojoOrdinalScale = new cdp4common.sitedirectorydata.OrdinalScale();	    
        
        pojoOrdinalScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrdinalScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrdinalScale.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoOrdinalScale;   
        
        
        case "CDP4.sitedirectorydata.RatioScale":                
        cdp4common.commondata.Thing pojoRatioScale = new cdp4common.sitedirectorydata.RatioScale();	    
        
        pojoRatioScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRatioScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRatioScale.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRatioScale;   
        
        
        case "CDP4.sitedirectorydata.CyclicRatioScale":                
        cdp4common.commondata.Thing pojoCyclicRatioScale = new cdp4common.sitedirectorydata.CyclicRatioScale();	    
        
        pojoCyclicRatioScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCyclicRatioScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCyclicRatioScale.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoCyclicRatioScale;   
        
        
        case "CDP4.sitedirectorydata.IntervalScale":                
        cdp4common.commondata.Thing pojoIntervalScale = new cdp4common.sitedirectorydata.IntervalScale();	    
        
        pojoIntervalScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIntervalScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIntervalScale.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoIntervalScale;   
        
        
        case "CDP4.sitedirectorydata.LogarithmicScale":                
        cdp4common.commondata.Thing pojoLogarithmicScale = new cdp4common.sitedirectorydata.LogarithmicScale();	    
        
        pojoLogarithmicScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLogarithmicScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLogarithmicScale.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoLogarithmicScale;   
        
        
        case "CDP4.sitedirectorydata.DomainOfExpertise":                
        cdp4common.commondata.Thing pojoDomainOfExpertise = new cdp4common.sitedirectorydata.DomainOfExpertise();	    
        
        pojoDomainOfExpertise.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainOfExpertise.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainOfExpertise.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDomainOfExpertise;   
        
        
        
        case "CDP4.sitedirectorydata.CompoundParameterType":                
        cdp4common.commondata.Thing pojoCompoundParameterType = new cdp4common.sitedirectorydata.CompoundParameterType();	    
        
        pojoCompoundParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCompoundParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCompoundParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoCompoundParameterType;   
        
        
        case "CDP4.sitedirectorydata.ArrayParameterType":                
        cdp4common.commondata.Thing pojoArrayParameterType = new cdp4common.sitedirectorydata.ArrayParameterType();	    
        
        pojoArrayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoArrayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoArrayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoArrayParameterType;   
        
        
        
        case "CDP4.sitedirectorydata.EnumerationParameterType":                
        cdp4common.commondata.Thing pojoEnumerationParameterType = new cdp4common.sitedirectorydata.EnumerationParameterType();	    
        
        pojoEnumerationParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEnumerationParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEnumerationParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEnumerationParameterType;   
        
        
        case "CDP4.sitedirectorydata.BooleanParameterType":                
        cdp4common.commondata.Thing pojoBooleanParameterType = new cdp4common.sitedirectorydata.BooleanParameterType();	    
        
        pojoBooleanParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBooleanParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBooleanParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoBooleanParameterType;   
        
        
        case "CDP4.sitedirectorydata.DateParameterType":                
        cdp4common.commondata.Thing pojoDateParameterType = new cdp4common.sitedirectorydata.DateParameterType();	    
        
        pojoDateParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDateParameterType;   
        
        
        case "CDP4.sitedirectorydata.TextParameterType":                
        cdp4common.commondata.Thing pojoTextParameterType = new cdp4common.sitedirectorydata.TextParameterType();	    
        
        pojoTextParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTextParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTextParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoTextParameterType;   
        
        
        case "CDP4.sitedirectorydata.DateTimeParameterType":                
        cdp4common.commondata.Thing pojoDateTimeParameterType = new cdp4common.sitedirectorydata.DateTimeParameterType();	    
        
        pojoDateTimeParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateTimeParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateTimeParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDateTimeParameterType;   
        
        
        case "CDP4.sitedirectorydata.TimeOfDayParameterType":                
        cdp4common.commondata.Thing pojoTimeOfDayParameterType = new cdp4common.sitedirectorydata.TimeOfDayParameterType();	    
        
        pojoTimeOfDayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTimeOfDayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTimeOfDayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoTimeOfDayParameterType;   
        
        
        
        case "CDP4.sitedirectorydata.SpecializedQuantityKind":                
        cdp4common.commondata.Thing pojoSpecializedQuantityKind = new cdp4common.sitedirectorydata.SpecializedQuantityKind();	    
        
        pojoSpecializedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSpecializedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSpecializedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSpecializedQuantityKind;   
        
        
        case "CDP4.sitedirectorydata.SimpleQuantityKind":                
        cdp4common.commondata.Thing pojoSimpleQuantityKind = new cdp4common.sitedirectorydata.SimpleQuantityKind();	    
        
        pojoSimpleQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSimpleQuantityKind;   
        
        
        case "CDP4.sitedirectorydata.DerivedQuantityKind":                
        cdp4common.commondata.Thing pojoDerivedQuantityKind = new cdp4common.sitedirectorydata.DerivedQuantityKind();	    
        
        pojoDerivedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDerivedQuantityKind;   
        
        
        case "CDP4.sitedirectorydata.ScaleValueDefinition":                
        cdp4common.commondata.Thing pojoScaleValueDefinition = new cdp4common.sitedirectorydata.ScaleValueDefinition();	    
        
        pojoScaleValueDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoScaleValueDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoScaleValueDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoScaleValueDefinition;   
        
        
        
        case "CDP4.sitedirectorydata.DerivedUnit":                
        cdp4common.commondata.Thing pojoDerivedUnit = new cdp4common.sitedirectorydata.DerivedUnit();	    
        
        pojoDerivedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDerivedUnit;   
        
        
        
        case "CDP4.sitedirectorydata.LinearConversionUnit":                
        cdp4common.commondata.Thing pojoLinearConversionUnit = new cdp4common.sitedirectorydata.LinearConversionUnit();	    
        
        pojoLinearConversionUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLinearConversionUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLinearConversionUnit.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoLinearConversionUnit;   
        
        
        case "CDP4.sitedirectorydata.PrefixedUnit":                
        cdp4common.commondata.Thing pojoPrefixedUnit = new cdp4common.sitedirectorydata.PrefixedUnit();	    
        
        pojoPrefixedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPrefixedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPrefixedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPrefixedUnit;   
        
        
        case "CDP4.sitedirectorydata.SimpleUnit":                
        cdp4common.commondata.Thing pojoSimpleUnit = new cdp4common.sitedirectorydata.SimpleUnit();	    
        
        pojoSimpleUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleUnit.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSimpleUnit;   
        
        
        case "CDP4.sitedirectorydata.Category":                
        cdp4common.commondata.Thing pojoCategory = new cdp4common.sitedirectorydata.Category();	    
        
        pojoCategory.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCategory.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCategory.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoCategory;   
        
        
        case "CDP4.sitedirectorydata.UnitPrefix":                
        cdp4common.commondata.Thing pojoUnitPrefix = new cdp4common.sitedirectorydata.UnitPrefix();	    
        
        pojoUnitPrefix.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUnitPrefix.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUnitPrefix.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoUnitPrefix;   
        
        
        
        case "CDP4.sitedirectorydata.ReferencerRule":                
        cdp4common.commondata.Thing pojoReferencerRule = new cdp4common.sitedirectorydata.ReferencerRule();	    
        
        pojoReferencerRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReferencerRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReferencerRule.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoReferencerRule;   
        
        
        case "CDP4.sitedirectorydata.BinaryRelationshipRule":                
        cdp4common.commondata.Thing pojoBinaryRelationshipRule = new cdp4common.sitedirectorydata.BinaryRelationshipRule();	    
        
        pojoBinaryRelationshipRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryRelationshipRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryRelationshipRule.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoBinaryRelationshipRule;   
        
        
        case "CDP4.sitedirectorydata.MultiRelationshipRule":                
        cdp4common.commondata.Thing pojoMultiRelationshipRule = new cdp4common.sitedirectorydata.MultiRelationshipRule();	    
        
        pojoMultiRelationshipRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMultiRelationshipRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMultiRelationshipRule.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoMultiRelationshipRule;   
        
        
        case "CDP4.sitedirectorydata.DecompositionRule":                
        cdp4common.commondata.Thing pojoDecompositionRule = new cdp4common.sitedirectorydata.DecompositionRule();	    
        
        pojoDecompositionRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDecompositionRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDecompositionRule.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDecompositionRule;   
        
        
        case "CDP4.sitedirectorydata.ParameterizedCategoryRule":                
        cdp4common.commondata.Thing pojoParameterizedCategoryRule = new cdp4common.sitedirectorydata.ParameterizedCategoryRule();	    
        
        pojoParameterizedCategoryRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterizedCategoryRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterizedCategoryRule.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameterizedCategoryRule;   
        
        
        case "CDP4.sitedirectorydata.EnumerationValueDefinition":                
        cdp4common.commondata.Thing pojoEnumerationValueDefinition = new cdp4common.sitedirectorydata.EnumerationValueDefinition();	    
        
        pojoEnumerationValueDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEnumerationValueDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEnumerationValueDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEnumerationValueDefinition;   
        
        
        case "CDP4.sitedirectorydata.PersonRole":                
        cdp4common.commondata.Thing pojoPersonRole = new cdp4common.sitedirectorydata.PersonRole();	    
        
        pojoPersonRole.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPersonRole.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPersonRole.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPersonRole;   
        
        
        case "CDP4.sitedirectorydata.DomainOfExpertiseGroup":                
        cdp4common.commondata.Thing pojoDomainOfExpertiseGroup = new cdp4common.sitedirectorydata.DomainOfExpertiseGroup();	    
        
        pojoDomainOfExpertiseGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainOfExpertiseGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainOfExpertiseGroup.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDomainOfExpertiseGroup;   
        
        
        case "CDP4.sitedirectorydata.ReferenceSource":                
        cdp4common.commondata.Thing pojoReferenceSource = new cdp4common.sitedirectorydata.ReferenceSource();	    
        
        pojoReferenceSource.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReferenceSource.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReferenceSource.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoReferenceSource;   
        
        
        case "CDP4.sitedirectorydata.Constant":                
        cdp4common.commondata.Thing pojoConstant = new cdp4common.sitedirectorydata.Constant();	    
        
        pojoConstant.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoConstant.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.setModifiedOn(emfThing.getModifiedOn());
        
        pojoConstant.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoConstant;   
        
        
        case "CDP4.engineeringmodeldata.PossibleFiniteState":                
        cdp4common.commondata.Thing pojoPossibleFiniteState = new cdp4common.engineeringmodeldata.PossibleFiniteState();	    
        
        pojoPossibleFiniteState.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPossibleFiniteState.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPossibleFiniteState.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPossibleFiniteState;   
        
        
        case "CDP4.engineeringmodeldata.Option":                
        cdp4common.commondata.Thing pojoOption = new cdp4common.engineeringmodeldata.Option();	    
        
        pojoOption.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOption.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOption.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoOption;   
        
        
        case "CDP4.engineeringmodeldata.PossibleFiniteStateList":                
        cdp4common.commondata.Thing pojoPossibleFiniteStateList = new cdp4common.engineeringmodeldata.PossibleFiniteStateList();	    
        
        pojoPossibleFiniteStateList.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPossibleFiniteStateList.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPossibleFiniteStateList.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPossibleFiniteStateList;   
        
        
        
        case "CDP4.engineeringmodeldata.ElementDefinition":                
        cdp4common.commondata.Thing pojoElementDefinition = new cdp4common.engineeringmodeldata.ElementDefinition();	    
        
        pojoElementDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoElementDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoElementDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoElementDefinition;   
        
        
        case "CDP4.engineeringmodeldata.ElementUsage":                
        cdp4common.commondata.Thing pojoElementUsage = new cdp4common.engineeringmodeldata.ElementUsage();	    
        
        pojoElementUsage.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoElementUsage.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.setModifiedOn(emfThing.getModifiedOn());
        
        pojoElementUsage.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoElementUsage;   
        
        
        
        case "CDP4.engineeringmodeldata.RequirementsSpecification":                
        cdp4common.commondata.Thing pojoRequirementsSpecification = new cdp4common.engineeringmodeldata.RequirementsSpecification();	    
        
        pojoRequirementsSpecification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsSpecification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsSpecification.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRequirementsSpecification;   
        
        
        case "CDP4.engineeringmodeldata.RequirementsGroup":                
        cdp4common.commondata.Thing pojoRequirementsGroup = new cdp4common.engineeringmodeldata.RequirementsGroup();	    
        
        pojoRequirementsGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsGroup.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRequirementsGroup;   
        
        
        
        case "CDP4.engineeringmodeldata.Requirement":                
        cdp4common.commondata.Thing pojoRequirement = new cdp4common.engineeringmodeldata.Requirement();	    
        
        pojoRequirement.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirement.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirement.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRequirement;   
        
        
        case "CDP4.engineeringmodeldata.RuleVerificationList":                
        cdp4common.commondata.Thing pojoRuleVerificationList = new cdp4common.engineeringmodeldata.RuleVerificationList();	    
        
        pojoRuleVerificationList.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRuleVerificationList.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRuleVerificationList.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRuleVerificationList;   
        
        
        case "CDP4.engineeringmodeldata.Goal":                
        cdp4common.commondata.Thing pojoGoal = new cdp4common.engineeringmodeldata.Goal();	    
        
        pojoGoal.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoGoal.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.setModifiedOn(emfThing.getModifiedOn());
        
        pojoGoal.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoGoal;   
        
        
        case "CDP4.engineeringmodeldata.Stakeholder":                
        cdp4common.commondata.Thing pojoStakeholder = new cdp4common.engineeringmodeldata.Stakeholder();	    
        
        pojoStakeholder.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeholder.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeholder.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoStakeholder;   
        
        
        case "CDP4.engineeringmodeldata.ValueGroup":                
        cdp4common.commondata.Thing pojoValueGroup = new cdp4common.engineeringmodeldata.ValueGroup();	    
        
        pojoValueGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoValueGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoValueGroup.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoValueGroup;   
        
        
        case "CDP4.engineeringmodeldata.StakeholderValue":                
        cdp4common.commondata.Thing pojoStakeholderValue = new cdp4common.engineeringmodeldata.StakeholderValue();	    
        
        pojoStakeholderValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeholderValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeholderValue.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoStakeholderValue;   
        
        
        case "CDP4.engineeringmodeldata.StakeHolderValueMap":                
        cdp4common.commondata.Thing pojoStakeHolderValueMap = new cdp4common.engineeringmodeldata.StakeHolderValueMap();	    
        
        pojoStakeHolderValueMap.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeHolderValueMap.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeHolderValueMap.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoStakeHolderValueMap;   
        
        
        case "CDP4.commondata.HyperLink":                
        cdp4common.commondata.Thing pojoHyperLink = new cdp4common.commondata.HyperLink();	    
        
        pojoHyperLink.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoHyperLink.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoHyperLink.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoHyperLink.setModifiedOn(emfThing.getModifiedOn());
        
        pojoHyperLink.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoHyperLink;   
        
        
        case "CDP4.commondata.Definition":                
        cdp4common.commondata.Thing pojoDefinition = new cdp4common.commondata.Definition();	    
        
        pojoDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDefinition;   
        
        
        case "CDP4.commondata.Alias":                
        cdp4common.commondata.Thing pojoAlias = new cdp4common.commondata.Alias();	    
        
        pojoAlias.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoAlias.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAlias.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAlias.setModifiedOn(emfThing.getModifiedOn());
        
        pojoAlias.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoAlias;   
        
        
        case "CDP4.commondata.Citation":                
        cdp4common.commondata.Thing pojoCitation = new cdp4common.commondata.Citation();	    
        
        pojoCitation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCitation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCitation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCitation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCitation.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoCitation;   
        
        
        
        case "CDP4.sitedirectorydata.SiteDirectory":                
        cdp4common.commondata.Thing pojoSiteDirectory = new cdp4common.sitedirectorydata.SiteDirectory();	    
        
        pojoSiteDirectory.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectory.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectory.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectory.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectory.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSiteDirectory;   
        
        
        case "CDP4.engineeringmodeldata.EngineeringModel":                
        cdp4common.commondata.Thing pojoEngineeringModel = new cdp4common.engineeringmodeldata.EngineeringModel();	    
        
        pojoEngineeringModel.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModel.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModel.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModel.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModel.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEngineeringModel;   
        
        
        
        case "CDP4.engineeringmodeldata.ParameterSubscription":                
        cdp4common.commondata.Thing pojoParameterSubscription = new cdp4common.engineeringmodeldata.ParameterSubscription();	    
        
        pojoParameterSubscription.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterSubscription.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscription.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscription.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterSubscription.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameterSubscription;   
        
        
        
        case "CDP4.engineeringmodeldata.Parameter":                
        cdp4common.commondata.Thing pojoParameter = new cdp4common.engineeringmodeldata.Parameter();	    
        
        pojoParameter.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameter.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameter.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameter.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameter.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameter;   
        
        
        case "CDP4.engineeringmodeldata.ParameterOverride":                
        cdp4common.commondata.Thing pojoParameterOverride = new cdp4common.engineeringmodeldata.ParameterOverride();	    
        
        pojoParameterOverride.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterOverride.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverride.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverride.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterOverride.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameterOverride;   
        
        
        
        case "CDP4.engineeringmodeldata.CommonFileStore":                
        cdp4common.commondata.Thing pojoCommonFileStore = new cdp4common.engineeringmodeldata.CommonFileStore();	    
        
        pojoCommonFileStore.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCommonFileStore.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCommonFileStore.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCommonFileStore.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCommonFileStore.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoCommonFileStore;   
        
        
        case "CDP4.engineeringmodeldata.DomainFileStore":                
        cdp4common.commondata.Thing pojoDomainFileStore = new cdp4common.engineeringmodeldata.DomainFileStore();	    
        
        pojoDomainFileStore.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainFileStore.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainFileStore.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainFileStore.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainFileStore.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDomainFileStore;   
        
        
        case "CDP4.engineeringmodeldata.ParameterGroup":                
        cdp4common.commondata.Thing pojoParameterGroup = new cdp4common.engineeringmodeldata.ParameterGroup();	    
        
        pojoParameterGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterGroup.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameterGroup;   
        
        
        case "CDP4.engineeringmodeldata.Publication":                
        cdp4common.commondata.Thing pojoPublication = new cdp4common.engineeringmodeldata.Publication();	    
        
        pojoPublication.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPublication.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPublication.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPublication.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPublication.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPublication;   
        
        
        case "CDP4.engineeringmodeldata.File":                
        cdp4common.commondata.Thing pojoFile = new cdp4common.engineeringmodeldata.File();	    
        
        pojoFile.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFile.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFile.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFile.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFile.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoFile;   
        
        
        case "CDP4.engineeringmodeldata.ParametricConstraint":                
        cdp4common.commondata.Thing pojoParametricConstraint = new cdp4common.engineeringmodeldata.ParametricConstraint();	    
        
        pojoParametricConstraint.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParametricConstraint.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParametricConstraint.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParametricConstraint.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParametricConstraint.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParametricConstraint;   
        
        
        case "CDP4.engineeringmodeldata.ExternalIdentifierMap":                
        cdp4common.commondata.Thing pojoExternalIdentifierMap = new cdp4common.engineeringmodeldata.ExternalIdentifierMap();	    
        
        pojoExternalIdentifierMap.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoExternalIdentifierMap.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExternalIdentifierMap.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExternalIdentifierMap.setModifiedOn(emfThing.getModifiedOn());
        
        pojoExternalIdentifierMap.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoExternalIdentifierMap;   
        
        
        case "CDP4.engineeringmodeldata.NestedElement":                
        cdp4common.commondata.Thing pojoNestedElement = new cdp4common.engineeringmodeldata.NestedElement();	    
        
        pojoNestedElement.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNestedElement.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNestedElement.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNestedElement.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNestedElement.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoNestedElement;   
        
        
        case "CDP4.engineeringmodeldata.Folder":                
        cdp4common.commondata.Thing pojoFolder = new cdp4common.engineeringmodeldata.Folder();	    
        
        pojoFolder.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFolder.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFolder.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFolder.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFolder.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoFolder;   
        
        
        case "CDP4.engineeringmodeldata.IdCorrespondence":                
        cdp4common.commondata.Thing pojoIdCorrespondence = new cdp4common.engineeringmodeldata.IdCorrespondence();	    
        
        pojoIdCorrespondence.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIdCorrespondence.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIdCorrespondence.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIdCorrespondence.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIdCorrespondence.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoIdCorrespondence;   
        
        
        
        case "CDP4.engineeringmodeldata.MultiRelationship":                
        cdp4common.commondata.Thing pojoMultiRelationship = new cdp4common.engineeringmodeldata.MultiRelationship();	    
        
        pojoMultiRelationship.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMultiRelationship.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationship.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationship.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMultiRelationship.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoMultiRelationship;   
        
        
        case "CDP4.engineeringmodeldata.BinaryRelationship":                
        cdp4common.commondata.Thing pojoBinaryRelationship = new cdp4common.engineeringmodeldata.BinaryRelationship();	    
        
        pojoBinaryRelationship.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryRelationship.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationship.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationship.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryRelationship.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoBinaryRelationship;   
        
        
        case "CDP4.engineeringmodeldata.SimpleParameterValue":                
        cdp4common.commondata.Thing pojoSimpleParameterValue = new cdp4common.engineeringmodeldata.SimpleParameterValue();	    
        
        pojoSimpleParameterValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleParameterValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleParameterValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleParameterValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleParameterValue.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSimpleParameterValue;   
        
        
        case "CDP4.engineeringmodeldata.ParameterSubscriptionValueSet":                
        cdp4common.commondata.Thing pojoParameterSubscriptionValueSet = new cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet();	    
        
        pojoParameterSubscriptionValueSet.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterSubscriptionValueSet.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscriptionValueSet.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscriptionValueSet.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterSubscriptionValueSet.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameterSubscriptionValueSet;   
        
        
        case "CDP4.engineeringmodeldata.ActualFiniteState":                
        cdp4common.commondata.Thing pojoActualFiniteState = new cdp4common.engineeringmodeldata.ActualFiniteState();	    
        
        pojoActualFiniteState.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActualFiniteState.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActualFiniteState.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActualFiniteState.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActualFiniteState.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoActualFiniteState;   
        
        
        case "CDP4.engineeringmodeldata.ModelLogEntry":                
        cdp4common.commondata.Thing pojoModelLogEntry = new cdp4common.engineeringmodeldata.ModelLogEntry();	    
        
        pojoModelLogEntry.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModelLogEntry.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelLogEntry.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelLogEntry.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModelLogEntry.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoModelLogEntry;   
        
        
        case "CDP4.engineeringmodeldata.Iteration":                
        cdp4common.commondata.Thing pojoIteration = new cdp4common.engineeringmodeldata.Iteration();	    
        
        pojoIteration.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIteration.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIteration.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIteration.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIteration.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoIteration;   
        
        
        case "CDP4.engineeringmodeldata.ActualFiniteStateList":                
        cdp4common.commondata.Thing pojoActualFiniteStateList = new cdp4common.engineeringmodeldata.ActualFiniteStateList();	    
        
        pojoActualFiniteStateList.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActualFiniteStateList.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActualFiniteStateList.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActualFiniteStateList.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActualFiniteStateList.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoActualFiniteStateList;   
        
        
        
        case "CDP4.engineeringmodeldata.OrExpression":                
        cdp4common.commondata.Thing pojoOrExpression = new cdp4common.engineeringmodeldata.OrExpression();	    
        
        pojoOrExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrExpression.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoOrExpression;   
        
        
        case "CDP4.engineeringmodeldata.NotExpression":                
        cdp4common.commondata.Thing pojoNotExpression = new cdp4common.engineeringmodeldata.NotExpression();	    
        
        pojoNotExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNotExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNotExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNotExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNotExpression.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoNotExpression;   
        
        
        case "CDP4.engineeringmodeldata.AndExpression":                
        cdp4common.commondata.Thing pojoAndExpression = new cdp4common.engineeringmodeldata.AndExpression();	    
        
        pojoAndExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoAndExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAndExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAndExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoAndExpression.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoAndExpression;   
        
        
        case "CDP4.engineeringmodeldata.ExclusiveOrExpression":                
        cdp4common.commondata.Thing pojoExclusiveOrExpression = new cdp4common.engineeringmodeldata.ExclusiveOrExpression();	    
        
        pojoExclusiveOrExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoExclusiveOrExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExclusiveOrExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExclusiveOrExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoExclusiveOrExpression.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoExclusiveOrExpression;   
        
        
        case "CDP4.engineeringmodeldata.RelationalExpression":                
        cdp4common.commondata.Thing pojoRelationalExpression = new cdp4common.engineeringmodeldata.RelationalExpression();	    
        
        pojoRelationalExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRelationalExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationalExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationalExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRelationalExpression.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRelationalExpression;   
        
        
        
        case "CDP4.engineeringmodeldata.ParameterValueSet":                
        cdp4common.commondata.Thing pojoParameterValueSet = new cdp4common.engineeringmodeldata.ParameterValueSet();	    
        
        pojoParameterValueSet.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterValueSet.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterValueSet.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterValueSet.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterValueSet.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameterValueSet;   
        
        
        case "CDP4.engineeringmodeldata.ParameterOverrideValueSet":                
        cdp4common.commondata.Thing pojoParameterOverrideValueSet = new cdp4common.engineeringmodeldata.ParameterOverrideValueSet();	    
        
        pojoParameterOverrideValueSet.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterOverrideValueSet.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverrideValueSet.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverrideValueSet.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterOverrideValueSet.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoParameterOverrideValueSet;   
        
        
        case "CDP4.engineeringmodeldata.NestedParameter":                
        cdp4common.commondata.Thing pojoNestedParameter = new cdp4common.engineeringmodeldata.NestedParameter();	    
        
        pojoNestedParameter.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNestedParameter.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNestedParameter.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNestedParameter.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNestedParameter.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoNestedParameter;   
        
        
        case "CDP4.engineeringmodeldata.FileRevision":                
        cdp4common.commondata.Thing pojoFileRevision = new cdp4common.engineeringmodeldata.FileRevision();	    
        
        pojoFileRevision.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFileRevision.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileRevision.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileRevision.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFileRevision.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoFileRevision;   
        
        
        
        case "CDP4.engineeringmodeldata.UserRuleVerification":                
        cdp4common.commondata.Thing pojoUserRuleVerification = new cdp4common.engineeringmodeldata.UserRuleVerification();	    
        
        pojoUserRuleVerification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUserRuleVerification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserRuleVerification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserRuleVerification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUserRuleVerification.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoUserRuleVerification;   
        
        
        case "CDP4.engineeringmodeldata.BuiltInRuleVerification":                
        cdp4common.commondata.Thing pojoBuiltInRuleVerification = new cdp4common.engineeringmodeldata.BuiltInRuleVerification();	    
        
        pojoBuiltInRuleVerification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBuiltInRuleVerification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBuiltInRuleVerification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBuiltInRuleVerification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBuiltInRuleVerification.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoBuiltInRuleVerification;   
        
        
        case "CDP4.engineeringmodeldata.RuleViolation":                
        cdp4common.commondata.Thing pojoRuleViolation = new cdp4common.engineeringmodeldata.RuleViolation();	    
        
        pojoRuleViolation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRuleViolation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleViolation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleViolation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRuleViolation.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRuleViolation;   
        
        
        case "CDP4.engineeringmodeldata.StakeHolderValueMapSettings":                
        cdp4common.commondata.Thing pojoStakeHolderValueMapSettings = new cdp4common.engineeringmodeldata.StakeHolderValueMapSettings();	    
        
        pojoStakeHolderValueMapSettings.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeHolderValueMapSettings.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMapSettings.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMapSettings.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeHolderValueMapSettings.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoStakeHolderValueMapSettings;   
        
        
        
        case "CDP4.engineeringmodeldata.RequirementsContainerParameterValue":                
        cdp4common.commondata.Thing pojoRequirementsContainerParameterValue = new cdp4common.engineeringmodeldata.RequirementsContainerParameterValue();	    
        
        pojoRequirementsContainerParameterValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsContainerParameterValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsContainerParameterValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsContainerParameterValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsContainerParameterValue.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRequirementsContainerParameterValue;   
        
        
        case "CDP4.engineeringmodeldata.RelationshipParameterValue":                
        cdp4common.commondata.Thing pojoRelationshipParameterValue = new cdp4common.engineeringmodeldata.RelationshipParameterValue();	    
        
        pojoRelationshipParameterValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRelationshipParameterValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationshipParameterValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationshipParameterValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRelationshipParameterValue.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRelationshipParameterValue;   
        
        
        case "CDP4.reportingdata.Book":                
        cdp4common.commondata.Thing pojoBook = new cdp4common.reportingdata.Book();	    
        
        pojoBook.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBook.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBook.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBook.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBook.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoBook;   
        
        
        case "CDP4.reportingdata.Section":                
        cdp4common.commondata.Thing pojoSection = new cdp4common.reportingdata.Section();	    
        
        pojoSection.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSection.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSection.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSection.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSection.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSection;   
        
        
        case "CDP4.reportingdata.Page":                
        cdp4common.commondata.Thing pojoPage = new cdp4common.reportingdata.Page();	    
        
        pojoPage.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPage.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPage.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPage.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPage.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPage;   
        
        
        
        case "CDP4.reportingdata.BinaryNote":                
        cdp4common.commondata.Thing pojoBinaryNote = new cdp4common.reportingdata.BinaryNote();	    
        
        pojoBinaryNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryNote.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoBinaryNote;   
        
        
        case "CDP4.reportingdata.TextualNote":                
        cdp4common.commondata.Thing pojoTextualNote = new cdp4common.reportingdata.TextualNote();	    
        
        pojoTextualNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTextualNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextualNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextualNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTextualNote.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoTextualNote;   
        
        
        
        case "CDP4.reportingdata.ModellingThingReference":                
        cdp4common.commondata.Thing pojoModellingThingReference = new cdp4common.reportingdata.ModellingThingReference();	    
        
        pojoModellingThingReference.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModellingThingReference.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModellingThingReference.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModellingThingReference.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModellingThingReference.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoModellingThingReference;   
        
        
        case "CDP4.reportingdata.SiteDirectoryThingReference":                
        cdp4common.commondata.Thing pojoSiteDirectoryThingReference = new cdp4common.reportingdata.SiteDirectoryThingReference();	    
        
        pojoSiteDirectoryThingReference.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryThingReference.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryThingReference.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryThingReference.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryThingReference.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSiteDirectoryThingReference;   
        
        
        
        case "CDP4.reportingdata.Solution":                
        cdp4common.commondata.Thing pojoSolution = new cdp4common.reportingdata.Solution();	    
        
        pojoSolution.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSolution.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSolution.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSolution.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSolution.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSolution;   
        
        
        case "CDP4.reportingdata.SiteDirectoryDataAnnotation":                
        cdp4common.commondata.Thing pojoSiteDirectoryDataAnnotation = new cdp4common.reportingdata.SiteDirectoryDataAnnotation();	    
        
        pojoSiteDirectoryDataAnnotation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryDataAnnotation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataAnnotation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataAnnotation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryDataAnnotation.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSiteDirectoryDataAnnotation;   
        
        
        
        
        
        case "CDP4.reportingdata.RequestForWaiver":                
        cdp4common.commondata.Thing pojoRequestForWaiver = new cdp4common.reportingdata.RequestForWaiver();	    
        
        pojoRequestForWaiver.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForWaiver.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForWaiver.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForWaiver.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRequestForWaiver;   
        
        
        case "CDP4.reportingdata.RequestForDeviation":                
        cdp4common.commondata.Thing pojoRequestForDeviation = new cdp4common.reportingdata.RequestForDeviation();	    
        
        pojoRequestForDeviation.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequestForDeviation.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequestForDeviation.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequestForDeviation.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoRequestForDeviation;   
        
        
        case "CDP4.reportingdata.ChangeRequest":                
        cdp4common.commondata.Thing pojoChangeRequest = new cdp4common.reportingdata.ChangeRequest();	    
        
        pojoChangeRequest.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeRequest.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeRequest.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeRequest.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoChangeRequest;   
        
        
        case "CDP4.reportingdata.ReviewItemDiscrepancy":                
        cdp4common.commondata.Thing pojoReviewItemDiscrepancy = new cdp4common.reportingdata.ReviewItemDiscrepancy();	    
        
        pojoReviewItemDiscrepancy.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReviewItemDiscrepancy.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReviewItemDiscrepancy.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReviewItemDiscrepancy.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoReviewItemDiscrepancy;   
        
        
        case "CDP4.reportingdata.ActionItem":                
        cdp4common.commondata.Thing pojoActionItem = new cdp4common.reportingdata.ActionItem();	    
        
        pojoActionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoActionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoActionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoActionItem.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoActionItem;   
        
        
        case "CDP4.reportingdata.ChangeProposal":                
        cdp4common.commondata.Thing pojoChangeProposal = new cdp4common.reportingdata.ChangeProposal();	    
        
        pojoChangeProposal.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoChangeProposal.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoChangeProposal.setModifiedOn(emfThing.getModifiedOn());
        
        pojoChangeProposal.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoChangeProposal;   
        
        
        case "CDP4.reportingdata.ContractChangeNotice":                
        cdp4common.commondata.Thing pojoContractChangeNotice = new cdp4common.reportingdata.ContractChangeNotice();	    
        
        pojoContractChangeNotice.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoContractChangeNotice.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoContractChangeNotice.setModifiedOn(emfThing.getModifiedOn());
        
        pojoContractChangeNotice.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoContractChangeNotice;   
        
        
        case "CDP4.reportingdata.EngineeringModelDataNote":                
        cdp4common.commondata.Thing pojoEngineeringModelDataNote = new cdp4common.reportingdata.EngineeringModelDataNote();	    
        
        pojoEngineeringModelDataNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelDataNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelDataNote.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEngineeringModelDataNote;   
        
        
        case "CDP4.reportingdata.Approval":                
        cdp4common.commondata.Thing pojoApproval = new cdp4common.reportingdata.Approval();	    
        
        pojoApproval.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoApproval.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoApproval.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoApproval.setModifiedOn(emfThing.getModifiedOn());
        
        pojoApproval.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoApproval;   
        
        
        
        case "CDP4.reportingdata.EngineeringModelDataDiscussionItem":                
        cdp4common.commondata.Thing pojoEngineeringModelDataDiscussionItem = new cdp4common.reportingdata.EngineeringModelDataDiscussionItem();	    
        
        pojoEngineeringModelDataDiscussionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelDataDiscussionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataDiscussionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataDiscussionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelDataDiscussionItem.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEngineeringModelDataDiscussionItem;   
        
        
        case "CDP4.reportingdata.SiteDirectoryDataDiscussionItem":                
        cdp4common.commondata.Thing pojoSiteDirectoryDataDiscussionItem = new cdp4common.reportingdata.SiteDirectoryDataDiscussionItem();	    
        
        pojoSiteDirectoryDataDiscussionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryDataDiscussionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataDiscussionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataDiscussionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryDataDiscussionItem.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSiteDirectoryDataDiscussionItem;   
        
        
        
        case "CDP4.diagramdata.Point":                
        cdp4common.commondata.Thing pojoPoint = new cdp4common.diagramdata.Point();	    
        
        pojoPoint.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPoint.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPoint.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPoint.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPoint.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPoint;   
        
        
        case "CDP4.diagramdata.Bounds":                
        cdp4common.commondata.Thing pojoBounds = new cdp4common.diagramdata.Bounds();	    
        
        pojoBounds.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBounds.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBounds.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBounds.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBounds.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoBounds;   
        
        
        case "CDP4.diagramdata.Color":                
        cdp4common.commondata.Thing pojoColor = new cdp4common.diagramdata.Color();	    
        
        pojoColor.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoColor.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoColor.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoColor.setModifiedOn(emfThing.getModifiedOn());
        
        pojoColor.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoColor;   
        
        
        
        case "CDP4.diagramdata.OwnedStyle":                
        cdp4common.commondata.Thing pojoOwnedStyle = new cdp4common.diagramdata.OwnedStyle();	    
        
        pojoOwnedStyle.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOwnedStyle.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOwnedStyle.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOwnedStyle.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOwnedStyle.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoOwnedStyle;   
        
        
        case "CDP4.diagramdata.SharedStyle":                
        cdp4common.commondata.Thing pojoSharedStyle = new cdp4common.diagramdata.SharedStyle();	    
        
        pojoSharedStyle.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSharedStyle.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSharedStyle.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSharedStyle.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSharedStyle.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSharedStyle;   
        
        
        
        
        case "CDP4.diagramdata.DiagramEdge":                
        cdp4common.commondata.Thing pojoDiagramEdge = new cdp4common.diagramdata.DiagramEdge();	    
        
        pojoDiagramEdge.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramEdge.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramEdge.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDiagramEdge;   
        
        
        
        case "CDP4.diagramdata.DiagramObject":                
        cdp4common.commondata.Thing pojoDiagramObject = new cdp4common.diagramdata.DiagramObject();	    
        
        pojoDiagramObject.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramObject.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramObject.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDiagramObject;   
        
        
        case "CDP4.diagramdata.DiagramCanvas":                
        cdp4common.commondata.Thing pojoDiagramCanvas = new cdp4common.diagramdata.DiagramCanvas();	    
        
        pojoDiagramCanvas.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramCanvas.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramCanvas.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramCanvas.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramCanvas.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDiagramCanvas;   
        
        	
    }
        return null;
        
        
     }

        
}
