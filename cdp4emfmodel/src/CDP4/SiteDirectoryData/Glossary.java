/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary</b></em>'.
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
 *       representation of a glossary of terms
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
 *   <li>{@link CDP4.SiteDirectoryData.Glossary#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getGlossary()
 * @model
 * @generated
 */
public interface Glossary extends DefinedThing, CategorizableThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Term}.
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
	 * collection of Terms in this Glossary
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getGlossary_Term()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Term> getTerm();

} // Glossary
