/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.LogEntry;
import CDP4.CommonData.LogLevelKind;

import CDP4.SiteDirectoryData.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.impl.LogEntryImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.LogEntryImpl#getAffectedItemIid <em>Affected Item Iid</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.LogEntryImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LogEntryImpl extends MinimalEObjectImpl.Container implements LogEntry {
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Person author;

	/**
	 * The cached value of the '{@link #getAffectedItemIid() <em>Affected Item Iid</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedItemIid()
	 * @generated
	 * @ordered
	 */
	protected EList<String> affectedItemIid;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LogLevelKind LEVEL_EDEFAULT = LogLevelKind.TRACE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected LogLevelKind level = LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonDataPackage.Literals.LOG_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Person)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonDataPackage.LOG_ENTRY__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Person newAuthor) {
		Person oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.LOG_ENTRY__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAffectedItemIid() {
		if (affectedItemIid == null) {
			affectedItemIid = new EDataTypeUniqueEList<String>(String.class, this, CommonDataPackage.LOG_ENTRY__AFFECTED_ITEM_IID);
		}
		return affectedItemIid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogLevelKind getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(LogLevelKind newLevel) {
		LogLevelKind oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.LOG_ENTRY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonDataPackage.LOG_ENTRY__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case CommonDataPackage.LOG_ENTRY__AFFECTED_ITEM_IID:
				return getAffectedItemIid();
			case CommonDataPackage.LOG_ENTRY__LEVEL:
				return getLevel();
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
			case CommonDataPackage.LOG_ENTRY__AUTHOR:
				setAuthor((Person)newValue);
				return;
			case CommonDataPackage.LOG_ENTRY__AFFECTED_ITEM_IID:
				getAffectedItemIid().clear();
				getAffectedItemIid().addAll((Collection<? extends String>)newValue);
				return;
			case CommonDataPackage.LOG_ENTRY__LEVEL:
				setLevel((LogLevelKind)newValue);
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
			case CommonDataPackage.LOG_ENTRY__AUTHOR:
				setAuthor((Person)null);
				return;
			case CommonDataPackage.LOG_ENTRY__AFFECTED_ITEM_IID:
				getAffectedItemIid().clear();
				return;
			case CommonDataPackage.LOG_ENTRY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
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
			case CommonDataPackage.LOG_ENTRY__AUTHOR:
				return author != null;
			case CommonDataPackage.LOG_ENTRY__AFFECTED_ITEM_IID:
				return affectedItemIid != null && !affectedItemIid.isEmpty();
			case CommonDataPackage.LOG_ENTRY__LEVEL:
				return level != LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (affectedItemIid: ");
		result.append(affectedItemIid);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //LogEntryImpl
