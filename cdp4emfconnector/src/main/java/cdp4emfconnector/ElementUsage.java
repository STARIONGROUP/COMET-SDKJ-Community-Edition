/* --------------------------------------------------------------------------------------------------------------------
 * ElementUsage.java
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

public class ElementUsage {

    public static CDP4.EngineeringModelData.ElementUsage toEmf(cdp4common.engineeringmodeldata.ElementUsage thing) {       
        
        
        CDP4.EngineeringModelData.ElementUsage emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementUsage();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emf.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emf.setElementDefinition(thing.getElementDefinition() != null ? cdp4emfconnector.ElementDefinition.toEmf(thing.getElementDefinition()) : null);        
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludeOption().addAll(thing.getExcludeOption().stream().map(item -> cdp4emfconnector.Option.toEmf(item)).collect(Collectors.toList()));
        
        emf.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getInterfaceEnd() != null) {emf.setInterfaceEnd(CDP4.EngineeringModelData.InterfaceEndKind.valueOf(thing.getInterfaceEnd().toString()));}                          
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emf.getParameterOverride().addAll(thing.getParameterOverride().stream().map(item -> cdp4emfconnector.ParameterOverride.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setShortName(thing.getShortName());
        
        return emf;
        
    }

    public static  cdp4common.engineeringmodeldata.ElementUsage toPojo(CDP4.EngineeringModelData.ElementUsage emfThing) {
        
        
        cdp4common.engineeringmodeldata.ElementUsage pojo = new cdp4common.engineeringmodeldata.ElementUsage();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setElementDefinition(emfThing.getElementDefinition() != null ? cdp4emfconnector.ElementDefinition.toPojo(emfThing.getElementDefinition()) : null);        
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludeOption().addAll(emfThing.getExcludeOption().stream().map(item -> cdp4emfconnector.Option.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getInterfaceEnd() != null) {pojo.setInterfaceEnd(cdp4common.engineeringmodeldata.InterfaceEndKind.valueOf(emfThing.getInterfaceEnd().toString()));}  
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojo.getParameterOverride().addAll(emfThing.getParameterOverride().stream().map(item -> cdp4emfconnector.ParameterOverride.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setShortName(emfThing.getShortName());
        
        return pojo;
    	
     }

        
    public static cdp4common.engineeringmodeldata.ElementUsage instiatePojo(CDP4.EngineeringModelData.ElementUsage thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.ElementUsage(UUID.fromString(thing.getIid()), cache, uri);}
}
