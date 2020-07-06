/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logarithmic Scale</b></em>'.
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
 * representation of a logarithmic MeasurementScale
 *     </p>
 * 
 *     <p>
 * Note:&#160;The logarithmic ratio quantity value <i>v</i> is computed as follows:&#160;<i>v</i> = <i>f</i> · log<sub>base</sub>( (<i>x</i> / <i>x<sub>ref</sub></i> )<i><sup>a</sup></i> ), where <i>f</i> is a multiplication factor, <i>base</i> is the base of the log function, <i>x</i> is the actual quantity, <i>x<sub>ref</sub></i> is a reference quantity, and <i>a</i> is an exponent.
 *     </p>
 * 
 *     <p>
 * Example 1:&#160;The base 10 logarithmic measurement scale for &quot;sound pressure level&quot; in &quot;decibel&quot;, with <i>factor</i> is &quot;10&quot;, <i>exponent</i> is &quot;2&quot;, <i>referenceQuantityKind</i> is &quot;sound pressure&quot;&#160;and <i>referenceQuantityValue</i>.value is &quot;20&quot; on the &quot;µPa&quot;&#160;RatioScale. Source:&#160;ISO&#160;80000-08.
 *     </p>
 * 
 *     <p>
 * Example 2:&#160;The natural logarithmic measurement scale for &quot;electric field strength&quot; in &quot;neper&quot;.
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
 *   <li>{@link CDP4.SiteDirectoryData.LogarithmicScale#getLogarithmBase <em>Logarithm Base</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.LogarithmicScale#getFactor <em>Factor</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.LogarithmicScale#getExponent <em>Exponent</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.LogarithmicScale#getReferenceQuantityKind <em>Reference Quantity Kind</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.LogarithmicScale#getReferenceQuantityValue <em>Reference Quantity Value</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getLogarithmicScale()
 * @model
 * @generated
 */
public interface LogarithmicScale extends MeasurementScale {
	/**
	 * Returns the value of the '<em><b>Logarithm Base</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.SiteDirectoryData.LogarithmBaseKind}.
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
	 * base of the logarithmic function used on this LogarithmicScale
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logarithm Base</em>' attribute.
	 * @see CDP4.SiteDirectoryData.LogarithmBaseKind
	 * @see #setLogarithmBase(LogarithmBaseKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getLogarithmicScale_LogarithmBase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogarithmBaseKind getLogarithmBase();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.LogarithmicScale#getLogarithmBase <em>Logarithm Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logarithm Base</em>' attribute.
	 * @see CDP4.SiteDirectoryData.LogarithmBaseKind
	 * @see #getLogarithmBase()
	 * @generated
	 */
	void setLogarithmBase(LogarithmBaseKind value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
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
	 * factor used in the definition formula for the quantity value for this LogarithmicScale
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getLogarithmicScale_Factor()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getFactor();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.LogarithmicScale#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(String value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
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
	 * exponent used in the definition formula for the quantity value for this LogarithmicScale
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getLogarithmicScale_Exponent()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getExponent();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.LogarithmicScale#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(String value);

	/**
	 * Returns the value of the '<em><b>Reference Quantity Kind</b></em>' reference.
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
	 * reference to the applicable QuantityKind for the quotient of quantities in the definition formula of this LogarithmicScale
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Quantity Kind</em>' reference.
	 * @see #setReferenceQuantityKind(QuantityKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getLogarithmicScale_ReferenceQuantityKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	QuantityKind getReferenceQuantityKind();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.LogarithmicScale#getReferenceQuantityKind <em>Reference Quantity Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Quantity Kind</em>' reference.
	 * @see #getReferenceQuantityKind()
	 * @generated
	 */
	void setReferenceQuantityKind(QuantityKind value);

	/**
	 * Returns the value of the '<em><b>Reference Quantity Value</b></em>' containment reference.
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
	 * optional value for the reference quantity in the definition formula for this LogarithmicScale
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;A&#160;logarithmic scale may define a fixed reference quantity. See also <a href="http://www.nist.gov/pml/pubs/sp811/index.cfm">NIST&#160;SP811</a> for many more details.
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;The base 10 logarithmic scale for &quot;sound pressure level&quot; in decibel is defined with respect to a reference sound pressure <i>p<sub>0</sub></i> = 20 µPa. The sound pressure level value on such a scale for a corresponding sound pressure <i>p</i> would then be 10·log<sub>10</sub>((<i>p</i>/<i>p<sub>0</sub></i>)<sup>2</sup>) dB.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Quantity Value</em>' containment reference.
	 * @see #setReferenceQuantityValue(ScaleReferenceQuantityValue)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getLogarithmicScale_ReferenceQuantityValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ScaleReferenceQuantityValue getReferenceQuantityValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.LogarithmicScale#getReferenceQuantityValue <em>Reference Quantity Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Quantity Value</em>' containment reference.
	 * @see #getReferenceQuantityValue()
	 * @generated
	 */
	void setReferenceQuantityValue(ScaleReferenceQuantityValue value);

} // LogarithmicScale
