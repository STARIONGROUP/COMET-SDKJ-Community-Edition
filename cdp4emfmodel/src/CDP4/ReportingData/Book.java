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
 * A representation of the model object '<em><b>Book</b></em>'.
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
 * Representation of a note book that can be used to record any written information to document the design process and associated results. 
 * A Book is a shared resource in an EngineeringModel that is potentialy used by all Participants to document any information that is relevant.
 *     </p>
 *   </body>
 * </html>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.Book#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends Thing, CategorizableThing, NamedThing, OwnedThing, ShortNamedThing, TimeStampedThing {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.Section}.
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
	 * collection of Sections in this Book
	 *     </p>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getBook_Section()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSection();

} // Book
