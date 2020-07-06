/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Unit</b></em>'.
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
 *       abstract superclass that represents the [VIM] concept of &quot;measurement 
 *       unit&quot; that is defined as &quot;real scalar quantity, defined and adopted by 
 *       convention, with which any other quantity of the same kind can be 
 *       compared to express the ratio of the two quantities as a number&quot;
 *     </p>
 * 
 *     <p>
 *       Note 1:&#160;In this data model the MeasurementUnit is extended to define the 
 *       meaning of an interval of one (1)&#160;on any MeasurementScale.
 *     </p>
 * 
 *     <p>
 *       Note 2:&#160;In an implementation of this data model there should be an 
 *       instance of MeasurementUnit for &quot;one&quot;, i.e. the mathematical number 1, 
 *       to be used in the definition of MeasurementScales for dimensionless 
 *       QuantityKinds.
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
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getMeasurementUnit()
 * @model abstract="true"
 * @generated
 */
public interface MeasurementUnit extends DefinedThing, DeprecatableThing {
} // MeasurementUnit
