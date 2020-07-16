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
 * A representation of the model object '<em><b>Page</b></em>'.
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
 * Represents a sheet on which content can be placed in the form of Notes
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
 *   <li>{@link CDP4.ReportingData.Page#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends Thing, CategorizableThing, NamedThing, OwnedThing, ShortNamedThing, TimeStampedThing {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.Note}.
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
	 * collection of Notes in this Page
	 *     </p>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getPage_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNote();

} // Page
