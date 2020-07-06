/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Subscription Value Set</b></em>'.
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
 * representation of the switch setting and all values of a ParameterSubscription
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
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getValueSwitch <em>Value Switch</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getComputed <em>Computed</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getManual <em>Manual</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getReference <em>Reference</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getSubscribedValueSet <em>Subscribed Value Set</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualState <em>Actual State</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualOption <em>Actual Option</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet()
 * @model
 * @generated
 */
public interface ParameterSubscriptionValueSet extends Thing, OwnedThing {
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
	 * switch that determines which value is actually used
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Switch</em>' attribute.
	 * @see CDP4.EngineeringModelData.ParameterSwitchKind
	 * @see #setValueSwitch(ParameterSwitchKind)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet_ValueSwitch()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterSwitchKind getValueSwitch();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getValueSwitch <em>Value Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Switch</em>' attribute.
	 * @see CDP4.EngineeringModelData.ParameterSwitchKind
	 * @see #getValueSwitch()
	 * @generated
	 */
	void setValueSwitch(ParameterSwitchKind value);

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
	 * parameter value derived from the subscribed Parameter or ParameterOverride
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This value is derived from the <i>published</i> value of ParameterValueSet that is referenced through <i>subscribedValueSet</i>. In other words, it is the value as set by the owner (DomainOfExpertise) of the subscribed Parameter or  ParameterOverride.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Computed</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet_Computed()
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
	 * manually assigned parameter subscription value
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The <i>manual</i> value is typically used in the beginning of the modelling process, when meaningful computed values are not yet available from the associated Parameters or ParameterOverrides. By assigning a manual value and setting the <i>valueSwitch</i> to MANUAL, computations can be started with the actual value of ParameterSubscriptions.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manual</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet_Manual()
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
	 * reference parameter value that is derived to be identical to the <i>reference</i> property of the <i>subscribedValueSet</i>
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly)&#160;computed value. However the reference values may be used for any purpose that a modelling activity deems useful.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet_Reference()
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
	 * derived actual value of this ParameterSubscriptionValueSet depending on the <i>valueSwitch</i> setting
	 *     </p>
	 * 
	 *     <p>
	 * Note: The <i>actualValue</i> is derived in the following (obvious) way:
	 *     </p>
	 * 
	 *     <ul>
	 *       <li>
	 * if <i>valueSwitch</i> is COMPUTED, then <i>actualValue</i> is <i>computed,</i>
	 *       </li>
	 *       <li>
	 * if <i>valueSwitch</i> is MANUAL, then <i>actualValue</i> is <i>manual</i>,
	 *       </li>
	 *       <li>
	 * if <i>valueSwitch</i> is REFERENCE, then <i>actualValue</i> is <i>reference</i>.
	 * 
	 *       </li>
	 *     </ul>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Value</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet_ActualValue()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterValueType" required="true"
	 * @generated
	 */
	EList<String> getActualValue();

	/**
	 * Returns the value of the '<em><b>Subscribed Value Set</b></em>' reference.
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
	 * reference to the ParameterValue or ParameterOverrideValue that this ParameterSubscriptionValue is subscribing to
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The Parameter associated with the referenced ParameterValue must be the same as the Parameter containing the ParameterSubscription that contains this ParameterSubscriptionValue. Alternatively, the ParameterOverride associated with the referenced ParameterOverrideValue must be the same as the ParameterOverride containing the ParameterSubscription that contains this ParameterSubscriptionValue.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscribed Value Set</em>' reference.
	 * @see #setSubscribedValueSet(ParameterValueSetBase)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet_SubscribedValueSet()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterValueSetBase getSubscribedValueSet();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getSubscribedValueSet <em>Subscribed Value Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribed Value Set</em>' reference.
	 * @see #getSubscribedValueSet()
	 * @generated
	 */
	void setSubscribedValueSet(ParameterValueSetBase value);

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
	 * convenience property that derives the <i>actualState</i> from the <i>subscribedValueSet</i>
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual State</em>' reference.
	 * @see #setActualState(ActualFiniteState)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet_ActualState()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ActualFiniteState getActualState();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualState <em>Actual State</em>}' reference.
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
	 * convenience property that derives the <i>actualOption</i> from the <i>subscribedValueSet</i>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Option</em>' reference.
	 * @see #setActualOption(Option)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscriptionValueSet_ActualOption()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Option getActualOption();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualOption <em>Actual Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Option</em>' reference.
	 * @see #getActualOption()
	 * @generated
	 */
	void setActualOption(Option value);

} // ParameterSubscriptionValueSet
