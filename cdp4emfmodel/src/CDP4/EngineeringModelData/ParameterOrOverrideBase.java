/**
 */
package CDP4.EngineeringModelData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Or Override Base</b></em>'.
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
 * abstract superclass to provide a common reference to Parameter and ParameterOverride
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
 *   <li>{@link CDP4.EngineeringModelData.ParameterOrOverrideBase#getParameterSubscription <em>Parameter Subscription</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterOrOverrideBase()
 * @model abstract="true"
 * @generated
 */
public interface ParameterOrOverrideBase extends ParameterBase {
	/**
	 * Returns the value of the '<em><b>Parameter Subscription</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ParameterSubscription}.
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
	 * zero or more ParameterSubscriptions that other domains than the owner DomainOfExpertise of this Parameter or ParameterOverride have subscribed to
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Subscription</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterOrOverrideBase_ParameterSubscription()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterSubscription> getParameterSubscription();

} // ParameterOrOverrideBase
