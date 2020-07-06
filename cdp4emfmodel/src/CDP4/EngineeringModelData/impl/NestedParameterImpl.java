/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.VolatileThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.ActualFiniteState;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.NestedParameter;
import CDP4.EngineeringModelData.OwnedThing;
import CDP4.EngineeringModelData.ParameterBase;

import CDP4.SiteDirectoryData.DomainOfExpertise;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedParameterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedParameterImpl#getIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedParameterImpl#getAssociatedParameter <em>Associated Parameter</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedParameterImpl#getActualState <em>Actual State</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedParameterImpl#getPath <em>Path</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedParameterImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedParameterImpl#getActualValue <em>Actual Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedParameterImpl extends ThingImpl implements NestedParameter {
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
	 * The default value of the '{@link #getIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VOLATILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected Boolean isVolatile = IS_VOLATILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociatedParameter() <em>Associated Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedParameter()
	 * @generated
	 * @ordered
	 */
	protected ParameterBase associatedParameter;

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected String actualValue = ACTUAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.NESTED_PARAMETER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.NESTED_PARAMETER__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_PARAMETER__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVolatile() {
		return isVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVolatile(Boolean newIsVolatile) {
		Boolean oldIsVolatile = isVolatile;
		isVolatile = newIsVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_PARAMETER__IS_VOLATILE, oldIsVolatile, isVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBase getAssociatedParameter() {
		if (associatedParameter != null && associatedParameter.eIsProxy()) {
			InternalEObject oldAssociatedParameter = (InternalEObject)associatedParameter;
			associatedParameter = (ParameterBase)eResolveProxy(oldAssociatedParameter);
			if (associatedParameter != oldAssociatedParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.NESTED_PARAMETER__ASSOCIATED_PARAMETER, oldAssociatedParameter, associatedParameter));
			}
		}
		return associatedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBase basicGetAssociatedParameter() {
		return associatedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedParameter(ParameterBase newAssociatedParameter) {
		ParameterBase oldAssociatedParameter = associatedParameter;
		associatedParameter = newAssociatedParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_PARAMETER__ASSOCIATED_PARAMETER, oldAssociatedParameter, associatedParameter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_STATE, oldActualState, actualState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_STATE, oldActualState, actualState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_PARAMETER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_PARAMETER__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActualValue() {
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualValue(String newActualValue) {
		String oldActualValue = actualValue;
		actualValue = newActualValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_VALUE, oldActualValue, actualValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.NESTED_PARAMETER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.NESTED_PARAMETER__IS_VOLATILE:
				return getIsVolatile();
			case EngineeringModelDataPackage.NESTED_PARAMETER__ASSOCIATED_PARAMETER:
				if (resolve) return getAssociatedParameter();
				return basicGetAssociatedParameter();
			case EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_STATE:
				if (resolve) return getActualState();
				return basicGetActualState();
			case EngineeringModelDataPackage.NESTED_PARAMETER__PATH:
				return getPath();
			case EngineeringModelDataPackage.NESTED_PARAMETER__FORMULA:
				return getFormula();
			case EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_VALUE:
				return getActualValue();
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
			case EngineeringModelDataPackage.NESTED_PARAMETER__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__IS_VOLATILE:
				setIsVolatile((Boolean)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__ASSOCIATED_PARAMETER:
				setAssociatedParameter((ParameterBase)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_STATE:
				setActualState((ActualFiniteState)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__PATH:
				setPath((String)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__FORMULA:
				setFormula((String)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_VALUE:
				setActualValue((String)newValue);
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
			case EngineeringModelDataPackage.NESTED_PARAMETER__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__IS_VOLATILE:
				setIsVolatile(IS_VOLATILE_EDEFAULT);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__ASSOCIATED_PARAMETER:
				setAssociatedParameter((ParameterBase)null);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_STATE:
				setActualState((ActualFiniteState)null);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_VALUE:
				setActualValue(ACTUAL_VALUE_EDEFAULT);
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
			case EngineeringModelDataPackage.NESTED_PARAMETER__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.NESTED_PARAMETER__IS_VOLATILE:
				return IS_VOLATILE_EDEFAULT == null ? isVolatile != null : !IS_VOLATILE_EDEFAULT.equals(isVolatile);
			case EngineeringModelDataPackage.NESTED_PARAMETER__ASSOCIATED_PARAMETER:
				return associatedParameter != null;
			case EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_STATE:
				return actualState != null;
			case EngineeringModelDataPackage.NESTED_PARAMETER__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case EngineeringModelDataPackage.NESTED_PARAMETER__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case EngineeringModelDataPackage.NESTED_PARAMETER__ACTUAL_VALUE:
				return ACTUAL_VALUE_EDEFAULT == null ? actualValue != null : !ACTUAL_VALUE_EDEFAULT.equals(actualValue);
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
				case EngineeringModelDataPackage.NESTED_PARAMETER__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
				default: return -1;
			}
		}
		if (baseClass == VolatileThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.NESTED_PARAMETER__IS_VOLATILE: return CommonDataPackage.VOLATILE_THING__IS_VOLATILE;
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
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.NESTED_PARAMETER__OWNER;
				default: return -1;
			}
		}
		if (baseClass == VolatileThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.VOLATILE_THING__IS_VOLATILE: return EngineeringModelDataPackage.NESTED_PARAMETER__IS_VOLATILE;
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
		result.append(" (isVolatile: ");
		result.append(isVolatile);
		result.append(", path: ");
		result.append(path);
		result.append(", formula: ");
		result.append(formula);
		result.append(", actualValue: ");
		result.append(actualValue);
		result.append(')');
		return result.toString();
	}

} //NestedParameterImpl
