/**
 */
package CDP4.CommonData;

import CDP4.SiteDirectoryData.Person;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Entry</b></em>'.
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
 * representation of an entry in a logbook
 *     </p>
 * 
 *     <p>
 * Note 1: A LogEntry is a human written message that records succinctly what change was applied at what point in time to the SiteDirectory or to an EngineeringModel and optionally records information on why the change was applied.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;A LogEntry could be categorized (see Category and CategorizableThing)&#160;e.g. to denote that a LogEntry contains a &#160;&quot;design rationale&quot;. This would later help with reporting or retrieving useful information from the logbook.
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
 *   <li>{@link CDP4.CommonData.LogEntry#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.CommonData.LogEntry#getAffectedItemIid <em>Affected Item Iid</em>}</li>
 *   <li>{@link CDP4.CommonData.LogEntry#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getLogEntry()
 * @model abstract="true"
 * @generated
 */
public interface LogEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
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
	 * reference to the Person who logged this LogEntry
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Person)
	 * @see CDP4.CommonData.CommonDataPackage#getLogEntry_Author()
	 * @model ordered="false"
	 * @generated
	 */
	Person getAuthor();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.LogEntry#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Person value);

	/**
	 * Returns the value of the '<em><b>Affected Item Iid</b></em>' attribute list.
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
	 *   <body>
	 *     <p>
	 * weak reference to zero or more items that are relevant to or affected by what is described in the content of this LogEntry
	 *     </p>
	 * 
	 *     <p>
	 * Note: Each reference should be an <i>iid</i> of a Thing that exists when the log entry is created. The references are of type Uuid in order to support retaining log entries even when the referenced Thing is later deleted. An implementation of E-TM-10-25 shall support a mechanism to dereference items by Uuid and report when items can not (no longer) be dereferenced.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affected Item Iid</em>' attribute list.
	 * @see CDP4.CommonData.CommonDataPackage#getLogEntry_AffectedItemIid()
	 * @model dataType="CDP4.CommonData.Uuid" ordered="false"
	 * @generated
	 */
	EList<String> getAffectedItemIid();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.CommonData.LogLevelKind}.
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
	 * level of this LogEntry
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The <i>level</i> can be used to filter log entries. Also applications may provide a setting that switches on or off logging log entries of a certain level.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see CDP4.CommonData.LogLevelKind
	 * @see #setLevel(LogLevelKind)
	 * @see CDP4.CommonData.CommonDataPackage#getLogEntry_Level()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogLevelKind getLevel();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.LogEntry#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see CDP4.CommonData.LogLevelKind
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(LogLevelKind value);

} // LogEntry
