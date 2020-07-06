/**
 */
package CDP4.ReportingData.impl;

import CDP4.ReportingData.ReportingDataPackage;
import CDP4.ReportingData.ReviewItemDiscrepancy;
import CDP4.ReportingData.Solution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review Item Discrepancy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.ReviewItemDiscrepancyImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewItemDiscrepancyImpl extends ModellingAnnotationItemImpl implements ReviewItemDiscrepancy {
	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution solution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewItemDiscrepancyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.REVIEW_ITEM_DISCREPANCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolution(Solution newSolution, NotificationChain msgs) {
		Solution oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION, oldSolution, newSolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(Solution newSolution) {
		if (newSolution != solution) {
			NotificationChain msgs = null;
			if (solution != null)
				msgs = ((InternalEObject)solution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION, null, msgs);
			if (newSolution != null)
				msgs = ((InternalEObject)newSolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION, null, msgs);
			msgs = basicSetSolution(newSolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION, newSolution, newSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION:
				return basicSetSolution(null, msgs);
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
			case ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION:
				return getSolution();
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
			case ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION:
				setSolution((Solution)newValue);
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
			case ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION:
				setSolution((Solution)null);
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
			case ReportingDataPackage.REVIEW_ITEM_DISCREPANCY__SOLUTION:
				return solution != null;
		}
		return super.eIsSet(featureID);
	}

} //ReviewItemDiscrepancyImpl
