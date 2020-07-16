/**
 */
package CDP4.CommonData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volatile Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 *   <body>
 *     <p>
 * representation of a thing that can be volatile
 *     </p>
 * 
 *     <p>
 * Note:&#160;A volatile thing may or may not be persisted in a persistent data store, depending on the value of its <i>isVolatile</i> property. This serves to enable runtime-only use of such instances in a client application.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.VolatileThing#getIsVolatile <em>Is Volatile</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getVolatileThing()
 * @model abstract="true"
 * @generated
 */
public interface VolatileThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 * assertion whether this VolatileThing is volatile or not
	 *     <p>
	 * Note:&#160;When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Volatile</em>' attribute.
	 * @see #setIsVolatile(Boolean)
	 * @see CDP4.CommonData.CommonDataPackage#getVolatileThing_IsVolatile()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsVolatile();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.VolatileThing#getIsVolatile <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Volatile</em>' attribute.
	 * @see #getIsVolatile()
	 * @generated
	 */
	void setIsVolatile(Boolean value);

} // VolatileThing
