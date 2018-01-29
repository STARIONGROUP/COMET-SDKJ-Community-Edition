/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSiteDirectory.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * resource directory that contains (references to) the data that is used
 * across all models, templates, catalogues and reference data for a
 * specific concurrent design centre
 * Note: Typically one concurrent design centre will deploy a single
 * instance of a  SiteDirectory which is then a
 * central administrative resource.
 */
@ToString
@EqualsAndHashCode
public  class SiteDirectory extends TopContainer implements NamedThing, ShortNamedThing, TimeStampedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NONE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>SiteDirectory<code/> class.
     *
     * @see SiteDirectory
     */
    public SiteDirectory() {
        this.annotation = new ContainerList<SiteDirectoryDataAnnotation>(this);
        this.domain = new ContainerList<DomainOfExpertise>(this);
        this.domainGroup = new ContainerList<DomainOfExpertiseGroup>(this);
        this.logEntry = new ContainerList<SiteLogEntry>(this);
        this.model = new ContainerList<EngineeringModelSetup>(this);
        this.naturalLanguage = new ContainerList<NaturalLanguage>(this);
        this.organization = new ContainerList<Organization>(this);
        this.participantRole = new ContainerList<ParticipantRole>(this);
        this.person = new ContainerList<Person>(this);
        this.personRole = new ContainerList<PersonRole>(this);
        this.siteReferenceDataLibrary = new ContainerList<SiteReferenceDataLibrary>(this);
    }

    /**
     * Initializes a new instance of the <code>SiteDirectory<code/> class.
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
     * @see SiteDirectory
     */
    public SiteDirectory(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.annotation = new ContainerList<SiteDirectoryDataAnnotation>(this);
        this.domain = new ContainerList<DomainOfExpertise>(this);
        this.domainGroup = new ContainerList<DomainOfExpertiseGroup>(this);
        this.logEntry = new ContainerList<SiteLogEntry>(this);
        this.model = new ContainerList<EngineeringModelSetup>(this);
        this.naturalLanguage = new ContainerList<NaturalLanguage>(this);
        this.organization = new ContainerList<Organization>(this);
        this.participantRole = new ContainerList<ParticipantRole>(this);
        this.person = new ContainerList<Person>(this);
        this.personRole = new ContainerList<PersonRole>(this);
        this.siteReferenceDataLibrary = new ContainerList<SiteReferenceDataLibrary>(this);
    }

    /**
     * List of contained SiteDirectoryDataAnnotation.
     * Annotation on Things that are contained by the SiteDirectory
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<SiteDirectoryDataAnnotation> annotation;

    /**
     * Property createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private LocalDateTime createdOn;

    /**
     * Property defaultParticipantRole.
     * specification of the default ParticipantRole to be used when creating a new Participant in an EngineeringModelSetup
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParticipantRole defaultParticipantRole;

    /**
     * Property defaultPersonRole.
     * specification of the default PersonRole to be used when creating a new Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private PersonRole defaultPersonRole;

    /**
     * List of contained DomainOfExpertise.
     * collection of domains of expertise (DomainOfExpertise) known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<DomainOfExpertise> domain;

    /**
     * List of contained DomainOfExpertiseGroup.
     * collection of DomainOfExpertiseGroups defined for this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<DomainOfExpertiseGroup> domainGroup;

    /**
     * List of contained SiteLogEntry.
     * collection of logbook entries (SiteLogEntry) for this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<SiteLogEntry> logEntry;

    /**
     * List of contained EngineeringModelSetup.
     * specification of the engineering models (EngineeringModelSetups) defined in this SiteDirectory
     * Note: In an implementation of SiteDirectory it may be useful - for performance reasons - to add a cache that contains consolidated information from a collection of models, e.g. the participants with their roles and domains in various concurrent engineering studies.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<EngineeringModelSetup> model;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String name;

    /**
     * List of contained NaturalLanguage.
     * collection of NaturalLanguages known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<NaturalLanguage> naturalLanguage;

    /**
     * List of contained Organization.
     * specification of the Organizations known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Organization> organization;

    /**
     * List of contained ParticipantRole.
     * collection of ParticipantRoles defined in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParticipantRole> participantRole;

    /**
     * List of contained Person.
     * specification of the Persons known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Person> person;

    /**
     * List of contained PersonRole.
     * collection of PersonRoles defined in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<PersonRole> personRole;

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
     * List of contained SiteReferenceDataLibrary.
     * specification of the ReferenceDataLibraries defined in this     SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<SiteReferenceDataLibrary> siteReferenceDataLibrary;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>SiteDirectory<code/>.
     *
     * @see Iterable
     * @see SiteDirectory
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained SiteDirectoryDataAnnotation.
     * Annotation on Things that are contained by the SiteDirectory
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<SiteDirectoryDataAnnotation> getAnnotation(){
         return this.annotation;
    }

    /**
     * Gets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public LocalDateTime getCreatedOn(){
         return this.createdOn;
    }

    /**
     * Gets the defaultParticipantRole.
     * specification of the default ParticipantRole to be used when creating a new Participant in an EngineeringModelSetup
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParticipantRole getDefaultParticipantRole(){
         return this.defaultParticipantRole;
    }

    /**
     * Gets the defaultPersonRole.
     * specification of the default PersonRole to be used when creating a new Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public PersonRole getDefaultPersonRole(){
         return this.defaultPersonRole;
    }

    /**
     * Gets a list of contained DomainOfExpertise.
     * collection of domains of expertise (DomainOfExpertise) known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<DomainOfExpertise> getDomain(){
         return this.domain;
    }

    /**
     * Gets a list of contained DomainOfExpertiseGroup.
     * collection of DomainOfExpertiseGroups defined for this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<DomainOfExpertiseGroup> getDomainGroup(){
         return this.domainGroup;
    }

    /**
     * Gets a list of contained SiteLogEntry.
     * collection of logbook entries (SiteLogEntry) for this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<SiteLogEntry> getLogEntry(){
         return this.logEntry;
    }

    /**
     * Gets a list of contained EngineeringModelSetup.
     * specification of the engineering models (EngineeringModelSetups) defined in this SiteDirectory
     * Note: In an implementation of SiteDirectory it may be useful - for performance reasons - to add a cache that contains consolidated information from a collection of models, e.g. the participants with their roles and domains in various concurrent engineering studies.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<EngineeringModelSetup> getModel(){
         return this.model;
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
     * Gets a list of contained NaturalLanguage.
     * collection of NaturalLanguages known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<NaturalLanguage> getNaturalLanguage(){
         return this.naturalLanguage;
    }

    /**
     * Gets a list of contained Organization.
     * specification of the Organizations known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Organization> getOrganization(){
         return this.organization;
    }

    /**
     * Gets a list of contained ParticipantRole.
     * collection of ParticipantRoles defined in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ParticipantRole> getParticipantRole(){
         return this.participantRole;
    }

    /**
     * Gets a list of contained Person.
     * specification of the Persons known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Person> getPerson(){
         return this.person;
    }

    /**
     * Gets a list of contained PersonRole.
     * collection of PersonRoles defined in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<PersonRole> getPersonRole(){
         return this.personRole;
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
     * Gets a list of contained SiteReferenceDataLibrary.
     * specification of the ReferenceDataLibraries defined in this     SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<SiteReferenceDataLibrary> getSiteReferenceDataLibrary(){
         return this.siteReferenceDataLibrary;
    }

    /**
     * Sets a list of contained SiteDirectoryDataAnnotation.
     * Annotation on Things that are contained by the SiteDirectory
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setAnnotation(ContainerList<SiteDirectoryDataAnnotation> annotation){
        this.annotation = annotation;
    }

    /**
     * Sets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCreatedOn(LocalDateTime createdOn){
        this.createdOn = createdOn;
    }

    /**
     * Sets the defaultParticipantRole.
     * specification of the default ParticipantRole to be used when creating a new Participant in an EngineeringModelSetup
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDefaultParticipantRole(ParticipantRole defaultParticipantRole){
        this.defaultParticipantRole = defaultParticipantRole;
    }

    /**
     * Sets the defaultPersonRole.
     * specification of the default PersonRole to be used when creating a new Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDefaultPersonRole(PersonRole defaultPersonRole){
        this.defaultPersonRole = defaultPersonRole;
    }

    /**
     * Sets a list of contained DomainOfExpertise.
     * collection of domains of expertise (DomainOfExpertise) known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDomain(ContainerList<DomainOfExpertise> domain){
        this.domain = domain;
    }

    /**
     * Sets a list of contained DomainOfExpertiseGroup.
     * collection of DomainOfExpertiseGroups defined for this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDomainGroup(ContainerList<DomainOfExpertiseGroup> domainGroup){
        this.domainGroup = domainGroup;
    }

    /**
     * Sets a list of contained SiteLogEntry.
     * collection of logbook entries (SiteLogEntry) for this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setLogEntry(ContainerList<SiteLogEntry> logEntry){
        this.logEntry = logEntry;
    }

    /**
     * Sets a list of contained EngineeringModelSetup.
     * specification of the engineering models (EngineeringModelSetups) defined in this SiteDirectory
     * Note: In an implementation of SiteDirectory it may be useful - for performance reasons - to add a cache that contains consolidated information from a collection of models, e.g. the participants with their roles and domains in various concurrent engineering studies.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setModel(ContainerList<EngineeringModelSetup> model){
        this.model = model;
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
     * Sets a list of contained NaturalLanguage.
     * collection of NaturalLanguages known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setNaturalLanguage(ContainerList<NaturalLanguage> naturalLanguage){
        this.naturalLanguage = naturalLanguage;
    }

    /**
     * Sets a list of contained Organization.
     * specification of the Organizations known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setOrganization(ContainerList<Organization> organization){
        this.organization = organization;
    }

    /**
     * Sets a list of contained ParticipantRole.
     * collection of ParticipantRoles defined in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParticipantRole(ContainerList<ParticipantRole> participantRole){
        this.participantRole = participantRole;
    }

    /**
     * Sets a list of contained Person.
     * specification of the Persons known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setPerson(ContainerList<Person> person){
        this.person = person;
    }

    /**
     * Sets a list of contained PersonRole.
     * collection of PersonRoles defined in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setPersonRole(ContainerList<PersonRole> personRole){
        this.personRole = personRole;
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
     * Sets a list of contained SiteReferenceDataLibrary.
     * specification of the ReferenceDataLibraries defined in this     SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setSiteReferenceDataLibrary(ContainerList<SiteReferenceDataLibrary> siteReferenceDataLibrary){
        this.siteReferenceDataLibrary = siteReferenceDataLibrary;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>SiteDirectory<code/>.
     *
     * @see Iterable
     * @see SiteDirectory
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.annotation);
        containers.Add(this.domain);
        containers.Add(this.domainGroup);
        containers.Add(this.logEntry);
        containers.Add(this.model);
        containers.Add(this.naturalLanguage);
        containers.Add(this.organization);
        containers.Add(this.participantRole);
        containers.Add(this.person);
        containers.Add(this.personRole);
        containers.Add(this.siteReferenceDataLibrary);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>SiteDirectory<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SiteDirectory<code/>.
     *
     * @see SiteDirectory
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        SiteDirectory clone = (SiteDirectory)this.clone();
        clone.setAnnotation(cloneContainedThings ? new ContainerList<SiteDirectoryDataAnnotation>(clone) : new ContainerList<SiteDirectoryDataAnnotation>(this.getAnnotation(), clone));
        clone.setDomain(cloneContainedThings ? new ContainerList<DomainOfExpertise>(clone) : new ContainerList<DomainOfExpertise>(this.getDomain(), clone));
        clone.setDomainGroup(cloneContainedThings ? new ContainerList<DomainOfExpertiseGroup>(clone) : new ContainerList<DomainOfExpertiseGroup>(this.getDomainGroup(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setLogEntry(cloneContainedThings ? new ContainerList<SiteLogEntry>(clone) : new ContainerList<SiteLogEntry>(this.getLogEntry(), clone));
        clone.setModel(cloneContainedThings ? new ContainerList<EngineeringModelSetup>(clone) : new ContainerList<EngineeringModelSetup>(this.getModel(), clone));
        clone.setNaturalLanguage(cloneContainedThings ? new ContainerList<NaturalLanguage>(clone) : new ContainerList<NaturalLanguage>(this.getNaturalLanguage(), clone));
        clone.setOrganization(cloneContainedThings ? new ContainerList<Organization>(clone) : new ContainerList<Organization>(this.getOrganization(), clone));
        clone.setParticipantRole(cloneContainedThings ? new ContainerList<ParticipantRole>(clone) : new ContainerList<ParticipantRole>(this.getParticipantRole(), clone));
        clone.setPerson(cloneContainedThings ? new ContainerList<Person>(clone) : new ContainerList<Person>(this.getPerson(), clone));
        clone.setPersonRole(cloneContainedThings ? new ContainerList<PersonRole>(clone) : new ContainerList<PersonRole>(this.getPersonRole(), clone));
        clone.setSiteReferenceDataLibrary(cloneContainedThings ? new ContainerList<SiteReferenceDataLibrary>(clone) : new ContainerList<SiteReferenceDataLibrary>(this.getSiteReferenceDataLibrary(), clone));

        if (cloneContainedThings) {
            clone.getAnnotation().addAll(this.getAnnotation().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDomain().addAll(this.getDomain().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDomainGroup().addAll(this.getDomainGroup().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getLogEntry().addAll(this.getLogEntry().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getModel().addAll(this.getModel().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getNaturalLanguage().addAll(this.getNaturalLanguage().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getOrganization().addAll(this.getOrganization().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParticipantRole().addAll(this.getParticipantRole().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getPerson().addAll(this.getPerson().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getPersonRole().addAll(this.getPersonRole().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getSiteReferenceDataLibrary().addAll(this.getSiteReferenceDataLibrary().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>SiteDirectory<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SiteDirectory<code/>.
     * 
     * @see SiteDirectory
     */
    @Override
    public SiteDirectory clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SiteDirectory)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SiteDirectory<code/>.
     *
     * @return A list of potential errors.
     *
     * @see SiteDirectory
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getName().trim().isEmpty()) {
            errorList.add("The property name is null or empty.");
        }

        if (this.getShortName().trim().isEmpty()) {
            errorList.add("The property shortName is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>SiteDirectory<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see SiteDirectory
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SiteDirectory dto = (cdp4common.dto.SiteDirectory)dtoThing;

        this.annotation.resolveList(dto.getAnnotation(), dto.getIterationContainerId(), this.getCache());
        this.setCreatedOn(dto.getCreatedOn());
        this.setDefaultParticipantRole((dto.getDefaultParticipantRole() != null) ? this.getCache().get<ParticipantRole>(dto.getDefaultParticipantRole.getValue(), dto.getIterationContainerId()) : null);
        this.setDefaultPersonRole((dto.getDefaultPersonRole() != null) ? this.getCache().get<PersonRole>(dto.getDefaultPersonRole.getValue(), dto.getIterationContainerId()) : null);
        this.domain.resolveList(dto.getDomain(), dto.getIterationContainerId(), this.getCache());
        this.domainGroup.resolveList(dto.getDomainGroup(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setLastModifiedOn(dto.getLastModifiedOn());
        this.logEntry.resolveList(dto.getLogEntry(), dto.getIterationContainerId(), this.getCache());
        this.model.resolveList(dto.getModel(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.naturalLanguage.resolveList(dto.getNaturalLanguage(), dto.getIterationContainerId(), this.getCache());
        this.organization.resolveList(dto.getOrganization(), dto.getIterationContainerId(), this.getCache());
        this.participantRole.resolveList(dto.getParticipantRole(), dto.getIterationContainerId(), this.getCache());
        this.person.resolveList(dto.getPerson(), dto.getIterationContainerId(), this.getCache());
        this.personRole.resolveList(dto.getPersonRole(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.siteReferenceDataLibrary.resolveList(dto.getSiteReferenceDataLibrary(), dto.getIterationContainerId(), this.getCache());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>SiteDirectory<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see SiteDirectory
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SiteDirectory dto = new cdp4common.dto.SiteDirectory(this.getIid(), this.getRevisionNumber());

        dto.getAnnotation().add(this.getAnnotation().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setCreatedOn(this.getCreatedOn());
        dto.setDefaultParticipantRole(this.getDefaultParticipantRole() != null ? (UUID)this.getDefaultParticipantRole().getIid() : null);
        dto.setDefaultPersonRole(this.getDefaultPersonRole() != null ? (UUID)this.getDefaultPersonRole().getIid() : null);
        dto.getDomain().add(this.getDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDomainGroup().add(this.getDomainGroup().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setLastModifiedOn(this.getLastModifiedOn());
        dto.getLogEntry().add(this.getLogEntry().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getModel().add(this.getModel().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getNaturalLanguage().add(this.getNaturalLanguage().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getOrganization().add(this.getOrganization().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getParticipantRole().add(this.getParticipantRole().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getPerson().add(this.getPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getPersonRole().add(this.getPersonRole().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.getSiteReferenceDataLibrary().add(this.getSiteReferenceDataLibrary().stream().map(x -> x.getIid()).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
