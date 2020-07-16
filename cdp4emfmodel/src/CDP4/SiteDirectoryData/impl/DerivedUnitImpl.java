/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.DerivedUnit;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.UnitFactor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.DerivedUnitImpl#getUnitFactor <em>Unit Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedUnitImpl extends MeasurementUnitImpl implements DerivedUnit {
	/**
	 * The cached value of the '{@link #getUnitFactor() <em>Unit Factor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitFactor> unitFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.DERIVED_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitFactor> getUnitFactor() {
		if (unitFactor == null) {
			unitFactor = new EObjectContainmentEList<UnitFactor>(UnitFactor.class, this, SiteDirectoryDataPackage.DERIVED_UNIT__UNIT_FACTOR);
		}
		return unitFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.DERIVED_UNIT__UNIT_FACTOR:
				return ((InternalEList<?>)getUnitFactor()).basicRemove(otherEnd, msgs);
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
			case SiteDirectoryDataPackage.DERIVED_UNIT__UNIT_FACTOR:
				return getUnitFactor();
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
			case SiteDirectoryDataPackage.DERIVED_UNIT__UNIT_FACTOR:
				getUnitFactor().clear();
				getUnitFactor().addAll((Collection<? extends UnitFactor>)newValue);
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
			case SiteDirectoryDataPackage.DERIVED_UNIT__UNIT_FACTOR:
				getUnitFactor().clear();
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
			case SiteDirectoryDataPackage.DERIVED_UNIT__UNIT_FACTOR:
				return unitFactor != null && !unitFactor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivedUnitImpl
