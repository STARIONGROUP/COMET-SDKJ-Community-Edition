/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;

import java.time.OffsetDateTime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Verification</b></em>'.
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
 * representation of built-in data model rule or user-defined Rule to be verified and its current verification result
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
 *   <li>{@link CDP4.EngineeringModelData.RuleVerification#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.RuleVerification#getViolation <em>Violation</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.RuleVerification#getExecutedOn <em>Executed On</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.RuleVerification#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRuleVerification()
 * @model abstract="true"
 * @generated
 */
public interface RuleVerification extends Thing, NamedThing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
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
	 * assertion whether the associated built-in data model rule or user-defined Rule is active, i.e. shall be verified in the next verification execution
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(Boolean)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRuleVerification_IsActive()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsActive();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.RuleVerification#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Violation</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.RuleViolation}.
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
	 * set of violations, if any, of rules having been verified
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;A RuleViolation provides explanatory information to help the user correct the EngineeringModel so that the associated rule will be satisfied.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Violation</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRuleVerification_Violation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RuleViolation> getViolation();

	/**
	 * Returns the value of the '<em><b>Executed On</b></em>' attribute.
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
	 * date and time of the last executed verification of the associated rule
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executed On</em>' attribute.
	 * @see #setExecutedOn(OffsetDateTime)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRuleVerification_ExecutedOn()
	 * @model dataType="CDP4.CommonData.DateTime" ordered="false"
	 * @generated
	 */
	OffsetDateTime getExecutedOn();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.RuleVerification#getExecutedOn <em>Executed On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed On</em>' attribute.
	 * @see #getExecutedOn()
	 * @generated
	 */
	void setExecutedOn(OffsetDateTime value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link CDP4.EngineeringModelData.RuleVerificationStatusKind}.
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
	 * status of the last executed verification of the associated rule
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see CDP4.EngineeringModelData.RuleVerificationStatusKind
	 * @see #setStatus(RuleVerificationStatusKind)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRuleVerification_Status()
	 * @model default="NONE" required="true" ordered="false"
	 * @generated
	 */
	RuleVerificationStatusKind getStatus();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.RuleVerification#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see CDP4.EngineeringModelData.RuleVerificationStatusKind
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RuleVerificationStatusKind value);

} // RuleVerification
