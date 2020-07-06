/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;
import CDP4.CommonData.VolatileThing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Parameter</b></em>'.
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
 * representation of a parameter with a value of a NestedElement
 *     </p>
 * 
 *     <p>
 * Note:&#160;The NestedParameter effectively represents the data on a parameter row of a fully expanded workbook / explicit architectural decomposition for the combination of one DomainOfExpertise and one Option.
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
 *   <li>{@link CDP4.EngineeringModelData.NestedParameter#getAssociatedParameter <em>Associated Parameter</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.NestedParameter#getActualState <em>Actual State</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.NestedParameter#getPath <em>Path</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.NestedParameter#getFormula <em>Formula</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.NestedParameter#getActualValue <em>Actual Value</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedParameter()
 * @model
 * @generated
 */
public interface NestedParameter extends Thing, OwnedThing, VolatileThing {
	/**
	 * Returns the value of the '<em><b>Associated Parameter</b></em>' reference.
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
	 * reference to the Parameter, ParameterOverride or ParameterSubscription with which this NestedParameter is associated
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Parameter</em>' reference.
	 * @see #setAssociatedParameter(ParameterBase)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedParameter_AssociatedParameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterBase getAssociatedParameter();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.NestedParameter#getAssociatedParameter <em>Associated Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Parameter</em>' reference.
	 * @see #getAssociatedParameter()
	 * @generated
	 */
	void setAssociatedParameter(ParameterBase value);

	/**
	 * Returns the value of the '<em><b>Actual State</b></em>' reference.
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
	 * reference to the applicable ActualFiniteState for this NestedParameter if it references a state-dependent <i>associatedParameter</i>, otherwise null
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual State</em>' reference.
	 * @see #setActualState(ActualFiniteState)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedParameter_ActualState()
	 * @model ordered="false"
	 * @generated
	 */
	ActualFiniteState getActualState();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.NestedParameter#getActualState <em>Actual State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual State</em>' reference.
	 * @see #getActualState()
	 * @generated
	 */
	void setActualState(ActualFiniteState value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
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
	 * derived unique short name path to this NestedParameter
	 *     </p>
	 * 
	 *     <p>
	 * Note: The path string consists of the following backslash separated parts:&#160;(1)&#160;path to the <i>nestedElement</i>, (2)&#160;path to the <i>associatedParameter</i>, (3)&#160;path for the <i>actualState</i> or empty string if that is null, (4)&#160;<i>shortName</i> of the <i>container</i> Option. Any nested parts of the path name are dot separated.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedParameter_Path()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.NestedParameter#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
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
	 * <i>formula</i> for the actualValue of this NestedParameter
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Property is TBC. Allowing formulas here is opening up a second level of inserting parameter values in a workbook. Perhaps just having read-only NestedParameters is good enough.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedParameter_Formula()
	 * @model dataType="CDP4.CommonData.ParameterFormulaType" required="true" ordered="false"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.NestedParameter#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' attribute.
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
	 * <i>actualValue</i> of the applicable ParameterValueSet, ParameterOverrideValueSet or ParameterSubscriptionValueSet
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Value</em>' attribute.
	 * @see #setActualValue(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedParameter_ActualValue()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getActualValue();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.NestedParameter#getActualValue <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' attribute.
	 * @see #getActualValue()
	 * @generated
	 */
	void setActualValue(String value);

} // NestedParameter
