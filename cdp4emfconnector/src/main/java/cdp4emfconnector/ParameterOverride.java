/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOverride.java
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
 * Static resource that allows to change representation of the {@link ParameterOverride} class.
 */
public class ParameterOverride {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.ParameterOverride} to {@link CDP4.EngineeringModelData.ParameterOverride}
     *
     * @return Generated {@link CDP4.EngineeringModelData.ParameterOverride}
     */
    public static CDP4.EngineeringModelData.ParameterOverride toEmf(cdp4common.engineeringmodeldata.ParameterOverride thing) {       
        
        CDP4.EngineeringModelData.ParameterOverride emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterOverride();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emf.setParameter(thing.getParameter() != null ? cdp4emfconnector.Parameter.toEmf(thing.getParameter()) : null);        
        
        emf.getParameterSubscription().addAll(thing.getParameterSubscription().stream().map(item -> cdp4emfconnector.ParameterSubscription.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setThingPreference(thing.getThingPreference());
        
        emf.getValueSet().addAll(thing.getValueSet().stream().map(item -> cdp4emfconnector.ParameterOverrideValueSet.toEmf(item)).collect(Collectors.toList()));
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.ParameterOverride} to {@link cdp4common.engineeringmodeldata.ParameterOverride}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.ParameterOverride}
     */
    public static cdp4common.engineeringmodeldata.ParameterOverride toPojo(CDP4.EngineeringModelData.ParameterOverride emfThing) {
        
        cdp4common.engineeringmodeldata.ParameterOverride pojo = new cdp4common.engineeringmodeldata.ParameterOverride();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojo.setParameter(emfThing.getParameter() != null ? cdp4emfconnector.Parameter.toPojo(emfThing.getParameter()) : null);        
        
        pojo.getParameterSubscription().addAll(emfThing.getParameterSubscription().stream().map(item -> cdp4emfconnector.ParameterSubscription.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        pojo.getValueSet().addAll(emfThing.getValueSet().stream().map(item -> cdp4emfconnector.ParameterOverrideValueSet.toPojo(item)).collect(Collectors.toList()));              
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.engineeringmodeldata.ParameterOverride} from a {@link CDP4.EngineeringModelData.ParameterOverride}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ParameterOverride}.
    * @return A new {@link cdp4common.engineeringmodeldata.ParameterOverride}
    */
    public static cdp4common.engineeringmodeldata.ParameterOverride instiatePojo(CDP4.EngineeringModelData.ParameterOverride thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.engineeringmodeldata.ParameterOverride(UUID.fromString(thing.getIid()), cache, uri);
    }
}
