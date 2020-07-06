/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
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
 * representation of a user-defined category for categorization of instances that have common characteristics
 *     </p>
 * 
 *     <p>
 * Note 1: The Category concept provides a user-defined, runtime classification mechanism in addition to the UML classification (classifier, class, generalization, specialization)&#160;applied in the data model itself.
 *     </p>
 * 
 *     <p>
 * Note 2: The Category concept provides additional flexibility to assist in the definition and usage of views and filters on the instances in a population of the data model.
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
 *   <li>{@link CDP4.SiteDirectoryData.Category#getSuperCategory <em>Super Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Category#getPermissibleClass <em>Permissible Class</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Category#getIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends DefinedThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Super Category</b></em>' reference list.
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
	 * reference to zero or more super categories of this Category
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;In other words by adding a Category to <i>superCategory</i> this referring Category is defined as a <i>subCategory</i>. This implies that all CategorizableThings that are a member of the <i>subCategory</i> constitute a subset of all CategorizableThings that are a member of the superCategory.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;The super/sub-category hierarchy shall form an acyclic graph, i.e. no circular references are permitted.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Category</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCategory_SuperCategory()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Category> getSuperCategory();

	/**
	 * Returns the value of the '<em><b>Permissible Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	 *     <p>
	 *       one or more names&#160;of classes of which instances are permitted to be a 
	 *       member of this Category
	 *     </p>
	 * 
	 *     <p>
	 *       Note 1: This specifies a validation rule for a population of the data 
	 *       model.
	 *     </p>
	 * 
	 *     <p>
	 *       Note 2:&#160;By definition any class name specified in <i>permissibleClass</i> 
	 *       shall be the name of a subclass of CategorizableThing.
	 *     </p>
	 * 
	 *     <p>
	 *       Note 3:&#160;In order to execute the validation rule it is required that an 
	 *       implementation can verify at runtime that an instance is of a given 
	 *       class as specified by a character string name.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permissible Class</em>' attribute list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCategory_PermissibleClass()
	 * @model dataType="CDP4.CommonData.ClassKind" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getPermissibleClass();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
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
	 *     assertion that this Category is abstract, i.e. it may not have direct 
	 *     members, but only not abstract sub categories of this Category may have 
	 *     members
	 * Note: The isAbstract property has similar semantics as the isAbstract property 
	 *     of classifiers in the UML meta-model.
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCategory_IsAbstract()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Category#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSupers()->excludes(self)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean superSubGraphIsAcyclic(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * def: getAllSupers() : Set(Category) = self.superCategory->union(self.superCategory.getAllSupers())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='getAllSupers helper operation'"
	 * @generated
	 */
	boolean getAllSupershelperoperation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Category
