/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Data Library</b></em>'.
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
 * named library that holds a set of (predefined) reference data that can be loaded at runtime and used in an EngineeringModel
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;An EngineeringModel may use one or more reference data libraries. Typically there would be 3 levels as follows:
 *     </p>
 * 
 *     <ol>
 *       <li>
 * A&#160;top level SiteReferenceDataLibrary (the &quot;master RDL&quot;)&#160;that provides generally used concepts such as generic ParameterTypes, SI&#160;QuantityKinds, MeasurementScales and MeasurementUnits. These are concepts that are used in almost any concurrent design EngineeringModel independent of the application domain.
 *       </li>
 *       <li>
 * A second level SiteReferenceDataLibrary that holds concepts like ParameterTypes, MeasurementScales, MeasurementUnits and Glossaries for a specific application domain or &quot;family of studies&quot;, for example: Space Mission Development, System of Systems Development, Early Concept Development, Payload Instrument Development, Launch Vehicle Development.
 *       </li>
 *       <li>
 * A third level ModelReferenceDataLibrary that contains concepts similar to the second level, but now those that are particular to a specific EngineeringModel.
 *       </li>
 *     </ol>
 *     <p>
 * Note 2: One or more ReferenceDataLibraries hold the <i>system of quantities</i> that is defined in <a href="http://www.bipm.org/en/publications/guides/vim.html">VIM</a> as a &quot;set of quantities together with a set of non-contradictory equations relating those quantities&quot; and the system of units defined in <a href="http://www.bipm.org/en/publications/guides/vim.html">VIM</a>&#160;as &quot;set of base units and derived units, together with their multiples and submultiples, defined in accordance with given rules, for a given system of quantities&quot;. E-TM-10-25 uses as a basis the International System of Quantities (ISQ) and the International System of Units as defined in ISO/IEC 80000. In addition measurement scales are explicitly defined, so that a fully self-described system is captured. Where needed this is extended with non-SI&#160;quantities, scales and units with explicit conversion relationships.
 *     </p>
 * 
 *     <p>
 * Note 3: Instances contained by a ReferenceDataLibrary
 *     </p>
 * 
 *     <p>
 * may not be deleted because that would potentially invalidate such libraries for earlier EngineeringModels or other ReferenceDataLibraries that reference them. Such instances may only be deprecated, see DeprecatableThing.
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
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getDefinedCategory <em>Defined Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getBaseQuantityKind <em>Base Quantity Kind</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getScale <em>Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getUnitPrefix <em>Unit Prefix</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getUnit <em>Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getFileType <em>File Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getReferenceSource <em>Reference Source</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getRule <em>Rule</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getRequiredRdl <em>Required Rdl</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceDataLibrary extends DefinedThing, ParticipantAffectedAccessThing {
	/**
	 * Returns the value of the '<em><b>Defined Category</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Category}.
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
	 * collection of defined, i.e. known, Categories
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defined Category</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_DefinedCategory()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Category> getDefinedCategory();

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.ParameterType}.
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
	 *     contained collection of ParameterTypes
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_ParameterType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterType> getParameterType();

	/**
	 * Returns the value of the '<em><b>Base Quantity Kind</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.QuantityKind}.
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
	 * collection of references to the QuantityKinds that are selected as a basis of the system of quantities defined in this ReferenceDataLibrary
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;This is a subset of the complete set of QuantityKinds. The base quantities define the basis for the quantity dimension of a kind of quantity.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2: If a QuantityKind is in this collection and thus a base QuantityKind, then this base QuantityKind is considered to be primary kind of quantity for the MeasurementUnit of the <i>defaultScale</i> MeasurementScale.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Quantity Kind</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_BaseQuantityKind()
	 * @model
	 * @generated
	 */
	EList<QuantityKind> getBaseQuantityKind();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.MeasurementScale}.
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
	 *     contained collection of MeasurementScales
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_Scale()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MeasurementScale> getScale();

	/**
	 * Returns the value of the '<em><b>Unit Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.UnitPrefix}.
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
	 * collection of zero or more UnitPrefix instances that define the prefixes for multiples and submultiples of (metric) MeasurementUnits
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Prefix</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_UnitPrefix()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UnitPrefix> getUnitPrefix();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.MeasurementUnit}.
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
	 *     contained collection of MeasurementUnits
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_Unit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MeasurementUnit> getUnit();

	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.MeasurementUnit}.
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
	 *       specification of the base MeasurementUnits for the system of units 
	 *       defined in this ReferenceDataLibrary
	 *     </p>
	 * 
	 *     <p>
	 *       Note:&#160;A &quot;base unit&quot; is defined in [VIM] as a &quot;measurement unit that is 
	 *       adopted by convention for a base quantity&quot;, i.e. it is the (preferred) 
	 *       unit in which base quantities of the associated system of quantities are 
	 *       expressed.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Unit</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_BaseUnit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MeasurementUnit> getBaseUnit();

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.FileType}.
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
	 * collection of defined, i.e. known, FileTypes
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Type</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_FileType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FileType> getFileType();

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Glossary}.
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
	 *     contained collection of Glossaries
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_Glossary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Glossary> getGlossary();

	/**
	 * Returns the value of the '<em><b>Reference Source</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.ReferenceSource}.
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
	 *     contained collection of ReferenceSources
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Source</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_ReferenceSource()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ReferenceSource> getReferenceSource();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Rule}.
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
	 * collection of defined, i.e. known, Rules
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_Rule()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Required Rdl</b></em>' reference.
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
	 * optional reference to the required next higher level ReferenceDataLibrary
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This property allows chaining an ordered list of ReferenceDataLibraries for use within an EngineeringModel. Its implementation shall have a similar effect as an &quot;import&quot; or &quot;include&quot; statement in a programming language. There shall not be any circular references in the list. This property is empty for the top level ReferenceDataLibrary.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Rdl</em>' reference.
	 * @see #setRequiredRdl(SiteReferenceDataLibrary)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_RequiredRdl()
	 * @model ordered="false"
	 * @generated
	 */
	SiteReferenceDataLibrary getRequiredRdl();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary#getRequiredRdl <em>Required Rdl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Rdl</em>' reference.
	 * @see #getRequiredRdl()
	 * @generated
	 */
	void setRequiredRdl(SiteReferenceDataLibrary value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Constant}.
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
	 * contained collection of Constants
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getReferenceDataLibrary_Constant()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constant> getConstant();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * parameterType->isUnique(name)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasUniqueParameterTypeNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * parameterType->isUnique(shortName)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasUniqueParameterTypeShortNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * definedCategory->isUnique(name)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasUniqueCategoryNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * definedCategory->isUnique(shortName)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasUniqueCategoryShortNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReferenceDataLibrary
