/* --------------------------------------------------------------------------------------------------------------------
 * ParameterBase.java
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
 * Static resource that allows to change representation of the {@link ParameterBase} class.
 */
public abstract class ParameterBase {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.ParameterBase} to {@link CDP4.EngineeringModelData.ParameterBase}
     *
     * @return Generated {@link CDP4.EngineeringModelData.ParameterBase}
     */
    public static CDP4.EngineeringModelData.ParameterBase toEmf(cdp4common.engineeringmodeldata.ParameterBase thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.ParameterSubscription":
        CDP4.EngineeringModelData.ParameterBase emfParameterSubscription =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterSubscription();    
        
        emfParameterSubscription.setIid(thing.getIid().toString()); 
        
        emfParameterSubscription.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterSubscription.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterSubscription.setGroup(thing.getGroup() != null ? cdp4emfconnector.ParameterGroup.toEmf(thing.getGroup()) : null);
        emfParameterSubscription.setIsOptionDependent(thing.isOptionDependent());
        
        emfParameterSubscription.setModifiedOn(thing.getModifiedOn());
        
        emfParameterSubscription.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfParameterSubscription.setParameterType(thing.getParameterType() != null ? cdp4emfconnector.ParameterType.toEmf(thing.getParameterType()) : null);        
        
        emfParameterSubscription.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterSubscription.setScale(thing.getScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getScale()) : null);
        emfParameterSubscription.setStateDependence(thing.getStateDependence() != null ? cdp4emfconnector.ActualFiniteStateList.toEmf(thing.getStateDependence()) : null);
        emfParameterSubscription.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterSubscription;
        
        
        case "cdp4common.engineeringmodeldata.Parameter":
        CDP4.EngineeringModelData.ParameterBase emfParameter =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameter();    
        
        emfParameter.setIid(thing.getIid().toString()); 
        
        emfParameter.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameter.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameter.setGroup(thing.getGroup() != null ? cdp4emfconnector.ParameterGroup.toEmf(thing.getGroup()) : null);
        emfParameter.setIsOptionDependent(thing.isOptionDependent());
        
        emfParameter.setModifiedOn(thing.getModifiedOn());
        
        emfParameter.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfParameter.setParameterType(thing.getParameterType() != null ? cdp4emfconnector.ParameterType.toEmf(thing.getParameterType()) : null);        
        
        emfParameter.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameter.setScale(thing.getScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getScale()) : null);
        emfParameter.setStateDependence(thing.getStateDependence() != null ? cdp4emfconnector.ActualFiniteStateList.toEmf(thing.getStateDependence()) : null);
        emfParameter.setThingPreference(thing.getThingPreference());
        		        
        return emfParameter;
        
        case "cdp4common.engineeringmodeldata.ParameterOverride":
        CDP4.EngineeringModelData.ParameterBase emfParameterOverride =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterOverride();    
        
        emfParameterOverride.setIid(thing.getIid().toString()); 
        
        emfParameterOverride.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterOverride.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfParameterOverride.setGroup(thing.getGroup() != null ? cdp4emfconnector.ParameterGroup.toEmf(thing.getGroup()) : null);
        emfParameterOverride.setIsOptionDependent(thing.isOptionDependent());
        
        emfParameterOverride.setModifiedOn(thing.getModifiedOn());
        
        emfParameterOverride.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfParameterOverride.setParameterType(thing.getParameterType() != null ? cdp4emfconnector.ParameterType.toEmf(thing.getParameterType()) : null);        
        
        emfParameterOverride.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterOverride.setScale(thing.getScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getScale()) : null);
        emfParameterOverride.setStateDependence(thing.getStateDependence() != null ? cdp4emfconnector.ActualFiniteStateList.toEmf(thing.getStateDependence()) : null);
        emfParameterOverride.setThingPreference(thing.getThingPreference());
        		        
        return emfParameterOverride;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.ParameterBase} to {@link cdp4common.engineeringmodeldata.ParameterBase}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.ParameterBase}
     */
    public static cdp4common.engineeringmodeldata.ParameterBase toPojo(CDP4.EngineeringModelData.ParameterBase emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.ParameterSubscription":                
        cdp4common.engineeringmodeldata.ParameterBase pojoParameterSubscription = new cdp4common.engineeringmodeldata.ParameterSubscription();	    
        
        pojoParameterSubscription.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterSubscription.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscription.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterSubscription.setGroup(emfThing.getGroup() != null ? cdp4emfconnector.ParameterGroup.toPojo(emfThing.getGroup()) : null);
        pojoParameterSubscription.setOptionDependent(emfThing.getIsOptionDependent());
        
        pojoParameterSubscription.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterSubscription.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoParameterSubscription.setParameterType(emfThing.getParameterType() != null ? cdp4emfconnector.ParameterType.toPojo(emfThing.getParameterType()) : null);        
        
        pojoParameterSubscription.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterSubscription.setScale(emfThing.getScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getScale()) : null);
        pojoParameterSubscription.setStateDependence(emfThing.getStateDependence() != null ? cdp4emfconnector.ActualFiniteStateList.toPojo(emfThing.getStateDependence()) : null);
        pojoParameterSubscription.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterSubscription;
        
        
        case "CDP4.engineeringmodeldata.Parameter":                
        cdp4common.engineeringmodeldata.ParameterBase pojoParameter = new cdp4common.engineeringmodeldata.Parameter();	    
        
        pojoParameter.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameter.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameter.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameter.setGroup(emfThing.getGroup() != null ? cdp4emfconnector.ParameterGroup.toPojo(emfThing.getGroup()) : null);
        pojoParameter.setOptionDependent(emfThing.getIsOptionDependent());
        
        pojoParameter.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameter.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoParameter.setParameterType(emfThing.getParameterType() != null ? cdp4emfconnector.ParameterType.toPojo(emfThing.getParameterType()) : null);        
        
        pojoParameter.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameter.setScale(emfThing.getScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getScale()) : null);
        pojoParameter.setStateDependence(emfThing.getStateDependence() != null ? cdp4emfconnector.ActualFiniteStateList.toPojo(emfThing.getStateDependence()) : null);
        pojoParameter.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameter;
        
        case "CDP4.engineeringmodeldata.ParameterOverride":                
        cdp4common.engineeringmodeldata.ParameterBase pojoParameterOverride = new cdp4common.engineeringmodeldata.ParameterOverride();	    
        
        pojoParameterOverride.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterOverride.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverride.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverride.setGroup(emfThing.getGroup() != null ? cdp4emfconnector.ParameterGroup.toPojo(emfThing.getGroup()) : null);
        pojoParameterOverride.setOptionDependent(emfThing.getIsOptionDependent());
        
        pojoParameterOverride.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterOverride.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoParameterOverride.setParameterType(emfThing.getParameterType() != null ? cdp4emfconnector.ParameterType.toPojo(emfThing.getParameterType()) : null);        
        
        pojoParameterOverride.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterOverride.setScale(emfThing.getScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getScale()) : null);
        pojoParameterOverride.setStateDependence(emfThing.getStateDependence() != null ? cdp4emfconnector.ActualFiniteStateList.toPojo(emfThing.getStateDependence()) : null);
        pojoParameterOverride.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoParameterOverride;
        	
        }

        return null;
    }
    
}
