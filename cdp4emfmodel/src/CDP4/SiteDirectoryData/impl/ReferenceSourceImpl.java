/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.DeprecatableThing;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.Organization;
import CDP4.SiteDirectoryData.ReferenceSource;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

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
 * An implementation of the model object '<em><b>Reference Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getVersionIdentifier <em>Version Identifier</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getPublicationYear <em>Publication Year</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getPublishedIn <em>Published In</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceSourceImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceSourceImpl extends DefinedThingImpl implements ReferenceSource {
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
	 * The default value of the '{@link #getIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDeprecated = IS_DEPRECATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionIdentifier() <em>Version Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionIdentifier() <em>Version Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String versionIdentifier = VERSION_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionDate() <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime VERSION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionDate() <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime versionDate = VERSION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicationYear() <em>Publication Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationYear()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PUBLICATION_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationYear() <em>Publication Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationYear()
	 * @generated
	 * @ordered
	 */
	protected Integer publicationYear = PUBLICATION_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Organization publisher;

	/**
	 * The cached value of the '{@link #getPublishedIn() <em>Published In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedIn()
	 * @generated
	 * @ordered
	 */
	protected ReferenceSource publishedIn;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.REFERENCE_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, SiteDirectoryDataPackage.REFERENCE_SOURCE__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDeprecated() {
		return isDeprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeprecated(Boolean newIsDeprecated) {
		Boolean oldIsDeprecated = isDeprecated;
		isDeprecated = newIsDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_SOURCE__IS_DEPRECATED, oldIsDeprecated, isDeprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionIdentifier() {
		return versionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionIdentifier(String newVersionIdentifier) {
		String oldVersionIdentifier = versionIdentifier;
		versionIdentifier = newVersionIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_IDENTIFIER, oldVersionIdentifier, versionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getVersionDate() {
		return versionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionDate(OffsetDateTime newVersionDate) {
		OffsetDateTime oldVersionDate = versionDate;
		versionDate = newVersionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_DATE, oldVersionDate, versionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_SOURCE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPublicationYear() {
		return publicationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationYear(Integer newPublicationYear) {
		Integer oldPublicationYear = publicationYear;
		publicationYear = newPublicationYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLICATION_YEAR, oldPublicationYear, publicationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (Organization)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Organization newPublisher) {
		Organization oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSource getPublishedIn() {
		if (publishedIn != null && publishedIn.eIsProxy()) {
			InternalEObject oldPublishedIn = (InternalEObject)publishedIn;
			publishedIn = (ReferenceSource)eResolveProxy(oldPublishedIn);
			if (publishedIn != oldPublishedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHED_IN, oldPublishedIn, publishedIn));
			}
		}
		return publishedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSource basicGetPublishedIn() {
		return publishedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedIn(ReferenceSource newPublishedIn) {
		ReferenceSource oldPublishedIn = publishedIn;
		publishedIn = newPublishedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHED_IN, oldPublishedIn, publishedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_SOURCE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__CATEGORY:
				return getCategory();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__IS_DEPRECATED:
				return getIsDeprecated();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_IDENTIFIER:
				return getVersionIdentifier();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_DATE:
				return getVersionDate();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__AUTHOR:
				return getAuthor();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLICATION_YEAR:
				return getPublicationYear();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHED_IN:
				if (resolve) return getPublishedIn();
				return basicGetPublishedIn();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__LANGUAGE:
				return getLanguage();
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
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_IDENTIFIER:
				setVersionIdentifier((String)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_DATE:
				setVersionDate((OffsetDateTime)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLICATION_YEAR:
				setPublicationYear((Integer)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHER:
				setPublisher((Organization)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHED_IN:
				setPublishedIn((ReferenceSource)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__LANGUAGE:
				setLanguage((String)newValue);
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
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__CATEGORY:
				getCategory().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__IS_DEPRECATED:
				setIsDeprecated(IS_DEPRECATED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_IDENTIFIER:
				setVersionIdentifier(VERSION_IDENTIFIER_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_DATE:
				setVersionDate(VERSION_DATE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLICATION_YEAR:
				setPublicationYear(PUBLICATION_YEAR_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHER:
				setPublisher((Organization)null);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHED_IN:
				setPublishedIn((ReferenceSource)null);
				return;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
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
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__CATEGORY:
				return category != null && !category.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__IS_DEPRECATED:
				return IS_DEPRECATED_EDEFAULT == null ? isDeprecated != null : !IS_DEPRECATED_EDEFAULT.equals(isDeprecated);
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_IDENTIFIER:
				return VERSION_IDENTIFIER_EDEFAULT == null ? versionIdentifier != null : !VERSION_IDENTIFIER_EDEFAULT.equals(versionIdentifier);
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__VERSION_DATE:
				return VERSION_DATE_EDEFAULT == null ? versionDate != null : !VERSION_DATE_EDEFAULT.equals(versionDate);
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLICATION_YEAR:
				return PUBLICATION_YEAR_EDEFAULT == null ? publicationYear != null : !PUBLICATION_YEAR_EDEFAULT.equals(publicationYear);
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHER:
				return publisher != null;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__PUBLISHED_IN:
				return publishedIn != null;
			case SiteDirectoryDataPackage.REFERENCE_SOURCE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
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
				case SiteDirectoryDataPackage.REFERENCE_SOURCE__CATEGORY: return SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == DeprecatableThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.REFERENCE_SOURCE__IS_DEPRECATED: return CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED;
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
				case SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY: return SiteDirectoryDataPackage.REFERENCE_SOURCE__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == DeprecatableThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED: return SiteDirectoryDataPackage.REFERENCE_SOURCE__IS_DEPRECATED;
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
		result.append(" (isDeprecated: ");
		result.append(isDeprecated);
		result.append(", versionIdentifier: ");
		result.append(versionIdentifier);
		result.append(", versionDate: ");
		result.append(versionDate);
		result.append(", author: ");
		result.append(author);
		result.append(", publicationYear: ");
		result.append(publicationYear);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //ReferenceSourceImpl
