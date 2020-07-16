/**
 */
package CDP4.ReportingData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Change Notice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.ContractChangeNotice#getChangeProposal <em>Change Proposal</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getContractChangeNotice()
 * @model
 * @generated
 */
public interface ContractChangeNotice extends ModellingAnnotationItem {
	/**
	 * Returns the value of the '<em><b>Change Proposal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Proposal</em>' reference.
	 * @see #setChangeProposal(ChangeProposal)
	 * @see CDP4.ReportingData.ReportingDataPackage#getContractChangeNotice_ChangeProposal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ChangeProposal getChangeProposal();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ContractChangeNotice#getChangeProposal <em>Change Proposal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Proposal</em>' reference.
	 * @see #getChangeProposal()
	 * @generated
	 */
	void setChangeProposal(ChangeProposal value);

} // ContractChangeNotice
