/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DeprecatableThing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
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
 * representation of a requirement in a RequirementsSpecification
 *     </p>
 * 
 *     <p>
 * Note 1: The identifier of the requirement is specified in the <i>shortName</i>. The title or summary description of the requirement is specified in the <i>name</i>.
 *     </p>
 * 
 *     <p>
 * Note 2: The textual body of the requirement is specified in the <i>content</i> of the associated Definition.
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
 *   <li>{@link CDP4.EngineeringModelData.Requirement#getParametricConstraint <em>Parametric Constraint</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Requirement#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends SimpleParameterizableThing, CategorizableThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Parametric Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ParametricConstraint}.
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
	 * optional parametric constraint that provides a specification of a quantifiable requirement in the form of a boolean expression
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;In addition to a textual specification of a requirement, such a constraint enables a precise mathematical formulation of the requirement in the form of a boolean expression that can in principle be evaluated by machine. It may form the basis for an automated comparison with Parameters of the same ParameterType(s) as used in the ParametricConstraint&#160;of ElementDefinitions that characterise the achieved or realizable capabilities and performances of a designed solution.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parametric Constraint</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRequirement_ParametricConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParametricConstraint> getParametricConstraint();

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
	 * optional reference to a RequirementsGroup of which this Requirement is a member
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(RequirementsGroup)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRequirement_Group()
	 * @model ordered="false"
	 * @generated
	 */
	RequirementsGroup getGroup();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Requirement#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(RequirementsGroup value);

} // Requirement
