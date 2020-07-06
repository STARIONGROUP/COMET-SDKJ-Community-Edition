/**
 */
package CDP4.ReportingData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review Item Discrepancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.ReviewItemDiscrepancy#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getReviewItemDiscrepancy()
 * @model
 * @generated
 */
public interface ReviewItemDiscrepancy extends ModellingAnnotationItem {
	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' containment reference.
	 * @see #setSolution(Solution)
	 * @see CDP4.ReportingData.ReportingDataPackage#getReviewItemDiscrepancy_Solution()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ReviewItemDiscrepancy#getSolution <em>Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' containment reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

} // ReviewItemDiscrepancy
