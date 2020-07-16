/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition Rule</b></em>'.
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
 * representation of a validation rule for system-of-interest decomposition through <i>containingElement</i> ElementDefinitions and <i>containedElement</i> ElementUsages
 *     </p>
 * 
 *     <p>
 * Note: A DecompositionRule specifies for ElementDefinitions that are a member of the <i>containingCategory</i> what are the valid Categories (specified by <i>containedCategory</i>) for the <i>type</i> of contained ElementUsages. A&#160;<i>subCategory</i> of a valid Category is also valid.
 *     </p>
 * 
 *     <p>
 * Example: A rule where the <i>containingCategory</i> is Category &quot;Equipment&quot; and the <i>containedCategory</i> is Category &quot;Subequipment&quot;.
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
 *   <li>{@link CDP4.SiteDirectoryData.DecompositionRule#getContainingCategory <em>Containing Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.DecompositionRule#getContainedCategory <em>Contained Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.DecompositionRule#getMinContained <em>Min Contained</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.DecompositionRule#getMaxContained <em>Max Contained</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDecompositionRule()
 * @model
 * @generated
 */
public interface DecompositionRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Containing Category</b></em>' reference.
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
	 * reference to the Category for <i>containingElement</i> ElementDefinitions to which this rule applies
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containing Category</em>' reference.
	 * @see #setContainingCategory(Category)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDecompositionRule_ContainingCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getContainingCategory();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.DecompositionRule#getContainingCategory <em>Containing Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Category</em>' reference.
	 * @see #getContainingCategory()
	 * @generated
	 */
	void setContainingCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Contained Category</b></em>' reference list.
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
	 * reference to one or more valid Categories for the <i>elementDefinition</i> of <i>containedElement</i> ElementUsages
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Category</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDecompositionRule_ContainedCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Category> getContainedCategory();

	/**
	 * Returns the value of the '<em><b>Min Contained</b></em>' attribute.
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
	 * definition of the valid minimum number of <i>containedElement</i> ElementUsages
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This can be used to specify a cardinality constraint.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Contained</em>' attribute.
	 * @see #setMinContained(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDecompositionRule_MinContained()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMinContained();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.DecompositionRule#getMinContained <em>Min Contained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Contained</em>' attribute.
	 * @see #getMinContained()
	 * @generated
	 */
	void setMinContained(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Contained</b></em>' attribute.
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
	 * optional definition of the valid maximum number of <i>containedElement</i> ElementUsages
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;This can be used to specify a cardinality constraint.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;If not specified it signifies that an unlimited number of <i>containedElement</i> is valid.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Contained</em>' attribute.
	 * @see #setMaxContained(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getDecompositionRule_MaxContained()
	 * @model dataType="CDP4.CommonData.Integer" ordered="false"
	 * @generated
	 */
	Integer getMaxContained();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.DecompositionRule#getMaxContained <em>Max Contained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Contained</em>' attribute.
	 * @see #getMaxContained()
	 * @generated
	 */
	void setMaxContained(Integer value);

} // DecompositionRule
