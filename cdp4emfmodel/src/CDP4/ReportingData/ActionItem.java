/**
 */
package CDP4.ReportingData;

import CDP4.SiteDirectoryData.Participant;

import java.time.OffsetDateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.ActionItem#getActionee <em>Actionee</em>}</li>
 *   <li>{@link CDP4.ReportingData.ActionItem#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link CDP4.ReportingData.ActionItem#getCloseOutDate <em>Close Out Date</em>}</li>
 *   <li>{@link CDP4.ReportingData.ActionItem#getCloseOutStatement <em>Close Out Statement</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getActionItem()
 * @model
 * @generated
 */
public interface ActionItem extends ModellingAnnotationItem {
	/**
	 * Returns the value of the '<em><b>Actionee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionee</em>' reference.
	 * @see #setActionee(Participant)
	 * @see CDP4.ReportingData.ReportingDataPackage#getActionItem_Actionee()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getActionee();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ActionItem#getActionee <em>Actionee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionee</em>' reference.
	 * @see #getActionee()
	 * @generated
	 */
	void setActionee(Participant value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(OffsetDateTime)
	 * @see CDP4.ReportingData.ReportingDataPackage#getActionItem_DueDate()
	 * @model dataType="CDP4.CommonData.Date" required="true" ordered="false"
	 * @generated
	 */
	OffsetDateTime getDueDate();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ActionItem#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(OffsetDateTime value);

	/**
	 * Returns the value of the '<em><b>Close Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Out Date</em>' attribute.
	 * @see #setCloseOutDate(OffsetDateTime)
	 * @see CDP4.ReportingData.ReportingDataPackage#getActionItem_CloseOutDate()
	 * @model dataType="CDP4.CommonData.Date" ordered="false"
	 * @generated
	 */
	OffsetDateTime getCloseOutDate();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ActionItem#getCloseOutDate <em>Close Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Out Date</em>' attribute.
	 * @see #getCloseOutDate()
	 * @generated
	 */
	void setCloseOutDate(OffsetDateTime value);

	/**
	 * Returns the value of the '<em><b>Close Out Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Out Statement</em>' attribute.
	 * @see #setCloseOutStatement(String)
	 * @see CDP4.ReportingData.ReportingDataPackage#getActionItem_CloseOutStatement()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getCloseOutStatement();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ActionItem#getCloseOutStatement <em>Close Out Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Out Statement</em>' attribute.
	 * @see #getCloseOutStatement()
	 * @generated
	 */
	void setCloseOutStatement(String value);

} // ActionItem
