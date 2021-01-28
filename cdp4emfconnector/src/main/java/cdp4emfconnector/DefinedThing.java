/* --------------------------------------------------------------------------------------------------------------------
 * DefinedThing.java
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
 * Static resource that allows to change representation of the {@link DefinedThing} class.
 */
public abstract class DefinedThing {
   
    /**
     * Convert from {@link cdp4common.commondata.DefinedThing} to {@link CDP4.CommonData.DefinedThing}
     *
     * @return Generated {@link CDP4.CommonData.DefinedThing}
     */
    public static CDP4.CommonData.DefinedThing toEmf(cdp4common.commondata.DefinedThing thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.ParticipantRole":
        CDP4.CommonData.DefinedThing emfParticipantRole =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParticipantRole();    
        
        emfParticipantRole.setIid(thing.getIid().toString()); 
        
        emfParticipantRole.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantRole.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantRole.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantRole.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantRole.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfParticipantRole.setModifiedOn(thing.getModifiedOn());
        
        emfParticipantRole.setName(thing.getName());
        
        emfParticipantRole.setRevisionNumber(thing.getRevisionNumber());
        
        emfParticipantRole.setShortName(thing.getShortName());
        
        emfParticipantRole.setThingPreference(thing.getThingPreference());
        		        
        return emfParticipantRole;
        
        case "cdp4common.sitedirectorydata.EngineeringModelSetup":
        CDP4.CommonData.DefinedThing emfEngineeringModelSetup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEngineeringModelSetup();    
        
        emfEngineeringModelSetup.setIid(thing.getIid().toString()); 
        
        emfEngineeringModelSetup.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelSetup.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelSetup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelSetup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelSetup.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelSetup.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelSetup.setName(thing.getName());
        
        emfEngineeringModelSetup.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModelSetup.setShortName(thing.getShortName());
        
        emfEngineeringModelSetup.setThingPreference(thing.getThingPreference());
        		        
        return emfEngineeringModelSetup;
        
        case "cdp4common.sitedirectorydata.Glossary":
        CDP4.CommonData.DefinedThing emfGlossary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createGlossary();    
        
        emfGlossary.setIid(thing.getIid().toString()); 
        
        emfGlossary.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfGlossary.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfGlossary.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfGlossary.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfGlossary.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfGlossary.setModifiedOn(thing.getModifiedOn());
        
        emfGlossary.setName(thing.getName());
        
        emfGlossary.setRevisionNumber(thing.getRevisionNumber());
        
        emfGlossary.setShortName(thing.getShortName());
        
        emfGlossary.setThingPreference(thing.getThingPreference());
        		        
        return emfGlossary;
        
        
        case "cdp4common.sitedirectorydata.SiteReferenceDataLibrary":
        CDP4.CommonData.DefinedThing emfSiteReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteReferenceDataLibrary();    
        
        emfSiteReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        emfSiteReferenceDataLibrary.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfSiteReferenceDataLibrary.setName(thing.getName());
        
        emfSiteReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteReferenceDataLibrary.setShortName(thing.getShortName());
        
        emfSiteReferenceDataLibrary.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteReferenceDataLibrary;
        
        case "cdp4common.sitedirectorydata.ModelReferenceDataLibrary":
        CDP4.CommonData.DefinedThing emfModelReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createModelReferenceDataLibrary();    
        
        emfModelReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        emfModelReferenceDataLibrary.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfModelReferenceDataLibrary.setName(thing.getName());
        
        emfModelReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        
        emfModelReferenceDataLibrary.setShortName(thing.getShortName());
        
        emfModelReferenceDataLibrary.setThingPreference(thing.getThingPreference());
        		        
        return emfModelReferenceDataLibrary;
        
        case "cdp4common.sitedirectorydata.Term":
        CDP4.CommonData.DefinedThing emfTerm =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTerm();    
        
        emfTerm.setIid(thing.getIid().toString()); 
        
        emfTerm.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfTerm.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfTerm.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTerm.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTerm.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfTerm.setModifiedOn(thing.getModifiedOn());
        
        emfTerm.setName(thing.getName());
        
        emfTerm.setRevisionNumber(thing.getRevisionNumber());
        
        emfTerm.setShortName(thing.getShortName());
        
        emfTerm.setThingPreference(thing.getThingPreference());
        		        
        return emfTerm;
        
        case "cdp4common.sitedirectorydata.FileType":
        CDP4.CommonData.DefinedThing emfFileType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createFileType();    
        
        emfFileType.setIid(thing.getIid().toString()); 
        
        emfFileType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfFileType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfFileType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfFileType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfFileType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfFileType.setModifiedOn(thing.getModifiedOn());
        
        emfFileType.setName(thing.getName());
        
        emfFileType.setRevisionNumber(thing.getRevisionNumber());
        
        emfFileType.setShortName(thing.getShortName());
        
        emfFileType.setThingPreference(thing.getThingPreference());
        		        
        return emfFileType;
        
        
        case "cdp4common.sitedirectorydata.OrdinalScale":
        CDP4.CommonData.DefinedThing emfOrdinalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrdinalScale();    
        
        emfOrdinalScale.setIid(thing.getIid().toString()); 
        
        emfOrdinalScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.setModifiedOn(thing.getModifiedOn());
        
        emfOrdinalScale.setName(thing.getName());
        
        emfOrdinalScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfOrdinalScale.setShortName(thing.getShortName());
        
        emfOrdinalScale.setThingPreference(thing.getThingPreference());
        		        
        return emfOrdinalScale;
        
        case "cdp4common.sitedirectorydata.RatioScale":
        CDP4.CommonData.DefinedThing emfRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createRatioScale();    
        
        emfRatioScale.setIid(thing.getIid().toString()); 
        
        emfRatioScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfRatioScale.setName(thing.getName());
        
        emfRatioScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfRatioScale.setShortName(thing.getShortName());
        
        emfRatioScale.setThingPreference(thing.getThingPreference());
        		        
        return emfRatioScale;
        
        case "cdp4common.sitedirectorydata.CyclicRatioScale":
        CDP4.CommonData.DefinedThing emfCyclicRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCyclicRatioScale();    
        
        emfCyclicRatioScale.setIid(thing.getIid().toString()); 
        
        emfCyclicRatioScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfCyclicRatioScale.setName(thing.getName());
        
        emfCyclicRatioScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfCyclicRatioScale.setShortName(thing.getShortName());
        
        emfCyclicRatioScale.setThingPreference(thing.getThingPreference());
        		        
        return emfCyclicRatioScale;
        
        case "cdp4common.sitedirectorydata.IntervalScale":
        CDP4.CommonData.DefinedThing emfIntervalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createIntervalScale();    
        
        emfIntervalScale.setIid(thing.getIid().toString()); 
        
        emfIntervalScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.setModifiedOn(thing.getModifiedOn());
        
        emfIntervalScale.setName(thing.getName());
        
        emfIntervalScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfIntervalScale.setShortName(thing.getShortName());
        
        emfIntervalScale.setThingPreference(thing.getThingPreference());
        		        
        return emfIntervalScale;
        
        case "cdp4common.sitedirectorydata.LogarithmicScale":
        CDP4.CommonData.DefinedThing emfLogarithmicScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLogarithmicScale();    
        
        emfLogarithmicScale.setIid(thing.getIid().toString()); 
        
        emfLogarithmicScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.setModifiedOn(thing.getModifiedOn());
        
        emfLogarithmicScale.setName(thing.getName());
        
        emfLogarithmicScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfLogarithmicScale.setShortName(thing.getShortName());
        
        emfLogarithmicScale.setThingPreference(thing.getThingPreference());
        		        
        return emfLogarithmicScale;
        
        case "cdp4common.sitedirectorydata.DomainOfExpertise":
        CDP4.CommonData.DefinedThing emfDomainOfExpertise =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDomainOfExpertise();    
        
        emfDomainOfExpertise.setIid(thing.getIid().toString()); 
        
        emfDomainOfExpertise.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertise.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertise.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertise.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertise.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertise.setModifiedOn(thing.getModifiedOn());
        
        emfDomainOfExpertise.setName(thing.getName());
        
        emfDomainOfExpertise.setRevisionNumber(thing.getRevisionNumber());
        
        emfDomainOfExpertise.setShortName(thing.getShortName());
        
        emfDomainOfExpertise.setThingPreference(thing.getThingPreference());
        		        
        return emfDomainOfExpertise;
        
        
        case "cdp4common.sitedirectorydata.CompoundParameterType":
        CDP4.CommonData.DefinedThing emfCompoundParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCompoundParameterType();    
        
        emfCompoundParameterType.setIid(thing.getIid().toString()); 
        
        emfCompoundParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfCompoundParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfCompoundParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCompoundParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCompoundParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfCompoundParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfCompoundParameterType.setName(thing.getName());
        
        emfCompoundParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfCompoundParameterType.setShortName(thing.getShortName());
        
        emfCompoundParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfCompoundParameterType;
        
        case "cdp4common.sitedirectorydata.ArrayParameterType":
        CDP4.CommonData.DefinedThing emfArrayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createArrayParameterType();    
        
        emfArrayParameterType.setIid(thing.getIid().toString()); 
        
        emfArrayParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfArrayParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfArrayParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfArrayParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfArrayParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfArrayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfArrayParameterType.setName(thing.getName());
        
        emfArrayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfArrayParameterType.setShortName(thing.getShortName());
        
        emfArrayParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfArrayParameterType;
        
        
        case "cdp4common.sitedirectorydata.EnumerationParameterType":
        CDP4.CommonData.DefinedThing emfEnumerationParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationParameterType();    
        
        emfEnumerationParameterType.setIid(thing.getIid().toString()); 
        
        emfEnumerationParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationParameterType.setName(thing.getName());
        
        emfEnumerationParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfEnumerationParameterType.setShortName(thing.getShortName());
        
        emfEnumerationParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfEnumerationParameterType;
        
        case "cdp4common.sitedirectorydata.BooleanParameterType":
        CDP4.CommonData.DefinedThing emfBooleanParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBooleanParameterType();    
        
        emfBooleanParameterType.setIid(thing.getIid().toString()); 
        
        emfBooleanParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfBooleanParameterType.setName(thing.getName());
        
        emfBooleanParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfBooleanParameterType.setShortName(thing.getShortName());
        
        emfBooleanParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfBooleanParameterType;
        
        case "cdp4common.sitedirectorydata.DateParameterType":
        CDP4.CommonData.DefinedThing emfDateParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateParameterType();    
        
        emfDateParameterType.setIid(thing.getIid().toString()); 
        
        emfDateParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateParameterType.setName(thing.getName());
        
        emfDateParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateParameterType.setShortName(thing.getShortName());
        
        emfDateParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfDateParameterType;
        
        case "cdp4common.sitedirectorydata.TextParameterType":
        CDP4.CommonData.DefinedThing emfTextParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTextParameterType();    
        
        emfTextParameterType.setIid(thing.getIid().toString()); 
        
        emfTextParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTextParameterType.setName(thing.getName());
        
        emfTextParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTextParameterType.setShortName(thing.getShortName());
        
        emfTextParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfTextParameterType;
        
        case "cdp4common.sitedirectorydata.DateTimeParameterType":
        CDP4.CommonData.DefinedThing emfDateTimeParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateTimeParameterType();    
        
        emfDateTimeParameterType.setIid(thing.getIid().toString()); 
        
        emfDateTimeParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateTimeParameterType.setName(thing.getName());
        
        emfDateTimeParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateTimeParameterType.setShortName(thing.getShortName());
        
        emfDateTimeParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfDateTimeParameterType;
        
        case "cdp4common.sitedirectorydata.TimeOfDayParameterType":
        CDP4.CommonData.DefinedThing emfTimeOfDayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTimeOfDayParameterType();    
        
        emfTimeOfDayParameterType.setIid(thing.getIid().toString()); 
        
        emfTimeOfDayParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTimeOfDayParameterType.setName(thing.getName());
        
        emfTimeOfDayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTimeOfDayParameterType.setShortName(thing.getShortName());
        
        emfTimeOfDayParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfTimeOfDayParameterType;
        
        
        case "cdp4common.sitedirectorydata.SpecializedQuantityKind":
        CDP4.CommonData.DefinedThing emfSpecializedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSpecializedQuantityKind();    
        
        emfSpecializedQuantityKind.setIid(thing.getIid().toString()); 
        
        emfSpecializedQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSpecializedQuantityKind.setName(thing.getName());
        
        emfSpecializedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSpecializedQuantityKind.setShortName(thing.getShortName());
        
        emfSpecializedQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfSpecializedQuantityKind;
        
        case "cdp4common.sitedirectorydata.SimpleQuantityKind":
        CDP4.CommonData.DefinedThing emfSimpleQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleQuantityKind();    
        
        emfSimpleQuantityKind.setIid(thing.getIid().toString()); 
        
        emfSimpleQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleQuantityKind.setName(thing.getName());
        
        emfSimpleQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleQuantityKind.setShortName(thing.getShortName());
        
        emfSimpleQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfSimpleQuantityKind;
        
        case "cdp4common.sitedirectorydata.DerivedQuantityKind":
        CDP4.CommonData.DefinedThing emfDerivedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedQuantityKind();    
        
        emfDerivedQuantityKind.setIid(thing.getIid().toString()); 
        
        emfDerivedQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedQuantityKind.setName(thing.getName());
        
        emfDerivedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedQuantityKind.setShortName(thing.getShortName());
        
        emfDerivedQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfDerivedQuantityKind;
        
        case "cdp4common.sitedirectorydata.SampledFunctionParameterType":
        CDP4.CommonData.DefinedThing emfSampledFunctionParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSampledFunctionParameterType();    
        
        emfSampledFunctionParameterType.setIid(thing.getIid().toString()); 
        
        emfSampledFunctionParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSampledFunctionParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSampledFunctionParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSampledFunctionParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSampledFunctionParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSampledFunctionParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfSampledFunctionParameterType.setName(thing.getName());
        
        emfSampledFunctionParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfSampledFunctionParameterType.setShortName(thing.getShortName());
        
        emfSampledFunctionParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfSampledFunctionParameterType;
        
        case "cdp4common.sitedirectorydata.ScaleValueDefinition":
        CDP4.CommonData.DefinedThing emfScaleValueDefinition =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createScaleValueDefinition();    
        
        emfScaleValueDefinition.setIid(thing.getIid().toString()); 
        
        emfScaleValueDefinition.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleValueDefinition.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleValueDefinition.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleValueDefinition.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleValueDefinition.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfScaleValueDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfScaleValueDefinition.setName(thing.getName());
        
        emfScaleValueDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfScaleValueDefinition.setShortName(thing.getShortName());
        
        emfScaleValueDefinition.setThingPreference(thing.getThingPreference());
        		        
        return emfScaleValueDefinition;
        
        
        case "cdp4common.sitedirectorydata.DerivedUnit":
        CDP4.CommonData.DefinedThing emfDerivedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedUnit();    
        
        emfDerivedUnit.setIid(thing.getIid().toString()); 
        
        emfDerivedUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedUnit.setName(thing.getName());
        
        emfDerivedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedUnit.setShortName(thing.getShortName());
        
        emfDerivedUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfDerivedUnit;
        
        
        case "cdp4common.sitedirectorydata.LinearConversionUnit":
        CDP4.CommonData.DefinedThing emfLinearConversionUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLinearConversionUnit();    
        
        emfLinearConversionUnit.setIid(thing.getIid().toString()); 
        
        emfLinearConversionUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.setModifiedOn(thing.getModifiedOn());
        
        emfLinearConversionUnit.setName(thing.getName());
        
        emfLinearConversionUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfLinearConversionUnit.setShortName(thing.getShortName());
        
        emfLinearConversionUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfLinearConversionUnit;
        
        case "cdp4common.sitedirectorydata.PrefixedUnit":
        CDP4.CommonData.DefinedThing emfPrefixedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPrefixedUnit();    
        
        emfPrefixedUnit.setIid(thing.getIid().toString()); 
        
        emfPrefixedUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfPrefixedUnit.setName(thing.getName());
        
        emfPrefixedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfPrefixedUnit.setShortName(thing.getShortName());
        
        emfPrefixedUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfPrefixedUnit;
        
        case "cdp4common.sitedirectorydata.SimpleUnit":
        CDP4.CommonData.DefinedThing emfSimpleUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleUnit();    
        
        emfSimpleUnit.setIid(thing.getIid().toString()); 
        
        emfSimpleUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleUnit.setName(thing.getName());
        
        emfSimpleUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleUnit.setShortName(thing.getShortName());
        
        emfSimpleUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfSimpleUnit;
        
        case "cdp4common.sitedirectorydata.Category":
        CDP4.CommonData.DefinedThing emfCategory =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCategory();    
        
        emfCategory.setIid(thing.getIid().toString()); 
        
        emfCategory.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfCategory.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfCategory.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCategory.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCategory.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfCategory.setModifiedOn(thing.getModifiedOn());
        
        emfCategory.setName(thing.getName());
        
        emfCategory.setRevisionNumber(thing.getRevisionNumber());
        
        emfCategory.setShortName(thing.getShortName());
        
        emfCategory.setThingPreference(thing.getThingPreference());
        		        
        return emfCategory;
        
        case "cdp4common.sitedirectorydata.UnitPrefix":
        CDP4.CommonData.DefinedThing emfUnitPrefix =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createUnitPrefix();    
        
        emfUnitPrefix.setIid(thing.getIid().toString()); 
        
        emfUnitPrefix.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitPrefix.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitPrefix.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitPrefix.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitPrefix.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfUnitPrefix.setModifiedOn(thing.getModifiedOn());
        
        emfUnitPrefix.setName(thing.getName());
        
        emfUnitPrefix.setRevisionNumber(thing.getRevisionNumber());
        
        emfUnitPrefix.setShortName(thing.getShortName());
        
        emfUnitPrefix.setThingPreference(thing.getThingPreference());
        		        
        return emfUnitPrefix;
        
        
        case "cdp4common.sitedirectorydata.ReferencerRule":
        CDP4.CommonData.DefinedThing emfReferencerRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferencerRule();    
        
        emfReferencerRule.setIid(thing.getIid().toString()); 
        
        emfReferencerRule.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfReferencerRule.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfReferencerRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfReferencerRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfReferencerRule.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfReferencerRule.setModifiedOn(thing.getModifiedOn());
        
        emfReferencerRule.setName(thing.getName());
        
        emfReferencerRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfReferencerRule.setShortName(thing.getShortName());
        
        emfReferencerRule.setThingPreference(thing.getThingPreference());
        		        
        return emfReferencerRule;
        
        case "cdp4common.sitedirectorydata.BinaryRelationshipRule":
        CDP4.CommonData.DefinedThing emfBinaryRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBinaryRelationshipRule();    
        
        emfBinaryRelationshipRule.setIid(thing.getIid().toString()); 
        
        emfBinaryRelationshipRule.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationshipRule.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationshipRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationshipRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationshipRule.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryRelationshipRule.setName(thing.getName());
        
        emfBinaryRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfBinaryRelationshipRule.setShortName(thing.getShortName());
        
        emfBinaryRelationshipRule.setThingPreference(thing.getThingPreference());
        		        
        return emfBinaryRelationshipRule;
        
        case "cdp4common.sitedirectorydata.MultiRelationshipRule":
        CDP4.CommonData.DefinedThing emfMultiRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createMultiRelationshipRule();    
        
        emfMultiRelationshipRule.setIid(thing.getIid().toString()); 
        
        emfMultiRelationshipRule.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationshipRule.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationshipRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationshipRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationshipRule.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfMultiRelationshipRule.setName(thing.getName());
        
        emfMultiRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfMultiRelationshipRule.setShortName(thing.getShortName());
        
        emfMultiRelationshipRule.setThingPreference(thing.getThingPreference());
        		        
        return emfMultiRelationshipRule;
        
        case "cdp4common.sitedirectorydata.DecompositionRule":
        CDP4.CommonData.DefinedThing emfDecompositionRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDecompositionRule();    
        
        emfDecompositionRule.setIid(thing.getIid().toString()); 
        
        emfDecompositionRule.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDecompositionRule.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDecompositionRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDecompositionRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDecompositionRule.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDecompositionRule.setModifiedOn(thing.getModifiedOn());
        
        emfDecompositionRule.setName(thing.getName());
        
        emfDecompositionRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfDecompositionRule.setShortName(thing.getShortName());
        
        emfDecompositionRule.setThingPreference(thing.getThingPreference());
        		        
        return emfDecompositionRule;
        
        case "cdp4common.sitedirectorydata.ParameterizedCategoryRule":
        CDP4.CommonData.DefinedThing emfParameterizedCategoryRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParameterizedCategoryRule();    
        
        emfParameterizedCategoryRule.setIid(thing.getIid().toString()); 
        
        emfParameterizedCategoryRule.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterizedCategoryRule.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterizedCategoryRule.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterizedCategoryRule.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterizedCategoryRule.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterizedCategoryRule.setModifiedOn(thing.getModifiedOn());
        
        emfParameterizedCategoryRule.setName(thing.getName());
        
        emfParameterizedCategoryRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterizedCategoryRule.setShortName(thing.getShortName());
        
        emfParameterizedCategoryRule.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterizedCategoryRule;
        
        case "cdp4common.sitedirectorydata.EnumerationValueDefinition":
        CDP4.CommonData.DefinedThing emfEnumerationValueDefinition =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationValueDefinition();    
        
        emfEnumerationValueDefinition.setIid(thing.getIid().toString()); 
        
        emfEnumerationValueDefinition.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationValueDefinition.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationValueDefinition.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationValueDefinition.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationValueDefinition.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationValueDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationValueDefinition.setName(thing.getName());
        
        emfEnumerationValueDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfEnumerationValueDefinition.setShortName(thing.getShortName());
        
        emfEnumerationValueDefinition.setThingPreference(thing.getThingPreference());
        		        
        return emfEnumerationValueDefinition;
        
        case "cdp4common.sitedirectorydata.PersonRole":
        CDP4.CommonData.DefinedThing emfPersonRole =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPersonRole();    
        
        emfPersonRole.setIid(thing.getIid().toString()); 
        
        emfPersonRole.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonRole.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonRole.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonRole.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonRole.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfPersonRole.setModifiedOn(thing.getModifiedOn());
        
        emfPersonRole.setName(thing.getName());
        
        emfPersonRole.setRevisionNumber(thing.getRevisionNumber());
        
        emfPersonRole.setShortName(thing.getShortName());
        
        emfPersonRole.setThingPreference(thing.getThingPreference());
        		        
        return emfPersonRole;
        
        case "cdp4common.sitedirectorydata.DomainOfExpertiseGroup":
        CDP4.CommonData.DefinedThing emfDomainOfExpertiseGroup =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDomainOfExpertiseGroup();    
        
        emfDomainOfExpertiseGroup.setIid(thing.getIid().toString()); 
        
        emfDomainOfExpertiseGroup.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertiseGroup.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertiseGroup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertiseGroup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertiseGroup.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDomainOfExpertiseGroup.setModifiedOn(thing.getModifiedOn());
        
        emfDomainOfExpertiseGroup.setName(thing.getName());
        
        emfDomainOfExpertiseGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfDomainOfExpertiseGroup.setShortName(thing.getShortName());
        
        emfDomainOfExpertiseGroup.setThingPreference(thing.getThingPreference());
        		        
        return emfDomainOfExpertiseGroup;
        
        case "cdp4common.sitedirectorydata.ReferenceSource":
        CDP4.CommonData.DefinedThing emfReferenceSource =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferenceSource();    
        
        emfReferenceSource.setIid(thing.getIid().toString()); 
        
        emfReferenceSource.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfReferenceSource.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfReferenceSource.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfReferenceSource.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfReferenceSource.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfReferenceSource.setModifiedOn(thing.getModifiedOn());
        
        emfReferenceSource.setName(thing.getName());
        
        emfReferenceSource.setRevisionNumber(thing.getRevisionNumber());
        
        emfReferenceSource.setShortName(thing.getShortName());
        
        emfReferenceSource.setThingPreference(thing.getThingPreference());
        		        
        return emfReferenceSource;
        
        case "cdp4common.sitedirectorydata.Constant":
        CDP4.CommonData.DefinedThing emfConstant =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createConstant();    
        
        emfConstant.setIid(thing.getIid().toString()); 
        
        emfConstant.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfConstant.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfConstant.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfConstant.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfConstant.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfConstant.setModifiedOn(thing.getModifiedOn());
        
        emfConstant.setName(thing.getName());
        
        emfConstant.setRevisionNumber(thing.getRevisionNumber());
        
        emfConstant.setShortName(thing.getShortName());
        
        emfConstant.setThingPreference(thing.getThingPreference());
        		        
        return emfConstant;
        
        case "cdp4common.engineeringmodeldata.PossibleFiniteState":
        CDP4.CommonData.DefinedThing emfPossibleFiniteState =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPossibleFiniteState();    
        
        emfPossibleFiniteState.setIid(thing.getIid().toString()); 
        
        emfPossibleFiniteState.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteState.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteState.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteState.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteState.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteState.setModifiedOn(thing.getModifiedOn());
        
        emfPossibleFiniteState.setName(thing.getName());
        
        emfPossibleFiniteState.setRevisionNumber(thing.getRevisionNumber());
        
        emfPossibleFiniteState.setShortName(thing.getShortName());
        
        emfPossibleFiniteState.setThingPreference(thing.getThingPreference());
        		        
        return emfPossibleFiniteState;
        
        case "cdp4common.engineeringmodeldata.Option":
        CDP4.CommonData.DefinedThing emfOption =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createOption();    
        
        emfOption.setIid(thing.getIid().toString()); 
        
        emfOption.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfOption.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfOption.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOption.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOption.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfOption.setModifiedOn(thing.getModifiedOn());
        
        emfOption.setName(thing.getName());
        
        emfOption.setRevisionNumber(thing.getRevisionNumber());
        
        emfOption.setShortName(thing.getShortName());
        
        emfOption.setThingPreference(thing.getThingPreference());
        		        
        return emfOption;
        
        case "cdp4common.engineeringmodeldata.PossibleFiniteStateList":
        CDP4.CommonData.DefinedThing emfPossibleFiniteStateList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createPossibleFiniteStateList();    
        
        emfPossibleFiniteStateList.setIid(thing.getIid().toString()); 
        
        emfPossibleFiniteStateList.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteStateList.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteStateList.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteStateList.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteStateList.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfPossibleFiniteStateList.setModifiedOn(thing.getModifiedOn());
        
        emfPossibleFiniteStateList.setName(thing.getName());
        
        emfPossibleFiniteStateList.setRevisionNumber(thing.getRevisionNumber());
        
        emfPossibleFiniteStateList.setShortName(thing.getShortName());
        
        emfPossibleFiniteStateList.setThingPreference(thing.getThingPreference());
        		        
        return emfPossibleFiniteStateList;
        
        
        case "cdp4common.engineeringmodeldata.ElementDefinition":
        CDP4.CommonData.DefinedThing emfElementDefinition =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementDefinition();    
        
        emfElementDefinition.setIid(thing.getIid().toString()); 
        
        emfElementDefinition.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfElementDefinition.setName(thing.getName());
        
        emfElementDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfElementDefinition.setShortName(thing.getShortName());
        
        emfElementDefinition.setThingPreference(thing.getThingPreference());
        		        
        return emfElementDefinition;
        
        case "cdp4common.engineeringmodeldata.ElementUsage":
        CDP4.CommonData.DefinedThing emfElementUsage =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementUsage();    
        
        emfElementUsage.setIid(thing.getIid().toString()); 
        
        emfElementUsage.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.setModifiedOn(thing.getModifiedOn());
        
        emfElementUsage.setName(thing.getName());
        
        emfElementUsage.setRevisionNumber(thing.getRevisionNumber());
        
        emfElementUsage.setShortName(thing.getShortName());
        
        emfElementUsage.setThingPreference(thing.getThingPreference());
        		        
        return emfElementUsage;
        
        
        case "cdp4common.engineeringmodeldata.RequirementsSpecification":
        CDP4.CommonData.DefinedThing emfRequirementsSpecification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsSpecification();    
        
        emfRequirementsSpecification.setIid(thing.getIid().toString()); 
        
        emfRequirementsSpecification.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsSpecification.setName(thing.getName());
        
        emfRequirementsSpecification.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsSpecification.setShortName(thing.getShortName());
        
        emfRequirementsSpecification.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirementsSpecification;
        
        case "cdp4common.engineeringmodeldata.RequirementsGroup":
        CDP4.CommonData.DefinedThing emfRequirementsGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsGroup();    
        
        emfRequirementsGroup.setIid(thing.getIid().toString()); 
        
        emfRequirementsGroup.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsGroup.setName(thing.getName());
        
        emfRequirementsGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsGroup.setShortName(thing.getShortName());
        
        emfRequirementsGroup.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirementsGroup;
        
        
        case "cdp4common.engineeringmodeldata.Requirement":
        CDP4.CommonData.DefinedThing emfRequirement =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirement();    
        
        emfRequirement.setIid(thing.getIid().toString()); 
        
        emfRequirement.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirement.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirement.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirement.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirement.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirement.setModifiedOn(thing.getModifiedOn());
        
        emfRequirement.setName(thing.getName());
        
        emfRequirement.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirement.setShortName(thing.getShortName());
        
        emfRequirement.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirement;
        
        case "cdp4common.engineeringmodeldata.RuleVerificationList":
        CDP4.CommonData.DefinedThing emfRuleVerificationList =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRuleVerificationList();    
        
        emfRuleVerificationList.setIid(thing.getIid().toString()); 
        
        emfRuleVerificationList.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleVerificationList.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleVerificationList.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleVerificationList.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleVerificationList.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfRuleVerificationList.setModifiedOn(thing.getModifiedOn());
        
        emfRuleVerificationList.setName(thing.getName());
        
        emfRuleVerificationList.setRevisionNumber(thing.getRevisionNumber());
        
        emfRuleVerificationList.setShortName(thing.getShortName());
        
        emfRuleVerificationList.setThingPreference(thing.getThingPreference());
        		        
        return emfRuleVerificationList;
        
        case "cdp4common.engineeringmodeldata.Goal":
        CDP4.CommonData.DefinedThing emfGoal =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createGoal();    
        
        emfGoal.setIid(thing.getIid().toString()); 
        
        emfGoal.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfGoal.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfGoal.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfGoal.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfGoal.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfGoal.setModifiedOn(thing.getModifiedOn());
        
        emfGoal.setName(thing.getName());
        
        emfGoal.setRevisionNumber(thing.getRevisionNumber());
        
        emfGoal.setShortName(thing.getShortName());
        
        emfGoal.setThingPreference(thing.getThingPreference());
        		        
        return emfGoal;
        
        case "cdp4common.engineeringmodeldata.Stakeholder":
        CDP4.CommonData.DefinedThing emfStakeholder =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeholder();    
        
        emfStakeholder.setIid(thing.getIid().toString()); 
        
        emfStakeholder.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholder.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholder.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholder.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholder.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholder.setModifiedOn(thing.getModifiedOn());
        
        emfStakeholder.setName(thing.getName());
        
        emfStakeholder.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeholder.setShortName(thing.getShortName());
        
        emfStakeholder.setThingPreference(thing.getThingPreference());
        		        
        return emfStakeholder;
        
        case "cdp4common.engineeringmodeldata.ValueGroup":
        CDP4.CommonData.DefinedThing emfValueGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createValueGroup();    
        
        emfValueGroup.setIid(thing.getIid().toString()); 
        
        emfValueGroup.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfValueGroup.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfValueGroup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfValueGroup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfValueGroup.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfValueGroup.setModifiedOn(thing.getModifiedOn());
        
        emfValueGroup.setName(thing.getName());
        
        emfValueGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfValueGroup.setShortName(thing.getShortName());
        
        emfValueGroup.setThingPreference(thing.getThingPreference());
        		        
        return emfValueGroup;
        
        case "cdp4common.engineeringmodeldata.StakeholderValue":
        CDP4.CommonData.DefinedThing emfStakeholderValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeholderValue();    
        
        emfStakeholderValue.setIid(thing.getIid().toString()); 
        
        emfStakeholderValue.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholderValue.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholderValue.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholderValue.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholderValue.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeholderValue.setModifiedOn(thing.getModifiedOn());
        
        emfStakeholderValue.setName(thing.getName());
        
        emfStakeholderValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeholderValue.setShortName(thing.getShortName());
        
        emfStakeholderValue.setThingPreference(thing.getThingPreference());
        		        
        return emfStakeholderValue;
        
        case "cdp4common.engineeringmodeldata.StakeHolderValueMap":
        CDP4.CommonData.DefinedThing emfStakeHolderValueMap =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createStakeHolderValueMap();    
        
        emfStakeHolderValueMap.setIid(thing.getIid().toString()); 
        
        emfStakeHolderValueMap.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMap.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMap.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMap.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMap.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfStakeHolderValueMap.setModifiedOn(thing.getModifiedOn());
        
        emfStakeHolderValueMap.setName(thing.getName());
        
        emfStakeHolderValueMap.setRevisionNumber(thing.getRevisionNumber());
        
        emfStakeHolderValueMap.setShortName(thing.getShortName());
        
        emfStakeHolderValueMap.setThingPreference(thing.getThingPreference());
        		        
        return emfStakeHolderValueMap;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.CommonData.DefinedThing} to {@link cdp4common.commondata.DefinedThing}
     *
     * @return Generated {@link cdp4common.commondata.DefinedThing}
     */
    public static cdp4common.commondata.DefinedThing toPojo(CDP4.CommonData.DefinedThing emfThing) {
            
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
        
        pojoParticipantRole.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoEngineeringModelSetup.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoGlossary.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoSiteReferenceDataLibrary.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoModelReferenceDataLibrary.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoTerm.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoFileType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoOrdinalScale.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoRatioScale.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoCyclicRatioScale.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoIntervalScale.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoLogarithmicScale.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoDomainOfExpertise.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoCompoundParameterType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoArrayParameterType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoEnumerationParameterType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoBooleanParameterType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoDateParameterType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoTextParameterType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoDateTimeParameterType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoTimeOfDayParameterType.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoSpecializedQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoSimpleQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoDerivedQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDerivedQuantityKind;
        
        case "CDP4.sitedirectorydata.SampledFunctionParameterType":                
        cdp4common.commondata.DefinedThing pojoSampledFunctionParameterType = new cdp4common.sitedirectorydata.SampledFunctionParameterType();	    
        
        pojoSampledFunctionParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSampledFunctionParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSampledFunctionParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSampledFunctionParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSampledFunctionParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSampledFunctionParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSampledFunctionParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSampledFunctionParameterType.setName(emfThing.getName());
        
        pojoSampledFunctionParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSampledFunctionParameterType.setShortName(emfThing.getShortName());
        
        pojoSampledFunctionParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSampledFunctionParameterType;
        
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
        
        pojoScaleValueDefinition.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoDerivedUnit.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoLinearConversionUnit.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoPrefixedUnit.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoSimpleUnit.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoCategory.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoUnitPrefix.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoReferencerRule.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoBinaryRelationshipRule.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoMultiRelationshipRule.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoDecompositionRule.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoParameterizedCategoryRule.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoEnumerationValueDefinition.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoPersonRole.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoDomainOfExpertiseGroup.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoReferenceSource.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoConstant.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoPossibleFiniteState.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoOption.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoPossibleFiniteStateList.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoElementDefinition.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoElementUsage.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoRequirementsSpecification.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoRequirementsGroup.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoRequirement.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoRuleVerificationList.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoGoal.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoStakeholder.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoValueGroup.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoStakeholderValue.setThingPreference(emfThing.getThingPreference());
        		        
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
        
        pojoStakeHolderValueMap.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoStakeHolderValueMap;
        	
        }

        return null;
    }
    
}
