/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referencer Rule</b></em>'.
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
 * representation of a validation rule for ElementDefinitions and the <i>referencedElement</i> NestedElements
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.ReferencerRule#getReferencingCategory <em>Referencing Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferencerRule#getReferencedCategory <em>Referenced Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferencerRule#getMinReferenced <em>Min Referenced</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferencerRule#getMaxReferenced <em>Max Referenced</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferencerRule()
 * @model
 * @generated
 */
public interface ReferencerRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Referencing Category</b></em>' reference.
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
	 * reference to the Category for the <i>referencingElement</i> ElementDefinition instances to which this rule applies
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referencing Category</em>' reference.
	 * @see #setReferencingCategory(Category)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferencerRule_ReferencingCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getReferencingCategory();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferencerRule#getReferencingCategory <em>Referencing Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencing Category</em>' reference.
	 * @see #getReferencingCategory()
	 * @generated
	 */
	void setReferencingCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Referenced Category</b></em>' reference list.
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
	 *     <p>
	 * collection of references to the Categories that <i>referencedElement</i> NestedElements must belong to under this rule
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Category</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferencerRule_ReferencedCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Category> getReferencedCategory();

	/**
	 * Returns the value of the '<em><b>Min Referenced</b></em>' attribute.
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
	 * definition of the valid minimum number of <i>referencedElement</i> in a ElementDefinition that is a member of <i>referencerCategory</i>
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
	 * @return the value of the '<em>Min Referenced</em>' attribute.
	 * @see #setMinReferenced(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferencerRule_MinReferenced()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMinReferenced();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferencerRule#getMinReferenced <em>Min Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Referenced</em>' attribute.
	 * @see #getMinReferenced()
	 * @generated
	 */
	void setMinReferenced(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Referenced</b></em>' attribute.
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
	 * definition of the valid maximum number of <i>referencedElement</i> in an ElementDefinition that is a member of <i>referencingCategory</i>
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;This can be used to specify a cardinality constraint.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;A value of -1 signifies that an unlimited number of <i>referencedElement</i> is valid.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Referenced</em>' attribute.
	 * @see #setMaxReferenced(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferencerRule_MaxReferenced()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMaxReferenced();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferencerRule#getMaxReferenced <em>Max Referenced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Referenced</em>' attribute.
	 * @see #getMaxReferenced()
	 * @generated
	 */
	void setMaxReferenced(Integer value);

} // ReferencerRule
