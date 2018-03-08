/* --------------------------------------------------------------------------------------------------------------------
 * DefaultPermissionProvider.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated DefaultPermissionProvider class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.helpers;

import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * A utility class that supplies common functionalities to the Service layer.
 */
public class DefaultPermissionProviderImpl implements DefaultPermissionProvider {
    /**
     * The type to default participant permission map.
     */
    private final Map<String, ParticipantAccessRightKind> participantPermissionMap = new HashMap<>();

    /**
     * The type to default participant permission map.
     */
    private final Map<String, PersonAccessRightKind> personPermissionMap = new HashMap<>();

    /**
     * The constructor that initializes maps of default permissions
     */
    public DefaultPermissionProviderImpl() {
        participantPermissionMap.put("ActionItem", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ActualFiniteState", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ActualFiniteStateList", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("Alias", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("AndExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Approval", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ArrayParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("BinaryNote", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("BinaryRelationship", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("BinaryRelationshipRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Book", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("BooleanExpression", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("BooleanParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Bounds", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("BuiltInRuleVerification", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Category", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ChangeProposal", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ChangeRequest", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("Citation", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("Color", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("CommonFileStore", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("CompoundParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Constant", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ContractChangeNotice", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ContractDeviation", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ConversionBasedUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("CyclicRatioScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DateParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DateTimeParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DecompositionRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DefinedThing", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("Definition", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("DerivedQuantityKind", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DerivedUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DiagramCanvas", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("DiagramEdge", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DiagramElementContainer", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("DiagramElementThing", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("DiagrammingStyle", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("DiagramObject", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DiagramShape", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("DiagramThingBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("DiscussionItem", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("DomainFileStore", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("DomainOfExpertise", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("DomainOfExpertiseGroup", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ElementBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ElementDefinition", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ElementUsage", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("EmailAddress", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("EngineeringModel", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("EngineeringModelDataAnnotation", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("EngineeringModelDataDiscussionItem", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("EngineeringModelDataNote", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("EngineeringModelSetup", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("EnumerationParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("EnumerationValueDefinition", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ExclusiveOrExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("ExternalIdentifierMap", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("File", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("FileRevision", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("FileStore", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("FileType", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("Folder", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("GenericAnnotation", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("Glossary", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("Goal", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("HyperLink", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("IdCorrespondence", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("IntervalScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Iteration", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("IterationSetup", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("LinearConversionUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("LogarithmicScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("MappingToReferenceScale", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("MeasurementScale", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("MeasurementUnit", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ModellingAnnotationItem", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ModellingThingReference", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ModelLogEntry", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ModelReferenceDataLibrary", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("MultiRelationship", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("MultiRelationshipRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("NaturalLanguage", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("NestedElement", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("NestedParameter", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("Note", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("NotExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Option", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("OrdinalScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("OrExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Organization", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("OwnedStyle", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("Page", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("Parameter", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ParameterBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ParameterGroup", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ParameterizedCategoryRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("ParameterOrOverrideBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ParameterOverride", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ParameterOverrideValueSet", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ParameterSubscription", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ParameterSubscriptionValueSet", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ParameterType", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ParameterTypeComponent", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ParameterValue", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ParameterValueSet", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ParameterValueSetBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ParametricConstraint", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("Participant", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ParticipantPermission", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ParticipantRole", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("Person", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("PersonPermission", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("PersonRole", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("Point", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("PossibleFiniteState", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("PossibleFiniteStateList", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("PrefixedUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Publication", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("QuantityKind", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("QuantityKindFactor", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("RatioScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("ReferenceDataLibrary", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ReferencerRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("ReferenceSource", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("RelationalExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Relationship", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("RelationshipParameterValue", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("RequestForDeviation", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("RequestForWaiver", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("Requirement", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("RequirementsContainer", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("RequirementsContainerParameterValue", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("RequirementsGroup", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("RequirementsSpecification", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("ReviewItemDiscrepancy", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("Rule", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("RuleVerification", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("RuleVerificationList", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("RuleViolation", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ScalarParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("ScaleReferenceQuantityValue", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("ScaleValueDefinition", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("Section", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("SharedStyle", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("SimpleParameterizableThing", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("SimpleParameterValue", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("SimpleQuantityKind", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("SimpleUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("SiteDirectory", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("SiteDirectoryDataAnnotation", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("SiteDirectoryDataDiscussionItem", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("SiteDirectoryThingReference", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("SiteLogEntry", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("SiteReferenceDataLibrary", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("Solution", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("SpecializedQuantityKind", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Stakeholder", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("StakeholderValue", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("StakeHolderValueMap", ParticipantAccessRightKind.NONE);
        participantPermissionMap.put("StakeHolderValueMapSettings", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("TelephoneNumber", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("Term", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("TextParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("TextualNote", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("Thing", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("ThingReference", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("TimeOfDayParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("TopContainer", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("UnitFactor", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("UnitPrefix", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        participantPermissionMap.put("UserPreference", ParticipantAccessRightKind.NOT_APPLICABLE);
        participantPermissionMap.put("UserRuleVerification", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        participantPermissionMap.put("ValueGroup", ParticipantAccessRightKind.NONE);

        personPermissionMap.put("ActionItem", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ActualFiniteState", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ActualFiniteStateList", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Alias", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("AndExpression", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Approval", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ArrayParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("BinaryNote", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("BinaryRelationship", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("BinaryRelationshipRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("Book", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("BooleanExpression", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("BooleanParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("Bounds", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("BuiltInRuleVerification", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Category", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("ChangeProposal", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ChangeRequest", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Citation", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("Color", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("CommonFileStore", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("CompoundParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("Constant", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("ContractChangeNotice", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ContractDeviation", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ConversionBasedUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("CyclicRatioScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("DateParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("DateTimeParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("DecompositionRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("DefinedThing", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Definition", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("DerivedQuantityKind", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("DerivedUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("DiagramCanvas", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DiagramEdge", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DiagramElementContainer", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DiagramElementThing", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DiagrammingStyle", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DiagramObject", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DiagramShape", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DiagramThingBase", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DiscussionItem", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DomainFileStore", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("DomainOfExpertise", PersonAccessRightKind.NONE);
        personPermissionMap.put("DomainOfExpertiseGroup", PersonAccessRightKind.NONE);
        personPermissionMap.put("ElementBase", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ElementDefinition", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ElementUsage", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("EmailAddress", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("EngineeringModel", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("EngineeringModelDataAnnotation", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("EngineeringModelDataDiscussionItem", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("EngineeringModelDataNote", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("EngineeringModelSetup", PersonAccessRightKind.NONE);
        personPermissionMap.put("EnumerationParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("EnumerationValueDefinition", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("ExclusiveOrExpression", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ExternalIdentifierMap", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("File", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("FileRevision", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("FileStore", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("FileType", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("Folder", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("GenericAnnotation", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Glossary", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("Goal", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("HyperLink", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("IdCorrespondence", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("IntervalScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("Iteration", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("IterationSetup", PersonAccessRightKind.NONE);
        personPermissionMap.put("LinearConversionUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("LogarithmicScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("MappingToReferenceScale", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("MeasurementScale", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("MeasurementUnit", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("ModellingAnnotationItem", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ModellingThingReference", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ModelLogEntry", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ModelReferenceDataLibrary", PersonAccessRightKind.NONE);
        personPermissionMap.put("MultiRelationship", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("MultiRelationshipRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("NaturalLanguage", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("NestedElement", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("NestedParameter", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Note", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("NotExpression", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Option", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("OrdinalScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("OrExpression", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Organization", PersonAccessRightKind.NONE);
        personPermissionMap.put("OwnedStyle", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Page", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Parameter", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterBase", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterGroup", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterizedCategoryRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("ParameterOrOverrideBase", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterOverride", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterOverrideValueSet", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterSubscription", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterSubscriptionValueSet", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterType", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("ParameterTypeComponent", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("ParameterValue", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterValueSet", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParameterValueSetBase", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ParametricConstraint", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Participant", PersonAccessRightKind.NONE);
        personPermissionMap.put("ParticipantPermission", PersonAccessRightKind.NONE);
        personPermissionMap.put("ParticipantRole", PersonAccessRightKind.NONE);
        personPermissionMap.put("Person", PersonAccessRightKind.NONE);
        personPermissionMap.put("PersonPermission", PersonAccessRightKind.NONE);
        personPermissionMap.put("PersonRole", PersonAccessRightKind.NONE);
        personPermissionMap.put("Point", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("PossibleFiniteState", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("PossibleFiniteStateList", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("PrefixedUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("Publication", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("QuantityKind", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("QuantityKindFactor", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("RatioScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("ReferenceDataLibrary", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ReferencerRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("ReferenceSource", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("RelationalExpression", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Relationship", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RelationshipParameterValue", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RequestForDeviation", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RequestForWaiver", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Requirement", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RequirementsContainer", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RequirementsContainerParameterValue", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RequirementsGroup", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RequirementsSpecification", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ReviewItemDiscrepancy", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Rule", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("RuleVerification", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RuleVerificationList", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("RuleViolation", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ScalarParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("ScaleReferenceQuantityValue", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("ScaleValueDefinition", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("Section", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("SharedStyle", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("SimpleParameterizableThing", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("SimpleParameterValue", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("SimpleQuantityKind", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("SimpleUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("SiteDirectory", PersonAccessRightKind.NONE);
        personPermissionMap.put("SiteDirectoryDataAnnotation", PersonAccessRightKind.NONE);
        personPermissionMap.put("SiteDirectoryDataDiscussionItem", PersonAccessRightKind.NONE);
        personPermissionMap.put("SiteDirectoryThingReference", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("SiteLogEntry", PersonAccessRightKind.NONE);
        personPermissionMap.put("SiteReferenceDataLibrary", PersonAccessRightKind.NONE);
        personPermissionMap.put("Solution", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("SpecializedQuantityKind", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("Stakeholder", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("StakeholderValue", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("StakeHolderValueMap", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("StakeHolderValueMapSettings", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("TelephoneNumber", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("Term", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("TextParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("TextualNote", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("Thing", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ThingReference", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("TimeOfDayParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        personPermissionMap.put("TopContainer", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("UnitFactor", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("UnitPrefix", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("UserPreference", PersonAccessRightKind.SAME_AS_CONTAINER);
        personPermissionMap.put("UserRuleVerification", PersonAccessRightKind.NOT_APPLICABLE);
        personPermissionMap.put("ValueGroup", PersonAccessRightKind.NOT_APPLICABLE);
    }

    /**
     * Return the default {@link ParticipantAccessRightKind} for the supplied type.
     *
     * @param typeName The type name for which the {@link ParticipantAccessRightKind} is to be returned.
     * @return The default {@link ParticipantAccessRightKind}
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    public ParticipantAccessRightKind getDefaultParticipantPermission(String typeName) {
        if (!this.participantPermissionMap.containsKey(typeName)) {
            throw new IllegalArgumentException(String.format("%1$s does not have a default permission set", typeName));
        }

        return this.participantPermissionMap.get(typeName);
    }

    /**
     * Return the default {@link PersonAccessRightKind} for the supplied type.
     *
     * @param typeName The type name for which the {@link PersonAccessRightKind} is to be returned.
     * @return The default {@link PersonAccessRightKind}.
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    public PersonAccessRightKind getDefaultPersonPermission(String typeName) {
        if (!this.personPermissionMap.containsKey(typeName)) {
            throw new IllegalArgumentException(String.format("%1$s does not have a default permission set", typeName));
        }

        return this.personPermissionMap.get(typeName);
    }

    /**
     * Get a stream of {@link Map.Entry} with a class type and the default {@link ParticipantAccessRightKind} for it.
     *
     * @return {@link Stream} of default participant permissions.
     */
    public Stream<Map.Entry<String, ParticipantAccessRightKind>> getDefaultParticipantPermissions(){
        return this.participantPermissionMap.entrySet().stream();
    }

    /**
     * Get a stream of {@link Map.Entry} with a class type and the default {@link PersonAccessRightKind} for it.
     *
     * @return {@link Stream} of default person permissions.
     */
    public Stream<Map.Entry<String, PersonAccessRightKind>> getDefaultPersonPermissions(){
        return this.personPermissionMap.entrySet().stream();
    }
}
