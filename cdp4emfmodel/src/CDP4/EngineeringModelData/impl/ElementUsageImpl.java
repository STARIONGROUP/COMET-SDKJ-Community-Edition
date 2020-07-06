/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.ElementDefinition;
import CDP4.EngineeringModelData.ElementUsage;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.InterfaceEndKind;
import CDP4.EngineeringModelData.Option;
import CDP4.EngineeringModelData.OptionDependentThing;
import CDP4.EngineeringModelData.ParameterOverride;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ElementUsageImpl#getExcludeOption <em>Exclude Option</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ElementUsageImpl#getElementDefinition <em>Element Definition</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ElementUsageImpl#getInterfaceEnd <em>Interface End</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ElementUsageImpl#getParameterOverride <em>Parameter Override</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementUsageImpl extends ElementBaseImpl implements ElementUsage {
	/**
	 * The cached value of the '{@link #getExcludeOption() <em>Exclude Option</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeOption()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> excludeOption;

	/**
	 * The cached value of the '{@link #getElementDefinition() <em>Element Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementDefinition()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinition elementDefinition;

	/**
	 * The default value of the '{@link #getInterfaceEnd() <em>Interface End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceEnd()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceEndKind INTERFACE_END_EDEFAULT = InterfaceEndKind.NONE;

	/**
	 * The cached value of the '{@link #getInterfaceEnd() <em>Interface End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceEnd()
	 * @generated
	 * @ordered
	 */
	protected InterfaceEndKind interfaceEnd = INTERFACE_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterOverride() <em>Parameter Override</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterOverride()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterOverride> parameterOverride;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.ELEMENT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getExcludeOption() {
		if (excludeOption == null) {
			excludeOption = new EObjectResolvingEList<Option>(Option.class, this, EngineeringModelDataPackage.ELEMENT_USAGE__EXCLUDE_OPTION);
		}
		return excludeOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition getElementDefinition() {
		if (elementDefinition != null && elementDefinition.eIsProxy()) {
			InternalEObject oldElementDefinition = (InternalEObject)elementDefinition;
			elementDefinition = (ElementDefinition)eResolveProxy(oldElementDefinition);
			if (elementDefinition != oldElementDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.ELEMENT_USAGE__ELEMENT_DEFINITION, oldElementDefinition, elementDefinition));
			}
		}
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition basicGetElementDefinition() {
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementDefinition(ElementDefinition newElementDefinition) {
		ElementDefinition oldElementDefinition = elementDefinition;
		elementDefinition = newElementDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ELEMENT_USAGE__ELEMENT_DEFINITION, oldElementDefinition, elementDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceEndKind getInterfaceEnd() {
		return interfaceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceEnd(InterfaceEndKind newInterfaceEnd) {
		InterfaceEndKind oldInterfaceEnd = interfaceEnd;
		interfaceEnd = newInterfaceEnd == null ? INTERFACE_END_EDEFAULT : newInterfaceEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ELEMENT_USAGE__INTERFACE_END, oldInterfaceEnd, interfaceEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterOverride> getParameterOverride() {
		if (parameterOverride == null) {
			parameterOverride = new EObjectContainmentEList<ParameterOverride>(ParameterOverride.class, this, EngineeringModelDataPackage.ELEMENT_USAGE__PARAMETER_OVERRIDE);
		}
		return parameterOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.ELEMENT_USAGE__PARAMETER_OVERRIDE:
				return ((InternalEList<?>)getParameterOverride()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.ELEMENT_USAGE__EXCLUDE_OPTION:
				return getExcludeOption();
			case EngineeringModelDataPackage.ELEMENT_USAGE__ELEMENT_DEFINITION:
				if (resolve) return getElementDefinition();
				return basicGetElementDefinition();
			case EngineeringModelDataPackage.ELEMENT_USAGE__INTERFACE_END:
				return getInterfaceEnd();
			case EngineeringModelDataPackage.ELEMENT_USAGE__PARAMETER_OVERRIDE:
				return getParameterOverride();
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
			case EngineeringModelDataPackage.ELEMENT_USAGE__EXCLUDE_OPTION:
				getExcludeOption().clear();
				getExcludeOption().addAll((Collection<? extends Option>)newValue);
				return;
			case EngineeringModelDataPackage.ELEMENT_USAGE__ELEMENT_DEFINITION:
				setElementDefinition((ElementDefinition)newValue);
				return;
			case EngineeringModelDataPackage.ELEMENT_USAGE__INTERFACE_END:
				setInterfaceEnd((InterfaceEndKind)newValue);
				return;
			case EngineeringModelDataPackage.ELEMENT_USAGE__PARAMETER_OVERRIDE:
				getParameterOverride().clear();
				getParameterOverride().addAll((Collection<? extends ParameterOverride>)newValue);
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
			case EngineeringModelDataPackage.ELEMENT_USAGE__EXCLUDE_OPTION:
				getExcludeOption().clear();
				return;
			case EngineeringModelDataPackage.ELEMENT_USAGE__ELEMENT_DEFINITION:
				setElementDefinition((ElementDefinition)null);
				return;
			case EngineeringModelDataPackage.ELEMENT_USAGE__INTERFACE_END:
				setInterfaceEnd(INTERFACE_END_EDEFAULT);
				return;
			case EngineeringModelDataPackage.ELEMENT_USAGE__PARAMETER_OVERRIDE:
				getParameterOverride().clear();
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
			case EngineeringModelDataPackage.ELEMENT_USAGE__EXCLUDE_OPTION:
				return excludeOption != null && !excludeOption.isEmpty();
			case EngineeringModelDataPackage.ELEMENT_USAGE__ELEMENT_DEFINITION:
				return elementDefinition != null;
			case EngineeringModelDataPackage.ELEMENT_USAGE__INTERFACE_END:
				return interfaceEnd != INTERFACE_END_EDEFAULT;
			case EngineeringModelDataPackage.ELEMENT_USAGE__PARAMETER_OVERRIDE:
				return parameterOverride != null && !parameterOverride.isEmpty();
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
		if (baseClass == OptionDependentThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.ELEMENT_USAGE__EXCLUDE_OPTION: return EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION;
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
		if (baseClass == OptionDependentThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION: return EngineeringModelDataPackage.ELEMENT_USAGE__EXCLUDE_OPTION;
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
		result.append(" (interfaceEnd: ");
		result.append(interfaceEnd);
		result.append(')');
		return result.toString();
	}

} //ElementUsageImpl
