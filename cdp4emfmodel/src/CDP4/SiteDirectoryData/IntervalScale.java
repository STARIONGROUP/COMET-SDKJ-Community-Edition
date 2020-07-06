/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Scale</b></em>'.
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
 *       an arbitrary zero value
 *     </p>
 * 
 *     <p>
 *       Note 1:&#160;The measurement unit defines how to interpret an interval of one 
 *       on the scale.
 *     </p>
 * 
 *     <p>
 *       Note 2:&#160;Two interval scales of measurement for the same quantity kind do 
 *       not need to have coincident zero values. In other words, the zero value 
 *       can be chosen arbitrarily.
 *     </p>
 * 
 *     <p>
 *       Note 3:&#160;On an interval scale of measurement it is possible to take the 
 *       difference between two values or to compute the average (arithmetic 
 *       mean)&#160;of two or more values. Addition or multiplication of values is not 
 *       defined. It is however possible to add a quantity value defined on a 
 *       compatible ratio scale to a quantity value defined on an interval scale: 
 *       e.g. add a temperature difference of 2 kelvin to a temperature of 100 
 *       degree Celsius.
 *     </p>
 * 
 *     <p>
 *       Note 4: The numerical value of a quantity expressed on one interval 
 *       scale can be converted to the value of the same quantity expressed on a 
 *       second (different)&#160;interval scale if the ratio between the respective 
 *       measurement units is known (the &quot;conversion factor&quot;)&#160;as well as the 
 *       value on the second scale that represents the same quantity as zero on 
 *       the first scale (the &quot;conversion offset&quot;).
 *     </p>
 * 
 *     <p>
 *       Example 1:&#160;The Celsius and Fahrenheit temperature scales are common 
 *       examples of interval scales.
 *     </p>
 * 
 *     <p>
 *       Example 2: A &quot;Performance&quot; interval scale with values 0:&#160;&quot;very low&quot;; 
 *       5:&#160;&quot;medium&quot;; 10:&#160;&quot;very high&quot;; can be used to compute weighted average 
 *       performance for a simple system for which for each of its elements a 
 *       separate &quot;Performance&quot; measure is given.
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
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getIntervalScale()
 * @model
 * @generated
 */
public interface IntervalScale extends MeasurementScale {
} // IntervalScale
