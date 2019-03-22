/* --------------------------------------------------------------------------------------------------------------------
 * DefaultPermissionProvider.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated DefaultPermissionProvider class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.helpers;

import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import cdp4common.commondata.ClassKind;

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
    private final Map<String, ParticipantAccessRightKind> typeNameParticipantPermissionMap = new HashMap<>();

    /**
     * The ClassKind to default participant permission map.
     */
    private final Map<ClassKind, ParticipantAccessRightKind> classKindParticipantPermissionMap = new HashMap<>();

    /**
     * The type to default participant permission map.
     */
    private final Map<String, PersonAccessRightKind> typeNamePersonPermissionMap = new HashMap<>();

    /**
     * The ClassKind to default participant permission map.
     */
    private final Map<ClassKind, PersonAccessRightKind> classKindPersonPermissionMap = new HashMap<>();

    /**
     * The constructor that initializes maps of default permissions
     */
    public DefaultPermissionProviderImpl() {
        typeNameParticipantPermissionMap.put("ActionItem", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ActualFiniteState", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ActualFiniteStateList", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("Alias", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("AndExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Approval", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ArrayParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("BinaryNote", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("BinaryRelationship", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("BinaryRelationshipRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Book", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("BooleanExpression", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("BooleanParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Bounds", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("BuiltInRuleVerification", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Category", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ChangeProposal", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ChangeRequest", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("Citation", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("Color", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("CommonFileStore", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("CompoundParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Constant", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ContractChangeNotice", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ContractDeviation", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ConversionBasedUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("CyclicRatioScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DateParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DateTimeParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DecompositionRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DefinedThing", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("Definition", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("DerivedQuantityKind", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DerivedUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DiagramCanvas", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("DiagramEdge", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DiagramElementContainer", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("DiagramElementThing", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("DiagrammingStyle", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("DiagramObject", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DiagramShape", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("DiagramThingBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("DiscussionItem", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("DomainFileStore", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("DomainOfExpertise", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("DomainOfExpertiseGroup", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ElementBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ElementDefinition", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ElementUsage", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("EmailAddress", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("EngineeringModel", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("EngineeringModelDataAnnotation", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("EngineeringModelDataDiscussionItem", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("EngineeringModelDataNote", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("EngineeringModelSetup", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("EnumerationParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("EnumerationValueDefinition", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ExclusiveOrExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("ExternalIdentifierMap", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("File", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("FileRevision", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("FileStore", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("FileType", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("Folder", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("GenericAnnotation", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("Glossary", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("Goal", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("HyperLink", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("IdCorrespondence", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("IntervalScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Iteration", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("IterationSetup", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("LinearConversionUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("LogarithmicScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("MappingToReferenceScale", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("MeasurementScale", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("MeasurementUnit", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ModellingAnnotationItem", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ModellingThingReference", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ModelLogEntry", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ModelReferenceDataLibrary", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("MultiRelationship", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("MultiRelationshipRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("NaturalLanguage", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("NestedElement", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("NestedParameter", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("Note", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("NotExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Option", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("OrdinalScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("OrExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Organization", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("OwnedStyle", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("Page", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("Parameter", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ParameterBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ParameterGroup", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ParameterizedCategoryRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("ParameterOrOverrideBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ParameterOverride", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ParameterOverrideValueSet", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ParameterSubscription", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ParameterSubscriptionValueSet", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ParameterType", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ParameterTypeComponent", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ParameterValue", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ParameterValueSet", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ParameterValueSetBase", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ParametricConstraint", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("Participant", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ParticipantPermission", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ParticipantRole", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("Person", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("PersonPermission", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("PersonRole", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("Point", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("PossibleFiniteState", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("PossibleFiniteStateList", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("PrefixedUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Publication", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("QuantityKind", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("QuantityKindFactor", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("RatioScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("ReferenceDataLibrary", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ReferencerRule", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("ReferenceSource", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("RelationalExpression", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Relationship", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("RelationshipParameterValue", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("RequestForDeviation", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("RequestForWaiver", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("Requirement", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("RequirementsContainer", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("RequirementsContainerParameterValue", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("RequirementsGroup", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("RequirementsSpecification", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("ReviewItemDiscrepancy", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("Rule", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("RuleVerification", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("RuleVerificationList", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("RuleViolation", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ScalarParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("ScaleReferenceQuantityValue", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("ScaleValueDefinition", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("Section", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("SharedStyle", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("SimpleParameterizableThing", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("SimpleParameterValue", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("SimpleQuantityKind", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("SimpleUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("SiteDirectory", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("SiteDirectoryDataAnnotation", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("SiteDirectoryDataDiscussionItem", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("SiteDirectoryThingReference", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("SiteLogEntry", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("SiteReferenceDataLibrary", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("Solution", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("SpecializedQuantityKind", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Stakeholder", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("StakeholderValue", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("StakeHolderValueMap", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("StakeHolderValueMapSettings", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("TelephoneNumber", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("Term", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("TextParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("TextualNote", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Thing", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("ThingReference", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("TimeOfDayParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("TopContainer", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("UnitFactor", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("UnitPrefix", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("UserPreference", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("UserRuleVerification", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("ValueGroup", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("NotThing", ParticipantAccessRightKind.NOT_APPLICABLE);

        classKindParticipantPermissionMap.put(ClassKind.ACTION_ITEM, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ACTUAL_FINITE_STATE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ACTUAL_FINITE_STATE_LIST, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ALIAS, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.AND_EXPRESSION, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.APPROVAL, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ARRAY_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.BINARY_NOTE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.BINARY_RELATIONSHIP, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.BINARY_RELATIONSHIP_RULE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.BOOK, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.BOOLEAN_EXPRESSION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.BOOLEAN_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.BOUNDS, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.BUILT_IN_RULE_VERIFICATION, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.CATEGORY, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.CHANGE_PROPOSAL, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.CHANGE_REQUEST, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.CITATION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.COLOR, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.COMMON_FILE_STORE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.COMPOUND_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.CONSTANT, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.CONTRACT_CHANGE_NOTICE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.CONTRACT_DEVIATION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.CONVERSION_BASED_UNIT, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.CYCLIC_RATIO_SCALE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DATE_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DATE_TIME_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DECOMPOSITION_RULE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DEFINED_THING, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DEFINITION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.DERIVED_QUANTITY_KIND, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DERIVED_UNIT, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DIAGRAM_CANVAS, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.DIAGRAM_EDGE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DIAGRAM_ELEMENT_CONTAINER, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DIAGRAM_ELEMENT_THING, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.DIAGRAMMING_STYLE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DIAGRAM_OBJECT, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DIAGRAM_SHAPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DIAGRAM_THING_BASE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DISCUSSION_ITEM, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DOMAIN_FILE_STORE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.DOMAIN_OF_EXPERTISE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DOMAIN_OF_EXPERTISE_GROUP, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ELEMENT_BASE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ELEMENT_DEFINITION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ELEMENT_USAGE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.EMAIL_ADDRESS, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ENGINEERING_MODEL, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ENGINEERING_MODEL_DATA_ANNOTATION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ENGINEERING_MODEL_DATA_DISCUSSION_ITEM, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ENGINEERING_MODEL_DATA_NOTE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ENGINEERING_MODEL_SETUP, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ENUMERATION_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ENUMERATION_VALUE_DEFINITION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.EXCLUSIVE_OR_EXPRESSION, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.EXTERNAL_IDENTIFIER_MAP, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.FILE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.FILE_REVISION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.FILE_STORE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.FILE_TYPE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.FOLDER, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.GENERIC_ANNOTATION, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.GLOSSARY, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.GOAL, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.HYPER_LINK, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ID_CORRESPONDENCE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.INTERVAL_SCALE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ITERATION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ITERATION_SETUP, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.LINEAR_CONVERSION_UNIT, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.LOGARITHMIC_SCALE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.MAPPING_TO_REFERENCE_SCALE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.MEASUREMENT_SCALE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.MEASUREMENT_UNIT, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.MODELLING_ANNOTATION_ITEM, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.MODELLING_THING_REFERENCE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.MODEL_LOG_ENTRY, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.MODEL_REFERENCE_DATA_LIBRARY, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.MULTI_RELATIONSHIP, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.MULTI_RELATIONSHIP_RULE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.NATURAL_LANGUAGE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.NESTED_ELEMENT, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.NESTED_PARAMETER, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.NOTE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.NOT_EXPRESSION, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.OPTION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ORDINAL_SCALE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.OR_EXPRESSION, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ORGANIZATION, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.OWNED_STYLE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PAGE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_BASE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_GROUP, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETERIZED_CATEGORY_RULE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_OR_OVERRIDE_BASE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_OVERRIDE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_OVERRIDE_VALUE_SET, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_SUBSCRIPTION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_SUBSCRIPTION_VALUE_SET, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_TYPE_COMPONENT, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_VALUE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_VALUE_SET, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETER_VALUE_SET_BASE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PARAMETRIC_CONSTRAINT, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PARTICIPANT, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PARTICIPANT_PERMISSION, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PARTICIPANT_ROLE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PERSON, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PERSON_PERMISSION, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PERSON_ROLE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.POINT, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.POSSIBLE_FINITE_STATE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.POSSIBLE_FINITE_STATE_LIST, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.PREFIXED_UNIT, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.PUBLICATION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.QUANTITY_KIND, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.QUANTITY_KIND_FACTOR, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RATIO_SCALE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.REFERENCE_DATA_LIBRARY, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.REFERENCER_RULE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.REFERENCE_SOURCE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RELATIONAL_EXPRESSION, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.RELATIONSHIP, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.RELATIONSHIP_PARAMETER_VALUE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.REQUEST_FOR_DEVIATION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.REQUEST_FOR_WAIVER, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.REQUIREMENT, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.REQUIREMENTS_CONTAINER, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.REQUIREMENTS_CONTAINER_PARAMETER_VALUE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.REQUIREMENTS_GROUP, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.REQUIREMENTS_SPECIFICATION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.REVIEW_ITEM_DISCREPANCY, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.RULE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RULE_VERIFICATION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RULE_VERIFICATION_LIST, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.RULE_VIOLATION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.SCALAR_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.SCALE_REFERENCE_QUANTITY_VALUE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.SCALE_VALUE_DEFINITION, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.SECTION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.SHARED_STYLE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.SIMPLE_PARAMETERIZABLE_THING, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SIMPLE_PARAMETER_VALUE, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.SIMPLE_QUANTITY_KIND, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.SIMPLE_UNIT, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.SITE_DIRECTORY, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SITE_DIRECTORY_DATA_ANNOTATION, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SITE_DIRECTORY_DATA_DISCUSSION_ITEM, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SITE_DIRECTORY_THING_REFERENCE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SITE_LOG_ENTRY, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SITE_REFERENCE_DATA_LIBRARY, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SOLUTION, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.SPECIALIZED_QUANTITY_KIND, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.STAKEHOLDER, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.STAKEHOLDER_VALUE, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.STAKE_HOLDER_VALUE_MAP, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.STAKE_HOLDER_VALUE_MAP_SETTINGS, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.TELEPHONE_NUMBER, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.TERM, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.TEXT_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.TEXTUAL_NOTE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.THING, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.THING_REFERENCE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.TIME_OF_DAY_PARAMETER_TYPE, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.TOP_CONTAINER, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.UNIT_FACTOR, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.UNIT_PREFIX, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.USER_PREFERENCE, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.USER_RULE_VERIFICATION, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.VALUE_GROUP, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.NOT_THING, ParticipantAccessRightKind.NOT_APPLICABLE);

        typeNamePersonPermissionMap.put("ActionItem", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ActualFiniteState", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ActualFiniteStateList", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Alias", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("AndExpression", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Approval", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ArrayParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("BinaryNote", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("BinaryRelationship", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("BinaryRelationshipRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("Book", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("BooleanExpression", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("BooleanParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("Bounds", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("BuiltInRuleVerification", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Category", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("ChangeProposal", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ChangeRequest", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Citation", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("Color", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("CommonFileStore", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("CompoundParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("Constant", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("ContractChangeNotice", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ContractDeviation", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ConversionBasedUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("CyclicRatioScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("DateParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("DateTimeParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("DecompositionRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("DefinedThing", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Definition", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("DerivedQuantityKind", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("DerivedUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("DiagramCanvas", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DiagramEdge", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DiagramElementContainer", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DiagramElementThing", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DiagrammingStyle", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DiagramObject", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DiagramShape", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DiagramThingBase", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DiscussionItem", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DomainFileStore", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("DomainOfExpertise", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("DomainOfExpertiseGroup", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("ElementBase", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ElementDefinition", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ElementUsage", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("EmailAddress", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("EngineeringModel", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("EngineeringModelDataAnnotation", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("EngineeringModelDataDiscussionItem", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("EngineeringModelDataNote", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("EngineeringModelSetup", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("EnumerationParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("EnumerationValueDefinition", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("ExclusiveOrExpression", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ExternalIdentifierMap", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("File", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("FileRevision", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("FileStore", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("FileType", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("Folder", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("GenericAnnotation", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Glossary", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("Goal", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("HyperLink", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("IdCorrespondence", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("IntervalScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("Iteration", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("IterationSetup", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("LinearConversionUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("LogarithmicScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("MappingToReferenceScale", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("MeasurementScale", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("MeasurementUnit", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("ModellingAnnotationItem", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ModellingThingReference", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ModelLogEntry", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ModelReferenceDataLibrary", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("MultiRelationship", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("MultiRelationshipRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("NaturalLanguage", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("NestedElement", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("NestedParameter", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Note", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("NotExpression", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Option", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("OrdinalScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("OrExpression", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Organization", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("OwnedStyle", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Page", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Parameter", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterBase", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterGroup", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterizedCategoryRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("ParameterOrOverrideBase", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterOverride", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterOverrideValueSet", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterSubscription", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterSubscriptionValueSet", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterType", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("ParameterTypeComponent", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("ParameterValue", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterValueSet", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParameterValueSetBase", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ParametricConstraint", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Participant", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("ParticipantPermission", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("ParticipantRole", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("Person", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("PersonPermission", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("PersonRole", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("Point", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("PossibleFiniteState", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("PossibleFiniteStateList", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("PrefixedUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("Publication", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("QuantityKind", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("QuantityKindFactor", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("RatioScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("ReferenceDataLibrary", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ReferencerRule", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("ReferenceSource", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("RelationalExpression", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Relationship", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RelationshipParameterValue", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RequestForDeviation", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RequestForWaiver", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Requirement", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RequirementsContainer", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RequirementsContainerParameterValue", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RequirementsGroup", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RequirementsSpecification", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ReviewItemDiscrepancy", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Rule", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("RuleVerification", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RuleVerificationList", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("RuleViolation", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ScalarParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("ScaleReferenceQuantityValue", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("ScaleValueDefinition", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("Section", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("SharedStyle", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("SimpleParameterizableThing", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("SimpleParameterValue", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("SimpleQuantityKind", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("SimpleUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("SiteDirectory", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("SiteDirectoryDataAnnotation", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("SiteDirectoryDataDiscussionItem", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("SiteDirectoryThingReference", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("SiteLogEntry", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("SiteReferenceDataLibrary", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("Solution", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("SpecializedQuantityKind", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("Stakeholder", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("StakeholderValue", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("StakeHolderValueMap", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("StakeHolderValueMapSettings", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("TelephoneNumber", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("Term", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("TextParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("TextualNote", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("Thing", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ThingReference", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("TimeOfDayParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("TopContainer", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("UnitFactor", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("UnitPrefix", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("UserPreference", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("UserRuleVerification", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("ValueGroup", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("NotThing", PersonAccessRightKind.NOT_APPLICABLE);

        classKindPersonPermissionMap.put(ClassKind.ACTION_ITEM, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ACTUAL_FINITE_STATE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ACTUAL_FINITE_STATE_LIST, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ALIAS, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.AND_EXPRESSION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.APPROVAL, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ARRAY_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.BINARY_NOTE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BINARY_RELATIONSHIP, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BINARY_RELATIONSHIP_RULE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.BOOK, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BOOLEAN_EXPRESSION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BOOLEAN_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.BOUNDS, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BUILT_IN_RULE_VERIFICATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.CATEGORY, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.CHANGE_PROPOSAL, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.CHANGE_REQUEST, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.CITATION, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.COLOR, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.COMMON_FILE_STORE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.COMPOUND_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.CONSTANT, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.CONTRACT_CHANGE_NOTICE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.CONTRACT_DEVIATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.CONVERSION_BASED_UNIT, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.CYCLIC_RATIO_SCALE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DATE_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DATE_TIME_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DECOMPOSITION_RULE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DEFINED_THING, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DEFINITION, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.DERIVED_QUANTITY_KIND, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DERIVED_UNIT, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DIAGRAM_CANVAS, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DIAGRAM_EDGE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DIAGRAM_ELEMENT_CONTAINER, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DIAGRAM_ELEMENT_THING, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DIAGRAMMING_STYLE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DIAGRAM_OBJECT, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DIAGRAM_SHAPE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DIAGRAM_THING_BASE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DISCUSSION_ITEM, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DOMAIN_FILE_STORE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DOMAIN_OF_EXPERTISE, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.DOMAIN_OF_EXPERTISE_GROUP, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.ELEMENT_BASE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ELEMENT_DEFINITION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ELEMENT_USAGE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.EMAIL_ADDRESS, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ENGINEERING_MODEL, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ENGINEERING_MODEL_DATA_ANNOTATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ENGINEERING_MODEL_DATA_DISCUSSION_ITEM, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ENGINEERING_MODEL_DATA_NOTE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ENGINEERING_MODEL_SETUP, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.ENUMERATION_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.ENUMERATION_VALUE_DEFINITION, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.EXCLUSIVE_OR_EXPRESSION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.EXTERNAL_IDENTIFIER_MAP, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.FILE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.FILE_REVISION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.FILE_STORE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.FILE_TYPE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.FOLDER, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.GENERIC_ANNOTATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.GLOSSARY, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.GOAL, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.HYPER_LINK, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ID_CORRESPONDENCE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.INTERVAL_SCALE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.ITERATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ITERATION_SETUP, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.LINEAR_CONVERSION_UNIT, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.LOGARITHMIC_SCALE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.MAPPING_TO_REFERENCE_SCALE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.MEASUREMENT_SCALE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.MEASUREMENT_UNIT, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.MODELLING_ANNOTATION_ITEM, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.MODELLING_THING_REFERENCE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.MODEL_LOG_ENTRY, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.MODEL_REFERENCE_DATA_LIBRARY, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.MULTI_RELATIONSHIP, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.MULTI_RELATIONSHIP_RULE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.NATURAL_LANGUAGE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.NESTED_ELEMENT, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.NESTED_PARAMETER, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.NOTE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.NOT_EXPRESSION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.OPTION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ORDINAL_SCALE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.OR_EXPRESSION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ORGANIZATION, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.OWNED_STYLE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PAGE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_BASE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_GROUP, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETERIZED_CATEGORY_RULE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_OR_OVERRIDE_BASE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_OVERRIDE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_OVERRIDE_VALUE_SET, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_SUBSCRIPTION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_SUBSCRIPTION_VALUE_SET, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_TYPE_COMPONENT, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_VALUE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_VALUE_SET, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETER_VALUE_SET_BASE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARAMETRIC_CONSTRAINT, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PARTICIPANT, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.PARTICIPANT_PERMISSION, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.PARTICIPANT_ROLE, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.PERSON, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.PERSON_PERMISSION, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.PERSON_ROLE, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.POINT, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.POSSIBLE_FINITE_STATE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.POSSIBLE_FINITE_STATE_LIST, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PREFIXED_UNIT, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.PUBLICATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.QUANTITY_KIND, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.QUANTITY_KIND_FACTOR, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.RATIO_SCALE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.REFERENCE_DATA_LIBRARY, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REFERENCER_RULE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.REFERENCE_SOURCE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.RELATIONAL_EXPRESSION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RELATIONSHIP, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RELATIONSHIP_PARAMETER_VALUE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REQUEST_FOR_DEVIATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REQUEST_FOR_WAIVER, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REQUIREMENT, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REQUIREMENTS_CONTAINER, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REQUIREMENTS_CONTAINER_PARAMETER_VALUE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REQUIREMENTS_GROUP, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REQUIREMENTS_SPECIFICATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.REVIEW_ITEM_DISCREPANCY, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RULE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.RULE_VERIFICATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RULE_VERIFICATION_LIST, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RULE_VIOLATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SCALAR_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.SCALE_REFERENCE_QUANTITY_VALUE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.SCALE_VALUE_DEFINITION, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.SECTION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SHARED_STYLE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SIMPLE_PARAMETERIZABLE_THING, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SIMPLE_PARAMETER_VALUE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SIMPLE_QUANTITY_KIND, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.SIMPLE_UNIT, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.SITE_DIRECTORY, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SITE_DIRECTORY_DATA_ANNOTATION, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SITE_DIRECTORY_DATA_DISCUSSION_ITEM, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SITE_DIRECTORY_THING_REFERENCE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.SITE_LOG_ENTRY, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SITE_REFERENCE_DATA_LIBRARY, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SOLUTION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SPECIALIZED_QUANTITY_KIND, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.STAKEHOLDER, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.STAKEHOLDER_VALUE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.STAKE_HOLDER_VALUE_MAP, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.STAKE_HOLDER_VALUE_MAP_SETTINGS, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.TELEPHONE_NUMBER, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.TERM, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.TEXT_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.TEXTUAL_NOTE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.THING, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.THING_REFERENCE, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.TIME_OF_DAY_PARAMETER_TYPE, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.TOP_CONTAINER, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.UNIT_FACTOR, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.UNIT_PREFIX, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.USER_PREFERENCE, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.USER_RULE_VERIFICATION, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.VALUE_GROUP, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.NOT_THING, PersonAccessRightKind.NOT_APPLICABLE);
    }

    /**
     * Return the default {@link ParticipantAccessRightKind} for the supplied {@link ClassKind}.
     *
     * @param classKind The {@link ClassKind} for which the {@link ParticipantAccessRightKind} is to be returned.
     * @return The default {@link ParticipantAccessRightKind}
     * @throws IllegalArgumentException If {@link ClassKind} not found, this should never happen
     */
    public ParticipantAccessRightKind getDefaultParticipantPermission(ClassKind classKind) {
        if (!this.classKindParticipantPermissionMap.containsKey(classKind)) {
            throw new IllegalArgumentException(String.format("%1$s does not have a default permission set", classKind));
        }

        return this.classKindParticipantPermissionMap.get(classKind);
    }

    /**
     * Return the default {@link ParticipantAccessRightKind} for the supplied type.
     *
     * @param typeName The type name for which the {@link ParticipantAccessRightKind} is to be returned.
     * @return The default {@link ParticipantAccessRightKind}
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    public ParticipantAccessRightKind getDefaultParticipantPermission(String typeName) {
        if (!this.typeNameParticipantPermissionMap.containsKey(typeName)) {
            throw new IllegalArgumentException(String.format("%1$s does not have a default permission set", typeName));
        }

        return this.typeNameParticipantPermissionMap.get(typeName);
    }

    /**
     * Return the default {@link PersonAccessRightKind} for the supplied {@link ClassKind}.
     *
     * @param classKind The {@link ClassKind} for which the {@link PersonAccessRightKind} is to be returned.
     * @return The default {@link PersonAccessRightKind}.
     * @throws IllegalArgumentException If {@link ClassKind} not found, this should never happen
     */
    public PersonAccessRightKind getDefaultPersonPermission(ClassKind classKind) {
        if (!this.classKindPersonPermissionMap.containsKey(classKind)) {
            throw new IllegalArgumentException(String.format("%1$s does not have a default permission set", classKind));
        }

        return this.classKindPersonPermissionMap.get(classKind);
    }

    /**
     * Return the default {@link PersonAccessRightKind} for the supplied type.
     *
     * @param typeName The type name for which the {@link PersonAccessRightKind} is to be returned.
     * @return The default {@link PersonAccessRightKind}.
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    public PersonAccessRightKind getDefaultPersonPermission(String typeName) {
        if (!this.typeNamePersonPermissionMap.containsKey(typeName)) {
            throw new IllegalArgumentException(String.format("%1$s does not have a default permission set", typeName));
        }

        return this.typeNamePersonPermissionMap.get(typeName);
    }

    /**
     * Get a stream of {@link Map.Entry} with a class type and the default {@link ParticipantAccessRightKind} for it.
     *
     * @return {@link Stream} of default participant permissions.
     */
    public Stream<Map.Entry<String, ParticipantAccessRightKind>> getDefaultTypeNameParticipantPermissions(){
        return this.typeNameParticipantPermissionMap.entrySet().stream();
    }

    /**
     * Get a stream of {@link Map.Entry} with a {@link ClassKind} and the default {@link ParticipantAccessRightKind} for it.
     *
     * @return {@link Stream} of default participant permissions.
     */
    public Stream<Map.Entry<ClassKind, ParticipantAccessRightKind>> getDefaultClassKindParticipantPermissions(){
        return this.classKindParticipantPermissionMap.entrySet().stream();
    }

    /**
     * Get a stream of {@link Map.Entry} with a class type and the default {@link PersonAccessRightKind} for it.
     *
     * @return {@link Stream} of default person permissions.
     */
    public Stream<Map.Entry<String, PersonAccessRightKind>> getDefaultTypeNamePersonPermissions(){
        return this.typeNamePersonPermissionMap.entrySet().stream();
    }

    /**
     * Get a stream of {@link Map.Entry} with a {@link ClassKind} and the default {@link PersonAccessRightKind} for it.
     *
     * @return {@link Stream} of default person permissions.
     */
    public Stream<Map.Entry<ClassKind, PersonAccessRightKind>> getDefaultClassKindPersonPermissions(){
        return this.classKindPersonPermissionMap.entrySet().stream();
    }
}
