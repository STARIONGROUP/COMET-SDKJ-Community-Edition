/* --------------------------------------------------------------------------------------------------------------------
 * ReferencerRule.java
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
 * Static resource that allows to change representation of the {@link ReferencerRule} class.
 */
public class ReferencerRule {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.ReferencerRule} to {@link CDP4.SiteDirectoryData.ReferencerRule}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.ReferencerRule}
     */
    public static CDP4.SiteDirectoryData.ReferencerRule toEmf(cdp4common.sitedirectorydata.ReferencerRule thing) {       
        
        CDP4.SiteDirectoryData.ReferencerRule emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferencerRule();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emf.setIsDeprecated(thing.isDeprecated());
        
        emf.setMaxReferenced(thing.getMaxReferenced());
        
        emf.setMinReferenced(thing.getMinReferenced());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.getReferencedCategory().addAll(thing.getReferencedCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emf.setReferencingCategory(thing.getReferencingCategory() != null ? cdp4emfconnector.Category.toEmf(thing.getReferencingCategory()) : null);        
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setShortName(thing.getShortName());
        
        emf.setThingPreference(thing.getThingPreference());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.ReferencerRule} to {@link cdp4common.sitedirectorydata.ReferencerRule}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.ReferencerRule}
     */
    public static cdp4common.sitedirectorydata.ReferencerRule toPojo(CDP4.SiteDirectoryData.ReferencerRule emfThing) {
        
        cdp4common.sitedirectorydata.ReferencerRule pojo = new cdp4common.sitedirectorydata.ReferencerRule();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setDeprecated(emfThing.getIsDeprecated());
        
        pojo.setMaxReferenced(emfThing.getMaxReferenced());
        
        pojo.setMinReferenced(emfThing.getMinReferenced());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.getReferencedCategory().addAll(emfThing.getReferencedCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setReferencingCategory(emfThing.getReferencingCategory() != null ? cdp4emfconnector.Category.toPojo(emfThing.getReferencingCategory()) : null);        
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setShortName(emfThing.getShortName());
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.ReferencerRule} from a {@link CDP4.SiteDirectoryData.ReferencerRule}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.ReferencerRule}.
    * @return A new {@link cdp4common.sitedirectorydata.ReferencerRule}
    */
    public static cdp4common.sitedirectorydata.ReferencerRule instiatePojo(CDP4.SiteDirectoryData.ReferencerRule thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.ReferencerRule(UUID.fromString(thing.getIid()), cache, uri);
    }
}
