/* --------------------------------------------------------------------------------------------------------------------
 * BooleanExpression.java
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
 * Static resource that allows to change representation of the {@link BooleanExpression} class.
 */
public abstract class BooleanExpression {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.BooleanExpression} to {@link CDP4.EngineeringModelData.BooleanExpression}
     *
     * @return Generated {@link CDP4.EngineeringModelData.BooleanExpression}
     */
    public static CDP4.EngineeringModelData.BooleanExpression toEmf(cdp4common.engineeringmodeldata.BooleanExpression thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.OrExpression":
        CDP4.EngineeringModelData.BooleanExpression emfOrExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createOrExpression();    
        
        emfOrExpression.setIid(thing.getIid().toString()); 
        
        emfOrExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOrExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOrExpression.setModifiedOn(thing.getModifiedOn());
        
        emfOrExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfOrExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfOrExpression;
        
        case "cdp4common.engineeringmodeldata.NotExpression":
        CDP4.EngineeringModelData.BooleanExpression emfNotExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createNotExpression();    
        
        emfNotExpression.setIid(thing.getIid().toString()); 
        
        emfNotExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfNotExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfNotExpression.setModifiedOn(thing.getModifiedOn());
        
        emfNotExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfNotExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfNotExpression;
        
        case "cdp4common.engineeringmodeldata.AndExpression":
        CDP4.EngineeringModelData.BooleanExpression emfAndExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createAndExpression();    
        
        emfAndExpression.setIid(thing.getIid().toString()); 
        
        emfAndExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfAndExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfAndExpression.setModifiedOn(thing.getModifiedOn());
        
        emfAndExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfAndExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfAndExpression;
        
        case "cdp4common.engineeringmodeldata.ExclusiveOrExpression":
        CDP4.EngineeringModelData.BooleanExpression emfExclusiveOrExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createExclusiveOrExpression();    
        
        emfExclusiveOrExpression.setIid(thing.getIid().toString()); 
        
        emfExclusiveOrExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfExclusiveOrExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfExclusiveOrExpression.setModifiedOn(thing.getModifiedOn());
        
        emfExclusiveOrExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfExclusiveOrExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfExclusiveOrExpression;
        
        case "cdp4common.engineeringmodeldata.RelationalExpression":
        CDP4.EngineeringModelData.BooleanExpression emfRelationalExpression =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createRelationalExpression();    
        
        emfRelationalExpression.setIid(thing.getIid().toString()); 
        
        emfRelationalExpression.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfRelationalExpression.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfRelationalExpression.setModifiedOn(thing.getModifiedOn());
        
        emfRelationalExpression.setRevisionNumber(thing.getRevisionNumber());
        
        emfRelationalExpression.setThingPreference(thing.getThingPreference());
        		        
        return emfRelationalExpression;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.BooleanExpression} to {@link cdp4common.engineeringmodeldata.BooleanExpression}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.BooleanExpression}
     */
    public static cdp4common.engineeringmodeldata.BooleanExpression toPojo(CDP4.EngineeringModelData.BooleanExpression emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.OrExpression":                
        cdp4common.engineeringmodeldata.BooleanExpression pojoOrExpression = new cdp4common.engineeringmodeldata.OrExpression();	    
        
        pojoOrExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOrExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOrExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOrExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOrExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoOrExpression;
        
        case "CDP4.engineeringmodeldata.NotExpression":                
        cdp4common.engineeringmodeldata.BooleanExpression pojoNotExpression = new cdp4common.engineeringmodeldata.NotExpression();	    
        
        pojoNotExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoNotExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNotExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoNotExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoNotExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoNotExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoNotExpression;
        
        case "CDP4.engineeringmodeldata.AndExpression":                
        cdp4common.engineeringmodeldata.BooleanExpression pojoAndExpression = new cdp4common.engineeringmodeldata.AndExpression();	    
        
        pojoAndExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoAndExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAndExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoAndExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoAndExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoAndExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoAndExpression;
        
        case "CDP4.engineeringmodeldata.ExclusiveOrExpression":                
        cdp4common.engineeringmodeldata.BooleanExpression pojoExclusiveOrExpression = new cdp4common.engineeringmodeldata.ExclusiveOrExpression();	    
        
        pojoExclusiveOrExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoExclusiveOrExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExclusiveOrExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoExclusiveOrExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoExclusiveOrExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoExclusiveOrExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoExclusiveOrExpression;
        
        case "CDP4.engineeringmodeldata.RelationalExpression":                
        cdp4common.engineeringmodeldata.BooleanExpression pojoRelationalExpression = new cdp4common.engineeringmodeldata.RelationalExpression();	    
        
        pojoRelationalExpression.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoRelationalExpression.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationalExpression.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoRelationalExpression.setModifiedOn(emfThing.getModifiedOn());
        
        pojoRelationalExpression.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoRelationalExpression.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoRelationalExpression;
        	
        }

        return null;
    }
    
}
