/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.ParticipantAccessRightKind;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.ParticipantPermission;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParticipantPermissionImpl#getIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParticipantPermissionImpl#getAccessRight <em>Access Right</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParticipantPermissionImpl#getObjectClass <em>Object Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantPermissionImpl extends ThingImpl implements ParticipantPermission {
	/**
	 * The default value of the '{@link #getIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDeprecated = IS_DEPRECATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessRight() <em>Access Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRight()
	 * @generated
	 * @ordered
	 */
	protected static final ParticipantAccessRightKind ACCESS_RIGHT_EDEFAULT = ParticipantAccessRightKind.NOT_APPLICABLE;

	/**
	 * The cached value of the '{@link #getAccessRight() <em>Access Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRight()
	 * @generated
	 * @ordered
	 */
	protected ParticipantAccessRightKind accessRight = ACCESS_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected String objectClass = OBJECT_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantPermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.PARTICIPANT_PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDeprecated() {
		return isDeprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeprecated(Boolean newIsDeprecated) {
		Boolean oldIsDeprecated = isDeprecated;
		isDeprecated = newIsDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__IS_DEPRECATED, oldIsDeprecated, isDeprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantAccessRightKind getAccessRight() {
		return accessRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessRight(ParticipantAccessRightKind newAccessRight) {
		ParticipantAccessRightKind oldAccessRight = accessRight;
		accessRight = newAccessRight == null ? ACCESS_RIGHT_EDEFAULT : newAccessRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__ACCESS_RIGHT, oldAccessRight, accessRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectClass() {
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectClass(String newObjectClass) {
		String oldObjectClass = objectClass;
		objectClass = newObjectClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__OBJECT_CLASS, oldObjectClass, objectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__IS_DEPRECATED:
				return getIsDeprecated();
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__ACCESS_RIGHT:
				return getAccessRight();
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__OBJECT_CLASS:
				return getObjectClass();
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
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__ACCESS_RIGHT:
				setAccessRight((ParticipantAccessRightKind)newValue);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__OBJECT_CLASS:
				setObjectClass((String)newValue);
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
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__IS_DEPRECATED:
				setIsDeprecated(IS_DEPRECATED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__ACCESS_RIGHT:
				setAccessRight(ACCESS_RIGHT_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__OBJECT_CLASS:
				setObjectClass(OBJECT_CLASS_EDEFAULT);
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
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__IS_DEPRECATED:
				return IS_DEPRECATED_EDEFAULT == null ? isDeprecated != null : !IS_DEPRECATED_EDEFAULT.equals(isDeprecated);
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__ACCESS_RIGHT:
				return accessRight != ACCESS_RIGHT_EDEFAULT;
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__OBJECT_CLASS:
				return OBJECT_CLASS_EDEFAULT == null ? objectClass != null : !OBJECT_CLASS_EDEFAULT.equals(objectClass);
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
		if (baseClass == DeprecatableThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__IS_DEPRECATED: return CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED;
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
		if (baseClass == DeprecatableThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED: return SiteDirectoryDataPackage.PARTICIPANT_PERMISSION__IS_DEPRECATED;
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
		result.append(" (isDeprecated: ");
		result.append(isDeprecated);
		result.append(", accessRight: ");
		result.append(accessRight);
		result.append(", objectClass: ");
		result.append(objectClass);
		result.append(')');
		return result.toString();
	}

} //ParticipantPermissionImpl
