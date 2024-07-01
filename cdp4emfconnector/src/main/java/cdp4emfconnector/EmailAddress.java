/* --------------------------------------------------------------------------------------------------------------------
 * EmailAddress.java
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
 * Static resource that allows to change representation of the {@link EmailAddress} class.
 */
public class EmailAddress {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.EmailAddress} to {@link CDP4.SiteDirectoryData.EmailAddress}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.EmailAddress}
     */
    public static CDP4.SiteDirectoryData.EmailAddress toEmf(cdp4common.sitedirectorydata.EmailAddress thing) {       
        
        CDP4.SiteDirectoryData.EmailAddress emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEmailAddress();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setThingPreference(thing.getThingPreference());
        
        emf.setValue(thing.getValue());
        
        if (thing.getVcardType() != null) {emf.setVcardType(CDP4.SiteDirectoryData.VcardEmailAddressKind.valueOf(thing.getVcardType().toString()));}                          
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.EmailAddress} to {@link cdp4common.sitedirectorydata.EmailAddress}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.EmailAddress}
     */
    public static cdp4common.sitedirectorydata.EmailAddress toPojo(CDP4.SiteDirectoryData.EmailAddress emfThing) {
        
        cdp4common.sitedirectorydata.EmailAddress pojo = new cdp4common.sitedirectorydata.EmailAddress();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        pojo.setValue(emfThing.getValue());
        
        if (emfThing.getVcardType() != null) {pojo.setVcardType(cdp4common.sitedirectorydata.VcardEmailAddressKind.valueOf(emfThing.getVcardType().toString()));}  
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.EmailAddress} from a {@link CDP4.SiteDirectoryData.EmailAddress}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.EmailAddress}.
    * @return A new {@link cdp4common.sitedirectorydata.EmailAddress}
    */
    public static cdp4common.sitedirectorydata.EmailAddress instiatePojo(CDP4.SiteDirectoryData.EmailAddress thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.EmailAddress(UUID.fromString(thing.getIid()), cache, uri);
    }
}
