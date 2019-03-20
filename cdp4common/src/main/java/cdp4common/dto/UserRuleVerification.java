/* --------------------------------------------------------------------------------------------------------------------
 * UserRuleVerification.java
 * Copyright (c) 2019 RHEA System S.A.
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
 * A Data Transfer Object representation of the {@link "UserRuleVerification"} class.
 */
@Container(clazz = RuleVerificationList.class, propertyName = "ruleVerification")
@ToString
@EqualsAndHashCode(callSuper = true)
public class UserRuleVerification extends RuleVerification implements Cloneable {
    /**
     * Initializes a new instance of the {@link "UserRuleVerification"} class.
     */
    public UserRuleVerification() {
    }

    /**
     * Initializes a new instance of the {@link "UserRuleVerification"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public UserRuleVerification(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The unique identifier of the referenced rule.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID rule;

    /**
     * Gets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property UserRuleVerification.name");
    }

    /**
     * Sets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setName(String name) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property UserRuleVerification.name");
    }

    /**
     * Gets the route for the current {@link UserRuleVerification}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.UserRuleVerification} from a {@link UserRuleVerification}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.UserRuleVerification}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.UserRuleVerification(this.getIid(), cache, uri);
    }
}
