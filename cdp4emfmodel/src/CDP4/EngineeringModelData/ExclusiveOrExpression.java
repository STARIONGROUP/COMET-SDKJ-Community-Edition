/**
 */
package CDP4.EngineeringModelData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive Or Expression</b></em>'.
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
 * representation of a boolean exclusive or expression
 *     </p>
 * 
 *     <p>
 * Note:&#160;The expression evaluates to true if one term is true and the other is false, otherwise it evaluates to false.
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
 *   <li>{@link CDP4.EngineeringModelData.ExclusiveOrExpression#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getExclusiveOrExpression()
 * @model
 * @generated
 */
public interface ExclusiveOrExpression extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' reference list.
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
	 * references to the BooleanExpressions that are the terms for this boolean exclusive or expression
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getExclusiveOrExpression_Term()
	 * @model lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<BooleanExpression> getTerm();

} // ExclusiveOrExpression
