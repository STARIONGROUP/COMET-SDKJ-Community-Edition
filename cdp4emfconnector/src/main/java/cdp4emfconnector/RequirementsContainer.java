/* --------------------------------------------------------------------------------------------------------------------
 * RequirementsContainer.java
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
 * Static resource that allows to change representation of the {@link RequirementsContainer} class.
 */
public abstract class RequirementsContainer {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.RequirementsContainer} to {@link CDP4.EngineeringModelData.RequirementsContainer}
     *
     * @return Generated {@link CDP4.EngineeringModelData.RequirementsContainer}
     */
    public static CDP4.EngineeringModelData.RequirementsContainer toEmf(cdp4common.engineeringmodeldata.RequirementsContainer thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.RequirementsSpecification":
        CDP4.EngineeringModelData.RequirementsContainer emfRequirementsSpecification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsSpecification();    
        
        emfRequirementsSpecification.setIid(thing.getIid().toString()); 
        
        emfRequirementsSpecification.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getGroup().addAll(thing.getGroup().stream().map(item -> cdp4emfconnector.RequirementsGroup.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsSpecification.setName(thing.getName());
        
        emfRequirementsSpecification.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfRequirementsSpecification.getParameterValue().addAll(thing.getParameterValue().stream().map(item -> cdp4emfconnector.RequirementsContainerParameterValue.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsSpecification.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsSpecification.setShortName(thing.getShortName());
        
        emfRequirementsSpecification.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirementsSpecification;
        
        case "cdp4common.engineeringmodeldata.RequirementsGroup":
        CDP4.EngineeringModelData.RequirementsContainer emfRequirementsGroup =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRequirementsGroup();    
        
        emfRequirementsGroup.setIid(thing.getIid().toString()); 
        
        emfRequirementsGroup.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getGroup().addAll(thing.getGroup().stream().map(item -> cdp4emfconnector.RequirementsGroup.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.setModifiedOn(thing.getModifiedOn());
        
        emfRequirementsGroup.setName(thing.getName());
        
        emfRequirementsGroup.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfRequirementsGroup.getParameterValue().addAll(thing.getParameterValue().stream().map(item -> cdp4emfconnector.RequirementsContainerParameterValue.toEmf(item)).collect(Collectors.toList()));
        
        emfRequirementsGroup.setRevisionNumber(thing.getRevisionNumber());
        
        emfRequirementsGroup.setShortName(thing.getShortName());
        
        emfRequirementsGroup.setThingPreference(thing.getThingPreference());
        		        
        return emfRequirementsGroup;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.RequirementsContainer} to {@link cdp4common.engineeringmodeldata.RequirementsContainer}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.RequirementsContainer}
     */
    public static cdp4common.engineeringmodeldata.RequirementsContainer toPojo(CDP4.EngineeringModelData.RequirementsContainer emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.RequirementsSpecification":                
        cdp4common.engineeringmodeldata.RequirementsContainer pojoRequirementsSpecification = new cdp4common.engineeringmodeldata.RequirementsSpecification();	    
        
        pojoRequirementsSpecification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsSpecification.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getGroup().addAll(emfThing.getGroup().stream().map(item -> cdp4emfconnector.RequirementsGroup.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsSpecification.setName(emfThing.getName());
        
        pojoRequirementsSpecification.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoRequirementsSpecification.getParameterValue().addAll(emfThing.getParameterValue().stream().map(item -> cdp4emfconnector.RequirementsContainerParameterValue.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsSpecification.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirementsSpecification.setShortName(emfThing.getShortName());
        
        pojoRequirementsSpecification.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequirementsSpecification;
        
        case "CDP4.engineeringmodeldata.RequirementsGroup":                
        cdp4common.engineeringmodeldata.RequirementsContainer pojoRequirementsGroup = new cdp4common.engineeringmodeldata.RequirementsGroup();	    
        
        pojoRequirementsGroup.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRequirementsGroup.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getGroup().addAll(emfThing.getGroup().stream().map(item -> cdp4emfconnector.RequirementsGroup.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRequirementsGroup.setName(emfThing.getName());
        
        pojoRequirementsGroup.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoRequirementsGroup.getParameterValue().addAll(emfThing.getParameterValue().stream().map(item -> cdp4emfconnector.RequirementsContainerParameterValue.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRequirementsGroup.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRequirementsGroup.setShortName(emfThing.getShortName());
        
        pojoRequirementsGroup.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRequirementsGroup;
        	
        }

        return null;
    }
    
}
