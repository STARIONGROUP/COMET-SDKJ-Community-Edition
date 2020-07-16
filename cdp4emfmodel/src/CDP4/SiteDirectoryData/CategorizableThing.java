/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorizable Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 * 
 *   <body>
 *     <p>
 *       representation of a Thing that can be categorized to be a member of a       user-defined       Category
 *     </p>
 * 
 *     <p>
 *       Note 1: Categorization using Categories establishes a runtime       classification       mechanism,       that       can       be       used       to       classify       architectural       elements,       parameter       types,       etc.,       and       form       the       basis       for       view       definitions,       filter       operations       and       validation       rules.
 *     </p>
 * 
 *     <p>
 *       Note 2:&#160;Categories are (pre)defined in ReferenceDataLibraries.
 *     </p>
 * 
 *     <p>
 *       Note 3: Assignment of a given Category to the <i>category</i> property       of       a       CategorizableThing       asserts       that       it       is       a       member       of       the       given       Category.
 * 
 *     </p>
 * 
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.CategorizableThing#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCategorizableThing()
 * @model abstract="true"
 * @generated
 */
public interface CategorizableThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
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
	 * reference to zero or more Categories of which this CategorizableThing is a member
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCategorizableThing_Category()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Category> getCategory();

} // CategorizableThing
