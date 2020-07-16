/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
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
 * abstract superclass that represents the common characteristics of any parameter type
 *     </p>
 * 
 *     <p>
 * Note:&#160;There are two properties to hold a short identifier to designate a ParameterType:&#160;<i>shortName</i> and <i>symbol</i>. The <i>shortName</i> must be case-insensitive unique within its containing ReferenceDataLibrary. This is necessary in order to support case-insensitive unique names in derived parameter names for use in modeling environments that only have case-insensitive variable names such as MS&#160;Excel. The <i>symbol</i> must be case-sensitive unique within its containing ReferenceDataLibrary. The <i>symbol</i> is meant to hold the official symbolic name of a ParameterType as defined for example in an ISO&#160;standard.
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
 *   <li>{@link CDP4.SiteDirectoryData.ParameterType#getNumberOfValues <em>Number Of Values</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ParameterType#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterType()
 * @model abstract="true"
 * @generated
 */
public interface ParameterType extends DefinedThing, CategorizableThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Number Of Values</b></em>' attribute.
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
	 * number of individual values in each of the parameter value properties of a ParameterValueSet, a ParameterSubscriptionValueSet or a SimpleParameterValue for this ParameterType
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;For a ScalarParameterType this will be one, while for a CompoundParameterType this will amount to the (possibly recursive)&#160;summation of the <i>numberOfValues</i> in the ParameterTypes of all <i>component</i> ParameterTypeComponents.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Values</em>' attribute.
	 * @see #setNumberOfValues(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterType_NumberOfValues()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getNumberOfValues();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ParameterType#getNumberOfValues <em>Number Of Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Values</em>' attribute.
	 * @see #getNumberOfValues()
	 * @generated
	 */
	void setNumberOfValues(Integer value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
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
	 * short symbolic name of this ParameterType
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Where applicable this property shall be used to hold the symbol that is defined through a standard (e.g. from ISO)&#160;or by convention.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParameterType_Symbol()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ParameterType#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // ParameterType
