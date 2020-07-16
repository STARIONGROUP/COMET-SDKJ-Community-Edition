/**
 */
package CDP4.SiteDirectoryData;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Parameter Type</b></em>'.
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
 * specialization of CompoundParameterType that specifies a one-dimensional or multi-dimensional array parameter type with elements (components) that are typed by other ScalarParameterTypes
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.ArrayParameterType#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ArrayParameterType#getIsTensor <em>Is Tensor</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ArrayParameterType#getHasSingleComponentType <em>Has Single Component Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ArrayParameterType#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getArrayParameterType()
 * @model
 * @generated
 */
public interface ArrayParameterType extends CompoundParameterType {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
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
	 *       definition of the number of array elements in each dimension
	 *     </p>
	 * 
	 *     <p>
	 *       Note:&#160;Implicitly this also defines the number of dimensions of the array 
	 *       which determines its <i>rank</i>
	 *     </p>
	 * 
	 *     <p>
	 *       Example:&#160;To define an ArrayParameterType for a 3 by 3 matrix, <i>dimension</i> 
	 *       would be set to {3,3}.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getArrayParameterType_Dimension()
	 * @model unique="false" dataType="CDP4.CommonData.Integer" required="true"
	 * @generated
	 */
	EList<Integer> getDimension();

	/**
	 * Returns the value of the '<em><b>Is Tensor</b></em>' attribute.
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
	 * assertion whether this parameter type is a tensor
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;An nth-rank tensor in m-dimensional space is a mathematical object that has n indices and m<sup>n</sup> components and obeys certain transformation rules. For details see e.g. <a href="http://mathworld.wolfram.com/Tensor.html">http://mathworld.wolfram.com/Tensor.html</a>.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Tensor</em>' attribute.
	 * @see #setIsTensor(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getArrayParameterType_IsTensor()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsTensor();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ArrayParameterType#getIsTensor <em>Is Tensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tensor</em>' attribute.
	 * @see #getIsTensor()
	 * @generated
	 */
	void setIsTensor(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Single Component Type</b></em>' attribute.
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
	 * derived assertion that all components of an ArrayParameterType are of the same ParameterType, and, if the ParameterType is a QuantityKind, of the same MeasurementScale
	 *     </p>
	 * 
	 *     <p>
	 * Note: In an implementation when creating an ArrayParameterType it is useful to provide the option to specify that all <i>component</i> ParameterTypeComponents will have the same ParameterType and where applicable the same MeasurementScale.
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;An example of an ArrayParameterType for which <i>hasSingleComponentType</i> is true, is a 3D Cartesian vector (with one <i>dimension </i>with value 3)&#160;where the <i>parameterType</i> of each <i>component</i> is the &quot;length&quot; SimpleQuantityKind and the <i>scale</i> is the &quot;millimetre&quot;&#160;RatioScale.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Single Component Type</em>' attribute.
	 * @see #setHasSingleComponentType(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getArrayParameterType_HasSingleComponentType()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getHasSingleComponentType();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ArrayParameterType#getHasSingleComponentType <em>Has Single Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Single Component Type</em>' attribute.
	 * @see #getHasSingleComponentType()
	 * @generated
	 */
	void setHasSingleComponentType(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
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
	 *       specifies the rank
	 *     </p>
	 * 
	 *     <p>
	 *       Note: The rank of an array datatype is equal to the number of dimensions 
	 *       it has.
	 *     </p>
	 * 
	 *     <p>
	 *       Example:&#160;A vector has rank = 1, a matrix has rank = 2, a higher order 
	 *       tensor has rank &gt; 2. Vector and matrix are special cases of the general 
	 *       concept of tensor.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getArrayParameterType_Rank()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getRank();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ArrayParameterType#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (hasSingleComponentType and component->size() = 1)
	 * or not hasSingleComponentType
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasValidNumberOfComponents(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ArrayParameterType
