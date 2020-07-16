/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineeringModelDataFactoryImpl extends EFactoryImpl implements EngineeringModelDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EngineeringModelDataFactory init() {
		try {
			EngineeringModelDataFactory theEngineeringModelDataFactory = (EngineeringModelDataFactory)EPackage.Registry.INSTANCE.getEFactory(EngineeringModelDataPackage.eNS_URI);
			if (theEngineeringModelDataFactory != null) {
				return theEngineeringModelDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EngineeringModelDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE: return createPossibleFiniteState();
			case EngineeringModelDataPackage.PARAMETER: return createParameter();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST: return createActualFiniteStateList();
			case EngineeringModelDataPackage.OPTION: return createOption();
			case EngineeringModelDataPackage.NESTED_ELEMENT: return createNestedElement();
			case EngineeringModelDataPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case EngineeringModelDataPackage.ELEMENT_USAGE: return createElementUsage();
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE: return createParameterOverride();
			case EngineeringModelDataPackage.PARAMETER_GROUP: return createParameterGroup();
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET: return createParameterOverrideValueSet();
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE: return createActualFiniteState();
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET: return createParameterValueSet();
			case EngineeringModelDataPackage.NESTED_PARAMETER: return createNestedParameter();
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST: return createPossibleFiniteStateList();
			case EngineeringModelDataPackage.PARAMETER_SUBSCRIPTION: return createParameterSubscription();
			case EngineeringModelDataPackage.PARAMETER_SUBSCRIPTION_VALUE_SET: return createParameterSubscriptionValueSet();
			case EngineeringModelDataPackage.FOLDER: return createFolder();
			case EngineeringModelDataPackage.FILE: return createFile();
			case EngineeringModelDataPackage.FILE_REVISION: return createFileRevision();
			case EngineeringModelDataPackage.PUBLICATION: return createPublication();
			case EngineeringModelDataPackage.ENGINEERING_MODEL: return createEngineeringModel();
			case EngineeringModelDataPackage.COMMON_FILE_STORE: return createCommonFileStore();
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY: return createModelLogEntry();
			case EngineeringModelDataPackage.ITERATION: return createIteration();
			case EngineeringModelDataPackage.RELATIONSHIP_PARAMETER_VALUE: return createRelationshipParameterValue();
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP: return createExternalIdentifierMap();
			case EngineeringModelDataPackage.ID_CORRESPONDENCE: return createIdCorrespondence();
			case EngineeringModelDataPackage.REQUIREMENTS_SPECIFICATION: return createRequirementsSpecification();
			case EngineeringModelDataPackage.REQUIREMENTS_GROUP: return createRequirementsGroup();
			case EngineeringModelDataPackage.REQUIREMENTS_CONTAINER_PARAMETER_VALUE: return createRequirementsContainerParameterValue();
			case EngineeringModelDataPackage.REQUIREMENT: return createRequirement();
			case EngineeringModelDataPackage.SIMPLE_PARAMETER_VALUE: return createSimpleParameterValue();
			case EngineeringModelDataPackage.PARAMETRIC_CONSTRAINT: return createParametricConstraint();
			case EngineeringModelDataPackage.DOMAIN_FILE_STORE: return createDomainFileStore();
			case EngineeringModelDataPackage.RULE_VERIFICATION_LIST: return createRuleVerificationList();
			case EngineeringModelDataPackage.RULE_VIOLATION: return createRuleViolation();
			case EngineeringModelDataPackage.STAKEHOLDER: return createStakeholder();
			case EngineeringModelDataPackage.STAKEHOLDER_VALUE: return createStakeholderValue();
			case EngineeringModelDataPackage.GOAL: return createGoal();
			case EngineeringModelDataPackage.VALUE_GROUP: return createValueGroup();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP: return createStakeHolderValueMap();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS: return createStakeHolderValueMapSettings();
			case EngineeringModelDataPackage.MULTI_RELATIONSHIP: return createMultiRelationship();
			case EngineeringModelDataPackage.BINARY_RELATIONSHIP: return createBinaryRelationship();
			case EngineeringModelDataPackage.OR_EXPRESSION: return createOrExpression();
			case EngineeringModelDataPackage.NOT_EXPRESSION: return createNotExpression();
			case EngineeringModelDataPackage.AND_EXPRESSION: return createAndExpression();
			case EngineeringModelDataPackage.EXCLUSIVE_OR_EXPRESSION: return createExclusiveOrExpression();
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case EngineeringModelDataPackage.USER_RULE_VERIFICATION: return createUserRuleVerification();
			case EngineeringModelDataPackage.BUILT_IN_RULE_VERIFICATION: return createBuiltInRuleVerification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EngineeringModelDataPackage.INTERFACE_END_KIND:
				return createInterfaceEndKindFromString(eDataType, initialValue);
			case EngineeringModelDataPackage.PARAMETER_SWITCH_KIND:
				return createParameterSwitchKindFromString(eDataType, initialValue);
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_KIND:
				return createActualFiniteStateKindFromString(eDataType, initialValue);
			case EngineeringModelDataPackage.RULE_VERIFICATION_STATUS_KIND:
				return createRuleVerificationStatusKindFromString(eDataType, initialValue);
			case EngineeringModelDataPackage.BOOLEAN_OPERATOR_KIND:
				return createBooleanOperatorKindFromString(eDataType, initialValue);
			case EngineeringModelDataPackage.RELATIONAL_OPERATOR_KIND:
				return createRelationalOperatorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EngineeringModelDataPackage.INTERFACE_END_KIND:
				return convertInterfaceEndKindToString(eDataType, instanceValue);
			case EngineeringModelDataPackage.PARAMETER_SWITCH_KIND:
				return convertParameterSwitchKindToString(eDataType, instanceValue);
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_KIND:
				return convertActualFiniteStateKindToString(eDataType, instanceValue);
			case EngineeringModelDataPackage.RULE_VERIFICATION_STATUS_KIND:
				return convertRuleVerificationStatusKindToString(eDataType, instanceValue);
			case EngineeringModelDataPackage.BOOLEAN_OPERATOR_KIND:
				return convertBooleanOperatorKindToString(eDataType, instanceValue);
			case EngineeringModelDataPackage.RELATIONAL_OPERATOR_KIND:
				return convertRelationalOperatorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleFiniteState createPossibleFiniteState() {
		PossibleFiniteStateImpl possibleFiniteState = new PossibleFiniteStateImpl();
		return possibleFiniteState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFiniteStateList createActualFiniteStateList() {
		ActualFiniteStateListImpl actualFiniteStateList = new ActualFiniteStateListImpl();
		return actualFiniteStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedElement createNestedElement() {
		NestedElementImpl nestedElement = new NestedElementImpl();
		return nestedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementUsage createElementUsage() {
		ElementUsageImpl elementUsage = new ElementUsageImpl();
		return elementUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterOverride createParameterOverride() {
		ParameterOverrideImpl parameterOverride = new ParameterOverrideImpl();
		return parameterOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup createParameterGroup() {
		ParameterGroupImpl parameterGroup = new ParameterGroupImpl();
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterOverrideValueSet createParameterOverrideValueSet() {
		ParameterOverrideValueSetImpl parameterOverrideValueSet = new ParameterOverrideValueSetImpl();
		return parameterOverrideValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFiniteState createActualFiniteState() {
		ActualFiniteStateImpl actualFiniteState = new ActualFiniteStateImpl();
		return actualFiniteState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueSet createParameterValueSet() {
		ParameterValueSetImpl parameterValueSet = new ParameterValueSetImpl();
		return parameterValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedParameter createNestedParameter() {
		NestedParameterImpl nestedParameter = new NestedParameterImpl();
		return nestedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleFiniteStateList createPossibleFiniteStateList() {
		PossibleFiniteStateListImpl possibleFiniteStateList = new PossibleFiniteStateListImpl();
		return possibleFiniteStateList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSubscription createParameterSubscription() {
		ParameterSubscriptionImpl parameterSubscription = new ParameterSubscriptionImpl();
		return parameterSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSubscriptionValueSet createParameterSubscriptionValueSet() {
		ParameterSubscriptionValueSetImpl parameterSubscriptionValueSet = new ParameterSubscriptionValueSetImpl();
		return parameterSubscriptionValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileRevision createFileRevision() {
		FileRevisionImpl fileRevision = new FileRevisionImpl();
		return fileRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publication createPublication() {
		PublicationImpl publication = new PublicationImpl();
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModel createEngineeringModel() {
		EngineeringModelImpl engineeringModel = new EngineeringModelImpl();
		return engineeringModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFileStore createCommonFileStore() {
		CommonFileStoreImpl commonFileStore = new CommonFileStoreImpl();
		return commonFileStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLogEntry createModelLogEntry() {
		ModelLogEntryImpl modelLogEntry = new ModelLogEntryImpl();
		return modelLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iteration createIteration() {
		IterationImpl iteration = new IterationImpl();
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipParameterValue createRelationshipParameterValue() {
		RelationshipParameterValueImpl relationshipParameterValue = new RelationshipParameterValueImpl();
		return relationshipParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalIdentifierMap createExternalIdentifierMap() {
		ExternalIdentifierMapImpl externalIdentifierMap = new ExternalIdentifierMapImpl();
		return externalIdentifierMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdCorrespondence createIdCorrespondence() {
		IdCorrespondenceImpl idCorrespondence = new IdCorrespondenceImpl();
		return idCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsSpecification createRequirementsSpecification() {
		RequirementsSpecificationImpl requirementsSpecification = new RequirementsSpecificationImpl();
		return requirementsSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsGroup createRequirementsGroup() {
		RequirementsGroupImpl requirementsGroup = new RequirementsGroupImpl();
		return requirementsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsContainerParameterValue createRequirementsContainerParameterValue() {
		RequirementsContainerParameterValueImpl requirementsContainerParameterValue = new RequirementsContainerParameterValueImpl();
		return requirementsContainerParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParameterValue createSimpleParameterValue() {
		SimpleParameterValueImpl simpleParameterValue = new SimpleParameterValueImpl();
		return simpleParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametricConstraint createParametricConstraint() {
		ParametricConstraintImpl parametricConstraint = new ParametricConstraintImpl();
		return parametricConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFileStore createDomainFileStore() {
		DomainFileStoreImpl domainFileStore = new DomainFileStoreImpl();
		return domainFileStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVerificationList createRuleVerificationList() {
		RuleVerificationListImpl ruleVerificationList = new RuleVerificationListImpl();
		return ruleVerificationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleViolation createRuleViolation() {
		RuleViolationImpl ruleViolation = new RuleViolationImpl();
		return ruleViolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder createStakeholder() {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderValue createStakeholderValue() {
		StakeholderValueImpl stakeholderValue = new StakeholderValueImpl();
		return stakeholderValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueGroup createValueGroup() {
		ValueGroupImpl valueGroup = new ValueGroupImpl();
		return valueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeHolderValueMap createStakeHolderValueMap() {
		StakeHolderValueMapImpl stakeHolderValueMap = new StakeHolderValueMapImpl();
		return stakeHolderValueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeHolderValueMapSettings createStakeHolderValueMapSettings() {
		StakeHolderValueMapSettingsImpl stakeHolderValueMapSettings = new StakeHolderValueMapSettingsImpl();
		return stakeHolderValueMapSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiRelationship createMultiRelationship() {
		MultiRelationshipImpl multiRelationship = new MultiRelationshipImpl();
		return multiRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelationship createBinaryRelationship() {
		BinaryRelationshipImpl binaryRelationship = new BinaryRelationshipImpl();
		return binaryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpression createOrExpression() {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotExpression createNotExpression() {
		NotExpressionImpl notExpression = new NotExpressionImpl();
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveOrExpression createExclusiveOrExpression() {
		ExclusiveOrExpressionImpl exclusiveOrExpression = new ExclusiveOrExpressionImpl();
		return exclusiveOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRuleVerification createUserRuleVerification() {
		UserRuleVerificationImpl userRuleVerification = new UserRuleVerificationImpl();
		return userRuleVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInRuleVerification createBuiltInRuleVerification() {
		BuiltInRuleVerificationImpl builtInRuleVerification = new BuiltInRuleVerificationImpl();
		return builtInRuleVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceEndKind createInterfaceEndKindFromString(EDataType eDataType, String initialValue) {
		InterfaceEndKind result = InterfaceEndKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceEndKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSwitchKind createParameterSwitchKindFromString(EDataType eDataType, String initialValue) {
		ParameterSwitchKind result = ParameterSwitchKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterSwitchKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFiniteStateKind createActualFiniteStateKindFromString(EDataType eDataType, String initialValue) {
		ActualFiniteStateKind result = ActualFiniteStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActualFiniteStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleVerificationStatusKind createRuleVerificationStatusKindFromString(EDataType eDataType, String initialValue) {
		RuleVerificationStatusKind result = RuleVerificationStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleVerificationStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperatorKind createBooleanOperatorKindFromString(EDataType eDataType, String initialValue) {
		BooleanOperatorKind result = BooleanOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperatorKind createRelationalOperatorKindFromString(EDataType eDataType, String initialValue) {
		RelationalOperatorKind result = RelationalOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelDataPackage getEngineeringModelDataPackage() {
		return (EngineeringModelDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EngineeringModelDataPackage getPackage() {
		return EngineeringModelDataPackage.eINSTANCE;
	}

} //EngineeringModelDataFactoryImpl
