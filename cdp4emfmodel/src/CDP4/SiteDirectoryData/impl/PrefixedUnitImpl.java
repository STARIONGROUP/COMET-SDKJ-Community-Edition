/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.PrefixedUnit;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.UnitPrefix;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefixed Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PrefixedUnitImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrefixedUnitImpl extends ConversionBasedUnitImpl implements PrefixedUnit {
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected UnitPrefix prefix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefixedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.PREFIXED_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPrefix getPrefix() {
		if (prefix != null && prefix.eIsProxy()) {
			InternalEObject oldPrefix = (InternalEObject)prefix;
			prefix = (UnitPrefix)eResolveProxy(oldPrefix);
			if (prefix != oldPrefix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PREFIXED_UNIT__PREFIX, oldPrefix, prefix));
			}
		}
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPrefix basicGetPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(UnitPrefix newPrefix) {
		UnitPrefix oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PREFIXED_UNIT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PREFIXED_UNIT__PREFIX:
				if (resolve) return getPrefix();
				return basicGetPrefix();
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
			case SiteDirectoryDataPackage.PREFIXED_UNIT__PREFIX:
				setPrefix((UnitPrefix)newValue);
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
			case SiteDirectoryDataPackage.PREFIXED_UNIT__PREFIX:
				setPrefix((UnitPrefix)null);
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
			case SiteDirectoryDataPackage.PREFIXED_UNIT__PREFIX:
				return prefix != null;
		}
		return super.eIsSet(featureID);
	}

} //PrefixedUnitImpl
