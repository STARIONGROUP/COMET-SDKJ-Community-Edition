/**
 */
package CDP4.SiteDirectoryData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Vcard Email Address Kind</b></em>',
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
 * <a id="ParameterValueKind">enumeration datatype that represents</a> the possible values for a vCard e-mail address
 *     </p>
 * 
 *     <p>
 * Note:&#160;The values are defined in the vCard format specification in <a href="http://datatracker.ietf.org/doc/rfc6350/?include_text=1">IETF RFC 6350</a>.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getVcardEmailAddressKind()
 * @model
 * @generated
 */
public enum VcardEmailAddressKind implements Enumerator {
	/**
	 * The '<em><b>WORK</b></em>' literal object.
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
	 * indication that an e-mail address is for professional use
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #WORK_VALUE
	 * @generated
	 * @ordered
	 */
	WORK(0, "WORK", "WORK"),

	/**
	 * The '<em><b>HOME</b></em>' literal object.
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
	 * indication that an e-mail address is for private or home use
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(1, "HOME", "HOME");

	/**
	 * The '<em><b>WORK</b></em>' literal value.
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
	 * indication that an e-mail address is for professional use
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #WORK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORK_VALUE = 0;

	/**
	 * The '<em><b>HOME</b></em>' literal value.
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
	 * indication that an e-mail address is for private or home use
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #HOME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Vcard Email Address Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VcardEmailAddressKind[] VALUES_ARRAY =
		new VcardEmailAddressKind[] {
			WORK,
			HOME,
		};

	/**
	 * A public read-only list of all the '<em><b>Vcard Email Address Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VcardEmailAddressKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vcard Email Address Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VcardEmailAddressKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VcardEmailAddressKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vcard Email Address Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VcardEmailAddressKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VcardEmailAddressKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vcard Email Address Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VcardEmailAddressKind get(int value) {
		switch (value) {
			case WORK_VALUE: return WORK;
			case HOME_VALUE: return HOME;
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
	private VcardEmailAddressKind(int value, String name, String literal) {
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
	
} //VcardEmailAddressKind
