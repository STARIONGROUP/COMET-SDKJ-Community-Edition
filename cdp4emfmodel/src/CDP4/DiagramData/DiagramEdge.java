/**
 */
package CDP4.DiagramData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.DiagramEdge#getSource <em>Source</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagramEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagramEdge#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramEdge()
 * @model
 * @generated
 */
public interface DiagramEdge extends DiagramElementThing {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DiagramElementThing)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramEdge_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DiagramElementThing getSource();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagramEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DiagramElementThing value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DiagramElementThing)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramEdge_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DiagramElementThing getTarget();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagramEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DiagramElementThing value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.DiagramData.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference list.
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramEdge_Point()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoint();

} // DiagramEdge
