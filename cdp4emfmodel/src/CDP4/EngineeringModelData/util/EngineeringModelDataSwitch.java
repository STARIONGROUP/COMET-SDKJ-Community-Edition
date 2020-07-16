/**
 */
package CDP4.EngineeringModelData.util;

import CDP4.CommonData.Annotation;
import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.LogEntry;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;
import CDP4.CommonData.TopContainer;
import CDP4.CommonData.VolatileThing;

import CDP4.EngineeringModelData.*;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage
 * @generated
 */
public class EngineeringModelDataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EngineeringModelDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelDataSwitch() {
		if (modelPackage == null) {
			modelPackage = EngineeringModelDataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE: {
				PossibleFiniteState possibleFiniteState = (PossibleFiniteState)theEObject;
				T result = casePossibleFiniteState(possibleFiniteState);
				if (result == null) result = caseDefinedThing(possibleFiniteState);
				if (result == null) result = caseOwnedThing(possibleFiniteState);
				if (result == null) result = caseThing(possibleFiniteState);
				if (result == null) result = caseNamedThing(possibleFiniteState);
				if (result == null) result = caseShortNamedThing(possibleFiniteState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseParameterOrOverrideBase(parameter);
				if (result == null) result = caseParameterBase(parameter);
				if (result == null) result = caseThing(parameter);
				if (result == null) result = caseOwnedThing(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_OR_OVERRIDE_BASE: {
				ParameterOrOverrideBase parameterOrOverrideBase = (ParameterOrOverrideBase)theEObject;
				T result = caseParameterOrOverrideBase(parameterOrOverrideBase);
				if (result == null) result = caseParameterBase(parameterOrOverrideBase);
				if (result == null) result = caseThing(parameterOrOverrideBase);
				if (result == null) result = caseOwnedThing(parameterOrOverrideBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_BASE: {
				ParameterBase parameterBase = (ParameterBase)theEObject;
				T result = caseParameterBase(parameterBase);
				if (result == null) result = caseThing(parameterBase);
				if (result == null) result = caseOwnedThing(parameterBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE_LIST: {
				ActualFiniteStateList actualFiniteStateList = (ActualFiniteStateList)theEObject;
				T result = caseActualFiniteStateList(actualFiniteStateList);
				if (result == null) result = caseThing(actualFiniteStateList);
				if (result == null) result = caseNamedThing(actualFiniteStateList);
				if (result == null) result = caseOptionDependentThing(actualFiniteStateList);
				if (result == null) result = caseOwnedThing(actualFiniteStateList);
				if (result == null) result = caseShortNamedThing(actualFiniteStateList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.OPTION_DEPENDENT_THING: {
				OptionDependentThing optionDependentThing = (OptionDependentThing)theEObject;
				T result = caseOptionDependentThing(optionDependentThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = caseDefinedThing(option);
				if (result == null) result = caseCategorizableThing(option);
				if (result == null) result = caseThing(option);
				if (result == null) result = caseNamedThing(option);
				if (result == null) result = caseShortNamedThing(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.NESTED_ELEMENT: {
				NestedElement nestedElement = (NestedElement)theEObject;
				T result = caseNestedElement(nestedElement);
				if (result == null) result = caseThing(nestedElement);
				if (result == null) result = caseNamedThing(nestedElement);
				if (result == null) result = caseOwnedThing(nestedElement);
				if (result == null) result = caseShortNamedThing(nestedElement);
				if (result == null) result = caseVolatileThing(nestedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.ELEMENT_DEFINITION: {
				ElementDefinition elementDefinition = (ElementDefinition)theEObject;
				T result = caseElementDefinition(elementDefinition);
				if (result == null) result = caseElementBase(elementDefinition);
				if (result == null) result = caseDefinedThing(elementDefinition);
				if (result == null) result = caseCategorizableThing(elementDefinition);
				if (result == null) result = caseOwnedThing(elementDefinition);
				if (result == null) result = caseThing(elementDefinition);
				if (result == null) result = caseNamedThing(elementDefinition);
				if (result == null) result = caseShortNamedThing(elementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.ELEMENT_BASE: {
				ElementBase elementBase = (ElementBase)theEObject;
				T result = caseElementBase(elementBase);
				if (result == null) result = caseDefinedThing(elementBase);
				if (result == null) result = caseCategorizableThing(elementBase);
				if (result == null) result = caseOwnedThing(elementBase);
				if (result == null) result = caseThing(elementBase);
				if (result == null) result = caseNamedThing(elementBase);
				if (result == null) result = caseShortNamedThing(elementBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.ELEMENT_USAGE: {
				ElementUsage elementUsage = (ElementUsage)theEObject;
				T result = caseElementUsage(elementUsage);
				if (result == null) result = caseElementBase(elementUsage);
				if (result == null) result = caseOptionDependentThing(elementUsage);
				if (result == null) result = caseDefinedThing(elementUsage);
				if (result == null) result = caseCategorizableThing(elementUsage);
				if (result == null) result = caseOwnedThing(elementUsage);
				if (result == null) result = caseThing(elementUsage);
				if (result == null) result = caseNamedThing(elementUsage);
				if (result == null) result = caseShortNamedThing(elementUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE: {
				ParameterOverride parameterOverride = (ParameterOverride)theEObject;
				T result = caseParameterOverride(parameterOverride);
				if (result == null) result = caseParameterOrOverrideBase(parameterOverride);
				if (result == null) result = caseParameterBase(parameterOverride);
				if (result == null) result = caseThing(parameterOverride);
				if (result == null) result = caseOwnedThing(parameterOverride);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_GROUP: {
				ParameterGroup parameterGroup = (ParameterGroup)theEObject;
				T result = caseParameterGroup(parameterGroup);
				if (result == null) result = caseThing(parameterGroup);
				if (result == null) result = caseNamedThing(parameterGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET: {
				ParameterOverrideValueSet parameterOverrideValueSet = (ParameterOverrideValueSet)theEObject;
				T result = caseParameterOverrideValueSet(parameterOverrideValueSet);
				if (result == null) result = caseParameterValueSetBase(parameterOverrideValueSet);
				if (result == null) result = caseThing(parameterOverrideValueSet);
				if (result == null) result = caseOwnedThing(parameterOverrideValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET_BASE: {
				ParameterValueSetBase parameterValueSetBase = (ParameterValueSetBase)theEObject;
				T result = caseParameterValueSetBase(parameterValueSetBase);
				if (result == null) result = caseThing(parameterValueSetBase);
				if (result == null) result = caseOwnedThing(parameterValueSetBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.ACTUAL_FINITE_STATE: {
				ActualFiniteState actualFiniteState = (ActualFiniteState)theEObject;
				T result = caseActualFiniteState(actualFiniteState);
				if (result == null) result = caseThing(actualFiniteState);
				if (result == null) result = caseNamedThing(actualFiniteState);
				if (result == null) result = caseOwnedThing(actualFiniteState);
				if (result == null) result = caseShortNamedThing(actualFiniteState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_VALUE_SET: {
				ParameterValueSet parameterValueSet = (ParameterValueSet)theEObject;
				T result = caseParameterValueSet(parameterValueSet);
				if (result == null) result = caseParameterValueSetBase(parameterValueSet);
				if (result == null) result = caseThing(parameterValueSet);
				if (result == null) result = caseOwnedThing(parameterValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.NESTED_PARAMETER: {
				NestedParameter nestedParameter = (NestedParameter)theEObject;
				T result = caseNestedParameter(nestedParameter);
				if (result == null) result = caseThing(nestedParameter);
				if (result == null) result = caseOwnedThing(nestedParameter);
				if (result == null) result = caseVolatileThing(nestedParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.POSSIBLE_FINITE_STATE_LIST: {
				PossibleFiniteStateList possibleFiniteStateList = (PossibleFiniteStateList)theEObject;
				T result = casePossibleFiniteStateList(possibleFiniteStateList);
				if (result == null) result = caseDefinedThing(possibleFiniteStateList);
				if (result == null) result = caseCategorizableThing(possibleFiniteStateList);
				if (result == null) result = caseOwnedThing(possibleFiniteStateList);
				if (result == null) result = caseThing(possibleFiniteStateList);
				if (result == null) result = caseNamedThing(possibleFiniteStateList);
				if (result == null) result = caseShortNamedThing(possibleFiniteStateList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_SUBSCRIPTION: {
				ParameterSubscription parameterSubscription = (ParameterSubscription)theEObject;
				T result = caseParameterSubscription(parameterSubscription);
				if (result == null) result = caseParameterBase(parameterSubscription);
				if (result == null) result = caseThing(parameterSubscription);
				if (result == null) result = caseOwnedThing(parameterSubscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_SUBSCRIPTION_VALUE_SET: {
				ParameterSubscriptionValueSet parameterSubscriptionValueSet = (ParameterSubscriptionValueSet)theEObject;
				T result = caseParameterSubscriptionValueSet(parameterSubscriptionValueSet);
				if (result == null) result = caseThing(parameterSubscriptionValueSet);
				if (result == null) result = caseOwnedThing(parameterSubscriptionValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.FILE_STORE: {
				FileStore fileStore = (FileStore)theEObject;
				T result = caseFileStore(fileStore);
				if (result == null) result = caseThing(fileStore);
				if (result == null) result = caseNamedThing(fileStore);
				if (result == null) result = caseOwnedThing(fileStore);
				if (result == null) result = caseTimeStampedThing(fileStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.FOLDER: {
				Folder folder = (Folder)theEObject;
				T result = caseFolder(folder);
				if (result == null) result = caseThing(folder);
				if (result == null) result = caseNamedThing(folder);
				if (result == null) result = caseOwnedThing(folder);
				if (result == null) result = caseTimeStampedThing(folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseThing(file);
				if (result == null) result = caseCategorizableThing(file);
				if (result == null) result = caseOwnedThing(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.FILE_REVISION: {
				FileRevision fileRevision = (FileRevision)theEObject;
				T result = caseFileRevision(fileRevision);
				if (result == null) result = caseThing(fileRevision);
				if (result == null) result = caseNamedThing(fileRevision);
				if (result == null) result = caseTimeStampedThing(fileRevision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PUBLICATION: {
				Publication publication = (Publication)theEObject;
				T result = casePublication(publication);
				if (result == null) result = caseThing(publication);
				if (result == null) result = caseTimeStampedThing(publication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.ENGINEERING_MODEL: {
				EngineeringModel engineeringModel = (EngineeringModel)theEObject;
				T result = caseEngineeringModel(engineeringModel);
				if (result == null) result = caseTopContainer(engineeringModel);
				if (result == null) result = caseThing(engineeringModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.COMMON_FILE_STORE: {
				CommonFileStore commonFileStore = (CommonFileStore)theEObject;
				T result = caseCommonFileStore(commonFileStore);
				if (result == null) result = caseFileStore(commonFileStore);
				if (result == null) result = caseThing(commonFileStore);
				if (result == null) result = caseNamedThing(commonFileStore);
				if (result == null) result = caseOwnedThing(commonFileStore);
				if (result == null) result = caseTimeStampedThing(commonFileStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.MODEL_LOG_ENTRY: {
				ModelLogEntry modelLogEntry = (ModelLogEntry)theEObject;
				T result = caseModelLogEntry(modelLogEntry);
				if (result == null) result = caseThing(modelLogEntry);
				if (result == null) result = caseLogEntry(modelLogEntry);
				if (result == null) result = caseAnnotation(modelLogEntry);
				if (result == null) result = caseCategorizableThing(modelLogEntry);
				if (result == null) result = caseTimeStampedThing(modelLogEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.ITERATION: {
				Iteration iteration = (Iteration)theEObject;
				T result = caseIteration(iteration);
				if (result == null) result = caseThing(iteration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseThing(relationship);
				if (result == null) result = caseCategorizableThing(relationship);
				if (result == null) result = caseOwnedThing(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.RELATIONSHIP_PARAMETER_VALUE: {
				RelationshipParameterValue relationshipParameterValue = (RelationshipParameterValue)theEObject;
				T result = caseRelationshipParameterValue(relationshipParameterValue);
				if (result == null) result = caseParameterValue(relationshipParameterValue);
				if (result == null) result = caseThing(relationshipParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETER_VALUE: {
				ParameterValue parameterValue = (ParameterValue)theEObject;
				T result = caseParameterValue(parameterValue);
				if (result == null) result = caseThing(parameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.EXTERNAL_IDENTIFIER_MAP: {
				ExternalIdentifierMap externalIdentifierMap = (ExternalIdentifierMap)theEObject;
				T result = caseExternalIdentifierMap(externalIdentifierMap);
				if (result == null) result = caseThing(externalIdentifierMap);
				if (result == null) result = caseNamedThing(externalIdentifierMap);
				if (result == null) result = caseOwnedThing(externalIdentifierMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.ID_CORRESPONDENCE: {
				IdCorrespondence idCorrespondence = (IdCorrespondence)theEObject;
				T result = caseIdCorrespondence(idCorrespondence);
				if (result == null) result = caseThing(idCorrespondence);
				if (result == null) result = caseOwnedThing(idCorrespondence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.REQUIREMENTS_SPECIFICATION: {
				RequirementsSpecification requirementsSpecification = (RequirementsSpecification)theEObject;
				T result = caseRequirementsSpecification(requirementsSpecification);
				if (result == null) result = caseRequirementsContainer(requirementsSpecification);
				if (result == null) result = caseDeprecatableThing(requirementsSpecification);
				if (result == null) result = caseDefinedThing(requirementsSpecification);
				if (result == null) result = caseCategorizableThing(requirementsSpecification);
				if (result == null) result = caseOwnedThing(requirementsSpecification);
				if (result == null) result = caseThing(requirementsSpecification);
				if (result == null) result = caseNamedThing(requirementsSpecification);
				if (result == null) result = caseShortNamedThing(requirementsSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.REQUIREMENTS_CONTAINER: {
				RequirementsContainer requirementsContainer = (RequirementsContainer)theEObject;
				T result = caseRequirementsContainer(requirementsContainer);
				if (result == null) result = caseDefinedThing(requirementsContainer);
				if (result == null) result = caseCategorizableThing(requirementsContainer);
				if (result == null) result = caseOwnedThing(requirementsContainer);
				if (result == null) result = caseThing(requirementsContainer);
				if (result == null) result = caseNamedThing(requirementsContainer);
				if (result == null) result = caseShortNamedThing(requirementsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.REQUIREMENTS_GROUP: {
				RequirementsGroup requirementsGroup = (RequirementsGroup)theEObject;
				T result = caseRequirementsGroup(requirementsGroup);
				if (result == null) result = caseRequirementsContainer(requirementsGroup);
				if (result == null) result = caseDefinedThing(requirementsGroup);
				if (result == null) result = caseCategorizableThing(requirementsGroup);
				if (result == null) result = caseOwnedThing(requirementsGroup);
				if (result == null) result = caseThing(requirementsGroup);
				if (result == null) result = caseNamedThing(requirementsGroup);
				if (result == null) result = caseShortNamedThing(requirementsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.REQUIREMENTS_CONTAINER_PARAMETER_VALUE: {
				RequirementsContainerParameterValue requirementsContainerParameterValue = (RequirementsContainerParameterValue)theEObject;
				T result = caseRequirementsContainerParameterValue(requirementsContainerParameterValue);
				if (result == null) result = caseParameterValue(requirementsContainerParameterValue);
				if (result == null) result = caseThing(requirementsContainerParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseSimpleParameterizableThing(requirement);
				if (result == null) result = caseCategorizableThing(requirement);
				if (result == null) result = caseDeprecatableThing(requirement);
				if (result == null) result = caseDefinedThing(requirement);
				if (result == null) result = caseOwnedThing(requirement);
				if (result == null) result = caseThing(requirement);
				if (result == null) result = caseNamedThing(requirement);
				if (result == null) result = caseShortNamedThing(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.SIMPLE_PARAMETERIZABLE_THING: {
				SimpleParameterizableThing simpleParameterizableThing = (SimpleParameterizableThing)theEObject;
				T result = caseSimpleParameterizableThing(simpleParameterizableThing);
				if (result == null) result = caseDefinedThing(simpleParameterizableThing);
				if (result == null) result = caseOwnedThing(simpleParameterizableThing);
				if (result == null) result = caseThing(simpleParameterizableThing);
				if (result == null) result = caseNamedThing(simpleParameterizableThing);
				if (result == null) result = caseShortNamedThing(simpleParameterizableThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.SIMPLE_PARAMETER_VALUE: {
				SimpleParameterValue simpleParameterValue = (SimpleParameterValue)theEObject;
				T result = caseSimpleParameterValue(simpleParameterValue);
				if (result == null) result = caseThing(simpleParameterValue);
				if (result == null) result = caseOwnedThing(simpleParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.PARAMETRIC_CONSTRAINT: {
				ParametricConstraint parametricConstraint = (ParametricConstraint)theEObject;
				T result = caseParametricConstraint(parametricConstraint);
				if (result == null) result = caseThing(parametricConstraint);
				if (result == null) result = caseOwnedThing(parametricConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseThing(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.DOMAIN_FILE_STORE: {
				DomainFileStore domainFileStore = (DomainFileStore)theEObject;
				T result = caseDomainFileStore(domainFileStore);
				if (result == null) result = caseFileStore(domainFileStore);
				if (result == null) result = caseThing(domainFileStore);
				if (result == null) result = caseNamedThing(domainFileStore);
				if (result == null) result = caseOwnedThing(domainFileStore);
				if (result == null) result = caseTimeStampedThing(domainFileStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.RULE_VERIFICATION_LIST: {
				RuleVerificationList ruleVerificationList = (RuleVerificationList)theEObject;
				T result = caseRuleVerificationList(ruleVerificationList);
				if (result == null) result = caseDefinedThing(ruleVerificationList);
				if (result == null) result = caseOwnedThing(ruleVerificationList);
				if (result == null) result = caseThing(ruleVerificationList);
				if (result == null) result = caseNamedThing(ruleVerificationList);
				if (result == null) result = caseShortNamedThing(ruleVerificationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.RULE_VERIFICATION: {
				RuleVerification ruleVerification = (RuleVerification)theEObject;
				T result = caseRuleVerification(ruleVerification);
				if (result == null) result = caseThing(ruleVerification);
				if (result == null) result = caseNamedThing(ruleVerification);
				if (result == null) result = caseOwnedThing(ruleVerification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.RULE_VIOLATION: {
				RuleViolation ruleViolation = (RuleViolation)theEObject;
				T result = caseRuleViolation(ruleViolation);
				if (result == null) result = caseThing(ruleViolation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseDefinedThing(stakeholder);
				if (result == null) result = caseCategorizableThing(stakeholder);
				if (result == null) result = caseThing(stakeholder);
				if (result == null) result = caseNamedThing(stakeholder);
				if (result == null) result = caseShortNamedThing(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.STAKEHOLDER_VALUE: {
				StakeholderValue stakeholderValue = (StakeholderValue)theEObject;
				T result = caseStakeholderValue(stakeholderValue);
				if (result == null) result = caseDefinedThing(stakeholderValue);
				if (result == null) result = caseCategorizableThing(stakeholderValue);
				if (result == null) result = caseThing(stakeholderValue);
				if (result == null) result = caseNamedThing(stakeholderValue);
				if (result == null) result = caseShortNamedThing(stakeholderValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDefinedThing(goal);
				if (result == null) result = caseCategorizableThing(goal);
				if (result == null) result = caseThing(goal);
				if (result == null) result = caseNamedThing(goal);
				if (result == null) result = caseShortNamedThing(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.VALUE_GROUP: {
				ValueGroup valueGroup = (ValueGroup)theEObject;
				T result = caseValueGroup(valueGroup);
				if (result == null) result = caseDefinedThing(valueGroup);
				if (result == null) result = caseCategorizableThing(valueGroup);
				if (result == null) result = caseThing(valueGroup);
				if (result == null) result = caseNamedThing(valueGroup);
				if (result == null) result = caseShortNamedThing(valueGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP: {
				StakeHolderValueMap stakeHolderValueMap = (StakeHolderValueMap)theEObject;
				T result = caseStakeHolderValueMap(stakeHolderValueMap);
				if (result == null) result = caseDefinedThing(stakeHolderValueMap);
				if (result == null) result = caseCategorizableThing(stakeHolderValueMap);
				if (result == null) result = caseThing(stakeHolderValueMap);
				if (result == null) result = caseNamedThing(stakeHolderValueMap);
				if (result == null) result = caseShortNamedThing(stakeHolderValueMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS: {
				StakeHolderValueMapSettings stakeHolderValueMapSettings = (StakeHolderValueMapSettings)theEObject;
				T result = caseStakeHolderValueMapSettings(stakeHolderValueMapSettings);
				if (result == null) result = caseThing(stakeHolderValueMapSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.MULTI_RELATIONSHIP: {
				MultiRelationship multiRelationship = (MultiRelationship)theEObject;
				T result = caseMultiRelationship(multiRelationship);
				if (result == null) result = caseRelationship(multiRelationship);
				if (result == null) result = caseThing(multiRelationship);
				if (result == null) result = caseCategorizableThing(multiRelationship);
				if (result == null) result = caseOwnedThing(multiRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.BINARY_RELATIONSHIP: {
				BinaryRelationship binaryRelationship = (BinaryRelationship)theEObject;
				T result = caseBinaryRelationship(binaryRelationship);
				if (result == null) result = caseRelationship(binaryRelationship);
				if (result == null) result = caseThing(binaryRelationship);
				if (result == null) result = caseCategorizableThing(binaryRelationship);
				if (result == null) result = caseOwnedThing(binaryRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.OR_EXPRESSION: {
				OrExpression orExpression = (OrExpression)theEObject;
				T result = caseOrExpression(orExpression);
				if (result == null) result = caseBooleanExpression(orExpression);
				if (result == null) result = caseThing(orExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.NOT_EXPRESSION: {
				NotExpression notExpression = (NotExpression)theEObject;
				T result = caseNotExpression(notExpression);
				if (result == null) result = caseBooleanExpression(notExpression);
				if (result == null) result = caseThing(notExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.AND_EXPRESSION: {
				AndExpression andExpression = (AndExpression)theEObject;
				T result = caseAndExpression(andExpression);
				if (result == null) result = caseBooleanExpression(andExpression);
				if (result == null) result = caseThing(andExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.EXCLUSIVE_OR_EXPRESSION: {
				ExclusiveOrExpression exclusiveOrExpression = (ExclusiveOrExpression)theEObject;
				T result = caseExclusiveOrExpression(exclusiveOrExpression);
				if (result == null) result = caseBooleanExpression(exclusiveOrExpression);
				if (result == null) result = caseThing(exclusiveOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION: {
				RelationalExpression relationalExpression = (RelationalExpression)theEObject;
				T result = caseRelationalExpression(relationalExpression);
				if (result == null) result = caseBooleanExpression(relationalExpression);
				if (result == null) result = caseThing(relationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.USER_RULE_VERIFICATION: {
				UserRuleVerification userRuleVerification = (UserRuleVerification)theEObject;
				T result = caseUserRuleVerification(userRuleVerification);
				if (result == null) result = caseRuleVerification(userRuleVerification);
				if (result == null) result = caseThing(userRuleVerification);
				if (result == null) result = caseNamedThing(userRuleVerification);
				if (result == null) result = caseOwnedThing(userRuleVerification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.BUILT_IN_RULE_VERIFICATION: {
				BuiltInRuleVerification builtInRuleVerification = (BuiltInRuleVerification)theEObject;
				T result = caseBuiltInRuleVerification(builtInRuleVerification);
				if (result == null) result = caseRuleVerification(builtInRuleVerification);
				if (result == null) result = caseThing(builtInRuleVerification);
				if (result == null) result = caseNamedThing(builtInRuleVerification);
				if (result == null) result = caseOwnedThing(builtInRuleVerification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EngineeringModelDataPackage.OWNED_THING: {
				OwnedThing ownedThing = (OwnedThing)theEObject;
				T result = caseOwnedThing(ownedThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possible Finite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possible Finite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossibleFiniteState(PossibleFiniteState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Or Override Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Or Override Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterOrOverrideBase(ParameterOrOverrideBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBase(ParameterBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Finite State List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Finite State List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualFiniteStateList(ActualFiniteStateList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Dependent Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Dependent Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionDependentThing(OptionDependentThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedElement(NestedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDefinition(ElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementBase(ElementBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementUsage(ElementUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Override</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Override</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterOverride(ParameterOverride object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterGroup(ParameterGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Override Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Override Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterOverrideValueSet(ParameterOverrideValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Set Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Set Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValueSetBase(ParameterValueSetBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Finite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Finite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualFiniteState(ActualFiniteState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValueSet(ParameterValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedParameter(NestedParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possible Finite State List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possible Finite State List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossibleFiniteStateList(PossibleFiniteStateList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSubscription(ParameterSubscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Subscription Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Subscription Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSubscriptionValueSet(ParameterSubscriptionValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileStore(FileStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolder(Folder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileRevision(FileRevision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublication(Publication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringModel(EngineeringModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common File Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common File Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonFileStore(CommonFileStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Log Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelLogEntry(ModelLogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteration(Iteration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipParameterValue(RelationshipParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValue(ParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Identifier Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Identifier Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalIdentifierMap(ExternalIdentifierMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdCorrespondence(IdCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsSpecification(RequirementsSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsContainer(RequirementsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsGroup(RequirementsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Container Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Container Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsContainerParameterValue(RequirementsContainerParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Parameterizable Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Parameterizable Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleParameterizableThing(SimpleParameterizableThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleParameterValue(SimpleParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametric Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametric Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametricConstraint(ParametricConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain File Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain File Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainFileStore(DomainFileStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Verification List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Verification List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleVerificationList(RuleVerificationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleVerification(RuleVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Violation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Violation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleViolation(RuleViolation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholder(Stakeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholderValue(StakeholderValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueGroup(ValueGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stake Holder Value Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stake Holder Value Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeHolderValueMap(StakeHolderValueMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stake Holder Value Map Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stake Holder Value Map Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeHolderValueMapSettings(StakeHolderValueMapSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiRelationship(MultiRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryRelationship(BinaryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrExpression(OrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotExpression(NotExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpression(AndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Or Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveOrExpression(ExclusiveOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalExpression(RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Rule Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Rule Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserRuleVerification(UserRuleVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Rule Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Rule Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInRuleVerification(BuiltInRuleVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owned Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owned Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnedThing(OwnedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedThing(NamedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Named Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Named Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortNamedThing(ShortNamedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedThing(DefinedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorizable Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorizable Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorizableThing(CategorizableThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volatile Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volatile Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolatileThing(VolatileThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamped Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamped Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStampedThing(TimeStampedThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopContainer(TopContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogEntry(LogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deprecatable Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deprecatable Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeprecatableThing(DeprecatableThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EngineeringModelDataSwitch
