/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Correspondence</b></em>'.
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
 * representation of a correspondence mapping between a single Thing (identified through its <i>iid</i>) and an external identifier
 *     </p>
 * 
 *     <p>
 * Note:&#160;See also ExternalIdentifierMap.
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
 *   <li>{@link CDP4.EngineeringModelData.IdCorrespondence#getInternalThing <em>Internal Thing</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.IdCorrespondence#getExternalId <em>External Id</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIdCorrespondence()
 * @model
 * @generated
 */
public interface IdCorrespondence extends Thing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Internal Thing</b></em>' attribute.
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
	 * weak reference to a Thing inside the current dataset
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Thing</em>' attribute.
	 * @see #setInternalThing(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIdCorrespondence_InternalThing()
	 * @model dataType="CDP4.CommonData.Uuid" required="true" ordered="false"
	 * @generated
	 */
	String getInternalThing();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.IdCorrespondence#getInternalThing <em>Internal Thing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Thing</em>' attribute.
	 * @see #getInternalThing()
	 * @generated
	 */
	void setInternalThing(String value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
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
	 * identifier of an item in an external model that corresponds to <i>internalThing</i>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIdCorrespondence_ExternalId()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.IdCorrespondence#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

} // IdCorrespondence
