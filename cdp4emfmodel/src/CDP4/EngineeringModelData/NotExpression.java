/**
 */
package CDP4.EngineeringModelData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Expression</b></em>'.
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
 * representation of a boolean not (negation)&#160;expression
 *     </p>
 * 
 *     <p>
 * Note:&#160;The expression evaluates to true if its term is false, otherwise it evaluates to false.
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
 *   <li>{@link CDP4.EngineeringModelData.NotExpression#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNotExpression()
 * @model
 * @generated
 */
public interface NotExpression extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' reference.
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
	 * reference to the BooleanExpression that is the term for this boolean not expression
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' reference.
	 * @see #setTerm(BooleanExpression)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNotExpression_Term()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getTerm();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.NotExpression#getTerm <em>Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(BooleanExpression value);

} // NotExpression
