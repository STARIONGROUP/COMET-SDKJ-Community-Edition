/* --------------------------------------------------------------------------------------------------------------------
 * ThingReference.java
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
 * Static resource that allows to change representation of the {@link ThingReference} class.
 */
public abstract class ThingReference {
   
    /**
     * Convert from {@link cdp4common.reportingdata.ThingReference} to {@link CDP4.ReportingData.ThingReference}
     *
     * @return Generated {@link CDP4.ReportingData.ThingReference}
     */
    public static CDP4.ReportingData.ThingReference toEmf(cdp4common.reportingdata.ThingReference thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.reportingdata.ModellingThingReference":
        CDP4.ReportingData.ThingReference emfModellingThingReference =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createModellingThingReference();    
        
        emfModellingThingReference.setIid(thing.getIid().toString()); 
        
        emfModellingThingReference.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfModellingThingReference.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfModellingThingReference.setModifiedOn(thing.getModifiedOn());
        
        emfModellingThingReference.setReferencedRevisionNumber(thing.getReferencedRevisionNumber());
        
        emfModellingThingReference.setReferencedThing(thing.getReferencedThing() != null ? cdp4emfconnector.Thing.toEmf(thing.getReferencedThing()) : null);        
        
        emfModellingThingReference.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfModellingThingReference;
        
        case "cdp4common.reportingdata.SiteDirectoryThingReference":
        CDP4.ReportingData.ThingReference emfSiteDirectoryThingReference =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryThingReference();    
        
        emfSiteDirectoryThingReference.setIid(thing.getIid().toString()); 
        
        emfSiteDirectoryThingReference.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryThingReference.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryThingReference.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryThingReference.setReferencedRevisionNumber(thing.getReferencedRevisionNumber());
        
        emfSiteDirectoryThingReference.setReferencedThing(thing.getReferencedThing() != null ? cdp4emfconnector.Thing.toEmf(thing.getReferencedThing()) : null);        
        
        emfSiteDirectoryThingReference.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSiteDirectoryThingReference;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.ReportingData.ThingReference} to {@link cdp4common.reportingdata.ThingReference}
     *
     * @return Generated {@link cdp4common.reportingdata.ThingReference}
     */
    public static cdp4common.reportingdata.ThingReference toPojo(CDP4.ReportingData.ThingReference emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.reportingdata.ModellingThingReference":                
        cdp4common.reportingdata.ThingReference pojoModellingThingReference = new cdp4common.reportingdata.ModellingThingReference();	    
        
        pojoModellingThingReference.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModellingThingReference.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModellingThingReference.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModellingThingReference.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModellingThingReference.setReferencedRevisionNumber(emfThing.getReferencedRevisionNumber());
        
        pojoModellingThingReference.setReferencedThing(emfThing.getReferencedThing() != null ? cdp4emfconnector.Thing.toPojo(emfThing.getReferencedThing()) : null);        
        
        pojoModellingThingReference.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoModellingThingReference;
        
        case "CDP4.reportingdata.SiteDirectoryThingReference":                
        cdp4common.reportingdata.ThingReference pojoSiteDirectoryThingReference = new cdp4common.reportingdata.SiteDirectoryThingReference();	    
        
        pojoSiteDirectoryThingReference.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryThingReference.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryThingReference.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryThingReference.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryThingReference.setReferencedRevisionNumber(emfThing.getReferencedRevisionNumber());
        
        pojoSiteDirectoryThingReference.setReferencedThing(emfThing.getReferencedThing() != null ? cdp4emfconnector.Thing.toPojo(emfThing.getReferencedThing()) : null);        
        
        pojoSiteDirectoryThingReference.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSiteDirectoryThingReference;
        	
        }

        return null;
    }
    
}
