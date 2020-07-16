/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Relationship Rule</b></em>'.
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
 * representation of a validation rule for BinaryRelationships
 *     </p>
 * 
 *     <p>
 * Note: A BinaryRelationshipRule specifies for BinaryRelationships that are a member of the <i>relationshipCategory</i> what are the valid Categories for the related <i>source</i> and <i>target</i> Things
 *     </p>
 * 
 *     <p>
 * Example: A rule where the <i>relationshipCategory</i> is Category &quot;RequirementSatisfactionTraces&quot;, the sourceCategory is &quot;ArchitecturalElements&quot; (with <i>permissibleClass</i> ElementDefinition, ElementUsage) and the <i>targetCategory</i> is Category &quot;Requirements&quot; (with <i>permissibleClass</i> Requirement).
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
 *   <li>{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getRelationshipCategory <em>Relationship Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getSourceCategory <em>Source Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getTargetCategory <em>Target Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getForwardRelationshipName <em>Forward Relationship Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getInverseRelationshipName <em>Inverse Relationship Name</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getBinaryRelationshipRule()
 * @model
 * @generated
 */
public interface BinaryRelationshipRule extends Rule {
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
	 * reference to the Category whose member BinaryRelationships shall comply with this BinaryRelationshipRule
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Category</em>' reference.
	 * @see #setRelationshipCategory(Category)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getBinaryRelationshipRule_RelationshipCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getRelationshipCategory();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getRelationshipCategory <em>Relationship Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Category</em>' reference.
	 * @see #getRelationshipCategory()
	 * @generated
	 */
	void setRelationshipCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Source Category</b></em>' reference.
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
	 * reference to the Category to which the <i>source</i> of the BinaryRelationship must belong
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Category</em>' reference.
	 * @see #setSourceCategory(Category)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getBinaryRelationshipRule_SourceCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getSourceCategory();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getSourceCategory <em>Source Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Category</em>' reference.
	 * @see #getSourceCategory()
	 * @generated
	 */
	void setSourceCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Target Category</b></em>' reference.
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
	 * reference to the Category to which the <i>target</i> of the BinaryRelationship must belong
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Category</em>' reference.
	 * @see #setTargetCategory(Category)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getBinaryRelationshipRule_TargetCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getTargetCategory();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getTargetCategory <em>Target Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Category</em>' reference.
	 * @see #getTargetCategory()
	 * @generated
	 */
	void setTargetCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Forward Relationship Name</b></em>' attribute.
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
	 * name of the relationship when read from the <i>source</i> to the <i>target</i> of a BinaryRelationship
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;For a &quot;RequirementsSatisfactionTraces&quot;&#160;Category between &quot;ArchitecturalElements&quot;&#160;(source)&#160;and &quot;Requirements&quot;&#160;(target)&#160;the <i>forwardRelationshipName</i> would be &quot;satisfies&quot;&#160;and the <i>inverseRelationshipName</i> would be &quot;is satisfied by&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forward Relationship Name</em>' attribute.
	 * @see #setForwardRelationshipName(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getBinaryRelationshipRule_ForwardRelationshipName()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getForwardRelationshipName();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getForwardRelationshipName <em>Forward Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Relationship Name</em>' attribute.
	 * @see #getForwardRelationshipName()
	 * @generated
	 */
	void setForwardRelationshipName(String value);

	/**
	 * Returns the value of the '<em><b>Inverse Relationship Name</b></em>' attribute.
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
	 * name of the inverse relationship, i.e. the name of the relationship when read from <i>target</i> to <i>source</i> of a BinaryRelationship
	 *     </p>
	 * 
	 *     <p>
	 * Example: If the <i>forwardRelationshipName</i> is &quot;satisfies&quot;, then the <i>inverseRelationshipName</i> would be &#160;&quot;is satisfied by&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverse Relationship Name</em>' attribute.
	 * @see #setInverseRelationshipName(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getBinaryRelationshipRule_InverseRelationshipName()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getInverseRelationshipName();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule#getInverseRelationshipName <em>Inverse Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Relationship Name</em>' attribute.
	 * @see #getInverseRelationshipName()
	 * @generated
	 */
	void setInverseRelationshipName(String value);

} // BinaryRelationshipRule
