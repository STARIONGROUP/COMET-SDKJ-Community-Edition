/* --------------------------------------------------------------------------------------------------------------------
 * ModelLogEntry.java
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
 * Static resource that allows to change representation of the {@link ModelLogEntry} class.
 */
public class ModelLogEntry {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.ModelLogEntry} to {@link CDP4.EngineeringModelData.ModelLogEntry}
     *
     * @return Generated {@link CDP4.EngineeringModelData.ModelLogEntry}
     */
    public static CDP4.EngineeringModelData.ModelLogEntry toEmf(cdp4common.engineeringmodeldata.ModelLogEntry thing) {       
        
        CDP4.EngineeringModelData.ModelLogEntry emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createModelLogEntry();      
       
        emf.setIid(thing.getIid().toString()); 
        
        thing.getAffectedItemIid().forEach(item -> emf.getAffectedItemIid().add(item.toString()));
        emf.setAuthor(thing.getAuthor() != null ? cdp4emfconnector.Person.toEmf(thing.getAuthor()) : null);
        emf.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emf.setContent(thing.getContent());
        
        emf.setCreatedOn(thing.getCreatedOn());
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setLanguageCode(thing.getLanguageCode());
        
        if (thing.getLevel() != null) {emf.setLevel(CDP4.CommonData.LogLevelKind.valueOf(thing.getLevel().toString()));}                          
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.ModelLogEntry} to {@link cdp4common.engineeringmodeldata.ModelLogEntry}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.ModelLogEntry}
     */
    public static cdp4common.engineeringmodeldata.ModelLogEntry toPojo(CDP4.EngineeringModelData.ModelLogEntry emfThing) {
        
        cdp4common.engineeringmodeldata.ModelLogEntry pojo = new cdp4common.engineeringmodeldata.ModelLogEntry();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        emfThing.getAffectedItemIid().forEach(item -> pojo.getAffectedItemIid().add(UUID.fromString(item.toString())));
        pojo.setAuthor(emfThing.getAuthor() != null ? cdp4emfconnector.Person.toPojo(emfThing.getAuthor()) : null);
        pojo.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setContent(emfThing.getContent());
        
        pojo.setCreatedOn(emfThing.getCreatedOn());
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setLanguageCode(emfThing.getLanguageCode());
        
        if (emfThing.getLevel() != null) {pojo.setLevel(cdp4common.commondata.LogLevelKind.valueOf(emfThing.getLevel().toString()));}  
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.engineeringmodeldata.ModelLogEntry} from a {@link CDP4.EngineeringModelData.ModelLogEntry}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ModelLogEntry}.
    * @return A new {@link cdp4common.engineeringmodeldata.ModelLogEntry}
    */
    public static cdp4common.engineeringmodeldata.ModelLogEntry instiatePojo(CDP4.EngineeringModelData.ModelLogEntry thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.engineeringmodeldata.ModelLogEntry(UUID.fromString(thing.getIid()), cache, uri);
    }
}
