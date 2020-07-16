/**
 */
package CDP4.EngineeringModelData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Switch Kind</b></em>',
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
 *     <p>
 * enumeration datatype that defines the possible switch settings to select a value in a ParameterValueSet or a ParameterSubscriptionValueSet
 *     </p>
 * 
 *     <p>
 * Note:&#160;In this concurrent engineering model all parameters (see Parameter and ParameterOverride)&#160;and parameter subscriptions (see ParameterSubscription)&#160;have 3 possible values:&#160;&#160;<i>computed</i>, <i>manual</i> and <i>reference</i>, and a <i>valueSwitch</i> to select the actual value to be used for modelling purposes. The <i>computed</i> value is the value as computed by the owner (DomainOfExpertise)&#160;of a Parameter or ParameterOverride, or in case of a ParameterSubscription it is derived from the referenced <i>published</i> value (see Publication and ParameterSubscriptionValueSet). The <i>manual</i> value is a literal value set by the owner of a Parameter, ParameterOverride or ParameterSubscription. Finally, the <i>reference</i> value is another value to be used as a reference in comparisons. Such values would typically be imported from another source than the current EngineeringModel.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterSwitchKind()
 * @model
 * @generated
 */
public enum ParameterSwitchKind implements Enumerator {
	/**
	 * The '<em><b>COMPUTED</b></em>' literal object.
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
	 * assertion that the computed value of a Parameter, ParameterOverride or ParameterSubscription will be used as the actual value
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #COMPUTED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTED(0, "COMPUTED", "COMPUTED"),

	/**
	 * The '<em><b>MANUAL</b></em>' literal object.
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
	 * assertion that the manual value of a Parameter, ParameterOverride or ParameterSubscription will be used as the actual value
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL(1, "MANUAL", "MANUAL"),

	/**
	 * The '<em><b>REFERENCE</b></em>' literal object.
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
	 * assertion that the reference value of a Parameter, ParameterOverride or ParameterSubscription will be used as the actual value
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(2, "REFERENCE", "REFERENCE");

	/**
	 * The '<em><b>COMPUTED</b></em>' literal value.
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
	 * assertion that the computed value of a Parameter, ParameterOverride or ParameterSubscription will be used as the actual value
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #COMPUTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTED_VALUE = 0;

	/**
	 * The '<em><b>MANUAL</b></em>' literal value.
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
	 * assertion that the manual value of a Parameter, ParameterOverride or ParameterSubscription will be used as the actual value
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MANUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_VALUE = 1;

	/**
	 * The '<em><b>REFERENCE</b></em>' literal value.
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
	 * assertion that the reference value of a Parameter, ParameterOverride or ParameterSubscription will be used as the actual value
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Parameter Switch Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterSwitchKind[] VALUES_ARRAY =
		new ParameterSwitchKind[] {
			COMPUTED,
			MANUAL,
			REFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Switch Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParameterSwitchKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Switch Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterSwitchKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterSwitchKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Switch Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterSwitchKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterSwitchKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Switch Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParameterSwitchKind get(int value) {
		switch (value) {
			case COMPUTED_VALUE: return COMPUTED;
			case MANUAL_VALUE: return MANUAL;
			case REFERENCE_VALUE: return REFERENCE;
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
	private ParameterSwitchKind(int value, String name, String literal) {
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
	
} //ParameterSwitchKind
