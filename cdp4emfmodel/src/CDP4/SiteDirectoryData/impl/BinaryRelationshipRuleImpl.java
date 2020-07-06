/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.BinaryRelationshipRule;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Relationship Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl#getRelationshipCategory <em>Relationship Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl#getSourceCategory <em>Source Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl#getTargetCategory <em>Target Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl#getForwardRelationshipName <em>Forward Relationship Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.BinaryRelationshipRuleImpl#getInverseRelationshipName <em>Inverse Relationship Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryRelationshipRuleImpl extends RuleImpl implements BinaryRelationshipRule {
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
	 * The cached value of the '{@link #getSourceCategory() <em>Source Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCategory()
	 * @generated
	 * @ordered
	 */
	protected Category sourceCategory;

	/**
	 * The cached value of the '{@link #getTargetCategory() <em>Target Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCategory()
	 * @generated
	 * @ordered
	 */
	protected Category targetCategory;

	/**
	 * The default value of the '{@link #getForwardRelationshipName() <em>Forward Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORWARD_RELATIONSHIP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForwardRelationshipName() <em>Forward Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected String forwardRelationshipName = FORWARD_RELATIONSHIP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInverseRelationshipName() <em>Inverse Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected static final String INVERSE_RELATIONSHIP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInverseRelationshipName() <em>Inverse Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected String inverseRelationshipName = INVERSE_RELATIONSHIP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryRelationshipRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.BINARY_RELATIONSHIP_RULE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY, oldRelationshipCategory, relationshipCategory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY, oldRelationshipCategory, relationshipCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getSourceCategory() {
		if (sourceCategory != null && sourceCategory.eIsProxy()) {
			InternalEObject oldSourceCategory = (InternalEObject)sourceCategory;
			sourceCategory = (Category)eResolveProxy(oldSourceCategory);
			if (sourceCategory != oldSourceCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY, oldSourceCategory, sourceCategory));
			}
		}
		return sourceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetSourceCategory() {
		return sourceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCategory(Category newSourceCategory) {
		Category oldSourceCategory = sourceCategory;
		sourceCategory = newSourceCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY, oldSourceCategory, sourceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getTargetCategory() {
		if (targetCategory != null && targetCategory.eIsProxy()) {
			InternalEObject oldTargetCategory = (InternalEObject)targetCategory;
			targetCategory = (Category)eResolveProxy(oldTargetCategory);
			if (targetCategory != oldTargetCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY, oldTargetCategory, targetCategory));
			}
		}
		return targetCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetTargetCategory() {
		return targetCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCategory(Category newTargetCategory) {
		Category oldTargetCategory = targetCategory;
		targetCategory = newTargetCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY, oldTargetCategory, targetCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForwardRelationshipName() {
		return forwardRelationshipName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardRelationshipName(String newForwardRelationshipName) {
		String oldForwardRelationshipName = forwardRelationshipName;
		forwardRelationshipName = newForwardRelationshipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__FORWARD_RELATIONSHIP_NAME, oldForwardRelationshipName, forwardRelationshipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInverseRelationshipName() {
		return inverseRelationshipName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseRelationshipName(String newInverseRelationshipName) {
		String oldInverseRelationshipName = inverseRelationshipName;
		inverseRelationshipName = newInverseRelationshipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__INVERSE_RELATIONSHIP_NAME, oldInverseRelationshipName, inverseRelationshipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY:
				if (resolve) return getRelationshipCategory();
				return basicGetRelationshipCategory();
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY:
				if (resolve) return getSourceCategory();
				return basicGetSourceCategory();
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY:
				if (resolve) return getTargetCategory();
				return basicGetTargetCategory();
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__FORWARD_RELATIONSHIP_NAME:
				return getForwardRelationshipName();
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__INVERSE_RELATIONSHIP_NAME:
				return getInverseRelationshipName();
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
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY:
				setRelationshipCategory((Category)newValue);
				return;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY:
				setSourceCategory((Category)newValue);
				return;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY:
				setTargetCategory((Category)newValue);
				return;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__FORWARD_RELATIONSHIP_NAME:
				setForwardRelationshipName((String)newValue);
				return;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__INVERSE_RELATIONSHIP_NAME:
				setInverseRelationshipName((String)newValue);
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
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY:
				setRelationshipCategory((Category)null);
				return;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY:
				setSourceCategory((Category)null);
				return;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY:
				setTargetCategory((Category)null);
				return;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__FORWARD_RELATIONSHIP_NAME:
				setForwardRelationshipName(FORWARD_RELATIONSHIP_NAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__INVERSE_RELATIONSHIP_NAME:
				setInverseRelationshipName(INVERSE_RELATIONSHIP_NAME_EDEFAULT);
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
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY:
				return relationshipCategory != null;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY:
				return sourceCategory != null;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY:
				return targetCategory != null;
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__FORWARD_RELATIONSHIP_NAME:
				return FORWARD_RELATIONSHIP_NAME_EDEFAULT == null ? forwardRelationshipName != null : !FORWARD_RELATIONSHIP_NAME_EDEFAULT.equals(forwardRelationshipName);
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE__INVERSE_RELATIONSHIP_NAME:
				return INVERSE_RELATIONSHIP_NAME_EDEFAULT == null ? inverseRelationshipName != null : !INVERSE_RELATIONSHIP_NAME_EDEFAULT.equals(inverseRelationshipName);
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
		result.append(" (forwardRelationshipName: ");
		result.append(forwardRelationshipName);
		result.append(", inverseRelationshipName: ");
		result.append(inverseRelationshipName);
		result.append(')');
		return result.toString();
	}

} //BinaryRelationshipRuleImpl
