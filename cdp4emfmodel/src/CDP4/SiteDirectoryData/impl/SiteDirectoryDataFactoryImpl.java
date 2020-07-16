/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteDirectoryDataFactoryImpl extends EFactoryImpl implements SiteDirectoryDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SiteDirectoryDataFactory init() {
		try {
			SiteDirectoryDataFactory theSiteDirectoryDataFactory = (SiteDirectoryDataFactory)EPackage.Registry.INSTANCE.getEFactory(SiteDirectoryDataPackage.eNS_URI);
			if (theSiteDirectoryDataFactory != null) {
				return theSiteDirectoryDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SiteDirectoryDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SiteDirectoryDataPackage.PARTICIPANT_PERMISSION: return createParticipantPermission();
			case SiteDirectoryDataPackage.REFERENCE_SOURCE: return createReferenceSource();
			case SiteDirectoryDataPackage.CATEGORY: return createCategory();
			case SiteDirectoryDataPackage.ORGANIZATION: return createOrganization();
			case SiteDirectoryDataPackage.PERSON: return createPerson();
			case SiteDirectoryDataPackage.EMAIL_ADDRESS: return createEmailAddress();
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER: return createTelephoneNumber();
			case SiteDirectoryDataPackage.DOMAIN_OF_EXPERTISE: return createDomainOfExpertise();
			case SiteDirectoryDataPackage.PERSON_ROLE: return createPersonRole();
			case SiteDirectoryDataPackage.PERSON_PERMISSION: return createPersonPermission();
			case SiteDirectoryDataPackage.USER_PREFERENCE: return createUserPreference();
			case SiteDirectoryDataPackage.SITE_DIRECTORY: return createSiteDirectory();
			case SiteDirectoryDataPackage.PARTICIPANT_ROLE: return createParticipantRole();
			case SiteDirectoryDataPackage.SITE_REFERENCE_DATA_LIBRARY: return createSiteReferenceDataLibrary();
			case SiteDirectoryDataPackage.SCALE_VALUE_DEFINITION: return createScaleValueDefinition();
			case SiteDirectoryDataPackage.MAPPING_TO_REFERENCE_SCALE: return createMappingToReferenceScale();
			case SiteDirectoryDataPackage.UNIT_PREFIX: return createUnitPrefix();
			case SiteDirectoryDataPackage.FILE_TYPE: return createFileType();
			case SiteDirectoryDataPackage.GLOSSARY: return createGlossary();
			case SiteDirectoryDataPackage.TERM: return createTerm();
			case SiteDirectoryDataPackage.CONSTANT: return createConstant();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP: return createEngineeringModelSetup();
			case SiteDirectoryDataPackage.PARTICIPANT: return createParticipant();
			case SiteDirectoryDataPackage.MODEL_REFERENCE_DATA_LIBRARY: return createModelReferenceDataLibrary();
			case SiteDirectoryDataPackage.ITERATION_SETUP: return createIterationSetup();
			case SiteDirectoryDataPackage.SITE_LOG_ENTRY: return createSiteLogEntry();
			case SiteDirectoryDataPackage.DOMAIN_OF_EXPERTISE_GROUP: return createDomainOfExpertiseGroup();
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE: return createNaturalLanguage();
			case SiteDirectoryDataPackage.BINARY_RELATIONSHIP_RULE: return createBinaryRelationshipRule();
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE: return createArrayParameterType();
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE: return createCompoundParameterType();
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT: return createParameterTypeComponent();
			case SiteDirectoryDataPackage.CYCLIC_RATIO_SCALE: return createCyclicRatioScale();
			case SiteDirectoryDataPackage.RATIO_SCALE: return createRatioScale();
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE: return createEnumerationParameterType();
			case SiteDirectoryDataPackage.ENUMERATION_VALUE_DEFINITION: return createEnumerationValueDefinition();
			case SiteDirectoryDataPackage.ORDINAL_SCALE: return createOrdinalScale();
			case SiteDirectoryDataPackage.REFERENCER_RULE: return createReferencerRule();
			case SiteDirectoryDataPackage.BOOLEAN_PARAMETER_TYPE: return createBooleanParameterType();
			case SiteDirectoryDataPackage.SCALE_REFERENCE_QUANTITY_VALUE: return createScaleReferenceQuantityValue();
			case SiteDirectoryDataPackage.DATE_PARAMETER_TYPE: return createDateParameterType();
			case SiteDirectoryDataPackage.LINEAR_CONVERSION_UNIT: return createLinearConversionUnit();
			case SiteDirectoryDataPackage.DERIVED_UNIT: return createDerivedUnit();
			case SiteDirectoryDataPackage.UNIT_FACTOR: return createUnitFactor();
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR: return createQuantityKindFactor();
			case SiteDirectoryDataPackage.TEXT_PARAMETER_TYPE: return createTextParameterType();
			case SiteDirectoryDataPackage.INTERVAL_SCALE: return createIntervalScale();
			case SiteDirectoryDataPackage.SPECIALIZED_QUANTITY_KIND: return createSpecializedQuantityKind();
			case SiteDirectoryDataPackage.SIMPLE_UNIT: return createSimpleUnit();
			case SiteDirectoryDataPackage.MULTI_RELATIONSHIP_RULE: return createMultiRelationshipRule();
			case SiteDirectoryDataPackage.SIMPLE_QUANTITY_KIND: return createSimpleQuantityKind();
			case SiteDirectoryDataPackage.PREFIXED_UNIT: return createPrefixedUnit();
			case SiteDirectoryDataPackage.DATE_TIME_PARAMETER_TYPE: return createDateTimeParameterType();
			case SiteDirectoryDataPackage.TIME_OF_DAY_PARAMETER_TYPE: return createTimeOfDayParameterType();
			case SiteDirectoryDataPackage.DECOMPOSITION_RULE: return createDecompositionRule();
			case SiteDirectoryDataPackage.DERIVED_QUANTITY_KIND: return createDerivedQuantityKind();
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE: return createLogarithmicScale();
			case SiteDirectoryDataPackage.PARAMETERIZED_CATEGORY_RULE: return createParameterizedCategoryRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SiteDirectoryDataPackage.VCARD_EMAIL_ADDRESS_KIND:
				return createVcardEmailAddressKindFromString(eDataType, initialValue);
			case SiteDirectoryDataPackage.VCARD_TELEPHONE_NUMBER_KIND:
				return createVcardTelephoneNumberKindFromString(eDataType, initialValue);
			case SiteDirectoryDataPackage.NUMBER_SET_KIND:
				return createNumberSetKindFromString(eDataType, initialValue);
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_KIND:
				return createEngineeringModelKindFromString(eDataType, initialValue);
			case SiteDirectoryDataPackage.STUDY_PHASE_KIND:
				return createStudyPhaseKindFromString(eDataType, initialValue);
			case SiteDirectoryDataPackage.LOGARITHM_BASE_KIND:
				return createLogarithmBaseKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SiteDirectoryDataPackage.VCARD_EMAIL_ADDRESS_KIND:
				return convertVcardEmailAddressKindToString(eDataType, instanceValue);
			case SiteDirectoryDataPackage.VCARD_TELEPHONE_NUMBER_KIND:
				return convertVcardTelephoneNumberKindToString(eDataType, instanceValue);
			case SiteDirectoryDataPackage.NUMBER_SET_KIND:
				return convertNumberSetKindToString(eDataType, instanceValue);
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_KIND:
				return convertEngineeringModelKindToString(eDataType, instanceValue);
			case SiteDirectoryDataPackage.STUDY_PHASE_KIND:
				return convertStudyPhaseKindToString(eDataType, instanceValue);
			case SiteDirectoryDataPackage.LOGARITHM_BASE_KIND:
				return convertLogarithmBaseKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantPermission createParticipantPermission() {
		ParticipantPermissionImpl participantPermission = new ParticipantPermissionImpl();
		return participantPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSource createReferenceSource() {
		ReferenceSourceImpl referenceSource = new ReferenceSourceImpl();
		return referenceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddress createEmailAddress() {
		EmailAddressImpl emailAddress = new EmailAddressImpl();
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber createTelephoneNumber() {
		TelephoneNumberImpl telephoneNumber = new TelephoneNumberImpl();
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise createDomainOfExpertise() {
		DomainOfExpertiseImpl domainOfExpertise = new DomainOfExpertiseImpl();
		return domainOfExpertise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRole createPersonRole() {
		PersonRoleImpl personRole = new PersonRoleImpl();
		return personRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonPermission createPersonPermission() {
		PersonPermissionImpl personPermission = new PersonPermissionImpl();
		return personPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPreference createUserPreference() {
		UserPreferenceImpl userPreference = new UserPreferenceImpl();
		return userPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectory createSiteDirectory() {
		SiteDirectoryImpl siteDirectory = new SiteDirectoryImpl();
		return siteDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole createParticipantRole() {
		ParticipantRoleImpl participantRole = new ParticipantRoleImpl();
		return participantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteReferenceDataLibrary createSiteReferenceDataLibrary() {
		SiteReferenceDataLibraryImpl siteReferenceDataLibrary = new SiteReferenceDataLibraryImpl();
		return siteReferenceDataLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleValueDefinition createScaleValueDefinition() {
		ScaleValueDefinitionImpl scaleValueDefinition = new ScaleValueDefinitionImpl();
		return scaleValueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingToReferenceScale createMappingToReferenceScale() {
		MappingToReferenceScaleImpl mappingToReferenceScale = new MappingToReferenceScaleImpl();
		return mappingToReferenceScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPrefix createUnitPrefix() {
		UnitPrefixImpl unitPrefix = new UnitPrefixImpl();
		return unitPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glossary createGlossary() {
		GlossaryImpl glossary = new GlossaryImpl();
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelSetup createEngineeringModelSetup() {
		EngineeringModelSetupImpl engineeringModelSetup = new EngineeringModelSetupImpl();
		return engineeringModelSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReferenceDataLibrary createModelReferenceDataLibrary() {
		ModelReferenceDataLibraryImpl modelReferenceDataLibrary = new ModelReferenceDataLibraryImpl();
		return modelReferenceDataLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationSetup createIterationSetup() {
		IterationSetupImpl iterationSetup = new IterationSetupImpl();
		return iterationSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteLogEntry createSiteLogEntry() {
		SiteLogEntryImpl siteLogEntry = new SiteLogEntryImpl();
		return siteLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertiseGroup createDomainOfExpertiseGroup() {
		DomainOfExpertiseGroupImpl domainOfExpertiseGroup = new DomainOfExpertiseGroupImpl();
		return domainOfExpertiseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalLanguage createNaturalLanguage() {
		NaturalLanguageImpl naturalLanguage = new NaturalLanguageImpl();
		return naturalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelationshipRule createBinaryRelationshipRule() {
		BinaryRelationshipRuleImpl binaryRelationshipRule = new BinaryRelationshipRuleImpl();
		return binaryRelationshipRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayParameterType createArrayParameterType() {
		ArrayParameterTypeImpl arrayParameterType = new ArrayParameterTypeImpl();
		return arrayParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundParameterType createCompoundParameterType() {
		CompoundParameterTypeImpl compoundParameterType = new CompoundParameterTypeImpl();
		return compoundParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTypeComponent createParameterTypeComponent() {
		ParameterTypeComponentImpl parameterTypeComponent = new ParameterTypeComponentImpl();
		return parameterTypeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicRatioScale createCyclicRatioScale() {
		CyclicRatioScaleImpl cyclicRatioScale = new CyclicRatioScaleImpl();
		return cyclicRatioScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioScale createRatioScale() {
		RatioScaleImpl ratioScale = new RatioScaleImpl();
		return ratioScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationParameterType createEnumerationParameterType() {
		EnumerationParameterTypeImpl enumerationParameterType = new EnumerationParameterTypeImpl();
		return enumerationParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValueDefinition createEnumerationValueDefinition() {
		EnumerationValueDefinitionImpl enumerationValueDefinition = new EnumerationValueDefinitionImpl();
		return enumerationValueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScale createOrdinalScale() {
		OrdinalScaleImpl ordinalScale = new OrdinalScaleImpl();
		return ordinalScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencerRule createReferencerRule() {
		ReferencerRuleImpl referencerRule = new ReferencerRuleImpl();
		return referencerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanParameterType createBooleanParameterType() {
		BooleanParameterTypeImpl booleanParameterType = new BooleanParameterTypeImpl();
		return booleanParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleReferenceQuantityValue createScaleReferenceQuantityValue() {
		ScaleReferenceQuantityValueImpl scaleReferenceQuantityValue = new ScaleReferenceQuantityValueImpl();
		return scaleReferenceQuantityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateParameterType createDateParameterType() {
		DateParameterTypeImpl dateParameterType = new DateParameterTypeImpl();
		return dateParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearConversionUnit createLinearConversionUnit() {
		LinearConversionUnitImpl linearConversionUnit = new LinearConversionUnitImpl();
		return linearConversionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedUnit createDerivedUnit() {
		DerivedUnitImpl derivedUnit = new DerivedUnitImpl();
		return derivedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitFactor createUnitFactor() {
		UnitFactorImpl unitFactor = new UnitFactorImpl();
		return unitFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKindFactor createQuantityKindFactor() {
		QuantityKindFactorImpl quantityKindFactor = new QuantityKindFactorImpl();
		return quantityKindFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextParameterType createTextParameterType() {
		TextParameterTypeImpl textParameterType = new TextParameterTypeImpl();
		return textParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalScale createIntervalScale() {
		IntervalScaleImpl intervalScale = new IntervalScaleImpl();
		return intervalScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializedQuantityKind createSpecializedQuantityKind() {
		SpecializedQuantityKindImpl specializedQuantityKind = new SpecializedQuantityKindImpl();
		return specializedQuantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleUnit createSimpleUnit() {
		SimpleUnitImpl simpleUnit = new SimpleUnitImpl();
		return simpleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiRelationshipRule createMultiRelationshipRule() {
		MultiRelationshipRuleImpl multiRelationshipRule = new MultiRelationshipRuleImpl();
		return multiRelationshipRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantityKind createSimpleQuantityKind() {
		SimpleQuantityKindImpl simpleQuantityKind = new SimpleQuantityKindImpl();
		return simpleQuantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixedUnit createPrefixedUnit() {
		PrefixedUnitImpl prefixedUnit = new PrefixedUnitImpl();
		return prefixedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeParameterType createDateTimeParameterType() {
		DateTimeParameterTypeImpl dateTimeParameterType = new DateTimeParameterTypeImpl();
		return dateTimeParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOfDayParameterType createTimeOfDayParameterType() {
		TimeOfDayParameterTypeImpl timeOfDayParameterType = new TimeOfDayParameterTypeImpl();
		return timeOfDayParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionRule createDecompositionRule() {
		DecompositionRuleImpl decompositionRule = new DecompositionRuleImpl();
		return decompositionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedQuantityKind createDerivedQuantityKind() {
		DerivedQuantityKindImpl derivedQuantityKind = new DerivedQuantityKindImpl();
		return derivedQuantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogarithmicScale createLogarithmicScale() {
		LogarithmicScaleImpl logarithmicScale = new LogarithmicScaleImpl();
		return logarithmicScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedCategoryRule createParameterizedCategoryRule() {
		ParameterizedCategoryRuleImpl parameterizedCategoryRule = new ParameterizedCategoryRuleImpl();
		return parameterizedCategoryRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcardEmailAddressKind createVcardEmailAddressKindFromString(EDataType eDataType, String initialValue) {
		VcardEmailAddressKind result = VcardEmailAddressKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVcardEmailAddressKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcardTelephoneNumberKind createVcardTelephoneNumberKindFromString(EDataType eDataType, String initialValue) {
		VcardTelephoneNumberKind result = VcardTelephoneNumberKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVcardTelephoneNumberKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberSetKind createNumberSetKindFromString(EDataType eDataType, String initialValue) {
		NumberSetKind result = NumberSetKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberSetKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelKind createEngineeringModelKindFromString(EDataType eDataType, String initialValue) {
		EngineeringModelKind result = EngineeringModelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEngineeringModelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPhaseKind createStudyPhaseKindFromString(EDataType eDataType, String initialValue) {
		StudyPhaseKind result = StudyPhaseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStudyPhaseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogarithmBaseKind createLogarithmBaseKindFromString(EDataType eDataType, String initialValue) {
		LogarithmBaseKind result = LogarithmBaseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogarithmBaseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataPackage getSiteDirectoryDataPackage() {
		return (SiteDirectoryDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SiteDirectoryDataPackage getPackage() {
		return SiteDirectoryDataPackage.eINSTANCE;
	}

} //SiteDirectoryDataFactoryImpl
