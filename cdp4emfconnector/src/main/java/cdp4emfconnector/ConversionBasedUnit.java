/* --------------------------------------------------------------------------------------------------------------------
 * ConversionBasedUnit.java
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
 * Static resource that allows to change representation of the {@link ConversionBasedUnit} class.
 */
public abstract class ConversionBasedUnit {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.ConversionBasedUnit} to {@link CDP4.SiteDirectoryData.ConversionBasedUnit}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.ConversionBasedUnit}
     */
    public static CDP4.SiteDirectoryData.ConversionBasedUnit toEmf(cdp4common.sitedirectorydata.ConversionBasedUnit thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.LinearConversionUnit":
        CDP4.SiteDirectoryData.ConversionBasedUnit emfLinearConversionUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLinearConversionUnit();    
        
        emfLinearConversionUnit.setIid(thing.getIid().toString()); 
        
        emfLinearConversionUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.setConversionFactor(thing.getConversionFactor());
        
        emfLinearConversionUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.setIsDeprecated(thing.isDeprecated());
        
        emfLinearConversionUnit.setModifiedOn(thing.getModifiedOn());
        
        emfLinearConversionUnit.setName(thing.getName());
        
        emfLinearConversionUnit.setReferenceUnit(thing.getReferenceUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getReferenceUnit()) : null);        
        
        emfLinearConversionUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfLinearConversionUnit.setShortName(thing.getShortName());
        
        emfLinearConversionUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfLinearConversionUnit;
        
        case "cdp4common.sitedirectorydata.PrefixedUnit":
        CDP4.SiteDirectoryData.ConversionBasedUnit emfPrefixedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPrefixedUnit();    
        
        emfPrefixedUnit.setIid(thing.getIid().toString()); 
        
        emfPrefixedUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.setConversionFactor(thing.getConversionFactor());
        
        emfPrefixedUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.setIsDeprecated(thing.isDeprecated());
        
        emfPrefixedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfPrefixedUnit.setName(thing.getName());
        
        emfPrefixedUnit.setReferenceUnit(thing.getReferenceUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getReferenceUnit()) : null);        
        
        emfPrefixedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfPrefixedUnit.setShortName(thing.getShortName());
        
        emfPrefixedUnit.setThingPreference(thing.getThingPreference());
        		        
        return emfPrefixedUnit;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.ConversionBasedUnit} to {@link cdp4common.sitedirectorydata.ConversionBasedUnit}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.ConversionBasedUnit}
     */
    public static cdp4common.sitedirectorydata.ConversionBasedUnit toPojo(CDP4.SiteDirectoryData.ConversionBasedUnit emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.LinearConversionUnit":                
        cdp4common.sitedirectorydata.ConversionBasedUnit pojoLinearConversionUnit = new cdp4common.sitedirectorydata.LinearConversionUnit();	    
        
        pojoLinearConversionUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLinearConversionUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.setConversionFactor(emfThing.getConversionFactor());
        
        pojoLinearConversionUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.setDeprecated(emfThing.getIsDeprecated());
        
        pojoLinearConversionUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLinearConversionUnit.setName(emfThing.getName());
        
        pojoLinearConversionUnit.setReferenceUnit(emfThing.getReferenceUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getReferenceUnit()) : null);        
        
        pojoLinearConversionUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoLinearConversionUnit.setShortName(emfThing.getShortName());
        
        pojoLinearConversionUnit.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoLinearConversionUnit;
        
        case "CDP4.sitedirectorydata.PrefixedUnit":                
        cdp4common.sitedirectorydata.ConversionBasedUnit pojoPrefixedUnit = new cdp4common.sitedirectorydata.PrefixedUnit();	    
        
        pojoPrefixedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPrefixedUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.setConversionFactor(emfThing.getConversionFactor());
        
        pojoPrefixedUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.setDeprecated(emfThing.getIsDeprecated());
        
        pojoPrefixedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPrefixedUnit.setName(emfThing.getName());
        
        pojoPrefixedUnit.setReferenceUnit(emfThing.getReferenceUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getReferenceUnit()) : null);        
        
        pojoPrefixedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPrefixedUnit.setShortName(emfThing.getShortName());
        
        pojoPrefixedUnit.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoPrefixedUnit;
        	
        }

        return null;
    }
    
}
