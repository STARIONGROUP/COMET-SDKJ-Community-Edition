/**
 */
package CDP4.DeploymentDatabase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.DeploymentDatabase.DeploymentDatabasePackage
 * @generated
 */
public interface DeploymentDatabaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentDatabaseFactory eINSTANCE = CDP4.DeploymentDatabase.impl.DeploymentDatabaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Site RDL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site RDL</em>'.
	 * @generated
	 */
	SiteRDL createSiteRDL();

	/**
	 * Returns a new object of class '<em>Engineering Model Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engineering Model Data Base</em>'.
	 * @generated
	 */
	EngineeringModelDataBase createEngineeringModelDataBase();

	/**
	 * Returns a new object of class '<em>Site Directory Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site Directory Data Base</em>'.
	 * @generated
	 */
	SiteDirectoryDataBase createSiteDirectoryDataBase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentDatabasePackage getDeploymentDatabasePackage();

} //DeploymentDatabaseFactory
