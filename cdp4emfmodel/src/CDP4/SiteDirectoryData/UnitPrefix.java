/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Prefix</b></em>'.
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
 * representation of a multiple or submultiple prefix for MeasurementUnits as defined in ISO/IEC&#160;80000
 *     </p>
 * 
 *     <p>
 * Example:&#160;Decimal multiples &quot;kilo&quot;, &quot;mega&quot;, and decimal submultiples &quot;milli&quot; and &quot;nano&quot;, but also binary multiples like &quot;mebi&quot;, &quot;gibi&quot; and &quot;tebi&quot;. See also <a href="http://www.bipm.org/en/si/si_brochure/chapter3/prefixes.html">http://www.bipm.org/en/si/si_brochure/chapter3/prefixes.html</a> and <a href="http://www.iec.ch/zone/si/si_bytes.htm">http://www.iec.ch/zone/si/si_bytes.htm</a>.
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
 *   <li>{@link CDP4.SiteDirectoryData.UnitPrefix#getConversionFactor <em>Conversion Factor</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getUnitPrefix()
 * @model
 * @generated
 */
public interface UnitPrefix extends DefinedThing, DeprecatableThing {
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
	 * definition of the multiplication factor of this Prefix
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' attribute.
	 * @see #setConversionFactor(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getUnitPrefix_ConversionFactor()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getConversionFactor();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.UnitPrefix#getConversionFactor <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Factor</em>' attribute.
	 * @see #getConversionFactor()
	 * @generated
	 */
	void setConversionFactor(String value);

} // UnitPrefix
