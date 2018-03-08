/* --------------------------------------------------------------------------------------------------------------------
 * FileRevision.java
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
 * A Data Transfer Object representation of the {@link "FileRevision"} class.
 */
@Container(clazz = File.class, propertyName = "fileRevision")
@ToString
@EqualsAndHashCode(callSuper = true)
public class FileRevision extends Thing implements Cloneable, NamedThing, TimeStampedThing {
    /**
     * Initializes a new instance of the {@link "FileRevision"} class.
     */
    public FileRevision()
    {
        this.fileType = new ArrayList<OrderedItem>();
    }

    /**
     * Initializes a new instance of the {@link "FileRevision"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public FileRevision(UUID iid, int rev) {
        super(iid, rev);
        this.fileType = new ArrayList<OrderedItem>();
    }

    /**
     * The unique identifier of the referenced containingFolder.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID containingFolder;

    /**
     * The contentHash.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String contentHash;

    /**
     * The createdOn.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private LocalDateTime createdOn;

    /**
     * The unique identifier of the referenced creator.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID creator;

    /**
     * The list of ordered unique identifiers of the referenced fileType instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> fileType;

    /**
     * The name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String name;

    /**
     * Gets the path.
     * @throws UnsupportedOperationException The path property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public String getPath() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property FileRevision.path");
    }

    /**
     * Sets the path.
     * @throws UnsupportedOperationException The path property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public void setPath(String path) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property FileRevision.path");
    }

    /**
     * Gets the route for the current {@link FileRevision}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.FileRevision} from a {@link FileRevision}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.FileRevision}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.engineeringmodeldata.FileRevision(this.getIid(), cache, uri);
    }
}
