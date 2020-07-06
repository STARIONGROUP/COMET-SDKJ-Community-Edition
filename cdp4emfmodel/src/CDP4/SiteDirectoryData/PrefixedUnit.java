/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefixed Unit</b></em>'.
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
 *     <p>
 *       specialization of ConversionBasedUnit that defines a MeasurementUnit with a 
 *       multiple or submultiple UnitPrefix
 *     </p>
 * 
 *     <p>
 *       Example:&#160;Measurement units like &quot;kilogram&quot;, &quot;millimetre&quot;, &quot;nanovolt&quot;, 
 *       &quot;gibibyte&quot; etc.
 *     </p>
 * 
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
 *   <li>{@link CDP4.SiteDirectoryData.PrefixedUnit#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPrefixedUnit()
 * @model
 * @generated
 */
public interface PrefixedUnit extends ConversionBasedUnit {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' reference.
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
	 * reference to the applicable UnitPrefix
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' reference.
	 * @see #setPrefix(UnitPrefix)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPrefixedUnit_Prefix()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UnitPrefix getPrefix();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.PrefixedUnit#getPrefix <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(UnitPrefix value);

} // PrefixedUnit
