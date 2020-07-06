/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyclic Ratio Scale</b></em>'.
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
 * representation of a ratio MeasurementScale with a periodic cycle
 *     </p>
 * 
 *     <p>
 * Note:&#160;The magnitude of the periodic cycle is defined by the modulus of the scale.
 *     </p>
 * 
 *     <p>
 * Example:&#160;Planar angle with modulus 360 degree, therefore an angle of 450 degree is the same as an angle of 90 degree, and -60 degree is the same as 300 degree.
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
 *   <li>{@link CDP4.SiteDirectoryData.CyclicRatioScale#getModulus <em>Modulus</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCyclicRatioScale()
 * @model
 * @generated
 */
public interface CyclicRatioScale extends RatioScale {
	/**
	 * Returns the value of the '<em><b>Modulus</b></em>' attribute.
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
	 * definition of the modulus of this CyclicRatioScale
	 *     </p>
	 * 
	 *     <p>
	 * Note: The value is expressed in the <i>unit</i> of this CyclicRatioScale.
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;For a plane angle scale in degree the modulus would be specified as 360 degree.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modulus</em>' attribute.
	 * @see #setModulus(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCyclicRatioScale_Modulus()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getModulus();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.CyclicRatioScale#getModulus <em>Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulus</em>' attribute.
	 * @see #getModulus()
	 * @generated
	 */
	void setModulus(String value);

} // CyclicRatioScale
