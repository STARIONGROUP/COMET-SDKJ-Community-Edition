/* --------------------------------------------------------------------------------------------------------------------
 * DiagrammingStyle.java
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
 * Static resource that allows to change representation of the {@link DiagrammingStyle} class.
 */
public abstract class DiagrammingStyle {
   
    /**
     * Convert from {@link cdp4common.diagramdata.DiagrammingStyle} to {@link CDP4.DiagramData.DiagrammingStyle}
     *
     * @return Generated {@link CDP4.DiagramData.DiagrammingStyle}
     */
    public static CDP4.DiagramData.DiagrammingStyle toEmf(cdp4common.diagramdata.DiagrammingStyle thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.diagramdata.OwnedStyle":
        CDP4.DiagramData.DiagrammingStyle emfOwnedStyle =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createOwnedStyle();    
        
        emfOwnedStyle.setIid(thing.getIid().toString()); 
        
        emfOwnedStyle.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOwnedStyle.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOwnedStyle.setFillColor(thing.getFillColor() != null ? cdp4emfconnector.Color.toEmf(thing.getFillColor()) : null);
        emfOwnedStyle.setFillOpacity(thing.getFillOpacity());
        
        emfOwnedStyle.setFontBold(thing.getFontBold());
        
        emfOwnedStyle.setFontColor(thing.getFontColor() != null ? cdp4emfconnector.Color.toEmf(thing.getFontColor()) : null);
        emfOwnedStyle.setFontItalic(thing.getFontItalic());
        
        emfOwnedStyle.setFontName(thing.getFontName());
        
        emfOwnedStyle.setFontSize(thing.getFontSize());
        
        emfOwnedStyle.setFontStrokeThrough(thing.getFontStrokeThrough());
        
        emfOwnedStyle.setFontUnderline(thing.getFontUnderline());
        
        emfOwnedStyle.setModifiedOn(thing.getModifiedOn());
        
        emfOwnedStyle.setName(thing.getName());
        
        emfOwnedStyle.setRevisionNumber(thing.getRevisionNumber());
        
        emfOwnedStyle.setStrokeColor(thing.getStrokeColor() != null ? cdp4emfconnector.Color.toEmf(thing.getStrokeColor()) : null);
        emfOwnedStyle.setStrokeOpacity(thing.getStrokeOpacity());
        
        emfOwnedStyle.setStrokeWidth(thing.getStrokeWidth());
        
        emfOwnedStyle.setThingPreference(thing.getThingPreference());
        
        emfOwnedStyle.getUsedColor().addAll(thing.getUsedColor().stream().map(item -> cdp4emfconnector.Color.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfOwnedStyle;
        
        case "cdp4common.diagramdata.SharedStyle":
        CDP4.DiagramData.DiagrammingStyle emfSharedStyle =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createSharedStyle();    
        
        emfSharedStyle.setIid(thing.getIid().toString()); 
        
        emfSharedStyle.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSharedStyle.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSharedStyle.setFillColor(thing.getFillColor() != null ? cdp4emfconnector.Color.toEmf(thing.getFillColor()) : null);
        emfSharedStyle.setFillOpacity(thing.getFillOpacity());
        
        emfSharedStyle.setFontBold(thing.getFontBold());
        
        emfSharedStyle.setFontColor(thing.getFontColor() != null ? cdp4emfconnector.Color.toEmf(thing.getFontColor()) : null);
        emfSharedStyle.setFontItalic(thing.getFontItalic());
        
        emfSharedStyle.setFontName(thing.getFontName());
        
        emfSharedStyle.setFontSize(thing.getFontSize());
        
        emfSharedStyle.setFontStrokeThrough(thing.getFontStrokeThrough());
        
        emfSharedStyle.setFontUnderline(thing.getFontUnderline());
        
        emfSharedStyle.setModifiedOn(thing.getModifiedOn());
        
        emfSharedStyle.setName(thing.getName());
        
        emfSharedStyle.setRevisionNumber(thing.getRevisionNumber());
        
        emfSharedStyle.setStrokeColor(thing.getStrokeColor() != null ? cdp4emfconnector.Color.toEmf(thing.getStrokeColor()) : null);
        emfSharedStyle.setStrokeOpacity(thing.getStrokeOpacity());
        
        emfSharedStyle.setStrokeWidth(thing.getStrokeWidth());
        
        emfSharedStyle.setThingPreference(thing.getThingPreference());
        
        emfSharedStyle.getUsedColor().addAll(thing.getUsedColor().stream().map(item -> cdp4emfconnector.Color.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfSharedStyle;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.DiagramData.DiagrammingStyle} to {@link cdp4common.diagramdata.DiagrammingStyle}
     *
     * @return Generated {@link cdp4common.diagramdata.DiagrammingStyle}
     */
    public static cdp4common.diagramdata.DiagrammingStyle toPojo(CDP4.DiagramData.DiagrammingStyle emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.diagramdata.OwnedStyle":                
        cdp4common.diagramdata.DiagrammingStyle pojoOwnedStyle = new cdp4common.diagramdata.OwnedStyle();	    
        
        pojoOwnedStyle.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOwnedStyle.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOwnedStyle.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOwnedStyle.setFillColor(emfThing.getFillColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getFillColor()) : null);
        pojoOwnedStyle.setFillOpacity((float)emfThing.getFillOpacity());
        
        pojoOwnedStyle.setFontBold(emfThing.getFontBold());
        
        pojoOwnedStyle.setFontColor(emfThing.getFontColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getFontColor()) : null);
        pojoOwnedStyle.setFontItalic(emfThing.getFontItalic());
        
        pojoOwnedStyle.setFontName(emfThing.getFontName());
        
        pojoOwnedStyle.setFontSize((float)emfThing.getFontSize());
        
        pojoOwnedStyle.setFontStrokeThrough(emfThing.getFontStrokeThrough());
        
        pojoOwnedStyle.setFontUnderline(emfThing.getFontUnderline());
        
        pojoOwnedStyle.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOwnedStyle.setName(emfThing.getName());
        
        pojoOwnedStyle.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoOwnedStyle.setStrokeColor(emfThing.getStrokeColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getStrokeColor()) : null);
        pojoOwnedStyle.setStrokeOpacity((float)emfThing.getStrokeOpacity());
        
        pojoOwnedStyle.setStrokeWidth((float)emfThing.getStrokeWidth());
        
        pojoOwnedStyle.setThingPreference(emfThing.getThingPreference());
        
        pojoOwnedStyle.getUsedColor().addAll(emfThing.getUsedColor().stream().map(item -> cdp4emfconnector.Color.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoOwnedStyle;
        
        case "CDP4.diagramdata.SharedStyle":                
        cdp4common.diagramdata.DiagrammingStyle pojoSharedStyle = new cdp4common.diagramdata.SharedStyle();	    
        
        pojoSharedStyle.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSharedStyle.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSharedStyle.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSharedStyle.setFillColor(emfThing.getFillColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getFillColor()) : null);
        pojoSharedStyle.setFillOpacity((float)emfThing.getFillOpacity());
        
        pojoSharedStyle.setFontBold(emfThing.getFontBold());
        
        pojoSharedStyle.setFontColor(emfThing.getFontColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getFontColor()) : null);
        pojoSharedStyle.setFontItalic(emfThing.getFontItalic());
        
        pojoSharedStyle.setFontName(emfThing.getFontName());
        
        pojoSharedStyle.setFontSize((float)emfThing.getFontSize());
        
        pojoSharedStyle.setFontStrokeThrough(emfThing.getFontStrokeThrough());
        
        pojoSharedStyle.setFontUnderline(emfThing.getFontUnderline());
        
        pojoSharedStyle.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSharedStyle.setName(emfThing.getName());
        
        pojoSharedStyle.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSharedStyle.setStrokeColor(emfThing.getStrokeColor() != null ? cdp4emfconnector.Color.toPojo(emfThing.getStrokeColor()) : null);
        pojoSharedStyle.setStrokeOpacity((float)emfThing.getStrokeOpacity());
        
        pojoSharedStyle.setStrokeWidth((float)emfThing.getStrokeWidth());
        
        pojoSharedStyle.setThingPreference(emfThing.getThingPreference());
        
        pojoSharedStyle.getUsedColor().addAll(emfThing.getUsedColor().stream().map(item -> cdp4emfconnector.Color.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoSharedStyle;
        	
        }

        return null;
    }
    
}
