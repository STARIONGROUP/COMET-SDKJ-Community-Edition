/**
 */
package CDP4.ReportingData.impl;

import CDP4.ReportingData.DiscussionItem;
import CDP4.ReportingData.ReportingDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discussion Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.DiscussionItemImpl#getReplyTo <em>Reply To</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiscussionItemImpl extends GenericAnnotationImpl implements DiscussionItem {
	/**
	 * The cached value of the '{@link #getReplyTo() <em>Reply To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyTo()
	 * @generated
	 * @ordered
	 */
	protected DiscussionItem replyTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscussionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.DISCUSSION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionItem getReplyTo() {
		if (replyTo != null && replyTo.eIsProxy()) {
			InternalEObject oldReplyTo = (InternalEObject)replyTo;
			replyTo = (DiscussionItem)eResolveProxy(oldReplyTo);
			if (replyTo != oldReplyTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.DISCUSSION_ITEM__REPLY_TO, oldReplyTo, replyTo));
			}
		}
		return replyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionItem basicGetReplyTo() {
		return replyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyTo(DiscussionItem newReplyTo) {
		DiscussionItem oldReplyTo = replyTo;
		replyTo = newReplyTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.DISCUSSION_ITEM__REPLY_TO, oldReplyTo, replyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingDataPackage.DISCUSSION_ITEM__REPLY_TO:
				if (resolve) return getReplyTo();
				return basicGetReplyTo();
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
			case ReportingDataPackage.DISCUSSION_ITEM__REPLY_TO:
				setReplyTo((DiscussionItem)newValue);
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
			case ReportingDataPackage.DISCUSSION_ITEM__REPLY_TO:
				setReplyTo((DiscussionItem)null);
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
			case ReportingDataPackage.DISCUSSION_ITEM__REPLY_TO:
				return replyTo != null;
		}
		return super.eIsSet(featureID);
	}

} //DiscussionItemImpl
