/**
 */
package CDP4.EngineeringModelData.util;

import CDP4.CommonData.util.CommonDataValidator;

import CDP4.EngineeringModelData.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage
 * @generated
 */
public class EngineeringModelDataValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EngineeringModelDataValidator INSTANCE = new EngineeringModelDataValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "CDP4.EngineeringModelData";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid Scale' of 'Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARAMETER__HAS_VALID_SCALE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Unique Parameter Names' of 'Element Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT_DEFINITION__HAS_UNIQUE_PARAMETER_NAMES = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Unique Parameter Short Names' of 'Element Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT_DEFINITION__HAS_UNIQUE_PARAMETER_SHORT_NAMES = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

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
	public EngineeringModelDataValidator() {
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
	  return EngineeringModelDataPackage.eINSTANCE;
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
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE:
				return validatePossibleFiniteState((PossibleFiniteState)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_OR_OVERRIDE_BASE:
				return validateParameterOrOverrideBase((ParameterOrOverrideBase)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_BASE:
				return validateParameterBase((ParameterBase)value, diagnostics, context);
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST:
				return validateActualFiniteStateList((ActualFiniteStateList)value, diagnostics, context);
			case EngineeringModelDataPackage.OPTION_DEPENDENT_THING:
				return validateOptionDependentThing((OptionDependentThing)value, diagnostics, context);
			case EngineeringModelDataPackage.OPTION:
				return validateOption((Option)value, diagnostics, context);
			case EngineeringModelDataPackage.NESTED_ELEMENT:
				return validateNestedElement((NestedElement)value, diagnostics, context);
			case EngineeringModelDataPackage.ELEMENT_DEFINITION:
				return validateElementDefinition((ElementDefinition)value, diagnostics, context);
			case EngineeringModelDataPackage.ELEMENT_BASE:
				return validateElementBase((ElementBase)value, diagnostics, context);
			case EngineeringModelDataPackage.ELEMENT_USAGE:
				return validateElementUsage((ElementUsage)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE:
				return validateParameterOverride((ParameterOverride)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_GROUP:
				return validateParameterGroup((ParameterGroup)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET:
				return validateParameterOverrideValueSet((ParameterOverrideValueSet)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE:
				return validateParameterValueSetBase((ParameterValueSetBase)value, diagnostics, context);
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE:
				return validateActualFiniteState((ActualFiniteState)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET:
				return validateParameterValueSet((ParameterValueSet)value, diagnostics, context);
			case EngineeringModelDataPackage.NESTED_PARAMETER:
				return validateNestedParameter((NestedParameter)value, diagnostics, context);
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST:
				return validatePossibleFiniteStateList((PossibleFiniteStateList)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_SUBSCRIPTION:
				return validateParameterSubscription((ParameterSubscription)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_SUBSCRIPTION_VALUE_SET:
				return validateParameterSubscriptionValueSet((ParameterSubscriptionValueSet)value, diagnostics, context);
			case EngineeringModelDataPackage.FILE_STORE:
				return validateFileStore((FileStore)value, diagnostics, context);
			case EngineeringModelDataPackage.FOLDER:
				return validateFolder((Folder)value, diagnostics, context);
			case EngineeringModelDataPackage.FILE:
				return validateFile((File)value, diagnostics, context);
			case EngineeringModelDataPackage.FILE_REVISION:
				return validateFileRevision((FileRevision)value, diagnostics, context);
			case EngineeringModelDataPackage.PUBLICATION:
				return validatePublication((Publication)value, diagnostics, context);
			case EngineeringModelDataPackage.ENGINEERING_MODEL:
				return validateEngineeringModel((EngineeringModel)value, diagnostics, context);
			case EngineeringModelDataPackage.COMMON_FILE_STORE:
				return validateCommonFileStore((CommonFileStore)value, diagnostics, context);
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY:
				return validateModelLogEntry((ModelLogEntry)value, diagnostics, context);
			case EngineeringModelDataPackage.ITERATION:
				return validateIteration((Iteration)value, diagnostics, context);
			case EngineeringModelDataPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case EngineeringModelDataPackage.RELATIONSHIP_PARAMETER_VALUE:
				return validateRelationshipParameterValue((RelationshipParameterValue)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_VALUE:
				return validateParameterValue((ParameterValue)value, diagnostics, context);
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP:
				return validateExternalIdentifierMap((ExternalIdentifierMap)value, diagnostics, context);
			case EngineeringModelDataPackage.ID_CORRESPONDENCE:
				return validateIdCorrespondence((IdCorrespondence)value, diagnostics, context);
			case EngineeringModelDataPackage.REQUIREMENTS_SPECIFICATION:
				return validateRequirementsSpecification((RequirementsSpecification)value, diagnostics, context);
			case EngineeringModelDataPackage.REQUIREMENTS_CONTAINER:
				return validateRequirementsContainer((RequirementsContainer)value, diagnostics, context);
			case EngineeringModelDataPackage.REQUIREMENTS_GROUP:
				return validateRequirementsGroup((RequirementsGroup)value, diagnostics, context);
			case EngineeringModelDataPackage.REQUIREMENTS_CONTAINER_PARAMETER_VALUE:
				return validateRequirementsContainerParameterValue((RequirementsContainerParameterValue)value, diagnostics, context);
			case EngineeringModelDataPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case EngineeringModelDataPackage.SIMPLE_PARAMETERIZABLE_THING:
				return validateSimpleParameterizableThing((SimpleParameterizableThing)value, diagnostics, context);
			case EngineeringModelDataPackage.SIMPLE_PARAMETER_VALUE:
				return validateSimpleParameterValue((SimpleParameterValue)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETRIC_CONSTRAINT:
				return validateParametricConstraint((ParametricConstraint)value, diagnostics, context);
			case EngineeringModelDataPackage.BOOLEAN_EXPRESSION:
				return validateBooleanExpression((BooleanExpression)value, diagnostics, context);
			case EngineeringModelDataPackage.DOMAIN_FILE_STORE:
				return validateDomainFileStore((DomainFileStore)value, diagnostics, context);
			case EngineeringModelDataPackage.RULE_VERIFICATION_LIST:
				return validateRuleVerificationList((RuleVerificationList)value, diagnostics, context);
			case EngineeringModelDataPackage.RULE_VERIFICATION:
				return validateRuleVerification((RuleVerification)value, diagnostics, context);
			case EngineeringModelDataPackage.RULE_VIOLATION:
				return validateRuleViolation((RuleViolation)value, diagnostics, context);
			case EngineeringModelDataPackage.STAKEHOLDER:
				return validateStakeholder((Stakeholder)value, diagnostics, context);
			case EngineeringModelDataPackage.STAKEHOLDER_VALUE:
				return validateStakeholderValue((StakeholderValue)value, diagnostics, context);
			case EngineeringModelDataPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case EngineeringModelDataPackage.VALUE_GROUP:
				return validateValueGroup((ValueGroup)value, diagnostics, context);
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP:
				return validateStakeHolderValueMap((StakeHolderValueMap)value, diagnostics, context);
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS:
				return validateStakeHolderValueMapSettings((StakeHolderValueMapSettings)value, diagnostics, context);
			case EngineeringModelDataPackage.MULTI_RELATIONSHIP:
				return validateMultiRelationship((MultiRelationship)value, diagnostics, context);
			case EngineeringModelDataPackage.BINARY_RELATIONSHIP:
				return validateBinaryRelationship((BinaryRelationship)value, diagnostics, context);
			case EngineeringModelDataPackage.OR_EXPRESSION:
				return validateOrExpression((OrExpression)value, diagnostics, context);
			case EngineeringModelDataPackage.NOT_EXPRESSION:
				return validateNotExpression((NotExpression)value, diagnostics, context);
			case EngineeringModelDataPackage.AND_EXPRESSION:
				return validateAndExpression((AndExpression)value, diagnostics, context);
			case EngineeringModelDataPackage.EXCLUSIVE_OR_EXPRESSION:
				return validateExclusiveOrExpression((ExclusiveOrExpression)value, diagnostics, context);
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION:
				return validateRelationalExpression((RelationalExpression)value, diagnostics, context);
			case EngineeringModelDataPackage.USER_RULE_VERIFICATION:
				return validateUserRuleVerification((UserRuleVerification)value, diagnostics, context);
			case EngineeringModelDataPackage.BUILT_IN_RULE_VERIFICATION:
				return validateBuiltInRuleVerification((BuiltInRuleVerification)value, diagnostics, context);
			case EngineeringModelDataPackage.OWNED_THING:
				return validateOwnedThing((OwnedThing)value, diagnostics, context);
			case EngineeringModelDataPackage.INTERFACE_END_KIND:
				return validateInterfaceEndKind((InterfaceEndKind)value, diagnostics, context);
			case EngineeringModelDataPackage.PARAMETER_SWITCH_KIND:
				return validateParameterSwitchKind((ParameterSwitchKind)value, diagnostics, context);
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_KIND:
				return validateActualFiniteStateKind((ActualFiniteStateKind)value, diagnostics, context);
			case EngineeringModelDataPackage.RULE_VERIFICATION_STATUS_KIND:
				return validateRuleVerificationStatusKind((RuleVerificationStatusKind)value, diagnostics, context);
			case EngineeringModelDataPackage.BOOLEAN_OPERATOR_KIND:
				return validateBooleanOperatorKind((BooleanOperatorKind)value, diagnostics, context);
			case EngineeringModelDataPackage.RELATIONAL_OPERATOR_KIND:
				return validateRelationalOperatorKind((RelationalOperatorKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleFiniteState(PossibleFiniteState possibleFiniteState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(possibleFiniteState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(possibleFiniteState, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(possibleFiniteState, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_hasValidScale(parameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidScale constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_hasValidScale(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return parameter.hasValidScale(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterOrOverrideBase(ParameterOrOverrideBase parameterOrOverrideBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterOrOverrideBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterBase(ParameterBase parameterBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualFiniteStateList(ActualFiniteStateList actualFiniteStateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actualFiniteStateList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionDependentThing(OptionDependentThing optionDependentThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionDependentThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOption(Option option, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(option, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(option, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(option, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(option, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(option, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(option, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(option, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(option, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(option, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(option, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(option, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNestedElement(NestedElement nestedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nestedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinition(ElementDefinition elementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementDefinition_hasUniqueParameterNames(elementDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementDefinition_hasUniqueParameterShortNames(elementDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasUniqueParameterNames constraint of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinition_hasUniqueParameterNames(ElementDefinition elementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return elementDefinition.hasUniqueParameterNames(diagnostics, context);
	}

	/**
	 * Validates the hasUniqueParameterShortNames constraint of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDefinition_hasUniqueParameterShortNames(ElementDefinition elementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return elementDefinition.hasUniqueParameterShortNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementBase(ElementBase elementBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementBase, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(elementBase, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(elementBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementUsage(ElementUsage elementUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementUsage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(elementUsage, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(elementUsage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterOverride(ParameterOverride parameterOverride, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterOverride, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterGroup(ParameterGroup parameterGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterOverrideValueSet(ParameterOverrideValueSet parameterOverrideValueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterOverrideValueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValueSetBase(ParameterValueSetBase parameterValueSetBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterValueSetBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualFiniteState(ActualFiniteState actualFiniteState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actualFiniteState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValueSet(ParameterValueSet parameterValueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterValueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNestedParameter(NestedParameter nestedParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nestedParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleFiniteStateList(PossibleFiniteStateList possibleFiniteStateList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(possibleFiniteStateList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(possibleFiniteStateList, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(possibleFiniteStateList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSubscription(ParameterSubscription parameterSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterSubscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSubscriptionValueSet(ParameterSubscriptionValueSet parameterSubscriptionValueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterSubscriptionValueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileStore(FileStore fileStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolder(Folder folder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(folder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(file, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileRevision(FileRevision fileRevision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileRevision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublication(Publication publication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringModel(EngineeringModel engineeringModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineeringModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonFileStore(CommonFileStore commonFileStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonFileStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelLogEntry(ModelLogEntry modelLogEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelLogEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIteration(Iteration iteration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iteration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipParameterValue(RelationshipParameterValue relationshipParameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationshipParameterValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValue(ParameterValue parameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalIdentifierMap(ExternalIdentifierMap externalIdentifierMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalIdentifierMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdCorrespondence(IdCorrespondence idCorrespondence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(idCorrespondence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsSpecification(RequirementsSpecification requirementsSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirementsSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(requirementsSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(requirementsSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsContainer(RequirementsContainer requirementsContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirementsContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(requirementsContainer, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(requirementsContainer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsGroup(RequirementsGroup requirementsGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirementsGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(requirementsGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(requirementsGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsContainerParameterValue(RequirementsContainerParameterValue requirementsContainerParameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementsContainerParameterValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(requirement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleParameterizableThing(SimpleParameterizableThing simpleParameterizableThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleParameterizableThing, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(simpleParameterizableThing, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(simpleParameterizableThing, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleParameterValue(SimpleParameterValue simpleParameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleParameterValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametricConstraint(ParametricConstraint parametricConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametricConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpression(BooleanExpression booleanExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainFileStore(DomainFileStore domainFileStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainFileStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleVerificationList(RuleVerificationList ruleVerificationList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ruleVerificationList, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(ruleVerificationList, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(ruleVerificationList, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleVerification(RuleVerification ruleVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleVerification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleViolation(RuleViolation ruleViolation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleViolation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStakeholder(Stakeholder stakeholder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stakeholder, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(stakeholder, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(stakeholder, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStakeholderValue(StakeholderValue stakeholderValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stakeholderValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(stakeholderValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(stakeholderValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(goal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(goal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(goal, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(goal, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(goal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueGroup(ValueGroup valueGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(valueGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(valueGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStakeHolderValueMap(StakeHolderValueMap stakeHolderValueMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stakeHolderValueMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage(stakeHolderValueMap, diagnostics, context);
		if (result || diagnostics != null) result &= commonDataValidator.validateDefinedThing_hasOneDefinitionPerLanguage1(stakeHolderValueMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStakeHolderValueMapSettings(StakeHolderValueMapSettings stakeHolderValueMapSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stakeHolderValueMapSettings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiRelationship(MultiRelationship multiRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryRelationship(BinaryRelationship binaryRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrExpression(OrExpression orExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotExpression(NotExpression notExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAndExpression(AndExpression andExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(andExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExclusiveOrExpression(ExclusiveOrExpression exclusiveOrExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exclusiveOrExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalExpression(RelationalExpression relationalExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationalExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserRuleVerification(UserRuleVerification userRuleVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userRuleVerification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuiltInRuleVerification(BuiltInRuleVerification builtInRuleVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builtInRuleVerification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnedThing(OwnedThing ownedThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ownedThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceEndKind(InterfaceEndKind interfaceEndKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSwitchKind(ParameterSwitchKind parameterSwitchKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualFiniteStateKind(ActualFiniteStateKind actualFiniteStateKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleVerificationStatusKind(RuleVerificationStatusKind ruleVerificationStatusKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOperatorKind(BooleanOperatorKind booleanOperatorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalOperatorKind(RelationalOperatorKind relationalOperatorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //EngineeringModelDataValidator
