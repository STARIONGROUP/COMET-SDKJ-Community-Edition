/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.MappingToReferenceScale;
import CDP4.SiteDirectoryData.ScaleValueDefinition;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping To Reference Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MappingToReferenceScaleImpl#getReferenceScaleValue <em>Reference Scale Value</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MappingToReferenceScaleImpl#getDependentScaleValue <em>Dependent Scale Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingToReferenceScaleImpl extends ThingImpl implements MappingToReferenceScale {
	/**
	 * The cached value of the '{@link #getReferenceScaleValue() <em>Reference Scale Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceScaleValue()
	 * @generated
	 * @ordered
	 */
	protected ScaleValueDefinition referenceScaleValue;

	/**
	 * The cached value of the '{@link #getDependentScaleValue() <em>Dependent Scale Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentScaleValue()
	 * @generated
	 * @ordered
	 */
	protected ScaleValueDefinition dependentScaleValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingToReferenceScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.MAPPING_TO_REFERENCE_SCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleValueDefinition getReferenceScaleValue() {
		if (referenceScaleValue != null && referenceScaleValue.eIsProxy()) {
			InternalEObject oldReferenceScaleValue = (InternalEObject)referenceScaleValue;
			referenceScaleValue = (ScaleValueDefinition)eResolveProxy(oldReferenceScaleValue);
			if (referenceScaleValue != oldReferenceScaleValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE, oldReferenceScaleValue, referenceScaleValue));
			}
		}
		return referenceScaleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleValueDefinition basicGetReferenceScaleValue() {
		return referenceScaleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceScaleValue(ScaleValueDefinition newReferenceScaleValue) {
		ScaleValueDefinition oldReferenceScaleValue = referenceScaleValue;
		referenceScaleValue = newReferenceScaleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE, oldReferenceScaleValue, referenceScaleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleValueDefinition getDependentScaleValue() {
		if (dependentScaleValue != null && dependentScaleValue.eIsProxy()) {
			InternalEObject oldDependentScaleValue = (InternalEObject)dependentScaleValue;
			dependentScaleValue = (ScaleValueDefinition)eResolveProxy(oldDependentScaleValue);
			if (dependentScaleValue != oldDependentScaleValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE, oldDependentScaleValue, dependentScaleValue));
			}
		}
		return dependentScaleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleValueDefinition basicGetDependentScaleValue() {
		return dependentScaleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentScaleValue(ScaleValueDefinition newDependentScaleValue) {
		ScaleValueDefinition oldDependentScaleValue = dependentScaleValue;
		dependentScaleValue = newDependentScaleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE, oldDependentScaleValue, dependentScaleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE:
				if (resolve) return getReferenceScaleValue();
				return basicGetReferenceScaleValue();
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE:
				if (resolve) return getDependentScaleValue();
				return basicGetDependentScaleValue();
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
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE:
				setReferenceScaleValue((ScaleValueDefinition)newValue);
				return;
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE:
				setDependentScaleValue((ScaleValueDefinition)newValue);
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
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE:
				setReferenceScaleValue((ScaleValueDefinition)null);
				return;
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE:
				setDependentScaleValue((ScaleValueDefinition)null);
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
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE:
				return referenceScaleValue != null;
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE:
				return dependentScaleValue != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingToReferenceScaleImpl
