/* --------------------------------------------------------------------------------------------------------------------
 * DefaultPermissionProvider.java
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
        typeNameParticipantPermissionMap.put("DependentParameterTypeAssignment", ParticipantAccessRightKind.SAME_AS_CONTAINER);
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
        typeNameParticipantPermissionMap.put("IndependentParameterTypeAssignment", ParticipantAccessRightKind.SAME_AS_CONTAINER);
        typeNameParticipantPermissionMap.put("IntervalScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("Iteration", ParticipantAccessRightKind.NONE);
        typeNameParticipantPermissionMap.put("IterationSetup", ParticipantAccessRightKind.NOT_APPLICABLE);
        typeNameParticipantPermissionMap.put("LinearConversionUnit", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("LogarithmicScale", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        typeNameParticipantPermissionMap.put("LogEntryChangelogItem", ParticipantAccessRightKind.SAME_AS_CONTAINER);
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
        typeNameParticipantPermissionMap.put("OrganizationalParticipant", ParticipantAccessRightKind.SAME_AS_CONTAINER);
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
        typeNameParticipantPermissionMap.put("SampledFunctionParameterType", ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
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

        classKindParticipantPermissionMap.put(ClassKind.ActionItem, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ActualFiniteState, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ActualFiniteStateList, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.Alias, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.AndExpression, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Approval, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ArrayParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.BinaryNote, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.BinaryRelationship, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.BinaryRelationshipRule, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Book, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.BooleanExpression, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.BooleanParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Bounds, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.BuiltInRuleVerification, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Category, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ChangeProposal, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ChangeRequest, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.Citation, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.Color, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.CommonFileStore, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.CompoundParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Constant, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ContractChangeNotice, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ContractDeviation, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ConversionBasedUnit, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.CyclicRatioScale, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DateParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DateTimeParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DecompositionRule, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DefinedThing, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.Definition, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.DependentParameterTypeAssignment, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.DerivedQuantityKind, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DerivedUnit, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DiagramCanvas, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.DiagramEdge, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DiagramElementContainer, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DiagramElementThing, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.DiagrammingStyle, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DiagramObject, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DiagramShape, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.DiagramThingBase, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DiscussionItem, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DomainFileStore, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.DomainOfExpertise, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.DomainOfExpertiseGroup, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ElementBase, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ElementDefinition, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ElementUsage, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.EmailAddress, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.EngineeringModel, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.EngineeringModelDataAnnotation, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.EngineeringModelDataDiscussionItem, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.EngineeringModelDataNote, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.EngineeringModelSetup, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.EnumerationParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.EnumerationValueDefinition, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ExclusiveOrExpression, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ExternalIdentifierMap, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.File, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.FileRevision, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.FileStore, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.FileType, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.Folder, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.GenericAnnotation, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.Glossary, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.Goal, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.HyperLink, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.IdCorrespondence, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.IndependentParameterTypeAssignment, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.IntervalScale, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Iteration, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.IterationSetup, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.LinearConversionUnit, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.LogarithmicScale, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.LogEntryChangelogItem, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.MappingToReferenceScale, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.MeasurementScale, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.MeasurementUnit, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ModellingAnnotationItem, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ModellingThingReference, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ModelLogEntry, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ModelReferenceDataLibrary, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.MultiRelationship, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.MultiRelationshipRule, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.NaturalLanguage, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.NestedElement, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.NestedParameter, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.Note, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.NotExpression, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Option, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.OrdinalScale, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.OrExpression, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Organization, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.OrganizationalParticipant, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.OwnedStyle, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.Page, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.Parameter, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ParameterBase, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ParameterGroup, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ParameterizedCategoryRule, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ParameterOrOverrideBase, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ParameterOverride, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ParameterOverrideValueSet, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ParameterSubscription, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ParameterSubscriptionValueSet, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ParameterType, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ParameterTypeComponent, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ParameterValue, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ParameterValueSet, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ParameterValueSetBase, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ParametricConstraint, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.Participant, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ParticipantPermission, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ParticipantRole, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.Person, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PersonPermission, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.PersonRole, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.Point, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PossibleFiniteState, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.PossibleFiniteStateList, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.PrefixedUnit, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Publication, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.QuantityKind, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.QuantityKindFactor, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RatioScale, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ReferenceDataLibrary, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ReferencerRule, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ReferenceSource, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RelationalExpression, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Relationship, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.RelationshipParameterValue, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RequestForDeviation, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.RequestForWaiver, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.Requirement, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.RequirementsContainer, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.RequirementsContainerParameterValue, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RequirementsGroup, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.RequirementsSpecification, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.ReviewItemDiscrepancy, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.Rule, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RuleVerification, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.RuleVerificationList, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.RuleViolation, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.SampledFunctionParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ScalarParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ScaleReferenceQuantityValue, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.ScaleValueDefinition, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.Section, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.SharedStyle, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.SimpleParameterizableThing, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SimpleParameterValue, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.SimpleQuantityKind, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.SimpleUnit, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.SiteDirectory, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SiteDirectoryDataAnnotation, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SiteDirectoryDataDiscussionItem, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SiteDirectoryThingReference, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SiteLogEntry, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.SiteReferenceDataLibrary, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.Solution, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.SpecializedQuantityKind, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Stakeholder, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.StakeholderValue, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.StakeHolderValueMap, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.StakeHolderValueMapSettings, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.TelephoneNumber, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.Term, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.TextParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.TextualNote, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.Thing, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.ThingReference, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.TimeOfDayParameterType, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.TopContainer, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.UnitFactor, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.UnitPrefix, ParticipantAccessRightKind.SAME_AS_CONTAINER);
        classKindParticipantPermissionMap.put(ClassKind.UserPreference, ParticipantAccessRightKind.NOT_APPLICABLE);
        classKindParticipantPermissionMap.put(ClassKind.UserRuleVerification, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
        classKindParticipantPermissionMap.put(ClassKind.ValueGroup, ParticipantAccessRightKind.NONE);
        classKindParticipantPermissionMap.put(ClassKind.NotThing, ParticipantAccessRightKind.NOT_APPLICABLE);

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
        typeNamePersonPermissionMap.put("DependentParameterTypeAssignment", PersonAccessRightKind.SAME_AS_CONTAINER);
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
        typeNamePersonPermissionMap.put("IndependentParameterTypeAssignment", PersonAccessRightKind.SAME_AS_CONTAINER);
        typeNamePersonPermissionMap.put("IntervalScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("Iteration", PersonAccessRightKind.NOT_APPLICABLE);
        typeNamePersonPermissionMap.put("IterationSetup", PersonAccessRightKind.NONE);
        typeNamePersonPermissionMap.put("LinearConversionUnit", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("LogarithmicScale", PersonAccessRightKind.SAME_AS_SUPERCLASS);
        typeNamePersonPermissionMap.put("LogEntryChangelogItem", PersonAccessRightKind.SAME_AS_CONTAINER);
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
        typeNamePersonPermissionMap.put("OrganizationalParticipant", PersonAccessRightKind.SAME_AS_CONTAINER);
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
        typeNamePersonPermissionMap.put("SampledFunctionParameterType", PersonAccessRightKind.SAME_AS_SUPERCLASS);
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

        classKindPersonPermissionMap.put(ClassKind.ActionItem, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ActualFiniteState, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ActualFiniteStateList, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Alias, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.AndExpression, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Approval, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ArrayParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.BinaryNote, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BinaryRelationship, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BinaryRelationshipRule, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.Book, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BooleanExpression, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BooleanParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.Bounds, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.BuiltInRuleVerification, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Category, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ChangeProposal, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ChangeRequest, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Citation, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.Color, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.CommonFileStore, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.CompoundParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.Constant, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ContractChangeNotice, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ContractDeviation, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ConversionBasedUnit, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.CyclicRatioScale, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DateParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DateTimeParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DecompositionRule, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DefinedThing, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Definition, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.DependentParameterTypeAssignment, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.DerivedQuantityKind, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DerivedUnit, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.DiagramCanvas, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DiagramEdge, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DiagramElementContainer, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DiagramElementThing, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DiagrammingStyle, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DiagramObject, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DiagramShape, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DiagramThingBase, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DiscussionItem, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DomainFileStore, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.DomainOfExpertise, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.DomainOfExpertiseGroup, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.ElementBase, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ElementDefinition, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ElementUsage, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.EmailAddress, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.EngineeringModel, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.EngineeringModelDataAnnotation, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.EngineeringModelDataDiscussionItem, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.EngineeringModelDataNote, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.EngineeringModelSetup, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.EnumerationParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.EnumerationValueDefinition, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ExclusiveOrExpression, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ExternalIdentifierMap, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.File, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.FileRevision, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.FileStore, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.FileType, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.Folder, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.GenericAnnotation, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Glossary, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.Goal, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.HyperLink, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.IdCorrespondence, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.IndependentParameterTypeAssignment, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.IntervalScale, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.Iteration, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.IterationSetup, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.LinearConversionUnit, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.LogarithmicScale, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.LogEntryChangelogItem, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.MappingToReferenceScale, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.MeasurementScale, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.MeasurementUnit, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ModellingAnnotationItem, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ModellingThingReference, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ModelLogEntry, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ModelReferenceDataLibrary, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.MultiRelationship, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.MultiRelationshipRule, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.NaturalLanguage, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.NestedElement, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.NestedParameter, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Note, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.NotExpression, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Option, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.OrdinalScale, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.OrExpression, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Organization, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.OrganizationalParticipant, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.OwnedStyle, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Page, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Parameter, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterBase, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterGroup, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterizedCategoryRule, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.ParameterOrOverrideBase, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterOverride, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterOverrideValueSet, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterSubscription, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterSubscriptionValueSet, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterType, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ParameterTypeComponent, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ParameterValue, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterValueSet, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParameterValueSetBase, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ParametricConstraint, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Participant, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.ParticipantPermission, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.ParticipantRole, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.Person, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.PersonPermission, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.PersonRole, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.Point, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PossibleFiniteState, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PossibleFiniteStateList, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.PrefixedUnit, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.Publication, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.QuantityKind, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.QuantityKindFactor, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.RatioScale, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.ReferenceDataLibrary, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ReferencerRule, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.ReferenceSource, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.RelationalExpression, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Relationship, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RelationshipParameterValue, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RequestForDeviation, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RequestForWaiver, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Requirement, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RequirementsContainer, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RequirementsContainerParameterValue, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RequirementsGroup, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RequirementsSpecification, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ReviewItemDiscrepancy, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Rule, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.RuleVerification, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RuleVerificationList, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.RuleViolation, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SampledFunctionParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.ScalarParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.ScaleReferenceQuantityValue, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.ScaleValueDefinition, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.Section, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SharedStyle, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SimpleParameterizableThing, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SimpleParameterValue, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SimpleQuantityKind, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.SimpleUnit, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.SiteDirectory, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SiteDirectoryDataAnnotation, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SiteDirectoryDataDiscussionItem, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SiteDirectoryThingReference, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.SiteLogEntry, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.SiteReferenceDataLibrary, PersonAccessRightKind.NONE);
        classKindPersonPermissionMap.put(ClassKind.Solution, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.SpecializedQuantityKind, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.Stakeholder, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.StakeholderValue, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.StakeHolderValueMap, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.StakeHolderValueMapSettings, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.TelephoneNumber, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.Term, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.TextParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.TextualNote, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.Thing, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ThingReference, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.TimeOfDayParameterType, PersonAccessRightKind.SAME_AS_SUPERCLASS);
        classKindPersonPermissionMap.put(ClassKind.TopContainer, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.UnitFactor, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.UnitPrefix, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.UserPreference, PersonAccessRightKind.SAME_AS_CONTAINER);
        classKindPersonPermissionMap.put(ClassKind.UserRuleVerification, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.ValueGroup, PersonAccessRightKind.NOT_APPLICABLE);
        classKindPersonPermissionMap.put(ClassKind.NotThing, PersonAccessRightKind.NOT_APPLICABLE);
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
