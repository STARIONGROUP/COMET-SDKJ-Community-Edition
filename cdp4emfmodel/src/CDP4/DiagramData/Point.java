/**
 */
package CDP4.DiagramData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.Point#getX <em>X</em>}</li>
 *   <li>{@link CDP4.DiagramData.Point#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see CDP4.DiagramData.DiagramDataPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends DiagramThingBase {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Float)
	 * @see CDP4.DiagramData.DiagramDataPackage#getPoint_X()
	 * @model dataType="CDP4.CommonData.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getX();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Point#getX <em>X</em>}' attribute.
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
	 * @see CDP4.DiagramData.DiagramDataPackage#getPoint_Y()
	 * @model dataType="CDP4.CommonData.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getY();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Float value);

} // Point
