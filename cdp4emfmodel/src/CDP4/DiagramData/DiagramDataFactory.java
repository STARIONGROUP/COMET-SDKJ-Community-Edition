/**
 */
package CDP4.DiagramData;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.DiagramData.DiagramDataPackage
 * @generated
 */
public interface DiagramDataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramDataFactory eINSTANCE = CDP4.DiagramData.impl.DiagramDataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounds</em>'.
	 * @generated
	 */
	Bounds createBounds();

	/**
	 * Returns a new object of class '<em>Owned Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owned Style</em>'.
	 * @generated
	 */
	OwnedStyle createOwnedStyle();

	/**
	 * Returns a new object of class '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color</em>'.
	 * @generated
	 */
	Color createColor();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Diagram Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Edge</em>'.
	 * @generated
	 */
	DiagramEdge createDiagramEdge();

	/**
	 * Returns a new object of class '<em>Diagram Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Object</em>'.
	 * @generated
	 */
	DiagramObject createDiagramObject();

	/**
	 * Returns a new object of class '<em>Diagram Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Canvas</em>'.
	 * @generated
	 */
	DiagramCanvas createDiagramCanvas();

	/**
	 * Returns a new object of class '<em>Shared Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Style</em>'.
	 * @generated
	 */
	SharedStyle createSharedStyle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiagramDataPackage getDiagramDataPackage();

} //DiagramDataFactory
