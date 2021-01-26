/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModel.java
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
 * Static resource that allows to change representation of the {@link EngineeringModel} class.
 */
public class EngineeringModel {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.EngineeringModel} to {@link CDP4.EngineeringModelData.EngineeringModel}
     *
     * @return Generated {@link CDP4.EngineeringModelData.EngineeringModel}
     */
    public static CDP4.EngineeringModelData.EngineeringModel toEmf(cdp4common.engineeringmodeldata.EngineeringModel thing) {       
        
        CDP4.EngineeringModelData.EngineeringModel emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createEngineeringModel();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getBook().addAll(thing.getBook().stream().map(item -> cdp4emfconnector.Book.toEmf(item)).collect(Collectors.toList()));
        
        emf.setCommonFileStore(thing.getCommonFileStore().stream().map(item -> cdp4emfconnector.CommonFileStore.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emf.setEngineeringModelSetup(thing.getEngineeringModelSetup() != null ? cdp4emfconnector.EngineeringModelSetup.toEmf(thing.getEngineeringModelSetup()) : null);        
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getGenericNote().addAll(thing.getGenericNote().stream().map(item -> cdp4emfconnector.EngineeringModelDataNote.toEmf(item)).collect(Collectors.toList()));
        
        emf.getIteration().addAll(thing.getIteration().stream().map(item -> cdp4emfconnector.Iteration.toEmf(item)).collect(Collectors.toList()));
        
        emf.setLastModifiedOn(thing.getLastModifiedOn());
        
        emf.getLogEntry().addAll(thing.getLogEntry().stream().map(item -> cdp4emfconnector.ModelLogEntry.toEmf(item)).collect(Collectors.toList()));
        
        emf.getModellingAnnotation().addAll(thing.getModellingAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toEmf(item)).collect(Collectors.toList()));
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setThingPreference(thing.getThingPreference());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.EngineeringModel} to {@link cdp4common.engineeringmodeldata.EngineeringModel}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.EngineeringModel}
     */
    public static cdp4common.engineeringmodeldata.EngineeringModel toPojo(CDP4.EngineeringModelData.EngineeringModel emfThing) {
        
        cdp4common.engineeringmodeldata.EngineeringModel pojo = new cdp4common.engineeringmodeldata.EngineeringModel();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getBook().addAll(emfThing.getBook().stream().map(item -> cdp4emfconnector.Book.toPojo(item)).collect(Collectors.toList()));
        
        pojo.getCommonFileStore().add(cdp4emfconnector.CommonFileStore.toPojo(emfThing.getCommonFileStore()));   
        
        pojo.setEngineeringModelSetup(emfThing.getEngineeringModelSetup() != null ? cdp4emfconnector.EngineeringModelSetup.toPojo(emfThing.getEngineeringModelSetup()) : null);        
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getGenericNote().addAll(emfThing.getGenericNote().stream().map(item -> cdp4emfconnector.EngineeringModelDataNote.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getIteration().addAll(emfThing.getIteration().stream().map(item -> cdp4emfconnector.Iteration.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setLastModifiedOn(emfThing.getLastModifiedOn());
        
        pojo.getLogEntry().addAll(emfThing.getLogEntry().stream().map(item -> cdp4emfconnector.ModelLogEntry.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getModellingAnnotation().addAll(emfThing.getModellingAnnotation().stream().map(item -> cdp4emfconnector.ModellingAnnotationItem.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.engineeringmodeldata.EngineeringModel} from a {@link CDP4.EngineeringModelData.EngineeringModel}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.EngineeringModel}.
    * @return A new {@link cdp4common.engineeringmodeldata.EngineeringModel}
    */
    public static cdp4common.engineeringmodeldata.EngineeringModel instiatePojo(CDP4.EngineeringModelData.EngineeringModel thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.engineeringmodeldata.EngineeringModel(UUID.fromString(thing.getIid()), cache, uri);
    }
}
