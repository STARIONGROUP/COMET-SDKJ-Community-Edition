/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.VolatileThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Element</b></em>'.
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
 * representation of an explicit element of a system-of-interest in a fully expanded architectural decomposition tree for one Option
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;The hierarchy of NestedElements can be automatically generated from the implicit composite structure defined by ElementDefinitions and contained ElementUsages, and configured for an Option.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;The unique path to a single, possibly deeply nested, NestedElement is defined by the <i>topElement</i> of the relevant Iteration (which is the same for all Options)&#160;and an ordered list of subtended ElementUsage references.
 *     </p>
 * 
 *     <p>
 * Note 3:&#160;The NestedElement is an explicit representation of the so-called &quot;deeply nested connector&quot; concept in OMG&#160;SysML (v1.3).
 *     </p>
 * 
 *     <p>
 * Example:&#160;Assume a spacecraft with a service module &quot;sm&quot; (an&#160;ElementUsage of ElementDefinition &quot;SM&quot;) and two solar array wings with three panels each. The NestedElement representing panel 2 on wing 1 would be defined by the <i>topElement</i> ElementDefinition for the spacecraft (the &quot;system-of-interest&quot;), and a list of elementUsages referencing:&#160;the &quot;sm&quot; usage, the &#160;&quot;wing1&quot; usage, the&#160;&quot;panel2&quot; usage, in that order.
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
 *   <li>{@link CDP4.EngineeringModelData.NestedElement#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.NestedElement#getElementUsage <em>Element Usage</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.NestedElement#getNestedParameter <em>Nested Parameter</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedElement()
 * @model
 * @generated
 */
public interface NestedElement extends Thing, NamedThing, OwnedThing, ShortNamedThing, VolatileThing {
	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' reference.
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
	 * reference to the root ElementDefinition at which the path to this NestedElement starts
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;For an EngineeringModel that is an EngineeringModelKind.STUDY_MODEL&#160;this is typically the <i>topElement</i> of the selected Iteration. However the rootElement may be any ElementDefinition which allows for the generation of subtrees subtended from anywhere in the composite structure of a model, which is for example useful in EngineeringModels that are of the EngineeringModelKind.CATALOGUE&#160;kind.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Element</em>' reference.
	 * @see #setRootElement(ElementDefinition)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedElement_RootElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ElementDefinition getRootElement();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.NestedElement#getRootElement <em>Root Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(ElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Element Usage</b></em>' reference list.
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
	 * unique path to a single NestedElement defined by an ordered list of references to ElementUsages
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The first ElementUsage in the list must be a <i>containedElement</i> of the topElement of the relevant Iteration, the second ElementUsage must be a <i>containedElement</i> of the ElementDefinition pointed to by the <i>elementDefinition</i> of the first ElementUsage, and so on until the intended nested ElementUsage is reached.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Usage</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedElement_ElementUsage()
	 * @model required="true"
	 * @generated
	 */
	EList<ElementUsage> getElementUsage();

	/**
	 * Returns the value of the '<em><b>Nested Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.NestedParameter}.
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
	 * ordered list of NestedParameters that defined the fully expanded parametric representation for this NestedElement for a combination of one Option and one DomainOfExpertise
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;NestedParameters are meant to be present only on generated NestedElements.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Parameter</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getNestedElement_NestedParameter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NestedParameter> getNestedParameter();

} // NestedElement
