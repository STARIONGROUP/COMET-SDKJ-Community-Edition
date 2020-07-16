/**
 */
package CDP4.ReportingData;

import CDP4.EngineeringModelData.OwnedThing;

import CDP4.SiteDirectoryData.Participant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.Solution#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends GenericAnnotation, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Participant)
	 * @see CDP4.ReportingData.ReportingDataPackage#getSolution_Author()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getAuthor();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.Solution#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Participant value);

} // Solution
