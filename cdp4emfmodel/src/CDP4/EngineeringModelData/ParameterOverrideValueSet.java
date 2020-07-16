/**
 */
package CDP4.EngineeringModelData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Override Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 *   <body>
 *     <p>
 * representation of the switch setting and all values for a ParameterOverride
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.ParameterOverrideValueSet#getParameterValueSet <em>Parameter Value Set</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterOverrideValueSet()
 * @model
 * @generated
 */
public interface ParameterOverrideValueSet extends ParameterValueSetBase {
	/**
	 * Returns the value of the '<em><b>Parameter Value Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * reference to the ParameterValueSet that this ParameterOverrideValueSet overrides
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The <i>parameter</i> must be the same as the <i>container</i> of the referenced ParameterValueSet.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value Set</em>' reference.
	 * @see #setParameterValueSet(ParameterValueSet)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterOverrideValueSet_ParameterValueSet()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterValueSet getParameterValueSet();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterOverrideValueSet#getParameterValueSet <em>Parameter Value Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value Set</em>' reference.
	 * @see #getParameterValueSet()
	 * @generated
	 */
	void setParameterValueSet(ParameterValueSet value);

} // ParameterOverrideValueSet
