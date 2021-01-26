/* --------------------------------------------------------------------------------------------------------------------
 * QuantityKind.java
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
 * Static resource that allows to change representation of the {@link QuantityKind} class.
 */
public abstract class QuantityKind {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.QuantityKind} to {@link CDP4.SiteDirectoryData.QuantityKind}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.QuantityKind}
     */
    public static CDP4.SiteDirectoryData.QuantityKind toEmf(cdp4common.sitedirectorydata.QuantityKind thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.SpecializedQuantityKind":
        CDP4.SiteDirectoryData.QuantityKind emfSpecializedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSpecializedQuantityKind();    
        
        emfSpecializedQuantityKind.setIid(thing.getIid().toString()); 
        
        emfSpecializedQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.setDefaultScale(thing.getDefaultScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getDefaultScale()) : null);        
        
        emfSpecializedQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfSpecializedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSpecializedQuantityKind.setName(thing.getName());
        
        emfSpecializedQuantityKind.getPossibleScale().addAll(thing.getPossibleScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toEmf(item)).collect(Collectors.toList()));
        
        emfSpecializedQuantityKind.setQuantityDimensionSymbol(thing.getQuantityDimensionSymbol());
        
        emfSpecializedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSpecializedQuantityKind.setShortName(thing.getShortName());
        
        emfSpecializedQuantityKind.setSymbol(thing.getSymbol());
        
        emfSpecializedQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfSpecializedQuantityKind;
        
        case "cdp4common.sitedirectorydata.SimpleQuantityKind":
        CDP4.SiteDirectoryData.QuantityKind emfSimpleQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleQuantityKind();    
        
        emfSimpleQuantityKind.setIid(thing.getIid().toString()); 
        
        emfSimpleQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.setDefaultScale(thing.getDefaultScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getDefaultScale()) : null);        
        
        emfSimpleQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfSimpleQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleQuantityKind.setName(thing.getName());
        
        emfSimpleQuantityKind.getPossibleScale().addAll(thing.getPossibleScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleQuantityKind.setQuantityDimensionSymbol(thing.getQuantityDimensionSymbol());
        
        emfSimpleQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleQuantityKind.setShortName(thing.getShortName());
        
        emfSimpleQuantityKind.setSymbol(thing.getSymbol());
        
        emfSimpleQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfSimpleQuantityKind;
        
        case "cdp4common.sitedirectorydata.DerivedQuantityKind":
        CDP4.SiteDirectoryData.QuantityKind emfDerivedQuantityKind =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedQuantityKind();    
        
        emfDerivedQuantityKind.setIid(thing.getIid().toString()); 
        
        emfDerivedQuantityKind.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getCategory().addAll(thing.getCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.setDefaultScale(thing.getDefaultScale() != null ? cdp4emfconnector.MeasurementScale.toEmf(thing.getDefaultScale()) : null);        
        
        emfDerivedQuantityKind.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.setIsDeprecated(thing.isDeprecated());
        
        emfDerivedQuantityKind.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedQuantityKind.setName(thing.getName());
        
        emfDerivedQuantityKind.getPossibleScale().addAll(thing.getPossibleScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedQuantityKind.setQuantityDimensionSymbol(thing.getQuantityDimensionSymbol());
        
        emfDerivedQuantityKind.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedQuantityKind.setShortName(thing.getShortName());
        
        emfDerivedQuantityKind.setSymbol(thing.getSymbol());
        
        emfDerivedQuantityKind.setThingPreference(thing.getThingPreference());
        		        
        return emfDerivedQuantityKind;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.QuantityKind} to {@link cdp4common.sitedirectorydata.QuantityKind}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.QuantityKind}
     */
    public static cdp4common.sitedirectorydata.QuantityKind toPojo(CDP4.SiteDirectoryData.QuantityKind emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.SpecializedQuantityKind":                
        cdp4common.sitedirectorydata.QuantityKind pojoSpecializedQuantityKind = new cdp4common.sitedirectorydata.SpecializedQuantityKind();	    
        
        pojoSpecializedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSpecializedQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.setDefaultScale(emfThing.getDefaultScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getDefaultScale()) : null);        
        
        pojoSpecializedQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoSpecializedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSpecializedQuantityKind.setName(emfThing.getName());
        
        pojoSpecializedQuantityKind.getPossibleScale().addAll(emfThing.getPossibleScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSpecializedQuantityKind.setQuantityDimensionSymbol(emfThing.getQuantityDimensionSymbol());
        
        pojoSpecializedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSpecializedQuantityKind.setShortName(emfThing.getShortName());
        
        pojoSpecializedQuantityKind.setSymbol(emfThing.getSymbol());
        
        pojoSpecializedQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSpecializedQuantityKind;
        
        case "CDP4.sitedirectorydata.SimpleQuantityKind":                
        cdp4common.sitedirectorydata.QuantityKind pojoSimpleQuantityKind = new cdp4common.sitedirectorydata.SimpleQuantityKind();	    
        
        pojoSimpleQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.setDefaultScale(emfThing.getDefaultScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getDefaultScale()) : null);        
        
        pojoSimpleQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoSimpleQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleQuantityKind.setName(emfThing.getName());
        
        pojoSimpleQuantityKind.getPossibleScale().addAll(emfThing.getPossibleScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleQuantityKind.setQuantityDimensionSymbol(emfThing.getQuantityDimensionSymbol());
        
        pojoSimpleQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleQuantityKind.setShortName(emfThing.getShortName());
        
        pojoSimpleQuantityKind.setSymbol(emfThing.getSymbol());
        
        pojoSimpleQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoSimpleQuantityKind;
        
        case "CDP4.sitedirectorydata.DerivedQuantityKind":                
        cdp4common.sitedirectorydata.QuantityKind pojoDerivedQuantityKind = new cdp4common.sitedirectorydata.DerivedQuantityKind();	    
        
        pojoDerivedQuantityKind.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedQuantityKind.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getCategory().addAll(emfThing.getCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.setDefaultScale(emfThing.getDefaultScale() != null ? cdp4emfconnector.MeasurementScale.toPojo(emfThing.getDefaultScale()) : null);        
        
        pojoDerivedQuantityKind.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDerivedQuantityKind.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedQuantityKind.setName(emfThing.getName());
        
        pojoDerivedQuantityKind.getPossibleScale().addAll(emfThing.getPossibleScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedQuantityKind.setQuantityDimensionSymbol(emfThing.getQuantityDimensionSymbol());
        
        pojoDerivedQuantityKind.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDerivedQuantityKind.setShortName(emfThing.getShortName());
        
        pojoDerivedQuantityKind.setSymbol(emfThing.getSymbol());
        
        pojoDerivedQuantityKind.setThingPreference(emfThing.getThingPreference());
        		        
        return pojoDerivedQuantityKind;
        	
        }

        return null;
    }
    
}
