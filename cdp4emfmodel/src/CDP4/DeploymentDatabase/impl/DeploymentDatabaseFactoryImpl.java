/**
 */
package CDP4.DeploymentDatabase.impl;

import CDP4.DeploymentDatabase.*;

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
public class DeploymentDatabaseFactoryImpl extends EFactoryImpl implements DeploymentDatabaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeploymentDatabaseFactory init() {
		try {
			DeploymentDatabaseFactory theDeploymentDatabaseFactory = (DeploymentDatabaseFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentDatabasePackage.eNS_URI);
			if (theDeploymentDatabaseFactory != null) {
				return theDeploymentDatabaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeploymentDatabaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDatabaseFactoryImpl() {
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
			case DeploymentDatabasePackage.SITE_RDL: return createSiteRDL();
			case DeploymentDatabasePackage.ENGINEERING_MODEL_DATA_BASE: return createEngineeringModelDataBase();
			case DeploymentDatabasePackage.SITE_DIRECTORY_DATA_BASE: return createSiteDirectoryDataBase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteRDL createSiteRDL() {
		SiteRDLImpl siteRDL = new SiteRDLImpl();
		return siteRDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelDataBase createEngineeringModelDataBase() {
		EngineeringModelDataBaseImpl engineeringModelDataBase = new EngineeringModelDataBaseImpl();
		return engineeringModelDataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataBase createSiteDirectoryDataBase() {
		SiteDirectoryDataBaseImpl siteDirectoryDataBase = new SiteDirectoryDataBaseImpl();
		return siteDirectoryDataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDatabasePackage getDeploymentDatabasePackage() {
		return (DeploymentDatabasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeploymentDatabasePackage getPackage() {
		return DeploymentDatabasePackage.eINSTANCE;
	}

} //DeploymentDatabaseFactoryImpl
