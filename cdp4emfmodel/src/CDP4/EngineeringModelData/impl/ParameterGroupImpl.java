/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.ParameterGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterGroupImpl#getContainingGroup <em>Containing Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterGroupImpl extends ThingImpl implements ParameterGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainingGroup() <em>Containing Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingGroup()
	 * @generated
	 * @ordered
	 */
	protected ParameterGroup containingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.PARAMETER_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup getContainingGroup() {
		if (containingGroup != null && containingGroup.eIsProxy()) {
			InternalEObject oldContainingGroup = (InternalEObject)containingGroup;
			containingGroup = (ParameterGroup)eResolveProxy(oldContainingGroup);
			if (containingGroup != oldContainingGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_GROUP__CONTAINING_GROUP, oldContainingGroup, containingGroup));
			}
		}
		return containingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup basicGetContainingGroup() {
		return containingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingGroup(ParameterGroup newContainingGroup) {
		ParameterGroup oldContainingGroup = containingGroup;
		containingGroup = newContainingGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_GROUP__CONTAINING_GROUP, oldContainingGroup, containingGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.PARAMETER_GROUP__NAME:
				return getName();
			case EngineeringModelDataPackage.PARAMETER_GROUP__CONTAINING_GROUP:
				if (resolve) return getContainingGroup();
				return basicGetContainingGroup();
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
			case EngineeringModelDataPackage.PARAMETER_GROUP__NAME:
				setName((String)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_GROUP__CONTAINING_GROUP:
				setContainingGroup((ParameterGroup)newValue);
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
			case EngineeringModelDataPackage.PARAMETER_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.PARAMETER_GROUP__CONTAINING_GROUP:
				setContainingGroup((ParameterGroup)null);
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
			case EngineeringModelDataPackage.PARAMETER_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EngineeringModelDataPackage.PARAMETER_GROUP__CONTAINING_GROUP:
				return containingGroup != null;
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
		if (baseClass == NamedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.PARAMETER_GROUP__NAME: return CommonDataPackage.NAMED_THING__NAME;
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
		if (baseClass == NamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.NAMED_THING__NAME: return EngineeringModelDataPackage.PARAMETER_GROUP__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ParameterGroupImpl
