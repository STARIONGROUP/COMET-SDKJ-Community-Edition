/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Unit</b></em>'.
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
 *       specialization of MeasurementUnit that represents a measurement unit that does not 
 *       depend on any other MeasurementUnit
 *     </p>
 * 
 *     <p>
 *       Note:&#160;Typically a base unit would be specified as a SimpleUnit, but it 
 *       is not mandatory that base units are specified as SimpleUnits. The 
 *       notable exception in SI&#160;is the &quot;kilogram&quot; that needs to be defined as a 
 *       PrefixedUnit that references the &quot;gram&quot; SimpleUnit as a <i>referenceUnit</i>.
 *     </p>
 * 
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSimpleUnit()
 * @model
 * @generated
 */
public interface SimpleUnit extends MeasurementUnit {
} // SimpleUnit
