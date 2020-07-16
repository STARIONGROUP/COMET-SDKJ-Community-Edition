/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.ExternalIdentifierMap;
import CDP4.EngineeringModelData.IdCorrespondence;
import CDP4.EngineeringModelData.OwnedThing;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.ReferenceSource;

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
 * An implementation of the model object '<em><b>External Identifier Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl#getCorrespondence <em>Correspondence</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl#getExternalModelName <em>External Model Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl#getExternalToolName <em>External Tool Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl#getExternalToolVersion <em>External Tool Version</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ExternalIdentifierMapImpl#getExternalFormat <em>External Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalIdentifierMapImpl extends ThingImpl implements ExternalIdentifierMap {
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
	 * The cached value of the '{@link #getCorrespondence() <em>Correspondence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondence()
	 * @generated
	 * @ordered
	 */
	protected EList<IdCorrespondence> correspondence;

	/**
	 * The default value of the '{@link #getExternalModelName() <em>External Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalModelName() <em>External Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalModelName()
	 * @generated
	 * @ordered
	 */
	protected String externalModelName = EXTERNAL_MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalToolName() <em>External Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalToolName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_TOOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalToolName() <em>External Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalToolName()
	 * @generated
	 * @ordered
	 */
	protected String externalToolName = EXTERNAL_TOOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalToolVersion() <em>External Tool Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalToolVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_TOOL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalToolVersion() <em>External Tool Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalToolVersion()
	 * @generated
	 * @ordered
	 */
	protected String externalToolVersion = EXTERNAL_TOOL_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalFormat() <em>External Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFormat()
	 * @generated
	 * @ordered
	 */
	protected ReferenceSource externalFormat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalIdentifierMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.EXTERNAL_IDENTIFIER_MAP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdCorrespondence> getCorrespondence() {
		if (correspondence == null) {
			correspondence = new EObjectContainmentEList<IdCorrespondence>(IdCorrespondence.class, this, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE);
		}
		return correspondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalModelName() {
		return externalModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalModelName(String newExternalModelName) {
		String oldExternalModelName = externalModelName;
		externalModelName = newExternalModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_MODEL_NAME, oldExternalModelName, externalModelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalToolName() {
		return externalToolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalToolName(String newExternalToolName) {
		String oldExternalToolName = externalToolName;
		externalToolName = newExternalToolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_NAME, oldExternalToolName, externalToolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalToolVersion() {
		return externalToolVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalToolVersion(String newExternalToolVersion) {
		String oldExternalToolVersion = externalToolVersion;
		externalToolVersion = newExternalToolVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_VERSION, oldExternalToolVersion, externalToolVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSource getExternalFormat() {
		if (externalFormat != null && externalFormat.eIsProxy()) {
			InternalEObject oldExternalFormat = (InternalEObject)externalFormat;
			externalFormat = (ReferenceSource)eResolveProxy(oldExternalFormat);
			if (externalFormat != oldExternalFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT, oldExternalFormat, externalFormat));
			}
		}
		return externalFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSource basicGetExternalFormat() {
		return externalFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalFormat(ReferenceSource newExternalFormat) {
		ReferenceSource oldExternalFormat = externalFormat;
		externalFormat = newExternalFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT, oldExternalFormat, externalFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE:
				return ((InternalEList<?>)getCorrespondence()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__NAME:
				return getName();
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE:
				return getCorrespondence();
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_MODEL_NAME:
				return getExternalModelName();
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_NAME:
				return getExternalToolName();
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_VERSION:
				return getExternalToolVersion();
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT:
				if (resolve) return getExternalFormat();
				return basicGetExternalFormat();
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
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__NAME:
				setName((String)newValue);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE:
				getCorrespondence().clear();
				getCorrespondence().addAll((Collection<? extends IdCorrespondence>)newValue);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_MODEL_NAME:
				setExternalModelName((String)newValue);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_NAME:
				setExternalToolName((String)newValue);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_VERSION:
				setExternalToolVersion((String)newValue);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT:
				setExternalFormat((ReferenceSource)newValue);
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
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE:
				getCorrespondence().clear();
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_MODEL_NAME:
				setExternalModelName(EXTERNAL_MODEL_NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_NAME:
				setExternalToolName(EXTERNAL_TOOL_NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_VERSION:
				setExternalToolVersion(EXTERNAL_TOOL_VERSION_EDEFAULT);
				return;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT:
				setExternalFormat((ReferenceSource)null);
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
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE:
				return correspondence != null && !correspondence.isEmpty();
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_MODEL_NAME:
				return EXTERNAL_MODEL_NAME_EDEFAULT == null ? externalModelName != null : !EXTERNAL_MODEL_NAME_EDEFAULT.equals(externalModelName);
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_NAME:
				return EXTERNAL_TOOL_NAME_EDEFAULT == null ? externalToolName != null : !EXTERNAL_TOOL_NAME_EDEFAULT.equals(externalToolName);
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_VERSION:
				return EXTERNAL_TOOL_VERSION_EDEFAULT == null ? externalToolVersion != null : !EXTERNAL_TOOL_VERSION_EDEFAULT.equals(externalToolVersion);
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT:
				return externalFormat != null;
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
				case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
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
				case CommonDataPackage.NAMED_THING__NAME: return EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__NAME;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP__OWNER;
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
		result.append(", externalModelName: ");
		result.append(externalModelName);
		result.append(", externalToolName: ");
		result.append(externalToolName);
		result.append(", externalToolVersion: ");
		result.append(externalToolVersion);
		result.append(')');
		return result.toString();
	}

} //ExternalIdentifierMapImpl
