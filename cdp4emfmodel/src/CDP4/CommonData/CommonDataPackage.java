/**
 */
package CDP4.CommonData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see CDP4.CommonData.CommonDataFactory
 * @model kind="package"
 * @generated
 */
public interface CommonDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CommonData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CDP4/CommonData.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CDP4.CommonData";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonDataPackage eINSTANCE = CDP4.CommonData.impl.CommonDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.FileContentTypeImpl <em>File Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.FileContentTypeImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getFileContentType()
	 * @generated
	 */
	int FILE_CONTENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>File Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>File Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.ThingImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getThing()
	 * @generated
	 */
	int THING = 14;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__IID = 0;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__REVISION_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__CLASS_KIND = 2;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__MODIFIED_ON = 3;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__EXCLUDED_PERSON = 4;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__EXCLUDED_DOMAIN = 5;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.DefinedThingImpl <em>Defined Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.DefinedThingImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDefinedThing()
	 * @generated
	 */
	int DEFINED_THING = 1;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__IID = THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__REVISION_NUMBER = THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__CLASS_KIND = THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__MODIFIED_ON = THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__EXCLUDED_PERSON = THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__EXCLUDED_DOMAIN = THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__NAME = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__SHORT_NAME = THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__ALIAS = THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__DEFINITION = THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hyper Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING__HYPER_LINK = THING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Defined Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING_FEATURE_COUNT = THING_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Has One Definition Per Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = THING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has One Definition Per Language1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = THING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Defined Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_THING_OPERATION_COUNT = THING_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.NamedThingImpl <em>Named Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.NamedThingImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getNamedThing()
	 * @generated
	 */
	int NAMED_THING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_THING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.ShortNamedThingImpl <em>Short Named Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.ShortNamedThingImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getShortNamedThing()
	 * @generated
	 */
	int SHORT_NAMED_THING = 3;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_NAMED_THING__SHORT_NAME = 0;

	/**
	 * The number of structural features of the '<em>Short Named Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_NAMED_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Short Named Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_NAMED_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.AliasImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getAlias()
	 * @generated
	 */
	int ALIAS = 4;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__IID = THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__REVISION_NUMBER = THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__CLASS_KIND = THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__MODIFIED_ON = THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__EXCLUDED_PERSON = THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__EXCLUDED_DOMAIN = THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__LANGUAGE_CODE = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__CONTENT = THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Synonym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__IS_SYNONYM = THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_FEATURE_COUNT = THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_OPERATION_COUNT = THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.AnnotationImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__LANGUAGE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.DefinitionImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IID = THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__REVISION_NUMBER = THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__CLASS_KIND = THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__MODIFIED_ON = THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EXCLUDED_PERSON = THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EXCLUDED_DOMAIN = THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LANGUAGE_CODE = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__CONTENT = THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__CITATION = THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NOTE = THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__EXAMPLE = THING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = THING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.CitationImpl <em>Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.CitationImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getCitation()
	 * @generated
	 */
	int CITATION = 7;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__IID = THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__REVISION_NUMBER = THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__CLASS_KIND = THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__MODIFIED_ON = THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__EXCLUDED_PERSON = THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__EXCLUDED_DOMAIN = THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__SHORT_NAME = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__SOURCE = THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__LOCATION = THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Adaptation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__IS_ADAPTATION = THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__REMARK = THING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_FEATURE_COUNT = THING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_OPERATION_COUNT = THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.DeprecatableThingImpl <em>Deprecatable Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.DeprecatableThingImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDeprecatableThing()
	 * @generated
	 */
	int DEPRECATABLE_THING = 8;

	/**
	 * The feature id for the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATABLE_THING__IS_DEPRECATED = 0;

	/**
	 * The number of structural features of the '<em>Deprecatable Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATABLE_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deprecatable Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATABLE_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.HyperLinkImpl <em>Hyper Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.HyperLinkImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getHyperLink()
	 * @generated
	 */
	int HYPER_LINK = 9;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__IID = THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__REVISION_NUMBER = THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__CLASS_KIND = THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__MODIFIED_ON = THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__EXCLUDED_PERSON = THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__EXCLUDED_DOMAIN = THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__LANGUAGE_CODE = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__CONTENT = THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK__URI = THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hyper Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK_FEATURE_COUNT = THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hyper Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LINK_OPERATION_COUNT = THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.TimeStampedThingImpl <em>Time Stamped Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.TimeStampedThingImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getTimeStampedThing()
	 * @generated
	 */
	int TIME_STAMPED_THING = 10;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMPED_THING__CREATED_ON = 0;

	/**
	 * The number of structural features of the '<em>Time Stamped Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMPED_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Stamped Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMPED_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.TopContainerImpl <em>Top Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.TopContainerImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getTopContainer()
	 * @generated
	 */
	int TOP_CONTAINER = 11;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER__IID = THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER__REVISION_NUMBER = THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER__CLASS_KIND = THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER__MODIFIED_ON = THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER__EXCLUDED_PERSON = THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER__EXCLUDED_DOMAIN = THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Last Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER__LAST_MODIFIED_ON = THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Top Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER_FEATURE_COUNT = THING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Top Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CONTAINER_OPERATION_COUNT = THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.LogEntryImpl <em>Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.LogEntryImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getLogEntry()
	 * @generated
	 */
	int LOG_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Affected Item Iid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__AFFECTED_ITEM_IID = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.impl.VolatileThingImpl <em>Volatile Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.impl.VolatileThingImpl
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getVolatileThing()
	 * @generated
	 */
	int VOLATILE_THING = 13;

	/**
	 * The feature id for the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE_THING__IS_VOLATILE = 0;

	/**
	 * The number of structural features of the '<em>Volatile Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Volatile Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLATILE_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.PersonAccessRightKind <em>Person Access Right Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.PersonAccessRightKind
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getPersonAccessRightKind()
	 * @generated
	 */
	int PERSON_ACCESS_RIGHT_KIND = 15;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.LogLevelKind <em>Log Level Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.LogLevelKind
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getLogLevelKind()
	 * @generated
	 */
	int LOG_LEVEL_KIND = 16;

	/**
	 * The meta object id for the '{@link CDP4.CommonData.ParticipantAccessRightKind <em>Participant Access Right Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.CommonData.ParticipantAccessRightKind
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getParticipantAccessRightKind()
	 * @generated
	 */
	int PARTICIPANT_ACCESS_RIGHT_KIND = 17;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.OffsetDateTime
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 18;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getString()
	 * @generated
	 */
	int STRING = 19;

	/**
	 * The meta object id for the '<em>Uri</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getUri()
	 * @generated
	 */
	int URI = 20;

	/**
	 * The meta object id for the '<em>Language Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getLanguageCode()
	 * @generated
	 */
	int LANGUAGE_CODE = 21;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 22;

	/**
	 * The meta object id for the '<em>Class Kind</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getClassKind()
	 * @generated
	 */
	int CLASS_KIND = 23;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 24;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 25;

	/**
	 * The meta object id for the '<em>Time Of Day</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getTimeOfDay()
	 * @generated
	 */
	int TIME_OF_DAY = 26;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.OffsetDateTime
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 27;

	/**
	 * The meta object id for the '<em>Uuid</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getUuid()
	 * @generated
	 */
	int UUID = 28;

	/**
	 * The meta object id for the '<em>Parameter Formula Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getParameterFormulaType()
	 * @generated
	 */
	int PARAMETER_FORMULA_TYPE = 29;

	/**
	 * The meta object id for the '<em>Parameter Value Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getParameterValueType()
	 * @generated
	 */
	int PARAMETER_VALUE_TYPE = 30;

	/**
	 * The meta object id for the '<em>Sha1 Hash Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getSha1HashType()
	 * @generated
	 */
	int SHA1_HASH_TYPE = 31;

	/**
	 * The meta object id for the '<em>Long Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getLongInteger()
	 * @generated
	 */
	int LONG_INTEGER = 32;


	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.FileContentType <em>File Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Content Type</em>'.
	 * @see CDP4.CommonData.FileContentType
	 * @generated
	 */
	EClass getFileContentType();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.DefinedThing <em>Defined Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined Thing</em>'.
	 * @see CDP4.CommonData.DefinedThing
	 * @generated
	 */
	EClass getDefinedThing();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.CommonData.DefinedThing#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias</em>'.
	 * @see CDP4.CommonData.DefinedThing#getAlias()
	 * @see #getDefinedThing()
	 * @generated
	 */
	EReference getDefinedThing_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.CommonData.DefinedThing#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition</em>'.
	 * @see CDP4.CommonData.DefinedThing#getDefinition()
	 * @see #getDefinedThing()
	 * @generated
	 */
	EReference getDefinedThing_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.CommonData.DefinedThing#getHyperLink <em>Hyper Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hyper Link</em>'.
	 * @see CDP4.CommonData.DefinedThing#getHyperLink()
	 * @see #getDefinedThing()
	 * @generated
	 */
	EReference getDefinedThing_HyperLink();

	/**
	 * Returns the meta object for the '{@link CDP4.CommonData.DefinedThing#hasOneDefinitionPerLanguage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has One Definition Per Language</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has One Definition Per Language</em>' operation.
	 * @see CDP4.CommonData.DefinedThing#hasOneDefinitionPerLanguage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDefinedThing__HasOneDefinitionPerLanguage__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link CDP4.CommonData.DefinedThing#hasOneDefinitionPerLanguage1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has One Definition Per Language1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has One Definition Per Language1</em>' operation.
	 * @see CDP4.CommonData.DefinedThing#hasOneDefinitionPerLanguage1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDefinedThing__HasOneDefinitionPerLanguage1__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.NamedThing <em>Named Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Thing</em>'.
	 * @see CDP4.CommonData.NamedThing
	 * @generated
	 */
	EClass getNamedThing();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.NamedThing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CDP4.CommonData.NamedThing#getName()
	 * @see #getNamedThing()
	 * @generated
	 */
	EAttribute getNamedThing_Name();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.ShortNamedThing <em>Short Named Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Named Thing</em>'.
	 * @see CDP4.CommonData.ShortNamedThing
	 * @generated
	 */
	EClass getShortNamedThing();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.ShortNamedThing#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see CDP4.CommonData.ShortNamedThing#getShortName()
	 * @see #getShortNamedThing()
	 * @generated
	 */
	EAttribute getShortNamedThing_ShortName();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see CDP4.CommonData.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Alias#getIsSynonym <em>Is Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synonym</em>'.
	 * @see CDP4.CommonData.Alias#getIsSynonym()
	 * @see #getAlias()
	 * @generated
	 */
	EAttribute getAlias_IsSynonym();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see CDP4.CommonData.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Annotation#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see CDP4.CommonData.Annotation#getLanguageCode()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_LanguageCode();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Annotation#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see CDP4.CommonData.Annotation#getContent()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Content();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see CDP4.CommonData.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.CommonData.Definition#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Citation</em>'.
	 * @see CDP4.CommonData.Definition#getCitation()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Citation();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.CommonData.Definition#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Note</em>'.
	 * @see CDP4.CommonData.Definition#getNote()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Note();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.CommonData.Definition#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Example</em>'.
	 * @see CDP4.CommonData.Definition#getExample()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Example();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation</em>'.
	 * @see CDP4.CommonData.Citation
	 * @generated
	 */
	EClass getCitation();

	/**
	 * Returns the meta object for the reference '{@link CDP4.CommonData.Citation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CDP4.CommonData.Citation#getSource()
	 * @see #getCitation()
	 * @generated
	 */
	EReference getCitation_Source();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Citation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see CDP4.CommonData.Citation#getLocation()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Location();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Citation#getIsAdaptation <em>Is Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Adaptation</em>'.
	 * @see CDP4.CommonData.Citation#getIsAdaptation()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_IsAdaptation();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Citation#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see CDP4.CommonData.Citation#getRemark()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Remark();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.DeprecatableThing <em>Deprecatable Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecatable Thing</em>'.
	 * @see CDP4.CommonData.DeprecatableThing
	 * @generated
	 */
	EClass getDeprecatableThing();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.DeprecatableThing#getIsDeprecated <em>Is Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deprecated</em>'.
	 * @see CDP4.CommonData.DeprecatableThing#getIsDeprecated()
	 * @see #getDeprecatableThing()
	 * @generated
	 */
	EAttribute getDeprecatableThing_IsDeprecated();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.HyperLink <em>Hyper Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Link</em>'.
	 * @see CDP4.CommonData.HyperLink
	 * @generated
	 */
	EClass getHyperLink();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.HyperLink#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see CDP4.CommonData.HyperLink#getUri()
	 * @see #getHyperLink()
	 * @generated
	 */
	EAttribute getHyperLink_Uri();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.TimeStampedThing <em>Time Stamped Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamped Thing</em>'.
	 * @see CDP4.CommonData.TimeStampedThing
	 * @generated
	 */
	EClass getTimeStampedThing();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.TimeStampedThing#getCreatedOn <em>Created On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created On</em>'.
	 * @see CDP4.CommonData.TimeStampedThing#getCreatedOn()
	 * @see #getTimeStampedThing()
	 * @generated
	 */
	EAttribute getTimeStampedThing_CreatedOn();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.TopContainer <em>Top Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Container</em>'.
	 * @see CDP4.CommonData.TopContainer
	 * @generated
	 */
	EClass getTopContainer();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.TopContainer#getLastModifiedOn <em>Last Modified On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified On</em>'.
	 * @see CDP4.CommonData.TopContainer#getLastModifiedOn()
	 * @see #getTopContainer()
	 * @generated
	 */
	EAttribute getTopContainer_LastModifiedOn();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.LogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Entry</em>'.
	 * @see CDP4.CommonData.LogEntry
	 * @generated
	 */
	EClass getLogEntry();

	/**
	 * Returns the meta object for the reference '{@link CDP4.CommonData.LogEntry#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see CDP4.CommonData.LogEntry#getAuthor()
	 * @see #getLogEntry()
	 * @generated
	 */
	EReference getLogEntry_Author();

	/**
	 * Returns the meta object for the attribute list '{@link CDP4.CommonData.LogEntry#getAffectedItemIid <em>Affected Item Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Affected Item Iid</em>'.
	 * @see CDP4.CommonData.LogEntry#getAffectedItemIid()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_AffectedItemIid();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.LogEntry#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see CDP4.CommonData.LogEntry#getLevel()
	 * @see #getLogEntry()
	 * @generated
	 */
	EAttribute getLogEntry_Level();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.VolatileThing <em>Volatile Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volatile Thing</em>'.
	 * @see CDP4.CommonData.VolatileThing
	 * @generated
	 */
	EClass getVolatileThing();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.VolatileThing#getIsVolatile <em>Is Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Volatile</em>'.
	 * @see CDP4.CommonData.VolatileThing#getIsVolatile()
	 * @see #getVolatileThing()
	 * @generated
	 */
	EAttribute getVolatileThing_IsVolatile();

	/**
	 * Returns the meta object for class '{@link CDP4.CommonData.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see CDP4.CommonData.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Thing#getIid <em>Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iid</em>'.
	 * @see CDP4.CommonData.Thing#getIid()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Iid();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Thing#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see CDP4.CommonData.Thing#getRevisionNumber()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Thing#getClassKind <em>Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Kind</em>'.
	 * @see CDP4.CommonData.Thing#getClassKind()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_ClassKind();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.CommonData.Thing#getModifiedOn <em>Modified On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified On</em>'.
	 * @see CDP4.CommonData.Thing#getModifiedOn()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_ModifiedOn();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.CommonData.Thing#getExcludedPerson <em>Excluded Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Person</em>'.
	 * @see CDP4.CommonData.Thing#getExcludedPerson()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_ExcludedPerson();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.CommonData.Thing#getExcludedDomain <em>Excluded Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Domain</em>'.
	 * @see CDP4.CommonData.Thing#getExcludedDomain()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_ExcludedDomain();

	/**
	 * Returns the meta object for enum '{@link CDP4.CommonData.PersonAccessRightKind <em>Person Access Right Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Person Access Right Kind</em>'.
	 * @see CDP4.CommonData.PersonAccessRightKind
	 * @generated
	 */
	EEnum getPersonAccessRightKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.CommonData.LogLevelKind <em>Log Level Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Level Kind</em>'.
	 * @see CDP4.CommonData.LogLevelKind
	 * @generated
	 */
	EEnum getLogLevelKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.CommonData.ParticipantAccessRightKind <em>Participant Access Right Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participant Access Right Kind</em>'.
	 * @see CDP4.CommonData.ParticipantAccessRightKind
	 * @generated
	 */
	EEnum getParticipantAccessRightKind();

	/**
	 * Returns the meta object for data type '{@link java.time.OffsetDateTime <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     * 
     *   <body>
     *     <p>
     *       character string datatype that represents a calendar date in ISO 8601 
     *       format
     *     </p>
     * 
     *     <p>
     *       Note: The valid syntax is specified in XML&#160;Schema W3C&#160;Recommendation for 
     *       the date datatype, see <a href="http://www.w3.org/TR/xmlschema-2/#date">http://www.w3.org/TR/xmlschema-2/#date</a>.
     *     </p>
     * 
     *     <p>
     *       Example: &quot;2008-09-27Z&quot; represents 27th of September 2008 UTC.
     *     </p>
     * 
     *   </body>
     * 
     * </html>
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.time.OffsetDateTime
	 * @model instanceClass="java.time.OffsetDateTime"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     *   <body>
     *     <p>
     * general character string datatype
     *     </p>
     * 
     *     <p>
     * Note:&#160;The string may contain Unicode characters. The encoding is implementation dependent, but by default should be UTF-8, see <a href="http://datatracker.ietf.org/doc/rfc3629/">IETF RFC 3629</a>.
     * 
     *     </p>
     * 
     *   </body>
     * </html>
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     * 
     *   <body>
     *     <p>
     *       character string datatype that represents a Uniform Resource Identifier 
     *       (URI) and conforms to its syntax as specified in <a href="http://datatracker.ietf.org/doc/rfc3986/">IETF 
     *       RFC 3986</a>
     *     </p>
     * 
     *   </body>
     * 
     * </html>
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Uri</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getUri();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     *   <body>
     *     <p>
     * language code as specified in ISO 639-1 &quot;Part 1: Alpha-2 code&quot; or ISO&#160;639-2 &quot;Part 2: Alpha-3 code&quot;
     *     </p>
     * 
     *     <p>
     * Note 1:&#160;See <a href="http://en.wikipedia.org/wiki/ISO_639">http://en.wikipedia.org/wiki/ISO_639</a> , <a href="http://www.infoterm.info/standardization/iso_639_1_2002.php">http://www.infoterm.info/standardization/iso_639_1_2002.php</a> and <a href="http://www.loc.gov/standards/iso639-2/">http://www.loc.gov/standards/iso639-2/</a>.
     *     </p>
     * 
     *     <p>
     * Note 2:&#160;Best current practices can be found in <a href="http://datatracker.ietf.org/doc/rfc5646/">IETF RFC 5646</a>. The associated registry of language codes is at <a href="http://www.iana.org/assignments/language-subtag-registry/">http://www.iana.org/assignments/language-subtag-registry/</a>.
     *     </p>
     * 
     *     <p>
     * Note 3:&#160;LanguageCode also corresponds one-to-one to the&#160;<i>language</i> datatype in XML&#160;Schema, see <a href="http://www.w3.org/TR/xmlschema-2/#language">http://www.w3.org/TR/xmlschema-2/#language</a> and <a href="http://www.w3.org/International/articles/language-tags/Overview.en.php">http://www.w3.org/International/articles/language-tags/Overview.en.php</a>.
     *     </p>
     * 
     *     <p>
     * Examples:&#160;&#160;&quot;en&quot; for English, &quot;en-GB&quot; for British&#160;English, &quot;en-US&quot; for US&#160;English, &quot;fr&quot; for French, &quot;de&quot; for German, etc.
     * 
     *     </p>
     * 
     *   </body>
     * </html>
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Language Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getLanguageCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     * 
     *   <body>
     *     datatype that represents the mathematical concept of binary-valued logic 
     *     and has two valid values: true and false
     *   </body>
     * 
     * </html>
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     * 
     *   <body>
     *     <p>
     *       enumeration datatype that denotes the possible classes in the current       data       model
     *     </p>
     * 
     *     <p>
     *       Note 1: Values are used to represent classes in instance directories and       in       the       definition       of       validation       rules.
     *     </p>
     * 
     *     <p>
     *       Note 2: The implementation in a programming language needs to provide a       reflection       capability       that       allows       runtime       evaluation       of       an       instance's       class       against       the       enumeration       literal       that       represents       the       class       name.
     * 
     *     </p>
     * 
     *   </body>
     * 
     * </html>
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Class Kind</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getClassKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     *   <body>
     *     <p>
     * datatype that represents an integer number in the closed interval -2147483648 (=-2<sup>31</sup>) to 2147483647 (=2<sup>31</sup>-1)
     *     </p>
     * 
     *     <p>
     * Note:&#160;The Integer datatype can be represented by a signed two's complement 32-bit integer in most programming languages and maps one-to-one to the XML&#160;Schema <i>int</i> datatype, see <a href="http://www.w3.org/TR/xmlschema-2/#int">http://www.w3.org/TR/xmlschema-2/#int</a>.
     * 
     *     </p>
     * 
     *   </body>
     * </html>
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     *   <body>
     *     <p>
     * datatype that represents an integer number in the closed interval -2147483648 (=-2<sup>31</sup>) to 2147483647 (=2<sup>31</sup>-1)
     *     </p>
     * 
     *     <p>
     * Note:&#160;The Integer datatype can be represented by a signed two's complement 32-bit integer in most programming languages and maps one-to-one to the XML&#160;Schema <i>int</i> datatype, see <a href="http://www.w3.org/TR/xmlschema-2/#int">http://www.w3.org/TR/xmlschema-2/#int</a>.
     * 
     *     </p>
     * 
     *   </body>
     * </html>
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     * 
     *   <body>
     *     <p>
     *       character string datatype that represents a time of day in ISO 8601 
     *       format
     *     </p>
     * 
     *     <p>
     *       Note:&#160;The valid syntax is specified in XML&#160;Schema W3C&#160;Recommendation for 
     *       the <i>time</i> datatype, see <a href="http://www.w3.org/TR/xmlschema-2/#time">http://www.w3.org/TR/xmlschema-2/#time</a>.
     *     </p>
     * 
     *     <p>
     *       Example 1: &quot;10:15:49&quot; represents 10 hours 15 minutes and 49 seconds.
     *     </p>
     * 
     *     <p>
     *       Example 2: &quot;17:49:30.453Z&quot; represents 17 hours 49 minutes and 30.453 
     *       seconds UTC.
     *     </p>
     * 
     *   </body>
     * 
     * </html>
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Time Of Day</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getTimeOfDay();

	/**
	 * Returns the meta object for data type '{@link java.time.OffsetDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     * 
     *   <body>
     *     <p>
     *       character string datatype that represents a calendar date and time in 
     *       ISO 8601 format
     *     </p>
     * 
     *     <p>
     *       Note:&#160;The permissible syntax is specified in XML&#160;Schema 
     *       W3C&#160;Recommendation for the <i>dateTime</i> datatype, see <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">http://www.w3.org/TR/xmlschema-2/#dateTime</a>.
     *     </p>
     * 
     *     <p>
     *       Example 1: &quot;2010-01-02T07:59:00Z&quot; represents 2nd of January 2010 at 7 
     *       hours 59 minutes and 0 seconds UTC.
     *     </p>
     * 
     *     <p>
     *       Example 2: &quot;2009-10-23T16:04:23.332+02&quot; represents 23rd of October 2009 
     *       at 16 hours 4 minutes and 23.332 seconds in a timezone 2 hours ahead of 
     *       UTC.
     *     </p>
     * 
     *   </body>
     * 
     * </html>
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see java.time.OffsetDateTime
	 * @model instanceClass="java.time.OffsetDateTime"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     * 
     *   <body>
     *     <p>
     *       datatype that represents a Universally Unique Identifier (UUID) that       conforms       to       <a href="http://datatracker.ietf.org/doc/rfc4122/">IETF       RFC       4122</a>
     *     </p>
     * 
     *     <p>
     *       Note 1:&#160;E-TM-10-25 compliant implementations must use the RFC&#160;4122       version       4       algorithm       to       generate       UUIDs.
     *     </p>
     * 
     *     <p>
     *       Note 2:&#160;See also <a href="http://en.wikipedia.org/wiki/Universally_unique_identifier">http://en.wikipedia.org/wiki/Universally_unique_identifier</a>       for       a       practical       introduction       on       UUIDs.
     * 
     *     </p>
     * 
     *   </body>
     * 
     * </html>
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Uuid</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getUuid();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Parameter Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     *   <body>
     *     <p>
     * character string datatype that represents a parameter formula
     *     </p>
     * 
     *     <p>
     * Note:&#160;The valid syntax depends on the concrete ParameterType.
     * 
     *     </p>
     * 
     *   </body>
     * </html>
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Parameter Formula Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getParameterFormulaType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     *   <body>
     *     <p>
     * character string datatype that represents a parameter value
     *     </p>
     * 
     *     <p>
     * Note 1:&#160;The valid syntax depends on the concrete ScalarParameterType.
     *     </p>
     * 
     *     <p>
     * Note 2:&#160;Syntax constraints should be expressed in OCL in the definition of classes that have a property of this datatype.
     * 
     *     </p>
     * 
     *   </body>
     * </html>
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Parameter Value Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getParameterValueType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Sha1 Hash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     *   <body>
     *     <p>
     * hexadecimal string representation of a SHA-1 hash code
     *     </p>
     * 
     *     <p>
     * Note:&#160;For a description of the SHA-1 hash code see <a href="http://en.wikipedia.org/wiki/SHA-1">http://en.wikipedia.org/wiki/SHA-1</a>. The SHA-1 hash is a 160-bit number and its hexadecimal representation has 40 hexadecimal digits.
     * 
     *     </p>
     * 
     *   </body>
     * </html>
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Sha1 Hash Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getSha1HashType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Long Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <html>
     *   <head>
     * 		<style>
     * 			p {padding:0px; margin:0px;}
     * 		</style>
     * 	</head>
     *   <body>
     *     <p>
     * datatype that represents an integer number in the closed interval -9223372036854775808 (=-2<sup>63</sup>) to 9223372036854775807 (=2<sup>63</sup>-1)
     *     </p>
     * 
     *     <p>
     * Note:&#160;The LongInteger datatype can be represented by a signed two's complement 64-bit integer in most programming languages and maps one-to-one to the XML&#160;Schema <i>long</i> datatype, see <a href="http://www.w3.org/TR/xmlschema-2/#long">http://www.w3.org/TR/xmlschema-2/#long</a>.
     * 
     *     </p>
     * 
     *   </body>
     * </html>
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Long Integer</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getLongInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonDataFactory getCommonDataFactory();

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
		 * The meta object literal for the '{@link CDP4.CommonData.impl.FileContentTypeImpl <em>File Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.FileContentTypeImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getFileContentType()
		 * @generated
		 */
		EClass FILE_CONTENT_TYPE = eINSTANCE.getFileContentType();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.DefinedThingImpl <em>Defined Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.DefinedThingImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDefinedThing()
		 * @generated
		 */
		EClass DEFINED_THING = eINSTANCE.getDefinedThing();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_THING__ALIAS = eINSTANCE.getDefinedThing_Alias();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_THING__DEFINITION = eINSTANCE.getDefinedThing_Definition();

		/**
		 * The meta object literal for the '<em><b>Hyper Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_THING__HYPER_LINK = eINSTANCE.getDefinedThing_HyperLink();

		/**
		 * The meta object literal for the '<em><b>Has One Definition Per Language</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDefinedThing__HasOneDefinitionPerLanguage__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has One Definition Per Language1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDefinedThing__HasOneDefinitionPerLanguage1__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.NamedThingImpl <em>Named Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.NamedThingImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getNamedThing()
		 * @generated
		 */
		EClass NAMED_THING = eINSTANCE.getNamedThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_THING__NAME = eINSTANCE.getNamedThing_Name();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.ShortNamedThingImpl <em>Short Named Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.ShortNamedThingImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getShortNamedThing()
		 * @generated
		 */
		EClass SHORT_NAMED_THING = eINSTANCE.getShortNamedThing();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_NAMED_THING__SHORT_NAME = eINSTANCE.getShortNamedThing_ShortName();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.AliasImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getAlias()
		 * @generated
		 */
		EClass ALIAS = eINSTANCE.getAlias();

		/**
		 * The meta object literal for the '<em><b>Is Synonym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__IS_SYNONYM = eINSTANCE.getAlias_IsSynonym();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.AnnotationImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Language Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__LANGUAGE_CODE = eINSTANCE.getAnnotation_LanguageCode();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__CONTENT = eINSTANCE.getAnnotation_Content();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.DefinitionImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__CITATION = eINSTANCE.getDefinition_Citation();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__NOTE = eINSTANCE.getDefinition_Note();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__EXAMPLE = eINSTANCE.getDefinition_Example();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.CitationImpl <em>Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.CitationImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getCitation()
		 * @generated
		 */
		EClass CITATION = eINSTANCE.getCitation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITATION__SOURCE = eINSTANCE.getCitation_Source();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION__LOCATION = eINSTANCE.getCitation_Location();

		/**
		 * The meta object literal for the '<em><b>Is Adaptation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION__IS_ADAPTATION = eINSTANCE.getCitation_IsAdaptation();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION__REMARK = eINSTANCE.getCitation_Remark();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.DeprecatableThingImpl <em>Deprecatable Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.DeprecatableThingImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDeprecatableThing()
		 * @generated
		 */
		EClass DEPRECATABLE_THING = eINSTANCE.getDeprecatableThing();

		/**
		 * The meta object literal for the '<em><b>Is Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPRECATABLE_THING__IS_DEPRECATED = eINSTANCE.getDeprecatableThing_IsDeprecated();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.HyperLinkImpl <em>Hyper Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.HyperLinkImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getHyperLink()
		 * @generated
		 */
		EClass HYPER_LINK = eINSTANCE.getHyperLink();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPER_LINK__URI = eINSTANCE.getHyperLink_Uri();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.TimeStampedThingImpl <em>Time Stamped Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.TimeStampedThingImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getTimeStampedThing()
		 * @generated
		 */
		EClass TIME_STAMPED_THING = eINSTANCE.getTimeStampedThing();

		/**
		 * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STAMPED_THING__CREATED_ON = eINSTANCE.getTimeStampedThing_CreatedOn();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.TopContainerImpl <em>Top Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.TopContainerImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getTopContainer()
		 * @generated
		 */
		EClass TOP_CONTAINER = eINSTANCE.getTopContainer();

		/**
		 * The meta object literal for the '<em><b>Last Modified On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CONTAINER__LAST_MODIFIED_ON = eINSTANCE.getTopContainer_LastModifiedOn();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.LogEntryImpl <em>Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.LogEntryImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getLogEntry()
		 * @generated
		 */
		EClass LOG_ENTRY = eINSTANCE.getLogEntry();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ENTRY__AUTHOR = eINSTANCE.getLogEntry_Author();

		/**
		 * The meta object literal for the '<em><b>Affected Item Iid</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__AFFECTED_ITEM_IID = eINSTANCE.getLogEntry_AffectedItemIid();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_ENTRY__LEVEL = eINSTANCE.getLogEntry_Level();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.VolatileThingImpl <em>Volatile Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.VolatileThingImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getVolatileThing()
		 * @generated
		 */
		EClass VOLATILE_THING = eINSTANCE.getVolatileThing();

		/**
		 * The meta object literal for the '<em><b>Is Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLATILE_THING__IS_VOLATILE = eINSTANCE.getVolatileThing_IsVolatile();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.impl.ThingImpl
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__IID = eINSTANCE.getThing_Iid();

		/**
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__REVISION_NUMBER = eINSTANCE.getThing_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Class Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__CLASS_KIND = eINSTANCE.getThing_ClassKind();

		/**
		 * The meta object literal for the '<em><b>Modified On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__MODIFIED_ON = eINSTANCE.getThing_ModifiedOn();

		/**
		 * The meta object literal for the '<em><b>Excluded Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__EXCLUDED_PERSON = eINSTANCE.getThing_ExcludedPerson();

		/**
		 * The meta object literal for the '<em><b>Excluded Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__EXCLUDED_DOMAIN = eINSTANCE.getThing_ExcludedDomain();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.PersonAccessRightKind <em>Person Access Right Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.PersonAccessRightKind
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getPersonAccessRightKind()
		 * @generated
		 */
		EEnum PERSON_ACCESS_RIGHT_KIND = eINSTANCE.getPersonAccessRightKind();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.LogLevelKind <em>Log Level Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.LogLevelKind
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getLogLevelKind()
		 * @generated
		 */
		EEnum LOG_LEVEL_KIND = eINSTANCE.getLogLevelKind();

		/**
		 * The meta object literal for the '{@link CDP4.CommonData.ParticipantAccessRightKind <em>Participant Access Right Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.CommonData.ParticipantAccessRightKind
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getParticipantAccessRightKind()
		 * @generated
		 */
		EEnum PARTICIPANT_ACCESS_RIGHT_KIND = eINSTANCE.getParticipantAccessRightKind();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.OffsetDateTime
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Uri</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getUri()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getUri();

		/**
		 * The meta object literal for the '<em>Language Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getLanguageCode()
		 * @generated
		 */
		EDataType LANGUAGE_CODE = eINSTANCE.getLanguageCode();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Class Kind</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getClassKind()
		 * @generated
		 */
		EDataType CLASS_KIND = eINSTANCE.getClassKind();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Time Of Day</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getTimeOfDay()
		 * @generated
		 */
		EDataType TIME_OF_DAY = eINSTANCE.getTimeOfDay();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.OffsetDateTime
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>Uuid</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getUuid()
		 * @generated
		 */
		EDataType UUID = eINSTANCE.getUuid();

		/**
		 * The meta object literal for the '<em>Parameter Formula Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getParameterFormulaType()
		 * @generated
		 */
		EDataType PARAMETER_FORMULA_TYPE = eINSTANCE.getParameterFormulaType();

		/**
		 * The meta object literal for the '<em>Parameter Value Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getParameterValueType()
		 * @generated
		 */
		EDataType PARAMETER_VALUE_TYPE = eINSTANCE.getParameterValueType();

		/**
		 * The meta object literal for the '<em>Sha1 Hash Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getSha1HashType()
		 * @generated
		 */
		EDataType SHA1_HASH_TYPE = eINSTANCE.getSha1HashType();

		/**
		 * The meta object literal for the '<em>Long Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see CDP4.CommonData.impl.CommonDataPackageImpl#getLongInteger()
		 * @generated
		 */
		EDataType LONG_INTEGER = eINSTANCE.getLongInteger();

	}

} //CommonDataPackage
