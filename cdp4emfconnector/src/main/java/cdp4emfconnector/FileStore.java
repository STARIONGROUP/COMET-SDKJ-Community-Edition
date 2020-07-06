/* --------------------------------------------------------------------------------------------------------------------
 * FileStore.java
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

public abstract class FileStore {

    public static CDP4.EngineeringModelData.FileStore toEmf(cdp4common.engineeringmodeldata.FileStore thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.engineeringmodeldata.CommonFileStore":
        CDP4.EngineeringModelData.FileStore emfCommonFileStore =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createCommonFileStore();    
        
        emfCommonFileStore.setIid(thing.getIid().toString()); 
        
        emfCommonFileStore.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        
        emfCommonFileStore.setModifiedOn(thing.getModifiedOn());
        
        emfCommonFileStore.setName(thing.getName());
        
        emfCommonFileStore.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfCommonFileStore.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfCommonFileStore;   
        
        
        case "cdp4common.engineeringmodeldata.DomainFileStore":
        CDP4.EngineeringModelData.FileStore emfDomainFileStore =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createDomainFileStore();    
        
        emfDomainFileStore.setIid(thing.getIid().toString()); 
        
        emfDomainFileStore.setCreatedOn(thing.getCreatedOn());
        
        
        
        
        
        emfDomainFileStore.setModifiedOn(thing.getModifiedOn());
        
        emfDomainFileStore.setName(thing.getName());
        
        emfDomainFileStore.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfDomainFileStore.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDomainFileStore;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.engineeringmodeldata.FileStore toPojo(CDP4.EngineeringModelData.FileStore emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.engineeringmodeldata.CommonFileStore":                
        cdp4common.engineeringmodeldata.FileStore pojoCommonFileStore = new cdp4common.engineeringmodeldata.CommonFileStore();	    
        
        pojoCommonFileStore.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoCommonFileStore.setCreatedOn(emfThing.getCreatedOn());
        
        pojoCommonFileStore.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCommonFileStore.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCommonFileStore.getFile().addAll(emfThing.getFile().stream().map(item -> cdp4emfconnector.File.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCommonFileStore.getFolder().addAll(emfThing.getFolder().stream().map(item -> cdp4emfconnector.Folder.toPojo(item)).collect(Collectors.toList()));              
        
        pojoCommonFileStore.setModifiedOn(emfThing.getModifiedOn());
        
        pojoCommonFileStore.setName(emfThing.getName());
        
        pojoCommonFileStore.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoCommonFileStore.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoCommonFileStore;   
        
        
        case "CDP4.engineeringmodeldata.DomainFileStore":                
        cdp4common.engineeringmodeldata.FileStore pojoDomainFileStore = new cdp4common.engineeringmodeldata.DomainFileStore();	    
        
        pojoDomainFileStore.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDomainFileStore.setCreatedOn(emfThing.getCreatedOn());
        
        pojoDomainFileStore.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainFileStore.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainFileStore.getFile().addAll(emfThing.getFile().stream().map(item -> cdp4emfconnector.File.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainFileStore.getFolder().addAll(emfThing.getFolder().stream().map(item -> cdp4emfconnector.Folder.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDomainFileStore.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDomainFileStore.setName(emfThing.getName());
        
        pojoDomainFileStore.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoDomainFileStore.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDomainFileStore;   
        
        	
    }
        return null;
        
        
     }

        
}
