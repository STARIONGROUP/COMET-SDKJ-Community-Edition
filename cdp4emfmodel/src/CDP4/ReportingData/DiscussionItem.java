/**
 */
package CDP4.ReportingData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discussion Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.DiscussionItem#getReplyTo <em>Reply To</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getDiscussionItem()
 * @model abstract="true"
 * @generated
 */
public interface DiscussionItem extends GenericAnnotation {
	/**
	 * Returns the value of the '<em><b>Reply To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply To</em>' reference.
	 * @see #setReplyTo(DiscussionItem)
	 * @see CDP4.ReportingData.ReportingDataPackage#getDiscussionItem_ReplyTo()
	 * @model ordered="false"
	 * @generated
	 */
	DiscussionItem getReplyTo();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.DiscussionItem#getReplyTo <em>Reply To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To</em>' reference.
	 * @see #getReplyTo()
	 * @generated
	 */
	void setReplyTo(DiscussionItem value);

} // DiscussionItem
