/* --------------------------------------------------------------------------------------------------------------------
 * ContainerPropertyHelper.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated ContainerPropertyHelper class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.helpers;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import com.google.common.collect.MoreCollectors;

import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/**
 * The purpose of the {@link ContainerPropertyHelper} class is to provide static methods to compute
 * the container property name of a {@link Thing} based on it's {@link ClassKind}
 */
public class ContainerPropertyHelper {
    /**
     * The dictionary that contains for each {@link ClassKind} the AbstractMap.SimpleEntry {Class, Property} of the Container of it's direct container
     */
    private static final Map<String, AbstractMap.SimpleEntry<String, String>> CONTAINER_PROPERTY_MAP = new HashMap<>();

    static {
        CONTAINER_PROPERTY_MAP.put("ActionItem", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("ActualFiniteState", new AbstractMap.SimpleEntry<>("ActualFiniteStateList", "actualState"));
        CONTAINER_PROPERTY_MAP.put("ActualFiniteStateList", new AbstractMap.SimpleEntry<>("Iteration", "actualFiniteStateList"));
        CONTAINER_PROPERTY_MAP.put("Alias", new AbstractMap.SimpleEntry<>("DefinedThing", "alias"));
        CONTAINER_PROPERTY_MAP.put("AndExpression", new AbstractMap.SimpleEntry<>("ParametricConstraint", "expression"));
        CONTAINER_PROPERTY_MAP.put("Approval", new AbstractMap.SimpleEntry<>("ModellingAnnotationItem", "approvedBy"));
        CONTAINER_PROPERTY_MAP.put("ArrayParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("BinaryNote", new AbstractMap.SimpleEntry<>("Page", "note"));
        CONTAINER_PROPERTY_MAP.put("BinaryRelationship", new AbstractMap.SimpleEntry<>("Iteration", "relationship"));
        CONTAINER_PROPERTY_MAP.put("BinaryRelationshipRule", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "rule"));
        CONTAINER_PROPERTY_MAP.put("Book", new AbstractMap.SimpleEntry<>("EngineeringModel", "book"));
        CONTAINER_PROPERTY_MAP.put("BooleanExpression", new AbstractMap.SimpleEntry<>("ParametricConstraint", "expression"));
        CONTAINER_PROPERTY_MAP.put("BooleanParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("Bounds", new AbstractMap.SimpleEntry<>("DiagramElementContainer", "bounds"));
        CONTAINER_PROPERTY_MAP.put("BuiltInRuleVerification", new AbstractMap.SimpleEntry<>("RuleVerificationList", "ruleVerification"));
        CONTAINER_PROPERTY_MAP.put("Category", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "definedCategory"));
        CONTAINER_PROPERTY_MAP.put("ChangeProposal", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("ChangeRequest", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("Citation", new AbstractMap.SimpleEntry<>("Definition", "citation"));
        CONTAINER_PROPERTY_MAP.put("Color", new AbstractMap.SimpleEntry<>("DiagrammingStyle", "usedColor"));
        CONTAINER_PROPERTY_MAP.put("CommonFileStore", new AbstractMap.SimpleEntry<>("EngineeringModel", "commonFileStore"));
        CONTAINER_PROPERTY_MAP.put("CompoundParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("Constant", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "constant"));
        CONTAINER_PROPERTY_MAP.put("ContractChangeNotice", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("ContractDeviation", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("ConversionBasedUnit", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "unit"));
        CONTAINER_PROPERTY_MAP.put("CyclicRatioScale", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "scale"));
        CONTAINER_PROPERTY_MAP.put("DateParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("DateTimeParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("DecompositionRule", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "rule"));
        CONTAINER_PROPERTY_MAP.put("Definition", new AbstractMap.SimpleEntry<>("DefinedThing", "definition"));
        CONTAINER_PROPERTY_MAP.put("DerivedQuantityKind", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("DerivedUnit", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "unit"));
        CONTAINER_PROPERTY_MAP.put("DiagramCanvas", new AbstractMap.SimpleEntry<>("Iteration", "diagramCanvas"));
        CONTAINER_PROPERTY_MAP.put("DiagramEdge", new AbstractMap.SimpleEntry<>("DiagramElementContainer", "diagramElement"));
        CONTAINER_PROPERTY_MAP.put("DiagramElementThing", new AbstractMap.SimpleEntry<>("DiagramElementContainer", "diagramElement"));
        CONTAINER_PROPERTY_MAP.put("DiagramObject", new AbstractMap.SimpleEntry<>("DiagramElementContainer", "diagramElement"));
        CONTAINER_PROPERTY_MAP.put("DiagramShape", new AbstractMap.SimpleEntry<>("DiagramElementContainer", "diagramElement"));
        CONTAINER_PROPERTY_MAP.put("DomainFileStore", new AbstractMap.SimpleEntry<>("Iteration", "domainFileStore"));
        CONTAINER_PROPERTY_MAP.put("DomainOfExpertise", new AbstractMap.SimpleEntry<>("SiteDirectory", "domain"));
        CONTAINER_PROPERTY_MAP.put("DomainOfExpertiseGroup", new AbstractMap.SimpleEntry<>("SiteDirectory", "domainGroup"));
        CONTAINER_PROPERTY_MAP.put("ElementDefinition", new AbstractMap.SimpleEntry<>("Iteration", "element"));
        CONTAINER_PROPERTY_MAP.put("ElementUsage", new AbstractMap.SimpleEntry<>("ElementDefinition", "containedElement"));
        CONTAINER_PROPERTY_MAP.put("EmailAddress", new AbstractMap.SimpleEntry<>("Person", "emailAddress"));
        CONTAINER_PROPERTY_MAP.put("EngineeringModel", new AbstractMap.SimpleEntry<>("EngineeringModel", "EngineeringModel"));
        CONTAINER_PROPERTY_MAP.put("EngineeringModelDataDiscussionItem", new AbstractMap.SimpleEntry<>("EngineeringModelDataAnnotation", "discussion"));
        CONTAINER_PROPERTY_MAP.put("EngineeringModelDataNote", new AbstractMap.SimpleEntry<>("EngineeringModel", "genericNote"));
        CONTAINER_PROPERTY_MAP.put("EngineeringModelSetup", new AbstractMap.SimpleEntry<>("SiteDirectory", "model"));
        CONTAINER_PROPERTY_MAP.put("EnumerationParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("EnumerationValueDefinition", new AbstractMap.SimpleEntry<>("EnumerationParameterType", "valueDefinition"));
        CONTAINER_PROPERTY_MAP.put("ExclusiveOrExpression", new AbstractMap.SimpleEntry<>("ParametricConstraint", "expression"));
        CONTAINER_PROPERTY_MAP.put("ExternalIdentifierMap", new AbstractMap.SimpleEntry<>("Iteration", "externalIdentifierMap"));
        CONTAINER_PROPERTY_MAP.put("File", new AbstractMap.SimpleEntry<>("FileStore", "file"));
        CONTAINER_PROPERTY_MAP.put("FileRevision", new AbstractMap.SimpleEntry<>("File", "fileRevision"));
        CONTAINER_PROPERTY_MAP.put("FileType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "fileType"));
        CONTAINER_PROPERTY_MAP.put("Folder", new AbstractMap.SimpleEntry<>("FileStore", "folder"));
        CONTAINER_PROPERTY_MAP.put("Glossary", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "glossary"));
        CONTAINER_PROPERTY_MAP.put("Goal", new AbstractMap.SimpleEntry<>("Iteration", "goal"));
        CONTAINER_PROPERTY_MAP.put("HyperLink", new AbstractMap.SimpleEntry<>("DefinedThing", "hyperLink"));
        CONTAINER_PROPERTY_MAP.put("IdCorrespondence", new AbstractMap.SimpleEntry<>("ExternalIdentifierMap", "correspondence"));
        CONTAINER_PROPERTY_MAP.put("IntervalScale", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "scale"));
        CONTAINER_PROPERTY_MAP.put("Iteration", new AbstractMap.SimpleEntry<>("EngineeringModel", "iteration"));
        CONTAINER_PROPERTY_MAP.put("IterationSetup", new AbstractMap.SimpleEntry<>("EngineeringModelSetup", "iterationSetup"));
        CONTAINER_PROPERTY_MAP.put("LinearConversionUnit", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "unit"));
        CONTAINER_PROPERTY_MAP.put("LogarithmicScale", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "scale"));
        CONTAINER_PROPERTY_MAP.put("MappingToReferenceScale", new AbstractMap.SimpleEntry<>("MeasurementScale", "mappingToReferenceScale"));
        CONTAINER_PROPERTY_MAP.put("MeasurementScale", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "scale"));
        CONTAINER_PROPERTY_MAP.put("MeasurementUnit", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "unit"));
        CONTAINER_PROPERTY_MAP.put("ModellingAnnotationItem", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("ModellingThingReference", new AbstractMap.SimpleEntry<>("EngineeringModelDataAnnotation", "relatedThing"));
        CONTAINER_PROPERTY_MAP.put("ModelLogEntry", new AbstractMap.SimpleEntry<>("EngineeringModel", "logEntry"));
        CONTAINER_PROPERTY_MAP.put("ModelReferenceDataLibrary", new AbstractMap.SimpleEntry<>("EngineeringModelSetup", "requiredRdl"));
        CONTAINER_PROPERTY_MAP.put("MultiRelationship", new AbstractMap.SimpleEntry<>("Iteration", "relationship"));
        CONTAINER_PROPERTY_MAP.put("MultiRelationshipRule", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "rule"));
        CONTAINER_PROPERTY_MAP.put("NaturalLanguage", new AbstractMap.SimpleEntry<>("SiteDirectory", "naturalLanguage"));
        CONTAINER_PROPERTY_MAP.put("NestedElement", new AbstractMap.SimpleEntry<>("Option", "nestedElement"));
        CONTAINER_PROPERTY_MAP.put("NestedParameter", new AbstractMap.SimpleEntry<>("NestedElement", "nestedParameter"));
        CONTAINER_PROPERTY_MAP.put("Note", new AbstractMap.SimpleEntry<>("Page", "note"));
        CONTAINER_PROPERTY_MAP.put("NotExpression", new AbstractMap.SimpleEntry<>("ParametricConstraint", "expression"));
        CONTAINER_PROPERTY_MAP.put("Option", new AbstractMap.SimpleEntry<>("Iteration", "option"));
        CONTAINER_PROPERTY_MAP.put("OrdinalScale", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "scale"));
        CONTAINER_PROPERTY_MAP.put("OrExpression", new AbstractMap.SimpleEntry<>("ParametricConstraint", "expression"));
        CONTAINER_PROPERTY_MAP.put("Organization", new AbstractMap.SimpleEntry<>("SiteDirectory", "organization"));
        CONTAINER_PROPERTY_MAP.put("OwnedStyle", new AbstractMap.SimpleEntry<>("DiagramElementThing", "localStyle"));
        CONTAINER_PROPERTY_MAP.put("Page", new AbstractMap.SimpleEntry<>("Section", "page"));
        CONTAINER_PROPERTY_MAP.put("Parameter", new AbstractMap.SimpleEntry<>("ElementDefinition", "parameter"));
        CONTAINER_PROPERTY_MAP.put("ParameterGroup", new AbstractMap.SimpleEntry<>("ElementDefinition", "parameterGroup"));
        CONTAINER_PROPERTY_MAP.put("ParameterizedCategoryRule", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "rule"));
        CONTAINER_PROPERTY_MAP.put("ParameterOverride", new AbstractMap.SimpleEntry<>("ElementUsage", "parameterOverride"));
        CONTAINER_PROPERTY_MAP.put("ParameterOverrideValueSet", new AbstractMap.SimpleEntry<>("ParameterOverride", "valueSet"));
        CONTAINER_PROPERTY_MAP.put("ParameterSubscription", new AbstractMap.SimpleEntry<>("ParameterOrOverrideBase", "parameterSubscription"));
        CONTAINER_PROPERTY_MAP.put("ParameterSubscriptionValueSet", new AbstractMap.SimpleEntry<>("ParameterSubscription", "valueSet"));
        CONTAINER_PROPERTY_MAP.put("ParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("ParameterTypeComponent", new AbstractMap.SimpleEntry<>("CompoundParameterType", "component"));
        CONTAINER_PROPERTY_MAP.put("ParameterValueSet", new AbstractMap.SimpleEntry<>("Parameter", "valueSet"));
        CONTAINER_PROPERTY_MAP.put("ParametricConstraint", new AbstractMap.SimpleEntry<>("Requirement", "parametricConstraint"));
        CONTAINER_PROPERTY_MAP.put("Participant", new AbstractMap.SimpleEntry<>("EngineeringModelSetup", "participant"));
        CONTAINER_PROPERTY_MAP.put("ParticipantPermission", new AbstractMap.SimpleEntry<>("ParticipantRole", "participantPermission"));
        CONTAINER_PROPERTY_MAP.put("ParticipantRole", new AbstractMap.SimpleEntry<>("SiteDirectory", "participantRole"));
        CONTAINER_PROPERTY_MAP.put("Person", new AbstractMap.SimpleEntry<>("SiteDirectory", "person"));
        CONTAINER_PROPERTY_MAP.put("PersonPermission", new AbstractMap.SimpleEntry<>("PersonRole", "personPermission"));
        CONTAINER_PROPERTY_MAP.put("PersonRole", new AbstractMap.SimpleEntry<>("SiteDirectory", "personRole"));
        CONTAINER_PROPERTY_MAP.put("Point", new AbstractMap.SimpleEntry<>("DiagramEdge", "point"));
        CONTAINER_PROPERTY_MAP.put("PossibleFiniteState", new AbstractMap.SimpleEntry<>("PossibleFiniteStateList", "possibleState"));
        CONTAINER_PROPERTY_MAP.put("PossibleFiniteStateList", new AbstractMap.SimpleEntry<>("Iteration", "possibleFiniteStateList"));
        CONTAINER_PROPERTY_MAP.put("PrefixedUnit", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "unit"));
        CONTAINER_PROPERTY_MAP.put("Publication", new AbstractMap.SimpleEntry<>("Iteration", "publication"));
        CONTAINER_PROPERTY_MAP.put("QuantityKind", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("QuantityKindFactor", new AbstractMap.SimpleEntry<>("DerivedQuantityKind", "quantityKindFactor"));
        CONTAINER_PROPERTY_MAP.put("RatioScale", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "scale"));
        CONTAINER_PROPERTY_MAP.put("ReferencerRule", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "rule"));
        CONTAINER_PROPERTY_MAP.put("ReferenceSource", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "referenceSource"));
        CONTAINER_PROPERTY_MAP.put("RelationalExpression", new AbstractMap.SimpleEntry<>("ParametricConstraint", "expression"));
        CONTAINER_PROPERTY_MAP.put("Relationship", new AbstractMap.SimpleEntry<>("Iteration", "relationship"));
        CONTAINER_PROPERTY_MAP.put("RelationshipParameterValue", new AbstractMap.SimpleEntry<>("Relationship", "parameterValue"));
        CONTAINER_PROPERTY_MAP.put("RequestForDeviation", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("RequestForWaiver", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("Requirement", new AbstractMap.SimpleEntry<>("RequirementsSpecification", "requirement"));
        CONTAINER_PROPERTY_MAP.put("RequirementsContainerParameterValue", new AbstractMap.SimpleEntry<>("RequirementsContainer", "parameterValue"));
        CONTAINER_PROPERTY_MAP.put("RequirementsGroup", new AbstractMap.SimpleEntry<>("RequirementsContainer", "group"));
        CONTAINER_PROPERTY_MAP.put("RequirementsSpecification", new AbstractMap.SimpleEntry<>("Iteration", "requirementsSpecification"));
        CONTAINER_PROPERTY_MAP.put("ReviewItemDiscrepancy", new AbstractMap.SimpleEntry<>("EngineeringModel", "modellingAnnotation"));
        CONTAINER_PROPERTY_MAP.put("Rule", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "rule"));
        CONTAINER_PROPERTY_MAP.put("RuleVerification", new AbstractMap.SimpleEntry<>("RuleVerificationList", "ruleVerification"));
        CONTAINER_PROPERTY_MAP.put("RuleVerificationList", new AbstractMap.SimpleEntry<>("Iteration", "ruleVerificationList"));
        CONTAINER_PROPERTY_MAP.put("RuleViolation", new AbstractMap.SimpleEntry<>("RuleVerification", "violation"));
        CONTAINER_PROPERTY_MAP.put("ScalarParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("ScaleReferenceQuantityValue", new AbstractMap.SimpleEntry<>("LogarithmicScale", "referenceQuantityValue"));
        CONTAINER_PROPERTY_MAP.put("ScaleValueDefinition", new AbstractMap.SimpleEntry<>("MeasurementScale", "valueDefinition"));
        CONTAINER_PROPERTY_MAP.put("Section", new AbstractMap.SimpleEntry<>("Book", "section"));
        CONTAINER_PROPERTY_MAP.put("SharedStyle", new AbstractMap.SimpleEntry<>("Iteration", "sharedDiagramStyle"));
        CONTAINER_PROPERTY_MAP.put("SimpleParameterValue", new AbstractMap.SimpleEntry<>("SimpleParameterizableThing", "parameterValue"));
        CONTAINER_PROPERTY_MAP.put("SimpleQuantityKind", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("SimpleUnit", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "unit"));
        CONTAINER_PROPERTY_MAP.put("SiteDirectory", new AbstractMap.SimpleEntry<>("SiteDirectory", "SiteDirectory"));
        CONTAINER_PROPERTY_MAP.put("SiteDirectoryDataAnnotation", new AbstractMap.SimpleEntry<>("SiteDirectory", "annotation"));
        CONTAINER_PROPERTY_MAP.put("SiteDirectoryDataDiscussionItem", new AbstractMap.SimpleEntry<>("SiteDirectoryDataAnnotation", "discussion"));
        CONTAINER_PROPERTY_MAP.put("SiteDirectoryThingReference", new AbstractMap.SimpleEntry<>("SiteDirectoryDataAnnotation", "relatedThing"));
        CONTAINER_PROPERTY_MAP.put("SiteLogEntry", new AbstractMap.SimpleEntry<>("SiteDirectory", "logEntry"));
        CONTAINER_PROPERTY_MAP.put("SiteReferenceDataLibrary", new AbstractMap.SimpleEntry<>("SiteDirectory", "siteReferenceDataLibrary"));
        CONTAINER_PROPERTY_MAP.put("Solution", new AbstractMap.SimpleEntry<>("ReviewItemDiscrepancy", "solution"));
        CONTAINER_PROPERTY_MAP.put("SpecializedQuantityKind", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("Stakeholder", new AbstractMap.SimpleEntry<>("Iteration", "stakeholder"));
        CONTAINER_PROPERTY_MAP.put("StakeholderValue", new AbstractMap.SimpleEntry<>("Iteration", "stakeholderValue"));
        CONTAINER_PROPERTY_MAP.put("StakeHolderValueMap", new AbstractMap.SimpleEntry<>("Iteration", "stakeholderValueMap"));
        CONTAINER_PROPERTY_MAP.put("StakeHolderValueMapSettings", new AbstractMap.SimpleEntry<>("StakeHolderValueMap", "settings"));
        CONTAINER_PROPERTY_MAP.put("TelephoneNumber", new AbstractMap.SimpleEntry<>("Person", "telephoneNumber"));
        CONTAINER_PROPERTY_MAP.put("Term", new AbstractMap.SimpleEntry<>("Glossary", "term"));
        CONTAINER_PROPERTY_MAP.put("TextParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("TextualNote", new AbstractMap.SimpleEntry<>("Page", "note"));
        CONTAINER_PROPERTY_MAP.put("TimeOfDayParameterType", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "parameterType"));
        CONTAINER_PROPERTY_MAP.put("UnitFactor", new AbstractMap.SimpleEntry<>("DerivedUnit", "unitFactor"));
        CONTAINER_PROPERTY_MAP.put("UnitPrefix", new AbstractMap.SimpleEntry<>("ReferenceDataLibrary", "unitPrefix"));
        CONTAINER_PROPERTY_MAP.put("UserPreference", new AbstractMap.SimpleEntry<>("Person", "userPreference"));
        CONTAINER_PROPERTY_MAP.put("UserRuleVerification", new AbstractMap.SimpleEntry<>("RuleVerificationList", "ruleVerification"));
        CONTAINER_PROPERTY_MAP.put("ValueGroup", new AbstractMap.SimpleEntry<>("Iteration", "valueGroup"));
    }

    /**
     * Returns the name of the property of the container class that contains the provided {@link ClassKind}
     *
     * @param classKind The string representing the {@link ClassKind}
     * @return The name of the container property
     */
    public static String getContainerPropertyName(String classKind) {
        if (CONTAINER_PROPERTY_MAP.containsKey(classKind))
        {
            return CONTAINER_PROPERTY_MAP.get(classKind).getValue();
        }

        throw new IllegalArgumentException(String.format("The ClassKind %1$s does not exist in the CDP4Common library", classKind));
    }

    /**
     * Returns the name of the property of the container class that contains the provided {@link ClassKind}
     *
     * @param classKind The {@link ClassKind}
     * @return The name of the container property
     */
    public static String getContainerPropertyName(ClassKind classKind) {
        return getContainerPropertyName(classKind.toString());
    }

    /**
     * Returns the name of the container class that contains the provided {@link ClassKind}
     *
     * @param classKind The string representing the {@link ClassKind}
     * @return The name of the container class
     */
    public static String getContainerClassName(String classKind) {
        if (CONTAINER_PROPERTY_MAP.containsKey(classKind))
        {
            return CONTAINER_PROPERTY_MAP.get(classKind).getKey();
        }
        throw new IllegalArgumentException(String.format("The ClassKind %1$s does not exist in the CDP4Common library", classKind));
    }

    /**
     * Returns the name of the container class that contains the provided {@link ClassKind}
     *
     * @param classKind the {@link ClassKind}
     * @return The name of the container class
     */
    public static String getContainerClassName(ClassKind classKind) {
        return getContainerClassName(classKind.toString());
    }

    /**
     * Returns the {@link ClassKind} from the container property
     *
     * @param containerProperty the provided container property
     * @return the {@link ClassKind}
     */
    public static ClassKind getClassKindFromContainerProperty(String containerProperty) {
        List<AbstractMap.SimpleEntry<String, String>> pairs = CONTAINER_PROPERTY_MAP.values().stream().filter(p -> p.getValue().equals(containerProperty)).collect(Collectors.toList());

        if (pairs.size() != 0) {
            //get the abstract class if a container property name is in the dictionary multiple times
            Optional<AbstractMap.SimpleEntry<String, String>> pair = (pairs.size() == 1) ? Optional.of(pairs.get(0)) : pairs.stream().filter(p -> {
                try {
                    return Modifier.isAbstract(Class.forName("cdp4common.dto." + p.getKey()).getModifiers());
                } catch (ClassNotFoundException e) {
                    throw new IllegalArgumentException(String.format("Cannot load class cdp4common.dto.%1$s", p.getKey()));
                }
            }).collect(MoreCollectors.toOptional());

            if (pair.isPresent()){
                return Enum.valueOf(ClassKind.class, Utils.getConstantNotationFromUpperCamel(pair.get().getKey()));
            }
        }
        
        throw new IllegalArgumentException(String.format("the container property %1$s does not exist", containerProperty));
    }
}
