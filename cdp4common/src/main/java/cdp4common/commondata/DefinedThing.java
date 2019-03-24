/* --------------------------------------------------------------------------------------------------------------------
 * DefinedThing.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

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
 * abstract specialization of Thing for all classes that need a human readable definition, i.e. a name and a short name, and optionally explicit textual definitions, aliases and hyperlinks
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class DefinedThing extends Thing implements Cloneable, NamedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link DefinedThing} class.
     */
    protected DefinedThing() {
        this.alias = new ContainerList<Alias>(this);
        this.definition = new ContainerList<Definition>(this);
        this.hyperLink = new ContainerList<HyperLink>(this);
    }

    /**
     * Initializes a new instance of the {@link DefinedThing} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected DefinedThing(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.alias = new ContainerList<Alias>(this);
        this.definition = new ContainerList<Definition>(this);
        this.hyperLink = new ContainerList<HyperLink>(this);
    }

    /**
     * List of contained Alias.
     * alternative human-readable character string for the <i>name</i> of this DefinedThing
     * Note: An alias may be a translation of <i>name</i> in another natural language than British English (the default language code "en-GB") or an alternative or synonym in any natural language.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Alias> alias;

    /**
     * List of contained Definition.
     * textual definition in a given natural language
     * Note: At most one definition shall be given per natural language.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Definition> definition;

    /**
     * List of contained HyperLink.
     * representation of a URI and a descriptive text that convey relevant information about this DefinedThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<HyperLink> hyperLink;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String name;

    /**
     * Property shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String shortName;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DefinedThing}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link DefinedThing}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.alias);
        containers.add(this.definition);
        containers.add(this.hyperLink);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link DefinedThing} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DefinedThing}.
     */
    @Override
    public DefinedThing clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DefinedThing)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DefinedThing}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getName())) {
            errorList.add("The property name is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getShortName())) {
            errorList.add("The property shortName is null or empty.");
        }

        return errorList;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the {@link #name}
     */
    @Override
    public String getUserFriendlyName() {
        return this.getName();
    }

    /**
     * Gets the {@link #shortName}
     */
    @Override
    public String getUserFriendlyShortName() {
        return this.getShortName();
    }
}
