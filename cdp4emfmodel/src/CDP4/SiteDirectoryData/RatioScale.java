/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio Scale</b></em>'.
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
 *       kind of MeasurementScale that has ordered values, a measurement unit and 
 *       a fixed definition of the zero value on all scales for the same kind of 
 *       quantity
 *     </p>
 * 
 *     <p>
 *       Note 1:&#160;The measurement unit defines how to interpret an interval of one 
 *       on the scale.
 *     </p>
 * 
 *     <p>
 *       Note 2:&#160;Any two ratio scales of measurement for the same kind of 
 *       quantity have coincident zero values, they only differ in their 
 *       measurement unit.
 *     </p>
 * 
 *     <p>
 *       Note 3:&#160;On a ratio scale of measurement it is possible to take the 
 *       difference between two values, to compute the average (arithmetic 
 *       mean)&#160;of two or more values, as well as to add, multiply and divide 
 *       values.
 *     </p>
 * 
 *     <p>
 *       Note 4: The numerical value of quantity expressed on one ratio scale can 
 *       be converted to the value of the same quantity expressed on a second 
 *       (different)&#160;ratio scale through simple multiplication by a conversion 
 *       factor, which is the ratio between the respective measurement units.
 *     </p>
 * 
 *     <p>
 *       Example:&#160;The majority of the physical quantities are expressed on ratio 
 *       scales, e.g.: length (metre, millimetre, kilometre, inch, foot, mile, 
 *       lightyear); mass (kilogram, gram, nanogram, ton, pound); time (second, 
 *       hour).
 *     </p>
 * 
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getRatioScale()
 * @model
 * @generated
 */
public interface RatioScale extends MeasurementScale {
} // RatioScale
