/*
 * Thing.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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
 */

package cdp4common.commondata;

import cdp4common.*;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Relationship;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.Action;
import cdp4common.helpers.Utils;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.collect.ImmutableList;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.tuple.Pair;

import java.lang.annotation.Annotation;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;

/**
 * Top level abstract superclass from which all domain concept classes in the model inherit.
 * Note: In comparison with Thing C# implementation the following properties and methods were abandoned due
 * to the language specifics:
 * - public T GetContainerOfType<T>()
 * - public virtual string UserFriendlyName{}
 * - public virtual string UserFriendlyShortName{}
 */
@ToString
public abstract class Thing implements AutoCloseable, Cloneable {
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
     * Backing field for {@link #cacheId} property.
     */
    private CacheKey cacheKey;

    /**
     * A value indicating whether the instance is disposed
     */
    private boolean isDisposed;

    /**
     * The {@link ArrayList} of validation error messages
     */
    private final ArrayList<String> validationErrorList = new ArrayList<>();

    /**
     * The {@link Map} that contains reset method for properties that were replaced by sentinels
     */
    protected Map<String, Action> sentinelResetMap = new HashMap<>();

    /**
     * Gets the revisions of the current {@link Thing} that have been returned by the data-source of the {@link Thing}
     * during it's lifetime. This may the complete history, but may be partial history as well.
     */
    @Getter
    private final Map<Integer, Thing> revisions = new HashMap<>();

    /**
     * Initializes a new instance of the {@link Thing} class.
     */
    protected Thing() {
        this.classKind = this.computeCurrentClassKind();
        this.excludedDomain = new ArrayList<>();
        this.excludedPerson = new ArrayList<>();
        this.relationships = new ArrayList<>();
    }

    /**
     * Initializes a new instance of the {@link Thing} class.
     *
     * @param iid     The unique identifier.
     * @param cache   The {@link Cache} where the current thing is stored.
     *                The {@link Pair} of {@link UUID} and {@link UUID} is the key used to store this thing. The key is a
     *                combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected Thing(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        this.iid = iid;
        this.iDalUri = iDalUri;
        this.cache = cache;
        this.classKind = this.computeCurrentClassKind();
        this.excludedDomain = new ArrayList<>();
        this.excludedPerson = new ArrayList<>();
        this.relationships = new ArrayList<>();
    }

    /**
     * Gets a value indicating whether the current {@link Thing} is referenced by a {@link Relationship}
     */
    public boolean hasRelationship() {
        return this.relationships.size() > 0;
    }

    /**
     * Gets the list of relationship that references the current {@link Thing}
     */
    public ImmutableList<Relationship> queryRelationships() {
        return new ImmutableList.Builder<Relationship>().addAll(this.relationships).build();
    }

    /**
     * Gets the list of relationship that references the current {@link Thing}
     */
    @Getter
    protected List<Relationship> relationships;

    /**
     * Assertion of the classKind of this Thing, denoting its actual class
     * Note: Typically this is used internally by the implementing software to improve classification of instances
     * and optimise performance when moving data between different programming environments.
     * In an object-oriented software engineering environment that supports reflection such information
     * would be redundant.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false)
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private ClassKind classKind;

    /**
     * A list of DomainOfExpertise.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false)
    @Getter
    @Setter
    private ArrayList<DomainOfExpertise> excludedDomain;

    /**
     * A list of Persons.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false)
    @Getter
    @Setter
    private ArrayList<Person> excludedPerson;

    /**
     * The Universally Unique Identifier ({@link UUID}) that uniquely identifies an instance of Thing
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false)
    @Getter
    @Setter
    private UUID iid;

    /**
     * Gets or sets the ModifiedOn.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false)
    @Getter
    @Setter
    private LocalDateTime modifiedOn;

    /**
     * Revision number of this Thing
     * Note: In this data model a revision numbering approach similar to Subversion is used,
     * see <a href="http://svnbook.red-bean.com/en/1.7/svn-book.html#svn.basic">http://svnbook.red-bean.com/en/1.7/svn-book.html#svn.basic</a>.
     * Therefore the revision number is actually a change set number. At any time that an update to a Thing is made
     * and committed to a persistent data store, the <i>revisionNumber</i> of its TopContainer is incremented by one,
     * and then the <i>revisionNumber</i> of the updated Thing is set to the new TopContainer's <i>revisionNumber</i>.
     * See also TopContainer. When a Thing is first created (in a client application) its <i>revisionNumber</i> is set
     * to zero, implying it has not yet been persisted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false)
    @Getter
    @Setter
    private int revisionNumber;

    /**
     * The data-source's {@link URI} this {@link Thing} comes from
     */
    @Getter
    @Setter
    private URI iDalUri;

    /**
     * Cache that contains the current {@link Thing}
     */
    @Getter
    @Setter
    private Cache<CacheKey, Thing> cache;

    /**
     * The Container of the current Thing
     */
    @Getter
    @Setter
    private Thing container;

    /**
     * The original {@link Thing} form which the current {@link Thing} has been cloned.
     * If the {@link Thing} is not a clone, this property returns null.
     */
    @Getter
    @Setter
    private Thing original;

    /**
     * Get the user-friendly name for this {@link Thing}
     */
    public String getUserFriendlyName() {
        return "User-friendly name not implemented.";
    }

    /**
     * Get the user-friendly name for this {@link Thing}
     */
    public String getUserFriendlyShortName() {
        return "User-friendly short-name not implemented.";
    }

    /**
     * The key with which the current {@link Thing} is stored in the cache
     */
    private Pair<UUID, UUID> cacheId;

    /**
     * Gets the key with which the current {@link Thing} is stored in the cache
     */
    public CacheKey getCacheKey() {
        if (this.cacheKey != null && !this.cacheKey.getThing().equals(new UUID(0L, 0L))) {
            return this.cacheKey;
        }

        Iteration iterationContainer = this.getContainerOfType(Iteration.class);
        UUID iterationId = null;
        if (iterationContainer != null && this.classKind != ClassKind.ITERATION) {
            iterationId = iterationContainer.getIid();
        }

        this.cacheKey = new CacheKey(this.getIid(), iterationId);
        return this.cacheKey;
    }

    /**
     * Gets a value indicating whether this {@link Thing} has sentinel instances
     */
    public boolean hasSentinelInstances() {
        return this.sentinelResetMap.size() > 0;
    }

    /**
     * The Route of the current {@link Thing}.
     */
    private String route;

    /**
     * Gets the Route of the current {@link Thing}.
     * The route is determined using the containment tree of the current {@link Thing}
     *
     * @throws ContainmentException when the containment tree is broken due to the fact that the Container has not
     *                              been set on one of the {@link Thing} classes in the containment tree.
     */
    public String getRoute() {
        Class currentClass = this.getClass();
        String className = currentClass.getSimpleName();

        if (this instanceof TopContainer) {
            if (className.equals("SiteDirectory") && (this.getIid() == null || this.getIid().equals(new UUID(0L, 0L)))) {
                return "/SiteDirectory/*";
            }

            return String.format("/%1$s/%2$s", className, this.getIid() != null ? this.getIid() : new UUID(0L, 0L));
        }

        if (this instanceof NotThing) {
            return "No thing, no route";
        }

        Thing container = this.container;

        if (container == null) {
            throw new ContainmentException(String.format("The container of %1$s with iid %2$s is null, the route cannot be computed.", className, this.getIid()));
        }

        String containerPropertyName;
        Annotation containerAnnotation = currentClass.getDeclaredAnnotation(Container.class);
        if (containerAnnotation != null) {
            containerPropertyName = ((Container) containerAnnotation).propertyName();
        } else {
            containerPropertyName = Character.toLowerCase(className.charAt(0)) + className.substring(1);
        }

        String containerRoute = container.getRoute();

        return String.format("%1$s/%2$s/%3$s", containerRoute, containerPropertyName, this.getIid() != null ? this.getIid() : new UUID(0L, 0L));
    }

    /**
     * Queries all the contained {@link Thing}s of the current {@link Thing} along the
     * complete containment hierarchy and returns them as a flat list. The current {@link Thing}
     * is included as well
     *
     * @return {@link List<Thing>}
     */
    public List<Thing> queryContainedThingsDeep() {
        List<Thing> temp = new ArrayList<>();
        temp.add(this);

        for (Iterable<Thing> containerList : this.getContainerLists()) {
            for (Thing thing : containerList) {
                List<Thing> containedThings = thing.queryContainedThingsDeep();
                temp.addAll(containedThings);
            }
        }

        return temp;
    }

    /**
     * The Change status of this {@link Thing}.
     */
    @Getter
    @Setter
    private ChangeKind changeKind;

    /**
     * The {@link TopContainer} of the current {@link Thing}
     */
    private TopContainer topContainer;

    /**
     * Gets the {@link TopContainer} of the current {@link Thing}
     * If the current {@link Thing} is a top-container, the {@link Thing} itself will be returned.
     *
     * @throws ContainmentException when a top container cannot be computed.
     */
    public TopContainer getTopContainer() {
        if (this instanceof NotThing) {
            return null;
        }

        if (this instanceof TopContainer) {
            return (TopContainer) this;
        }

        Thing container = this.getContainer();
        if (container == null) {
            String className = this.getClass().getName();
            throw new ContainmentException(String.format("The container of %1$s with iid %2$s is null, the TopContainer cannot be computed.", className, this.getIid()));
        }

        if (container instanceof TopContainer) {
            return (TopContainer) container;
        }

        return container.getTopContainer();
    }

    /**
     * Get an {@link Collection<ReferenceDataLibrary>} that contains the required {@link ReferenceDataLibrary} for the current {@link Thing}
     */
    public Collection<ReferenceDataLibrary> getRequiredRdls() {
        return new HashSet<>();
    }

    /**
     * A {@link Collection<String>} listing all the potential errors on this {@link Thing}
     */
    private Collection<String> validationErrors;

    /**
     * Gets a {@link Collection<String>} listing all the potential errors on this {@link Thing}
     */
    public Collection<String> getValidationErrors() {
        return this.validationErrorList;
    }

    /**
     * Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources.
     */
    public void close() {
        this.close(true);
    }

    /**
     * Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources.
     *
     * @param disposing A value indicating whether the class is being disposed of.
     */
    protected void close(boolean disposing) {
        if (!this.isDisposed) {
            if (disposing) {
                // Clear all property values that maybe have been set
                // when the class was instantiated
                this.setCache(null);
                this.revisions.clear();
            }

            // Indicate that the instance has been disposed.
            this.isDisposed = true;
        }
    }

    /**
     * Creates and returns a copy of this {@link Thing} for edit purpose
     *
     * @param cloneContainedThings Indicates whether the contained {@link Thing} should be cloned or not.
     * @return A cloned instance of {@link Thing}
     */
    public Thing clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);
        return this.genericClone(cloneContainedThings);
    }

    /**
     * Resolve extra properties that are not part of the data-model.
     * This is called during the properties resolve operation of this {@link Thing}
     */
    protected void resolveExtraProperties() {
    }

    /**
     * Generate a clone of this {@link Thing} for edit purpose.
     *
     * @param cloneContainedThings Indicates whether the contained {@link Thing} should be cloned or not.
     * @return A clone of this {@link Thing}
     */
    protected abstract Thing genericClone(boolean cloneContainedThings);

    /**
     * Generate a {@link cdp4common.dto.Thing} from the current {@link Thing}
     */
    public abstract cdp4common.dto.Thing toDto() throws ContainmentException;

    /**
     * Reset the cache Id
     */
    protected void resetCacheId() {
        this.cacheKey = new CacheKey(new UUID(0L, 0L), null);
    }

    /**
     * Computes the ClassKind of the current object based on it's type.
     *
     * @return The {@link ClassKind} of the current object.
     */
    private ClassKind computeCurrentClassKind() {
        Class type = this.getClass();

        try {
            ClassKind classKind;
            classKind = Enum.valueOf(ClassKind.class, Utils.getConstantNotationFromUpperCamel(type.getSimpleName()));
            return classKind;
        } catch (IllegalArgumentException ex) {
            throw new IllegalStateException(String.format("The current Thing %1$s does not have a corresponding ClassKind", type));
        }
    }

    /**
     * Resolve the properties of the current {@link Thing} from its {@link cdp4common.dto.Thing} counter-part.
     *
     * @param dto The source {@link cdp4common.dto.Thing}.
     */
    public abstract void resolveProperties(cdp4common.dto.Thing dto);

    /**
     * Reset all properties that use a sentinel and clear the dictionary
     */
    public void resetSentinel() {
        for (Action action : this.sentinelResetMap.values()) {
            action.invoke();
        }

        this.sentinelResetMap.clear();
    }

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link Thing}
     */
    private Iterable<Iterable> containerLists;

    /**
     * Get an {@link Collection<Collection>} that references the composite properties of the current {@link Thing}
     */
    public Collection<Collection> getContainerLists() {
        return new ArrayList<>();
    }

    /**
     * Returns true if the current object is within the containment tree of the specified container {@link Thing}.
     *
     * @param container The {@link Thing} reference that you want to.
     * @return True if this thing is contained within the container. False if not.
     */
    public boolean isContainedBy(Thing container) {
        if (container == null) {
            throw new IllegalArgumentException("The container may not be null");
        }

        // If this thing is not contained i.e. top container, return false immediately
        if (this.getContainer() == null) {
            return false;
        }

        if (this.getContainer() == container) {
            return true;
        }

        return this.getContainer().isContainedBy(container);
    }

    /**
     * Returns true if the current object is within the containment tree of the specified {@link Predicate<Thing>}.
     *
     * @param matchPredicate The {@link Predicate<Thing>}
     * @return True if this thing is contained by a Thing that matches the predicate.False if not.
     */
    public boolean isContainedBy(Predicate<Thing> matchPredicate) {
        if (matchPredicate == null) {
            throw new IllegalArgumentException("The matchPredicate may not be null");
        }

        if (this instanceof TopContainer) {
            return false;
        }

        return matchPredicate.test(this.getContainer()) || this.getContainer().isContainedBy(matchPredicate);
    }

    /**
     * Returns true if the current object is within the containment tree of the specified {@link UUID} of a {@link Thing}.
     *
     * @param iid The {@link UUID}
     * @return True if this thing is contained by a Thing with the given identifier.False if not.
     */
    public boolean isContainedBy(UUID iid) {
        if (iid == null || iid.equals(new UUID(0L, 0L))) {
            throw new NullPointerException("The iid may not be null");
        }

        if (this instanceof TopContainer) {
            return false;
        }

        return this.getContainer().getIid() == iid || this.getContainer().isContainedBy(iid);
    }

    /**
     * Returns the containing {@link Thing} of the specified type. If this {@link Thing} is not contained by a {@link Thing} of the specified type a null is returned.
     *
     * @param clazz The type of {@link Thing} the expected container has.
     * @return he containing {@link Thing}or null if no such exists.
     */
    public <T> T getContainerOfType(Class<T> clazz) {
        if (this.getContainer() == null) {
            return null;
        }

        Class containerType = this.getContainerInformation().getLeft();
        if (!containerType.isAssignableFrom(clazz)) {
            return this.getContainer().getContainerOfType(clazz);
        }

        return containerType.isInstance(this.getContainer()) ? (T) this.getContainer() : null;
    }

    /**
     * Gets the container information for the current {@link Thing}
     *
     * @return The(Class, property name) of the container of this {@link Thing}
     */
    public Pair<Class, String> getContainerInformation() {
        Class clazz = this.getClass();
        Annotation containerAnnotation = clazz.getDeclaredAnnotation(Container.class);
        if (containerAnnotation == null) {
            return Pair.<Class, String>of(null, null);
        }

        Container metadata = (Container) containerAnnotation;
        return Pair.<Class, String>of(metadata.clazz(), metadata.propertyName());
    }

    /**
     * Add all the validation error messages to be returned
     */
    public void validatePojo() {
        this.validationErrorList.clear();
        this.validationErrorList.addAll(this.validatePojoCardinality());
        this.validationErrorList.addAll(this.validatePojoProperties());
    }

    /**
     * Check the cardinalities of the properties of this {@link Thing}
     *
     * @return A list of potential error
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<>();
        if (this.getIid() == null || this.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The Id for this thing is null.");
        }

        return errorList;
    }

    /**
     * Validate this {@link Thing} with custom rules
     *
     * @return A list of error messages.
     */
    protected List<String> validatePojoProperties() {
        List<String> errorList = new ArrayList<>();
        if (this.getIid() == null || this.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The Id for this thing is null.");
        }

        return errorList;
    }

    /**
     * Asserts whether a {@link Thing} or a copy is stored in any cache.
     * The assertion is made using the {@link UUID} of the {@link Thing}
     *
     * @return True if the {@link Thing} is cached.
     */
    public boolean isCached() {
        if (this.getCache() == null || this.getIid() == null || this.getIid().equals(new UUID(0L, 0L))) {
            return false;
        }

        return this.getCache().asMap().containsKey(this.getCacheKey());
    }

    /**
     * Populate the partialRoutes in the DTOs
     *
     * @param dto the DTO to populate.
     * @throws ContainmentException when the containment tree is broken due to the fact that the Container has not
     *                              been set on one of the {@link Thing} classes in the containment tree.
     */
    protected void buildDtoPartialRoutes(cdp4common.dto.Thing dto) {
        String[] partialRoutes = this.getRoute().split("/");

        // the last partial route doesn't need to be added directly as the Dto's route computes it directly
        for (int i = partialRoutes.length - 4; i >= 0; i -= 2) {
            // partialRoute = <container property>/<UUID>
            String partialRoute = partialRoutes[i] + "/" + partialRoutes[i + 1];
            dto.PARTIAL_ROUTES.add(partialRoute);
        }
    }
}
