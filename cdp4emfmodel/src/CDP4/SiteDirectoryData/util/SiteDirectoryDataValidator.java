/**
 */
package CDP4.SiteDirectoryData.util;

import CDP4.CommonData.util.CommonDataValidator;

import CDP4.SiteDirectoryData.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage
 * @generated
 */
public class SiteDirectoryDataValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SiteDirectoryDataValidator INSTANCE = new SiteDirectoryDataValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "CDP4.SiteDirectoryData";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Super Sub Graph Is Acyclic' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__SUPER_SUB_GRAPH_IS_ACYCLIC = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Get All Supershelperoperation' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__GET_ALL_SUPERSHELPEROPERATION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Unique Parameter Type Names' of 'Reference Data Library'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERENCE_DATA_LIBRARY__HAS_UNIQUE_PARAMETER_TYPE_NAMES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Unique Parameter Type Short Names' of 'Reference Data Library'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERENCE_DATA_LIBRARY__HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Unique Category Names' of 'Reference Data Library'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERENCE_DATA_LIBRARY__HAS_UNIQUE_CATEGORY_NAMES = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Unique Category Short Names' of 'Reference Data Library'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERENCE_DATA_LIBRARY__HAS_UNIQUE_CATEGORY_SHORT_NAMES = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid Number Of Components' of 'Array Parameter Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARRAY_PARAMETER_TYPE__HAS_VALID_NUMBER_OF_COMPONENTS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid Scale' of 'Parameter Type Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER_TYPE_COMPONENT__HAS_VALID_SCALE = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonDataValidator commonDataValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataValidator() {
		super();
		commonDataValidator = CommonDataValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SiteDirectoryDataPackage.eINSTANCE;
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
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION:
				return validateParticipantPermission((ParticipantPermission)value, diagnostics, context);
			case SiteDirectoryDataPackage.REFERENCE_SOURCE:
				return validateReferenceSource((ReferenceSource)value, diagnostics, context);
			case SiteDirectoryDataPackage.CATEGORIZABLE_THING:
				return validateCategorizableThing((CategorizableThing)value, diagnostics, context);
			case SiteDirectoryDataPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case SiteDirectoryDataPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case SiteDirectoryDataPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case SiteDirectoryDataPackage.EMAIL_ADDRESS:
				return validateEmailAddress((EmailAddress)value, diagnostics, context);
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER:
				return validateTelephoneNumber((TelephoneNumber)value, diagnostics, context);
			case SiteDirectoryDataPackage.DOMAIN_OF_EXPERTISE:
				return validateDomainOfExpertise((DomainOfExpertise)value, diagnostics, context);
			case SiteDirectoryDataPackage.PERSON_ROLE:
				return validatePersonRole((PersonRole)value, diagnostics, context);
			case SiteDirectoryDataPackage.PERSON_PERMISSION:
				return validatePersonPermission((PersonPermission)value, diagnostics, context);
			case SiteDirectoryDataPackage.USER_PREFERENCE:
				return validateUserPreference((UserPreference)value, diagnostics, context);
			case SiteDirectoryDataPackage.SITE_DIRECTORY:
				return validateSiteDirectory((SiteDirectory)value, diagnostics, context);
			case SiteDirectoryDataPackage.PARTICIPANT_ROLE:
				return validateParticipantRole((ParticipantRole)value, diagnostics, context);
			case SiteDirectoryDataPackage.SITE_REFERENCE_DATA_LIBRARY:
				return validateSiteReferenceDataLibrary((SiteReferenceDataLibrary)value, diagnostics, context);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY:
				return validateReferenceDataLibrary((ReferenceDataLibrary)value, diagnostics, context);
			case SiteDirectoryDataPackage.PARTICIPANT_AFFECTED_ACCESS_THING:
				return validateParticipantAffectedAccessThing((ParticipantAffectedAccessThing)value, diagnostics, context);
			case SiteDirectoryDataPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.QUANTITY_KIND:
				return validateQuantityKind((QuantityKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.SCALAR_PARAMETER_TYPE:
				return validateScalarParameterType((ScalarParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE:
				return validateMeasurementScale((MeasurementScale)value, diagnostics, context);
			case SiteDirectoryDataPackage.MEASUREMENT_UNIT:
				return validateMeasurementUnit((MeasurementUnit)value, diagnostics, context);
			case SiteDirectoryDataPackage.SCALE_VALUE_DEFINITION:
				return validateScaleValueDefinition((ScaleValueDefinition)value, diagnostics, context);
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE:
				return validateMappingToReferenceScale((MappingToReferenceScale)value, diagnostics, context);
			case SiteDirectoryDataPackage.UNIT_PREFIX:
				return validateUnitPrefix((UnitPrefix)value, diagnostics, context);
			case SiteDirectoryDataPackage.FILE_TYPE:
				return validateFileType((FileType)value, diagnostics, context);
			case SiteDirectoryDataPackage.GLOSSARY:
				return validateGlossary((Glossary)value, diagnostics, context);
			case SiteDirectoryDataPackage.TERM:
				return validateTerm((Term)value, diagnostics, context);
			case SiteDirectoryDataPackage.RULE:
				return validateRule((Rule)value, diagnostics, context);
			case SiteDirectoryDataPackage.CONSTANT:
				return validateConstant((Constant)value, diagnostics, context);
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP:
				return validateEngineeringModelSetup((EngineeringModelSetup)value, diagnostics, context);
			case SiteDirectoryDataPackage.PARTICIPANT:
				return validateParticipant((Participant)value, diagnostics, context);
			case SiteDirectoryDataPackage.MODEL_REFERENCE_DATA_LIBRARY:
				return validateModelReferenceDataLibrary((ModelReferenceDataLibrary)value, diagnostics, context);
			case SiteDirectoryDataPackage.ITERATION_SETUP:
				return validateIterationSetup((IterationSetup)value, diagnostics, context);
			case SiteDirectoryDataPackage.SITE_LOG_ENTRY:
				return validateSiteLogEntry((SiteLogEntry)value, diagnostics, context);
			case SiteDirectoryDataPackage.DOMAIN_OF_EXPERTISE_GROUP:
				return validateDomainOfExpertiseGroup((DomainOfExpertiseGroup)value, diagnostics, context);
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE:
				return validateNaturalLanguage((NaturalLanguage)value, diagnostics, context);
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE:
				return validateBinaryRelationshipRule((BinaryRelationshipRule)value, diagnostics, context);
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE:
				return validateArrayParameterType((ArrayParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE:
				return validateCompoundParameterType((CompoundParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT:
				return validateParameterTypeComponent((ParameterTypeComponent)value, diagnostics, context);
			case SiteDirectoryDataPackage.CYCLIC_RATIO_SCALE:
				return validateCyclicRatioScale((CyclicRatioScale)value, diagnostics, context);
			case SiteDirectoryDataPackage.RATIO_SCALE:
				return validateRatioScale((RatioScale)value, diagnostics, context);
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE:
				return validateEnumerationParameterType((EnumerationParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.ENUMERATION_VALUE_DEFINITION:
				return validateEnumerationValueDefinition((EnumerationValueDefinition)value, diagnostics, context);
			case SiteDirectoryDataPackage.ORDINAL_SCALE:
				return validateOrdinalScale((OrdinalScale)value, diagnostics, context);
			case SiteDirectoryDataPackage.REFERENCER_RULE:
				return validateReferencerRule((ReferencerRule)value, diagnostics, context);
			case SiteDirectoryDataPackage.BOOLEAN_PARAMETER_TYPE:
				return validateBooleanParameterType((BooleanParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.SCALE_REFERENCE_QUANTITY_VALUE:
				return validateScaleReferenceQuantityValue((ScaleReferenceQuantityValue)value, diagnostics, context);
			case SiteDirectoryDataPackage.DATE_PARAMETER_TYPE:
				return validateDateParameterType((DateParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.LINEAR_CONVERSION_UNIT:
				return validateLinearConversionUnit((LinearConversionUnit)value, diagnostics, context);
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT:
				return validateConversionBasedUnit((ConversionBasedUnit)value, diagnostics, context);
			case SiteDirectoryDataPackage.DERIVED_UNIT:
				return validateDerivedUnit((DerivedUnit)value, diagnostics, context);
			case SiteDirectoryDataPackage.UNIT_FACTOR:
				return validateUnitFactor((UnitFactor)value, diagnostics, context);
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR:
				return validateQuantityKindFactor((QuantityKindFactor)value, diagnostics, context);
			case SiteDirectoryDataPackage.TEXT_PARAMETER_TYPE:
				return validateTextParameterType((TextParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.INTERVAL_SCALE:
				return validateIntervalScale((IntervalScale)value, diagnostics, context);
			case SiteDirectoryDataPackage.SPECIALIZED_QUANTITY_KIND:
				return validateSpecializedQuantityKind((SpecializedQuantityKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.SIMPLE_UNIT:
				return validateSimpleUnit((SimpleUnit)value, diagnostics, context);
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE:
				return validateMultiRelationshipRule((MultiRelationshipRule)value, diagnostics, context);
			case SiteDirectoryDataPackage.SIMPLE_QUANTITY_KIND:
				return validateSimpleQuantityKind((SimpleQuantityKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.PREFIXED_UNIT:
				return validatePrefixedUnit((PrefixedUnit)value, diagnostics, context);
			case SiteDirectoryDataPackage.DATE_TIME_PARAMETER_TYPE:
				return validateDateTimeParameterType((DateTimeParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.TIME_OF_DAY_PARAMETER_TYPE:
				return validateTimeOfDayParameterType((TimeOfDayParameterType)value, diagnostics, context);
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE:
				return validateDecompositionRule((DecompositionRule)value, diagnostics, context);
			case SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND:
				return validateDerivedQuantityKind((DerivedQuantityKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE:
				return validateLogarithmicScale((LogarithmicScale)value, diagnostics, context);
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE:
				return validateParameterizedCategoryRule((ParameterizedCategoryRule)value, diagnostics, context);
			case SiteDirectoryDataPackage.VCARD_EMAIL_ADDRESS_KIND:
				return validateVcardEmailAddressKind((VcardEmailAddressKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.VCARD_TELEPHONE_NUMBER_KIND:
				return validateVcardTelephoneNumberKind((VcardTelephoneNumberKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.NUMBER_SET_KIND:
				return validateNumberSetKind((NumberSetKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_KIND:
				return validateEngineeringModelKind((EngineeringModelKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.STUDY_PHASE_KIND:
				return validateStudyPhaseKind((StudyPhaseKind)value, diagnostics, context);
			case SiteDirectoryDataPackage.LOGARITHM_BASE_KIND:
				return validateLogarithmBaseKind((LogarithmBaseKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantPermission(ParticipantPermission participantPermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantPermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceSource(ReferenceSource referenceSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(referenceSource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(referenceSource, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(referenceSource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategorizableThing(CategorizableThing categorizableThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categorizableThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(category, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(category, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_superSubGraphIsAcyclic(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_getAllSupershelperoperation(category, diagnostics, context);
		return result;
	}

	/**
	 * Validates the superSubGraphIsAcyclic constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_superSubGraphIsAcyclic(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return category.superSubGraphIsAcyclic(diagnostics, context);
	}

	/**
	 * Validates the getAllSupershelperoperation constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_getAllSupershelperoperation(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return category.getAllSupershelperoperation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddress(EmailAddress emailAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emailAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumber(TelephoneNumber telephoneNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telephoneNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainOfExpertise(DomainOfExpertise domainOfExpertise, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainOfExpertise, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(domainOfExpertise, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(domainOfExpertise, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonRole(PersonRole personRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(personRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(personRole, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(personRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonPermission(PersonPermission personPermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personPermission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserPreference(UserPreference userPreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userPreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiteDirectory(SiteDirectory siteDirectory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(siteDirectory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRole(ParticipantRole participantRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(participantRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(participantRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiteReferenceDataLibrary(SiteReferenceDataLibrary siteReferenceDataLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siteReferenceDataLibrary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueParameterTypeNames(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueParameterTypeShortNames(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueCategoryNames(siteReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueCategoryShortNames(siteReferenceDataLibrary, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceDataLibrary(ReferenceDataLibrary referenceDataLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(referenceDataLibrary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueParameterTypeNames(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueParameterTypeShortNames(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueCategoryNames(referenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueCategoryShortNames(referenceDataLibrary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasUniqueParameterTypeNames constraint of '<em>Reference Data Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceDataLibrary_hasUniqueParameterTypeNames(ReferenceDataLibrary referenceDataLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return referenceDataLibrary.hasUniqueParameterTypeNames(diagnostics, context);
	}

	/**
	 * Validates the hasUniqueParameterTypeShortNames constraint of '<em>Reference Data Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceDataLibrary_hasUniqueParameterTypeShortNames(ReferenceDataLibrary referenceDataLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return referenceDataLibrary.hasUniqueParameterTypeShortNames(diagnostics, context);
	}

	/**
	 * Validates the hasUniqueCategoryNames constraint of '<em>Reference Data Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceDataLibrary_hasUniqueCategoryNames(ReferenceDataLibrary referenceDataLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return referenceDataLibrary.hasUniqueCategoryNames(diagnostics, context);
	}

	/**
	 * Validates the hasUniqueCategoryShortNames constraint of '<em>Reference Data Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceDataLibrary_hasUniqueCategoryShortNames(ReferenceDataLibrary referenceDataLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return referenceDataLibrary.hasUniqueCategoryShortNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantAffectedAccessThing(ParticipantAffectedAccessThing participantAffectedAccessThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantAffectedAccessThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(parameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(parameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityKind(QuantityKind quantityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quantityKind, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(quantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(quantityKind, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalarParameterType(ScalarParameterType scalarParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scalarParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(scalarParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(scalarParameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementScale(MeasurementScale measurementScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measurementScale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(measurementScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(measurementScale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementUnit(MeasurementUnit measurementUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measurementUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(measurementUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(measurementUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleValueDefinition(ScaleValueDefinition scaleValueDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scaleValueDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(scaleValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(scaleValueDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingToReferenceScale(MappingToReferenceScale mappingToReferenceScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingToReferenceScale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitPrefix(UnitPrefix unitPrefix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitPrefix, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(unitPrefix, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(unitPrefix, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fileType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(fileType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(fileType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlossary(Glossary glossary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(glossary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(glossary, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(glossary, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm(Term term, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(term, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(term, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(term, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(term, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(rule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(rule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constant, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(constant, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(constant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringModelSetup(EngineeringModelSetup engineeringModelSetup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(engineeringModelSetup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(engineeringModelSetup, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(engineeringModelSetup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelReferenceDataLibrary(ModelReferenceDataLibrary modelReferenceDataLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelReferenceDataLibrary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueParameterTypeNames(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueParameterTypeShortNames(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueCategoryNames(modelReferenceDataLibrary, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceDataLibrary_hasUniqueCategoryShortNames(modelReferenceDataLibrary, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterationSetup(IterationSetup iterationSetup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iterationSetup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiteLogEntry(SiteLogEntry siteLogEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(siteLogEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainOfExpertiseGroup(DomainOfExpertiseGroup domainOfExpertiseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainOfExpertiseGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(domainOfExpertiseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(domainOfExpertiseGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaturalLanguage(NaturalLanguage naturalLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naturalLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryRelationshipRule(BinaryRelationshipRule binaryRelationshipRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(binaryRelationshipRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(binaryRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(binaryRelationshipRule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayParameterType(ArrayParameterType arrayParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arrayParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(arrayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validateArrayParameterType_hasValidNumberOfComponents(arrayParameterType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidNumberOfComponents constraint of '<em>Array Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayParameterType_hasValidNumberOfComponents(ArrayParameterType arrayParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return arrayParameterType.hasValidNumberOfComponents(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundParameterType(CompoundParameterType compoundParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compoundParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(compoundParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(compoundParameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterTypeComponent(ParameterTypeComponent parameterTypeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterTypeComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterTypeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterTypeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterTypeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterTypeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterTypeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterTypeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterTypeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterTypeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterTypeComponent_hasValidScale(parameterTypeComponent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidScale constraint of '<em>Parameter Type Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterTypeComponent_hasValidScale(ParameterTypeComponent parameterTypeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameterTypeComponent.hasValidScale(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCyclicRatioScale(CyclicRatioScale cyclicRatioScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cyclicRatioScale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(cyclicRatioScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(cyclicRatioScale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatioScale(RatioScale ratioScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ratioScale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(ratioScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(ratioScale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationParameterType(EnumerationParameterType enumerationParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(enumerationParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(enumerationParameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationValueDefinition(EnumerationValueDefinition enumerationValueDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationValueDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(enumerationValueDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(enumerationValueDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdinalScale(OrdinalScale ordinalScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ordinalScale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(ordinalScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(ordinalScale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencerRule(ReferencerRule referencerRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(referencerRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(referencerRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(referencerRule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanParameterType(BooleanParameterType booleanParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(booleanParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(booleanParameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleReferenceQuantityValue(ScaleReferenceQuantityValue scaleReferenceQuantityValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaleReferenceQuantityValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateParameterType(DateParameterType dateParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(dateParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(dateParameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearConversionUnit(LinearConversionUnit linearConversionUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linearConversionUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(linearConversionUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(linearConversionUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionBasedUnit(ConversionBasedUnit conversionBasedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conversionBasedUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(conversionBasedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(conversionBasedUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnit(DerivedUnit derivedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(derivedUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(derivedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(derivedUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitFactor(UnitFactor unitFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitFactor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityKindFactor(QuantityKindFactor quantityKindFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityKindFactor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextParameterType(TextParameterType textParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(textParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(textParameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntervalScale(IntervalScale intervalScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intervalScale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(intervalScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(intervalScale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedQuantityKind(SpecializedQuantityKind specializedQuantityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specializedQuantityKind, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(specializedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(specializedQuantityKind, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleUnit(SimpleUnit simpleUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(simpleUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(simpleUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiRelationshipRule(MultiRelationshipRule multiRelationshipRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiRelationshipRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(multiRelationshipRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(multiRelationshipRule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleQuantityKind(SimpleQuantityKind simpleQuantityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleQuantityKind, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(simpleQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(simpleQuantityKind, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixedUnit(PrefixedUnit prefixedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prefixedUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(prefixedUnit, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(prefixedUnit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeParameterType(DateTimeParameterType dateTimeParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTimeParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(dateTimeParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(dateTimeParameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeOfDayParameterType(TimeOfDayParameterType timeOfDayParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeOfDayParameterType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(timeOfDayParameterType, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(timeOfDayParameterType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecompositionRule(DecompositionRule decompositionRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(decompositionRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(decompositionRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(decompositionRule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedQuantityKind(DerivedQuantityKind derivedQuantityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(derivedQuantityKind, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(derivedQuantityKind, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(derivedQuantityKind, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogarithmicScale(LogarithmicScale logarithmicScale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(logarithmicScale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(logarithmicScale, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(logarithmicScale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterizedCategoryRule(ParameterizedCategoryRule parameterizedCategoryRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterizedCategoryRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(parameterizedCategoryRule, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(parameterizedCategoryRule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVcardEmailAddressKind(VcardEmailAddressKind vcardEmailAddressKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVcardTelephoneNumberKind(VcardTelephoneNumberKind vcardTelephoneNumberKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberSetKind(NumberSetKind numberSetKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringModelKind(EngineeringModelKind engineeringModelKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPhaseKind(StudyPhaseKind studyPhaseKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogarithmBaseKind(LogarithmBaseKind logarithmBaseKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //SiteDirectoryDataValidator
