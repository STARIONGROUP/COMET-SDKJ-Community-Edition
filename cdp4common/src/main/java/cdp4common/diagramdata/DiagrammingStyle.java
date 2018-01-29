/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDiagrammingStyle.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.diagramdata;

import java.util.*;
import java.util.concurrent.*;
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
import org.apache.commons.lang3.tuple.Pair;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * Contains formatting properties that affect the appearance or style of diagram elements, including diamgram themselves
 */
@CDPVersion(version = "1.1.0")
@ToString
@EqualsAndHashCode
public  abstract class DiagrammingStyle extends DiagramThingBase  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>DiagrammingStyle<code/> class.
     *
     * @see DiagrammingStyle
     */
    protected DiagrammingStyle() {
        this.usedColor = new ContainerList<Color>(this);
    }

    /**
     * Initializes a new instance of the <code>DiagrammingStyle<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see DiagrammingStyle
     */
    protected DiagrammingStyle(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.usedColor = new ContainerList<Color>(this);
    }

    /**
     * Property fillColor.
     * a color that is used to paint the enclosed regions of graphical element. A fillColor value is
     * exclusive with a fill value. If both are specified, the fill value is used. If none is specified, no fill is applied (i.e., the
     * element becomes see-through).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Color fillColor;

    /**
     * Property fillOpacity.
     * a real number (>=0 and <=1) representing the opacity of the fill or fillColor used to paint a
     * graphical element. A value of 0 means totally transparent, while a value of 1 means totally opaque. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Float fillOpacity;

    /**
     * Value indicating whether fontBold.
     * whether the font used to render a text element has a bold style. The default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Boolean fontBold;

    /**
     * Property fontColor.
     * the color of the font used to render a text element. The default is black (red=0, green=0,
     * blue=0).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Color fontColor;

    /**
     * Value indicating whether fontItalic.
     * whether the font used to render a text element has an italic style. The default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Boolean fontItalic;

    /**
     * Property fontName.
     * the name of the font used to render a text element (e.g., “Times New Roman,” “Arial,” or
     * “Helvetica”). The default is “Arial.”
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String fontName;

    /**
     * Property fontSize.
     * a real number (>=0) representing the size (in unit of length) of the font used to render a text
     * element. The default is 10.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Float fontSize;

    /**
     * Value indicating whether fontStrokeThrough.
     * whether the font used to render a text element has a strike-through style. The
     * default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Boolean fontStrokeThrough;

    /**
     * Value indicating whether fontUnderline.
     * whether the font used to render a text element has an underline style. The default is
     * false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Boolean fontUnderline;

    /**
     * Property strokeColor.
     * the color of the stroke used to paint the outline of a graphical element. The default is black
     * (red=0, green=0, blue=0).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Color strokeColor;

    /**
     * Property strokeOpacity.
     * a real number (>=0 and <=1) representing the opacity of the stroke used for a graphical
     * element. A value of 0 means totally transparent, while a value of 1 means totally opaque. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Float strokeOpacity;

    /**
     * Property strokeWidth.
     * a real number (>=0) representing the width of the stroke used to paint the outline of a
     * graphical element. A value of 0 specifies no stroke is painted. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Float strokeWidth;

    /**
     * List of contained Color.
     * The colors used in this style
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Color> usedColor;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>DiagrammingStyle<code/>.
     *
     * @see Iterable
     * @see DiagrammingStyle
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the fillColor.
     * a color that is used to paint the enclosed regions of graphical element. A fillColor value is
     * exclusive with a fill value. If both are specified, the fill value is used. If none is specified, no fill is applied (i.e., the
     * element becomes see-through).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Color getFillColor(){
         return this.fillColor;
    }

    /**
     * Gets the fillOpacity.
     * a real number (>=0 and <=1) representing the opacity of the fill or fillColor used to paint a
     * graphical element. A value of 0 means totally transparent, while a value of 1 means totally opaque. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Float getFillOpacity(){
         return this.fillOpacity;
    }

    /**
     * Gets a value indicating whether fontBold.
     * whether the font used to render a text element has a bold style. The default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Boolean getFontBold(){
         return this.fontBold;
    }

    /**
     * Gets the fontColor.
     * the color of the font used to render a text element. The default is black (red=0, green=0,
     * blue=0).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Color getFontColor(){
         return this.fontColor;
    }

    /**
     * Gets a value indicating whether fontItalic.
     * whether the font used to render a text element has an italic style. The default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Boolean getFontItalic(){
         return this.fontItalic;
    }

    /**
     * Gets the fontName.
     * the name of the font used to render a text element (e.g., “Times New Roman,” “Arial,” or
     * “Helvetica”). The default is “Arial.”
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getFontName(){
         return this.fontName;
    }

    /**
     * Gets the fontSize.
     * a real number (>=0) representing the size (in unit of length) of the font used to render a text
     * element. The default is 10.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Float getFontSize(){
         return this.fontSize;
    }

    /**
     * Gets a value indicating whether fontStrokeThrough.
     * whether the font used to render a text element has a strike-through style. The
     * default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Boolean getFontStrokeThrough(){
         return this.fontStrokeThrough;
    }

    /**
     * Gets a value indicating whether fontUnderline.
     * whether the font used to render a text element has an underline style. The default is
     * false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Boolean getFontUnderline(){
         return this.fontUnderline;
    }

    /**
     * Gets the strokeColor.
     * the color of the stroke used to paint the outline of a graphical element. The default is black
     * (red=0, green=0, blue=0).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Color getStrokeColor(){
         return this.strokeColor;
    }

    /**
     * Gets the strokeOpacity.
     * a real number (>=0 and <=1) representing the opacity of the stroke used for a graphical
     * element. A value of 0 means totally transparent, while a value of 1 means totally opaque. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Float getStrokeOpacity(){
         return this.strokeOpacity;
    }

    /**
     * Gets the strokeWidth.
     * a real number (>=0) representing the width of the stroke used to paint the outline of a
     * graphical element. A value of 0 specifies no stroke is painted. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Float getStrokeWidth(){
         return this.strokeWidth;
    }

    /**
     * Gets a list of contained Color.
     * The colors used in this style
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Color> getUsedColor(){
         return this.usedColor;
    }

    /**
     * Sets the fillColor.
     * a color that is used to paint the enclosed regions of graphical element. A fillColor value is
     * exclusive with a fill value. If both are specified, the fill value is used. If none is specified, no fill is applied (i.e., the
     * element becomes see-through).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setFillColor(Color fillColor){
        this.fillColor = fillColor;
    }

    /**
     * Sets the fillOpacity.
     * a real number (>=0 and <=1) representing the opacity of the fill or fillColor used to paint a
     * graphical element. A value of 0 means totally transparent, while a value of 1 means totally opaque. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setFillOpacity(Float fillOpacity){
        this.fillOpacity = fillOpacity;
    }

    /**
     *Sets a value indicating whether fontBold.
     * whether the font used to render a text element has a bold style. The default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setFontBold(Boolean fontBold){
        this.fontBold = fontBold;
    }

    /**
     * Sets the fontColor.
     * the color of the font used to render a text element. The default is black (red=0, green=0,
     * blue=0).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setFontColor(Color fontColor){
        this.fontColor = fontColor;
    }

    /**
     *Sets a value indicating whether fontItalic.
     * whether the font used to render a text element has an italic style. The default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setFontItalic(Boolean fontItalic){
        this.fontItalic = fontItalic;
    }

    /**
     * Sets the fontName.
     * the name of the font used to render a text element (e.g., “Times New Roman,” “Arial,” or
     * “Helvetica”). The default is “Arial.”
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setFontName(String fontName){
        this.fontName = fontName;
    }

    /**
     * Sets the fontSize.
     * a real number (>=0) representing the size (in unit of length) of the font used to render a text
     * element. The default is 10.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setFontSize(Float fontSize){
        this.fontSize = fontSize;
    }

    /**
     *Sets a value indicating whether fontStrokeThrough.
     * whether the font used to render a text element has a strike-through style. The
     * default is false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setFontStrokeThrough(Boolean fontStrokeThrough){
        this.fontStrokeThrough = fontStrokeThrough;
    }

    /**
     *Sets a value indicating whether fontUnderline.
     * whether the font used to render a text element has an underline style. The default is
     * false.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setFontUnderline(Boolean fontUnderline){
        this.fontUnderline = fontUnderline;
    }

    /**
     * Sets the strokeColor.
     * the color of the stroke used to paint the outline of a graphical element. The default is black
     * (red=0, green=0, blue=0).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setStrokeColor(Color strokeColor){
        this.strokeColor = strokeColor;
    }

    /**
     * Sets the strokeOpacity.
     * a real number (>=0 and <=1) representing the opacity of the stroke used for a graphical
     * element. A value of 0 means totally transparent, while a value of 1 means totally opaque. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setStrokeOpacity(Float strokeOpacity){
        this.strokeOpacity = strokeOpacity;
    }

    /**
     * Sets the strokeWidth.
     * a real number (>=0) representing the width of the stroke used to paint the outline of a
     * graphical element. A value of 0 specifies no stroke is painted. The default is 1.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setStrokeWidth(Float strokeWidth){
        this.strokeWidth = strokeWidth;
    }

    /**
     * Sets a list of contained Color.
     * The colors used in this style
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setUsedColor(ContainerList<Color> usedColor){
        this.usedColor = usedColor;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>DiagrammingStyle<code/>.
     *
     * @see Iterable
     * @see DiagrammingStyle
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.usedColor);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>DiagrammingStyle<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DiagrammingStyle<code/>.
     * 
     * @see DiagrammingStyle
     */
    @Override
    public DiagrammingStyle clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagrammingStyle)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DiagrammingStyle<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DiagrammingStyle
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
