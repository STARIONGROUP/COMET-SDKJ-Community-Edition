/* --------------------------------------------------------------------------------------------------------------------
 * DiagrammingStyle.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.diagramdata;

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
 * Contains formatting properties that affect the appearance or style of diagram elements, including diamgram themselves
 */
@CDPVersion(version = "1.1.0")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class DiagrammingStyle extends DiagramThingBase implements Cloneable {
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
     * Initializes a new instance of the {@link DiagrammingStyle} class.
     */
    protected DiagrammingStyle() {
        this.usedColor = new ContainerList<Color>(this);
    }

    /**
     * Initializes a new instance of the {@link DiagrammingStyle} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected DiagrammingStyle(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.usedColor = new ContainerList<Color>(this);
    }

    /**
     * Property fillColor.
     * a color that is used to paint the enclosed regions of graphical element. A fillColor value is
     * exclusive with a fill value. If both are specified, the fill value is used. If none is specified, no fill is applied (i.e., the
     * element becomes see-through).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Color fillColor;

    /**
     * Property fillOpacity.
     * a real number (>=0 and <=1) representing the opacity of the fill or fillColor used to paint a
     * graphical element. A value of 0 means totally transparent, while a value of 1 means totally opaque. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Float fillOpacity;

    /**
     * Value indicating whether fontBold.
     * whether the font used to render a text element has a bold style. The default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Boolean fontBold;

    /**
     * Property fontColor.
     * the color of the font used to render a text element. The default is black (red=0, green=0,
     * blue=0).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Color fontColor;

    /**
     * Value indicating whether fontItalic.
     * whether the font used to render a text element has an italic style. The default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Boolean fontItalic;

    /**
     * Property fontName.
     * the name of the font used to render a text element (e.g., “Times New Roman,” “Arial,” or
     * “Helvetica”). The default is “Arial.”
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String fontName;

    /**
     * Property fontSize.
     * a real number (>=0) representing the size (in unit of length) of the font used to render a text
     * element. The default is 10.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Float fontSize;

    /**
     * Value indicating whether fontStrokeThrough.
     * whether the font used to render a text element has a strike-through style. The
     * default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Boolean fontStrokeThrough;

    /**
     * Value indicating whether fontUnderline.
     * whether the font used to render a text element has an underline style. The default is
     * false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Boolean fontUnderline;

    /**
     * Property strokeColor.
     * the color of the stroke used to paint the outline of a graphical element. The default is black
     * (red=0, green=0, blue=0).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Color strokeColor;

    /**
     * Property strokeOpacity.
     * a real number (>=0 and <=1) representing the opacity of the stroke used for a graphical
     * element. A value of 0 means totally transparent, while a value of 1 means totally opaque. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Float strokeOpacity;

    /**
     * Property strokeWidth.
     * a real number (>=0) representing the width of the stroke used to paint the outline of a
     * graphical element. A value of 0 specifies no stroke is painted. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Float strokeWidth;

    /**
     * List of contained Color.
     * The colors used in this style
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Color> usedColor;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DiagrammingStyle}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link DiagrammingStyle}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.usedColor);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link DiagrammingStyle} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagrammingStyle}.
     */
    @Override
    public DiagrammingStyle clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagrammingStyle)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DiagrammingStyle}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
