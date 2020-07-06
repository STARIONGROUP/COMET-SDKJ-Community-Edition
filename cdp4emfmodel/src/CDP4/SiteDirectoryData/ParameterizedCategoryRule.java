/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Category Rule</b></em>'.
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
 * Rule that asserts that one or more parameters of a given ParameterType should be defined for CategorizableThings that are a member of the associated Category
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.ParameterizedCategoryRule#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ParameterizedCategoryRule#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterizedCategoryRule()
 * @model
 * @generated
 */
public interface ParameterizedCategoryRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
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
	 *     reference to the Category to which this ParameterizableCategoryRule applies
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterizedCategoryRule_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ParameterizedCategoryRule#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.ParameterType}.
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
	 * collection of references to ParameterTypes this ParameterizableCategoryRule defines as mandatory
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterizedCategoryRule_ParameterType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ParameterType> getParameterType();

} // ParameterizedCategoryRule
