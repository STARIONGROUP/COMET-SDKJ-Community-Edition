/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.ActualFiniteStateList;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.OwnedThing;
import CDP4.EngineeringModelData.ParameterBase;
import CDP4.EngineeringModelData.ParameterGroup;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.ParameterType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterBaseImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterBaseImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterBaseImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterBaseImpl#getStateDependence <em>State Dependence</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterBaseImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterBaseImpl#getIsOptionDependent <em>Is Option Dependent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterBaseImpl extends ThingImpl implements ParameterBase {
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
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType parameterType;

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
	 * The cached value of the '{@link #getStateDependence() <em>State Dependence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDependence()
	 * @generated
	 * @ordered
	 */
	protected ActualFiniteStateList stateDependence;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected ParameterGroup group;

	/**
	 * The default value of the '{@link #getIsOptionDependent() <em>Is Option Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOptionDependent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_OPTION_DEPENDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOptionDependent() <em>Is Option Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOptionDependent()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOptionDependent = IS_OPTION_DEPENDENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.PARAMETER_BASE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_BASE__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_BASE__OWNER, oldOwner, owner));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_BASE__PARAMETER_TYPE, oldParameterType, parameterType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_BASE__PARAMETER_TYPE, oldParameterType, parameterType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_BASE__SCALE, oldScale, scale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_BASE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFiniteStateList getStateDependence() {
		if (stateDependence != null && stateDependence.eIsProxy()) {
			InternalEObject oldStateDependence = (InternalEObject)stateDependence;
			stateDependence = (ActualFiniteStateList)eResolveProxy(oldStateDependence);
			if (stateDependence != oldStateDependence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_BASE__STATE_DEPENDENCE, oldStateDependence, stateDependence));
			}
		}
		return stateDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFiniteStateList basicGetStateDependence() {
		return stateDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateDependence(ActualFiniteStateList newStateDependence) {
		ActualFiniteStateList oldStateDependence = stateDependence;
		stateDependence = newStateDependence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_BASE__STATE_DEPENDENCE, oldStateDependence, stateDependence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (ParameterGroup)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_BASE__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(ParameterGroup newGroup) {
		ParameterGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_BASE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOptionDependent() {
		return isOptionDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptionDependent(Boolean newIsOptionDependent) {
		Boolean oldIsOptionDependent = isOptionDependent;
		isOptionDependent = newIsOptionDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_BASE__IS_OPTION_DEPENDENT, oldIsOptionDependent, isOptionDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.PARAMETER_BASE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.PARAMETER_BASE__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
			case EngineeringModelDataPackage.PARAMETER_BASE__SCALE:
				if (resolve) return getScale();
				return basicGetScale();
			case EngineeringModelDataPackage.PARAMETER_BASE__STATE_DEPENDENCE:
				if (resolve) return getStateDependence();
				return basicGetStateDependence();
			case EngineeringModelDataPackage.PARAMETER_BASE__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case EngineeringModelDataPackage.PARAMETER_BASE__IS_OPTION_DEPENDENT:
				return getIsOptionDependent();
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
			case EngineeringModelDataPackage.PARAMETER_BASE__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__PARAMETER_TYPE:
				setParameterType((ParameterType)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__SCALE:
				setScale((MeasurementScale)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__STATE_DEPENDENCE:
				setStateDependence((ActualFiniteStateList)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__GROUP:
				setGroup((ParameterGroup)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__IS_OPTION_DEPENDENT:
				setIsOptionDependent((Boolean)newValue);
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
			case EngineeringModelDataPackage.PARAMETER_BASE__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__PARAMETER_TYPE:
				setParameterType((ParameterType)null);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__SCALE:
				setScale((MeasurementScale)null);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__STATE_DEPENDENCE:
				setStateDependence((ActualFiniteStateList)null);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__GROUP:
				setGroup((ParameterGroup)null);
				return;
			case EngineeringModelDataPackage.PARAMETER_BASE__IS_OPTION_DEPENDENT:
				setIsOptionDependent(IS_OPTION_DEPENDENT_EDEFAULT);
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
			case EngineeringModelDataPackage.PARAMETER_BASE__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.PARAMETER_BASE__PARAMETER_TYPE:
				return parameterType != null;
			case EngineeringModelDataPackage.PARAMETER_BASE__SCALE:
				return scale != null;
			case EngineeringModelDataPackage.PARAMETER_BASE__STATE_DEPENDENCE:
				return stateDependence != null;
			case EngineeringModelDataPackage.PARAMETER_BASE__GROUP:
				return group != null;
			case EngineeringModelDataPackage.PARAMETER_BASE__IS_OPTION_DEPENDENT:
				return IS_OPTION_DEPENDENT_EDEFAULT == null ? isOptionDependent != null : !IS_OPTION_DEPENDENT_EDEFAULT.equals(isOptionDependent);
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
				case EngineeringModelDataPackage.PARAMETER_BASE__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
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
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.PARAMETER_BASE__OWNER;
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
		result.append(" (isOptionDependent: ");
		result.append(isOptionDependent);
		result.append(')');
		return result.toString();
	}

} //ParameterBaseImpl
