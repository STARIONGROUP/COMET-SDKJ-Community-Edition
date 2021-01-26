/* --------------------------------------------------------------------------------------------------------------------
 * ScalarParameterType.java
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
 * Static resource that allows to change representation of the {@link ScalarParameterType} class.
 */
public abstract class ScalarParameterType {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.ScalarParameterType} to {@link CDP4.SiteDirectoryData.ScalarParameterType}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.ScalarParameterType}
     */
    public static CDP4.SiteDirectoryData.ScalarParameterType toEmf(cdp4common.sitedirectorydata.ScalarParameterType thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.EnumerationParameterType":
        CDP4.SiteDirectoryData.ScalarParameterType emfEnumerationParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEnumerationParameterType();    
        
        emfEnumerationParameterType.setIid(thing.getIid().toString()); 
        
        emfEnumerationParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfEnumerationParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfEnumerationParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfEnumerationParameterType.setName(thing.getName());
        
        emfEnumerationParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfEnumerationParameterType.setShortName(thing.getShortName());
        
        emfEnumerationParameterType.setSymbol(thing.getSymbol());
        
        emfEnumerationParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfEnumerationParameterType;
        
        case "cdp4common.sitedirectorydata.BooleanParameterType":
        CDP4.SiteDirectoryData.ScalarParameterType emfBooleanParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBooleanParameterType();    
        
        emfBooleanParameterType.setIid(thing.getIid().toString()); 
        
        emfBooleanParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfBooleanParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfBooleanParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfBooleanParameterType.setName(thing.getName());
        
        emfBooleanParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfBooleanParameterType.setShortName(thing.getShortName());
        
        emfBooleanParameterType.setSymbol(thing.getSymbol());
        
        emfBooleanParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfBooleanParameterType;
        
        case "cdp4common.sitedirectorydata.DateParameterType":
        CDP4.SiteDirectoryData.ScalarParameterType emfDateParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateParameterType();    
        
        emfDateParameterType.setIid(thing.getIid().toString()); 
        
        emfDateParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDateParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfDateParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateParameterType.setName(thing.getName());
        
        emfDateParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateParameterType.setShortName(thing.getShortName());
        
        emfDateParameterType.setSymbol(thing.getSymbol());
        
        emfDateParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfDateParameterType;
        
        case "cdp4common.sitedirectorydata.TextParameterType":
        CDP4.SiteDirectoryData.ScalarParameterType emfTextParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTextParameterType();    
        
        emfTextParameterType.setIid(thing.getIid().toString()); 
        
        emfTextParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfTextParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfTextParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTextParameterType.setName(thing.getName());
        
        emfTextParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTextParameterType.setShortName(thing.getShortName());
        
        emfTextParameterType.setSymbol(thing.getSymbol());
        
        emfTextParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfTextParameterType;
        
        case "cdp4common.sitedirectorydata.DateTimeParameterType":
        CDP4.SiteDirectoryData.ScalarParameterType emfDateTimeParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDateTimeParameterType();    
        
        emfDateTimeParameterType.setIid(thing.getIid().toString()); 
        
        emfDateTimeParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDateTimeParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfDateTimeParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfDateTimeParameterType.setName(thing.getName());
        
        emfDateTimeParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfDateTimeParameterType.setShortName(thing.getShortName());
        
        emfDateTimeParameterType.setSymbol(thing.getSymbol());
        
        emfDateTimeParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfDateTimeParameterType;
        
        case "cdp4common.sitedirectorydata.TimeOfDayParameterType":
        CDP4.SiteDirectoryData.ScalarParameterType emfTimeOfDayParameterType =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createTimeOfDayParameterType();    
        
        emfTimeOfDayParameterType.setIid(thing.getIid().toString()); 
        
        emfTimeOfDayParameterType.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfTimeOfDayParameterType.setIsDeprecated(thing.isDeprecated());
        
        emfTimeOfDayParameterType.setModifiedOn(thing.getModifiedOn());
        
        emfTimeOfDayParameterType.setName(thing.getName());
        
        emfTimeOfDayParameterType.setRevisionNumber(thing.getRevisionNumber());
        
        emfTimeOfDayParameterType.setShortName(thing.getShortName());
        
        emfTimeOfDayParameterType.setSymbol(thing.getSymbol());
        
        emfTimeOfDayParameterType.setThingPreference(thing.getThingPreference());
        		        
        return emfTimeOfDayParameterType;
        
        
        case "cdp4common.sitedirectorydata.SpecializedQuantityKind":
        CDP4.SiteDirectoryData.ScalarParameterType emfSpecializedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSpecializedQuantityKind();    
        
        emfSpecializedQuantityKind.setIid(thing.getIid().toString()); 
        
        emfSpecializedQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfSpecializedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSpecializedQuantityKind.setName(thing.getName());
        
        emfSpecializedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSpecializedQuantityKind.setShortName(thing.getShortName());
        
        emfSpecializedQuantityKind.setSymbol(thing.getSymbol());
        
        emfSpecializedQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfSpecializedQuantityKind;
        
        case "cdp4common.sitedirectorydata.SimpleQuantityKind":
        CDP4.SiteDirectoryData.ScalarParameterType emfSimpleQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleQuantityKind();    
        
        emfSimpleQuantityKind.setIid(thing.getIid().toString()); 
        
        emfSimpleQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfSimpleQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleQuantityKind.setName(thing.getName());
        
        emfSimpleQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleQuantityKind.setShortName(thing.getShortName());
        
        emfSimpleQuantityKind.setSymbol(thing.getSymbol());
        
        emfSimpleQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfSimpleQuantityKind;
        
        case "cdp4common.sitedirectorydata.DerivedQuantityKind":
        CDP4.SiteDirectoryData.ScalarParameterType emfDerivedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedQuantityKind();    
        
        emfDerivedQuantityKind.setIid(thing.getIid().toString()); 
        
        emfDerivedQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfDerivedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedQuantityKind.setName(thing.getName());
        
        emfDerivedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedQuantityKind.setShortName(thing.getShortName());
        
        emfDerivedQuantityKind.setSymbol(thing.getSymbol());
        
        emfDerivedQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfDerivedQuantityKind;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.ScalarParameterType} to {@link cdp4common.sitedirectorydata.ScalarParameterType}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.ScalarParameterType}
     */
    public static cdp4common.sitedirectorydata.ScalarParameterType toPojo(CDP4.SiteDirectoryData.ScalarParameterType emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.EnumerationParameterType":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoEnumerationParameterType = new cdp4common.sitedirectorydata.EnumerationParameterType();	    
        
        pojoEnumerationParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEnumerationParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEnumerationParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoEnumerationParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEnumerationParameterType.setName(emfThing.getName());
        
        pojoEnumerationParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEnumerationParameterType.setShortName(emfThing.getShortName());
        
        pojoEnumerationParameterType.setSymbol(emfThing.getSymbol());
        
        pojoEnumerationParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEnumerationParameterType;
        
        case "CDP4.sitedirectorydata.BooleanParameterType":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoBooleanParameterType = new cdp4common.sitedirectorydata.BooleanParameterType();	    
        
        pojoBooleanParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBooleanParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBooleanParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoBooleanParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBooleanParameterType.setName(emfThing.getName());
        
        pojoBooleanParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBooleanParameterType.setShortName(emfThing.getShortName());
        
        pojoBooleanParameterType.setSymbol(emfThing.getSymbol());
        
        pojoBooleanParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBooleanParameterType;
        
        case "CDP4.sitedirectorydata.DateParameterType":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoDateParameterType = new cdp4common.sitedirectorydata.DateParameterType();	    
        
        pojoDateParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDateParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateParameterType.setName(emfThing.getName());
        
        pojoDateParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDateParameterType.setShortName(emfThing.getShortName());
        
        pojoDateParameterType.setSymbol(emfThing.getSymbol());
        
        pojoDateParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDateParameterType;
        
        case "CDP4.sitedirectorydata.TextParameterType":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoTextParameterType = new cdp4common.sitedirectorydata.TextParameterType();	    
        
        pojoTextParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTextParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoTextParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTextParameterType.setName(emfThing.getName());
        
        pojoTextParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTextParameterType.setShortName(emfThing.getShortName());
        
        pojoTextParameterType.setSymbol(emfThing.getSymbol());
        
        pojoTextParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoTextParameterType;
        
        case "CDP4.sitedirectorydata.DateTimeParameterType":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoDateTimeParameterType = new cdp4common.sitedirectorydata.DateTimeParameterType();	    
        
        pojoDateTimeParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDateTimeParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDateTimeParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDateTimeParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDateTimeParameterType.setName(emfThing.getName());
        
        pojoDateTimeParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDateTimeParameterType.setShortName(emfThing.getShortName());
        
        pojoDateTimeParameterType.setSymbol(emfThing.getSymbol());
        
        pojoDateTimeParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDateTimeParameterType;
        
        case "CDP4.sitedirectorydata.TimeOfDayParameterType":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoTimeOfDayParameterType = new cdp4common.sitedirectorydata.TimeOfDayParameterType();	    
        
        pojoTimeOfDayParameterType.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTimeOfDayParameterType.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTimeOfDayParameterType.setDeprecated(emfThing.getIsDeprecated());
        
        pojoTimeOfDayParameterType.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTimeOfDayParameterType.setName(emfThing.getName());
        
        pojoTimeOfDayParameterType.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTimeOfDayParameterType.setShortName(emfThing.getShortName());
        
        pojoTimeOfDayParameterType.setSymbol(emfThing.getSymbol());
        
        pojoTimeOfDayParameterType.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoTimeOfDayParameterType;
        
        
        case "CDP4.sitedirectorydata.SpecializedQuantityKind":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoSpecializedQuantityKind = new cdp4common.sitedirectorydata.SpecializedQuantityKind();	    
        
        pojoSpecializedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSpecializedQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoSpecializedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSpecializedQuantityKind.setName(emfThing.getName());
        
        pojoSpecializedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSpecializedQuantityKind.setShortName(emfThing.getShortName());
        
        pojoSpecializedQuantityKind.setSymbol(emfThing.getSymbol());
        
        pojoSpecializedQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSpecializedQuantityKind;
        
        case "CDP4.sitedirectorydata.SimpleQuantityKind":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoSimpleQuantityKind = new cdp4common.sitedirectorydata.SimpleQuantityKind();	    
        
        pojoSimpleQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoSimpleQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleQuantityKind.setName(emfThing.getName());
        
        pojoSimpleQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleQuantityKind.setShortName(emfThing.getShortName());
        
        pojoSimpleQuantityKind.setSymbol(emfThing.getSymbol());
        
        pojoSimpleQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSimpleQuantityKind;
        
        case "CDP4.sitedirectorydata.DerivedQuantityKind":                
        cdp4common.sitedirectorydata.ScalarParameterType pojoDerivedQuantityKind = new cdp4common.sitedirectorydata.DerivedQuantityKind();	    
        
        pojoDerivedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDerivedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedQuantityKind.setName(emfThing.getName());
        
        pojoDerivedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDerivedQuantityKind.setShortName(emfThing.getShortName());
        
        pojoDerivedQuantityKind.setSymbol(emfThing.getSymbol());
        
        pojoDerivedQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDerivedQuantityKind;
        	
        }

        return null;
    }
    
}
