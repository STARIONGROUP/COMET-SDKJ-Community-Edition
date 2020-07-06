/* --------------------------------------------------------------------------------------------------------------------
 * DiagramThingBase.java
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
 * Static resource that allows to change representation of the {@link DiagramThingBase} class.
 */
public abstract class DiagramThingBase {
   
    /**
     * Convert from {@link cdp4common.diagramdata.DiagramThingBase} to {@link CDP4.DiagramData.DiagramThingBase}
     *
     * @return Generated {@link CDP4.DiagramData.DiagramThingBase}
     */
    public static CDP4.DiagramData.DiagramThingBase toEmf(cdp4common.diagramdata.DiagramThingBase thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.diagramdata.Point":
        CDP4.DiagramData.DiagramThingBase emfPoint =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createPoint();    
        
        emfPoint.setIid(thing.getIid().toString()); 
        
        emfPoint.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPoint.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPoint.setModifiedOn(thing.getModifiedOn());
        
        emfPoint.setName(thing.getName());
        
        emfPoint.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfPoint;
        
        case "cdp4common.diagramdata.Bounds":
        CDP4.DiagramData.DiagramThingBase emfBounds =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createBounds();    
        
        emfBounds.setIid(thing.getIid().toString()); 
        
        emfBounds.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBounds.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBounds.setModifiedOn(thing.getModifiedOn());
        
        emfBounds.setName(thing.getName());
        
        emfBounds.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfBounds;
        
        case "cdp4common.diagramdata.Color":
        CDP4.DiagramData.DiagramThingBase emfColor =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createColor();    
        
        emfColor.setIid(thing.getIid().toString()); 
        
        emfColor.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfColor.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfColor.setModifiedOn(thing.getModifiedOn());
        
        emfColor.setName(thing.getName());
        
        emfColor.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfColor;
        
        
        case "cdp4common.diagramdata.OwnedStyle":
        CDP4.DiagramData.DiagramThingBase emfOwnedStyle =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createOwnedStyle();    
        
        emfOwnedStyle.setIid(thing.getIid().toString()); 
        
        emfOwnedStyle.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfOwnedStyle.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfOwnedStyle.setModifiedOn(thing.getModifiedOn());
        
        emfOwnedStyle.setName(thing.getName());
        
        emfOwnedStyle.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfOwnedStyle;
        
        case "cdp4common.diagramdata.SharedStyle":
        CDP4.DiagramData.DiagramThingBase emfSharedStyle =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createSharedStyle();    
        
        emfSharedStyle.setIid(thing.getIid().toString()); 
        
        emfSharedStyle.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSharedStyle.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSharedStyle.setModifiedOn(thing.getModifiedOn());
        
        emfSharedStyle.setName(thing.getName());
        
        emfSharedStyle.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfSharedStyle;
        
        
        
        case "cdp4common.diagramdata.DiagramEdge":
        CDP4.DiagramData.DiagramThingBase emfDiagramEdge =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramEdge();    
        
        emfDiagramEdge.setIid(thing.getIid().toString()); 
        
        emfDiagramEdge.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramEdge.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramEdge.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramEdge.setName(thing.getName());
        
        emfDiagramEdge.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramEdge;
        
        
        case "cdp4common.diagramdata.DiagramObject":
        CDP4.DiagramData.DiagramThingBase emfDiagramObject =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramObject();    
        
        emfDiagramObject.setIid(thing.getIid().toString()); 
        
        emfDiagramObject.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramObject.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramObject.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramObject.setName(thing.getName());
        
        emfDiagramObject.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramObject;
        
        case "cdp4common.diagramdata.DiagramCanvas":
        CDP4.DiagramData.DiagramThingBase emfDiagramCanvas =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramCanvas();    
        
        emfDiagramCanvas.setIid(thing.getIid().toString()); 
        
        emfDiagramCanvas.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramCanvas.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramCanvas.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramCanvas.setName(thing.getName());
        
        emfDiagramCanvas.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramCanvas;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.DiagramData.DiagramThingBase} to {@link cdp4common.diagramdata.DiagramThingBase}
     *
     * @return Generated {@link cdp4common.diagramdata.DiagramThingBase}
     */
    public static cdp4common.diagramdata.DiagramThingBase toPojo(CDP4.DiagramData.DiagramThingBase emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.diagramdata.Point":                
        cdp4common.diagramdata.DiagramThingBase pojoPoint = new cdp4common.diagramdata.Point();	    
        
        pojoPoint.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPoint.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPoint.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPoint.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPoint.setName(emfThing.getName());
        
        pojoPoint.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoPoint;
        
        case "CDP4.diagramdata.Bounds":                
        cdp4common.diagramdata.DiagramThingBase pojoBounds = new cdp4common.diagramdata.Bounds();	    
        
        pojoBounds.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBounds.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBounds.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBounds.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBounds.setName(emfThing.getName());
        
        pojoBounds.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoBounds;
        
        case "CDP4.diagramdata.Color":                
        cdp4common.diagramdata.DiagramThingBase pojoColor = new cdp4common.diagramdata.Color();	    
        
        pojoColor.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoColor.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoColor.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoColor.setModifiedOn(emfThing.getModifiedOn());
        
        pojoColor.setName(emfThing.getName());
        
        pojoColor.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoColor;
        
        
        case "CDP4.diagramdata.OwnedStyle":                
        cdp4common.diagramdata.DiagramThingBase pojoOwnedStyle = new cdp4common.diagramdata.OwnedStyle();	    
        
        pojoOwnedStyle.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoOwnedStyle.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOwnedStyle.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoOwnedStyle.setModifiedOn(emfThing.getModifiedOn());
        
        pojoOwnedStyle.setName(emfThing.getName());
        
        pojoOwnedStyle.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoOwnedStyle;
        
        case "CDP4.diagramdata.SharedStyle":                
        cdp4common.diagramdata.DiagramThingBase pojoSharedStyle = new cdp4common.diagramdata.SharedStyle();	    
        
        pojoSharedStyle.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSharedStyle.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSharedStyle.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSharedStyle.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSharedStyle.setName(emfThing.getName());
        
        pojoSharedStyle.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoSharedStyle;
        
        
        
        case "CDP4.diagramdata.DiagramEdge":                
        cdp4common.diagramdata.DiagramThingBase pojoDiagramEdge = new cdp4common.diagramdata.DiagramEdge();	    
        
        pojoDiagramEdge.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramEdge.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramEdge.setName(emfThing.getName());
        
        pojoDiagramEdge.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDiagramEdge;
        
        
        case "CDP4.diagramdata.DiagramObject":                
        cdp4common.diagramdata.DiagramThingBase pojoDiagramObject = new cdp4common.diagramdata.DiagramObject();	    
        
        pojoDiagramObject.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramObject.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramObject.setName(emfThing.getName());
        
        pojoDiagramObject.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDiagramObject;
        
        case "CDP4.diagramdata.DiagramCanvas":                
        cdp4common.diagramdata.DiagramThingBase pojoDiagramCanvas = new cdp4common.diagramdata.DiagramCanvas();	    
        
        pojoDiagramCanvas.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramCanvas.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramCanvas.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramCanvas.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramCanvas.setName(emfThing.getName());
        
        pojoDiagramCanvas.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDiagramCanvas;
        	
        }

        return null;
    }
    
}
