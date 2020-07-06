/**
 */
package CDP4.DiagramData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagramming Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFontName <em>Font Name</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFontItalic <em>Font Italic</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFontBold <em>Font Bold</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFontUnderline <em>Font Underline</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getFontStrokeThrough <em>Font Stroke Through</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagrammingStyle#getUsedColor <em>Used Color</em>}</li>
 * </ul>
 *
 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle()
 * @model abstract="true"
 * @generated
 */
public interface DiagrammingStyle extends DiagramThingBase {
	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' reference.
	 * @see #setFillColor(Color)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FillColor()
	 * @model ordered="false"
	 * @generated
	 */
	Color getFillColor();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFillColor <em>Fill Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' reference.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(Color value);

	/**
	 * Returns the value of the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Opacity</em>' attribute.
	 * @see #setFillOpacity(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FillOpacity()
	 * @model dataType="CDP4.CommonData.Float" ordered="false"
	 * @generated
	 */
	Float getFillOpacity();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFillOpacity <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Opacity</em>' attribute.
	 * @see #getFillOpacity()
	 * @generated
	 */
	void setFillOpacity(Float value);

	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #setStrokeWidth(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_StrokeWidth()
	 * @model dataType="CDP4.CommonData.Float" ordered="false"
	 * @generated
	 */
	Float getStrokeWidth();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(Float value);

	/**
	 * Returns the value of the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #setStrokeOpacity(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_StrokeOpacity()
	 * @model dataType="CDP4.CommonData.Float" ordered="false"
	 * @generated
	 */
	Float getStrokeOpacity();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #getStrokeOpacity()
	 * @generated
	 */
	void setStrokeOpacity(Float value);

	/**
	 * Returns the value of the '<em><b>Stroke Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Color</em>' reference.
	 * @see #setStrokeColor(Color)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_StrokeColor()
	 * @model ordered="false"
	 * @generated
	 */
	Color getStrokeColor();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getStrokeColor <em>Stroke Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Color</em>' reference.
	 * @see #getStrokeColor()
	 * @generated
	 */
	void setStrokeColor(Color value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FontSize()
	 * @model dataType="CDP4.CommonData.Float" ordered="false"
	 * @generated
	 */
	Float getFontSize();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(Float value);

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #setFontName(String)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FontName()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name</em>' attribute.
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Returns the value of the '<em><b>Font Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Color</em>' reference.
	 * @see #setFontColor(Color)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FontColor()
	 * @model ordered="false"
	 * @generated
	 */
	Color getFontColor();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFontColor <em>Font Color</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Color</em>' reference.
	 * @see #getFontColor()
	 * @generated
	 */
	void setFontColor(Color value);

	/**
	 * Returns the value of the '<em><b>Font Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Italic</em>' attribute.
	 * @see #setFontItalic(Boolean)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FontItalic()
	 * @model dataType="CDP4.CommonData.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getFontItalic();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFontItalic <em>Font Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Italic</em>' attribute.
	 * @see #getFontItalic()
	 * @generated
	 */
	void setFontItalic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Font Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Bold</em>' attribute.
	 * @see #setFontBold(Boolean)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FontBold()
	 * @model dataType="CDP4.CommonData.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getFontBold();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFontBold <em>Font Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Bold</em>' attribute.
	 * @see #getFontBold()
	 * @generated
	 */
	void setFontBold(Boolean value);

	/**
	 * Returns the value of the '<em><b>Font Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Underline</em>' attribute.
	 * @see #setFontUnderline(Boolean)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FontUnderline()
	 * @model dataType="CDP4.CommonData.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getFontUnderline();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFontUnderline <em>Font Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Underline</em>' attribute.
	 * @see #getFontUnderline()
	 * @generated
	 */
	void setFontUnderline(Boolean value);

	/**
	 * Returns the value of the '<em><b>Font Stroke Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Stroke Through</em>' attribute.
	 * @see #setFontStrokeThrough(Boolean)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_FontStrokeThrough()
	 * @model dataType="CDP4.CommonData.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getFontStrokeThrough();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagrammingStyle#getFontStrokeThrough <em>Font Stroke Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Stroke Through</em>' attribute.
	 * @see #getFontStrokeThrough()
	 * @generated
	 */
	void setFontStrokeThrough(Boolean value);

	/**
	 * Returns the value of the '<em><b>Used Color</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.DiagramData.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Color</em>' containment reference list.
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagrammingStyle_UsedColor()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Color> getUsedColor();

} // DiagrammingStyle
