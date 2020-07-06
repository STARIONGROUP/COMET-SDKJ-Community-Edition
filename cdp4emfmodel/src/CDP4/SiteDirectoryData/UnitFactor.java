/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 * 
 *   <body>
 *     representation of a factor in the product of powers that defines a 
 *     DerivedUnit
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.UnitFactor#getUnit <em>Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.UnitFactor#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getUnitFactor()
 * @model
 * @generated
 */
public interface UnitFactor extends Thing {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
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
	 * reference to the MeasurementUnit of this UnitFactor
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(MeasurementUnit)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getUnitFactor_Unit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MeasurementUnit getUnit();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.UnitFactor#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MeasurementUnit value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
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
	 * definition of the exponent value of this UnitFactor
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getUnitFactor_Exponent()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getExponent();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.UnitFactor#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(String value);

} // UnitFactor
