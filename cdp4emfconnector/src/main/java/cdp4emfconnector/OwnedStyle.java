/* --------------------------------------------------------------------------------------------------------------------
 * OwnedStyle.java
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
 * Static resource that allows to change representation of the {@link OwnedStyle} class.
 */
public class OwnedStyle {
   
    /**
     * Convert from {@link cdp4common.diagramdata.OwnedStyle} to {@link CDP4.DiagramData.OwnedStyle}
     *
     * @return Generated {@link CDP4.DiagramData.OwnedStyle}
     */
    public static CDP4.DiagramData.OwnedStyle toEmf(cdp4common.diagramdata.OwnedStyle thing) {       
        
        CDP4.DiagramData.OwnedStyle emf =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createOwnedStyle();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setFillColor(thing.getFillColor() != null ? cdp4emfconnector.Color.toEmf(thing.getFillColor()) : null);
        emf.setFillOpacity(thing.getFillOpacity());
        
        emf.setFontBold(thing.getFontBold());
        
        emf.setFontColor(thing.getFontColor() != null ? cdp4emfconnector.Color.toEmf(thing.getFontColor()) : null);
        emf.setFontItalic(thing.getFontItalic());
        
        emf.setFontName(thing.getFontName());
        
        emf.setFontSize(thing.getFontSize());
        
        emf.setFontStrokeThrough(thing.getFontStrokeThrough());
        
        emf.setFontUnderline(thing.getFontUnderline());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setStrokeColor(thing.getStrokeColor() != null ? cdp4emfconnector.Color.toEmf(thing.getStrokeColor()) : null);
        emf.setStrokeOpacity(thing.getStrokeOpacity());
        
        emf.setStrokeWidth(thing.getStrokeWidth());
        
        emf.getUsedColor().addAll(thing.getUsedColor().stream().map(item -> cdp4emfconnector.Color.toEmf(item)).collect(Collectors.toList()));
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.DiagramData.OwnedStyle} to {@link cdp4common.diagramdata.OwnedStyle}
     *
     * @return Generated {@link cdp4common.diagramdata.OwnedStyle}
     */
    public static cdp4common.diagramdata.OwnedStyle toPojo(CDP4.DiagramData.OwnedStyle emfThing) {
        
        cdp4common.diagramdata.OwnedStyle pojo = new cdp4common.diagramdata.OwnedStyle();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setFillColor(emfThing.getFillColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getFillColor()) : null);
        pojo.setFillOpacity((float)emfThing.getFillOpacity());
        
        pojo.setFontBold(emfThing.getFontBold());
        
        pojo.setFontColor(emfThing.getFontColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getFontColor()) : null);
        pojo.setFontItalic(emfThing.getFontItalic());
        
        pojo.setFontName(emfThing.getFontName());
        
        pojo.setFontSize((float)emfThing.getFontSize());
        
        pojo.setFontStrokeThrough(emfThing.getFontStrokeThrough());
        
        pojo.setFontUnderline(emfThing.getFontUnderline());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setStrokeColor(emfThing.getStrokeColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getStrokeColor()) : null);
        pojo.setStrokeOpacity((float)emfThing.getStrokeOpacity());
        
        pojo.setStrokeWidth((float)emfThing.getStrokeWidth());
        
        pojo.getUsedColor().addAll(emfThing.getUsedColor().stream().map(item -> cdp4emfconnector.Color.toPojo(item)).collect(Collectors.toList()));              
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.diagramdata.OwnedStyle} from a {@link CDP4.DiagramData.OwnedStyle}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.diagramdata.OwnedStyle}.
    * @return A new {@link cdp4common.diagramdata.OwnedStyle}
    */
    public static cdp4common.diagramdata.OwnedStyle instiatePojo(CDP4.DiagramData.OwnedStyle thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.diagramdata.OwnedStyle(UUID.fromString(thing.getIid()), cache, uri);
    }
}
