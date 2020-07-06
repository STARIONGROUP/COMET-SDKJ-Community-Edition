/* --------------------------------------------------------------------------------------------------------------------
 * DefinedThing.java
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

public abstract class DefinedThing {

    public static CDP4.CommonData.DefinedThing toEmf(cdp4common.commondata.DefinedThing thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.ParticipantRole":
        CDP4.CommonData.DefinedThing emfParticipantRole =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipantRole();    
        
        emfParticipantRole.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfParticipantRole.setModifiedOn(thing.getModifiedOn());
        
        emfParticipantRole.setName(thing.getName());
        
        emfParticipantRole.setRevisionNumber(thing.getRevisionNumber());
        
        emfParticipantRole.setShortName(thing.getShortName());
        		        
        return emfParticipantRole;   
        
        
        case "cdp4common.sitedirectorydata.EngineeringModelSetup":
        CDP4.CommonData.DefinedThing emfEngineeringModelSetup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEngineeringModelSetup();    
        
        emfEngineeringModelSetup.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfEngineeringModelSetup.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelSetup.setName(thing.getName());
        
        emfEngineeringModelSetup.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModelSetup.setShortName(thing.getShortName());
        		        
        return emfEngineeringModelSetup;   
        
        
        case "cdp4common.sitedirectorydata.Glossary":
        CDP4.CommonData.DefinedThing emfGlossary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createGlossary();    
        
        emfGlossary.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfGlossary.setModifiedOn(thing.getModifiedOn());
        
        emfGlossary.setName(thing.getName());
        
        emfGlossary.setRevisionNumber(thing.getRevisionNumber());
        
        emfGlossary.setShortName(thing.getShortName());
        		        
        return emfGlossary;   
        
        
        
        case "cdp4common.sitedirectorydata.SiteReferenceDataLibrary":
        CDP4.CommonData.DefinedThing emfSiteReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteReferenceDataLibrary();    
        
        emfSiteReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfSiteReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfSiteReferenceDataLibrary.setName(thing.getName());
        
        emfSiteReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteReferenceDataLibrary.setShortName(thing.getShortName());
        		        
        return emfSiteReferenceDataLibrary;   
        
        
        case "cdp4common.sitedirectorydata.ModelReferenceDataLibrary":
        CDP4.CommonData.DefinedThing emfModelReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createModelReferenceDataLibrary();    
        
        emfModelReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfModelReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfModelReferenceDataLibrary.setName(thing.getName());
        
        emfModelReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        
        emfModelReferenceDataLibrary.setShortName(thing.getShortName());
        		        
        return emfModelReferenceDataLibrary;   
        
        
        case "cdp4common.sitedirectorydata.Term":
        CDP4.CommonData.DefinedThing emfTerm =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTerm();    
        
        emfTerm.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfTerm.setModifiedOn(thing.getModifiedOn());
        
        emfTerm.setName(thing.getName());
        
        emfTerm.setRevisionNumber(thing.getRevisionNumber());
        
        emfTerm.setShortName(thing.getShortName());
        		        
        return emfTerm;   
        
        
        case "cdp4common.sitedirectorydata.FileType":
        CDP4.CommonData.DefinedThing emfFileType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createFileType();    
        
        emfFileType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfFileType.setModifiedOn(thing.getModifiedOn());
        
        emfFileType.setName(thing.getName());
        
        emfFileType.setRevisionNumber(thing.getRevisionNumber());
        
        emfFileType.setShortName(thing.getShortName());
        		        
        return emfFileType;   
        
        
        
        case "cdp4common.sitedirectorydata.OrdinalScale":
        CDP4.CommonData.DefinedThing emfOrdinalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrdinalScale();    
        
        emfOrdinalScale.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfOrdinalScale.setModifiedOn(thing.getModifiedOn());
        
        emfOrdinalScale.setName(thing.getName());
        
        emfOrdinalScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfOrdinalScale.setShortName(thing.getShortName());
        		        
        return emfOrdinalScale;   
        
        
        case "cdp4common.sitedirectorydata.RatioScale":
        CDP4.CommonData.DefinedThing emfRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createRatioScale();    
        
        emfRatioScale.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfRatioScale.setName(thing.getName());
        
        emfRatioScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfRatioScale.setShortName(thing.getShortName());
        		        
        return emfRatioScale;   
        
        
        case "cdp4common.sitedirectorydata.CyclicRatioScale":
        CDP4.CommonData.DefinedThing emfCyclicRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCyclicRatioScale();    
        
        emfCyclicRatioScale.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfCyclicRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfCyclicRatioScale.setName(thing.getName());
        
        emfCyclicRatioScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfCyclicRatioScale.setShortName(thing.getShortName());
        		        
        return emfCyclicRatioScale;   
        
        
        case "cdp4common.sitedirectorydata.IntervalScale":
        CDP4.CommonData.DefinedThing emfIntervalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createIntervalScale();    
        
        emfIntervalScale.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfIntervalScale.setModifiedOn(thing.getModifiedOn());
        
        emfIntervalScale.setName(thing.getName());
        
        emfIntervalScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfIntervalScale.setShortName(thing.getShortName());
        		        
        return emfIntervalScale;   
        
        
        case "cdp4common.sitedirectorydata.LogarithmicScale":
        CDP4.CommonData.DefinedThing emfLogarithmicScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLogarithmicScale();    
        
        emfLogarithmicScale.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfLogarithmicScale.setModifiedOn(thing.getModifiedOn());
        
        emfLogarithmicScale.setName(thing.getName());
        
        emfLogarithmicScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfLogarithmicScale.setShortName(thing.getShortName());
        		        
        return emfLogarithmicScale;   
        
        
        case "cdp4common.sitedirectorydata.DomainOfExpertise":
        CDP4.CommonData.DefinedThing emfDomainOfExpertise =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDomainOfExpertise();    
        
        emfDomainOfExpertise.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfDomainOfExpertise.setModifiedOn(thing.getModifiedOn());
        
        emfDomainOfExpertise.setName(thing.getName());
        
        emfDomainOfExpertise.setRevisionNumber(thing.getRevisionNumber());
        
        emfDomainOfExpertise.setShortName(thing.getShortName());
        		        
        return emfDomainOfExpertise;   
        
        
        
        case "cdp4common.sitedirectorydata.CompoundParameterType":
        CDP4.CommonData.DefinedThing emfCompoundParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCompoundParameterType();    
        
        emfCompoundParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfCompoundParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfCompoundParameterType.setName(thing.getName());
        
        emfCompoundParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfCompoundParameterType.setShortName(thing.getShortName());
        		        
        return emfCompoundParameterType;   
        
        
        case "cdp4common.sitedirectorydata.ArrayParameterType":
        CDP4.CommonData.DefinedThing emfArrayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createArrayParameterType();    
        
        emfArrayParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfArrayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfArrayParameterType.setName(thing.getName());
        
        emfArrayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfArrayParameterType.setShortName(thing.getShortName());
        		        
        return emfArrayParameterType;   
        
        
        
        case "cdp4common.sitedirectorydata.EnumerationParameterType":
        CDP4.CommonData.DefinedThing emfEnumerationParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationParameterType();    
        
        emfEnumerationParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfEnumerationParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationParameterType.setName(thing.getName());
        
        emfEnumerationParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfEnumerationParameterType.setShortName(thing.getShortName());
        		        
        return emfEnumerationParameterType;   
        
        
        case "cdp4common.sitedirectorydata.BooleanParameterType":
        CDP4.CommonData.DefinedThing emfBooleanParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBooleanParameterType();    
        
        emfBooleanParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfBooleanParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfBooleanParameterType.setName(thing.getName());
        
        emfBooleanParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfBooleanParameterType.setShortName(thing.getShortName());
        		        
        return emfBooleanParameterType;   
        
        
        case "cdp4common.sitedirectorydata.DateParameterType":
        CDP4.CommonData.DefinedThing emfDateParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateParameterType();    
        
        emfDateParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfDateParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateParameterType.setName(thing.getName());
        
        emfDateParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateParameterType.setShortName(thing.getShortName());
        		        
        return emfDateParameterType;   
        
        
        case "cdp4common.sitedirectorydata.TextParameterType":
        CDP4.CommonData.DefinedThing emfTextParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTextParameterType();    
        
        emfTextParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfTextParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTextParameterType.setName(thing.getName());
        
        emfTextParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTextParameterType.setShortName(thing.getShortName());
        		        
        return emfTextParameterType;   
        
        
        case "cdp4common.sitedirectorydata.DateTimeParameterType":
        CDP4.CommonData.DefinedThing emfDateTimeParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateTimeParameterType();    
        
        emfDateTimeParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfDateTimeParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateTimeParameterType.setName(thing.getName());
        
        emfDateTimeParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateTimeParameterType.setShortName(thing.getShortName());
        		        
        return emfDateTimeParameterType;   
        
        
        case "cdp4common.sitedirectorydata.TimeOfDayParameterType":
        CDP4.CommonData.DefinedThing emfTimeOfDayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTimeOfDayParameterType();    
        
        emfTimeOfDayParameterType.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfTimeOfDayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTimeOfDayParameterType.setName(thing.getName());
        
        emfTimeOfDayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTimeOfDayParameterType.setShortName(thing.getShortName());
        		        
        return emfTimeOfDayParameterType;   
        
        
        
        case "cdp4common.sitedirectorydata.SpecializedQuantityKind":
        CDP4.CommonData.DefinedThing emfSpecializedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSpecializedQuantityKind();    
        
        emfSpecializedQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfSpecializedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSpecializedQuantityKind.setName(thing.getName());
        
        emfSpecializedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSpecializedQuantityKind.setShortName(thing.getShortName());
        		        
        return emfSpecializedQuantityKind;   
        
        
        case "cdp4common.sitedirectorydata.SimpleQuantityKind":
        CDP4.CommonData.DefinedThing emfSimpleQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleQuantityKind();    
        
        emfSimpleQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfSimpleQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleQuantityKind.setName(thing.getName());
        
        emfSimpleQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleQuantityKind.setShortName(thing.getShortName());
        		        
        return emfSimpleQuantityKind;   
        
        
        case "cdp4common.sitedirectorydata.DerivedQuantityKind":
        CDP4.CommonData.DefinedThing emfDerivedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedQuantityKind();    
        
        emfDerivedQuantityKind.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfDerivedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedQuantityKind.setName(thing.getName());
        
        emfDerivedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedQuantityKind.setShortName(thing.getShortName());
        		        
        return emfDerivedQuantityKind;   
        
        
        case "cdp4common.sitedirectorydata.ScaleValueDefinition":
        CDP4.CommonData.DefinedThing emfScaleValueDefinition =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createScaleValueDefinition();    
        
        emfScaleValueDefinition.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfScaleValueDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfScaleValueDefinition.setName(thing.getName());
        
        emfScaleValueDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfScaleValueDefinition.setShortName(thing.getShortName());
        		        
        return emfScaleValueDefinition;   
        
        
        
        case "cdp4common.sitedirectorydata.DerivedUnit":
        CDP4.CommonData.DefinedThing emfDerivedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedUnit();    
        
        emfDerivedUnit.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfDerivedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedUnit.setName(thing.getName());
        
        emfDerivedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedUnit.setShortName(thing.getShortName());
        		        
        return emfDerivedUnit;   
        
        
        
        case "cdp4common.sitedirectorydata.LinearConversionUnit":
        CDP4.CommonData.DefinedThing emfLinearConversionUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLinearConversionUnit();    
        
        emfLinearConversionUnit.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfLinearConversionUnit.setModifiedOn(thing.getModifiedOn());
        
        emfLinearConversionUnit.setName(thing.getName());
        
        emfLinearConversionUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfLinearConversionUnit.setShortName(thing.getShortName());
        		        
        return emfLinearConversionUnit;   
        
        
        case "cdp4common.sitedirectorydata.PrefixedUnit":
        CDP4.CommonData.DefinedThing emfPrefixedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPrefixedUnit();    
        
        emfPrefixedUnit.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfPrefixedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfPrefixedUnit.setName(thing.getName());
        
        emfPrefixedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfPrefixedUnit.setShortName(thing.getShortName());
        		        
        return emfPrefixedUnit;   
        
        
        case "cdp4common.sitedirectorydata.SimpleUnit":
        CDP4.CommonData.DefinedThing emfSimpleUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleUnit();    
        
        emfSimpleUnit.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfSimpleUnit.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleUnit.setName(thing.getName());
        
        emfSimpleUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleUnit.setShortName(thing.getShortName());
        		        
        return emfSimpleUnit;   
        
        
        case "cdp4common.sitedirectorydata.Category":
        CDP4.CommonData.DefinedThing emfCategory =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCategory();    
        
        emfCategory.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfCategory.setModifiedOn(thing.getModifiedOn());
        
        emfCategory.setName(thing.getName());
        
        emfCategory.setRevisionNumber(thing.getRevisionNumber());
        
        emfCategory.setShortName(thing.getShortName());
        		        
        return emfCategory;   
        
        
        case "cdp4common.sitedirectorydata.UnitPrefix":
        CDP4.CommonData.DefinedThing emfUnitPrefix =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createUnitPrefix();    
        
        emfUnitPrefix.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfUnitPrefix.setModifiedOn(thing.getModifiedOn());
        
        emfUnitPrefix.setName(thing.getName());
        
        emfUnitPrefix.setRevisionNumber(thing.getRevisionNumber());
        
        emfUnitPrefix.setShortName(thing.getShortName());
        		        
        return emfUnitPrefix;   
        
        
        
        case "cdp4common.sitedirectorydata.ReferencerRule":
        CDP4.CommonData.DefinedThing emfReferencerRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferencerRule();    
        
        emfReferencerRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfReferencerRule.setModifiedOn(thing.getModifiedOn());
        
        emfReferencerRule.setName(thing.getName());
        
        emfReferencerRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfReferencerRule.setShortName(thing.getShortName());
        		        
        return emfReferencerRule;   
        
        
        case "cdp4common.sitedirectorydata.BinaryRelationshipRule":
        CDP4.CommonData.DefinedThing emfBinaryRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBinaryRelationshipRule();    
        
        emfBinaryRelationshipRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfBinaryRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryRelationshipRule.setName(thing.getName());
        
        emfBinaryRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfBinaryRelationshipRule.setShortName(thing.getShortName());
        		        
        return emfBinaryRelationshipRule;   
        
        
        case "cdp4common.sitedirectorydata.MultiRelationshipRule":
        CDP4.CommonData.DefinedThing emfMultiRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createMultiRelationshipRule();    
        
        emfMultiRelationshipRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfMultiRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfMultiRelationshipRule.setName(thing.getName());
        
        emfMultiRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfMultiRelationshipRule.setShortName(thing.getShortName());
        		        
        return emfMultiRelationshipRule;   
        
        
        case "cdp4common.sitedirectorydata.DecompositionRule":
        CDP4.CommonData.DefinedThing emfDecompositionRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDecompositionRule();    
        
        emfDecompositionRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfDecompositionRule.setModifiedOn(thing.getModifiedOn());
        
        emfDecompositionRule.setName(thing.getName());
        
        emfDecompositionRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfDecompositionRule.setShortName(thing.getShortName());
        		        
        return emfDecompositionRule;   
        
        
        case "cdp4common.sitedirectorydata.ParameterizedCategoryRule":
        CDP4.CommonData.DefinedThing emfParameterizedCategoryRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParameterizedCategoryRule();    
        
        emfParameterizedCategoryRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfParameterizedCategoryRule.setModifiedOn(thing.getModifiedOn());
        
        emfParameterizedCategoryRule.setName(thing.getName());
        
        emfParameterizedCategoryRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterizedCategoryRule.setShortName(thing.getShortName());
        		        
        return emfParameterizedCategoryRule;   
        
        
        case "cdp4common.sitedirectorydata.EnumerationValueDefinition":
        CDP4.CommonData.DefinedThing emfEnumerationValueDefinition =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationValueDefinition();    
        
        emfEnumerationValueDefinition.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfEnumerationValueDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationValueDefinition.setName(thing.getName());
        
        emfEnumerationValueDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfEnumerationValueDefinition.setShortName(thing.getShortName());
        		        
        return emfEnumerationValueDefinition;   
        
        
        case "cdp4common.sitedirectorydata.PersonRole":
        CDP4.CommonData.DefinedThing emfPersonRole =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPersonRole();    
        
        emfPersonRole.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfPersonRole.setModifiedOn(thing.getModifiedOn());
        
        emfPersonRole.setName(thing.getName());
        
        emfPersonRole.setRevisionNumber(thing.getRevisionNumber());
        
        emfPersonRole.setShortName(thing.getShortName());
        		        
        return emfPersonRole;   
        
        
        case "cdp4common.sitedirectorydata.DomainOfExpertiseGroup":
        CDP4.CommonData.DefinedThing emfDomainOfExpertiseGroup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDomainOfExpertiseGroup();    
        
        emfDomainOfExpertiseGroup.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfDomainOfExpertiseGroup.setModifiedOn(thing.getModifiedOn());
        
        emfDomainOfExpertiseGroup.setName(thing.getName());
        
        emfDomainOfExpertiseGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfDomainOfExpertiseGroup.setShortName(thing.getShortName());
        		        
        return emfDomainOfExpertiseGroup;   
        
        
        case "cdp4common.sitedirectorydata.ReferenceSource":
        CDP4.CommonData.DefinedThing emfReferenceSource =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferenceSource();    
        
        emfReferenceSource.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfReferenceSource.setModifiedOn(thing.getModifiedOn());
        
        emfReferenceSource.setName(thing.getName());
        
        emfReferenceSource.setRevisionNumber(thing.getRevisionNumber());
        
        emfReferenceSource.setShortName(thing.getShortName());
        		        
        return emfReferenceSource;   
        
        
        case "cdp4common.sitedirectorydata.Constant":
        CDP4.CommonData.DefinedThing emfConstant =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createConstant();    
        
        emfConstant.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfConstant.setModifiedOn(thing.getModifiedOn());
        
        emfConstant.setName(thing.getName());
        
        emfConstant.setRevisionNumber(thing.getRevisionNumber());
        
        emfConstant.setShortName(thing.getShortName());
        		        
        return emfConstant;   
        
        
        case "cdp4common.engineeringmodeldata.PossibleFiniteState":
        CDP4.CommonData.DefinedThing emfPossibleFiniteState =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPossibleFiniteState();    
        
        emfPossibleFiniteState.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfPossibleFiniteState.setModifiedOn(thing.getModifiedOn());
        
        emfPossibleFiniteState.setName(thing.getName());
        
        emfPossibleFiniteState.setRevisionNumber(thing.getRevisionNumber());
        
        emfPossibleFiniteState.setShortName(thing.getShortName());
        		        
        return emfPossibleFiniteState;   
        
        
        case "cdp4common.engineeringmodeldata.Option":
        CDP4.CommonData.DefinedThing emfOption =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createOption();    
        
        emfOption.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfOption.setModifiedOn(thing.getModifiedOn());
        
        emfOption.setName(thing.getName());
        
        emfOption.setRevisionNumber(thing.getRevisionNumber());
        
        emfOption.setShortName(thing.getShortName());
        		        
        return emfOption;   
        
        
        case "cdp4common.engineeringmodeldata.PossibleFiniteStateList":
        CDP4.CommonData.DefinedThing emfPossibleFiniteStateList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPossibleFiniteStateList();    
        
        emfPossibleFiniteStateList.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfPossibleFiniteStateList.setModifiedOn(thing.getModifiedOn());
        
        emfPossibleFiniteStateList.setName(thing.getName());
        
        emfPossibleFiniteStateList.setRevisionNumber(thing.getRevisionNumber());
        
        emfPossibleFiniteStateList.setShortName(thing.getShortName());
        		        
        return emfPossibleFiniteStateList;   
        
        
        
        case "cdp4common.engineeringmodeldata.ElementDefinition":
        CDP4.CommonData.DefinedThing emfElementDefinition =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementDefinition();    
        
        emfElementDefinition.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfElementDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfElementDefinition.setName(thing.getName());
        
        emfElementDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfElementDefinition.setShortName(thing.getShortName());
        		        
        return emfElementDefinition;   
        
        
        case "cdp4common.engineeringmodeldata.ElementUsage":
        CDP4.CommonData.DefinedThing emfElementUsage =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementUsage();    
        
        emfElementUsage.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfElementUsage.setModifiedOn(thing.getModifiedOn());
        
        emfElementUsage.setName(thing.getName());
        
        emfElementUsage.setRevisionNumber(thing.getRevisionNumber());
        
        emfElementUsage.setShortName(thing.getShortName());
        		        
        return emfElementUsage;   
        
        
        
        case "cdp4common.engineeringmodeldata.RequirementsSpecification":
        CDP4.CommonData.DefinedThing emfRequirementsSpecification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsSpecification();    
        
        emfRequirementsSpecification.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfRequirementsSpecification.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsSpecification.setName(thing.getName());
        
        emfRequirementsSpecification.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsSpecification.setShortName(thing.getShortName());
        		        
        return emfRequirementsSpecification;   
        
        
        case "cdp4common.engineeringmodeldata.RequirementsGroup":
        CDP4.CommonData.DefinedThing emfRequirementsGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsGroup();    
        
        emfRequirementsGroup.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfRequirementsGroup.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsGroup.setName(thing.getName());
        
        emfRequirementsGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsGroup.setShortName(thing.getShortName());
        		        
        return emfRequirementsGroup;   
        
        
        
        case "cdp4common.engineeringmodeldata.Requirement":
        CDP4.CommonData.DefinedThing emfRequirement =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirement();    
        
        emfRequirement.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfRequirement.setModifiedOn(thing.getModifiedOn());
        
        emfRequirement.setName(thing.getName());
        
        emfRequirement.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirement.setShortName(thing.getShortName());
        		        
        return emfRequirement;   
        
        
        case "cdp4common.engineeringmodeldata.RuleVerificationList":
        CDP4.CommonData.DefinedThing emfRuleVerificationList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRuleVerificationList();    
        
        emfRuleVerificationList.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfRuleVerificationList.setModifiedOn(thing.getModifiedOn());
        
        emfRuleVerificationList.setName(thing.getName());
        
        emfRuleVerificationList.setRevisionNumber(thing.getRevisionNumber());
        
        emfRuleVerificationList.setShortName(thing.getShortName());
        		        
        return emfRuleVerificationList;   
        
        
        case "cdp4common.engineeringmodeldata.Goal":
        CDP4.CommonData.DefinedThing emfGoal =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createGoal();    
        
        emfGoal.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfGoal.setModifiedOn(thing.getModifiedOn());
        
        emfGoal.setName(thing.getName());
        
        emfGoal.setRevisionNumber(thing.getRevisionNumber());
        
        emfGoal.setShortName(thing.getShortName());
        		        
        return emfGoal;   
        
        
        case "cdp4common.engineeringmodeldata.Stakeholder":
        CDP4.CommonData.DefinedThing emfStakeholder =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeholder();    
        
        emfStakeholder.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfStakeholder.setModifiedOn(thing.getModifiedOn());
        
        emfStakeholder.setName(thing.getName());
        
        emfStakeholder.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeholder.setShortName(thing.getShortName());
        		        
        return emfStakeholder;   
        
        
        case "cdp4common.engineeringmodeldata.ValueGroup":
        CDP4.CommonData.DefinedThing emfValueGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createValueGroup();    
        
        emfValueGroup.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfValueGroup.setModifiedOn(thing.getModifiedOn());
        
        emfValueGroup.setName(thing.getName());
        
        emfValueGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfValueGroup.setShortName(thing.getShortName());
        		        
        return emfValueGroup;   
        
        
        case "cdp4common.engineeringmodeldata.StakeholderValue":
        CDP4.CommonData.DefinedThing emfStakeholderValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeholderValue();    
        
        emfStakeholderValue.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfStakeholderValue.setModifiedOn(thing.getModifiedOn());
        
        emfStakeholderValue.setName(thing.getName());
        
        emfStakeholderValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeholderValue.setShortName(thing.getShortName());
        		        
        return emfStakeholderValue;   
        
        
        case "cdp4common.engineeringmodeldata.StakeHolderValueMap":
        CDP4.CommonData.DefinedThing emfStakeHolderValueMap =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeHolderValueMap();    
        
        emfStakeHolderValueMap.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfStakeHolderValueMap.setModifiedOn(thing.getModifiedOn());
        
        emfStakeHolderValueMap.setName(thing.getName());
        
        emfStakeHolderValueMap.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeHolderValueMap.setShortName(thing.getShortName());
        		        
        return emfStakeHolderValueMap;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.commondata.DefinedThing toPojo(CDP4.CommonData.DefinedThing emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.ParticipantRole":                
        cdp4common.commondata.DefinedThing pojoParticipantRole = new cdp4common.sitedirectorydata.ParticipantRole();	    
        
        pojoParticipantRole.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParticipantRole.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParticipantRole.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParticipantRole.setName(emfThing.getName());
        
        pojoParticipantRole.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParticipantRole.setShortName(emfThing.getShortName());
        		        
        return pojoParticipantRole;   
        
        
        case "CDP4.sitedirectorydata.EngineeringModelSetup":                
        cdp4common.commondata.DefinedThing pojoEngineeringModelSetup = new cdp4common.sitedirectorydata.EngineeringModelSetup();	    
        
        pojoEngineeringModelSetup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelSetup.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelSetup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelSetup.setName(emfThing.getName());
        
        pojoEngineeringModelSetup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEngineeringModelSetup.setShortName(emfThing.getShortName());
        		        
        return pojoEngineeringModelSetup;   
        
        
        case "CDP4.sitedirectorydata.Glossary":                
        cdp4common.commondata.DefinedThing pojoGlossary = new cdp4common.sitedirectorydata.Glossary();	    
        
        pojoGlossary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoGlossary.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGlossary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoGlossary.setName(emfThing.getName());
        
        pojoGlossary.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoGlossary.setShortName(emfThing.getShortName());
        		        
        return pojoGlossary;   
        
        
        
        case "CDP4.sitedirectorydata.SiteReferenceDataLibrary":                
        cdp4common.commondata.DefinedThing pojoSiteReferenceDataLibrary = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary();	    
        
        pojoSiteReferenceDataLibrary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteReferenceDataLibrary.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteReferenceDataLibrary.setName(emfThing.getName());
        
        pojoSiteReferenceDataLibrary.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteReferenceDataLibrary.setShortName(emfThing.getShortName());
        		        
        return pojoSiteReferenceDataLibrary;   
        
        
        case "CDP4.sitedirectorydata.ModelReferenceDataLibrary":                
        cdp4common.commondata.DefinedThing pojoModelReferenceDataLibrary = new cdp4common.sitedirectorydata.ModelReferenceDataLibrary();	    
        
        pojoModelReferenceDataLibrary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModelReferenceDataLibrary.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModelReferenceDataLibrary.setName(emfThing.getName());
        
        pojoModelReferenceDataLibrary.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoModelReferenceDataLibrary.setShortName(emfThing.getShortName());
        		        
        return pojoModelReferenceDataLibrary;   
        
        
        case "CDP4.sitedirectorydata.Term":                
        cdp4common.commondata.DefinedThing pojoTerm = new cdp4common.sitedirectorydata.Term();	    
        
        pojoTerm.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTerm.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTerm.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTerm.setName(emfThing.getName());
        
        pojoTerm.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTerm.setShortName(emfThing.getShortName());
        		        
        return pojoTerm;   
        
        
        case "CDP4.sitedirectorydata.FileType":                
        cdp4common.commondata.DefinedThing pojoFileType = new cdp4common.sitedirectorydata.FileType();	    
        
        pojoFileType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoFileType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoFileType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoFileType.setName(emfThing.getName());
        
        pojoFileType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoFileType.setShortName(emfThing.getShortName());
        		        
        return pojoFileType;   
        
        
        
        case "CDP4.sitedirectorydata.OrdinalScale":                
        cdp4common.commondata.DefinedThing pojoOrdinalScale = new cdp4common.sitedirectorydata.OrdinalScale();	    
        
        pojoOrdinalScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrdinalScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrdinalScale.setName(emfThing.getName());
        
        pojoOrdinalScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOrdinalScale.setShortName(emfThing.getShortName());
        		        
        return pojoOrdinalScale;   
        
        
        case "CDP4.sitedirectorydata.RatioScale":                
        cdp4common.commondata.DefinedThing pojoRatioScale = new cdp4common.sitedirectorydata.RatioScale();	    
        
        pojoRatioScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRatioScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRatioScale.setName(emfThing.getName());
        
        pojoRatioScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRatioScale.setShortName(emfThing.getShortName());
        		        
        return pojoRatioScale;   
        
        
        case "CDP4.sitedirectorydata.CyclicRatioScale":                
        cdp4common.commondata.DefinedThing pojoCyclicRatioScale = new cdp4common.sitedirectorydata.CyclicRatioScale();	    
        
        pojoCyclicRatioScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCyclicRatioScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCyclicRatioScale.setName(emfThing.getName());
        
        pojoCyclicRatioScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCyclicRatioScale.setShortName(emfThing.getShortName());
        		        
        return pojoCyclicRatioScale;   
        
        
        case "CDP4.sitedirectorydata.IntervalScale":                
        cdp4common.commondata.DefinedThing pojoIntervalScale = new cdp4common.sitedirectorydata.IntervalScale();	    
        
        pojoIntervalScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIntervalScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIntervalScale.setName(emfThing.getName());
        
        pojoIntervalScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoIntervalScale.setShortName(emfThing.getShortName());
        		        
        return pojoIntervalScale;   
        
        
        case "CDP4.sitedirectorydata.LogarithmicScale":                
        cdp4common.commondata.DefinedThing pojoLogarithmicScale = new cdp4common.sitedirectorydata.LogarithmicScale();	    
        
        pojoLogarithmicScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLogarithmicScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLogarithmicScale.setName(emfThing.getName());
        
        pojoLogarithmicScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoLogarithmicScale.setShortName(emfThing.getShortName());
        		        
        return pojoLogarithmicScale;   
        
        
        case "CDP4.sitedirectorydata.DomainOfExpertise":                
        cdp4common.commondata.DefinedThing pojoDomainOfExpertise = new cdp4common.sitedirectorydata.DomainOfExpertise();	    
        
        pojoDomainOfExpertise.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainOfExpertise.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertise.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainOfExpertise.setName(emfThing.getName());
        
        pojoDomainOfExpertise.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDomainOfExpertise.setShortName(emfThing.getShortName());
        		        
        return pojoDomainOfExpertise;   
        
        
        
        case "CDP4.sitedirectorydata.CompoundParameterType":                
        cdp4common.commondata.DefinedThing pojoCompoundParameterType = new cdp4common.sitedirectorydata.CompoundParameterType();	    
        
        pojoCompoundParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCompoundParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCompoundParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCompoundParameterType.setName(emfThing.getName());
        
        pojoCompoundParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCompoundParameterType.setShortName(emfThing.getShortName());
        		        
        return pojoCompoundParameterType;   
        
        
        case "CDP4.sitedirectorydata.ArrayParameterType":                
        cdp4common.commondata.DefinedThing pojoArrayParameterType = new cdp4common.sitedirectorydata.ArrayParameterType();	    
        
        pojoArrayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoArrayParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoArrayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoArrayParameterType.setName(emfThing.getName());
        
        pojoArrayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoArrayParameterType.setShortName(emfThing.getShortName());
        		        
        return pojoArrayParameterType;   
        
        
        
        case "CDP4.sitedirectorydata.EnumerationParameterType":                
        cdp4common.commondata.DefinedThing pojoEnumerationParameterType = new cdp4common.sitedirectorydata.EnumerationParameterType();	    
        
        pojoEnumerationParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEnumerationParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEnumerationParameterType.setName(emfThing.getName());
        
        pojoEnumerationParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEnumerationParameterType.setShortName(emfThing.getShortName());
        		        
        return pojoEnumerationParameterType;   
        
        
        case "CDP4.sitedirectorydata.BooleanParameterType":                
        cdp4common.commondata.DefinedThing pojoBooleanParameterType = new cdp4common.sitedirectorydata.BooleanParameterType();	    
        
        pojoBooleanParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBooleanParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBooleanParameterType.setName(emfThing.getName());
        
        pojoBooleanParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBooleanParameterType.setShortName(emfThing.getShortName());
        		        
        return pojoBooleanParameterType;   
        
        
        case "CDP4.sitedirectorydata.DateParameterType":                
        cdp4common.commondata.DefinedThing pojoDateParameterType = new cdp4common.sitedirectorydata.DateParameterType();	    
        
        pojoDateParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateParameterType.setName(emfThing.getName());
        
        pojoDateParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDateParameterType.setShortName(emfThing.getShortName());
        		        
        return pojoDateParameterType;   
        
        
        case "CDP4.sitedirectorydata.TextParameterType":                
        cdp4common.commondata.DefinedThing pojoTextParameterType = new cdp4common.sitedirectorydata.TextParameterType();	    
        
        pojoTextParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTextParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTextParameterType.setName(emfThing.getName());
        
        pojoTextParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTextParameterType.setShortName(emfThing.getShortName());
        		        
        return pojoTextParameterType;   
        
        
        case "CDP4.sitedirectorydata.DateTimeParameterType":                
        cdp4common.commondata.DefinedThing pojoDateTimeParameterType = new cdp4common.sitedirectorydata.DateTimeParameterType();	    
        
        pojoDateTimeParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateTimeParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateTimeParameterType.setName(emfThing.getName());
        
        pojoDateTimeParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDateTimeParameterType.setShortName(emfThing.getShortName());
        		        
        return pojoDateTimeParameterType;   
        
        
        case "CDP4.sitedirectorydata.TimeOfDayParameterType":                
        cdp4common.commondata.DefinedThing pojoTimeOfDayParameterType = new cdp4common.sitedirectorydata.TimeOfDayParameterType();	    
        
        pojoTimeOfDayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTimeOfDayParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTimeOfDayParameterType.setName(emfThing.getName());
        
        pojoTimeOfDayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTimeOfDayParameterType.setShortName(emfThing.getShortName());
        		        
        return pojoTimeOfDayParameterType;   
        
        
        
        case "CDP4.sitedirectorydata.SpecializedQuantityKind":                
        cdp4common.commondata.DefinedThing pojoSpecializedQuantityKind = new cdp4common.sitedirectorydata.SpecializedQuantityKind();	    
        
        pojoSpecializedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSpecializedQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSpecializedQuantityKind.setName(emfThing.getName());
        
        pojoSpecializedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSpecializedQuantityKind.setShortName(emfThing.getShortName());
        		        
        return pojoSpecializedQuantityKind;   
        
        
        case "CDP4.sitedirectorydata.SimpleQuantityKind":                
        cdp4common.commondata.DefinedThing pojoSimpleQuantityKind = new cdp4common.sitedirectorydata.SimpleQuantityKind();	    
        
        pojoSimpleQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleQuantityKind.setName(emfThing.getName());
        
        pojoSimpleQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleQuantityKind.setShortName(emfThing.getShortName());
        		        
        return pojoSimpleQuantityKind;   
        
        
        case "CDP4.sitedirectorydata.DerivedQuantityKind":                
        cdp4common.commondata.DefinedThing pojoDerivedQuantityKind = new cdp4common.sitedirectorydata.DerivedQuantityKind();	    
        
        pojoDerivedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedQuantityKind.setName(emfThing.getName());
        
        pojoDerivedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDerivedQuantityKind.setShortName(emfThing.getShortName());
        		        
        return pojoDerivedQuantityKind;   
        
        
        case "CDP4.sitedirectorydata.ScaleValueDefinition":                
        cdp4common.commondata.DefinedThing pojoScaleValueDefinition = new cdp4common.sitedirectorydata.ScaleValueDefinition();	    
        
        pojoScaleValueDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoScaleValueDefinition.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoScaleValueDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoScaleValueDefinition.setName(emfThing.getName());
        
        pojoScaleValueDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoScaleValueDefinition.setShortName(emfThing.getShortName());
        		        
        return pojoScaleValueDefinition;   
        
        
        
        case "CDP4.sitedirectorydata.DerivedUnit":                
        cdp4common.commondata.DefinedThing pojoDerivedUnit = new cdp4common.sitedirectorydata.DerivedUnit();	    
        
        pojoDerivedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedUnit.setName(emfThing.getName());
        
        pojoDerivedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDerivedUnit.setShortName(emfThing.getShortName());
        		        
        return pojoDerivedUnit;   
        
        
        
        case "CDP4.sitedirectorydata.LinearConversionUnit":                
        cdp4common.commondata.DefinedThing pojoLinearConversionUnit = new cdp4common.sitedirectorydata.LinearConversionUnit();	    
        
        pojoLinearConversionUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLinearConversionUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLinearConversionUnit.setName(emfThing.getName());
        
        pojoLinearConversionUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoLinearConversionUnit.setShortName(emfThing.getShortName());
        		        
        return pojoLinearConversionUnit;   
        
        
        case "CDP4.sitedirectorydata.PrefixedUnit":                
        cdp4common.commondata.DefinedThing pojoPrefixedUnit = new cdp4common.sitedirectorydata.PrefixedUnit();	    
        
        pojoPrefixedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPrefixedUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPrefixedUnit.setName(emfThing.getName());
        
        pojoPrefixedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPrefixedUnit.setShortName(emfThing.getShortName());
        		        
        return pojoPrefixedUnit;   
        
        
        case "CDP4.sitedirectorydata.SimpleUnit":                
        cdp4common.commondata.DefinedThing pojoSimpleUnit = new cdp4common.sitedirectorydata.SimpleUnit();	    
        
        pojoSimpleUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleUnit.setName(emfThing.getName());
        
        pojoSimpleUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleUnit.setShortName(emfThing.getShortName());
        		        
        return pojoSimpleUnit;   
        
        
        case "CDP4.sitedirectorydata.Category":                
        cdp4common.commondata.DefinedThing pojoCategory = new cdp4common.sitedirectorydata.Category();	    
        
        pojoCategory.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCategory.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCategory.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCategory.setName(emfThing.getName());
        
        pojoCategory.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCategory.setShortName(emfThing.getShortName());
        		        
        return pojoCategory;   
        
        
        case "CDP4.sitedirectorydata.UnitPrefix":                
        cdp4common.commondata.DefinedThing pojoUnitPrefix = new cdp4common.sitedirectorydata.UnitPrefix();	    
        
        pojoUnitPrefix.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUnitPrefix.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUnitPrefix.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUnitPrefix.setName(emfThing.getName());
        
        pojoUnitPrefix.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoUnitPrefix.setShortName(emfThing.getShortName());
        		        
        return pojoUnitPrefix;   
        
        
        
        case "CDP4.sitedirectorydata.ReferencerRule":                
        cdp4common.commondata.DefinedThing pojoReferencerRule = new cdp4common.sitedirectorydata.ReferencerRule();	    
        
        pojoReferencerRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReferencerRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReferencerRule.setName(emfThing.getName());
        
        pojoReferencerRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoReferencerRule.setShortName(emfThing.getShortName());
        		        
        return pojoReferencerRule;   
        
        
        case "CDP4.sitedirectorydata.BinaryRelationshipRule":                
        cdp4common.commondata.DefinedThing pojoBinaryRelationshipRule = new cdp4common.sitedirectorydata.BinaryRelationshipRule();	    
        
        pojoBinaryRelationshipRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryRelationshipRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryRelationshipRule.setName(emfThing.getName());
        
        pojoBinaryRelationshipRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBinaryRelationshipRule.setShortName(emfThing.getShortName());
        		        
        return pojoBinaryRelationshipRule;   
        
        
        case "CDP4.sitedirectorydata.MultiRelationshipRule":                
        cdp4common.commondata.DefinedThing pojoMultiRelationshipRule = new cdp4common.sitedirectorydata.MultiRelationshipRule();	    
        
        pojoMultiRelationshipRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMultiRelationshipRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMultiRelationshipRule.setName(emfThing.getName());
        
        pojoMultiRelationshipRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoMultiRelationshipRule.setShortName(emfThing.getShortName());
        		        
        return pojoMultiRelationshipRule;   
        
        
        case "CDP4.sitedirectorydata.DecompositionRule":                
        cdp4common.commondata.DefinedThing pojoDecompositionRule = new cdp4common.sitedirectorydata.DecompositionRule();	    
        
        pojoDecompositionRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDecompositionRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDecompositionRule.setName(emfThing.getName());
        
        pojoDecompositionRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDecompositionRule.setShortName(emfThing.getShortName());
        		        
        return pojoDecompositionRule;   
        
        
        case "CDP4.sitedirectorydata.ParameterizedCategoryRule":                
        cdp4common.commondata.DefinedThing pojoParameterizedCategoryRule = new cdp4common.sitedirectorydata.ParameterizedCategoryRule();	    
        
        pojoParameterizedCategoryRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterizedCategoryRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterizedCategoryRule.setName(emfThing.getName());
        
        pojoParameterizedCategoryRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterizedCategoryRule.setShortName(emfThing.getShortName());
        		        
        return pojoParameterizedCategoryRule;   
        
        
        case "CDP4.sitedirectorydata.EnumerationValueDefinition":                
        cdp4common.commondata.DefinedThing pojoEnumerationValueDefinition = new cdp4common.sitedirectorydata.EnumerationValueDefinition();	    
        
        pojoEnumerationValueDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEnumerationValueDefinition.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationValueDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEnumerationValueDefinition.setName(emfThing.getName());
        
        pojoEnumerationValueDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEnumerationValueDefinition.setShortName(emfThing.getShortName());
        		        
        return pojoEnumerationValueDefinition;   
        
        
        case "CDP4.sitedirectorydata.PersonRole":                
        cdp4common.commondata.DefinedThing pojoPersonRole = new cdp4common.sitedirectorydata.PersonRole();	    
        
        pojoPersonRole.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPersonRole.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPersonRole.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPersonRole.setName(emfThing.getName());
        
        pojoPersonRole.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPersonRole.setShortName(emfThing.getShortName());
        		        
        return pojoPersonRole;   
        
        
        case "CDP4.sitedirectorydata.DomainOfExpertiseGroup":                
        cdp4common.commondata.DefinedThing pojoDomainOfExpertiseGroup = new cdp4common.sitedirectorydata.DomainOfExpertiseGroup();	    
        
        pojoDomainOfExpertiseGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainOfExpertiseGroup.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainOfExpertiseGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainOfExpertiseGroup.setName(emfThing.getName());
        
        pojoDomainOfExpertiseGroup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDomainOfExpertiseGroup.setShortName(emfThing.getShortName());
        		        
        return pojoDomainOfExpertiseGroup;   
        
        
        case "CDP4.sitedirectorydata.ReferenceSource":                
        cdp4common.commondata.DefinedThing pojoReferenceSource = new cdp4common.sitedirectorydata.ReferenceSource();	    
        
        pojoReferenceSource.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReferenceSource.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferenceSource.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReferenceSource.setName(emfThing.getName());
        
        pojoReferenceSource.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoReferenceSource.setShortName(emfThing.getShortName());
        		        
        return pojoReferenceSource;   
        
        
        case "CDP4.sitedirectorydata.Constant":                
        cdp4common.commondata.DefinedThing pojoConstant = new cdp4common.sitedirectorydata.Constant();	    
        
        pojoConstant.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoConstant.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoConstant.setModifiedOn(emfThing.getModifiedOn());
        
        pojoConstant.setName(emfThing.getName());
        
        pojoConstant.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoConstant.setShortName(emfThing.getShortName());
        		        
        return pojoConstant;   
        
        
        case "CDP4.engineeringmodeldata.PossibleFiniteState":                
        cdp4common.commondata.DefinedThing pojoPossibleFiniteState = new cdp4common.engineeringmodeldata.PossibleFiniteState();	    
        
        pojoPossibleFiniteState.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPossibleFiniteState.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteState.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPossibleFiniteState.setName(emfThing.getName());
        
        pojoPossibleFiniteState.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPossibleFiniteState.setShortName(emfThing.getShortName());
        		        
        return pojoPossibleFiniteState;   
        
        
        case "CDP4.engineeringmodeldata.Option":                
        cdp4common.commondata.DefinedThing pojoOption = new cdp4common.engineeringmodeldata.Option();	    
        
        pojoOption.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOption.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOption.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOption.setName(emfThing.getName());
        
        pojoOption.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOption.setShortName(emfThing.getShortName());
        		        
        return pojoOption;   
        
        
        case "CDP4.engineeringmodeldata.PossibleFiniteStateList":                
        cdp4common.commondata.DefinedThing pojoPossibleFiniteStateList = new cdp4common.engineeringmodeldata.PossibleFiniteStateList();	    
        
        pojoPossibleFiniteStateList.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPossibleFiniteStateList.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPossibleFiniteStateList.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPossibleFiniteStateList.setName(emfThing.getName());
        
        pojoPossibleFiniteStateList.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPossibleFiniteStateList.setShortName(emfThing.getShortName());
        		        
        return pojoPossibleFiniteStateList;   
        
        
        
        case "CDP4.engineeringmodeldata.ElementDefinition":                
        cdp4common.commondata.DefinedThing pojoElementDefinition = new cdp4common.engineeringmodeldata.ElementDefinition();	    
        
        pojoElementDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoElementDefinition.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoElementDefinition.setName(emfThing.getName());
        
        pojoElementDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoElementDefinition.setShortName(emfThing.getShortName());
        		        
        return pojoElementDefinition;   
        
        
        case "CDP4.engineeringmodeldata.ElementUsage":                
        cdp4common.commondata.DefinedThing pojoElementUsage = new cdp4common.engineeringmodeldata.ElementUsage();	    
        
        pojoElementUsage.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoElementUsage.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.setModifiedOn(emfThing.getModifiedOn());
        
        pojoElementUsage.setName(emfThing.getName());
        
        pojoElementUsage.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoElementUsage.setShortName(emfThing.getShortName());
        		        
        return pojoElementUsage;   
        
        
        
        case "CDP4.engineeringmodeldata.RequirementsSpecification":                
        cdp4common.commondata.DefinedThing pojoRequirementsSpecification = new cdp4common.engineeringmodeldata.RequirementsSpecification();	    
        
        pojoRequirementsSpecification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsSpecification.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsSpecification.setName(emfThing.getName());
        
        pojoRequirementsSpecification.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirementsSpecification.setShortName(emfThing.getShortName());
        		        
        return pojoRequirementsSpecification;   
        
        
        case "CDP4.engineeringmodeldata.RequirementsGroup":                
        cdp4common.commondata.DefinedThing pojoRequirementsGroup = new cdp4common.engineeringmodeldata.RequirementsGroup();	    
        
        pojoRequirementsGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsGroup.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsGroup.setName(emfThing.getName());
        
        pojoRequirementsGroup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirementsGroup.setShortName(emfThing.getShortName());
        		        
        return pojoRequirementsGroup;   
        
        
        
        case "CDP4.engineeringmodeldata.Requirement":                
        cdp4common.commondata.DefinedThing pojoRequirement = new cdp4common.engineeringmodeldata.Requirement();	    
        
        pojoRequirement.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirement.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirement.setName(emfThing.getName());
        
        pojoRequirement.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirement.setShortName(emfThing.getShortName());
        		        
        return pojoRequirement;   
        
        
        case "CDP4.engineeringmodeldata.RuleVerificationList":                
        cdp4common.commondata.DefinedThing pojoRuleVerificationList = new cdp4common.engineeringmodeldata.RuleVerificationList();	    
        
        pojoRuleVerificationList.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRuleVerificationList.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRuleVerificationList.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRuleVerificationList.setName(emfThing.getName());
        
        pojoRuleVerificationList.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRuleVerificationList.setShortName(emfThing.getShortName());
        		        
        return pojoRuleVerificationList;   
        
        
        case "CDP4.engineeringmodeldata.Goal":                
        cdp4common.commondata.DefinedThing pojoGoal = new cdp4common.engineeringmodeldata.Goal();	    
        
        pojoGoal.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoGoal.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoGoal.setModifiedOn(emfThing.getModifiedOn());
        
        pojoGoal.setName(emfThing.getName());
        
        pojoGoal.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoGoal.setShortName(emfThing.getShortName());
        		        
        return pojoGoal;   
        
        
        case "CDP4.engineeringmodeldata.Stakeholder":                
        cdp4common.commondata.DefinedThing pojoStakeholder = new cdp4common.engineeringmodeldata.Stakeholder();	    
        
        pojoStakeholder.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeholder.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholder.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeholder.setName(emfThing.getName());
        
        pojoStakeholder.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoStakeholder.setShortName(emfThing.getShortName());
        		        
        return pojoStakeholder;   
        
        
        case "CDP4.engineeringmodeldata.ValueGroup":                
        cdp4common.commondata.DefinedThing pojoValueGroup = new cdp4common.engineeringmodeldata.ValueGroup();	    
        
        pojoValueGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoValueGroup.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoValueGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoValueGroup.setName(emfThing.getName());
        
        pojoValueGroup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoValueGroup.setShortName(emfThing.getShortName());
        		        
        return pojoValueGroup;   
        
        
        case "CDP4.engineeringmodeldata.StakeholderValue":                
        cdp4common.commondata.DefinedThing pojoStakeholderValue = new cdp4common.engineeringmodeldata.StakeholderValue();	    
        
        pojoStakeholderValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeholderValue.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeholderValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeholderValue.setName(emfThing.getName());
        
        pojoStakeholderValue.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoStakeholderValue.setShortName(emfThing.getShortName());
        		        
        return pojoStakeholderValue;   
        
        
        case "CDP4.engineeringmodeldata.StakeHolderValueMap":                
        cdp4common.commondata.DefinedThing pojoStakeHolderValueMap = new cdp4common.engineeringmodeldata.StakeHolderValueMap();	    
        
        pojoStakeHolderValueMap.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoStakeHolderValueMap.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoStakeHolderValueMap.setModifiedOn(emfThing.getModifiedOn());
        
        pojoStakeHolderValueMap.setName(emfThing.getName());
        
        pojoStakeHolderValueMap.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoStakeHolderValueMap.setShortName(emfThing.getShortName());
        		        
        return pojoStakeHolderValueMap;   
        
        	
    }
        return null;
        
        
     }

        
}
