/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.TimeStampedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.IterationSetup;
import CDP4.SiteDirectoryData.ParticipantAffectedAccessThing;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.time.OffsetDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl#getIterationIid <em>Iteration Iid</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl#getIterationNumber <em>Iteration Number</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl#getSourceIterationSetup <em>Source Iteration Setup</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl#getFrozenOn <em>Frozen On</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.IterationSetupImpl#getIsDeleted <em>Is Deleted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IterationSetupImpl extends ThingImpl implements IterationSetup {
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
	 * The default value of the '{@link #getIterationIid() <em>Iteration Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationIid()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATION_IID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterationIid() <em>Iteration Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationIid()
	 * @generated
	 * @ordered
	 */
	protected String iterationIid = ITERATION_IID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterationNumber() <em>Iteration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ITERATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterationNumber() <em>Iteration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer iterationNumber = ITERATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceIterationSetup() <em>Source Iteration Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIterationSetup()
	 * @generated
	 * @ordered
	 */
	protected IterationSetup sourceIterationSetup;

	/**
	 * The default value of the '{@link #getFrozenOn() <em>Frozen On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrozenOn()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime FROZEN_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrozenOn() <em>Frozen On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrozenOn()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime frozenOn = FROZEN_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDeleted() <em>Is Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DELETED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDeleted() <em>Is Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeleted()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDeleted = IS_DELETED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationSetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.ITERATION_SETUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ITERATION_SETUP__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIterationIid() {
		return iterationIid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterationIid(String newIterationIid) {
		String oldIterationIid = iterationIid;
		iterationIid = newIterationIid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_IID, oldIterationIid, iterationIid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIterationNumber() {
		return iterationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterationNumber(Integer newIterationNumber) {
		Integer oldIterationNumber = iterationNumber;
		iterationNumber = newIterationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_NUMBER, oldIterationNumber, iterationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ITERATION_SETUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationSetup getSourceIterationSetup() {
		if (sourceIterationSetup != null && sourceIterationSetup.eIsProxy()) {
			InternalEObject oldSourceIterationSetup = (InternalEObject)sourceIterationSetup;
			sourceIterationSetup = (IterationSetup)eResolveProxy(oldSourceIterationSetup);
			if (sourceIterationSetup != oldSourceIterationSetup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.ITERATION_SETUP__SOURCE_ITERATION_SETUP, oldSourceIterationSetup, sourceIterationSetup));
			}
		}
		return sourceIterationSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationSetup basicGetSourceIterationSetup() {
		return sourceIterationSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIterationSetup(IterationSetup newSourceIterationSetup) {
		IterationSetup oldSourceIterationSetup = sourceIterationSetup;
		sourceIterationSetup = newSourceIterationSetup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ITERATION_SETUP__SOURCE_ITERATION_SETUP, oldSourceIterationSetup, sourceIterationSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getFrozenOn() {
		return frozenOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrozenOn(OffsetDateTime newFrozenOn) {
		OffsetDateTime oldFrozenOn = frozenOn;
		frozenOn = newFrozenOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ITERATION_SETUP__FROZEN_ON, oldFrozenOn, frozenOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeleted(Boolean newIsDeleted) {
		Boolean oldIsDeleted = isDeleted;
		isDeleted = newIsDeleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ITERATION_SETUP__IS_DELETED, oldIsDeleted, isDeleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.ITERATION_SETUP__CREATED_ON:
				return getCreatedOn();
			case SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_IID:
				return getIterationIid();
			case SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_NUMBER:
				return getIterationNumber();
			case SiteDirectoryDataPackage.ITERATION_SETUP__DESCRIPTION:
				return getDescription();
			case SiteDirectoryDataPackage.ITERATION_SETUP__SOURCE_ITERATION_SETUP:
				if (resolve) return getSourceIterationSetup();
				return basicGetSourceIterationSetup();
			case SiteDirectoryDataPackage.ITERATION_SETUP__FROZEN_ON:
				return getFrozenOn();
			case SiteDirectoryDataPackage.ITERATION_SETUP__IS_DELETED:
				return getIsDeleted();
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
			case SiteDirectoryDataPackage.ITERATION_SETUP__CREATED_ON:
				setCreatedOn((OffsetDateTime)newValue);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_IID:
				setIterationIid((String)newValue);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_NUMBER:
				setIterationNumber((Integer)newValue);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__SOURCE_ITERATION_SETUP:
				setSourceIterationSetup((IterationSetup)newValue);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__FROZEN_ON:
				setFrozenOn((OffsetDateTime)newValue);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__IS_DELETED:
				setIsDeleted((Boolean)newValue);
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
			case SiteDirectoryDataPackage.ITERATION_SETUP__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_IID:
				setIterationIid(ITERATION_IID_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_NUMBER:
				setIterationNumber(ITERATION_NUMBER_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__SOURCE_ITERATION_SETUP:
				setSourceIterationSetup((IterationSetup)null);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__FROZEN_ON:
				setFrozenOn(FROZEN_ON_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ITERATION_SETUP__IS_DELETED:
				setIsDeleted(IS_DELETED_EDEFAULT);
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
			case SiteDirectoryDataPackage.ITERATION_SETUP__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_IID:
				return ITERATION_IID_EDEFAULT == null ? iterationIid != null : !ITERATION_IID_EDEFAULT.equals(iterationIid);
			case SiteDirectoryDataPackage.ITERATION_SETUP__ITERATION_NUMBER:
				return ITERATION_NUMBER_EDEFAULT == null ? iterationNumber != null : !ITERATION_NUMBER_EDEFAULT.equals(iterationNumber);
			case SiteDirectoryDataPackage.ITERATION_SETUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SiteDirectoryDataPackage.ITERATION_SETUP__SOURCE_ITERATION_SETUP:
				return sourceIterationSetup != null;
			case SiteDirectoryDataPackage.ITERATION_SETUP__FROZEN_ON:
				return FROZEN_ON_EDEFAULT == null ? frozenOn != null : !FROZEN_ON_EDEFAULT.equals(frozenOn);
			case SiteDirectoryDataPackage.ITERATION_SETUP__IS_DELETED:
				return IS_DELETED_EDEFAULT == null ? isDeleted != null : !IS_DELETED_EDEFAULT.equals(isDeleted);
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
		if (baseClass == TimeStampedThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.ITERATION_SETUP__CREATED_ON: return CommonDataPackage.TIME_STAMPED_THING__CREATED_ON;
				default: return -1;
			}
		}
		if (baseClass == ParticipantAffectedAccessThing.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == TimeStampedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.TIME_STAMPED_THING__CREATED_ON: return SiteDirectoryDataPackage.ITERATION_SETUP__CREATED_ON;
				default: return -1;
			}
		}
		if (baseClass == ParticipantAffectedAccessThing.class) {
			switch (baseFeatureID) {
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
		result.append(" (createdOn: ");
		result.append(createdOn);
		result.append(", iterationIid: ");
		result.append(iterationIid);
		result.append(", iterationNumber: ");
		result.append(iterationNumber);
		result.append(", description: ");
		result.append(description);
		result.append(", frozenOn: ");
		result.append(frozenOn);
		result.append(", isDeleted: ");
		result.append(isDeleted);
		result.append(')');
		return result.toString();
	}

} //IterationSetupImpl
