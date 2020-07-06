/**
 */
package CDP4.DeploymentDistributedSession.impl;

import CDP4.CommonData.CommonDataPackage;

import CDP4.CommonData.impl.CommonDataPackageImpl;

import CDP4.DeploymentDatabase.DeploymentDatabasePackage;

import CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl;

import CDP4.DeploymentDistributedSession.ConcurrentEngineeringSite;
import CDP4.DeploymentDistributedSession.DeploymentDistributedSessionFactory;
import CDP4.DeploymentDistributedSession.DeploymentDistributedSessionPackage;
import CDP4.DeploymentDistributedSession.DomainSpecificTool;
import CDP4.DeploymentDistributedSession.DomainSpecificToolAdapter;
import CDP4.DeploymentDistributedSession.DomainSpecificToolLib;
import CDP4.DeploymentDistributedSession.Excel;
import CDP4.DeploymentDistributedSession.Excel_AdministratorTool;
import CDP4.DeploymentDistributedSession.Excel_DesignTool;
import CDP4.DeploymentDistributedSession.Firewall;
import CDP4.DeploymentDistributedSession.ModelRDL;
import CDP4.DeploymentDistributedSession.WebServicesProcessor;

import CDP4.DiagramData.DiagramDataPackage;

import CDP4.DiagramData.impl.DiagramDataPackageImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;

import CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl;

import CDP4.ReportingData.ReportingDataPackage;

import CDP4.ReportingData.impl.ReportingDataPackageImpl;

import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentDistributedSessionPackageImpl extends EPackageImpl implements DeploymentDistributedSessionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrentEngineeringSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificToolAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificToolLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excel_AdministratorToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excel_DesignToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firewallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webServicesProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRDLEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CDP4.DeploymentDistributedSession.DeploymentDistributedSessionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentDistributedSessionPackageImpl() {
		super(eNS_URI, DeploymentDistributedSessionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DeploymentDistributedSessionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentDistributedSessionPackage init() {
		if (isInited) return (DeploymentDistributedSessionPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentDistributedSessionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeploymentDistributedSessionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeploymentDistributedSessionPackageImpl theDeploymentDistributedSessionPackage = registeredDeploymentDistributedSessionPackage instanceof DeploymentDistributedSessionPackageImpl ? (DeploymentDistributedSessionPackageImpl)registeredDeploymentDistributedSessionPackage : new DeploymentDistributedSessionPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDatabasePackage.eNS_URI);
		DeploymentDatabasePackageImpl theDeploymentDatabasePackage = (DeploymentDatabasePackageImpl)(registeredPackage instanceof DeploymentDatabasePackageImpl ? registeredPackage : DeploymentDatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SiteDirectoryDataPackage.eNS_URI);
		SiteDirectoryDataPackageImpl theSiteDirectoryDataPackage = (SiteDirectoryDataPackageImpl)(registeredPackage instanceof SiteDirectoryDataPackageImpl ? registeredPackage : SiteDirectoryDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonDataPackage.eNS_URI);
		CommonDataPackageImpl theCommonDataPackage = (CommonDataPackageImpl)(registeredPackage instanceof CommonDataPackageImpl ? registeredPackage : CommonDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReportingDataPackage.eNS_URI);
		ReportingDataPackageImpl theReportingDataPackage = (ReportingDataPackageImpl)(registeredPackage instanceof ReportingDataPackageImpl ? registeredPackage : ReportingDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EngineeringModelDataPackage.eNS_URI);
		EngineeringModelDataPackageImpl theEngineeringModelDataPackage = (EngineeringModelDataPackageImpl)(registeredPackage instanceof EngineeringModelDataPackageImpl ? registeredPackage : EngineeringModelDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiagramDataPackage.eNS_URI);
		DiagramDataPackageImpl theDiagramDataPackage = (DiagramDataPackageImpl)(registeredPackage instanceof DiagramDataPackageImpl ? registeredPackage : DiagramDataPackage.eINSTANCE);

		// Create package meta-data objects
		theDeploymentDistributedSessionPackage.createPackageContents();
		theDeploymentDatabasePackage.createPackageContents();
		theSiteDirectoryDataPackage.createPackageContents();
		theCommonDataPackage.createPackageContents();
		theReportingDataPackage.createPackageContents();
		theEngineeringModelDataPackage.createPackageContents();
		theDiagramDataPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentDistributedSessionPackage.initializePackageContents();
		theDeploymentDatabasePackage.initializePackageContents();
		theSiteDirectoryDataPackage.initializePackageContents();
		theCommonDataPackage.initializePackageContents();
		theReportingDataPackage.initializePackageContents();
		theEngineeringModelDataPackage.initializePackageContents();
		theDiagramDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentDistributedSessionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentDistributedSessionPackage.eNS_URI, theDeploymentDistributedSessionPackage);
		return theDeploymentDistributedSessionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcurrentEngineeringSite() {
		return concurrentEngineeringSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificTool() {
		return domainSpecificToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificToolAdapter() {
		return domainSpecificToolAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificToolLib() {
		return domainSpecificToolLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcel() {
		return excelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcel_AdministratorTool() {
		return excel_AdministratorToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcel_DesignTool() {
		return excel_DesignToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirewall() {
		return firewallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebServicesProcessor() {
		return webServicesProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRDL() {
		return modelRDLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDistributedSessionFactory getDeploymentDistributedSessionFactory() {
		return (DeploymentDistributedSessionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		concurrentEngineeringSiteEClass = createEClass(CONCURRENT_ENGINEERING_SITE);

		domainSpecificToolEClass = createEClass(DOMAIN_SPECIFIC_TOOL);

		domainSpecificToolAdapterEClass = createEClass(DOMAIN_SPECIFIC_TOOL_ADAPTER);

		domainSpecificToolLibEClass = createEClass(DOMAIN_SPECIFIC_TOOL_LIB);

		excelEClass = createEClass(EXCEL);

		excel_AdministratorToolEClass = createEClass(EXCEL_ADMINISTRATOR_TOOL);

		excel_DesignToolEClass = createEClass(EXCEL_DESIGN_TOOL);

		firewallEClass = createEClass(FIREWALL);

		webServicesProcessorEClass = createEClass(WEB_SERVICES_PROCESSOR);

		modelRDLEClass = createEClass(MODEL_RDL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(concurrentEngineeringSiteEClass, ConcurrentEngineeringSite.class, "ConcurrentEngineeringSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainSpecificToolEClass, DomainSpecificTool.class, "DomainSpecificTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainSpecificToolAdapterEClass, DomainSpecificToolAdapter.class, "DomainSpecificToolAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainSpecificToolLibEClass, DomainSpecificToolLib.class, "DomainSpecificToolLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excelEClass, Excel.class, "Excel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excel_AdministratorToolEClass, Excel_AdministratorTool.class, "Excel_AdministratorTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excel_DesignToolEClass, Excel_DesignTool.class, "Excel_DesignTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firewallEClass, Firewall.class, "Firewall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webServicesProcessorEClass, WebServicesProcessor.class, "WebServicesProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelRDLEClass, ModelRDL.class, "ModelRDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (excel_AdministratorToolEClass,
		   source,
		   new String[] {
			   "originalName", "AdministratorTool"
		   });
		addAnnotation
		  (excel_DesignToolEClass,
		   source,
		   new String[] {
			   "originalName", "DesignTool"
		   });
	}

} //DeploymentDistributedSessionPackageImpl
