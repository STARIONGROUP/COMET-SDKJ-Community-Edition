/**
 */
package CDP4.DiagramData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.DiagramObject#getResolution <em>Resolution</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagramObject#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramObject()
 * @model
 * @generated
 */
public interface DiagramObject extends DiagramShape {
	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramObject_Resolution()
	 * @model dataType="CDP4.CommonData.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getResolution();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagramObject#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Float value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramObject_Documentation()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagramObject#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // DiagramObject
