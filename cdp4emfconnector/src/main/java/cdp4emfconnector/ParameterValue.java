/* --------------------------------------------------------------------------------------------------------------------
 * ParameterValue.java
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

public abstract class ParameterValue {

    public static CDP4.EngineeringModelData.ParameterValue toEmf(cdp4common.engineeringmodeldata.ParameterValue thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.RequirementsContainerParameterValue":
        CDP4.EngineeringModelData.ParameterValue emfRequirementsContainerParameterValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsContainerParameterValue();    
        
        emfRequirementsContainerParameterValue.setIid(thing.getIid().toString()); 
        
        
        
        emfRequirementsContainerParameterValue.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsContainerParameterValue.setParameterType(thing.getParameterType() != null ? cdp4emfconnector.ParameterType.toEmf(thing.getParameterType()) : null);        
        
        emfRequirementsContainerParameterValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsContainerParameterValue.setScale(thing.getScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getScale()) : null);
        thing.getValue().forEach(item -> emfRequirementsContainerParameterValue.getValue().add(item));	      
        		        
        return emfRequirementsContainerParameterValue;   
        
        
        case "cdp4common.engineeringmodeldata.RelationshipParameterValue":
        CDP4.EngineeringModelData.ParameterValue emfRelationshipParameterValue =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRelationshipParameterValue();    
        
        emfRelationshipParameterValue.setIid(thing.getIid().toString()); 
        
        
        
        emfRelationshipParameterValue.setModifiedOn(thing.getModifiedOn());
        
        emfRelationshipParameterValue.setParameterType(thing.getParameterType() != null ? cdp4emfconnector.ParameterType.toEmf(thing.getParameterType()) : null);        
        
        emfRelationshipParameterValue.setRevisionNumber(thing.getRevisionNumber());
        
        emfRelationshipParameterValue.setScale(thing.getScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getScale()) : null);
        thing.getValue().forEach(item -> emfRelationshipParameterValue.getValue().add(item));	      
        		        
        return emfRelationshipParameterValue;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.engineeringmodeldata.ParameterValue toPojo(CDP4.EngineeringModelData.ParameterValue emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.RequirementsContainerParameterValue":                
        cdp4common.engineeringmodeldata.ParameterValue pojoRequirementsContainerParameterValue = new cdp4common.engineeringmodeldata.RequirementsContainerParameterValue();	    
        
        pojoRequirementsContainerParameterValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsContainerParameterValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsContainerParameterValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsContainerParameterValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsContainerParameterValue.setParameterType(emfThing.getParameterType() != null ? cdp4emfconnector.ParameterType.toPojo(emfThing.getParameterType()) : null);        
        
        pojoRequirementsContainerParameterValue.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirementsContainerParameterValue.setScale(emfThing.getScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getScale()) : null);
        emfThing.getValue().forEach(item -> pojoRequirementsContainerParameterValue.getValue().set(item.indexOf(item), item));		      
        		        
        return pojoRequirementsContainerParameterValue;   
        
        
        case "CDP4.engineeringmodeldata.RelationshipParameterValue":                
        cdp4common.engineeringmodeldata.ParameterValue pojoRelationshipParameterValue = new cdp4common.engineeringmodeldata.RelationshipParameterValue();	    
        
        pojoRelationshipParameterValue.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRelationshipParameterValue.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationshipParameterValue.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationshipParameterValue.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRelationshipParameterValue.setParameterType(emfThing.getParameterType() != null ? cdp4emfconnector.ParameterType.toPojo(emfThing.getParameterType()) : null);        
        
        pojoRelationshipParameterValue.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRelationshipParameterValue.setScale(emfThing.getScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getScale()) : null);
        emfThing.getValue().forEach(item -> pojoRelationshipParameterValue.getValue().set(item.indexOf(item), item));		      
        		        
        return pojoRelationshipParameterValue;   
        
        	
    }
        return null;
        
        
     }

        
}
