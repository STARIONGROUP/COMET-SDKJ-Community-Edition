/**
 */
package CDP4.EngineeringModelData;

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
 * @see CDP4.EngineeringModelData.EngineeringModelDataFactory
 * @model kind="package"
 * @generated
 */
public interface EngineeringModelDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EngineeringModelData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CDP4/EngineeringModelData.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CDP4.EngineeringModelData";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EngineeringModelDataPackage eINSTANCE = CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.PossibleFiniteStateImpl <em>Possible Finite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.PossibleFiniteStateImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getPossibleFiniteState()
	 * @generated
	 */
	int POSSIBLE_FINITE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE__OWNER = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Possible Finite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Possible Finite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterBaseImpl <em>Parameter Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterBaseImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterBase()
	 * @generated
	 */
	int PARAMETER_BASE = 3;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__PARAMETER_TYPE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__SCALE = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Dependence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__STATE_DEPENDENCE = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__GROUP = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Option Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE__IS_OPTION_DEPENDENT = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Parameter Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Parameter Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterOrOverrideBaseImpl <em>Parameter Or Override Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterOrOverrideBaseImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterOrOverrideBase()
	 * @generated
	 */
	int PARAMETER_OR_OVERRIDE_BASE = 2;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__IID = PARAMETER_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__REVISION_NUMBER = PARAMETER_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__CLASS_KIND = PARAMETER_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__MODIFIED_ON = PARAMETER_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__EXCLUDED_PERSON = PARAMETER_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__EXCLUDED_DOMAIN = PARAMETER_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__OWNER = PARAMETER_BASE__OWNER;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__PARAMETER_TYPE = PARAMETER_BASE__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__SCALE = PARAMETER_BASE__SCALE;

	/**
	 * The feature id for the '<em><b>State Dependence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__STATE_DEPENDENCE = PARAMETER_BASE__STATE_DEPENDENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__GROUP = PARAMETER_BASE__GROUP;

	/**
	 * The feature id for the '<em><b>Is Option Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__IS_OPTION_DEPENDENT = PARAMETER_BASE__IS_OPTION_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Parameter Subscription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION = PARAMETER_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Or Override Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT = PARAMETER_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Or Override Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OR_OVERRIDE_BASE_OPERATION_COUNT = PARAMETER_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IID = PARAMETER_OR_OVERRIDE_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REVISION_NUMBER = PARAMETER_OR_OVERRIDE_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLASS_KIND = PARAMETER_OR_OVERRIDE_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MODIFIED_ON = PARAMETER_OR_OVERRIDE_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXCLUDED_PERSON = PARAMETER_OR_OVERRIDE_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXCLUDED_DOMAIN = PARAMETER_OR_OVERRIDE_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNER = PARAMETER_OR_OVERRIDE_BASE__OWNER;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = PARAMETER_OR_OVERRIDE_BASE__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SCALE = PARAMETER_OR_OVERRIDE_BASE__SCALE;

	/**
	 * The feature id for the '<em><b>State Dependence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STATE_DEPENDENCE = PARAMETER_OR_OVERRIDE_BASE__STATE_DEPENDENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GROUP = PARAMETER_OR_OVERRIDE_BASE__GROUP;

	/**
	 * The feature id for the '<em><b>Is Option Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_OPTION_DEPENDENT = PARAMETER_OR_OVERRIDE_BASE__IS_OPTION_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Parameter Subscription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_SUBSCRIPTION = PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUESTED_BY = PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE_SET = PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allow Different Owner Of Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALLOW_DIFFERENT_OWNER_OF_OVERRIDE = PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expects Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXPECTS_OVERRIDE = PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has Valid Scale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___HAS_VALID_SCALE__DIAGNOSTICCHAIN_MAP = PARAMETER_OR_OVERRIDE_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = PARAMETER_OR_OVERRIDE_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl <em>Actual Finite State List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getActualFiniteStateList()
	 * @generated
	 */
	int ACTUAL_FINITE_STATE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclude Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__EXCLUDE_OPTION = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Possible Finite State List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__POSSIBLE_FINITE_STATE_LIST = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Actual Finite State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Actual Finite State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_LIST_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.OptionDependentThingImpl <em>Option Dependent Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.OptionDependentThingImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getOptionDependentThing()
	 * @generated
	 */
	int OPTION_DEPENDENT_THING = 5;

	/**
	 * The feature id for the '<em><b>Exclude Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_DEPENDENT_THING__EXCLUDE_OPTION = 0;

	/**
	 * The number of structural features of the '<em>Option Dependent Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_DEPENDENT_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Option Dependent Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_DEPENDENT_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.OptionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 6;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NESTED_ELEMENT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.NestedElementImpl <em>Nested Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.NestedElementImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getNestedElement()
	 * @generated
	 */
	int NESTED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__IS_VOLATILE = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__ROOT_ELEMENT = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Element Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__ELEMENT_USAGE = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nested Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT__NESTED_PARAMETER = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Nested Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Nested Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ELEMENT_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ElementBaseImpl <em>Element Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ElementBaseImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getElementBase()
	 * @generated
	 */
	int ELEMENT_BASE = 9;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE__OWNER = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Element Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_BASE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ElementDefinitionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getElementDefinition()
	 * @generated
	 */
	int ELEMENT_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IID = ELEMENT_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REVISION_NUMBER = ELEMENT_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CLASS_KIND = ELEMENT_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MODIFIED_ON = ELEMENT_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXCLUDED_PERSON = ELEMENT_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXCLUDED_DOMAIN = ELEMENT_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__NAME = ELEMENT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__SHORT_NAME = ELEMENT_BASE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ALIAS = ELEMENT_BASE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__DEFINITION = ELEMENT_BASE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__HYPER_LINK = ELEMENT_BASE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CATEGORY = ELEMENT_BASE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__OWNER = ELEMENT_BASE__OWNER;

	/**
	 * The feature id for the '<em><b>Contained Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__CONTAINED_ELEMENT = ELEMENT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PARAMETER = ELEMENT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PARAMETER_GROUP = ELEMENT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REFERENCED_ELEMENT = ELEMENT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_FEATURE_COUNT = ELEMENT_BASE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = ELEMENT_BASE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = ELEMENT_BASE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Unique Parameter Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION___HAS_UNIQUE_PARAMETER_NAMES__DIAGNOSTICCHAIN_MAP = ELEMENT_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Unique Parameter Short Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION___HAS_UNIQUE_PARAMETER_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = ELEMENT_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_OPERATION_COUNT = ELEMENT_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ElementUsageImpl <em>Element Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ElementUsageImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getElementUsage()
	 * @generated
	 */
	int ELEMENT_USAGE = 10;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__IID = ELEMENT_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__REVISION_NUMBER = ELEMENT_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__CLASS_KIND = ELEMENT_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__MODIFIED_ON = ELEMENT_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__EXCLUDED_PERSON = ELEMENT_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__EXCLUDED_DOMAIN = ELEMENT_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__NAME = ELEMENT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__SHORT_NAME = ELEMENT_BASE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__ALIAS = ELEMENT_BASE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__DEFINITION = ELEMENT_BASE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__HYPER_LINK = ELEMENT_BASE__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__CATEGORY = ELEMENT_BASE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__OWNER = ELEMENT_BASE__OWNER;

	/**
	 * The feature id for the '<em><b>Exclude Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__EXCLUDE_OPTION = ELEMENT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__ELEMENT_DEFINITION = ELEMENT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__INTERFACE_END = ELEMENT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE__PARAMETER_OVERRIDE = ELEMENT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE_FEATURE_COUNT = ELEMENT_BASE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = ELEMENT_BASE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = ELEMENT_BASE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Element Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_USAGE_OPERATION_COUNT = ELEMENT_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterOverrideImpl <em>Parameter Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterOverrideImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterOverride()
	 * @generated
	 */
	int PARAMETER_OVERRIDE = 11;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__IID = PARAMETER_OR_OVERRIDE_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__REVISION_NUMBER = PARAMETER_OR_OVERRIDE_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__CLASS_KIND = PARAMETER_OR_OVERRIDE_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__MODIFIED_ON = PARAMETER_OR_OVERRIDE_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__EXCLUDED_PERSON = PARAMETER_OR_OVERRIDE_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__EXCLUDED_DOMAIN = PARAMETER_OR_OVERRIDE_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__OWNER = PARAMETER_OR_OVERRIDE_BASE__OWNER;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__PARAMETER_TYPE = PARAMETER_OR_OVERRIDE_BASE__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__SCALE = PARAMETER_OR_OVERRIDE_BASE__SCALE;

	/**
	 * The feature id for the '<em><b>State Dependence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__STATE_DEPENDENCE = PARAMETER_OR_OVERRIDE_BASE__STATE_DEPENDENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__GROUP = PARAMETER_OR_OVERRIDE_BASE__GROUP;

	/**
	 * The feature id for the '<em><b>Is Option Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__IS_OPTION_DEPENDENT = PARAMETER_OR_OVERRIDE_BASE__IS_OPTION_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Parameter Subscription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__PARAMETER_SUBSCRIPTION = PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__PARAMETER = PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE__VALUE_SET = PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_FEATURE_COUNT = PARAMETER_OR_OVERRIDE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_OPERATION_COUNT = PARAMETER_OR_OVERRIDE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterGroupImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterGroup()
	 * @generated
	 */
	int PARAMETER_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containing Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__CONTAINING_GROUP = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl <em>Parameter Value Set Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterValueSetBase()
	 * @generated
	 */
	int PARAMETER_VALUE_SET_BASE = 14;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__VALUE_SWITCH = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__PUBLISHED = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__FORMULA = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Computed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__COMPUTED = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Manual</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__MANUAL = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__REFERENCE = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Actual State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__ACTUAL_STATE = CommonDataPackage.THING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Actual Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION = CommonDataPackage.THING_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Parameter Value Set Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Parameter Value Set Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_BASE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterOverrideValueSetImpl <em>Parameter Override Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterOverrideValueSetImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterOverrideValueSet()
	 * @generated
	 */
	int PARAMETER_OVERRIDE_VALUE_SET = 13;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__IID = PARAMETER_VALUE_SET_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__REVISION_NUMBER = PARAMETER_VALUE_SET_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__CLASS_KIND = PARAMETER_VALUE_SET_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__MODIFIED_ON = PARAMETER_VALUE_SET_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__EXCLUDED_PERSON = PARAMETER_VALUE_SET_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__EXCLUDED_DOMAIN = PARAMETER_VALUE_SET_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__OWNER = PARAMETER_VALUE_SET_BASE__OWNER;

	/**
	 * The feature id for the '<em><b>Value Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__VALUE_SWITCH = PARAMETER_VALUE_SET_BASE__VALUE_SWITCH;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__PUBLISHED = PARAMETER_VALUE_SET_BASE__PUBLISHED;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__FORMULA = PARAMETER_VALUE_SET_BASE__FORMULA;

	/**
	 * The feature id for the '<em><b>Computed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__COMPUTED = PARAMETER_VALUE_SET_BASE__COMPUTED;

	/**
	 * The feature id for the '<em><b>Manual</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__MANUAL = PARAMETER_VALUE_SET_BASE__MANUAL;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__REFERENCE = PARAMETER_VALUE_SET_BASE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__ACTUAL_VALUE = PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE;

	/**
	 * The feature id for the '<em><b>Actual State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__ACTUAL_STATE = PARAMETER_VALUE_SET_BASE__ACTUAL_STATE;

	/**
	 * The feature id for the '<em><b>Actual Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__ACTUAL_OPTION = PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION;

	/**
	 * The feature id for the '<em><b>Parameter Value Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET = PARAMETER_VALUE_SET_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Override Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET_FEATURE_COUNT = PARAMETER_VALUE_SET_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Override Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OVERRIDE_VALUE_SET_OPERATION_COUNT = PARAMETER_VALUE_SET_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ActualFiniteStateImpl <em>Actual Finite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ActualFiniteStateImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getActualFiniteState()
	 * @generated
	 */
	int ACTUAL_FINITE_STATE = 15;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Possible State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__POSSIBLE_STATE = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE__KIND = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actual Finite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Actual Finite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_FINITE_STATE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterValueSetImpl <em>Parameter Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterValueSetImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterValueSet()
	 * @generated
	 */
	int PARAMETER_VALUE_SET = 16;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__IID = PARAMETER_VALUE_SET_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__REVISION_NUMBER = PARAMETER_VALUE_SET_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__CLASS_KIND = PARAMETER_VALUE_SET_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__MODIFIED_ON = PARAMETER_VALUE_SET_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__EXCLUDED_PERSON = PARAMETER_VALUE_SET_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__EXCLUDED_DOMAIN = PARAMETER_VALUE_SET_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__OWNER = PARAMETER_VALUE_SET_BASE__OWNER;

	/**
	 * The feature id for the '<em><b>Value Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__VALUE_SWITCH = PARAMETER_VALUE_SET_BASE__VALUE_SWITCH;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__PUBLISHED = PARAMETER_VALUE_SET_BASE__PUBLISHED;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__FORMULA = PARAMETER_VALUE_SET_BASE__FORMULA;

	/**
	 * The feature id for the '<em><b>Computed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__COMPUTED = PARAMETER_VALUE_SET_BASE__COMPUTED;

	/**
	 * The feature id for the '<em><b>Manual</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__MANUAL = PARAMETER_VALUE_SET_BASE__MANUAL;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__REFERENCE = PARAMETER_VALUE_SET_BASE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__ACTUAL_VALUE = PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE;

	/**
	 * The feature id for the '<em><b>Actual State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__ACTUAL_STATE = PARAMETER_VALUE_SET_BASE__ACTUAL_STATE;

	/**
	 * The feature id for the '<em><b>Actual Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET__ACTUAL_OPTION = PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION;

	/**
	 * The number of structural features of the '<em>Parameter Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_FEATURE_COUNT = PARAMETER_VALUE_SET_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_SET_OPERATION_COUNT = PARAMETER_VALUE_SET_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.NestedParameterImpl <em>Nested Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.NestedParameterImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getNestedParameter()
	 * @generated
	 */
	int NESTED_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__IS_VOLATILE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associated Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__ASSOCIATED_PARAMETER = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__ACTUAL_STATE = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__PATH = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__FORMULA = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER__ACTUAL_VALUE = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Nested Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Nested Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_PARAMETER_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.PossibleFiniteStateListImpl <em>Possible Finite State List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.PossibleFiniteStateListImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getPossibleFiniteStateList()
	 * @generated
	 */
	int POSSIBLE_FINITE_STATE_LIST = 18;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__OWNER = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Possible State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Possible Finite State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Possible Finite State List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLE_FINITE_STATE_LIST_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterSubscriptionImpl <em>Parameter Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterSubscriptionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterSubscription()
	 * @generated
	 */
	int PARAMETER_SUBSCRIPTION = 19;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__IID = PARAMETER_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__REVISION_NUMBER = PARAMETER_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__CLASS_KIND = PARAMETER_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__MODIFIED_ON = PARAMETER_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__EXCLUDED_PERSON = PARAMETER_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__EXCLUDED_DOMAIN = PARAMETER_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__OWNER = PARAMETER_BASE__OWNER;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__PARAMETER_TYPE = PARAMETER_BASE__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__SCALE = PARAMETER_BASE__SCALE;

	/**
	 * The feature id for the '<em><b>State Dependence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__STATE_DEPENDENCE = PARAMETER_BASE__STATE_DEPENDENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__GROUP = PARAMETER_BASE__GROUP;

	/**
	 * The feature id for the '<em><b>Is Option Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__IS_OPTION_DEPENDENT = PARAMETER_BASE__IS_OPTION_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION__VALUE_SET = PARAMETER_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_FEATURE_COUNT = PARAMETER_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_OPERATION_COUNT = PARAMETER_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterSubscriptionValueSetImpl <em>Parameter Subscription Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterSubscriptionValueSetImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterSubscriptionValueSet()
	 * @generated
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET = 20;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__VALUE_SWITCH = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Computed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__COMPUTED = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Manual</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__MANUAL = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__REFERENCE = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_VALUE = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subscribed Value Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__SUBSCRIBED_VALUE_SET = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Actual State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_STATE = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Actual Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_OPTION = CommonDataPackage.THING_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Parameter Subscription Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Parameter Subscription Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SUBSCRIPTION_VALUE_SET_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.FileStoreImpl <em>File Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.FileStoreImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getFileStore()
	 * @generated
	 */
	int FILE_STORE = 21;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__FOLDER = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE__FILE = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>File Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>File Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STORE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.FolderImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 22;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CREATOR = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containing Folder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONTAINING_FOLDER = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PATH = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.FileImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 23;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CATEGORY = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locked By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LOCKED_BY = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_REVISION = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.FileRevisionImpl <em>File Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.FileRevisionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getFileRevision()
	 * @generated
	 */
	int FILE_REVISION = 24;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__CONTENT_HASH = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__CREATOR = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containing Folder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__CONTAINING_FOLDER = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__FILE_TYPE = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION__PATH = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>File Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>File Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REVISION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.PublicationImpl <em>Publication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.PublicationImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getPublication()
	 * @generated
	 */
	int PUBLICATION = 25;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__DOMAIN = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Published Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__PUBLISHED_PARAMETER = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl <em>Engineering Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getEngineeringModel()
	 * @generated
	 */
	int ENGINEERING_MODEL = 26;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__IID = CommonDataPackage.TOP_CONTAINER__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__REVISION_NUMBER = CommonDataPackage.TOP_CONTAINER__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__CLASS_KIND = CommonDataPackage.TOP_CONTAINER__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__MODIFIED_ON = CommonDataPackage.TOP_CONTAINER__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__EXCLUDED_PERSON = CommonDataPackage.TOP_CONTAINER__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__EXCLUDED_DOMAIN = CommonDataPackage.TOP_CONTAINER__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Last Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__LAST_MODIFIED_ON = CommonDataPackage.TOP_CONTAINER__LAST_MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Engineering Model Setup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Common File Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__COMMON_FILE_STORE = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Log Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__LOG_ENTRY = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__ITERATION = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Book</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__BOOK = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__GENERIC_NOTE = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modelling Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL__MODELLING_ANNOTATION = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Engineering Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_FEATURE_COUNT = CommonDataPackage.TOP_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Engineering Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_OPERATION_COUNT = CommonDataPackage.TOP_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.CommonFileStoreImpl <em>Common File Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.CommonFileStoreImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getCommonFileStore()
	 * @generated
	 */
	int COMMON_FILE_STORE = 27;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__IID = FILE_STORE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__REVISION_NUMBER = FILE_STORE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__CLASS_KIND = FILE_STORE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__MODIFIED_ON = FILE_STORE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__EXCLUDED_PERSON = FILE_STORE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__EXCLUDED_DOMAIN = FILE_STORE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__NAME = FILE_STORE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__OWNER = FILE_STORE__OWNER;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__CREATED_ON = FILE_STORE__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__FOLDER = FILE_STORE__FOLDER;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE__FILE = FILE_STORE__FILE;

	/**
	 * The number of structural features of the '<em>Common File Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE_FEATURE_COUNT = FILE_STORE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Common File Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FILE_STORE_OPERATION_COUNT = FILE_STORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl <em>Model Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ModelLogEntryImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getModelLogEntry()
	 * @generated
	 */
	int MODEL_LOG_ENTRY = 28;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__AUTHOR = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affected Item Iid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__AFFECTED_ITEM_IID = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__LEVEL = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__LANGUAGE_CODE = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__CONTENT = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__CATEGORY = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Model Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Model Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_LOG_ENTRY_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.IterationImpl <em>Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.IterationImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getIteration()
	 * @generated
	 */
	int ITERATION = 29;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Iteration Setup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__ITERATION_SETUP = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Iteration Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__SOURCE_ITERATION_IID = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__OPTION = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Publication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__PUBLICATION = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Possible Finite State List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__POSSIBLE_FINITE_STATE_LIST = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Top Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__TOP_ELEMENT = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__ELEMENT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__RELATIONSHIP = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>External Identifier Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__EXTERNAL_IDENTIFIER_MAP = CommonDataPackage.THING_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Requirements Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__REQUIREMENTS_SPECIFICATION = CommonDataPackage.THING_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Domain File Store</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__DOMAIN_FILE_STORE = CommonDataPackage.THING_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Actual Finite State List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__ACTUAL_FINITE_STATE_LIST = CommonDataPackage.THING_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Default Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__DEFAULT_OPTION = CommonDataPackage.THING_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rule Verification List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__RULE_VERIFICATION_LIST = CommonDataPackage.THING_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stakeholder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__STAKEHOLDER = CommonDataPackage.THING_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__GOAL = CommonDataPackage.THING_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Value Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__VALUE_GROUP = CommonDataPackage.THING_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stakeholder Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__STAKEHOLDER_VALUE = CommonDataPackage.THING_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Stakeholder Value Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__STAKEHOLDER_VALUE_MAP = CommonDataPackage.THING_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Shared Diagram Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__SHARED_DIAGRAM_STYLE = CommonDataPackage.THING_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Diagram Canvas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__DIAGRAM_CANVAS = CommonDataPackage.THING_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RelationshipImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 30;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CATEGORY = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PARAMETER_VALUE = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParameterValueImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 32;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__PARAMETER_TYPE = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__SCALE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUE = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RelationshipParameterValueImpl <em>Relationship Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RelationshipParameterValueImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRelationshipParameterValue()
	 * @generated
	 */
	int RELATIONSHIP_PARAMETER_VALUE = 31;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__IID = PARAMETER_VALUE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__REVISION_NUMBER = PARAMETER_VALUE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__CLASS_KIND = PARAMETER_VALUE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__MODIFIED_ON = PARAMETER_VALUE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__EXCLUDED_PERSON = PARAMETER_VALUE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__EXCLUDED_DOMAIN = PARAMETER_VALUE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__PARAMETER_TYPE = PARAMETER_VALUE__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__SCALE = PARAMETER_VALUE__SCALE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE__VALUE = PARAMETER_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Relationship Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PARAMETER_VALUE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl <em>External Identifier Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getExternalIdentifierMap()
	 * @generated
	 */
	int EXTERNAL_IDENTIFIER_MAP = 33;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correspondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__EXTERNAL_MODEL_NAME = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_NAME = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Tool Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_VERSION = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>External Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>External Identifier Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>External Identifier Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_MAP_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.IdCorrespondenceImpl <em>Id Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.IdCorrespondenceImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getIdCorrespondence()
	 * @generated
	 */
	int ID_CORRESPONDENCE = 34;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Thing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__INTERNAL_THING = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE__EXTERNAL_ID = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Id Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Id Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CORRESPONDENCE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RequirementsContainerImpl <em>Requirements Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RequirementsContainerImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirementsContainer()
	 * @generated
	 */
	int REQUIREMENTS_CONTAINER = 36;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__OWNER = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__GROUP = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER__PARAMETER_VALUE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Requirements Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Requirements Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RequirementsSpecificationImpl <em>Requirements Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RequirementsSpecificationImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirementsSpecification()
	 * @generated
	 */
	int REQUIREMENTS_SPECIFICATION = 35;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__IID = REQUIREMENTS_CONTAINER__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__REVISION_NUMBER = REQUIREMENTS_CONTAINER__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__CLASS_KIND = REQUIREMENTS_CONTAINER__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__MODIFIED_ON = REQUIREMENTS_CONTAINER__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__EXCLUDED_PERSON = REQUIREMENTS_CONTAINER__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__EXCLUDED_DOMAIN = REQUIREMENTS_CONTAINER__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__NAME = REQUIREMENTS_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__SHORT_NAME = REQUIREMENTS_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__ALIAS = REQUIREMENTS_CONTAINER__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__DEFINITION = REQUIREMENTS_CONTAINER__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__HYPER_LINK = REQUIREMENTS_CONTAINER__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__CATEGORY = REQUIREMENTS_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__OWNER = REQUIREMENTS_CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__GROUP = REQUIREMENTS_CONTAINER__GROUP;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__PARAMETER_VALUE = REQUIREMENTS_CONTAINER__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__IS_DEPRECATED = REQUIREMENTS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__REQUIREMENT = REQUIREMENTS_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirements Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION_FEATURE_COUNT = REQUIREMENTS_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = REQUIREMENTS_CONTAINER___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = REQUIREMENTS_CONTAINER___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Requirements Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION_OPERATION_COUNT = REQUIREMENTS_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RequirementsGroupImpl <em>Requirements Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RequirementsGroupImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirementsGroup()
	 * @generated
	 */
	int REQUIREMENTS_GROUP = 37;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__IID = REQUIREMENTS_CONTAINER__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__REVISION_NUMBER = REQUIREMENTS_CONTAINER__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__CLASS_KIND = REQUIREMENTS_CONTAINER__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__MODIFIED_ON = REQUIREMENTS_CONTAINER__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__EXCLUDED_PERSON = REQUIREMENTS_CONTAINER__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__EXCLUDED_DOMAIN = REQUIREMENTS_CONTAINER__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__NAME = REQUIREMENTS_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__SHORT_NAME = REQUIREMENTS_CONTAINER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__ALIAS = REQUIREMENTS_CONTAINER__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__DEFINITION = REQUIREMENTS_CONTAINER__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__HYPER_LINK = REQUIREMENTS_CONTAINER__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__CATEGORY = REQUIREMENTS_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__OWNER = REQUIREMENTS_CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__GROUP = REQUIREMENTS_CONTAINER__GROUP;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP__PARAMETER_VALUE = REQUIREMENTS_CONTAINER__PARAMETER_VALUE;

	/**
	 * The number of structural features of the '<em>Requirements Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP_FEATURE_COUNT = REQUIREMENTS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = REQUIREMENTS_CONTAINER___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = REQUIREMENTS_CONTAINER___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Requirements Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_GROUP_OPERATION_COUNT = REQUIREMENTS_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RequirementsContainerParameterValueImpl <em>Requirements Container Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RequirementsContainerParameterValueImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirementsContainerParameterValue()
	 * @generated
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE = 38;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__IID = PARAMETER_VALUE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__REVISION_NUMBER = PARAMETER_VALUE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__CLASS_KIND = PARAMETER_VALUE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__MODIFIED_ON = PARAMETER_VALUE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__EXCLUDED_PERSON = PARAMETER_VALUE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__EXCLUDED_DOMAIN = PARAMETER_VALUE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__PARAMETER_TYPE = PARAMETER_VALUE__PARAMETER_TYPE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__SCALE = PARAMETER_VALUE__SCALE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE__VALUE = PARAMETER_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Requirements Container Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirements Container Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_CONTAINER_PARAMETER_VALUE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.SimpleParameterizableThingImpl <em>Simple Parameterizable Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.SimpleParameterizableThingImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getSimpleParameterizableThing()
	 * @generated
	 */
	int SIMPLE_PARAMETERIZABLE_THING = 40;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__OWNER = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING__PARAMETER_VALUE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Parameterizable Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Simple Parameterizable Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETERIZABLE_THING_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RequirementImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 39;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IID = SIMPLE_PARAMETERIZABLE_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REVISION_NUMBER = SIMPLE_PARAMETERIZABLE_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CLASS_KIND = SIMPLE_PARAMETERIZABLE_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MODIFIED_ON = SIMPLE_PARAMETERIZABLE_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EXCLUDED_PERSON = SIMPLE_PARAMETERIZABLE_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EXCLUDED_DOMAIN = SIMPLE_PARAMETERIZABLE_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = SIMPLE_PARAMETERIZABLE_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SHORT_NAME = SIMPLE_PARAMETERIZABLE_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALIAS = SIMPLE_PARAMETERIZABLE_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEFINITION = SIMPLE_PARAMETERIZABLE_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__HYPER_LINK = SIMPLE_PARAMETERIZABLE_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNER = SIMPLE_PARAMETERIZABLE_THING__OWNER;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARAMETER_VALUE = SIMPLE_PARAMETERIZABLE_THING__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CATEGORY = SIMPLE_PARAMETERIZABLE_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_DEPRECATED = SIMPLE_PARAMETERIZABLE_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametric Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARAMETRIC_CONSTRAINT = SIMPLE_PARAMETERIZABLE_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__GROUP = SIMPLE_PARAMETERIZABLE_THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = SIMPLE_PARAMETERIZABLE_THING_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = SIMPLE_PARAMETERIZABLE_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = SIMPLE_PARAMETERIZABLE_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = SIMPLE_PARAMETERIZABLE_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.SimpleParameterValueImpl <em>Simple Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.SimpleParameterValueImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getSimpleParameterValue()
	 * @generated
	 */
	int SIMPLE_PARAMETER_VALUE = 41;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__PARAMETER_TYPE = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__VALUE = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE__SCALE = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Simple Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAMETER_VALUE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ParametricConstraintImpl <em>Parametric Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ParametricConstraintImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParametricConstraint()
	 * @generated
	 */
	int PARAMETRIC_CONSTRAINT = 42;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__EXPRESSION = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Top Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT__TOP_EXPRESSION = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parametric Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parametric Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRIC_CONSTRAINT_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.BooleanExpressionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.DomainFileStoreImpl <em>Domain File Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.DomainFileStoreImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getDomainFileStore()
	 * @generated
	 */
	int DOMAIN_FILE_STORE = 44;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__IID = FILE_STORE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__REVISION_NUMBER = FILE_STORE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__CLASS_KIND = FILE_STORE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__MODIFIED_ON = FILE_STORE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__EXCLUDED_PERSON = FILE_STORE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__EXCLUDED_DOMAIN = FILE_STORE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__NAME = FILE_STORE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__OWNER = FILE_STORE__OWNER;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__CREATED_ON = FILE_STORE__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__FOLDER = FILE_STORE__FOLDER;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__FILE = FILE_STORE__FILE;

	/**
	 * The feature id for the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE__IS_HIDDEN = FILE_STORE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain File Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE_FEATURE_COUNT = FILE_STORE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain File Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FILE_STORE_OPERATION_COUNT = FILE_STORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RuleVerificationListImpl <em>Rule Verification List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RuleVerificationListImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRuleVerificationList()
	 * @generated
	 */
	int RULE_VERIFICATION_LIST = 45;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__OWNER = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Verification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST__RULE_VERIFICATION = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Verification List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Rule Verification List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_LIST_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RuleVerificationImpl <em>Rule Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RuleVerificationImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRuleVerification()
	 * @generated
	 */
	int RULE_VERIFICATION = 46;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__IS_ACTIVE = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Violation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__VIOLATION = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Executed On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__EXECUTED_ON = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION__STATUS = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rule Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Rule Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VERIFICATION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RuleViolationImpl <em>Rule Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RuleViolationImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRuleViolation()
	 * @generated
	 */
	int RULE_VIOLATION = 47;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION__DESCRIPTION = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Violating Thing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION__VIOLATING_THING = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rule Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_VIOLATION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.StakeholderImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 48;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stakeholder Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__STAKEHOLDER_VALUE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.StakeholderValueImpl <em>Stakeholder Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.StakeholderValueImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getStakeholderValue()
	 * @generated
	 */
	int STAKEHOLDER_VALUE = 49;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stakeholder Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stakeholder Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_VALUE_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.GoalImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 50;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ValueGroupImpl <em>Value Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ValueGroupImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getValueGroup()
	 * @generated
	 */
	int VALUE_GROUP = 51;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Value Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_GROUP_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl <em>Stake Holder Value Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getStakeHolderValueMap()
	 * @generated
	 */
	int STAKE_HOLDER_VALUE_MAP = 52;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__IID = CommonDataPackage.DEFINED_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__REVISION_NUMBER = CommonDataPackage.DEFINED_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__CLASS_KIND = CommonDataPackage.DEFINED_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__MODIFIED_ON = CommonDataPackage.DEFINED_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__EXCLUDED_PERSON = CommonDataPackage.DEFINED_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__EXCLUDED_DOMAIN = CommonDataPackage.DEFINED_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__NAME = CommonDataPackage.DEFINED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__SHORT_NAME = CommonDataPackage.DEFINED_THING__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__ALIAS = CommonDataPackage.DEFINED_THING__ALIAS;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__DEFINITION = CommonDataPackage.DEFINED_THING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__HYPER_LINK = CommonDataPackage.DEFINED_THING__HYPER_LINK;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__CATEGORY = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__GOAL = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__VALUE_GROUP = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stakeholder Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__STAKEHOLDER_VALUE = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__SETTINGS = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP__REQUIREMENT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Stake Holder Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_FEATURE_COUNT = CommonDataPackage.DEFINED_THING_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stake Holder Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_OPERATION_COUNT = CommonDataPackage.DEFINED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapSettingsImpl <em>Stake Holder Value Map Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.StakeHolderValueMapSettingsImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getStakeHolderValueMapSettings()
	 * @generated
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS = 53;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Goal To Value Group Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Group To Stakeholder Value Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stakeholder Value To Requirement Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stake Holder Value Map Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Stake Holder Value Map Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKE_HOLDER_VALUE_MAP_SETTINGS_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.MultiRelationshipImpl <em>Multi Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.MultiRelationshipImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getMultiRelationship()
	 * @generated
	 */
	int MULTI_RELATIONSHIP = 54;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__IID = RELATIONSHIP__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__REVISION_NUMBER = RELATIONSHIP__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__CLASS_KIND = RELATIONSHIP__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__MODIFIED_ON = RELATIONSHIP__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__EXCLUDED_PERSON = RELATIONSHIP__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__EXCLUDED_DOMAIN = RELATIONSHIP__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__CATEGORY = RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__PARAMETER_VALUE = RELATIONSHIP__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP__RELATED_THING = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.BinaryRelationshipImpl <em>Binary Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.BinaryRelationshipImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getBinaryRelationship()
	 * @generated
	 */
	int BINARY_RELATIONSHIP = 55;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__IID = RELATIONSHIP__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__REVISION_NUMBER = RELATIONSHIP__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__CLASS_KIND = RELATIONSHIP__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__MODIFIED_ON = RELATIONSHIP__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__EXCLUDED_PERSON = RELATIONSHIP__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__EXCLUDED_DOMAIN = RELATIONSHIP__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__CATEGORY = RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__PARAMETER_VALUE = RELATIONSHIP__PARAMETER_VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__SOURCE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP__TARGET = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.OrExpressionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__IID = BOOLEAN_EXPRESSION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__REVISION_NUMBER = BOOLEAN_EXPRESSION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__CLASS_KIND = BOOLEAN_EXPRESSION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__MODIFIED_ON = BOOLEAN_EXPRESSION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__EXCLUDED_PERSON = BOOLEAN_EXPRESSION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__EXCLUDED_DOMAIN = BOOLEAN_EXPRESSION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__TERM = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.NotExpressionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 57;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__IID = BOOLEAN_EXPRESSION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__REVISION_NUMBER = BOOLEAN_EXPRESSION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__CLASS_KIND = BOOLEAN_EXPRESSION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__MODIFIED_ON = BOOLEAN_EXPRESSION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__EXCLUDED_PERSON = BOOLEAN_EXPRESSION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__EXCLUDED_DOMAIN = BOOLEAN_EXPRESSION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__TERM = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.AndExpressionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 58;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__IID = BOOLEAN_EXPRESSION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__REVISION_NUMBER = BOOLEAN_EXPRESSION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__CLASS_KIND = BOOLEAN_EXPRESSION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__MODIFIED_ON = BOOLEAN_EXPRESSION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__EXCLUDED_PERSON = BOOLEAN_EXPRESSION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__EXCLUDED_DOMAIN = BOOLEAN_EXPRESSION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__TERM = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.ExclusiveOrExpressionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getExclusiveOrExpression()
	 * @generated
	 */
	int EXCLUSIVE_OR_EXPRESSION = 59;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__IID = BOOLEAN_EXPRESSION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__REVISION_NUMBER = BOOLEAN_EXPRESSION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__CLASS_KIND = BOOLEAN_EXPRESSION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__MODIFIED_ON = BOOLEAN_EXPRESSION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__EXCLUDED_PERSON = BOOLEAN_EXPRESSION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__EXCLUDED_DOMAIN = BOOLEAN_EXPRESSION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION__TERM = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusive Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exclusive Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OR_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.RelationalExpressionImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 60;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__IID = BOOLEAN_EXPRESSION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__REVISION_NUMBER = BOOLEAN_EXPRESSION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__CLASS_KIND = BOOLEAN_EXPRESSION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__MODIFIED_ON = BOOLEAN_EXPRESSION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__EXCLUDED_PERSON = BOOLEAN_EXPRESSION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__EXCLUDED_DOMAIN = BOOLEAN_EXPRESSION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__PARAMETER_TYPE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relational Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__VALUE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__SCALE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.UserRuleVerificationImpl <em>User Rule Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.UserRuleVerificationImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getUserRuleVerification()
	 * @generated
	 */
	int USER_RULE_VERIFICATION = 61;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__IID = RULE_VERIFICATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__REVISION_NUMBER = RULE_VERIFICATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__CLASS_KIND = RULE_VERIFICATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__MODIFIED_ON = RULE_VERIFICATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__EXCLUDED_PERSON = RULE_VERIFICATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__EXCLUDED_DOMAIN = RULE_VERIFICATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__NAME = RULE_VERIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__OWNER = RULE_VERIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__IS_ACTIVE = RULE_VERIFICATION__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Violation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__VIOLATION = RULE_VERIFICATION__VIOLATION;

	/**
	 * The feature id for the '<em><b>Executed On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__EXECUTED_ON = RULE_VERIFICATION__EXECUTED_ON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__STATUS = RULE_VERIFICATION__STATUS;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION__RULE = RULE_VERIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Rule Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION_FEATURE_COUNT = RULE_VERIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Rule Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RULE_VERIFICATION_OPERATION_COUNT = RULE_VERIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.BuiltInRuleVerificationImpl <em>Built In Rule Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.BuiltInRuleVerificationImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getBuiltInRuleVerification()
	 * @generated
	 */
	int BUILT_IN_RULE_VERIFICATION = 62;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__IID = RULE_VERIFICATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__REVISION_NUMBER = RULE_VERIFICATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__CLASS_KIND = RULE_VERIFICATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__MODIFIED_ON = RULE_VERIFICATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__EXCLUDED_PERSON = RULE_VERIFICATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__EXCLUDED_DOMAIN = RULE_VERIFICATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__NAME = RULE_VERIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__OWNER = RULE_VERIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__IS_ACTIVE = RULE_VERIFICATION__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Violation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__VIOLATION = RULE_VERIFICATION__VIOLATION;

	/**
	 * The feature id for the '<em><b>Executed On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__EXECUTED_ON = RULE_VERIFICATION__EXECUTED_ON;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION__STATUS = RULE_VERIFICATION__STATUS;

	/**
	 * The number of structural features of the '<em>Built In Rule Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION_FEATURE_COUNT = RULE_VERIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Built In Rule Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_RULE_VERIFICATION_OPERATION_COUNT = RULE_VERIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.impl.OwnedThingImpl <em>Owned Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.impl.OwnedThingImpl
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getOwnedThing()
	 * @generated
	 */
	int OWNED_THING = 63;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_THING__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Owned Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Owned Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.InterfaceEndKind <em>Interface End Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.InterfaceEndKind
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getInterfaceEndKind()
	 * @generated
	 */
	int INTERFACE_END_KIND = 64;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.ParameterSwitchKind <em>Parameter Switch Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.ParameterSwitchKind
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterSwitchKind()
	 * @generated
	 */
	int PARAMETER_SWITCH_KIND = 65;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.ActualFiniteStateKind <em>Actual Finite State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.ActualFiniteStateKind
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getActualFiniteStateKind()
	 * @generated
	 */
	int ACTUAL_FINITE_STATE_KIND = 66;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.RuleVerificationStatusKind <em>Rule Verification Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.RuleVerificationStatusKind
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRuleVerificationStatusKind()
	 * @generated
	 */
	int RULE_VERIFICATION_STATUS_KIND = 67;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.BooleanOperatorKind <em>Boolean Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.BooleanOperatorKind
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getBooleanOperatorKind()
	 * @generated
	 */
	int BOOLEAN_OPERATOR_KIND = 68;

	/**
	 * The meta object id for the '{@link CDP4.EngineeringModelData.RelationalOperatorKind <em>Relational Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.EngineeringModelData.RelationalOperatorKind
	 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRelationalOperatorKind()
	 * @generated
	 */
	int RELATIONAL_OPERATOR_KIND = 69;


	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.PossibleFiniteState <em>Possible Finite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possible Finite State</em>'.
	 * @see CDP4.EngineeringModelData.PossibleFiniteState
	 * @generated
	 */
	EClass getPossibleFiniteState();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see CDP4.EngineeringModelData.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.Parameter#getRequestedBy <em>Requested By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requested By</em>'.
	 * @see CDP4.EngineeringModelData.Parameter#getRequestedBy()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_RequestedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Parameter#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Set</em>'.
	 * @see CDP4.EngineeringModelData.Parameter#getValueSet()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ValueSet();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.Parameter#getAllowDifferentOwnerOfOverride <em>Allow Different Owner Of Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Different Owner Of Override</em>'.
	 * @see CDP4.EngineeringModelData.Parameter#getAllowDifferentOwnerOfOverride()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_AllowDifferentOwnerOfOverride();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.Parameter#getExpectsOverride <em>Expects Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expects Override</em>'.
	 * @see CDP4.EngineeringModelData.Parameter#getExpectsOverride()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ExpectsOverride();

	/**
	 * Returns the meta object for the '{@link CDP4.EngineeringModelData.Parameter#hasValidScale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Valid Scale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Scale</em>' operation.
	 * @see CDP4.EngineeringModelData.Parameter#hasValidScale(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getParameter__HasValidScale__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterOrOverrideBase <em>Parameter Or Override Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Or Override Base</em>'.
	 * @see CDP4.EngineeringModelData.ParameterOrOverrideBase
	 * @generated
	 */
	EClass getParameterOrOverrideBase();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ParameterOrOverrideBase#getParameterSubscription <em>Parameter Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Subscription</em>'.
	 * @see CDP4.EngineeringModelData.ParameterOrOverrideBase#getParameterSubscription()
	 * @see #getParameterOrOverrideBase()
	 * @generated
	 */
	EReference getParameterOrOverrideBase_ParameterSubscription();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterBase <em>Parameter Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Base</em>'.
	 * @see CDP4.EngineeringModelData.ParameterBase
	 * @generated
	 */
	EClass getParameterBase();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterBase#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see CDP4.EngineeringModelData.ParameterBase#getParameterType()
	 * @see #getParameterBase()
	 * @generated
	 */
	EReference getParameterBase_ParameterType();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterBase#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scale</em>'.
	 * @see CDP4.EngineeringModelData.ParameterBase#getScale()
	 * @see #getParameterBase()
	 * @generated
	 */
	EReference getParameterBase_Scale();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterBase#getStateDependence <em>State Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Dependence</em>'.
	 * @see CDP4.EngineeringModelData.ParameterBase#getStateDependence()
	 * @see #getParameterBase()
	 * @generated
	 */
	EReference getParameterBase_StateDependence();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterBase#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see CDP4.EngineeringModelData.ParameterBase#getGroup()
	 * @see #getParameterBase()
	 * @generated
	 */
	EReference getParameterBase_Group();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.ParameterBase#getIsOptionDependent <em>Is Option Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Option Dependent</em>'.
	 * @see CDP4.EngineeringModelData.ParameterBase#getIsOptionDependent()
	 * @see #getParameterBase()
	 * @generated
	 */
	EAttribute getParameterBase_IsOptionDependent();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ActualFiniteStateList <em>Actual Finite State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Finite State List</em>'.
	 * @see CDP4.EngineeringModelData.ActualFiniteStateList
	 * @generated
	 */
	EClass getActualFiniteStateList();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.ActualFiniteStateList#getPossibleFiniteStateList <em>Possible Finite State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Finite State List</em>'.
	 * @see CDP4.EngineeringModelData.ActualFiniteStateList#getPossibleFiniteStateList()
	 * @see #getActualFiniteStateList()
	 * @generated
	 */
	EReference getActualFiniteStateList_PossibleFiniteStateList();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ActualFiniteStateList#getActualState <em>Actual State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual State</em>'.
	 * @see CDP4.EngineeringModelData.ActualFiniteStateList#getActualState()
	 * @see #getActualFiniteStateList()
	 * @generated
	 */
	EReference getActualFiniteStateList_ActualState();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.OptionDependentThing <em>Option Dependent Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Dependent Thing</em>'.
	 * @see CDP4.EngineeringModelData.OptionDependentThing
	 * @generated
	 */
	EClass getOptionDependentThing();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.OptionDependentThing#getExcludeOption <em>Exclude Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclude Option</em>'.
	 * @see CDP4.EngineeringModelData.OptionDependentThing#getExcludeOption()
	 * @see #getOptionDependentThing()
	 * @generated
	 */
	EReference getOptionDependentThing_ExcludeOption();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see CDP4.EngineeringModelData.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Option#getNestedElement <em>Nested Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Element</em>'.
	 * @see CDP4.EngineeringModelData.Option#getNestedElement()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_NestedElement();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.NestedElement <em>Nested Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Element</em>'.
	 * @see CDP4.EngineeringModelData.NestedElement
	 * @generated
	 */
	EClass getNestedElement();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.NestedElement#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see CDP4.EngineeringModelData.NestedElement#getRootElement()
	 * @see #getNestedElement()
	 * @generated
	 */
	EReference getNestedElement_RootElement();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.NestedElement#getElementUsage <em>Element Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Usage</em>'.
	 * @see CDP4.EngineeringModelData.NestedElement#getElementUsage()
	 * @see #getNestedElement()
	 * @generated
	 */
	EReference getNestedElement_ElementUsage();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.NestedElement#getNestedParameter <em>Nested Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Parameter</em>'.
	 * @see CDP4.EngineeringModelData.NestedElement#getNestedParameter()
	 * @see #getNestedElement()
	 * @generated
	 */
	EReference getNestedElement_NestedParameter();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition</em>'.
	 * @see CDP4.EngineeringModelData.ElementDefinition
	 * @generated
	 */
	EClass getElementDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ElementDefinition#getContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Element</em>'.
	 * @see CDP4.EngineeringModelData.ElementDefinition#getContainedElement()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_ContainedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ElementDefinition#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see CDP4.EngineeringModelData.ElementDefinition#getParameter()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ElementDefinition#getParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Group</em>'.
	 * @see CDP4.EngineeringModelData.ElementDefinition#getParameterGroup()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_ParameterGroup();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.ElementDefinition#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Element</em>'.
	 * @see CDP4.EngineeringModelData.ElementDefinition#getReferencedElement()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_ReferencedElement();

	/**
	 * Returns the meta object for the '{@link CDP4.EngineeringModelData.ElementDefinition#hasUniqueParameterNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Unique Parameter Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Unique Parameter Names</em>' operation.
	 * @see CDP4.EngineeringModelData.ElementDefinition#hasUniqueParameterNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElementDefinition__HasUniqueParameterNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link CDP4.EngineeringModelData.ElementDefinition#hasUniqueParameterShortNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Unique Parameter Short Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Unique Parameter Short Names</em>' operation.
	 * @see CDP4.EngineeringModelData.ElementDefinition#hasUniqueParameterShortNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElementDefinition__HasUniqueParameterShortNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ElementBase <em>Element Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Base</em>'.
	 * @see CDP4.EngineeringModelData.ElementBase
	 * @generated
	 */
	EClass getElementBase();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ElementUsage <em>Element Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Usage</em>'.
	 * @see CDP4.EngineeringModelData.ElementUsage
	 * @generated
	 */
	EClass getElementUsage();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ElementUsage#getElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Definition</em>'.
	 * @see CDP4.EngineeringModelData.ElementUsage#getElementDefinition()
	 * @see #getElementUsage()
	 * @generated
	 */
	EReference getElementUsage_ElementDefinition();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.ElementUsage#getInterfaceEnd <em>Interface End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface End</em>'.
	 * @see CDP4.EngineeringModelData.ElementUsage#getInterfaceEnd()
	 * @see #getElementUsage()
	 * @generated
	 */
	EAttribute getElementUsage_InterfaceEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ElementUsage#getParameterOverride <em>Parameter Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Override</em>'.
	 * @see CDP4.EngineeringModelData.ElementUsage#getParameterOverride()
	 * @see #getElementUsage()
	 * @generated
	 */
	EReference getElementUsage_ParameterOverride();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterOverride <em>Parameter Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Override</em>'.
	 * @see CDP4.EngineeringModelData.ParameterOverride
	 * @generated
	 */
	EClass getParameterOverride();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterOverride#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see CDP4.EngineeringModelData.ParameterOverride#getParameter()
	 * @see #getParameterOverride()
	 * @generated
	 */
	EReference getParameterOverride_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ParameterOverride#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Set</em>'.
	 * @see CDP4.EngineeringModelData.ParameterOverride#getValueSet()
	 * @see #getParameterOverride()
	 * @generated
	 */
	EReference getParameterOverride_ValueSet();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Group</em>'.
	 * @see CDP4.EngineeringModelData.ParameterGroup
	 * @generated
	 */
	EClass getParameterGroup();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterGroup#getContainingGroup <em>Containing Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Group</em>'.
	 * @see CDP4.EngineeringModelData.ParameterGroup#getContainingGroup()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EReference getParameterGroup_ContainingGroup();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterOverrideValueSet <em>Parameter Override Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Override Value Set</em>'.
	 * @see CDP4.EngineeringModelData.ParameterOverrideValueSet
	 * @generated
	 */
	EClass getParameterOverrideValueSet();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterOverrideValueSet#getParameterValueSet <em>Parameter Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Value Set</em>'.
	 * @see CDP4.EngineeringModelData.ParameterOverrideValueSet#getParameterValueSet()
	 * @see #getParameterOverrideValueSet()
	 * @generated
	 */
	EReference getParameterOverrideValueSet_ParameterValueSet();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterValueSetBase <em>Parameter Value Set Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value Set Base</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase
	 * @generated
	 */
	EClass getParameterValueSetBase();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getValueSwitch <em>Value Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Switch</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getValueSwitch()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EAttribute getParameterValueSetBase_ValueSwitch();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Published</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getPublished()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EAttribute getParameterValueSetBase_Published();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getFormula()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EAttribute getParameterValueSetBase_Formula();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getComputed <em>Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Computed</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getComputed()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EAttribute getParameterValueSetBase_Computed();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getManual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Manual</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getManual()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EAttribute getParameterValueSetBase_Manual();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reference</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getReference()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EAttribute getParameterValueSetBase_Reference();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actual Value</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getActualValue()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EAttribute getParameterValueSetBase_ActualValue();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getActualState <em>Actual State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual State</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getActualState()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EReference getParameterValueSetBase_ActualState();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterValueSetBase#getActualOption <em>Actual Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Option</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase#getActualOption()
	 * @see #getParameterValueSetBase()
	 * @generated
	 */
	EReference getParameterValueSetBase_ActualOption();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ActualFiniteState <em>Actual Finite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Finite State</em>'.
	 * @see CDP4.EngineeringModelData.ActualFiniteState
	 * @generated
	 */
	EClass getActualFiniteState();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.ActualFiniteState#getPossibleState <em>Possible State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible State</em>'.
	 * @see CDP4.EngineeringModelData.ActualFiniteState#getPossibleState()
	 * @see #getActualFiniteState()
	 * @generated
	 */
	EReference getActualFiniteState_PossibleState();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.ActualFiniteState#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CDP4.EngineeringModelData.ActualFiniteState#getKind()
	 * @see #getActualFiniteState()
	 * @generated
	 */
	EAttribute getActualFiniteState_Kind();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterValueSet <em>Parameter Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value Set</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValueSet
	 * @generated
	 */
	EClass getParameterValueSet();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.NestedParameter <em>Nested Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Parameter</em>'.
	 * @see CDP4.EngineeringModelData.NestedParameter
	 * @generated
	 */
	EClass getNestedParameter();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.NestedParameter#getAssociatedParameter <em>Associated Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Parameter</em>'.
	 * @see CDP4.EngineeringModelData.NestedParameter#getAssociatedParameter()
	 * @see #getNestedParameter()
	 * @generated
	 */
	EReference getNestedParameter_AssociatedParameter();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.NestedParameter#getActualState <em>Actual State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual State</em>'.
	 * @see CDP4.EngineeringModelData.NestedParameter#getActualState()
	 * @see #getNestedParameter()
	 * @generated
	 */
	EReference getNestedParameter_ActualState();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.NestedParameter#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see CDP4.EngineeringModelData.NestedParameter#getPath()
	 * @see #getNestedParameter()
	 * @generated
	 */
	EAttribute getNestedParameter_Path();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.NestedParameter#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see CDP4.EngineeringModelData.NestedParameter#getFormula()
	 * @see #getNestedParameter()
	 * @generated
	 */
	EAttribute getNestedParameter_Formula();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.NestedParameter#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Value</em>'.
	 * @see CDP4.EngineeringModelData.NestedParameter#getActualValue()
	 * @see #getNestedParameter()
	 * @generated
	 */
	EAttribute getNestedParameter_ActualValue();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.PossibleFiniteStateList <em>Possible Finite State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possible Finite State List</em>'.
	 * @see CDP4.EngineeringModelData.PossibleFiniteStateList
	 * @generated
	 */
	EClass getPossibleFiniteStateList();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.PossibleFiniteStateList#getPossibleState <em>Possible State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible State</em>'.
	 * @see CDP4.EngineeringModelData.PossibleFiniteStateList#getPossibleState()
	 * @see #getPossibleFiniteStateList()
	 * @generated
	 */
	EReference getPossibleFiniteStateList_PossibleState();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.PossibleFiniteStateList#getDefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default State</em>'.
	 * @see CDP4.EngineeringModelData.PossibleFiniteStateList#getDefaultState()
	 * @see #getPossibleFiniteStateList()
	 * @generated
	 */
	EReference getPossibleFiniteStateList_DefaultState();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterSubscription <em>Parameter Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Subscription</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscription
	 * @generated
	 */
	EClass getParameterSubscription();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ParameterSubscription#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Set</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscription#getValueSet()
	 * @see #getParameterSubscription()
	 * @generated
	 */
	EReference getParameterSubscription_ValueSet();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet <em>Parameter Subscription Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Subscription Value Set</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet
	 * @generated
	 */
	EClass getParameterSubscriptionValueSet();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getValueSwitch <em>Value Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Switch</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getValueSwitch()
	 * @see #getParameterSubscriptionValueSet()
	 * @generated
	 */
	EAttribute getParameterSubscriptionValueSet_ValueSwitch();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getComputed <em>Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Computed</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getComputed()
	 * @see #getParameterSubscriptionValueSet()
	 * @generated
	 */
	EAttribute getParameterSubscriptionValueSet_Computed();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getManual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Manual</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getManual()
	 * @see #getParameterSubscriptionValueSet()
	 * @generated
	 */
	EAttribute getParameterSubscriptionValueSet_Manual();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reference</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getReference()
	 * @see #getParameterSubscriptionValueSet()
	 * @generated
	 */
	EAttribute getParameterSubscriptionValueSet_Reference();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actual Value</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualValue()
	 * @see #getParameterSubscriptionValueSet()
	 * @generated
	 */
	EAttribute getParameterSubscriptionValueSet_ActualValue();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getSubscribedValueSet <em>Subscribed Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscribed Value Set</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getSubscribedValueSet()
	 * @see #getParameterSubscriptionValueSet()
	 * @generated
	 */
	EReference getParameterSubscriptionValueSet_SubscribedValueSet();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualState <em>Actual State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual State</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualState()
	 * @see #getParameterSubscriptionValueSet()
	 * @generated
	 */
	EReference getParameterSubscriptionValueSet_ActualState();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualOption <em>Actual Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Option</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet#getActualOption()
	 * @see #getParameterSubscriptionValueSet()
	 * @generated
	 */
	EReference getParameterSubscriptionValueSet_ActualOption();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.FileStore <em>File Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Store</em>'.
	 * @see CDP4.EngineeringModelData.FileStore
	 * @generated
	 */
	EClass getFileStore();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.FileStore#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folder</em>'.
	 * @see CDP4.EngineeringModelData.FileStore#getFolder()
	 * @see #getFileStore()
	 * @generated
	 */
	EReference getFileStore_Folder();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.FileStore#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File</em>'.
	 * @see CDP4.EngineeringModelData.FileStore#getFile()
	 * @see #getFileStore()
	 * @generated
	 */
	EReference getFileStore_File();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see CDP4.EngineeringModelData.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.Folder#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see CDP4.EngineeringModelData.Folder#getCreator()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Creator();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.Folder#getContainingFolder <em>Containing Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Folder</em>'.
	 * @see CDP4.EngineeringModelData.Folder#getContainingFolder()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_ContainingFolder();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.Folder#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see CDP4.EngineeringModelData.Folder#getPath()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Path();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see CDP4.EngineeringModelData.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.File#getLockedBy <em>Locked By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Locked By</em>'.
	 * @see CDP4.EngineeringModelData.File#getLockedBy()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_LockedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.File#getFileRevision <em>File Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Revision</em>'.
	 * @see CDP4.EngineeringModelData.File#getFileRevision()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_FileRevision();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.FileRevision <em>File Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Revision</em>'.
	 * @see CDP4.EngineeringModelData.FileRevision
	 * @generated
	 */
	EClass getFileRevision();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.FileRevision#getContentHash <em>Content Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Hash</em>'.
	 * @see CDP4.EngineeringModelData.FileRevision#getContentHash()
	 * @see #getFileRevision()
	 * @generated
	 */
	EAttribute getFileRevision_ContentHash();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.FileRevision#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see CDP4.EngineeringModelData.FileRevision#getCreator()
	 * @see #getFileRevision()
	 * @generated
	 */
	EReference getFileRevision_Creator();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.FileRevision#getContainingFolder <em>Containing Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Folder</em>'.
	 * @see CDP4.EngineeringModelData.FileRevision#getContainingFolder()
	 * @see #getFileRevision()
	 * @generated
	 */
	EReference getFileRevision_ContainingFolder();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.FileRevision#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>File Type</em>'.
	 * @see CDP4.EngineeringModelData.FileRevision#getFileType()
	 * @see #getFileRevision()
	 * @generated
	 */
	EReference getFileRevision_FileType();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.FileRevision#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see CDP4.EngineeringModelData.FileRevision#getPath()
	 * @see #getFileRevision()
	 * @generated
	 */
	EAttribute getFileRevision_Path();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Publication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication</em>'.
	 * @see CDP4.EngineeringModelData.Publication
	 * @generated
	 */
	EClass getPublication();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.Publication#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain</em>'.
	 * @see CDP4.EngineeringModelData.Publication#getDomain()
	 * @see #getPublication()
	 * @generated
	 */
	EReference getPublication_Domain();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.Publication#getPublishedParameter <em>Published Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Published Parameter</em>'.
	 * @see CDP4.EngineeringModelData.Publication#getPublishedParameter()
	 * @see #getPublication()
	 * @generated
	 */
	EReference getPublication_PublishedParameter();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.EngineeringModel <em>Engineering Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Model</em>'.
	 * @see CDP4.EngineeringModelData.EngineeringModel
	 * @generated
	 */
	EClass getEngineeringModel();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.EngineeringModel#getEngineeringModelSetup <em>Engineering Model Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engineering Model Setup</em>'.
	 * @see CDP4.EngineeringModelData.EngineeringModel#getEngineeringModelSetup()
	 * @see #getEngineeringModel()
	 * @generated
	 */
	EReference getEngineeringModel_EngineeringModelSetup();

	/**
	 * Returns the meta object for the containment reference '{@link CDP4.EngineeringModelData.EngineeringModel#getCommonFileStore <em>Common File Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common File Store</em>'.
	 * @see CDP4.EngineeringModelData.EngineeringModel#getCommonFileStore()
	 * @see #getEngineeringModel()
	 * @generated
	 */
	EReference getEngineeringModel_CommonFileStore();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.EngineeringModel#getLogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Entry</em>'.
	 * @see CDP4.EngineeringModelData.EngineeringModel#getLogEntry()
	 * @see #getEngineeringModel()
	 * @generated
	 */
	EReference getEngineeringModel_LogEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.EngineeringModel#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iteration</em>'.
	 * @see CDP4.EngineeringModelData.EngineeringModel#getIteration()
	 * @see #getEngineeringModel()
	 * @generated
	 */
	EReference getEngineeringModel_Iteration();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.EngineeringModel#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Book</em>'.
	 * @see CDP4.EngineeringModelData.EngineeringModel#getBook()
	 * @see #getEngineeringModel()
	 * @generated
	 */
	EReference getEngineeringModel_Book();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.EngineeringModel#getGenericNote <em>Generic Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Note</em>'.
	 * @see CDP4.EngineeringModelData.EngineeringModel#getGenericNote()
	 * @see #getEngineeringModel()
	 * @generated
	 */
	EReference getEngineeringModel_GenericNote();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.EngineeringModel#getModellingAnnotation <em>Modelling Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelling Annotation</em>'.
	 * @see CDP4.EngineeringModelData.EngineeringModel#getModellingAnnotation()
	 * @see #getEngineeringModel()
	 * @generated
	 */
	EReference getEngineeringModel_ModellingAnnotation();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.CommonFileStore <em>Common File Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common File Store</em>'.
	 * @see CDP4.EngineeringModelData.CommonFileStore
	 * @generated
	 */
	EClass getCommonFileStore();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ModelLogEntry <em>Model Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Log Entry</em>'.
	 * @see CDP4.EngineeringModelData.ModelLogEntry
	 * @generated
	 */
	EClass getModelLogEntry();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration</em>'.
	 * @see CDP4.EngineeringModelData.Iteration
	 * @generated
	 */
	EClass getIteration();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.Iteration#getIterationSetup <em>Iteration Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iteration Setup</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getIterationSetup()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_IterationSetup();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.Iteration#getSourceIterationIid <em>Source Iteration Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Iteration Iid</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getSourceIterationIid()
	 * @see #getIteration()
	 * @generated
	 */
	EAttribute getIteration_SourceIterationIid();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getOption()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Option();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getPublication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publication</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getPublication()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Publication();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getPossibleFiniteStateList <em>Possible Finite State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Finite State List</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getPossibleFiniteStateList()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_PossibleFiniteStateList();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.Iteration#getTopElement <em>Top Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top Element</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getTopElement()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_TopElement();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getElement()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getRelationship()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getExternalIdentifierMap <em>External Identifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Identifier Map</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getExternalIdentifierMap()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_ExternalIdentifierMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getRequirementsSpecification <em>Requirements Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements Specification</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getRequirementsSpecification()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_RequirementsSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getDomainFileStore <em>Domain File Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain File Store</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getDomainFileStore()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_DomainFileStore();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getActualFiniteStateList <em>Actual Finite State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Finite State List</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getActualFiniteStateList()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_ActualFiniteStateList();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.Iteration#getDefaultOption <em>Default Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Option</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getDefaultOption()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_DefaultOption();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getRuleVerificationList <em>Rule Verification List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Verification List</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getRuleVerificationList()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_RuleVerificationList();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getStakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stakeholder</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getStakeholder()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Stakeholder();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getGoal()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Group</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getValueGroup()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_ValueGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getStakeholderValue <em>Stakeholder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stakeholder Value</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getStakeholderValue()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_StakeholderValue();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getStakeholderValueMap <em>Stakeholder Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stakeholder Value Map</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getStakeholderValueMap()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_StakeholderValueMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getSharedDiagramStyle <em>Shared Diagram Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Diagram Style</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getSharedDiagramStyle()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_SharedDiagramStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Iteration#getDiagramCanvas <em>Diagram Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Canvas</em>'.
	 * @see CDP4.EngineeringModelData.Iteration#getDiagramCanvas()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_DiagramCanvas();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see CDP4.EngineeringModelData.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Relationship#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
	 * @see CDP4.EngineeringModelData.Relationship#getParameterValue()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ParameterValue();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RelationshipParameterValue <em>Relationship Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Parameter Value</em>'.
	 * @see CDP4.EngineeringModelData.RelationshipParameterValue
	 * @generated
	 */
	EClass getRelationshipParameterValue();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterValue#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValue#getParameterType()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_ParameterType();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParameterValue#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scale</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValue#getScale()
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_Scale();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.ParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see CDP4.EngineeringModelData.ParameterValue#getValue()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Value();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ExternalIdentifierMap <em>External Identifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Identifier Map</em>'.
	 * @see CDP4.EngineeringModelData.ExternalIdentifierMap
	 * @generated
	 */
	EClass getExternalIdentifierMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getCorrespondence <em>Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correspondence</em>'.
	 * @see CDP4.EngineeringModelData.ExternalIdentifierMap#getCorrespondence()
	 * @see #getExternalIdentifierMap()
	 * @generated
	 */
	EReference getExternalIdentifierMap_Correspondence();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalModelName <em>External Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Model Name</em>'.
	 * @see CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalModelName()
	 * @see #getExternalIdentifierMap()
	 * @generated
	 */
	EAttribute getExternalIdentifierMap_ExternalModelName();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalToolName <em>External Tool Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Tool Name</em>'.
	 * @see CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalToolName()
	 * @see #getExternalIdentifierMap()
	 * @generated
	 */
	EAttribute getExternalIdentifierMap_ExternalToolName();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalToolVersion <em>External Tool Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Tool Version</em>'.
	 * @see CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalToolVersion()
	 * @see #getExternalIdentifierMap()
	 * @generated
	 */
	EAttribute getExternalIdentifierMap_ExternalToolVersion();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalFormat <em>External Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Format</em>'.
	 * @see CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalFormat()
	 * @see #getExternalIdentifierMap()
	 * @generated
	 */
	EReference getExternalIdentifierMap_ExternalFormat();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.IdCorrespondence <em>Id Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Correspondence</em>'.
	 * @see CDP4.EngineeringModelData.IdCorrespondence
	 * @generated
	 */
	EClass getIdCorrespondence();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.IdCorrespondence#getInternalThing <em>Internal Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Thing</em>'.
	 * @see CDP4.EngineeringModelData.IdCorrespondence#getInternalThing()
	 * @see #getIdCorrespondence()
	 * @generated
	 */
	EAttribute getIdCorrespondence_InternalThing();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.IdCorrespondence#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see CDP4.EngineeringModelData.IdCorrespondence#getExternalId()
	 * @see #getIdCorrespondence()
	 * @generated
	 */
	EAttribute getIdCorrespondence_ExternalId();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RequirementsSpecification <em>Requirements Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Specification</em>'.
	 * @see CDP4.EngineeringModelData.RequirementsSpecification
	 * @generated
	 */
	EClass getRequirementsSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.RequirementsSpecification#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see CDP4.EngineeringModelData.RequirementsSpecification#getRequirement()
	 * @see #getRequirementsSpecification()
	 * @generated
	 */
	EReference getRequirementsSpecification_Requirement();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RequirementsContainer <em>Requirements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Container</em>'.
	 * @see CDP4.EngineeringModelData.RequirementsContainer
	 * @generated
	 */
	EClass getRequirementsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.RequirementsContainer#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see CDP4.EngineeringModelData.RequirementsContainer#getGroup()
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	EReference getRequirementsContainer_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.RequirementsContainer#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
	 * @see CDP4.EngineeringModelData.RequirementsContainer#getParameterValue()
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	EReference getRequirementsContainer_ParameterValue();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RequirementsGroup <em>Requirements Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Group</em>'.
	 * @see CDP4.EngineeringModelData.RequirementsGroup
	 * @generated
	 */
	EClass getRequirementsGroup();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RequirementsContainerParameterValue <em>Requirements Container Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Container Parameter Value</em>'.
	 * @see CDP4.EngineeringModelData.RequirementsContainerParameterValue
	 * @generated
	 */
	EClass getRequirementsContainerParameterValue();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see CDP4.EngineeringModelData.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.Requirement#getParametricConstraint <em>Parametric Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametric Constraint</em>'.
	 * @see CDP4.EngineeringModelData.Requirement#getParametricConstraint()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ParametricConstraint();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.Requirement#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see CDP4.EngineeringModelData.Requirement#getGroup()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Group();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.SimpleParameterizableThing <em>Simple Parameterizable Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Parameterizable Thing</em>'.
	 * @see CDP4.EngineeringModelData.SimpleParameterizableThing
	 * @generated
	 */
	EClass getSimpleParameterizableThing();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.SimpleParameterizableThing#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
	 * @see CDP4.EngineeringModelData.SimpleParameterizableThing#getParameterValue()
	 * @see #getSimpleParameterizableThing()
	 * @generated
	 */
	EReference getSimpleParameterizableThing_ParameterValue();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.SimpleParameterValue <em>Simple Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Parameter Value</em>'.
	 * @see CDP4.EngineeringModelData.SimpleParameterValue
	 * @generated
	 */
	EClass getSimpleParameterValue();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.SimpleParameterValue#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see CDP4.EngineeringModelData.SimpleParameterValue#getParameterType()
	 * @see #getSimpleParameterValue()
	 * @generated
	 */
	EReference getSimpleParameterValue_ParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.SimpleParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see CDP4.EngineeringModelData.SimpleParameterValue#getValue()
	 * @see #getSimpleParameterValue()
	 * @generated
	 */
	EAttribute getSimpleParameterValue_Value();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.SimpleParameterValue#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scale</em>'.
	 * @see CDP4.EngineeringModelData.SimpleParameterValue#getScale()
	 * @see #getSimpleParameterValue()
	 * @generated
	 */
	EReference getSimpleParameterValue_Scale();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ParametricConstraint <em>Parametric Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametric Constraint</em>'.
	 * @see CDP4.EngineeringModelData.ParametricConstraint
	 * @generated
	 */
	EClass getParametricConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.ParametricConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see CDP4.EngineeringModelData.ParametricConstraint#getExpression()
	 * @see #getParametricConstraint()
	 * @generated
	 */
	EReference getParametricConstraint_Expression();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.ParametricConstraint#getTopExpression <em>Top Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top Expression</em>'.
	 * @see CDP4.EngineeringModelData.ParametricConstraint#getTopExpression()
	 * @see #getParametricConstraint()
	 * @generated
	 */
	EReference getParametricConstraint_TopExpression();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see CDP4.EngineeringModelData.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.DomainFileStore <em>Domain File Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain File Store</em>'.
	 * @see CDP4.EngineeringModelData.DomainFileStore
	 * @generated
	 */
	EClass getDomainFileStore();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.DomainFileStore#getIsHidden <em>Is Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hidden</em>'.
	 * @see CDP4.EngineeringModelData.DomainFileStore#getIsHidden()
	 * @see #getDomainFileStore()
	 * @generated
	 */
	EAttribute getDomainFileStore_IsHidden();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RuleVerificationList <em>Rule Verification List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Verification List</em>'.
	 * @see CDP4.EngineeringModelData.RuleVerificationList
	 * @generated
	 */
	EClass getRuleVerificationList();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.RuleVerificationList#getRuleVerification <em>Rule Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Verification</em>'.
	 * @see CDP4.EngineeringModelData.RuleVerificationList#getRuleVerification()
	 * @see #getRuleVerificationList()
	 * @generated
	 */
	EReference getRuleVerificationList_RuleVerification();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RuleVerification <em>Rule Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Verification</em>'.
	 * @see CDP4.EngineeringModelData.RuleVerification
	 * @generated
	 */
	EClass getRuleVerification();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.RuleVerification#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see CDP4.EngineeringModelData.RuleVerification#getIsActive()
	 * @see #getRuleVerification()
	 * @generated
	 */
	EAttribute getRuleVerification_IsActive();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.EngineeringModelData.RuleVerification#getViolation <em>Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Violation</em>'.
	 * @see CDP4.EngineeringModelData.RuleVerification#getViolation()
	 * @see #getRuleVerification()
	 * @generated
	 */
	EReference getRuleVerification_Violation();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.RuleVerification#getExecutedOn <em>Executed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed On</em>'.
	 * @see CDP4.EngineeringModelData.RuleVerification#getExecutedOn()
	 * @see #getRuleVerification()
	 * @generated
	 */
	EAttribute getRuleVerification_ExecutedOn();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.RuleVerification#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see CDP4.EngineeringModelData.RuleVerification#getStatus()
	 * @see #getRuleVerification()
	 * @generated
	 */
	EAttribute getRuleVerification_Status();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RuleViolation <em>Rule Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Violation</em>'.
	 * @see CDP4.EngineeringModelData.RuleViolation
	 * @generated
	 */
	EClass getRuleViolation();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.RuleViolation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CDP4.EngineeringModelData.RuleViolation#getDescription()
	 * @see #getRuleViolation()
	 * @generated
	 */
	EAttribute getRuleViolation_Description();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.RuleViolation#getViolatingThing <em>Violating Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Violating Thing</em>'.
	 * @see CDP4.EngineeringModelData.RuleViolation#getViolatingThing()
	 * @see #getRuleViolation()
	 * @generated
	 */
	EAttribute getRuleViolation_ViolatingThing();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see CDP4.EngineeringModelData.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.Stakeholder#getStakeholderValue <em>Stakeholder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholder Value</em>'.
	 * @see CDP4.EngineeringModelData.Stakeholder#getStakeholderValue()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_StakeholderValue();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.StakeholderValue <em>Stakeholder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder Value</em>'.
	 * @see CDP4.EngineeringModelData.StakeholderValue
	 * @generated
	 */
	EClass getStakeholderValue();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see CDP4.EngineeringModelData.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Group</em>'.
	 * @see CDP4.EngineeringModelData.ValueGroup
	 * @generated
	 */
	EClass getValueGroup();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.StakeHolderValueMap <em>Stake Holder Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stake Holder Value Map</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMap
	 * @generated
	 */
	EClass getStakeHolderValueMap();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.StakeHolderValueMap#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMap#getGoal()
	 * @see #getStakeHolderValueMap()
	 * @generated
	 */
	EReference getStakeHolderValueMap_Goal();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.StakeHolderValueMap#getValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Group</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMap#getValueGroup()
	 * @see #getStakeHolderValueMap()
	 * @generated
	 */
	EReference getStakeHolderValueMap_ValueGroup();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.StakeHolderValueMap#getStakeholderValue <em>Stakeholder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholder Value</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMap#getStakeholderValue()
	 * @see #getStakeHolderValueMap()
	 * @generated
	 */
	EReference getStakeHolderValueMap_StakeholderValue();

	/**
	 * Returns the meta object for the containment reference '{@link CDP4.EngineeringModelData.StakeHolderValueMap#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMap#getSettings()
	 * @see #getStakeHolderValueMap()
	 * @generated
	 */
	EReference getStakeHolderValueMap_Settings();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.StakeHolderValueMap#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMap#getRequirement()
	 * @see #getStakeHolderValueMap()
	 * @generated
	 */
	EReference getStakeHolderValueMap_Requirement();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings <em>Stake Holder Value Map Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stake Holder Value Map Settings</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMapSettings
	 * @generated
	 */
	EClass getStakeHolderValueMapSettings();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getGoalToValueGroupRelationship <em>Goal To Value Group Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal To Value Group Relationship</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMapSettings#getGoalToValueGroupRelationship()
	 * @see #getStakeHolderValueMapSettings()
	 * @generated
	 */
	EReference getStakeHolderValueMapSettings_GoalToValueGroupRelationship();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getValueGroupToStakeholderValueRelationship <em>Value Group To Stakeholder Value Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Group To Stakeholder Value Relationship</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMapSettings#getValueGroupToStakeholderValueRelationship()
	 * @see #getStakeHolderValueMapSettings()
	 * @generated
	 */
	EReference getStakeHolderValueMapSettings_ValueGroupToStakeholderValueRelationship();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getStakeholderValueToRequirementRelationship <em>Stakeholder Value To Requirement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stakeholder Value To Requirement Relationship</em>'.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMapSettings#getStakeholderValueToRequirementRelationship()
	 * @see #getStakeHolderValueMapSettings()
	 * @generated
	 */
	EReference getStakeHolderValueMapSettings_StakeholderValueToRequirementRelationship();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.MultiRelationship <em>Multi Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Relationship</em>'.
	 * @see CDP4.EngineeringModelData.MultiRelationship
	 * @generated
	 */
	EClass getMultiRelationship();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.MultiRelationship#getRelatedThing <em>Related Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Thing</em>'.
	 * @see CDP4.EngineeringModelData.MultiRelationship#getRelatedThing()
	 * @see #getMultiRelationship()
	 * @generated
	 */
	EReference getMultiRelationship_RelatedThing();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.BinaryRelationship <em>Binary Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Relationship</em>'.
	 * @see CDP4.EngineeringModelData.BinaryRelationship
	 * @generated
	 */
	EClass getBinaryRelationship();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.BinaryRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CDP4.EngineeringModelData.BinaryRelationship#getSource()
	 * @see #getBinaryRelationship()
	 * @generated
	 */
	EReference getBinaryRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.BinaryRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see CDP4.EngineeringModelData.BinaryRelationship#getTarget()
	 * @see #getBinaryRelationship()
	 * @generated
	 */
	EReference getBinaryRelationship_Target();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see CDP4.EngineeringModelData.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.OrExpression#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term</em>'.
	 * @see CDP4.EngineeringModelData.OrExpression#getTerm()
	 * @see #getOrExpression()
	 * @generated
	 */
	EReference getOrExpression_Term();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see CDP4.EngineeringModelData.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.NotExpression#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term</em>'.
	 * @see CDP4.EngineeringModelData.NotExpression#getTerm()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Term();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see CDP4.EngineeringModelData.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.AndExpression#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term</em>'.
	 * @see CDP4.EngineeringModelData.AndExpression#getTerm()
	 * @see #getAndExpression()
	 * @generated
	 */
	EReference getAndExpression_Term();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Or Expression</em>'.
	 * @see CDP4.EngineeringModelData.ExclusiveOrExpression
	 * @generated
	 */
	EClass getExclusiveOrExpression();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.EngineeringModelData.ExclusiveOrExpression#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term</em>'.
	 * @see CDP4.EngineeringModelData.ExclusiveOrExpression#getTerm()
	 * @see #getExclusiveOrExpression()
	 * @generated
	 */
	EReference getExclusiveOrExpression_Term();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see CDP4.EngineeringModelData.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.RelationalExpression#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see CDP4.EngineeringModelData.RelationalExpression#getParameterType()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.EngineeringModelData.RelationalExpression#getRelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relational Operator</em>'.
	 * @see CDP4.EngineeringModelData.RelationalExpression#getRelationalOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_RelationalOperator();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.EngineeringModelData.RelationalExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see CDP4.EngineeringModelData.RelationalExpression#getValue()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Value();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.RelationalExpression#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scale</em>'.
	 * @see CDP4.EngineeringModelData.RelationalExpression#getScale()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Scale();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.UserRuleVerification <em>User Rule Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Rule Verification</em>'.
	 * @see CDP4.EngineeringModelData.UserRuleVerification
	 * @generated
	 */
	EClass getUserRuleVerification();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.UserRuleVerification#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see CDP4.EngineeringModelData.UserRuleVerification#getRule()
	 * @see #getUserRuleVerification()
	 * @generated
	 */
	EReference getUserRuleVerification_Rule();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.BuiltInRuleVerification <em>Built In Rule Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Rule Verification</em>'.
	 * @see CDP4.EngineeringModelData.BuiltInRuleVerification
	 * @generated
	 */
	EClass getBuiltInRuleVerification();

	/**
	 * Returns the meta object for class '{@link CDP4.EngineeringModelData.OwnedThing <em>Owned Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owned Thing</em>'.
	 * @see CDP4.EngineeringModelData.OwnedThing
	 * @generated
	 */
	EClass getOwnedThing();

	/**
	 * Returns the meta object for the reference '{@link CDP4.EngineeringModelData.OwnedThing#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see CDP4.EngineeringModelData.OwnedThing#getOwner()
	 * @see #getOwnedThing()
	 * @generated
	 */
	EReference getOwnedThing_Owner();

	/**
	 * Returns the meta object for enum '{@link CDP4.EngineeringModelData.InterfaceEndKind <em>Interface End Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface End Kind</em>'.
	 * @see CDP4.EngineeringModelData.InterfaceEndKind
	 * @generated
	 */
	EEnum getInterfaceEndKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.EngineeringModelData.ParameterSwitchKind <em>Parameter Switch Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Switch Kind</em>'.
	 * @see CDP4.EngineeringModelData.ParameterSwitchKind
	 * @generated
	 */
	EEnum getParameterSwitchKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.EngineeringModelData.ActualFiniteStateKind <em>Actual Finite State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actual Finite State Kind</em>'.
	 * @see CDP4.EngineeringModelData.ActualFiniteStateKind
	 * @generated
	 */
	EEnum getActualFiniteStateKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.EngineeringModelData.RuleVerificationStatusKind <em>Rule Verification Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Verification Status Kind</em>'.
	 * @see CDP4.EngineeringModelData.RuleVerificationStatusKind
	 * @generated
	 */
	EEnum getRuleVerificationStatusKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.EngineeringModelData.BooleanOperatorKind <em>Boolean Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator Kind</em>'.
	 * @see CDP4.EngineeringModelData.BooleanOperatorKind
	 * @generated
	 */
	EEnum getBooleanOperatorKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.EngineeringModelData.RelationalOperatorKind <em>Relational Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator Kind</em>'.
	 * @see CDP4.EngineeringModelData.RelationalOperatorKind
	 * @generated
	 */
	EEnum getRelationalOperatorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EngineeringModelDataFactory getEngineeringModelDataFactory();

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
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.PossibleFiniteStateImpl <em>Possible Finite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.PossibleFiniteStateImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getPossibleFiniteState()
		 * @generated
		 */
		EClass POSSIBLE_FINITE_STATE = eINSTANCE.getPossibleFiniteState();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Requested By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__REQUESTED_BY = eINSTANCE.getParameter_RequestedBy();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE_SET = eINSTANCE.getParameter_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Allow Different Owner Of Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ALLOW_DIFFERENT_OWNER_OF_OVERRIDE = eINSTANCE.getParameter_AllowDifferentOwnerOfOverride();

		/**
		 * The meta object literal for the '<em><b>Expects Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EXPECTS_OVERRIDE = eINSTANCE.getParameter_ExpectsOverride();

		/**
		 * The meta object literal for the '<em><b>Has Valid Scale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___HAS_VALID_SCALE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getParameter__HasValidScale__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterOrOverrideBaseImpl <em>Parameter Or Override Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterOrOverrideBaseImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterOrOverrideBase()
		 * @generated
		 */
		EClass PARAMETER_OR_OVERRIDE_BASE = eINSTANCE.getParameterOrOverrideBase();

		/**
		 * The meta object literal for the '<em><b>Parameter Subscription</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION = eINSTANCE.getParameterOrOverrideBase_ParameterSubscription();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterBaseImpl <em>Parameter Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterBaseImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterBase()
		 * @generated
		 */
		EClass PARAMETER_BASE = eINSTANCE.getParameterBase();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BASE__PARAMETER_TYPE = eINSTANCE.getParameterBase_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BASE__SCALE = eINSTANCE.getParameterBase_Scale();

		/**
		 * The meta object literal for the '<em><b>State Dependence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BASE__STATE_DEPENDENCE = eINSTANCE.getParameterBase_StateDependence();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BASE__GROUP = eINSTANCE.getParameterBase_Group();

		/**
		 * The meta object literal for the '<em><b>Is Option Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_BASE__IS_OPTION_DEPENDENT = eINSTANCE.getParameterBase_IsOptionDependent();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl <em>Actual Finite State List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getActualFiniteStateList()
		 * @generated
		 */
		EClass ACTUAL_FINITE_STATE_LIST = eINSTANCE.getActualFiniteStateList();

		/**
		 * The meta object literal for the '<em><b>Possible Finite State List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_FINITE_STATE_LIST__POSSIBLE_FINITE_STATE_LIST = eINSTANCE.getActualFiniteStateList_PossibleFiniteStateList();

		/**
		 * The meta object literal for the '<em><b>Actual State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE = eINSTANCE.getActualFiniteStateList_ActualState();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.OptionDependentThingImpl <em>Option Dependent Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.OptionDependentThingImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getOptionDependentThing()
		 * @generated
		 */
		EClass OPTION_DEPENDENT_THING = eINSTANCE.getOptionDependentThing();

		/**
		 * The meta object literal for the '<em><b>Exclude Option</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_DEPENDENT_THING__EXCLUDE_OPTION = eINSTANCE.getOptionDependentThing_ExcludeOption();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.OptionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Nested Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__NESTED_ELEMENT = eINSTANCE.getOption_NestedElement();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.NestedElementImpl <em>Nested Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.NestedElementImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getNestedElement()
		 * @generated
		 */
		EClass NESTED_ELEMENT = eINSTANCE.getNestedElement();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_ELEMENT__ROOT_ELEMENT = eINSTANCE.getNestedElement_RootElement();

		/**
		 * The meta object literal for the '<em><b>Element Usage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_ELEMENT__ELEMENT_USAGE = eINSTANCE.getNestedElement_ElementUsage();

		/**
		 * The meta object literal for the '<em><b>Nested Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_ELEMENT__NESTED_PARAMETER = eINSTANCE.getNestedElement_NestedParameter();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ElementDefinitionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getElementDefinition()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Contained Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__CONTAINED_ELEMENT = eINSTANCE.getElementDefinition_ContainedElement();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PARAMETER = eINSTANCE.getElementDefinition_Parameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PARAMETER_GROUP = eINSTANCE.getElementDefinition_ParameterGroup();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__REFERENCED_ELEMENT = eINSTANCE.getElementDefinition_ReferencedElement();

		/**
		 * The meta object literal for the '<em><b>Has Unique Parameter Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_DEFINITION___HAS_UNIQUE_PARAMETER_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getElementDefinition__HasUniqueParameterNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Unique Parameter Short Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_DEFINITION___HAS_UNIQUE_PARAMETER_SHORT_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getElementDefinition__HasUniqueParameterShortNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ElementBaseImpl <em>Element Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ElementBaseImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getElementBase()
		 * @generated
		 */
		EClass ELEMENT_BASE = eINSTANCE.getElementBase();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ElementUsageImpl <em>Element Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ElementUsageImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getElementUsage()
		 * @generated
		 */
		EClass ELEMENT_USAGE = eINSTANCE.getElementUsage();

		/**
		 * The meta object literal for the '<em><b>Element Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_USAGE__ELEMENT_DEFINITION = eINSTANCE.getElementUsage_ElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Interface End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_USAGE__INTERFACE_END = eINSTANCE.getElementUsage_InterfaceEnd();

		/**
		 * The meta object literal for the '<em><b>Parameter Override</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_USAGE__PARAMETER_OVERRIDE = eINSTANCE.getElementUsage_ParameterOverride();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterOverrideImpl <em>Parameter Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterOverrideImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterOverride()
		 * @generated
		 */
		EClass PARAMETER_OVERRIDE = eINSTANCE.getParameterOverride();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_OVERRIDE__PARAMETER = eINSTANCE.getParameterOverride_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_OVERRIDE__VALUE_SET = eINSTANCE.getParameterOverride_ValueSet();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterGroupImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterGroup()
		 * @generated
		 */
		EClass PARAMETER_GROUP = eINSTANCE.getParameterGroup();

		/**
		 * The meta object literal for the '<em><b>Containing Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_GROUP__CONTAINING_GROUP = eINSTANCE.getParameterGroup_ContainingGroup();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterOverrideValueSetImpl <em>Parameter Override Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterOverrideValueSetImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterOverrideValueSet()
		 * @generated
		 */
		EClass PARAMETER_OVERRIDE_VALUE_SET = eINSTANCE.getParameterOverrideValueSet();

		/**
		 * The meta object literal for the '<em><b>Parameter Value Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET = eINSTANCE.getParameterOverrideValueSet_ParameterValueSet();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl <em>Parameter Value Set Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterValueSetBase()
		 * @generated
		 */
		EClass PARAMETER_VALUE_SET_BASE = eINSTANCE.getParameterValueSetBase();

		/**
		 * The meta object literal for the '<em><b>Value Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_SET_BASE__VALUE_SWITCH = eINSTANCE.getParameterValueSetBase_ValueSwitch();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_SET_BASE__PUBLISHED = eINSTANCE.getParameterValueSetBase_Published();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_SET_BASE__FORMULA = eINSTANCE.getParameterValueSetBase_Formula();

		/**
		 * The meta object literal for the '<em><b>Computed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_SET_BASE__COMPUTED = eINSTANCE.getParameterValueSetBase_Computed();

		/**
		 * The meta object literal for the '<em><b>Manual</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_SET_BASE__MANUAL = eINSTANCE.getParameterValueSetBase_Manual();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_SET_BASE__REFERENCE = eINSTANCE.getParameterValueSetBase_Reference();

		/**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE = eINSTANCE.getParameterValueSetBase_ActualValue();

		/**
		 * The meta object literal for the '<em><b>Actual State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_SET_BASE__ACTUAL_STATE = eINSTANCE.getParameterValueSetBase_ActualState();

		/**
		 * The meta object literal for the '<em><b>Actual Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION = eINSTANCE.getParameterValueSetBase_ActualOption();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ActualFiniteStateImpl <em>Actual Finite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ActualFiniteStateImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getActualFiniteState()
		 * @generated
		 */
		EClass ACTUAL_FINITE_STATE = eINSTANCE.getActualFiniteState();

		/**
		 * The meta object literal for the '<em><b>Possible State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_FINITE_STATE__POSSIBLE_STATE = eINSTANCE.getActualFiniteState_PossibleState();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_FINITE_STATE__KIND = eINSTANCE.getActualFiniteState_Kind();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterValueSetImpl <em>Parameter Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterValueSetImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterValueSet()
		 * @generated
		 */
		EClass PARAMETER_VALUE_SET = eINSTANCE.getParameterValueSet();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.NestedParameterImpl <em>Nested Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.NestedParameterImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getNestedParameter()
		 * @generated
		 */
		EClass NESTED_PARAMETER = eINSTANCE.getNestedParameter();

		/**
		 * The meta object literal for the '<em><b>Associated Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_PARAMETER__ASSOCIATED_PARAMETER = eINSTANCE.getNestedParameter_AssociatedParameter();

		/**
		 * The meta object literal for the '<em><b>Actual State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_PARAMETER__ACTUAL_STATE = eINSTANCE.getNestedParameter_ActualState();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_PARAMETER__PATH = eINSTANCE.getNestedParameter_Path();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_PARAMETER__FORMULA = eINSTANCE.getNestedParameter_Formula();

		/**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_PARAMETER__ACTUAL_VALUE = eINSTANCE.getNestedParameter_ActualValue();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.PossibleFiniteStateListImpl <em>Possible Finite State List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.PossibleFiniteStateListImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getPossibleFiniteStateList()
		 * @generated
		 */
		EClass POSSIBLE_FINITE_STATE_LIST = eINSTANCE.getPossibleFiniteStateList();

		/**
		 * The meta object literal for the '<em><b>Possible State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE = eINSTANCE.getPossibleFiniteStateList_PossibleState();

		/**
		 * The meta object literal for the '<em><b>Default State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE = eINSTANCE.getPossibleFiniteStateList_DefaultState();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterSubscriptionImpl <em>Parameter Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterSubscriptionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterSubscription()
		 * @generated
		 */
		EClass PARAMETER_SUBSCRIPTION = eINSTANCE.getParameterSubscription();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SUBSCRIPTION__VALUE_SET = eINSTANCE.getParameterSubscription_ValueSet();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterSubscriptionValueSetImpl <em>Parameter Subscription Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterSubscriptionValueSetImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterSubscriptionValueSet()
		 * @generated
		 */
		EClass PARAMETER_SUBSCRIPTION_VALUE_SET = eINSTANCE.getParameterSubscriptionValueSet();

		/**
		 * The meta object literal for the '<em><b>Value Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SUBSCRIPTION_VALUE_SET__VALUE_SWITCH = eINSTANCE.getParameterSubscriptionValueSet_ValueSwitch();

		/**
		 * The meta object literal for the '<em><b>Computed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SUBSCRIPTION_VALUE_SET__COMPUTED = eINSTANCE.getParameterSubscriptionValueSet_Computed();

		/**
		 * The meta object literal for the '<em><b>Manual</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SUBSCRIPTION_VALUE_SET__MANUAL = eINSTANCE.getParameterSubscriptionValueSet_Manual();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SUBSCRIPTION_VALUE_SET__REFERENCE = eINSTANCE.getParameterSubscriptionValueSet_Reference();

		/**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_VALUE = eINSTANCE.getParameterSubscriptionValueSet_ActualValue();

		/**
		 * The meta object literal for the '<em><b>Subscribed Value Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SUBSCRIPTION_VALUE_SET__SUBSCRIBED_VALUE_SET = eINSTANCE.getParameterSubscriptionValueSet_SubscribedValueSet();

		/**
		 * The meta object literal for the '<em><b>Actual State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_STATE = eINSTANCE.getParameterSubscriptionValueSet_ActualState();

		/**
		 * The meta object literal for the '<em><b>Actual Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_OPTION = eINSTANCE.getParameterSubscriptionValueSet_ActualOption();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.FileStoreImpl <em>File Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.FileStoreImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getFileStore()
		 * @generated
		 */
		EClass FILE_STORE = eINSTANCE.getFileStore();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_STORE__FOLDER = eINSTANCE.getFileStore_Folder();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_STORE__FILE = eINSTANCE.getFileStore_File();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.FolderImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CREATOR = eINSTANCE.getFolder_Creator();

		/**
		 * The meta object literal for the '<em><b>Containing Folder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CONTAINING_FOLDER = eINSTANCE.getFolder_ContainingFolder();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__PATH = eINSTANCE.getFolder_Path();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.FileImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Locked By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__LOCKED_BY = eINSTANCE.getFile_LockedBy();

		/**
		 * The meta object literal for the '<em><b>File Revision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__FILE_REVISION = eINSTANCE.getFile_FileRevision();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.FileRevisionImpl <em>File Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.FileRevisionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getFileRevision()
		 * @generated
		 */
		EClass FILE_REVISION = eINSTANCE.getFileRevision();

		/**
		 * The meta object literal for the '<em><b>Content Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REVISION__CONTENT_HASH = eINSTANCE.getFileRevision_ContentHash();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_REVISION__CREATOR = eINSTANCE.getFileRevision_Creator();

		/**
		 * The meta object literal for the '<em><b>Containing Folder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_REVISION__CONTAINING_FOLDER = eINSTANCE.getFileRevision_ContainingFolder();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_REVISION__FILE_TYPE = eINSTANCE.getFileRevision_FileType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REVISION__PATH = eINSTANCE.getFileRevision_Path();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.PublicationImpl <em>Publication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.PublicationImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getPublication()
		 * @generated
		 */
		EClass PUBLICATION = eINSTANCE.getPublication();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION__DOMAIN = eINSTANCE.getPublication_Domain();

		/**
		 * The meta object literal for the '<em><b>Published Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION__PUBLISHED_PARAMETER = eINSTANCE.getPublication_PublishedParameter();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl <em>Engineering Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getEngineeringModel()
		 * @generated
		 */
		EClass ENGINEERING_MODEL = eINSTANCE.getEngineeringModel();

		/**
		 * The meta object literal for the '<em><b>Engineering Model Setup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP = eINSTANCE.getEngineeringModel_EngineeringModelSetup();

		/**
		 * The meta object literal for the '<em><b>Common File Store</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL__COMMON_FILE_STORE = eINSTANCE.getEngineeringModel_CommonFileStore();

		/**
		 * The meta object literal for the '<em><b>Log Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL__LOG_ENTRY = eINSTANCE.getEngineeringModel_LogEntry();

		/**
		 * The meta object literal for the '<em><b>Iteration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL__ITERATION = eINSTANCE.getEngineeringModel_Iteration();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL__BOOK = eINSTANCE.getEngineeringModel_Book();

		/**
		 * The meta object literal for the '<em><b>Generic Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL__GENERIC_NOTE = eINSTANCE.getEngineeringModel_GenericNote();

		/**
		 * The meta object literal for the '<em><b>Modelling Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL__MODELLING_ANNOTATION = eINSTANCE.getEngineeringModel_ModellingAnnotation();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.CommonFileStoreImpl <em>Common File Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.CommonFileStoreImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getCommonFileStore()
		 * @generated
		 */
		EClass COMMON_FILE_STORE = eINSTANCE.getCommonFileStore();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl <em>Model Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ModelLogEntryImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getModelLogEntry()
		 * @generated
		 */
		EClass MODEL_LOG_ENTRY = eINSTANCE.getModelLogEntry();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.IterationImpl <em>Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.IterationImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getIteration()
		 * @generated
		 */
		EClass ITERATION = eINSTANCE.getIteration();

		/**
		 * The meta object literal for the '<em><b>Iteration Setup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__ITERATION_SETUP = eINSTANCE.getIteration_IterationSetup();

		/**
		 * The meta object literal for the '<em><b>Source Iteration Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATION__SOURCE_ITERATION_IID = eINSTANCE.getIteration_SourceIterationIid();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__OPTION = eINSTANCE.getIteration_Option();

		/**
		 * The meta object literal for the '<em><b>Publication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__PUBLICATION = eINSTANCE.getIteration_Publication();

		/**
		 * The meta object literal for the '<em><b>Possible Finite State List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__POSSIBLE_FINITE_STATE_LIST = eINSTANCE.getIteration_PossibleFiniteStateList();

		/**
		 * The meta object literal for the '<em><b>Top Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__TOP_ELEMENT = eINSTANCE.getIteration_TopElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__ELEMENT = eINSTANCE.getIteration_Element();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__RELATIONSHIP = eINSTANCE.getIteration_Relationship();

		/**
		 * The meta object literal for the '<em><b>External Identifier Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__EXTERNAL_IDENTIFIER_MAP = eINSTANCE.getIteration_ExternalIdentifierMap();

		/**
		 * The meta object literal for the '<em><b>Requirements Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__REQUIREMENTS_SPECIFICATION = eINSTANCE.getIteration_RequirementsSpecification();

		/**
		 * The meta object literal for the '<em><b>Domain File Store</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__DOMAIN_FILE_STORE = eINSTANCE.getIteration_DomainFileStore();

		/**
		 * The meta object literal for the '<em><b>Actual Finite State List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__ACTUAL_FINITE_STATE_LIST = eINSTANCE.getIteration_ActualFiniteStateList();

		/**
		 * The meta object literal for the '<em><b>Default Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__DEFAULT_OPTION = eINSTANCE.getIteration_DefaultOption();

		/**
		 * The meta object literal for the '<em><b>Rule Verification List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__RULE_VERIFICATION_LIST = eINSTANCE.getIteration_RuleVerificationList();

		/**
		 * The meta object literal for the '<em><b>Stakeholder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__STAKEHOLDER = eINSTANCE.getIteration_Stakeholder();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__GOAL = eINSTANCE.getIteration_Goal();

		/**
		 * The meta object literal for the '<em><b>Value Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__VALUE_GROUP = eINSTANCE.getIteration_ValueGroup();

		/**
		 * The meta object literal for the '<em><b>Stakeholder Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__STAKEHOLDER_VALUE = eINSTANCE.getIteration_StakeholderValue();

		/**
		 * The meta object literal for the '<em><b>Stakeholder Value Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__STAKEHOLDER_VALUE_MAP = eINSTANCE.getIteration_StakeholderValueMap();

		/**
		 * The meta object literal for the '<em><b>Shared Diagram Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__SHARED_DIAGRAM_STYLE = eINSTANCE.getIteration_SharedDiagramStyle();

		/**
		 * The meta object literal for the '<em><b>Diagram Canvas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__DIAGRAM_CANVAS = eINSTANCE.getIteration_DiagramCanvas();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RelationshipImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__PARAMETER_VALUE = eINSTANCE.getRelationship_ParameterValue();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RelationshipParameterValueImpl <em>Relationship Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RelationshipParameterValueImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRelationshipParameterValue()
		 * @generated
		 */
		EClass RELATIONSHIP_PARAMETER_VALUE = eINSTANCE.getRelationshipParameterValue();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParameterValueImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__PARAMETER_TYPE = eINSTANCE.getParameterValue_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__SCALE = eINSTANCE.getParameterValue_Scale();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__VALUE = eINSTANCE.getParameterValue_Value();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl <em>External Identifier Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getExternalIdentifierMap()
		 * @generated
		 */
		EClass EXTERNAL_IDENTIFIER_MAP = eINSTANCE.getExternalIdentifierMap();

		/**
		 * The meta object literal for the '<em><b>Correspondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE = eINSTANCE.getExternalIdentifierMap_Correspondence();

		/**
		 * The meta object literal for the '<em><b>External Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_IDENTIFIER_MAP__EXTERNAL_MODEL_NAME = eINSTANCE.getExternalIdentifierMap_ExternalModelName();

		/**
		 * The meta object literal for the '<em><b>External Tool Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_NAME = eINSTANCE.getExternalIdentifierMap_ExternalToolName();

		/**
		 * The meta object literal for the '<em><b>External Tool Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_VERSION = eINSTANCE.getExternalIdentifierMap_ExternalToolVersion();

		/**
		 * The meta object literal for the '<em><b>External Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT = eINSTANCE.getExternalIdentifierMap_ExternalFormat();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.IdCorrespondenceImpl <em>Id Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.IdCorrespondenceImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getIdCorrespondence()
		 * @generated
		 */
		EClass ID_CORRESPONDENCE = eINSTANCE.getIdCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Internal Thing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_CORRESPONDENCE__INTERNAL_THING = eINSTANCE.getIdCorrespondence_InternalThing();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_CORRESPONDENCE__EXTERNAL_ID = eINSTANCE.getIdCorrespondence_ExternalId();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RequirementsSpecificationImpl <em>Requirements Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RequirementsSpecificationImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirementsSpecification()
		 * @generated
		 */
		EClass REQUIREMENTS_SPECIFICATION = eINSTANCE.getRequirementsSpecification();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_SPECIFICATION__REQUIREMENT = eINSTANCE.getRequirementsSpecification_Requirement();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RequirementsContainerImpl <em>Requirements Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RequirementsContainerImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirementsContainer()
		 * @generated
		 */
		EClass REQUIREMENTS_CONTAINER = eINSTANCE.getRequirementsContainer();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_CONTAINER__GROUP = eINSTANCE.getRequirementsContainer_Group();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_CONTAINER__PARAMETER_VALUE = eINSTANCE.getRequirementsContainer_ParameterValue();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RequirementsGroupImpl <em>Requirements Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RequirementsGroupImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirementsGroup()
		 * @generated
		 */
		EClass REQUIREMENTS_GROUP = eINSTANCE.getRequirementsGroup();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RequirementsContainerParameterValueImpl <em>Requirements Container Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RequirementsContainerParameterValueImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirementsContainerParameterValue()
		 * @generated
		 */
		EClass REQUIREMENTS_CONTAINER_PARAMETER_VALUE = eINSTANCE.getRequirementsContainerParameterValue();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RequirementImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Parametric Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PARAMETRIC_CONSTRAINT = eINSTANCE.getRequirement_ParametricConstraint();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__GROUP = eINSTANCE.getRequirement_Group();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.SimpleParameterizableThingImpl <em>Simple Parameterizable Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.SimpleParameterizableThingImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getSimpleParameterizableThing()
		 * @generated
		 */
		EClass SIMPLE_PARAMETERIZABLE_THING = eINSTANCE.getSimpleParameterizableThing();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAMETERIZABLE_THING__PARAMETER_VALUE = eINSTANCE.getSimpleParameterizableThing_ParameterValue();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.SimpleParameterValueImpl <em>Simple Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.SimpleParameterValueImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getSimpleParameterValue()
		 * @generated
		 */
		EClass SIMPLE_PARAMETER_VALUE = eINSTANCE.getSimpleParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAMETER_VALUE__PARAMETER_TYPE = eINSTANCE.getSimpleParameterValue_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PARAMETER_VALUE__VALUE = eINSTANCE.getSimpleParameterValue_Value();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAMETER_VALUE__SCALE = eINSTANCE.getSimpleParameterValue_Scale();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ParametricConstraintImpl <em>Parametric Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ParametricConstraintImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParametricConstraint()
		 * @generated
		 */
		EClass PARAMETRIC_CONSTRAINT = eINSTANCE.getParametricConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_CONSTRAINT__EXPRESSION = eINSTANCE.getParametricConstraint_Expression();

		/**
		 * The meta object literal for the '<em><b>Top Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRIC_CONSTRAINT__TOP_EXPRESSION = eINSTANCE.getParametricConstraint_TopExpression();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.BooleanExpressionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.DomainFileStoreImpl <em>Domain File Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.DomainFileStoreImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getDomainFileStore()
		 * @generated
		 */
		EClass DOMAIN_FILE_STORE = eINSTANCE.getDomainFileStore();

		/**
		 * The meta object literal for the '<em><b>Is Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_FILE_STORE__IS_HIDDEN = eINSTANCE.getDomainFileStore_IsHidden();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RuleVerificationListImpl <em>Rule Verification List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RuleVerificationListImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRuleVerificationList()
		 * @generated
		 */
		EClass RULE_VERIFICATION_LIST = eINSTANCE.getRuleVerificationList();

		/**
		 * The meta object literal for the '<em><b>Rule Verification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_VERIFICATION_LIST__RULE_VERIFICATION = eINSTANCE.getRuleVerificationList_RuleVerification();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RuleVerificationImpl <em>Rule Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RuleVerificationImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRuleVerification()
		 * @generated
		 */
		EClass RULE_VERIFICATION = eINSTANCE.getRuleVerification();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VERIFICATION__IS_ACTIVE = eINSTANCE.getRuleVerification_IsActive();

		/**
		 * The meta object literal for the '<em><b>Violation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_VERIFICATION__VIOLATION = eINSTANCE.getRuleVerification_Violation();

		/**
		 * The meta object literal for the '<em><b>Executed On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VERIFICATION__EXECUTED_ON = eINSTANCE.getRuleVerification_ExecutedOn();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VERIFICATION__STATUS = eINSTANCE.getRuleVerification_Status();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RuleViolationImpl <em>Rule Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RuleViolationImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRuleViolation()
		 * @generated
		 */
		EClass RULE_VIOLATION = eINSTANCE.getRuleViolation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VIOLATION__DESCRIPTION = eINSTANCE.getRuleViolation_Description();

		/**
		 * The meta object literal for the '<em><b>Violating Thing</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_VIOLATION__VIOLATING_THING = eINSTANCE.getRuleViolation_ViolatingThing();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.StakeholderImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '<em><b>Stakeholder Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__STAKEHOLDER_VALUE = eINSTANCE.getStakeholder_StakeholderValue();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.StakeholderValueImpl <em>Stakeholder Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.StakeholderValueImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getStakeholderValue()
		 * @generated
		 */
		EClass STAKEHOLDER_VALUE = eINSTANCE.getStakeholderValue();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.GoalImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ValueGroupImpl <em>Value Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ValueGroupImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getValueGroup()
		 * @generated
		 */
		EClass VALUE_GROUP = eINSTANCE.getValueGroup();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl <em>Stake Holder Value Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getStakeHolderValueMap()
		 * @generated
		 */
		EClass STAKE_HOLDER_VALUE_MAP = eINSTANCE.getStakeHolderValueMap();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER_VALUE_MAP__GOAL = eINSTANCE.getStakeHolderValueMap_Goal();

		/**
		 * The meta object literal for the '<em><b>Value Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER_VALUE_MAP__VALUE_GROUP = eINSTANCE.getStakeHolderValueMap_ValueGroup();

		/**
		 * The meta object literal for the '<em><b>Stakeholder Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER_VALUE_MAP__STAKEHOLDER_VALUE = eINSTANCE.getStakeHolderValueMap_StakeholderValue();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER_VALUE_MAP__SETTINGS = eINSTANCE.getStakeHolderValueMap_Settings();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER_VALUE_MAP__REQUIREMENT = eINSTANCE.getStakeHolderValueMap_Requirement();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapSettingsImpl <em>Stake Holder Value Map Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.StakeHolderValueMapSettingsImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getStakeHolderValueMapSettings()
		 * @generated
		 */
		EClass STAKE_HOLDER_VALUE_MAP_SETTINGS = eINSTANCE.getStakeHolderValueMapSettings();

		/**
		 * The meta object literal for the '<em><b>Goal To Value Group Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP = eINSTANCE.getStakeHolderValueMapSettings_GoalToValueGroupRelationship();

		/**
		 * The meta object literal for the '<em><b>Value Group To Stakeholder Value Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP = eINSTANCE.getStakeHolderValueMapSettings_ValueGroupToStakeholderValueRelationship();

		/**
		 * The meta object literal for the '<em><b>Stakeholder Value To Requirement Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP = eINSTANCE.getStakeHolderValueMapSettings_StakeholderValueToRequirementRelationship();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.MultiRelationshipImpl <em>Multi Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.MultiRelationshipImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getMultiRelationship()
		 * @generated
		 */
		EClass MULTI_RELATIONSHIP = eINSTANCE.getMultiRelationship();

		/**
		 * The meta object literal for the '<em><b>Related Thing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_RELATIONSHIP__RELATED_THING = eINSTANCE.getMultiRelationship_RelatedThing();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.BinaryRelationshipImpl <em>Binary Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.BinaryRelationshipImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getBinaryRelationship()
		 * @generated
		 */
		EClass BINARY_RELATIONSHIP = eINSTANCE.getBinaryRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_RELATIONSHIP__SOURCE = eINSTANCE.getBinaryRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_RELATIONSHIP__TARGET = eINSTANCE.getBinaryRelationship_Target();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.OrExpressionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_EXPRESSION__TERM = eINSTANCE.getOrExpression_Term();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.NotExpressionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPRESSION__TERM = eINSTANCE.getNotExpression_Term();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.AndExpressionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXPRESSION__TERM = eINSTANCE.getAndExpression_Term();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.ExclusiveOrExpressionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getExclusiveOrExpression()
		 * @generated
		 */
		EClass EXCLUSIVE_OR_EXPRESSION = eINSTANCE.getExclusiveOrExpression();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_OR_EXPRESSION__TERM = eINSTANCE.getExclusiveOrExpression_Term();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.RelationalExpressionImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__PARAMETER_TYPE = eINSTANCE.getRelationalExpression_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Relational Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR = eINSTANCE.getRelationalExpression_RelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__VALUE = eINSTANCE.getRelationalExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__SCALE = eINSTANCE.getRelationalExpression_Scale();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.UserRuleVerificationImpl <em>User Rule Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.UserRuleVerificationImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getUserRuleVerification()
		 * @generated
		 */
		EClass USER_RULE_VERIFICATION = eINSTANCE.getUserRuleVerification();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_RULE_VERIFICATION__RULE = eINSTANCE.getUserRuleVerification_Rule();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.BuiltInRuleVerificationImpl <em>Built In Rule Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.BuiltInRuleVerificationImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getBuiltInRuleVerification()
		 * @generated
		 */
		EClass BUILT_IN_RULE_VERIFICATION = eINSTANCE.getBuiltInRuleVerification();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.impl.OwnedThingImpl <em>Owned Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.impl.OwnedThingImpl
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getOwnedThing()
		 * @generated
		 */
		EClass OWNED_THING = eINSTANCE.getOwnedThing();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNED_THING__OWNER = eINSTANCE.getOwnedThing_Owner();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.InterfaceEndKind <em>Interface End Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.InterfaceEndKind
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getInterfaceEndKind()
		 * @generated
		 */
		EEnum INTERFACE_END_KIND = eINSTANCE.getInterfaceEndKind();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.ParameterSwitchKind <em>Parameter Switch Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.ParameterSwitchKind
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getParameterSwitchKind()
		 * @generated
		 */
		EEnum PARAMETER_SWITCH_KIND = eINSTANCE.getParameterSwitchKind();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.ActualFiniteStateKind <em>Actual Finite State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.ActualFiniteStateKind
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getActualFiniteStateKind()
		 * @generated
		 */
		EEnum ACTUAL_FINITE_STATE_KIND = eINSTANCE.getActualFiniteStateKind();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.RuleVerificationStatusKind <em>Rule Verification Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.RuleVerificationStatusKind
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRuleVerificationStatusKind()
		 * @generated
		 */
		EEnum RULE_VERIFICATION_STATUS_KIND = eINSTANCE.getRuleVerificationStatusKind();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.BooleanOperatorKind <em>Boolean Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.BooleanOperatorKind
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getBooleanOperatorKind()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR_KIND = eINSTANCE.getBooleanOperatorKind();

		/**
		 * The meta object literal for the '{@link CDP4.EngineeringModelData.RelationalOperatorKind <em>Relational Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.EngineeringModelData.RelationalOperatorKind
		 * @see CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl#getRelationalOperatorKind()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR_KIND = eINSTANCE.getRelationalOperatorKind();

	}

} //EngineeringModelDataPackage
