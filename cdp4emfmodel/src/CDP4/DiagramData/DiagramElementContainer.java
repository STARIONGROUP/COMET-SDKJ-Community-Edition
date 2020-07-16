/**
 */
package CDP4.DiagramData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.DiagramElementContainer#getDiagramElement <em>Diagram Element</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagramElementContainer#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramElementContainer()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElementContainer extends DiagramThingBase {
	/**
	 * Returns the value of the '<em><b>Diagram Element</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.DiagramData.DiagramElementThing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Element</em>' containment reference list.
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramElementContainer_DiagramElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiagramElementThing> getDiagramElement();

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramElementContainer_Bounds()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagramElementContainer#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

} // DiagramElementContainer
