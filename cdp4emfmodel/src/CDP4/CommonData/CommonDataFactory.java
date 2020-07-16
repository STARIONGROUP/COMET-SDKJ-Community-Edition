/**
 */
package CDP4.CommonData;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.CommonData.CommonDataPackage
 * @generated
 */
public interface CommonDataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonDataFactory eINSTANCE = CDP4.CommonData.impl.CommonDataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Content Type</em>'.
	 * @generated
	 */
	FileContentType createFileContentType();

	/**
	 * Returns a new object of class '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias</em>'.
	 * @generated
	 */
	Alias createAlias();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	Definition createDefinition();

	/**
	 * Returns a new object of class '<em>Citation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Citation</em>'.
	 * @generated
	 */
	Citation createCitation();

	/**
	 * Returns a new object of class '<em>Hyper Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hyper Link</em>'.
	 * @generated
	 */
	HyperLink createHyperLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonDataPackage getCommonDataPackage();

} //CommonDataFactory
