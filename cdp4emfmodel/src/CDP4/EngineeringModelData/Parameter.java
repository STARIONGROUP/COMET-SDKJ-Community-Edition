/**
 */
package CDP4.EngineeringModelData;

import CDP4.SiteDirectoryData.DomainOfExpertise;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
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
 * representation of a parameter that defines a characteristic or property of an ElementDefinition
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;The concurrent engineering process is centered around a multi-disciplinary parametric definition of the system of interest. Parameters (with values) assigned to ElementDefinitions, ElementUsages and possibly NestedElements are the essential mechanism by which each DomainOfExpertise characterises, quantifies, communicates and shares their part of a design solution with all other domains of expertise (DomainOfExpertise).
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;The associated ParameterType (through the parameterType property)&#160;provides name, shortName, and optionally alias, definition and hyperLink for this Parameter.
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
 *   <li>{@link CDP4.EngineeringModelData.Parameter#getRequestedBy <em>Requested By</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Parameter#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Parameter#getAllowDifferentOwnerOfOverride <em>Allow Different Owner Of Override</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Parameter#getExpectsOverride <em>Expects Override</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends ParameterOrOverrideBase {
	/**
	 * Returns the value of the '<em><b>Requested By</b></em>' reference.
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
	 * optional reference to the DomainOfExpertise that has requested this Parameter
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This property is used to signify that a Parameter has not been created (i.e. added to an ElementDefinition) by the owner DomainOfExpertise by is requested by a different DomainOfExpertise. When the value is unset (i.e. set to null)&#160;it signifies that the Parameter has been accepted by the owner DomainOfExpertise.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested By</em>' reference.
	 * @see #setRequestedBy(DomainOfExpertise)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameter_RequestedBy()
	 * @model ordered="false"
	 * @generated
	 */
	DomainOfExpertise getRequestedBy();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Parameter#getRequestedBy <em>Requested By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested By</em>' reference.
	 * @see #getRequestedBy()
	 * @generated
	 */
	void setRequestedBy(DomainOfExpertise value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ParameterValueSet}.
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
	 * representation of the switch and values of this Parameter
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameter_ValueSet()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ParameterValueSet> getValueSet();

	/**
	 * Returns the value of the '<em><b>Allow Different Owner Of Override</b></em>' attribute.
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
	 * assertion whether a ParameterOverride associated with this Parameter may have a different owner DomainOfExpertise or not
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Different Owner Of Override</em>' attribute.
	 * @see #setAllowDifferentOwnerOfOverride(Boolean)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameter_AllowDifferentOwnerOfOverride()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getAllowDifferentOwnerOfOverride();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Parameter#getAllowDifferentOwnerOfOverride <em>Allow Different Owner Of Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Different Owner Of Override</em>' attribute.
	 * @see #getAllowDifferentOwnerOfOverride()
	 * @generated
	 */
	void setAllowDifferentOwnerOfOverride(Boolean value);

	/**
	 * Returns the value of the '<em><b>Expects Override</b></em>' attribute.
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
	 * assertion whether a ParameterOverride is expected for this Parameter in ElementUsages of the ElementDefinition that contains this Parameter
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expects Override</em>' attribute.
	 * @see #setExpectsOverride(Boolean)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameter_ExpectsOverride()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getExpectsOverride();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Parameter#getExpectsOverride <em>Expects Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expects Override</em>' attribute.
	 * @see #getExpectsOverride()
	 * @generated
	 */
	void setExpectsOverride(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (type->oclTypeOf(QuantityKind) 
	 * and scale->size() = 1
	 * and type.possibleScale->includes(scale)) 
	 * or (scale->size() = 0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasValidScale(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Parameter
