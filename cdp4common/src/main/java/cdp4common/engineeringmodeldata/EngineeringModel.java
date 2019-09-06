/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModel.java
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

package cdp4common.engineeringmodeldata;

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
 * representation of a parametric concurrent engineering model that specifies the problem to be solved and defines one or more (possible) design solutions
 * Note 1: An EngineeringModel also references a chain of one or more ReferenceDataLibraries (through the <i>requiredRdl</i> property of the associated EngineeringModelSetup) that define the reference data that is or can be used in the model.
 * Note 2: When an EngineeringModel is created for first time, it shall contain one Iteration and one Option (with <i>name</i> and <i>shortName</i> set to "Default"), which shall also be referenced as the <i>defaultOption</i>.
 */
@ToString
public class EngineeringModel extends TopContainer implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the {@link EngineeringModel} class.
     */
    public EngineeringModel() {
        this.book = new OrderedItemList<Book>(this, true, Book.class);
        this.commonFileStore = new ContainerList<CommonFileStore>(this);
        this.genericNote = new ContainerList<EngineeringModelDataNote>(this);
        this.iteration = new ContainerList<Iteration>(this);
        this.logEntry = new ContainerList<ModelLogEntry>(this);
        this.modellingAnnotation = new ContainerList<ModellingAnnotationItem>(this);
    }

    /**
     * Initializes a new instance of the {@link EngineeringModel} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public EngineeringModel(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.book = new OrderedItemList<Book>(this, true, Book.class);
        this.commonFileStore = new ContainerList<CommonFileStore>(this);
        this.genericNote = new ContainerList<EngineeringModelDataNote>(this);
        this.iteration = new ContainerList<Iteration>(this);
        this.logEntry = new ContainerList<ModelLogEntry>(this);
        this.modellingAnnotation = new ContainerList<ModellingAnnotationItem>(this);
    }

    /**
     * List of ordered contained Book.
     * collection of Books in this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<Book> book;

    /**
     * List of contained CommonFileStore.
     * representation of the CommonFileStore in this EngineeringModel
     * Note: Typically there will be one CommonFileStore shared by all domains in a particular EngineeringModel, plus one DomainFileStore for each DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<CommonFileStore> commonFileStore;

    /**
     * Property engineeringModelSetup.
     * reference to the set-up information for this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private EngineeringModelSetup engineeringModelSetup;

    /**
     * List of contained EngineeringModelDataNote.
     * The generic annotations made on Things contained by this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<EngineeringModelDataNote> genericNote;

    /**
     * List of contained Iteration.
     * collection of Iterations in this EngineeringModel
     * Note 1: An iteration is a version of the EngineeringModel that is considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a "complete and coherent" step depends on the organization that develops the EngineeringModel.
     * Note 2: In a concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
     * Note 3: In an implementation of E-TM-10-25 the actual Iteration objects may be stored in different partitions in a persistent data store.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Iteration> iteration;

    /**
     * List of contained ModelLogEntry.
     * collection of logbook entries for this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ModelLogEntry> logEntry;

    /**
     * List of contained ModellingAnnotationItem.
     * The modelling annotation made on the Things contained by this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ModellingAnnotationItem> modellingAnnotation;

    /**
     * {@link Iterable} that references the composite properties of the current {@link EngineeringModel}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link EngineeringModel}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.book);
        containers.add(this.commonFileStore);
        containers.add(this.genericNote);
        containers.add(this.iteration);
        containers.add(this.logEntry);
        containers.add(this.modellingAnnotation);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link EngineeringModel} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EngineeringModel}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        EngineeringModel clone;
        try {
            clone = (EngineeringModel)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow EngineeringModel cannot be cloned.");
        }

        clone.setBook(cloneContainedThings ? new OrderedItemList<Book>(clone, true, Book.class) : new OrderedItemList<Book>(this.getBook(), clone, Book.class));
        clone.setCommonFileStore(cloneContainedThings ? new ContainerList<CommonFileStore>(clone) : new ContainerList<CommonFileStore>(this.getCommonFileStore(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setGenericNote(cloneContainedThings ? new ContainerList<EngineeringModelDataNote>(clone) : new ContainerList<EngineeringModelDataNote>(this.getGenericNote(), clone, false));
        clone.setIteration(cloneContainedThings ? new ContainerList<Iteration>(clone) : new ContainerList<Iteration>(this.getIteration(), clone, false));
        clone.setLogEntry(cloneContainedThings ? new ContainerList<ModelLogEntry>(clone) : new ContainerList<ModelLogEntry>(this.getLogEntry(), clone, false));
        clone.setModellingAnnotation(cloneContainedThings ? new ContainerList<ModellingAnnotationItem>(clone) : new ContainerList<ModellingAnnotationItem>(this.getModellingAnnotation(), clone, false));

        if (cloneContainedThings) {
            clone.getBook().addAll(this.getBook().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getCommonFileStore().addAll(this.getCommonFileStore().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getGenericNote().addAll(this.getGenericNote().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getIteration().addAll(this.getIteration().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getLogEntry().addAll(this.getLogEntry().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getModellingAnnotation().addAll(this.getModellingAnnotation().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link EngineeringModel} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EngineeringModel}.
     */
    @Override
    public EngineeringModel clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EngineeringModel)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this EngineeringModel}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getEngineeringModelSetup() == null || this.getEngineeringModelSetup().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property engineeringModelSetup is null.");
            this.setEngineeringModelSetup(SentinelThingProvider.getSentinel(EngineeringModelSetup.class));
            this.sentinelResetMap.put("engineeringModelSetup", new ActionImpl(() -> this.setEngineeringModelSetup(null)));
        }

        int iterationCount = this.getIteration().size();
        if (iterationCount < 1) {
            errorList.add("The number of elements in the property iteration is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link EngineeringModel} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.EngineeringModel dto = (cdp4common.dto.EngineeringModel)dtoThing;

        PojoThingFactory.resolveList(this.getBook(), dto.getBook(), dto.getIterationContainerId(), this.getCache(), Book.class);
        PojoThingFactory.resolveList(this.getCommonFileStore(), dto.getCommonFileStore(), dto.getIterationContainerId(), this.getCache(), CommonFileStore.class);
        this.setEngineeringModelSetup(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getEngineeringModelSetup(), dto.getIterationContainerId(), EngineeringModelSetup.class), SentinelThingProvider.getSentinel(EngineeringModelSetup.class)));
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getGenericNote(), dto.getGenericNote(), dto.getIterationContainerId(), this.getCache(), EngineeringModelDataNote.class);
        PojoThingFactory.resolveList(this.getIteration(), dto.getIteration(), dto.getIterationContainerId(), this.getCache(), Iteration.class);
        this.setLastModifiedOn(dto.getLastModifiedOn());
        PojoThingFactory.resolveList(this.getLogEntry(), dto.getLogEntry(), dto.getIterationContainerId(), this.getCache(), ModelLogEntry.class);
        PojoThingFactory.resolveList(this.getModellingAnnotation(), dto.getModellingAnnotation(), dto.getIterationContainerId(), this.getCache(), ModellingAnnotationItem.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link EngineeringModel}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.EngineeringModel dto = new cdp4common.dto.EngineeringModel(this.getIid(), this.getRevisionNumber());

        dto.getBook().addAll(this.getBook().toDtoOrderedItemList());
        dto.getCommonFileStore().addAll(this.getCommonFileStore().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setEngineeringModelSetup(this.getEngineeringModelSetup() != null ? this.getEngineeringModelSetup().getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getGenericNote().addAll(this.getGenericNote().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getIteration().addAll(this.getIteration().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setLastModifiedOn(this.getLastModifiedOn());
        dto.getLogEntry().addAll(this.getLogEntry().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getModellingAnnotation().addAll(this.getModellingAnnotation().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the active {@link Participant}
     *
     * @param person The {@link Person} who is logged
     * @return The active {@link Participant}
     * @throws NoSuchElementException if a unique Participant is not found
     * @throws NullPointerException if supplied {@code person} is {@code null}
     */
    public Participant getActiveParticipant(Person person) {
        if (person == null) {
            throw new NullPointerException("person");
        }

        return Iterables.getOnlyElement(this.getEngineeringModelSetup().getParticipant().stream().filter(x -> x.getPerson().equals(person)).collect(Collectors.toList()));
    }

    /**
     * Gets the required {@link ReferenceDataLibrary}
     */
    @Override
    public List<ReferenceDataLibrary> getRequiredRdls() {
        List<ReferenceDataLibrary> rdls = new ArrayList<>();
        ReferenceDataLibrary mrdl = this.getEngineeringModelSetup().getRequiredRdl().stream().findFirst().orElse(null);
        if (mrdl != null) {
            rdls.add(mrdl);
            rdls.addAll(mrdl.getRequiredRdls());
        }

        return rdls;
    }
}
