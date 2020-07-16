/**
 */
package CDP4.SiteDirectoryData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Engineering Model Kind</b></em>',
 * and utility methods for working with them.
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
 *     enumeration datatype that represents the different possible kinds of 
 *     EngineeringModel
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelKind()
 * @model
 * @generated
 */
public enum EngineeringModelKind implements Enumerator {
	/**
	 * The '<em><b>STUDY MODEL</b></em>' literal object.
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
	 * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is the model of a concrete study
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #STUDY_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	STUDY_MODEL(0, "STUDY_MODEL", "STUDY_MODEL"),

	/**
	 * The '<em><b>TEMPLATE MODEL</b></em>' literal object.
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
	 * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a template model intended to be used as the basis for new study models
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;A&#160;template model may have only one iteration (represented by a combination of IterationSetup and Iteration).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #TEMPLATE_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPLATE_MODEL(1, "TEMPLATE_MODEL", "TEMPLATE_MODEL"),

	/**
	 * The '<em><b>MODEL CATALOGUE</b></em>' literal object.
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
	 * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a catalogue of model components and/or patterns that can be re-used in the model of a study
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;A&#160;catalogue may have only one iteration (represented by a combination of IterationSetup and Iteration), and one Option.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MODEL_CATALOGUE_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_CATALOGUE(2, "MODEL_CATALOGUE", "MODEL_CATALOGUE"),

	/**
	 * The '<em><b>SCRATCH MODEL</b></em>' literal object.
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
	 * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a scratch model to be used for preparation, training or experimentation purposes
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #SCRATCH_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	SCRATCH_MODEL(3, "SCRATCH_MODEL", "SCRATCH_MODEL");

	/**
	 * The '<em><b>STUDY MODEL</b></em>' literal value.
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
	 * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is the model of a concrete study
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #STUDY_MODEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STUDY_MODEL_VALUE = 0;

	/**
	 * The '<em><b>TEMPLATE MODEL</b></em>' literal value.
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
	 * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a template model intended to be used as the basis for new study models
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;A&#160;template model may have only one iteration (represented by a combination of IterationSetup and Iteration).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #TEMPLATE_MODEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPLATE_MODEL_VALUE = 1;

	/**
	 * The '<em><b>MODEL CATALOGUE</b></em>' literal value.
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
	 * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a catalogue of model components and/or patterns that can be re-used in the model of a study
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;A&#160;catalogue may have only one iteration (represented by a combination of IterationSetup and Iteration), and one Option.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MODEL_CATALOGUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_CATALOGUE_VALUE = 2;

	/**
	 * The '<em><b>SCRATCH MODEL</b></em>' literal value.
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
	 * assertion that an engineering model (represented by an EngineeringModelSetup and an EngineeringModel) is a scratch model to be used for preparation, training or experimentation purposes
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #SCRATCH_MODEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCRATCH_MODEL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Engineering Model Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EngineeringModelKind[] VALUES_ARRAY =
		new EngineeringModelKind[] {
			STUDY_MODEL,
			TEMPLATE_MODEL,
			MODEL_CATALOGUE,
			SCRATCH_MODEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Engineering Model Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EngineeringModelKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Engineering Model Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EngineeringModelKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EngineeringModelKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Engineering Model Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EngineeringModelKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EngineeringModelKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Engineering Model Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EngineeringModelKind get(int value) {
		switch (value) {
			case STUDY_MODEL_VALUE: return STUDY_MODEL;
			case TEMPLATE_MODEL_VALUE: return TEMPLATE_MODEL;
			case MODEL_CATALOGUE_VALUE: return MODEL_CATALOGUE;
			case SCRATCH_MODEL_VALUE: return SCRATCH_MODEL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EngineeringModelKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EngineeringModelKind
