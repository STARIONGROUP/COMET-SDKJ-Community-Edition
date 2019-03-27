/* --------------------------------------------------------------------------------------------------------------------
 * ClassKind.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
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
    ACTION_ITEM("ActionItem"),

    /**
     * Assertion that the Class is an instance of ActualFiniteState
     */
    ACTUAL_FINITE_STATE("ActualFiniteState"),

    /**
     * Assertion that the Class is an instance of ActualFiniteStateList
     */
    ACTUAL_FINITE_STATE_LIST("ActualFiniteStateList"),

    /**
     * Assertion that the Class is an instance of Alias
     */
    ALIAS("Alias"),

    /**
     * Assertion that the Class is an instance of AndExpression
     */
    AND_EXPRESSION("AndExpression"),

    /**
     * Assertion that the Class is an instance of Approval
     */
    APPROVAL("Approval"),

    /**
     * Assertion that the Class is an instance of ArrayParameterType
     */
    ARRAY_PARAMETER_TYPE("ArrayParameterType"),

    /**
     * Assertion that the Class is an instance of BinaryNote
     */
    BINARY_NOTE("BinaryNote"),

    /**
     * Assertion that the Class is an instance of BinaryRelationship
     */
    BINARY_RELATIONSHIP("BinaryRelationship"),

    /**
     * Assertion that the Class is an instance of BinaryRelationshipRule
     */
    BINARY_RELATIONSHIP_RULE("BinaryRelationshipRule"),

    /**
     * Assertion that the Class is an instance of Book
     */
    BOOK("Book"),

    /**
     * Assertion that the Class is an instance of BooleanExpression
     */
    BOOLEAN_EXPRESSION("BooleanExpression"),

    /**
     * Assertion that the Class is an instance of BooleanParameterType
     */
    BOOLEAN_PARAMETER_TYPE("BooleanParameterType"),

    /**
     * Assertion that the Class is an instance of Bounds
     */
    BOUNDS("Bounds"),

    /**
     * Assertion that the Class is an instance of BuiltInRuleVerification
     */
    BUILT_IN_RULE_VERIFICATION("BuiltInRuleVerification"),

    /**
     * Assertion that the Class is an instance of Category
     */
    CATEGORY("Category"),

    /**
     * Assertion that the Class is an instance of ChangeProposal
     */
    CHANGE_PROPOSAL("ChangeProposal"),

    /**
     * Assertion that the Class is an instance of ChangeRequest
     */
    CHANGE_REQUEST("ChangeRequest"),

    /**
     * Assertion that the Class is an instance of Citation
     */
    CITATION("Citation"),

    /**
     * Assertion that the Class is an instance of Color
     */
    COLOR("Color"),

    /**
     * Assertion that the Class is an instance of CommonFileStore
     */
    COMMON_FILE_STORE("CommonFileStore"),

    /**
     * Assertion that the Class is an instance of CompoundParameterType
     */
    COMPOUND_PARAMETER_TYPE("CompoundParameterType"),

    /**
     * Assertion that the Class is an instance of Constant
     */
    CONSTANT("Constant"),

    /**
     * Assertion that the Class is an instance of ContractChangeNotice
     */
    CONTRACT_CHANGE_NOTICE("ContractChangeNotice"),

    /**
     * Assertion that the Class is an instance of ContractDeviation
     */
    CONTRACT_DEVIATION("ContractDeviation"),

    /**
     * Assertion that the Class is an instance of ConversionBasedUnit
     */
    CONVERSION_BASED_UNIT("ConversionBasedUnit"),

    /**
     * Assertion that the Class is an instance of CyclicRatioScale
     */
    CYCLIC_RATIO_SCALE("CyclicRatioScale"),

    /**
     * Assertion that the Class is an instance of DateParameterType
     */
    DATE_PARAMETER_TYPE("DateParameterType"),

    /**
     * Assertion that the Class is an instance of DateTimeParameterType
     */
    DATE_TIME_PARAMETER_TYPE("DateTimeParameterType"),

    /**
     * Assertion that the Class is an instance of DecompositionRule
     */
    DECOMPOSITION_RULE("DecompositionRule"),

    /**
     * Assertion that the Class is an instance of DefinedThing
     */
    DEFINED_THING("DefinedThing"),

    /**
     * Assertion that the Class is an instance of Definition
     */
    DEFINITION("Definition"),

    /**
     * Assertion that the Class is an instance of DerivedQuantityKind
     */
    DERIVED_QUANTITY_KIND("DerivedQuantityKind"),

    /**
     * Assertion that the Class is an instance of DerivedUnit
     */
    DERIVED_UNIT("DerivedUnit"),

    /**
     * Assertion that the Class is an instance of DiagramCanvas
     */
    DIAGRAM_CANVAS("DiagramCanvas"),

    /**
     * Assertion that the Class is an instance of DiagramEdge
     */
    DIAGRAM_EDGE("DiagramEdge"),

    /**
     * Assertion that the Class is an instance of DiagramElementContainer
     */
    DIAGRAM_ELEMENT_CONTAINER("DiagramElementContainer"),

    /**
     * Assertion that the Class is an instance of DiagramElementThing
     */
    DIAGRAM_ELEMENT_THING("DiagramElementThing"),

    /**
     * Assertion that the Class is an instance of DiagrammingStyle
     */
    DIAGRAMMING_STYLE("DiagrammingStyle"),

    /**
     * Assertion that the Class is an instance of DiagramObject
     */
    DIAGRAM_OBJECT("DiagramObject"),

    /**
     * Assertion that the Class is an instance of DiagramShape
     */
    DIAGRAM_SHAPE("DiagramShape"),

    /**
     * Assertion that the Class is an instance of DiagramThingBase
     */
    DIAGRAM_THING_BASE("DiagramThingBase"),

    /**
     * Assertion that the Class is an instance of DiscussionItem
     */
    DISCUSSION_ITEM("DiscussionItem"),

    /**
     * Assertion that the Class is an instance of DomainFileStore
     */
    DOMAIN_FILE_STORE("DomainFileStore"),

    /**
     * Assertion that the Class is an instance of DomainOfExpertise
     */
    DOMAIN_OF_EXPERTISE("DomainOfExpertise"),

    /**
     * Assertion that the Class is an instance of DomainOfExpertiseGroup
     */
    DOMAIN_OF_EXPERTISE_GROUP("DomainOfExpertiseGroup"),

    /**
     * Assertion that the Class is an instance of ElementBase
     */
    ELEMENT_BASE("ElementBase"),

    /**
     * Assertion that the Class is an instance of ElementDefinition
     */
    ELEMENT_DEFINITION("ElementDefinition"),

    /**
     * Assertion that the Class is an instance of ElementUsage
     */
    ELEMENT_USAGE("ElementUsage"),

    /**
     * Assertion that the Class is an instance of EmailAddress
     */
    EMAIL_ADDRESS("EmailAddress"),

    /**
     * Assertion that the Class is an instance of EngineeringModel
     */
    ENGINEERING_MODEL("EngineeringModel"),

    /**
     * Assertion that the Class is an instance of EngineeringModelDataAnnotation
     */
    ENGINEERING_MODEL_DATA_ANNOTATION("EngineeringModelDataAnnotation"),

    /**
     * Assertion that the Class is an instance of EngineeringModelDataDiscussionItem
     */
    ENGINEERING_MODEL_DATA_DISCUSSION_ITEM("EngineeringModelDataDiscussionItem"),

    /**
     * Assertion that the Class is an instance of EngineeringModelDataNote
     */
    ENGINEERING_MODEL_DATA_NOTE("EngineeringModelDataNote"),

    /**
     * Assertion that the Class is an instance of EngineeringModelSetup
     */
    ENGINEERING_MODEL_SETUP("EngineeringModelSetup"),

    /**
     * Assertion that the Class is an instance of EnumerationParameterType
     */
    ENUMERATION_PARAMETER_TYPE("EnumerationParameterType"),

    /**
     * Assertion that the Class is an instance of EnumerationValueDefinition
     */
    ENUMERATION_VALUE_DEFINITION("EnumerationValueDefinition"),

    /**
     * Assertion that the Class is an instance of ExclusiveOrExpression
     */
    EXCLUSIVE_OR_EXPRESSION("ExclusiveOrExpression"),

    /**
     * Assertion that the Class is an instance of ExternalIdentifierMap
     */
    EXTERNAL_IDENTIFIER_MAP("ExternalIdentifierMap"),

    /**
     * Assertion that the Class is an instance of File
     */
    FILE("File"),

    /**
     * Assertion that the Class is an instance of FileRevision
     */
    FILE_REVISION("FileRevision"),

    /**
     * Assertion that the Class is an instance of FileStore
     */
    FILE_STORE("FileStore"),

    /**
     * Assertion that the Class is an instance of FileType
     */
    FILE_TYPE("FileType"),

    /**
     * Assertion that the Class is an instance of Folder
     */
    FOLDER("Folder"),

    /**
     * Assertion that the Class is an instance of GenericAnnotation
     */
    GENERIC_ANNOTATION("GenericAnnotation"),

    /**
     * Assertion that the Class is an instance of Glossary
     */
    GLOSSARY("Glossary"),

    /**
     * Assertion that the Class is an instance of Goal
     */
    GOAL("Goal"),

    /**
     * Assertion that the Class is an instance of HyperLink
     */
    HYPER_LINK("HyperLink"),

    /**
     * Assertion that the Class is an instance of IdCorrespondence
     */
    ID_CORRESPONDENCE("IdCorrespondence"),

    /**
     * Assertion that the Class is an instance of IntervalScale
     */
    INTERVAL_SCALE("IntervalScale"),

    /**
     * Assertion that the Class is an instance of Iteration
     */
    ITERATION("Iteration"),

    /**
     * Assertion that the Class is an instance of IterationSetup
     */
    ITERATION_SETUP("IterationSetup"),

    /**
     * Assertion that the Class is an instance of LinearConversionUnit
     */
    LINEAR_CONVERSION_UNIT("LinearConversionUnit"),

    /**
     * Assertion that the Class is an instance of LogarithmicScale
     */
    LOGARITHMIC_SCALE("LogarithmicScale"),

    /**
     * Assertion that the Class is an instance of MappingToReferenceScale
     */
    MAPPING_TO_REFERENCE_SCALE("MappingToReferenceScale"),

    /**
     * Assertion that the Class is an instance of MeasurementScale
     */
    MEASUREMENT_SCALE("MeasurementScale"),

    /**
     * Assertion that the Class is an instance of MeasurementUnit
     */
    MEASUREMENT_UNIT("MeasurementUnit"),

    /**
     * Assertion that the Class is an instance of ModellingAnnotationItem
     */
    MODELLING_ANNOTATION_ITEM("ModellingAnnotationItem"),

    /**
     * Assertion that the Class is an instance of ModellingThingReference
     */
    MODELLING_THING_REFERENCE("ModellingThingReference"),

    /**
     * Assertion that the Class is an instance of ModelLogEntry
     */
    MODEL_LOG_ENTRY("ModelLogEntry"),

    /**
     * Assertion that the Class is an instance of ModelReferenceDataLibrary
     */
    MODEL_REFERENCE_DATA_LIBRARY("ModelReferenceDataLibrary"),

    /**
     * Assertion that the Class is an instance of MultiRelationship
     */
    MULTI_RELATIONSHIP("MultiRelationship"),

    /**
     * Assertion that the Class is an instance of MultiRelationshipRule
     */
    MULTI_RELATIONSHIP_RULE("MultiRelationshipRule"),

    /**
     * Assertion that the Class is an instance of NaturalLanguage
     */
    NATURAL_LANGUAGE("NaturalLanguage"),

    /**
     * Assertion that the Class is an instance of NestedElement
     */
    NESTED_ELEMENT("NestedElement"),

    /**
     * Assertion that the Class is an instance of NestedParameter
     */
    NESTED_PARAMETER("NestedParameter"),

    /**
     * Assertion that the Class is an instance of Note
     */
    NOTE("Note"),

    /**
     * Assertion that the Class is an instance of NotExpression
     */
    NOT_EXPRESSION("NotExpression"),

    /**
     * Assertion that the Class is an instance of NotThing
     */
    NOT_THING("NotThing"),

    /**
     * Assertion that the Class is an instance of Option
     */
    OPTION("Option"),

    /**
     * Assertion that the Class is an instance of OrdinalScale
     */
    ORDINAL_SCALE("OrdinalScale"),

    /**
     * Assertion that the Class is an instance of OrExpression
     */
    OR_EXPRESSION("OrExpression"),

    /**
     * Assertion that the Class is an instance of Organization
     */
    ORGANIZATION("Organization"),

    /**
     * Assertion that the Class is an instance of OwnedStyle
     */
    OWNED_STYLE("OwnedStyle"),

    /**
     * Assertion that the Class is an instance of Page
     */
    PAGE("Page"),

    /**
     * Assertion that the Class is an instance of Parameter
     */
    PARAMETER("Parameter"),

    /**
     * Assertion that the Class is an instance of ParameterBase
     */
    PARAMETER_BASE("ParameterBase"),

    /**
     * Assertion that the Class is an instance of ParameterGroup
     */
    PARAMETER_GROUP("ParameterGroup"),

    /**
     * Assertion that the Class is an instance of ParameterizedCategoryRule
     */
    PARAMETERIZED_CATEGORY_RULE("ParameterizedCategoryRule"),

    /**
     * Assertion that the Class is an instance of ParameterOrOverrideBase
     */
    PARAMETER_OR_OVERRIDE_BASE("ParameterOrOverrideBase"),

    /**
     * Assertion that the Class is an instance of ParameterOverride
     */
    PARAMETER_OVERRIDE("ParameterOverride"),

    /**
     * Assertion that the Class is an instance of ParameterOverrideValueSet
     */
    PARAMETER_OVERRIDE_VALUE_SET("ParameterOverrideValueSet"),

    /**
     * Assertion that the Class is an instance of ParameterSubscription
     */
    PARAMETER_SUBSCRIPTION("ParameterSubscription"),

    /**
     * Assertion that the Class is an instance of ParameterSubscriptionValueSet
     */
    PARAMETER_SUBSCRIPTION_VALUE_SET("ParameterSubscriptionValueSet"),

    /**
     * Assertion that the Class is an instance of ParameterType
     */
    PARAMETER_TYPE("ParameterType"),

    /**
     * Assertion that the Class is an instance of ParameterTypeComponent
     */
    PARAMETER_TYPE_COMPONENT("ParameterTypeComponent"),

    /**
     * Assertion that the Class is an instance of ParameterValue
     */
    PARAMETER_VALUE("ParameterValue"),

    /**
     * Assertion that the Class is an instance of ParameterValueSet
     */
    PARAMETER_VALUE_SET("ParameterValueSet"),

    /**
     * Assertion that the Class is an instance of ParameterValueSetBase
     */
    PARAMETER_VALUE_SET_BASE("ParameterValueSetBase"),

    /**
     * Assertion that the Class is an instance of ParametricConstraint
     */
    PARAMETRIC_CONSTRAINT("ParametricConstraint"),

    /**
     * Assertion that the Class is an instance of Participant
     */
    PARTICIPANT("Participant"),

    /**
     * Assertion that the Class is an instance of ParticipantPermission
     */
    PARTICIPANT_PERMISSION("ParticipantPermission"),

    /**
     * Assertion that the Class is an instance of ParticipantRole
     */
    PARTICIPANT_ROLE("ParticipantRole"),

    /**
     * Assertion that the Class is an instance of Person
     */
    PERSON("Person"),

    /**
     * Assertion that the Class is an instance of PersonPermission
     */
    PERSON_PERMISSION("PersonPermission"),

    /**
     * Assertion that the Class is an instance of PersonRole
     */
    PERSON_ROLE("PersonRole"),

    /**
     * Assertion that the Class is an instance of Point
     */
    POINT("Point"),

    /**
     * Assertion that the Class is an instance of PossibleFiniteState
     */
    POSSIBLE_FINITE_STATE("PossibleFiniteState"),

    /**
     * Assertion that the Class is an instance of PossibleFiniteStateList
     */
    POSSIBLE_FINITE_STATE_LIST("PossibleFiniteStateList"),

    /**
     * Assertion that the Class is an instance of PrefixedUnit
     */
    PREFIXED_UNIT("PrefixedUnit"),

    /**
     * Assertion that the Class is an instance of Publication
     */
    PUBLICATION("Publication"),

    /**
     * Assertion that the Class is an instance of QuantityKind
     */
    QUANTITY_KIND("QuantityKind"),

    /**
     * Assertion that the Class is an instance of QuantityKindFactor
     */
    QUANTITY_KIND_FACTOR("QuantityKindFactor"),

    /**
     * Assertion that the Class is an instance of RatioScale
     */
    RATIO_SCALE("RatioScale"),

    /**
     * Assertion that the Class is an instance of ReferenceDataLibrary
     */
    REFERENCE_DATA_LIBRARY("ReferenceDataLibrary"),

    /**
     * Assertion that the Class is an instance of ReferencerRule
     */
    REFERENCER_RULE("ReferencerRule"),

    /**
     * Assertion that the Class is an instance of ReferenceSource
     */
    REFERENCE_SOURCE("ReferenceSource"),

    /**
     * Assertion that the Class is an instance of RelationalExpression
     */
    RELATIONAL_EXPRESSION("RelationalExpression"),

    /**
     * Assertion that the Class is an instance of Relationship
     */
    RELATIONSHIP("Relationship"),

    /**
     * Assertion that the Class is an instance of RelationshipParameterValue
     */
    RELATIONSHIP_PARAMETER_VALUE("RelationshipParameterValue"),

    /**
     * Assertion that the Class is an instance of RequestForDeviation
     */
    REQUEST_FOR_DEVIATION("RequestForDeviation"),

    /**
     * Assertion that the Class is an instance of RequestForWaiver
     */
    REQUEST_FOR_WAIVER("RequestForWaiver"),

    /**
     * Assertion that the Class is an instance of Requirement
     */
    REQUIREMENT("Requirement"),

    /**
     * Assertion that the Class is an instance of RequirementsContainer
     */
    REQUIREMENTS_CONTAINER("RequirementsContainer"),

    /**
     * Assertion that the Class is an instance of RequirementsContainerParameterValue
     */
    REQUIREMENTS_CONTAINER_PARAMETER_VALUE("RequirementsContainerParameterValue"),

    /**
     * Assertion that the Class is an instance of RequirementsGroup
     */
    REQUIREMENTS_GROUP("RequirementsGroup"),

    /**
     * Assertion that the Class is an instance of RequirementsSpecification
     */
    REQUIREMENTS_SPECIFICATION("RequirementsSpecification"),

    /**
     * Assertion that the Class is an instance of ReviewItemDiscrepancy
     */
    REVIEW_ITEM_DISCREPANCY("ReviewItemDiscrepancy"),

    /**
     * Assertion that the Class is an instance of Rule
     */
    RULE("Rule"),

    /**
     * Assertion that the Class is an instance of RuleVerification
     */
    RULE_VERIFICATION("RuleVerification"),

    /**
     * Assertion that the Class is an instance of RuleVerificationList
     */
    RULE_VERIFICATION_LIST("RuleVerificationList"),

    /**
     * Assertion that the Class is an instance of RuleViolation
     */
    RULE_VIOLATION("RuleViolation"),

    /**
     * Assertion that the Class is an instance of ScalarParameterType
     */
    SCALAR_PARAMETER_TYPE("ScalarParameterType"),

    /**
     * Assertion that the Class is an instance of ScaleReferenceQuantityValue
     */
    SCALE_REFERENCE_QUANTITY_VALUE("ScaleReferenceQuantityValue"),

    /**
     * Assertion that the Class is an instance of ScaleValueDefinition
     */
    SCALE_VALUE_DEFINITION("ScaleValueDefinition"),

    /**
     * Assertion that the Class is an instance of Section
     */
    SECTION("Section"),

    /**
     * Assertion that the Class is an instance of SharedStyle
     */
    SHARED_STYLE("SharedStyle"),

    /**
     * Assertion that the Class is an instance of SimpleParameterizableThing
     */
    SIMPLE_PARAMETERIZABLE_THING("SimpleParameterizableThing"),

    /**
     * Assertion that the Class is an instance of SimpleParameterValue
     */
    SIMPLE_PARAMETER_VALUE("SimpleParameterValue"),

    /**
     * Assertion that the Class is an instance of SimpleQuantityKind
     */
    SIMPLE_QUANTITY_KIND("SimpleQuantityKind"),

    /**
     * Assertion that the Class is an instance of SimpleUnit
     */
    SIMPLE_UNIT("SimpleUnit"),

    /**
     * Assertion that the Class is an instance of SiteDirectory
     */
    SITE_DIRECTORY("SiteDirectory"),

    /**
     * Assertion that the Class is an instance of SiteDirectoryDataAnnotation
     */
    SITE_DIRECTORY_DATA_ANNOTATION("SiteDirectoryDataAnnotation"),

    /**
     * Assertion that the Class is an instance of SiteDirectoryDataDiscussionItem
     */
    SITE_DIRECTORY_DATA_DISCUSSION_ITEM("SiteDirectoryDataDiscussionItem"),

    /**
     * Assertion that the Class is an instance of SiteDirectoryThingReference
     */
    SITE_DIRECTORY_THING_REFERENCE("SiteDirectoryThingReference"),

    /**
     * Assertion that the Class is an instance of SiteLogEntry
     */
    SITE_LOG_ENTRY("SiteLogEntry"),

    /**
     * Assertion that the Class is an instance of SiteReferenceDataLibrary
     */
    SITE_REFERENCE_DATA_LIBRARY("SiteReferenceDataLibrary"),

    /**
     * Assertion that the Class is an instance of Solution
     */
    SOLUTION("Solution"),

    /**
     * Assertion that the Class is an instance of SpecializedQuantityKind
     */
    SPECIALIZED_QUANTITY_KIND("SpecializedQuantityKind"),

    /**
     * Assertion that the Class is an instance of Stakeholder
     */
    STAKEHOLDER("Stakeholder"),

    /**
     * Assertion that the Class is an instance of StakeholderValue
     */
    STAKEHOLDER_VALUE("StakeholderValue"),

    /**
     * Assertion that the Class is an instance of StakeHolderValueMap
     */
    STAKE_HOLDER_VALUE_MAP("StakeHolderValueMap"),

    /**
     * Assertion that the Class is an instance of StakeHolderValueMapSettings
     */
    STAKE_HOLDER_VALUE_MAP_SETTINGS("StakeHolderValueMapSettings"),

    /**
     * Assertion that the Class is an instance of TelephoneNumber
     */
    TELEPHONE_NUMBER("TelephoneNumber"),

    /**
     * Assertion that the Class is an instance of Term
     */
    TERM("Term"),

    /**
     * Assertion that the Class is an instance of TextParameterType
     */
    TEXT_PARAMETER_TYPE("TextParameterType"),

    /**
     * Assertion that the Class is an instance of TextualNote
     */
    TEXTUAL_NOTE("TextualNote"),

    /**
     * Assertion that the Class is an instance of Thing
     */
    THING("Thing"),

    /**
     * Assertion that the Class is an instance of ThingReference
     */
    THING_REFERENCE("ThingReference"),

    /**
     * Assertion that the Class is an instance of TimeOfDayParameterType
     */
    TIME_OF_DAY_PARAMETER_TYPE("TimeOfDayParameterType"),

    /**
     * Assertion that the Class is an instance of TopContainer
     */
    TOP_CONTAINER("TopContainer"),

    /**
     * Assertion that the Class is an instance of UnitFactor
     */
    UNIT_FACTOR("UnitFactor"),

    /**
     * Assertion that the Class is an instance of UnitPrefix
     */
    UNIT_PREFIX("UnitPrefix"),

    /**
     * Assertion that the Class is an instance of UserPreference
     */
    USER_PREFERENCE("UserPreference"),

    /**
     * Assertion that the Class is an instance of UserRuleVerification
     */
    USER_RULE_VERIFICATION("UserRuleVerification"),

    /**
     * Assertion that the Class is an instance of ValueGroup
     */
    VALUE_GROUP("ValueGroup");

    private String classKindName;

    ClassKind(String classKindName){
        this.classKindName = classKindName;
    }

    @Override
    public String toString() {
        return this.classKindName;
    }
}
