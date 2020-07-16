/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.DeprecatableThing;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.SiteDirectoryData.MappingToReferenceScale;
import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.MeasurementUnit;
import CDP4.SiteDirectoryData.NumberSetKind;
import CDP4.SiteDirectoryData.ScaleValueDefinition;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

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
 * An implementation of the model object '<em><b>Measurement Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getNumberSet <em>Number Set</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getMinimumPermissibleValue <em>Minimum Permissible Value</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getIsMinimumInclusive <em>Is Minimum Inclusive</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getMaximumPermissibleValue <em>Maximum Permissible Value</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getIsMaximumInclusive <em>Is Maximum Inclusive</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getPositiveValueConnotation <em>Positive Value Connotation</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getNegativeValueConnotation <em>Negative Value Connotation</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MeasurementScaleImpl#getMappingToReferenceScale <em>Mapping To Reference Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeasurementScaleImpl extends DefinedThingImpl implements MeasurementScale {
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
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected MeasurementUnit unit;

	/**
	 * The cached value of the '{@link #getValueDefinition() <em>Value Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ScaleValueDefinition> valueDefinition;

	/**
	 * The default value of the '{@link #getNumberSet() <em>Number Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSet()
	 * @generated
	 * @ordered
	 */
	protected static final NumberSetKind NUMBER_SET_EDEFAULT = NumberSetKind.NATURAL_NUMBER_SET;

	/**
	 * The cached value of the '{@link #getNumberSet() <em>Number Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSet()
	 * @generated
	 * @ordered
	 */
	protected NumberSetKind numberSet = NUMBER_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumPermissibleValue() <em>Minimum Permissible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPermissibleValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_PERMISSIBLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumPermissibleValue() <em>Minimum Permissible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPermissibleValue()
	 * @generated
	 * @ordered
	 */
	protected String minimumPermissibleValue = MINIMUM_PERMISSIBLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMinimumInclusive() <em>Is Minimum Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMinimumInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MINIMUM_INCLUSIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMinimumInclusive() <em>Is Minimum Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMinimumInclusive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMinimumInclusive = IS_MINIMUM_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumPermissibleValue() <em>Maximum Permissible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPermissibleValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_PERMISSIBLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumPermissibleValue() <em>Maximum Permissible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPermissibleValue()
	 * @generated
	 * @ordered
	 */
	protected String maximumPermissibleValue = MAXIMUM_PERMISSIBLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMaximumInclusive() <em>Is Maximum Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMaximumInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MAXIMUM_INCLUSIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMaximumInclusive() <em>Is Maximum Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMaximumInclusive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMaximumInclusive = IS_MAXIMUM_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositiveValueConnotation() <em>Positive Value Connotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveValueConnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_VALUE_CONNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositiveValueConnotation() <em>Positive Value Connotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveValueConnotation()
	 * @generated
	 * @ordered
	 */
	protected String positiveValueConnotation = POSITIVE_VALUE_CONNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegativeValueConnotation() <em>Negative Value Connotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeValueConnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGATIVE_VALUE_CONNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegativeValueConnotation() <em>Negative Value Connotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeValueConnotation()
	 * @generated
	 * @ordered
	 */
	protected String negativeValueConnotation = NEGATIVE_VALUE_CONNOTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappingToReferenceScale() <em>Mapping To Reference Scale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingToReferenceScale()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingToReferenceScale> mappingToReferenceScale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.MEASUREMENT_SCALE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_DEPRECATED, oldIsDeprecated, isDeprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (MeasurementUnit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.MEASUREMENT_SCALE__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(MeasurementUnit newUnit) {
		MeasurementUnit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScaleValueDefinition> getValueDefinition() {
		if (valueDefinition == null) {
			valueDefinition = new EObjectContainmentEList<ScaleValueDefinition>(ScaleValueDefinition.class, this, SiteDirectoryDataPackage.MEASUREMENT_SCALE__VALUE_DEFINITION);
		}
		return valueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberSetKind getNumberSet() {
		return numberSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberSet(NumberSetKind newNumberSet) {
		NumberSetKind oldNumberSet = numberSet;
		numberSet = newNumberSet == null ? NUMBER_SET_EDEFAULT : newNumberSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__NUMBER_SET, oldNumberSet, numberSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumPermissibleValue() {
		return minimumPermissibleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumPermissibleValue(String newMinimumPermissibleValue) {
		String oldMinimumPermissibleValue = minimumPermissibleValue;
		minimumPermissibleValue = newMinimumPermissibleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE, oldMinimumPermissibleValue, minimumPermissibleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMinimumInclusive() {
		return isMinimumInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMinimumInclusive(Boolean newIsMinimumInclusive) {
		Boolean oldIsMinimumInclusive = isMinimumInclusive;
		isMinimumInclusive = newIsMinimumInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE, oldIsMinimumInclusive, isMinimumInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumPermissibleValue() {
		return maximumPermissibleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPermissibleValue(String newMaximumPermissibleValue) {
		String oldMaximumPermissibleValue = maximumPermissibleValue;
		maximumPermissibleValue = newMaximumPermissibleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE, oldMaximumPermissibleValue, maximumPermissibleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMaximumInclusive() {
		return isMaximumInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMaximumInclusive(Boolean newIsMaximumInclusive) {
		Boolean oldIsMaximumInclusive = isMaximumInclusive;
		isMaximumInclusive = newIsMaximumInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE, oldIsMaximumInclusive, isMaximumInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositiveValueConnotation() {
		return positiveValueConnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveValueConnotation(String newPositiveValueConnotation) {
		String oldPositiveValueConnotation = positiveValueConnotation;
		positiveValueConnotation = newPositiveValueConnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION, oldPositiveValueConnotation, positiveValueConnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegativeValueConnotation() {
		return negativeValueConnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativeValueConnotation(String newNegativeValueConnotation) {
		String oldNegativeValueConnotation = negativeValueConnotation;
		negativeValueConnotation = newNegativeValueConnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION, oldNegativeValueConnotation, negativeValueConnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingToReferenceScale> getMappingToReferenceScale() {
		if (mappingToReferenceScale == null) {
			mappingToReferenceScale = new EObjectContainmentEList<MappingToReferenceScale>(MappingToReferenceScale.class, this, SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE);
		}
		return mappingToReferenceScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__VALUE_DEFINITION:
				return ((InternalEList<?>)getValueDefinition()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE:
				return ((InternalEList<?>)getMappingToReferenceScale()).basicRemove(otherEnd, msgs);
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
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_DEPRECATED:
				return getIsDeprecated();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__VALUE_DEFINITION:
				return getValueDefinition();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__NUMBER_SET:
				return getNumberSet();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE:
				return getMinimumPermissibleValue();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE:
				return getIsMinimumInclusive();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE:
				return getMaximumPermissibleValue();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE:
				return getIsMaximumInclusive();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION:
				return getPositiveValueConnotation();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION:
				return getNegativeValueConnotation();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE:
				return getMappingToReferenceScale();
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
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__UNIT:
				setUnit((MeasurementUnit)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__VALUE_DEFINITION:
				getValueDefinition().clear();
				getValueDefinition().addAll((Collection<? extends ScaleValueDefinition>)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__NUMBER_SET:
				setNumberSet((NumberSetKind)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE:
				setMinimumPermissibleValue((String)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE:
				setIsMinimumInclusive((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE:
				setMaximumPermissibleValue((String)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE:
				setIsMaximumInclusive((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION:
				setPositiveValueConnotation((String)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION:
				setNegativeValueConnotation((String)newValue);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE:
				getMappingToReferenceScale().clear();
				getMappingToReferenceScale().addAll((Collection<? extends MappingToReferenceScale>)newValue);
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
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_DEPRECATED:
				setIsDeprecated(IS_DEPRECATED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__UNIT:
				setUnit((MeasurementUnit)null);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__VALUE_DEFINITION:
				getValueDefinition().clear();
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__NUMBER_SET:
				setNumberSet(NUMBER_SET_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE:
				setMinimumPermissibleValue(MINIMUM_PERMISSIBLE_VALUE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE:
				setIsMinimumInclusive(IS_MINIMUM_INCLUSIVE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE:
				setMaximumPermissibleValue(MAXIMUM_PERMISSIBLE_VALUE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE:
				setIsMaximumInclusive(IS_MAXIMUM_INCLUSIVE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION:
				setPositiveValueConnotation(POSITIVE_VALUE_CONNOTATION_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION:
				setNegativeValueConnotation(NEGATIVE_VALUE_CONNOTATION_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE:
				getMappingToReferenceScale().clear();
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
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_DEPRECATED:
				return IS_DEPRECATED_EDEFAULT == null ? isDeprecated != null : !IS_DEPRECATED_EDEFAULT.equals(isDeprecated);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__UNIT:
				return unit != null;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__VALUE_DEFINITION:
				return valueDefinition != null && !valueDefinition.isEmpty();
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__NUMBER_SET:
				return numberSet != NUMBER_SET_EDEFAULT;
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE:
				return MINIMUM_PERMISSIBLE_VALUE_EDEFAULT == null ? minimumPermissibleValue != null : !MINIMUM_PERMISSIBLE_VALUE_EDEFAULT.equals(minimumPermissibleValue);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE:
				return IS_MINIMUM_INCLUSIVE_EDEFAULT == null ? isMinimumInclusive != null : !IS_MINIMUM_INCLUSIVE_EDEFAULT.equals(isMinimumInclusive);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE:
				return MAXIMUM_PERMISSIBLE_VALUE_EDEFAULT == null ? maximumPermissibleValue != null : !MAXIMUM_PERMISSIBLE_VALUE_EDEFAULT.equals(maximumPermissibleValue);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE:
				return IS_MAXIMUM_INCLUSIVE_EDEFAULT == null ? isMaximumInclusive != null : !IS_MAXIMUM_INCLUSIVE_EDEFAULT.equals(isMaximumInclusive);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION:
				return POSITIVE_VALUE_CONNOTATION_EDEFAULT == null ? positiveValueConnotation != null : !POSITIVE_VALUE_CONNOTATION_EDEFAULT.equals(positiveValueConnotation);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION:
				return NEGATIVE_VALUE_CONNOTATION_EDEFAULT == null ? negativeValueConnotation != null : !NEGATIVE_VALUE_CONNOTATION_EDEFAULT.equals(negativeValueConnotation);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE:
				return mappingToReferenceScale != null && !mappingToReferenceScale.isEmpty();
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
				case SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_DEPRECATED: return CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED;
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
				case CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED: return SiteDirectoryDataPackage.MEASUREMENT_SCALE__IS_DEPRECATED;
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
		result.append(", numberSet: ");
		result.append(numberSet);
		result.append(", minimumPermissibleValue: ");
		result.append(minimumPermissibleValue);
		result.append(", isMinimumInclusive: ");
		result.append(isMinimumInclusive);
		result.append(", maximumPermissibleValue: ");
		result.append(maximumPermissibleValue);
		result.append(", isMaximumInclusive: ");
		result.append(isMaximumInclusive);
		result.append(", positiveValueConnotation: ");
		result.append(positiveValueConnotation);
		result.append(", negativeValueConnotation: ");
		result.append(negativeValueConnotation);
		result.append(')');
		return result.toString();
	}

} //MeasurementScaleImpl
