/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale Reference Quantity Value</b></em>'.
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
 * representation of a reference quantity with value for the definition of logarithmic MeasurementScales
 *     </p>
 * 
 *     <p>
 * Note:&#160;See property <i>referenceQuantity</i> of LogarithmicScale for details.
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
 *   <li>{@link CDP4.SiteDirectoryData.ScaleReferenceQuantityValue#getScale <em>Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ScaleReferenceQuantityValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getScaleReferenceQuantityValue()
 * @model
 * @generated
 */
public interface ScaleReferenceQuantityValue extends Thing {
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
	 * reference to the MeasurementScale on which the <i>value</i> is expressed
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' reference.
	 * @see #setScale(MeasurementScale)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getScaleReferenceQuantityValue_Scale()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MeasurementScale getScale();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ScaleReferenceQuantityValue#getScale <em>Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(MeasurementScale value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
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
	 * definition of the value of this ScaleReferenceQuantityValue
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getScaleReferenceQuantityValue_Value()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ScaleReferenceQuantityValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ScaleReferenceQuantityValue
