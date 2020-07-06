/**
 */
package CDP4.EngineeringModelData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Subscription</b></em>'.
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
 * representation of a subscription to a Parameter or ParameterOverride taken by a DomainOfExpertise that is not the owner of the Parameter or ParameterOverride
 *     </p>
 * 
 *     <p>
 * Note:&#160;ParameterSubscriptions represent parameters used as inputs in concurrent engineering workbooks.
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
 *   <li>{@link CDP4.EngineeringModelData.ParameterSubscription#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscription()
 * @model
 * @generated
 */
public interface ParameterSubscription extends ParameterBase {
	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet}.
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
	 * representation of the switch and values of this ParameterSubscription
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSubscription_ValueSet()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ParameterSubscriptionValueSet> getValueSet();

} // ParameterSubscription
