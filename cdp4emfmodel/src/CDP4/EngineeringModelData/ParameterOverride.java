/**
 */
package CDP4.EngineeringModelData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Override</b></em>'.
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
 * representation of a parameter at ElementUsage level that allows to override the values of a Parameter defined at ElementDefinition level
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;The <i>parameter</i> that is overridden must be a Parameter of the ElementDefinition that is the <i>elementDefinition</i> of the containing ElementUsage.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;The owner DomainOfExpertise of this ParameterOverride is the same as the owner of the elementDefinition.
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
 *   <li>{@link CDP4.EngineeringModelData.ParameterOverride#getParameter <em>Parameter</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterOverride#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterOverride()
 * @model
 * @generated
 */
public interface ParameterOverride extends ParameterOrOverrideBase {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
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
	 * reference to the Parameter whose values this ParameterOverride (possibly)&#160;overrides
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterOverride_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterOverride#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ParameterOverrideValueSet}.
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
	 * representation of the switch and values of this ParameterOverride
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterOverride_ValueSet()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ParameterOverrideValueSet> getValueSet();

} // ParameterOverride
