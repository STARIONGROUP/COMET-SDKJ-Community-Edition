/* --------------------------------------------------------------------------------------------------------------------
 * BinaryRelationshipRule.java
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
 * Static resource that allows to change representation of the {@link BinaryRelationshipRule} class.
 */
public class BinaryRelationshipRule {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.BinaryRelationshipRule} to {@link CDP4.SiteDirectoryData.BinaryRelationshipRule}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.BinaryRelationshipRule}
     */
    public static CDP4.SiteDirectoryData.BinaryRelationshipRule toEmf(cdp4common.sitedirectorydata.BinaryRelationshipRule thing) {       
        
        CDP4.SiteDirectoryData.BinaryRelationshipRule emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBinaryRelationshipRule();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setForwardRelationshipName(thing.getForwardRelationshipName());
        
        emf.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emf.setInverseRelationshipName(thing.getInverseRelationshipName());
        
        emf.setIsDeprecated(thing.isDeprecated());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.setRelationshipCategory(thing.getRelationshipCategory() != null ? cdp4emfconnector.Category.toEmf(thing.getRelationshipCategory()) : null);        
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setShortName(thing.getShortName());
        
        emf.setSourceCategory(thing.getSourceCategory() != null ? cdp4emfconnector.Category.toEmf(thing.getSourceCategory()) : null);        
        
        emf.setTargetCategory(thing.getTargetCategory() != null ? cdp4emfconnector.Category.toEmf(thing.getTargetCategory()) : null);        
        
        emf.setThingPreference(thing.getThingPreference());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.BinaryRelationshipRule} to {@link cdp4common.sitedirectorydata.BinaryRelationshipRule}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.BinaryRelationshipRule}
     */
    public static cdp4common.sitedirectorydata.BinaryRelationshipRule toPojo(CDP4.SiteDirectoryData.BinaryRelationshipRule emfThing) {
        
        cdp4common.sitedirectorydata.BinaryRelationshipRule pojo = new cdp4common.sitedirectorydata.BinaryRelationshipRule();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setForwardRelationshipName(emfThing.getForwardRelationshipName());
        
        pojo.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setInverseRelationshipName(emfThing.getInverseRelationshipName());
        
        pojo.setDeprecated(emfThing.getIsDeprecated());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.setRelationshipCategory(emfThing.getRelationshipCategory() != null ? cdp4emfconnector.Category.toPojo(emfThing.getRelationshipCategory()) : null);        
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setShortName(emfThing.getShortName());
        
        pojo.setSourceCategory(emfThing.getSourceCategory() != null ? cdp4emfconnector.Category.toPojo(emfThing.getSourceCategory()) : null);        
        
        pojo.setTargetCategory(emfThing.getTargetCategory() != null ? cdp4emfconnector.Category.toPojo(emfThing.getTargetCategory()) : null);        
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.BinaryRelationshipRule} from a {@link CDP4.SiteDirectoryData.BinaryRelationshipRule}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.BinaryRelationshipRule}.
    * @return A new {@link cdp4common.sitedirectorydata.BinaryRelationshipRule}
    */
    public static cdp4common.sitedirectorydata.BinaryRelationshipRule instiatePojo(CDP4.SiteDirectoryData.BinaryRelationshipRule thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.BinaryRelationshipRule(UUID.fromString(thing.getIid()), cache, uri);
    }
}
