/**
 */
package CDP4.CommonData;

import java.time.OffsetDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Stamped Thing</b></em>'.
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
 * representation of a thing with a timestamp that records its creation time
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
 *   <li>{@link CDP4.CommonData.TimeStampedThing#getCreatedOn <em>Created On</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getTimeStampedThing()
 * @model abstract="true"
 * @generated
 */
public interface TimeStampedThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
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
	 * date and time of creation expressed in UTC (<a href="http://en.wikipedia.org/wiki/Coordinated_Universal_Time">Coordinated Universal Time</a>)&#160;with millisecond accuracy
	 *     <p>
	 * Note 1:&#160;This implies that any value shall comply with the following (informative)&#160;ISO&#160;8601 format &quot;yyyy-mm-ddThh:mm:ss.sssZ&quot;.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC&#160;by client applications.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(OffsetDateTime)
	 * @see CDP4.CommonData.CommonDataPackage#getTimeStampedThing_CreatedOn()
	 * @model dataType="CDP4.CommonData.DateTime" required="true" ordered="false"
	 * @generated
	 */
	OffsetDateTime getCreatedOn();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.TimeStampedThing#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	void setCreatedOn(OffsetDateTime value);

} // TimeStampedThing
