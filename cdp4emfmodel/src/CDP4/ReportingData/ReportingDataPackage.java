/**
 */
package CDP4.ReportingData;

import CDP4.CommonData.CommonDataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see CDP4.ReportingData.ReportingDataFactory
 * @model kind="package"
 * @generated
 */
public interface ReportingDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ReportingData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CDP4/ReportingData.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CDP4.ReportingData";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportingDataPackage eINSTANCE = CDP4.ReportingData.impl.ReportingDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.BookImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__CATEGORY = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__NAME = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__SECTION = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.GenericAnnotationImpl <em>Generic Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.GenericAnnotationImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getGenericAnnotation()
	 * @generated
	 */
	int GENERIC_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__LANGUAGE_CODE = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__CONTENT = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generic Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generic Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ANNOTATION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.EngineeringModelDataAnnotationImpl <em>Engineering Model Data Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.EngineeringModelDataAnnotationImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getEngineeringModelDataAnnotation()
	 * @generated
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__IID = GENERIC_ANNOTATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__REVISION_NUMBER = GENERIC_ANNOTATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__CLASS_KIND = GENERIC_ANNOTATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__MODIFIED_ON = GENERIC_ANNOTATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__EXCLUDED_PERSON = GENERIC_ANNOTATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__EXCLUDED_DOMAIN = GENERIC_ANNOTATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__LANGUAGE_CODE = GENERIC_ANNOTATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__CONTENT = GENERIC_ANNOTATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__CREATED_ON = GENERIC_ANNOTATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING = GENERIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR = GENERIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING = GENERIC_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION = GENERIC_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Engineering Model Data Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT = GENERIC_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Engineering Model Data Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_ANNOTATION_OPERATION_COUNT = GENERIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.EngineeringModelDataNoteImpl <em>Engineering Model Data Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.EngineeringModelDataNoteImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getEngineeringModelDataNote()
	 * @generated
	 */
	int ENGINEERING_MODEL_DATA_NOTE = 1;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__IID = ENGINEERING_MODEL_DATA_ANNOTATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__REVISION_NUMBER = ENGINEERING_MODEL_DATA_ANNOTATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__CLASS_KIND = ENGINEERING_MODEL_DATA_ANNOTATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__MODIFIED_ON = ENGINEERING_MODEL_DATA_ANNOTATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__EXCLUDED_PERSON = ENGINEERING_MODEL_DATA_ANNOTATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__EXCLUDED_DOMAIN = ENGINEERING_MODEL_DATA_ANNOTATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__LANGUAGE_CODE = ENGINEERING_MODEL_DATA_ANNOTATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__CONTENT = ENGINEERING_MODEL_DATA_ANNOTATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__CREATED_ON = ENGINEERING_MODEL_DATA_ANNOTATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__RELATED_THING = ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__AUTHOR = ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__PRIMARY_ANNOTATED_THING = ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE__DISCUSSION = ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION;

	/**
	 * The number of structural features of the '<em>Engineering Model Data Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE_FEATURE_COUNT = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Engineering Model Data Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_NOTE_OPERATION_COUNT = ENGINEERING_MODEL_DATA_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ThingReferenceImpl <em>Thing Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ThingReferenceImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getThingReference()
	 * @generated
	 */
	int THING_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Referenced Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE__REFERENCED_REVISION_NUMBER = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE__REFERENCED_THING = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Thing Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Thing Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_REFERENCE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ModellingThingReferenceImpl <em>Modelling Thing Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ModellingThingReferenceImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getModellingThingReference()
	 * @generated
	 */
	int MODELLING_THING_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE__IID = THING_REFERENCE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE__REVISION_NUMBER = THING_REFERENCE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE__CLASS_KIND = THING_REFERENCE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE__MODIFIED_ON = THING_REFERENCE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE__EXCLUDED_PERSON = THING_REFERENCE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE__EXCLUDED_DOMAIN = THING_REFERENCE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Referenced Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE__REFERENCED_REVISION_NUMBER = THING_REFERENCE__REFERENCED_REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Referenced Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE__REFERENCED_THING = THING_REFERENCE__REFERENCED_THING;

	/**
	 * The number of structural features of the '<em>Modelling Thing Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE_FEATURE_COUNT = THING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modelling Thing Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_THING_REFERENCE_OPERATION_COUNT = THING_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.DiscussionItemImpl <em>Discussion Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.DiscussionItemImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getDiscussionItem()
	 * @generated
	 */
	int DISCUSSION_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__IID = GENERIC_ANNOTATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__REVISION_NUMBER = GENERIC_ANNOTATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__CLASS_KIND = GENERIC_ANNOTATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__MODIFIED_ON = GENERIC_ANNOTATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__EXCLUDED_PERSON = GENERIC_ANNOTATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__EXCLUDED_DOMAIN = GENERIC_ANNOTATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__LANGUAGE_CODE = GENERIC_ANNOTATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__CONTENT = GENERIC_ANNOTATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__CREATED_ON = GENERIC_ANNOTATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM__REPLY_TO = GENERIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discussion Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM_FEATURE_COUNT = GENERIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discussion Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_ITEM_OPERATION_COUNT = GENERIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.EngineeringModelDataDiscussionItemImpl <em>Engineering Model Data Discussion Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.EngineeringModelDataDiscussionItemImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getEngineeringModelDataDiscussionItem()
	 * @generated
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__IID = DISCUSSION_ITEM__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__REVISION_NUMBER = DISCUSSION_ITEM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__CLASS_KIND = DISCUSSION_ITEM__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__MODIFIED_ON = DISCUSSION_ITEM__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__EXCLUDED_PERSON = DISCUSSION_ITEM__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__EXCLUDED_DOMAIN = DISCUSSION_ITEM__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__LANGUAGE_CODE = DISCUSSION_ITEM__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__CONTENT = DISCUSSION_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__CREATED_ON = DISCUSSION_ITEM__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__REPLY_TO = DISCUSSION_ITEM__REPLY_TO;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__AUTHOR = DISCUSSION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Engineering Model Data Discussion Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM_FEATURE_COUNT = DISCUSSION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Engineering Model Data Discussion Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERING_MODEL_DATA_DISCUSSION_ITEM_OPERATION_COUNT = DISCUSSION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl <em>Modelling Annotation Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ModellingAnnotationItemImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getModellingAnnotationItem()
	 * @generated
	 */
	int MODELLING_ANNOTATION_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__IID = ENGINEERING_MODEL_DATA_ANNOTATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__REVISION_NUMBER = ENGINEERING_MODEL_DATA_ANNOTATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__CLASS_KIND = ENGINEERING_MODEL_DATA_ANNOTATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__MODIFIED_ON = ENGINEERING_MODEL_DATA_ANNOTATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__EXCLUDED_PERSON = ENGINEERING_MODEL_DATA_ANNOTATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__EXCLUDED_DOMAIN = ENGINEERING_MODEL_DATA_ANNOTATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__LANGUAGE_CODE = ENGINEERING_MODEL_DATA_ANNOTATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__CONTENT = ENGINEERING_MODEL_DATA_ANNOTATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__CREATED_ON = ENGINEERING_MODEL_DATA_ANNOTATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__RELATED_THING = ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__AUTHOR = ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__PRIMARY_ANNOTATED_THING = ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__DISCUSSION = ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__CATEGORY = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__OWNER = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__SHORT_NAME = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__STATUS = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__TITLE = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__CLASSIFICATION = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__APPROVED_BY = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Modelling Annotation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM_FEATURE_COUNT = ENGINEERING_MODEL_DATA_ANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Modelling Annotation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELLING_ANNOTATION_ITEM_OPERATION_COUNT = ENGINEERING_MODEL_DATA_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ApprovalImpl <em>Approval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ApprovalImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getApproval()
	 * @generated
	 */
	int APPROVAL = 9;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__IID = GENERIC_ANNOTATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__REVISION_NUMBER = GENERIC_ANNOTATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__CLASS_KIND = GENERIC_ANNOTATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__MODIFIED_ON = GENERIC_ANNOTATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__EXCLUDED_PERSON = GENERIC_ANNOTATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__EXCLUDED_DOMAIN = GENERIC_ANNOTATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__LANGUAGE_CODE = GENERIC_ANNOTATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__CONTENT = GENERIC_ANNOTATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__CREATED_ON = GENERIC_ANNOTATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__OWNER = GENERIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__AUTHOR = GENERIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL__CLASSIFICATION = GENERIC_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Approval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_FEATURE_COUNT = GENERIC_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Approval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_OPERATION_COUNT = GENERIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.SectionImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 10;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CATEGORY = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PAGE = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.PageImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 11;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CATEGORY = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NOTE = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.NoteImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 12;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CATEGORY = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NAME = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__OWNER = CommonDataPackage.THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__SHORT_NAME = CommonDataPackage.THING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CREATED_ON = CommonDataPackage.THING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.BinaryNoteImpl <em>Binary Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.BinaryNoteImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getBinaryNote()
	 * @generated
	 */
	int BINARY_NOTE = 13;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__IID = NOTE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__REVISION_NUMBER = NOTE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__CLASS_KIND = NOTE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__MODIFIED_ON = NOTE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__EXCLUDED_PERSON = NOTE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__EXCLUDED_DOMAIN = NOTE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__CATEGORY = NOTE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__NAME = NOTE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__OWNER = NOTE__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__SHORT_NAME = NOTE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__CREATED_ON = NOTE__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__CAPTION = NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE__FILE_TYPE = NOTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_NOTE_OPERATION_COUNT = NOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.TextualNoteImpl <em>Textual Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.TextualNoteImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getTextualNote()
	 * @generated
	 */
	int TEXTUAL_NOTE = 14;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__IID = NOTE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__REVISION_NUMBER = NOTE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__CLASS_KIND = NOTE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__MODIFIED_ON = NOTE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__EXCLUDED_PERSON = NOTE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__EXCLUDED_DOMAIN = NOTE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__CATEGORY = NOTE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__NAME = NOTE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__OWNER = NOTE__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__SHORT_NAME = NOTE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__CREATED_ON = NOTE__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__CONTENT = NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE__LANGUAGE_CODE = NOTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Textual Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE_FEATURE_COUNT = NOTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Textual Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_NOTE_OPERATION_COUNT = NOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ContractDeviationImpl <em>Contract Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ContractDeviationImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getContractDeviation()
	 * @generated
	 */
	int CONTRACT_DEVIATION = 15;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__IID = MODELLING_ANNOTATION_ITEM__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__REVISION_NUMBER = MODELLING_ANNOTATION_ITEM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__CLASS_KIND = MODELLING_ANNOTATION_ITEM__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__MODIFIED_ON = MODELLING_ANNOTATION_ITEM__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__EXCLUDED_PERSON = MODELLING_ANNOTATION_ITEM__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__EXCLUDED_DOMAIN = MODELLING_ANNOTATION_ITEM__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__LANGUAGE_CODE = MODELLING_ANNOTATION_ITEM__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__CONTENT = MODELLING_ANNOTATION_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__CREATED_ON = MODELLING_ANNOTATION_ITEM__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__RELATED_THING = MODELLING_ANNOTATION_ITEM__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__AUTHOR = MODELLING_ANNOTATION_ITEM__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__PRIMARY_ANNOTATED_THING = MODELLING_ANNOTATION_ITEM__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__DISCUSSION = MODELLING_ANNOTATION_ITEM__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__CATEGORY = MODELLING_ANNOTATION_ITEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__OWNER = MODELLING_ANNOTATION_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__SHORT_NAME = MODELLING_ANNOTATION_ITEM__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__STATUS = MODELLING_ANNOTATION_ITEM__STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__TITLE = MODELLING_ANNOTATION_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__CLASSIFICATION = MODELLING_ANNOTATION_ITEM__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__APPROVED_BY = MODELLING_ANNOTATION_ITEM__APPROVED_BY;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION__SOURCE_ANNOTATION = MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION;

	/**
	 * The number of structural features of the '<em>Contract Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION_FEATURE_COUNT = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contract Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_DEVIATION_OPERATION_COUNT = MODELLING_ANNOTATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.RequestForWaiverImpl <em>Request For Waiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.RequestForWaiverImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getRequestForWaiver()
	 * @generated
	 */
	int REQUEST_FOR_WAIVER = 16;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__IID = CONTRACT_DEVIATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__REVISION_NUMBER = CONTRACT_DEVIATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__CLASS_KIND = CONTRACT_DEVIATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__MODIFIED_ON = CONTRACT_DEVIATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__EXCLUDED_PERSON = CONTRACT_DEVIATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__EXCLUDED_DOMAIN = CONTRACT_DEVIATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__LANGUAGE_CODE = CONTRACT_DEVIATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__CONTENT = CONTRACT_DEVIATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__CREATED_ON = CONTRACT_DEVIATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__RELATED_THING = CONTRACT_DEVIATION__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__AUTHOR = CONTRACT_DEVIATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__PRIMARY_ANNOTATED_THING = CONTRACT_DEVIATION__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__DISCUSSION = CONTRACT_DEVIATION__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__CATEGORY = CONTRACT_DEVIATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__OWNER = CONTRACT_DEVIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__SHORT_NAME = CONTRACT_DEVIATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__STATUS = CONTRACT_DEVIATION__STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__TITLE = CONTRACT_DEVIATION__TITLE;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__CLASSIFICATION = CONTRACT_DEVIATION__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__APPROVED_BY = CONTRACT_DEVIATION__APPROVED_BY;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER__SOURCE_ANNOTATION = CONTRACT_DEVIATION__SOURCE_ANNOTATION;

	/**
	 * The number of structural features of the '<em>Request For Waiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER_FEATURE_COUNT = CONTRACT_DEVIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request For Waiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_WAIVER_OPERATION_COUNT = CONTRACT_DEVIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.RequestForDeviationImpl <em>Request For Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.RequestForDeviationImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getRequestForDeviation()
	 * @generated
	 */
	int REQUEST_FOR_DEVIATION = 17;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__IID = CONTRACT_DEVIATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__REVISION_NUMBER = CONTRACT_DEVIATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__CLASS_KIND = CONTRACT_DEVIATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__MODIFIED_ON = CONTRACT_DEVIATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__EXCLUDED_PERSON = CONTRACT_DEVIATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__EXCLUDED_DOMAIN = CONTRACT_DEVIATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__LANGUAGE_CODE = CONTRACT_DEVIATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__CONTENT = CONTRACT_DEVIATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__CREATED_ON = CONTRACT_DEVIATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__RELATED_THING = CONTRACT_DEVIATION__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__AUTHOR = CONTRACT_DEVIATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__PRIMARY_ANNOTATED_THING = CONTRACT_DEVIATION__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__DISCUSSION = CONTRACT_DEVIATION__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__CATEGORY = CONTRACT_DEVIATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__OWNER = CONTRACT_DEVIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__SHORT_NAME = CONTRACT_DEVIATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__STATUS = CONTRACT_DEVIATION__STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__TITLE = CONTRACT_DEVIATION__TITLE;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__CLASSIFICATION = CONTRACT_DEVIATION__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__APPROVED_BY = CONTRACT_DEVIATION__APPROVED_BY;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION__SOURCE_ANNOTATION = CONTRACT_DEVIATION__SOURCE_ANNOTATION;

	/**
	 * The number of structural features of the '<em>Request For Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION_FEATURE_COUNT = CONTRACT_DEVIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request For Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FOR_DEVIATION_OPERATION_COUNT = CONTRACT_DEVIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ChangeRequestImpl <em>Change Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ChangeRequestImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getChangeRequest()
	 * @generated
	 */
	int CHANGE_REQUEST = 18;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__IID = CONTRACT_DEVIATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__REVISION_NUMBER = CONTRACT_DEVIATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CLASS_KIND = CONTRACT_DEVIATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__MODIFIED_ON = CONTRACT_DEVIATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__EXCLUDED_PERSON = CONTRACT_DEVIATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__EXCLUDED_DOMAIN = CONTRACT_DEVIATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__LANGUAGE_CODE = CONTRACT_DEVIATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CONTENT = CONTRACT_DEVIATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CREATED_ON = CONTRACT_DEVIATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__RELATED_THING = CONTRACT_DEVIATION__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__AUTHOR = CONTRACT_DEVIATION__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__PRIMARY_ANNOTATED_THING = CONTRACT_DEVIATION__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__DISCUSSION = CONTRACT_DEVIATION__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CATEGORY = CONTRACT_DEVIATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__OWNER = CONTRACT_DEVIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__SHORT_NAME = CONTRACT_DEVIATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__STATUS = CONTRACT_DEVIATION__STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__TITLE = CONTRACT_DEVIATION__TITLE;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CLASSIFICATION = CONTRACT_DEVIATION__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__APPROVED_BY = CONTRACT_DEVIATION__APPROVED_BY;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__SOURCE_ANNOTATION = CONTRACT_DEVIATION__SOURCE_ANNOTATION;

	/**
	 * The number of structural features of the '<em>Change Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_FEATURE_COUNT = CONTRACT_DEVIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Change Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_OPERATION_COUNT = CONTRACT_DEVIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ReviewItemDiscrepancyImpl <em>Review Item Discrepancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ReviewItemDiscrepancyImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getReviewItemDiscrepancy()
	 * @generated
	 */
	int REVIEW_ITEM_DISCREPANCY = 19;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__IID = MODELLING_ANNOTATION_ITEM__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__REVISION_NUMBER = MODELLING_ANNOTATION_ITEM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__CLASS_KIND = MODELLING_ANNOTATION_ITEM__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__MODIFIED_ON = MODELLING_ANNOTATION_ITEM__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__EXCLUDED_PERSON = MODELLING_ANNOTATION_ITEM__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__EXCLUDED_DOMAIN = MODELLING_ANNOTATION_ITEM__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__LANGUAGE_CODE = MODELLING_ANNOTATION_ITEM__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__CONTENT = MODELLING_ANNOTATION_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__CREATED_ON = MODELLING_ANNOTATION_ITEM__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__RELATED_THING = MODELLING_ANNOTATION_ITEM__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__AUTHOR = MODELLING_ANNOTATION_ITEM__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__PRIMARY_ANNOTATED_THING = MODELLING_ANNOTATION_ITEM__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__DISCUSSION = MODELLING_ANNOTATION_ITEM__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__CATEGORY = MODELLING_ANNOTATION_ITEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__OWNER = MODELLING_ANNOTATION_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__SHORT_NAME = MODELLING_ANNOTATION_ITEM__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__STATUS = MODELLING_ANNOTATION_ITEM__STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__TITLE = MODELLING_ANNOTATION_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__CLASSIFICATION = MODELLING_ANNOTATION_ITEM__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__APPROVED_BY = MODELLING_ANNOTATION_ITEM__APPROVED_BY;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__SOURCE_ANNOTATION = MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY__SOLUTION = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Review Item Discrepancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY_FEATURE_COUNT = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Review Item Discrepancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_ITEM_DISCREPANCY_OPERATION_COUNT = MODELLING_ANNOTATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.SolutionImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 20;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IID = GENERIC_ANNOTATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__REVISION_NUMBER = GENERIC_ANNOTATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CLASS_KIND = GENERIC_ANNOTATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__MODIFIED_ON = GENERIC_ANNOTATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__EXCLUDED_PERSON = GENERIC_ANNOTATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__EXCLUDED_DOMAIN = GENERIC_ANNOTATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__LANGUAGE_CODE = GENERIC_ANNOTATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONTENT = GENERIC_ANNOTATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CREATED_ON = GENERIC_ANNOTATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__OWNER = GENERIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__AUTHOR = GENERIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = GENERIC_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = GENERIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ActionItemImpl <em>Action Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ActionItemImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getActionItem()
	 * @generated
	 */
	int ACTION_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__IID = MODELLING_ANNOTATION_ITEM__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__REVISION_NUMBER = MODELLING_ANNOTATION_ITEM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CLASS_KIND = MODELLING_ANNOTATION_ITEM__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__MODIFIED_ON = MODELLING_ANNOTATION_ITEM__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__EXCLUDED_PERSON = MODELLING_ANNOTATION_ITEM__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__EXCLUDED_DOMAIN = MODELLING_ANNOTATION_ITEM__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__LANGUAGE_CODE = MODELLING_ANNOTATION_ITEM__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CONTENT = MODELLING_ANNOTATION_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CREATED_ON = MODELLING_ANNOTATION_ITEM__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__RELATED_THING = MODELLING_ANNOTATION_ITEM__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__AUTHOR = MODELLING_ANNOTATION_ITEM__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__PRIMARY_ANNOTATED_THING = MODELLING_ANNOTATION_ITEM__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__DISCUSSION = MODELLING_ANNOTATION_ITEM__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CATEGORY = MODELLING_ANNOTATION_ITEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__OWNER = MODELLING_ANNOTATION_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__SHORT_NAME = MODELLING_ANNOTATION_ITEM__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__STATUS = MODELLING_ANNOTATION_ITEM__STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__TITLE = MODELLING_ANNOTATION_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CLASSIFICATION = MODELLING_ANNOTATION_ITEM__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__APPROVED_BY = MODELLING_ANNOTATION_ITEM__APPROVED_BY;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__SOURCE_ANNOTATION = MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Actionee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__ACTIONEE = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__DUE_DATE = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Close Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CLOSE_OUT_DATE = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Close Out Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM__CLOSE_OUT_STATEMENT = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM_FEATURE_COUNT = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ITEM_OPERATION_COUNT = MODELLING_ANNOTATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.SiteDirectoryThingReferenceImpl <em>Site Directory Thing Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.SiteDirectoryThingReferenceImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSiteDirectoryThingReference()
	 * @generated
	 */
	int SITE_DIRECTORY_THING_REFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE__IID = THING_REFERENCE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE__REVISION_NUMBER = THING_REFERENCE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE__CLASS_KIND = THING_REFERENCE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE__MODIFIED_ON = THING_REFERENCE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE__EXCLUDED_PERSON = THING_REFERENCE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE__EXCLUDED_DOMAIN = THING_REFERENCE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Referenced Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE__REFERENCED_REVISION_NUMBER = THING_REFERENCE__REFERENCED_REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Referenced Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE__REFERENCED_THING = THING_REFERENCE__REFERENCED_THING;

	/**
	 * The number of structural features of the '<em>Site Directory Thing Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE_FEATURE_COUNT = THING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Site Directory Thing Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_THING_REFERENCE_OPERATION_COUNT = THING_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ChangeProposalImpl <em>Change Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ChangeProposalImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getChangeProposal()
	 * @generated
	 */
	int CHANGE_PROPOSAL = 23;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__IID = MODELLING_ANNOTATION_ITEM__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__REVISION_NUMBER = MODELLING_ANNOTATION_ITEM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__CLASS_KIND = MODELLING_ANNOTATION_ITEM__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__MODIFIED_ON = MODELLING_ANNOTATION_ITEM__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__EXCLUDED_PERSON = MODELLING_ANNOTATION_ITEM__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__EXCLUDED_DOMAIN = MODELLING_ANNOTATION_ITEM__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__LANGUAGE_CODE = MODELLING_ANNOTATION_ITEM__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__CONTENT = MODELLING_ANNOTATION_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__CREATED_ON = MODELLING_ANNOTATION_ITEM__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__RELATED_THING = MODELLING_ANNOTATION_ITEM__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__AUTHOR = MODELLING_ANNOTATION_ITEM__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__PRIMARY_ANNOTATED_THING = MODELLING_ANNOTATION_ITEM__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__DISCUSSION = MODELLING_ANNOTATION_ITEM__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__CATEGORY = MODELLING_ANNOTATION_ITEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__OWNER = MODELLING_ANNOTATION_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__SHORT_NAME = MODELLING_ANNOTATION_ITEM__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__STATUS = MODELLING_ANNOTATION_ITEM__STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__TITLE = MODELLING_ANNOTATION_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__CLASSIFICATION = MODELLING_ANNOTATION_ITEM__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__APPROVED_BY = MODELLING_ANNOTATION_ITEM__APPROVED_BY;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__SOURCE_ANNOTATION = MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Change Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL__CHANGE_REQUEST = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL_FEATURE_COUNT = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PROPOSAL_OPERATION_COUNT = MODELLING_ANNOTATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.ContractChangeNoticeImpl <em>Contract Change Notice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.ContractChangeNoticeImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getContractChangeNotice()
	 * @generated
	 */
	int CONTRACT_CHANGE_NOTICE = 24;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__IID = MODELLING_ANNOTATION_ITEM__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__REVISION_NUMBER = MODELLING_ANNOTATION_ITEM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__CLASS_KIND = MODELLING_ANNOTATION_ITEM__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__MODIFIED_ON = MODELLING_ANNOTATION_ITEM__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__EXCLUDED_PERSON = MODELLING_ANNOTATION_ITEM__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__EXCLUDED_DOMAIN = MODELLING_ANNOTATION_ITEM__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__LANGUAGE_CODE = MODELLING_ANNOTATION_ITEM__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__CONTENT = MODELLING_ANNOTATION_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__CREATED_ON = MODELLING_ANNOTATION_ITEM__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__RELATED_THING = MODELLING_ANNOTATION_ITEM__RELATED_THING;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__AUTHOR = MODELLING_ANNOTATION_ITEM__AUTHOR;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__PRIMARY_ANNOTATED_THING = MODELLING_ANNOTATION_ITEM__PRIMARY_ANNOTATED_THING;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__DISCUSSION = MODELLING_ANNOTATION_ITEM__DISCUSSION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__CATEGORY = MODELLING_ANNOTATION_ITEM__CATEGORY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__OWNER = MODELLING_ANNOTATION_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__SHORT_NAME = MODELLING_ANNOTATION_ITEM__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__STATUS = MODELLING_ANNOTATION_ITEM__STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__TITLE = MODELLING_ANNOTATION_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__CLASSIFICATION = MODELLING_ANNOTATION_ITEM__CLASSIFICATION;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__APPROVED_BY = MODELLING_ANNOTATION_ITEM__APPROVED_BY;

	/**
	 * The feature id for the '<em><b>Source Annotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__SOURCE_ANNOTATION = MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Change Proposal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contract Change Notice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE_FEATURE_COUNT = MODELLING_ANNOTATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contract Change Notice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_CHANGE_NOTICE_OPERATION_COUNT = MODELLING_ANNOTATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.SiteDirectoryDataDiscussionItemImpl <em>Site Directory Data Discussion Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.SiteDirectoryDataDiscussionItemImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSiteDirectoryDataDiscussionItem()
	 * @generated
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__IID = DISCUSSION_ITEM__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__REVISION_NUMBER = DISCUSSION_ITEM__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__CLASS_KIND = DISCUSSION_ITEM__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__MODIFIED_ON = DISCUSSION_ITEM__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__EXCLUDED_PERSON = DISCUSSION_ITEM__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__EXCLUDED_DOMAIN = DISCUSSION_ITEM__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__LANGUAGE_CODE = DISCUSSION_ITEM__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__CONTENT = DISCUSSION_ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__CREATED_ON = DISCUSSION_ITEM__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Reply To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__REPLY_TO = DISCUSSION_ITEM__REPLY_TO;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM__AUTHOR = DISCUSSION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site Directory Data Discussion Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM_FEATURE_COUNT = DISCUSSION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Site Directory Data Discussion Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_DISCUSSION_ITEM_OPERATION_COUNT = DISCUSSION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.impl.SiteDirectoryDataAnnotationImpl <em>Site Directory Data Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.impl.SiteDirectoryDataAnnotationImpl
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSiteDirectoryDataAnnotation()
	 * @generated
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION = 26;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__IID = GENERIC_ANNOTATION__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__REVISION_NUMBER = GENERIC_ANNOTATION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__CLASS_KIND = GENERIC_ANNOTATION__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__MODIFIED_ON = GENERIC_ANNOTATION__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__EXCLUDED_PERSON = GENERIC_ANNOTATION__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__EXCLUDED_DOMAIN = GENERIC_ANNOTATION__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__LANGUAGE_CODE = GENERIC_ANNOTATION__LANGUAGE_CODE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__CONTENT = GENERIC_ANNOTATION__CONTENT;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__CREATED_ON = GENERIC_ANNOTATION__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Related Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING = GENERIC_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR = GENERIC_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING = GENERIC_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discussion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION = GENERIC_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Site Directory Data Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION_FEATURE_COUNT = GENERIC_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Site Directory Data Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_DIRECTORY_DATA_ANNOTATION_OPERATION_COUNT = GENERIC_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.AnnotationStatusKind <em>Annotation Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.AnnotationStatusKind
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getAnnotationStatusKind()
	 * @generated
	 */
	int ANNOTATION_STATUS_KIND = 27;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.AnnotationClassificationKind <em>Annotation Classification Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.AnnotationClassificationKind
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getAnnotationClassificationKind()
	 * @generated
	 */
	int ANNOTATION_CLASSIFICATION_KIND = 28;

	/**
	 * The meta object id for the '{@link CDP4.ReportingData.AnnotationApprovalKind <em>Annotation Approval Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.ReportingData.AnnotationApprovalKind
	 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getAnnotationApprovalKind()
	 * @generated
	 */
	int ANNOTATION_APPROVAL_KIND = 29;


	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see CDP4.ReportingData.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.ReportingData.Book#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see CDP4.ReportingData.Book#getSection()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Section();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.EngineeringModelDataNote <em>Engineering Model Data Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Model Data Note</em>'.
	 * @see CDP4.ReportingData.EngineeringModelDataNote
	 * @generated
	 */
	EClass getEngineeringModelDataNote();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.EngineeringModelDataAnnotation <em>Engineering Model Data Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Model Data Annotation</em>'.
	 * @see CDP4.ReportingData.EngineeringModelDataAnnotation
	 * @generated
	 */
	EClass getEngineeringModelDataAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getRelatedThing <em>Related Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Thing</em>'.
	 * @see CDP4.ReportingData.EngineeringModelDataAnnotation#getRelatedThing()
	 * @see #getEngineeringModelDataAnnotation()
	 * @generated
	 */
	EReference getEngineeringModelDataAnnotation_RelatedThing();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see CDP4.ReportingData.EngineeringModelDataAnnotation#getAuthor()
	 * @see #getEngineeringModelDataAnnotation()
	 * @generated
	 */
	EReference getEngineeringModelDataAnnotation_Author();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getPrimaryAnnotatedThing <em>Primary Annotated Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Annotated Thing</em>'.
	 * @see CDP4.ReportingData.EngineeringModelDataAnnotation#getPrimaryAnnotatedThing()
	 * @see #getEngineeringModelDataAnnotation()
	 * @generated
	 */
	EReference getEngineeringModelDataAnnotation_PrimaryAnnotatedThing();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getDiscussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discussion</em>'.
	 * @see CDP4.ReportingData.EngineeringModelDataAnnotation#getDiscussion()
	 * @see #getEngineeringModelDataAnnotation()
	 * @generated
	 */
	EReference getEngineeringModelDataAnnotation_Discussion();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.GenericAnnotation <em>Generic Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Annotation</em>'.
	 * @see CDP4.ReportingData.GenericAnnotation
	 * @generated
	 */
	EClass getGenericAnnotation();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ModellingThingReference <em>Modelling Thing Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelling Thing Reference</em>'.
	 * @see CDP4.ReportingData.ModellingThingReference
	 * @generated
	 */
	EClass getModellingThingReference();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ThingReference <em>Thing Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Reference</em>'.
	 * @see CDP4.ReportingData.ThingReference
	 * @generated
	 */
	EClass getThingReference();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.ThingReference#getReferencedRevisionNumber <em>Referenced Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Revision Number</em>'.
	 * @see CDP4.ReportingData.ThingReference#getReferencedRevisionNumber()
	 * @see #getThingReference()
	 * @generated
	 */
	EAttribute getThingReference_ReferencedRevisionNumber();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.ThingReference#getReferencedThing <em>Referenced Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Thing</em>'.
	 * @see CDP4.ReportingData.ThingReference#getReferencedThing()
	 * @see #getThingReference()
	 * @generated
	 */
	EReference getThingReference_ReferencedThing();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.EngineeringModelDataDiscussionItem <em>Engineering Model Data Discussion Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineering Model Data Discussion Item</em>'.
	 * @see CDP4.ReportingData.EngineeringModelDataDiscussionItem
	 * @generated
	 */
	EClass getEngineeringModelDataDiscussionItem();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.EngineeringModelDataDiscussionItem#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see CDP4.ReportingData.EngineeringModelDataDiscussionItem#getAuthor()
	 * @see #getEngineeringModelDataDiscussionItem()
	 * @generated
	 */
	EReference getEngineeringModelDataDiscussionItem_Author();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.DiscussionItem <em>Discussion Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion Item</em>'.
	 * @see CDP4.ReportingData.DiscussionItem
	 * @generated
	 */
	EClass getDiscussionItem();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.DiscussionItem#getReplyTo <em>Reply To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reply To</em>'.
	 * @see CDP4.ReportingData.DiscussionItem#getReplyTo()
	 * @see #getDiscussionItem()
	 * @generated
	 */
	EReference getDiscussionItem_ReplyTo();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ModellingAnnotationItem <em>Modelling Annotation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelling Annotation Item</em>'.
	 * @see CDP4.ReportingData.ModellingAnnotationItem
	 * @generated
	 */
	EClass getModellingAnnotationItem();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.ModellingAnnotationItem#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see CDP4.ReportingData.ModellingAnnotationItem#getStatus()
	 * @see #getModellingAnnotationItem()
	 * @generated
	 */
	EAttribute getModellingAnnotationItem_Status();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.ModellingAnnotationItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see CDP4.ReportingData.ModellingAnnotationItem#getTitle()
	 * @see #getModellingAnnotationItem()
	 * @generated
	 */
	EAttribute getModellingAnnotationItem_Title();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.ModellingAnnotationItem#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see CDP4.ReportingData.ModellingAnnotationItem#getClassification()
	 * @see #getModellingAnnotationItem()
	 * @generated
	 */
	EAttribute getModellingAnnotationItem_Classification();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.ReportingData.ModellingAnnotationItem#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approved By</em>'.
	 * @see CDP4.ReportingData.ModellingAnnotationItem#getApprovedBy()
	 * @see #getModellingAnnotationItem()
	 * @generated
	 */
	EReference getModellingAnnotationItem_ApprovedBy();

	/**
	 * Returns the meta object for the reference list '{@link CDP4.ReportingData.ModellingAnnotationItem#getSourceAnnotation <em>Source Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Annotation</em>'.
	 * @see CDP4.ReportingData.ModellingAnnotationItem#getSourceAnnotation()
	 * @see #getModellingAnnotationItem()
	 * @generated
	 */
	EReference getModellingAnnotationItem_SourceAnnotation();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.Approval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approval</em>'.
	 * @see CDP4.ReportingData.Approval
	 * @generated
	 */
	EClass getApproval();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.Approval#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see CDP4.ReportingData.Approval#getAuthor()
	 * @see #getApproval()
	 * @generated
	 */
	EReference getApproval_Author();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.Approval#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see CDP4.ReportingData.Approval#getClassification()
	 * @see #getApproval()
	 * @generated
	 */
	EAttribute getApproval_Classification();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see CDP4.ReportingData.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.ReportingData.Section#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see CDP4.ReportingData.Section#getPage()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Page();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see CDP4.ReportingData.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.ReportingData.Page#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see CDP4.ReportingData.Page#getNote()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Note();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see CDP4.ReportingData.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.BinaryNote <em>Binary Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Note</em>'.
	 * @see CDP4.ReportingData.BinaryNote
	 * @generated
	 */
	EClass getBinaryNote();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.BinaryNote#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see CDP4.ReportingData.BinaryNote#getCaption()
	 * @see #getBinaryNote()
	 * @generated
	 */
	EAttribute getBinaryNote_Caption();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.BinaryNote#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File Type</em>'.
	 * @see CDP4.ReportingData.BinaryNote#getFileType()
	 * @see #getBinaryNote()
	 * @generated
	 */
	EReference getBinaryNote_FileType();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.TextualNote <em>Textual Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Note</em>'.
	 * @see CDP4.ReportingData.TextualNote
	 * @generated
	 */
	EClass getTextualNote();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.TextualNote#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see CDP4.ReportingData.TextualNote#getContent()
	 * @see #getTextualNote()
	 * @generated
	 */
	EAttribute getTextualNote_Content();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.TextualNote#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see CDP4.ReportingData.TextualNote#getLanguageCode()
	 * @see #getTextualNote()
	 * @generated
	 */
	EAttribute getTextualNote_LanguageCode();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ContractDeviation <em>Contract Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Deviation</em>'.
	 * @see CDP4.ReportingData.ContractDeviation
	 * @generated
	 */
	EClass getContractDeviation();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.RequestForWaiver <em>Request For Waiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request For Waiver</em>'.
	 * @see CDP4.ReportingData.RequestForWaiver
	 * @generated
	 */
	EClass getRequestForWaiver();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.RequestForDeviation <em>Request For Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request For Deviation</em>'.
	 * @see CDP4.ReportingData.RequestForDeviation
	 * @generated
	 */
	EClass getRequestForDeviation();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Request</em>'.
	 * @see CDP4.ReportingData.ChangeRequest
	 * @generated
	 */
	EClass getChangeRequest();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ReviewItemDiscrepancy <em>Review Item Discrepancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review Item Discrepancy</em>'.
	 * @see CDP4.ReportingData.ReviewItemDiscrepancy
	 * @generated
	 */
	EClass getReviewItemDiscrepancy();

	/**
	 * Returns the meta object for the containment reference '{@link CDP4.ReportingData.ReviewItemDiscrepancy#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solution</em>'.
	 * @see CDP4.ReportingData.ReviewItemDiscrepancy#getSolution()
	 * @see #getReviewItemDiscrepancy()
	 * @generated
	 */
	EReference getReviewItemDiscrepancy_Solution();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see CDP4.ReportingData.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.Solution#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see CDP4.ReportingData.Solution#getAuthor()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Author();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ActionItem <em>Action Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Item</em>'.
	 * @see CDP4.ReportingData.ActionItem
	 * @generated
	 */
	EClass getActionItem();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.ActionItem#getActionee <em>Actionee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actionee</em>'.
	 * @see CDP4.ReportingData.ActionItem#getActionee()
	 * @see #getActionItem()
	 * @generated
	 */
	EReference getActionItem_Actionee();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.ActionItem#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see CDP4.ReportingData.ActionItem#getDueDate()
	 * @see #getActionItem()
	 * @generated
	 */
	EAttribute getActionItem_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.ActionItem#getCloseOutDate <em>Close Out Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Out Date</em>'.
	 * @see CDP4.ReportingData.ActionItem#getCloseOutDate()
	 * @see #getActionItem()
	 * @generated
	 */
	EAttribute getActionItem_CloseOutDate();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.ReportingData.ActionItem#getCloseOutStatement <em>Close Out Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Out Statement</em>'.
	 * @see CDP4.ReportingData.ActionItem#getCloseOutStatement()
	 * @see #getActionItem()
	 * @generated
	 */
	EAttribute getActionItem_CloseOutStatement();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.SiteDirectoryThingReference <em>Site Directory Thing Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Directory Thing Reference</em>'.
	 * @see CDP4.ReportingData.SiteDirectoryThingReference
	 * @generated
	 */
	EClass getSiteDirectoryThingReference();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ChangeProposal <em>Change Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Proposal</em>'.
	 * @see CDP4.ReportingData.ChangeProposal
	 * @generated
	 */
	EClass getChangeProposal();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.ChangeProposal#getChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Request</em>'.
	 * @see CDP4.ReportingData.ChangeProposal#getChangeRequest()
	 * @see #getChangeProposal()
	 * @generated
	 */
	EReference getChangeProposal_ChangeRequest();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.ContractChangeNotice <em>Contract Change Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Change Notice</em>'.
	 * @see CDP4.ReportingData.ContractChangeNotice
	 * @generated
	 */
	EClass getContractChangeNotice();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.ContractChangeNotice#getChangeProposal <em>Change Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Proposal</em>'.
	 * @see CDP4.ReportingData.ContractChangeNotice#getChangeProposal()
	 * @see #getContractChangeNotice()
	 * @generated
	 */
	EReference getContractChangeNotice_ChangeProposal();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.SiteDirectoryDataDiscussionItem <em>Site Directory Data Discussion Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Directory Data Discussion Item</em>'.
	 * @see CDP4.ReportingData.SiteDirectoryDataDiscussionItem
	 * @generated
	 */
	EClass getSiteDirectoryDataDiscussionItem();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.SiteDirectoryDataDiscussionItem#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see CDP4.ReportingData.SiteDirectoryDataDiscussionItem#getAuthor()
	 * @see #getSiteDirectoryDataDiscussionItem()
	 * @generated
	 */
	EReference getSiteDirectoryDataDiscussionItem_Author();

	/**
	 * Returns the meta object for class '{@link CDP4.ReportingData.SiteDirectoryDataAnnotation <em>Site Directory Data Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Directory Data Annotation</em>'.
	 * @see CDP4.ReportingData.SiteDirectoryDataAnnotation
	 * @generated
	 */
	EClass getSiteDirectoryDataAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getRelatedThing <em>Related Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Thing</em>'.
	 * @see CDP4.ReportingData.SiteDirectoryDataAnnotation#getRelatedThing()
	 * @see #getSiteDirectoryDataAnnotation()
	 * @generated
	 */
	EReference getSiteDirectoryDataAnnotation_RelatedThing();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see CDP4.ReportingData.SiteDirectoryDataAnnotation#getAuthor()
	 * @see #getSiteDirectoryDataAnnotation()
	 * @generated
	 */
	EReference getSiteDirectoryDataAnnotation_Author();

	/**
	 * Returns the meta object for the reference '{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getPrimaryAnnotatedThing <em>Primary Annotated Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Annotated Thing</em>'.
	 * @see CDP4.ReportingData.SiteDirectoryDataAnnotation#getPrimaryAnnotatedThing()
	 * @see #getSiteDirectoryDataAnnotation()
	 * @generated
	 */
	EReference getSiteDirectoryDataAnnotation_PrimaryAnnotatedThing();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getDiscussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discussion</em>'.
	 * @see CDP4.ReportingData.SiteDirectoryDataAnnotation#getDiscussion()
	 * @see #getSiteDirectoryDataAnnotation()
	 * @generated
	 */
	EReference getSiteDirectoryDataAnnotation_Discussion();

	/**
	 * Returns the meta object for enum '{@link CDP4.ReportingData.AnnotationStatusKind <em>Annotation Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Annotation Status Kind</em>'.
	 * @see CDP4.ReportingData.AnnotationStatusKind
	 * @generated
	 */
	EEnum getAnnotationStatusKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.ReportingData.AnnotationClassificationKind <em>Annotation Classification Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Annotation Classification Kind</em>'.
	 * @see CDP4.ReportingData.AnnotationClassificationKind
	 * @generated
	 */
	EEnum getAnnotationClassificationKind();

	/**
	 * Returns the meta object for enum '{@link CDP4.ReportingData.AnnotationApprovalKind <em>Annotation Approval Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Annotation Approval Kind</em>'.
	 * @see CDP4.ReportingData.AnnotationApprovalKind
	 * @generated
	 */
	EEnum getAnnotationApprovalKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportingDataFactory getReportingDataFactory();

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
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.BookImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__SECTION = eINSTANCE.getBook_Section();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.EngineeringModelDataNoteImpl <em>Engineering Model Data Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.EngineeringModelDataNoteImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getEngineeringModelDataNote()
		 * @generated
		 */
		EClass ENGINEERING_MODEL_DATA_NOTE = eINSTANCE.getEngineeringModelDataNote();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.EngineeringModelDataAnnotationImpl <em>Engineering Model Data Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.EngineeringModelDataAnnotationImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getEngineeringModelDataAnnotation()
		 * @generated
		 */
		EClass ENGINEERING_MODEL_DATA_ANNOTATION = eINSTANCE.getEngineeringModelDataAnnotation();

		/**
		 * The meta object literal for the '<em><b>Related Thing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING = eINSTANCE.getEngineeringModelDataAnnotation_RelatedThing();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR = eINSTANCE.getEngineeringModelDataAnnotation_Author();

		/**
		 * The meta object literal for the '<em><b>Primary Annotated Thing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING = eINSTANCE.getEngineeringModelDataAnnotation_PrimaryAnnotatedThing();

		/**
		 * The meta object literal for the '<em><b>Discussion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION = eINSTANCE.getEngineeringModelDataAnnotation_Discussion();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.GenericAnnotationImpl <em>Generic Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.GenericAnnotationImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getGenericAnnotation()
		 * @generated
		 */
		EClass GENERIC_ANNOTATION = eINSTANCE.getGenericAnnotation();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ModellingThingReferenceImpl <em>Modelling Thing Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ModellingThingReferenceImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getModellingThingReference()
		 * @generated
		 */
		EClass MODELLING_THING_REFERENCE = eINSTANCE.getModellingThingReference();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ThingReferenceImpl <em>Thing Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ThingReferenceImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getThingReference()
		 * @generated
		 */
		EClass THING_REFERENCE = eINSTANCE.getThingReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_REFERENCE__REFERENCED_REVISION_NUMBER = eINSTANCE.getThingReference_ReferencedRevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Referenced Thing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_REFERENCE__REFERENCED_THING = eINSTANCE.getThingReference_ReferencedThing();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.EngineeringModelDataDiscussionItemImpl <em>Engineering Model Data Discussion Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.EngineeringModelDataDiscussionItemImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getEngineeringModelDataDiscussionItem()
		 * @generated
		 */
		EClass ENGINEERING_MODEL_DATA_DISCUSSION_ITEM = eINSTANCE.getEngineeringModelDataDiscussionItem();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__AUTHOR = eINSTANCE.getEngineeringModelDataDiscussionItem_Author();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.DiscussionItemImpl <em>Discussion Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.DiscussionItemImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getDiscussionItem()
		 * @generated
		 */
		EClass DISCUSSION_ITEM = eINSTANCE.getDiscussionItem();

		/**
		 * The meta object literal for the '<em><b>Reply To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCUSSION_ITEM__REPLY_TO = eINSTANCE.getDiscussionItem_ReplyTo();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl <em>Modelling Annotation Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ModellingAnnotationItemImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getModellingAnnotationItem()
		 * @generated
		 */
		EClass MODELLING_ANNOTATION_ITEM = eINSTANCE.getModellingAnnotationItem();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELLING_ANNOTATION_ITEM__STATUS = eINSTANCE.getModellingAnnotationItem_Status();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELLING_ANNOTATION_ITEM__TITLE = eINSTANCE.getModellingAnnotationItem_Title();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELLING_ANNOTATION_ITEM__CLASSIFICATION = eINSTANCE.getModellingAnnotationItem_Classification();

		/**
		 * The meta object literal for the '<em><b>Approved By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELLING_ANNOTATION_ITEM__APPROVED_BY = eINSTANCE.getModellingAnnotationItem_ApprovedBy();

		/**
		 * The meta object literal for the '<em><b>Source Annotation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION = eINSTANCE.getModellingAnnotationItem_SourceAnnotation();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ApprovalImpl <em>Approval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ApprovalImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getApproval()
		 * @generated
		 */
		EClass APPROVAL = eINSTANCE.getApproval();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVAL__AUTHOR = eINSTANCE.getApproval_Author();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL__CLASSIFICATION = eINSTANCE.getApproval_Classification();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.SectionImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PAGE = eINSTANCE.getSection_Page();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.PageImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__NOTE = eINSTANCE.getPage_Note();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.NoteImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.BinaryNoteImpl <em>Binary Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.BinaryNoteImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getBinaryNote()
		 * @generated
		 */
		EClass BINARY_NOTE = eINSTANCE.getBinaryNote();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_NOTE__CAPTION = eINSTANCE.getBinaryNote_Caption();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_NOTE__FILE_TYPE = eINSTANCE.getBinaryNote_FileType();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.TextualNoteImpl <em>Textual Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.TextualNoteImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getTextualNote()
		 * @generated
		 */
		EClass TEXTUAL_NOTE = eINSTANCE.getTextualNote();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_NOTE__CONTENT = eINSTANCE.getTextualNote_Content();

		/**
		 * The meta object literal for the '<em><b>Language Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_NOTE__LANGUAGE_CODE = eINSTANCE.getTextualNote_LanguageCode();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ContractDeviationImpl <em>Contract Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ContractDeviationImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getContractDeviation()
		 * @generated
		 */
		EClass CONTRACT_DEVIATION = eINSTANCE.getContractDeviation();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.RequestForWaiverImpl <em>Request For Waiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.RequestForWaiverImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getRequestForWaiver()
		 * @generated
		 */
		EClass REQUEST_FOR_WAIVER = eINSTANCE.getRequestForWaiver();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.RequestForDeviationImpl <em>Request For Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.RequestForDeviationImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getRequestForDeviation()
		 * @generated
		 */
		EClass REQUEST_FOR_DEVIATION = eINSTANCE.getRequestForDeviation();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ChangeRequestImpl <em>Change Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ChangeRequestImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getChangeRequest()
		 * @generated
		 */
		EClass CHANGE_REQUEST = eINSTANCE.getChangeRequest();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ReviewItemDiscrepancyImpl <em>Review Item Discrepancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ReviewItemDiscrepancyImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getReviewItemDiscrepancy()
		 * @generated
		 */
		EClass REVIEW_ITEM_DISCREPANCY = eINSTANCE.getReviewItemDiscrepancy();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW_ITEM_DISCREPANCY__SOLUTION = eINSTANCE.getReviewItemDiscrepancy_Solution();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.SolutionImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__AUTHOR = eINSTANCE.getSolution_Author();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ActionItemImpl <em>Action Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ActionItemImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getActionItem()
		 * @generated
		 */
		EClass ACTION_ITEM = eINSTANCE.getActionItem();

		/**
		 * The meta object literal for the '<em><b>Actionee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ITEM__ACTIONEE = eINSTANCE.getActionItem_Actionee();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ITEM__DUE_DATE = eINSTANCE.getActionItem_DueDate();

		/**
		 * The meta object literal for the '<em><b>Close Out Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ITEM__CLOSE_OUT_DATE = eINSTANCE.getActionItem_CloseOutDate();

		/**
		 * The meta object literal for the '<em><b>Close Out Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ITEM__CLOSE_OUT_STATEMENT = eINSTANCE.getActionItem_CloseOutStatement();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.SiteDirectoryThingReferenceImpl <em>Site Directory Thing Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.SiteDirectoryThingReferenceImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSiteDirectoryThingReference()
		 * @generated
		 */
		EClass SITE_DIRECTORY_THING_REFERENCE = eINSTANCE.getSiteDirectoryThingReference();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ChangeProposalImpl <em>Change Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ChangeProposalImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getChangeProposal()
		 * @generated
		 */
		EClass CHANGE_PROPOSAL = eINSTANCE.getChangeProposal();

		/**
		 * The meta object literal for the '<em><b>Change Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PROPOSAL__CHANGE_REQUEST = eINSTANCE.getChangeProposal_ChangeRequest();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.ContractChangeNoticeImpl <em>Contract Change Notice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.ContractChangeNoticeImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getContractChangeNotice()
		 * @generated
		 */
		EClass CONTRACT_CHANGE_NOTICE = eINSTANCE.getContractChangeNotice();

		/**
		 * The meta object literal for the '<em><b>Change Proposal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL = eINSTANCE.getContractChangeNotice_ChangeProposal();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.SiteDirectoryDataDiscussionItemImpl <em>Site Directory Data Discussion Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.SiteDirectoryDataDiscussionItemImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSiteDirectoryDataDiscussionItem()
		 * @generated
		 */
		EClass SITE_DIRECTORY_DATA_DISCUSSION_ITEM = eINSTANCE.getSiteDirectoryDataDiscussionItem();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY_DATA_DISCUSSION_ITEM__AUTHOR = eINSTANCE.getSiteDirectoryDataDiscussionItem_Author();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.impl.SiteDirectoryDataAnnotationImpl <em>Site Directory Data Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.impl.SiteDirectoryDataAnnotationImpl
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getSiteDirectoryDataAnnotation()
		 * @generated
		 */
		EClass SITE_DIRECTORY_DATA_ANNOTATION = eINSTANCE.getSiteDirectoryDataAnnotation();

		/**
		 * The meta object literal for the '<em><b>Related Thing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING = eINSTANCE.getSiteDirectoryDataAnnotation_RelatedThing();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR = eINSTANCE.getSiteDirectoryDataAnnotation_Author();

		/**
		 * The meta object literal for the '<em><b>Primary Annotated Thing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING = eINSTANCE.getSiteDirectoryDataAnnotation_PrimaryAnnotatedThing();

		/**
		 * The meta object literal for the '<em><b>Discussion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION = eINSTANCE.getSiteDirectoryDataAnnotation_Discussion();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.AnnotationStatusKind <em>Annotation Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.AnnotationStatusKind
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getAnnotationStatusKind()
		 * @generated
		 */
		EEnum ANNOTATION_STATUS_KIND = eINSTANCE.getAnnotationStatusKind();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.AnnotationClassificationKind <em>Annotation Classification Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.AnnotationClassificationKind
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getAnnotationClassificationKind()
		 * @generated
		 */
		EEnum ANNOTATION_CLASSIFICATION_KIND = eINSTANCE.getAnnotationClassificationKind();

		/**
		 * The meta object literal for the '{@link CDP4.ReportingData.AnnotationApprovalKind <em>Annotation Approval Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.ReportingData.AnnotationApprovalKind
		 * @see CDP4.ReportingData.impl.ReportingDataPackageImpl#getAnnotationApprovalKind()
		 * @generated
		 */
		EEnum ANNOTATION_APPROVAL_KIND = eINSTANCE.getAnnotationApprovalKind();

	}

} //ReportingDataPackage
