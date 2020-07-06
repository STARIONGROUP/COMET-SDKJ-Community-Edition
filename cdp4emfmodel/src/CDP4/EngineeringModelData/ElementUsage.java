/**
 */
package CDP4.EngineeringModelData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Usage</b></em>'.
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
 * named usage of an ElementDefinition in the context of a next higher level ElementDefinition that contains this ElementUsage
 *     </p>
 * 
 *     <p>
 * Note 1: An ElementUsage has one and only one ElementDefinition as its <i>containingElement</i>.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;When an ElementDefinition is made a member of a Category through its <i>category</i> property, then also any ElementUsage typed by such an ElementDefinition is implied to be a member of the same Category.
 *     </p>
 * 
 *     <p>
 * Note 3:&#160;A ParameterType &quot;NumberOf&quot; may be defined in an associated ReferenceDataLibrary. Subsequently a &quot;NumberOf&quot; Parameter or ParameterOverride may be added to an ElementUsage as a short-cut to define a number of containedElements that are not named individually. Setting &quot;NumberOf&quot; to a value greater than one is typically only done in early conceptual design. In a later detailed design phase each usage would normally be instantiated individually, so that where needed different usage level Parameters can have different values.
 *     </p>
 * 
 *     <p>
 * Note 4:&#160;Both the <i>owner</i> DomainOfExpertise of the <i>containingElement</i> and of the <i>elementDefinition</i> are owner(s) of this ElementUsage, i.e. the union of self.containingElement.owner and self.elementDefinition.owner.
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
 *   <li>{@link CDP4.EngineeringModelData.ElementUsage#getElementDefinition <em>Element Definition</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ElementUsage#getInterfaceEnd <em>Interface End</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ElementUsage#getParameterOverride <em>Parameter Override</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementUsage()
 * @model
 * @generated
 */
public interface ElementUsage extends ElementBase, OptionDependentThing {
	/**
	 * Returns the value of the '<em><b>Element Definition</b></em>' reference.
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
	 * reference to the ElementDefinition that defines this ElementUsage
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The <i>elementDefinition</i> of an ElementUsage could also be regarded as the <i>type</i> of the ElementUsage.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Definition</em>' reference.
	 * @see #setElementDefinition(ElementDefinition)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementUsage_ElementDefinition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ElementDefinition getElementDefinition();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ElementUsage#getElementDefinition <em>Element Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Definition</em>' reference.
	 * @see #getElementDefinition()
	 * @generated
	 */
	void setElementDefinition(ElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Interface End</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link CDP4.EngineeringModelData.InterfaceEndKind}.
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
	 *       indication whether this ElementUsage is a (potential) interface end
	 *     </p>
	 * 
	 *     <p>
	 *       Note 1: An interface end is one side of an interface, where the complete 
	 *       interface is defined as the connection plus two or more interface ends.
	 *     </p>
	 * 
	 *     <p>
	 *       Note 2: Interface definition is currently not explicitly modelled in 
	 *       this data model. However it is possible to define a Category e.g. named 
	 *       &quot;InterfaceDefinitions&quot;, and then instantiate ElementDefinitions and 
	 *       ElementUsages that belong to this category for the interfaces to be 
	 *       defined, using the referencedElement property of ElementUsage to connect 
	 *       architectural elements that represent interface ends.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface End</em>' attribute.
	 * @see CDP4.EngineeringModelData.InterfaceEndKind
	 * @see #setInterfaceEnd(InterfaceEndKind)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementUsage_InterfaceEnd()
	 * @model default="NONE" required="true" ordered="false"
	 * @generated
	 */
	InterfaceEndKind getInterfaceEnd();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ElementUsage#getInterfaceEnd <em>Interface End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface End</em>' attribute.
	 * @see CDP4.EngineeringModelData.InterfaceEndKind
	 * @see #getInterfaceEnd()
	 * @generated
	 */
	void setInterfaceEnd(InterfaceEndKind value);

	/**
	 * Returns the value of the '<em><b>Parameter Override</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ParameterOverride}.
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
	 * representation of zero or more ParameterOverrides to hold overridden values for a Parameter at this ElementUsage level
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The <i>parameter</i> of this ParameterOverride must be a Parameter of the <i>elementDefinition</i> of the containing ElementUsage.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Override</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getElementUsage_ParameterOverride()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterOverride> getParameterOverride();

} // ElementUsage
