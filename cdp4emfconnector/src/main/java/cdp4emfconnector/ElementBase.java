/* --------------------------------------------------------------------------------------------------------------------
 * ElementBase.java
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
 * Static resource that allows to change representation of the {@link ElementBase} class.
 */
public abstract class ElementBase {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.ElementBase} to {@link CDP4.EngineeringModelData.ElementBase}
     *
     * @return Generated {@link CDP4.EngineeringModelData.ElementBase}
     */
    public static CDP4.EngineeringModelData.ElementBase toEmf(cdp4common.engineeringmodeldata.ElementBase thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.ElementDefinition":
        CDP4.EngineeringModelData.ElementBase emfElementDefinition =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementDefinition();    
        
        emfElementDefinition.setIid(thing.getIid().toString()); 
        
        emfElementDefinition.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfElementDefinition.setModifiedOn(thing.getModifiedOn());
        
        emfElementDefinition.setName(thing.getName());
        
        emfElementDefinition.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfElementDefinition.setRevisionNumber(thing.getRevisionNumber());
        
        emfElementDefinition.setShortName(thing.getShortName());
        		        
        return emfElementDefinition;
        
        case "cdp4common.engineeringmodeldata.ElementUsage":
        CDP4.EngineeringModelData.ElementBase emfElementUsage =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createElementUsage();    
        
        emfElementUsage.setIid(thing.getIid().toString()); 
        
        emfElementUsage.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfElementUsage.setModifiedOn(thing.getModifiedOn());
        
        emfElementUsage.setName(thing.getName());
        
        emfElementUsage.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfElementUsage.setRevisionNumber(thing.getRevisionNumber());
        
        emfElementUsage.setShortName(thing.getShortName());
        		        
        return emfElementUsage;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.ElementBase} to {@link cdp4common.engineeringmodeldata.ElementBase}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.ElementBase}
     */
    public static cdp4common.engineeringmodeldata.ElementBase toPojo(CDP4.EngineeringModelData.ElementBase emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.ElementDefinition":                
        cdp4common.engineeringmodeldata.ElementBase pojoElementDefinition = new cdp4common.engineeringmodeldata.ElementDefinition();	    
        
        pojoElementDefinition.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoElementDefinition.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementDefinition.setModifiedOn(emfThing.getModifiedOn());
        
        pojoElementDefinition.setName(emfThing.getName());
        
        pojoElementDefinition.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoElementDefinition.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoElementDefinition.setShortName(emfThing.getShortName());
        		        
        return pojoElementDefinition;
        
        case "CDP4.engineeringmodeldata.ElementUsage":                
        cdp4common.engineeringmodeldata.ElementBase pojoElementUsage = new cdp4common.engineeringmodeldata.ElementUsage();	    
        
        pojoElementUsage.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoElementUsage.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoElementUsage.setModifiedOn(emfThing.getModifiedOn());
        
        pojoElementUsage.setName(emfThing.getName());
        
        pojoElementUsage.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoElementUsage.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoElementUsage.setShortName(emfThing.getShortName());
        		        
        return pojoElementUsage;
        	
        }

        return null;
    }
    
}
