/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.ParameterType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Parameter Value</b></em>'.
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
 * representation of a single parameter with value for a SimpleParameterizableThing
 *     </p>
 * 
 *     <p>
 * Note:&#160;This allows attaching &quot;user-defined attributes&quot; to SimpleParameterizableThings by using ParameterTypes defined in a ReferenceDataLibrary, i.e. reusing the concepts already defined for Parameters of ElementDefinitions.
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
 *   <li>{@link CDP4.EngineeringModelData.SimpleParameterValue#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.SimpleParameterValue#getValue <em>Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.SimpleParameterValue#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getSimpleParameterValue()
 * @model
 * @generated
 */
public interface SimpleParameterValue extends Thing, OwnedThing {
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
	 *     reference to the applicable ParameterType for this SimpleParameterValue
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(ParameterType)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getSimpleParameterValue_ParameterType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterType getParameterType();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.SimpleParameterValue#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(ParameterType value);

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
	 *   <body>
	 * value of this SimpleParameterValue
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getSimpleParameterValue_Value()
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
	 *     <p>
	 * reference to the applicable MeasurementScale if the <i>parameterType</i> is a QuantityKind
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The MeasurementScale must be one of the <i>possibleScale</i> defined for the QuantityKind.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' reference.
	 * @see #setScale(MeasurementScale)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getSimpleParameterValue_Scale()
	 * @model ordered="false"
	 * @generated
	 */
	MeasurementScale getScale();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.SimpleParameterValue#getScale <em>Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(MeasurementScale value);

} // SimpleParameterValue
