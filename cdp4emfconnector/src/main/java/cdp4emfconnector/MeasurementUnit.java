/* --------------------------------------------------------------------------------------------------------------------
 * MeasurementUnit.java
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
 * Static resource that allows to change representation of the {@link MeasurementUnit} class.
 */
public abstract class MeasurementUnit {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.MeasurementUnit} to {@link CDP4.SiteDirectoryData.MeasurementUnit}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.MeasurementUnit}
     */
    public static CDP4.SiteDirectoryData.MeasurementUnit toEmf(cdp4common.sitedirectorydata.MeasurementUnit thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.DerivedUnit":
        CDP4.SiteDirectoryData.MeasurementUnit emfDerivedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDerivedUnit();    
        
        emfDerivedUnit.setIid(thing.getIid().toString()); 
        
        emfDerivedUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfDerivedUnit.setIsDeprecated(thing.isDeprecated());
        
        emfDerivedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfDerivedUnit.setName(thing.getName());
        
        emfDerivedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfDerivedUnit.setShortName(thing.getShortName());
        		        
        return emfDerivedUnit;
        
        
        case "cdp4common.sitedirectorydata.LinearConversionUnit":
        CDP4.SiteDirectoryData.MeasurementUnit emfLinearConversionUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLinearConversionUnit();    
        
        emfLinearConversionUnit.setIid(thing.getIid().toString()); 
        
        emfLinearConversionUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfLinearConversionUnit.setIsDeprecated(thing.isDeprecated());
        
        emfLinearConversionUnit.setModifiedOn(thing.getModifiedOn());
        
        emfLinearConversionUnit.setName(thing.getName());
        
        emfLinearConversionUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfLinearConversionUnit.setShortName(thing.getShortName());
        		        
        return emfLinearConversionUnit;
        
        case "cdp4common.sitedirectorydata.PrefixedUnit":
        CDP4.SiteDirectoryData.MeasurementUnit emfPrefixedUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createPrefixedUnit();    
        
        emfPrefixedUnit.setIid(thing.getIid().toString()); 
        
        emfPrefixedUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfPrefixedUnit.setIsDeprecated(thing.isDeprecated());
        
        emfPrefixedUnit.setModifiedOn(thing.getModifiedOn());
        
        emfPrefixedUnit.setName(thing.getName());
        
        emfPrefixedUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfPrefixedUnit.setShortName(thing.getShortName());
        		        
        return emfPrefixedUnit;
        
        case "cdp4common.sitedirectorydata.SimpleUnit":
        CDP4.SiteDirectoryData.MeasurementUnit emfSimpleUnit =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSimpleUnit();    
        
        emfSimpleUnit.setIid(thing.getIid().toString()); 
        
        emfSimpleUnit.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSimpleUnit.setIsDeprecated(thing.isDeprecated());
        
        emfSimpleUnit.setModifiedOn(thing.getModifiedOn());
        
        emfSimpleUnit.setName(thing.getName());
        
        emfSimpleUnit.setRevisionNumber(thing.getRevisionNumber());
        
        emfSimpleUnit.setShortName(thing.getShortName());
        		        
        return emfSimpleUnit;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.MeasurementUnit} to {@link cdp4common.sitedirectorydata.MeasurementUnit}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.MeasurementUnit}
     */
    public static cdp4common.sitedirectorydata.MeasurementUnit toPojo(CDP4.SiteDirectoryData.MeasurementUnit emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.DerivedUnit":                
        cdp4common.sitedirectorydata.MeasurementUnit pojoDerivedUnit = new cdp4common.sitedirectorydata.DerivedUnit();	    
        
        pojoDerivedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDerivedUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDerivedUnit.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDerivedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDerivedUnit.setName(emfThing.getName());
        
        pojoDerivedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDerivedUnit.setShortName(emfThing.getShortName());
        		        
        return pojoDerivedUnit;
        
        
        case "CDP4.sitedirectorydata.LinearConversionUnit":                
        cdp4common.sitedirectorydata.MeasurementUnit pojoLinearConversionUnit = new cdp4common.sitedirectorydata.LinearConversionUnit();	    
        
        pojoLinearConversionUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoLinearConversionUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoLinearConversionUnit.setDeprecated(emfThing.getIsDeprecated());
        
        pojoLinearConversionUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoLinearConversionUnit.setName(emfThing.getName());
        
        pojoLinearConversionUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoLinearConversionUnit.setShortName(emfThing.getShortName());
        		        
        return pojoLinearConversionUnit;
        
        case "CDP4.sitedirectorydata.PrefixedUnit":                
        cdp4common.sitedirectorydata.MeasurementUnit pojoPrefixedUnit = new cdp4common.sitedirectorydata.PrefixedUnit();	    
        
        pojoPrefixedUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoPrefixedUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoPrefixedUnit.setDeprecated(emfThing.getIsDeprecated());
        
        pojoPrefixedUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoPrefixedUnit.setName(emfThing.getName());
        
        pojoPrefixedUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoPrefixedUnit.setShortName(emfThing.getShortName());
        		        
        return pojoPrefixedUnit;
        
        case "CDP4.sitedirectorydata.SimpleUnit":                
        cdp4common.sitedirectorydata.MeasurementUnit pojoSimpleUnit = new cdp4common.sitedirectorydata.SimpleUnit();	    
        
        pojoSimpleUnit.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSimpleUnit.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSimpleUnit.setDeprecated(emfThing.getIsDeprecated());
        
        pojoSimpleUnit.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSimpleUnit.setName(emfThing.getName());
        
        pojoSimpleUnit.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSimpleUnit.setShortName(emfThing.getShortName());
        		        
        return pojoSimpleUnit;
        	
        }

        return null;
    }
    
}
