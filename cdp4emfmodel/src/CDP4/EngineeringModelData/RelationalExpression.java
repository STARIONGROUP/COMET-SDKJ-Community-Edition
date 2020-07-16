/**
 */
package CDP4.EngineeringModelData;

import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.ParameterType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression</b></em>'.
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
 * representation of a mathematical equality or inequality defined by a ParameterType that acts as a variable, a relational operator and a value
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
 *   <li>{@link CDP4.EngineeringModelData.RelationalExpression#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.RelationalExpression#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.RelationalExpression#getValue <em>Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.RelationalExpression#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends BooleanExpression {
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
	 * 
	 *   <body>
	 *     specification of the parameter type that defines the free variable in this 
	 *     ParametricConstraint
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(ParameterType)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRelationalExpression_ParameterType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterType getParameterType();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.RelationalExpression#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Relational Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.EngineeringModelData.RelationalOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     specification of the relational operator
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relational Operator</em>' attribute.
	 * @see CDP4.EngineeringModelData.RelationalOperatorKind
	 * @see #setRelationalOperator(RelationalOperatorKind)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRelationalExpression_RelationalOperator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RelationalOperatorKind getRelationalOperator();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.RelationalExpression#getRelationalOperator <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Operator</em>' attribute.
	 * @see CDP4.EngineeringModelData.RelationalOperatorKind
	 * @see #getRelationalOperator()
	 * @generated
	 */
	void setRelationalOperator(RelationalOperatorKind value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     specification of the parameter value
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRelationalExpression_Value()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterValueType" required="true"
	 * @generated
	 */
	EList<String> getValue();

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
	 * reference to the applicable MeasurementScale in case the parameterType is a QuantityKind
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' reference.
	 * @see #setScale(MeasurementScale)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRelationalExpression_Scale()
	 * @model ordered="false"
	 * @generated
	 */
	MeasurementScale getScale();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.RelationalExpression#getScale <em>Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(MeasurementScale value);

} // RelationalExpression
