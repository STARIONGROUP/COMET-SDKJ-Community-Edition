/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.MultiRelationshipRule;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Relationship Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MultiRelationshipRuleImpl#getRelationshipCategory <em>Relationship Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MultiRelationshipRuleImpl#getRelatedCategory <em>Related Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MultiRelationshipRuleImpl#getMinRelated <em>Min Related</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.MultiRelationshipRuleImpl#getMaxRelated <em>Max Related</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiRelationshipRuleImpl extends RuleImpl implements MultiRelationshipRule {
	/**
	 * The cached value of the '{@link #getRelationshipCategory() <em>Relationship Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipCategory()
	 * @generated
	 * @ordered
	 */
	protected Category relationshipCategory;

	/**
	 * The cached value of the '{@link #getRelatedCategory() <em>Related Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> relatedCategory;

	/**
	 * The default value of the '{@link #getMinRelated() <em>Min Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRelated()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_RELATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinRelated() <em>Min Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRelated()
	 * @generated
	 * @ordered
	 */
	protected Integer minRelated = MIN_RELATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRelated() <em>Max Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRelated()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_RELATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRelated() <em>Max Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRelated()
	 * @generated
	 * @ordered
	 */
	protected Integer maxRelated = MAX_RELATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiRelationshipRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.MULTI_RELATIONSHIP_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getRelationshipCategory() {
		if (relationshipCategory != null && relationshipCategory.eIsProxy()) {
			InternalEObject oldRelationshipCategory = (InternalEObject)relationshipCategory;
			relationshipCategory = (Category)eResolveProxy(oldRelationshipCategory);
			if (relationshipCategory != oldRelationshipCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY, oldRelationshipCategory, relationshipCategory));
			}
		}
		return relationshipCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetRelationshipCategory() {
		return relationshipCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipCategory(Category newRelationshipCategory) {
		Category oldRelationshipCategory = relationshipCategory;
		relationshipCategory = newRelationshipCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY, oldRelationshipCategory, relationshipCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getRelatedCategory() {
		if (relatedCategory == null) {
			relatedCategory = new EObjectResolvingEList<Category>(Category.class, this, SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATED_CATEGORY);
		}
		return relatedCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinRelated() {
		return minRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRelated(Integer newMinRelated) {
		Integer oldMinRelated = minRelated;
		minRelated = newMinRelated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MIN_RELATED, oldMinRelated, minRelated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxRelated() {
		return maxRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRelated(Integer newMaxRelated) {
		Integer oldMaxRelated = maxRelated;
		maxRelated = newMaxRelated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MAX_RELATED, oldMaxRelated, maxRelated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY:
				if (resolve) return getRelationshipCategory();
				return basicGetRelationshipCategory();
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATED_CATEGORY:
				return getRelatedCategory();
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MIN_RELATED:
				return getMinRelated();
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MAX_RELATED:
				return getMaxRelated();
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
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY:
				setRelationshipCategory((Category)newValue);
				return;
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATED_CATEGORY:
				getRelatedCategory().clear();
				getRelatedCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MIN_RELATED:
				setMinRelated((Integer)newValue);
				return;
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MAX_RELATED:
				setMaxRelated((Integer)newValue);
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
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY:
				setRelationshipCategory((Category)null);
				return;
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATED_CATEGORY:
				getRelatedCategory().clear();
				return;
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MIN_RELATED:
				setMinRelated(MIN_RELATED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MAX_RELATED:
				setMaxRelated(MAX_RELATED_EDEFAULT);
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
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY:
				return relationshipCategory != null;
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__RELATED_CATEGORY:
				return relatedCategory != null && !relatedCategory.isEmpty();
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MIN_RELATED:
				return MIN_RELATED_EDEFAULT == null ? minRelated != null : !MIN_RELATED_EDEFAULT.equals(minRelated);
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE__MAX_RELATED:
				return MAX_RELATED_EDEFAULT == null ? maxRelated != null : !MAX_RELATED_EDEFAULT.equals(maxRelated);
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
		result.append(" (minRelated: ");
		result.append(minRelated);
		result.append(", maxRelated: ");
		result.append(maxRelated);
		result.append(')');
		return result.toString();
	}

} //MultiRelationshipRuleImpl
