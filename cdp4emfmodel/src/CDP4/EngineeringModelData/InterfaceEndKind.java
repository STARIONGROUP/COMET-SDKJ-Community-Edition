/**
 */
package CDP4.EngineeringModelData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interface End Kind</b></em>',
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
 * enumeration datatype that asserts whether an ElementUsage is an interface end, and if so, what kind of role the interface end fulfills
 *     </p>
 * 
 *     <p>
 * Note:&#160;An <i>interface end</i> is one side of an interface. A complete interface consists of at least two interface ends and a connection between them.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getInterfaceEndKind()
 * @model
 * @generated
 */
public enum InterfaceEndKind implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
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
	 * not an interface end
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>UNDIRECTED</b></em>' literal object.
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
	 *       general undirected interface end
	 *     </p>
	 * 
	 *     <p>
	 *       Example:&#160;For example a mechanical mounting plate.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #UNDIRECTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDIRECTED(1, "UNDIRECTED", "UNDIRECTED"),

	/**
	 * The '<em><b>INPUT</b></em>' literal object.
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
	 * interface end that acts as an input for its <i>containingElement</i> ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;For example a power inlet socket.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(2, "INPUT", "INPUT"),

	/**
	 * The '<em><b>OUTPUT</b></em>' literal object.
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
	 * interface end that acts as an output for its <i>containingElement</i> ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;For example a signal output connector on a sensor.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT(3, "OUTPUT", "OUTPUT"),

	/**
	 * The '<em><b>IN OUT</b></em>' literal object.
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
	 * interface end that acts both as an input and an output for its <i>containingElement</i> ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;For example an Ethernet port on an electronic device.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #IN_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	IN_OUT(4, "IN_OUT", "IN_OUT");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
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
	 * not an interface end
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>UNDIRECTED</b></em>' literal value.
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
	 *       general undirected interface end
	 *     </p>
	 * 
	 *     <p>
	 *       Example:&#160;For example a mechanical mounting plate.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #UNDIRECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDIRECTED_VALUE = 1;

	/**
	 * The '<em><b>INPUT</b></em>' literal value.
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
	 * interface end that acts as an input for its <i>containingElement</i> ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;For example a power inlet socket.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #INPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 2;

	/**
	 * The '<em><b>OUTPUT</b></em>' literal value.
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
	 * interface end that acts as an output for its <i>containingElement</i> ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;For example a signal output connector on a sensor.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #OUTPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_VALUE = 3;

	/**
	 * The '<em><b>IN OUT</b></em>' literal value.
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
	 * interface end that acts both as an input and an output for its <i>containingElement</i> ElementDefinition
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;For example an Ethernet port on an electronic device.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #IN_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_OUT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Interface End Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterfaceEndKind[] VALUES_ARRAY =
		new InterfaceEndKind[] {
			NONE,
			UNDIRECTED,
			INPUT,
			OUTPUT,
			IN_OUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Interface End Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterfaceEndKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interface End Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceEndKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceEndKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface End Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceEndKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceEndKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface End Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceEndKind get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case UNDIRECTED_VALUE: return UNDIRECTED;
			case INPUT_VALUE: return INPUT;
			case OUTPUT_VALUE: return OUTPUT;
			case IN_OUT_VALUE: return IN_OUT;
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
	private InterfaceEndKind(int value, String name, String literal) {
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
	
} //InterfaceEndKind
