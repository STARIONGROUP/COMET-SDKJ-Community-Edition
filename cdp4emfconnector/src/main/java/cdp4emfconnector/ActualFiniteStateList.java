/* --------------------------------------------------------------------------------------------------------------------
 * ActualFiniteStateList.java
 *
 * Copyright (c) 2015-2020 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Kamil Wojnowski
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

public class ActualFiniteStateList {

    public static CDP4.EngineeringModelData.ActualFiniteStateList toEmf(cdp4common.engineeringmodeldata.ActualFiniteStateList thing) {       
        
        
        CDP4.EngineeringModelData.ActualFiniteStateList emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createActualFiniteStateList();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getActualState().addAll(thing.getActualState().stream().map(item -> cdp4emfconnector.ActualFiniteState.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludeOption().addAll(thing.getExcludeOption().stream().map(item -> cdp4emfconnector.Option.toEmf(item)).collect(Collectors.toList()));
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emf.getPossibleFiniteStateList().addAll(thing.getPossibleFiniteStateList().stream().map(item -> cdp4emfconnector.PossibleFiniteStateList.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        return emf;
        
    }

    public static  cdp4common.engineeringmodeldata.ActualFiniteStateList toPojo(CDP4.EngineeringModelData.ActualFiniteStateList emfThing) {
        
        
        cdp4common.engineeringmodeldata.ActualFiniteStateList pojo = new cdp4common.engineeringmodeldata.ActualFiniteStateList();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getActualState().addAll(emfThing.getActualState().stream().map(item -> cdp4emfconnector.ActualFiniteState.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludeOption().addAll(emfThing.getExcludeOption().stream().map(item -> cdp4emfconnector.Option.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojo.getPossibleFiniteStateList().addAll(emfThing.getPossibleFiniteStateList().stream().map(item -> cdp4emfconnector.PossibleFiniteStateList.toPojo(item)).collect(Collectors.toList()));
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        return pojo;
    	
     }

        
    public static cdp4common.engineeringmodeldata.ActualFiniteStateList instiatePojo(CDP4.EngineeringModelData.ActualFiniteStateList thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.ActualFiniteStateList(UUID.fromString(thing.getIid()), cache, uri);}
}
