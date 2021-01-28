/* --------------------------------------------------------------------------------------------------------------------
 * RuleVerification.java
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
 * Static resource that allows to change representation of the {@link RuleVerification} class.
 */
public abstract class RuleVerification {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.RuleVerification} to {@link CDP4.EngineeringModelData.RuleVerification}
     *
     * @return Generated {@link CDP4.EngineeringModelData.RuleVerification}
     */
    public static CDP4.EngineeringModelData.RuleVerification toEmf(cdp4common.engineeringmodeldata.RuleVerification thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.UserRuleVerification":
        CDP4.EngineeringModelData.RuleVerification emfUserRuleVerification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createUserRuleVerification();    
        
        emfUserRuleVerification.setIid(thing.getIid().toString()); 
        
        emfUserRuleVerification.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfUserRuleVerification.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfUserRuleVerification.setExecutedOn(thing.getExecutedOn());
        
        emfUserRuleVerification.setIsActive(thing.isActive());
        
        emfUserRuleVerification.setModifiedOn(thing.getModifiedOn());
        
        emfUserRuleVerification.setName(thing.getName());
        
        emfUserRuleVerification.setRevisionNumber(thing.getRevisionNumber());
        
        if (thing.getStatus() != null) {emfUserRuleVerification.setStatus(CDP4.EngineeringModelData.RuleVerificationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfUserRuleVerification.setThingPreference(thing.getThingPreference());
        
        emfUserRuleVerification.getViolation().addAll(thing.getViolation().stream().map(item -> cdp4emfconnector.RuleViolation.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfUserRuleVerification;
        
        case "cdp4common.engineeringmodeldata.BuiltInRuleVerification":
        CDP4.EngineeringModelData.RuleVerification emfBuiltInRuleVerification =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createBuiltInRuleVerification();    
        
        emfBuiltInRuleVerification.setIid(thing.getIid().toString()); 
        
        emfBuiltInRuleVerification.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBuiltInRuleVerification.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBuiltInRuleVerification.setExecutedOn(thing.getExecutedOn());
        
        emfBuiltInRuleVerification.setIsActive(thing.isActive());
        
        emfBuiltInRuleVerification.setModifiedOn(thing.getModifiedOn());
        
        emfBuiltInRuleVerification.setName(thing.getName());
        
        emfBuiltInRuleVerification.setRevisionNumber(thing.getRevisionNumber());
        
        if (thing.getStatus() != null) {emfBuiltInRuleVerification.setStatus(CDP4.EngineeringModelData.RuleVerificationStatusKind.valueOf(thing.getStatus().toString()));}                        
        
        emfBuiltInRuleVerification.setThingPreference(thing.getThingPreference());
        
        emfBuiltInRuleVerification.getViolation().addAll(thing.getViolation().stream().map(item -> cdp4emfconnector.RuleViolation.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfBuiltInRuleVerification;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.RuleVerification} to {@link cdp4common.engineeringmodeldata.RuleVerification}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.RuleVerification}
     */
    public static cdp4common.engineeringmodeldata.RuleVerification toPojo(CDP4.EngineeringModelData.RuleVerification emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.UserRuleVerification":                
        cdp4common.engineeringmodeldata.RuleVerification pojoUserRuleVerification = new cdp4common.engineeringmodeldata.UserRuleVerification();	    
        
        pojoUserRuleVerification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoUserRuleVerification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserRuleVerification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoUserRuleVerification.setExecutedOn(emfThing.getExecutedOn());
        
        pojoUserRuleVerification.setActive(emfThing.getIsActive());
        
        pojoUserRuleVerification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoUserRuleVerification.setName(emfThing.getName());
        
        pojoUserRuleVerification.setRevisionNumber(emfThing.getRevisionNumber());
        
        if (emfThing.getStatus() != null) {pojoUserRuleVerification.setStatus(cdp4common.engineeringmodeldata.RuleVerificationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoUserRuleVerification.setThingPreference(emfThing.getThingPreference());
        
        pojoUserRuleVerification.getViolation().addAll(emfThing.getViolation().stream().map(item -> cdp4emfconnector.RuleViolation.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoUserRuleVerification;
        
        case "CDP4.engineeringmodeldata.BuiltInRuleVerification":                
        cdp4common.engineeringmodeldata.RuleVerification pojoBuiltInRuleVerification = new cdp4common.engineeringmodeldata.BuiltInRuleVerification();	    
        
        pojoBuiltInRuleVerification.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBuiltInRuleVerification.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBuiltInRuleVerification.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBuiltInRuleVerification.setExecutedOn(emfThing.getExecutedOn());
        
        pojoBuiltInRuleVerification.setActive(emfThing.getIsActive());
        
        pojoBuiltInRuleVerification.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBuiltInRuleVerification.setName(emfThing.getName());
        
        pojoBuiltInRuleVerification.setRevisionNumber(emfThing.getRevisionNumber());
        
        if (emfThing.getStatus() != null) {pojoBuiltInRuleVerification.setStatus(cdp4common.engineeringmodeldata.RuleVerificationStatusKind.valueOf(emfThing.getStatus().toString()));}        
        
        pojoBuiltInRuleVerification.setThingPreference(emfThing.getThingPreference());
        
        pojoBuiltInRuleVerification.getViolation().addAll(emfThing.getViolation().stream().map(item -> cdp4emfconnector.RuleViolation.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoBuiltInRuleVerification;
        	
        }

        return null;
    }
    
}
