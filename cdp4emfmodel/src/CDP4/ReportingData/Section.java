/**
 */
package CDP4.ReportingData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.EngineeringModelData.OwnedThing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
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
 * Representation of a self contained part of a Book used to separate content.
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;An&#160; A section is usualy used to create chapters in a Book 
 *     </p>
 * 
 *   </body>
 * </html>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.Section#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends Thing, CategorizableThing, NamedThing, OwnedThing, ShortNamedThing, TimeStampedThing {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.Page}.
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
	 * collection of Pages in this Section
	 *     </p>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getSection_Page()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPage();

} // Section
