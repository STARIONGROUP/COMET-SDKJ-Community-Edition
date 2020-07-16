/**
 */
package CDP4.EngineeringModelData;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition</b></em>'.
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
 * definition of an element in a design solution for a system-of-interest
 *     </p>
 * 
 *     <p>
 * Note 1: An element is defined once (as an ElementDefinition) and then can be used (as an ElementUsage) any number of times in a design solution for the system-of-interest.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;The ElementDefinition and ElementUsage structure together form the representation of the hierarchical design composition / decomposition of the system-of-interest. Through the combination of the <i>containedElement</i> property and the <i>referencedElement</i>&#160;property of ElementUsage a hybrid product tree can be represented in which both logical and concrete (aka physical) architecture are combined.
 *     </p>
 * 
 *     <p>
 * Note 3: Because of the containment relationship between ElementDefinition and ElementUsage, there is special behaviour with respect to Category membership. If an ElementDefinition is defined to be a member of a Category (through its category property), then also any ElementUsage that is typed by this ElementDefinition is a member of that Category.
 *     </p>
 * 
 *     <p>
 * Example: The design of gyroscope &quot;GS-123&quot;&#160;is defined in an ElementDefinition and then 4 gyroscopes of this type are used as part of the attitude and orbit control equipment through 4 ElementUsages with names &quot;x-gyro&quot;, &quot;y-gyro&quot;, &quot;z-gyro&quot; and &quot;xyz-gyro&quot;. All 4 usages are said to be of <i>type</i> &quot;GS-123&quot;.
 *     </p>
 * 
 *     <p>
 * Note 3:&#160;ElementDefinition is the equivalent of the concept of <i>Block</i> in OMG&#160;SysML. ElementUsage is the equivalent of the concept of <i>Part</i> in OMG&#160;SysML.
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
 *   <li>{@link CDP4.EngineeringModelData.ElementDefinition#getContainedElement <em>Contained Element</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ElementDefinition#getParameter <em>Parameter</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ElementDefinition#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ElementDefinition#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementDefinition()
 * @model
 * @generated
 */
public interface ElementDefinition extends ElementBase {
	/**
	 * Returns the value of the '<em><b>Contained Element</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ElementUsage}.
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
	 * list of zero or more usages of elements at the next lower level of hierarchical decomposition, where each element is defined (typed) by an(other) ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Note 1: This property captures the whole-part relationship between an ElementDefinition (the whole, the <i>containingElement</i>) and an ElementUsage (the part, the <i>containedElement</i>). This implies that the ElementUsage is existence dependent on the <i>containingElement</i> ElementDefinition. If the ElementDefinition is removed from the system-of-interest also its dependent ElementUsages are removed, as well as any subtree of ElementUsages subtended below the first lower level.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2: The permitted <i>containedElement</i> and <i>referencedElement</i> collections can be defined through a combination of appropriate Categories, DecompositionRules and ReferencerRules.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3: The <i>containedElement</i> property is the equivalent of a <i>part property</i> of a <i>Block</i> in OMG SysML.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Element</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementDefinition_ContainedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementUsage> getContainedElement();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Parameter}.
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
	 * collection of Parameters that define characteristics of this ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Note: Parameters and ParameterValueSets together form the parametric definition of this ElementDefinition as well as of ElementUsages that are typed by this ElementDefinition.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementDefinition_Parameter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Parameter Group</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ParameterGroup}.
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
	 * collection of ParameterGroups that define a grouping hierarchy to hold the Parameters of this ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Note: This grouping does not carry specific meaning, but is a convenience mechanism to assist in the management and presentation of large sets of parameters.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Group</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementDefinition_ParameterGroup()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterGroup> getParameterGroup();

	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.NestedElement}.
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
	 * zero or more references to ElementUsages at lower level(s)&#160;in the hierarchical decomposition of the system-of-interest
	 *     </p>
	 * 
	 *     <p>
	 * Note 1: Referencing elements through NestedElements is a flexible and unconstrained mechanism to support network-type architectures and ad-hoc structures. The semantics of these references need to be defined through appropriate Categories that are associated with the participating ElementDefinitions, ElementUsages and NestedElements. Since the Categories are defined in ReferenceDataLibraries the interpretation of such references is therefore reference data dependent.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2: In order to adhere to the principle of strict modularity, the only permissible referencedElement(s) are ElementUsage(s) contained in the subtree of this ElementDefinition.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementDefinition_ReferencedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NestedElement> getReferencedElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * parameter->isUnique(name)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasUniqueParameterNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * parameter->isUnique(shortName)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasUniqueParameterShortNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ElementDefinition
