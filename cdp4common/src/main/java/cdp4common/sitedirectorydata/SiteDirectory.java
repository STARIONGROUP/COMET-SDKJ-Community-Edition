/* --------------------------------------------------------------------------------------------------------------------
 * SiteDirectory.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
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
 * resource directory that contains (references to) the data that is used
 * across all models, templates, catalogues and reference data for a
 * specific concurrent design centre
 * Note: Typically one concurrent design centre will deploy a single
 * instance of a  SiteDirectory which is then a
 * central administrative resource.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class SiteDirectory extends TopContainer implements Cloneable, NamedThing, ShortNamedThing, TimeStampedThing {
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
     * Initializes a new instance of the {@link SiteDirectory} class.
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
     * Initializes a new instance of the {@link SiteDirectory} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SiteDirectory(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
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
    @Getter
    @Setter
    private ContainerList<SiteDirectoryDataAnnotation> annotation;

    /**
     * Property createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private LocalDateTime createdOn;

    /**
     * Property defaultParticipantRole.
     * specification of the default ParticipantRole to be used when creating a new Participant in an EngineeringModelSetup
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParticipantRole defaultParticipantRole;

    /**
     * Property defaultPersonRole.
     * specification of the default PersonRole to be used when creating a new Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private PersonRole defaultPersonRole;

    /**
     * List of contained DomainOfExpertise.
     * collection of domains of expertise (DomainOfExpertise) known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<DomainOfExpertise> domain;

    /**
     * List of contained DomainOfExpertiseGroup.
     * collection of DomainOfExpertiseGroups defined for this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<DomainOfExpertiseGroup> domainGroup;

    /**
     * List of contained SiteLogEntry.
     * collection of logbook entries (SiteLogEntry) for this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<SiteLogEntry> logEntry;

    /**
     * List of contained EngineeringModelSetup.
     * specification of the engineering models (EngineeringModelSetups) defined in this SiteDirectory
     * Note: In an implementation of SiteDirectory it may be useful - for performance reasons - to add a cache that contains consolidated information from a collection of models, e.g. the participants with their roles and domains in various concurrent engineering studies.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<EngineeringModelSetup> model;

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
     * List of contained NaturalLanguage.
     * collection of NaturalLanguages known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<NaturalLanguage> naturalLanguage;

    /**
     * List of contained Organization.
     * specification of the Organizations known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Organization> organization;

    /**
     * List of contained ParticipantRole.
     * collection of ParticipantRoles defined in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ParticipantRole> participantRole;

    /**
     * List of contained Person.
     * specification of the Persons known in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Person> person;

    /**
     * List of contained PersonRole.
     * collection of PersonRoles defined in this SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<PersonRole> personRole;

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
     * List of contained SiteReferenceDataLibrary.
     * specification of the ReferenceDataLibraries defined in this     SiteDirectory
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<SiteReferenceDataLibrary> siteReferenceDataLibrary;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link SiteDirectory}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link SiteDirectory}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.annotation);
        containers.add(this.domain);
        containers.add(this.domainGroup);
        containers.add(this.logEntry);
        containers.add(this.model);
        containers.add(this.naturalLanguage);
        containers.add(this.organization);
        containers.add(this.participantRole);
        containers.add(this.person);
        containers.add(this.personRole);
        containers.add(this.siteReferenceDataLibrary);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link SiteDirectory} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SiteDirectory}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        SiteDirectory clone;
        try {
            clone = (SiteDirectory)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow SiteDirectory cannot be cloned.");
        }

        clone.setAnnotation(cloneContainedThings ? new ContainerList<SiteDirectoryDataAnnotation>(clone) : new ContainerList<SiteDirectoryDataAnnotation>(this.getAnnotation(), clone, false));
        clone.setDomain(cloneContainedThings ? new ContainerList<DomainOfExpertise>(clone) : new ContainerList<DomainOfExpertise>(this.getDomain(), clone, false));
        clone.setDomainGroup(cloneContainedThings ? new ContainerList<DomainOfExpertiseGroup>(clone) : new ContainerList<DomainOfExpertiseGroup>(this.getDomainGroup(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setLogEntry(cloneContainedThings ? new ContainerList<SiteLogEntry>(clone) : new ContainerList<SiteLogEntry>(this.getLogEntry(), clone, false));
        clone.setModel(cloneContainedThings ? new ContainerList<EngineeringModelSetup>(clone) : new ContainerList<EngineeringModelSetup>(this.getModel(), clone, false));
        clone.setNaturalLanguage(cloneContainedThings ? new ContainerList<NaturalLanguage>(clone) : new ContainerList<NaturalLanguage>(this.getNaturalLanguage(), clone, false));
        clone.setOrganization(cloneContainedThings ? new ContainerList<Organization>(clone) : new ContainerList<Organization>(this.getOrganization(), clone, false));
        clone.setParticipantRole(cloneContainedThings ? new ContainerList<ParticipantRole>(clone) : new ContainerList<ParticipantRole>(this.getParticipantRole(), clone, false));
        clone.setPerson(cloneContainedThings ? new ContainerList<Person>(clone) : new ContainerList<Person>(this.getPerson(), clone, false));
        clone.setPersonRole(cloneContainedThings ? new ContainerList<PersonRole>(clone) : new ContainerList<PersonRole>(this.getPersonRole(), clone, false));
        clone.setSiteReferenceDataLibrary(cloneContainedThings ? new ContainerList<SiteReferenceDataLibrary>(clone) : new ContainerList<SiteReferenceDataLibrary>(this.getSiteReferenceDataLibrary(), clone, false));

        if (cloneContainedThings) {
            clone.getAnnotation().addAll(this.getAnnotation().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDomain().addAll(this.getDomain().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDomainGroup().addAll(this.getDomainGroup().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getLogEntry().addAll(this.getLogEntry().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getModel().addAll(this.getModel().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getNaturalLanguage().addAll(this.getNaturalLanguage().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getOrganization().addAll(this.getOrganization().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getParticipantRole().addAll(this.getParticipantRole().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getPerson().addAll(this.getPerson().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getPersonRole().addAll(this.getPersonRole().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getSiteReferenceDataLibrary().addAll(this.getSiteReferenceDataLibrary().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link SiteDirectory} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SiteDirectory}.
     */
    @Override
    public SiteDirectory clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SiteDirectory)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this SiteDirectory}.
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

    /**
     * Resolve the properties of the current {@link SiteDirectory} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SiteDirectory dto = (cdp4common.dto.SiteDirectory)dtoThing;

        PojoThingFactory.resolveList(this.getAnnotation(), dto.getAnnotation(), dto.getIterationContainerId(), this.getCache(), SiteDirectoryDataAnnotation.class);
        this.setCreatedOn(dto.getCreatedOn());
        this.setDefaultParticipantRole((dto.getDefaultParticipantRole() != null) ? PojoThingFactory.get(this.getCache(), dto.getDefaultParticipantRole(), dto.getIterationContainerId(), ParticipantRole.class) : null);
        this.setDefaultPersonRole((dto.getDefaultPersonRole() != null) ? PojoThingFactory.get(this.getCache(), dto.getDefaultPersonRole(), dto.getIterationContainerId(), PersonRole.class) : null);
        PojoThingFactory.resolveList(this.getDomain(), dto.getDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getDomainGroup(), dto.getDomainGroup(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertiseGroup.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setLastModifiedOn(dto.getLastModifiedOn());
        PojoThingFactory.resolveList(this.getLogEntry(), dto.getLogEntry(), dto.getIterationContainerId(), this.getCache(), SiteLogEntry.class);
        PojoThingFactory.resolveList(this.getModel(), dto.getModel(), dto.getIterationContainerId(), this.getCache(), EngineeringModelSetup.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        PojoThingFactory.resolveList(this.getNaturalLanguage(), dto.getNaturalLanguage(), dto.getIterationContainerId(), this.getCache(), NaturalLanguage.class);
        PojoThingFactory.resolveList(this.getOrganization(), dto.getOrganization(), dto.getIterationContainerId(), this.getCache(), Organization.class);
        PojoThingFactory.resolveList(this.getParticipantRole(), dto.getParticipantRole(), dto.getIterationContainerId(), this.getCache(), ParticipantRole.class);
        PojoThingFactory.resolveList(this.getPerson(), dto.getPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getPersonRole(), dto.getPersonRole(), dto.getIterationContainerId(), this.getCache(), PersonRole.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        PojoThingFactory.resolveList(this.getSiteReferenceDataLibrary(), dto.getSiteReferenceDataLibrary(), dto.getIterationContainerId(), this.getCache(), SiteReferenceDataLibrary.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link SiteDirectory}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SiteDirectory dto = new cdp4common.dto.SiteDirectory(this.getIid(), this.getRevisionNumber());

        dto.getAnnotation().addAll(this.getAnnotation().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setCreatedOn(this.getCreatedOn());
        dto.setDefaultParticipantRole(this.getDefaultParticipantRole() != null ? (UUID)this.getDefaultParticipantRole().getIid() : null);
        dto.setDefaultPersonRole(this.getDefaultPersonRole() != null ? (UUID)this.getDefaultPersonRole().getIid() : null);
        dto.getDomain().addAll(this.getDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDomainGroup().addAll(this.getDomainGroup().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setLastModifiedOn(this.getLastModifiedOn());
        dto.getLogEntry().addAll(this.getLogEntry().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getModel().addAll(this.getModel().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getNaturalLanguage().addAll(this.getNaturalLanguage().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getOrganization().addAll(this.getOrganization().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getParticipantRole().addAll(this.getParticipantRole().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getPerson().addAll(this.getPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getPersonRole().addAll(this.getPersonRole().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.getSiteReferenceDataLibrary().addAll(this.getSiteReferenceDataLibrary().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the available {@link ReferenceDataLibrary} that are contained by the current {@link SiteDirectory} either
     * directly as {@link SiteReferenceDataLibrary} or as {@link ModelReferenceDataLibrary} through the
     * {@link EngineeringModelSetup} the {@link SiteDirectory} contains.
     *
     * @return an {@link List}
     */
    public List<ReferenceDataLibrary> getAvailableReferenceDataLibraries() {
        List<ReferenceDataLibrary> availableReferenceDataLibraries = new ArrayList<>();
        availableReferenceDataLibraries.addAll(this.getSiteReferenceDataLibrary());

        for (EngineeringModelSetup engineeringModelSetup : this.getModel()) {
            ReferenceDataLibrary rdl = Iterables.getOnlyElement(engineeringModelSetup.getRequiredRdl(), null);
            if (rdl != null) {
                availableReferenceDataLibraries.add(rdl);
            }
        }

        return availableReferenceDataLibraries;
    }
}
