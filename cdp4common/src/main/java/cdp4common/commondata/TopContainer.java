/* --------------------------------------------------------------------------------------------------------------------
 * TopContainer.java
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
 * representation of a top container
 * Note 1: A concrete subclass of TopContainer must be instantiated as a singleton in a dataset. This singleton instance is the top containing object of all objects in the composite tree of objects in the dataset, and therefore also the natural first entry point for navigating to all data contained in the dataset through composite structure.
 * Note 2: The <i>revisionNumber</i> of a TopContainer object is by definition equal to the highest <i>revisionNumber</i> in any of its directly or indirectly contained objects. See also Thing. This enables sending a request to a persistent data store to get all new and updated objects with a <i>revisionNumber</i> greater than a given <i>revisionNumber</i>. When a request with <i>revisionNumber</i> equal to zero is sent, all objects contained in a TopContainer will be returned.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class TopContainer extends Thing implements Cloneable {
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
     * Initializes a new instance of the {@link TopContainer} class.
     */
    protected TopContainer() {
    }

    /**
     * Initializes a new instance of the {@link TopContainer} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected TopContainer(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property lastModifiedOn.
     * date and time of the last modification to this TopContainer expressed in UTC (<a href="http://en.wikipedia.org/wiki/Coordinated_Universal_Time">Coordinated Universal Time</a>) with millisecond accuracy
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private LocalDateTime lastModifiedOn;

    /**
     * Creates and returns a copy of this {@link TopContainer} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link TopContainer}.
     */
    @Override
    public TopContainer clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (TopContainer)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this TopContainer}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
