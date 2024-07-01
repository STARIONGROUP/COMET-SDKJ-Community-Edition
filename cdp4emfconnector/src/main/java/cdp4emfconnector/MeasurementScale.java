/* --------------------------------------------------------------------------------------------------------------------
 * MeasurementScale.java
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
 * Static resource that allows to change representation of the {@link MeasurementScale} class.
 */
public abstract class MeasurementScale {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.MeasurementScale} to {@link CDP4.SiteDirectoryData.MeasurementScale}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.MeasurementScale}
     */
    public static CDP4.SiteDirectoryData.MeasurementScale toEmf(cdp4common.sitedirectorydata.MeasurementScale thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.OrdinalScale":
        CDP4.SiteDirectoryData.MeasurementScale emfOrdinalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrdinalScale();    
        
        emfOrdinalScale.setIid(thing.getIid().toString()); 
        
        emfOrdinalScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.setIsDeprecated(thing.isDeprecated());
        
        emfOrdinalScale.setIsMaximumInclusive(thing.isMaximumInclusive());
        
        emfOrdinalScale.setIsMinimumInclusive(thing.isMinimumInclusive());
        
        emfOrdinalScale.getMappingToReferenceScale().addAll(thing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toEmf(item)).collect(Collectors.toList()));
        
        emfOrdinalScale.setMaximumPermissibleValue(thing.getMaximumPermissibleValue());
        
        emfOrdinalScale.setMinimumPermissibleValue(thing.getMinimumPermissibleValue());
        
        emfOrdinalScale.setModifiedOn(thing.getModifiedOn());
        
        emfOrdinalScale.setName(thing.getName());
        
        emfOrdinalScale.setNegativeValueConnotation(thing.getNegativeValueConnotation());
        
        if (thing.getNumberSet() != null) {emfOrdinalScale.setNumberSet(CDP4.SiteDirectoryData.NumberSetKind.valueOf(thing.getNumberSet().toString()));}                        
        
        emfOrdinalScale.setPositiveValueConnotation(thing.getPositiveValueConnotation());
        
        emfOrdinalScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfOrdinalScale.setShortName(thing.getShortName());
        
        emfOrdinalScale.setThingPreference(thing.getThingPreference());
        
        emfOrdinalScale.setUnit(thing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getUnit()) : null);        
        
        emfOrdinalScale.getValueDefinition().addAll(thing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfOrdinalScale;
        
        case "cdp4common.sitedirectorydata.RatioScale":
        CDP4.SiteDirectoryData.MeasurementScale emfRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createRatioScale();    
        
        emfRatioScale.setIid(thing.getIid().toString()); 
        
        emfRatioScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.setIsDeprecated(thing.isDeprecated());
        
        emfRatioScale.setIsMaximumInclusive(thing.isMaximumInclusive());
        
        emfRatioScale.setIsMinimumInclusive(thing.isMinimumInclusive());
        
        emfRatioScale.getMappingToReferenceScale().addAll(thing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toEmf(item)).collect(Collectors.toList()));
        
        emfRatioScale.setMaximumPermissibleValue(thing.getMaximumPermissibleValue());
        
        emfRatioScale.setMinimumPermissibleValue(thing.getMinimumPermissibleValue());
        
        emfRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfRatioScale.setName(thing.getName());
        
        emfRatioScale.setNegativeValueConnotation(thing.getNegativeValueConnotation());
        
        if (thing.getNumberSet() != null) {emfRatioScale.setNumberSet(CDP4.SiteDirectoryData.NumberSetKind.valueOf(thing.getNumberSet().toString()));}                        
        
        emfRatioScale.setPositiveValueConnotation(thing.getPositiveValueConnotation());
        
        emfRatioScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfRatioScale.setShortName(thing.getShortName());
        
        emfRatioScale.setThingPreference(thing.getThingPreference());
        
        emfRatioScale.setUnit(thing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getUnit()) : null);        
        
        emfRatioScale.getValueDefinition().addAll(thing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfRatioScale;
        
        case "cdp4common.sitedirectorydata.CyclicRatioScale":
        CDP4.SiteDirectoryData.MeasurementScale emfCyclicRatioScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createCyclicRatioScale();    
        
        emfCyclicRatioScale.setIid(thing.getIid().toString()); 
        
        emfCyclicRatioScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.setIsDeprecated(thing.isDeprecated());
        
        emfCyclicRatioScale.setIsMaximumInclusive(thing.isMaximumInclusive());
        
        emfCyclicRatioScale.setIsMinimumInclusive(thing.isMinimumInclusive());
        
        emfCyclicRatioScale.getMappingToReferenceScale().addAll(thing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toEmf(item)).collect(Collectors.toList()));
        
        emfCyclicRatioScale.setMaximumPermissibleValue(thing.getMaximumPermissibleValue());
        
        emfCyclicRatioScale.setMinimumPermissibleValue(thing.getMinimumPermissibleValue());
        
        emfCyclicRatioScale.setModifiedOn(thing.getModifiedOn());
        
        emfCyclicRatioScale.setName(thing.getName());
        
        emfCyclicRatioScale.setNegativeValueConnotation(thing.getNegativeValueConnotation());
        
        if (thing.getNumberSet() != null) {emfCyclicRatioScale.setNumberSet(CDP4.SiteDirectoryData.NumberSetKind.valueOf(thing.getNumberSet().toString()));}                        
        
        emfCyclicRatioScale.setPositiveValueConnotation(thing.getPositiveValueConnotation());
        
        emfCyclicRatioScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfCyclicRatioScale.setShortName(thing.getShortName());
        
        emfCyclicRatioScale.setThingPreference(thing.getThingPreference());
        
        emfCyclicRatioScale.setUnit(thing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getUnit()) : null);        
        
        emfCyclicRatioScale.getValueDefinition().addAll(thing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfCyclicRatioScale;
        
        case "cdp4common.sitedirectorydata.IntervalScale":
        CDP4.SiteDirectoryData.MeasurementScale emfIntervalScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createIntervalScale();    
        
        emfIntervalScale.setIid(thing.getIid().toString()); 
        
        emfIntervalScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.setIsDeprecated(thing.isDeprecated());
        
        emfIntervalScale.setIsMaximumInclusive(thing.isMaximumInclusive());
        
        emfIntervalScale.setIsMinimumInclusive(thing.isMinimumInclusive());
        
        emfIntervalScale.getMappingToReferenceScale().addAll(thing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toEmf(item)).collect(Collectors.toList()));
        
        emfIntervalScale.setMaximumPermissibleValue(thing.getMaximumPermissibleValue());
        
        emfIntervalScale.setMinimumPermissibleValue(thing.getMinimumPermissibleValue());
        
        emfIntervalScale.setModifiedOn(thing.getModifiedOn());
        
        emfIntervalScale.setName(thing.getName());
        
        emfIntervalScale.setNegativeValueConnotation(thing.getNegativeValueConnotation());
        
        if (thing.getNumberSet() != null) {emfIntervalScale.setNumberSet(CDP4.SiteDirectoryData.NumberSetKind.valueOf(thing.getNumberSet().toString()));}                        
        
        emfIntervalScale.setPositiveValueConnotation(thing.getPositiveValueConnotation());
        
        emfIntervalScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfIntervalScale.setShortName(thing.getShortName());
        
        emfIntervalScale.setThingPreference(thing.getThingPreference());
        
        emfIntervalScale.setUnit(thing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getUnit()) : null);        
        
        emfIntervalScale.getValueDefinition().addAll(thing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfIntervalScale;
        
        case "cdp4common.sitedirectorydata.LogarithmicScale":
        CDP4.SiteDirectoryData.MeasurementScale emfLogarithmicScale =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLogarithmicScale();    
        
        emfLogarithmicScale.setIid(thing.getIid().toString()); 
        
        emfLogarithmicScale.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.setIsDeprecated(thing.isDeprecated());
        
        emfLogarithmicScale.setIsMaximumInclusive(thing.isMaximumInclusive());
        
        emfLogarithmicScale.setIsMinimumInclusive(thing.isMinimumInclusive());
        
        emfLogarithmicScale.getMappingToReferenceScale().addAll(thing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toEmf(item)).collect(Collectors.toList()));
        
        emfLogarithmicScale.setMaximumPermissibleValue(thing.getMaximumPermissibleValue());
        
        emfLogarithmicScale.setMinimumPermissibleValue(thing.getMinimumPermissibleValue());
        
        emfLogarithmicScale.setModifiedOn(thing.getModifiedOn());
        
        emfLogarithmicScale.setName(thing.getName());
        
        emfLogarithmicScale.setNegativeValueConnotation(thing.getNegativeValueConnotation());
        
        if (thing.getNumberSet() != null) {emfLogarithmicScale.setNumberSet(CDP4.SiteDirectoryData.NumberSetKind.valueOf(thing.getNumberSet().toString()));}                        
        
        emfLogarithmicScale.setPositiveValueConnotation(thing.getPositiveValueConnotation());
        
        emfLogarithmicScale.setRevisionNumber(thing.getRevisionNumber());
        
        emfLogarithmicScale.setShortName(thing.getShortName());
        
        emfLogarithmicScale.setThingPreference(thing.getThingPreference());
        
        emfLogarithmicScale.setUnit(thing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getUnit()) : null);        
        
        emfLogarithmicScale.getValueDefinition().addAll(thing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfLogarithmicScale;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.MeasurementScale} to {@link cdp4common.sitedirectorydata.MeasurementScale}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.MeasurementScale}
     */
    public static cdp4common.sitedirectorydata.MeasurementScale toPojo(CDP4.SiteDirectoryData.MeasurementScale emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.OrdinalScale":                
        cdp4common.sitedirectorydata.MeasurementScale pojoOrdinalScale = new cdp4common.sitedirectorydata.OrdinalScale();	    
        
        pojoOrdinalScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrdinalScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.setDeprecated(emfThing.getIsDeprecated());
        
        pojoOrdinalScale.setMaximumInclusive(emfThing.getIsMaximumInclusive());
        
        pojoOrdinalScale.setMinimumInclusive(emfThing.getIsMinimumInclusive());
        
        pojoOrdinalScale.getMappingToReferenceScale().addAll(emfThing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrdinalScale.setMaximumPermissibleValue(emfThing.getMaximumPermissibleValue());
        
        pojoOrdinalScale.setMinimumPermissibleValue(emfThing.getMinimumPermissibleValue());
        
        pojoOrdinalScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrdinalScale.setName(emfThing.getName());
        
        pojoOrdinalScale.setNegativeValueConnotation(emfThing.getNegativeValueConnotation());
        
        if (emfThing.getNumberSet() != null) {pojoOrdinalScale.setNumberSet(cdp4common.sitedirectorydata.NumberSetKind.valueOf(emfThing.getNumberSet().toString()));}        
        
        pojoOrdinalScale.setPositiveValueConnotation(emfThing.getPositiveValueConnotation());
        
        pojoOrdinalScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOrdinalScale.setShortName(emfThing.getShortName());
        
        pojoOrdinalScale.setThingPreference(emfThing.getThingPreference());
        
        pojoOrdinalScale.setUnit(emfThing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getUnit()) : null);        
        
        pojoOrdinalScale.getValueDefinition().addAll(emfThing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoOrdinalScale;
        
        case "CDP4.sitedirectorydata.RatioScale":                
        cdp4common.sitedirectorydata.MeasurementScale pojoRatioScale = new cdp4common.sitedirectorydata.RatioScale();	    
        
        pojoRatioScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRatioScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.setDeprecated(emfThing.getIsDeprecated());
        
        pojoRatioScale.setMaximumInclusive(emfThing.getIsMaximumInclusive());
        
        pojoRatioScale.setMinimumInclusive(emfThing.getIsMinimumInclusive());
        
        pojoRatioScale.getMappingToReferenceScale().addAll(emfThing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRatioScale.setMaximumPermissibleValue(emfThing.getMaximumPermissibleValue());
        
        pojoRatioScale.setMinimumPermissibleValue(emfThing.getMinimumPermissibleValue());
        
        pojoRatioScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRatioScale.setName(emfThing.getName());
        
        pojoRatioScale.setNegativeValueConnotation(emfThing.getNegativeValueConnotation());
        
        if (emfThing.getNumberSet() != null) {pojoRatioScale.setNumberSet(cdp4common.sitedirectorydata.NumberSetKind.valueOf(emfThing.getNumberSet().toString()));}        
        
        pojoRatioScale.setPositiveValueConnotation(emfThing.getPositiveValueConnotation());
        
        pojoRatioScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRatioScale.setShortName(emfThing.getShortName());
        
        pojoRatioScale.setThingPreference(emfThing.getThingPreference());
        
        pojoRatioScale.setUnit(emfThing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getUnit()) : null);        
        
        pojoRatioScale.getValueDefinition().addAll(emfThing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoRatioScale;
        
        case "CDP4.sitedirectorydata.CyclicRatioScale":                
        cdp4common.sitedirectorydata.MeasurementScale pojoCyclicRatioScale = new cdp4common.sitedirectorydata.CyclicRatioScale();	    
        
        pojoCyclicRatioScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCyclicRatioScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.setDeprecated(emfThing.getIsDeprecated());
        
        pojoCyclicRatioScale.setMaximumInclusive(emfThing.getIsMaximumInclusive());
        
        pojoCyclicRatioScale.setMinimumInclusive(emfThing.getIsMinimumInclusive());
        
        pojoCyclicRatioScale.getMappingToReferenceScale().addAll(emfThing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCyclicRatioScale.setMaximumPermissibleValue(emfThing.getMaximumPermissibleValue());
        
        pojoCyclicRatioScale.setMinimumPermissibleValue(emfThing.getMinimumPermissibleValue());
        
        pojoCyclicRatioScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCyclicRatioScale.setName(emfThing.getName());
        
        pojoCyclicRatioScale.setNegativeValueConnotation(emfThing.getNegativeValueConnotation());
        
        if (emfThing.getNumberSet() != null) {pojoCyclicRatioScale.setNumberSet(cdp4common.sitedirectorydata.NumberSetKind.valueOf(emfThing.getNumberSet().toString()));}        
        
        pojoCyclicRatioScale.setPositiveValueConnotation(emfThing.getPositiveValueConnotation());
        
        pojoCyclicRatioScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoCyclicRatioScale.setShortName(emfThing.getShortName());
        
        pojoCyclicRatioScale.setThingPreference(emfThing.getThingPreference());
        
        pojoCyclicRatioScale.setUnit(emfThing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getUnit()) : null);        
        
        pojoCyclicRatioScale.getValueDefinition().addAll(emfThing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoCyclicRatioScale;
        
        case "CDP4.sitedirectorydata.IntervalScale":                
        cdp4common.sitedirectorydata.MeasurementScale pojoIntervalScale = new cdp4common.sitedirectorydata.IntervalScale();	    
        
        pojoIntervalScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoIntervalScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.setDeprecated(emfThing.getIsDeprecated());
        
        pojoIntervalScale.setMaximumInclusive(emfThing.getIsMaximumInclusive());
        
        pojoIntervalScale.setMinimumInclusive(emfThing.getIsMinimumInclusive());
        
        pojoIntervalScale.getMappingToReferenceScale().addAll(emfThing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoIntervalScale.setMaximumPermissibleValue(emfThing.getMaximumPermissibleValue());
        
        pojoIntervalScale.setMinimumPermissibleValue(emfThing.getMinimumPermissibleValue());
        
        pojoIntervalScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoIntervalScale.setName(emfThing.getName());
        
        pojoIntervalScale.setNegativeValueConnotation(emfThing.getNegativeValueConnotation());
        
        if (emfThing.getNumberSet() != null) {pojoIntervalScale.setNumberSet(cdp4common.sitedirectorydata.NumberSetKind.valueOf(emfThing.getNumberSet().toString()));}        
        
        pojoIntervalScale.setPositiveValueConnotation(emfThing.getPositiveValueConnotation());
        
        pojoIntervalScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoIntervalScale.setShortName(emfThing.getShortName());
        
        pojoIntervalScale.setThingPreference(emfThing.getThingPreference());
        
        pojoIntervalScale.setUnit(emfThing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getUnit()) : null);        
        
        pojoIntervalScale.getValueDefinition().addAll(emfThing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoIntervalScale;
        
        case "CDP4.sitedirectorydata.LogarithmicScale":                
        cdp4common.sitedirectorydata.MeasurementScale pojoLogarithmicScale = new cdp4common.sitedirectorydata.LogarithmicScale();	    
        
        pojoLogarithmicScale.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLogarithmicScale.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.setDeprecated(emfThing.getIsDeprecated());
        
        pojoLogarithmicScale.setMaximumInclusive(emfThing.getIsMaximumInclusive());
        
        pojoLogarithmicScale.setMinimumInclusive(emfThing.getIsMinimumInclusive());
        
        pojoLogarithmicScale.getMappingToReferenceScale().addAll(emfThing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLogarithmicScale.setMaximumPermissibleValue(emfThing.getMaximumPermissibleValue());
        
        pojoLogarithmicScale.setMinimumPermissibleValue(emfThing.getMinimumPermissibleValue());
        
        pojoLogarithmicScale.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLogarithmicScale.setName(emfThing.getName());
        
        pojoLogarithmicScale.setNegativeValueConnotation(emfThing.getNegativeValueConnotation());
        
        if (emfThing.getNumberSet() != null) {pojoLogarithmicScale.setNumberSet(cdp4common.sitedirectorydata.NumberSetKind.valueOf(emfThing.getNumberSet().toString()));}        
        
        pojoLogarithmicScale.setPositiveValueConnotation(emfThing.getPositiveValueConnotation());
        
        pojoLogarithmicScale.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoLogarithmicScale.setShortName(emfThing.getShortName());
        
        pojoLogarithmicScale.setThingPreference(emfThing.getThingPreference());
        
        pojoLogarithmicScale.setUnit(emfThing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getUnit()) : null);        
        
        pojoLogarithmicScale.getValueDefinition().addAll(emfThing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoLogarithmicScale;
        	
        }

        return null;
    }
    
}
