/**
 */
package CDP4.ReportingData.impl;

import CDP4.ReportingData.ChangeProposal;
import CDP4.ReportingData.ChangeRequest;
import CDP4.ReportingData.ReportingDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.ChangeProposalImpl#getChangeRequest <em>Change Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeProposalImpl extends ModellingAnnotationItemImpl implements ChangeProposal {
	/**
	 * The cached value of the '{@link #getChangeRequest() <em>Change Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRequest()
	 * @generated
	 * @ordered
	 */
	protected ChangeRequest changeRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.CHANGE_PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequest getChangeRequest() {
		if (changeRequest != null && changeRequest.eIsProxy()) {
			InternalEObject oldChangeRequest = (InternalEObject)changeRequest;
			changeRequest = (ChangeRequest)eResolveProxy(oldChangeRequest);
			if (changeRequest != oldChangeRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.CHANGE_PROPOSAL__CHANGE_REQUEST, oldChangeRequest, changeRequest));
			}
		}
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequest basicGetChangeRequest() {
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeRequest(ChangeRequest newChangeRequest) {
		ChangeRequest oldChangeRequest = changeRequest;
		changeRequest = newChangeRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.CHANGE_PROPOSAL__CHANGE_REQUEST, oldChangeRequest, changeRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingDataPackage.CHANGE_PROPOSAL__CHANGE_REQUEST:
				if (resolve) return getChangeRequest();
				return basicGetChangeRequest();
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
			case ReportingDataPackage.CHANGE_PROPOSAL__CHANGE_REQUEST:
				setChangeRequest((ChangeRequest)newValue);
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
			case ReportingDataPackage.CHANGE_PROPOSAL__CHANGE_REQUEST:
				setChangeRequest((ChangeRequest)null);
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
			case ReportingDataPackage.CHANGE_PROPOSAL__CHANGE_REQUEST:
				return changeRequest != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeProposalImpl
