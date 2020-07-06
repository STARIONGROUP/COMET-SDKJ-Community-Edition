/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.ActualFiniteState;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.Option;
import CDP4.EngineeringModelData.OwnedThing;
import CDP4.EngineeringModelData.ParameterSwitchKind;
import CDP4.EngineeringModelData.ParameterValueSetBase;

import CDP4.SiteDirectoryData.DomainOfExpertise;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value Set Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getValueSwitch <em>Value Switch</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getPublished <em>Published</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getComputed <em>Computed</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getManual <em>Manual</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getActualState <em>Actual State</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterValueSetBaseImpl#getActualOption <em>Actual Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterValueSetBaseImpl extends ThingImpl implements ParameterValueSetBase {
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
	 * The default value of the '{@link #getValueSwitch() <em>Value Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSwitch()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterSwitchKind VALUE_SWITCH_EDEFAULT = ParameterSwitchKind.COMPUTED;

	/**
	 * The cached value of the '{@link #getValueSwitch() <em>Value Switch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSwitch()
	 * @generated
	 * @ordered
	 */
	protected ParameterSwitchKind valueSwitch = VALUE_SWITCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublished() <em>Published</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected EList<String> published;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected EList<String> formula;

	/**
	 * The cached value of the '{@link #getComputed() <em>Computed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputed()
	 * @generated
	 * @ordered
	 */
	protected EList<String> computed;

	/**
	 * The cached value of the '{@link #getManual() <em>Manual</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManual()
	 * @generated
	 * @ordered
	 */
	protected EList<String> manual;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<String> reference;

	/**
	 * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actualValue;

	/**
	 * The cached value of the '{@link #getActualState() <em>Actual State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualState()
	 * @generated
	 * @ordered
	 */
	protected ActualFiniteState actualState;

	/**
	 * The cached value of the '{@link #getActualOption() <em>Actual Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOption()
	 * @generated
	 * @ordered
	 */
	protected Option actualOption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueSetBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.PARAMETER_VALUE_SET_BASE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSwitchKind getValueSwitch() {
		return valueSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSwitch(ParameterSwitchKind newValueSwitch) {
		ParameterSwitchKind oldValueSwitch = valueSwitch;
		valueSwitch = newValueSwitch == null ? VALUE_SWITCH_EDEFAULT : newValueSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__VALUE_SWITCH, oldValueSwitch, valueSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPublished() {
		if (published == null) {
			published = new EDataTypeEList<String>(String.class, this, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__PUBLISHED);
		}
		return published;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormula() {
		if (formula == null) {
			formula = new EDataTypeEList<String>(String.class, this, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__FORMULA);
		}
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComputed() {
		if (computed == null) {
			computed = new EDataTypeEList<String>(String.class, this, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__COMPUTED);
		}
		return computed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getManual() {
		if (manual == null) {
			manual = new EDataTypeEList<String>(String.class, this, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__MANUAL);
		}
		return manual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReference() {
		if (reference == null) {
			reference = new EDataTypeEList<String>(String.class, this, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getActualValue() {
		if (actualValue == null) {
			actualValue = new EDataTypeEList<String>(String.class, this, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE);
		}
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFiniteState getActualState() {
		if (actualState != null && actualState.eIsProxy()) {
			InternalEObject oldActualState = (InternalEObject)actualState;
			actualState = (ActualFiniteState)eResolveProxy(oldActualState);
			if (actualState != oldActualState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_STATE, oldActualState, actualState));
			}
		}
		return actualState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFiniteState basicGetActualState() {
		return actualState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualState(ActualFiniteState newActualState) {
		ActualFiniteState oldActualState = actualState;
		actualState = newActualState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_STATE, oldActualState, actualState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getActualOption() {
		if (actualOption != null && actualOption.eIsProxy()) {
			InternalEObject oldActualOption = (InternalEObject)actualOption;
			actualOption = (Option)eResolveProxy(oldActualOption);
			if (actualOption != oldActualOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION, oldActualOption, actualOption));
			}
		}
		return actualOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option basicGetActualOption() {
		return actualOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualOption(Option newActualOption) {
		Option oldActualOption = actualOption;
		actualOption = newActualOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION, oldActualOption, actualOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__VALUE_SWITCH:
				return getValueSwitch();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__PUBLISHED:
				return getPublished();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__FORMULA:
				return getFormula();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__COMPUTED:
				return getComputed();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__MANUAL:
				return getManual();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__REFERENCE:
				return getReference();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE:
				return getActualValue();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_STATE:
				if (resolve) return getActualState();
				return basicGetActualState();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION:
				if (resolve) return getActualOption();
				return basicGetActualOption();
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
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__VALUE_SWITCH:
				setValueSwitch((ParameterSwitchKind)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__PUBLISHED:
				getPublished().clear();
				getPublished().addAll((Collection<? extends String>)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__FORMULA:
				getFormula().clear();
				getFormula().addAll((Collection<? extends String>)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__COMPUTED:
				getComputed().clear();
				getComputed().addAll((Collection<? extends String>)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__MANUAL:
				getManual().clear();
				getManual().addAll((Collection<? extends String>)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends String>)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE:
				getActualValue().clear();
				getActualValue().addAll((Collection<? extends String>)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_STATE:
				setActualState((ActualFiniteState)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION:
				setActualOption((Option)newValue);
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
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__VALUE_SWITCH:
				setValueSwitch(VALUE_SWITCH_EDEFAULT);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__PUBLISHED:
				getPublished().clear();
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__FORMULA:
				getFormula().clear();
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__COMPUTED:
				getComputed().clear();
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__MANUAL:
				getManual().clear();
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__REFERENCE:
				getReference().clear();
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE:
				getActualValue().clear();
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_STATE:
				setActualState((ActualFiniteState)null);
				return;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION:
				setActualOption((Option)null);
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
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__VALUE_SWITCH:
				return valueSwitch != VALUE_SWITCH_EDEFAULT;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__PUBLISHED:
				return published != null && !published.isEmpty();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__FORMULA:
				return formula != null && !formula.isEmpty();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__COMPUTED:
				return computed != null && !computed.isEmpty();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__MANUAL:
				return manual != null && !manual.isEmpty();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__REFERENCE:
				return reference != null && !reference.isEmpty();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE:
				return actualValue != null && !actualValue.isEmpty();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_STATE:
				return actualState != null;
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION:
				return actualOption != null;
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
				case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
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
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE__OWNER;
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
		result.append(" (valueSwitch: ");
		result.append(valueSwitch);
		result.append(", published: ");
		result.append(published);
		result.append(", formula: ");
		result.append(formula);
		result.append(", computed: ");
		result.append(computed);
		result.append(", manual: ");
		result.append(manual);
		result.append(", reference: ");
		result.append(reference);
		result.append(", actualValue: ");
		result.append(actualValue);
		result.append(')');
		return result.toString();
	}

} //ParameterValueSetBaseImpl
