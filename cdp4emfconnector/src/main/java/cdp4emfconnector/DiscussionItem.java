/* --------------------------------------------------------------------------------------------------------------------
 * DiscussionItem.java
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
 * Static resource that allows to change representation of the {@link DiscussionItem} class.
 */
public abstract class DiscussionItem {
   
    /**
     * Convert from {@link cdp4common.reportingdata.DiscussionItem} to {@link CDP4.ReportingData.DiscussionItem}
     *
     * @return Generated {@link CDP4.ReportingData.DiscussionItem}
     */
    public static CDP4.ReportingData.DiscussionItem toEmf(cdp4common.reportingdata.DiscussionItem thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.reportingdata.EngineeringModelDataDiscussionItem":
        CDP4.ReportingData.DiscussionItem emfEngineeringModelDataDiscussionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createEngineeringModelDataDiscussionItem();    
        
        emfEngineeringModelDataDiscussionItem.setIid(thing.getIid().toString()); 
        
        emfEngineeringModelDataDiscussionItem.setContent(thing.getContent());
        
        emfEngineeringModelDataDiscussionItem.setCreatedOn(thing.getCreatedOn());
        
        emfEngineeringModelDataDiscussionItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataDiscussionItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModelDataDiscussionItem.setLanguageCode(thing.getLanguageCode());
        
        emfEngineeringModelDataDiscussionItem.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModelDataDiscussionItem.setReplyTo(thing.getReplyTo() != null ? cdp4emfconnector.DiscussionItem.toEmf(thing.getReplyTo()) : null);
        emfEngineeringModelDataDiscussionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfEngineeringModelDataDiscussionItem.setThingPreference(thing.getThingPreference());
        		        
        return emfEngineeringModelDataDiscussionItem;
        
        case "cdp4common.reportingdata.SiteDirectoryDataDiscussionItem":
        CDP4.ReportingData.DiscussionItem emfSiteDirectoryDataDiscussionItem =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createSiteDirectoryDataDiscussionItem();    
        
        emfSiteDirectoryDataDiscussionItem.setIid(thing.getIid().toString()); 
        
        emfSiteDirectoryDataDiscussionItem.setContent(thing.getContent());
        
        emfSiteDirectoryDataDiscussionItem.setCreatedOn(thing.getCreatedOn());
        
        emfSiteDirectoryDataDiscussionItem.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataDiscussionItem.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectoryDataDiscussionItem.setLanguageCode(thing.getLanguageCode());
        
        emfSiteDirectoryDataDiscussionItem.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectoryDataDiscussionItem.setReplyTo(thing.getReplyTo() != null ? cdp4emfconnector.DiscussionItem.toEmf(thing.getReplyTo()) : null);
        emfSiteDirectoryDataDiscussionItem.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteDirectoryDataDiscussionItem.setThingPreference(thing.getThingPreference());
        		        
        return emfSiteDirectoryDataDiscussionItem;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.ReportingData.DiscussionItem} to {@link cdp4common.reportingdata.DiscussionItem}
     *
     * @return Generated {@link cdp4common.reportingdata.DiscussionItem}
     */
    public static cdp4common.reportingdata.DiscussionItem toPojo(CDP4.ReportingData.DiscussionItem emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.reportingdata.EngineeringModelDataDiscussionItem":                
        cdp4common.reportingdata.DiscussionItem pojoEngineeringModelDataDiscussionItem = new cdp4common.reportingdata.EngineeringModelDataDiscussionItem();	    
        
        pojoEngineeringModelDataDiscussionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModelDataDiscussionItem.setContent(emfThing.getContent());
        
        pojoEngineeringModelDataDiscussionItem.setCreatedOn(emfThing.getCreatedOn());
        
        pojoEngineeringModelDataDiscussionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataDiscussionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModelDataDiscussionItem.setLanguageCode(emfThing.getLanguageCode());
        
        pojoEngineeringModelDataDiscussionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModelDataDiscussionItem.setReplyTo(emfThing.getReplyTo() != null ? cdp4emfconnector.DiscussionItem.toPojo(emfThing.getReplyTo()) : null);
        pojoEngineeringModelDataDiscussionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoEngineeringModelDataDiscussionItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoEngineeringModelDataDiscussionItem;
        
        case "CDP4.reportingdata.SiteDirectoryDataDiscussionItem":                
        cdp4common.reportingdata.DiscussionItem pojoSiteDirectoryDataDiscussionItem = new cdp4common.reportingdata.SiteDirectoryDataDiscussionItem();	    
        
        pojoSiteDirectoryDataDiscussionItem.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectoryDataDiscussionItem.setContent(emfThing.getContent());
        
        pojoSiteDirectoryDataDiscussionItem.setCreatedOn(emfThing.getCreatedOn());
        
        pojoSiteDirectoryDataDiscussionItem.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataDiscussionItem.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectoryDataDiscussionItem.setLanguageCode(emfThing.getLanguageCode());
        
        pojoSiteDirectoryDataDiscussionItem.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectoryDataDiscussionItem.setReplyTo(emfThing.getReplyTo() != null ? cdp4emfconnector.DiscussionItem.toPojo(emfThing.getReplyTo()) : null);
        pojoSiteDirectoryDataDiscussionItem.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteDirectoryDataDiscussionItem.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSiteDirectoryDataDiscussionItem;
        	
        }

        return null;
    }
    
}
