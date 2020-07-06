/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.IdCorrespondence;
import CDP4.EngineeringModelData.OwnedThing;

import CDP4.SiteDirectoryData.DomainOfExpertise;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.IdCorrespondenceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IdCorrespondenceImpl#getInternalThing <em>Internal Thing</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.IdCorrespondenceImpl#getExternalId <em>External Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdCorrespondenceImpl extends ThingImpl implements IdCorrespondence {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected DomainOfExpertise owner;

	/**
	 * The default value of the '{@link #getInternalThing() <em>Internal Thing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalThing()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_THING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalThing() <em>Internal Thing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalThing()
	 * @generated
	 * @ordered
	 */
	protected String internalThing = INTERNAL_THING_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected String externalId = EXTERNAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.ID_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (DomainOfExpertise)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.ID_CORRESPONDENCE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(DomainOfExpertise newOwner) {
		DomainOfExpertise oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ID_CORRESPONDENCE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalThing() {
		return internalThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalThing(String newInternalThing) {
		String oldInternalThing = internalThing;
		internalThing = newInternalThing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ID_CORRESPONDENCE__INTERNAL_THING, oldInternalThing, internalThing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalId() {
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalId(String newExternalId) {
		String oldExternalId = externalId;
		externalId = newExternalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ID_CORRESPONDENCE__EXTERNAL_ID, oldExternalId, externalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__INTERNAL_THING:
				return getInternalThing();
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__EXTERNAL_ID:
				return getExternalId();
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
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__INTERNAL_THING:
				setInternalThing((String)newValue);
				return;
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__EXTERNAL_ID:
				setExternalId((String)newValue);
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
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__INTERNAL_THING:
				setInternalThing(INTERNAL_THING_EDEFAULT);
				return;
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__EXTERNAL_ID:
				setExternalId(EXTERNAL_ID_EDEFAULT);
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
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__INTERNAL_THING:
				return INTERNAL_THING_EDEFAULT == null ? internalThing != null : !INTERNAL_THING_EDEFAULT.equals(internalThing);
			case EngineeringModelDataPackage.ID_CORRESPONDENCE__EXTERNAL_ID:
				return EXTERNAL_ID_EDEFAULT == null ? externalId != null : !EXTERNAL_ID_EDEFAULT.equals(externalId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OwnedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.ID_CORRESPONDENCE__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OwnedThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.ID_CORRESPONDENCE__OWNER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (internalThing: ");
		result.append(internalThing);
		result.append(", externalId: ");
		result.append(externalId);
		result.append(')');
		return result.toString();
	}

} //IdCorrespondenceImpl
