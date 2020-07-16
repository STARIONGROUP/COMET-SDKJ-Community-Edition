/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Scale</b></em>'.
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
 * representation of a measurement scale to express quantity values for a numerical Parameter, i.e. a Parameter that is typed by a QuantityKind
 *     </p>
 * 
 *     <p>
 * Note 1: MeasurementScale represents the VIM&#160;concept of &quot;quantity-value scale&quot; that is defined as &quot;ordered set of quantity values of quantities of a given kind of quantity used in ranking, according to magnitude, quantities of that kind&quot;.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;A&#160;MeasurementScale defines how to interpret the numerical value of a quantity or parameter. In this data model a distinction is made between a measurement scale and a measurement unit. A measurement unit is a reference quantity that defines how to interpret an interval of one on a measurement scale. A measurement scale defines in addition the kind of scale, and where necessary more characteristics to provide all information needed for mapping quantity values between different scales, as specified in the specializations of this class.
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
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getUnit <em>Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getValueDefinition <em>Value Definition</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getNumberSet <em>Number Set</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getMinimumPermissibleValue <em>Minimum Permissible Value</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getIsMinimumInclusive <em>Is Minimum Inclusive</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getMaximumPermissibleValue <em>Maximum Permissible Value</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getIsMaximumInclusive <em>Is Maximum Inclusive</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getPositiveValueConnotation <em>Positive Value Connotation</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getNegativeValueConnotation <em>Negative Value Connotation</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MeasurementScale#getMappingToReferenceScale <em>Mapping To Reference Scale</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale()
 * @model abstract="true"
 * @generated
 */
public interface MeasurementScale extends DefinedThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
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
	 * reference to the measurement unit applicable to this MeasurementScale
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The measurement unit defines the meaning of an interval of one on this MeasurementScale.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(MeasurementUnit)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_Unit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MeasurementUnit getUnit();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MeasurementScale#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MeasurementUnit value);

	/**
	 * Returns the value of the '<em><b>Value Definition</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.ScaleValueDefinition}.
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
	 * collection of particular values&#160;that are part of the definition of this MeasurementScale
	 *     </p>
	 * 
	 *     <p>
	 * Example 1:&#160;On the thermodynamic temperature scale in kelvin, 0 kelvin is defined as the absolute zero temperature point and 273.15 kelvin is defined as the thermodynamic temperature of water at its triple point.
	 *     </p>
	 * 
	 *     <p>
	 * Example 2:&#160;On the Beaufort wind force scale each of the numbers 1 to 12 has an associated specific textual definition, see OrdinalScale for the example.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Definition</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_ValueDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ScaleValueDefinition> getValueDefinition();

	/**
	 * Returns the value of the '<em><b>Number Set</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.SiteDirectoryData.NumberSetKind}.
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
	 *     assertion that specifies the mathematical number set for values of this 
	 *     QuantityKind
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Set</em>' attribute.
	 * @see CDP4.SiteDirectoryData.NumberSetKind
	 * @see #setNumberSet(NumberSetKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_NumberSet()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NumberSetKind getNumberSet();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MeasurementScale#getNumberSet <em>Number Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Set</em>' attribute.
	 * @see CDP4.SiteDirectoryData.NumberSetKind
	 * @see #getNumberSet()
	 * @generated
	 */
	void setNumberSet(NumberSetKind value);

	/**
	 * Returns the value of the '<em><b>Minimum Permissible Value</b></em>' attribute.
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
	 * optional definition of the minimum permissible quantity value expressed on this MeasurementScale
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;If <i>isMinimumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be greater than or equal to <i>minimumPermissibleValue,</i> else if <i>isMinimumInclusive</i> is false, values must be greater than <i>minimumPermissibleValue.</i>
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;The properties <i>minimumPermissibleValue </i>and <i>isMinimumInclusive</i> can be mapped onto the pair of XML&#160;Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-minInclusive">minInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-minExclusive">minExclusive</a>.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3:&#160;If no <i>minimumPermissibleValue</i> is given, the minimum permissible quantity value is negative infinity.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Permissible Value</em>' attribute.
	 * @see #setMinimumPermissibleValue(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_MinimumPermissibleValue()
	 * @model dataType="CDP4.CommonData.ParameterValueType" ordered="false"
	 * @generated
	 */
	String getMinimumPermissibleValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MeasurementScale#getMinimumPermissibleValue <em>Minimum Permissible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Permissible Value</em>' attribute.
	 * @see #getMinimumPermissibleValue()
	 * @generated
	 */
	void setMinimumPermissibleValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Minimum Inclusive</b></em>' attribute.
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
	 * assertion whether the minimum permissible value is included or not
	 *     </p>
	 * 
	 *     <p>
	 * Note: In other words this enables to define a closed or open lower end of the permissible value interval.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Minimum Inclusive</em>' attribute.
	 * @see #setIsMinimumInclusive(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_IsMinimumInclusive()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsMinimumInclusive();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MeasurementScale#getIsMinimumInclusive <em>Is Minimum Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Minimum Inclusive</em>' attribute.
	 * @see #getIsMinimumInclusive()
	 * @generated
	 */
	void setIsMinimumInclusive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Permissible Value</b></em>' attribute.
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
	 * optional definition of the maximum permissible value for quantities expressed on this MeasurementScale
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;If <i>isMaximumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be less than or equal to <i>maximumPermissibleValue,</i> else if <i>isMaximumInclusive</i> is false, values must be less than <i>maximumPermissibleValue.</i>
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;The properties <i>maximumPermissibleValue </i>and <i>isMaximumInclusive</i> can be mapped onto the pair of XML&#160;Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive">maxInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive">maxExclusive</a>.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3:&#160;If no <i>maximumPermissibleValue</i> is given, the maximum permissible quantity value is positive infinity.
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Permissible Value</em>' attribute.
	 * @see #setMaximumPermissibleValue(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_MaximumPermissibleValue()
	 * @model dataType="CDP4.CommonData.ParameterValueType" ordered="false"
	 * @generated
	 */
	String getMaximumPermissibleValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MeasurementScale#getMaximumPermissibleValue <em>Maximum Permissible Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Permissible Value</em>' attribute.
	 * @see #getMaximumPermissibleValue()
	 * @generated
	 */
	void setMaximumPermissibleValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Maximum Inclusive</b></em>' attribute.
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
	 * assertion whether the maximum permissible value is included or not
	 *     <p>
	 * Note: In other words this enables to define a closed or open upper end of the permissible value interval.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Maximum Inclusive</em>' attribute.
	 * @see #setIsMaximumInclusive(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_IsMaximumInclusive()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsMaximumInclusive();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MeasurementScale#getIsMaximumInclusive <em>Is Maximum Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Maximum Inclusive</em>' attribute.
	 * @see #getIsMaximumInclusive()
	 * @generated
	 */
	void setIsMaximumInclusive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Positive Value Connotation</b></em>' attribute.
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
	 * optional connotation, i.e. special significance, of positive values for this MeasurementScale
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;Suppose &quot;latitude&quot; (of a planet) is expressed on a RatioScale with the &quot;degree&quot; measurement unit. Then positive values by definition indicate a latitude on the northern hemisphere, and negative values indicate a latitude on the southern hemisphere. Therefore the positiveValueConnotation would be &quot;North&quot; and the negativeValueConnotation would be &quot;South&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Positive Value Connotation</em>' attribute.
	 * @see #setPositiveValueConnotation(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_PositiveValueConnotation()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getPositiveValueConnotation();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MeasurementScale#getPositiveValueConnotation <em>Positive Value Connotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Value Connotation</em>' attribute.
	 * @see #getPositiveValueConnotation()
	 * @generated
	 */
	void setPositiveValueConnotation(String value);

	/**
	 * Returns the value of the '<em><b>Negative Value Connotation</b></em>' attribute.
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
	 * optional connotation, i.e. special significance, of negative values for this MeasurementScale
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;See <i>positiveValueConnotation</i>.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negative Value Connotation</em>' attribute.
	 * @see #setNegativeValueConnotation(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_NegativeValueConnotation()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getNegativeValueConnotation();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MeasurementScale#getNegativeValueConnotation <em>Negative Value Connotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Value Connotation</em>' attribute.
	 * @see #getNegativeValueConnotation()
	 * @generated
	 */
	void setNegativeValueConnotation(String value);

	/**
	 * Returns the value of the '<em><b>Mapping To Reference Scale</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.MappingToReferenceScale}.
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
	 * reference to coincident quantity values on different but compatible MeasurementScales
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This property would be defined for a dependent MeasurementScale with respect to a reference MeasurementScale in order to enable parameter value conversion from one scale to another. The MappingToReferenceScale defines the offset by which measurement values need to be shifted when converting values between OrdinalScales or IntervalScales.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping To Reference Scale</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementScale_MappingToReferenceScale()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MappingToReferenceScale> getMappingToReferenceScale();

} // MeasurementScale
