/**
 */
package CDP4.CommonData.util;

import CDP4.CommonData.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CDP4.CommonData.CommonDataPackage
 * @generated
 */
public class CommonDataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonDataSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonDataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommonDataPackage.FILE_CONTENT_TYPE: {
				FileContentType fileContentType = (FileContentType)theEObject;
				T result = caseFileContentType(fileContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.DEFINED_THING: {
				DefinedThing definedThing = (DefinedThing)theEObject;
				T result = caseDefinedThing(definedThing);
				if (result == null) result = caseThing(definedThing);
				if (result == null) result = caseNamedThing(definedThing);
				if (result == null) result = caseShortNamedThing(definedThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.NAMED_THING: {
				NamedThing namedThing = (NamedThing)theEObject;
				T result = caseNamedThing(namedThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.SHORT_NAMED_THING: {
				ShortNamedThing shortNamedThing = (ShortNamedThing)theEObject;
				T result = caseShortNamedThing(shortNamedThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.ALIAS: {
				Alias alias = (Alias)theEObject;
				T result = caseAlias(alias);
				if (result == null) result = caseThing(alias);
				if (result == null) result = caseAnnotation(alias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseThing(definition);
				if (result == null) result = caseAnnotation(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.CITATION: {
				Citation citation = (Citation)theEObject;
				T result = caseCitation(citation);
				if (result == null) result = caseThing(citation);
				if (result == null) result = caseShortNamedThing(citation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.DEPRECATABLE_THING: {
				DeprecatableThing deprecatableThing = (DeprecatableThing)theEObject;
				T result = caseDeprecatableThing(deprecatableThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.HYPER_LINK: {
				HyperLink hyperLink = (HyperLink)theEObject;
				T result = caseHyperLink(hyperLink);
				if (result == null) result = caseThing(hyperLink);
				if (result == null) result = caseAnnotation(hyperLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.TIME_STAMPED_THING: {
				TimeStampedThing timeStampedThing = (TimeStampedThing)theEObject;
				T result = caseTimeStampedThing(timeStampedThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.TOP_CONTAINER: {
				TopContainer topContainer = (TopContainer)theEObject;
				T result = caseTopContainer(topContainer);
				if (result == null) result = caseThing(topContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.LOG_ENTRY: {
				LogEntry logEntry = (LogEntry)theEObject;
				T result = caseLogEntry(logEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.VOLATILE_THING: {
				VolatileThing volatileThing = (VolatileThing)theEObject;
				T result = caseVolatileThing(volatileThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonDataPackage.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileContentType(FileContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedThing(DefinedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedThing(NamedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Named Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Named Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortNamedThing(ShortNamedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlias(Alias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitation(Citation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deprecatable Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deprecatable Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeprecatableThing(DeprecatableThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyper Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyper Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperLink(HyperLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamped Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamped Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStampedThing(TimeStampedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopContainer(TopContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogEntry(LogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volatile Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volatile Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolatileThing(VolatileThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CommonDataSwitch
