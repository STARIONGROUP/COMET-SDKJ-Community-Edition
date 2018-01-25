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

/**
 * abstract specialization of Thing for all classes that need a human readable definition, i.e. a name and a short name, and optionally explicit textual definitions, aliases and hyperlinks
 */
public abstract class AbstractDefinedThing extends AbstractThing implements NamedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>DefinedThing<code/> class.
     *
     * @see DefinedThing
     */
    protected AbstractDefinedThing() {
        this.alias = new ContainerList<Alias>(this);
        this.definition = new ContainerList<Definition>(this);
        this.hyperLink = new ContainerList<HyperLink>(this);
    }

    /**
     * Initializes a new instance of the <code>DefinedThing<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see DefinedThing
     */
    protected AbstractDefinedThing(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>DefinedThing<code/>.
     *
     * @see Iterable
     * @see DefinedThing
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
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>DefinedThing<code/>.
     *
     * @see Iterable
     * @see DefinedThing
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.alias);
        containers.Add(this.definition);
        containers.Add(this.hyperLink);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>DefinedThing<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DefinedThing<code/>.
     * 
     * @see DefinedThing
     */
    @Override
    public DefinedThing clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DefinedThing)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DefinedThing<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DefinedThing
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.name.trim().isEmpty()) {
            errorList.add("The property name is null or empty.");
        }

        if (this.shortName.trim().isEmpty()) {
            errorList.add("The property shortName is null or empty.");
        }

        return errorList;
    }
}
