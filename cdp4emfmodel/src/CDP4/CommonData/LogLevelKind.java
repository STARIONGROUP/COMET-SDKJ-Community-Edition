/**
 */
package CDP4.CommonData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Log Level Kind</b></em>',
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
 * enumeration datatype that defines the possible levels for a LogEntry
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 * @see CDP4.CommonData.CommonDataPackage#getLogLevelKind()
 * @model
 * @generated
 */
public enum LogLevelKind implements Enumerator {
	/**
	 * The '<em><b>TRACE</b></em>' literal object.
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
	 * designation of a trace level log entry used to mark and annotate very low level detailed event logging for software development or problem fixing purposes
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #TRACE_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE(0, "TRACE", "TRACE"),

	/**
	 * The '<em><b>DEBUG</b></em>' literal object.
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
	 * designation of a debug level log entry used to mark and annotate low level detailed event logging for software development or problem fixing purposes
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #DEBUG_VALUE
	 * @generated
	 * @ordered
	 */
	DEBUG(1, "DEBUG", "DEBUG"),

	/**
	 * The '<em><b>INFO</b></em>' literal object.
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
	 * designation of an information level log entry used to mark and annotate event logging for information
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Information level LogEntry instances are typically produced automatically by executing applications.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #INFO_VALUE
	 * @generated
	 * @ordered
	 */
	INFO(2, "INFO", "INFO"),

	/**
	 * The '<em><b>USER</b></em>' literal object.
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
	 * designation of a user level log entry used to mark and annotate event logging with user defined content
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;User level LogEntry instances are typically produced on demand by a human user and its <i>content</i> is typically manually written. Its use is similar to the log message used upon commit or check-in in a configuration control system.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #USER_VALUE
	 * @generated
	 * @ordered
	 */
	USER(3, "USER", "USER");

	/**
	 * The '<em><b>TRACE</b></em>' literal value.
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
	 * designation of a trace level log entry used to mark and annotate very low level detailed event logging for software development or problem fixing purposes
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #TRACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_VALUE = 0;

	/**
	 * The '<em><b>DEBUG</b></em>' literal value.
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
	 * designation of a debug level log entry used to mark and annotate low level detailed event logging for software development or problem fixing purposes
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #DEBUG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEBUG_VALUE = 1;

	/**
	 * The '<em><b>INFO</b></em>' literal value.
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
	 * designation of an information level log entry used to mark and annotate event logging for information
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Information level LogEntry instances are typically produced automatically by executing applications.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #INFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFO_VALUE = 2;

	/**
	 * The '<em><b>USER</b></em>' literal value.
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
	 * designation of a user level log entry used to mark and annotate event logging with user defined content
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;User level LogEntry instances are typically produced on demand by a human user and its <i>content</i> is typically manually written. Its use is similar to the log message used upon commit or check-in in a configuration control system.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @see #USER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Log Level Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LogLevelKind[] VALUES_ARRAY =
		new LogLevelKind[] {
			TRACE,
			DEBUG,
			INFO,
			USER,
		};

	/**
	 * A public read-only list of all the '<em><b>Log Level Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LogLevelKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Log Level Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogLevelKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogLevelKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Log Level Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogLevelKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogLevelKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Log Level Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogLevelKind get(int value) {
		switch (value) {
			case TRACE_VALUE: return TRACE;
			case DEBUG_VALUE: return DEBUG;
			case INFO_VALUE: return INFO;
			case USER_VALUE: return USER;
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
	private LogLevelKind(int value, String name, String literal) {
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
	
} //LogLevelKind
