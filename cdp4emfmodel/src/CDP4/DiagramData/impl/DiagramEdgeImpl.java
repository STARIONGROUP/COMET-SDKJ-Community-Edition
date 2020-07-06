/**
 */
package CDP4.DiagramData.impl;

import CDP4.DiagramData.DiagramDataPackage;
import CDP4.DiagramData.DiagramEdge;
import CDP4.DiagramData.DiagramElementThing;
import CDP4.DiagramData.Point;

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
 * An implementation of the model object '<em><b>Diagram Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.impl.DiagramEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link CDP4.DiagramData.impl.DiagramEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link CDP4.DiagramData.impl.DiagramEdgeImpl#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramEdgeImpl extends DiagramElementThingImpl implements DiagramEdge {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DiagramElementThing source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DiagramElementThing target;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> point;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramDataPackage.Literals.DIAGRAM_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementThing getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (DiagramElementThing)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramDataPackage.DIAGRAM_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementThing basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DiagramElementThing newSource) {
		DiagramElementThing oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramDataPackage.DIAGRAM_EDGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementThing getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (DiagramElementThing)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramDataPackage.DIAGRAM_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElementThing basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DiagramElementThing newTarget) {
		DiagramElementThing oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramDataPackage.DIAGRAM_EDGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getPoint() {
		if (point == null) {
			point = new EObjectContainmentEList<Point>(Point.class, this, DiagramDataPackage.DIAGRAM_EDGE__POINT);
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramDataPackage.DIAGRAM_EDGE__POINT:
				return ((InternalEList<?>)getPoint()).basicRemove(otherEnd, msgs);
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
			case DiagramDataPackage.DIAGRAM_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DiagramDataPackage.DIAGRAM_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DiagramDataPackage.DIAGRAM_EDGE__POINT:
				return getPoint();
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
			case DiagramDataPackage.DIAGRAM_EDGE__SOURCE:
				setSource((DiagramElementThing)newValue);
				return;
			case DiagramDataPackage.DIAGRAM_EDGE__TARGET:
				setTarget((DiagramElementThing)newValue);
				return;
			case DiagramDataPackage.DIAGRAM_EDGE__POINT:
				getPoint().clear();
				getPoint().addAll((Collection<? extends Point>)newValue);
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
			case DiagramDataPackage.DIAGRAM_EDGE__SOURCE:
				setSource((DiagramElementThing)null);
				return;
			case DiagramDataPackage.DIAGRAM_EDGE__TARGET:
				setTarget((DiagramElementThing)null);
				return;
			case DiagramDataPackage.DIAGRAM_EDGE__POINT:
				getPoint().clear();
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
			case DiagramDataPackage.DIAGRAM_EDGE__SOURCE:
				return source != null;
			case DiagramDataPackage.DIAGRAM_EDGE__TARGET:
				return target != null;
			case DiagramDataPackage.DIAGRAM_EDGE__POINT:
				return point != null && !point.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramEdgeImpl
