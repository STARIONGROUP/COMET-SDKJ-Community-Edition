/* --------------------------------------------------------------------------------------------------------------------
 * SentinelThingProvider.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
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
 * This is an auto-generated class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;

/**
 * A sentinel thing provider class
 */
public class SentinelThingProvider {
    /**
     * The dictionary that contains sentinel instances for all types of Thing
     */
    private static final Map<String, Thing> sentinelProvider = new HashMap<>();

    /*
     * Initialize the static {@link SentinelThingProvider}
     */
    static {
        sentinelProvider.put("BooleanExpression", new AndExpression(new UUID(0L, 0L), null, null));
        sentinelProvider.put("Category", new Category(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ChangeProposal", new ChangeProposal(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ChangeRequest", new ChangeRequest(new UUID(0L, 0L), null, null));
        sentinelProvider.put("DiagramElementThing", new DiagramEdge(new UUID(0L, 0L), null, null));
        sentinelProvider.put("DomainOfExpertise", new DomainOfExpertise(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ElementDefinition", new ElementDefinition(new UUID(0L, 0L), null, null));
        sentinelProvider.put("EngineeringModelSetup", new EngineeringModelSetup(new UUID(0L, 0L), null, null));
        sentinelProvider.put("FileType", new FileType(new UUID(0L, 0L), null, null));
        sentinelProvider.put("IterationSetup", new IterationSetup(new UUID(0L, 0L), null, null));
        sentinelProvider.put("MeasurementScale", new CyclicRatioScale(new UUID(0L, 0L), null, null));
        sentinelProvider.put("MeasurementUnit", new DerivedUnit(new UUID(0L, 0L), null, null));
        sentinelProvider.put("Organization", new Organization(new UUID(0L, 0L), null, null));
        sentinelProvider.put("Parameter", new Parameter(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ParameterBase", new Parameter(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ParameterType", new ArrayParameterType(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ParameterValueSet", new ParameterValueSet(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ParameterValueSetBase", new ParameterOverrideValueSet(new UUID(0L, 0L), null, null));
        sentinelProvider.put("Participant", new Participant(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ParticipantRole", new ParticipantRole(new UUID(0L, 0L), null, null));
        sentinelProvider.put("Person", new Person(new UUID(0L, 0L), null, null));
        sentinelProvider.put("QuantityKind", new DerivedQuantityKind(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ReferenceSource", new ReferenceSource(new UUID(0L, 0L), null, null));
        sentinelProvider.put("Rule", new BinaryRelationshipRule(new UUID(0L, 0L), null, null));
        sentinelProvider.put("ScaleValueDefinition", new ScaleValueDefinition(new UUID(0L, 0L), null, null));
        sentinelProvider.put("SiteDirectoryThingReference", new SiteDirectoryThingReference(new UUID(0L, 0L), null, null));
        sentinelProvider.put("Thing", new ActionItem(new UUID(0L, 0L), null, null));
        sentinelProvider.put("UnitPrefix", new UnitPrefix(new UUID(0L, 0L), null, null));

        resolveRequiredDependency();
    }

    /**
     * Gets the sentinel instance of {@code T}
     *
     * @param <T> A type of {@link Thing}
     * @return The sentinel instance
     */
     @SuppressWarnings("unchecked")
    public static <T extends Thing> T getSentinel(Class<T> clazz) {
        Thing sentinel = sentinelProvider.get(clazz.getSimpleName());
        if (sentinel == null)
        {
            throw new IllegalArgumentException(String.format("The sentinel instance of %1$s was not found", clazz.getSimpleName()));
        }

        return (T)sentinel;
    }

    /**
     * Resolve the required dependency of the sentinels
     */
    private static void resolveRequiredDependency()
    {
        for (Thing thing : sentinelProvider.values())
        {
            thing.validatePojo();
        }
    }
}
