/* --------------------------------------------------------------------------------------------------------------------
 * TopContainer.java
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
 * Static resource that allows to change representation of the {@link TopContainer} class.
 */
public abstract class TopContainer {
   
    /**
     * Convert from {@link cdp4common.commondata.TopContainer} to {@link CDP4.CommonData.TopContainer}
     *
     * @return Generated {@link CDP4.CommonData.TopContainer}
     */
    public static CDP4.CommonData.TopContainer toEmf(cdp4common.commondata.TopContainer thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.SiteDirectory":
        CDP4.CommonData.TopContainer emfSiteDirectory =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteDirectory();    
        
        emfSiteDirectory.setIid(thing.getIid().toString()); 
        
        emfSiteDirectory.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectory.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteDirectory.setLastModifiedOn(thing.getLastModifiedOn());
        
        emfSiteDirectory.setModifiedOn(thing.getModifiedOn());
        
        emfSiteDirectory.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSiteDirectory;
        
        case "cdp4common.engineeringmodeldata.EngineeringModel":
        CDP4.CommonData.TopContainer emfEngineeringModel =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createEngineeringModel();    
        
        emfEngineeringModel.setIid(thing.getIid().toString()); 
        
        emfEngineeringModel.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModel.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfEngineeringModel.setLastModifiedOn(thing.getLastModifiedOn());
        
        emfEngineeringModel.setModifiedOn(thing.getModifiedOn());
        
        emfEngineeringModel.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfEngineeringModel;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.CommonData.TopContainer} to {@link cdp4common.commondata.TopContainer}
     *
     * @return Generated {@link cdp4common.commondata.TopContainer}
     */
    public static cdp4common.commondata.TopContainer toPojo(CDP4.CommonData.TopContainer emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.SiteDirectory":                
        cdp4common.commondata.TopContainer pojoSiteDirectory = new cdp4common.sitedirectorydata.SiteDirectory();	    
        
        pojoSiteDirectory.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteDirectory.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectory.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteDirectory.setLastModifiedOn(emfThing.getLastModifiedOn());
        
        pojoSiteDirectory.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteDirectory.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSiteDirectory;
        
        case "CDP4.engineeringmodeldata.EngineeringModel":                
        cdp4common.commondata.TopContainer pojoEngineeringModel = new cdp4common.engineeringmodeldata.EngineeringModel();	    
        
        pojoEngineeringModel.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoEngineeringModel.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModel.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoEngineeringModel.setLastModifiedOn(emfThing.getLastModifiedOn());
        
        pojoEngineeringModel.setModifiedOn(emfThing.getModifiedOn());
        
        pojoEngineeringModel.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoEngineeringModel;
        	
        }

        return null;
    }
    
}
