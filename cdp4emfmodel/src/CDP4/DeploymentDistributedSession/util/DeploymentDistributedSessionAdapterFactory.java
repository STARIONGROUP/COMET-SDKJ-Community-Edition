/**
 */
package CDP4.DeploymentDistributedSession.util;

import CDP4.DeploymentDistributedSession.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.DeploymentDistributedSession.DeploymentDistributedSessionPackage
 * @generated
 */
public class DeploymentDistributedSessionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeploymentDistributedSessionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDistributedSessionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeploymentDistributedSessionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentDistributedSessionSwitch<Adapter> modelSwitch =
		new DeploymentDistributedSessionSwitch<Adapter>() {
			@Override
			public Adapter caseConcurrentEngineeringSite(ConcurrentEngineeringSite object) {
				return createConcurrentEngineeringSiteAdapter();
			}
			@Override
			public Adapter caseDomainSpecificTool(DomainSpecificTool object) {
				return createDomainSpecificToolAdapter();
			}
			@Override
			public Adapter caseDomainSpecificToolAdapter(DomainSpecificToolAdapter object) {
				return createDomainSpecificToolAdapterAdapter();
			}
			@Override
			public Adapter caseDomainSpecificToolLib(DomainSpecificToolLib object) {
				return createDomainSpecificToolLibAdapter();
			}
			@Override
			public Adapter caseExcel(Excel object) {
				return createExcelAdapter();
			}
			@Override
			public Adapter caseExcel_AdministratorTool(Excel_AdministratorTool object) {
				return createExcel_AdministratorToolAdapter();
			}
			@Override
			public Adapter caseExcel_DesignTool(Excel_DesignTool object) {
				return createExcel_DesignToolAdapter();
			}
			@Override
			public Adapter caseFirewall(Firewall object) {
				return createFirewallAdapter();
			}
			@Override
			public Adapter caseWebServicesProcessor(WebServicesProcessor object) {
				return createWebServicesProcessorAdapter();
			}
			@Override
			public Adapter caseModelRDL(ModelRDL object) {
				return createModelRDLAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.ConcurrentEngineeringSite <em>Concurrent Engineering Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.ConcurrentEngineeringSite
	 * @generated
	 */
	public Adapter createConcurrentEngineeringSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.DomainSpecificTool <em>Domain Specific Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.DomainSpecificTool
	 * @generated
	 */
	public Adapter createDomainSpecificToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.DomainSpecificToolAdapter <em>Domain Specific Tool Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.DomainSpecificToolAdapter
	 * @generated
	 */
	public Adapter createDomainSpecificToolAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.DomainSpecificToolLib <em>Domain Specific Tool Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.DomainSpecificToolLib
	 * @generated
	 */
	public Adapter createDomainSpecificToolLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.Excel <em>Excel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.Excel
	 * @generated
	 */
	public Adapter createExcelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.Excel_AdministratorTool <em>Excel Administrator Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.Excel_AdministratorTool
	 * @generated
	 */
	public Adapter createExcel_AdministratorToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.Excel_DesignTool <em>Excel Design Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.Excel_DesignTool
	 * @generated
	 */
	public Adapter createExcel_DesignToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.Firewall <em>Firewall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.Firewall
	 * @generated
	 */
	public Adapter createFirewallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.WebServicesProcessor <em>Web Services Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.WebServicesProcessor
	 * @generated
	 */
	public Adapter createWebServicesProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DeploymentDistributedSession.ModelRDL <em>Model RDL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DeploymentDistributedSession.ModelRDL
	 * @generated
	 */
	public Adapter createModelRDLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DeploymentDistributedSessionAdapterFactory
