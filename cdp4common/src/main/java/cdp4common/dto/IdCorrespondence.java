/* --------------------------------------------------------------------------------------------------------------------
 * IdCorrespondence.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 *
 * This is an auto-generated DTO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

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
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "IdCorrespondence"} class.
 */
@Container(clazz = ExternalIdentifierMap.class, propertyName = "correspondence")
@ToString
@EqualsAndHashCode(callSuper = true)
public class IdCorrespondence extends Thing implements Cloneable, OwnedThing {
    /**
     * Initializes a new instance of the {@link "IdCorrespondence"} class.
     */
    public IdCorrespondence() {
    }

    /**
     * Initializes a new instance of the {@link "IdCorrespondence"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public IdCorrespondence(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The externalId.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String externalId;

    /**
     * The unique identifier of the referenced internalThing.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID internalThing;

    /**
     * Gets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getOwner() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property IdCorrespondence.owner");
    }

    /**
     * Sets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setOwner(UUID owner) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property IdCorrespondence.owner");
    }

    /**
     * Gets the route for the current {@link IdCorrespondence}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.IdCorrespondence} from a {@link IdCorrespondence}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.IdCorrespondence}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.IdCorrespondence(this.getIid(), cache, uri);
    }
}
