/**
 */
package CDP4.DiagramData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.Color#getRed <em>Red</em>}</li>
 *   <li>{@link CDP4.DiagramData.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link CDP4.DiagramData.Color#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see CDP4.DiagramData.DiagramDataPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends DiagramThingBase {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(Integer)
	 * @see CDP4.DiagramData.DiagramDataPackage#getColor_Red()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getRed();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Color#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(Integer value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(Integer)
	 * @see CDP4.DiagramData.DiagramDataPackage#getColor_Green()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getGreen();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Color#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(Integer value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(Integer)
	 * @see CDP4.DiagramData.DiagramDataPackage#getColor_Blue()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getBlue();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.Color#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(Integer value);

} // Color
