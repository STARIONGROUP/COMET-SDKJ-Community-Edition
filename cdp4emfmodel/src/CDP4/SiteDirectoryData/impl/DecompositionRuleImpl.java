/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.DecompositionRule;
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
 * An implementation of the model object '<em><b>Decomposition Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.DecompositionRuleImpl#getContainingCategory <em>Containing Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.DecompositionRuleImpl#getContainedCategory <em>Contained Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.DecompositionRuleImpl#getMinContained <em>Min Contained</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.DecompositionRuleImpl#getMaxContained <em>Max Contained</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecompositionRuleImpl extends RuleImpl implements DecompositionRule {
	/**
	 * The cached value of the '{@link #getContainingCategory() <em>Containing Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingCategory()
	 * @generated
	 * @ordered
	 */
	protected Category containingCategory;

	/**
	 * The cached value of the '{@link #getContainedCategory() <em>Contained Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> containedCategory;

	/**
	 * The default value of the '{@link #getMinContained() <em>Min Contained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinContained()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_CONTAINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinContained() <em>Min Contained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinContained()
	 * @generated
	 * @ordered
	 */
	protected Integer minContained = MIN_CONTAINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxContained() <em>Max Contained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxContained()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CONTAINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxContained() <em>Max Contained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxContained()
	 * @generated
	 * @ordered
	 */
	protected Integer maxContained = MAX_CONTAINED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecompositionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.DECOMPOSITION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getContainingCategory() {
		if (containingCategory != null && containingCategory.eIsProxy()) {
			InternalEObject oldContainingCategory = (InternalEObject)containingCategory;
			containingCategory = (Category)eResolveProxy(oldContainingCategory);
			if (containingCategory != oldContainingCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINING_CATEGORY, oldContainingCategory, containingCategory));
			}
		}
		return containingCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetContainingCategory() {
		return containingCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingCategory(Category newContainingCategory) {
		Category oldContainingCategory = containingCategory;
		containingCategory = newContainingCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINING_CATEGORY, oldContainingCategory, containingCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getContainedCategory() {
		if (containedCategory == null) {
			containedCategory = new EObjectResolvingEList<Category>(Category.class, this, SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINED_CATEGORY);
		}
		return containedCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinContained() {
		return minContained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinContained(Integer newMinContained) {
		Integer oldMinContained = minContained;
		minContained = newMinContained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.DECOMPOSITION_RULE__MIN_CONTAINED, oldMinContained, minContained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxContained() {
		return maxContained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxContained(Integer newMaxContained) {
		Integer oldMaxContained = maxContained;
		maxContained = newMaxContained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.DECOMPOSITION_RULE__MAX_CONTAINED, oldMaxContained, maxContained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINING_CATEGORY:
				if (resolve) return getContainingCategory();
				return basicGetContainingCategory();
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINED_CATEGORY:
				return getContainedCategory();
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__MIN_CONTAINED:
				return getMinContained();
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__MAX_CONTAINED:
				return getMaxContained();
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
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINING_CATEGORY:
				setContainingCategory((Category)newValue);
				return;
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINED_CATEGORY:
				getContainedCategory().clear();
				getContainedCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__MIN_CONTAINED:
				setMinContained((Integer)newValue);
				return;
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__MAX_CONTAINED:
				setMaxContained((Integer)newValue);
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
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINING_CATEGORY:
				setContainingCategory((Category)null);
				return;
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINED_CATEGORY:
				getContainedCategory().clear();
				return;
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__MIN_CONTAINED:
				setMinContained(MIN_CONTAINED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__MAX_CONTAINED:
				setMaxContained(MAX_CONTAINED_EDEFAULT);
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
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINING_CATEGORY:
				return containingCategory != null;
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__CONTAINED_CATEGORY:
				return containedCategory != null && !containedCategory.isEmpty();
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__MIN_CONTAINED:
				return MIN_CONTAINED_EDEFAULT == null ? minContained != null : !MIN_CONTAINED_EDEFAULT.equals(minContained);
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE__MAX_CONTAINED:
				return MAX_CONTAINED_EDEFAULT == null ? maxContained != null : !MAX_CONTAINED_EDEFAULT.equals(maxContained);
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
		result.append(" (minContained: ");
		result.append(minContained);
		result.append(", maxContained: ");
		result.append(maxContained);
		result.append(')');
		return result.toString();
	}

} //DecompositionRuleImpl
