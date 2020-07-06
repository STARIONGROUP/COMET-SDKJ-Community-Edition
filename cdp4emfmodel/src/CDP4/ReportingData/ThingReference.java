/**
 */
package CDP4.ReportingData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.ThingReference#getReferencedRevisionNumber <em>Referenced Revision Number</em>}</li>
 *   <li>{@link CDP4.ReportingData.ThingReference#getReferencedThing <em>Referenced Thing</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getThingReference()
 * @model abstract="true"
 * @generated
 */
public interface ThingReference extends Thing {
	/**
	 * Returns the value of the '<em><b>Referenced Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Revision Number</em>' attribute.
	 * @see #setReferencedRevisionNumber(Integer)
	 * @see CDP4.ReportingData.ReportingDataPackage#getThingReference_ReferencedRevisionNumber()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getReferencedRevisionNumber();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ThingReference#getReferencedRevisionNumber <em>Referenced Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Revision Number</em>' attribute.
	 * @see #getReferencedRevisionNumber()
	 * @generated
	 */
	void setReferencedRevisionNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Referenced Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Thing</em>' reference.
	 * @see #setReferencedThing(Thing)
	 * @see CDP4.ReportingData.ReportingDataPackage#getThingReference_ReferencedThing()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Thing getReferencedThing();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ThingReference#getReferencedThing <em>Referenced Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Thing</em>' reference.
	 * @see #getReferencedThing()
	 * @generated
	 */
	void setReferencedThing(Thing value);

} // ThingReference
