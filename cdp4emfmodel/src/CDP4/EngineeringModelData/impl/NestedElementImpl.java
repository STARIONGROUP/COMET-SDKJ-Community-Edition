/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.VolatileThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.ElementDefinition;
import CDP4.EngineeringModelData.ElementUsage;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.NestedElement;
import CDP4.EngineeringModelData.NestedParameter;
import CDP4.EngineeringModelData.OwnedThing;

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
 * An implementation of the model object '<em><b>Nested Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedElementImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedElementImpl#getIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedElementImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedElementImpl#getElementUsage <em>Element Usage</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.NestedElementImpl#getNestedParameter <em>Nested Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedElementImpl extends ThingImpl implements NestedElement {
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
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected ElementDefinition rootElement;

	/**
	 * The cached value of the '{@link #getElementUsage() <em>Element Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementUsage> elementUsage;

	/**
	 * The cached value of the '{@link #getNestedParameter() <em>Nested Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<NestedParameter> nestedParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.NESTED_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_ELEMENT__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.NESTED_ELEMENT__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_ELEMENT__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_ELEMENT__SHORT_NAME, oldShortName, shortName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_ELEMENT__IS_VOLATILE, oldIsVolatile, isVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition getRootElement() {
		if (rootElement != null && rootElement.eIsProxy()) {
			InternalEObject oldRootElement = (InternalEObject)rootElement;
			rootElement = (ElementDefinition)eResolveProxy(oldRootElement);
			if (rootElement != oldRootElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.NESTED_ELEMENT__ROOT_ELEMENT, oldRootElement, rootElement));
			}
		}
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition basicGetRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootElement(ElementDefinition newRootElement) {
		ElementDefinition oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.NESTED_ELEMENT__ROOT_ELEMENT, oldRootElement, rootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementUsage> getElementUsage() {
		if (elementUsage == null) {
			elementUsage = new EObjectResolvingEList<ElementUsage>(ElementUsage.class, this, EngineeringModelDataPackage.NESTED_ELEMENT__ELEMENT_USAGE);
		}
		return elementUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NestedParameter> getNestedParameter() {
		if (nestedParameter == null) {
			nestedParameter = new EObjectContainmentEList<NestedParameter>(NestedParameter.class, this, EngineeringModelDataPackage.NESTED_ELEMENT__NESTED_PARAMETER);
		}
		return nestedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.NESTED_ELEMENT__NESTED_PARAMETER:
				return ((InternalEList<?>)getNestedParameter()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.NESTED_ELEMENT__NAME:
				return getName();
			case EngineeringModelDataPackage.NESTED_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.NESTED_ELEMENT__SHORT_NAME:
				return getShortName();
			case EngineeringModelDataPackage.NESTED_ELEMENT__IS_VOLATILE:
				return getIsVolatile();
			case EngineeringModelDataPackage.NESTED_ELEMENT__ROOT_ELEMENT:
				if (resolve) return getRootElement();
				return basicGetRootElement();
			case EngineeringModelDataPackage.NESTED_ELEMENT__ELEMENT_USAGE:
				return getElementUsage();
			case EngineeringModelDataPackage.NESTED_ELEMENT__NESTED_PARAMETER:
				return getNestedParameter();
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
			case EngineeringModelDataPackage.NESTED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__IS_VOLATILE:
				setIsVolatile((Boolean)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__ROOT_ELEMENT:
				setRootElement((ElementDefinition)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__ELEMENT_USAGE:
				getElementUsage().clear();
				getElementUsage().addAll((Collection<? extends ElementUsage>)newValue);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__NESTED_PARAMETER:
				getNestedParameter().clear();
				getNestedParameter().addAll((Collection<? extends NestedParameter>)newValue);
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
			case EngineeringModelDataPackage.NESTED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__IS_VOLATILE:
				setIsVolatile(IS_VOLATILE_EDEFAULT);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__ROOT_ELEMENT:
				setRootElement((ElementDefinition)null);
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__ELEMENT_USAGE:
				getElementUsage().clear();
				return;
			case EngineeringModelDataPackage.NESTED_ELEMENT__NESTED_PARAMETER:
				getNestedParameter().clear();
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
			case EngineeringModelDataPackage.NESTED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EngineeringModelDataPackage.NESTED_ELEMENT__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.NESTED_ELEMENT__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case EngineeringModelDataPackage.NESTED_ELEMENT__IS_VOLATILE:
				return IS_VOLATILE_EDEFAULT == null ? isVolatile != null : !IS_VOLATILE_EDEFAULT.equals(isVolatile);
			case EngineeringModelDataPackage.NESTED_ELEMENT__ROOT_ELEMENT:
				return rootElement != null;
			case EngineeringModelDataPackage.NESTED_ELEMENT__ELEMENT_USAGE:
				return elementUsage != null && !elementUsage.isEmpty();
			case EngineeringModelDataPackage.NESTED_ELEMENT__NESTED_PARAMETER:
				return nestedParameter != null && !nestedParameter.isEmpty();
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
				case EngineeringModelDataPackage.NESTED_ELEMENT__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.NESTED_ELEMENT__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.NESTED_ELEMENT__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == VolatileThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.NESTED_ELEMENT__IS_VOLATILE: return CommonDataPackage.VOLATILE_THING__IS_VOLATILE;
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
				case CommonDataPackage.NAMED_THING__NAME: return EngineeringModelDataPackage.NESTED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.NESTED_ELEMENT__OWNER;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return EngineeringModelDataPackage.NESTED_ELEMENT__SHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == VolatileThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.VOLATILE_THING__IS_VOLATILE: return EngineeringModelDataPackage.NESTED_ELEMENT__IS_VOLATILE;
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
		result.append(", isVolatile: ");
		result.append(isVolatile);
		result.append(')');
		return result.toString();
	}

} //NestedElementImpl
