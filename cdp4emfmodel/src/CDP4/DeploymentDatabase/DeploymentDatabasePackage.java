/**
 */
package CDP4.DeploymentDatabase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CDP4.DeploymentDatabase.DeploymentDatabaseFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentDatabasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DeploymentDatabase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CDP4/DeploymentDatabase.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CDP4.DeploymentDatabase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentDatabasePackage eINSTANCE = CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl.init();

	/**
	 * The meta object id for the '{@link CDP4.DeploymentDatabase.impl.SiteRDLImpl <em>Site RDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DeploymentDatabase.impl.SiteRDLImpl
	 * @see CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl#getSiteRDL()
	 * @generated
	 */
	int SITE_RDL = 0;

	/**
	 * The number of structural features of the '<em>Site RDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_RDL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Site RDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_RDL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.DeploymentDatabase.impl.EngineeringModelDataBaseImpl <em>Engineering Model Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DeploymentDatabase.impl.EngineeringModelDataBaseImpl
	 * @see CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl#getEngineeringModelDataBase()
	 * @generated
	 */
	int ENGINEERING_MODEL_DATA_BASE = 1;

	/**
	 * The number of structural features of the '<em>Engineering Model Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Engineering Model Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.DeploymentDatabase.impl.SiteDirectoryDataBaseImpl <em>Site Directory Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DeploymentDatabase.impl.SiteDirectoryDataBaseImpl
	 * @see CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl#getSiteDirectoryDataBase()
	 * @generated
	 */
	int SITE_DIRECTORY_DATA_BASE = 2;

	/**
	 * The number of structural features of the '<em>Site Directory Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Site Directory Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_BASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CDP4.DeploymentDatabase.SiteRDL <em>Site RDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site RDL</em>'.
	 * @see CDP4.DeploymentDatabase.SiteRDL
	 * @generated
	 */
	EClass getSiteRDL();

	/**
	 * Returns the meta object for class '{@link CDP4.DeploymentDatabase.EngineeringModelDataBase <em>Engineering Model Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Model Data Base</em>'.
	 * @see CDP4.DeploymentDatabase.EngineeringModelDataBase
	 * @generated
	 */
	EClass getEngineeringModelDataBase();

	/**
	 * Returns the meta object for class '{@link CDP4.DeploymentDatabase.SiteDirectoryDataBase <em>Site Directory Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Directory Data Base</em>'.
	 * @see CDP4.DeploymentDatabase.SiteDirectoryDataBase
	 * @generated
	 */
	EClass getSiteDirectoryDataBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentDatabaseFactory getDeploymentDatabaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CDP4.DeploymentDatabase.impl.SiteRDLImpl <em>Site RDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DeploymentDatabase.impl.SiteRDLImpl
		 * @see CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl#getSiteRDL()
		 * @generated
		 */
		EClass SITE_RDL = eINSTANCE.getSiteRDL();

		/**
		 * The meta object literal for the '{@link CDP4.DeploymentDatabase.impl.EngineeringModelDataBaseImpl <em>Engineering Model Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DeploymentDatabase.impl.EngineeringModelDataBaseImpl
		 * @see CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl#getEngineeringModelDataBase()
		 * @generated
		 */
		EClass ENGINEERING_MODEL_DATA_BASE = eINSTANCE.getEngineeringModelDataBase();

		/**
		 * The meta object literal for the '{@link CDP4.DeploymentDatabase.impl.SiteDirectoryDataBaseImpl <em>Site Directory Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DeploymentDatabase.impl.SiteDirectoryDataBaseImpl
		 * @see CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl#getSiteDirectoryDataBase()
		 * @generated
		 */
		EClass SITE_DIRECTORY_DATA_BASE = eINSTANCE.getSiteDirectoryDataBase();

	}

} //DeploymentDatabasePackage
