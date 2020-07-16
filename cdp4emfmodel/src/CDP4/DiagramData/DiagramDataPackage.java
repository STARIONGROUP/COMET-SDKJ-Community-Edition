/**
 */
package CDP4.DiagramData;

import CDP4.CommonData.CommonDataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see CDP4.DiagramData.DiagramDataFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DiagramData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CDP4/DiagramData.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CDP4.DiagramData";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramDataPackage eINSTANCE = CDP4.DiagramData.impl.DiagramDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.DiagramThingBaseImpl <em>Diagram Thing Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.DiagramThingBaseImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramThingBase()
	 * @generated
	 */
	int DIAGRAM_THING_BASE = 2;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE__IID = CommonDataPackage.THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE__REVISION_NUMBER = CommonDataPackage.THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE__CLASS_KIND = CommonDataPackage.THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE__MODIFIED_ON = CommonDataPackage.THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE__EXCLUDED_PERSON = CommonDataPackage.THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE__EXCLUDED_DOMAIN = CommonDataPackage.THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE__NAME = CommonDataPackage.THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Thing Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE_FEATURE_COUNT = CommonDataPackage.THING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diagram Thing Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_THING_BASE_OPERATION_COUNT = CommonDataPackage.THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.DiagramElementContainerImpl <em>Diagram Element Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.DiagramElementContainerImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramElementContainer()
	 * @generated
	 */
	int DIAGRAM_ELEMENT_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__IID = DIAGRAM_THING_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__REVISION_NUMBER = DIAGRAM_THING_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__CLASS_KIND = DIAGRAM_THING_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__MODIFIED_ON = DIAGRAM_THING_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__EXCLUDED_PERSON = DIAGRAM_THING_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__EXCLUDED_DOMAIN = DIAGRAM_THING_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__NAME = DIAGRAM_THING_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT = DIAGRAM_THING_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER__BOUNDS = DIAGRAM_THING_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER_FEATURE_COUNT = DIAGRAM_THING_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diagram Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_CONTAINER_OPERATION_COUNT = DIAGRAM_THING_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.DiagramElementThingImpl <em>Diagram Element Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.DiagramElementThingImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramElementThing()
	 * @generated
	 */
	int DIAGRAM_ELEMENT_THING = 0;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__IID = DIAGRAM_ELEMENT_CONTAINER__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__REVISION_NUMBER = DIAGRAM_ELEMENT_CONTAINER__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__CLASS_KIND = DIAGRAM_ELEMENT_CONTAINER__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__MODIFIED_ON = DIAGRAM_ELEMENT_CONTAINER__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__EXCLUDED_PERSON = DIAGRAM_ELEMENT_CONTAINER__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__EXCLUDED_DOMAIN = DIAGRAM_ELEMENT_CONTAINER__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__NAME = DIAGRAM_ELEMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__DIAGRAM_ELEMENT = DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__BOUNDS = DIAGRAM_ELEMENT_CONTAINER__BOUNDS;

	/**
	 * The feature id for the '<em><b>Depicted Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__DEPICTED_THING = DIAGRAM_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__LOCAL_STYLE = DIAGRAM_ELEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING__SHARED_STYLE = DIAGRAM_ELEMENT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Element Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING_FEATURE_COUNT = DIAGRAM_ELEMENT_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diagram Element Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_THING_OPERATION_COUNT = DIAGRAM_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.BoundsImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 3;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__IID = DIAGRAM_THING_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__REVISION_NUMBER = DIAGRAM_THING_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__CLASS_KIND = DIAGRAM_THING_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MODIFIED_ON = DIAGRAM_THING_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__EXCLUDED_PERSON = DIAGRAM_THING_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__EXCLUDED_DOMAIN = DIAGRAM_THING_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__NAME = DIAGRAM_THING_BASE__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__X = DIAGRAM_THING_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__Y = DIAGRAM_THING_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__WIDTH = DIAGRAM_THING_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__HEIGHT = DIAGRAM_THING_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = DIAGRAM_THING_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_OPERATION_COUNT = DIAGRAM_THING_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.DiagrammingStyleImpl <em>Diagramming Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.DiagrammingStyleImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagrammingStyle()
	 * @generated
	 */
	int DIAGRAMMING_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__IID = DIAGRAM_THING_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__REVISION_NUMBER = DIAGRAM_THING_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__CLASS_KIND = DIAGRAM_THING_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__MODIFIED_ON = DIAGRAM_THING_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__EXCLUDED_PERSON = DIAGRAM_THING_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__EXCLUDED_DOMAIN = DIAGRAM_THING_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__NAME = DIAGRAM_THING_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FILL_COLOR = DIAGRAM_THING_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FILL_OPACITY = DIAGRAM_THING_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__STROKE_WIDTH = DIAGRAM_THING_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__STROKE_OPACITY = DIAGRAM_THING_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__STROKE_COLOR = DIAGRAM_THING_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FONT_SIZE = DIAGRAM_THING_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FONT_NAME = DIAGRAM_THING_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FONT_COLOR = DIAGRAM_THING_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Font Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FONT_ITALIC = DIAGRAM_THING_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Font Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FONT_BOLD = DIAGRAM_THING_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Font Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FONT_UNDERLINE = DIAGRAM_THING_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Font Stroke Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__FONT_STROKE_THROUGH = DIAGRAM_THING_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Used Color</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE__USED_COLOR = DIAGRAM_THING_BASE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Diagramming Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE_FEATURE_COUNT = DIAGRAM_THING_BASE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Diagramming Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMMING_STYLE_OPERATION_COUNT = DIAGRAM_THING_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.OwnedStyleImpl <em>Owned Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.OwnedStyleImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getOwnedStyle()
	 * @generated
	 */
	int OWNED_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__IID = DIAGRAMMING_STYLE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__REVISION_NUMBER = DIAGRAMMING_STYLE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__CLASS_KIND = DIAGRAMMING_STYLE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__MODIFIED_ON = DIAGRAMMING_STYLE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__EXCLUDED_PERSON = DIAGRAMMING_STYLE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__EXCLUDED_DOMAIN = DIAGRAMMING_STYLE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__NAME = DIAGRAMMING_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FILL_COLOR = DIAGRAMMING_STYLE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FILL_OPACITY = DIAGRAMMING_STYLE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__STROKE_WIDTH = DIAGRAMMING_STYLE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__STROKE_OPACITY = DIAGRAMMING_STYLE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__STROKE_COLOR = DIAGRAMMING_STYLE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FONT_SIZE = DIAGRAMMING_STYLE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FONT_NAME = DIAGRAMMING_STYLE__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FONT_COLOR = DIAGRAMMING_STYLE__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Font Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FONT_ITALIC = DIAGRAMMING_STYLE__FONT_ITALIC;

	/**
	 * The feature id for the '<em><b>Font Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FONT_BOLD = DIAGRAMMING_STYLE__FONT_BOLD;

	/**
	 * The feature id for the '<em><b>Font Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FONT_UNDERLINE = DIAGRAMMING_STYLE__FONT_UNDERLINE;

	/**
	 * The feature id for the '<em><b>Font Stroke Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__FONT_STROKE_THROUGH = DIAGRAMMING_STYLE__FONT_STROKE_THROUGH;

	/**
	 * The feature id for the '<em><b>Used Color</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE__USED_COLOR = DIAGRAMMING_STYLE__USED_COLOR;

	/**
	 * The number of structural features of the '<em>Owned Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE_FEATURE_COUNT = DIAGRAMMING_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Owned Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_STYLE_OPERATION_COUNT = DIAGRAMMING_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.ColorImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 6;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__IID = DIAGRAM_THING_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__REVISION_NUMBER = DIAGRAM_THING_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__CLASS_KIND = DIAGRAM_THING_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__MODIFIED_ON = DIAGRAM_THING_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__EXCLUDED_PERSON = DIAGRAM_THING_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__EXCLUDED_DOMAIN = DIAGRAM_THING_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__NAME = DIAGRAM_THING_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = DIAGRAM_THING_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = DIAGRAM_THING_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = DIAGRAM_THING_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = DIAGRAM_THING_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = DIAGRAM_THING_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.PointImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 7;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__IID = DIAGRAM_THING_BASE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__REVISION_NUMBER = DIAGRAM_THING_BASE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__CLASS_KIND = DIAGRAM_THING_BASE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__MODIFIED_ON = DIAGRAM_THING_BASE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__EXCLUDED_PERSON = DIAGRAM_THING_BASE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__EXCLUDED_DOMAIN = DIAGRAM_THING_BASE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__NAME = DIAGRAM_THING_BASE__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = DIAGRAM_THING_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = DIAGRAM_THING_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = DIAGRAM_THING_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = DIAGRAM_THING_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.DiagramEdgeImpl <em>Diagram Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.DiagramEdgeImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramEdge()
	 * @generated
	 */
	int DIAGRAM_EDGE = 8;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__IID = DIAGRAM_ELEMENT_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__REVISION_NUMBER = DIAGRAM_ELEMENT_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__CLASS_KIND = DIAGRAM_ELEMENT_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__MODIFIED_ON = DIAGRAM_ELEMENT_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__EXCLUDED_PERSON = DIAGRAM_ELEMENT_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__EXCLUDED_DOMAIN = DIAGRAM_ELEMENT_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__NAME = DIAGRAM_ELEMENT_THING__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__DIAGRAM_ELEMENT = DIAGRAM_ELEMENT_THING__DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__BOUNDS = DIAGRAM_ELEMENT_THING__BOUNDS;

	/**
	 * The feature id for the '<em><b>Depicted Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__DEPICTED_THING = DIAGRAM_ELEMENT_THING__DEPICTED_THING;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__LOCAL_STYLE = DIAGRAM_ELEMENT_THING__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__SHARED_STYLE = DIAGRAM_ELEMENT_THING__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__SOURCE = DIAGRAM_ELEMENT_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__TARGET = DIAGRAM_ELEMENT_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE__POINT = DIAGRAM_ELEMENT_THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Diagram Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_EDGE_OPERATION_COUNT = DIAGRAM_ELEMENT_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.DiagramShapeImpl <em>Diagram Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.DiagramShapeImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramShape()
	 * @generated
	 */
	int DIAGRAM_SHAPE = 9;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__IID = DIAGRAM_ELEMENT_THING__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__REVISION_NUMBER = DIAGRAM_ELEMENT_THING__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__CLASS_KIND = DIAGRAM_ELEMENT_THING__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__MODIFIED_ON = DIAGRAM_ELEMENT_THING__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__EXCLUDED_PERSON = DIAGRAM_ELEMENT_THING__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__EXCLUDED_DOMAIN = DIAGRAM_ELEMENT_THING__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__NAME = DIAGRAM_ELEMENT_THING__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__DIAGRAM_ELEMENT = DIAGRAM_ELEMENT_THING__DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__BOUNDS = DIAGRAM_ELEMENT_THING__BOUNDS;

	/**
	 * The feature id for the '<em><b>Depicted Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__DEPICTED_THING = DIAGRAM_ELEMENT_THING__DEPICTED_THING;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__LOCAL_STYLE = DIAGRAM_ELEMENT_THING__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE__SHARED_STYLE = DIAGRAM_ELEMENT_THING__SHARED_STYLE;

	/**
	 * The number of structural features of the '<em>Diagram Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE_FEATURE_COUNT = DIAGRAM_ELEMENT_THING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Diagram Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_SHAPE_OPERATION_COUNT = DIAGRAM_ELEMENT_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.DiagramObjectImpl <em>Diagram Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.DiagramObjectImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramObject()
	 * @generated
	 */
	int DIAGRAM_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__IID = DIAGRAM_SHAPE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__REVISION_NUMBER = DIAGRAM_SHAPE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__CLASS_KIND = DIAGRAM_SHAPE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__MODIFIED_ON = DIAGRAM_SHAPE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__EXCLUDED_PERSON = DIAGRAM_SHAPE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__EXCLUDED_DOMAIN = DIAGRAM_SHAPE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__NAME = DIAGRAM_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__DIAGRAM_ELEMENT = DIAGRAM_SHAPE__DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__BOUNDS = DIAGRAM_SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Depicted Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__DEPICTED_THING = DIAGRAM_SHAPE__DEPICTED_THING;

	/**
	 * The feature id for the '<em><b>Local Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__LOCAL_STYLE = DIAGRAM_SHAPE__LOCAL_STYLE;

	/**
	 * The feature id for the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__SHARED_STYLE = DIAGRAM_SHAPE__SHARED_STYLE;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__RESOLUTION = DIAGRAM_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT__DOCUMENTATION = DIAGRAM_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT_FEATURE_COUNT = DIAGRAM_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Diagram Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_OBJECT_OPERATION_COUNT = DIAGRAM_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.DiagramCanvasImpl <em>Diagram Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.DiagramCanvasImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramCanvas()
	 * @generated
	 */
	int DIAGRAM_CANVAS = 11;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__IID = DIAGRAM_ELEMENT_CONTAINER__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__REVISION_NUMBER = DIAGRAM_ELEMENT_CONTAINER__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__CLASS_KIND = DIAGRAM_ELEMENT_CONTAINER__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__MODIFIED_ON = DIAGRAM_ELEMENT_CONTAINER__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__EXCLUDED_PERSON = DIAGRAM_ELEMENT_CONTAINER__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__EXCLUDED_DOMAIN = DIAGRAM_ELEMENT_CONTAINER__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__NAME = DIAGRAM_ELEMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__DIAGRAM_ELEMENT = DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__BOUNDS = DIAGRAM_ELEMENT_CONTAINER__BOUNDS;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS__CREATED_ON = DIAGRAM_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS_FEATURE_COUNT = DIAGRAM_ELEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Diagram Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_CANVAS_OPERATION_COUNT = DIAGRAM_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CDP4.DiagramData.impl.SharedStyleImpl <em>Shared Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CDP4.DiagramData.impl.SharedStyleImpl
	 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getSharedStyle()
	 * @generated
	 */
	int SHARED_STYLE = 12;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__IID = DIAGRAMMING_STYLE__IID;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__REVISION_NUMBER = DIAGRAMMING_STYLE__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Class Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__CLASS_KIND = DIAGRAMMING_STYLE__CLASS_KIND;

	/**
	 * The feature id for the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__MODIFIED_ON = DIAGRAMMING_STYLE__MODIFIED_ON;

	/**
	 * The feature id for the '<em><b>Excluded Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__EXCLUDED_PERSON = DIAGRAMMING_STYLE__EXCLUDED_PERSON;

	/**
	 * The feature id for the '<em><b>Excluded Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__EXCLUDED_DOMAIN = DIAGRAMMING_STYLE__EXCLUDED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__NAME = DIAGRAMMING_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FILL_COLOR = DIAGRAMMING_STYLE__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FILL_OPACITY = DIAGRAMMING_STYLE__FILL_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__STROKE_WIDTH = DIAGRAMMING_STYLE__STROKE_WIDTH;

	/**
	 * The feature id for the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__STROKE_OPACITY = DIAGRAMMING_STYLE__STROKE_OPACITY;

	/**
	 * The feature id for the '<em><b>Stroke Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__STROKE_COLOR = DIAGRAMMING_STYLE__STROKE_COLOR;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FONT_SIZE = DIAGRAMMING_STYLE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FONT_NAME = DIAGRAMMING_STYLE__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FONT_COLOR = DIAGRAMMING_STYLE__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Font Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FONT_ITALIC = DIAGRAMMING_STYLE__FONT_ITALIC;

	/**
	 * The feature id for the '<em><b>Font Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FONT_BOLD = DIAGRAMMING_STYLE__FONT_BOLD;

	/**
	 * The feature id for the '<em><b>Font Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FONT_UNDERLINE = DIAGRAMMING_STYLE__FONT_UNDERLINE;

	/**
	 * The feature id for the '<em><b>Font Stroke Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__FONT_STROKE_THROUGH = DIAGRAMMING_STYLE__FONT_STROKE_THROUGH;

	/**
	 * The feature id for the '<em><b>Used Color</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE__USED_COLOR = DIAGRAMMING_STYLE__USED_COLOR;

	/**
	 * The number of structural features of the '<em>Shared Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE_FEATURE_COUNT = DIAGRAMMING_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shared Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STYLE_OPERATION_COUNT = DIAGRAMMING_STYLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.DiagramElementThing <em>Diagram Element Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element Thing</em>'.
	 * @see CDP4.DiagramData.DiagramElementThing
	 * @generated
	 */
	EClass getDiagramElementThing();

	/**
	 * Returns the meta object for the reference '{@link CDP4.DiagramData.DiagramElementThing#getDepictedThing <em>Depicted Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depicted Thing</em>'.
	 * @see CDP4.DiagramData.DiagramElementThing#getDepictedThing()
	 * @see #getDiagramElementThing()
	 * @generated
	 */
	EReference getDiagramElementThing_DepictedThing();

	/**
	 * Returns the meta object for the containment reference '{@link CDP4.DiagramData.DiagramElementThing#getLocalStyle <em>Local Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Style</em>'.
	 * @see CDP4.DiagramData.DiagramElementThing#getLocalStyle()
	 * @see #getDiagramElementThing()
	 * @generated
	 */
	EReference getDiagramElementThing_LocalStyle();

	/**
	 * Returns the meta object for the reference '{@link CDP4.DiagramData.DiagramElementThing#getSharedStyle <em>Shared Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shared Style</em>'.
	 * @see CDP4.DiagramData.DiagramElementThing#getSharedStyle()
	 * @see #getDiagramElementThing()
	 * @generated
	 */
	EReference getDiagramElementThing_SharedStyle();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.DiagramElementContainer <em>Diagram Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element Container</em>'.
	 * @see CDP4.DiagramData.DiagramElementContainer
	 * @generated
	 */
	EClass getDiagramElementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.DiagramData.DiagramElementContainer#getDiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Element</em>'.
	 * @see CDP4.DiagramData.DiagramElementContainer#getDiagramElement()
	 * @see #getDiagramElementContainer()
	 * @generated
	 */
	EReference getDiagramElementContainer_DiagramElement();

	/**
	 * Returns the meta object for the containment reference '{@link CDP4.DiagramData.DiagramElementContainer#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see CDP4.DiagramData.DiagramElementContainer#getBounds()
	 * @see #getDiagramElementContainer()
	 * @generated
	 */
	EReference getDiagramElementContainer_Bounds();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.DiagramThingBase <em>Diagram Thing Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Thing Base</em>'.
	 * @see CDP4.DiagramData.DiagramThingBase
	 * @generated
	 */
	EClass getDiagramThingBase();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see CDP4.DiagramData.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Bounds#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CDP4.DiagramData.Bounds#getX()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_X();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Bounds#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see CDP4.DiagramData.Bounds#getY()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Y();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Bounds#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see CDP4.DiagramData.Bounds#getWidth()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Width();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Bounds#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see CDP4.DiagramData.Bounds#getHeight()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Height();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.OwnedStyle <em>Owned Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owned Style</em>'.
	 * @see CDP4.DiagramData.OwnedStyle
	 * @generated
	 */
	EClass getOwnedStyle();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.DiagrammingStyle <em>Diagramming Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagramming Style</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle
	 * @generated
	 */
	EClass getDiagrammingStyle();

	/**
	 * Returns the meta object for the reference '{@link CDP4.DiagramData.DiagrammingStyle#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fill Color</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFillColor()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EReference getDiagrammingStyle_FillColor();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getFillOpacity <em>Fill Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Opacity</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFillOpacity()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_FillOpacity();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getStrokeWidth()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getStrokeOpacity <em>Stroke Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Opacity</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getStrokeOpacity()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_StrokeOpacity();

	/**
	 * Returns the meta object for the reference '{@link CDP4.DiagramData.DiagrammingStyle#getStrokeColor <em>Stroke Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stroke Color</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getStrokeColor()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EReference getDiagrammingStyle_StrokeColor();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFontSize()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFontName()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_FontName();

	/**
	 * Returns the meta object for the reference '{@link CDP4.DiagramData.DiagrammingStyle#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Font Color</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFontColor()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EReference getDiagrammingStyle_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getFontItalic <em>Font Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Italic</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFontItalic()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_FontItalic();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getFontBold <em>Font Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Bold</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFontBold()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_FontBold();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getFontUnderline <em>Font Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Underline</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFontUnderline()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_FontUnderline();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagrammingStyle#getFontStrokeThrough <em>Font Stroke Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Stroke Through</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getFontStrokeThrough()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EAttribute getDiagrammingStyle_FontStrokeThrough();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.DiagramData.DiagrammingStyle#getUsedColor <em>Used Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Color</em>'.
	 * @see CDP4.DiagramData.DiagrammingStyle#getUsedColor()
	 * @see #getDiagrammingStyle()
	 * @generated
	 */
	EReference getDiagrammingStyle_UsedColor();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see CDP4.DiagramData.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see CDP4.DiagramData.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see CDP4.DiagramData.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see CDP4.DiagramData.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see CDP4.DiagramData.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CDP4.DiagramData.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see CDP4.DiagramData.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.DiagramEdge <em>Diagram Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Edge</em>'.
	 * @see CDP4.DiagramData.DiagramEdge
	 * @generated
	 */
	EClass getDiagramEdge();

	/**
	 * Returns the meta object for the reference '{@link CDP4.DiagramData.DiagramEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CDP4.DiagramData.DiagramEdge#getSource()
	 * @see #getDiagramEdge()
	 * @generated
	 */
	EReference getDiagramEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link CDP4.DiagramData.DiagramEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see CDP4.DiagramData.DiagramEdge#getTarget()
	 * @see #getDiagramEdge()
	 * @generated
	 */
	EReference getDiagramEdge_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link CDP4.DiagramData.DiagramEdge#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see CDP4.DiagramData.DiagramEdge#getPoint()
	 * @see #getDiagramEdge()
	 * @generated
	 */
	EReference getDiagramEdge_Point();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.DiagramShape <em>Diagram Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Shape</em>'.
	 * @see CDP4.DiagramData.DiagramShape
	 * @generated
	 */
	EClass getDiagramShape();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.DiagramObject <em>Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Object</em>'.
	 * @see CDP4.DiagramData.DiagramObject
	 * @generated
	 */
	EClass getDiagramObject();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagramObject#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see CDP4.DiagramData.DiagramObject#getResolution()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link CDP4.DiagramData.DiagramObject#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see CDP4.DiagramData.DiagramObject#getDocumentation()
	 * @see #getDiagramObject()
	 * @generated
	 */
	EAttribute getDiagramObject_Documentation();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.DiagramCanvas <em>Diagram Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Canvas</em>'.
	 * @see CDP4.DiagramData.DiagramCanvas
	 * @generated
	 */
	EClass getDiagramCanvas();

	/**
	 * Returns the meta object for class '{@link CDP4.DiagramData.SharedStyle <em>Shared Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Style</em>'.
	 * @see CDP4.DiagramData.SharedStyle
	 * @generated
	 */
	EClass getSharedStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramDataFactory getDiagramDataFactory();

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
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.DiagramElementThingImpl <em>Diagram Element Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.DiagramElementThingImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramElementThing()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT_THING = eINSTANCE.getDiagramElementThing();

		/**
		 * The meta object literal for the '<em><b>Depicted Thing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT_THING__DEPICTED_THING = eINSTANCE.getDiagramElementThing_DepictedThing();

		/**
		 * The meta object literal for the '<em><b>Local Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT_THING__LOCAL_STYLE = eINSTANCE.getDiagramElementThing_LocalStyle();

		/**
		 * The meta object literal for the '<em><b>Shared Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT_THING__SHARED_STYLE = eINSTANCE.getDiagramElementThing_SharedStyle();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.DiagramElementContainerImpl <em>Diagram Element Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.DiagramElementContainerImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramElementContainer()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT_CONTAINER = eINSTANCE.getDiagramElementContainer();

		/**
		 * The meta object literal for the '<em><b>Diagram Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT = eINSTANCE.getDiagramElementContainer_DiagramElement();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT_CONTAINER__BOUNDS = eINSTANCE.getDiagramElementContainer_Bounds();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.DiagramThingBaseImpl <em>Diagram Thing Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.DiagramThingBaseImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramThingBase()
		 * @generated
		 */
		EClass DIAGRAM_THING_BASE = eINSTANCE.getDiagramThingBase();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.BoundsImpl <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.BoundsImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.OwnedStyleImpl <em>Owned Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.OwnedStyleImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getOwnedStyle()
		 * @generated
		 */
		EClass OWNED_STYLE = eINSTANCE.getOwnedStyle();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.DiagrammingStyleImpl <em>Diagramming Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.DiagrammingStyleImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagrammingStyle()
		 * @generated
		 */
		EClass DIAGRAMMING_STYLE = eINSTANCE.getDiagrammingStyle();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMMING_STYLE__FILL_COLOR = eINSTANCE.getDiagrammingStyle_FillColor();

		/**
		 * The meta object literal for the '<em><b>Fill Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__FILL_OPACITY = eINSTANCE.getDiagrammingStyle_FillOpacity();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__STROKE_WIDTH = eINSTANCE.getDiagrammingStyle_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Stroke Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__STROKE_OPACITY = eINSTANCE.getDiagrammingStyle_StrokeOpacity();

		/**
		 * The meta object literal for the '<em><b>Stroke Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMMING_STYLE__STROKE_COLOR = eINSTANCE.getDiagrammingStyle_StrokeColor();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__FONT_SIZE = eINSTANCE.getDiagrammingStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__FONT_NAME = eINSTANCE.getDiagrammingStyle_FontName();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMMING_STYLE__FONT_COLOR = eINSTANCE.getDiagrammingStyle_FontColor();

		/**
		 * The meta object literal for the '<em><b>Font Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__FONT_ITALIC = eINSTANCE.getDiagrammingStyle_FontItalic();

		/**
		 * The meta object literal for the '<em><b>Font Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__FONT_BOLD = eINSTANCE.getDiagrammingStyle_FontBold();

		/**
		 * The meta object literal for the '<em><b>Font Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__FONT_UNDERLINE = eINSTANCE.getDiagrammingStyle_FontUnderline();

		/**
		 * The meta object literal for the '<em><b>Font Stroke Through</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMMING_STYLE__FONT_STROKE_THROUGH = eINSTANCE.getDiagrammingStyle_FontStrokeThrough();

		/**
		 * The meta object literal for the '<em><b>Used Color</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMMING_STYLE__USED_COLOR = eINSTANCE.getDiagrammingStyle_UsedColor();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.ColorImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.PointImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.DiagramEdgeImpl <em>Diagram Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.DiagramEdgeImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramEdge()
		 * @generated
		 */
		EClass DIAGRAM_EDGE = eINSTANCE.getDiagramEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EDGE__SOURCE = eINSTANCE.getDiagramEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EDGE__TARGET = eINSTANCE.getDiagramEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_EDGE__POINT = eINSTANCE.getDiagramEdge_Point();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.DiagramShapeImpl <em>Diagram Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.DiagramShapeImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramShape()
		 * @generated
		 */
		EClass DIAGRAM_SHAPE = eINSTANCE.getDiagramShape();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.DiagramObjectImpl <em>Diagram Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.DiagramObjectImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramObject()
		 * @generated
		 */
		EClass DIAGRAM_OBJECT = eINSTANCE.getDiagramObject();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__RESOLUTION = eINSTANCE.getDiagramObject_Resolution();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_OBJECT__DOCUMENTATION = eINSTANCE.getDiagramObject_Documentation();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.DiagramCanvasImpl <em>Diagram Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.DiagramCanvasImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getDiagramCanvas()
		 * @generated
		 */
		EClass DIAGRAM_CANVAS = eINSTANCE.getDiagramCanvas();

		/**
		 * The meta object literal for the '{@link CDP4.DiagramData.impl.SharedStyleImpl <em>Shared Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CDP4.DiagramData.impl.SharedStyleImpl
		 * @see CDP4.DiagramData.impl.DiagramDataPackageImpl#getSharedStyle()
		 * @generated
		 */
		EClass SHARED_STYLE = eINSTANCE.getSharedStyle();

	}

} //DiagramDataPackage
