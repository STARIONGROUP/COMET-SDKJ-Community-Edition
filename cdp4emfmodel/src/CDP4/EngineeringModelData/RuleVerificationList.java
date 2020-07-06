/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DefinedThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Verification List</b></em>'.
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
 * representation of a list of RuleVerifications
 *     </p>
 * 
 *     <p>
 * Note:&#160;The list allows to define an ordered set of built-in and user defined rules that must be verified for the current state of an Iteration in an EngineeringModel. The contained RuleVerifications can be made active or inactive during a session and can capture the current verification result - e.g. passed or failed - and explanatory information.
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
 *   <li>{@link CDP4.EngineeringModelData.RuleVerificationList#getRuleVerification <em>Rule Verification</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRuleVerificationList()
 * @model
 * @generated
 */
public interface RuleVerificationList extends DefinedThing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Rule Verification</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.RuleVerification}.
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
	 * set of RuleVerifications in this RuleVerificationList, in desired execution order
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Verification</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRuleVerificationList_RuleVerification()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleVerification> getRuleVerification();

} // RuleVerificationList
