/**
 */
package CDP4.DiagramData.impl;

import CDP4.DiagramData.*;

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
public class DiagramDataFactoryImpl extends EFactoryImpl implements DiagramDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramDataFactory init() {
		try {
			DiagramDataFactory theDiagramDataFactory = (DiagramDataFactory)EPackage.Registry.INSTANCE.getEFactory(DiagramDataPackage.eNS_URI);
			if (theDiagramDataFactory != null) {
				return theDiagramDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDataFactoryImpl() {
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
			case DiagramDataPackage.BOUNDS: return createBounds();
			case DiagramDataPackage.OWNED_STYLE: return createOwnedStyle();
			case DiagramDataPackage.COLOR: return createColor();
			case DiagramDataPackage.POINT: return createPoint();
			case DiagramDataPackage.DIAGRAM_EDGE: return createDiagramEdge();
			case DiagramDataPackage.DIAGRAM_OBJECT: return createDiagramObject();
			case DiagramDataPackage.DIAGRAM_CANVAS: return createDiagramCanvas();
			case DiagramDataPackage.SHARED_STYLE: return createSharedStyle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds createBounds() {
		BoundsImpl bounds = new BoundsImpl();
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedStyle createOwnedStyle() {
		OwnedStyleImpl ownedStyle = new OwnedStyleImpl();
		return ownedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramEdge createDiagramEdge() {
		DiagramEdgeImpl diagramEdge = new DiagramEdgeImpl();
		return diagramEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramObject createDiagramObject() {
		DiagramObjectImpl diagramObject = new DiagramObjectImpl();
		return diagramObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramCanvas createDiagramCanvas() {
		DiagramCanvasImpl diagramCanvas = new DiagramCanvasImpl();
		return diagramCanvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedStyle createSharedStyle() {
		SharedStyleImpl sharedStyle = new SharedStyleImpl();
		return sharedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDataPackage getDiagramDataPackage() {
		return (DiagramDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramDataPackage getPackage() {
		return DiagramDataPackage.eINSTANCE;
	}

} //DiagramDataFactoryImpl
