/**
 */
package CDP4.DiagramData.impl;

import CDP4.DiagramData.Bounds;
import CDP4.DiagramData.DiagramDataPackage;
import CDP4.DiagramData.DiagramElementContainer;
import CDP4.DiagramData.DiagramElementThing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.impl.DiagramElementContainerImpl#getDiagramElement <em>Diagram Element</em>}</li>
 *   <li>{@link CDP4.DiagramData.impl.DiagramElementContainerImpl#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementContainerImpl extends DiagramThingBaseImpl implements DiagramElementContainer {
	/**
	 * The cached value of the '{@link #getDiagramElement() <em>Diagram Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElementThing> diagramElement;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramDataPackage.Literals.DIAGRAM_ELEMENT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramElementThing> getDiagramElement() {
		if (diagramElement == null) {
			diagramElement = new EObjectContainmentEList<DiagramElementThing>(DiagramElementThing.class, this, DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT);
		}
		return diagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS, oldBounds, newBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Bounds newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT:
				return ((InternalEList<?>)getDiagramElement()).basicRemove(otherEnd, msgs);
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS:
				return basicSetBounds(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT:
				return getDiagramElement();
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS:
				return getBounds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT:
				getDiagramElement().clear();
				getDiagramElement().addAll((Collection<? extends DiagramElementThing>)newValue);
				return;
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS:
				setBounds((Bounds)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT:
				getDiagramElement().clear();
				return;
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS:
				setBounds((Bounds)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__DIAGRAM_ELEMENT:
				return diagramElement != null && !diagramElement.isEmpty();
			case DiagramDataPackage.DIAGRAM_ELEMENT_CONTAINER__BOUNDS:
				return bounds != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramElementContainerImpl
