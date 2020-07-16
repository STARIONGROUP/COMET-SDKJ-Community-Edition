/**
 */
package CDP4.DiagramData.impl;

import CDP4.CommonData.Thing;

import CDP4.DiagramData.DiagramDataPackage;
import CDP4.DiagramData.DiagramElementThing;
import CDP4.DiagramData.OwnedStyle;
import CDP4.DiagramData.SharedStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.impl.DiagramElementThingImpl#getDepictedThing <em>Depicted Thing</em>}</li>
 *   <li>{@link CDP4.DiagramData.impl.DiagramElementThingImpl#getLocalStyle <em>Local Style</em>}</li>
 *   <li>{@link CDP4.DiagramData.impl.DiagramElementThingImpl#getSharedStyle <em>Shared Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementThingImpl extends DiagramElementContainerImpl implements DiagramElementThing {
	/**
	 * The cached value of the '{@link #getDepictedThing() <em>Depicted Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepictedThing()
	 * @generated
	 * @ordered
	 */
	protected Thing depictedThing;

	/**
	 * The cached value of the '{@link #getLocalStyle() <em>Local Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalStyle()
	 * @generated
	 * @ordered
	 */
	protected OwnedStyle localStyle;

	/**
	 * The cached value of the '{@link #getSharedStyle() <em>Shared Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedStyle()
	 * @generated
	 * @ordered
	 */
	protected SharedStyle sharedStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramDataPackage.Literals.DIAGRAM_ELEMENT_THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing getDepictedThing() {
		if (depictedThing != null && depictedThing.eIsProxy()) {
			InternalEObject oldDepictedThing = (InternalEObject)depictedThing;
			depictedThing = (Thing)eResolveProxy(oldDepictedThing);
			if (depictedThing != oldDepictedThing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramDataPackage.DIAGRAM_ELEMENT_THING__DEPICTED_THING, oldDepictedThing, depictedThing));
			}
		}
		return depictedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing basicGetDepictedThing() {
		return depictedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepictedThing(Thing newDepictedThing) {
		Thing oldDepictedThing = depictedThing;
		depictedThing = newDepictedThing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramDataPackage.DIAGRAM_ELEMENT_THING__DEPICTED_THING, oldDepictedThing, depictedThing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedStyle getLocalStyle() {
		return localStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalStyle(OwnedStyle newLocalStyle, NotificationChain msgs) {
		OwnedStyle oldLocalStyle = localStyle;
		localStyle = newLocalStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE, oldLocalStyle, newLocalStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalStyle(OwnedStyle newLocalStyle) {
		if (newLocalStyle != localStyle) {
			NotificationChain msgs = null;
			if (localStyle != null)
				msgs = ((InternalEObject)localStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE, null, msgs);
			if (newLocalStyle != null)
				msgs = ((InternalEObject)newLocalStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE, null, msgs);
			msgs = basicSetLocalStyle(newLocalStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE, newLocalStyle, newLocalStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedStyle getSharedStyle() {
		if (sharedStyle != null && sharedStyle.eIsProxy()) {
			InternalEObject oldSharedStyle = (InternalEObject)sharedStyle;
			sharedStyle = (SharedStyle)eResolveProxy(oldSharedStyle);
			if (sharedStyle != oldSharedStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramDataPackage.DIAGRAM_ELEMENT_THING__SHARED_STYLE, oldSharedStyle, sharedStyle));
			}
		}
		return sharedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedStyle basicGetSharedStyle() {
		return sharedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedStyle(SharedStyle newSharedStyle) {
		SharedStyle oldSharedStyle = sharedStyle;
		sharedStyle = newSharedStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramDataPackage.DIAGRAM_ELEMENT_THING__SHARED_STYLE, oldSharedStyle, sharedStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE:
				return basicSetLocalStyle(null, msgs);
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
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__DEPICTED_THING:
				if (resolve) return getDepictedThing();
				return basicGetDepictedThing();
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE:
				return getLocalStyle();
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__SHARED_STYLE:
				if (resolve) return getSharedStyle();
				return basicGetSharedStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__DEPICTED_THING:
				setDepictedThing((Thing)newValue);
				return;
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE:
				setLocalStyle((OwnedStyle)newValue);
				return;
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__SHARED_STYLE:
				setSharedStyle((SharedStyle)newValue);
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
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__DEPICTED_THING:
				setDepictedThing((Thing)null);
				return;
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE:
				setLocalStyle((OwnedStyle)null);
				return;
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__SHARED_STYLE:
				setSharedStyle((SharedStyle)null);
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
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__DEPICTED_THING:
				return depictedThing != null;
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__LOCAL_STYLE:
				return localStyle != null;
			case DiagramDataPackage.DIAGRAM_ELEMENT_THING__SHARED_STYLE:
				return sharedStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramElementThingImpl
