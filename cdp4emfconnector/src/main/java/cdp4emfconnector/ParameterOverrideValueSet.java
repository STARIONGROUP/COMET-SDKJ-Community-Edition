/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOverrideValueSet.java
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
 * Static resource that allows to change representation of the {@link ParameterOverrideValueSet} class.
 */
public class ParameterOverrideValueSet {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.ParameterOverrideValueSet} to {@link CDP4.EngineeringModelData.ParameterOverrideValueSet}
     *
     * @return Generated {@link CDP4.EngineeringModelData.ParameterOverrideValueSet}
     */
    public static CDP4.EngineeringModelData.ParameterOverrideValueSet toEmf(cdp4common.engineeringmodeldata.ParameterOverrideValueSet thing) {       
        
        CDP4.EngineeringModelData.ParameterOverrideValueSet emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterOverrideValueSet();      
       
        emf.setIid(thing.getIid().toString()); 
        
        thing.getComputed().forEach(item -> emf.getComputed().add(item));	             
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        thing.getFormula().forEach(item -> emf.getFormula().add(item));	             
        
        thing.getManual().forEach(item -> emf.getManual().add(item));	             
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setParameterValueSet(thing.getParameterValueSet() != null ? cdp4emfconnector.ParameterValueSet.toEmf(thing.getParameterValueSet()) : null);        
        
        thing.getPublished().forEach(item -> emf.getPublished().add(item));	             
        
        thing.getReference().forEach(item -> emf.getReference().add(item));	             
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        if (thing.getValueSwitch() != null) {emf.setValueSwitch(CDP4.EngineeringModelData.ParameterSwitchKind.valueOf(thing.getValueSwitch().toString()));}                          
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.ParameterOverrideValueSet} to {@link cdp4common.engineeringmodeldata.ParameterOverrideValueSet}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.ParameterOverrideValueSet}
     */
    public static cdp4common.engineeringmodeldata.ParameterOverrideValueSet toPojo(CDP4.EngineeringModelData.ParameterOverrideValueSet emfThing) {
        
        cdp4common.engineeringmodeldata.ParameterOverrideValueSet pojo = new cdp4common.engineeringmodeldata.ParameterOverrideValueSet();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        emfThing.getComputed().forEach(item -> pojo.getComputed().set(item.indexOf(item), item));		      
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        emfThing.getFormula().forEach(item -> pojo.getFormula().set(item.indexOf(item), item));		      
        
        emfThing.getManual().forEach(item -> pojo.getManual().set(item.indexOf(item), item));		      
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setParameterValueSet(emfThing.getParameterValueSet() != null ? cdp4emfconnector.ParameterValueSet.toPojo(emfThing.getParameterValueSet()) : null);        
        
        emfThing.getPublished().forEach(item -> pojo.getPublished().set(item.indexOf(item), item));		      
        
        emfThing.getReference().forEach(item -> pojo.getReference().set(item.indexOf(item), item));		      
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        if (emfThing.getValueSwitch() != null) {pojo.setValueSwitch(cdp4common.engineeringmodeldata.ParameterSwitchKind.valueOf(emfThing.getValueSwitch().toString()));}  
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.engineeringmodeldata.ParameterOverrideValueSet} from a {@link CDP4.EngineeringModelData.ParameterOverrideValueSet}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ParameterOverrideValueSet}.
    * @return A new {@link cdp4common.engineeringmodeldata.ParameterOverrideValueSet}
    */
    public static cdp4common.engineeringmodeldata.ParameterOverrideValueSet instiatePojo(CDP4.EngineeringModelData.ParameterOverrideValueSet thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.engineeringmodeldata.ParameterOverrideValueSet(UUID.fromString(thing.getIid()), cache, uri);
    }
}
