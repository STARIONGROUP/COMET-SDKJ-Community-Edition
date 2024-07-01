/* --------------------------------------------------------------------------------------------------------------------
 * Relationship.java
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
 * Static resource that allows to change representation of the {@link Relationship} class.
 */
public abstract class Relationship {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.Relationship} to {@link CDP4.EngineeringModelData.Relationship}
     *
     * @return Generated {@link CDP4.EngineeringModelData.Relationship}
     */
    public static CDP4.EngineeringModelData.Relationship toEmf(cdp4common.engineeringmodeldata.Relationship thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.MultiRelationship":
        CDP4.EngineeringModelData.Relationship emfMultiRelationship =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createMultiRelationship();    
        
        emfMultiRelationship.setIid(thing.getIid().toString()); 
        
        emfMultiRelationship.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationship.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationship.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationship.setModifiedOn(thing.getModifiedOn());
        
        emfMultiRelationship.setName(thing.getName());
        
        emfMultiRelationship.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfMultiRelationship.getParameterValue().addAll(thing.getParameterValue().stream().map(item -> cdp4emfconnector.RelationshipParameterValue.toEmf(item)).collect(Collectors.toList()));
        
        emfMultiRelationship.setRevisionNumber(thing.getRevisionNumber());
        
        emfMultiRelationship.setThingPreference(thing.getThingPreference());
        		        
        return emfMultiRelationship;
        
        case "cdp4common.engineeringmodeldata.BinaryRelationship":
        CDP4.EngineeringModelData.Relationship emfBinaryRelationship =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createBinaryRelationship();    
        
        emfBinaryRelationship.setIid(thing.getIid().toString()); 
        
        emfBinaryRelationship.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationship.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationship.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationship.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryRelationship.setName(thing.getName());
        
        emfBinaryRelationship.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfBinaryRelationship.getParameterValue().addAll(thing.getParameterValue().stream().map(item -> cdp4emfconnector.RelationshipParameterValue.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryRelationship.setRevisionNumber(thing.getRevisionNumber());
        
        emfBinaryRelationship.setThingPreference(thing.getThingPreference());
        		        
        return emfBinaryRelationship;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.Relationship} to {@link cdp4common.engineeringmodeldata.Relationship}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.Relationship}
     */
    public static cdp4common.engineeringmodeldata.Relationship toPojo(CDP4.EngineeringModelData.Relationship emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.MultiRelationship":                
        cdp4common.engineeringmodeldata.Relationship pojoMultiRelationship = new cdp4common.engineeringmodeldata.MultiRelationship();	    
        
        pojoMultiRelationship.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMultiRelationship.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationship.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationship.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationship.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMultiRelationship.setName(emfThing.getName());
        
        pojoMultiRelationship.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoMultiRelationship.getParameterValue().addAll(emfThing.getParameterValue().stream().map(item -> cdp4emfconnector.RelationshipParameterValue.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationship.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoMultiRelationship.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoMultiRelationship;
        
        case "CDP4.engineeringmodeldata.BinaryRelationship":                
        cdp4common.engineeringmodeldata.Relationship pojoBinaryRelationship = new cdp4common.engineeringmodeldata.BinaryRelationship();	    
        
        pojoBinaryRelationship.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryRelationship.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationship.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationship.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationship.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryRelationship.setName(emfThing.getName());
        
        pojoBinaryRelationship.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoBinaryRelationship.getParameterValue().addAll(emfThing.getParameterValue().stream().map(item -> cdp4emfconnector.RelationshipParameterValue.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationship.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBinaryRelationship.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoBinaryRelationship;
        	
        }

        return null;
    }
    
}
