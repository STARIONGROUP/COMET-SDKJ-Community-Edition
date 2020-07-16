/* --------------------------------------------------------------------------------------------------------------------
 * ReferenceDataLibrary.java
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
 * Static resource that allows to change representation of the {@link ReferenceDataLibrary} class.
 */
public abstract class ReferenceDataLibrary {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.ReferenceDataLibrary} to {@link CDP4.SiteDirectoryData.ReferenceDataLibrary}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.ReferenceDataLibrary}
     */
    public static CDP4.SiteDirectoryData.ReferenceDataLibrary toEmf(cdp4common.sitedirectorydata.ReferenceDataLibrary thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.SiteReferenceDataLibrary":
        CDP4.SiteDirectoryData.ReferenceDataLibrary emfSiteReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createSiteReferenceDataLibrary();    
        
        emfSiteReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        emfSiteReferenceDataLibrary.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getBaseQuantityKind().addAll(thing.getBaseQuantityKind().stream().map(item -> cdp4emfconnector.QuantityKind.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getBaseUnit().addAll(thing.getBaseUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getConstant().addAll(thing.getConstant().stream().map(item -> cdp4emfconnector.Constant.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getDefinedCategory().addAll(thing.getDefinedCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getFileType().addAll(thing.getFileType().stream().map(item -> cdp4emfconnector.FileType.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getGlossary().addAll(thing.getGlossary().stream().map(item -> cdp4emfconnector.Glossary.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfSiteReferenceDataLibrary.setName(thing.getName());
        
        emfSiteReferenceDataLibrary.getParameterType().addAll(thing.getParameterType().stream().map(item -> cdp4emfconnector.ParameterType.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getReferenceSource().addAll(thing.getReferenceSource().stream().map(item -> cdp4emfconnector.ReferenceSource.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.setRequiredRdl(thing.getRequiredRdl() != null ? cdp4emfconnector.SiteReferenceDataLibrary.toEmf(thing.getRequiredRdl()) : null);
        emfSiteReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        
        emfSiteReferenceDataLibrary.getRule().addAll(thing.getRule().stream().map(item -> cdp4emfconnector.Rule.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getScale().addAll(thing.getScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.setShortName(thing.getShortName());
        
        emfSiteReferenceDataLibrary.getUnit().addAll(thing.getUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toEmf(item)).collect(Collectors.toList()));
        
        emfSiteReferenceDataLibrary.getUnitPrefix().addAll(thing.getUnitPrefix().stream().map(item -> cdp4emfconnector.UnitPrefix.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfSiteReferenceDataLibrary;
        
        case "cdp4common.sitedirectorydata.ModelReferenceDataLibrary":
        CDP4.SiteDirectoryData.ReferenceDataLibrary emfModelReferenceDataLibrary =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createModelReferenceDataLibrary();    
        
        emfModelReferenceDataLibrary.setIid(thing.getIid().toString()); 
        
        emfModelReferenceDataLibrary.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getBaseQuantityKind().addAll(thing.getBaseQuantityKind().stream().map(item -> cdp4emfconnector.QuantityKind.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getBaseUnit().addAll(thing.getBaseUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getConstant().addAll(thing.getConstant().stream().map(item -> cdp4emfconnector.Constant.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getDefinedCategory().addAll(thing.getDefinedCategory().stream().map(item -> cdp4emfconnector.Category.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getFileType().addAll(thing.getFileType().stream().map(item -> cdp4emfconnector.FileType.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getGlossary().addAll(thing.getGlossary().stream().map(item -> cdp4emfconnector.Glossary.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.setModifiedOn(thing.getModifiedOn());
        
        emfModelReferenceDataLibrary.setName(thing.getName());
        
        emfModelReferenceDataLibrary.getParameterType().addAll(thing.getParameterType().stream().map(item -> cdp4emfconnector.ParameterType.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getReferenceSource().addAll(thing.getReferenceSource().stream().map(item -> cdp4emfconnector.ReferenceSource.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.setRequiredRdl(thing.getRequiredRdl() != null ? cdp4emfconnector.SiteReferenceDataLibrary.toEmf(thing.getRequiredRdl()) : null);
        emfModelReferenceDataLibrary.setRevisionNumber(thing.getRevisionNumber());
        
        emfModelReferenceDataLibrary.getRule().addAll(thing.getRule().stream().map(item -> cdp4emfconnector.Rule.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getScale().addAll(thing.getScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.setShortName(thing.getShortName());
        
        emfModelReferenceDataLibrary.getUnit().addAll(thing.getUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toEmf(item)).collect(Collectors.toList()));
        
        emfModelReferenceDataLibrary.getUnitPrefix().addAll(thing.getUnitPrefix().stream().map(item -> cdp4emfconnector.UnitPrefix.toEmf(item)).collect(Collectors.toList()));
        		        
        return emfModelReferenceDataLibrary;
        	
        }

        return null;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.ReferenceDataLibrary} to {@link cdp4common.sitedirectorydata.ReferenceDataLibrary}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.ReferenceDataLibrary}
     */
    public static cdp4common.sitedirectorydata.ReferenceDataLibrary toPojo(CDP4.SiteDirectoryData.ReferenceDataLibrary emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.SiteReferenceDataLibrary":                
        cdp4common.sitedirectorydata.ReferenceDataLibrary pojoSiteReferenceDataLibrary = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary();	    
        
        pojoSiteReferenceDataLibrary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoSiteReferenceDataLibrary.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getBaseQuantityKind().addAll(emfThing.getBaseQuantityKind().stream().map(item -> cdp4emfconnector.QuantityKind.toPojo(item)).collect(Collectors.toList()));
        
        pojoSiteReferenceDataLibrary.getBaseUnit().addAll(emfThing.getBaseUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getConstant().addAll(emfThing.getConstant().stream().map(item -> cdp4emfconnector.Constant.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getDefinedCategory().addAll(emfThing.getDefinedCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getFileType().addAll(emfThing.getFileType().stream().map(item -> cdp4emfconnector.FileType.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getGlossary().addAll(emfThing.getGlossary().stream().map(item -> cdp4emfconnector.Glossary.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoSiteReferenceDataLibrary.setName(emfThing.getName());
        
        pojoSiteReferenceDataLibrary.getParameterType().addAll(emfThing.getParameterType().stream().map(item -> cdp4emfconnector.ParameterType.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getReferenceSource().addAll(emfThing.getReferenceSource().stream().map(item -> cdp4emfconnector.ReferenceSource.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.setRequiredRdl(emfThing.getRequiredRdl() != null ? cdp4emfconnector.SiteReferenceDataLibrary.toPojo(emfThing.getRequiredRdl()) : null);
        pojoSiteReferenceDataLibrary.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoSiteReferenceDataLibrary.getRule().addAll(emfThing.getRule().stream().map(item -> cdp4emfconnector.Rule.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getScale().addAll(emfThing.getScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.setShortName(emfThing.getShortName());
        
        pojoSiteReferenceDataLibrary.getUnit().addAll(emfThing.getUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toPojo(item)).collect(Collectors.toList()));              
        
        pojoSiteReferenceDataLibrary.getUnitPrefix().addAll(emfThing.getUnitPrefix().stream().map(item -> cdp4emfconnector.UnitPrefix.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoSiteReferenceDataLibrary;
        
        case "CDP4.sitedirectorydata.ModelReferenceDataLibrary":                
        cdp4common.sitedirectorydata.ReferenceDataLibrary pojoModelReferenceDataLibrary = new cdp4common.sitedirectorydata.ModelReferenceDataLibrary();	    
        
        pojoModelReferenceDataLibrary.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoModelReferenceDataLibrary.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getBaseQuantityKind().addAll(emfThing.getBaseQuantityKind().stream().map(item -> cdp4emfconnector.QuantityKind.toPojo(item)).collect(Collectors.toList()));
        
        pojoModelReferenceDataLibrary.getBaseUnit().addAll(emfThing.getBaseUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getConstant().addAll(emfThing.getConstant().stream().map(item -> cdp4emfconnector.Constant.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getDefinedCategory().addAll(emfThing.getDefinedCategory().stream().map(item -> cdp4emfconnector.Category.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getFileType().addAll(emfThing.getFileType().stream().map(item -> cdp4emfconnector.FileType.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getGlossary().addAll(emfThing.getGlossary().stream().map(item -> cdp4emfconnector.Glossary.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.setModifiedOn(emfThing.getModifiedOn());
        
        pojoModelReferenceDataLibrary.setName(emfThing.getName());
        
        pojoModelReferenceDataLibrary.getParameterType().addAll(emfThing.getParameterType().stream().map(item -> cdp4emfconnector.ParameterType.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getReferenceSource().addAll(emfThing.getReferenceSource().stream().map(item -> cdp4emfconnector.ReferenceSource.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.setRequiredRdl(emfThing.getRequiredRdl() != null ? cdp4emfconnector.SiteReferenceDataLibrary.toPojo(emfThing.getRequiredRdl()) : null);
        pojoModelReferenceDataLibrary.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoModelReferenceDataLibrary.getRule().addAll(emfThing.getRule().stream().map(item -> cdp4emfconnector.Rule.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getScale().addAll(emfThing.getScale().stream().map(item -> cdp4emfconnector.MeasurementScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.setShortName(emfThing.getShortName());
        
        pojoModelReferenceDataLibrary.getUnit().addAll(emfThing.getUnit().stream().map(item -> cdp4emfconnector.MeasurementUnit.toPojo(item)).collect(Collectors.toList()));              
        
        pojoModelReferenceDataLibrary.getUnitPrefix().addAll(emfThing.getUnitPrefix().stream().map(item -> cdp4emfconnector.UnitPrefix.toPojo(item)).collect(Collectors.toList()));              
        		        
        return pojoModelReferenceDataLibrary;
        	
        }

        return null;
    }
    
}
