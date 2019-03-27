/* --------------------------------------------------------------------------------------------------------------------
 * Participant.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
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
 * This is an auto-generated POJO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a participant in the team working in a concurrent engineering activity on an EngineeringModel
 */
@Container(clazz = EngineeringModelSetup.class, propertyName = "participant")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Participant extends Thing implements Cloneable, ParticipantAffectedAccessThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NONE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link Participant} class.
     */
    public Participant() {
        this.domain = new ArrayList<DomainOfExpertise>();
    }

    /**
     * Initializes a new instance of the {@link Participant} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Participant(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.domain = new ArrayList<DomainOfExpertise>();
    }

    /**
     * List of DomainOfExpertise.
     * references to the domains of expertise (set of DomainOfExpertise) that this Participant may represent
     * Note: At any moment in a session in an E-TM-10-25 compliant environment a Participant is actively representing one DomainOfExpertise only, see the <i>selectedDomain</i> property. If more than one DomainOfExpertise is specified, he or she may select any of those DomainOfExpertises to switch to, at any time during the session.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<DomainOfExpertise> domain;

    /**
     * Value indicating whether isActive.
     * assertion whether this Participant is active in the current
     * EngineeringModel
     * Note: This allows to set Participants that already started as member of a
     * concurrent engineering team in an inactive role. Once created a
     * Participant cannot be deleted without precautions because this may render
     * earlier created data incomplete.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isActive;

    /**
     * Property person.
     * reference to the Person that is this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Person person;

    /**
     * Property role.
     * reference to the ParticipantRole assigned to this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParticipantRole role;

    /**
     * Property selectedDomain.
     * active DomainOfExpertise selected by this Participant
     * Note: The selectedDomain must be one from the set of DomainOfExpertise specified in the <i>domain</i> property of this Participant.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DomainOfExpertise selectedDomain;

    /**
     * Creates and returns a copy of this {@link Participant} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Participant}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        Participant clone;
        try {
            clone = (Participant)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow Participant cannot be cloned.");
        }

        clone.setDomain(new ArrayList<DomainOfExpertise>(this.getDomain()));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Participant} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Participant}.
     */
    @Override
    public Participant clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Participant)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Participant}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int domainCount = this.getDomain().size();
        if (domainCount < 1) {
            errorList.add("The number of elements in the property domain is wrong. It should be at least 1.");
        }

        if (this.getPerson() == null || this.getPerson().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property person is null.");
            this.setPerson(SentinelThingProvider.getSentinel(Person.class));
            this.sentinelResetMap.put("person", new ActionImpl(() -> this.setPerson(null)));
        }

        if (this.getRole() == null || this.getRole().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property role is null.");
            this.setRole(SentinelThingProvider.getSentinel(ParticipantRole.class));
            this.sentinelResetMap.put("role", new ActionImpl(() -> this.setRole(null)));
        }

        if (this.getSelectedDomain() == null || this.getSelectedDomain().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property selectedDomain is null.");
            this.setSelectedDomain(SentinelThingProvider.getSentinel(DomainOfExpertise.class));
            this.sentinelResetMap.put("selectedDomain", new ActionImpl(() -> this.setSelectedDomain(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Participant} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Participant dto = (cdp4common.dto.Participant)dtoThing;

        PojoThingFactory.resolveList(this.getDomain(), dto.getDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setActive(dto.isActive());
        this.setModifiedOn(dto.getModifiedOn());
        this.setPerson(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getPerson(), dto.getIterationContainerId(), Person.class), SentinelThingProvider.getSentinel(Person.class)));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setRole(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getRole(), dto.getIterationContainerId(), ParticipantRole.class), SentinelThingProvider.getSentinel(ParticipantRole.class)));
        this.setSelectedDomain(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getSelectedDomain(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Participant}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Participant dto = new cdp4common.dto.Participant(this.getIid(), this.getRevisionNumber());

        dto.getDomain().addAll(this.getDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setActive(this.isActive());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPerson(this.getPerson() != null ? this.getPerson().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setRole(this.getRole() != null ? this.getRole().getIid() : new UUID(0L, 0L));
        dto.setSelectedDomain(this.getSelectedDomain() != null ? this.getSelectedDomain().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
