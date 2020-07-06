/* --------------------------------------------------------------------------------------------------------------------
 * DiagramElementContainer.java
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

public abstract class DiagramElementContainer {

    public static CDP4.DiagramData.DiagramElementContainer toEmf(cdp4common.diagramdata.DiagramElementContainer thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        
        case "cdp4common.diagramdata.DiagramEdge":
        CDP4.DiagramData.DiagramElementContainer emfDiagramEdge =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramEdge();    
        
        emfDiagramEdge.setIid(thing.getIid().toString()); 
        
        
        
        
        
        emfDiagramEdge.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramEdge.setName(thing.getName());
        
        emfDiagramEdge.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramEdge;   
        
        
        
        case "cdp4common.diagramdata.DiagramObject":
        CDP4.DiagramData.DiagramElementContainer emfDiagramObject =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramObject();    
        
        emfDiagramObject.setIid(thing.getIid().toString()); 
        
        
        
        
        
        emfDiagramObject.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramObject.setName(thing.getName());
        
        emfDiagramObject.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramObject;   
        
        
        case "cdp4common.diagramdata.DiagramCanvas":
        CDP4.DiagramData.DiagramElementContainer emfDiagramCanvas =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramCanvas();    
        
        emfDiagramCanvas.setIid(thing.getIid().toString()); 
        
        
        
        
        
        emfDiagramCanvas.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramCanvas.setName(thing.getName());
        
        emfDiagramCanvas.setRevisionNumber(thing.getRevisionNumber());
        		        
        return emfDiagramCanvas;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.diagramdata.DiagramElementContainer toPojo(CDP4.DiagramData.DiagramElementContainer emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        
        case "CDP4.diagramdata.DiagramEdge":                
        cdp4common.diagramdata.DiagramElementContainer pojoDiagramEdge = new cdp4common.diagramdata.DiagramEdge();	    
        
        pojoDiagramEdge.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramEdge.getBounds().add(cdp4emfconnector.Bounds.toPojo(emfThing.getBounds()));   
        
        pojoDiagramEdge.getDiagramElement().addAll(emfThing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramEdge.setName(emfThing.getName());
        
        pojoDiagramEdge.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDiagramEdge;   
        
        
        
        case "CDP4.diagramdata.DiagramObject":                
        cdp4common.diagramdata.DiagramElementContainer pojoDiagramObject = new cdp4common.diagramdata.DiagramObject();	    
        
        pojoDiagramObject.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramObject.getBounds().add(cdp4emfconnector.Bounds.toPojo(emfThing.getBounds()));   
        
        pojoDiagramObject.getDiagramElement().addAll(emfThing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramObject.setName(emfThing.getName());
        
        pojoDiagramObject.setRevisionNumber(emfThing.getRevisionNumber());
        		        
        return pojoDiagramObject;   
        
        
        case "CDP4.diagramdata.DiagramCanvas":                
        cdp4common.diagramdata.DiagramElementContainer pojoDiagramCanvas = new cdp4common.diagramdata.DiagramCanvas();	    
        
        pojoDiagramCanvas.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramCanvas.getBounds().add(cdp4emfconnector.Bounds.toPojo(emfThing.getBounds()));   
        
        pojoDiagramCanvas.getDiagramElement().addAll(emfThing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toPojo(item)).collect(Collectors.toList()));              
        
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
