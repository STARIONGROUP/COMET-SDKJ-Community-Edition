/* --------------------------------------------------------------------------------------------------------------------
 * ClassKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

/**
 * Enumeration datatype that denotes the possible classes in the current data model
 * Note 1: Values are used to represent classes in instance directories and in the definition of validation rules.
 * Note 2: The implementation in a programming language needs to provide a reflection capability that allows runtime
 * evaluation of an instance's class against the enumeration literal that represents the class name.
 */
public enum ClassKind {
    /**
     * Assertion that the Class is an instance of ActionItem
     */
    ACTION_ITEM,

    /**
     * Assertion that the Class is an instance of ActualFiniteState
     */
    ACTUAL_FINITE_STATE,

    /**
     * Assertion that the Class is an instance of ActualFiniteStateList
     */
    ACTUAL_FINITE_STATE_LIST,

    /**
     * Assertion that the Class is an instance of Alias
     */
    ALIAS,

    /**
     * Assertion that the Class is an instance of AndExpression
     */
    AND_EXPRESSION,

    /**
     * Assertion that the Class is an instance of Approval
     */
    APPROVAL,

    /**
     * Assertion that the Class is an instance of ArrayParameterType
     */
    ARRAY_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of BinaryNote
     */
    BINARY_NOTE,

    /**
     * Assertion that the Class is an instance of BinaryRelationship
     */
    BINARY_RELATIONSHIP,

    /**
     * Assertion that the Class is an instance of BinaryRelationshipRule
     */
    BINARY_RELATIONSHIP_RULE,

    /**
     * Assertion that the Class is an instance of Book
     */
    BOOK,

    /**
     * Assertion that the Class is an instance of BooleanExpression
     */
    BOOLEAN_EXPRESSION,

    /**
     * Assertion that the Class is an instance of BooleanParameterType
     */
    BOOLEAN_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of Bounds
     */
    BOUNDS,

    /**
     * Assertion that the Class is an instance of BuiltInRuleVerification
     */
    BUILT_IN_RULE_VERIFICATION,

    /**
     * Assertion that the Class is an instance of Category
     */
    CATEGORY,

    /**
     * Assertion that the Class is an instance of ChangeProposal
     */
    CHANGE_PROPOSAL,

    /**
     * Assertion that the Class is an instance of ChangeRequest
     */
    CHANGE_REQUEST,

    /**
     * Assertion that the Class is an instance of Citation
     */
    CITATION,

    /**
     * Assertion that the Class is an instance of Color
     */
    COLOR,

    /**
     * Assertion that the Class is an instance of CommonFileStore
     */
    COMMON_FILE_STORE,

    /**
     * Assertion that the Class is an instance of CompoundParameterType
     */
    COMPOUND_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of Constant
     */
    CONSTANT,

    /**
     * Assertion that the Class is an instance of ContractChangeNotice
     */
    CONTRACT_CHANGE_NOTICE,

    /**
     * Assertion that the Class is an instance of ContractDeviation
     */
    CONTRACT_DEVIATION,

    /**
     * Assertion that the Class is an instance of ConversionBasedUnit
     */
    CONVERSION_BASED_UNIT,

    /**
     * Assertion that the Class is an instance of CyclicRatioScale
     */
    CYCLIC_RATIO_SCALE,

    /**
     * Assertion that the Class is an instance of DateParameterType
     */
    DATE_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of DateTimeParameterType
     */
    DATE_TIME_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of DecompositionRule
     */
    DECOMPOSITION_RULE,

    /**
     * Assertion that the Class is an instance of DefinedThing
     */
    DEFINED_THING,

    /**
     * Assertion that the Class is an instance of Definition
     */
    DEFINITION,

    /**
     * Assertion that the Class is an instance of DerivedQuantityKind
     */
    DERIVED_QUANTITY_KIND,

    /**
     * Assertion that the Class is an instance of DerivedUnit
     */
    DERIVED_UNIT,

    /**
     * Assertion that the Class is an instance of DiagramCanvas
     */
    DIAGRAM_CANVAS,

    /**
     * Assertion that the Class is an instance of DiagramEdge
     */
    DIAGRAM_EDGE,

    /**
     * Assertion that the Class is an instance of DiagramElementContainer
     */
    DIAGRAM_ELEMENT_CONTAINER,

    /**
     * Assertion that the Class is an instance of DiagramElementThing
     */
    DIAGRAM_ELEMENT_THING,

    /**
     * Assertion that the Class is an instance of DiagrammingStyle
     */
    DIAGRAMMING_STYLE,

    /**
     * Assertion that the Class is an instance of DiagramObject
     */
    DIAGRAM_OBJECT,

    /**
     * Assertion that the Class is an instance of DiagramShape
     */
    DIAGRAM_SHAPE,

    /**
     * Assertion that the Class is an instance of DiagramThingBase
     */
    DIAGRAM_THING_BASE,

    /**
     * Assertion that the Class is an instance of DiscussionItem
     */
    DISCUSSION_ITEM,

    /**
     * Assertion that the Class is an instance of DomainFileStore
     */
    DOMAIN_FILE_STORE,

    /**
     * Assertion that the Class is an instance of DomainOfExpertise
     */
    DOMAIN_OF_EXPERTISE,

    /**
     * Assertion that the Class is an instance of DomainOfExpertiseGroup
     */
    DOMAIN_OF_EXPERTISE_GROUP,

    /**
     * Assertion that the Class is an instance of ElementBase
     */
    ELEMENT_BASE,

    /**
     * Assertion that the Class is an instance of ElementDefinition
     */
    ELEMENT_DEFINITION,

    /**
     * Assertion that the Class is an instance of ElementUsage
     */
    ELEMENT_USAGE,

    /**
     * Assertion that the Class is an instance of EmailAddress
     */
    EMAIL_ADDRESS,

    /**
     * Assertion that the Class is an instance of EngineeringModel
     */
    ENGINEERING_MODEL,

    /**
     * Assertion that the Class is an instance of EngineeringModelDataAnnotation
     */
    ENGINEERING_MODEL_DATA_ANNOTATION,

    /**
     * Assertion that the Class is an instance of EngineeringModelDataDiscussionItem
     */
    ENGINEERING_MODEL_DATA_DISCUSSION_ITEM,

    /**
     * Assertion that the Class is an instance of EngineeringModelDataNote
     */
    ENGINEERING_MODEL_DATA_NOTE,

    /**
     * Assertion that the Class is an instance of EngineeringModelSetup
     */
    ENGINEERING_MODEL_SETUP,

    /**
     * Assertion that the Class is an instance of EnumerationParameterType
     */
    ENUMERATION_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of EnumerationValueDefinition
     */
    ENUMERATION_VALUE_DEFINITION,

    /**
     * Assertion that the Class is an instance of ExclusiveOrExpression
     */
    EXCLUSIVE_OR_EXPRESSION,

    /**
     * Assertion that the Class is an instance of ExternalIdentifierMap
     */
    EXTERNAL_IDENTIFIER_MAP,

    /**
     * Assertion that the Class is an instance of File
     */
    FILE,

    /**
     * Assertion that the Class is an instance of FileRevision
     */
    FILE_REVISION,

    /**
     * Assertion that the Class is an instance of FileStore
     */
    FILE_STORE,

    /**
     * Assertion that the Class is an instance of FileType
     */
    FILE_TYPE,

    /**
     * Assertion that the Class is an instance of Folder
     */
    FOLDER,

    /**
     * Assertion that the Class is an instance of GenericAnnotation
     */
    GENERIC_ANNOTATION,

    /**
     * Assertion that the Class is an instance of Glossary
     */
    GLOSSARY,

    /**
     * Assertion that the Class is an instance of Goal
     */
    GOAL,

    /**
     * Assertion that the Class is an instance of HyperLink
     */
    HYPER_LINK,

    /**
     * Assertion that the Class is an instance of IdCorrespondence
     */
    ID_CORRESPONDENCE,

    /**
     * Assertion that the Class is an instance of IntervalScale
     */
    INTERVAL_SCALE,

    /**
     * Assertion that the Class is an instance of Iteration
     */
    ITERATION,

    /**
     * Assertion that the Class is an instance of IterationSetup
     */
    ITERATION_SETUP,

    /**
     * Assertion that the Class is an instance of LinearConversionUnit
     */
    LINEAR_CONVERSION_UNIT,

    /**
     * Assertion that the Class is an instance of LogarithmicScale
     */
    LOGARITHMIC_SCALE,

    /**
     * Assertion that the Class is an instance of MappingToReferenceScale
     */
    MAPPING_TO_REFERENCE_SCALE,

    /**
     * Assertion that the Class is an instance of MeasurementScale
     */
    MEASUREMENT_SCALE,

    /**
     * Assertion that the Class is an instance of MeasurementUnit
     */
    MEASUREMENT_UNIT,

    /**
     * Assertion that the Class is an instance of ModellingAnnotationItem
     */
    MODELLING_ANNOTATION_ITEM,

    /**
     * Assertion that the Class is an instance of ModellingThingReference
     */
    MODELLING_THING_REFERENCE,

    /**
     * Assertion that the Class is an instance of ModelLogEntry
     */
    MODEL_LOG_ENTRY,

    /**
     * Assertion that the Class is an instance of ModelReferenceDataLibrary
     */
    MODEL_REFERENCE_DATA_LIBRARY,

    /**
     * Assertion that the Class is an instance of MultiRelationship
     */
    MULTI_RELATIONSHIP,

    /**
     * Assertion that the Class is an instance of MultiRelationshipRule
     */
    MULTI_RELATIONSHIP_RULE,

    /**
     * Assertion that the Class is an instance of NaturalLanguage
     */
    NATURAL_LANGUAGE,

    /**
     * Assertion that the Class is an instance of NestedElement
     */
    NESTED_ELEMENT,

    /**
     * Assertion that the Class is an instance of NestedParameter
     */
    NESTED_PARAMETER,

    /**
     * Assertion that the Class is an instance of Note
     */
    NOTE,

    /**
     * Assertion that the Class is an instance of NotExpression
     */
    NOT_EXPRESSION,

    /**
     * Assertion that the Class is an instance of NotThing
     */
    NOT_THING,

    /**
     * Assertion that the Class is an instance of Option
     */
    OPTION,

    /**
     * Assertion that the Class is an instance of OrdinalScale
     */
    ORDINAL_SCALE,

    /**
     * Assertion that the Class is an instance of OrExpression
     */
    OR_EXPRESSION,

    /**
     * Assertion that the Class is an instance of Organization
     */
    ORGANIZATION,

    /**
     * Assertion that the Class is an instance of OwnedStyle
     */
    OWNED_STYLE,

    /**
     * Assertion that the Class is an instance of Page
     */
    PAGE,

    /**
     * Assertion that the Class is an instance of Parameter
     */
    PARAMETER,

    /**
     * Assertion that the Class is an instance of ParameterBase
     */
    PARAMETER_BASE,

    /**
     * Assertion that the Class is an instance of ParameterGroup
     */
    PARAMETER_GROUP,

    /**
     * Assertion that the Class is an instance of ParameterizedCategoryRule
     */
    PARAMETERIZED_CATEGORY_RULE,

    /**
     * Assertion that the Class is an instance of ParameterOrOverrideBase
     */
    PARAMETER_OR_OVERRIDE_BASE,

    /**
     * Assertion that the Class is an instance of ParameterOverride
     */
    PARAMETER_OVERRIDE,

    /**
     * Assertion that the Class is an instance of ParameterOverrideValueSet
     */
    PARAMETER_OVERRIDE_VALUE_SET,

    /**
     * Assertion that the Class is an instance of ParameterSubscription
     */
    PARAMETER_SUBSCRIPTION,

    /**
     * Assertion that the Class is an instance of ParameterSubscriptionValueSet
     */
    PARAMETER_SUBSCRIPTION_VALUE_SET,

    /**
     * Assertion that the Class is an instance of ParameterType
     */
    PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of ParameterTypeComponent
     */
    PARAMETER_TYPE_COMPONENT,

    /**
     * Assertion that the Class is an instance of ParameterValue
     */
    PARAMETER_VALUE,

    /**
     * Assertion that the Class is an instance of ParameterValueSet
     */
    PARAMETER_VALUE_SET,

    /**
     * Assertion that the Class is an instance of ParameterValueSetBase
     */
    PARAMETER_VALUE_SET_BASE,

    /**
     * Assertion that the Class is an instance of ParametricConstraint
     */
    PARAMETRIC_CONSTRAINT,

    /**
     * Assertion that the Class is an instance of Participant
     */
    PARTICIPANT,

    /**
     * Assertion that the Class is an instance of ParticipantPermission
     */
    PARTICIPANT_PERMISSION,

    /**
     * Assertion that the Class is an instance of ParticipantRole
     */
    PARTICIPANT_ROLE,

    /**
     * Assertion that the Class is an instance of Person
     */
    PERSON,

    /**
     * Assertion that the Class is an instance of PersonPermission
     */
    PERSON_PERMISSION,

    /**
     * Assertion that the Class is an instance of PersonRole
     */
    PERSON_ROLE,

    /**
     * Assertion that the Class is an instance of Point
     */
    POINT,

    /**
     * Assertion that the Class is an instance of PossibleFiniteState
     */
    POSSIBLE_FINITE_STATE,

    /**
     * Assertion that the Class is an instance of PossibleFiniteStateList
     */
    POSSIBLE_FINITE_STATE_LIST,

    /**
     * Assertion that the Class is an instance of PrefixedUnit
     */
    PREFIXED_UNIT,

    /**
     * Assertion that the Class is an instance of Publication
     */
    PUBLICATION,

    /**
     * Assertion that the Class is an instance of QuantityKind
     */
    QUANTITY_KIND,

    /**
     * Assertion that the Class is an instance of QuantityKindFactor
     */
    QUANTITY_KIND_FACTOR,

    /**
     * Assertion that the Class is an instance of RatioScale
     */
    RATIO_SCALE,

    /**
     * Assertion that the Class is an instance of ReferenceDataLibrary
     */
    REFERENCE_DATA_LIBRARY,

    /**
     * Assertion that the Class is an instance of ReferencerRule
     */
    REFERENCER_RULE,

    /**
     * Assertion that the Class is an instance of ReferenceSource
     */
    REFERENCE_SOURCE,

    /**
     * Assertion that the Class is an instance of RelationalExpression
     */
    RELATIONAL_EXPRESSION,

    /**
     * Assertion that the Class is an instance of Relationship
     */
    RELATIONSHIP,

    /**
     * Assertion that the Class is an instance of RelationshipParameterValue
     */
    RELATIONSHIP_PARAMETER_VALUE,

    /**
     * Assertion that the Class is an instance of RequestForDeviation
     */
    REQUEST_FOR_DEVIATION,

    /**
     * Assertion that the Class is an instance of RequestForWaiver
     */
    REQUEST_FOR_WAIVER,

    /**
     * Assertion that the Class is an instance of Requirement
     */
    REQUIREMENT,

    /**
     * Assertion that the Class is an instance of RequirementsContainer
     */
    REQUIREMENTS_CONTAINER,

    /**
     * Assertion that the Class is an instance of RequirementsContainerParameterValue
     */
    REQUIREMENTS_CONTAINER_PARAMETER_VALUE,

    /**
     * Assertion that the Class is an instance of RequirementsGroup
     */
    REQUIREMENTS_GROUP,

    /**
     * Assertion that the Class is an instance of RequirementsSpecification
     */
    REQUIREMENTS_SPECIFICATION,

    /**
     * Assertion that the Class is an instance of ReviewItemDiscrepancy
     */
    REVIEW_ITEM_DISCREPANCY,

    /**
     * Assertion that the Class is an instance of Rule
     */
    RULE,

    /**
     * Assertion that the Class is an instance of RuleVerification
     */
    RULE_VERIFICATION,

    /**
     * Assertion that the Class is an instance of RuleVerificationList
     */
    RULE_VERIFICATION_LIST,

    /**
     * Assertion that the Class is an instance of RuleViolation
     */
    RULE_VIOLATION,

    /**
     * Assertion that the Class is an instance of ScalarParameterType
     */
    SCALAR_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of ScaleReferenceQuantityValue
     */
    SCALE_REFERENCE_QUANTITY_VALUE,

    /**
     * Assertion that the Class is an instance of ScaleValueDefinition
     */
    SCALE_VALUE_DEFINITION,

    /**
     * Assertion that the Class is an instance of Section
     */
    SECTION,

    /**
     * Assertion that the Class is an instance of SharedStyle
     */
    SHARED_STYLE,

    /**
     * Assertion that the Class is an instance of SimpleParameterizableThing
     */
    SIMPLE_PARAMETERIZABLE_THING,

    /**
     * Assertion that the Class is an instance of SimpleParameterValue
     */
    SIMPLE_PARAMETER_VALUE,

    /**
     * Assertion that the Class is an instance of SimpleQuantityKind
     */
    SIMPLE_QUANTITY_KIND,

    /**
     * Assertion that the Class is an instance of SimpleUnit
     */
    SIMPLE_UNIT,

    /**
     * Assertion that the Class is an instance of SiteDirectory
     */
    SITE_DIRECTORY,

    /**
     * Assertion that the Class is an instance of SiteDirectoryDataAnnotation
     */
    SITE_DIRECTORY_DATA_ANNOTATION,

    /**
     * Assertion that the Class is an instance of SiteDirectoryDataDiscussionItem
     */
    SITE_DIRECTORY_DATA_DISCUSSION_ITEM,

    /**
     * Assertion that the Class is an instance of SiteDirectoryThingReference
     */
    SITE_DIRECTORY_THING_REFERENCE,

    /**
     * Assertion that the Class is an instance of SiteLogEntry
     */
    SITE_LOG_ENTRY,

    /**
     * Assertion that the Class is an instance of SiteReferenceDataLibrary
     */
    SITE_REFERENCE_DATA_LIBRARY,

    /**
     * Assertion that the Class is an instance of Solution
     */
    SOLUTION,

    /**
     * Assertion that the Class is an instance of SpecializedQuantityKind
     */
    SPECIALIZED_QUANTITY_KIND,

    /**
     * Assertion that the Class is an instance of Stakeholder
     */
    STAKEHOLDER,

    /**
     * Assertion that the Class is an instance of StakeholderValue
     */
    STAKEHOLDER_VALUE,

    /**
     * Assertion that the Class is an instance of StakeHolderValueMap
     */
    STAKE_HOLDER_VALUE_MAP,

    /**
     * Assertion that the Class is an instance of StakeHolderValueMapSettings
     */
    STAKE_HOLDER_VALUE_MAP_SETTINGS,

    /**
     * Assertion that the Class is an instance of TelephoneNumber
     */
    TELEPHONE_NUMBER,

    /**
     * Assertion that the Class is an instance of Term
     */
    TERM,

    /**
     * Assertion that the Class is an instance of TextParameterType
     */
    TEXT_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of TextualNote
     */
    TEXTUAL_NOTE,

    /**
     * Assertion that the Class is an instance of Thing
     */
    THING,

    /**
     * Assertion that the Class is an instance of ThingReference
     */
    THING_REFERENCE,

    /**
     * Assertion that the Class is an instance of TimeOfDayParameterType
     */
    TIME_OF_DAY_PARAMETER_TYPE,

    /**
     * Assertion that the Class is an instance of TopContainer
     */
    TOP_CONTAINER,

    /**
     * Assertion that the Class is an instance of UnitFactor
     */
    UNIT_FACTOR,

    /**
     * Assertion that the Class is an instance of UnitPrefix
     */
    UNIT_PREFIX,

    /**
     * Assertion that the Class is an instance of UserPreference
     */
    USER_PREFERENCE,

    /**
     * Assertion that the Class is an instance of UserRuleVerification
     */
    USER_RULE_VERIFICATION,

    /**
     * Assertion that the Class is an instance of ValueGroup
     */
    VALUE_GROUP
}
