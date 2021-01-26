/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelSetup.java
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
 * Static resource that allows to change representation of the {@link EngineeringModelSetup} class.
 */
public class EngineeringModelSetup {
   
    /**
     * Convert from {@link cdp4common.sitedirectorydata.EngineeringModelSetup} to {@link CDP4.SiteDirectoryData.EngineeringModelSetup}
     *
     * @return Generated {@link CDP4.SiteDirectoryData.EngineeringModelSetup}
     */
    public static CDP4.SiteDirectoryData.EngineeringModelSetup toEmf(cdp4common.sitedirectorydata.EngineeringModelSetup thing) {       
        
        CDP4.SiteDirectoryData.EngineeringModelSetup emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createEngineeringModelSetup();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getActiveDomain().addAll(thing.getActiveDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emf.setDefaultOrganizationalParticipant(thing.getDefaultOrganizationalParticipant() != null ? cdp4emfconnector.OrganizationalParticipant.toEmf(thing.getDefaultOrganizationalParticipant()) : null);
        emf.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emf.setEngineeringModelIid(thing.getEngineeringModelIid().toString());
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emf.getIterationSetup().addAll(thing.getIterationSetup().stream().map(item -> cdp4emfconnector.IterationSetup.toEmf(item)).collect(Collectors.toList()));
        
        if (thing.getKind() != null) {emf.setKind(CDP4.SiteDirectoryData.EngineeringModelKind.valueOf(thing.getKind().toString()));}                          
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.getOrganizationalParticipant().addAll(thing.getOrganizationalParticipant().stream().map(item -> cdp4emfconnector.OrganizationalParticipant.toEmf(item)).collect(Collectors.toList()));
        
        emf.getParticipant().addAll(thing.getParticipant().stream().map(item -> cdp4emfconnector.Participant.toEmf(item)).collect(Collectors.toList()));
        
        emf.setRequiredRdl(thing.getRequiredRdl().stream().map(item -> cdp4emfconnector.ModelReferenceDataLibrary.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setShortName(thing.getShortName());
        
        emf.setSourceEngineeringModelSetupIid(thing.getSourceEngineeringModelSetupIid().toString());
        
        if (thing.getStudyPhase() != null) {emf.setStudyPhase(CDP4.SiteDirectoryData.StudyPhaseKind.valueOf(thing.getStudyPhase().toString()));}                          
        
        emf.setThingPreference(thing.getThingPreference());
        
        return emf;
    }

    /**
     * Convert from {@link CDP4.SiteDirectoryData.EngineeringModelSetup} to {@link cdp4common.sitedirectorydata.EngineeringModelSetup}
     *
     * @return Generated {@link cdp4common.sitedirectorydata.EngineeringModelSetup}
     */
    public static cdp4common.sitedirectorydata.EngineeringModelSetup toPojo(CDP4.SiteDirectoryData.EngineeringModelSetup emfThing) {
        
        cdp4common.sitedirectorydata.EngineeringModelSetup pojo = new cdp4common.sitedirectorydata.EngineeringModelSetup();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getActiveDomain().addAll(emfThing.getActiveDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setDefaultOrganizationalParticipant(emfThing.getDefaultOrganizationalParticipant() != null ? cdp4emfconnector.OrganizationalParticipant.toPojo(emfThing.getDefaultOrganizationalParticipant()) : null);
        pojo.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setEngineeringModelIid(UUID.fromString(emfThing.getEngineeringModelIid()));
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getIterationSetup().addAll(emfThing.getIterationSetup().stream().map(item -> cdp4emfconnector.IterationSetup.toPojo(item)).collect(Collectors.toList()));              
        
        if (emfThing.getKind() != null) {pojo.setKind(cdp4common.sitedirectorydata.EngineeringModelKind.valueOf(emfThing.getKind().toString()));}  
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.getOrganizationalParticipant().addAll(emfThing.getOrganizationalParticipant().stream().map(item -> cdp4emfconnector.OrganizationalParticipant.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getParticipant().addAll(emfThing.getParticipant().stream().map(item -> cdp4emfconnector.Participant.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getRequiredRdl().add(cdp4emfconnector.ModelReferenceDataLibrary.toPojo(emfThing.getRequiredRdl()));   
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setShortName(emfThing.getShortName());
        
        pojo.setSourceEngineeringModelSetupIid(UUID.fromString(emfThing.getSourceEngineeringModelSetupIid()));
        
        if (emfThing.getStudyPhase() != null) {pojo.setStudyPhase(cdp4common.sitedirectorydata.StudyPhaseKind.valueOf(emfThing.getStudyPhase().toString()));}  
        
        pojo.setThingPreference(emfThing.getThingPreference());
        
        return pojo;
    }
    
    /**
    * Instantiate a {@link cdp4common.sitedirectorydata.EngineeringModelSetup} from a {@link CDP4.SiteDirectoryData.EngineeringModelSetup}
    *
    * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
    * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.EngineeringModelSetup}.
    * @return A new {@link cdp4common.sitedirectorydata.EngineeringModelSetup}
    */
    public static cdp4common.sitedirectorydata.EngineeringModelSetup instiatePojo(CDP4.SiteDirectoryData.EngineeringModelSetup thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
       return new cdp4common.sitedirectorydata.EngineeringModelSetup(UUID.fromString(thing.getIid()), cache, uri);
    }
}
