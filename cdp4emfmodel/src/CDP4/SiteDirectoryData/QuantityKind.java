/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Kind</b></em>'.
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
 * representation of a numerical ScalarParameterType
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;QuantityKind represents the VIM concept of &quot;kind of quantity&quot; that is defined as &quot;aspect common to mutually comparable quantities&quot;.
 *     </p>
 * 
 *     <p>
 * Note 2: In this data model a quantity is represented by a Parameter (or an associated ParameterOverride or ParameterSubscription), a Constant or a SimpleParameterValue. It is typed by a QuantityKind and has a numerical value as well as a reference to a MeasurementScale. See the definitions of the mentioned concepts for the details on how value and measurement scale are instantiated. Example: Length, mass, time, speed, diameter, electrical current, thermodynamic temperature and Rockwell hardness are all examples of QuantityKind.
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
 *   <li>{@link CDP4.SiteDirectoryData.QuantityKind#getPossibleScale <em>Possible Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.QuantityKind#getDefaultScale <em>Default Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.QuantityKind#getAllPossibleScale <em>All Possible Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionSymbol <em>Quantity Dimension Symbol</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionExponent <em>Quantity Dimension Exponent</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionExpression <em>Quantity Dimension Expression</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKind()
 * @model abstract="true"
 * @generated
 */
public interface QuantityKind extends ScalarParameterType {
	/**
	 * Returns the value of the '<em><b>Possible Scale</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.MeasurementScale}.
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
	 * collection of MeasurementScales on which values for this QuantityKind can be expressed
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;For a SpecializedQuantityKind there may be zero possible scales, because it inherits the possible scales from its <i>general</i> QuantityKind. See also the <i>allPossibleScale</i> property.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible Scale</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKind_PossibleScale()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MeasurementScale> getPossibleScale();

	/**
	 * Returns the value of the '<em><b>Default Scale</b></em>' reference.
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
	 * definition of the default MeasurementScale for this QuantityKind
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The <i>defaultScale</i> must be a MeasurementScale in the collection <i>allPossibleScale</i> for this QuantityKind.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Scale</em>' reference.
	 * @see #setDefaultScale(MeasurementScale)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKind_DefaultScale()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MeasurementScale getDefaultScale();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.QuantityKind#getDefaultScale <em>Default Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Scale</em>' reference.
	 * @see #getDefaultScale()
	 * @generated
	 */
	void setDefaultScale(MeasurementScale value);

	/**
	 * Returns the value of the '<em><b>All Possible Scale</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.MeasurementScale}.
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
	 * derived collection of all possible MeasurementScales on which values for this QuantityKind can be expressed
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;For a SimpleQuantityKind and a DerivedQuantityKind <i>allPossibleScale</i> contains the same MeasurementScales as <i>possibleScale</i>. For a SpecializedQuantityKind <i>allPossibleScale</i> contains the set of all <i>possibleScale</i> of the specific SpecializedQuantityKind and all of its <i>general</i> QuantityKind.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Possible Scale</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKind_AllPossibleScale()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<MeasurementScale> getAllPossibleScale();

	/**
	 * Returns the value of the '<em><b>Quantity Dimension Symbol</b></em>' attribute.
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
	 * definition of the symbol used to represent the physical dimension of a QuantityKind that is a <i>baseQuantityKind</i> as registered in the containing ReferenceDataLibrary
	 *     </p>
	 * 
	 *     <p>
	 * Note: These base quantity kind symbols are used in the derivation of the <i>quantityDimensionExpression</i> property for all QuantityKinds.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Dimension Symbol</em>' attribute.
	 * @see #setQuantityDimensionSymbol(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKind_QuantityDimensionSymbol()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getQuantityDimensionSymbol();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionSymbol <em>Quantity Dimension Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Dimension Symbol</em>' attribute.
	 * @see #getQuantityDimensionSymbol()
	 * @generated
	 */
	void setQuantityDimensionSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Quantity Dimension Exponent</b></em>' attribute list.
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
	 * derived list of exponents that together with the actual base QuantityKinds define the physical dimension of this QuantityKind
	 *     </p>
	 * 
	 *     <p>
	 * Note 1: The <a href="http://www.bipm.org/en/publications/guides/vim.html">International Vocabulary of Metrology (VIM)</a> defines &quot;quantity dimension&quot; as &quot;expression of the dependence of a quantity on the base quantities of a system of quantities as a product of powers of factors corresponding to the base quantities, omitting any numerical factor.&quot;
	 *     </p>
	 * 
	 *     <p>
	 * Note 2: There must be as many exponents as there as <i>baseQuantityKind</i> QuantityKinds in the dataset. The exponents are given in the same order as the ordered collection of <i>baseQuantityKind</i> QuantityKinds, enumerated starting from the top <i>requiredRdl</i> down to the ReferenceDataLibrary that contains this QuantityKind. Typically only the top SiteReferenceDataLibrary will have a non-empty <i>baseQuantityKind</i> collection.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3:&#160;The physical dimension of any QuantityKind can be derived through the algorithm that is defined in Section C.5.2.20 of <a href="http://www.omgsysml.org">SysML&#160;v1.2</a>. The actual physical dimension for a given QuantityKind depends on the choice of base QuantityKinds specified in the relevant (set of)&#160;ReferenceDataLibrary (or SystemOfQuantities in SysML).
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;In the International System of Quantities (ISQ) the quantity dimension of &quot;force&quot; is denoted by
	 *     </p>
	 * 
	 *     <p>
	 * dim F = L.M.T<sup>-2</sup>,
	 *     </p>
	 * 
	 *     <p>
	 * where &quot;F&quot; is the symbol for &quot;force,&quot; and &quot;L,&quot; &quot;M,&quot; and &quot;T&quot; are the symbols for the ISQ base quantities &quot;length&quot;, &quot;mass&quot;, and &quot;time&quot; respectively.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Dimension Exponent</em>' attribute list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKind_QuantityDimensionExponent()
	 * @model unique="false" dataType="CDP4.CommonData.ParameterValueType"
	 * @generated
	 */
	EList<String> getQuantityDimensionExponent();

	/**
	 * Returns the value of the '<em><b>Quantity Dimension Expression</b></em>' attribute.
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
	 * derived symbolic expression of the physical dimension of this QuantityKind
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This is the human readable version of product of powers formed by the <i>quantityDimensionSymbol</i> of each of the base QuantityKind and the corresponding <i>quantityDimensionExponent</i>.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Dimension Expression</em>' attribute.
	 * @see #setQuantityDimensionExpression(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKind_QuantityDimensionExpression()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getQuantityDimensionExpression();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.QuantityKind#getQuantityDimensionExpression <em>Quantity Dimension Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Dimension Expression</em>' attribute.
	 * @see #getQuantityDimensionExpression()
	 * @generated
	 */
	void setQuantityDimensionExpression(String value);

} // QuantityKind
