/**
 */
package CDP4.ReportingData;

import CDP4.SiteDirectoryData.Person;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Directory Data Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getRelatedThing <em>Related Thing</em>}</li>
 *   <li>{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getPrimaryAnnotatedThing <em>Primary Annotated Thing</em>}</li>
 *   <li>{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getDiscussion <em>Discussion</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getSiteDirectoryDataAnnotation()
 * @model
 * @generated
 */
public interface SiteDirectoryDataAnnotation extends GenericAnnotation {
	/**
	 * Returns the value of the '<em><b>Related Thing</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.SiteDirectoryThingReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Thing</em>' containment reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getSiteDirectoryDataAnnotation_RelatedThing()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<SiteDirectoryThingReference> getRelatedThing();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Person)
	 * @see CDP4.ReportingData.ReportingDataPackage#getSiteDirectoryDataAnnotation_Author()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Person getAuthor();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Person value);

	/**
	 * Returns the value of the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Annotated Thing</em>' reference.
	 * @see #setPrimaryAnnotatedThing(SiteDirectoryThingReference)
	 * @see CDP4.ReportingData.ReportingDataPackage#getSiteDirectoryDataAnnotation_PrimaryAnnotatedThing()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SiteDirectoryThingReference getPrimaryAnnotatedThing();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.SiteDirectoryDataAnnotation#getPrimaryAnnotatedThing <em>Primary Annotated Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Annotated Thing</em>' reference.
	 * @see #getPrimaryAnnotatedThing()
	 * @generated
	 */
	void setPrimaryAnnotatedThing(SiteDirectoryThingReference value);

	/**
	 * Returns the value of the '<em><b>Discussion</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.SiteDirectoryDataDiscussionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion</em>' containment reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getSiteDirectoryDataAnnotation_Discussion()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SiteDirectoryDataDiscussionItem> getDiscussion();

} // SiteDirectoryDataAnnotation
