/**
 */
package CDP4.DiagramData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.Bounds#getX <em>X</em>}</li>
 *   <li>{@link CDP4.DiagramData.Bounds#getY <em>Y</em>}</li>
 *   <li>{@link CDP4.DiagramData.Bounds#getWidth <em>Width</em>}</li>
 *   <li>{@link CDP4.DiagramData.Bounds#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see CDP4.DiagramData.DiagramDataPackage#getBounds()
 * @model
 * @generated
 */
public interface Bounds extends DiagramThingBase {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getBounds_X()
	 * @model dataType="CDP4.CommonData.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getX();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Bounds#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getBounds_Y()
	 * @model dataType="CDP4.CommonData.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getY();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Bounds#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Float value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getBounds_Width()
	 * @model dataType="CDP4.CommonData.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getWidth();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Bounds#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getBounds_Height()
	 * @model dataType="CDP4.CommonData.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getHeight();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Bounds#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Float value);

} // Bounds
