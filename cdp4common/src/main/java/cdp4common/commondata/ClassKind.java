/* --------------------------------------------------------------------------------------------------------------------
 * ClassKind.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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
    ActionItem,

    /**
     * Assertion that the Class is an instance of ActualFiniteState
     */
    ActualFiniteState,

    /**
     * Assertion that the Class is an instance of ActualFiniteStateList
     */
    ActualFiniteStateList,

    /**
     * Assertion that the Class is an instance of Alias
     */
    Alias,

    /**
     * Assertion that the Class is an instance of AndExpression
     */
    AndExpression,

    /**
     * Assertion that the Class is an instance of Approval
     */
    Approval,

    /**
     * Assertion that the Class is an instance of ArrayParameterType
     */
    ArrayParameterType,

    /**
     * Assertion that the Class is an instance of BinaryNote
     */
    BinaryNote,

    /**
     * Assertion that the Class is an instance of BinaryRelationship
     */
    BinaryRelationship,

    /**
     * Assertion that the Class is an instance of BinaryRelationshipRule
     */
    BinaryRelationshipRule,

    /**
     * Assertion that the Class is an instance of Book
     */
    Book,

    /**
     * Assertion that the Class is an instance of BooleanExpression
     */
    BooleanExpression,

    /**
     * Assertion that the Class is an instance of BooleanParameterType
     */
    BooleanParameterType,

    /**
     * Assertion that the Class is an instance of Bounds
     */
    Bounds,

    /**
     * Assertion that the Class is an instance of BuiltInRuleVerification
     */
    BuiltInRuleVerification,

    /**
     * Assertion that the Class is an instance of Category
     */
    Category,

    /**
     * Assertion that the Class is an instance of ChangeProposal
     */
    ChangeProposal,

    /**
     * Assertion that the Class is an instance of ChangeRequest
     */
    ChangeRequest,

    /**
     * Assertion that the Class is an instance of Citation
     */
    Citation,

    /**
     * Assertion that the Class is an instance of Color
     */
    Color,

    /**
     * Assertion that the Class is an instance of CommonFileStore
     */
    CommonFileStore,

    /**
     * Assertion that the Class is an instance of CompoundParameterType
     */
    CompoundParameterType,

    /**
     * Assertion that the Class is an instance of Constant
     */
    Constant,

    /**
     * Assertion that the Class is an instance of ContractChangeNotice
     */
    ContractChangeNotice,

    /**
     * Assertion that the Class is an instance of ContractDeviation
     */
    ContractDeviation,

    /**
     * Assertion that the Class is an instance of ConversionBasedUnit
     */
    ConversionBasedUnit,

    /**
     * Assertion that the Class is an instance of CyclicRatioScale
     */
    CyclicRatioScale,

    /**
     * Assertion that the Class is an instance of DateParameterType
     */
    DateParameterType,

    /**
     * Assertion that the Class is an instance of DateTimeParameterType
     */
    DateTimeParameterType,

    /**
     * Assertion that the Class is an instance of DecompositionRule
     */
    DecompositionRule,

    /**
     * Assertion that the Class is an instance of DefinedThing
     */
    DefinedThing,

    /**
     * Assertion that the Class is an instance of Definition
     */
    Definition,

    /**
     * Assertion that the Class is an instance of DependentParameterTypeAssignment
     */
    DependentParameterTypeAssignment,

    /**
     * Assertion that the Class is an instance of DerivedQuantityKind
     */
    DerivedQuantityKind,

    /**
     * Assertion that the Class is an instance of DerivedUnit
     */
    DerivedUnit,

    /**
     * Assertion that the Class is an instance of DiagramCanvas
     */
    DiagramCanvas,

    /**
     * Assertion that the Class is an instance of DiagramEdge
     */
    DiagramEdge,

    /**
     * Assertion that the Class is an instance of DiagramElementContainer
     */
    DiagramElementContainer,

    /**
     * Assertion that the Class is an instance of DiagramElementThing
     */
    DiagramElementThing,

    /**
     * Assertion that the Class is an instance of DiagrammingStyle
     */
    DiagrammingStyle,

    /**
     * Assertion that the Class is an instance of DiagramObject
     */
    DiagramObject,

    /**
     * Assertion that the Class is an instance of DiagramShape
     */
    DiagramShape,

    /**
     * Assertion that the Class is an instance of DiagramThingBase
     */
    DiagramThingBase,

    /**
     * Assertion that the Class is an instance of DiscussionItem
     */
    DiscussionItem,

    /**
     * Assertion that the Class is an instance of DomainFileStore
     */
    DomainFileStore,

    /**
     * Assertion that the Class is an instance of DomainOfExpertise
     */
    DomainOfExpertise,

    /**
     * Assertion that the Class is an instance of DomainOfExpertiseGroup
     */
    DomainOfExpertiseGroup,

    /**
     * Assertion that the Class is an instance of ElementBase
     */
    ElementBase,

    /**
     * Assertion that the Class is an instance of ElementDefinition
     */
    ElementDefinition,

    /**
     * Assertion that the Class is an instance of ElementUsage
     */
    ElementUsage,

    /**
     * Assertion that the Class is an instance of EmailAddress
     */
    EmailAddress,

    /**
     * Assertion that the Class is an instance of EngineeringModel
     */
    EngineeringModel,

    /**
     * Assertion that the Class is an instance of EngineeringModelDataAnnotation
     */
    EngineeringModelDataAnnotation,

    /**
     * Assertion that the Class is an instance of EngineeringModelDataDiscussionItem
     */
    EngineeringModelDataDiscussionItem,

    /**
     * Assertion that the Class is an instance of EngineeringModelDataNote
     */
    EngineeringModelDataNote,

    /**
     * Assertion that the Class is an instance of EngineeringModelSetup
     */
    EngineeringModelSetup,

    /**
     * Assertion that the Class is an instance of EnumerationParameterType
     */
    EnumerationParameterType,

    /**
     * Assertion that the Class is an instance of EnumerationValueDefinition
     */
    EnumerationValueDefinition,

    /**
     * Assertion that the Class is an instance of ExclusiveOrExpression
     */
    ExclusiveOrExpression,

    /**
     * Assertion that the Class is an instance of ExternalIdentifierMap
     */
    ExternalIdentifierMap,

    /**
     * Assertion that the Class is an instance of File
     */
    File,

    /**
     * Assertion that the Class is an instance of FileRevision
     */
    FileRevision,

    /**
     * Assertion that the Class is an instance of FileStore
     */
    FileStore,

    /**
     * Assertion that the Class is an instance of FileType
     */
    FileType,

    /**
     * Assertion that the Class is an instance of Folder
     */
    Folder,

    /**
     * Assertion that the Class is an instance of GenericAnnotation
     */
    GenericAnnotation,

    /**
     * Assertion that the Class is an instance of Glossary
     */
    Glossary,

    /**
     * Assertion that the Class is an instance of Goal
     */
    Goal,

    /**
     * Assertion that the Class is an instance of HyperLink
     */
    HyperLink,

    /**
     * Assertion that the Class is an instance of IdCorrespondence
     */
    IdCorrespondence,

    /**
     * Assertion that the Class is an instance of IndependentParameterTypeAssignment
     */
    IndependentParameterTypeAssignment,

    /**
     * Assertion that the Class is an instance of IntervalScale
     */
    IntervalScale,

    /**
     * Assertion that the Class is an instance of Iteration
     */
    Iteration,

    /**
     * Assertion that the Class is an instance of IterationSetup
     */
    IterationSetup,

    /**
     * Assertion that the Class is an instance of LinearConversionUnit
     */
    LinearConversionUnit,

    /**
     * Assertion that the Class is an instance of LogarithmicScale
     */
    LogarithmicScale,

    /**
     * Assertion that the Class is an instance of LogEntryChangelogItem
     */
    LogEntryChangelogItem,

    /**
     * Assertion that the Class is an instance of MappingToReferenceScale
     */
    MappingToReferenceScale,

    /**
     * Assertion that the Class is an instance of MeasurementScale
     */
    MeasurementScale,

    /**
     * Assertion that the Class is an instance of MeasurementUnit
     */
    MeasurementUnit,

    /**
     * Assertion that the Class is an instance of ModellingAnnotationItem
     */
    ModellingAnnotationItem,

    /**
     * Assertion that the Class is an instance of ModellingThingReference
     */
    ModellingThingReference,

    /**
     * Assertion that the Class is an instance of ModelLogEntry
     */
    ModelLogEntry,

    /**
     * Assertion that the Class is an instance of ModelReferenceDataLibrary
     */
    ModelReferenceDataLibrary,

    /**
     * Assertion that the Class is an instance of MultiRelationship
     */
    MultiRelationship,

    /**
     * Assertion that the Class is an instance of MultiRelationshipRule
     */
    MultiRelationshipRule,

    /**
     * Assertion that the Class is an instance of NaturalLanguage
     */
    NaturalLanguage,

    /**
     * Assertion that the Class is an instance of NestedElement
     */
    NestedElement,

    /**
     * Assertion that the Class is an instance of NestedParameter
     */
    NestedParameter,

    /**
     * Assertion that the Class is an instance of Note
     */
    Note,

    /**
     * Assertion that the Class is an instance of NotExpression
     */
    NotExpression,

    /**
     * Assertion that the Class is an instance of NotThing
     */
    NotThing,

    /**
     * Assertion that the Class is an instance of Option
     */
    Option,

    /**
     * Assertion that the Class is an instance of OrdinalScale
     */
    OrdinalScale,

    /**
     * Assertion that the Class is an instance of OrExpression
     */
    OrExpression,

    /**
     * Assertion that the Class is an instance of Organization
     */
    Organization,

    /**
     * Assertion that the Class is an instance of OrganizationalParticipant
     */
    OrganizationalParticipant,

    /**
     * Assertion that the Class is an instance of OwnedStyle
     */
    OwnedStyle,

    /**
     * Assertion that the Class is an instance of Page
     */
    Page,

    /**
     * Assertion that the Class is an instance of Parameter
     */
    Parameter,

    /**
     * Assertion that the Class is an instance of ParameterBase
     */
    ParameterBase,

    /**
     * Assertion that the Class is an instance of ParameterGroup
     */
    ParameterGroup,

    /**
     * Assertion that the Class is an instance of ParameterizedCategoryRule
     */
    ParameterizedCategoryRule,

    /**
     * Assertion that the Class is an instance of ParameterOrOverrideBase
     */
    ParameterOrOverrideBase,

    /**
     * Assertion that the Class is an instance of ParameterOverride
     */
    ParameterOverride,

    /**
     * Assertion that the Class is an instance of ParameterOverrideValueSet
     */
    ParameterOverrideValueSet,

    /**
     * Assertion that the Class is an instance of ParameterSubscription
     */
    ParameterSubscription,

    /**
     * Assertion that the Class is an instance of ParameterSubscriptionValueSet
     */
    ParameterSubscriptionValueSet,

    /**
     * Assertion that the Class is an instance of ParameterType
     */
    ParameterType,

    /**
     * Assertion that the Class is an instance of ParameterTypeComponent
     */
    ParameterTypeComponent,

    /**
     * Assertion that the Class is an instance of ParameterValue
     */
    ParameterValue,

    /**
     * Assertion that the Class is an instance of ParameterValueSet
     */
    ParameterValueSet,

    /**
     * Assertion that the Class is an instance of ParameterValueSetBase
     */
    ParameterValueSetBase,

    /**
     * Assertion that the Class is an instance of ParametricConstraint
     */
    ParametricConstraint,

    /**
     * Assertion that the Class is an instance of Participant
     */
    Participant,

    /**
     * Assertion that the Class is an instance of ParticipantPermission
     */
    ParticipantPermission,

    /**
     * Assertion that the Class is an instance of ParticipantRole
     */
    ParticipantRole,

    /**
     * Assertion that the Class is an instance of Person
     */
    Person,

    /**
     * Assertion that the Class is an instance of PersonPermission
     */
    PersonPermission,

    /**
     * Assertion that the Class is an instance of PersonRole
     */
    PersonRole,

    /**
     * Assertion that the Class is an instance of Point
     */
    Point,

    /**
     * Assertion that the Class is an instance of PossibleFiniteState
     */
    PossibleFiniteState,

    /**
     * Assertion that the Class is an instance of PossibleFiniteStateList
     */
    PossibleFiniteStateList,

    /**
     * Assertion that the Class is an instance of PrefixedUnit
     */
    PrefixedUnit,

    /**
     * Assertion that the Class is an instance of Publication
     */
    Publication,

    /**
     * Assertion that the Class is an instance of QuantityKind
     */
    QuantityKind,

    /**
     * Assertion that the Class is an instance of QuantityKindFactor
     */
    QuantityKindFactor,

    /**
     * Assertion that the Class is an instance of RatioScale
     */
    RatioScale,

    /**
     * Assertion that the Class is an instance of ReferenceDataLibrary
     */
    ReferenceDataLibrary,

    /**
     * Assertion that the Class is an instance of ReferencerRule
     */
    ReferencerRule,

    /**
     * Assertion that the Class is an instance of ReferenceSource
     */
    ReferenceSource,

    /**
     * Assertion that the Class is an instance of RelationalExpression
     */
    RelationalExpression,

    /**
     * Assertion that the Class is an instance of Relationship
     */
    Relationship,

    /**
     * Assertion that the Class is an instance of RelationshipParameterValue
     */
    RelationshipParameterValue,

    /**
     * Assertion that the Class is an instance of RequestForDeviation
     */
    RequestForDeviation,

    /**
     * Assertion that the Class is an instance of RequestForWaiver
     */
    RequestForWaiver,

    /**
     * Assertion that the Class is an instance of Requirement
     */
    Requirement,

    /**
     * Assertion that the Class is an instance of RequirementsContainer
     */
    RequirementsContainer,

    /**
     * Assertion that the Class is an instance of RequirementsContainerParameterValue
     */
    RequirementsContainerParameterValue,

    /**
     * Assertion that the Class is an instance of RequirementsGroup
     */
    RequirementsGroup,

    /**
     * Assertion that the Class is an instance of RequirementsSpecification
     */
    RequirementsSpecification,

    /**
     * Assertion that the Class is an instance of ReviewItemDiscrepancy
     */
    ReviewItemDiscrepancy,

    /**
     * Assertion that the Class is an instance of Rule
     */
    Rule,

    /**
     * Assertion that the Class is an instance of RuleVerification
     */
    RuleVerification,

    /**
     * Assertion that the Class is an instance of RuleVerificationList
     */
    RuleVerificationList,

    /**
     * Assertion that the Class is an instance of RuleViolation
     */
    RuleViolation,

    /**
     * Assertion that the Class is an instance of SampledFunctionParameterType
     */
    SampledFunctionParameterType,

    /**
     * Assertion that the Class is an instance of ScalarParameterType
     */
    ScalarParameterType,

    /**
     * Assertion that the Class is an instance of ScaleReferenceQuantityValue
     */
    ScaleReferenceQuantityValue,

    /**
     * Assertion that the Class is an instance of ScaleValueDefinition
     */
    ScaleValueDefinition,

    /**
     * Assertion that the Class is an instance of Section
     */
    Section,

    /**
     * Assertion that the Class is an instance of SharedStyle
     */
    SharedStyle,

    /**
     * Assertion that the Class is an instance of SimpleParameterizableThing
     */
    SimpleParameterizableThing,

    /**
     * Assertion that the Class is an instance of SimpleParameterValue
     */
    SimpleParameterValue,

    /**
     * Assertion that the Class is an instance of SimpleQuantityKind
     */
    SimpleQuantityKind,

    /**
     * Assertion that the Class is an instance of SimpleUnit
     */
    SimpleUnit,

    /**
     * Assertion that the Class is an instance of SiteDirectory
     */
    SiteDirectory,

    /**
     * Assertion that the Class is an instance of SiteDirectoryDataAnnotation
     */
    SiteDirectoryDataAnnotation,

    /**
     * Assertion that the Class is an instance of SiteDirectoryDataDiscussionItem
     */
    SiteDirectoryDataDiscussionItem,

    /**
     * Assertion that the Class is an instance of SiteDirectoryThingReference
     */
    SiteDirectoryThingReference,

    /**
     * Assertion that the Class is an instance of SiteLogEntry
     */
    SiteLogEntry,

    /**
     * Assertion that the Class is an instance of SiteReferenceDataLibrary
     */
    SiteReferenceDataLibrary,

    /**
     * Assertion that the Class is an instance of Solution
     */
    Solution,

    /**
     * Assertion that the Class is an instance of SpecializedQuantityKind
     */
    SpecializedQuantityKind,

    /**
     * Assertion that the Class is an instance of Stakeholder
     */
    Stakeholder,

    /**
     * Assertion that the Class is an instance of StakeholderValue
     */
    StakeholderValue,

    /**
     * Assertion that the Class is an instance of StakeHolderValueMap
     */
    StakeHolderValueMap,

    /**
     * Assertion that the Class is an instance of StakeHolderValueMapSettings
     */
    StakeHolderValueMapSettings,

    /**
     * Assertion that the Class is an instance of TelephoneNumber
     */
    TelephoneNumber,

    /**
     * Assertion that the Class is an instance of Term
     */
    Term,

    /**
     * Assertion that the Class is an instance of TextParameterType
     */
    TextParameterType,

    /**
     * Assertion that the Class is an instance of TextualNote
     */
    TextualNote,

    /**
     * Assertion that the Class is an instance of Thing
     */
    Thing,

    /**
     * Assertion that the Class is an instance of ThingReference
     */
    ThingReference,

    /**
     * Assertion that the Class is an instance of TimeOfDayParameterType
     */
    TimeOfDayParameterType,

    /**
     * Assertion that the Class is an instance of TopContainer
     */
    TopContainer,

    /**
     * Assertion that the Class is an instance of UnitFactor
     */
    UnitFactor,

    /**
     * Assertion that the Class is an instance of UnitPrefix
     */
    UnitPrefix,

    /**
     * Assertion that the Class is an instance of UserPreference
     */
    UserPreference,

    /**
     * Assertion that the Class is an instance of UserRuleVerification
     */
    UserRuleVerification,

    /**
     * Assertion that the Class is an instance of ValueGroup
     */
    ValueGroup
}
