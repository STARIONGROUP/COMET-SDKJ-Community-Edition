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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage
 * @generated
 */
public class SiteDirectoryDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SiteDirectoryDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SiteDirectoryDataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteDirectoryDataSwitch<Adapter> modelSwitch =
		new SiteDirectoryDataSwitch<Adapter>() {
			@Override
			public Adapter caseParticipantPermission(ParticipantPermission object) {
				return createParticipantPermissionAdapter();
			}
			@Override
			public Adapter caseReferenceSource(ReferenceSource object) {
				return createReferenceSourceAdapter();
			}
			@Override
			public Adapter caseCategorizableThing(CategorizableThing object) {
				return createCategorizableThingAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseEmailAddress(EmailAddress object) {
				return createEmailAddressAdapter();
			}
			@Override
			public Adapter caseTelephoneNumber(TelephoneNumber object) {
				return createTelephoneNumberAdapter();
			}
			@Override
			public Adapter caseDomainOfExpertise(DomainOfExpertise object) {
				return createDomainOfExpertiseAdapter();
			}
			@Override
			public Adapter casePersonRole(PersonRole object) {
				return createPersonRoleAdapter();
			}
			@Override
			public Adapter casePersonPermission(PersonPermission object) {
				return createPersonPermissionAdapter();
			}
			@Override
			public Adapter caseUserPreference(UserPreference object) {
				return createUserPreferenceAdapter();
			}
			@Override
			public Adapter caseSiteDirectory(SiteDirectory object) {
				return createSiteDirectoryAdapter();
			}
			@Override
			public Adapter caseParticipantRole(ParticipantRole object) {
				return createParticipantRoleAdapter();
			}
			@Override
			public Adapter caseSiteReferenceDataLibrary(SiteReferenceDataLibrary object) {
				return createSiteReferenceDataLibraryAdapter();
			}
			@Override
			public Adapter caseReferenceDataLibrary(ReferenceDataLibrary object) {
				return createReferenceDataLibraryAdapter();
			}
			@Override
			public Adapter caseParticipantAffectedAccessThing(ParticipantAffectedAccessThing object) {
				return createParticipantAffectedAccessThingAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseQuantityKind(QuantityKind object) {
				return createQuantityKindAdapter();
			}
			@Override
			public Adapter caseScalarParameterType(ScalarParameterType object) {
				return createScalarParameterTypeAdapter();
			}
			@Override
			public Adapter caseMeasurementScale(MeasurementScale object) {
				return createMeasurementScaleAdapter();
			}
			@Override
			public Adapter caseMeasurementUnit(MeasurementUnit object) {
				return createMeasurementUnitAdapter();
			}
			@Override
			public Adapter caseScaleValueDefinition(ScaleValueDefinition object) {
				return createScaleValueDefinitionAdapter();
			}
			@Override
			public Adapter caseMappingToReferenceScale(MappingToReferenceScale object) {
				return createMappingToReferenceScaleAdapter();
			}
			@Override
			public Adapter caseUnitPrefix(UnitPrefix object) {
				return createUnitPrefixAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseGlossary(Glossary object) {
				return createGlossaryAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseEngineeringModelSetup(EngineeringModelSetup object) {
				return createEngineeringModelSetupAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseModelReferenceDataLibrary(ModelReferenceDataLibrary object) {
				return createModelReferenceDataLibraryAdapter();
			}
			@Override
			public Adapter caseIterationSetup(IterationSetup object) {
				return createIterationSetupAdapter();
			}
			@Override
			public Adapter caseSiteLogEntry(SiteLogEntry object) {
				return createSiteLogEntryAdapter();
			}
			@Override
			public Adapter caseDomainOfExpertiseGroup(DomainOfExpertiseGroup object) {
				return createDomainOfExpertiseGroupAdapter();
			}
			@Override
			public Adapter caseNaturalLanguage(NaturalLanguage object) {
				return createNaturalLanguageAdapter();
			}
			@Override
			public Adapter caseBinaryRelationshipRule(BinaryRelationshipRule object) {
				return createBinaryRelationshipRuleAdapter();
			}
			@Override
			public Adapter caseArrayParameterType(ArrayParameterType object) {
				return createArrayParameterTypeAdapter();
			}
			@Override
			public Adapter caseCompoundParameterType(CompoundParameterType object) {
				return createCompoundParameterTypeAdapter();
			}
			@Override
			public Adapter caseParameterTypeComponent(ParameterTypeComponent object) {
				return createParameterTypeComponentAdapter();
			}
			@Override
			public Adapter caseCyclicRatioScale(CyclicRatioScale object) {
				return createCyclicRatioScaleAdapter();
			}
			@Override
			public Adapter caseRatioScale(RatioScale object) {
				return createRatioScaleAdapter();
			}
			@Override
			public Adapter caseEnumerationParameterType(EnumerationParameterType object) {
				return createEnumerationParameterTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationValueDefinition(EnumerationValueDefinition object) {
				return createEnumerationValueDefinitionAdapter();
			}
			@Override
			public Adapter caseOrdinalScale(OrdinalScale object) {
				return createOrdinalScaleAdapter();
			}
			@Override
			public Adapter caseReferencerRule(ReferencerRule object) {
				return createReferencerRuleAdapter();
			}
			@Override
			public Adapter caseBooleanParameterType(BooleanParameterType object) {
				return createBooleanParameterTypeAdapter();
			}
			@Override
			public Adapter caseScaleReferenceQuantityValue(ScaleReferenceQuantityValue object) {
				return createScaleReferenceQuantityValueAdapter();
			}
			@Override
			public Adapter caseDateParameterType(DateParameterType object) {
				return createDateParameterTypeAdapter();
			}
			@Override
			public Adapter caseLinearConversionUnit(LinearConversionUnit object) {
				return createLinearConversionUnitAdapter();
			}
			@Override
			public Adapter caseConversionBasedUnit(ConversionBasedUnit object) {
				return createConversionBasedUnitAdapter();
			}
			@Override
			public Adapter caseDerivedUnit(DerivedUnit object) {
				return createDerivedUnitAdapter();
			}
			@Override
			public Adapter caseUnitFactor(UnitFactor object) {
				return createUnitFactorAdapter();
			}
			@Override
			public Adapter caseQuantityKindFactor(QuantityKindFactor object) {
				return createQuantityKindFactorAdapter();
			}
			@Override
			public Adapter caseTextParameterType(TextParameterType object) {
				return createTextParameterTypeAdapter();
			}
			@Override
			public Adapter caseIntervalScale(IntervalScale object) {
				return createIntervalScaleAdapter();
			}
			@Override
			public Adapter caseSpecializedQuantityKind(SpecializedQuantityKind object) {
				return createSpecializedQuantityKindAdapter();
			}
			@Override
			public Adapter caseSimpleUnit(SimpleUnit object) {
				return createSimpleUnitAdapter();
			}
			@Override
			public Adapter caseMultiRelationshipRule(MultiRelationshipRule object) {
				return createMultiRelationshipRuleAdapter();
			}
			@Override
			public Adapter caseSimpleQuantityKind(SimpleQuantityKind object) {
				return createSimpleQuantityKindAdapter();
			}
			@Override
			public Adapter casePrefixedUnit(PrefixedUnit object) {
				return createPrefixedUnitAdapter();
			}
			@Override
			public Adapter caseDateTimeParameterType(DateTimeParameterType object) {
				return createDateTimeParameterTypeAdapter();
			}
			@Override
			public Adapter caseTimeOfDayParameterType(TimeOfDayParameterType object) {
				return createTimeOfDayParameterTypeAdapter();
			}
			@Override
			public Adapter caseDecompositionRule(DecompositionRule object) {
				return createDecompositionRuleAdapter();
			}
			@Override
			public Adapter caseDerivedQuantityKind(DerivedQuantityKind object) {
				return createDerivedQuantityKindAdapter();
			}
			@Override
			public Adapter caseLogarithmicScale(LogarithmicScale object) {
				return createLogarithmicScaleAdapter();
			}
			@Override
			public Adapter caseParameterizedCategoryRule(ParameterizedCategoryRule object) {
				return createParameterizedCategoryRuleAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter caseDeprecatableThing(DeprecatableThing object) {
				return createDeprecatableThingAdapter();
			}
			@Override
			public Adapter caseNamedThing(NamedThing object) {
				return createNamedThingAdapter();
			}
			@Override
			public Adapter caseShortNamedThing(ShortNamedThing object) {
				return createShortNamedThingAdapter();
			}
			@Override
			public Adapter caseDefinedThing(DefinedThing object) {
				return createDefinedThingAdapter();
			}
			@Override
			public Adapter caseTopContainer(TopContainer object) {
				return createTopContainerAdapter();
			}
			@Override
			public Adapter caseTimeStampedThing(TimeStampedThing object) {
				return createTimeStampedThingAdapter();
			}
			@Override
			public Adapter caseLogEntry(LogEntry object) {
				return createLogEntryAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ParticipantPermission <em>Participant Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ParticipantPermission
	 * @generated
	 */
	public Adapter createParticipantPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ReferenceSource <em>Reference Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ReferenceSource
	 * @generated
	 */
	public Adapter createReferenceSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.CategorizableThing <em>Categorizable Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.CategorizableThing
	 * @generated
	 */
	public Adapter createCategorizableThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.EmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.EmailAddress
	 * @generated
	 */
	public Adapter createEmailAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.TelephoneNumber
	 * @generated
	 */
	public Adapter createTelephoneNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.DomainOfExpertise <em>Domain Of Expertise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.DomainOfExpertise
	 * @generated
	 */
	public Adapter createDomainOfExpertiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.PersonRole <em>Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.PersonRole
	 * @generated
	 */
	public Adapter createPersonRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.PersonPermission <em>Person Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.PersonPermission
	 * @generated
	 */
	public Adapter createPersonPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.UserPreference <em>User Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.UserPreference
	 * @generated
	 */
	public Adapter createUserPreferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.SiteDirectory <em>Site Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.SiteDirectory
	 * @generated
	 */
	public Adapter createSiteDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ParticipantRole <em>Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ParticipantRole
	 * @generated
	 */
	public Adapter createParticipantRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.SiteReferenceDataLibrary <em>Site Reference Data Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.SiteReferenceDataLibrary
	 * @generated
	 */
	public Adapter createSiteReferenceDataLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ReferenceDataLibrary <em>Reference Data Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ReferenceDataLibrary
	 * @generated
	 */
	public Adapter createReferenceDataLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ParticipantAffectedAccessThing <em>Participant Affected Access Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ParticipantAffectedAccessThing
	 * @generated
	 */
	public Adapter createParticipantAffectedAccessThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.QuantityKind <em>Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.QuantityKind
	 * @generated
	 */
	public Adapter createQuantityKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ScalarParameterType <em>Scalar Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ScalarParameterType
	 * @generated
	 */
	public Adapter createScalarParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.MeasurementScale <em>Measurement Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.MeasurementScale
	 * @generated
	 */
	public Adapter createMeasurementScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.MeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.MeasurementUnit
	 * @generated
	 */
	public Adapter createMeasurementUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ScaleValueDefinition <em>Scale Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ScaleValueDefinition
	 * @generated
	 */
	public Adapter createScaleValueDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.MappingToReferenceScale <em>Mapping To Reference Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.MappingToReferenceScale
	 * @generated
	 */
	public Adapter createMappingToReferenceScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.UnitPrefix <em>Unit Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.UnitPrefix
	 * @generated
	 */
	public Adapter createUnitPrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.Glossary
	 * @generated
	 */
	public Adapter createGlossaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.EngineeringModelSetup <em>Engineering Model Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.EngineeringModelSetup
	 * @generated
	 */
	public Adapter createEngineeringModelSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ModelReferenceDataLibrary <em>Model Reference Data Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ModelReferenceDataLibrary
	 * @generated
	 */
	public Adapter createModelReferenceDataLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.IterationSetup <em>Iteration Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.IterationSetup
	 * @generated
	 */
	public Adapter createIterationSetupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.SiteLogEntry <em>Site Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.SiteLogEntry
	 * @generated
	 */
	public Adapter createSiteLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.DomainOfExpertiseGroup <em>Domain Of Expertise Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.DomainOfExpertiseGroup
	 * @generated
	 */
	public Adapter createDomainOfExpertiseGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.NaturalLanguage <em>Natural Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.NaturalLanguage
	 * @generated
	 */
	public Adapter createNaturalLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.BinaryRelationshipRule <em>Binary Relationship Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.BinaryRelationshipRule
	 * @generated
	 */
	public Adapter createBinaryRelationshipRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ArrayParameterType <em>Array Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ArrayParameterType
	 * @generated
	 */
	public Adapter createArrayParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.CompoundParameterType <em>Compound Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.CompoundParameterType
	 * @generated
	 */
	public Adapter createCompoundParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ParameterTypeComponent <em>Parameter Type Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ParameterTypeComponent
	 * @generated
	 */
	public Adapter createParameterTypeComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.CyclicRatioScale <em>Cyclic Ratio Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.CyclicRatioScale
	 * @generated
	 */
	public Adapter createCyclicRatioScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.RatioScale <em>Ratio Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.RatioScale
	 * @generated
	 */
	public Adapter createRatioScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.EnumerationParameterType <em>Enumeration Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.EnumerationParameterType
	 * @generated
	 */
	public Adapter createEnumerationParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.EnumerationValueDefinition <em>Enumeration Value Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.EnumerationValueDefinition
	 * @generated
	 */
	public Adapter createEnumerationValueDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.OrdinalScale <em>Ordinal Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.OrdinalScale
	 * @generated
	 */
	public Adapter createOrdinalScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ReferencerRule <em>Referencer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ReferencerRule
	 * @generated
	 */
	public Adapter createReferencerRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.BooleanParameterType <em>Boolean Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.BooleanParameterType
	 * @generated
	 */
	public Adapter createBooleanParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ScaleReferenceQuantityValue <em>Scale Reference Quantity Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ScaleReferenceQuantityValue
	 * @generated
	 */
	public Adapter createScaleReferenceQuantityValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.DateParameterType <em>Date Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.DateParameterType
	 * @generated
	 */
	public Adapter createDateParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.LinearConversionUnit <em>Linear Conversion Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.LinearConversionUnit
	 * @generated
	 */
	public Adapter createLinearConversionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ConversionBasedUnit <em>Conversion Based Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ConversionBasedUnit
	 * @generated
	 */
	public Adapter createConversionBasedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.DerivedUnit <em>Derived Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.DerivedUnit
	 * @generated
	 */
	public Adapter createDerivedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.UnitFactor <em>Unit Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.UnitFactor
	 * @generated
	 */
	public Adapter createUnitFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.QuantityKindFactor <em>Quantity Kind Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.QuantityKindFactor
	 * @generated
	 */
	public Adapter createQuantityKindFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.TextParameterType <em>Text Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.TextParameterType
	 * @generated
	 */
	public Adapter createTextParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.IntervalScale <em>Interval Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.IntervalScale
	 * @generated
	 */
	public Adapter createIntervalScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.SpecializedQuantityKind <em>Specialized Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.SpecializedQuantityKind
	 * @generated
	 */
	public Adapter createSpecializedQuantityKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.SimpleUnit <em>Simple Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.SimpleUnit
	 * @generated
	 */
	public Adapter createSimpleUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.MultiRelationshipRule <em>Multi Relationship Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.MultiRelationshipRule
	 * @generated
	 */
	public Adapter createMultiRelationshipRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.SimpleQuantityKind <em>Simple Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.SimpleQuantityKind
	 * @generated
	 */
	public Adapter createSimpleQuantityKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.PrefixedUnit <em>Prefixed Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.PrefixedUnit
	 * @generated
	 */
	public Adapter createPrefixedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.DateTimeParameterType <em>Date Time Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.DateTimeParameterType
	 * @generated
	 */
	public Adapter createDateTimeParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.TimeOfDayParameterType <em>Time Of Day Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.TimeOfDayParameterType
	 * @generated
	 */
	public Adapter createTimeOfDayParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.DecompositionRule <em>Decomposition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.DecompositionRule
	 * @generated
	 */
	public Adapter createDecompositionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.DerivedQuantityKind <em>Derived Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.DerivedQuantityKind
	 * @generated
	 */
	public Adapter createDerivedQuantityKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.LogarithmicScale <em>Logarithmic Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.LogarithmicScale
	 * @generated
	 */
	public Adapter createLogarithmicScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.ParameterizedCategoryRule <em>Parameterized Category Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.ParameterizedCategoryRule
	 * @generated
	 */
	public Adapter createParameterizedCategoryRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.DeprecatableThing <em>Deprecatable Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.DeprecatableThing
	 * @generated
	 */
	public Adapter createDeprecatableThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.NamedThing <em>Named Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.NamedThing
	 * @generated
	 */
	public Adapter createNamedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.ShortNamedThing <em>Short Named Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.ShortNamedThing
	 * @generated
	 */
	public Adapter createShortNamedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.DefinedThing <em>Defined Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.DefinedThing
	 * @generated
	 */
	public Adapter createDefinedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.TopContainer <em>Top Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.TopContainer
	 * @generated
	 */
	public Adapter createTopContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.TimeStampedThing <em>Time Stamped Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.TimeStampedThing
	 * @generated
	 */
	public Adapter createTimeStampedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.LogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.LogEntry
	 * @generated
	 */
	public Adapter createLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SiteDirectoryDataAdapterFactory
