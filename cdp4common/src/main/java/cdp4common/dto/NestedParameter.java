/* --------------------------------------------------------------------------------------------------------------------
 * NestedParameter.java
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
 * A Data Transfer Object representation of the {@link "NestedParameter"} class.
 */
@Container(clazz = NestedElement.class, propertyName = "nestedParameter")
@ToString
@EqualsAndHashCode(callSuper = true)
public class NestedParameter extends Thing implements Cloneable, OwnedThing, VolatileThing {
    /**
     * Initializes a new instance of the {@link "NestedParameter"} class.
     */
    public NestedParameter() {
    }

    /**
     * Initializes a new instance of the {@link "NestedParameter"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public NestedParameter(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The unique identifier of the referenced actualState.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID actualState;

    /**
     * The actualValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String actualValue;

    /**
     * The unique identifier of the referenced associatedParameter.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID associatedParameter;

    /**
     * The formula.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String formula;

    /**
     * Value indicating whether isVolatile.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isVolatile;

    /**
     * The unique identifier of the referenced owner.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID owner;

    /**
     * Gets the path.
     * @throws UnsupportedOperationException The path property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getPath() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property NestedParameter.path");
    }

    /**
     * Sets the path.
     * @throws UnsupportedOperationException The path property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setPath(String path) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property NestedParameter.path");
    }

    /**
     * Gets the route for the current {@link NestedParameter}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.NestedParameter} from a {@link NestedParameter}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.NestedParameter}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.NestedParameter(this.getIid(), cache, uri);
    }
}
