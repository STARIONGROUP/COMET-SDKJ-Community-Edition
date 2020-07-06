/**
 */
package CDP4.CommonData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Person Access Right Kind</b></em>',
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
 * enumeration datatype that defines the possible access rights for a class of objects in a PersonPermission
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;The relevant class of objects is specified in the <i>objectClass</i> property of a PersonPermission.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;PersonAccessRightKind.MODIFY implies read, create and update actions, and if delete is allowed, deleted actions as well.
 *     </p>
 * 
 *     <p>
 * Note 3:&#160;PersonAccessRightKind.MODIFY&#160;access to an object also implies the right to modify the container collection that contains the object, even if the access right to the container collection object is limited to PersonAccessRightKind.READ.
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 * @see CDP4.CommonData.CommonDataPackage#getPersonAccessRightKind()
 * @model
 * @generated
 */
public enum PersonAccessRightKind implements Enumerator {
	/**
	 * The '<em><b>NOT APPLICABLE</b></em>' literal object.
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
	 * assertion that Person access to the given class of objects is not applicable
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(0, "NOT_APPLICABLE", "NOT_APPLICABLE"),

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
	 *     <p>
	 * no access
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "NONE", "NONE"),

	/**
	 * The '<em><b>SAME AS CONTAINER</b></em>' literal object.
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
	 * access right to a given class of objects&#160;is the same as that of the class of its container object
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #SAME_AS_CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	SAME_AS_CONTAINER(2, "SAME_AS_CONTAINER", "SAME_AS_CONTAINER"),

	/**
	 * The '<em><b>SAME AS SUPERCLASS</b></em>' literal object.
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
	 * access right to a given class of objects is the same as that of its superclass
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #SAME_AS_SUPERCLASS_VALUE
	 * @generated
	 * @ordered
	 */
	SAME_AS_SUPERCLASS(3, "SAME_AS_SUPERCLASS", "SAME_AS_SUPERCLASS"),

	/**
	 * The '<em><b>READ</b></em>' literal object.
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
	 * read-only access
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(4, "READ", "READ"),

	/**
	 * The '<em><b>MODIFY</b></em>' literal object.
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
	 * modify access
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MODIFY_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFY(5, "MODIFY", "MODIFY"),

	/**
	 * The '<em><b>READ IF PARTICIPANT</b></em>' literal object.
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
	 * read-only access to information contained in EngineeringModelSetups where the authenticated Person is a Participant
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;If an authenticated Person has PersonAccessRightKind.MODIFY_OWN_PERSON to the ClassKind.Person, then READ_IF_PARTICIPANT also implies READ access on any Person that is associated with any Participant in any of the EngineeringModelSetups in which the authenticated Person is a Participant. In other words, READ&#160;access to the union of Persons referenced by Participants in the union of EngineeringModelSetups for which the authenticated Person has at least READ_IF_PARTICIPANT&#160;access. Basically this means that a Participant has access to the information describing the other Participants and Persons in a team that he or she is a member of.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #READ_IF_PARTICIPANT_VALUE
	 * @generated
	 * @ordered
	 */
	READ_IF_PARTICIPANT(6, "READ_IF_PARTICIPANT", "READ_IF_PARTICIPANT"),

	/**
	 * The '<em><b>MODIFY IF PARTICIPANT</b></em>' literal object.
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
	 * modify access to information contained in EngineeringModelSetups where the authenticated Person is a Participant
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MODIFY_IF_PARTICIPANT_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFY_IF_PARTICIPANT(7, "MODIFY_IF_PARTICIPANT", "MODIFY_IF_PARTICIPANT"),

	/**
	 * The '<em><b>MODIFY OWN PERSON</b></em>' literal object.
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
	 * modify access to the Person data of the actual authenticated person (i.e. user)&#160;in a session
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MODIFY_OWN_PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFY_OWN_PERSON(8, "MODIFY_OWN_PERSON", "MODIFY_OWN_PERSON");

	/**
	 * The '<em><b>NOT APPLICABLE</b></em>' literal value.
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
	 * assertion that Person access to the given class of objects is not applicable
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #NOT_APPLICABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_APPLICABLE_VALUE = 0;

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
	 *     <p>
	 * no access
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

	/**
	 * The '<em><b>SAME AS CONTAINER</b></em>' literal value.
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
	 * access right to a given class of objects&#160;is the same as that of the class of its container object
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #SAME_AS_CONTAINER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAME_AS_CONTAINER_VALUE = 2;

	/**
	 * The '<em><b>SAME AS SUPERCLASS</b></em>' literal value.
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
	 * access right to a given class of objects is the same as that of its superclass
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #SAME_AS_SUPERCLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAME_AS_SUPERCLASS_VALUE = 3;

	/**
	 * The '<em><b>READ</b></em>' literal value.
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
	 * read-only access
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 4;

	/**
	 * The '<em><b>MODIFY</b></em>' literal value.
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
	 * modify access
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MODIFY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFY_VALUE = 5;

	/**
	 * The '<em><b>READ IF PARTICIPANT</b></em>' literal value.
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
	 * read-only access to information contained in EngineeringModelSetups where the authenticated Person is a Participant
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;If an authenticated Person has PersonAccessRightKind.MODIFY_OWN_PERSON to the ClassKind.Person, then READ_IF_PARTICIPANT also implies READ access on any Person that is associated with any Participant in any of the EngineeringModelSetups in which the authenticated Person is a Participant. In other words, READ&#160;access to the union of Persons referenced by Participants in the union of EngineeringModelSetups for which the authenticated Person has at least READ_IF_PARTICIPANT&#160;access. Basically this means that a Participant has access to the information describing the other Participants and Persons in a team that he or she is a member of.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #READ_IF_PARTICIPANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_IF_PARTICIPANT_VALUE = 6;

	/**
	 * The '<em><b>MODIFY IF PARTICIPANT</b></em>' literal value.
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
	 * modify access to information contained in EngineeringModelSetups where the authenticated Person is a Participant
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MODIFY_IF_PARTICIPANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFY_IF_PARTICIPANT_VALUE = 7;

	/**
	 * The '<em><b>MODIFY OWN PERSON</b></em>' literal value.
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
	 * modify access to the Person data of the actual authenticated person (i.e. user)&#160;in a session
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #MODIFY_OWN_PERSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFY_OWN_PERSON_VALUE = 8;

	/**
	 * An array of all the '<em><b>Person Access Right Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PersonAccessRightKind[] VALUES_ARRAY =
		new PersonAccessRightKind[] {
			NOT_APPLICABLE,
			NONE,
			SAME_AS_CONTAINER,
			SAME_AS_SUPERCLASS,
			READ,
			MODIFY,
			READ_IF_PARTICIPANT,
			MODIFY_IF_PARTICIPANT,
			MODIFY_OWN_PERSON,
		};

	/**
	 * A public read-only list of all the '<em><b>Person Access Right Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PersonAccessRightKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Person Access Right Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonAccessRightKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonAccessRightKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Person Access Right Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonAccessRightKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersonAccessRightKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Person Access Right Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PersonAccessRightKind get(int value) {
		switch (value) {
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
			case NONE_VALUE: return NONE;
			case SAME_AS_CONTAINER_VALUE: return SAME_AS_CONTAINER;
			case SAME_AS_SUPERCLASS_VALUE: return SAME_AS_SUPERCLASS;
			case READ_VALUE: return READ;
			case MODIFY_VALUE: return MODIFY;
			case READ_IF_PARTICIPANT_VALUE: return READ_IF_PARTICIPANT;
			case MODIFY_IF_PARTICIPANT_VALUE: return MODIFY_IF_PARTICIPANT;
			case MODIFY_OWN_PERSON_VALUE: return MODIFY_OWN_PERSON;
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
	private PersonAccessRightKind(int value, String name, String literal) {
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
	
} //PersonAccessRightKind
