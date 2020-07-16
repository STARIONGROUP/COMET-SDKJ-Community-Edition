/**
 */
package CDP4.ReportingData;

import CDP4.SiteDirectoryData.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Directory Data Discussion Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.SiteDirectoryDataDiscussionItem#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getSiteDirectoryDataDiscussionItem()
 * @model
 * @generated
 */
public interface SiteDirectoryDataDiscussionItem extends DiscussionItem {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Person)
	 * @see CDP4.ReportingData.ReportingDataPackage#getSiteDirectoryDataDiscussionItem_Author()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Person getAuthor();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.SiteDirectoryDataDiscussionItem#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Person value);

} // SiteDirectoryDataDiscussionItem
