/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type Component</b></em>'.
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
 * representation of a component of a CompoundParameterType
 *     </p>
 * 
 *     <p>
 * Example 1:&#160;ParameterTypeComponents with shortNames &quot;x&quot;, &quot;y&quot; and &quot;z&quot; for the components of a 
 *     </p>
 * 
 *     <p>
 * ArrayParameterType that represents a 3D Cartesian coordinate position.
 *     </p>
 * 
 *     <p>
 * Example 2: Components &quot;nr&quot; and &#160;&quot;connector_type&quot; for a CompoundParameterType that defines the number of a certain type of connectors. The &quot;nr&quot; component would be a &quot;count&quot; QuantityKind and the &quot;connector_type&quot; would be a EnumerationParameterType with an enumeration of known connector types.
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
 *   <li>{@link CDP4.SiteDirectoryData.ParameterTypeComponent#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ParameterTypeComponent#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterTypeComponent()
 * @model
 * @generated
 */
public interface ParameterTypeComponent extends Thing, ShortNamedThing {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
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
	 * specification of the ParameterType of this component
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;If the ParameterTypeComponent is a <i>component</i> of an ArrayParameterType it must be a ScalarParameterType.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(ParameterType)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterTypeComponent_ParameterType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterType getParameterType();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ParameterTypeComponent#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' reference.
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
	 *       specification of the MeasurementScale for this component of a       CompoundParameterType
	 *     </p>
	 * 
	 *     <p>
	 *       Note:&#160;The scale shall only be specified for a ScalarParameterType       component       that       is       a       QuantityKind,       i.e.       a       numerical       parameter       type.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' reference.
	 * @see #setScale(MeasurementScale)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterTypeComponent_Scale()
	 * @model ordered="false"
	 * @generated
	 */
	MeasurementScale getScale();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ParameterTypeComponent#getScale <em>Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(MeasurementScale value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (type->oclIsTypeOf(QuantityKind) 
	 *   and scale->size() = 1
	 *   and type.possibleScale->includes(scale)) 
	 * or (scale->size() = 0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasValidScale(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ParameterTypeComponent
