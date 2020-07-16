/**
 */
package CDP4.DiagramData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.DiagramData.DiagramElementThing#getDepictedThing <em>Depicted Thing</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagramElementThing#getLocalStyle <em>Local Style</em>}</li>
 *   <li>{@link CDP4.DiagramData.DiagramElementThing#getSharedStyle <em>Shared Style</em>}</li>
 * </ul>
 *
 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramElementThing()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElementThing extends DiagramElementContainer {
	/**
	 * Returns the value of the '<em><b>Depicted Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depicted Thing</em>' reference.
	 * @see #setDepictedThing(Thing)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramElementThing_DepictedThing()
	 * @model ordered="false"
	 * @generated
	 */
	Thing getDepictedThing();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagramElementThing#getDepictedThing <em>Depicted Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depicted Thing</em>' reference.
	 * @see #getDepictedThing()
	 * @generated
	 */
	void setDepictedThing(Thing value);

	/**
	 * Returns the value of the '<em><b>Local Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Style</em>' containment reference.
	 * @see #setLocalStyle(OwnedStyle)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramElementThing_LocalStyle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OwnedStyle getLocalStyle();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagramElementThing#getLocalStyle <em>Local Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Style</em>' containment reference.
	 * @see #getLocalStyle()
	 * @generated
	 */
	void setLocalStyle(OwnedStyle value);

	/**
	 * Returns the value of the '<em><b>Shared Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Style</em>' reference.
	 * @see #setSharedStyle(SharedStyle)
	 * @see CDP4.DiagramData.DiagramDataPackage#getDiagramElementThing_SharedStyle()
	 * @model ordered="false"
	 * @generated
	 */
	SharedStyle getSharedStyle();

	/**
	 * Sets the value of the '{@link CDP4.DiagramData.DiagramElementThing#getSharedStyle <em>Shared Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Style</em>' reference.
	 * @see #getSharedStyle()
	 * @generated
	 */
	void setSharedStyle(SharedStyle value);

} // DiagramElementThing
