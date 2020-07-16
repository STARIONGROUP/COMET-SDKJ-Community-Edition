/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.FileRevision;
import CDP4.EngineeringModelData.Folder;

import CDP4.SiteDirectoryData.FileType;
import CDP4.SiteDirectoryData.Participant;

import java.time.OffsetDateTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.FileRevisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FileRevisionImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FileRevisionImpl#getContentHash <em>Content Hash</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FileRevisionImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FileRevisionImpl#getContainingFolder <em>Containing Folder</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FileRevisionImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.FileRevisionImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileRevisionImpl extends ThingImpl implements FileRevision {
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
	 * The default value of the '{@link #getContentHash() <em>Content Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHash()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_HASH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentHash() <em>Content Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHash()
	 * @generated
	 * @ordered
	 */
	protected String contentHash = CONTENT_HASH_EDEFAULT;

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
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected EList<FileType> fileType;

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
	protected FileRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.FILE_REVISION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FILE_REVISION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FILE_REVISION__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentHash() {
		return contentHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentHash(String newContentHash) {
		String oldContentHash = contentHash;
		contentHash = newContentHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FILE_REVISION__CONTENT_HASH, oldContentHash, contentHash));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.FILE_REVISION__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FILE_REVISION__CREATOR, oldCreator, creator));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.FILE_REVISION__CONTAINING_FOLDER, oldContainingFolder, containingFolder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FILE_REVISION__CONTAINING_FOLDER, oldContainingFolder, containingFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileType> getFileType() {
		if (fileType == null) {
			fileType = new EObjectResolvingEList<FileType>(FileType.class, this, EngineeringModelDataPackage.FILE_REVISION__FILE_TYPE);
		}
		return fileType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.FILE_REVISION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.FILE_REVISION__NAME:
				return getName();
			case EngineeringModelDataPackage.FILE_REVISION__CREATED_ON:
				return getCreatedOn();
			case EngineeringModelDataPackage.FILE_REVISION__CONTENT_HASH:
				return getContentHash();
			case EngineeringModelDataPackage.FILE_REVISION__CREATOR:
				if (resolve) return getCreator();
				return basicGetCreator();
			case EngineeringModelDataPackage.FILE_REVISION__CONTAINING_FOLDER:
				if (resolve) return getContainingFolder();
				return basicGetContainingFolder();
			case EngineeringModelDataPackage.FILE_REVISION__FILE_TYPE:
				return getFileType();
			case EngineeringModelDataPackage.FILE_REVISION__PATH:
				return getPath();
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
			case EngineeringModelDataPackage.FILE_REVISION__NAME:
				setName((String)newValue);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__CREATED_ON:
				setCreatedOn((OffsetDateTime)newValue);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__CONTENT_HASH:
				setContentHash((String)newValue);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__CREATOR:
				setCreator((Participant)newValue);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__CONTAINING_FOLDER:
				setContainingFolder((Folder)newValue);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__FILE_TYPE:
				getFileType().clear();
				getFileType().addAll((Collection<? extends FileType>)newValue);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__PATH:
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
			case EngineeringModelDataPackage.FILE_REVISION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__CONTENT_HASH:
				setContentHash(CONTENT_HASH_EDEFAULT);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__CREATOR:
				setCreator((Participant)null);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__CONTAINING_FOLDER:
				setContainingFolder((Folder)null);
				return;
			case EngineeringModelDataPackage.FILE_REVISION__FILE_TYPE:
				getFileType().clear();
				return;
			case EngineeringModelDataPackage.FILE_REVISION__PATH:
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
			case EngineeringModelDataPackage.FILE_REVISION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EngineeringModelDataPackage.FILE_REVISION__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case EngineeringModelDataPackage.FILE_REVISION__CONTENT_HASH:
				return CONTENT_HASH_EDEFAULT == null ? contentHash != null : !CONTENT_HASH_EDEFAULT.equals(contentHash);
			case EngineeringModelDataPackage.FILE_REVISION__CREATOR:
				return creator != null;
			case EngineeringModelDataPackage.FILE_REVISION__CONTAINING_FOLDER:
				return containingFolder != null;
			case EngineeringModelDataPackage.FILE_REVISION__FILE_TYPE:
				return fileType != null && !fileType.isEmpty();
			case EngineeringModelDataPackage.FILE_REVISION__PATH:
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
				case EngineeringModelDataPackage.FILE_REVISION__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.FILE_REVISION__CREATED_ON: return CommonDataPackage.TIME_STAMPED_THING__CREATED_ON;
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
				case CommonDataPackage.NAMED_THING__NAME: return EngineeringModelDataPackage.FILE_REVISION__NAME;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.TIME_STAMPED_THING__CREATED_ON: return EngineeringModelDataPackage.FILE_REVISION__CREATED_ON;
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
		result.append(", contentHash: ");
		result.append(contentHash);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //FileRevisionImpl
