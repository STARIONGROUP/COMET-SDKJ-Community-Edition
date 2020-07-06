/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.DeprecatableThing;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.Constant;
import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.ParameterType;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ConstantImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ConstantImpl#getIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ConstantImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ConstantImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ConstantImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantImpl extends DefinedThingImpl implements Constant {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

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
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType parameterType;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected MeasurementScale scale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, SiteDirectoryDataPackage.CONSTANT__CATEGORY);
		}
		return category;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.CONSTANT__IS_DEPRECATED, oldIsDeprecated, isDeprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getParameterType() {
		if (parameterType != null && parameterType.eIsProxy()) {
			InternalEObject oldParameterType = (InternalEObject)parameterType;
			parameterType = (ParameterType)eResolveProxy(oldParameterType);
			if (parameterType != oldParameterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.CONSTANT__PARAMETER_TYPE, oldParameterType, parameterType));
			}
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType basicGetParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(ParameterType newParameterType) {
		ParameterType oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.CONSTANT__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValue() {
		if (value == null) {
			value = new EDataTypeEList<String>(String.class, this, SiteDirectoryDataPackage.CONSTANT__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementScale getScale() {
		if (scale != null && scale.eIsProxy()) {
			InternalEObject oldScale = (InternalEObject)scale;
			scale = (MeasurementScale)eResolveProxy(oldScale);
			if (scale != oldScale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.CONSTANT__SCALE, oldScale, scale));
			}
		}
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementScale basicGetScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(MeasurementScale newScale) {
		MeasurementScale oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.CONSTANT__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.CONSTANT__CATEGORY:
				return getCategory();
			case SiteDirectoryDataPackage.CONSTANT__IS_DEPRECATED:
				return getIsDeprecated();
			case SiteDirectoryDataPackage.CONSTANT__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
			case SiteDirectoryDataPackage.CONSTANT__VALUE:
				return getValue();
			case SiteDirectoryDataPackage.CONSTANT__SCALE:
				if (resolve) return getScale();
				return basicGetScale();
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
			case SiteDirectoryDataPackage.CONSTANT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SiteDirectoryDataPackage.CONSTANT__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.CONSTANT__PARAMETER_TYPE:
				setParameterType((ParameterType)newValue);
				return;
			case SiteDirectoryDataPackage.CONSTANT__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends String>)newValue);
				return;
			case SiteDirectoryDataPackage.CONSTANT__SCALE:
				setScale((MeasurementScale)newValue);
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
			case SiteDirectoryDataPackage.CONSTANT__CATEGORY:
				getCategory().clear();
				return;
			case SiteDirectoryDataPackage.CONSTANT__IS_DEPRECATED:
				setIsDeprecated(IS_DEPRECATED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.CONSTANT__PARAMETER_TYPE:
				setParameterType((ParameterType)null);
				return;
			case SiteDirectoryDataPackage.CONSTANT__VALUE:
				getValue().clear();
				return;
			case SiteDirectoryDataPackage.CONSTANT__SCALE:
				setScale((MeasurementScale)null);
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
			case SiteDirectoryDataPackage.CONSTANT__CATEGORY:
				return category != null && !category.isEmpty();
			case SiteDirectoryDataPackage.CONSTANT__IS_DEPRECATED:
				return IS_DEPRECATED_EDEFAULT == null ? isDeprecated != null : !IS_DEPRECATED_EDEFAULT.equals(isDeprecated);
			case SiteDirectoryDataPackage.CONSTANT__PARAMETER_TYPE:
				return parameterType != null;
			case SiteDirectoryDataPackage.CONSTANT__VALUE:
				return value != null && !value.isEmpty();
			case SiteDirectoryDataPackage.CONSTANT__SCALE:
				return scale != null;
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
		if (baseClass == CategorizableThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.CONSTANT__CATEGORY: return SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == DeprecatableThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.CONSTANT__IS_DEPRECATED: return CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED;
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
		if (baseClass == CategorizableThing.class) {
			switch (baseFeatureID) {
				case SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY: return SiteDirectoryDataPackage.CONSTANT__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == DeprecatableThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED: return SiteDirectoryDataPackage.CONSTANT__IS_DEPRECATED;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ConstantImpl
