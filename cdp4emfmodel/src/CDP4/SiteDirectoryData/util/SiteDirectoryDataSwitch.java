/**
 */
package CDP4.SiteDirectoryData.util;

import CDP4.CommonData.Annotation;
import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.LogEntry;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;
import CDP4.CommonData.TopContainer;

import CDP4.SiteDirectoryData.*;

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
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage
 * @generated
 */
public class SiteDirectoryDataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SiteDirectoryDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataSwitch() {
		if (modelPackage == null) {
			modelPackage = SiteDirectoryDataPackage.eINSTANCE;
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
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION: {
				ParticipantPermission participantPermission = (ParticipantPermission)theEObject;
				T result = caseParticipantPermission(participantPermission);
				if (result == null) result = caseThing(participantPermission);
				if (result == null) result = caseDeprecatableThing(participantPermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.REFERENCE_SOURCE: {
				ReferenceSource referenceSource = (ReferenceSource)theEObject;
				T result = caseReferenceSource(referenceSource);
				if (result == null) result = caseDefinedThing(referenceSource);
				if (result == null) result = caseCategorizableThing(referenceSource);
				if (result == null) result = caseDeprecatableThing(referenceSource);
				if (result == null) result = caseThing(referenceSource);
				if (result == null) result = caseNamedThing(referenceSource);
				if (result == null) result = caseShortNamedThing(referenceSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.CATEGORIZABLE_THING: {
				CategorizableThing categorizableThing = (CategorizableThing)theEObject;
				T result = caseCategorizableThing(categorizableThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseDefinedThing(category);
				if (result == null) result = caseDeprecatableThing(category);
				if (result == null) result = caseThing(category);
				if (result == null) result = caseNamedThing(category);
				if (result == null) result = caseShortNamedThing(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseThing(organization);
				if (result == null) result = caseDeprecatableThing(organization);
				if (result == null) result = caseNamedThing(organization);
				if (result == null) result = caseShortNamedThing(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseThing(person);
				if (result == null) result = caseDeprecatableThing(person);
				if (result == null) result = caseNamedThing(person);
				if (result == null) result = caseShortNamedThing(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.EMAIL_ADDRESS: {
				EmailAddress emailAddress = (EmailAddress)theEObject;
				T result = caseEmailAddress(emailAddress);
				if (result == null) result = caseThing(emailAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER: {
				TelephoneNumber telephoneNumber = (TelephoneNumber)theEObject;
				T result = caseTelephoneNumber(telephoneNumber);
				if (result == null) result = caseThing(telephoneNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.DOMAIN_OF_EXPERTISE: {
				DomainOfExpertise domainOfExpertise = (DomainOfExpertise)theEObject;
				T result = caseDomainOfExpertise(domainOfExpertise);
				if (result == null) result = caseDefinedThing(domainOfExpertise);
				if (result == null) result = caseCategorizableThing(domainOfExpertise);
				if (result == null) result = caseDeprecatableThing(domainOfExpertise);
				if (result == null) result = caseThing(domainOfExpertise);
				if (result == null) result = caseNamedThing(domainOfExpertise);
				if (result == null) result = caseShortNamedThing(domainOfExpertise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PERSON_ROLE: {
				PersonRole personRole = (PersonRole)theEObject;
				T result = casePersonRole(personRole);
				if (result == null) result = caseDefinedThing(personRole);
				if (result == null) result = caseDeprecatableThing(personRole);
				if (result == null) result = caseThing(personRole);
				if (result == null) result = caseNamedThing(personRole);
				if (result == null) result = caseShortNamedThing(personRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PERSON_PERMISSION: {
				PersonPermission personPermission = (PersonPermission)theEObject;
				T result = casePersonPermission(personPermission);
				if (result == null) result = caseThing(personPermission);
				if (result == null) result = caseDeprecatableThing(personPermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.USER_PREFERENCE: {
				UserPreference userPreference = (UserPreference)theEObject;
				T result = caseUserPreference(userPreference);
				if (result == null) result = caseThing(userPreference);
				if (result == null) result = caseShortNamedThing(userPreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SITE_DIRECTORY: {
				SiteDirectory siteDirectory = (SiteDirectory)theEObject;
				T result = caseSiteDirectory(siteDirectory);
				if (result == null) result = caseTopContainer(siteDirectory);
				if (result == null) result = caseNamedThing(siteDirectory);
				if (result == null) result = caseShortNamedThing(siteDirectory);
				if (result == null) result = caseTimeStampedThing(siteDirectory);
				if (result == null) result = caseThing(siteDirectory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PARTICIPANT_ROLE: {
				ParticipantRole participantRole = (ParticipantRole)theEObject;
				T result = caseParticipantRole(participantRole);
				if (result == null) result = caseDefinedThing(participantRole);
				if (result == null) result = caseDeprecatableThing(participantRole);
				if (result == null) result = caseThing(participantRole);
				if (result == null) result = caseNamedThing(participantRole);
				if (result == null) result = caseShortNamedThing(participantRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SITE_REFERENCE_DATA_LIBRARY: {
				SiteReferenceDataLibrary siteReferenceDataLibrary = (SiteReferenceDataLibrary)theEObject;
				T result = caseSiteReferenceDataLibrary(siteReferenceDataLibrary);
				if (result == null) result = caseReferenceDataLibrary(siteReferenceDataLibrary);
				if (result == null) result = caseDeprecatableThing(siteReferenceDataLibrary);
				if (result == null) result = caseDefinedThing(siteReferenceDataLibrary);
				if (result == null) result = caseParticipantAffectedAccessThing(siteReferenceDataLibrary);
				if (result == null) result = caseThing(siteReferenceDataLibrary);
				if (result == null) result = caseNamedThing(siteReferenceDataLibrary);
				if (result == null) result = caseShortNamedThing(siteReferenceDataLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY: {
				ReferenceDataLibrary referenceDataLibrary = (ReferenceDataLibrary)theEObject;
				T result = caseReferenceDataLibrary(referenceDataLibrary);
				if (result == null) result = caseDefinedThing(referenceDataLibrary);
				if (result == null) result = caseParticipantAffectedAccessThing(referenceDataLibrary);
				if (result == null) result = caseThing(referenceDataLibrary);
				if (result == null) result = caseNamedThing(referenceDataLibrary);
				if (result == null) result = caseShortNamedThing(referenceDataLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PARTICIPANT_AFFECTED_ACCESS_THING: {
				ParticipantAffectedAccessThing participantAffectedAccessThing = (ParticipantAffectedAccessThing)theEObject;
				T result = caseParticipantAffectedAccessThing(participantAffectedAccessThing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = caseDefinedThing(parameterType);
				if (result == null) result = caseCategorizableThing(parameterType);
				if (result == null) result = caseDeprecatableThing(parameterType);
				if (result == null) result = caseThing(parameterType);
				if (result == null) result = caseNamedThing(parameterType);
				if (result == null) result = caseShortNamedThing(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.QUANTITY_KIND: {
				QuantityKind quantityKind = (QuantityKind)theEObject;
				T result = caseQuantityKind(quantityKind);
				if (result == null) result = caseScalarParameterType(quantityKind);
				if (result == null) result = caseParameterType(quantityKind);
				if (result == null) result = caseDefinedThing(quantityKind);
				if (result == null) result = caseCategorizableThing(quantityKind);
				if (result == null) result = caseDeprecatableThing(quantityKind);
				if (result == null) result = caseThing(quantityKind);
				if (result == null) result = caseNamedThing(quantityKind);
				if (result == null) result = caseShortNamedThing(quantityKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SCALAR_PARAMETER_TYPE: {
				ScalarParameterType scalarParameterType = (ScalarParameterType)theEObject;
				T result = caseScalarParameterType(scalarParameterType);
				if (result == null) result = caseParameterType(scalarParameterType);
				if (result == null) result = caseDefinedThing(scalarParameterType);
				if (result == null) result = caseCategorizableThing(scalarParameterType);
				if (result == null) result = caseDeprecatableThing(scalarParameterType);
				if (result == null) result = caseThing(scalarParameterType);
				if (result == null) result = caseNamedThing(scalarParameterType);
				if (result == null) result = caseShortNamedThing(scalarParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.MEASUREMENT_SCALE: {
				MeasurementScale measurementScale = (MeasurementScale)theEObject;
				T result = caseMeasurementScale(measurementScale);
				if (result == null) result = caseDefinedThing(measurementScale);
				if (result == null) result = caseDeprecatableThing(measurementScale);
				if (result == null) result = caseThing(measurementScale);
				if (result == null) result = caseNamedThing(measurementScale);
				if (result == null) result = caseShortNamedThing(measurementScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.MEASUREMENT_UNIT: {
				MeasurementUnit measurementUnit = (MeasurementUnit)theEObject;
				T result = caseMeasurementUnit(measurementUnit);
				if (result == null) result = caseDefinedThing(measurementUnit);
				if (result == null) result = caseDeprecatableThing(measurementUnit);
				if (result == null) result = caseThing(measurementUnit);
				if (result == null) result = caseNamedThing(measurementUnit);
				if (result == null) result = caseShortNamedThing(measurementUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SCALE_VALUE_DEFINITION: {
				ScaleValueDefinition scaleValueDefinition = (ScaleValueDefinition)theEObject;
				T result = caseScaleValueDefinition(scaleValueDefinition);
				if (result == null) result = caseDefinedThing(scaleValueDefinition);
				if (result == null) result = caseThing(scaleValueDefinition);
				if (result == null) result = caseNamedThing(scaleValueDefinition);
				if (result == null) result = caseShortNamedThing(scaleValueDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE: {
				MappingToReferenceScale mappingToReferenceScale = (MappingToReferenceScale)theEObject;
				T result = caseMappingToReferenceScale(mappingToReferenceScale);
				if (result == null) result = caseThing(mappingToReferenceScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.UNIT_PREFIX: {
				UnitPrefix unitPrefix = (UnitPrefix)theEObject;
				T result = caseUnitPrefix(unitPrefix);
				if (result == null) result = caseDefinedThing(unitPrefix);
				if (result == null) result = caseDeprecatableThing(unitPrefix);
				if (result == null) result = caseThing(unitPrefix);
				if (result == null) result = caseNamedThing(unitPrefix);
				if (result == null) result = caseShortNamedThing(unitPrefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				T result = caseFileType(fileType);
				if (result == null) result = caseDefinedThing(fileType);
				if (result == null) result = caseCategorizableThing(fileType);
				if (result == null) result = caseDeprecatableThing(fileType);
				if (result == null) result = caseThing(fileType);
				if (result == null) result = caseNamedThing(fileType);
				if (result == null) result = caseShortNamedThing(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.GLOSSARY: {
				Glossary glossary = (Glossary)theEObject;
				T result = caseGlossary(glossary);
				if (result == null) result = caseDefinedThing(glossary);
				if (result == null) result = caseCategorizableThing(glossary);
				if (result == null) result = caseDeprecatableThing(glossary);
				if (result == null) result = caseThing(glossary);
				if (result == null) result = caseNamedThing(glossary);
				if (result == null) result = caseShortNamedThing(glossary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseDefinedThing(term);
				if (result == null) result = caseDeprecatableThing(term);
				if (result == null) result = caseThing(term);
				if (result == null) result = caseNamedThing(term);
				if (result == null) result = caseShortNamedThing(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseDefinedThing(rule);
				if (result == null) result = caseDeprecatableThing(rule);
				if (result == null) result = caseThing(rule);
				if (result == null) result = caseNamedThing(rule);
				if (result == null) result = caseShortNamedThing(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseDefinedThing(constant);
				if (result == null) result = caseCategorizableThing(constant);
				if (result == null) result = caseDeprecatableThing(constant);
				if (result == null) result = caseThing(constant);
				if (result == null) result = caseNamedThing(constant);
				if (result == null) result = caseShortNamedThing(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP: {
				EngineeringModelSetup engineeringModelSetup = (EngineeringModelSetup)theEObject;
				T result = caseEngineeringModelSetup(engineeringModelSetup);
				if (result == null) result = caseDefinedThing(engineeringModelSetup);
				if (result == null) result = caseParticipantAffectedAccessThing(engineeringModelSetup);
				if (result == null) result = caseThing(engineeringModelSetup);
				if (result == null) result = caseNamedThing(engineeringModelSetup);
				if (result == null) result = caseShortNamedThing(engineeringModelSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseThing(participant);
				if (result == null) result = caseParticipantAffectedAccessThing(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.MODEL_REFERENCE_DATA_LIBRARY: {
				ModelReferenceDataLibrary modelReferenceDataLibrary = (ModelReferenceDataLibrary)theEObject;
				T result = caseModelReferenceDataLibrary(modelReferenceDataLibrary);
				if (result == null) result = caseReferenceDataLibrary(modelReferenceDataLibrary);
				if (result == null) result = caseDefinedThing(modelReferenceDataLibrary);
				if (result == null) result = caseParticipantAffectedAccessThing(modelReferenceDataLibrary);
				if (result == null) result = caseThing(modelReferenceDataLibrary);
				if (result == null) result = caseNamedThing(modelReferenceDataLibrary);
				if (result == null) result = caseShortNamedThing(modelReferenceDataLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.ITERATION_SETUP: {
				IterationSetup iterationSetup = (IterationSetup)theEObject;
				T result = caseIterationSetup(iterationSetup);
				if (result == null) result = caseThing(iterationSetup);
				if (result == null) result = caseTimeStampedThing(iterationSetup);
				if (result == null) result = caseParticipantAffectedAccessThing(iterationSetup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SITE_LOG_ENTRY: {
				SiteLogEntry siteLogEntry = (SiteLogEntry)theEObject;
				T result = caseSiteLogEntry(siteLogEntry);
				if (result == null) result = caseThing(siteLogEntry);
				if (result == null) result = caseLogEntry(siteLogEntry);
				if (result == null) result = caseAnnotation(siteLogEntry);
				if (result == null) result = caseCategorizableThing(siteLogEntry);
				if (result == null) result = caseTimeStampedThing(siteLogEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.DOMAIN_OF_EXPERTISE_GROUP: {
				DomainOfExpertiseGroup domainOfExpertiseGroup = (DomainOfExpertiseGroup)theEObject;
				T result = caseDomainOfExpertiseGroup(domainOfExpertiseGroup);
				if (result == null) result = caseDefinedThing(domainOfExpertiseGroup);
				if (result == null) result = caseDeprecatableThing(domainOfExpertiseGroup);
				if (result == null) result = caseThing(domainOfExpertiseGroup);
				if (result == null) result = caseNamedThing(domainOfExpertiseGroup);
				if (result == null) result = caseShortNamedThing(domainOfExpertiseGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE: {
				NaturalLanguage naturalLanguage = (NaturalLanguage)theEObject;
				T result = caseNaturalLanguage(naturalLanguage);
				if (result == null) result = caseThing(naturalLanguage);
				if (result == null) result = caseNamedThing(naturalLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE: {
				BinaryRelationshipRule binaryRelationshipRule = (BinaryRelationshipRule)theEObject;
				T result = caseBinaryRelationshipRule(binaryRelationshipRule);
				if (result == null) result = caseRule(binaryRelationshipRule);
				if (result == null) result = caseDefinedThing(binaryRelationshipRule);
				if (result == null) result = caseDeprecatableThing(binaryRelationshipRule);
				if (result == null) result = caseThing(binaryRelationshipRule);
				if (result == null) result = caseNamedThing(binaryRelationshipRule);
				if (result == null) result = caseShortNamedThing(binaryRelationshipRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE: {
				ArrayParameterType arrayParameterType = (ArrayParameterType)theEObject;
				T result = caseArrayParameterType(arrayParameterType);
				if (result == null) result = caseCompoundParameterType(arrayParameterType);
				if (result == null) result = caseParameterType(arrayParameterType);
				if (result == null) result = caseDefinedThing(arrayParameterType);
				if (result == null) result = caseCategorizableThing(arrayParameterType);
				if (result == null) result = caseDeprecatableThing(arrayParameterType);
				if (result == null) result = caseThing(arrayParameterType);
				if (result == null) result = caseNamedThing(arrayParameterType);
				if (result == null) result = caseShortNamedThing(arrayParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE: {
				CompoundParameterType compoundParameterType = (CompoundParameterType)theEObject;
				T result = caseCompoundParameterType(compoundParameterType);
				if (result == null) result = caseParameterType(compoundParameterType);
				if (result == null) result = caseDefinedThing(compoundParameterType);
				if (result == null) result = caseCategorizableThing(compoundParameterType);
				if (result == null) result = caseDeprecatableThing(compoundParameterType);
				if (result == null) result = caseThing(compoundParameterType);
				if (result == null) result = caseNamedThing(compoundParameterType);
				if (result == null) result = caseShortNamedThing(compoundParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT: {
				ParameterTypeComponent parameterTypeComponent = (ParameterTypeComponent)theEObject;
				T result = caseParameterTypeComponent(parameterTypeComponent);
				if (result == null) result = caseThing(parameterTypeComponent);
				if (result == null) result = caseShortNamedThing(parameterTypeComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.CYCLIC_RATIO_SCALE: {
				CyclicRatioScale cyclicRatioScale = (CyclicRatioScale)theEObject;
				T result = caseCyclicRatioScale(cyclicRatioScale);
				if (result == null) result = caseRatioScale(cyclicRatioScale);
				if (result == null) result = caseMeasurementScale(cyclicRatioScale);
				if (result == null) result = caseDefinedThing(cyclicRatioScale);
				if (result == null) result = caseDeprecatableThing(cyclicRatioScale);
				if (result == null) result = caseThing(cyclicRatioScale);
				if (result == null) result = caseNamedThing(cyclicRatioScale);
				if (result == null) result = caseShortNamedThing(cyclicRatioScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.RATIO_SCALE: {
				RatioScale ratioScale = (RatioScale)theEObject;
				T result = caseRatioScale(ratioScale);
				if (result == null) result = caseMeasurementScale(ratioScale);
				if (result == null) result = caseDefinedThing(ratioScale);
				if (result == null) result = caseDeprecatableThing(ratioScale);
				if (result == null) result = caseThing(ratioScale);
				if (result == null) result = caseNamedThing(ratioScale);
				if (result == null) result = caseShortNamedThing(ratioScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE: {
				EnumerationParameterType enumerationParameterType = (EnumerationParameterType)theEObject;
				T result = caseEnumerationParameterType(enumerationParameterType);
				if (result == null) result = caseScalarParameterType(enumerationParameterType);
				if (result == null) result = caseParameterType(enumerationParameterType);
				if (result == null) result = caseDefinedThing(enumerationParameterType);
				if (result == null) result = caseCategorizableThing(enumerationParameterType);
				if (result == null) result = caseDeprecatableThing(enumerationParameterType);
				if (result == null) result = caseThing(enumerationParameterType);
				if (result == null) result = caseNamedThing(enumerationParameterType);
				if (result == null) result = caseShortNamedThing(enumerationParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.ENUMERATION_VALUE_DEFINITION: {
				EnumerationValueDefinition enumerationValueDefinition = (EnumerationValueDefinition)theEObject;
				T result = caseEnumerationValueDefinition(enumerationValueDefinition);
				if (result == null) result = caseDefinedThing(enumerationValueDefinition);
				if (result == null) result = caseThing(enumerationValueDefinition);
				if (result == null) result = caseNamedThing(enumerationValueDefinition);
				if (result == null) result = caseShortNamedThing(enumerationValueDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.ORDINAL_SCALE: {
				OrdinalScale ordinalScale = (OrdinalScale)theEObject;
				T result = caseOrdinalScale(ordinalScale);
				if (result == null) result = caseMeasurementScale(ordinalScale);
				if (result == null) result = caseDefinedThing(ordinalScale);
				if (result == null) result = caseDeprecatableThing(ordinalScale);
				if (result == null) result = caseThing(ordinalScale);
				if (result == null) result = caseNamedThing(ordinalScale);
				if (result == null) result = caseShortNamedThing(ordinalScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.REFERENCER_RULE: {
				ReferencerRule referencerRule = (ReferencerRule)theEObject;
				T result = caseReferencerRule(referencerRule);
				if (result == null) result = caseRule(referencerRule);
				if (result == null) result = caseDefinedThing(referencerRule);
				if (result == null) result = caseDeprecatableThing(referencerRule);
				if (result == null) result = caseThing(referencerRule);
				if (result == null) result = caseNamedThing(referencerRule);
				if (result == null) result = caseShortNamedThing(referencerRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.BOOLEAN_PARAMETER_TYPE: {
				BooleanParameterType booleanParameterType = (BooleanParameterType)theEObject;
				T result = caseBooleanParameterType(booleanParameterType);
				if (result == null) result = caseScalarParameterType(booleanParameterType);
				if (result == null) result = caseParameterType(booleanParameterType);
				if (result == null) result = caseDefinedThing(booleanParameterType);
				if (result == null) result = caseCategorizableThing(booleanParameterType);
				if (result == null) result = caseDeprecatableThing(booleanParameterType);
				if (result == null) result = caseThing(booleanParameterType);
				if (result == null) result = caseNamedThing(booleanParameterType);
				if (result == null) result = caseShortNamedThing(booleanParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SCALE_REFERENCE_QUANTITY_VALUE: {
				ScaleReferenceQuantityValue scaleReferenceQuantityValue = (ScaleReferenceQuantityValue)theEObject;
				T result = caseScaleReferenceQuantityValue(scaleReferenceQuantityValue);
				if (result == null) result = caseThing(scaleReferenceQuantityValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.DATE_PARAMETER_TYPE: {
				DateParameterType dateParameterType = (DateParameterType)theEObject;
				T result = caseDateParameterType(dateParameterType);
				if (result == null) result = caseScalarParameterType(dateParameterType);
				if (result == null) result = caseParameterType(dateParameterType);
				if (result == null) result = caseDefinedThing(dateParameterType);
				if (result == null) result = caseCategorizableThing(dateParameterType);
				if (result == null) result = caseDeprecatableThing(dateParameterType);
				if (result == null) result = caseThing(dateParameterType);
				if (result == null) result = caseNamedThing(dateParameterType);
				if (result == null) result = caseShortNamedThing(dateParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.LINEAR_CONVERSION_UNIT: {
				LinearConversionUnit linearConversionUnit = (LinearConversionUnit)theEObject;
				T result = caseLinearConversionUnit(linearConversionUnit);
				if (result == null) result = caseConversionBasedUnit(linearConversionUnit);
				if (result == null) result = caseMeasurementUnit(linearConversionUnit);
				if (result == null) result = caseDefinedThing(linearConversionUnit);
				if (result == null) result = caseDeprecatableThing(linearConversionUnit);
				if (result == null) result = caseThing(linearConversionUnit);
				if (result == null) result = caseNamedThing(linearConversionUnit);
				if (result == null) result = caseShortNamedThing(linearConversionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT: {
				ConversionBasedUnit conversionBasedUnit = (ConversionBasedUnit)theEObject;
				T result = caseConversionBasedUnit(conversionBasedUnit);
				if (result == null) result = caseMeasurementUnit(conversionBasedUnit);
				if (result == null) result = caseDefinedThing(conversionBasedUnit);
				if (result == null) result = caseDeprecatableThing(conversionBasedUnit);
				if (result == null) result = caseThing(conversionBasedUnit);
				if (result == null) result = caseNamedThing(conversionBasedUnit);
				if (result == null) result = caseShortNamedThing(conversionBasedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.DERIVED_UNIT: {
				DerivedUnit derivedUnit = (DerivedUnit)theEObject;
				T result = caseDerivedUnit(derivedUnit);
				if (result == null) result = caseMeasurementUnit(derivedUnit);
				if (result == null) result = caseDefinedThing(derivedUnit);
				if (result == null) result = caseDeprecatableThing(derivedUnit);
				if (result == null) result = caseThing(derivedUnit);
				if (result == null) result = caseNamedThing(derivedUnit);
				if (result == null) result = caseShortNamedThing(derivedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.UNIT_FACTOR: {
				UnitFactor unitFactor = (UnitFactor)theEObject;
				T result = caseUnitFactor(unitFactor);
				if (result == null) result = caseThing(unitFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR: {
				QuantityKindFactor quantityKindFactor = (QuantityKindFactor)theEObject;
				T result = caseQuantityKindFactor(quantityKindFactor);
				if (result == null) result = caseThing(quantityKindFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.TEXT_PARAMETER_TYPE: {
				TextParameterType textParameterType = (TextParameterType)theEObject;
				T result = caseTextParameterType(textParameterType);
				if (result == null) result = caseScalarParameterType(textParameterType);
				if (result == null) result = caseParameterType(textParameterType);
				if (result == null) result = caseDefinedThing(textParameterType);
				if (result == null) result = caseCategorizableThing(textParameterType);
				if (result == null) result = caseDeprecatableThing(textParameterType);
				if (result == null) result = caseThing(textParameterType);
				if (result == null) result = caseNamedThing(textParameterType);
				if (result == null) result = caseShortNamedThing(textParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.INTERVAL_SCALE: {
				IntervalScale intervalScale = (IntervalScale)theEObject;
				T result = caseIntervalScale(intervalScale);
				if (result == null) result = caseMeasurementScale(intervalScale);
				if (result == null) result = caseDefinedThing(intervalScale);
				if (result == null) result = caseDeprecatableThing(intervalScale);
				if (result == null) result = caseThing(intervalScale);
				if (result == null) result = caseNamedThing(intervalScale);
				if (result == null) result = caseShortNamedThing(intervalScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SPECIALIZED_QUANTITY_KIND: {
				SpecializedQuantityKind specializedQuantityKind = (SpecializedQuantityKind)theEObject;
				T result = caseSpecializedQuantityKind(specializedQuantityKind);
				if (result == null) result = caseQuantityKind(specializedQuantityKind);
				if (result == null) result = caseScalarParameterType(specializedQuantityKind);
				if (result == null) result = caseParameterType(specializedQuantityKind);
				if (result == null) result = caseDefinedThing(specializedQuantityKind);
				if (result == null) result = caseCategorizableThing(specializedQuantityKind);
				if (result == null) result = caseDeprecatableThing(specializedQuantityKind);
				if (result == null) result = caseThing(specializedQuantityKind);
				if (result == null) result = caseNamedThing(specializedQuantityKind);
				if (result == null) result = caseShortNamedThing(specializedQuantityKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SIMPLE_UNIT: {
				SimpleUnit simpleUnit = (SimpleUnit)theEObject;
				T result = caseSimpleUnit(simpleUnit);
				if (result == null) result = caseMeasurementUnit(simpleUnit);
				if (result == null) result = caseDefinedThing(simpleUnit);
				if (result == null) result = caseDeprecatableThing(simpleUnit);
				if (result == null) result = caseThing(simpleUnit);
				if (result == null) result = caseNamedThing(simpleUnit);
				if (result == null) result = caseShortNamedThing(simpleUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE: {
				MultiRelationshipRule multiRelationshipRule = (MultiRelationshipRule)theEObject;
				T result = caseMultiRelationshipRule(multiRelationshipRule);
				if (result == null) result = caseRule(multiRelationshipRule);
				if (result == null) result = caseDefinedThing(multiRelationshipRule);
				if (result == null) result = caseDeprecatableThing(multiRelationshipRule);
				if (result == null) result = caseThing(multiRelationshipRule);
				if (result == null) result = caseNamedThing(multiRelationshipRule);
				if (result == null) result = caseShortNamedThing(multiRelationshipRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.SIMPLE_QUANTITY_KIND: {
				SimpleQuantityKind simpleQuantityKind = (SimpleQuantityKind)theEObject;
				T result = caseSimpleQuantityKind(simpleQuantityKind);
				if (result == null) result = caseQuantityKind(simpleQuantityKind);
				if (result == null) result = caseScalarParameterType(simpleQuantityKind);
				if (result == null) result = caseParameterType(simpleQuantityKind);
				if (result == null) result = caseDefinedThing(simpleQuantityKind);
				if (result == null) result = caseCategorizableThing(simpleQuantityKind);
				if (result == null) result = caseDeprecatableThing(simpleQuantityKind);
				if (result == null) result = caseThing(simpleQuantityKind);
				if (result == null) result = caseNamedThing(simpleQuantityKind);
				if (result == null) result = caseShortNamedThing(simpleQuantityKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PREFIXED_UNIT: {
				PrefixedUnit prefixedUnit = (PrefixedUnit)theEObject;
				T result = casePrefixedUnit(prefixedUnit);
				if (result == null) result = caseConversionBasedUnit(prefixedUnit);
				if (result == null) result = caseMeasurementUnit(prefixedUnit);
				if (result == null) result = caseDefinedThing(prefixedUnit);
				if (result == null) result = caseDeprecatableThing(prefixedUnit);
				if (result == null) result = caseThing(prefixedUnit);
				if (result == null) result = caseNamedThing(prefixedUnit);
				if (result == null) result = caseShortNamedThing(prefixedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.DATE_TIME_PARAMETER_TYPE: {
				DateTimeParameterType dateTimeParameterType = (DateTimeParameterType)theEObject;
				T result = caseDateTimeParameterType(dateTimeParameterType);
				if (result == null) result = caseScalarParameterType(dateTimeParameterType);
				if (result == null) result = caseParameterType(dateTimeParameterType);
				if (result == null) result = caseDefinedThing(dateTimeParameterType);
				if (result == null) result = caseCategorizableThing(dateTimeParameterType);
				if (result == null) result = caseDeprecatableThing(dateTimeParameterType);
				if (result == null) result = caseThing(dateTimeParameterType);
				if (result == null) result = caseNamedThing(dateTimeParameterType);
				if (result == null) result = caseShortNamedThing(dateTimeParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.TIME_OF_DAY_PARAMETER_TYPE: {
				TimeOfDayParameterType timeOfDayParameterType = (TimeOfDayParameterType)theEObject;
				T result = caseTimeOfDayParameterType(timeOfDayParameterType);
				if (result == null) result = caseScalarParameterType(timeOfDayParameterType);
				if (result == null) result = caseParameterType(timeOfDayParameterType);
				if (result == null) result = caseDefinedThing(timeOfDayParameterType);
				if (result == null) result = caseCategorizableThing(timeOfDayParameterType);
				if (result == null) result = caseDeprecatableThing(timeOfDayParameterType);
				if (result == null) result = caseThing(timeOfDayParameterType);
				if (result == null) result = caseNamedThing(timeOfDayParameterType);
				if (result == null) result = caseShortNamedThing(timeOfDayParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE: {
				DecompositionRule decompositionRule = (DecompositionRule)theEObject;
				T result = caseDecompositionRule(decompositionRule);
				if (result == null) result = caseRule(decompositionRule);
				if (result == null) result = caseDefinedThing(decompositionRule);
				if (result == null) result = caseDeprecatableThing(decompositionRule);
				if (result == null) result = caseThing(decompositionRule);
				if (result == null) result = caseNamedThing(decompositionRule);
				if (result == null) result = caseShortNamedThing(decompositionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND: {
				DerivedQuantityKind derivedQuantityKind = (DerivedQuantityKind)theEObject;
				T result = caseDerivedQuantityKind(derivedQuantityKind);
				if (result == null) result = caseQuantityKind(derivedQuantityKind);
				if (result == null) result = caseScalarParameterType(derivedQuantityKind);
				if (result == null) result = caseParameterType(derivedQuantityKind);
				if (result == null) result = caseDefinedThing(derivedQuantityKind);
				if (result == null) result = caseCategorizableThing(derivedQuantityKind);
				if (result == null) result = caseDeprecatableThing(derivedQuantityKind);
				if (result == null) result = caseThing(derivedQuantityKind);
				if (result == null) result = caseNamedThing(derivedQuantityKind);
				if (result == null) result = caseShortNamedThing(derivedQuantityKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE: {
				LogarithmicScale logarithmicScale = (LogarithmicScale)theEObject;
				T result = caseLogarithmicScale(logarithmicScale);
				if (result == null) result = caseMeasurementScale(logarithmicScale);
				if (result == null) result = caseDefinedThing(logarithmicScale);
				if (result == null) result = caseDeprecatableThing(logarithmicScale);
				if (result == null) result = caseThing(logarithmicScale);
				if (result == null) result = caseNamedThing(logarithmicScale);
				if (result == null) result = caseShortNamedThing(logarithmicScale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE: {
				ParameterizedCategoryRule parameterizedCategoryRule = (ParameterizedCategoryRule)theEObject;
				T result = caseParameterizedCategoryRule(parameterizedCategoryRule);
				if (result == null) result = caseRule(parameterizedCategoryRule);
				if (result == null) result = caseDefinedThing(parameterizedCategoryRule);
				if (result == null) result = caseDeprecatableThing(parameterizedCategoryRule);
				if (result == null) result = caseThing(parameterizedCategoryRule);
				if (result == null) result = caseNamedThing(parameterizedCategoryRule);
				if (result == null) result = caseShortNamedThing(parameterizedCategoryRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantPermission(ParticipantPermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceSource(ReferenceSource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailAddress(EmailAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telephone Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telephone Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelephoneNumber(TelephoneNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Of Expertise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Of Expertise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainOfExpertise(DomainOfExpertise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonRole(PersonRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonPermission(PersonPermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Preference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Preference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPreference(UserPreference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteDirectory(SiteDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRole(ParticipantRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Reference Data Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Reference Data Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteReferenceDataLibrary(SiteReferenceDataLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Data Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Data Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceDataLibrary(ReferenceDataLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Affected Access Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Affected Access Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantAffectedAccessThing(ParticipantAffectedAccessThing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityKind(QuantityKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarParameterType(ScalarParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementScale(MeasurementScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementUnit(MeasurementUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Value Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Value Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleValueDefinition(ScaleValueDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping To Reference Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping To Reference Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingToReferenceScale(MappingToReferenceScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitPrefix(UnitPrefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileType(FileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossary(Glossary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Model Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Model Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringModelSetup(EngineeringModelSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Reference Data Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Reference Data Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelReferenceDataLibrary(ModelReferenceDataLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Setup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Setup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationSetup(IterationSetup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Log Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteLogEntry(SiteLogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Of Expertise Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Of Expertise Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainOfExpertiseGroup(DomainOfExpertiseGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalLanguage(NaturalLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Relationship Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Relationship Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryRelationshipRule(BinaryRelationshipRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayParameterType(ArrayParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundParameterType(CompoundParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterTypeComponent(ParameterTypeComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cyclic Ratio Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cyclic Ratio Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCyclicRatioScale(CyclicRatioScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatioScale(RatioScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationParameterType(EnumerationParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Value Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Value Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationValueDefinition(EnumerationValueDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalScale(OrdinalScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referencer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referencer Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencerRule(ReferencerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanParameterType(BooleanParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Reference Quantity Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Reference Quantity Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleReferenceQuantityValue(ScaleReferenceQuantityValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateParameterType(DateParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Conversion Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Conversion Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearConversionUnit(LinearConversionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion Based Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion Based Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionBasedUnit(ConversionBasedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedUnit(DerivedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitFactor(UnitFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Kind Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Kind Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityKindFactor(QuantityKindFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextParameterType(TextParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalScale(IntervalScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialized Quantity Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialized Quantity Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializedQuantityKind(SpecializedQuantityKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleUnit(SimpleUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Relationship Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Relationship Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiRelationshipRule(MultiRelationshipRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Quantity Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Quantity Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleQuantityKind(SimpleQuantityKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefixed Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefixed Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixedUnit(PrefixedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeParameterType(DateTimeParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Of Day Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Of Day Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOfDayParameterType(TimeOfDayParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecompositionRule(DecompositionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Quantity Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Quantity Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedQuantityKind(DerivedQuantityKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logarithmic Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logarithmic Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogarithmicScale(LogarithmicScale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Category Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Category Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedCategoryRule(ParameterizedCategoryRule object) {
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

} //SiteDirectoryDataSwitch
