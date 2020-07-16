/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Unit</b></em>'.
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
 *       specialization of MeasurementUnit that is defined as a product of powers of one or 
 *       more other measurement units
 *     </p>
 * 
 *     <p>
 *       Examples 1:&#160;The measurement unit &quot;metre per second&quot; for &quot;velocity&quot; 
 *       is specified as the product of &quot;metre&quot; to the power one times &quot;second&quot; 
 *       to the power minus one.
 *     </p>
 * 
 *     <p>
 *       Example 2:&#160;The measurement unit &quot;micrometre per metre&quot; for the 
 *       DerivedQuantityKind &quot;linear expansion coefficient&quot; is specified as the 
 *       product of (PrefixedUnit)&#160;&quot;micrometre&quot; to the power one times 
 *       (SimpleUnit)&#160;&quot;metre&quot; to the power minus one.
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
 *   <li>{@link CDP4.SiteDirectoryData.DerivedUnit#getUnitFactor <em>Unit Factor</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDerivedUnit()
 * @model
 * @generated
 */
public interface DerivedUnit extends MeasurementUnit {
	/**
	 * Returns the value of the '<em><b>Unit Factor</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.UnitFactor}.
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
	 * reference to one or more UnitFactors that define the product of powers of other MeasurementUnit(s) that defines this DerivedUnit
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Factor</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDerivedUnit_UnitFactor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UnitFactor> getUnitFactor();

} // DerivedUnit
