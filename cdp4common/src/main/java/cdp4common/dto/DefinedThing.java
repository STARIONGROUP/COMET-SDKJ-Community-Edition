/* --------------------------------------------------------------------------------------------------------------------
 * DefinedThing.java
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
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "DefinedThing"} class.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class DefinedThing extends Thing implements Cloneable, NamedThing, ShortNamedThing {
    /**
     * Initializes a new instance of the {@link "DefinedThing"} class.
     */
    protected DefinedThing()
    {
        this.alias = new ArrayList<UUID>();
        this.definition = new ArrayList<UUID>();
        this.hyperLink = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "DefinedThing"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected DefinedThing(UUID iid, int rev) {
        super(iid, rev);
        this.alias = new ArrayList<UUID>();
        this.definition = new ArrayList<UUID>();
        this.hyperLink = new ArrayList<UUID>();
    }

    /**
     * The unique identifiers of the contained alias instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> alias;

    /**
     * The unique identifiers of the contained definition instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> definition;

    /**
     * The unique identifiers of the contained hyperLink instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> hyperLink;

    /**
     * The name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String name;

    /**
     * The shortName.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String shortName;

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link DefinedThing}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getAlias());
        containers.add(this.getDefinition());
        containers.add(this.getHyperLink());
        return containers;
    }
}
