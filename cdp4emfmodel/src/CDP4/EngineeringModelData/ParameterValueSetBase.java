/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value Set Base</b></em>'.
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
 * abstract superclass representing the switch setting and values of a Parameter or ParameterOverride and serves as a common reference type for ParameterValueSet and ParameterOverrideValueSet
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
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getValueSwitch <em>Value Switch</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getPublished <em>Published</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getFormula <em>Formula</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getComputed <em>Computed</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getManual <em>Manual</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getReference <em>Reference</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getActualState <em>Actual State</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterValueSetBase#getActualOption <em>Actual Option</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase()
 * @model abstract="true"
 * @generated
 */
public interface ParameterValueSetBase extends Thing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Value Switch</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.EngineeringModelData.ParameterSwitchKind}.
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
	 * switch that determines which value is actually used
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;See ParameterSwitchKind for the description of the different possibilities.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Switch</em>' attribute.
	 * @see CDP4.EngineeringModelData.ParameterSwitchKind
	 * @see #setValueSwitch(ParameterSwitchKind)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_ValueSwitch()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterSwitchKind getValueSwitch();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getValueSwitch <em>Value Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Switch</em>' attribute.
	 * @see CDP4.EngineeringModelData.ParameterSwitchKind
	 * @see #getValueSwitch()
	 * @generated
	 */
	void setValueSwitch(ParameterSwitchKind value);

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 * last published parameter value
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;At the time of Publication the <i>actualValue</i> (i.e. depending on the actual setting of the <i>valueSwitch</i> at Publication time)&#160;is copied to this <i>published</i> value. Subsequently the <i>published</i> value of this ParameterValueSet is the value that will appear in the derived <i>computed</i> value of ParameterSubscriptionValueSets that reference this ParameterValueSet.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_Published()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterValueType" required="true"
	 * @generated
	 */
	EList<String> getPublished();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 * formula assigned by the owner (DomainOfExpertise)&#160;of the associated Parameter or ParameterOverride
	 *     </p>
	 * 
	 *     <p>
	 * Note: The formula is needed to define a link into an external application (typically MS&#160;Excel)&#160;to retrieve the computed parameter value.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formula</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_Formula()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterFormulaType" required="true"
	 * @generated
	 */
	EList<String> getFormula();

	/**
	 * Returns the value of the '<em><b>Computed</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 * computed parameter value
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This is value of the associated Parameter as computed by the parameter's owner (DomainOfExpertise).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Computed</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_Computed()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterValueType" required="true"
	 * @generated
	 */
	EList<String> getComputed();

	/**
	 * Returns the value of the '<em><b>Manual</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 * manually assigned parameter value
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The <i>manual</i> value is typically used in the beginning of the modelling process, when computed and published values are not yet available, in order to enable starting computations with ParameterSubscriptions.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manual</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_Manual()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterValueType" required="true"
	 * @generated
	 */
	EList<String> getManual();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 * reference parameter value
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly)&#160;computed value. However the reference values may be used for any purpose that is deemed useful by the users of the EngineeringModel.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_Reference()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterValueType" required="true"
	 * @generated
	 */
	EList<String> getReference();

	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 * derived actual value depending on the <i>valueSwitch</i> setting
	 *     </p>
	 * 
	 *     <p>
	 * Note: The <i>actualValue</i> is derived in the following way:
	 *     </p>
	 * 
	 *     <p>
	 * if <i>valueSwitch</i> is COMPUTED then <i>actualValue</i> is <i>computed;</i>
	 *     </p>
	 * 
	 *     <p>
	 * if <i>valueSwitch</i> is MANUAL, then <i>actualValue</i> is <i>manual;</i>
	 *     </p>
	 * 
	 *     <p>
	 * if <i>valueSwitch</i> is REFERENCE, then <i>actualValue</i> is <i>reference</i>.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Value</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_ActualValue()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterValueType" required="true"
	 * @generated
	 */
	EList<String> getActualValue();

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
	 * reference to the ActualFiniteState to which this ParameterValueSet pertains
	 *     </p>
	 * 
	 *     <p>
	 * Note: This reference shall only be assigned for Parameters and ParameterOverrides that have a <i>stateDependence</i> to an ActualFiniteStateList.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual State</em>' reference.
	 * @see #setActualState(ActualFiniteState)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_ActualState()
	 * @model ordered="false"
	 * @generated
	 */
	ActualFiniteState getActualState();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getActualState <em>Actual State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual State</em>' reference.
	 * @see #getActualState()
	 * @generated
	 */
	void setActualState(ActualFiniteState value);

	/**
	 * Returns the value of the '<em><b>Actual Option</b></em>' reference.
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
	 * reference to the actual Option to which this ParameterValueSetBase pertains
	 *     </p>
	 * 
	 *     <p>
	 * Note: This reference shall only be assigned for Parameters that have <i>isOptionDependent</i> set to true. Otherwise it shall be null.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Option</em>' reference.
	 * @see #setActualOption(Option)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterValueSetBase_ActualOption()
	 * @model ordered="false"
	 * @generated
	 */
	Option getActualOption();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getActualOption <em>Actual Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Option</em>' reference.
	 * @see #getActualOption()
	 * @generated
	 */
	void setActualOption(Option value);

} // ParameterValueSetBase
