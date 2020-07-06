/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale Value Definition</b></em>'.
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
 * representation of a particular definitional scale value of a MeasurementScale
 *     </p>
 * 
 *     <p>
 * Note:&#160;The measurement scale and unit that apply to this <i>value</i> are defined by the MeasurementScale that contains this ScaleValueDefinition.
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
 *   <li>{@link CDP4.SiteDirectoryData.ScaleValueDefinition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getScaleValueDefinition()
 * @model
 * @generated
 */
public interface ScaleValueDefinition extends DefinedThing {
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
	 *     <p>
	 * numerical value of this ScaleValueDefinition
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getScaleValueDefinition_Value()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ScaleValueDefinition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ScaleValueDefinition
