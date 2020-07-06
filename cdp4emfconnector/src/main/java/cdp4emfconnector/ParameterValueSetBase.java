/* --------------------------------------------------------------------------------------------------------------------
 * ParameterValueSetBase.java
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

public abstract class ParameterValueSetBase {

    public static CDP4.EngineeringModelData.ParameterValueSetBase toEmf(cdp4common.engineeringmodeldata.ParameterValueSetBase thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.ParameterValueSet":
        CDP4.EngineeringModelData.ParameterValueSetBase emfParameterValueSet =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterValueSet();    
        
        emfParameterValueSet.setIid(thing.getIid().toString()); 
        
        emfParameterValueSet.setActualOption(thing.getActualOption() != null ? cdp4emfconnector.Option.toEmf(thing.getActualOption()) : null);
        emfParameterValueSet.setActualState(thing.getActualState() != null ? cdp4emfconnector.ActualFiniteState.toEmf(thing.getActualState()) : null);
        thing.getComputed().forEach(item -> emfParameterValueSet.getComputed().add(item));	      
        
        
        
        thing.getFormula().forEach(item -> emfParameterValueSet.getFormula().add(item));	      
        
        thing.getManual().forEach(item -> emfParameterValueSet.getManual().add(item));	      
        
        emfParameterValueSet.setModifiedOn(thing.getModifiedOn());
        
        thing.getPublished().forEach(item -> emfParameterValueSet.getPublished().add(item));	      
        
        thing.getReference().forEach(item -> emfParameterValueSet.getReference().add(item));	      
        
        emfParameterValueSet.setRevisionNumber(thing.getRevisionNumber());
        
        if (thing.getValueSwitch() != null) {emfParameterValueSet.setValueSwitch(CDP4.EngineeringModelData.ParameterSwitchKind.valueOf(thing.getValueSwitch().toString()));}                        
        		        
        return emfParameterValueSet;   
        
        
        case "cdp4common.engineeringmodeldata.ParameterOverrideValueSet":
        CDP4.EngineeringModelData.ParameterValueSetBase emfParameterOverrideValueSet =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createParameterOverrideValueSet();    
        
        emfParameterOverrideValueSet.setIid(thing.getIid().toString()); 
        
        emfParameterOverrideValueSet.setActualOption(thing.getActualOption() != null ? cdp4emfconnector.Option.toEmf(thing.getActualOption()) : null);
        emfParameterOverrideValueSet.setActualState(thing.getActualState() != null ? cdp4emfconnector.ActualFiniteState.toEmf(thing.getActualState()) : null);
        thing.getComputed().forEach(item -> emfParameterOverrideValueSet.getComputed().add(item));	      
        
        
        
        thing.getFormula().forEach(item -> emfParameterOverrideValueSet.getFormula().add(item));	      
        
        thing.getManual().forEach(item -> emfParameterOverrideValueSet.getManual().add(item));	      
        
        emfParameterOverrideValueSet.setModifiedOn(thing.getModifiedOn());
        
        thing.getPublished().forEach(item -> emfParameterOverrideValueSet.getPublished().add(item));	      
        
        thing.getReference().forEach(item -> emfParameterOverrideValueSet.getReference().add(item));	      
        
        emfParameterOverrideValueSet.setRevisionNumber(thing.getRevisionNumber());
        
        if (thing.getValueSwitch() != null) {emfParameterOverrideValueSet.setValueSwitch(CDP4.EngineeringModelData.ParameterSwitchKind.valueOf(thing.getValueSwitch().toString()));}                        
        		        
        return emfParameterOverrideValueSet;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.engineeringmodeldata.ParameterValueSetBase toPojo(CDP4.EngineeringModelData.ParameterValueSetBase emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.ParameterValueSet":                
        cdp4common.engineeringmodeldata.ParameterValueSetBase pojoParameterValueSet = new cdp4common.engineeringmodeldata.ParameterValueSet();	    
        
        pojoParameterValueSet.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterValueSet.setActualOption(emfThing.getActualOption() != null ? cdp4emfconnector.Option.toPojo(emfThing.getActualOption()) : null);
        pojoParameterValueSet.setActualState(emfThing.getActualState() != null ? cdp4emfconnector.ActualFiniteState.toPojo(emfThing.getActualState()) : null);
        emfThing.getComputed().forEach(item -> pojoParameterValueSet.getComputed().set(item.indexOf(item), item));		      
        
        pojoParameterValueSet.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterValueSet.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        emfThing.getFormula().forEach(item -> pojoParameterValueSet.getFormula().set(item.indexOf(item), item));		      
        
        emfThing.getManual().forEach(item -> pojoParameterValueSet.getManual().set(item.indexOf(item), item));		      
        
        pojoParameterValueSet.setModifiedOn(emfThing.getModifiedOn());
        
        emfThing.getPublished().forEach(item -> pojoParameterValueSet.getPublished().set(item.indexOf(item), item));		      
        
        emfThing.getReference().forEach(item -> pojoParameterValueSet.getReference().set(item.indexOf(item), item));		      
        
        pojoParameterValueSet.setRevisionNumber(emfThing.getRevisionNumber());
        
        if (emfThing.getValueSwitch() != null) {pojoParameterValueSet.setValueSwitch(cdp4common.engineeringmodeldata.ParameterSwitchKind.valueOf(emfThing.getValueSwitch().toString()));}        
        		        
        return pojoParameterValueSet;   
        
        
        case "CDP4.engineeringmodeldata.ParameterOverrideValueSet":                
        cdp4common.engineeringmodeldata.ParameterValueSetBase pojoParameterOverrideValueSet = new cdp4common.engineeringmodeldata.ParameterOverrideValueSet();	    
        
        pojoParameterOverrideValueSet.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterOverrideValueSet.setActualOption(emfThing.getActualOption() != null ? cdp4emfconnector.Option.toPojo(emfThing.getActualOption()) : null);
        pojoParameterOverrideValueSet.setActualState(emfThing.getActualState() != null ? cdp4emfconnector.ActualFiniteState.toPojo(emfThing.getActualState()) : null);
        emfThing.getComputed().forEach(item -> pojoParameterOverrideValueSet.getComputed().set(item.indexOf(item), item));		      
        
        pojoParameterOverrideValueSet.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterOverrideValueSet.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        emfThing.getFormula().forEach(item -> pojoParameterOverrideValueSet.getFormula().set(item.indexOf(item), item));		      
        
        emfThing.getManual().forEach(item -> pojoParameterOverrideValueSet.getManual().set(item.indexOf(item), item));		      
        
        pojoParameterOverrideValueSet.setModifiedOn(emfThing.getModifiedOn());
        
        emfThing.getPublished().forEach(item -> pojoParameterOverrideValueSet.getPublished().set(item.indexOf(item), item));		      
        
        emfThing.getReference().forEach(item -> pojoParameterOverrideValueSet.getReference().set(item.indexOf(item), item));		      
        
        pojoParameterOverrideValueSet.setRevisionNumber(emfThing.getRevisionNumber());
        
        if (emfThing.getValueSwitch() != null) {pojoParameterOverrideValueSet.setValueSwitch(cdp4common.engineeringmodeldata.ParameterSwitchKind.valueOf(emfThing.getValueSwitch().toString()));}        
        		        
        return pojoParameterOverrideValueSet;   
        
        	
    }
        return null;
        
        
     }

        
}
