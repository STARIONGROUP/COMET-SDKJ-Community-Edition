/**
 */
package CDP4.DiagramData.util;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.DiagramData.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.DiagramData.DiagramDataPackage
 * @generated
 */
public class DiagramDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiagramDataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramDataSwitch<Adapter> modelSwitch =
		new DiagramDataSwitch<Adapter>() {
			@Override
			public Adapter caseDiagramElementThing(DiagramElementThing object) {
				return createDiagramElementThingAdapter();
			}
			@Override
			public Adapter caseDiagramElementContainer(DiagramElementContainer object) {
				return createDiagramElementContainerAdapter();
			}
			@Override
			public Adapter caseDiagramThingBase(DiagramThingBase object) {
				return createDiagramThingBaseAdapter();
			}
			@Override
			public Adapter caseBounds(Bounds object) {
				return createBoundsAdapter();
			}
			@Override
			public Adapter caseOwnedStyle(OwnedStyle object) {
				return createOwnedStyleAdapter();
			}
			@Override
			public Adapter caseDiagrammingStyle(DiagrammingStyle object) {
				return createDiagrammingStyleAdapter();
			}
			@Override
			public Adapter caseColor(Color object) {
				return createColorAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseDiagramEdge(DiagramEdge object) {
				return createDiagramEdgeAdapter();
			}
			@Override
			public Adapter caseDiagramShape(DiagramShape object) {
				return createDiagramShapeAdapter();
			}
			@Override
			public Adapter caseDiagramObject(DiagramObject object) {
				return createDiagramObjectAdapter();
			}
			@Override
			public Adapter caseDiagramCanvas(DiagramCanvas object) {
				return createDiagramCanvasAdapter();
			}
			@Override
			public Adapter caseSharedStyle(SharedStyle object) {
				return createSharedStyleAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter caseNamedThing(NamedThing object) {
				return createNamedThingAdapter();
			}
			@Override
			public Adapter caseTimeStampedThing(TimeStampedThing object) {
				return createTimeStampedThingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.DiagramElementThing <em>Diagram Element Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.DiagramElementThing
	 * @generated
	 */
	public Adapter createDiagramElementThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.DiagramElementContainer <em>Diagram Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.DiagramElementContainer
	 * @generated
	 */
	public Adapter createDiagramElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.DiagramThingBase <em>Diagram Thing Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.DiagramThingBase
	 * @generated
	 */
	public Adapter createDiagramThingBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.Bounds
	 * @generated
	 */
	public Adapter createBoundsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.OwnedStyle <em>Owned Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.OwnedStyle
	 * @generated
	 */
	public Adapter createOwnedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.DiagrammingStyle <em>Diagramming Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.DiagrammingStyle
	 * @generated
	 */
	public Adapter createDiagrammingStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.DiagramEdge <em>Diagram Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.DiagramEdge
	 * @generated
	 */
	public Adapter createDiagramEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.DiagramShape <em>Diagram Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.DiagramShape
	 * @generated
	 */
	public Adapter createDiagramShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.DiagramObject <em>Diagram Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.DiagramObject
	 * @generated
	 */
	public Adapter createDiagramObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.DiagramCanvas <em>Diagram Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.DiagramCanvas
	 * @generated
	 */
	public Adapter createDiagramCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.DiagramData.SharedStyle <em>Shared Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.DiagramData.SharedStyle
	 * @generated
	 */
	public Adapter createSharedStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.NamedThing <em>Named Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.NamedThing
	 * @generated
	 */
	public Adapter createNamedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.TimeStampedThing <em>Time Stamped Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.TimeStampedThing
	 * @generated
	 */
	public Adapter createTimeStampedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiagramDataAdapterFactory
