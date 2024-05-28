/* --------------------------------------------------------------------------------------------------------------------
 * OrdinalScale.java
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
 * Static resource that allows to change representation of the {@link OrdinalScale} class.
 */
public class OrdinalScale {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.OrdinalScale} to {@link CDP4.SiteDirectoryData.OrdinalScale}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.OrdinalScale}
     */
    public static CDP4.SiteDirectoryData.OrdinalScale toEmf(cdp4common.sitedirectorydata.OrdinalScale thing) {       
        
        CDP4.SiteDirectoryData.OrdinalScale emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createOrdinalScale();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emf.setIsDeprecated(thing.isDeprecated());
        
        emf.setIsMaximumInclusive(thing.isMaximumInclusive());
        
        emf.setIsMinimumInclusive(thing.isMinimumInclusive());
        
        emf.getMappingToReferenceScale().addAll(thing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toEmf(item)).collect(Collectors.toList()));
        
        emf.setMaximumPermissibleValue(thing.getMaximumPermissibleValue());
        
        emf.setMinimumPermissibleValue(thing.getMinimumPermissibleValue());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.setNegativeValueConnotation(thing.getNegativeValueConnotation());
        
        if (thing.getNumberSet() != null) {emf.setNumberSet(CDP4.SiteDirectoryData.NumberSetKind.valueOf(thing.getNumberSet().toString()));}                          
        
        emf.setPositiveValueConnotation(thing.getPositiveValueConnotation());
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setShortName(thing.getShortName());
        
        emf.setThingPreference(thing.getThingPreference());
        
        emf.setUnit(thing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getUnit()) : null);        
        
        emf.setUseShortNameValues(thing.isUseShortNameValues());
        
        emf.getValueDefinition().addAll(thing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toEmf(item)).collect(Collectors.toList()));
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.OrdinalScale} to {@link cdp4common.sitedirectorydata.OrdinalScale}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.OrdinalScale}
     */
    public static cdp4common.sitedirectorydata.OrdinalScale toPojo(CDP4.SiteDirectoryData.OrdinalScale emfThing) {
        
        cdp4common.sitedirectorydata.OrdinalScale pojo = new cdp4common.sitedirectorydata.OrdinalScale();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setDeprecated(emfThing.getIsDeprecated());
        
        pojo.setMaximumInclusive(emfThing.getIsMaximumInclusive());
        
        pojo.setMinimumInclusive(emfThing.getIsMinimumInclusive());
        
        pojo.getMappingToReferenceScale().addAll(emfThing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setMaximumPermissibleValue(emfThing.getMaximumPermissibleValue());
        
        pojo.setMinimumPermissibleValue(emfThing.getMinimumPermissibleValue());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.setNegativeValueConnotation(emfThing.getNegativeValueConnotation());
        
        if (emfThing.getNumberSet() != null) {pojo.setNumberSet(cdp4common.sitedirectorydata.NumberSetKind.valueOf(emfThing.getNumberSet().toString()));}  
        
        pojo.setPositiveValueConnotation(emfThing.getPositiveValueConnotation());
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setShortName(emfThing.getShortName());
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        pojo.setUnit(emfThing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getUnit()) : null);        
        
        pojo.setUseShortNameValues(emfThing.getUseShortNameValues());
        
        pojo.getValueDefinition().addAll(emfThing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toPojo(item)).collect(Collectors.toList()));              
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.OrdinalScale} from a {@link CDP4.SiteDirectoryData.OrdinalScale}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.OrdinalScale}.
    * @return A new {@link cdp4common.sitedirectorydata.OrdinalScale}
    */
    public static cdp4common.sitedirectorydata.OrdinalScale instiatePojo(CDP4.SiteDirectoryData.OrdinalScale thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.OrdinalScale(UUID.fromString(thing.getIid()), cache, uri);
    }
}
