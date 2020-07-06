/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.ParameterType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Base</b></em>'.
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
 * abstract superclass that enables a common referencing mechanism for Parameter, ParameterOverride and ParameterSubscription
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.ParameterBase#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterBase#getScale <em>Scale</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterBase#getStateDependence <em>State Dependence</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterBase#getGroup <em>Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParameterBase#getIsOptionDependent <em>Is Option Dependent</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterBase()
 * @model abstract="true"
 * @generated
 */
public interface ParameterBase extends Thing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
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
	 * reference to the ParameterType of this ParameterBase
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(ParameterType)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterBase_ParameterType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterType getParameterType();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterBase#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' reference.
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
	 * reference to the MeasurementScale applicable to this ParameterBase
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The <i>scale</i> is mandatory for parameters of a numerical type, i.e. for which the <i>parameterType</i> is a QuantityKind, otherwise it is not assigned.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' reference.
	 * @see #setScale(MeasurementScale)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterBase_Scale()
	 * @model ordered="false"
	 * @generated
	 */
	MeasurementScale getScale();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterBase#getScale <em>Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(MeasurementScale value);

	/**
	 * Returns the value of the '<em><b>State Dependence</b></em>' reference.
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
	 * optional reference to an ActualFiniteStateList that defines the ActualFiniteStates that this ParameterBase depends on
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Dependence</em>' reference.
	 * @see #setStateDependence(ActualFiniteStateList)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterBase_StateDependence()
	 * @model ordered="false"
	 * @generated
	 */
	ActualFiniteStateList getStateDependence();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterBase#getStateDependence <em>State Dependence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Dependence</em>' reference.
	 * @see #getStateDependence()
	 * @generated
	 */
	void setStateDependence(ActualFiniteStateList value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
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
	 * optional reference to the ParameterGroup to which this ParameterBase belongs
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(ParameterGroup)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterBase_Group()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterGroup getGroup();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterBase#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ParameterGroup value);

	/**
	 * Returns the value of the '<em><b>Is Option Dependent</b></em>' attribute.
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
	 * assertion whether the values of this ParameterBase depend on the Options defined in the associated Iteration or not
	 *     </p>
	 * 
	 *     <p>
	 * Note 1: When <i>isOptionDependent</i> is true, a ParameterValueSet (or ParameterOverrideValueSet or ParameterSubscriptionValueSet respectively)&#160;for each Option in the associated Iteration will be created. Values can then be specified for each Option. When <i>isOptionDependent</i> is false, the value of this ParameterBase is the same for all Options.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2: When a new Option is added to an Iteration, automatically new ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be created for that Option for all Parameters and ParameterOverrides that have <i>isOptionDependent</i> is true. When an Option is removed from an Iteration, automatically the option dependent ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be deleted.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Option Dependent</em>' attribute.
	 * @see #setIsOptionDependent(Boolean)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterBase_IsOptionDependent()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsOptionDependent();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterBase#getIsOptionDependent <em>Is Option Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Option Dependent</em>' attribute.
	 * @see #getIsOptionDependent()
	 * @generated
	 */
	void setIsOptionDependent(Boolean value);

} // ParameterBase
