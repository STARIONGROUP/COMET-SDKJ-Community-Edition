/**
 */
package CDP4.CommonData;

import java.time.OffsetDateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Container</b></em>'.
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
 * representation of a top container
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;A concrete subclass of TopContainer must be instantiated as a singleton in a dataset. This singleton instance is the top containing object of all objects in the composite tree of objects in the dataset, and therefore also the natural first entry point for navigating to all data contained in the dataset through composite structure.
 *     </p>
 * 
 *     <p>
 * Note 2: The <i>revisionNumber</i> of a TopContainer object is by definition equal to the highest <i>revisionNumber</i> in any of its directly or indirectly contained objects. See also Thing. This enables sending a request to a persistent data store to get all new and updated objects with a <i>revisionNumber</i> greater than a given <i>revisionNumber</i>. When a request with <i>revisionNumber</i> equal to zero is sent, all objects contained in a TopContainer will be returned.
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
 *   <li>{@link CDP4.CommonData.TopContainer#getLastModifiedOn <em>Last Modified On</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getTopContainer()
 * @model abstract="true"
 * @generated
 */
public interface TopContainer extends Thing {
	/**
	 * Returns the value of the '<em><b>Last Modified On</b></em>' attribute.
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
	 *     <p>
	 * date and time of the last modification to this TopContainer expressed in UTC (<a href="http://en.wikipedia.org/wiki/Coordinated_Universal_Time">Coordinated Universal Time</a>)&#160;with millisecond accuracy
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified On</em>' attribute.
	 * @see #setLastModifiedOn(OffsetDateTime)
	 * @see CDP4.CommonData.CommonDataPackage#getTopContainer_LastModifiedOn()
	 * @model dataType="CDP4.CommonData.DateTime" required="true" ordered="false"
	 * @generated
	 */
	OffsetDateTime getLastModifiedOn();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.TopContainer#getLastModifiedOn <em>Last Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified On</em>' attribute.
	 * @see #getLastModifiedOn()
	 * @generated
	 */
	void setLastModifiedOn(OffsetDateTime value);

} // TopContainer
