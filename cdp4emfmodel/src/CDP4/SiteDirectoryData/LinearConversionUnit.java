/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Conversion Unit</b></em>'.
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
 * specialization of ConversionBasedUnit that represents a measurement unit that is defined with respect to another reference measurement unit through a linear conversion relation with a conversion factor
 *     </p>
 * 
 *     <p>
 * Note:&#160;The unit conversion relationship is defined by the following equation:
 *     </p>
 * 
 *     <p style="margin-left:10.0px;">
 * value<sub>RU</sub> = <i>conversionFactor</i> * value<sub>CU</sub>,
 *     </p>
 * 
 *     <p>
 * where: value<sub>RU</sub> is the quantity value expressed in the <i>referenceUnit</i>, and, value<sub>CU</sub> is the quantity value expressed in the LinearConversionUnit.
 *     </p>
 * 
 *     <p>
 * For example, in the definition of the LinearConversionUnit for &quot;inch&quot; with respect to the referenceUnit &quot;metre&quot;, the <i>conversionFactor</i> would be 254/10000, because 0.0254 metre = 1 inch.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getLinearConversionUnit()
 * @model
 * @generated
 */
public interface LinearConversionUnit extends ConversionBasedUnit {
} // LinearConversionUnit
