/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.CommonDataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataFactory
 * @model kind="package"
 * @generated
 */
public interface SiteDirectoryDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SiteDirectoryData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CDP4/SiteDirectoryData.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CDP4.SiteDirectoryData";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SiteDirectoryDataPackage eINSTANCE = CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ParticipantPermissionImpl <em>Participant Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ParticipantPermissionImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParticipantPermission()
	 * @generated
	 */
	int PARTICIPANT_PERMISSION = 0;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__IS_DEPRECATED = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__ACCESS_RIGHT = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION__OBJECT_CLASS = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Participant Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Participant Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_PERMISSION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl <em>Reference Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ReferenceSourceImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getReferenceSource()
	 * @generated
	 */
	int REFERENCE_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__VERSION_IDENTIFIER = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__VERSION_DATE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__AUTHOR = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Publication Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__PUBLICATION_YEAR = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__PUBLISHER = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Published In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__PUBLISHED_IN = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE__LANGUAGE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Reference Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Reference Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SOURCE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.CategorizableThingImpl <em>Categorizable Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.CategorizableThingImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getCategorizableThing()
	 * @generated
	 */
	int CATEGORIZABLE_THING = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZABLE_THING__CATEGORY = 0;

	/**
	 * The number of structural features of the '<em>Categorizable Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZABLE_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Categorizable Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZABLE_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.CategoryImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUPER_CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Permissible Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PERMISSIBLE_CLASS = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_ABSTRACT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Super Sub Graph Is Acyclic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___SUPER_SUB_GRAPH_IS_ACYCLIC__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Supershelperoperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_ALL_SUPERSHELPEROPERATION__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.OrganizationImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__IS_DEPRECATED = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.PersonImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_DEPRECATED = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORGANIZATION = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GIVEN_NAME = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SURNAME = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Organizational Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORGANIZATIONAL_UNIT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL_ADDRESS = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Telephone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TELEPHONE_NUMBER = CommonDataPackage.THING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEFAULT_DOMAIN = CommonDataPackage.THING_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_ACTIVE = CommonDataPackage.THING_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLE = CommonDataPackage.THING_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSWORD = CommonDataPackage.THING_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Salt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SALT = CommonDataPackage.THING_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Default Email Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEFAULT_EMAIL_ADDRESS = CommonDataPackage.THING_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Default Telephone Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEFAULT_TELEPHONE_NUMBER = CommonDataPackage.THING_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>User Preference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__USER_PREFERENCE = CommonDataPackage.THING_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.EmailAddressImpl <em>Email Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.EmailAddressImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEmailAddress()
	 * @generated
	 */
	int EMAIL_ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Vcard Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__VCARD_TYPE = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS__VALUE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Email Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Email Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.TelephoneNumberImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getTelephoneNumber()
	 * @generated
	 */
	int TELEPHONE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Vcard Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__VCARD_TYPE = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__VALUE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.DomainOfExpertiseImpl <em>Domain Of Expertise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.DomainOfExpertiseImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDomainOfExpertise()
	 * @generated
	 */
	int DOMAIN_OF_EXPERTISE = 8;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Of Expertise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Domain Of Expertise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.PersonRoleImpl <em>Person Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.PersonRoleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getPersonRole()
	 * @generated
	 */
	int PERSON_ROLE = 9;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE__PERSON_PERMISSION = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Person Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ROLE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.PersonPermissionImpl <em>Person Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.PersonPermissionImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getPersonPermission()
	 * @generated
	 */
	int PERSON_PERMISSION = 10;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__IS_DEPRECATED = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__ACCESS_RIGHT = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION__OBJECT_CLASS = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Person Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_PERMISSION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.UserPreferenceImpl <em>User Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.UserPreferenceImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getUserPreference()
	 * @generated
	 */
	int USER_PREFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__VALUE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl <em>Site Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSiteDirectory()
	 * @generated
	 */
	int SITE_DIRECTORY = 12;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__IID = CommonDataPackage.TOP_CONTAINER__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__REVISION_NUMBER = CommonDataPackage.TOP_CONTAINER__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__CLASS_KIND = CommonDataPackage.TOP_CONTAINER__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__MODIFIED_ON = CommonDataPackage.TOP_CONTAINER__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__EXCLUDED_PERSON = CommonDataPackage.TOP_CONTAINER__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__EXCLUDED_DOMAIN = CommonDataPackage.TOP_CONTAINER__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Last Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__LAST_MODIFIED_ON = CommonDataPackage.TOP_CONTAINER__LAST_MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__NAME = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__SHORT_NAME = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__CREATED_ON = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__ORGANIZATION = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__PERSON = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__PARTICIPANT_ROLE = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Participant Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Site Reference Data Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__MODEL = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Person Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__PERSON_ROLE = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Person Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__DEFAULT_PERSON_ROLE = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Log Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__LOG_ENTRY = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Domain Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__DOMAIN_GROUP = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__DOMAIN = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Natural Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__NATURAL_LANGUAGE = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY__ANNOTATION = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Site Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_FEATURE_COUNT = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Site Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_OPERATION_COUNT = CommonDataPackage.TOP_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ParticipantRoleImpl <em>Participant Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ParticipantRoleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParticipantRole()
	 * @generated
	 */
	int PARTICIPANT_ROLE = 13;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE__PARTICIPANT_PERMISSION = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Participant Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Participant Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ROLE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl <em>Reference Data Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getReferenceDataLibrary()
	 * @generated
	 */
	int REFERENCE_DATA_LIBRARY = 15;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Defined Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__PARAMETER_TYPE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Quantity Kind</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__SCALE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__UNIT_PREFIX = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__UNIT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__BASE_UNIT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__FILE_TYPE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__GLOSSARY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reference Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__RULE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Required Rdl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__REQUIRED_RDL = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY__CONSTANT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Reference Data Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Parameter Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Unique Parameter Type Short Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Unique Category Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_NAMES__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Unique Category Short Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reference Data Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_DATA_LIBRARY_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.SiteReferenceDataLibraryImpl <em>Site Reference Data Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.SiteReferenceDataLibraryImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSiteReferenceDataLibrary()
	 * @generated
	 */
	int SITE_REFERENCE_DATA_LIBRARY = 14;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__IID = REFERENCE_DATA_LIBRARY__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__REVISION_NUMBER = REFERENCE_DATA_LIBRARY__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__CLASS_KIND = REFERENCE_DATA_LIBRARY__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__MODIFIED_ON = REFERENCE_DATA_LIBRARY__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__EXCLUDED_PERSON = REFERENCE_DATA_LIBRARY__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__EXCLUDED_DOMAIN = REFERENCE_DATA_LIBRARY__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__NAME = REFERENCE_DATA_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__SHORT_NAME = REFERENCE_DATA_LIBRARY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__ALIAS = REFERENCE_DATA_LIBRARY__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__DEFINITION = REFERENCE_DATA_LIBRARY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__HYPER_LINK = REFERENCE_DATA_LIBRARY__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Defined Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY = REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__PARAMETER_TYPE = REFERENCE_DATA_LIBRARY__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Base Quantity Kind</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND = REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__SCALE = REFERENCE_DATA_LIBRARY__SCALE;

	/**
	 * The feature id for the '<em><b>Unit Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__UNIT_PREFIX = REFERENCE_DATA_LIBRARY__UNIT_PREFIX;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__UNIT = REFERENCE_DATA_LIBRARY__UNIT;

	/**
	 * The feature id for the '<em><b>Base Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__BASE_UNIT = REFERENCE_DATA_LIBRARY__BASE_UNIT;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__FILE_TYPE = REFERENCE_DATA_LIBRARY__FILE_TYPE;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__GLOSSARY = REFERENCE_DATA_LIBRARY__GLOSSARY;

	/**
	 * The feature id for the '<em><b>Reference Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE = REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__RULE = REFERENCE_DATA_LIBRARY__RULE;

	/**
	 * The feature id for the '<em><b>Required Rdl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__REQUIRED_RDL = REFERENCE_DATA_LIBRARY__REQUIRED_RDL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__CONSTANT = REFERENCE_DATA_LIBRARY__CONSTANT;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY__IS_DEPRECATED = REFERENCE_DATA_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site Reference Data Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY_FEATURE_COUNT = REFERENCE_DATA_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Parameter Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Parameter Type Short Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Category Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_NAMES__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Category Short Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_SHORT_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Site Reference Data Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_REFERENCE_DATA_LIBRARY_OPERATION_COUNT = REFERENCE_DATA_LIBRARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ParticipantAffectedAccessThingImpl <em>Participant Affected Access Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ParticipantAffectedAccessThingImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParticipantAffectedAccessThing()
	 * @generated
	 */
	int PARTICIPANT_AFFECTED_ACCESS_THING = 16;

	/**
	 * The number of structural features of the '<em>Participant Affected Access Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_AFFECTED_ACCESS_THING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Participant Affected Access Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_AFFECTED_ACCESS_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__NUMBER_OF_VALUES = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__SYMBOL = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ScalarParameterTypeImpl <em>Scalar Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ScalarParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getScalarParameterType()
	 * @generated
	 */
	int SCALAR_PARAMETER_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__IID = PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__REVISION_NUMBER = PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__CLASS_KIND = PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__MODIFIED_ON = PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__EXCLUDED_PERSON = PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__EXCLUDED_DOMAIN = PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__NAME = PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__SHORT_NAME = PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__ALIAS = PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__DEFINITION = PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__HYPER_LINK = PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__CATEGORY = PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__IS_DEPRECATED = PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__NUMBER_OF_VALUES = PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE__SYMBOL = PARAMETER_TYPE__SYMBOL;

	/**
	 * The number of structural features of the '<em>Scalar Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scalar Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_PARAMETER_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.QuantityKindImpl <em>Quantity Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.QuantityKindImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getQuantityKind()
	 * @generated
	 */
	int QUANTITY_KIND = 18;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__IID = SCALAR_PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__REVISION_NUMBER = SCALAR_PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__CLASS_KIND = SCALAR_PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__MODIFIED_ON = SCALAR_PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__EXCLUDED_PERSON = SCALAR_PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__EXCLUDED_DOMAIN = SCALAR_PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__NAME = SCALAR_PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__SHORT_NAME = SCALAR_PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__ALIAS = SCALAR_PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__DEFINITION = SCALAR_PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__HYPER_LINK = SCALAR_PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__CATEGORY = SCALAR_PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__IS_DEPRECATED = SCALAR_PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__NUMBER_OF_VALUES = SCALAR_PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__SYMBOL = SCALAR_PARAMETER_TYPE__SYMBOL;

	/**
	 * The feature id for the '<em><b>Possible Scale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__POSSIBLE_SCALE = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__DEFAULT_SCALE = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Possible Scale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__ALL_POSSIBLE_SCALE = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Exponent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FEATURE_COUNT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_OPERATION_COUNT = SCALAR_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl <em>Measurement Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.MeasurementScaleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getMeasurementScale()
	 * @generated
	 */
	int MEASUREMENT_SCALE = 20;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__UNIT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__VALUE_DEFINITION = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__NUMBER_SET = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Minimum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maximum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Maximum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Positive Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Negative Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mapping To Reference Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Measurement Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Measurement Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_SCALE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.MeasurementUnitImpl <em>Measurement Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.MeasurementUnitImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getMeasurementUnit()
	 * @generated
	 */
	int MEASUREMENT_UNIT = 21;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Measurement Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNIT_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ScaleValueDefinitionImpl <em>Scale Value Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ScaleValueDefinitionImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getScaleValueDefinition()
	 * @generated
	 */
	int SCALE_VALUE_DEFINITION = 22;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION__VALUE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scale Value Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Scale Value Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_VALUE_DEFINITION_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.MappingToReferenceScaleImpl <em>Mapping To Reference Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.MappingToReferenceScaleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getMappingToReferenceScale()
	 * @generated
	 */
	int MAPPING_TO_REFERENCE_SCALE = 23;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Reference Scale Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependent Scale Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping To Reference Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mapping To Reference Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TO_REFERENCE_SCALE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.UnitPrefixImpl <em>Unit Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.UnitPrefixImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getUnitPrefix()
	 * @generated
	 */
	int UNIT_PREFIX = 24;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX__CONVERSION_FACTOR = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Unit Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_PREFIX_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.FileTypeImpl <em>File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.FileTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE__EXTENSION = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.GlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.GlossaryImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getGlossary()
	 * @generated
	 */
	int GLOSSARY = 26;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__TERM = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.TermImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 27;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.RuleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 28;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ConstantImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 29;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__PARAMETER_TYPE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__SCALE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl <em>Engineering Model Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEngineeringModelSetup()
	 * @generated
	 */
	int ENGINEERING_MODEL_SETUP = 30;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__PARTICIPANT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__ACTIVE_DOMAIN = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__KIND = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Study Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__STUDY_PHASE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Rdl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__REQUIRED_RDL = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Engineering Model Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__ENGINEERING_MODEL_IID = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Iteration Setup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__ITERATION_SETUP = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Engineering Model Setup Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP__SOURCE_ENGINEERING_MODEL_SETUP_IID = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Engineering Model Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Engineering Model Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_SETUP_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ParticipantImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 31;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__IS_ACTIVE = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PERSON = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ROLE = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DOMAIN = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selected Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SELECTED_DOMAIN = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ModelReferenceDataLibraryImpl <em>Model Reference Data Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ModelReferenceDataLibraryImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getModelReferenceDataLibrary()
	 * @generated
	 */
	int MODEL_REFERENCE_DATA_LIBRARY = 32;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__IID = REFERENCE_DATA_LIBRARY__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__REVISION_NUMBER = REFERENCE_DATA_LIBRARY__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__CLASS_KIND = REFERENCE_DATA_LIBRARY__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__MODIFIED_ON = REFERENCE_DATA_LIBRARY__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__EXCLUDED_PERSON = REFERENCE_DATA_LIBRARY__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__EXCLUDED_DOMAIN = REFERENCE_DATA_LIBRARY__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__NAME = REFERENCE_DATA_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__SHORT_NAME = REFERENCE_DATA_LIBRARY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__ALIAS = REFERENCE_DATA_LIBRARY__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__DEFINITION = REFERENCE_DATA_LIBRARY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__HYPER_LINK = REFERENCE_DATA_LIBRARY__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Defined Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY = REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__PARAMETER_TYPE = REFERENCE_DATA_LIBRARY__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Base Quantity Kind</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND = REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__SCALE = REFERENCE_DATA_LIBRARY__SCALE;

	/**
	 * The feature id for the '<em><b>Unit Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__UNIT_PREFIX = REFERENCE_DATA_LIBRARY__UNIT_PREFIX;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__UNIT = REFERENCE_DATA_LIBRARY__UNIT;

	/**
	 * The feature id for the '<em><b>Base Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__BASE_UNIT = REFERENCE_DATA_LIBRARY__BASE_UNIT;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__FILE_TYPE = REFERENCE_DATA_LIBRARY__FILE_TYPE;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__GLOSSARY = REFERENCE_DATA_LIBRARY__GLOSSARY;

	/**
	 * The feature id for the '<em><b>Reference Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE = REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__RULE = REFERENCE_DATA_LIBRARY__RULE;

	/**
	 * The feature id for the '<em><b>Required Rdl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__REQUIRED_RDL = REFERENCE_DATA_LIBRARY__REQUIRED_RDL;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY__CONSTANT = REFERENCE_DATA_LIBRARY__CONSTANT;

	/**
	 * The number of structural features of the '<em>Model Reference Data Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY_FEATURE_COUNT = REFERENCE_DATA_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Parameter Type Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Parameter Type Short Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Category Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_NAMES__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Category Short Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_SHORT_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Model Reference Data Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_DATA_LIBRARY_OPERATION_COUNT = REFERENCE_DATA_LIBRARY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl <em>Iteration Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.IterationSetupImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getIterationSetup()
	 * @generated
	 */
	int ITERATION_SETUP = 33;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iteration Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__ITERATION_IID = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iteration Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__ITERATION_NUMBER = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__DESCRIPTION = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Iteration Setup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__SOURCE_ITERATION_SETUP = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frozen On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__FROZEN_ON = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP__IS_DELETED = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Iteration Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Iteration Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_SETUP_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.SiteLogEntryImpl <em>Site Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.SiteLogEntryImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSiteLogEntry()
	 * @generated
	 */
	int SITE_LOG_ENTRY = 34;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__AUTHOR = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affected Item Iid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__AFFECTED_ITEM_IID = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__LEVEL = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__LANGUAGE_CODE = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__CONTENT = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__CATEGORY = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Site Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Site Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOG_ENTRY_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.DomainOfExpertiseGroupImpl <em>Domain Of Expertise Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.DomainOfExpertiseGroupImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDomainOfExpertiseGroup()
	 * @generated
	 */
	int DOMAIN_OF_EXPERTISE_GROUP = 35;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__IS_DEPRECATED = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP__DOMAIN = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Of Expertise Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Domain Of Expertise Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OF_EXPERTISE_GROUP_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.NaturalLanguageImpl <em>Natural Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.NaturalLanguageImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getNaturalLanguage()
	 * @generated
	 */
	int NATURAL_LANGUAGE = 36;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__LANGUAGE_CODE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Native Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE__NATIVE_NAME = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Natural Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Natural Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl <em>Binary Relationship Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getBinaryRelationshipRule()
	 * @generated
	 */
	int BINARY_RELATIONSHIP_RULE = 37;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__IID = RULE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__REVISION_NUMBER = RULE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__CLASS_KIND = RULE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__MODIFIED_ON = RULE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__EXCLUDED_PERSON = RULE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__EXCLUDED_DOMAIN = RULE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__SHORT_NAME = RULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__ALIAS = RULE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__DEFINITION = RULE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__HYPER_LINK = RULE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__IS_DEPRECATED = RULE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Relationship Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Forward Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__FORWARD_RELATIONSHIP_NAME = RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inverse Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE__INVERSE_RELATIONSHIP_NAME = RULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binary Relationship Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Binary Relationship Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.CompoundParameterTypeImpl <em>Compound Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.CompoundParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getCompoundParameterType()
	 * @generated
	 */
	int COMPOUND_PARAMETER_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__IID = PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__REVISION_NUMBER = PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__CLASS_KIND = PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__MODIFIED_ON = PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__EXCLUDED_PERSON = PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__EXCLUDED_DOMAIN = PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__NAME = PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__SHORT_NAME = PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__ALIAS = PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__DEFINITION = PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__HYPER_LINK = PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__CATEGORY = PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__IS_DEPRECATED = PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__NUMBER_OF_VALUES = PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__SYMBOL = PARAMETER_TYPE__SYMBOL;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__COMPONENT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Finalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE__IS_FINALIZED = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compound Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Compound Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_PARAMETER_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ArrayParameterTypeImpl <em>Array Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ArrayParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getArrayParameterType()
	 * @generated
	 */
	int ARRAY_PARAMETER_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__IID = COMPOUND_PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__REVISION_NUMBER = COMPOUND_PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__CLASS_KIND = COMPOUND_PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__MODIFIED_ON = COMPOUND_PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__EXCLUDED_PERSON = COMPOUND_PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__EXCLUDED_DOMAIN = COMPOUND_PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__NAME = COMPOUND_PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__SHORT_NAME = COMPOUND_PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__ALIAS = COMPOUND_PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__DEFINITION = COMPOUND_PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__HYPER_LINK = COMPOUND_PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__CATEGORY = COMPOUND_PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__IS_DEPRECATED = COMPOUND_PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__NUMBER_OF_VALUES = COMPOUND_PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__SYMBOL = COMPOUND_PARAMETER_TYPE__SYMBOL;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__COMPONENT = COMPOUND_PARAMETER_TYPE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Is Finalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__IS_FINALIZED = COMPOUND_PARAMETER_TYPE__IS_FINALIZED;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__DIMENSION = COMPOUND_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Tensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__IS_TENSOR = COMPOUND_PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Single Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__HAS_SINGLE_COMPONENT_TYPE = COMPOUND_PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE__RANK = COMPOUND_PARAMETER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Array Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_FEATURE_COUNT = COMPOUND_PARAMETER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = COMPOUND_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = COMPOUND_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Valid Number Of Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE___HAS_VALID_NUMBER_OF_COMPONENTS__DIAGNOSTICCHAIN_MAP = COMPOUND_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Array Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PARAMETER_TYPE_OPERATION_COUNT = COMPOUND_PARAMETER_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ParameterTypeComponentImpl <em>Parameter Type Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ParameterTypeComponentImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParameterTypeComponent()
	 * @generated
	 */
	int PARAMETER_TYPE_COMPONENT = 40;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT__SCALE = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Type Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Valid Scale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT___HAS_VALID_SCALE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Type Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_COMPONENT_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.RatioScaleImpl <em>Ratio Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.RatioScaleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getRatioScale()
	 * @generated
	 */
	int RATIO_SCALE = 42;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__IID = MEASUREMENT_SCALE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__REVISION_NUMBER = MEASUREMENT_SCALE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__CLASS_KIND = MEASUREMENT_SCALE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__MODIFIED_ON = MEASUREMENT_SCALE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__EXCLUDED_PERSON = MEASUREMENT_SCALE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__EXCLUDED_DOMAIN = MEASUREMENT_SCALE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__NAME = MEASUREMENT_SCALE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__SHORT_NAME = MEASUREMENT_SCALE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__ALIAS = MEASUREMENT_SCALE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__DEFINITION = MEASUREMENT_SCALE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__HYPER_LINK = MEASUREMENT_SCALE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__IS_DEPRECATED = MEASUREMENT_SCALE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__UNIT = MEASUREMENT_SCALE__UNIT;

	/**
	 * The feature id for the '<em><b>Value Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__VALUE_DEFINITION = MEASUREMENT_SCALE__VALUE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Number Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__NUMBER_SET = MEASUREMENT_SCALE__NUMBER_SET;

	/**
	 * The feature id for the '<em><b>Minimum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__MINIMUM_PERMISSIBLE_VALUE = MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Minimum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__IS_MINIMUM_INCLUSIVE = MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Maximum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__MAXIMUM_PERMISSIBLE_VALUE = MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Maximum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__IS_MAXIMUM_INCLUSIVE = MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Positive Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__POSITIVE_VALUE_CONNOTATION = MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Negative Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__NEGATIVE_VALUE_CONNOTATION = MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Mapping To Reference Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE__MAPPING_TO_REFERENCE_SCALE = MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE;

	/**
	 * The number of structural features of the '<em>Ratio Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE_FEATURE_COUNT = MEASUREMENT_SCALE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Ratio Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_SCALE_OPERATION_COUNT = MEASUREMENT_SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.CyclicRatioScaleImpl <em>Cyclic Ratio Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.CyclicRatioScaleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getCyclicRatioScale()
	 * @generated
	 */
	int CYCLIC_RATIO_SCALE = 41;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__IID = RATIO_SCALE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__REVISION_NUMBER = RATIO_SCALE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__CLASS_KIND = RATIO_SCALE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__MODIFIED_ON = RATIO_SCALE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__EXCLUDED_PERSON = RATIO_SCALE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__EXCLUDED_DOMAIN = RATIO_SCALE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__NAME = RATIO_SCALE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__SHORT_NAME = RATIO_SCALE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__ALIAS = RATIO_SCALE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__DEFINITION = RATIO_SCALE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__HYPER_LINK = RATIO_SCALE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__IS_DEPRECATED = RATIO_SCALE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__UNIT = RATIO_SCALE__UNIT;

	/**
	 * The feature id for the '<em><b>Value Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__VALUE_DEFINITION = RATIO_SCALE__VALUE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Number Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__NUMBER_SET = RATIO_SCALE__NUMBER_SET;

	/**
	 * The feature id for the '<em><b>Minimum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__MINIMUM_PERMISSIBLE_VALUE = RATIO_SCALE__MINIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Minimum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__IS_MINIMUM_INCLUSIVE = RATIO_SCALE__IS_MINIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Maximum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__MAXIMUM_PERMISSIBLE_VALUE = RATIO_SCALE__MAXIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Maximum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__IS_MAXIMUM_INCLUSIVE = RATIO_SCALE__IS_MAXIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Positive Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__POSITIVE_VALUE_CONNOTATION = RATIO_SCALE__POSITIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Negative Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__NEGATIVE_VALUE_CONNOTATION = RATIO_SCALE__NEGATIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Mapping To Reference Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__MAPPING_TO_REFERENCE_SCALE = RATIO_SCALE__MAPPING_TO_REFERENCE_SCALE;

	/**
	 * The feature id for the '<em><b>Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE__MODULUS = RATIO_SCALE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cyclic Ratio Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE_FEATURE_COUNT = RATIO_SCALE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = RATIO_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = RATIO_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Cyclic Ratio Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_RATIO_SCALE_OPERATION_COUNT = RATIO_SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.EnumerationParameterTypeImpl <em>Enumeration Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.EnumerationParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEnumerationParameterType()
	 * @generated
	 */
	int ENUMERATION_PARAMETER_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__IID = SCALAR_PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__REVISION_NUMBER = SCALAR_PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__CLASS_KIND = SCALAR_PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__MODIFIED_ON = SCALAR_PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__EXCLUDED_PERSON = SCALAR_PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__EXCLUDED_DOMAIN = SCALAR_PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__NAME = SCALAR_PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__SHORT_NAME = SCALAR_PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__ALIAS = SCALAR_PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__DEFINITION = SCALAR_PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__HYPER_LINK = SCALAR_PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__CATEGORY = SCALAR_PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__IS_DEPRECATED = SCALAR_PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__NUMBER_OF_VALUES = SCALAR_PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__SYMBOL = SCALAR_PARAMETER_TYPE__SYMBOL;

	/**
	 * The feature id for the '<em><b>Allow Multi Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__ALLOW_MULTI_SELECT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE_FEATURE_COUNT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Enumeration Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_PARAMETER_TYPE_OPERATION_COUNT = SCALAR_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.EnumerationValueDefinitionImpl <em>Enumeration Value Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.EnumerationValueDefinitionImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEnumerationValueDefinition()
	 * @generated
	 */
	int ENUMERATION_VALUE_DEFINITION = 44;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The number of structural features of the '<em>Enumeration Value Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Enumeration Value Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_DEFINITION_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.OrdinalScaleImpl <em>Ordinal Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.OrdinalScaleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getOrdinalScale()
	 * @generated
	 */
	int ORDINAL_SCALE = 45;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__IID = MEASUREMENT_SCALE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__REVISION_NUMBER = MEASUREMENT_SCALE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__CLASS_KIND = MEASUREMENT_SCALE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__MODIFIED_ON = MEASUREMENT_SCALE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__EXCLUDED_PERSON = MEASUREMENT_SCALE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__EXCLUDED_DOMAIN = MEASUREMENT_SCALE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__NAME = MEASUREMENT_SCALE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__SHORT_NAME = MEASUREMENT_SCALE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__ALIAS = MEASUREMENT_SCALE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__DEFINITION = MEASUREMENT_SCALE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__HYPER_LINK = MEASUREMENT_SCALE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__IS_DEPRECATED = MEASUREMENT_SCALE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__UNIT = MEASUREMENT_SCALE__UNIT;

	/**
	 * The feature id for the '<em><b>Value Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__VALUE_DEFINITION = MEASUREMENT_SCALE__VALUE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Number Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__NUMBER_SET = MEASUREMENT_SCALE__NUMBER_SET;

	/**
	 * The feature id for the '<em><b>Minimum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__MINIMUM_PERMISSIBLE_VALUE = MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Minimum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__IS_MINIMUM_INCLUSIVE = MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Maximum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__MAXIMUM_PERMISSIBLE_VALUE = MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Maximum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__IS_MAXIMUM_INCLUSIVE = MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Positive Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__POSITIVE_VALUE_CONNOTATION = MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Negative Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__NEGATIVE_VALUE_CONNOTATION = MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Mapping To Reference Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__MAPPING_TO_REFERENCE_SCALE = MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE;

	/**
	 * The feature id for the '<em><b>Use Short Name Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE__USE_SHORT_NAME_VALUES = MEASUREMENT_SCALE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordinal Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE_FEATURE_COUNT = MEASUREMENT_SCALE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Ordinal Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALE_OPERATION_COUNT = MEASUREMENT_SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ReferencerRuleImpl <em>Referencer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ReferencerRuleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getReferencerRule()
	 * @generated
	 */
	int REFERENCER_RULE = 46;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__IID = RULE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__REVISION_NUMBER = RULE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__CLASS_KIND = RULE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__MODIFIED_ON = RULE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__EXCLUDED_PERSON = RULE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__EXCLUDED_DOMAIN = RULE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__SHORT_NAME = RULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__ALIAS = RULE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__DEFINITION = RULE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__HYPER_LINK = RULE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__IS_DEPRECATED = RULE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Referencing Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__REFERENCING_CATEGORY = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__REFERENCED_CATEGORY = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Referenced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__MIN_REFERENCED = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Referenced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE__MAX_REFERENCED = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Referencer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Referencer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCER_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.BooleanParameterTypeImpl <em>Boolean Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.BooleanParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getBooleanParameterType()
	 * @generated
	 */
	int BOOLEAN_PARAMETER_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__IID = SCALAR_PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__REVISION_NUMBER = SCALAR_PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__CLASS_KIND = SCALAR_PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__MODIFIED_ON = SCALAR_PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__EXCLUDED_PERSON = SCALAR_PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__EXCLUDED_DOMAIN = SCALAR_PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__NAME = SCALAR_PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__SHORT_NAME = SCALAR_PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__ALIAS = SCALAR_PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__DEFINITION = SCALAR_PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__HYPER_LINK = SCALAR_PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__CATEGORY = SCALAR_PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__IS_DEPRECATED = SCALAR_PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__NUMBER_OF_VALUES = SCALAR_PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE__SYMBOL = SCALAR_PARAMETER_TYPE__SYMBOL;

	/**
	 * The number of structural features of the '<em>Boolean Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE_FEATURE_COUNT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Boolean Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PARAMETER_TYPE_OPERATION_COUNT = SCALAR_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ScaleReferenceQuantityValueImpl <em>Scale Reference Quantity Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ScaleReferenceQuantityValueImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getScaleReferenceQuantityValue()
	 * @generated
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE = 48;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE__SCALE = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE__VALUE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scale Reference Quantity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Scale Reference Quantity Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REFERENCE_QUANTITY_VALUE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.DateParameterTypeImpl <em>Date Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.DateParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDateParameterType()
	 * @generated
	 */
	int DATE_PARAMETER_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__IID = SCALAR_PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__REVISION_NUMBER = SCALAR_PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__CLASS_KIND = SCALAR_PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__MODIFIED_ON = SCALAR_PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__EXCLUDED_PERSON = SCALAR_PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__EXCLUDED_DOMAIN = SCALAR_PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__NAME = SCALAR_PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__SHORT_NAME = SCALAR_PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__ALIAS = SCALAR_PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__DEFINITION = SCALAR_PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__HYPER_LINK = SCALAR_PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__CATEGORY = SCALAR_PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__IS_DEPRECATED = SCALAR_PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__NUMBER_OF_VALUES = SCALAR_PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE__SYMBOL = SCALAR_PARAMETER_TYPE__SYMBOL;

	/**
	 * The number of structural features of the '<em>Date Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE_FEATURE_COUNT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Date Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PARAMETER_TYPE_OPERATION_COUNT = SCALAR_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ConversionBasedUnitImpl <em>Conversion Based Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ConversionBasedUnitImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getConversionBasedUnit()
	 * @generated
	 */
	int CONVERSION_BASED_UNIT = 51;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__IID = MEASUREMENT_UNIT__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__REVISION_NUMBER = MEASUREMENT_UNIT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__CLASS_KIND = MEASUREMENT_UNIT__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__MODIFIED_ON = MEASUREMENT_UNIT__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__EXCLUDED_PERSON = MEASUREMENT_UNIT__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__EXCLUDED_DOMAIN = MEASUREMENT_UNIT__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__NAME = MEASUREMENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__SHORT_NAME = MEASUREMENT_UNIT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__ALIAS = MEASUREMENT_UNIT__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__DEFINITION = MEASUREMENT_UNIT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__HYPER_LINK = MEASUREMENT_UNIT__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__IS_DEPRECATED = MEASUREMENT_UNIT__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Reference Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__REFERENCE_UNIT = MEASUREMENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT__CONVERSION_FACTOR = MEASUREMENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conversion Based Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT_FEATURE_COUNT = MEASUREMENT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = MEASUREMENT_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = MEASUREMENT_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Conversion Based Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_BASED_UNIT_OPERATION_COUNT = MEASUREMENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.LinearConversionUnitImpl <em>Linear Conversion Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.LinearConversionUnitImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getLinearConversionUnit()
	 * @generated
	 */
	int LINEAR_CONVERSION_UNIT = 50;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__IID = CONVERSION_BASED_UNIT__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__REVISION_NUMBER = CONVERSION_BASED_UNIT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__CLASS_KIND = CONVERSION_BASED_UNIT__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__MODIFIED_ON = CONVERSION_BASED_UNIT__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__EXCLUDED_PERSON = CONVERSION_BASED_UNIT__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__EXCLUDED_DOMAIN = CONVERSION_BASED_UNIT__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__NAME = CONVERSION_BASED_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__SHORT_NAME = CONVERSION_BASED_UNIT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__ALIAS = CONVERSION_BASED_UNIT__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__DEFINITION = CONVERSION_BASED_UNIT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__HYPER_LINK = CONVERSION_BASED_UNIT__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__IS_DEPRECATED = CONVERSION_BASED_UNIT__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Reference Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__REFERENCE_UNIT = CONVERSION_BASED_UNIT__REFERENCE_UNIT;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT__CONVERSION_FACTOR = CONVERSION_BASED_UNIT__CONVERSION_FACTOR;

	/**
	 * The number of structural features of the '<em>Linear Conversion Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT_FEATURE_COUNT = CONVERSION_BASED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CONVERSION_BASED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CONVERSION_BASED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Linear Conversion Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONVERSION_UNIT_OPERATION_COUNT = CONVERSION_BASED_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.DerivedUnitImpl <em>Derived Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.DerivedUnitImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDerivedUnit()
	 * @generated
	 */
	int DERIVED_UNIT = 52;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__IID = MEASUREMENT_UNIT__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__REVISION_NUMBER = MEASUREMENT_UNIT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__CLASS_KIND = MEASUREMENT_UNIT__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__MODIFIED_ON = MEASUREMENT_UNIT__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__EXCLUDED_PERSON = MEASUREMENT_UNIT__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__EXCLUDED_DOMAIN = MEASUREMENT_UNIT__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__NAME = MEASUREMENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__SHORT_NAME = MEASUREMENT_UNIT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__ALIAS = MEASUREMENT_UNIT__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__DEFINITION = MEASUREMENT_UNIT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__HYPER_LINK = MEASUREMENT_UNIT__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__IS_DEPRECATED = MEASUREMENT_UNIT__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Unit Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT__UNIT_FACTOR = MEASUREMENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_FEATURE_COUNT = MEASUREMENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = MEASUREMENT_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = MEASUREMENT_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Derived Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNIT_OPERATION_COUNT = MEASUREMENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.UnitFactorImpl <em>Unit Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.UnitFactorImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getUnitFactor()
	 * @generated
	 */
	int UNIT_FACTOR = 53;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__UNIT = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR__EXPONENT = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FACTOR_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.QuantityKindFactorImpl <em>Quantity Kind Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.QuantityKindFactorImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getQuantityKindFactor()
	 * @generated
	 */
	int QUANTITY_KIND_FACTOR = 54;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Quantity Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR__QUANTITY_KIND = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR__EXPONENT = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity Kind Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantity Kind Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FACTOR_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.TextParameterTypeImpl <em>Text Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.TextParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getTextParameterType()
	 * @generated
	 */
	int TEXT_PARAMETER_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__IID = SCALAR_PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__REVISION_NUMBER = SCALAR_PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__CLASS_KIND = SCALAR_PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__MODIFIED_ON = SCALAR_PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__EXCLUDED_PERSON = SCALAR_PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__EXCLUDED_DOMAIN = SCALAR_PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__NAME = SCALAR_PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__SHORT_NAME = SCALAR_PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__ALIAS = SCALAR_PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__DEFINITION = SCALAR_PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__HYPER_LINK = SCALAR_PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__CATEGORY = SCALAR_PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__IS_DEPRECATED = SCALAR_PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__NUMBER_OF_VALUES = SCALAR_PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE__SYMBOL = SCALAR_PARAMETER_TYPE__SYMBOL;

	/**
	 * The number of structural features of the '<em>Text Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE_FEATURE_COUNT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Text Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PARAMETER_TYPE_OPERATION_COUNT = SCALAR_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.IntervalScaleImpl <em>Interval Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.IntervalScaleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getIntervalScale()
	 * @generated
	 */
	int INTERVAL_SCALE = 56;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__IID = MEASUREMENT_SCALE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__REVISION_NUMBER = MEASUREMENT_SCALE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__CLASS_KIND = MEASUREMENT_SCALE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__MODIFIED_ON = MEASUREMENT_SCALE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__EXCLUDED_PERSON = MEASUREMENT_SCALE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__EXCLUDED_DOMAIN = MEASUREMENT_SCALE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__NAME = MEASUREMENT_SCALE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__SHORT_NAME = MEASUREMENT_SCALE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__ALIAS = MEASUREMENT_SCALE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__DEFINITION = MEASUREMENT_SCALE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__HYPER_LINK = MEASUREMENT_SCALE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__IS_DEPRECATED = MEASUREMENT_SCALE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__UNIT = MEASUREMENT_SCALE__UNIT;

	/**
	 * The feature id for the '<em><b>Value Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__VALUE_DEFINITION = MEASUREMENT_SCALE__VALUE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Number Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__NUMBER_SET = MEASUREMENT_SCALE__NUMBER_SET;

	/**
	 * The feature id for the '<em><b>Minimum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__MINIMUM_PERMISSIBLE_VALUE = MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Minimum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__IS_MINIMUM_INCLUSIVE = MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Maximum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__MAXIMUM_PERMISSIBLE_VALUE = MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Maximum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__IS_MAXIMUM_INCLUSIVE = MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Positive Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__POSITIVE_VALUE_CONNOTATION = MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Negative Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__NEGATIVE_VALUE_CONNOTATION = MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Mapping To Reference Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE__MAPPING_TO_REFERENCE_SCALE = MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE;

	/**
	 * The number of structural features of the '<em>Interval Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE_FEATURE_COUNT = MEASUREMENT_SCALE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interval Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCALE_OPERATION_COUNT = MEASUREMENT_SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.SpecializedQuantityKindImpl <em>Specialized Quantity Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.SpecializedQuantityKindImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSpecializedQuantityKind()
	 * @generated
	 */
	int SPECIALIZED_QUANTITY_KIND = 57;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__IID = QUANTITY_KIND__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__REVISION_NUMBER = QUANTITY_KIND__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__CLASS_KIND = QUANTITY_KIND__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__MODIFIED_ON = QUANTITY_KIND__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__EXCLUDED_PERSON = QUANTITY_KIND__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__EXCLUDED_DOMAIN = QUANTITY_KIND__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__NAME = QUANTITY_KIND__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__SHORT_NAME = QUANTITY_KIND__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__ALIAS = QUANTITY_KIND__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__DEFINITION = QUANTITY_KIND__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__HYPER_LINK = QUANTITY_KIND__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__CATEGORY = QUANTITY_KIND__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__IS_DEPRECATED = QUANTITY_KIND__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__NUMBER_OF_VALUES = QUANTITY_KIND__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__SYMBOL = QUANTITY_KIND__SYMBOL;

	/**
	 * The feature id for the '<em><b>Possible Scale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__POSSIBLE_SCALE = QUANTITY_KIND__POSSIBLE_SCALE;

	/**
	 * The feature id for the '<em><b>Default Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__DEFAULT_SCALE = QUANTITY_KIND__DEFAULT_SCALE;

	/**
	 * The feature id for the '<em><b>All Possible Scale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__ALL_POSSIBLE_SCALE = QUANTITY_KIND__ALL_POSSIBLE_SCALE;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL = QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Exponent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT = QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION = QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND__GENERAL = QUANTITY_KIND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specialized Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND_FEATURE_COUNT = QUANTITY_KIND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Specialized Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZED_QUANTITY_KIND_OPERATION_COUNT = QUANTITY_KIND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.SimpleUnitImpl <em>Simple Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.SimpleUnitImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSimpleUnit()
	 * @generated
	 */
	int SIMPLE_UNIT = 58;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__IID = MEASUREMENT_UNIT__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__REVISION_NUMBER = MEASUREMENT_UNIT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__CLASS_KIND = MEASUREMENT_UNIT__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__MODIFIED_ON = MEASUREMENT_UNIT__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__EXCLUDED_PERSON = MEASUREMENT_UNIT__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__EXCLUDED_DOMAIN = MEASUREMENT_UNIT__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__NAME = MEASUREMENT_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__SHORT_NAME = MEASUREMENT_UNIT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__ALIAS = MEASUREMENT_UNIT__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__DEFINITION = MEASUREMENT_UNIT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__HYPER_LINK = MEASUREMENT_UNIT__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT__IS_DEPRECATED = MEASUREMENT_UNIT__IS_DEPRECATED;

	/**
	 * The number of structural features of the '<em>Simple Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT_FEATURE_COUNT = MEASUREMENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = MEASUREMENT_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = MEASUREMENT_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Simple Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_UNIT_OPERATION_COUNT = MEASUREMENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.MultiRelationshipRuleImpl <em>Multi Relationship Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.MultiRelationshipRuleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getMultiRelationshipRule()
	 * @generated
	 */
	int MULTI_RELATIONSHIP_RULE = 59;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__IID = RULE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__REVISION_NUMBER = RULE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__CLASS_KIND = RULE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__MODIFIED_ON = RULE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__EXCLUDED_PERSON = RULE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__EXCLUDED_DOMAIN = RULE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__SHORT_NAME = RULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__ALIAS = RULE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__DEFINITION = RULE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__HYPER_LINK = RULE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__IS_DEPRECATED = RULE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Relationship Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__RELATED_CATEGORY = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__MIN_RELATED = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE__MAX_RELATED = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multi Relationship Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Multi Relationship Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.SimpleQuantityKindImpl <em>Simple Quantity Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.SimpleQuantityKindImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSimpleQuantityKind()
	 * @generated
	 */
	int SIMPLE_QUANTITY_KIND = 60;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__IID = QUANTITY_KIND__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__REVISION_NUMBER = QUANTITY_KIND__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__CLASS_KIND = QUANTITY_KIND__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__MODIFIED_ON = QUANTITY_KIND__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__EXCLUDED_PERSON = QUANTITY_KIND__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__EXCLUDED_DOMAIN = QUANTITY_KIND__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__NAME = QUANTITY_KIND__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__SHORT_NAME = QUANTITY_KIND__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__ALIAS = QUANTITY_KIND__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__DEFINITION = QUANTITY_KIND__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__HYPER_LINK = QUANTITY_KIND__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__CATEGORY = QUANTITY_KIND__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__IS_DEPRECATED = QUANTITY_KIND__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__NUMBER_OF_VALUES = QUANTITY_KIND__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__SYMBOL = QUANTITY_KIND__SYMBOL;

	/**
	 * The feature id for the '<em><b>Possible Scale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__POSSIBLE_SCALE = QUANTITY_KIND__POSSIBLE_SCALE;

	/**
	 * The feature id for the '<em><b>Default Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__DEFAULT_SCALE = QUANTITY_KIND__DEFAULT_SCALE;

	/**
	 * The feature id for the '<em><b>All Possible Scale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__ALL_POSSIBLE_SCALE = QUANTITY_KIND__ALL_POSSIBLE_SCALE;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL = QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Exponent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT = QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION = QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Simple Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND_FEATURE_COUNT = QUANTITY_KIND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Simple Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_QUANTITY_KIND_OPERATION_COUNT = QUANTITY_KIND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.PrefixedUnitImpl <em>Prefixed Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.PrefixedUnitImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getPrefixedUnit()
	 * @generated
	 */
	int PREFIXED_UNIT = 61;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__IID = CONVERSION_BASED_UNIT__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__REVISION_NUMBER = CONVERSION_BASED_UNIT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__CLASS_KIND = CONVERSION_BASED_UNIT__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__MODIFIED_ON = CONVERSION_BASED_UNIT__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__EXCLUDED_PERSON = CONVERSION_BASED_UNIT__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__EXCLUDED_DOMAIN = CONVERSION_BASED_UNIT__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__NAME = CONVERSION_BASED_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__SHORT_NAME = CONVERSION_BASED_UNIT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__ALIAS = CONVERSION_BASED_UNIT__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__DEFINITION = CONVERSION_BASED_UNIT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__HYPER_LINK = CONVERSION_BASED_UNIT__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__IS_DEPRECATED = CONVERSION_BASED_UNIT__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Reference Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__REFERENCE_UNIT = CONVERSION_BASED_UNIT__REFERENCE_UNIT;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__CONVERSION_FACTOR = CONVERSION_BASED_UNIT__CONVERSION_FACTOR;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT__PREFIX = CONVERSION_BASED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prefixed Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT_FEATURE_COUNT = CONVERSION_BASED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CONVERSION_BASED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CONVERSION_BASED_UNIT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Prefixed Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIXED_UNIT_OPERATION_COUNT = CONVERSION_BASED_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.DateTimeParameterTypeImpl <em>Date Time Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.DateTimeParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDateTimeParameterType()
	 * @generated
	 */
	int DATE_TIME_PARAMETER_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__IID = SCALAR_PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__REVISION_NUMBER = SCALAR_PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__CLASS_KIND = SCALAR_PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__MODIFIED_ON = SCALAR_PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__EXCLUDED_PERSON = SCALAR_PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__EXCLUDED_DOMAIN = SCALAR_PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__NAME = SCALAR_PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__SHORT_NAME = SCALAR_PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__ALIAS = SCALAR_PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__DEFINITION = SCALAR_PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__HYPER_LINK = SCALAR_PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__CATEGORY = SCALAR_PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__IS_DEPRECATED = SCALAR_PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__NUMBER_OF_VALUES = SCALAR_PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE__SYMBOL = SCALAR_PARAMETER_TYPE__SYMBOL;

	/**
	 * The number of structural features of the '<em>Date Time Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE_FEATURE_COUNT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Date Time Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PARAMETER_TYPE_OPERATION_COUNT = SCALAR_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.TimeOfDayParameterTypeImpl <em>Time Of Day Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.TimeOfDayParameterTypeImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getTimeOfDayParameterType()
	 * @generated
	 */
	int TIME_OF_DAY_PARAMETER_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__IID = SCALAR_PARAMETER_TYPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__REVISION_NUMBER = SCALAR_PARAMETER_TYPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__CLASS_KIND = SCALAR_PARAMETER_TYPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__MODIFIED_ON = SCALAR_PARAMETER_TYPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__EXCLUDED_PERSON = SCALAR_PARAMETER_TYPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__EXCLUDED_DOMAIN = SCALAR_PARAMETER_TYPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__NAME = SCALAR_PARAMETER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__SHORT_NAME = SCALAR_PARAMETER_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__ALIAS = SCALAR_PARAMETER_TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__DEFINITION = SCALAR_PARAMETER_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__HYPER_LINK = SCALAR_PARAMETER_TYPE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__CATEGORY = SCALAR_PARAMETER_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__IS_DEPRECATED = SCALAR_PARAMETER_TYPE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__NUMBER_OF_VALUES = SCALAR_PARAMETER_TYPE__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE__SYMBOL = SCALAR_PARAMETER_TYPE__SYMBOL;

	/**
	 * The number of structural features of the '<em>Time Of Day Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE_FEATURE_COUNT = SCALAR_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = SCALAR_PARAMETER_TYPE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Time Of Day Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OF_DAY_PARAMETER_TYPE_OPERATION_COUNT = SCALAR_PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.DecompositionRuleImpl <em>Decomposition Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.DecompositionRuleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDecompositionRule()
	 * @generated
	 */
	int DECOMPOSITION_RULE = 64;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__IID = RULE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__REVISION_NUMBER = RULE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__CLASS_KIND = RULE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__MODIFIED_ON = RULE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__EXCLUDED_PERSON = RULE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__EXCLUDED_DOMAIN = RULE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__SHORT_NAME = RULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__ALIAS = RULE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__DEFINITION = RULE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__HYPER_LINK = RULE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__IS_DEPRECATED = RULE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Containing Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__CONTAINING_CATEGORY = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__CONTAINED_CATEGORY = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Contained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__MIN_CONTAINED = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Contained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE__MAX_CONTAINED = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Decomposition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Decomposition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.DerivedQuantityKindImpl <em>Derived Quantity Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.DerivedQuantityKindImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDerivedQuantityKind()
	 * @generated
	 */
	int DERIVED_QUANTITY_KIND = 65;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__IID = QUANTITY_KIND__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__REVISION_NUMBER = QUANTITY_KIND__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__CLASS_KIND = QUANTITY_KIND__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__MODIFIED_ON = QUANTITY_KIND__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__EXCLUDED_PERSON = QUANTITY_KIND__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__EXCLUDED_DOMAIN = QUANTITY_KIND__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__NAME = QUANTITY_KIND__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__SHORT_NAME = QUANTITY_KIND__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__ALIAS = QUANTITY_KIND__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__DEFINITION = QUANTITY_KIND__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__HYPER_LINK = QUANTITY_KIND__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__CATEGORY = QUANTITY_KIND__CATEGORY;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__IS_DEPRECATED = QUANTITY_KIND__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Number Of Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__NUMBER_OF_VALUES = QUANTITY_KIND__NUMBER_OF_VALUES;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__SYMBOL = QUANTITY_KIND__SYMBOL;

	/**
	 * The feature id for the '<em><b>Possible Scale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__POSSIBLE_SCALE = QUANTITY_KIND__POSSIBLE_SCALE;

	/**
	 * The feature id for the '<em><b>Default Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__DEFAULT_SCALE = QUANTITY_KIND__DEFAULT_SCALE;

	/**
	 * The feature id for the '<em><b>All Possible Scale</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__ALL_POSSIBLE_SCALE = QUANTITY_KIND__ALL_POSSIBLE_SCALE;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL = QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Exponent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT = QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT;

	/**
	 * The feature id for the '<em><b>Quantity Dimension Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION = QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Quantity Kind Factor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR = QUANTITY_KIND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND_FEATURE_COUNT = QUANTITY_KIND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = QUANTITY_KIND___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Derived Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_KIND_OPERATION_COUNT = QUANTITY_KIND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl <em>Logarithmic Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getLogarithmicScale()
	 * @generated
	 */
	int LOGARITHMIC_SCALE = 66;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__IID = MEASUREMENT_SCALE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__REVISION_NUMBER = MEASUREMENT_SCALE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__CLASS_KIND = MEASUREMENT_SCALE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__MODIFIED_ON = MEASUREMENT_SCALE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__EXCLUDED_PERSON = MEASUREMENT_SCALE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__EXCLUDED_DOMAIN = MEASUREMENT_SCALE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__NAME = MEASUREMENT_SCALE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__SHORT_NAME = MEASUREMENT_SCALE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__ALIAS = MEASUREMENT_SCALE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__DEFINITION = MEASUREMENT_SCALE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__HYPER_LINK = MEASUREMENT_SCALE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__IS_DEPRECATED = MEASUREMENT_SCALE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__UNIT = MEASUREMENT_SCALE__UNIT;

	/**
	 * The feature id for the '<em><b>Value Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__VALUE_DEFINITION = MEASUREMENT_SCALE__VALUE_DEFINITION;

	/**
	 * The feature id for the '<em><b>Number Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__NUMBER_SET = MEASUREMENT_SCALE__NUMBER_SET;

	/**
	 * The feature id for the '<em><b>Minimum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__MINIMUM_PERMISSIBLE_VALUE = MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Minimum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__IS_MINIMUM_INCLUSIVE = MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Maximum Permissible Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__MAXIMUM_PERMISSIBLE_VALUE = MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE;

	/**
	 * The feature id for the '<em><b>Is Maximum Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__IS_MAXIMUM_INCLUSIVE = MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Positive Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__POSITIVE_VALUE_CONNOTATION = MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Negative Value Connotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__NEGATIVE_VALUE_CONNOTATION = MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION;

	/**
	 * The feature id for the '<em><b>Mapping To Reference Scale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__MAPPING_TO_REFERENCE_SCALE = MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE;

	/**
	 * The feature id for the '<em><b>Logarithm Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__LOGARITHM_BASE = MEASUREMENT_SCALE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__FACTOR = MEASUREMENT_SCALE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__EXPONENT = MEASUREMENT_SCALE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference Quantity Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND = MEASUREMENT_SCALE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference Quantity Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE = MEASUREMENT_SCALE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Logarithmic Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE_FEATURE_COUNT = MEASUREMENT_SCALE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = MEASUREMENT_SCALE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Logarithmic Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_SCALE_OPERATION_COUNT = MEASUREMENT_SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.impl.ParameterizedCategoryRuleImpl <em>Parameterized Category Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.impl.ParameterizedCategoryRuleImpl
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParameterizedCategoryRule()
	 * @generated
	 */
	int PARAMETERIZED_CATEGORY_RULE = 67;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__IID = RULE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__REVISION_NUMBER = RULE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__CLASS_KIND = RULE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__MODIFIED_ON = RULE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__EXCLUDED_PERSON = RULE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__EXCLUDED_DOMAIN = RULE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__SHORT_NAME = RULE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__ALIAS = RULE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__DEFINITION = RULE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__HYPER_LINK = RULE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__IS_DEPRECATED = RULE__IS_DEPRECATED;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__CATEGORY = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE__PARAMETER_TYPE = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameterized Category Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = RULE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Parameterized Category Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_CATEGORY_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.VcardEmailAddressKind <em>Vcard Email Address Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.VcardEmailAddressKind
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getVcardEmailAddressKind()
	 * @generated
	 */
	int VCARD_EMAIL_ADDRESS_KIND = 68;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.VcardTelephoneNumberKind <em>Vcard Telephone Number Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.VcardTelephoneNumberKind
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getVcardTelephoneNumberKind()
	 * @generated
	 */
	int VCARD_TELEPHONE_NUMBER_KIND = 69;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.NumberSetKind <em>Number Set Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.NumberSetKind
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getNumberSetKind()
	 * @generated
	 */
	int NUMBER_SET_KIND = 70;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.EngineeringModelKind <em>Engineering Model Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.EngineeringModelKind
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEngineeringModelKind()
	 * @generated
	 */
	int ENGINEERING_MODEL_KIND = 71;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.StudyPhaseKind <em>Study Phase Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.StudyPhaseKind
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getStudyPhaseKind()
	 * @generated
	 */
	int STUDY_PHASE_KIND = 72;

	/**
	 * The meta object id for the '{@link CDP4.SiteDirectoryData.LogarithmBaseKind <em>Logarithm Base Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.SiteDirectoryData.LogarithmBaseKind
	 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getLogarithmBaseKind()
	 * @generated
	 */
	int LOGARITHM_BASE_KIND = 73;


	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ParticipantPermission <em>Participant Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Permission</em>'.
	 * @see CDP4.SiteDirectoryData.ParticipantPermission
	 * @generated
	 */
	EClass getParticipantPermission();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ParticipantPermission#getAccessRight <em>Access Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Right</em>'.
	 * @see CDP4.SiteDirectoryData.ParticipantPermission#getAccessRight()
	 * @see #getParticipantPermission()
	 * @generated
	 */
	EAttribute getParticipantPermission_AccessRight();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ParticipantPermission#getObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Class</em>'.
	 * @see CDP4.SiteDirectoryData.ParticipantPermission#getObjectClass()
	 * @see #getParticipantPermission()
	 * @generated
	 */
	EAttribute getParticipantPermission_ObjectClass();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ReferenceSource <em>Reference Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Source</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceSource
	 * @generated
	 */
	EClass getReferenceSource();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ReferenceSource#getVersionIdentifier <em>Version Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Identifier</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceSource#getVersionIdentifier()
	 * @see #getReferenceSource()
	 * @generated
	 */
	EAttribute getReferenceSource_VersionIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ReferenceSource#getVersionDate <em>Version Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Date</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceSource#getVersionDate()
	 * @see #getReferenceSource()
	 * @generated
	 */
	EAttribute getReferenceSource_VersionDate();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ReferenceSource#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceSource#getAuthor()
	 * @see #getReferenceSource()
	 * @generated
	 */
	EAttribute getReferenceSource_Author();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ReferenceSource#getPublicationYear <em>Publication Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Year</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceSource#getPublicationYear()
	 * @see #getReferenceSource()
	 * @generated
	 */
	EAttribute getReferenceSource_PublicationYear();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ReferenceSource#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceSource#getPublisher()
	 * @see #getReferenceSource()
	 * @generated
	 */
	EReference getReferenceSource_Publisher();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ReferenceSource#getPublishedIn <em>Published In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Published In</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceSource#getPublishedIn()
	 * @see #getReferenceSource()
	 * @generated
	 */
	EReference getReferenceSource_PublishedIn();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ReferenceSource#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceSource#getLanguage()
	 * @see #getReferenceSource()
	 * @generated
	 */
	EAttribute getReferenceSource_Language();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.CategorizableThing <em>Categorizable Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorizable Thing</em>'.
	 * @see CDP4.SiteDirectoryData.CategorizableThing
	 * @generated
	 */
	EClass getCategorizableThing();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.CategorizableThing#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see CDP4.SiteDirectoryData.CategorizableThing#getCategory()
	 * @see #getCategorizableThing()
	 * @generated
	 */
	EReference getCategorizableThing_Category();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see CDP4.SiteDirectoryData.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.Category#getSuperCategory <em>Super Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Category</em>'.
	 * @see CDP4.SiteDirectoryData.Category#getSuperCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_SuperCategory();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.SiteDirectoryData.Category#getPermissibleClass <em>Permissible Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permissible Class</em>'.
	 * @see CDP4.SiteDirectoryData.Category#getPermissibleClass()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_PermissibleClass();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.Category#getIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see CDP4.SiteDirectoryData.Category#getIsAbstract()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_IsAbstract();

	/**
	 * Returns the meta object for the '{@link CDP4.SiteDirectoryData.Category#superSubGraphIsAcyclic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Super Sub Graph Is Acyclic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Super Sub Graph Is Acyclic</em>' operation.
	 * @see CDP4.SiteDirectoryData.Category#superSubGraphIsAcyclic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__SuperSubGraphIsAcyclic__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link CDP4.SiteDirectoryData.Category#getAllSupershelperoperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Get All Supershelperoperation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Supershelperoperation</em>' operation.
	 * @see CDP4.SiteDirectoryData.Category#getAllSupershelperoperation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__GetAllSupershelperoperation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see CDP4.SiteDirectoryData.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see CDP4.SiteDirectoryData.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Person#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getOrganization()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Organization();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.Person#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getGivenName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_GivenName();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.Person#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getSurname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Surname();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.Person#getOrganizationalUnit <em>Organizational Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organizational Unit</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getOrganizationalUnit()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_OrganizationalUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.Person#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email Address</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getEmailAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_EmailAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.Person#getTelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Number</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getTelephoneNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_TelephoneNumber();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Person#getDefaultDomain <em>Default Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Domain</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getDefaultDomain()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_DefaultDomain();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.Person#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getIsActive()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_IsActive();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Person#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getRole()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Role();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.Person#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getPassword()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Password();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.Person#getSalt <em>Salt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salt</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getSalt()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Salt();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Person#getDefaultEmailAddress <em>Default Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Email Address</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getDefaultEmailAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_DefaultEmailAddress();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Person#getDefaultTelephoneNumber <em>Default Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Telephone Number</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getDefaultTelephoneNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_DefaultTelephoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.Person#getUserPreference <em>User Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Preference</em>'.
	 * @see CDP4.SiteDirectoryData.Person#getUserPreference()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_UserPreference();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.EmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Address</em>'.
	 * @see CDP4.SiteDirectoryData.EmailAddress
	 * @generated
	 */
	EClass getEmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.EmailAddress#getVcardType <em>Vcard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcard Type</em>'.
	 * @see CDP4.SiteDirectoryData.EmailAddress#getVcardType()
	 * @see #getEmailAddress()
	 * @generated
	 */
	EAttribute getEmailAddress_VcardType();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.EmailAddress#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CDP4.SiteDirectoryData.EmailAddress#getValue()
	 * @see #getEmailAddress()
	 * @generated
	 */
	EAttribute getEmailAddress_Value();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number</em>'.
	 * @see CDP4.SiteDirectoryData.TelephoneNumber
	 * @generated
	 */
	EClass getTelephoneNumber();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.SiteDirectoryData.TelephoneNumber#getVcardType <em>Vcard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vcard Type</em>'.
	 * @see CDP4.SiteDirectoryData.TelephoneNumber#getVcardType()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_VcardType();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.TelephoneNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CDP4.SiteDirectoryData.TelephoneNumber#getValue()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_Value();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.DomainOfExpertise <em>Domain Of Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Of Expertise</em>'.
	 * @see CDP4.SiteDirectoryData.DomainOfExpertise
	 * @generated
	 */
	EClass getDomainOfExpertise();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.PersonRole <em>Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Role</em>'.
	 * @see CDP4.SiteDirectoryData.PersonRole
	 * @generated
	 */
	EClass getPersonRole();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.PersonRole#getPersonPermission <em>Person Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Permission</em>'.
	 * @see CDP4.SiteDirectoryData.PersonRole#getPersonPermission()
	 * @see #getPersonRole()
	 * @generated
	 */
	EReference getPersonRole_PersonPermission();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.PersonPermission <em>Person Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Permission</em>'.
	 * @see CDP4.SiteDirectoryData.PersonPermission
	 * @generated
	 */
	EClass getPersonPermission();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.PersonPermission#getAccessRight <em>Access Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Right</em>'.
	 * @see CDP4.SiteDirectoryData.PersonPermission#getAccessRight()
	 * @see #getPersonPermission()
	 * @generated
	 */
	EAttribute getPersonPermission_AccessRight();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.PersonPermission#getObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Class</em>'.
	 * @see CDP4.SiteDirectoryData.PersonPermission#getObjectClass()
	 * @see #getPersonPermission()
	 * @generated
	 */
	EAttribute getPersonPermission_ObjectClass();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.UserPreference <em>User Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Preference</em>'.
	 * @see CDP4.SiteDirectoryData.UserPreference
	 * @generated
	 */
	EClass getUserPreference();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.UserPreference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CDP4.SiteDirectoryData.UserPreference#getValue()
	 * @see #getUserPreference()
	 * @generated
	 */
	EAttribute getUserPreference_Value();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.SiteDirectory <em>Site Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Directory</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory
	 * @generated
	 */
	EClass getSiteDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getOrganization()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_Organization();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getPerson()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getParticipantRole <em>Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Role</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getParticipantRole()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_ParticipantRole();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.SiteDirectory#getDefaultParticipantRole <em>Default Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Participant Role</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getDefaultParticipantRole()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_DefaultParticipantRole();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getSiteReferenceDataLibrary <em>Site Reference Data Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site Reference Data Library</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getSiteReferenceDataLibrary()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_SiteReferenceDataLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getModel()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getPersonRole <em>Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Role</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getPersonRole()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_PersonRole();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.SiteDirectory#getDefaultPersonRole <em>Default Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Person Role</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getDefaultPersonRole()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_DefaultPersonRole();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getLogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Entry</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getLogEntry()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_LogEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getDomainGroup <em>Domain Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Group</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getDomainGroup()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_DomainGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getDomain()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getNaturalLanguage <em>Natural Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Natural Language</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getNaturalLanguage()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_NaturalLanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.SiteDirectory#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see CDP4.SiteDirectoryData.SiteDirectory#getAnnotation()
	 * @see #getSiteDirectory()
	 * @generated
	 */
	EReference getSiteDirectory_Annotation();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ParticipantRole <em>Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Role</em>'.
	 * @see CDP4.SiteDirectoryData.ParticipantRole
	 * @generated
	 */
	EClass getParticipantRole();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ParticipantRole#getParticipantPermission <em>Participant Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Permission</em>'.
	 * @see CDP4.SiteDirectoryData.ParticipantRole#getParticipantPermission()
	 * @see #getParticipantRole()
	 * @generated
	 */
	EReference getParticipantRole_ParticipantPermission();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.SiteReferenceDataLibrary <em>Site Reference Data Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Reference Data Library</em>'.
	 * @see CDP4.SiteDirectoryData.SiteReferenceDataLibrary
	 * @generated
	 */
	EClass getSiteReferenceDataLibrary();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary <em>Reference Data Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Data Library</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary
	 * @generated
	 */
	EClass getReferenceDataLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getDefinedCategory <em>Defined Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined Category</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getDefinedCategory()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_DefinedCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getParameterType()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_ParameterType();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getBaseQuantityKind <em>Base Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Quantity Kind</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getBaseQuantityKind()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_BaseQuantityKind();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scale</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getScale()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_Scale();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getUnitPrefix <em>Unit Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Prefix</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getUnitPrefix()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_UnitPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getUnit()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_Unit();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getBaseUnit <em>Base Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Unit</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getBaseUnit()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_BaseUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Type</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getFileType()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_FileType();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glossary</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getGlossary()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_Glossary();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getReferenceSource <em>Reference Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Source</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getReferenceSource()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_ReferenceSource();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getRule()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_Rule();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getRequiredRdl <em>Required Rdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Rdl</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getRequiredRdl()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_RequiredRdl();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constant</em>'.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#getConstant()
	 * @see #getReferenceDataLibrary()
	 * @generated
	 */
	EReference getReferenceDataLibrary_Constant();

	/**
	 * Returns the meta object for the '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#hasUniqueParameterTypeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Unique Parameter Type Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Unique Parameter Type Names</em>' operation.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#hasUniqueParameterTypeNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getReferenceDataLibrary__HasUniqueParameterTypeNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#hasUniqueParameterTypeShortNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Unique Parameter Type Short Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Unique Parameter Type Short Names</em>' operation.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#hasUniqueParameterTypeShortNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getReferenceDataLibrary__HasUniqueParameterTypeShortNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#hasUniqueCategoryNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Unique Category Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Unique Category Names</em>' operation.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#hasUniqueCategoryNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getReferenceDataLibrary__HasUniqueCategoryNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#hasUniqueCategoryShortNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Unique Category Short Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Unique Category Short Names</em>' operation.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary#hasUniqueCategoryShortNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getReferenceDataLibrary__HasUniqueCategoryShortNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ParticipantAffectedAccessThing <em>Participant Affected Access Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Affected Access Thing</em>'.
	 * @see CDP4.SiteDirectoryData.ParticipantAffectedAccessThing
	 * @generated
	 */
	EClass getParticipantAffectedAccessThing();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ParameterType#getNumberOfValues <em>Number Of Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Values</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterType#getNumberOfValues()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_NumberOfValues();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ParameterType#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterType#getSymbol()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Symbol();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.QuantityKind <em>Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Kind</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKind
	 * @generated
	 */
	EClass getQuantityKind();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.QuantityKind#getPossibleScale <em>Possible Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Scale</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKind#getPossibleScale()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EReference getQuantityKind_PossibleScale();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.QuantityKind#getDefaultScale <em>Default Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Scale</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKind#getDefaultScale()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EReference getQuantityKind_DefaultScale();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.QuantityKind#getAllPossibleScale <em>All Possible Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Possible Scale</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKind#getAllPossibleScale()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EReference getQuantityKind_AllPossibleScale();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionSymbol <em>Quantity Dimension Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Dimension Symbol</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionSymbol()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EAttribute getQuantityKind_QuantityDimensionSymbol();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionExponent <em>Quantity Dimension Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Quantity Dimension Exponent</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionExponent()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EAttribute getQuantityKind_QuantityDimensionExponent();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionExpression <em>Quantity Dimension Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Dimension Expression</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionExpression()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EAttribute getQuantityKind_QuantityDimensionExpression();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ScalarParameterType <em>Scalar Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.ScalarParameterType
	 * @generated
	 */
	EClass getScalarParameterType();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.MeasurementScale <em>Measurement Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Scale</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale
	 * @generated
	 */
	EClass getMeasurementScale();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.MeasurementScale#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getUnit()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EReference getMeasurementScale_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.MeasurementScale#getValueDefinition <em>Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Definition</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getValueDefinition()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EReference getMeasurementScale_ValueDefinition();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MeasurementScale#getNumberSet <em>Number Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Set</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getNumberSet()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EAttribute getMeasurementScale_NumberSet();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MeasurementScale#getMinimumPermissibleValue <em>Minimum Permissible Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Permissible Value</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getMinimumPermissibleValue()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EAttribute getMeasurementScale_MinimumPermissibleValue();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MeasurementScale#getIsMinimumInclusive <em>Is Minimum Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Minimum Inclusive</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getIsMinimumInclusive()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EAttribute getMeasurementScale_IsMinimumInclusive();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MeasurementScale#getMaximumPermissibleValue <em>Maximum Permissible Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Permissible Value</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getMaximumPermissibleValue()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EAttribute getMeasurementScale_MaximumPermissibleValue();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MeasurementScale#getIsMaximumInclusive <em>Is Maximum Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Maximum Inclusive</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getIsMaximumInclusive()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EAttribute getMeasurementScale_IsMaximumInclusive();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MeasurementScale#getPositiveValueConnotation <em>Positive Value Connotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Value Connotation</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getPositiveValueConnotation()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EAttribute getMeasurementScale_PositiveValueConnotation();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MeasurementScale#getNegativeValueConnotation <em>Negative Value Connotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Value Connotation</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getNegativeValueConnotation()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EAttribute getMeasurementScale_NegativeValueConnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.MeasurementScale#getMappingToReferenceScale <em>Mapping To Reference Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping To Reference Scale</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementScale#getMappingToReferenceScale()
	 * @see #getMeasurementScale()
	 * @generated
	 */
	EReference getMeasurementScale_MappingToReferenceScale();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.MeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Unit</em>'.
	 * @see CDP4.SiteDirectoryData.MeasurementUnit
	 * @generated
	 */
	EClass getMeasurementUnit();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ScaleValueDefinition <em>Scale Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Value Definition</em>'.
	 * @see CDP4.SiteDirectoryData.ScaleValueDefinition
	 * @generated
	 */
	EClass getScaleValueDefinition();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ScaleValueDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CDP4.SiteDirectoryData.ScaleValueDefinition#getValue()
	 * @see #getScaleValueDefinition()
	 * @generated
	 */
	EAttribute getScaleValueDefinition_Value();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.MappingToReferenceScale <em>Mapping To Reference Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping To Reference Scale</em>'.
	 * @see CDP4.SiteDirectoryData.MappingToReferenceScale
	 * @generated
	 */
	EClass getMappingToReferenceScale();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.MappingToReferenceScale#getReferenceScaleValue <em>Reference Scale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Scale Value</em>'.
	 * @see CDP4.SiteDirectoryData.MappingToReferenceScale#getReferenceScaleValue()
	 * @see #getMappingToReferenceScale()
	 * @generated
	 */
	EReference getMappingToReferenceScale_ReferenceScaleValue();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.MappingToReferenceScale#getDependentScaleValue <em>Dependent Scale Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent Scale Value</em>'.
	 * @see CDP4.SiteDirectoryData.MappingToReferenceScale#getDependentScaleValue()
	 * @see #getMappingToReferenceScale()
	 * @generated
	 */
	EReference getMappingToReferenceScale_DependentScaleValue();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.UnitPrefix <em>Unit Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Prefix</em>'.
	 * @see CDP4.SiteDirectoryData.UnitPrefix
	 * @generated
	 */
	EClass getUnitPrefix();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.UnitPrefix#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see CDP4.SiteDirectoryData.UnitPrefix#getConversionFactor()
	 * @see #getUnitPrefix()
	 * @generated
	 */
	EAttribute getUnitPrefix_ConversionFactor();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Type</em>'.
	 * @see CDP4.SiteDirectoryData.FileType
	 * @generated
	 */
	EClass getFileType();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.FileType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see CDP4.SiteDirectoryData.FileType#getExtension()
	 * @see #getFileType()
	 * @generated
	 */
	EAttribute getFileType_Extension();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see CDP4.SiteDirectoryData.Glossary
	 * @generated
	 */
	EClass getGlossary();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.Glossary#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see CDP4.SiteDirectoryData.Glossary#getTerm()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Term();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see CDP4.SiteDirectoryData.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see CDP4.SiteDirectoryData.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see CDP4.SiteDirectoryData.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Constant#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.Constant#getParameterType()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_ParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.SiteDirectoryData.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see CDP4.SiteDirectoryData.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Constant#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scale</em>'.
	 * @see CDP4.SiteDirectoryData.Constant#getScale()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Scale();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.EngineeringModelSetup <em>Engineering Model Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Model Setup</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup
	 * @generated
	 */
	EClass getEngineeringModelSetup();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup#getParticipant()
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	EReference getEngineeringModelSetup_Participant();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getActiveDomain <em>Active Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Domain</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup#getActiveDomain()
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	EReference getEngineeringModelSetup_ActiveDomain();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup#getKind()
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	EAttribute getEngineeringModelSetup_Kind();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getStudyPhase <em>Study Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Phase</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup#getStudyPhase()
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	EAttribute getEngineeringModelSetup_StudyPhase();

	/**
	 * Returns the meta object for the containment reference '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getRequiredRdl <em>Required Rdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Rdl</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup#getRequiredRdl()
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	EReference getEngineeringModelSetup_RequiredRdl();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getEngineeringModelIid <em>Engineering Model Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engineering Model Iid</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup#getEngineeringModelIid()
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	EAttribute getEngineeringModelSetup_EngineeringModelIid();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getIterationSetup <em>Iteration Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iteration Setup</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup#getIterationSetup()
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	EReference getEngineeringModelSetup_IterationSetup();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getSourceEngineeringModelSetupIid <em>Source Engineering Model Setup Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Engineering Model Setup Iid</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup#getSourceEngineeringModelSetupIid()
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	EAttribute getEngineeringModelSetup_SourceEngineeringModelSetupIid();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see CDP4.SiteDirectoryData.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.Participant#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see CDP4.SiteDirectoryData.Participant#getIsActive()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_IsActive();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Participant#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see CDP4.SiteDirectoryData.Participant#getPerson()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Person();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Participant#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see CDP4.SiteDirectoryData.Participant#getRole()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Role();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.Participant#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain</em>'.
	 * @see CDP4.SiteDirectoryData.Participant#getDomain()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Domain();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.Participant#getSelectedDomain <em>Selected Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Domain</em>'.
	 * @see CDP4.SiteDirectoryData.Participant#getSelectedDomain()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_SelectedDomain();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ModelReferenceDataLibrary <em>Model Reference Data Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference Data Library</em>'.
	 * @see CDP4.SiteDirectoryData.ModelReferenceDataLibrary
	 * @generated
	 */
	EClass getModelReferenceDataLibrary();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.IterationSetup <em>Iteration Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration Setup</em>'.
	 * @see CDP4.SiteDirectoryData.IterationSetup
	 * @generated
	 */
	EClass getIterationSetup();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.IterationSetup#getIterationIid <em>Iteration Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration Iid</em>'.
	 * @see CDP4.SiteDirectoryData.IterationSetup#getIterationIid()
	 * @see #getIterationSetup()
	 * @generated
	 */
	EAttribute getIterationSetup_IterationIid();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.IterationSetup#getIterationNumber <em>Iteration Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration Number</em>'.
	 * @see CDP4.SiteDirectoryData.IterationSetup#getIterationNumber()
	 * @see #getIterationSetup()
	 * @generated
	 */
	EAttribute getIterationSetup_IterationNumber();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.IterationSetup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CDP4.SiteDirectoryData.IterationSetup#getDescription()
	 * @see #getIterationSetup()
	 * @generated
	 */
	EAttribute getIterationSetup_Description();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.IterationSetup#getSourceIterationSetup <em>Source Iteration Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Iteration Setup</em>'.
	 * @see CDP4.SiteDirectoryData.IterationSetup#getSourceIterationSetup()
	 * @see #getIterationSetup()
	 * @generated
	 */
	EReference getIterationSetup_SourceIterationSetup();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.IterationSetup#getFrozenOn <em>Frozen On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frozen On</em>'.
	 * @see CDP4.SiteDirectoryData.IterationSetup#getFrozenOn()
	 * @see #getIterationSetup()
	 * @generated
	 */
	EAttribute getIterationSetup_FrozenOn();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.IterationSetup#getIsDeleted <em>Is Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deleted</em>'.
	 * @see CDP4.SiteDirectoryData.IterationSetup#getIsDeleted()
	 * @see #getIterationSetup()
	 * @generated
	 */
	EAttribute getIterationSetup_IsDeleted();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.SiteLogEntry <em>Site Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Log Entry</em>'.
	 * @see CDP4.SiteDirectoryData.SiteLogEntry
	 * @generated
	 */
	EClass getSiteLogEntry();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.DomainOfExpertiseGroup <em>Domain Of Expertise Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Of Expertise Group</em>'.
	 * @see CDP4.SiteDirectoryData.DomainOfExpertiseGroup
	 * @generated
	 */
	EClass getDomainOfExpertiseGroup();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.DomainOfExpertiseGroup#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain</em>'.
	 * @see CDP4.SiteDirectoryData.DomainOfExpertiseGroup#getDomain()
	 * @see #getDomainOfExpertiseGroup()
	 * @generated
	 */
	EReference getDomainOfExpertiseGroup_Domain();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.NaturalLanguage <em>Natural Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Language</em>'.
	 * @see CDP4.SiteDirectoryData.NaturalLanguage
	 * @generated
	 */
	EClass getNaturalLanguage();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.NaturalLanguage#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see CDP4.SiteDirectoryData.NaturalLanguage#getLanguageCode()
	 * @see #getNaturalLanguage()
	 * @generated
	 */
	EAttribute getNaturalLanguage_LanguageCode();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.NaturalLanguage#getNativeName <em>Native Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Name</em>'.
	 * @see CDP4.SiteDirectoryData.NaturalLanguage#getNativeName()
	 * @see #getNaturalLanguage()
	 * @generated
	 */
	EAttribute getNaturalLanguage_NativeName();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule <em>Binary Relationship Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Relationship Rule</em>'.
	 * @see CDP4.SiteDirectoryData.BinaryRelationshipRule
	 * @generated
	 */
	EClass getBinaryRelationshipRule();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getRelationshipCategory <em>Relationship Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship Category</em>'.
	 * @see CDP4.SiteDirectoryData.BinaryRelationshipRule#getRelationshipCategory()
	 * @see #getBinaryRelationshipRule()
	 * @generated
	 */
	EReference getBinaryRelationshipRule_RelationshipCategory();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getSourceCategory <em>Source Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Category</em>'.
	 * @see CDP4.SiteDirectoryData.BinaryRelationshipRule#getSourceCategory()
	 * @see #getBinaryRelationshipRule()
	 * @generated
	 */
	EReference getBinaryRelationshipRule_SourceCategory();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getTargetCategory <em>Target Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Category</em>'.
	 * @see CDP4.SiteDirectoryData.BinaryRelationshipRule#getTargetCategory()
	 * @see #getBinaryRelationshipRule()
	 * @generated
	 */
	EReference getBinaryRelationshipRule_TargetCategory();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getForwardRelationshipName <em>Forward Relationship Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forward Relationship Name</em>'.
	 * @see CDP4.SiteDirectoryData.BinaryRelationshipRule#getForwardRelationshipName()
	 * @see #getBinaryRelationshipRule()
	 * @generated
	 */
	EAttribute getBinaryRelationshipRule_ForwardRelationshipName();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getInverseRelationshipName <em>Inverse Relationship Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Relationship Name</em>'.
	 * @see CDP4.SiteDirectoryData.BinaryRelationshipRule#getInverseRelationshipName()
	 * @see #getBinaryRelationshipRule()
	 * @generated
	 */
	EAttribute getBinaryRelationshipRule_InverseRelationshipName();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ArrayParameterType <em>Array Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.ArrayParameterType
	 * @generated
	 */
	EClass getArrayParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.SiteDirectoryData.ArrayParameterType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dimension</em>'.
	 * @see CDP4.SiteDirectoryData.ArrayParameterType#getDimension()
	 * @see #getArrayParameterType()
	 * @generated
	 */
	EAttribute getArrayParameterType_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ArrayParameterType#getIsTensor <em>Is Tensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tensor</em>'.
	 * @see CDP4.SiteDirectoryData.ArrayParameterType#getIsTensor()
	 * @see #getArrayParameterType()
	 * @generated
	 */
	EAttribute getArrayParameterType_IsTensor();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ArrayParameterType#getHasSingleComponentType <em>Has Single Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Single Component Type</em>'.
	 * @see CDP4.SiteDirectoryData.ArrayParameterType#getHasSingleComponentType()
	 * @see #getArrayParameterType()
	 * @generated
	 */
	EAttribute getArrayParameterType_HasSingleComponentType();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ArrayParameterType#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see CDP4.SiteDirectoryData.ArrayParameterType#getRank()
	 * @see #getArrayParameterType()
	 * @generated
	 */
	EAttribute getArrayParameterType_Rank();

	/**
	 * Returns the meta object for the '{@link CDP4.SiteDirectoryData.ArrayParameterType#hasValidNumberOfComponents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Valid Number Of Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Number Of Components</em>' operation.
	 * @see CDP4.SiteDirectoryData.ArrayParameterType#hasValidNumberOfComponents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArrayParameterType__HasValidNumberOfComponents__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.CompoundParameterType <em>Compound Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.CompoundParameterType
	 * @generated
	 */
	EClass getCompoundParameterType();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.CompoundParameterType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see CDP4.SiteDirectoryData.CompoundParameterType#getComponent()
	 * @see #getCompoundParameterType()
	 * @generated
	 */
	EReference getCompoundParameterType_Component();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.CompoundParameterType#getIsFinalized <em>Is Finalized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Finalized</em>'.
	 * @see CDP4.SiteDirectoryData.CompoundParameterType#getIsFinalized()
	 * @see #getCompoundParameterType()
	 * @generated
	 */
	EAttribute getCompoundParameterType_IsFinalized();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ParameterTypeComponent <em>Parameter Type Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type Component</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterTypeComponent
	 * @generated
	 */
	EClass getParameterTypeComponent();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ParameterTypeComponent#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterTypeComponent#getParameterType()
	 * @see #getParameterTypeComponent()
	 * @generated
	 */
	EReference getParameterTypeComponent_ParameterType();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ParameterTypeComponent#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scale</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterTypeComponent#getScale()
	 * @see #getParameterTypeComponent()
	 * @generated
	 */
	EReference getParameterTypeComponent_Scale();

	/**
	 * Returns the meta object for the '{@link CDP4.SiteDirectoryData.ParameterTypeComponent#hasValidScale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Valid Scale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Scale</em>' operation.
	 * @see CDP4.SiteDirectoryData.ParameterTypeComponent#hasValidScale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameterTypeComponent__HasValidScale__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.CyclicRatioScale <em>Cyclic Ratio Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyclic Ratio Scale</em>'.
	 * @see CDP4.SiteDirectoryData.CyclicRatioScale
	 * @generated
	 */
	EClass getCyclicRatioScale();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.CyclicRatioScale#getModulus <em>Modulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulus</em>'.
	 * @see CDP4.SiteDirectoryData.CyclicRatioScale#getModulus()
	 * @see #getCyclicRatioScale()
	 * @generated
	 */
	EAttribute getCyclicRatioScale_Modulus();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.RatioScale <em>Ratio Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Scale</em>'.
	 * @see CDP4.SiteDirectoryData.RatioScale
	 * @generated
	 */
	EClass getRatioScale();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.EnumerationParameterType <em>Enumeration Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.EnumerationParameterType
	 * @generated
	 */
	EClass getEnumerationParameterType();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.EnumerationParameterType#getAllowMultiSelect <em>Allow Multi Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Multi Select</em>'.
	 * @see CDP4.SiteDirectoryData.EnumerationParameterType#getAllowMultiSelect()
	 * @see #getEnumerationParameterType()
	 * @generated
	 */
	EAttribute getEnumerationParameterType_AllowMultiSelect();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.EnumerationParameterType#getValueDefinition <em>Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Definition</em>'.
	 * @see CDP4.SiteDirectoryData.EnumerationParameterType#getValueDefinition()
	 * @see #getEnumerationParameterType()
	 * @generated
	 */
	EReference getEnumerationParameterType_ValueDefinition();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.EnumerationValueDefinition <em>Enumeration Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Value Definition</em>'.
	 * @see CDP4.SiteDirectoryData.EnumerationValueDefinition
	 * @generated
	 */
	EClass getEnumerationValueDefinition();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.OrdinalScale <em>Ordinal Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordinal Scale</em>'.
	 * @see CDP4.SiteDirectoryData.OrdinalScale
	 * @generated
	 */
	EClass getOrdinalScale();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.OrdinalScale#getUseShortNameValues <em>Use Short Name Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Short Name Values</em>'.
	 * @see CDP4.SiteDirectoryData.OrdinalScale#getUseShortNameValues()
	 * @see #getOrdinalScale()
	 * @generated
	 */
	EAttribute getOrdinalScale_UseShortNameValues();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ReferencerRule <em>Referencer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referencer Rule</em>'.
	 * @see CDP4.SiteDirectoryData.ReferencerRule
	 * @generated
	 */
	EClass getReferencerRule();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ReferencerRule#getReferencingCategory <em>Referencing Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencing Category</em>'.
	 * @see CDP4.SiteDirectoryData.ReferencerRule#getReferencingCategory()
	 * @see #getReferencerRule()
	 * @generated
	 */
	EReference getReferencerRule_ReferencingCategory();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.ReferencerRule#getReferencedCategory <em>Referenced Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Category</em>'.
	 * @see CDP4.SiteDirectoryData.ReferencerRule#getReferencedCategory()
	 * @see #getReferencerRule()
	 * @generated
	 */
	EReference getReferencerRule_ReferencedCategory();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ReferencerRule#getMinReferenced <em>Min Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Referenced</em>'.
	 * @see CDP4.SiteDirectoryData.ReferencerRule#getMinReferenced()
	 * @see #getReferencerRule()
	 * @generated
	 */
	EAttribute getReferencerRule_MinReferenced();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ReferencerRule#getMaxReferenced <em>Max Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Referenced</em>'.
	 * @see CDP4.SiteDirectoryData.ReferencerRule#getMaxReferenced()
	 * @see #getReferencerRule()
	 * @generated
	 */
	EAttribute getReferencerRule_MaxReferenced();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.BooleanParameterType <em>Boolean Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.BooleanParameterType
	 * @generated
	 */
	EClass getBooleanParameterType();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ScaleReferenceQuantityValue <em>Scale Reference Quantity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Reference Quantity Value</em>'.
	 * @see CDP4.SiteDirectoryData.ScaleReferenceQuantityValue
	 * @generated
	 */
	EClass getScaleReferenceQuantityValue();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ScaleReferenceQuantityValue#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scale</em>'.
	 * @see CDP4.SiteDirectoryData.ScaleReferenceQuantityValue#getScale()
	 * @see #getScaleReferenceQuantityValue()
	 * @generated
	 */
	EReference getScaleReferenceQuantityValue_Scale();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ScaleReferenceQuantityValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CDP4.SiteDirectoryData.ScaleReferenceQuantityValue#getValue()
	 * @see #getScaleReferenceQuantityValue()
	 * @generated
	 */
	EAttribute getScaleReferenceQuantityValue_Value();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.DateParameterType <em>Date Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.DateParameterType
	 * @generated
	 */
	EClass getDateParameterType();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.LinearConversionUnit <em>Linear Conversion Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Conversion Unit</em>'.
	 * @see CDP4.SiteDirectoryData.LinearConversionUnit
	 * @generated
	 */
	EClass getLinearConversionUnit();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ConversionBasedUnit <em>Conversion Based Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Based Unit</em>'.
	 * @see CDP4.SiteDirectoryData.ConversionBasedUnit
	 * @generated
	 */
	EClass getConversionBasedUnit();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ConversionBasedUnit#getReferenceUnit <em>Reference Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Unit</em>'.
	 * @see CDP4.SiteDirectoryData.ConversionBasedUnit#getReferenceUnit()
	 * @see #getConversionBasedUnit()
	 * @generated
	 */
	EReference getConversionBasedUnit_ReferenceUnit();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.ConversionBasedUnit#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see CDP4.SiteDirectoryData.ConversionBasedUnit#getConversionFactor()
	 * @see #getConversionBasedUnit()
	 * @generated
	 */
	EAttribute getConversionBasedUnit_ConversionFactor();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.DerivedUnit <em>Derived Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Unit</em>'.
	 * @see CDP4.SiteDirectoryData.DerivedUnit
	 * @generated
	 */
	EClass getDerivedUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.DerivedUnit#getUnitFactor <em>Unit Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unit Factor</em>'.
	 * @see CDP4.SiteDirectoryData.DerivedUnit#getUnitFactor()
	 * @see #getDerivedUnit()
	 * @generated
	 */
	EReference getDerivedUnit_UnitFactor();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.UnitFactor <em>Unit Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Factor</em>'.
	 * @see CDP4.SiteDirectoryData.UnitFactor
	 * @generated
	 */
	EClass getUnitFactor();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.UnitFactor#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see CDP4.SiteDirectoryData.UnitFactor#getUnit()
	 * @see #getUnitFactor()
	 * @generated
	 */
	EReference getUnitFactor_Unit();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.UnitFactor#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see CDP4.SiteDirectoryData.UnitFactor#getExponent()
	 * @see #getUnitFactor()
	 * @generated
	 */
	EAttribute getUnitFactor_Exponent();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.QuantityKindFactor <em>Quantity Kind Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Kind Factor</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKindFactor
	 * @generated
	 */
	EClass getQuantityKindFactor();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.QuantityKindFactor#getQuantityKind <em>Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Kind</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKindFactor#getQuantityKind()
	 * @see #getQuantityKindFactor()
	 * @generated
	 */
	EReference getQuantityKindFactor_QuantityKind();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.QuantityKindFactor#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see CDP4.SiteDirectoryData.QuantityKindFactor#getExponent()
	 * @see #getQuantityKindFactor()
	 * @generated
	 */
	EAttribute getQuantityKindFactor_Exponent();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.TextParameterType <em>Text Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.TextParameterType
	 * @generated
	 */
	EClass getTextParameterType();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.IntervalScale <em>Interval Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Scale</em>'.
	 * @see CDP4.SiteDirectoryData.IntervalScale
	 * @generated
	 */
	EClass getIntervalScale();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.SpecializedQuantityKind <em>Specialized Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialized Quantity Kind</em>'.
	 * @see CDP4.SiteDirectoryData.SpecializedQuantityKind
	 * @generated
	 */
	EClass getSpecializedQuantityKind();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.SpecializedQuantityKind#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see CDP4.SiteDirectoryData.SpecializedQuantityKind#getGeneral()
	 * @see #getSpecializedQuantityKind()
	 * @generated
	 */
	EReference getSpecializedQuantityKind_General();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.SimpleUnit <em>Simple Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Unit</em>'.
	 * @see CDP4.SiteDirectoryData.SimpleUnit
	 * @generated
	 */
	EClass getSimpleUnit();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.MultiRelationshipRule <em>Multi Relationship Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Relationship Rule</em>'.
	 * @see CDP4.SiteDirectoryData.MultiRelationshipRule
	 * @generated
	 */
	EClass getMultiRelationshipRule();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getRelationshipCategory <em>Relationship Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship Category</em>'.
	 * @see CDP4.SiteDirectoryData.MultiRelationshipRule#getRelationshipCategory()
	 * @see #getMultiRelationshipRule()
	 * @generated
	 */
	EReference getMultiRelationshipRule_RelationshipCategory();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getRelatedCategory <em>Related Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Category</em>'.
	 * @see CDP4.SiteDirectoryData.MultiRelationshipRule#getRelatedCategory()
	 * @see #getMultiRelationshipRule()
	 * @generated
	 */
	EReference getMultiRelationshipRule_RelatedCategory();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getMinRelated <em>Min Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Related</em>'.
	 * @see CDP4.SiteDirectoryData.MultiRelationshipRule#getMinRelated()
	 * @see #getMultiRelationshipRule()
	 * @generated
	 */
	EAttribute getMultiRelationshipRule_MinRelated();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getMaxRelated <em>Max Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Related</em>'.
	 * @see CDP4.SiteDirectoryData.MultiRelationshipRule#getMaxRelated()
	 * @see #getMultiRelationshipRule()
	 * @generated
	 */
	EAttribute getMultiRelationshipRule_MaxRelated();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.SimpleQuantityKind <em>Simple Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Quantity Kind</em>'.
	 * @see CDP4.SiteDirectoryData.SimpleQuantityKind
	 * @generated
	 */
	EClass getSimpleQuantityKind();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.PrefixedUnit <em>Prefixed Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefixed Unit</em>'.
	 * @see CDP4.SiteDirectoryData.PrefixedUnit
	 * @generated
	 */
	EClass getPrefixedUnit();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.PrefixedUnit#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see CDP4.SiteDirectoryData.PrefixedUnit#getPrefix()
	 * @see #getPrefixedUnit()
	 * @generated
	 */
	EReference getPrefixedUnit_Prefix();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.DateTimeParameterType <em>Date Time Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.DateTimeParameterType
	 * @generated
	 */
	EClass getDateTimeParameterType();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.TimeOfDayParameterType <em>Time Of Day Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Of Day Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.TimeOfDayParameterType
	 * @generated
	 */
	EClass getTimeOfDayParameterType();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.DecompositionRule <em>Decomposition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition Rule</em>'.
	 * @see CDP4.SiteDirectoryData.DecompositionRule
	 * @generated
	 */
	EClass getDecompositionRule();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.DecompositionRule#getContainingCategory <em>Containing Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Category</em>'.
	 * @see CDP4.SiteDirectoryData.DecompositionRule#getContainingCategory()
	 * @see #getDecompositionRule()
	 * @generated
	 */
	EReference getDecompositionRule_ContainingCategory();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.DecompositionRule#getContainedCategory <em>Contained Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Category</em>'.
	 * @see CDP4.SiteDirectoryData.DecompositionRule#getContainedCategory()
	 * @see #getDecompositionRule()
	 * @generated
	 */
	EReference getDecompositionRule_ContainedCategory();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.DecompositionRule#getMinContained <em>Min Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Contained</em>'.
	 * @see CDP4.SiteDirectoryData.DecompositionRule#getMinContained()
	 * @see #getDecompositionRule()
	 * @generated
	 */
	EAttribute getDecompositionRule_MinContained();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.DecompositionRule#getMaxContained <em>Max Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Contained</em>'.
	 * @see CDP4.SiteDirectoryData.DecompositionRule#getMaxContained()
	 * @see #getDecompositionRule()
	 * @generated
	 */
	EAttribute getDecompositionRule_MaxContained();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.DerivedQuantityKind <em>Derived Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Quantity Kind</em>'.
	 * @see CDP4.SiteDirectoryData.DerivedQuantityKind
	 * @generated
	 */
	EClass getDerivedQuantityKind();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.SiteDirectoryData.DerivedQuantityKind#getQuantityKindFactor <em>Quantity Kind Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity Kind Factor</em>'.
	 * @see CDP4.SiteDirectoryData.DerivedQuantityKind#getQuantityKindFactor()
	 * @see #getDerivedQuantityKind()
	 * @generated
	 */
	EReference getDerivedQuantityKind_QuantityKindFactor();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.LogarithmicScale <em>Logarithmic Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logarithmic Scale</em>'.
	 * @see CDP4.SiteDirectoryData.LogarithmicScale
	 * @generated
	 */
	EClass getLogarithmicScale();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.LogarithmicScale#getLogarithmBase <em>Logarithm Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logarithm Base</em>'.
	 * @see CDP4.SiteDirectoryData.LogarithmicScale#getLogarithmBase()
	 * @see #getLogarithmicScale()
	 * @generated
	 */
	EAttribute getLogarithmicScale_LogarithmBase();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.LogarithmicScale#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see CDP4.SiteDirectoryData.LogarithmicScale#getFactor()
	 * @see #getLogarithmicScale()
	 * @generated
	 */
	EAttribute getLogarithmicScale_Factor();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.SiteDirectoryData.LogarithmicScale#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see CDP4.SiteDirectoryData.LogarithmicScale#getExponent()
	 * @see #getLogarithmicScale()
	 * @generated
	 */
	EAttribute getLogarithmicScale_Exponent();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.LogarithmicScale#getReferenceQuantityKind <em>Reference Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Quantity Kind</em>'.
	 * @see CDP4.SiteDirectoryData.LogarithmicScale#getReferenceQuantityKind()
	 * @see #getLogarithmicScale()
	 * @generated
	 */
	EReference getLogarithmicScale_ReferenceQuantityKind();

	/**
	 * Returns the meta object for the containment reference '{@link CDP4.SiteDirectoryData.LogarithmicScale#getReferenceQuantityValue <em>Reference Quantity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Quantity Value</em>'.
	 * @see CDP4.SiteDirectoryData.LogarithmicScale#getReferenceQuantityValue()
	 * @see #getLogarithmicScale()
	 * @generated
	 */
	EReference getLogarithmicScale_ReferenceQuantityValue();

	/**
	 * Returns the meta object for class '{@link CDP4.SiteDirectoryData.ParameterizedCategoryRule <em>Parameterized Category Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Category Rule</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterizedCategoryRule
	 * @generated
	 */
	EClass getParameterizedCategoryRule();

	/**
	 * Returns the meta object for the reference '{@link CDP4.SiteDirectoryData.ParameterizedCategoryRule#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterizedCategoryRule#getCategory()
	 * @see #getParameterizedCategoryRule()
	 * @generated
	 */
	EReference getParameterizedCategoryRule_Category();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.SiteDirectoryData.ParameterizedCategoryRule#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Type</em>'.
	 * @see CDP4.SiteDirectoryData.ParameterizedCategoryRule#getParameterType()
	 * @see #getParameterizedCategoryRule()
	 * @generated
	 */
	EReference getParameterizedCategoryRule_ParameterType();

	/**
	 * Returns the meta object for enum '{@link CDP4.SiteDirectoryData.VcardEmailAddressKind <em>Vcard Email Address Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vcard Email Address Kind</em>'.
	 * @see CDP4.SiteDirectoryData.VcardEmailAddressKind
	 * @generated
	 */
	EEnum getVcardEmailAddressKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.SiteDirectoryData.VcardTelephoneNumberKind <em>Vcard Telephone Number Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vcard Telephone Number Kind</em>'.
	 * @see CDP4.SiteDirectoryData.VcardTelephoneNumberKind
	 * @generated
	 */
	EEnum getVcardTelephoneNumberKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.SiteDirectoryData.NumberSetKind <em>Number Set Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Set Kind</em>'.
	 * @see CDP4.SiteDirectoryData.NumberSetKind
	 * @generated
	 */
	EEnum getNumberSetKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.SiteDirectoryData.EngineeringModelKind <em>Engineering Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Engineering Model Kind</em>'.
	 * @see CDP4.SiteDirectoryData.EngineeringModelKind
	 * @generated
	 */
	EEnum getEngineeringModelKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.SiteDirectoryData.StudyPhaseKind <em>Study Phase Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Study Phase Kind</em>'.
	 * @see CDP4.SiteDirectoryData.StudyPhaseKind
	 * @generated
	 */
	EEnum getStudyPhaseKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.SiteDirectoryData.LogarithmBaseKind <em>Logarithm Base Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logarithm Base Kind</em>'.
	 * @see CDP4.SiteDirectoryData.LogarithmBaseKind
	 * @generated
	 */
	EEnum getLogarithmBaseKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SiteDirectoryDataFactory getSiteDirectoryDataFactory();

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
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ParticipantPermissionImpl <em>Participant Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ParticipantPermissionImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParticipantPermission()
		 * @generated
		 */
		EClass PARTICIPANT_PERMISSION = eINSTANCE.getParticipantPermission();

		/**
		 * The meta object literal for the '<em><b>Access Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_PERMISSION__ACCESS_RIGHT = eINSTANCE.getParticipantPermission_AccessRight();

		/**
		 * The meta object literal for the '<em><b>Object Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_PERMISSION__OBJECT_CLASS = eINSTANCE.getParticipantPermission_ObjectClass();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl <em>Reference Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ReferenceSourceImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getReferenceSource()
		 * @generated
		 */
		EClass REFERENCE_SOURCE = eINSTANCE.getReferenceSource();

		/**
		 * The meta object literal for the '<em><b>Version Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_SOURCE__VERSION_IDENTIFIER = eINSTANCE.getReferenceSource_VersionIdentifier();

		/**
		 * The meta object literal for the '<em><b>Version Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_SOURCE__VERSION_DATE = eINSTANCE.getReferenceSource_VersionDate();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_SOURCE__AUTHOR = eINSTANCE.getReferenceSource_Author();

		/**
		 * The meta object literal for the '<em><b>Publication Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_SOURCE__PUBLICATION_YEAR = eINSTANCE.getReferenceSource_PublicationYear();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SOURCE__PUBLISHER = eINSTANCE.getReferenceSource_Publisher();

		/**
		 * The meta object literal for the '<em><b>Published In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_SOURCE__PUBLISHED_IN = eINSTANCE.getReferenceSource_PublishedIn();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_SOURCE__LANGUAGE = eINSTANCE.getReferenceSource_Language();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.CategorizableThingImpl <em>Categorizable Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.CategorizableThingImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getCategorizableThing()
		 * @generated
		 */
		EClass CATEGORIZABLE_THING = eINSTANCE.getCategorizableThing();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZABLE_THING__CATEGORY = eINSTANCE.getCategorizableThing_Category();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.CategoryImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Super Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUPER_CATEGORY = eINSTANCE.getCategory_SuperCategory();

		/**
		 * The meta object literal for the '<em><b>Permissible Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__PERMISSIBLE_CLASS = eINSTANCE.getCategory_PermissibleClass();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__IS_ABSTRACT = eINSTANCE.getCategory_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Super Sub Graph Is Acyclic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___SUPER_SUB_GRAPH_IS_ACYCLIC__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCategory__SuperSubGraphIsAcyclic__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Get All Supershelperoperation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___GET_ALL_SUPERSHELPEROPERATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCategory__GetAllSupershelperoperation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.OrganizationImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.PersonImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ORGANIZATION = eINSTANCE.getPerson_Organization();

		/**
		 * The meta object literal for the '<em><b>Given Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GIVEN_NAME = eINSTANCE.getPerson_GivenName();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SURNAME = eINSTANCE.getPerson_Surname();

		/**
		 * The meta object literal for the '<em><b>Organizational Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ORGANIZATIONAL_UNIT = eINSTANCE.getPerson_OrganizationalUnit();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__EMAIL_ADDRESS = eINSTANCE.getPerson_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Telephone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__TELEPHONE_NUMBER = eINSTANCE.getPerson_TelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Default Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DEFAULT_DOMAIN = eINSTANCE.getPerson_DefaultDomain();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__IS_ACTIVE = eINSTANCE.getPerson_IsActive();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROLE = eINSTANCE.getPerson_Role();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSWORD = eINSTANCE.getPerson_Password();

		/**
		 * The meta object literal for the '<em><b>Salt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SALT = eINSTANCE.getPerson_Salt();

		/**
		 * The meta object literal for the '<em><b>Default Email Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DEFAULT_EMAIL_ADDRESS = eINSTANCE.getPerson_DefaultEmailAddress();

		/**
		 * The meta object literal for the '<em><b>Default Telephone Number</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DEFAULT_TELEPHONE_NUMBER = eINSTANCE.getPerson_DefaultTelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>User Preference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__USER_PREFERENCE = eINSTANCE.getPerson_UserPreference();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.EmailAddressImpl <em>Email Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.EmailAddressImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEmailAddress()
		 * @generated
		 */
		EClass EMAIL_ADDRESS = eINSTANCE.getEmailAddress();

		/**
		 * The meta object literal for the '<em><b>Vcard Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS__VCARD_TYPE = eINSTANCE.getEmailAddress_VcardType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS__VALUE = eINSTANCE.getEmailAddress_Value();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.TelephoneNumberImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getTelephoneNumber()
		 * @generated
		 */
		EClass TELEPHONE_NUMBER = eINSTANCE.getTelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Vcard Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__VCARD_TYPE = eINSTANCE.getTelephoneNumber_VcardType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__VALUE = eINSTANCE.getTelephoneNumber_Value();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.DomainOfExpertiseImpl <em>Domain Of Expertise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.DomainOfExpertiseImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDomainOfExpertise()
		 * @generated
		 */
		EClass DOMAIN_OF_EXPERTISE = eINSTANCE.getDomainOfExpertise();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.PersonRoleImpl <em>Person Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.PersonRoleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getPersonRole()
		 * @generated
		 */
		EClass PERSON_ROLE = eINSTANCE.getPersonRole();

		/**
		 * The meta object literal for the '<em><b>Person Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_ROLE__PERSON_PERMISSION = eINSTANCE.getPersonRole_PersonPermission();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.PersonPermissionImpl <em>Person Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.PersonPermissionImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getPersonPermission()
		 * @generated
		 */
		EClass PERSON_PERMISSION = eINSTANCE.getPersonPermission();

		/**
		 * The meta object literal for the '<em><b>Access Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_PERMISSION__ACCESS_RIGHT = eINSTANCE.getPersonPermission_AccessRight();

		/**
		 * The meta object literal for the '<em><b>Object Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_PERMISSION__OBJECT_CLASS = eINSTANCE.getPersonPermission_ObjectClass();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.UserPreferenceImpl <em>User Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.UserPreferenceImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getUserPreference()
		 * @generated
		 */
		EClass USER_PREFERENCE = eINSTANCE.getUserPreference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREFERENCE__VALUE = eINSTANCE.getUserPreference_Value();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl <em>Site Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSiteDirectory()
		 * @generated
		 */
		EClass SITE_DIRECTORY = eINSTANCE.getSiteDirectory();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__ORGANIZATION = eINSTANCE.getSiteDirectory_Organization();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__PERSON = eINSTANCE.getSiteDirectory_Person();

		/**
		 * The meta object literal for the '<em><b>Participant Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__PARTICIPANT_ROLE = eINSTANCE.getSiteDirectory_ParticipantRole();

		/**
		 * The meta object literal for the '<em><b>Default Participant Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE = eINSTANCE.getSiteDirectory_DefaultParticipantRole();

		/**
		 * The meta object literal for the '<em><b>Site Reference Data Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY = eINSTANCE.getSiteDirectory_SiteReferenceDataLibrary();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__MODEL = eINSTANCE.getSiteDirectory_Model();

		/**
		 * The meta object literal for the '<em><b>Person Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__PERSON_ROLE = eINSTANCE.getSiteDirectory_PersonRole();

		/**
		 * The meta object literal for the '<em><b>Default Person Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__DEFAULT_PERSON_ROLE = eINSTANCE.getSiteDirectory_DefaultPersonRole();

		/**
		 * The meta object literal for the '<em><b>Log Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__LOG_ENTRY = eINSTANCE.getSiteDirectory_LogEntry();

		/**
		 * The meta object literal for the '<em><b>Domain Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__DOMAIN_GROUP = eINSTANCE.getSiteDirectory_DomainGroup();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__DOMAIN = eINSTANCE.getSiteDirectory_Domain();

		/**
		 * The meta object literal for the '<em><b>Natural Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__NATURAL_LANGUAGE = eINSTANCE.getSiteDirectory_NaturalLanguage();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY__ANNOTATION = eINSTANCE.getSiteDirectory_Annotation();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ParticipantRoleImpl <em>Participant Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ParticipantRoleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParticipantRole()
		 * @generated
		 */
		EClass PARTICIPANT_ROLE = eINSTANCE.getParticipantRole();

		/**
		 * The meta object literal for the '<em><b>Participant Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_ROLE__PARTICIPANT_PERMISSION = eINSTANCE.getParticipantRole_ParticipantPermission();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.SiteReferenceDataLibraryImpl <em>Site Reference Data Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.SiteReferenceDataLibraryImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSiteReferenceDataLibrary()
		 * @generated
		 */
		EClass SITE_REFERENCE_DATA_LIBRARY = eINSTANCE.getSiteReferenceDataLibrary();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl <em>Reference Data Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getReferenceDataLibrary()
		 * @generated
		 */
		EClass REFERENCE_DATA_LIBRARY = eINSTANCE.getReferenceDataLibrary();

		/**
		 * The meta object literal for the '<em><b>Defined Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY = eINSTANCE.getReferenceDataLibrary_DefinedCategory();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__PARAMETER_TYPE = eINSTANCE.getReferenceDataLibrary_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Base Quantity Kind</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND = eINSTANCE.getReferenceDataLibrary_BaseQuantityKind();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__SCALE = eINSTANCE.getReferenceDataLibrary_Scale();

		/**
		 * The meta object literal for the '<em><b>Unit Prefix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__UNIT_PREFIX = eINSTANCE.getReferenceDataLibrary_UnitPrefix();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__UNIT = eINSTANCE.getReferenceDataLibrary_Unit();

		/**
		 * The meta object literal for the '<em><b>Base Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__BASE_UNIT = eINSTANCE.getReferenceDataLibrary_BaseUnit();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__FILE_TYPE = eINSTANCE.getReferenceDataLibrary_FileType();

		/**
		 * The meta object literal for the '<em><b>Glossary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__GLOSSARY = eINSTANCE.getReferenceDataLibrary_Glossary();

		/**
		 * The meta object literal for the '<em><b>Reference Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE = eINSTANCE.getReferenceDataLibrary_ReferenceSource();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__RULE = eINSTANCE.getReferenceDataLibrary_Rule();

		/**
		 * The meta object literal for the '<em><b>Required Rdl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__REQUIRED_RDL = eINSTANCE.getReferenceDataLibrary_RequiredRdl();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_DATA_LIBRARY__CONSTANT = eINSTANCE.getReferenceDataLibrary_Constant();

		/**
		 * The meta object literal for the '<em><b>Has Unique Parameter Type Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getReferenceDataLibrary__HasUniqueParameterTypeNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Unique Parameter Type Short Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getReferenceDataLibrary__HasUniqueParameterTypeShortNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Unique Category Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getReferenceDataLibrary__HasUniqueCategoryNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Unique Category Short Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getReferenceDataLibrary__HasUniqueCategoryShortNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ParticipantAffectedAccessThingImpl <em>Participant Affected Access Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ParticipantAffectedAccessThingImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParticipantAffectedAccessThing()
		 * @generated
		 */
		EClass PARTICIPANT_AFFECTED_ACCESS_THING = eINSTANCE.getParticipantAffectedAccessThing();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Number Of Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__NUMBER_OF_VALUES = eINSTANCE.getParameterType_NumberOfValues();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__SYMBOL = eINSTANCE.getParameterType_Symbol();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.QuantityKindImpl <em>Quantity Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.QuantityKindImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getQuantityKind()
		 * @generated
		 */
		EClass QUANTITY_KIND = eINSTANCE.getQuantityKind();

		/**
		 * The meta object literal for the '<em><b>Possible Scale</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_KIND__POSSIBLE_SCALE = eINSTANCE.getQuantityKind_PossibleScale();

		/**
		 * The meta object literal for the '<em><b>Default Scale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_KIND__DEFAULT_SCALE = eINSTANCE.getQuantityKind_DefaultScale();

		/**
		 * The meta object literal for the '<em><b>All Possible Scale</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_KIND__ALL_POSSIBLE_SCALE = eINSTANCE.getQuantityKind_AllPossibleScale();

		/**
		 * The meta object literal for the '<em><b>Quantity Dimension Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL = eINSTANCE.getQuantityKind_QuantityDimensionSymbol();

		/**
		 * The meta object literal for the '<em><b>Quantity Dimension Exponent</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT = eINSTANCE.getQuantityKind_QuantityDimensionExponent();

		/**
		 * The meta object literal for the '<em><b>Quantity Dimension Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION = eINSTANCE.getQuantityKind_QuantityDimensionExpression();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ScalarParameterTypeImpl <em>Scalar Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ScalarParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getScalarParameterType()
		 * @generated
		 */
		EClass SCALAR_PARAMETER_TYPE = eINSTANCE.getScalarParameterType();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl <em>Measurement Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.MeasurementScaleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getMeasurementScale()
		 * @generated
		 */
		EClass MEASUREMENT_SCALE = eINSTANCE.getMeasurementScale();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SCALE__UNIT = eINSTANCE.getMeasurementScale_Unit();

		/**
		 * The meta object literal for the '<em><b>Value Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SCALE__VALUE_DEFINITION = eINSTANCE.getMeasurementScale_ValueDefinition();

		/**
		 * The meta object literal for the '<em><b>Number Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SCALE__NUMBER_SET = eINSTANCE.getMeasurementScale_NumberSet();

		/**
		 * The meta object literal for the '<em><b>Minimum Permissible Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE = eINSTANCE.getMeasurementScale_MinimumPermissibleValue();

		/**
		 * The meta object literal for the '<em><b>Is Minimum Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE = eINSTANCE.getMeasurementScale_IsMinimumInclusive();

		/**
		 * The meta object literal for the '<em><b>Maximum Permissible Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE = eINSTANCE.getMeasurementScale_MaximumPermissibleValue();

		/**
		 * The meta object literal for the '<em><b>Is Maximum Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE = eINSTANCE.getMeasurementScale_IsMaximumInclusive();

		/**
		 * The meta object literal for the '<em><b>Positive Value Connotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION = eINSTANCE.getMeasurementScale_PositiveValueConnotation();

		/**
		 * The meta object literal for the '<em><b>Negative Value Connotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION = eINSTANCE.getMeasurementScale_NegativeValueConnotation();

		/**
		 * The meta object literal for the '<em><b>Mapping To Reference Scale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE = eINSTANCE.getMeasurementScale_MappingToReferenceScale();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.MeasurementUnitImpl <em>Measurement Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.MeasurementUnitImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getMeasurementUnit()
		 * @generated
		 */
		EClass MEASUREMENT_UNIT = eINSTANCE.getMeasurementUnit();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ScaleValueDefinitionImpl <em>Scale Value Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ScaleValueDefinitionImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getScaleValueDefinition()
		 * @generated
		 */
		EClass SCALE_VALUE_DEFINITION = eINSTANCE.getScaleValueDefinition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_VALUE_DEFINITION__VALUE = eINSTANCE.getScaleValueDefinition_Value();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.MappingToReferenceScaleImpl <em>Mapping To Reference Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.MappingToReferenceScaleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getMappingToReferenceScale()
		 * @generated
		 */
		EClass MAPPING_TO_REFERENCE_SCALE = eINSTANCE.getMappingToReferenceScale();

		/**
		 * The meta object literal for the '<em><b>Reference Scale Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE = eINSTANCE.getMappingToReferenceScale_ReferenceScaleValue();

		/**
		 * The meta object literal for the '<em><b>Dependent Scale Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE = eINSTANCE.getMappingToReferenceScale_DependentScaleValue();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.UnitPrefixImpl <em>Unit Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.UnitPrefixImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getUnitPrefix()
		 * @generated
		 */
		EClass UNIT_PREFIX = eINSTANCE.getUnitPrefix();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_PREFIX__CONVERSION_FACTOR = eINSTANCE.getUnitPrefix_ConversionFactor();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.FileTypeImpl <em>File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.FileTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getFileType()
		 * @generated
		 */
		EClass FILE_TYPE = eINSTANCE.getFileType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_TYPE__EXTENSION = eINSTANCE.getFileType_Extension();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.GlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.GlossaryImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getGlossary()
		 * @generated
		 */
		EClass GLOSSARY = eINSTANCE.getGlossary();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__TERM = eINSTANCE.getGlossary_Term();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.TermImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.RuleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ConstantImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__PARAMETER_TYPE = eINSTANCE.getConstant_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__SCALE = eINSTANCE.getConstant_Scale();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl <em>Engineering Model Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEngineeringModelSetup()
		 * @generated
		 */
		EClass ENGINEERING_MODEL_SETUP = eINSTANCE.getEngineeringModelSetup();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_SETUP__PARTICIPANT = eINSTANCE.getEngineeringModelSetup_Participant();

		/**
		 * The meta object literal for the '<em><b>Active Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_SETUP__ACTIVE_DOMAIN = eINSTANCE.getEngineeringModelSetup_ActiveDomain();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEERING_MODEL_SETUP__KIND = eINSTANCE.getEngineeringModelSetup_Kind();

		/**
		 * The meta object literal for the '<em><b>Study Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEERING_MODEL_SETUP__STUDY_PHASE = eINSTANCE.getEngineeringModelSetup_StudyPhase();

		/**
		 * The meta object literal for the '<em><b>Required Rdl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_SETUP__REQUIRED_RDL = eINSTANCE.getEngineeringModelSetup_RequiredRdl();

		/**
		 * The meta object literal for the '<em><b>Engineering Model Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEERING_MODEL_SETUP__ENGINEERING_MODEL_IID = eINSTANCE.getEngineeringModelSetup_EngineeringModelIid();

		/**
		 * The meta object literal for the '<em><b>Iteration Setup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_SETUP__ITERATION_SETUP = eINSTANCE.getEngineeringModelSetup_IterationSetup();

		/**
		 * The meta object literal for the '<em><b>Source Engineering Model Setup Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINEERING_MODEL_SETUP__SOURCE_ENGINEERING_MODEL_SETUP_IID = eINSTANCE.getEngineeringModelSetup_SourceEngineeringModelSetupIid();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ParticipantImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__IS_ACTIVE = eINSTANCE.getParticipant_IsActive();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PERSON = eINSTANCE.getParticipant_Person();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__ROLE = eINSTANCE.getParticipant_Role();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__DOMAIN = eINSTANCE.getParticipant_Domain();

		/**
		 * The meta object literal for the '<em><b>Selected Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__SELECTED_DOMAIN = eINSTANCE.getParticipant_SelectedDomain();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ModelReferenceDataLibraryImpl <em>Model Reference Data Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ModelReferenceDataLibraryImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getModelReferenceDataLibrary()
		 * @generated
		 */
		EClass MODEL_REFERENCE_DATA_LIBRARY = eINSTANCE.getModelReferenceDataLibrary();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl <em>Iteration Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.IterationSetupImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getIterationSetup()
		 * @generated
		 */
		EClass ITERATION_SETUP = eINSTANCE.getIterationSetup();

		/**
		 * The meta object literal for the '<em><b>Iteration Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_SETUP__ITERATION_IID = eINSTANCE.getIterationSetup_IterationIid();

		/**
		 * The meta object literal for the '<em><b>Iteration Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_SETUP__ITERATION_NUMBER = eINSTANCE.getIterationSetup_IterationNumber();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_SETUP__DESCRIPTION = eINSTANCE.getIterationSetup_Description();

		/**
		 * The meta object literal for the '<em><b>Source Iteration Setup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION_SETUP__SOURCE_ITERATION_SETUP = eINSTANCE.getIterationSetup_SourceIterationSetup();

		/**
		 * The meta object literal for the '<em><b>Frozen On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_SETUP__FROZEN_ON = eINSTANCE.getIterationSetup_FrozenOn();

		/**
		 * The meta object literal for the '<em><b>Is Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION_SETUP__IS_DELETED = eINSTANCE.getIterationSetup_IsDeleted();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.SiteLogEntryImpl <em>Site Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.SiteLogEntryImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSiteLogEntry()
		 * @generated
		 */
		EClass SITE_LOG_ENTRY = eINSTANCE.getSiteLogEntry();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.DomainOfExpertiseGroupImpl <em>Domain Of Expertise Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.DomainOfExpertiseGroupImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDomainOfExpertiseGroup()
		 * @generated
		 */
		EClass DOMAIN_OF_EXPERTISE_GROUP = eINSTANCE.getDomainOfExpertiseGroup();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OF_EXPERTISE_GROUP__DOMAIN = eINSTANCE.getDomainOfExpertiseGroup_Domain();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.NaturalLanguageImpl <em>Natural Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.NaturalLanguageImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getNaturalLanguage()
		 * @generated
		 */
		EClass NATURAL_LANGUAGE = eINSTANCE.getNaturalLanguage();

		/**
		 * The meta object literal for the '<em><b>Language Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_LANGUAGE__LANGUAGE_CODE = eINSTANCE.getNaturalLanguage_LanguageCode();

		/**
		 * The meta object literal for the '<em><b>Native Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_LANGUAGE__NATIVE_NAME = eINSTANCE.getNaturalLanguage_NativeName();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl <em>Binary Relationship Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getBinaryRelationshipRule()
		 * @generated
		 */
		EClass BINARY_RELATIONSHIP_RULE = eINSTANCE.getBinaryRelationshipRule();

		/**
		 * The meta object literal for the '<em><b>Relationship Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY = eINSTANCE.getBinaryRelationshipRule_RelationshipCategory();

		/**
		 * The meta object literal for the '<em><b>Source Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY = eINSTANCE.getBinaryRelationshipRule_SourceCategory();

		/**
		 * The meta object literal for the '<em><b>Target Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY = eINSTANCE.getBinaryRelationshipRule_TargetCategory();

		/**
		 * The meta object literal for the '<em><b>Forward Relationship Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_RELATIONSHIP_RULE__FORWARD_RELATIONSHIP_NAME = eINSTANCE.getBinaryRelationshipRule_ForwardRelationshipName();

		/**
		 * The meta object literal for the '<em><b>Inverse Relationship Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_RELATIONSHIP_RULE__INVERSE_RELATIONSHIP_NAME = eINSTANCE.getBinaryRelationshipRule_InverseRelationshipName();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ArrayParameterTypeImpl <em>Array Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ArrayParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getArrayParameterType()
		 * @generated
		 */
		EClass ARRAY_PARAMETER_TYPE = eINSTANCE.getArrayParameterType();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_PARAMETER_TYPE__DIMENSION = eINSTANCE.getArrayParameterType_Dimension();

		/**
		 * The meta object literal for the '<em><b>Is Tensor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_PARAMETER_TYPE__IS_TENSOR = eINSTANCE.getArrayParameterType_IsTensor();

		/**
		 * The meta object literal for the '<em><b>Has Single Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_PARAMETER_TYPE__HAS_SINGLE_COMPONENT_TYPE = eINSTANCE.getArrayParameterType_HasSingleComponentType();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_PARAMETER_TYPE__RANK = eINSTANCE.getArrayParameterType_Rank();

		/**
		 * The meta object literal for the '<em><b>Has Valid Number Of Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARRAY_PARAMETER_TYPE___HAS_VALID_NUMBER_OF_COMPONENTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArrayParameterType__HasValidNumberOfComponents__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.CompoundParameterTypeImpl <em>Compound Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.CompoundParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getCompoundParameterType()
		 * @generated
		 */
		EClass COMPOUND_PARAMETER_TYPE = eINSTANCE.getCompoundParameterType();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_PARAMETER_TYPE__COMPONENT = eINSTANCE.getCompoundParameterType_Component();

		/**
		 * The meta object literal for the '<em><b>Is Finalized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_PARAMETER_TYPE__IS_FINALIZED = eINSTANCE.getCompoundParameterType_IsFinalized();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ParameterTypeComponentImpl <em>Parameter Type Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ParameterTypeComponentImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParameterTypeComponent()
		 * @generated
		 */
		EClass PARAMETER_TYPE_COMPONENT = eINSTANCE.getParameterTypeComponent();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE = eINSTANCE.getParameterTypeComponent_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TYPE_COMPONENT__SCALE = eINSTANCE.getParameterTypeComponent_Scale();

		/**
		 * The meta object literal for the '<em><b>Has Valid Scale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_TYPE_COMPONENT___HAS_VALID_SCALE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getParameterTypeComponent__HasValidScale__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.CyclicRatioScaleImpl <em>Cyclic Ratio Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.CyclicRatioScaleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getCyclicRatioScale()
		 * @generated
		 */
		EClass CYCLIC_RATIO_SCALE = eINSTANCE.getCyclicRatioScale();

		/**
		 * The meta object literal for the '<em><b>Modulus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYCLIC_RATIO_SCALE__MODULUS = eINSTANCE.getCyclicRatioScale_Modulus();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.RatioScaleImpl <em>Ratio Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.RatioScaleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getRatioScale()
		 * @generated
		 */
		EClass RATIO_SCALE = eINSTANCE.getRatioScale();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.EnumerationParameterTypeImpl <em>Enumeration Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.EnumerationParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEnumerationParameterType()
		 * @generated
		 */
		EClass ENUMERATION_PARAMETER_TYPE = eINSTANCE.getEnumerationParameterType();

		/**
		 * The meta object literal for the '<em><b>Allow Multi Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_PARAMETER_TYPE__ALLOW_MULTI_SELECT = eINSTANCE.getEnumerationParameterType_AllowMultiSelect();

		/**
		 * The meta object literal for the '<em><b>Value Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION = eINSTANCE.getEnumerationParameterType_ValueDefinition();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.EnumerationValueDefinitionImpl <em>Enumeration Value Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.EnumerationValueDefinitionImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEnumerationValueDefinition()
		 * @generated
		 */
		EClass ENUMERATION_VALUE_DEFINITION = eINSTANCE.getEnumerationValueDefinition();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.OrdinalScaleImpl <em>Ordinal Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.OrdinalScaleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getOrdinalScale()
		 * @generated
		 */
		EClass ORDINAL_SCALE = eINSTANCE.getOrdinalScale();

		/**
		 * The meta object literal for the '<em><b>Use Short Name Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALE__USE_SHORT_NAME_VALUES = eINSTANCE.getOrdinalScale_UseShortNameValues();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ReferencerRuleImpl <em>Referencer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ReferencerRuleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getReferencerRule()
		 * @generated
		 */
		EClass REFERENCER_RULE = eINSTANCE.getReferencerRule();

		/**
		 * The meta object literal for the '<em><b>Referencing Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCER_RULE__REFERENCING_CATEGORY = eINSTANCE.getReferencerRule_ReferencingCategory();

		/**
		 * The meta object literal for the '<em><b>Referenced Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCER_RULE__REFERENCED_CATEGORY = eINSTANCE.getReferencerRule_ReferencedCategory();

		/**
		 * The meta object literal for the '<em><b>Min Referenced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCER_RULE__MIN_REFERENCED = eINSTANCE.getReferencerRule_MinReferenced();

		/**
		 * The meta object literal for the '<em><b>Max Referenced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCER_RULE__MAX_REFERENCED = eINSTANCE.getReferencerRule_MaxReferenced();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.BooleanParameterTypeImpl <em>Boolean Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.BooleanParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getBooleanParameterType()
		 * @generated
		 */
		EClass BOOLEAN_PARAMETER_TYPE = eINSTANCE.getBooleanParameterType();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ScaleReferenceQuantityValueImpl <em>Scale Reference Quantity Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ScaleReferenceQuantityValueImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getScaleReferenceQuantityValue()
		 * @generated
		 */
		EClass SCALE_REFERENCE_QUANTITY_VALUE = eINSTANCE.getScaleReferenceQuantityValue();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALE_REFERENCE_QUANTITY_VALUE__SCALE = eINSTANCE.getScaleReferenceQuantityValue_Scale();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_REFERENCE_QUANTITY_VALUE__VALUE = eINSTANCE.getScaleReferenceQuantityValue_Value();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.DateParameterTypeImpl <em>Date Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.DateParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDateParameterType()
		 * @generated
		 */
		EClass DATE_PARAMETER_TYPE = eINSTANCE.getDateParameterType();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.LinearConversionUnitImpl <em>Linear Conversion Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.LinearConversionUnitImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getLinearConversionUnit()
		 * @generated
		 */
		EClass LINEAR_CONVERSION_UNIT = eINSTANCE.getLinearConversionUnit();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ConversionBasedUnitImpl <em>Conversion Based Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ConversionBasedUnitImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getConversionBasedUnit()
		 * @generated
		 */
		EClass CONVERSION_BASED_UNIT = eINSTANCE.getConversionBasedUnit();

		/**
		 * The meta object literal for the '<em><b>Reference Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_BASED_UNIT__REFERENCE_UNIT = eINSTANCE.getConversionBasedUnit_ReferenceUnit();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_BASED_UNIT__CONVERSION_FACTOR = eINSTANCE.getConversionBasedUnit_ConversionFactor();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.DerivedUnitImpl <em>Derived Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.DerivedUnitImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDerivedUnit()
		 * @generated
		 */
		EClass DERIVED_UNIT = eINSTANCE.getDerivedUnit();

		/**
		 * The meta object literal for the '<em><b>Unit Factor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_UNIT__UNIT_FACTOR = eINSTANCE.getDerivedUnit_UnitFactor();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.UnitFactorImpl <em>Unit Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.UnitFactorImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getUnitFactor()
		 * @generated
		 */
		EClass UNIT_FACTOR = eINSTANCE.getUnitFactor();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_FACTOR__UNIT = eINSTANCE.getUnitFactor_Unit();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_FACTOR__EXPONENT = eINSTANCE.getUnitFactor_Exponent();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.QuantityKindFactorImpl <em>Quantity Kind Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.QuantityKindFactorImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getQuantityKindFactor()
		 * @generated
		 */
		EClass QUANTITY_KIND_FACTOR = eINSTANCE.getQuantityKindFactor();

		/**
		 * The meta object literal for the '<em><b>Quantity Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_KIND_FACTOR__QUANTITY_KIND = eINSTANCE.getQuantityKindFactor_QuantityKind();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_KIND_FACTOR__EXPONENT = eINSTANCE.getQuantityKindFactor_Exponent();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.TextParameterTypeImpl <em>Text Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.TextParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getTextParameterType()
		 * @generated
		 */
		EClass TEXT_PARAMETER_TYPE = eINSTANCE.getTextParameterType();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.IntervalScaleImpl <em>Interval Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.IntervalScaleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getIntervalScale()
		 * @generated
		 */
		EClass INTERVAL_SCALE = eINSTANCE.getIntervalScale();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.SpecializedQuantityKindImpl <em>Specialized Quantity Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.SpecializedQuantityKindImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSpecializedQuantityKind()
		 * @generated
		 */
		EClass SPECIALIZED_QUANTITY_KIND = eINSTANCE.getSpecializedQuantityKind();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZED_QUANTITY_KIND__GENERAL = eINSTANCE.getSpecializedQuantityKind_General();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.SimpleUnitImpl <em>Simple Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.SimpleUnitImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSimpleUnit()
		 * @generated
		 */
		EClass SIMPLE_UNIT = eINSTANCE.getSimpleUnit();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.MultiRelationshipRuleImpl <em>Multi Relationship Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.MultiRelationshipRuleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getMultiRelationshipRule()
		 * @generated
		 */
		EClass MULTI_RELATIONSHIP_RULE = eINSTANCE.getMultiRelationshipRule();

		/**
		 * The meta object literal for the '<em><b>Relationship Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY = eINSTANCE.getMultiRelationshipRule_RelationshipCategory();

		/**
		 * The meta object literal for the '<em><b>Related Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_RELATIONSHIP_RULE__RELATED_CATEGORY = eINSTANCE.getMultiRelationshipRule_RelatedCategory();

		/**
		 * The meta object literal for the '<em><b>Min Related</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_RELATIONSHIP_RULE__MIN_RELATED = eINSTANCE.getMultiRelationshipRule_MinRelated();

		/**
		 * The meta object literal for the '<em><b>Max Related</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_RELATIONSHIP_RULE__MAX_RELATED = eINSTANCE.getMultiRelationshipRule_MaxRelated();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.SimpleQuantityKindImpl <em>Simple Quantity Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.SimpleQuantityKindImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getSimpleQuantityKind()
		 * @generated
		 */
		EClass SIMPLE_QUANTITY_KIND = eINSTANCE.getSimpleQuantityKind();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.PrefixedUnitImpl <em>Prefixed Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.PrefixedUnitImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getPrefixedUnit()
		 * @generated
		 */
		EClass PREFIXED_UNIT = eINSTANCE.getPrefixedUnit();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFIXED_UNIT__PREFIX = eINSTANCE.getPrefixedUnit_Prefix();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.DateTimeParameterTypeImpl <em>Date Time Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.DateTimeParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDateTimeParameterType()
		 * @generated
		 */
		EClass DATE_TIME_PARAMETER_TYPE = eINSTANCE.getDateTimeParameterType();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.TimeOfDayParameterTypeImpl <em>Time Of Day Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.TimeOfDayParameterTypeImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getTimeOfDayParameterType()
		 * @generated
		 */
		EClass TIME_OF_DAY_PARAMETER_TYPE = eINSTANCE.getTimeOfDayParameterType();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.DecompositionRuleImpl <em>Decomposition Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.DecompositionRuleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDecompositionRule()
		 * @generated
		 */
		EClass DECOMPOSITION_RULE = eINSTANCE.getDecompositionRule();

		/**
		 * The meta object literal for the '<em><b>Containing Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION_RULE__CONTAINING_CATEGORY = eINSTANCE.getDecompositionRule_ContainingCategory();

		/**
		 * The meta object literal for the '<em><b>Contained Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION_RULE__CONTAINED_CATEGORY = eINSTANCE.getDecompositionRule_ContainedCategory();

		/**
		 * The meta object literal for the '<em><b>Min Contained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECOMPOSITION_RULE__MIN_CONTAINED = eINSTANCE.getDecompositionRule_MinContained();

		/**
		 * The meta object literal for the '<em><b>Max Contained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECOMPOSITION_RULE__MAX_CONTAINED = eINSTANCE.getDecompositionRule_MaxContained();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.DerivedQuantityKindImpl <em>Derived Quantity Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.DerivedQuantityKindImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getDerivedQuantityKind()
		 * @generated
		 */
		EClass DERIVED_QUANTITY_KIND = eINSTANCE.getDerivedQuantityKind();

		/**
		 * The meta object literal for the '<em><b>Quantity Kind Factor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR = eINSTANCE.getDerivedQuantityKind_QuantityKindFactor();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl <em>Logarithmic Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getLogarithmicScale()
		 * @generated
		 */
		EClass LOGARITHMIC_SCALE = eINSTANCE.getLogarithmicScale();

		/**
		 * The meta object literal for the '<em><b>Logarithm Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGARITHMIC_SCALE__LOGARITHM_BASE = eINSTANCE.getLogarithmicScale_LogarithmBase();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGARITHMIC_SCALE__FACTOR = eINSTANCE.getLogarithmicScale_Factor();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGARITHMIC_SCALE__EXPONENT = eINSTANCE.getLogarithmicScale_Exponent();

		/**
		 * The meta object literal for the '<em><b>Reference Quantity Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND = eINSTANCE.getLogarithmicScale_ReferenceQuantityKind();

		/**
		 * The meta object literal for the '<em><b>Reference Quantity Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE = eINSTANCE.getLogarithmicScale_ReferenceQuantityValue();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.impl.ParameterizedCategoryRuleImpl <em>Parameterized Category Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.impl.ParameterizedCategoryRuleImpl
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getParameterizedCategoryRule()
		 * @generated
		 */
		EClass PARAMETERIZED_CATEGORY_RULE = eINSTANCE.getParameterizedCategoryRule();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_CATEGORY_RULE__CATEGORY = eINSTANCE.getParameterizedCategoryRule_Category();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_CATEGORY_RULE__PARAMETER_TYPE = eINSTANCE.getParameterizedCategoryRule_ParameterType();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.VcardEmailAddressKind <em>Vcard Email Address Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.VcardEmailAddressKind
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getVcardEmailAddressKind()
		 * @generated
		 */
		EEnum VCARD_EMAIL_ADDRESS_KIND = eINSTANCE.getVcardEmailAddressKind();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.VcardTelephoneNumberKind <em>Vcard Telephone Number Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.VcardTelephoneNumberKind
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getVcardTelephoneNumberKind()
		 * @generated
		 */
		EEnum VCARD_TELEPHONE_NUMBER_KIND = eINSTANCE.getVcardTelephoneNumberKind();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.NumberSetKind <em>Number Set Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.NumberSetKind
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getNumberSetKind()
		 * @generated
		 */
		EEnum NUMBER_SET_KIND = eINSTANCE.getNumberSetKind();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.EngineeringModelKind <em>Engineering Model Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.EngineeringModelKind
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getEngineeringModelKind()
		 * @generated
		 */
		EEnum ENGINEERING_MODEL_KIND = eINSTANCE.getEngineeringModelKind();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.StudyPhaseKind <em>Study Phase Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.StudyPhaseKind
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getStudyPhaseKind()
		 * @generated
		 */
		EEnum STUDY_PHASE_KIND = eINSTANCE.getStudyPhaseKind();

		/**
		 * The meta object literal for the '{@link CDP4.SiteDirectoryData.LogarithmBaseKind <em>Logarithm Base Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.SiteDirectoryData.LogarithmBaseKind
		 * @see CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl#getLogarithmBaseKind()
		 * @generated
		 */
		EEnum LOGARITHM_BASE_KIND = eINSTANCE.getLogarithmBaseKind();

	}

} //SiteDirectoryDataPackage
