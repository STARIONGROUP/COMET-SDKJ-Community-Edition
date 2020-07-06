/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.Folder;
import CDP4.EngineeringModelData.OwnedThing;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.Participant;

import java.time.OffsetDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.FolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FolderImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FolderImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FolderImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FolderImpl#getContainingFolder <em>Containing Folder</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FolderImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends ThingImpl implements Folder {
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
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime CREATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime createdOn = CREATED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Participant creator;

	/**
	 * The cached value of the '{@link #getContainingFolder() <em>Containing Folder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingFolder()
	 * @generated
	 * @ordered
	 */
	protected Folder containingFolder;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.FOLDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FOLDER__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.FOLDER__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FOLDER__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedOn(OffsetDateTime newCreatedOn) {
		OffsetDateTime oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FOLDER__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getCreator() {
		if (creator != null && creator.eIsProxy()) {
			InternalEObject oldCreator = (InternalEObject)creator;
			creator = (Participant)eResolveProxy(oldCreator);
			if (creator != oldCreator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.FOLDER__CREATOR, oldCreator, creator));
			}
		}
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Participant newCreator) {
		Participant oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FOLDER__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getContainingFolder() {
		if (containingFolder != null && containingFolder.eIsProxy()) {
			InternalEObject oldContainingFolder = (InternalEObject)containingFolder;
			containingFolder = (Folder)eResolveProxy(oldContainingFolder);
			if (containingFolder != oldContainingFolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.FOLDER__CONTAINING_FOLDER, oldContainingFolder, containingFolder));
			}
		}
		return containingFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder basicGetContainingFolder() {
		return containingFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingFolder(Folder newContainingFolder) {
		Folder oldContainingFolder = containingFolder;
		containingFolder = newContainingFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FOLDER__CONTAINING_FOLDER, oldContainingFolder, containingFolder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FOLDER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.FOLDER__NAME:
				return getName();
			case EngineeringModelDataPackage.FOLDER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case EngineeringModelDataPackage.FOLDER__CREATED_ON:
				return getCreatedOn();
			case EngineeringModelDataPackage.FOLDER__CREATOR:
				if (resolve) return getCreator();
				return basicGetCreator();
			case EngineeringModelDataPackage.FOLDER__CONTAINING_FOLDER:
				if (resolve) return getContainingFolder();
				return basicGetContainingFolder();
			case EngineeringModelDataPackage.FOLDER__PATH:
				return getPath();
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
			case EngineeringModelDataPackage.FOLDER__NAME:
				setName((String)newValue);
				return;
			case EngineeringModelDataPackage.FOLDER__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.FOLDER__CREATED_ON:
				setCreatedOn((OffsetDateTime)newValue);
				return;
			case EngineeringModelDataPackage.FOLDER__CREATOR:
				setCreator((Participant)newValue);
				return;
			case EngineeringModelDataPackage.FOLDER__CONTAINING_FOLDER:
				setContainingFolder((Folder)newValue);
				return;
			case EngineeringModelDataPackage.FOLDER__PATH:
				setPath((String)newValue);
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
			case EngineeringModelDataPackage.FOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.FOLDER__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.FOLDER__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case EngineeringModelDataPackage.FOLDER__CREATOR:
				setCreator((Participant)null);
				return;
			case EngineeringModelDataPackage.FOLDER__CONTAINING_FOLDER:
				setContainingFolder((Folder)null);
				return;
			case EngineeringModelDataPackage.FOLDER__PATH:
				setPath(PATH_EDEFAULT);
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
			case EngineeringModelDataPackage.FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EngineeringModelDataPackage.FOLDER__OWNER:
				return owner != null;
			case EngineeringModelDataPackage.FOLDER__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case EngineeringModelDataPackage.FOLDER__CREATOR:
				return creator != null;
			case EngineeringModelDataPackage.FOLDER__CONTAINING_FOLDER:
				return containingFolder != null;
			case EngineeringModelDataPackage.FOLDER__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
				case EngineeringModelDataPackage.FOLDER__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.FOLDER__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.FOLDER__CREATED_ON: return CommonDataPackage.TIME_STAMPED_THING__CREATED_ON;
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
				case CommonDataPackage.NAMED_THING__NAME: return EngineeringModelDataPackage.FOLDER__NAME;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return EngineeringModelDataPackage.FOLDER__OWNER;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.TIME_STAMPED_THING__CREATED_ON: return EngineeringModelDataPackage.FOLDER__CREATED_ON;
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
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //FolderImpl
