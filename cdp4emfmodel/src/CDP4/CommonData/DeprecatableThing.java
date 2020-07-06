/**
 */
package CDP4.CommonData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deprecatable Thing</b></em>'.
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
 * thing that can be deprecated, meaning it is declared to be obsolescent
 *     </p>
 * 
 *     <p>
 * Note:&#160;Deprecation is used on objects that become obsolescent and should no longer be used, but cannot be deleted because that would potentially invalidate existing (e.g. archived)&#160;datasets that still reference such data. Typically this is the case for instances contained by a SiteDirectory and by ReferenceDataLibraries.
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
 *   <li>{@link CDP4.CommonData.DeprecatableThing#getIsDeprecated <em>Is Deprecated</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getDeprecatableThing()
 * @model abstract="true"
 * @generated
 */
public interface DeprecatableThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     assertion whether a DeprecatableThing is deprecated or not
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Deprecated</em>' attribute.
	 * @see #setIsDeprecated(Boolean)
	 * @see CDP4.CommonData.CommonDataPackage#getDeprecatableThing_IsDeprecated()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDeprecated();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.DeprecatableThing#getIsDeprecated <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deprecated</em>' attribute.
	 * @see #getIsDeprecated()
	 * @generated
	 */
	void setIsDeprecated(Boolean value);

} // DeprecatableThing
