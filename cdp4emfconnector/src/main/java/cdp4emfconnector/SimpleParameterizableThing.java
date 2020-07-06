/* --------------------------------------------------------------------------------------------------------------------
 * SimpleParameterizableThing.java
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

public abstract class SimpleParameterizableThing {

    public static CDP4.EngineeringModelData.SimpleParameterizableThing toEmf(cdp4common.engineeringmodeldata.SimpleParameterizableThing thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.Requirement":
        CDP4.EngineeringModelData.SimpleParameterizableThing emfRequirement =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirement();    
        
        emfRequirement.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfRequirement.setModifiedOn(thing.getModifiedOn());
        
        emfRequirement.setName(thing.getName());
        
        emfRequirement.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        
        emfRequirement.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirement.setShortName(thing.getShortName());
        		        
        return emfRequirement;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.engineeringmodeldata.SimpleParameterizableThing toPojo(CDP4.EngineeringModelData.SimpleParameterizableThing emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.Requirement":                
        cdp4common.engineeringmodeldata.SimpleParameterizableThing pojoRequirement = new cdp4common.engineeringmodeldata.Requirement();	    
        
        pojoRequirement.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirement.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirement.setName(emfThing.getName());
        
        pojoRequirement.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoRequirement.getParameterValue().addAll(emfThing.getParameterValue().stream().map(item -> cdp4emfconnector.SimpleParameterValue.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirement.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirement.setShortName(emfThing.getShortName());
        		        
        return pojoRequirement;   
        
        	
    }
        return null;
        
        
     }

        
}
