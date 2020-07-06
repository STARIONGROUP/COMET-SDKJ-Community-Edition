/**
 */
package CDP4.SiteDirectoryData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Parameter Type</b></em>'.
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
 * representation of an enumeration valued ScalarParameterType with a user-defined list of text values (enumeration literals) to select from
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.EnumerationParameterType#getAllowMultiSelect <em>Allow Multi Select</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EnumerationParameterType#getValueDefinition <em>Value Definition</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEnumerationParameterType()
 * @model
 * @generated
 */
public interface EnumerationParameterType extends ScalarParameterType {
	/**
	 * Returns the value of the '<em><b>Allow Multi Select</b></em>' attribute.
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
	 * assertion whether for values of this EnumerationParameterType selection of multiple enumeration literals is allowed or not
	 *     </p>
	 * 
	 *     <p>
	 * Note: For an EnumerationParameterType with allowMultiSelect false, only one enumeration literal may be selected and in a graphical user interface this would be represented with a set of radio buttons. For an EnumerationParameterType with allowMultiSelect set true, one or more enumeration literals may be selected and in a graphical user interface this would be represented with a set of check buttons. Example: For an enumeration type &quot;TransportKind&quot; the literals &quot;ByAir&quot;, &quot;ByTrain&quot;, &quot;ByBus&quot;, &quot;ByCar&quot;, &quot;ByBicycle&quot; and &quot;OnFoot&quot; are defined and allowMultiSelect is set true. Assume that a &quot;Transport&quot; item has parameter &quot;means of transport&quot; of type &#160;&quot;TransportKind&quot;. Now for a particular Transport instance &quot;ByTrain&quot; and &quot;ByBicycle&quot; may be both selected.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Multi Select</em>' attribute.
	 * @see #setAllowMultiSelect(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEnumerationParameterType_AllowMultiSelect()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getAllowMultiSelect();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.EnumerationParameterType#getAllowMultiSelect <em>Allow Multi Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Multi Select</em>' attribute.
	 * @see #getAllowMultiSelect()
	 * @generated
	 */
	void setAllowMultiSelect(Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Definition</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.EnumerationValueDefinition}.
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
	 * definition of the literal enumeration values for this EnumerationParameterType
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Definition</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEnumerationParameterType_ValueDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumerationValueDefinition> getValueDefinition();

} // EnumerationParameterType
