/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping To Reference Scale</b></em>'.
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
 * representation of a mapping of a value on a dependent MeasurementScale to a value on a reference MeasurementScale that represents the same quantity
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;One or more of these mappings would be defined for a dependent MeasurementScale (the scale being mapped)&#160;with respect to a reference MeasurementScale (the scale being mapped to)&#160;in order to enable quantity value conversion.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;For conversion between measurement scales other than OrdinalScales, i.e. scales with a meaningful MeasurementUnit that defines intervals of one on that scale, a single MappingToReferenceScale implicitly defines the offset by which measurement values need to be transformed when converting from the dependent to the reference scale or vice versa.
 *     </p>
 * 
 *     <p>
 * Note 3:&#160;For conversion to or from an OrdinalScale, a complete set of MappingToReferenceScale instances would need to be defined, one for each value on the OrdinalScale, since for an OrdinalScale the intervals between the scale values do not have particular significance, and therefore the mapping cannot be represented by a simple (linear or logarithmic)&#160;transformation function.
 *     </p>
 * 
 *     <p>
 * Example:&#160;The mapping between the thermodynamic temperature RatioScale in kelvin (the reference scale)&#160;and the Celsius temperature IntervalScale in degree Celsius (the dependent scale)&#160;is defined by a MappingToReferenceScale with <i>referenceScaleValue.value</i> = 0.0 [K] and <i>dependentScaleValue.value</i> = -273.15 [°C].
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
 *   <li>{@link CDP4.SiteDirectoryData.MappingToReferenceScale#getReferenceScaleValue <em>Reference Scale Value</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.MappingToReferenceScale#getDependentScaleValue <em>Dependent Scale Value</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMappingToReferenceScale()
 * @model
 * @generated
 */
public interface MappingToReferenceScale extends Thing {
	/**
	 * Returns the value of the '<em><b>Reference Scale Value</b></em>' reference.
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
	 * reference to the ScaleValueDefinition of the reference MeasurementScale
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Scale Value</em>' reference.
	 * @see #setReferenceScaleValue(ScaleValueDefinition)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMappingToReferenceScale_ReferenceScaleValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ScaleValueDefinition getReferenceScaleValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MappingToReferenceScale#getReferenceScaleValue <em>Reference Scale Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Scale Value</em>' reference.
	 * @see #getReferenceScaleValue()
	 * @generated
	 */
	void setReferenceScaleValue(ScaleValueDefinition value);

	/**
	 * Returns the value of the '<em><b>Dependent Scale Value</b></em>' reference.
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
	 * reference to the ScaleValueDefinition of the dependent MeasurementScale, i.e. the value on the dependent scale that represents the same quantity as the one defined by the given <i>referenceScaleValue</i>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Scale Value</em>' reference.
	 * @see #setDependentScaleValue(ScaleValueDefinition)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMappingToReferenceScale_DependentScaleValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ScaleValueDefinition getDependentScaleValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.MappingToReferenceScale#getDependentScaleValue <em>Dependent Scale Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Scale Value</em>' reference.
	 * @see #getDependentScaleValue()
	 * @generated
	 */
	void setDependentScaleValue(ScaleValueDefinition value);

} // MappingToReferenceScale
