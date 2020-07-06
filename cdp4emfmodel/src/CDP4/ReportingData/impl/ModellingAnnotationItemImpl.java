/**
 */
package CDP4.ReportingData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.ShortNamedThing;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.OwnedThing;

import CDP4.ReportingData.AnnotationClassificationKind;
import CDP4.ReportingData.AnnotationStatusKind;
import CDP4.ReportingData.Approval;
import CDP4.ReportingData.ModellingAnnotationItem;
import CDP4.ReportingData.ReportingDataPackage;

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
 * An implementation of the model object '<em><b>Modelling Annotation Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl#getApprovedBy <em>Approved By</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ModellingAnnotationItemImpl#getSourceAnnotation <em>Source Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModellingAnnotationItemImpl extends EngineeringModelDataAnnotationImpl implements ModellingAnnotationItem {
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final AnnotationStatusKind STATUS_EDEFAULT = AnnotationStatusKind.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected AnnotationStatusKind status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final AnnotationClassificationKind CLASSIFICATION_EDEFAULT = AnnotationClassificationKind.MAJOR;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected AnnotationClassificationKind classification = CLASSIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApprovedBy() <em>Approved By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Approval> approvedBy;

	/**
	 * The cached value of the '{@link #getSourceAnnotation() <em>Source Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModellingAnnotationItem> sourceAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModellingAnnotationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.MODELLING_ANNOTATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CATEGORY);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationStatusKind getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(AnnotationStatusKind newStatus) {
		AnnotationStatusKind oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationClassificationKind getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(AnnotationClassificationKind newClassification) {
		AnnotationClassificationKind oldClassification = classification;
		classification = newClassification == null ? CLASSIFICATION_EDEFAULT : newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Approval> getApprovedBy() {
		if (approvedBy == null) {
			approvedBy = new EObjectContainmentEList<Approval>(Approval.class, this, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__APPROVED_BY);
		}
		return approvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModellingAnnotationItem> getSourceAnnotation() {
		if (sourceAnnotation == null) {
			sourceAnnotation = new EObjectResolvingEList<ModellingAnnotationItem>(ModellingAnnotationItem.class, this, ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION);
		}
		return sourceAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__APPROVED_BY:
				return ((InternalEList<?>)getApprovedBy()).basicRemove(otherEnd, msgs);
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
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CATEGORY:
				return getCategory();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SHORT_NAME:
				return getShortName();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__STATUS:
				return getStatus();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__TITLE:
				return getTitle();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CLASSIFICATION:
				return getClassification();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__APPROVED_BY:
				return getApprovedBy();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION:
				return getSourceAnnotation();
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
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__STATUS:
				setStatus((AnnotationStatusKind)newValue);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__TITLE:
				setTitle((String)newValue);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CLASSIFICATION:
				setClassification((AnnotationClassificationKind)newValue);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__APPROVED_BY:
				getApprovedBy().clear();
				getApprovedBy().addAll((Collection<? extends Approval>)newValue);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION:
				getSourceAnnotation().clear();
				getSourceAnnotation().addAll((Collection<? extends ModellingAnnotationItem>)newValue);
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
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CATEGORY:
				getCategory().clear();
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__APPROVED_BY:
				getApprovedBy().clear();
				return;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION:
				getSourceAnnotation().clear();
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
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CATEGORY:
				return category != null && !category.isEmpty();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__OWNER:
				return owner != null;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__STATUS:
				return status != STATUS_EDEFAULT;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CLASSIFICATION:
				return classification != CLASSIFICATION_EDEFAULT;
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__APPROVED_BY:
				return approvedBy != null && !approvedBy.isEmpty();
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION:
				return sourceAnnotation != null && !sourceAnnotation.isEmpty();
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
				case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CATEGORY: return SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (derivedFeatureID) {
				case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (derivedFeatureID) {
				case ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
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
				case SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY: return ReportingDataPackage.MODELLING_ANNOTATION_ITEM__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return ReportingDataPackage.MODELLING_ANNOTATION_ITEM__OWNER;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return ReportingDataPackage.MODELLING_ANNOTATION_ITEM__SHORT_NAME;
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
		result.append(" (shortName: ");
		result.append(shortName);
		result.append(", status: ");
		result.append(status);
		result.append(", title: ");
		result.append(title);
		result.append(", classification: ");
		result.append(classification);
		result.append(')');
		return result.toString();
	}

} //ModellingAnnotationItemImpl
