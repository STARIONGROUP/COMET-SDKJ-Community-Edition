/**
 */
package CDP4.SiteDirectoryData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Vcard Telephone Number Kind</b></em>',
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
 * <a id="ParameterValueKind">enumeration datatype that represents</a> the possible values for a vCard telephone number
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
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getVcardTelephoneNumberKind()
 * @model
 * @generated
 */
public enum VcardTelephoneNumberKind implements Enumerator {
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
	 *     <p>
	 * indication that a telephone number is for professional use
	 * 
	 *     </p>
	 * 
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
	 *     <p>
	 * indication that a telephone number is for private or home use
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(1, "HOME", "HOME"),

	/**
	 * The '<em><b>VOICE</b></em>' literal object.
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
	 * indication of a voice telephone number
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #VOICE_VALUE
	 * @generated
	 * @ordered
	 */
	VOICE(2, "VOICE", "VOICE"),

	/**
	 * The '<em><b>TEXT</b></em>' literal object.
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
	 * indication that the telephone number supports text messages (SMS)
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(3, "TEXT", "TEXT"),

	/**
	 * The '<em><b>FAX</b></em>' literal object.
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
	 * indication of a facsimile telephone number
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #FAX_VALUE
	 * @generated
	 * @ordered
	 */
	FAX(4, "FAX", "FAX"),

	/**
	 * The '<em><b>CELL</b></em>' literal object.
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
	 * indication of a cellular or mobile telephone number
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #CELL_VALUE
	 * @generated
	 * @ordered
	 */
	CELL(5, "CELL", "CELL"),

	/**
	 * The '<em><b>PAGER</b></em>' literal object.
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
	 * indication of a paging device telephone number
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #PAGER_VALUE
	 * @generated
	 * @ordered
	 */
	PAGER(6, "PAGER", "PAGER"),

	/**
	 * The '<em><b>TEXTPHONE</b></em>' literal object.
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
	 * indication of a telecommunication device for people with hearing or speech difficulties
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #TEXTPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTPHONE(7, "TEXTPHONE", "TEXTPHONE"),

	/**
	 * The '<em><b>VIDEO</b></em>' literal object.
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
	 * indication of a video conferencing telephone number
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO(8, "VIDEO", "VIDEO");

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
	 *     <p>
	 * indication that a telephone number is for professional use
	 * 
	 *     </p>
	 * 
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
	 *     <p>
	 * indication that a telephone number is for private or home use
	 * 
	 *     </p>
	 * 
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
	 * The '<em><b>VOICE</b></em>' literal value.
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
	 * indication of a voice telephone number
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #VOICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOICE_VALUE = 2;

	/**
	 * The '<em><b>TEXT</b></em>' literal value.
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
	 * indication that the telephone number supports text messages (SMS)
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 3;

	/**
	 * The '<em><b>FAX</b></em>' literal value.
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
	 * indication of a facsimile telephone number
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #FAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAX_VALUE = 4;

	/**
	 * The '<em><b>CELL</b></em>' literal value.
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
	 * indication of a cellular or mobile telephone number
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #CELL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CELL_VALUE = 5;

	/**
	 * The '<em><b>PAGER</b></em>' literal value.
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
	 * indication of a paging device telephone number
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #PAGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAGER_VALUE = 6;

	/**
	 * The '<em><b>TEXTPHONE</b></em>' literal value.
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
	 * indication of a telecommunication device for people with hearing or speech difficulties
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #TEXTPHONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTPHONE_VALUE = 7;

	/**
	 * The '<em><b>VIDEO</b></em>' literal value.
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
	 * indication of a video conferencing telephone number
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #VIDEO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_VALUE = 8;

	/**
	 * An array of all the '<em><b>Vcard Telephone Number Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VcardTelephoneNumberKind[] VALUES_ARRAY =
		new VcardTelephoneNumberKind[] {
			WORK,
			HOME,
			VOICE,
			TEXT,
			FAX,
			CELL,
			PAGER,
			TEXTPHONE,
			VIDEO,
		};

	/**
	 * A public read-only list of all the '<em><b>Vcard Telephone Number Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VcardTelephoneNumberKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vcard Telephone Number Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VcardTelephoneNumberKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VcardTelephoneNumberKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vcard Telephone Number Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VcardTelephoneNumberKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VcardTelephoneNumberKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vcard Telephone Number Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VcardTelephoneNumberKind get(int value) {
		switch (value) {
			case WORK_VALUE: return WORK;
			case HOME_VALUE: return HOME;
			case VOICE_VALUE: return VOICE;
			case TEXT_VALUE: return TEXT;
			case FAX_VALUE: return FAX;
			case CELL_VALUE: return CELL;
			case PAGER_VALUE: return PAGER;
			case TEXTPHONE_VALUE: return TEXTPHONE;
			case VIDEO_VALUE: return VIDEO;
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
	private VcardTelephoneNumberKind(int value, String name, String literal) {
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
	
} //VcardTelephoneNumberKind
