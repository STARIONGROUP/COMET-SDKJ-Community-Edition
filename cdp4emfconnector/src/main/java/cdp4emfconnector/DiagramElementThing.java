/* --------------------------------------------------------------------------------------------------------------------
 * DiagramElementThing.java
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
 * Static resource that allows to change representation of the {@link DiagramElementThing} class.
 */
public abstract class DiagramElementThing {
   
    /**
     * Convert from {@link cdp4common.diagramdata.DiagramElementThing} to {@link CDP4.DiagramData.DiagramElementThing}
     *
     * @return Generated {@link CDP4.DiagramData.DiagramElementThing}
     */
    public static CDP4.DiagramData.DiagramElementThing toEmf(cdp4common.diagramdata.DiagramElementThing thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.diagramdata.DiagramEdge":
        CDP4.DiagramData.DiagramElementThing emfDiagramEdge =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramEdge();    
        
        emfDiagramEdge.setIid(thing.getIid().toString()); 
        
        emfDiagramEdge.setBounds(thing.getBounds().stream().map(item -> cdp4emfconnector.Bounds.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emfDiagramEdge.setDepictedThing(thing.getDepictedThing() != null ? cdp4emfconnector.Thing.toEmf(thing.getDepictedThing()) : null);
        emfDiagramEdge.getDiagramElement().addAll(thing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramEdge.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramEdge.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramEdge.setLocalStyle(thing.getLocalStyle().stream().map(item -> cdp4emfconnector.OwnedStyle.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emfDiagramEdge.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramEdge.setName(thing.getName());
        
        emfDiagramEdge.setRevisionNumber(thing.getRevisionNumber());
        
        emfDiagramEdge.setSharedStyle(thing.getSharedStyle() != null ? cdp4emfconnector.SharedStyle.toEmf(thing.getSharedStyle()) : null);
        emfDiagramEdge.setThingPreference(thing.getThingPreference());
        		        
        return emfDiagramEdge;
        
        
        case "cdp4common.diagramdata.DiagramObject":
        CDP4.DiagramData.DiagramElementThing emfDiagramObject =  CDP4.DiagramData.impl.DiagramDataFactoryImpl.eINSTANCE.createDiagramObject();    
        
        emfDiagramObject.setIid(thing.getIid().toString()); 
        
        emfDiagramObject.setBounds(thing.getBounds().stream().map(item -> cdp4emfconnector.Bounds.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emfDiagramObject.setDepictedThing(thing.getDepictedThing() != null ? cdp4emfconnector.Thing.toEmf(thing.getDepictedThing()) : null);
        emfDiagramObject.getDiagramElement().addAll(thing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramObject.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramObject.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDiagramObject.setLocalStyle(thing.getLocalStyle().stream().map(item -> cdp4emfconnector.OwnedStyle.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emfDiagramObject.setModifiedOn(thing.getModifiedOn());
        
        emfDiagramObject.setName(thing.getName());
        
        emfDiagramObject.setRevisionNumber(thing.getRevisionNumber());
        
        emfDiagramObject.setSharedStyle(thing.getSharedStyle() != null ? cdp4emfconnector.SharedStyle.toEmf(thing.getSharedStyle()) : null);
        emfDiagramObject.setThingPreference(thing.getThingPreference());
        		        
        return emfDiagramObject;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.DiagramData.DiagramElementThing} to {@link cdp4common.diagramdata.DiagramElementThing}
     *
     * @return Generated {@link cdp4common.diagramdata.DiagramElementThing}
     */
    public static cdp4common.diagramdata.DiagramElementThing toPojo(CDP4.DiagramData.DiagramElementThing emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.diagramdata.DiagramEdge":                
        cdp4common.diagramdata.DiagramElementThing pojoDiagramEdge = new cdp4common.diagramdata.DiagramEdge();	    
        
        pojoDiagramEdge.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramEdge.getBounds().add(cdp4emfconnector.Bounds.toPojo(emfThing.getBounds()));   
        
        pojoDiagramEdge.setDepictedThing(emfThing.getDepictedThing() != null ? cdp4emfconnector.Thing.toPojo(emfThing.getDepictedThing()) : null);
        pojoDiagramEdge.getDiagramElement().addAll(emfThing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramEdge.getLocalStyle().add(cdp4emfconnector.OwnedStyle.toPojo(emfThing.getLocalStyle()));   
        
        pojoDiagramEdge.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramEdge.setName(emfThing.getName());
        
        pojoDiagramEdge.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDiagramEdge.setSharedStyle(emfThing.getSharedStyle() != null ? cdp4emfconnector.SharedStyle.toPojo(emfThing.getSharedStyle()) : null);
        pojoDiagramEdge.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDiagramEdge;
        
        
        case "CDP4.diagramdata.DiagramObject":                
        cdp4common.diagramdata.DiagramElementThing pojoDiagramObject = new cdp4common.diagramdata.DiagramObject();	    
        
        pojoDiagramObject.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDiagramObject.getBounds().add(cdp4emfconnector.Bounds.toPojo(emfThing.getBounds()));   
        
        pojoDiagramObject.setDepictedThing(emfThing.getDepictedThing() != null ? cdp4emfconnector.Thing.toPojo(emfThing.getDepictedThing()) : null);
        pojoDiagramObject.getDiagramElement().addAll(emfThing.getDiagramElement().stream().map(item -> cdp4emfconnector.DiagramElementThing.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDiagramObject.getLocalStyle().add(cdp4emfconnector.OwnedStyle.toPojo(emfThing.getLocalStyle()));   
        
        pojoDiagramObject.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDiagramObject.setName(emfThing.getName());
        
        pojoDiagramObject.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDiagramObject.setSharedStyle(emfThing.getSharedStyle() != null ? cdp4emfconnector.SharedStyle.toPojo(emfThing.getSharedStyle()) : null);
        pojoDiagramObject.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDiagramObject;
        	
        }

        return null;
    }
    
}
