/* --------------------------------------------------------------------------------------------------------------------
 * DiagramEdge.java
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
 * Static resource that allows to change representation of the {@link DiagramEdge} class.
 */
public class DiagramEdge {
   
    /**
     * Convert from {@link cdp4common.diagramdata.DiagramEdge} to {@link CDP4.DiagramData.DiagramEdge}
     *
     * @return Generated {@link CDP4.DiagramData.DiagramEdge}
     */
    public static CDP4.DiagramData.DiagramEdge toEmf(cdp4common.diagramdata.DiagramEdge thing) {       
        
        CDP4.DiagramData.DiagramEdge emf =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramEdge();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.setBounds(thing.getBounds().stream().map(item -> cdp4emfconnector.Bounds.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emf.setDepictedThing(thing.getDepictedThing() != null ? cdp4emfconnector.Thing.toEmf(thing.getDepictedThing()) : null);
        emf.getDiagramElement().addAll(thing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setLocalStyle(thing.getLocalStyle().stream().map(item -> cdp4emfconnector.OwnedStyle.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.getPoint().addAll(thing.getPoint().stream().map(item -> cdp4emfconnector.Point.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setSharedStyle(thing.getSharedStyle() != null ? cdp4emfconnector.SharedStyle.toEmf(thing.getSharedStyle()) : null);
        emf.setSource(thing.getSource() != null ? cdp4emfconnector.DiagramElementThing.toEmf(thing.getSource()) : null);        
        
        emf.setTarget(thing.getTarget() != null ? cdp4emfconnector.DiagramElementThing.toEmf(thing.getTarget()) : null);        
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.DiagramData.DiagramEdge} to {@link cdp4common.diagramdata.DiagramEdge}
     *
     * @return Generated {@link cdp4common.diagramdata.DiagramEdge}
     */
    public static cdp4common.diagramdata.DiagramEdge toPojo(CDP4.DiagramData.DiagramEdge emfThing) {
        
        cdp4common.diagramdata.DiagramEdge pojo = new cdp4common.diagramdata.DiagramEdge();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getBounds().add(cdp4emfconnector.Bounds.toPojo(emfThing.getBounds()));   
        
        pojo.setDepictedThing(emfThing.getDepictedThing() != null ? cdp4emfconnector.Thing.toPojo(emfThing.getDepictedThing()) : null);
        pojo.getDiagramElement().addAll(emfThing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getLocalStyle().add(cdp4emfconnector.OwnedStyle.toPojo(emfThing.getLocalStyle()));   
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.getPoint().addAll(emfThing.getPoint().stream().map(item -> cdp4emfconnector.Point.toPojo(item)).collect(Collectors.toList()));
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setSharedStyle(emfThing.getSharedStyle() != null ? cdp4emfconnector.SharedStyle.toPojo(emfThing.getSharedStyle()) : null);
        pojo.setSource(emfThing.getSource() != null ? cdp4emfconnector.DiagramElementThing.toPojo(emfThing.getSource()) : null);        
        
        pojo.setTarget(emfThing.getTarget() != null ? cdp4emfconnector.DiagramElementThing.toPojo(emfThing.getTarget()) : null);        
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.diagramdata.DiagramEdge} from a {@link CDP4.DiagramData.DiagramEdge}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.diagramdata.DiagramEdge}.
    * @return A new {@link cdp4common.diagramdata.DiagramEdge}
    */
    public static cdp4common.diagramdata.DiagramEdge instiatePojo(CDP4.DiagramData.DiagramEdge thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.diagramdata.DiagramEdge(UUID.fromString(thing.getIid()), cache, uri);
    }
}
