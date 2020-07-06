/* --------------------------------------------------------------------------------------------------------------------
 * Note.java
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
 * Static resource that allows to change representation of the {@link Note} class.
 */
public abstract class Note {
   
    /**
     * Convert from {@link cdp4common.reportingdata.Note} to {@link CDP4.ReportingData.Note}
     *
     * @return Generated {@link CDP4.ReportingData.Note}
     */
    public static CDP4.ReportingData.Note toEmf(cdp4common.reportingdata.Note thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.reportingdata.BinaryNote":
        CDP4.ReportingData.Note emfBinaryNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createBinaryNote();    
        
        emfBinaryNote.setIid(thing.getIid().toString()); 
        
        emfBinaryNote.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryNote.setCreatedOn(thing.getCreatedOn());
        
        emfBinaryNote.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryNote.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfBinaryNote.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryNote.setName(thing.getName());
        
        emfBinaryNote.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfBinaryNote.setRevisionNumber(thing.getRevisionNumber());
        
        emfBinaryNote.setShortName(thing.getShortName());
        		        
        return emfBinaryNote;
        
        case "cdp4common.reportingdata.TextualNote":
        CDP4.ReportingData.Note emfTextualNote =  CDP4.ReportingData.impl.ReportingDataFactoryImpl.eINSTANCE.createTextualNote();    
        
        emfTextualNote.setIid(thing.getIid().toString()); 
        
        emfTextualNote.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfTextualNote.setCreatedOn(thing.getCreatedOn());
        
        emfTextualNote.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfTextualNote.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfTextualNote.setModifiedOn(thing.getModifiedOn());
        
        emfTextualNote.setName(thing.getName());
        
        emfTextualNote.setOwner(thing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toEmf(thing.getOwner()) : null);        
        
        emfTextualNote.setRevisionNumber(thing.getRevisionNumber());
        
        emfTextualNote.setShortName(thing.getShortName());
        		        
        return emfTextualNote;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.ReportingData.Note} to {@link cdp4common.reportingdata.Note}
     *
     * @return Generated {@link cdp4common.reportingdata.Note}
     */
    public static cdp4common.reportingdata.Note toPojo(CDP4.ReportingData.Note emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.reportingdata.BinaryNote":                
        cdp4common.reportingdata.Note pojoBinaryNote = new cdp4common.reportingdata.BinaryNote();	    
        
        pojoBinaryNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryNote.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryNote.setCreatedOn(emfThing.getCreatedOn());
        
        pojoBinaryNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryNote.setName(emfThing.getName());
        
        pojoBinaryNote.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoBinaryNote.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBinaryNote.setShortName(emfThing.getShortName());
        		        
        return pojoBinaryNote;
        
        case "CDP4.reportingdata.TextualNote":                
        cdp4common.reportingdata.Note pojoTextualNote = new cdp4common.reportingdata.TextualNote();	    
        
        pojoTextualNote.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoTextualNote.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextualNote.setCreatedOn(emfThing.getCreatedOn());
        
        pojoTextualNote.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextualNote.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoTextualNote.setModifiedOn(emfThing.getModifiedOn());
        
        pojoTextualNote.setName(emfThing.getName());
        
        pojoTextualNote.setOwner(emfThing.getOwner() != null ? cdp4emfconnector.DomainOfExpertise.toPojo(emfThing.getOwner()) : null);        
        
        pojoTextualNote.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoTextualNote.setShortName(emfThing.getShortName());
        		        
        return pojoTextualNote;
        	
        }

        return null;
    }
    
}
