/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.ActualFiniteState;
import CDP4.EngineeringModelData.ActualFiniteStateList;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.Option;
import CDP4.EngineeringModelData.OptionDependentThing;
import CDP4.EngineeringModelData.OwnedThing;
import CDP4.EngineeringModelData.PossibleFiniteStateList;

import CDP4.SiteDirectoryData.DomainOfExpertise;

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
 * An implementation of the model object '<em><b>Actual Finite State List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl#getExcludeOption <em>Exclude Option</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl#getPossibleFiniteStateList <em>Possible Finite State List</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ActualFiniteStateListImpl#getActualState <em>Actual State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActualFiniteStateListImpl extends ThingImpl implements ActualFiniteStateList {
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
	 * The cached value of the '{@link #getExcludeOption() <em>Exclude Option</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeOption()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> excludeOption;

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
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPossibleFiniteStateList() <em>Possible Finite State List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleFiniteStateList()
	 * @generated
	 * @ordered
	 */
	protected EList<PossibleFiniteStateList> possibleFiniteStateList;

	/**
	 * The cached value of the '{@link #getActualState() <em>Actual State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualState()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualFiniteState> actualState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActualFiniteStateListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.ACTUAL_FINITE_STATE_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getExcludeOption() {
		if (excludeOption == null) {
			excludeOption = new EObjectResolvingEList<Option>(Option.class, this, EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__EXCLUDE_OPTION);
		}
		return excludeOption;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PossibleFiniteStateList> getPossibleFiniteStateList() {
		if (possibleFiniteStateList == null) {
			possibleFiniteStateList = new EObjectResolvingEList<PossibleFiniteStateList>(PossibleFiniteStateList.class, this, EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__POSSIBLE_FINITE_STATE_LIST);
		}
		return possibleFiniteStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualFiniteState> getActualState() {
		if (actualState == null) {
			actualState = new EObjectContainmentEList<ActualFiniteState>(ActualFiniteState.class, this, EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE);
		}
		return actualState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE:
				return ((InternalEList<?>)getActualState()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__NAME:
				return getName();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__EXCLUDE_OPTION:
				return getExcludeOption();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__SHORT_NAME:
				return getShortName();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__POSSIBLE_FINITE_STATE_LIST:
				return getPossibleFiniteStateList();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE:
				return getActualState();
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
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__NAME:
				setName((String)newValue);
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__EXCLUDE_OPTION:
				getExcludeOption().clear();
				getExcludeOption().addAll((Collection<? extends Option>)newValue);
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__POSSIBLE_FINITE_STATE_LIST:
				getPossibleFiniteStateList().clear();
				getPossibleFiniteStateList().addAll((Collection<? extends PossibleFiniteStateList>)newValue);
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE:
				getActualState().clear();
				getActualState().addAll((Collection<? extends ActualFiniteState>)newValue);
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
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__EXCLUDE_OPTION:
				getExcludeOption().clear();
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__POSSIBLE_FINITE_STATE_LIST:
				getPossibleFiniteStateList().clear();
				return;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE:
				getActualState().clear();
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
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__EXCLUDE_OPTION:
				return excludeOption != null && !excludeOption.isEmpty();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__POSSIBLE_FINITE_STATE_LIST:
				return possibleFiniteStateList != null && !possibleFiniteStateList.isEmpty();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE:
				return actualState != null && !actualState.isEmpty();
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
				case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == OptionDependentThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__EXCLUDE_OPTION: return EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
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
				case CommonDataPackage.NAMED_THING__NAME: return EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__NAME;
				default: return -1;
			}
		}
		if (baseClass == OptionDependentThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION: return EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__EXCLUDE_OPTION;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__OWNER;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST__SHORT_NAME;
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
		result.append(", shortName: ");
		result.append(shortName);
		result.append(')');
		return result.toString();
	}

} //ActualFiniteStateListImpl
