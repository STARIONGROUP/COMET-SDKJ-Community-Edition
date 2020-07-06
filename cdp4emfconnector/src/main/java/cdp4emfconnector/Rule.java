/* --------------------------------------------------------------------------------------------------------------------
 * Rule.java
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

public abstract class Rule {

    public static CDP4.SiteDirectoryData.Rule toEmf(cdp4common.sitedirectorydata.Rule thing) {       
            
        switch (thing.getClass().getTypeName()){
        
        case "cdp4common.sitedirectorydata.ReferencerRule":
        CDP4.SiteDirectoryData.Rule emfReferencerRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createReferencerRule();    
        
        emfReferencerRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfReferencerRule.setIsDeprecated(thing.isDeprecated());
        
        emfReferencerRule.setModifiedOn(thing.getModifiedOn());
        
        emfReferencerRule.setName(thing.getName());
        
        emfReferencerRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfReferencerRule.setShortName(thing.getShortName());
        		        
        return emfReferencerRule;   
        
        
        case "cdp4common.sitedirectorydata.BinaryRelationshipRule":
        CDP4.SiteDirectoryData.Rule emfBinaryRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createBinaryRelationshipRule();    
        
        emfBinaryRelationshipRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfBinaryRelationshipRule.setIsDeprecated(thing.isDeprecated());
        
        emfBinaryRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfBinaryRelationshipRule.setName(thing.getName());
        
        emfBinaryRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfBinaryRelationshipRule.setShortName(thing.getShortName());
        		        
        return emfBinaryRelationshipRule;   
        
        
        case "cdp4common.sitedirectorydata.MultiRelationshipRule":
        CDP4.SiteDirectoryData.Rule emfMultiRelationshipRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createMultiRelationshipRule();    
        
        emfMultiRelationshipRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfMultiRelationshipRule.setIsDeprecated(thing.isDeprecated());
        
        emfMultiRelationshipRule.setModifiedOn(thing.getModifiedOn());
        
        emfMultiRelationshipRule.setName(thing.getName());
        
        emfMultiRelationshipRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfMultiRelationshipRule.setShortName(thing.getShortName());
        		        
        return emfMultiRelationshipRule;   
        
        
        case "cdp4common.sitedirectorydata.DecompositionRule":
        CDP4.SiteDirectoryData.Rule emfDecompositionRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createDecompositionRule();    
        
        emfDecompositionRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfDecompositionRule.setIsDeprecated(thing.isDeprecated());
        
        emfDecompositionRule.setModifiedOn(thing.getModifiedOn());
        
        emfDecompositionRule.setName(thing.getName());
        
        emfDecompositionRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfDecompositionRule.setShortName(thing.getShortName());
        		        
        return emfDecompositionRule;   
        
        
        case "cdp4common.sitedirectorydata.ParameterizedCategoryRule":
        CDP4.SiteDirectoryData.Rule emfParameterizedCategoryRule =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createParameterizedCategoryRule();    
        
        emfParameterizedCategoryRule.setIid(thing.getIid().toString()); 
        
        
        
        
        
        
        emfParameterizedCategoryRule.setIsDeprecated(thing.isDeprecated());
        
        emfParameterizedCategoryRule.setModifiedOn(thing.getModifiedOn());
        
        emfParameterizedCategoryRule.setName(thing.getName());
        
        emfParameterizedCategoryRule.setRevisionNumber(thing.getRevisionNumber());
        
        emfParameterizedCategoryRule.setShortName(thing.getShortName());
        		        
        return emfParameterizedCategoryRule;   
        
        	
        }
        return null;
        
        
    }

    public static  cdp4common.sitedirectorydata.Rule toPojo(CDP4.SiteDirectoryData.Rule emfThing) {
            
        switch (emfThing.getClass().getTypeName()){
        
        case "CDP4.sitedirectorydata.ReferencerRule":                
        cdp4common.sitedirectorydata.Rule pojoReferencerRule = new cdp4common.sitedirectorydata.ReferencerRule();	    
        
        pojoReferencerRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoReferencerRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoReferencerRule.setDeprecated(emfThing.getIsDeprecated());
        
        pojoReferencerRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoReferencerRule.setName(emfThing.getName());
        
        pojoReferencerRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoReferencerRule.setShortName(emfThing.getShortName());
        		        
        return pojoReferencerRule;   
        
        
        case "CDP4.sitedirectorydata.BinaryRelationshipRule":                
        cdp4common.sitedirectorydata.Rule pojoBinaryRelationshipRule = new cdp4common.sitedirectorydata.BinaryRelationshipRule();	    
        
        pojoBinaryRelationshipRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoBinaryRelationshipRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoBinaryRelationshipRule.setDeprecated(emfThing.getIsDeprecated());
        
        pojoBinaryRelationshipRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoBinaryRelationshipRule.setName(emfThing.getName());
        
        pojoBinaryRelationshipRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoBinaryRelationshipRule.setShortName(emfThing.getShortName());
        		        
        return pojoBinaryRelationshipRule;   
        
        
        case "CDP4.sitedirectorydata.MultiRelationshipRule":                
        cdp4common.sitedirectorydata.Rule pojoMultiRelationshipRule = new cdp4common.sitedirectorydata.MultiRelationshipRule();	    
        
        pojoMultiRelationshipRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoMultiRelationshipRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoMultiRelationshipRule.setDeprecated(emfThing.getIsDeprecated());
        
        pojoMultiRelationshipRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoMultiRelationshipRule.setName(emfThing.getName());
        
        pojoMultiRelationshipRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoMultiRelationshipRule.setShortName(emfThing.getShortName());
        		        
        return pojoMultiRelationshipRule;   
        
        
        case "CDP4.sitedirectorydata.DecompositionRule":                
        cdp4common.sitedirectorydata.Rule pojoDecompositionRule = new cdp4common.sitedirectorydata.DecompositionRule();	    
        
        pojoDecompositionRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoDecompositionRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoDecompositionRule.setDeprecated(emfThing.getIsDeprecated());
        
        pojoDecompositionRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoDecompositionRule.setName(emfThing.getName());
        
        pojoDecompositionRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoDecompositionRule.setShortName(emfThing.getShortName());
        		        
        return pojoDecompositionRule;   
        
        
        case "CDP4.sitedirectorydata.ParameterizedCategoryRule":                
        cdp4common.sitedirectorydata.Rule pojoParameterizedCategoryRule = new cdp4common.sitedirectorydata.ParameterizedCategoryRule();	    
        
        pojoParameterizedCategoryRule.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojoParameterizedCategoryRule.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojoParameterizedCategoryRule.setDeprecated(emfThing.getIsDeprecated());
        
        pojoParameterizedCategoryRule.setModifiedOn(emfThing.getModifiedOn());
        
        pojoParameterizedCategoryRule.setName(emfThing.getName());
        
        pojoParameterizedCategoryRule.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojoParameterizedCategoryRule.setShortName(emfThing.getShortName());
        		        
        return pojoParameterizedCategoryRule;   
        
        	
    }
        return null;
        
        
     }

        
}
