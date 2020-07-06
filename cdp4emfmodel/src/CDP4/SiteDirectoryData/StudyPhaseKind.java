/**
 */
package CDP4.SiteDirectoryData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Study Phase Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 *   <body>
 *     <!--StartFragment--><a id="ParameterValueKind">enumeration datatype that represents</a><!--EndFragment-->&#160;the different study phases that may apply to an EngineeringModelSetup / EngineeringModel
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getStudyPhaseKind()
 * @model
 * @generated
 */
public enum StudyPhaseKind implements Enumerator {
	/**
	 * The '<em><b>PREPARATION PHASE</b></em>' literal object.
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
	 *     assertion that a model pertains to a study preparation phase
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #PREPARATION_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	PREPARATION_PHASE(0, "PREPARATION_PHASE", "PREPARATION_PHASE"),

	/**
	 * The '<em><b>DESIGN SESSION PHASE</b></em>' literal object.
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
	 *     assertion that a model pertains to a study design session phase
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #DESIGN_SESSION_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN_SESSION_PHASE(1, "DESIGN_SESSION_PHASE", "DESIGN_SESSION_PHASE"),

	/**
	 * The '<em><b>REPORTING PHASE</b></em>' literal object.
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
	 *     assertion that a model pertains to a study reporting phase
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #REPORTING_PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTING_PHASE(2, "REPORTING_PHASE", "REPORTING_PHASE"),

	/**
	 * The '<em><b>COMPLETED STUDY</b></em>' literal object.
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
	 *     assertion that a model pertains to a completed study
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #COMPLETED_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED_STUDY(3, "COMPLETED_STUDY", "COMPLETED_STUDY");

	/**
	 * The '<em><b>PREPARATION PHASE</b></em>' literal value.
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
	 *     assertion that a model pertains to a study preparation phase
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #PREPARATION_PHASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREPARATION_PHASE_VALUE = 0;

	/**
	 * The '<em><b>DESIGN SESSION PHASE</b></em>' literal value.
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
	 *     assertion that a model pertains to a study design session phase
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #DESIGN_SESSION_PHASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_SESSION_PHASE_VALUE = 1;

	/**
	 * The '<em><b>REPORTING PHASE</b></em>' literal value.
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
	 *     assertion that a model pertains to a study reporting phase
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #REPORTING_PHASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_PHASE_VALUE = 2;

	/**
	 * The '<em><b>COMPLETED STUDY</b></em>' literal value.
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
	 *     assertion that a model pertains to a completed study
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #COMPLETED_STUDY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_STUDY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Study Phase Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StudyPhaseKind[] VALUES_ARRAY =
		new StudyPhaseKind[] {
			PREPARATION_PHASE,
			DESIGN_SESSION_PHASE,
			REPORTING_PHASE,
			COMPLETED_STUDY,
		};

	/**
	 * A public read-only list of all the '<em><b>Study Phase Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StudyPhaseKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Study Phase Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyPhaseKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StudyPhaseKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Study Phase Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyPhaseKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StudyPhaseKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Study Phase Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StudyPhaseKind get(int value) {
		switch (value) {
			case PREPARATION_PHASE_VALUE: return PREPARATION_PHASE;
			case DESIGN_SESSION_PHASE_VALUE: return DESIGN_SESSION_PHASE;
			case REPORTING_PHASE_VALUE: return REPORTING_PHASE;
			case COMPLETED_STUDY_VALUE: return COMPLETED_STUDY;
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
	private StudyPhaseKind(int value, String name, String literal) {
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
	
} //StudyPhaseKind
