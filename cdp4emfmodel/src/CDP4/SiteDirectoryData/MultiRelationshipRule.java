/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Relationship Rule</b></em>'.
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
 * representation of a validation rule for MultiRelationships that relate (potentially)&#160;more than two CategorizableThings
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getRelationshipCategory <em>Relationship Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getRelatedCategory <em>Related Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getMinRelated <em>Min Related</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getMaxRelated <em>Max Related</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMultiRelationshipRule()
 * @model
 * @generated
 */
public interface MultiRelationshipRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Relationship Category</b></em>' reference.
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
	 * reference to the Category whose member MultiRelationships shall comply with this MultiRelationshipRule
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Category</em>' reference.
	 * @see #setRelationshipCategory(Category)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMultiRelationshipRule_RelationshipCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getRelationshipCategory();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getRelationshipCategory <em>Relationship Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Category</em>' reference.
	 * @see #getRelationshipCategory()
	 * @generated
	 */
	void setRelationshipCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Related Category</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Category}.
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
	 * reference to valid Categories for <i>relatedThing</i> of implied MultiRelationships
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Category</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMultiRelationshipRule_RelatedCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Category> getRelatedCategory();

	/**
	 * Returns the value of the '<em><b>Min Related</b></em>' attribute.
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
	 * definition of the valid minimum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This can be used to define a cardinality constraint.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Related</em>' attribute.
	 * @see #setMinRelated(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMultiRelationshipRule_MinRelated()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMinRelated();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getMinRelated <em>Min Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Related</em>' attribute.
	 * @see #getMinRelated()
	 * @generated
	 */
	void setMinRelated(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Related</b></em>' attribute.
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
	 * definition of the valid maximum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;This can be used to define a cardinality constraint.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;A value of -1 signifies that an unlimited number of <i>relatedThing</i> is valid.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Related</em>' attribute.
	 * @see #setMaxRelated(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMultiRelationshipRule_MaxRelated()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMaxRelated();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MultiRelationshipRule#getMaxRelated <em>Max Related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Related</em>' attribute.
	 * @see #getMaxRelated()
	 * @generated
	 */
	void setMaxRelated(Integer value);

} // MultiRelationshipRule
