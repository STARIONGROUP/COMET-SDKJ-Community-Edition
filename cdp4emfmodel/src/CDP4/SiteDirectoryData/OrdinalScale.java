/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Scale</b></em>'.
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
 *       kind of MeasurementScale in which the possible valid values are ordered 
 *       but where the intervals between the values do not have particular 
 *       significance
 *     </p>
 * 
 *     <p>
 *       Note 1:&#160;It is therefore is not meaningful to add or subtract values on 
 *       such a scale. It is possible to compare values numerically.
 *     </p>
 * 
 *     <p>
 *       Note 2:The MeasurementUnit associated with such scales should be the number one.
 *     </p>
 * 
 *     <p>
 *       Example 1: The NASA/ESA Technology Readiness Level (TRL) scale with 
 *       ScaleValueDefinitions: 1 : &quot;Basic principles observed and reported&quot;; 2 : 
 *       &quot;Technology concept and/or application formulated&quot;; 3 : &quot;Analytical and 
 *       experimental critical function and/or characteristic proof-of- concept&quot;; 
 *       4 : &quot;Component and/or breadboard validation in laboratory environment&quot;; 
 *       5 : &quot;Component and/or breadboard validation in relevant environment&quot;; 6 
 *       : &quot;System/subsystem model or prototype demonstration in a relevant 
 *       environment (ground or space)&quot;; 7 : &quot;System prototype demonstration in a 
 *       space environment&quot;; 8 : &quot;Actual system completed and 'flight qualified' 
 *       through test and demonstration (ground or space)&quot;; 9 : &quot;Actual system 
 *       'flight proven' through successful mission operations&quot;.
 *     </p>
 * 
 *     <p>
 *       Example 2: The Beaufort wind force scale with ScaleValueDefinitions (as 
 *       defined by the <i>World Meteorological Organization</i>): 0 : &quot;Calm&quot;; 1 
 *       : &quot;Light air&quot;; 2: &quot;Light breeze&quot;; 3: &quot;Gentle breeze&quot;; 4: &quot;Moderate 
 *       breeze&quot;; 5: &quot;Fresh breeze&quot;; 6: &quot;Strong breeze&quot;; 7: &quot;Near gale&quot;; 8: 
 *       &quot;Gale&quot;; 9: &quot;Strong gale&quot;; 10: &quot;Storm&quot;; 11: &quot;Violent storm&quot;; 12: 
 *       &quot;Hurricane&quot;.
 *     </p>
 * 
 *     <p>
 *       Example 3: A simple &quot;Priority&quot; scale with ScaleValueDefinitions 
 *       1:&#160;&quot;low&quot;; 2:&#160;&quot;medium&quot;; 3:&#160;&quot;high&quot;; that is used to distinguish between 
 *       different priorities and be able to tell whether a given priority is 
 *       higher or lower than another.
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
 *   <li>{@link CDP4.SiteDirectoryData.OrdinalScale#getUseShortNameValues <em>Use Short Name Values</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getOrdinalScale()
 * @model
 * @generated
 */
public interface OrdinalScale extends MeasurementScale {
	/**
	 * Returns the value of the '<em><b>Use Short Name Values</b></em>' attribute.
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
	 * assertion whether shortNames of the associated ScaleValueDefinitions are used as values or numeric values
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Short Name Values</em>' attribute.
	 * @see #setUseShortNameValues(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getOrdinalScale_UseShortNameValues()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getUseShortNameValues();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.OrdinalScale#getUseShortNameValues <em>Use Short Name Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Short Name Values</em>' attribute.
	 * @see #getUseShortNameValues()
	 * @generated
	 */
	void setUseShortNameValues(Boolean value);

} // OrdinalScale
