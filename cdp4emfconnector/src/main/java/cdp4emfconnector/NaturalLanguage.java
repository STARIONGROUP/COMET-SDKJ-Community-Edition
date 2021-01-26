/* --------------------------------------------------------------------------------------------------------------------
 * NaturalLanguage.java
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
 * Static resource that allows to change representation of the {@link NaturalLanguage} class.
 */
public class NaturalLanguage {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.NaturalLanguage} to {@link CDP4.SiteDirectoryData.NaturalLanguage}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.NaturalLanguage}
     */
    public static CDP4.SiteDirectoryData.NaturalLanguage toEmf(cdp4common.sitedirectorydata.NaturalLanguage thing) {       
        
        CDP4.SiteDirectoryData.NaturalLanguage emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createNaturalLanguage();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setLanguageCode(thing.getLanguageCode());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.setNativeName(thing.getNativeName());
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setThingPreference(thing.getThingPreference());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.NaturalLanguage} to {@link cdp4common.sitedirectorydata.NaturalLanguage}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.NaturalLanguage}
     */
    public static cdp4common.sitedirectorydata.NaturalLanguage toPojo(CDP4.SiteDirectoryData.NaturalLanguage emfThing) {
        
        cdp4common.sitedirectorydata.NaturalLanguage pojo = new cdp4common.sitedirectorydata.NaturalLanguage();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setLanguageCode(emfThing.getLanguageCode());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.setNativeName(emfThing.getNativeName());
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.NaturalLanguage} from a {@link CDP4.SiteDirectoryData.NaturalLanguage}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.NaturalLanguage}.
    * @return A new {@link cdp4common.sitedirectorydata.NaturalLanguage}
    */
    public static cdp4common.sitedirectorydata.NaturalLanguage instiatePojo(CDP4.SiteDirectoryData.NaturalLanguage thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.NaturalLanguage(UUID.fromString(thing.getIid()), cache, uri);
    }
}
