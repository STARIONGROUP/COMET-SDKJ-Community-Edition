/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Based Unit</b></em>'.
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
 * abstract specialization of MeasurementUnit that represents a measurement unit that is defined with respect to another reference unit through an explicit conversion relation
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
 *   <li>{@link CDP4.SiteDirectoryData.ConversionBasedUnit#getReferenceUnit <em>Reference Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ConversionBasedUnit#getConversionFactor <em>Conversion Factor</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getConversionBasedUnit()
 * @model abstract="true"
 * @generated
 */
public interface ConversionBasedUnit extends MeasurementUnit {
	/**
	 * Returns the value of the '<em><b>Reference Unit</b></em>' reference.
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
	 * reference to the MeasurementUnit with respect to which this ConversionBasedUnit is defined
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Unit</em>' reference.
	 * @see #setReferenceUnit(MeasurementUnit)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getConversionBasedUnit_ReferenceUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MeasurementUnit getReferenceUnit();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ConversionBasedUnit#getReferenceUnit <em>Reference Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Unit</em>' reference.
	 * @see #getReferenceUnit()
	 * @generated
	 */
	void setReferenceUnit(MeasurementUnit value);

	/**
	 * Returns the value of the '<em><b>Conversion Factor</b></em>' attribute.
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
	 * definition of the conversion factor in the unit conversion relation
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' attribute.
	 * @see #setConversionFactor(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getConversionBasedUnit_ConversionFactor()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getConversionFactor();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ConversionBasedUnit#getConversionFactor <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Factor</em>' attribute.
	 * @see #getConversionFactor()
	 * @generated
	 */
	void setConversionFactor(String value);

} // ConversionBasedUnit
