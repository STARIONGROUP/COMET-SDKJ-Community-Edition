/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.DerivedQuantityKind;
import CDP4.SiteDirectoryData.QuantityKindFactor;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Quantity Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.DerivedQuantityKindImpl#getQuantityKindFactor <em>Quantity Kind Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedQuantityKindImpl extends QuantityKindImpl implements DerivedQuantityKind {
	/**
	 * The cached value of the '{@link #getQuantityKindFactor() <em>Quantity Kind Factor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityKindFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityKindFactor> quantityKindFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedQuantityKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.DERIVED_QUANTITY_KIND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantityKindFactor> getQuantityKindFactor() {
		if (quantityKindFactor == null) {
			quantityKindFactor = new EObjectContainmentEList<QuantityKindFactor>(QuantityKindFactor.class, this, SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR);
		}
		return quantityKindFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR:
				return ((InternalEList<?>)getQuantityKindFactor()).basicRemove(otherEnd, msgs);
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
			case SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR:
				return getQuantityKindFactor();
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
			case SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR:
				getQuantityKindFactor().clear();
				getQuantityKindFactor().addAll((Collection<? extends QuantityKindFactor>)newValue);
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
			case SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR:
				getQuantityKindFactor().clear();
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
			case SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR:
				return quantityKindFactor != null && !quantityKindFactor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivedQuantityKindImpl
