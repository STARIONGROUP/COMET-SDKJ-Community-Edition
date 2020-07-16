/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.OwnedThing;
import CDP4.EngineeringModelData.PossibleFiniteState;
import CDP4.EngineeringModelData.PossibleFiniteStateList;

import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

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
 * An implementation of the model object '<em><b>Possible Finite State List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.PossibleFiniteStateListImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.PossibleFiniteStateListImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.PossibleFiniteStateListImpl#getPossibleState <em>Possible State</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.PossibleFiniteStateListImpl#getDefaultState <em>Default State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PossibleFiniteStateListImpl extends DefinedThingImpl implements PossibleFiniteStateList {
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
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected DomainOfExpertise owner;

	/**
	 * The cached value of the '{@link #getPossibleState() <em>Possible State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleState()
	 * @generated
	 * @ordered
	 */
	protected EList<PossibleFiniteState> possibleState;

	/**
	 * The cached value of the '{@link #getDefaultState() <em>Default State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultState()
	 * @generated
	 * @ordered
	 */
	protected PossibleFiniteState defaultState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossibleFiniteStateListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.POSSIBLE_FINITE_STATE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__CATEGORY);
		}
		return category;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PossibleFiniteState> getPossibleState() {
		if (possibleState == null) {
			possibleState = new EObjectContainmentEList<PossibleFiniteState>(PossibleFiniteState.class, this, EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE);
		}
		return possibleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleFiniteState getDefaultState() {
		if (defaultState != null && defaultState.eIsProxy()) {
			InternalEObject oldDefaultState = (InternalEObject)defaultState;
			defaultState = (PossibleFiniteState)eResolveProxy(oldDefaultState);
			if (defaultState != oldDefaultState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE, oldDefaultState, defaultState));
			}
		}
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleFiniteState basicGetDefaultState() {
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultState(PossibleFiniteState newDefaultState) {
		PossibleFiniteState oldDefaultState = defaultState;
		defaultState = newDefaultState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE, oldDefaultState, defaultState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE:
				return ((InternalEList<?>)getPossibleState()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__CATEGORY:
				return getCategory();
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE:
				return getPossibleState();
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE:
				if (resolve) return getDefaultState();
				return basicGetDefaultState();
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
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE:
				getPossibleState().clear();
				getPossibleState().addAll((Collection<? extends PossibleFiniteState>)newValue);
				return;
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE:
				setDefaultState((PossibleFiniteState)newValue);
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
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__CATEGORY:
				getCategory().clear();
				return;
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE:
				getPossibleState().clear();
				return;
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE:
				setDefaultState((PossibleFiniteState)null);
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
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__CATEGORY:
				return category != null && !category.isEmpty();
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE:
				return possibleState != null && !possibleState.isEmpty();
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE:
				return defaultState != null;
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
				case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__CATEGORY: return SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
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
				case SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY: return EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST__OWNER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PossibleFiniteStateListImpl
