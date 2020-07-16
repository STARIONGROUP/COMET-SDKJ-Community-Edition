/* --------------------------------------------------------------------------------------------------------------------
 * ParametricConstraint.java
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
 * Static resource that allows to change representation of the {@link ParametricConstraint} class.
 */
public class ParametricConstraint {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.ParametricConstraint} to {@link CDP4.EngineeringModelData.ParametricConstraint}
     *
     * @return Generated {@link CDP4.EngineeringModelData.ParametricConstraint}
     */
    public static CDP4.EngineeringModelData.ParametricConstraint toEmf(cdp4common.engineeringmodeldata.ParametricConstraint thing) {       
        
        CDP4.EngineeringModelData.ParametricConstraint emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParametricConstraint();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExpression().addAll(thing.getExpression().stream().map(item -> cdp4emfconnector.BooleanExpression.toEmf(item)).collect(Collectors.toList()));
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setTopExpression(thing.getTopExpression() != null ? cdp4emfconnector.BooleanExpression.toEmf(thing.getTopExpression()) : null);
        return emf;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.ParametricConstraint} to {@link cdp4common.engineeringmodeldata.ParametricConstraint}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.ParametricConstraint}
     */
    public static cdp4common.engineeringmodeldata.ParametricConstraint toPojo(CDP4.EngineeringModelData.ParametricConstraint emfThing) {
        
        cdp4common.engineeringmodeldata.ParametricConstraint pojo = new cdp4common.engineeringmodeldata.ParametricConstraint();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExpression().addAll(emfThing.getExpression().stream().map(item -> cdp4emfconnector.BooleanExpression.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setTopExpression(emfThing.getTopExpression() != null ? cdp4emfconnector.BooleanExpression.toPojo(emfThing.getTopExpression()) : null);
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.engineeringmodeldata.ParametricConstraint} from a {@link CDP4.EngineeringModelData.ParametricConstraint}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ParametricConstraint}.
    * @return A new {@link cdp4common.engineeringmodeldata.ParametricConstraint}
    */
    public static cdp4common.engineeringmodeldata.ParametricConstraint instiatePojo(CDP4.EngineeringModelData.ParametricConstraint thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.engineeringmodeldata.ParametricConstraint(UUID.fromString(thing.getIid()), cache, uri);
    }
}
