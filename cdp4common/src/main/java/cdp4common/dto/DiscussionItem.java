/* --------------------------------------------------------------------------------------------------------------------
 * DiscussionItem.java
 * Copyright (c) 2018 RHEA System S.A.
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "DiscussionItem"} class.
 */
@CDPVersion(version = "1.1.0")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class DiscussionItem extends GenericAnnotation implements Cloneable {
    /**
     * Initializes a new instance of the {@link "DiscussionItem"} class.
     */
    protected DiscussionItem()
    {
    }

    /**
     * Initializes a new instance of the {@link "DiscussionItem"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected DiscussionItem(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The unique identifier of the referenced replyTo.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID replyTo;
}
