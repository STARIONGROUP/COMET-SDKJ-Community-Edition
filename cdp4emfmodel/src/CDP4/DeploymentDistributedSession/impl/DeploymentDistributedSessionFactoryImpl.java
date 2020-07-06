/**
 */
package CDP4.DeploymentDistributedSession.impl;

import CDP4.DeploymentDistributedSession.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentDistributedSessionFactoryImpl extends EFactoryImpl implements DeploymentDistributedSessionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentDistributedSessionFactory init() {
		try {
			DeploymentDistributedSessionFactory theDeploymentDistributedSessionFactory = (DeploymentDistributedSessionFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentDistributedSessionPackage.eNS_URI);
			if (theDeploymentDistributedSessionFactory != null) {
				return theDeploymentDistributedSessionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentDistributedSessionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDistributedSessionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeploymentDistributedSessionPackage.CONCURRENT_ENGINEERING_SITE: return createConcurrentEngineeringSite();
			case DeploymentDistributedSessionPackage.DOMAIN_SPECIFIC_TOOL: return createDomainSpecificTool();
			case DeploymentDistributedSessionPackage.DOMAIN_SPECIFIC_TOOL_ADAPTER: return createDomainSpecificToolAdapter();
			case DeploymentDistributedSessionPackage.DOMAIN_SPECIFIC_TOOL_LIB: return createDomainSpecificToolLib();
			case DeploymentDistributedSessionPackage.EXCEL_ADMINISTRATOR_TOOL: return createExcel_AdministratorTool();
			case DeploymentDistributedSessionPackage.EXCEL_DESIGN_TOOL: return createExcel_DesignTool();
			case DeploymentDistributedSessionPackage.FIREWALL: return createFirewall();
			case DeploymentDistributedSessionPackage.WEB_SERVICES_PROCESSOR: return createWebServicesProcessor();
			case DeploymentDistributedSessionPackage.MODEL_RDL: return createModelRDL();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentEngineeringSite createConcurrentEngineeringSite() {
		ConcurrentEngineeringSiteImpl concurrentEngineeringSite = new ConcurrentEngineeringSiteImpl();
		return concurrentEngineeringSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificTool createDomainSpecificTool() {
		DomainSpecificToolImpl domainSpecificTool = new DomainSpecificToolImpl();
		return domainSpecificTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificToolAdapter createDomainSpecificToolAdapter() {
		DomainSpecificToolAdapterImpl domainSpecificToolAdapter = new DomainSpecificToolAdapterImpl();
		return domainSpecificToolAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificToolLib createDomainSpecificToolLib() {
		DomainSpecificToolLibImpl domainSpecificToolLib = new DomainSpecificToolLibImpl();
		return domainSpecificToolLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Excel_AdministratorTool createExcel_AdministratorTool() {
		Excel_AdministratorToolImpl excel_AdministratorTool = new Excel_AdministratorToolImpl();
		return excel_AdministratorTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Excel_DesignTool createExcel_DesignTool() {
		Excel_DesignToolImpl excel_DesignTool = new Excel_DesignToolImpl();
		return excel_DesignTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Firewall createFirewall() {
		FirewallImpl firewall = new FirewallImpl();
		return firewall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebServicesProcessor createWebServicesProcessor() {
		WebServicesProcessorImpl webServicesProcessor = new WebServicesProcessorImpl();
		return webServicesProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRDL createModelRDL() {
		ModelRDLImpl modelRDL = new ModelRDLImpl();
		return modelRDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDistributedSessionPackage getDeploymentDistributedSessionPackage() {
		return (DeploymentDistributedSessionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentDistributedSessionPackage getPackage() {
		return DeploymentDistributedSessionPackage.eINSTANCE;
	}

} //DeploymentDistributedSessionFactoryImpl
