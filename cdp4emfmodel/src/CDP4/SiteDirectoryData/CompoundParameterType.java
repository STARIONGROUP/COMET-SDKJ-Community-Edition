/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Parameter Type</b></em>'.
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
 * representation of a non-scalar compound parameter type that is composed of one or more other (component) ParameterTypes
 *     </p>
 * 
 *     <p>
 * Note 1: The purpose of this parameter type is to allow manipulation of a set of related (usually scalar) parameters as one compound parameter for those cases where all component parameter values need to be considered together. The CompoundParameterType allows modelling parameter types similar to structured datatypes in programming languages and to vectors, matrices and tensors in mathematics and physics.
 *     </p>
 * 
 *     <p>
 * Note 2: The default owner DomainOfExpertises of any associated ParameterTypeComponents are ignored, only the defaultOwner of this CompoundParameterType is taken into account.
 *     </p>
 * 
 *     <p>
 * Example 1:&#160;An &quot;event_occurrence&quot; parameter type can be defined by a CompoundParameterType with a &quot;type&quot; and a &quot;timestamp&quot;&#160;component. The &quot;type&quot;&#160;component would be an EnumerationParameterType that enumerates a number of known event names and the &quot;timestamp&quot;&#160;component would be a DateTimeParameterType.
 *     </p>
 * 
 *     <p>
 * Example 2:&#160;A 3D Cartesian coordinate position can be defined by a CompoundParameterType (or actually an ArrayParameterType)&#160;with &quot;x&quot;, &quot;y&quot; and &quot;z&quot; components that would each be QuantityKinds with a quantityKind &quot;position&quot;&#160;and a scale &quot;mm&quot; (for &quot;millimetre&quot;).
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
 *   <li>{@link CDP4.SiteDirectoryData.CompoundParameterType#getComponent <em>Component</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.CompoundParameterType#getIsFinalized <em>Is Finalized</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCompoundParameterType()
 * @model
 * @generated
 */
public interface CompoundParameterType extends ParameterType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.ParameterTypeComponent}.
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
	 * representation of an individual component of this CompoundParameterType
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCompoundParameterType_Component()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ParameterTypeComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Is Finalized</b></em>' attribute.
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
	 * assertion whether this CompoundParameterType is finalized
	 *     </p>
	 * 
	 *     <p>
	 * Note: Finalized means that the definition of the <i>component</i> collection of this CompoundParameterType is final and therefore may not be changed anymore. Finalization is necessary because the number of values in properties of any associated ParameterValueSets, ParameterOverrideValueSets and ParameterSubscriptionValueSets depend on the number and type of components.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Finalized</em>' attribute.
	 * @see #setIsFinalized(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getCompoundParameterType_IsFinalized()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsFinalized();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.CompoundParameterType#getIsFinalized <em>Is Finalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Finalized</em>' attribute.
	 * @see #getIsFinalized()
	 * @generated
	 */
	void setIsFinalized(Boolean value);

} // CompoundParameterType
