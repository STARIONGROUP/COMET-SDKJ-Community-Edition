/**
 */
package CDP4.ReportingData.impl;

import CDP4.ReportingData.ChangeProposal;
import CDP4.ReportingData.ContractChangeNotice;
import CDP4.ReportingData.ReportingDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Change Notice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.ContractChangeNoticeImpl#getChangeProposal <em>Change Proposal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractChangeNoticeImpl extends ModellingAnnotationItemImpl implements ContractChangeNotice {
	/**
	 * The cached value of the '{@link #getChangeProposal() <em>Change Proposal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeProposal()
	 * @generated
	 * @ordered
	 */
	protected ChangeProposal changeProposal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractChangeNoticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.CONTRACT_CHANGE_NOTICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeProposal getChangeProposal() {
		if (changeProposal != null && changeProposal.eIsProxy()) {
			InternalEObject oldChangeProposal = (InternalEObject)changeProposal;
			changeProposal = (ChangeProposal)eResolveProxy(oldChangeProposal);
			if (changeProposal != oldChangeProposal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL, oldChangeProposal, changeProposal));
			}
		}
		return changeProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeProposal basicGetChangeProposal() {
		return changeProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeProposal(ChangeProposal newChangeProposal) {
		ChangeProposal oldChangeProposal = changeProposal;
		changeProposal = newChangeProposal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL, oldChangeProposal, changeProposal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingDataPackage.CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL:
				if (resolve) return getChangeProposal();
				return basicGetChangeProposal();
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
			case ReportingDataPackage.CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL:
				setChangeProposal((ChangeProposal)newValue);
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
			case ReportingDataPackage.CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL:
				setChangeProposal((ChangeProposal)null);
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
			case ReportingDataPackage.CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL:
				return changeProposal != null;
		}
		return super.eIsSet(featureID);
	}

} //ContractChangeNoticeImpl
