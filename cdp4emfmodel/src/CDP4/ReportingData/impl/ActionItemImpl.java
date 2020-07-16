/**
 */
package CDP4.ReportingData.impl;

import CDP4.ReportingData.ActionItem;
import CDP4.ReportingData.ReportingDataPackage;

import CDP4.SiteDirectoryData.Participant;

import java.time.OffsetDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.ActionItemImpl#getActionee <em>Actionee</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ActionItemImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ActionItemImpl#getCloseOutDate <em>Close Out Date</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ActionItemImpl#getCloseOutStatement <em>Close Out Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionItemImpl extends ModellingAnnotationItemImpl implements ActionItem {
	/**
	 * The cached value of the '{@link #getActionee() <em>Actionee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionee()
	 * @generated
	 * @ordered
	 */
	protected Participant actionee;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloseOutDate() <em>Close Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseOutDate()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime CLOSE_OUT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloseOutDate() <em>Close Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseOutDate()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime closeOutDate = CLOSE_OUT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloseOutStatement() <em>Close Out Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseOutStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSE_OUT_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloseOutStatement() <em>Close Out Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseOutStatement()
	 * @generated
	 * @ordered
	 */
	protected String closeOutStatement = CLOSE_OUT_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.ACTION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getActionee() {
		if (actionee != null && actionee.eIsProxy()) {
			InternalEObject oldActionee = (InternalEObject)actionee;
			actionee = (Participant)eResolveProxy(oldActionee);
			if (actionee != oldActionee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.ACTION_ITEM__ACTIONEE, oldActionee, actionee));
			}
		}
		return actionee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetActionee() {
		return actionee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionee(Participant newActionee) {
		Participant oldActionee = actionee;
		actionee = newActionee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.ACTION_ITEM__ACTIONEE, oldActionee, actionee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(OffsetDateTime newDueDate) {
		OffsetDateTime oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.ACTION_ITEM__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getCloseOutDate() {
		return closeOutDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseOutDate(OffsetDateTime newCloseOutDate) {
		OffsetDateTime oldCloseOutDate = closeOutDate;
		closeOutDate = newCloseOutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_DATE, oldCloseOutDate, closeOutDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCloseOutStatement() {
		return closeOutStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseOutStatement(String newCloseOutStatement) {
		String oldCloseOutStatement = closeOutStatement;
		closeOutStatement = newCloseOutStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_STATEMENT, oldCloseOutStatement, closeOutStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingDataPackage.ACTION_ITEM__ACTIONEE:
				if (resolve) return getActionee();
				return basicGetActionee();
			case ReportingDataPackage.ACTION_ITEM__DUE_DATE:
				return getDueDate();
			case ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_DATE:
				return getCloseOutDate();
			case ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_STATEMENT:
				return getCloseOutStatement();
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
			case ReportingDataPackage.ACTION_ITEM__ACTIONEE:
				setActionee((Participant)newValue);
				return;
			case ReportingDataPackage.ACTION_ITEM__DUE_DATE:
				setDueDate((OffsetDateTime)newValue);
				return;
			case ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_DATE:
				setCloseOutDate((OffsetDateTime)newValue);
				return;
			case ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_STATEMENT:
				setCloseOutStatement((String)newValue);
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
			case ReportingDataPackage.ACTION_ITEM__ACTIONEE:
				setActionee((Participant)null);
				return;
			case ReportingDataPackage.ACTION_ITEM__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_DATE:
				setCloseOutDate(CLOSE_OUT_DATE_EDEFAULT);
				return;
			case ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_STATEMENT:
				setCloseOutStatement(CLOSE_OUT_STATEMENT_EDEFAULT);
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
			case ReportingDataPackage.ACTION_ITEM__ACTIONEE:
				return actionee != null;
			case ReportingDataPackage.ACTION_ITEM__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_DATE:
				return CLOSE_OUT_DATE_EDEFAULT == null ? closeOutDate != null : !CLOSE_OUT_DATE_EDEFAULT.equals(closeOutDate);
			case ReportingDataPackage.ACTION_ITEM__CLOSE_OUT_STATEMENT:
				return CLOSE_OUT_STATEMENT_EDEFAULT == null ? closeOutStatement != null : !CLOSE_OUT_STATEMENT_EDEFAULT.equals(closeOutStatement);
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
		result.append(" (dueDate: ");
		result.append(dueDate);
		result.append(", closeOutDate: ");
		result.append(closeOutDate);
		result.append(", closeOutStatement: ");
		result.append(closeOutStatement);
		result.append(')');
		return result.toString();
	}

} //ActionItemImpl
