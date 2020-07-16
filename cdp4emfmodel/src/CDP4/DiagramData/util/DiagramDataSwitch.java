/**
 */
package CDP4.DiagramData.util;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.DiagramData.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CDP4.DiagramData.DiagramDataPackage
 * @generated
 */
public class DiagramDataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDataSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramDataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING: {
				DiagramElementThing diagramElementThing = (DiagramElementThing)theEObject;
				T result = caseDiagramElementThing(diagramElementThing);
				if (result == null) result = caseDiagramElementContainer(diagramElementThing);
				if (result == null) result = caseDiagramThingBase(diagramElementThing);
				if (result == null) result = caseThing(diagramElementThing);
				if (result == null) result = caseNamedThing(diagramElementThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER: {
				DiagramElementContainer diagramElementContainer = (DiagramElementContainer)theEObject;
				T result = caseDiagramElementContainer(diagramElementContainer);
				if (result == null) result = caseDiagramThingBase(diagramElementContainer);
				if (result == null) result = caseThing(diagramElementContainer);
				if (result == null) result = caseNamedThing(diagramElementContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.DIAGRAM_THING_BASE: {
				DiagramThingBase diagramThingBase = (DiagramThingBase)theEObject;
				T result = caseDiagramThingBase(diagramThingBase);
				if (result == null) result = caseThing(diagramThingBase);
				if (result == null) result = caseNamedThing(diagramThingBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.BOUNDS: {
				Bounds bounds = (Bounds)theEObject;
				T result = caseBounds(bounds);
				if (result == null) result = caseDiagramThingBase(bounds);
				if (result == null) result = caseThing(bounds);
				if (result == null) result = caseNamedThing(bounds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.OWNED_STYLE: {
				OwnedStyle ownedStyle = (OwnedStyle)theEObject;
				T result = caseOwnedStyle(ownedStyle);
				if (result == null) result = caseDiagrammingStyle(ownedStyle);
				if (result == null) result = caseDiagramThingBase(ownedStyle);
				if (result == null) result = caseThing(ownedStyle);
				if (result == null) result = caseNamedThing(ownedStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.DIAGRAMMING_STYLE: {
				DiagrammingStyle diagrammingStyle = (DiagrammingStyle)theEObject;
				T result = caseDiagrammingStyle(diagrammingStyle);
				if (result == null) result = caseDiagramThingBase(diagrammingStyle);
				if (result == null) result = caseThing(diagrammingStyle);
				if (result == null) result = caseNamedThing(diagrammingStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.COLOR: {
				Color color = (Color)theEObject;
				T result = caseColor(color);
				if (result == null) result = caseDiagramThingBase(color);
				if (result == null) result = caseThing(color);
				if (result == null) result = caseNamedThing(color);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = caseDiagramThingBase(point);
				if (result == null) result = caseThing(point);
				if (result == null) result = caseNamedThing(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.DIAGRAM_EDGE: {
				DiagramEdge diagramEdge = (DiagramEdge)theEObject;
				T result = caseDiagramEdge(diagramEdge);
				if (result == null) result = caseDiagramElementThing(diagramEdge);
				if (result == null) result = caseDiagramElementContainer(diagramEdge);
				if (result == null) result = caseDiagramThingBase(diagramEdge);
				if (result == null) result = caseThing(diagramEdge);
				if (result == null) result = caseNamedThing(diagramEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.DIAGRAM_SHAPE: {
				DiagramShape diagramShape = (DiagramShape)theEObject;
				T result = caseDiagramShape(diagramShape);
				if (result == null) result = caseDiagramElementThing(diagramShape);
				if (result == null) result = caseDiagramElementContainer(diagramShape);
				if (result == null) result = caseDiagramThingBase(diagramShape);
				if (result == null) result = caseThing(diagramShape);
				if (result == null) result = caseNamedThing(diagramShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.DIAGRAM_OBJECT: {
				DiagramObject diagramObject = (DiagramObject)theEObject;
				T result = caseDiagramObject(diagramObject);
				if (result == null) result = caseDiagramShape(diagramObject);
				if (result == null) result = caseDiagramElementThing(diagramObject);
				if (result == null) result = caseDiagramElementContainer(diagramObject);
				if (result == null) result = caseDiagramThingBase(diagramObject);
				if (result == null) result = caseThing(diagramObject);
				if (result == null) result = caseNamedThing(diagramObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.DIAGRAM_CANVAS: {
				DiagramCanvas diagramCanvas = (DiagramCanvas)theEObject;
				T result = caseDiagramCanvas(diagramCanvas);
				if (result == null) result = caseDiagramElementContainer(diagramCanvas);
				if (result == null) result = caseTimeStampedThing(diagramCanvas);
				if (result == null) result = caseDiagramThingBase(diagramCanvas);
				if (result == null) result = caseThing(diagramCanvas);
				if (result == null) result = caseNamedThing(diagramCanvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramDataPackage.SHARED_STYLE: {
				SharedStyle sharedStyle = (SharedStyle)theEObject;
				T result = caseSharedStyle(sharedStyle);
				if (result == null) result = caseDiagrammingStyle(sharedStyle);
				if (result == null) result = caseDiagramThingBase(sharedStyle);
				if (result == null) result = caseThing(sharedStyle);
				if (result == null) result = caseNamedThing(sharedStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElementThing(DiagramElementThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElementContainer(DiagramElementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Thing Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Thing Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramThingBase(DiagramThingBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBounds(Bounds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owned Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owned Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnedStyle(OwnedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagramming Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagramming Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagrammingStyle(DiagrammingStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColor(Color object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramEdge(DiagramEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramShape(DiagramShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramObject(DiagramObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramCanvas(DiagramCanvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedStyle(SharedStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedThing(NamedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamped Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamped Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStampedThing(TimeStampedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiagramDataSwitch
