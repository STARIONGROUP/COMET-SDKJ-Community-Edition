/**
 */
package CDP4.SiteDirectoryData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Number Set Kind</b></em>',
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
 *     enumeration datatype that specifies a mathematical number set
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getNumberSetKind()
 * @model
 * @generated
 */
public enum NumberSetKind implements Enumerator {
	/**
	 * The '<em><b>NATURAL NUMBER SET</b></em>' literal object.
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
	 *     designation of the mathematical set of natural numbers including zero, 
	 *     i.e. 0, 1, 2, 3, 4, ...
	 * 
	 *     <p>
	 *       Note: In mathematics the set of natural numbers is denoted by ?, see 
	 *       also <a href="http://mathworld.wolfram.com/NaturalNumber.html">http://mathworld.wolfram.com/NaturalNumber.html</a>.The 
	 *       set of natural numbers is a subset of the set of integer numbers.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #NATURAL_NUMBER_SET_VALUE
	 * @generated
	 * @ordered
	 */
	NATURAL_NUMBER_SET(0, "NATURAL_NUMBER_SET", "NATURAL_NUMBER_SET"),

	/**
	 * The '<em><b>INTEGER NUMBER SET</b></em>' literal object.
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
	 *       designation of the mathematical set of integer numbers, i.e. ..., -2, 
	 *       -1, 0, 1, 2, ...
	 *     </p>
	 * 
	 *     <p>
	 *       Note: In mathematics the set of integer numbers is denoted by ?, see 
	 *       also <a href="http://mathworld.wolfram.com/Integer.html">http://mathworld.wolfram.com/Integer.html</a>. 
	 *       The set of integer numbers is a subset of the set of rational numbers.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #INTEGER_NUMBER_SET_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_NUMBER_SET(1, "INTEGER_NUMBER_SET", "INTEGER_NUMBER_SET"),

	/**
	 * The '<em><b>RATIONAL NUMBER SET</b></em>' literal object.
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
	 *       designation of the mathematical set of rational numbers, i.e. numbers 
	 *       that can be expressed as a ratio (with a non-zero denominator)
	 *     </p>
	 * 
	 *     <p>
	 *       Note: In mathematics the set of rational numbers is denoted by ?, see 
	 *       also <a href="http://mathworld.wolfram.com/RationalNumber.html">http://mathworld.wolfram.com/RationalNumber.html</a>. 
	 *       The set of rational numbers is a subset of the set of real numbers.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #RATIONAL_NUMBER_SET_VALUE
	 * @generated
	 * @ordered
	 */
	RATIONAL_NUMBER_SET(2, "RATIONAL_NUMBER_SET", "RATIONAL_NUMBER_SET"),

	/**
	 * The '<em><b>REAL NUMBER SET</b></em>' literal object.
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
	 *       designation of the mathematical set of real numbers, i.e. the union of 
	 *       rational and irrational numbers
	 *     </p>
	 * 
	 *     <p>
	 *       Note: In mathematics the set of real numbers is denoted by ?, see also <a href="http://mathworld.wolfram.com/RealNumber.html">http://mathworld.wolfram.com/RealNumber.html</a>.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #REAL_NUMBER_SET_VALUE
	 * @generated
	 * @ordered
	 */
	REAL_NUMBER_SET(3, "REAL_NUMBER_SET", "REAL_NUMBER_SET");

	/**
	 * The '<em><b>NATURAL NUMBER SET</b></em>' literal value.
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
	 *     designation of the mathematical set of natural numbers including zero, 
	 *     i.e. 0, 1, 2, 3, 4, ...
	 * 
	 *     <p>
	 *       Note: In mathematics the set of natural numbers is denoted by ?, see 
	 *       also <a href="http://mathworld.wolfram.com/NaturalNumber.html">http://mathworld.wolfram.com/NaturalNumber.html</a>.The 
	 *       set of natural numbers is a subset of the set of integer numbers.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #NATURAL_NUMBER_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATURAL_NUMBER_SET_VALUE = 0;

	/**
	 * The '<em><b>INTEGER NUMBER SET</b></em>' literal value.
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
	 *       designation of the mathematical set of integer numbers, i.e. ..., -2, 
	 *       -1, 0, 1, 2, ...
	 *     </p>
	 * 
	 *     <p>
	 *       Note: In mathematics the set of integer numbers is denoted by ?, see 
	 *       also <a href="http://mathworld.wolfram.com/Integer.html">http://mathworld.wolfram.com/Integer.html</a>. 
	 *       The set of integer numbers is a subset of the set of rational numbers.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #INTEGER_NUMBER_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_NUMBER_SET_VALUE = 1;

	/**
	 * The '<em><b>RATIONAL NUMBER SET</b></em>' literal value.
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
	 *       designation of the mathematical set of rational numbers, i.e. numbers 
	 *       that can be expressed as a ratio (with a non-zero denominator)
	 *     </p>
	 * 
	 *     <p>
	 *       Note: In mathematics the set of rational numbers is denoted by ?, see 
	 *       also <a href="http://mathworld.wolfram.com/RationalNumber.html">http://mathworld.wolfram.com/RationalNumber.html</a>. 
	 *       The set of rational numbers is a subset of the set of real numbers.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #RATIONAL_NUMBER_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RATIONAL_NUMBER_SET_VALUE = 2;

	/**
	 * The '<em><b>REAL NUMBER SET</b></em>' literal value.
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
	 *       designation of the mathematical set of real numbers, i.e. the union of 
	 *       rational and irrational numbers
	 *     </p>
	 * 
	 *     <p>
	 *       Note: In mathematics the set of real numbers is denoted by ?, see also <a href="http://mathworld.wolfram.com/RealNumber.html">http://mathworld.wolfram.com/RealNumber.html</a>.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @see #REAL_NUMBER_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_NUMBER_SET_VALUE = 3;

	/**
	 * An array of all the '<em><b>Number Set Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NumberSetKind[] VALUES_ARRAY =
		new NumberSetKind[] {
			NATURAL_NUMBER_SET,
			INTEGER_NUMBER_SET,
			RATIONAL_NUMBER_SET,
			REAL_NUMBER_SET,
		};

	/**
	 * A public read-only list of all the '<em><b>Number Set Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NumberSetKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Number Set Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumberSetKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumberSetKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Number Set Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumberSetKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumberSetKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Number Set Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumberSetKind get(int value) {
		switch (value) {
			case NATURAL_NUMBER_SET_VALUE: return NATURAL_NUMBER_SET;
			case INTEGER_NUMBER_SET_VALUE: return INTEGER_NUMBER_SET;
			case RATIONAL_NUMBER_SET_VALUE: return RATIONAL_NUMBER_SET;
			case REAL_NUMBER_SET_VALUE: return REAL_NUMBER_SET;
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
	private NumberSetKind(int value, String name, String literal) {
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
	
} //NumberSetKind
