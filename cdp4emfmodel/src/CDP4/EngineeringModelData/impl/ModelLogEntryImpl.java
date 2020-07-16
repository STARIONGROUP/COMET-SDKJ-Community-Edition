/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.Annotation;
import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.LogEntry;
import CDP4.CommonData.LogLevelKind;
import CDP4.CommonData.TimeStampedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.ModelLogEntry;

import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.Person;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.time.OffsetDateTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Log Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl#getAffectedItemIid <em>Affected Item Iid</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl#getContent <em>Content</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ModelLogEntryImpl#getCreatedOn <em>Created On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelLogEntryImpl extends ThingImpl implements ModelLogEntry {
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
	 * The default value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected String languageCode = LANGUAGE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLogEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.MODEL_LOG_ENTRY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.MODEL_LOG_ENTRY__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.MODEL_LOG_ENTRY__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAffectedItemIid() {
		if (affectedItemIid == null) {
			affectedItemIid = new EDataTypeUniqueEList<String>(String.class, this, EngineeringModelDataPackage.MODEL_LOG_ENTRY__AFFECTED_ITEM_IID);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.MODEL_LOG_ENTRY__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageCode(String newLanguageCode) {
		String oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.MODEL_LOG_ENTRY__LANGUAGE_CODE, oldLanguageCode, languageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.MODEL_LOG_ENTRY__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, EngineeringModelDataPackage.MODEL_LOG_ENTRY__CATEGORY);
		}
		return category;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.MODEL_LOG_ENTRY__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AFFECTED_ITEM_IID:
				return getAffectedItemIid();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LEVEL:
				return getLevel();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LANGUAGE_CODE:
				return getLanguageCode();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CONTENT:
				return getContent();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CATEGORY:
				return getCategory();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CREATED_ON:
				return getCreatedOn();
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
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AUTHOR:
				setAuthor((Person)newValue);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AFFECTED_ITEM_IID:
				getAffectedItemIid().clear();
				getAffectedItemIid().addAll((Collection<? extends String>)newValue);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LEVEL:
				setLevel((LogLevelKind)newValue);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LANGUAGE_CODE:
				setLanguageCode((String)newValue);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CONTENT:
				setContent((String)newValue);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CREATED_ON:
				setCreatedOn((OffsetDateTime)newValue);
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
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AUTHOR:
				setAuthor((Person)null);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AFFECTED_ITEM_IID:
				getAffectedItemIid().clear();
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LANGUAGE_CODE:
				setLanguageCode(LANGUAGE_CODE_EDEFAULT);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CATEGORY:
				getCategory().clear();
				return;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
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
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AUTHOR:
				return author != null;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AFFECTED_ITEM_IID:
				return affectedItemIid != null && !affectedItemIid.isEmpty();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LEVEL:
				return level != LEVEL_EDEFAULT;
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LANGUAGE_CODE:
				return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CATEGORY:
				return category != null && !category.isEmpty();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
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
		if (baseClass == LogEntry.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AUTHOR: return CommonDataPackage.LOG_ENTRY__AUTHOR;
				case EngineeringModelDataPackage.MODEL_LOG_ENTRY__AFFECTED_ITEM_IID: return CommonDataPackage.LOG_ENTRY__AFFECTED_ITEM_IID;
				case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LEVEL: return CommonDataPackage.LOG_ENTRY__LEVEL;
				default: return -1;
			}
		}
		if (baseClass == Annotation.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.MODEL_LOG_ENTRY__LANGUAGE_CODE: return CommonDataPackage.ANNOTATION__LANGUAGE_CODE;
				case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CONTENT: return CommonDataPackage.ANNOTATION__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == CategorizableThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CATEGORY: return SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.MODEL_LOG_ENTRY__CREATED_ON: return CommonDataPackage.TIME_STAMPED_THING__CREATED_ON;
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
		if (baseClass == LogEntry.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.LOG_ENTRY__AUTHOR: return EngineeringModelDataPackage.MODEL_LOG_ENTRY__AUTHOR;
				case CommonDataPackage.LOG_ENTRY__AFFECTED_ITEM_IID: return EngineeringModelDataPackage.MODEL_LOG_ENTRY__AFFECTED_ITEM_IID;
				case CommonDataPackage.LOG_ENTRY__LEVEL: return EngineeringModelDataPackage.MODEL_LOG_ENTRY__LEVEL;
				default: return -1;
			}
		}
		if (baseClass == Annotation.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.ANNOTATION__LANGUAGE_CODE: return EngineeringModelDataPackage.MODEL_LOG_ENTRY__LANGUAGE_CODE;
				case CommonDataPackage.ANNOTATION__CONTENT: return EngineeringModelDataPackage.MODEL_LOG_ENTRY__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == CategorizableThing.class) {
			switch (baseFeatureID) {
				case SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY: return EngineeringModelDataPackage.MODEL_LOG_ENTRY__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.TIME_STAMPED_THING__CREATED_ON: return EngineeringModelDataPackage.MODEL_LOG_ENTRY__CREATED_ON;
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
		result.append(" (affectedItemIid: ");
		result.append(affectedItemIid);
		result.append(", level: ");
		result.append(level);
		result.append(", languageCode: ");
		result.append(languageCode);
		result.append(", content: ");
		result.append(content);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(')');
		return result.toString();
	}

} //ModelLogEntryImpl
