/* --------------------------------------------------------------------------------------------------------------------
 * Iteration.java
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
 * Static resource that allows to change representation of the {@link Iteration} class.
 */
public class Iteration {
   
    /**
     * Convert from {@link cdp4common.engineeringmodeldata.Iteration} to {@link CDP4.EngineeringModelData.Iteration}
     *
     * @return Generated {@link CDP4.EngineeringModelData.Iteration}
     */
    public static CDP4.EngineeringModelData.Iteration toEmf(cdp4common.engineeringmodeldata.Iteration thing) {       
        
        CDP4.EngineeringModelData.Iteration emf =  CDP4.EngineeringModelData.impl.EngineeringModelDataFactoryImpl.eINSTANCE.createIteration();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getActualFiniteStateList().addAll(thing.getActualFiniteStateList().stream().map(item -> cdp4emfconnector.ActualFiniteStateList.toEmf(item)).collect(Collectors.toList()));
        
        emf.setDefaultOption(thing.getDefaultOption() != null ? cdp4emfconnector.Option.toEmf(thing.getDefaultOption()) : null);
        emf.getDiagramCanvas().addAll(thing.getDiagramCanvas().stream().map(item -> cdp4emfconnector.DiagramCanvas.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDomainFileStore().addAll(thing.getDomainFileStore().stream().map(item -> cdp4emfconnector.DomainFileStore.toEmf(item)).collect(Collectors.toList()));
        
        emf.getElement().addAll(thing.getElement().stream().map(item -> cdp4emfconnector.ElementDefinition.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExternalIdentifierMap().addAll(thing.getExternalIdentifierMap().stream().map(item -> cdp4emfconnector.ExternalIdentifierMap.toEmf(item)).collect(Collectors.toList()));
        
        emf.getGoal().addAll(thing.getGoal().stream().map(item -> cdp4emfconnector.Goal.toEmf(item)).collect(Collectors.toList()));
        
        emf.setIterationSetup(thing.getIterationSetup() != null ? cdp4emfconnector.IterationSetup.toEmf(thing.getIterationSetup()) : null);        
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.getOption().addAll(thing.getOption().stream().map(item -> cdp4emfconnector.Option.toEmf(item)).collect(Collectors.toList()));
        
        emf.getPossibleFiniteStateList().addAll(thing.getPossibleFiniteStateList().stream().map(item -> cdp4emfconnector.PossibleFiniteStateList.toEmf(item)).collect(Collectors.toList()));
        
        emf.getPublication().addAll(thing.getPublication().stream().map(item -> cdp4emfconnector.Publication.toEmf(item)).collect(Collectors.toList()));
        
        emf.getRelationship().addAll(thing.getRelationship().stream().map(item -> cdp4emfconnector.Relationship.toEmf(item)).collect(Collectors.toList()));
        
        emf.getRequirementsSpecification().addAll(thing.getRequirementsSpecification().stream().map(item -> cdp4emfconnector.RequirementsSpecification.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.getRuleVerificationList().addAll(thing.getRuleVerificationList().stream().map(item -> cdp4emfconnector.RuleVerificationList.toEmf(item)).collect(Collectors.toList()));
        
        emf.getSharedDiagramStyle().addAll(thing.getSharedDiagramStyle().stream().map(item -> cdp4emfconnector.SharedStyle.toEmf(item)).collect(Collectors.toList()));
        
        emf.setSourceIterationIid(thing.getSourceIterationIid().toString());
        
        emf.getStakeholder().addAll(thing.getStakeholder().stream().map(item -> cdp4emfconnector.Stakeholder.toEmf(item)).collect(Collectors.toList()));
        
        emf.getStakeholderValue().addAll(thing.getStakeholderValue().stream().map(item -> cdp4emfconnector.StakeholderValue.toEmf(item)).collect(Collectors.toList()));
        
        emf.getStakeholderValueMap().addAll(thing.getStakeholderValueMap().stream().map(item -> cdp4emfconnector.StakeHolderValueMap.toEmf(item)).collect(Collectors.toList()));
        
        emf.setThingPreference(thing.getThingPreference());
        
        emf.setTopElement(thing.getTopElement() != null ? cdp4emfconnector.ElementDefinition.toEmf(thing.getTopElement()) : null);
        emf.getValueGroup().addAll(thing.getValueGroup().stream().map(item -> cdp4emfconnector.ValueGroup.toEmf(item)).collect(Collectors.toList()));
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.EngineeringModelData.Iteration} to {@link cdp4common.engineeringmodeldata.Iteration}
     *
     * @return Generated {@link cdp4common.engineeringmodeldata.Iteration}
     */
    public static cdp4common.engineeringmodeldata.Iteration toPojo(CDP4.EngineeringModelData.Iteration emfThing) {
        
        cdp4common.engineeringmodeldata.Iteration pojo = new cdp4common.engineeringmodeldata.Iteration();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getActualFiniteStateList().addAll(emfThing.getActualFiniteStateList().stream().map(item -> cdp4emfconnector.ActualFiniteStateList.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setDefaultOption(emfThing.getDefaultOption() != null ? cdp4emfconnector.Option.toPojo(emfThing.getDefaultOption()) : null);
        pojo.getDiagramCanvas().addAll(emfThing.getDiagramCanvas().stream().map(item -> cdp4emfconnector.DiagramCanvas.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDomainFileStore().addAll(emfThing.getDomainFileStore().stream().map(item -> cdp4emfconnector.DomainFileStore.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getElement().addAll(emfThing.getElement().stream().map(item -> cdp4emfconnector.ElementDefinition.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExternalIdentifierMap().addAll(emfThing.getExternalIdentifierMap().stream().map(item -> cdp4emfconnector.ExternalIdentifierMap.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getGoal().addAll(emfThing.getGoal().stream().map(item -> cdp4emfconnector.Goal.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setIterationSetup(emfThing.getIterationSetup() != null ? cdp4emfconnector.IterationSetup.toPojo(emfThing.getIterationSetup()) : null);        
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.getOption().addAll(emfThing.getOption().stream().map(item -> cdp4emfconnector.Option.toPojo(item)).collect(Collectors.toList()));
        
        pojo.getPossibleFiniteStateList().addAll(emfThing.getPossibleFiniteStateList().stream().map(item -> cdp4emfconnector.PossibleFiniteStateList.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getPublication().addAll(emfThing.getPublication().stream().map(item -> cdp4emfconnector.Publication.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getRelationship().addAll(emfThing.getRelationship().stream().map(item -> cdp4emfconnector.Relationship.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getRequirementsSpecification().addAll(emfThing.getRequirementsSpecification().stream().map(item -> cdp4emfconnector.RequirementsSpecification.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.getRuleVerificationList().addAll(emfThing.getRuleVerificationList().stream().map(item -> cdp4emfconnector.RuleVerificationList.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getSharedDiagramStyle().addAll(emfThing.getSharedDiagramStyle().stream().map(item -> cdp4emfconnector.SharedStyle.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setSourceIterationIid(UUID.fromString(emfThing.getSourceIterationIid()));
        
        pojo.getStakeholder().addAll(emfThing.getStakeholder().stream().map(item -> cdp4emfconnector.Stakeholder.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getStakeholderValue().addAll(emfThing.getStakeholderValue().stream().map(item -> cdp4emfconnector.StakeholderValue.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getStakeholderValueMap().addAll(emfThing.getStakeholderValueMap().stream().map(item -> cdp4emfconnector.StakeHolderValueMap.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        pojo.setTopElement(emfThing.getTopElement() != null ? cdp4emfconnector.ElementDefinition.toPojo(emfThing.getTopElement()) : null);
        pojo.getValueGroup().addAll(emfThing.getValueGroup().stream().map(item -> cdp4emfconnector.ValueGroup.toPojo(item)).collect(Collectors.toList()));              
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.engineeringmodeldata.Iteration} from a {@link CDP4.EngineeringModelData.Iteration}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.Iteration}.
    * @return A new {@link cdp4common.engineeringmodeldata.Iteration}
    */
    public static cdp4common.engineeringmodeldata.Iteration instiatePojo(CDP4.EngineeringModelData.Iteration thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.engineeringmodeldata.Iteration(UUID.fromString(thing.getIid()), cache, uri);
    }
}
