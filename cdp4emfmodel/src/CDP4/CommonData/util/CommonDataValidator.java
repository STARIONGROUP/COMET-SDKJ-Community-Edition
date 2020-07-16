/**
 */
package CDP4.CommonData.util;

import CDP4.CommonData.*;

import java.time.OffsetDateTime;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see CDP4.CommonData.CommonDataPackage
 * @generated
 */
public class CommonDataValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonDataValidator INSTANCE = new CommonDataValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "CDP4.CommonData";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has One Definition Per Language' of 'Defined Thing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEFINED_THING__HAS_ONE_DEFINITION_PER_LANGUAGE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has One Definition Per Language1' of 'Defined Thing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEFINED_THING__HAS_ONE_DEFINITION_PER_LANGUAGE1 = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonDataValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CommonDataPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CommonDataPackage.FILE_CONTENT_TYPE:
				return validateFileContentType((FileContentType)value, diagnostics, context);
			case CommonDataPackage.DEFINED_THING:
				return validateDefinedThing((DefinedThing)value, diagnostics, context);
			case CommonDataPackage.NAMED_THING:
				return validateNamedThing((NamedThing)value, diagnostics, context);
			case CommonDataPackage.SHORT_NAMED_THING:
				return validateShortNamedThing((ShortNamedThing)value, diagnostics, context);
			case CommonDataPackage.ALIAS:
				return validateAlias((Alias)value, diagnostics, context);
			case CommonDataPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case CommonDataPackage.DEFINITION:
				return validateDefinition((Definition)value, diagnostics, context);
			case CommonDataPackage.CITATION:
				return validateCitation((Citation)value, diagnostics, context);
			case CommonDataPackage.DEPRECATABLE_THING:
				return validateDeprecatableThing((DeprecatableThing)value, diagnostics, context);
			case CommonDataPackage.HYPER_LINK:
				return validateHyperLink((HyperLink)value, diagnostics, context);
			case CommonDataPackage.TIME_STAMPED_THING:
				return validateTimeStampedThing((TimeStampedThing)value, diagnostics, context);
			case CommonDataPackage.TOP_CONTAINER:
				return validateTopContainer((TopContainer)value, diagnostics, context);
			case CommonDataPackage.LOG_ENTRY:
				return validateLogEntry((LogEntry)value, diagnostics, context);
			case CommonDataPackage.VOLATILE_THING:
				return validateVolatileThing((VolatileThing)value, diagnostics, context);
			case CommonDataPackage.THING:
				return validateThing((Thing)value, diagnostics, context);
			case CommonDataPackage.PERSON_ACCESS_RIGHT_KIND:
				return validatePersonAccessRightKind((PersonAccessRightKind)value, diagnostics, context);
			case CommonDataPackage.LOG_LEVEL_KIND:
				return validateLogLevelKind((LogLevelKind)value, diagnostics, context);
			case CommonDataPackage.PARTICIPANT_ACCESS_RIGHT_KIND:
				return validateParticipantAccessRightKind((ParticipantAccessRightKind)value, diagnostics, context);
			case CommonDataPackage.DATE:
				return validateDate((OffsetDateTime)value, diagnostics, context);
			case CommonDataPackage.STRING:
				return validateString((String)value, diagnostics, context);
			case CommonDataPackage.URI:
				return validateUri((String)value, diagnostics, context);
			case CommonDataPackage.LANGUAGE_CODE:
				return validateLanguageCode((String)value, diagnostics, context);
			case CommonDataPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			case CommonDataPackage.CLASS_KIND:
				return validateClassKind((String)value, diagnostics, context);
			case CommonDataPackage.INTEGER:
				return validateInteger((Integer)value, diagnostics, context);
			case CommonDataPackage.FLOAT:
				return validateFloat((Float)value, diagnostics, context);
			case CommonDataPackage.TIME_OF_DAY:
				return validateTimeOfDay((String)value, diagnostics, context);
			case CommonDataPackage.DATE_TIME:
				return validateDateTime((OffsetDateTime)value, diagnostics, context);
			case CommonDataPackage.UUID:
				return validateUuid((String)value, diagnostics, context);
			case CommonDataPackage.PARAMETER_FORMULA_TYPE:
				return validateParameterFormulaType((String)value, diagnostics, context);
			case CommonDataPackage.PARAMETER_VALUE_TYPE:
				return validateParameterValueType((String)value, diagnostics, context);
			case CommonDataPackage.SHA1_HASH_TYPE:
				return validateSha1HashType((String)value, diagnostics, context);
			case CommonDataPackage.LONG_INTEGER:
				return validateLongInteger((Long)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileContentType(FileContentType fileContentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileContentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedThing(DefinedThing definedThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(definedThing, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validateDefinedThing_hasOneDefinitionPerLanguage(definedThing, diagnostics, context);
		if (result || diagnostics != null) result &= validateDefinedThing_hasOneDefinitionPerLanguage1(definedThing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasOneDefinitionPerLanguage constraint of '<em>Defined Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedThing_hasOneDefinitionPerLanguage(DefinedThing definedThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return definedThing.hasOneDefinitionPerLanguage(diagnostics, context);
	}

	/**
	 * Validates the hasOneDefinitionPerLanguage1 constraint of '<em>Defined Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedThing_hasOneDefinitionPerLanguage1(DefinedThing definedThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return definedThing.hasOneDefinitionPerLanguage1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedThing(NamedThing namedThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortNamedThing(ShortNamedThing shortNamedThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shortNamedThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlias(Alias alias, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alias, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinition(Definition definition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitation(Citation citation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeprecatableThing(DeprecatableThing deprecatableThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deprecatableThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperLink(HyperLink hyperLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hyperLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStampedThing(TimeStampedThing timeStampedThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeStampedThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopContainer(TopContainer topContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogEntry(LogEntry logEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolatileThing(VolatileThing volatileThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(volatileThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThing(Thing thing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonAccessRightKind(PersonAccessRightKind personAccessRightKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogLevelKind(LogLevelKind logLevelKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantAccessRightKind(ParticipantAccessRightKind participantAccessRightKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(OffsetDateTime date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCode(String languageCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassKind(String classKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeOfDay(String timeOfDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(OffsetDateTime dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid(String uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterFormulaType(String parameterFormulaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValueType(String parameterValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSha1HashType(String sha1HashType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongInteger(Long longInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CommonDataValidator
