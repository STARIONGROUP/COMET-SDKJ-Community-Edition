/**
 */
package CDP4.DeploymentDistributedSession;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.DeploymentDistributedSession.DeploymentDistributedSessionPackage
 * @generated
 */
public interface DeploymentDistributedSessionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentDistributedSessionFactory eINSTANCE = CDP4.DeploymentDistributedSession.impl.DeploymentDistributedSessionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concurrent Engineering Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrent Engineering Site</em>'.
	 * @generated
	 */
	ConcurrentEngineeringSite createConcurrentEngineeringSite();

	/**
	 * Returns a new object of class '<em>Domain Specific Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Tool</em>'.
	 * @generated
	 */
	DomainSpecificTool createDomainSpecificTool();

	/**
	 * Returns a new object of class '<em>Domain Specific Tool Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Tool Adapter</em>'.
	 * @generated
	 */
	DomainSpecificToolAdapter createDomainSpecificToolAdapter();

	/**
	 * Returns a new object of class '<em>Domain Specific Tool Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Specific Tool Lib</em>'.
	 * @generated
	 */
	DomainSpecificToolLib createDomainSpecificToolLib();

	/**
	 * Returns a new object of class '<em>Excel Administrator Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel Administrator Tool</em>'.
	 * @generated
	 */
	Excel_AdministratorTool createExcel_AdministratorTool();

	/**
	 * Returns a new object of class '<em>Excel Design Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel Design Tool</em>'.
	 * @generated
	 */
	Excel_DesignTool createExcel_DesignTool();

	/**
	 * Returns a new object of class '<em>Firewall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firewall</em>'.
	 * @generated
	 */
	Firewall createFirewall();

	/**
	 * Returns a new object of class '<em>Web Services Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Services Processor</em>'.
	 * @generated
	 */
	WebServicesProcessor createWebServicesProcessor();

	/**
	 * Returns a new object of class '<em>Model RDL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model RDL</em>'.
	 * @generated
	 */
	ModelRDL createModelRDL();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentDistributedSessionPackage getDeploymentDistributedSessionPackage();

} //DeploymentDistributedSessionFactory
