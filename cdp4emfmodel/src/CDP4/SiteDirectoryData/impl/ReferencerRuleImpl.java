/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.ReferencerRule;
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
 * An implementation of the model object '<em><b>Referencer Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferencerRuleImpl#getReferencingCategory <em>Referencing Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferencerRuleImpl#getReferencedCategory <em>Referenced Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferencerRuleImpl#getMinReferenced <em>Min Referenced</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferencerRuleImpl#getMaxReferenced <em>Max Referenced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencerRuleImpl extends RuleImpl implements ReferencerRule {
	/**
	 * The cached value of the '{@link #getReferencingCategory() <em>Referencing Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingCategory()
	 * @generated
	 * @ordered
	 */
	protected Category referencingCategory;

	/**
	 * The cached value of the '{@link #getReferencedCategory() <em>Referenced Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> referencedCategory;

	/**
	 * The default value of the '{@link #getMinReferenced() <em>Min Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinReferenced()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_REFERENCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinReferenced() <em>Min Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinReferenced()
	 * @generated
	 * @ordered
	 */
	protected Integer minReferenced = MIN_REFERENCED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReferenced() <em>Max Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReferenced()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_REFERENCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxReferenced() <em>Max Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReferenced()
	 * @generated
	 * @ordered
	 */
	protected Integer maxReferenced = MAX_REFERENCED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.REFERENCER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getReferencingCategory() {
		if (referencingCategory != null && referencingCategory.eIsProxy()) {
			InternalEObject oldReferencingCategory = (InternalEObject)referencingCategory;
			referencingCategory = (Category)eResolveProxy(oldReferencingCategory);
			if (referencingCategory != oldReferencingCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCING_CATEGORY, oldReferencingCategory, referencingCategory));
			}
		}
		return referencingCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetReferencingCategory() {
		return referencingCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencingCategory(Category newReferencingCategory) {
		Category oldReferencingCategory = referencingCategory;
		referencingCategory = newReferencingCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCING_CATEGORY, oldReferencingCategory, referencingCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getReferencedCategory() {
		if (referencedCategory == null) {
			referencedCategory = new EObjectResolvingEList<Category>(Category.class, this, SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCED_CATEGORY);
		}
		return referencedCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinReferenced() {
		return minReferenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinReferenced(Integer newMinReferenced) {
		Integer oldMinReferenced = minReferenced;
		minReferenced = newMinReferenced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCER_RULE__MIN_REFERENCED, oldMinReferenced, minReferenced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxReferenced() {
		return maxReferenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxReferenced(Integer newMaxReferenced) {
		Integer oldMaxReferenced = maxReferenced;
		maxReferenced = newMaxReferenced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCER_RULE__MAX_REFERENCED, oldMaxReferenced, maxReferenced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCING_CATEGORY:
				if (resolve) return getReferencingCategory();
				return basicGetReferencingCategory();
			case SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCED_CATEGORY:
				return getReferencedCategory();
			case SiteDirectoryDataPackage.REFERENCER_RULE__MIN_REFERENCED:
				return getMinReferenced();
			case SiteDirectoryDataPackage.REFERENCER_RULE__MAX_REFERENCED:
				return getMaxReferenced();
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
			case SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCING_CATEGORY:
				setReferencingCategory((Category)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCED_CATEGORY:
				getReferencedCategory().clear();
				getReferencedCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCER_RULE__MIN_REFERENCED:
				setMinReferenced((Integer)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCER_RULE__MAX_REFERENCED:
				setMaxReferenced((Integer)newValue);
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
			case SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCING_CATEGORY:
				setReferencingCategory((Category)null);
				return;
			case SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCED_CATEGORY:
				getReferencedCategory().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCER_RULE__MIN_REFERENCED:
				setMinReferenced(MIN_REFERENCED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.REFERENCER_RULE__MAX_REFERENCED:
				setMaxReferenced(MAX_REFERENCED_EDEFAULT);
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
			case SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCING_CATEGORY:
				return referencingCategory != null;
			case SiteDirectoryDataPackage.REFERENCER_RULE__REFERENCED_CATEGORY:
				return referencedCategory != null && !referencedCategory.isEmpty();
			case SiteDirectoryDataPackage.REFERENCER_RULE__MIN_REFERENCED:
				return MIN_REFERENCED_EDEFAULT == null ? minReferenced != null : !MIN_REFERENCED_EDEFAULT.equals(minReferenced);
			case SiteDirectoryDataPackage.REFERENCER_RULE__MAX_REFERENCED:
				return MAX_REFERENCED_EDEFAULT == null ? maxReferenced != null : !MAX_REFERENCED_EDEFAULT.equals(maxReferenced);
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
		result.append(" (minReferenced: ");
		result.append(minReferenced);
		result.append(", maxReferenced: ");
		result.append(maxReferenced);
		result.append(')');
		return result.toString();
	}

} //ReferencerRuleImpl
