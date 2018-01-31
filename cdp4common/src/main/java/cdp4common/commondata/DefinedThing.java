/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDefinedThing.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * abstract specialization of Thing for all classes that need a human readable definition, i.e. a name and a short name, and optionally explicit textual definitions, aliases and hyperlinks
 */
@ToString
@EqualsAndHashCode
public  abstract class DefinedThing extends Thing implements NamedThing, ShortNamedThing {
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
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected DefinedThing(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
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
    private ContainerList<Alias> alias;

    /**
     * List of contained Definition.
     * textual definition in a given natural language
     * Note: At most one definition shall be given per natural language.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Definition> definition;

    /**
     * List of contained HyperLink.
     * representation of a URI and a descriptive text that convey relevant information about this DefinedThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<HyperLink> hyperLink;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String name;

    /**
     * Property shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String shortName;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DefinedThing}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained Alias.
     * alternative human-readable character string for the <i>name</i> of this DefinedThing
     * Note: An alias may be a translation of <i>name</i> in another natural language than British English (the default language code "en-GB") or an alternative or synonym in any natural language.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Alias> getAlias(){
         return this.alias;
    }

    /**
     * Gets a list of contained Definition.
     * textual definition in a given natural language
     * Note: At most one definition shall be given per natural language.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Definition> getDefinition(){
         return this.definition;
    }

    /**
     * Gets a list of contained HyperLink.
     * representation of a URI and a descriptive text that convey relevant information about this DefinedThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<HyperLink> getHyperLink(){
         return this.hyperLink;
    }

    /**
     * Gets the name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getName(){
         return this.name;
    }

    /**
     * Gets the shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getShortName(){
         return this.shortName;
    }

    /**
     * Sets a list of contained Alias.
     * alternative human-readable character string for the <i>name</i> of this DefinedThing
     * Note: An alias may be a translation of <i>name</i> in another natural language than British English (the default language code "en-GB") or an alternative or synonym in any natural language.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setAlias(ContainerList<Alias> alias){
        this.alias = alias;
    }

    /**
     * Sets a list of contained Definition.
     * textual definition in a given natural language
     * Note: At most one definition shall be given per natural language.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDefinition(ContainerList<Definition> definition){
        this.definition = definition;
    }

    /**
     * Sets a list of contained HyperLink.
     * representation of a URI and a descriptive text that convey relevant information about this DefinedThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setHyperLink(ContainerList<HyperLink> hyperLink){
        this.hyperLink = hyperLink;
    }

    /**
     * Sets the name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setShortName(String shortName){
        this.shortName = shortName;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link DefinedThing}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
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
    public DefinedThing clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DefinedThing)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DefinedThing}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getName().trim().isEmpty()) {
            errorList.add("The property name is null or empty.");
        }

        if (this.getShortName().trim().isEmpty()) {
            errorList.add("The property shortName is null or empty.");
        }

        return errorList;
    }
}
