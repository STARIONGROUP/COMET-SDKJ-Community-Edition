/**
 */
package CDP4.CommonData;

import CDP4.SiteDirectoryData.ReferenceSource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation</b></em>'.
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
 * reference with cited location to a ReferenceSource
 *     </p>
 * 
 *     <p>
 * Note:&#160;The shortName property is used to represent a short human readable identifier for this Citation. This identifier must be unique for the Citations contained in a Definition.
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
 *   <li>{@link CDP4.CommonData.Citation#getSource <em>Source</em>}</li>
 *   <li>{@link CDP4.CommonData.Citation#getLocation <em>Location</em>}</li>
 *   <li>{@link CDP4.CommonData.Citation#getIsAdaptation <em>Is Adaptation</em>}</li>
 *   <li>{@link CDP4.CommonData.Citation#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getCitation()
 * @model
 * @generated
 */
public interface Citation extends Thing, ShortNamedThing {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     cited ReferenceSource
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ReferenceSource)
	 * @see CDP4.CommonData.CommonDataPackage#getCitation_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReferenceSource getSource();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Citation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ReferenceSource value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
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
	 * definition of the location in the associated ReferenceSource that is made reference to
	 *     </p>
	 * 
	 *     <p>
	 * Example: Typical citation locations are:&#160;&#160;&quot;page 34&quot;, &#160;&quot;Table 2&quot;, &#160;&quot;pages 93-122&quot;, &#160;&quot;Appendix B&quot;, &#160;&quot;Chapter 3&quot;, &#160;&quot;Annex 5&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see CDP4.CommonData.CommonDataPackage#getCitation_Location()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Citation#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Is Adaptation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 *       assertion whether the Definition that contains the Citation is an       adaptation       of       the       definition       in       the       cited       ReferenceSource
	 *     </p>
	 * 
	 *     <p>
	 *       Note:&#160;If isAdaptation is false, this Definition is assumed to be a       verbatim       copy       of       the       referenced       definition.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Adaptation</em>' attribute.
	 * @see #setIsAdaptation(Boolean)
	 * @see CDP4.CommonData.CommonDataPackage#getCitation_IsAdaptation()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsAdaptation();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Citation#getIsAdaptation <em>Is Adaptation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Adaptation</em>' attribute.
	 * @see #getIsAdaptation()
	 * @generated
	 */
	void setIsAdaptation(Boolean value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     optional remark to further describe this Citation and where applicable     explain     an     adaptation
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #setRemark(String)
	 * @see CDP4.CommonData.CommonDataPackage#getCitation_Remark()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getRemark();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Citation#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(String value);

} // Citation
