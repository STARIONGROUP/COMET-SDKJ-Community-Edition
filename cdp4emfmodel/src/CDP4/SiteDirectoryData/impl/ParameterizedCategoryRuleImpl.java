/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.ParameterType;
import CDP4.SiteDirectoryData.ParameterizedCategoryRule;
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
 * An implementation of the model object '<em><b>Parameterized Category Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParameterizedCategoryRuleImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParameterizedCategoryRuleImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterizedCategoryRuleImpl extends RuleImpl implements ParameterizedCategoryRule {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> parameterType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedCategoryRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.PARAMETERIZED_CATEGORY_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Category)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterType> getParameterType() {
		if (parameterType == null) {
			parameterType = new EObjectResolvingEList<ParameterType>(ParameterType.class, this, SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__PARAMETER_TYPE);
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__PARAMETER_TYPE:
				return getParameterType();
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
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__CATEGORY:
				setCategory((Category)newValue);
				return;
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__PARAMETER_TYPE:
				getParameterType().clear();
				getParameterType().addAll((Collection<? extends ParameterType>)newValue);
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
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__CATEGORY:
				setCategory((Category)null);
				return;
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__PARAMETER_TYPE:
				getParameterType().clear();
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
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__CATEGORY:
				return category != null;
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE__PARAMETER_TYPE:
				return parameterType != null && !parameterType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterizedCategoryRuleImpl
