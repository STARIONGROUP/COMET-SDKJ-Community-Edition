/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Constraint</b></em>'.
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
 * representation of a single parametric constraint consisting of a ParameterType that acts as a variable, a relational operator and a value, in the form of a mathematical equality or inequality
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.ParametricConstraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ParametricConstraint#getTopExpression <em>Top Expression</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParametricConstraint()
 * @model
 * @generated
 */
public interface ParametricConstraint extends Thing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.BooleanExpression}.
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
	 * collection of all BooleanExpressions that define this ParametricConstraint
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParametricConstraint_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<BooleanExpression> getExpression();

	/**
	 * Returns the value of the '<em><b>Top Expression</b></em>' reference.
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
	 * reference to the top BooleanExpression (of a possibly nested set of BooleanExpression)&#160;that defines this ParametricConstraint
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Expression</em>' reference.
	 * @see #setTopExpression(BooleanExpression)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParametricConstraint_TopExpression()
	 * @model ordered="false"
	 * @generated
	 */
	BooleanExpression getTopExpression();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParametricConstraint#getTopExpression <em>Top Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Expression</em>' reference.
	 * @see #getTopExpression()
	 * @generated
	 */
	void setTopExpression(BooleanExpression value);

} // ParametricConstraint
