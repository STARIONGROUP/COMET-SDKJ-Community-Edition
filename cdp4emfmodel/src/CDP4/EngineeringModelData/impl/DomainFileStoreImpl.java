/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.DomainFileStore;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain File Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.DomainFileStoreImpl#getIsHidden <em>Is Hidden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainFileStoreImpl extends FileStoreImpl implements DomainFileStore {
	/**
	 * The default value of the '{@link #getIsHidden() <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHidden()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_HIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsHidden() <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHidden()
	 * @generated
	 * @ordered
	 */
	protected Boolean isHidden = IS_HIDDEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainFileStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.DOMAIN_FILE_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsHidden() {
		return isHidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHidden(Boolean newIsHidden) {
		Boolean oldIsHidden = isHidden;
		isHidden = newIsHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.DOMAIN_FILE_STORE__IS_HIDDEN, oldIsHidden, isHidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.DOMAIN_FILE_STORE__IS_HIDDEN:
				return getIsHidden();
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
			case EngineeringModelDataPackage.DOMAIN_FILE_STORE__IS_HIDDEN:
				setIsHidden((Boolean)newValue);
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
			case EngineeringModelDataPackage.DOMAIN_FILE_STORE__IS_HIDDEN:
				setIsHidden(IS_HIDDEN_EDEFAULT);
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
			case EngineeringModelDataPackage.DOMAIN_FILE_STORE__IS_HIDDEN:
				return IS_HIDDEN_EDEFAULT == null ? isHidden != null : !IS_HIDDEN_EDEFAULT.equals(isHidden);
		}
		return super.eIsSet(featureID);
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
		result.append(" (isHidden: ");
		result.append(isHidden);
		result.append(')');
		return result.toString();
	}

} //DomainFileStoreImpl
