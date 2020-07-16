/**
 */
package CDP4.EngineeringModelData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Expression</b></em>'.
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
 * representation of a boolean and (conjunction) expression
 *     </p>
 * 
 *     <p>
 * Note:&#160;The expression evaluates to true if all its terms are true, otherwise it evaluates to false.
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
 *   <li>{@link CDP4.EngineeringModelData.AndExpression#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getAndExpression()
 * @model
 * @generated
 */
public interface AndExpression extends BooleanExpression {
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
	 * references to the BooleanExpressions that are the terms for this boolean and expression
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getAndExpression_Term()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<BooleanExpression> getTerm();

} // AndExpression
