/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Quantity Kind</b></em>'.
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
 * specialization of QuantityKind that represents a kind of quantity that is defined as a product of powers of one or more other kinds of quantity
 *     </p>
 * 
 *     <p>
 * Note:&#160;A DerivedQuantityKind must define at least one <i>possibleScale</i>.
 *     </p>
 * 
 *     <p>
 * Examples 1: DerivedQuantityKind &quot;velocity&quot; can be specified as the product of SimpleQuantityKind &quot;length&quot; to the power one times SimpleQuantityKind &quot;time&quot; to the power minus one.
 *     </p>
 * 
 *     <p>
 * Example 2:&#160;DerivedQuantityKind &quot;linear expansion coefficient&quot; can be specified as the product of &quot;length&quot; to the power one times &quot;length&quot; to the power minus one. So, it is permissible to use the same QuantityKind more than once in the list of <i>quantityKindFactor</i>.
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
 *   <li>{@link CDP4.SiteDirectoryData.DerivedQuantityKind#getQuantityKindFactor <em>Quantity Kind Factor</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDerivedQuantityKind()
 * @model
 * @generated
 */
public interface DerivedQuantityKind extends QuantityKind {
	/**
	 * Returns the value of the '<em><b>Quantity Kind Factor</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.QuantityKindFactor}.
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
	 * reference to one or more QuantityKindFactors that define the product of powers of other kind(s) of quantity that define this DerivedQuantityKind
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Kind Factor</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDerivedQuantityKind_QuantityKindFactor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QuantityKindFactor> getQuantityKindFactor();

} // DerivedQuantityKind
