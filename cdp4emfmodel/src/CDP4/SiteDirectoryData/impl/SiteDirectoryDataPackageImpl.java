/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;

import CDP4.CommonData.impl.CommonDataPackageImpl;

import CDP4.DeploymentDatabase.DeploymentDatabasePackage;

import CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl;

import CDP4.DeploymentDistributedSession.DeploymentDistributedSessionPackage;

import CDP4.DeploymentDistributedSession.impl.DeploymentDistributedSessionPackageImpl;

import CDP4.DiagramData.DiagramDataPackage;

import CDP4.DiagramData.impl.DiagramDataPackageImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;

import CDP4.EngineeringModelData.impl.EngineeringModelDataPackageImpl;

import CDP4.ReportingData.ReportingDataPackage;

import CDP4.ReportingData.impl.ReportingDataPackageImpl;

import CDP4.SiteDirectoryData.ArrayParameterType;
import CDP4.SiteDirectoryData.BinaryRelationshipRule;
import CDP4.SiteDirectoryData.BooleanParameterType;
import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.CompoundParameterType;
import CDP4.SiteDirectoryData.Constant;
import CDP4.SiteDirectoryData.ConversionBasedUnit;
import CDP4.SiteDirectoryData.CyclicRatioScale;
import CDP4.SiteDirectoryData.DateParameterType;
import CDP4.SiteDirectoryData.DateTimeParameterType;
import CDP4.SiteDirectoryData.DecompositionRule;
import CDP4.SiteDirectoryData.DerivedQuantityKind;
import CDP4.SiteDirectoryData.DerivedUnit;
import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.DomainOfExpertiseGroup;
import CDP4.SiteDirectoryData.EmailAddress;
import CDP4.SiteDirectoryData.EngineeringModelKind;
import CDP4.SiteDirectoryData.EngineeringModelSetup;
import CDP4.SiteDirectoryData.EnumerationParameterType;
import CDP4.SiteDirectoryData.EnumerationValueDefinition;
import CDP4.SiteDirectoryData.FileType;
import CDP4.SiteDirectoryData.Glossary;
import CDP4.SiteDirectoryData.IntervalScale;
import CDP4.SiteDirectoryData.IterationSetup;
import CDP4.SiteDirectoryData.LinearConversionUnit;
import CDP4.SiteDirectoryData.LogarithmBaseKind;
import CDP4.SiteDirectoryData.LogarithmicScale;
import CDP4.SiteDirectoryData.MappingToReferenceScale;
import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.MeasurementUnit;
import CDP4.SiteDirectoryData.ModelReferenceDataLibrary;
import CDP4.SiteDirectoryData.MultiRelationshipRule;
import CDP4.SiteDirectoryData.NaturalLanguage;
import CDP4.SiteDirectoryData.NumberSetKind;
import CDP4.SiteDirectoryData.OrdinalScale;
import CDP4.SiteDirectoryData.Organization;
import CDP4.SiteDirectoryData.ParameterType;
import CDP4.SiteDirectoryData.ParameterTypeComponent;
import CDP4.SiteDirectoryData.ParameterizedCategoryRule;
import CDP4.SiteDirectoryData.Participant;
import CDP4.SiteDirectoryData.ParticipantAffectedAccessThing;
import CDP4.SiteDirectoryData.ParticipantPermission;
import CDP4.SiteDirectoryData.ParticipantRole;
import CDP4.SiteDirectoryData.Person;
import CDP4.SiteDirectoryData.PersonPermission;
import CDP4.SiteDirectoryData.PersonRole;
import CDP4.SiteDirectoryData.PrefixedUnit;
import CDP4.SiteDirectoryData.QuantityKind;
import CDP4.SiteDirectoryData.QuantityKindFactor;
import CDP4.SiteDirectoryData.RatioScale;
import CDP4.SiteDirectoryData.ReferenceDataLibrary;
import CDP4.SiteDirectoryData.ReferenceSource;
import CDP4.SiteDirectoryData.ReferencerRule;
import CDP4.SiteDirectoryData.Rule;
import CDP4.SiteDirectoryData.ScalarParameterType;
import CDP4.SiteDirectoryData.ScaleReferenceQuantityValue;
import CDP4.SiteDirectoryData.ScaleValueDefinition;
import CDP4.SiteDirectoryData.SimpleQuantityKind;
import CDP4.SiteDirectoryData.SimpleUnit;
import CDP4.SiteDirectoryData.SiteDirectory;
import CDP4.SiteDirectoryData.SiteDirectoryDataFactory;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.SiteLogEntry;
import CDP4.SiteDirectoryData.SiteReferenceDataLibrary;
import CDP4.SiteDirectoryData.SpecializedQuantityKind;
import CDP4.SiteDirectoryData.StudyPhaseKind;
import CDP4.SiteDirectoryData.TelephoneNumber;
import CDP4.SiteDirectoryData.Term;
import CDP4.SiteDirectoryData.TextParameterType;
import CDP4.SiteDirectoryData.TimeOfDayParameterType;
import CDP4.SiteDirectoryData.UnitFactor;
import CDP4.SiteDirectoryData.UnitPrefix;
import CDP4.SiteDirectoryData.UserPreference;
import CDP4.SiteDirectoryData.VcardEmailAddressKind;
import CDP4.SiteDirectoryData.VcardTelephoneNumberKind;

import CDP4.SiteDirectoryData.util.SiteDirectoryDataValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteDirectoryDataPackageImpl extends EPackageImpl implements SiteDirectoryDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantPermissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizableThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telephoneNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainOfExpertiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personPermissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userPreferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteReferenceDataLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceDataLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantAffectedAccessThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleValueDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingToReferenceScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitPrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringModelSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelReferenceDataLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainOfExpertiseGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryRelationshipRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicRatioScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationValueDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleReferenceQuantityValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearConversionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionBasedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityKindFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializedQuantityKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiRelationshipRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleQuantityKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOfDayParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decompositionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedQuantityKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logarithmicScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedCategoryRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vcardEmailAddressKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vcardTelephoneNumberKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberSetKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum engineeringModelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum studyPhaseKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logarithmBaseKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SiteDirectoryDataPackageImpl() {
		super(eNS_URI, SiteDirectoryDataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SiteDirectoryDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SiteDirectoryDataPackage init() {
		if (isInited) return (SiteDirectoryDataPackage)EPackage.Registry.INSTANCE.getEPackage(SiteDirectoryDataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSiteDirectoryDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SiteDirectoryDataPackageImpl theSiteDirectoryDataPackage = registeredSiteDirectoryDataPackage instanceof SiteDirectoryDataPackageImpl ? (SiteDirectoryDataPackageImpl)registeredSiteDirectoryDataPackage : new SiteDirectoryDataPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDatabasePackage.eNS_URI);
		DeploymentDatabasePackageImpl theDeploymentDatabasePackage = (DeploymentDatabasePackageImpl)(registeredPackage instanceof DeploymentDatabasePackageImpl ? registeredPackage : DeploymentDatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonDataPackage.eNS_URI);
		CommonDataPackageImpl theCommonDataPackage = (CommonDataPackageImpl)(registeredPackage instanceof CommonDataPackageImpl ? registeredPackage : CommonDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReportingDataPackage.eNS_URI);
		ReportingDataPackageImpl theReportingDataPackage = (ReportingDataPackageImpl)(registeredPackage instanceof ReportingDataPackageImpl ? registeredPackage : ReportingDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EngineeringModelDataPackage.eNS_URI);
		EngineeringModelDataPackageImpl theEngineeringModelDataPackage = (EngineeringModelDataPackageImpl)(registeredPackage instanceof EngineeringModelDataPackageImpl ? registeredPackage : EngineeringModelDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiagramDataPackage.eNS_URI);
		DiagramDataPackageImpl theDiagramDataPackage = (DiagramDataPackageImpl)(registeredPackage instanceof DiagramDataPackageImpl ? registeredPackage : DiagramDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDistributedSessionPackage.eNS_URI);
		DeploymentDistributedSessionPackageImpl theDeploymentDistributedSessionPackage = (DeploymentDistributedSessionPackageImpl)(registeredPackage instanceof DeploymentDistributedSessionPackageImpl ? registeredPackage : DeploymentDistributedSessionPackage.eINSTANCE);

		// Create package meta-data objects
		theSiteDirectoryDataPackage.createPackageContents();
		theDeploymentDatabasePackage.createPackageContents();
		theCommonDataPackage.createPackageContents();
		theReportingDataPackage.createPackageContents();
		theEngineeringModelDataPackage.createPackageContents();
		theDiagramDataPackage.createPackageContents();
		theDeploymentDistributedSessionPackage.createPackageContents();

		// Initialize created meta-data
		theSiteDirectoryDataPackage.initializePackageContents();
		theDeploymentDatabasePackage.initializePackageContents();
		theCommonDataPackage.initializePackageContents();
		theReportingDataPackage.initializePackageContents();
		theEngineeringModelDataPackage.initializePackageContents();
		theDiagramDataPackage.initializePackageContents();
		theDeploymentDistributedSessionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSiteDirectoryDataPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SiteDirectoryDataValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSiteDirectoryDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SiteDirectoryDataPackage.eNS_URI, theSiteDirectoryDataPackage);
		return theSiteDirectoryDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantPermission() {
		return participantPermissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantPermission_AccessRight() {
		return (EAttribute)participantPermissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantPermission_ObjectClass() {
		return (EAttribute)participantPermissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceSource() {
		return referenceSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceSource_VersionIdentifier() {
		return (EAttribute)referenceSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceSource_VersionDate() {
		return (EAttribute)referenceSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceSource_Author() {
		return (EAttribute)referenceSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceSource_PublicationYear() {
		return (EAttribute)referenceSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceSource_Publisher() {
		return (EReference)referenceSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceSource_PublishedIn() {
		return (EReference)referenceSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceSource_Language() {
		return (EAttribute)referenceSourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorizableThing() {
		return categorizableThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategorizableThing_Category() {
		return (EReference)categorizableThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_SuperCategory() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_PermissibleClass() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_IsAbstract() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategory__SuperSubGraphIsAcyclic__DiagnosticChain_Map() {
		return categoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCategory__GetAllSupershelperoperation__DiagnosticChain_Map() {
		return categoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Organization() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_GivenName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Surname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_OrganizationalUnit() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_EmailAddress() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_TelephoneNumber() {
		return (EReference)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_DefaultDomain() {
		return (EReference)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_IsActive() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Role() {
		return (EReference)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Password() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Salt() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_DefaultEmailAddress() {
		return (EReference)personEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_DefaultTelephoneNumber() {
		return (EReference)personEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_UserPreference() {
		return (EReference)personEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmailAddress() {
		return emailAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddress_VcardType() {
		return (EAttribute)emailAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailAddress_Value() {
		return (EAttribute)emailAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelephoneNumber() {
		return telephoneNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumber_VcardType() {
		return (EAttribute)telephoneNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneNumber_Value() {
		return (EAttribute)telephoneNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainOfExpertise() {
		return domainOfExpertiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonRole() {
		return personRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonRole_PersonPermission() {
		return (EReference)personRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonPermission() {
		return personPermissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonPermission_AccessRight() {
		return (EAttribute)personPermissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonPermission_ObjectClass() {
		return (EAttribute)personPermissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserPreference() {
		return userPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserPreference_Value() {
		return (EAttribute)userPreferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiteDirectory() {
		return siteDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_Organization() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_Person() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_ParticipantRole() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_DefaultParticipantRole() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_SiteReferenceDataLibrary() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_Model() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_PersonRole() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_DefaultPersonRole() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_LogEntry() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_DomainGroup() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_Domain() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_NaturalLanguage() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectory_Annotation() {
		return (EReference)siteDirectoryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantRole() {
		return participantRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantRole_ParticipantPermission() {
		return (EReference)participantRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiteReferenceDataLibrary() {
		return siteReferenceDataLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceDataLibrary() {
		return referenceDataLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_DefinedCategory() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_ParameterType() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_BaseQuantityKind() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_Scale() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_UnitPrefix() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_Unit() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_BaseUnit() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_FileType() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_Glossary() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_ReferenceSource() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_Rule() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_RequiredRdl() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDataLibrary_Constant() {
		return (EReference)referenceDataLibraryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReferenceDataLibrary__HasUniqueParameterTypeNames__DiagnosticChain_Map() {
		return referenceDataLibraryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReferenceDataLibrary__HasUniqueParameterTypeShortNames__DiagnosticChain_Map() {
		return referenceDataLibraryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReferenceDataLibrary__HasUniqueCategoryNames__DiagnosticChain_Map() {
		return referenceDataLibraryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReferenceDataLibrary__HasUniqueCategoryShortNames__DiagnosticChain_Map() {
		return referenceDataLibraryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantAffectedAccessThing() {
		return participantAffectedAccessThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_NumberOfValues() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Symbol() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityKind() {
		return quantityKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityKind_PossibleScale() {
		return (EReference)quantityKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityKind_DefaultScale() {
		return (EReference)quantityKindEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityKind_AllPossibleScale() {
		return (EReference)quantityKindEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityKind_QuantityDimensionSymbol() {
		return (EAttribute)quantityKindEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityKind_QuantityDimensionExponent() {
		return (EAttribute)quantityKindEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityKind_QuantityDimensionExpression() {
		return (EAttribute)quantityKindEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalarParameterType() {
		return scalarParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementScale() {
		return measurementScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementScale_Unit() {
		return (EReference)measurementScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementScale_ValueDefinition() {
		return (EReference)measurementScaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementScale_NumberSet() {
		return (EAttribute)measurementScaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementScale_MinimumPermissibleValue() {
		return (EAttribute)measurementScaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementScale_IsMinimumInclusive() {
		return (EAttribute)measurementScaleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementScale_MaximumPermissibleValue() {
		return (EAttribute)measurementScaleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementScale_IsMaximumInclusive() {
		return (EAttribute)measurementScaleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementScale_PositiveValueConnotation() {
		return (EAttribute)measurementScaleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementScale_NegativeValueConnotation() {
		return (EAttribute)measurementScaleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementScale_MappingToReferenceScale() {
		return (EReference)measurementScaleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementUnit() {
		return measurementUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleValueDefinition() {
		return scaleValueDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleValueDefinition_Value() {
		return (EAttribute)scaleValueDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingToReferenceScale() {
		return mappingToReferenceScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingToReferenceScale_ReferenceScaleValue() {
		return (EReference)mappingToReferenceScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingToReferenceScale_DependentScaleValue() {
		return (EReference)mappingToReferenceScaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitPrefix() {
		return unitPrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitPrefix_ConversionFactor() {
		return (EAttribute)unitPrefixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileType() {
		return fileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Extension() {
		return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlossary() {
		return glossaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlossary_Term() {
		return (EReference)glossaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_ParameterType() {
		return (EReference)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Scale() {
		return (EReference)constantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringModelSetup() {
		return engineeringModelSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelSetup_Participant() {
		return (EReference)engineeringModelSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelSetup_ActiveDomain() {
		return (EReference)engineeringModelSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringModelSetup_Kind() {
		return (EAttribute)engineeringModelSetupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringModelSetup_StudyPhase() {
		return (EAttribute)engineeringModelSetupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelSetup_RequiredRdl() {
		return (EReference)engineeringModelSetupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringModelSetup_EngineeringModelIid() {
		return (EAttribute)engineeringModelSetupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelSetup_IterationSetup() {
		return (EReference)engineeringModelSetupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEngineeringModelSetup_SourceEngineeringModelSetupIid() {
		return (EAttribute)engineeringModelSetupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_IsActive() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Person() {
		return (EReference)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Role() {
		return (EReference)participantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Domain() {
		return (EReference)participantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_SelectedDomain() {
		return (EReference)participantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelReferenceDataLibrary() {
		return modelReferenceDataLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationSetup() {
		return iterationSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterationSetup_IterationIid() {
		return (EAttribute)iterationSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterationSetup_IterationNumber() {
		return (EAttribute)iterationSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterationSetup_Description() {
		return (EAttribute)iterationSetupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterationSetup_SourceIterationSetup() {
		return (EReference)iterationSetupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterationSetup_FrozenOn() {
		return (EAttribute)iterationSetupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterationSetup_IsDeleted() {
		return (EAttribute)iterationSetupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiteLogEntry() {
		return siteLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainOfExpertiseGroup() {
		return domainOfExpertiseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainOfExpertiseGroup_Domain() {
		return (EReference)domainOfExpertiseGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalLanguage() {
		return naturalLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaturalLanguage_LanguageCode() {
		return (EAttribute)naturalLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaturalLanguage_NativeName() {
		return (EAttribute)naturalLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryRelationshipRule() {
		return binaryRelationshipRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryRelationshipRule_RelationshipCategory() {
		return (EReference)binaryRelationshipRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryRelationshipRule_SourceCategory() {
		return (EReference)binaryRelationshipRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryRelationshipRule_TargetCategory() {
		return (EReference)binaryRelationshipRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryRelationshipRule_ForwardRelationshipName() {
		return (EAttribute)binaryRelationshipRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryRelationshipRule_InverseRelationshipName() {
		return (EAttribute)binaryRelationshipRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayParameterType() {
		return arrayParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayParameterType_Dimension() {
		return (EAttribute)arrayParameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayParameterType_IsTensor() {
		return (EAttribute)arrayParameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayParameterType_HasSingleComponentType() {
		return (EAttribute)arrayParameterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayParameterType_Rank() {
		return (EAttribute)arrayParameterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArrayParameterType__HasValidNumberOfComponents__DiagnosticChain_Map() {
		return arrayParameterTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundParameterType() {
		return compoundParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundParameterType_Component() {
		return (EReference)compoundParameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundParameterType_IsFinalized() {
		return (EAttribute)compoundParameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterTypeComponent() {
		return parameterTypeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeComponent_ParameterType() {
		return (EReference)parameterTypeComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTypeComponent_Scale() {
		return (EReference)parameterTypeComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterTypeComponent__HasValidScale__DiagnosticChain_Map() {
		return parameterTypeComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclicRatioScale() {
		return cyclicRatioScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCyclicRatioScale_Modulus() {
		return (EAttribute)cyclicRatioScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatioScale() {
		return ratioScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationParameterType() {
		return enumerationParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationParameterType_AllowMultiSelect() {
		return (EAttribute)enumerationParameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationParameterType_ValueDefinition() {
		return (EReference)enumerationParameterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationValueDefinition() {
		return enumerationValueDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalScale() {
		return ordinalScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrdinalScale_UseShortNameValues() {
		return (EAttribute)ordinalScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencerRule() {
		return referencerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencerRule_ReferencingCategory() {
		return (EReference)referencerRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencerRule_ReferencedCategory() {
		return (EReference)referencerRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencerRule_MinReferenced() {
		return (EAttribute)referencerRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencerRule_MaxReferenced() {
		return (EAttribute)referencerRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanParameterType() {
		return booleanParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleReferenceQuantityValue() {
		return scaleReferenceQuantityValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScaleReferenceQuantityValue_Scale() {
		return (EReference)scaleReferenceQuantityValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleReferenceQuantityValue_Value() {
		return (EAttribute)scaleReferenceQuantityValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateParameterType() {
		return dateParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearConversionUnit() {
		return linearConversionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionBasedUnit() {
		return conversionBasedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionBasedUnit_ReferenceUnit() {
		return (EReference)conversionBasedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionBasedUnit_ConversionFactor() {
		return (EAttribute)conversionBasedUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedUnit() {
		return derivedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedUnit_UnitFactor() {
		return (EReference)derivedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitFactor() {
		return unitFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitFactor_Unit() {
		return (EReference)unitFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFactor_Exponent() {
		return (EAttribute)unitFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityKindFactor() {
		return quantityKindFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityKindFactor_QuantityKind() {
		return (EReference)quantityKindFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityKindFactor_Exponent() {
		return (EAttribute)quantityKindFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextParameterType() {
		return textParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalScale() {
		return intervalScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializedQuantityKind() {
		return specializedQuantityKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializedQuantityKind_General() {
		return (EReference)specializedQuantityKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleUnit() {
		return simpleUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiRelationshipRule() {
		return multiRelationshipRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiRelationshipRule_RelationshipCategory() {
		return (EReference)multiRelationshipRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiRelationshipRule_RelatedCategory() {
		return (EReference)multiRelationshipRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiRelationshipRule_MinRelated() {
		return (EAttribute)multiRelationshipRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiRelationshipRule_MaxRelated() {
		return (EAttribute)multiRelationshipRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleQuantityKind() {
		return simpleQuantityKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefixedUnit() {
		return prefixedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefixedUnit_Prefix() {
		return (EReference)prefixedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeParameterType() {
		return dateTimeParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOfDayParameterType() {
		return timeOfDayParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecompositionRule() {
		return decompositionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecompositionRule_ContainingCategory() {
		return (EReference)decompositionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecompositionRule_ContainedCategory() {
		return (EReference)decompositionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecompositionRule_MinContained() {
		return (EAttribute)decompositionRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecompositionRule_MaxContained() {
		return (EAttribute)decompositionRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedQuantityKind() {
		return derivedQuantityKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedQuantityKind_QuantityKindFactor() {
		return (EReference)derivedQuantityKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogarithmicScale() {
		return logarithmicScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogarithmicScale_LogarithmBase() {
		return (EAttribute)logarithmicScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogarithmicScale_Factor() {
		return (EAttribute)logarithmicScaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogarithmicScale_Exponent() {
		return (EAttribute)logarithmicScaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogarithmicScale_ReferenceQuantityKind() {
		return (EReference)logarithmicScaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogarithmicScale_ReferenceQuantityValue() {
		return (EReference)logarithmicScaleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedCategoryRule() {
		return parameterizedCategoryRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedCategoryRule_Category() {
		return (EReference)parameterizedCategoryRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedCategoryRule_ParameterType() {
		return (EReference)parameterizedCategoryRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVcardEmailAddressKind() {
		return vcardEmailAddressKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVcardTelephoneNumberKind() {
		return vcardTelephoneNumberKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberSetKind() {
		return numberSetKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEngineeringModelKind() {
		return engineeringModelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStudyPhaseKind() {
		return studyPhaseKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogarithmBaseKind() {
		return logarithmBaseKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataFactory getSiteDirectoryDataFactory() {
		return (SiteDirectoryDataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		participantPermissionEClass = createEClass(PARTICIPANT_PERMISSION);
		createEAttribute(participantPermissionEClass, PARTICIPANT_PERMISSION__ACCESS_RIGHT);
		createEAttribute(participantPermissionEClass, PARTICIPANT_PERMISSION__OBJECT_CLASS);

		referenceSourceEClass = createEClass(REFERENCE_SOURCE);
		createEAttribute(referenceSourceEClass, REFERENCE_SOURCE__VERSION_IDENTIFIER);
		createEAttribute(referenceSourceEClass, REFERENCE_SOURCE__VERSION_DATE);
		createEAttribute(referenceSourceEClass, REFERENCE_SOURCE__AUTHOR);
		createEAttribute(referenceSourceEClass, REFERENCE_SOURCE__PUBLICATION_YEAR);
		createEReference(referenceSourceEClass, REFERENCE_SOURCE__PUBLISHER);
		createEReference(referenceSourceEClass, REFERENCE_SOURCE__PUBLISHED_IN);
		createEAttribute(referenceSourceEClass, REFERENCE_SOURCE__LANGUAGE);

		categorizableThingEClass = createEClass(CATEGORIZABLE_THING);
		createEReference(categorizableThingEClass, CATEGORIZABLE_THING__CATEGORY);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__SUPER_CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__PERMISSIBLE_CLASS);
		createEAttribute(categoryEClass, CATEGORY__IS_ABSTRACT);
		createEOperation(categoryEClass, CATEGORY___SUPER_SUB_GRAPH_IS_ACYCLIC__DIAGNOSTICCHAIN_MAP);
		createEOperation(categoryEClass, CATEGORY___GET_ALL_SUPERSHELPEROPERATION__DIAGNOSTICCHAIN_MAP);

		organizationEClass = createEClass(ORGANIZATION);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__ORGANIZATION);
		createEAttribute(personEClass, PERSON__GIVEN_NAME);
		createEAttribute(personEClass, PERSON__SURNAME);
		createEAttribute(personEClass, PERSON__ORGANIZATIONAL_UNIT);
		createEReference(personEClass, PERSON__EMAIL_ADDRESS);
		createEReference(personEClass, PERSON__TELEPHONE_NUMBER);
		createEReference(personEClass, PERSON__DEFAULT_DOMAIN);
		createEAttribute(personEClass, PERSON__IS_ACTIVE);
		createEReference(personEClass, PERSON__ROLE);
		createEAttribute(personEClass, PERSON__PASSWORD);
		createEAttribute(personEClass, PERSON__SALT);
		createEReference(personEClass, PERSON__DEFAULT_EMAIL_ADDRESS);
		createEReference(personEClass, PERSON__DEFAULT_TELEPHONE_NUMBER);
		createEReference(personEClass, PERSON__USER_PREFERENCE);

		emailAddressEClass = createEClass(EMAIL_ADDRESS);
		createEAttribute(emailAddressEClass, EMAIL_ADDRESS__VCARD_TYPE);
		createEAttribute(emailAddressEClass, EMAIL_ADDRESS__VALUE);

		telephoneNumberEClass = createEClass(TELEPHONE_NUMBER);
		createEAttribute(telephoneNumberEClass, TELEPHONE_NUMBER__VCARD_TYPE);
		createEAttribute(telephoneNumberEClass, TELEPHONE_NUMBER__VALUE);

		domainOfExpertiseEClass = createEClass(DOMAIN_OF_EXPERTISE);

		personRoleEClass = createEClass(PERSON_ROLE);
		createEReference(personRoleEClass, PERSON_ROLE__PERSON_PERMISSION);

		personPermissionEClass = createEClass(PERSON_PERMISSION);
		createEAttribute(personPermissionEClass, PERSON_PERMISSION__ACCESS_RIGHT);
		createEAttribute(personPermissionEClass, PERSON_PERMISSION__OBJECT_CLASS);

		userPreferenceEClass = createEClass(USER_PREFERENCE);
		createEAttribute(userPreferenceEClass, USER_PREFERENCE__VALUE);

		siteDirectoryEClass = createEClass(SITE_DIRECTORY);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__ORGANIZATION);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__PERSON);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__PARTICIPANT_ROLE);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__MODEL);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__PERSON_ROLE);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__DEFAULT_PERSON_ROLE);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__LOG_ENTRY);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__DOMAIN_GROUP);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__DOMAIN);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__NATURAL_LANGUAGE);
		createEReference(siteDirectoryEClass, SITE_DIRECTORY__ANNOTATION);

		participantRoleEClass = createEClass(PARTICIPANT_ROLE);
		createEReference(participantRoleEClass, PARTICIPANT_ROLE__PARTICIPANT_PERMISSION);

		siteReferenceDataLibraryEClass = createEClass(SITE_REFERENCE_DATA_LIBRARY);

		referenceDataLibraryEClass = createEClass(REFERENCE_DATA_LIBRARY);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__PARAMETER_TYPE);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__SCALE);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__UNIT_PREFIX);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__UNIT);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__BASE_UNIT);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__FILE_TYPE);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__GLOSSARY);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__RULE);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__REQUIRED_RDL);
		createEReference(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY__CONSTANT);
		createEOperation(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(referenceDataLibraryEClass, REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_SHORT_NAMES__DIAGNOSTICCHAIN_MAP);

		participantAffectedAccessThingEClass = createEClass(PARTICIPANT_AFFECTED_ACCESS_THING);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NUMBER_OF_VALUES);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__SYMBOL);

		quantityKindEClass = createEClass(QUANTITY_KIND);
		createEReference(quantityKindEClass, QUANTITY_KIND__POSSIBLE_SCALE);
		createEReference(quantityKindEClass, QUANTITY_KIND__DEFAULT_SCALE);
		createEReference(quantityKindEClass, QUANTITY_KIND__ALL_POSSIBLE_SCALE);
		createEAttribute(quantityKindEClass, QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL);
		createEAttribute(quantityKindEClass, QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT);
		createEAttribute(quantityKindEClass, QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION);

		scalarParameterTypeEClass = createEClass(SCALAR_PARAMETER_TYPE);

		measurementScaleEClass = createEClass(MEASUREMENT_SCALE);
		createEReference(measurementScaleEClass, MEASUREMENT_SCALE__UNIT);
		createEReference(measurementScaleEClass, MEASUREMENT_SCALE__VALUE_DEFINITION);
		createEAttribute(measurementScaleEClass, MEASUREMENT_SCALE__NUMBER_SET);
		createEAttribute(measurementScaleEClass, MEASUREMENT_SCALE__MINIMUM_PERMISSIBLE_VALUE);
		createEAttribute(measurementScaleEClass, MEASUREMENT_SCALE__IS_MINIMUM_INCLUSIVE);
		createEAttribute(measurementScaleEClass, MEASUREMENT_SCALE__MAXIMUM_PERMISSIBLE_VALUE);
		createEAttribute(measurementScaleEClass, MEASUREMENT_SCALE__IS_MAXIMUM_INCLUSIVE);
		createEAttribute(measurementScaleEClass, MEASUREMENT_SCALE__POSITIVE_VALUE_CONNOTATION);
		createEAttribute(measurementScaleEClass, MEASUREMENT_SCALE__NEGATIVE_VALUE_CONNOTATION);
		createEReference(measurementScaleEClass, MEASUREMENT_SCALE__MAPPING_TO_REFERENCE_SCALE);

		measurementUnitEClass = createEClass(MEASUREMENT_UNIT);

		scaleValueDefinitionEClass = createEClass(SCALE_VALUE_DEFINITION);
		createEAttribute(scaleValueDefinitionEClass, SCALE_VALUE_DEFINITION__VALUE);

		mappingToReferenceScaleEClass = createEClass(MAPPING_TO_REFERENCE_SCALE);
		createEReference(mappingToReferenceScaleEClass, MAPPING_TO_REFERENCE_SCALE__REFERENCE_SCALE_VALUE);
		createEReference(mappingToReferenceScaleEClass, MAPPING_TO_REFERENCE_SCALE__DEPENDENT_SCALE_VALUE);

		unitPrefixEClass = createEClass(UNIT_PREFIX);
		createEAttribute(unitPrefixEClass, UNIT_PREFIX__CONVERSION_FACTOR);

		fileTypeEClass = createEClass(FILE_TYPE);
		createEAttribute(fileTypeEClass, FILE_TYPE__EXTENSION);

		glossaryEClass = createEClass(GLOSSARY);
		createEReference(glossaryEClass, GLOSSARY__TERM);

		termEClass = createEClass(TERM);

		ruleEClass = createEClass(RULE);

		constantEClass = createEClass(CONSTANT);
		createEReference(constantEClass, CONSTANT__PARAMETER_TYPE);
		createEAttribute(constantEClass, CONSTANT__VALUE);
		createEReference(constantEClass, CONSTANT__SCALE);

		engineeringModelSetupEClass = createEClass(ENGINEERING_MODEL_SETUP);
		createEReference(engineeringModelSetupEClass, ENGINEERING_MODEL_SETUP__PARTICIPANT);
		createEReference(engineeringModelSetupEClass, ENGINEERING_MODEL_SETUP__ACTIVE_DOMAIN);
		createEAttribute(engineeringModelSetupEClass, ENGINEERING_MODEL_SETUP__KIND);
		createEAttribute(engineeringModelSetupEClass, ENGINEERING_MODEL_SETUP__STUDY_PHASE);
		createEReference(engineeringModelSetupEClass, ENGINEERING_MODEL_SETUP__REQUIRED_RDL);
		createEAttribute(engineeringModelSetupEClass, ENGINEERING_MODEL_SETUP__ENGINEERING_MODEL_IID);
		createEReference(engineeringModelSetupEClass, ENGINEERING_MODEL_SETUP__ITERATION_SETUP);
		createEAttribute(engineeringModelSetupEClass, ENGINEERING_MODEL_SETUP__SOURCE_ENGINEERING_MODEL_SETUP_IID);

		participantEClass = createEClass(PARTICIPANT);
		createEAttribute(participantEClass, PARTICIPANT__IS_ACTIVE);
		createEReference(participantEClass, PARTICIPANT__PERSON);
		createEReference(participantEClass, PARTICIPANT__ROLE);
		createEReference(participantEClass, PARTICIPANT__DOMAIN);
		createEReference(participantEClass, PARTICIPANT__SELECTED_DOMAIN);

		modelReferenceDataLibraryEClass = createEClass(MODEL_REFERENCE_DATA_LIBRARY);

		iterationSetupEClass = createEClass(ITERATION_SETUP);
		createEAttribute(iterationSetupEClass, ITERATION_SETUP__ITERATION_IID);
		createEAttribute(iterationSetupEClass, ITERATION_SETUP__ITERATION_NUMBER);
		createEAttribute(iterationSetupEClass, ITERATION_SETUP__DESCRIPTION);
		createEReference(iterationSetupEClass, ITERATION_SETUP__SOURCE_ITERATION_SETUP);
		createEAttribute(iterationSetupEClass, ITERATION_SETUP__FROZEN_ON);
		createEAttribute(iterationSetupEClass, ITERATION_SETUP__IS_DELETED);

		siteLogEntryEClass = createEClass(SITE_LOG_ENTRY);

		domainOfExpertiseGroupEClass = createEClass(DOMAIN_OF_EXPERTISE_GROUP);
		createEReference(domainOfExpertiseGroupEClass, DOMAIN_OF_EXPERTISE_GROUP__DOMAIN);

		naturalLanguageEClass = createEClass(NATURAL_LANGUAGE);
		createEAttribute(naturalLanguageEClass, NATURAL_LANGUAGE__LANGUAGE_CODE);
		createEAttribute(naturalLanguageEClass, NATURAL_LANGUAGE__NATIVE_NAME);

		binaryRelationshipRuleEClass = createEClass(BINARY_RELATIONSHIP_RULE);
		createEReference(binaryRelationshipRuleEClass, BINARY_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY);
		createEReference(binaryRelationshipRuleEClass, BINARY_RELATIONSHIP_RULE__SOURCE_CATEGORY);
		createEReference(binaryRelationshipRuleEClass, BINARY_RELATIONSHIP_RULE__TARGET_CATEGORY);
		createEAttribute(binaryRelationshipRuleEClass, BINARY_RELATIONSHIP_RULE__FORWARD_RELATIONSHIP_NAME);
		createEAttribute(binaryRelationshipRuleEClass, BINARY_RELATIONSHIP_RULE__INVERSE_RELATIONSHIP_NAME);

		arrayParameterTypeEClass = createEClass(ARRAY_PARAMETER_TYPE);
		createEAttribute(arrayParameterTypeEClass, ARRAY_PARAMETER_TYPE__DIMENSION);
		createEAttribute(arrayParameterTypeEClass, ARRAY_PARAMETER_TYPE__IS_TENSOR);
		createEAttribute(arrayParameterTypeEClass, ARRAY_PARAMETER_TYPE__HAS_SINGLE_COMPONENT_TYPE);
		createEAttribute(arrayParameterTypeEClass, ARRAY_PARAMETER_TYPE__RANK);
		createEOperation(arrayParameterTypeEClass, ARRAY_PARAMETER_TYPE___HAS_VALID_NUMBER_OF_COMPONENTS__DIAGNOSTICCHAIN_MAP);

		compoundParameterTypeEClass = createEClass(COMPOUND_PARAMETER_TYPE);
		createEReference(compoundParameterTypeEClass, COMPOUND_PARAMETER_TYPE__COMPONENT);
		createEAttribute(compoundParameterTypeEClass, COMPOUND_PARAMETER_TYPE__IS_FINALIZED);

		parameterTypeComponentEClass = createEClass(PARAMETER_TYPE_COMPONENT);
		createEReference(parameterTypeComponentEClass, PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE);
		createEReference(parameterTypeComponentEClass, PARAMETER_TYPE_COMPONENT__SCALE);
		createEOperation(parameterTypeComponentEClass, PARAMETER_TYPE_COMPONENT___HAS_VALID_SCALE__DIAGNOSTICCHAIN_MAP);

		cyclicRatioScaleEClass = createEClass(CYCLIC_RATIO_SCALE);
		createEAttribute(cyclicRatioScaleEClass, CYCLIC_RATIO_SCALE__MODULUS);

		ratioScaleEClass = createEClass(RATIO_SCALE);

		enumerationParameterTypeEClass = createEClass(ENUMERATION_PARAMETER_TYPE);
		createEAttribute(enumerationParameterTypeEClass, ENUMERATION_PARAMETER_TYPE__ALLOW_MULTI_SELECT);
		createEReference(enumerationParameterTypeEClass, ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION);

		enumerationValueDefinitionEClass = createEClass(ENUMERATION_VALUE_DEFINITION);

		ordinalScaleEClass = createEClass(ORDINAL_SCALE);
		createEAttribute(ordinalScaleEClass, ORDINAL_SCALE__USE_SHORT_NAME_VALUES);

		referencerRuleEClass = createEClass(REFERENCER_RULE);
		createEReference(referencerRuleEClass, REFERENCER_RULE__REFERENCING_CATEGORY);
		createEReference(referencerRuleEClass, REFERENCER_RULE__REFERENCED_CATEGORY);
		createEAttribute(referencerRuleEClass, REFERENCER_RULE__MIN_REFERENCED);
		createEAttribute(referencerRuleEClass, REFERENCER_RULE__MAX_REFERENCED);

		booleanParameterTypeEClass = createEClass(BOOLEAN_PARAMETER_TYPE);

		scaleReferenceQuantityValueEClass = createEClass(SCALE_REFERENCE_QUANTITY_VALUE);
		createEReference(scaleReferenceQuantityValueEClass, SCALE_REFERENCE_QUANTITY_VALUE__SCALE);
		createEAttribute(scaleReferenceQuantityValueEClass, SCALE_REFERENCE_QUANTITY_VALUE__VALUE);

		dateParameterTypeEClass = createEClass(DATE_PARAMETER_TYPE);

		linearConversionUnitEClass = createEClass(LINEAR_CONVERSION_UNIT);

		conversionBasedUnitEClass = createEClass(CONVERSION_BASED_UNIT);
		createEReference(conversionBasedUnitEClass, CONVERSION_BASED_UNIT__REFERENCE_UNIT);
		createEAttribute(conversionBasedUnitEClass, CONVERSION_BASED_UNIT__CONVERSION_FACTOR);

		derivedUnitEClass = createEClass(DERIVED_UNIT);
		createEReference(derivedUnitEClass, DERIVED_UNIT__UNIT_FACTOR);

		unitFactorEClass = createEClass(UNIT_FACTOR);
		createEReference(unitFactorEClass, UNIT_FACTOR__UNIT);
		createEAttribute(unitFactorEClass, UNIT_FACTOR__EXPONENT);

		quantityKindFactorEClass = createEClass(QUANTITY_KIND_FACTOR);
		createEReference(quantityKindFactorEClass, QUANTITY_KIND_FACTOR__QUANTITY_KIND);
		createEAttribute(quantityKindFactorEClass, QUANTITY_KIND_FACTOR__EXPONENT);

		textParameterTypeEClass = createEClass(TEXT_PARAMETER_TYPE);

		intervalScaleEClass = createEClass(INTERVAL_SCALE);

		specializedQuantityKindEClass = createEClass(SPECIALIZED_QUANTITY_KIND);
		createEReference(specializedQuantityKindEClass, SPECIALIZED_QUANTITY_KIND__GENERAL);

		simpleUnitEClass = createEClass(SIMPLE_UNIT);

		multiRelationshipRuleEClass = createEClass(MULTI_RELATIONSHIP_RULE);
		createEReference(multiRelationshipRuleEClass, MULTI_RELATIONSHIP_RULE__RELATIONSHIP_CATEGORY);
		createEReference(multiRelationshipRuleEClass, MULTI_RELATIONSHIP_RULE__RELATED_CATEGORY);
		createEAttribute(multiRelationshipRuleEClass, MULTI_RELATIONSHIP_RULE__MIN_RELATED);
		createEAttribute(multiRelationshipRuleEClass, MULTI_RELATIONSHIP_RULE__MAX_RELATED);

		simpleQuantityKindEClass = createEClass(SIMPLE_QUANTITY_KIND);

		prefixedUnitEClass = createEClass(PREFIXED_UNIT);
		createEReference(prefixedUnitEClass, PREFIXED_UNIT__PREFIX);

		dateTimeParameterTypeEClass = createEClass(DATE_TIME_PARAMETER_TYPE);

		timeOfDayParameterTypeEClass = createEClass(TIME_OF_DAY_PARAMETER_TYPE);

		decompositionRuleEClass = createEClass(DECOMPOSITION_RULE);
		createEReference(decompositionRuleEClass, DECOMPOSITION_RULE__CONTAINING_CATEGORY);
		createEReference(decompositionRuleEClass, DECOMPOSITION_RULE__CONTAINED_CATEGORY);
		createEAttribute(decompositionRuleEClass, DECOMPOSITION_RULE__MIN_CONTAINED);
		createEAttribute(decompositionRuleEClass, DECOMPOSITION_RULE__MAX_CONTAINED);

		derivedQuantityKindEClass = createEClass(DERIVED_QUANTITY_KIND);
		createEReference(derivedQuantityKindEClass, DERIVED_QUANTITY_KIND__QUANTITY_KIND_FACTOR);

		logarithmicScaleEClass = createEClass(LOGARITHMIC_SCALE);
		createEAttribute(logarithmicScaleEClass, LOGARITHMIC_SCALE__LOGARITHM_BASE);
		createEAttribute(logarithmicScaleEClass, LOGARITHMIC_SCALE__FACTOR);
		createEAttribute(logarithmicScaleEClass, LOGARITHMIC_SCALE__EXPONENT);
		createEReference(logarithmicScaleEClass, LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND);
		createEReference(logarithmicScaleEClass, LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE);

		parameterizedCategoryRuleEClass = createEClass(PARAMETERIZED_CATEGORY_RULE);
		createEReference(parameterizedCategoryRuleEClass, PARAMETERIZED_CATEGORY_RULE__CATEGORY);
		createEReference(parameterizedCategoryRuleEClass, PARAMETERIZED_CATEGORY_RULE__PARAMETER_TYPE);

		// Create enums
		vcardEmailAddressKindEEnum = createEEnum(VCARD_EMAIL_ADDRESS_KIND);
		vcardTelephoneNumberKindEEnum = createEEnum(VCARD_TELEPHONE_NUMBER_KIND);
		numberSetKindEEnum = createEEnum(NUMBER_SET_KIND);
		engineeringModelKindEEnum = createEEnum(ENGINEERING_MODEL_KIND);
		studyPhaseKindEEnum = createEEnum(STUDY_PHASE_KIND);
		logarithmBaseKindEEnum = createEEnum(LOGARITHM_BASE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonDataPackage theCommonDataPackage = (CommonDataPackage)EPackage.Registry.INSTANCE.getEPackage(CommonDataPackage.eNS_URI);
		ReportingDataPackage theReportingDataPackage = (ReportingDataPackage)EPackage.Registry.INSTANCE.getEPackage(ReportingDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		participantPermissionEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		participantPermissionEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		referenceSourceEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		referenceSourceEClass.getESuperTypes().add(this.getCategorizableThing());
		referenceSourceEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		categoryEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		categoryEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		organizationEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		organizationEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		organizationEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		organizationEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		personEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		personEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		personEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		personEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		emailAddressEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		telephoneNumberEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		domainOfExpertiseEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		domainOfExpertiseEClass.getESuperTypes().add(this.getCategorizableThing());
		domainOfExpertiseEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		personRoleEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		personRoleEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		personPermissionEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		personPermissionEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		userPreferenceEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		userPreferenceEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		siteDirectoryEClass.getESuperTypes().add(theCommonDataPackage.getTopContainer());
		siteDirectoryEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		siteDirectoryEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		siteDirectoryEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		participantRoleEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		participantRoleEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		siteReferenceDataLibraryEClass.getESuperTypes().add(this.getReferenceDataLibrary());
		siteReferenceDataLibraryEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		referenceDataLibraryEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		referenceDataLibraryEClass.getESuperTypes().add(this.getParticipantAffectedAccessThing());
		parameterTypeEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		parameterTypeEClass.getESuperTypes().add(this.getCategorizableThing());
		parameterTypeEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		quantityKindEClass.getESuperTypes().add(this.getScalarParameterType());
		scalarParameterTypeEClass.getESuperTypes().add(this.getParameterType());
		measurementScaleEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		measurementScaleEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		measurementUnitEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		measurementUnitEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		scaleValueDefinitionEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		mappingToReferenceScaleEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		unitPrefixEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		unitPrefixEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		fileTypeEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		fileTypeEClass.getESuperTypes().add(this.getCategorizableThing());
		fileTypeEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		glossaryEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		glossaryEClass.getESuperTypes().add(this.getCategorizableThing());
		glossaryEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		termEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		termEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		ruleEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		ruleEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		constantEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		constantEClass.getESuperTypes().add(this.getCategorizableThing());
		constantEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		engineeringModelSetupEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		engineeringModelSetupEClass.getESuperTypes().add(this.getParticipantAffectedAccessThing());
		participantEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		participantEClass.getESuperTypes().add(this.getParticipantAffectedAccessThing());
		modelReferenceDataLibraryEClass.getESuperTypes().add(this.getReferenceDataLibrary());
		iterationSetupEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		iterationSetupEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		iterationSetupEClass.getESuperTypes().add(this.getParticipantAffectedAccessThing());
		siteLogEntryEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		siteLogEntryEClass.getESuperTypes().add(theCommonDataPackage.getLogEntry());
		siteLogEntryEClass.getESuperTypes().add(theCommonDataPackage.getAnnotation());
		siteLogEntryEClass.getESuperTypes().add(this.getCategorizableThing());
		siteLogEntryEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		domainOfExpertiseGroupEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		domainOfExpertiseGroupEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		naturalLanguageEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		naturalLanguageEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		binaryRelationshipRuleEClass.getESuperTypes().add(this.getRule());
		arrayParameterTypeEClass.getESuperTypes().add(this.getCompoundParameterType());
		compoundParameterTypeEClass.getESuperTypes().add(this.getParameterType());
		parameterTypeComponentEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		parameterTypeComponentEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		cyclicRatioScaleEClass.getESuperTypes().add(this.getRatioScale());
		ratioScaleEClass.getESuperTypes().add(this.getMeasurementScale());
		enumerationParameterTypeEClass.getESuperTypes().add(this.getScalarParameterType());
		enumerationValueDefinitionEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		ordinalScaleEClass.getESuperTypes().add(this.getMeasurementScale());
		referencerRuleEClass.getESuperTypes().add(this.getRule());
		booleanParameterTypeEClass.getESuperTypes().add(this.getScalarParameterType());
		scaleReferenceQuantityValueEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		dateParameterTypeEClass.getESuperTypes().add(this.getScalarParameterType());
		linearConversionUnitEClass.getESuperTypes().add(this.getConversionBasedUnit());
		conversionBasedUnitEClass.getESuperTypes().add(this.getMeasurementUnit());
		derivedUnitEClass.getESuperTypes().add(this.getMeasurementUnit());
		unitFactorEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		quantityKindFactorEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		textParameterTypeEClass.getESuperTypes().add(this.getScalarParameterType());
		intervalScaleEClass.getESuperTypes().add(this.getMeasurementScale());
		specializedQuantityKindEClass.getESuperTypes().add(this.getQuantityKind());
		simpleUnitEClass.getESuperTypes().add(this.getMeasurementUnit());
		multiRelationshipRuleEClass.getESuperTypes().add(this.getRule());
		simpleQuantityKindEClass.getESuperTypes().add(this.getQuantityKind());
		prefixedUnitEClass.getESuperTypes().add(this.getConversionBasedUnit());
		dateTimeParameterTypeEClass.getESuperTypes().add(this.getScalarParameterType());
		timeOfDayParameterTypeEClass.getESuperTypes().add(this.getScalarParameterType());
		decompositionRuleEClass.getESuperTypes().add(this.getRule());
		derivedQuantityKindEClass.getESuperTypes().add(this.getQuantityKind());
		logarithmicScaleEClass.getESuperTypes().add(this.getMeasurementScale());
		parameterizedCategoryRuleEClass.getESuperTypes().add(this.getRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(participantPermissionEClass, ParticipantPermission.class, "ParticipantPermission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipantPermission_AccessRight(), theCommonDataPackage.getParticipantAccessRightKind(), "accessRight", null, 1, 1, ParticipantPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParticipantPermission_ObjectClass(), theCommonDataPackage.getClassKind(), "objectClass", null, 1, 1, ParticipantPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referenceSourceEClass, ReferenceSource.class, "ReferenceSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceSource_VersionIdentifier(), theCommonDataPackage.getString(), "versionIdentifier", null, 0, 1, ReferenceSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceSource_VersionDate(), theCommonDataPackage.getDate(), "versionDate", null, 0, 1, ReferenceSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceSource_Author(), theCommonDataPackage.getString(), "author", null, 0, 1, ReferenceSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceSource_PublicationYear(), theCommonDataPackage.getInteger(), "publicationYear", null, 0, 1, ReferenceSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceSource_Publisher(), this.getOrganization(), null, "publisher", null, 0, 1, ReferenceSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceSource_PublishedIn(), this.getReferenceSource(), null, "publishedIn", null, 0, 1, ReferenceSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceSource_Language(), theCommonDataPackage.getLanguageCode(), "language", null, 0, 1, ReferenceSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categorizableThingEClass, CategorizableThing.class, "CategorizableThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorizableThing_Category(), this.getCategory(), null, "category", null, 0, -1, CategorizableThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_SuperCategory(), this.getCategory(), null, "superCategory", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategory_PermissibleClass(), theCommonDataPackage.getClassKind(), "permissibleClass", null, 1, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategory_IsAbstract(), theCommonDataPackage.getBoolean(), "isAbstract", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getCategory__SuperSubGraphIsAcyclic__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "superSubGraphIsAcyclic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCategory__GetAllSupershelperoperation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "getAllSupershelperoperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Organization(), this.getOrganization(), null, "organization", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_GivenName(), theCommonDataPackage.getString(), "givenName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Surname(), theCommonDataPackage.getString(), "surname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_OrganizationalUnit(), theCommonDataPackage.getString(), "organizationalUnit", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_EmailAddress(), this.getEmailAddress(), null, "emailAddress", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_TelephoneNumber(), this.getTelephoneNumber(), null, "telephoneNumber", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_DefaultDomain(), this.getDomainOfExpertise(), null, "defaultDomain", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_IsActive(), theCommonDataPackage.getBoolean(), "isActive", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_Role(), this.getPersonRole(), null, "role", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Password(), theCommonDataPackage.getString(), "password", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Salt(), theCommonDataPackage.getString(), "salt", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_DefaultEmailAddress(), this.getEmailAddress(), null, "defaultEmailAddress", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_DefaultTelephoneNumber(), this.getTelephoneNumber(), null, "defaultTelephoneNumber", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPerson_UserPreference(), this.getUserPreference(), null, "userPreference", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(emailAddressEClass, EmailAddress.class, "EmailAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailAddress_VcardType(), this.getVcardEmailAddressKind(), "vcardType", null, 1, 1, EmailAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmailAddress_Value(), theCommonDataPackage.getString(), "value", null, 1, 1, EmailAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(telephoneNumberEClass, TelephoneNumber.class, "TelephoneNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelephoneNumber_VcardType(), this.getVcardTelephoneNumberKind(), "vcardType", null, 0, -1, TelephoneNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTelephoneNumber_Value(), theCommonDataPackage.getString(), "value", null, 1, 1, TelephoneNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainOfExpertiseEClass, DomainOfExpertise.class, "DomainOfExpertise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personRoleEClass, PersonRole.class, "PersonRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonRole_PersonPermission(), this.getPersonPermission(), null, "personPermission", null, 0, -1, PersonRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personPermissionEClass, PersonPermission.class, "PersonPermission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonPermission_AccessRight(), theCommonDataPackage.getPersonAccessRightKind(), "accessRight", null, 1, 1, PersonPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersonPermission_ObjectClass(), theCommonDataPackage.getClassKind(), "objectClass", null, 1, 1, PersonPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userPreferenceEClass, UserPreference.class, "UserPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserPreference_Value(), theCommonDataPackage.getString(), "value", null, 1, 1, UserPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(siteDirectoryEClass, SiteDirectory.class, "SiteDirectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiteDirectory_Organization(), this.getOrganization(), null, "organization", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_Person(), this.getPerson(), null, "person", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_ParticipantRole(), this.getParticipantRole(), null, "participantRole", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_DefaultParticipantRole(), this.getParticipantRole(), null, "defaultParticipantRole", null, 0, 1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_SiteReferenceDataLibrary(), this.getSiteReferenceDataLibrary(), null, "siteReferenceDataLibrary", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_Model(), this.getEngineeringModelSetup(), null, "model", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_PersonRole(), this.getPersonRole(), null, "personRole", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_DefaultPersonRole(), this.getPersonRole(), null, "defaultPersonRole", null, 0, 1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_LogEntry(), this.getSiteLogEntry(), null, "logEntry", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_DomainGroup(), this.getDomainOfExpertiseGroup(), null, "domainGroup", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_Domain(), this.getDomainOfExpertise(), null, "domain", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_NaturalLanguage(), this.getNaturalLanguage(), null, "naturalLanguage", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectory_Annotation(), theReportingDataPackage.getSiteDirectoryDataAnnotation(), null, "annotation", null, 0, -1, SiteDirectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(participantRoleEClass, ParticipantRole.class, "ParticipantRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipantRole_ParticipantPermission(), this.getParticipantPermission(), null, "participantPermission", null, 0, -1, ParticipantRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(siteReferenceDataLibraryEClass, SiteReferenceDataLibrary.class, "SiteReferenceDataLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceDataLibraryEClass, ReferenceDataLibrary.class, "ReferenceDataLibrary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceDataLibrary_DefinedCategory(), this.getCategory(), null, "definedCategory", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_ParameterType(), this.getParameterType(), null, "parameterType", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_BaseQuantityKind(), this.getQuantityKind(), null, "baseQuantityKind", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceDataLibrary_Scale(), this.getMeasurementScale(), null, "scale", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_UnitPrefix(), this.getUnitPrefix(), null, "unitPrefix", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_Unit(), this.getMeasurementUnit(), null, "unit", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_BaseUnit(), this.getMeasurementUnit(), null, "baseUnit", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_FileType(), this.getFileType(), null, "fileType", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_Glossary(), this.getGlossary(), null, "glossary", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_ReferenceSource(), this.getReferenceSource(), null, "referenceSource", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_Rule(), this.getRule(), null, "rule", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_RequiredRdl(), this.getSiteReferenceDataLibrary(), null, "requiredRdl", null, 0, 1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceDataLibrary_Constant(), this.getConstant(), null, "constant", null, 0, -1, ReferenceDataLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReferenceDataLibrary__HasUniqueParameterTypeNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasUniqueParameterTypeNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReferenceDataLibrary__HasUniqueParameterTypeShortNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasUniqueParameterTypeShortNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReferenceDataLibrary__HasUniqueCategoryNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasUniqueCategoryNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReferenceDataLibrary__HasUniqueCategoryShortNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasUniqueCategoryShortNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(participantAffectedAccessThingEClass, ParticipantAffectedAccessThing.class, "ParticipantAffectedAccessThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_NumberOfValues(), theCommonDataPackage.getInteger(), "numberOfValues", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameterType_Symbol(), theCommonDataPackage.getString(), "symbol", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(quantityKindEClass, QuantityKind.class, "QuantityKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantityKind_PossibleScale(), this.getMeasurementScale(), null, "possibleScale", null, 0, -1, QuantityKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuantityKind_DefaultScale(), this.getMeasurementScale(), null, "defaultScale", null, 1, 1, QuantityKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuantityKind_AllPossibleScale(), this.getMeasurementScale(), null, "allPossibleScale", null, 0, -1, QuantityKind.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantityKind_QuantityDimensionSymbol(), theCommonDataPackage.getString(), "quantityDimensionSymbol", null, 0, 1, QuantityKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantityKind_QuantityDimensionExponent(), theCommonDataPackage.getParameterValueType(), "quantityDimensionExponent", null, 0, -1, QuantityKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantityKind_QuantityDimensionExpression(), theCommonDataPackage.getString(), "quantityDimensionExpression", null, 1, 1, QuantityKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scalarParameterTypeEClass, ScalarParameterType.class, "ScalarParameterType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurementScaleEClass, MeasurementScale.class, "MeasurementScale", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementScale_Unit(), this.getMeasurementUnit(), null, "unit", null, 1, 1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurementScale_ValueDefinition(), this.getScaleValueDefinition(), null, "valueDefinition", null, 0, -1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementScale_NumberSet(), this.getNumberSetKind(), "numberSet", null, 1, 1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementScale_MinimumPermissibleValue(), theCommonDataPackage.getParameterValueType(), "minimumPermissibleValue", null, 0, 1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementScale_IsMinimumInclusive(), theCommonDataPackage.getBoolean(), "isMinimumInclusive", null, 1, 1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementScale_MaximumPermissibleValue(), theCommonDataPackage.getParameterValueType(), "maximumPermissibleValue", null, 0, 1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementScale_IsMaximumInclusive(), theCommonDataPackage.getBoolean(), "isMaximumInclusive", null, 1, 1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementScale_PositiveValueConnotation(), theCommonDataPackage.getString(), "positiveValueConnotation", null, 0, 1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMeasurementScale_NegativeValueConnotation(), theCommonDataPackage.getString(), "negativeValueConnotation", null, 0, 1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMeasurementScale_MappingToReferenceScale(), this.getMappingToReferenceScale(), null, "mappingToReferenceScale", null, 0, -1, MeasurementScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(measurementUnitEClass, MeasurementUnit.class, "MeasurementUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scaleValueDefinitionEClass, ScaleValueDefinition.class, "ScaleValueDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScaleValueDefinition_Value(), theCommonDataPackage.getParameterValueType(), "value", null, 1, 1, ScaleValueDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mappingToReferenceScaleEClass, MappingToReferenceScale.class, "MappingToReferenceScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingToReferenceScale_ReferenceScaleValue(), this.getScaleValueDefinition(), null, "referenceScaleValue", null, 1, 1, MappingToReferenceScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMappingToReferenceScale_DependentScaleValue(), this.getScaleValueDefinition(), null, "dependentScaleValue", null, 1, 1, MappingToReferenceScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitPrefixEClass, UnitPrefix.class, "UnitPrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitPrefix_ConversionFactor(), theCommonDataPackage.getParameterValueType(), "conversionFactor", null, 1, 1, UnitPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fileTypeEClass, FileType.class, "FileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileType_Extension(), theCommonDataPackage.getString(), "extension", null, 1, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(glossaryEClass, Glossary.class, "Glossary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlossary_Term(), this.getTerm(), null, "term", null, 0, -1, Glossary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstant_ParameterType(), this.getParameterType(), null, "parameterType", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConstant_Value(), theCommonDataPackage.getParameterValueType(), "value", null, 1, -1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstant_Scale(), this.getMeasurementScale(), null, "scale", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(engineeringModelSetupEClass, EngineeringModelSetup.class, "EngineeringModelSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeringModelSetup_Participant(), this.getParticipant(), null, "participant", null, 1, -1, EngineeringModelSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModelSetup_ActiveDomain(), this.getDomainOfExpertise(), null, "activeDomain", null, 1, -1, EngineeringModelSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEngineeringModelSetup_Kind(), this.getEngineeringModelKind(), "kind", null, 1, 1, EngineeringModelSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEngineeringModelSetup_StudyPhase(), this.getStudyPhaseKind(), "studyPhase", null, 1, 1, EngineeringModelSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModelSetup_RequiredRdl(), this.getModelReferenceDataLibrary(), null, "requiredRdl", null, 1, 1, EngineeringModelSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEngineeringModelSetup_EngineeringModelIid(), theCommonDataPackage.getUuid(), "engineeringModelIid", null, 1, 1, EngineeringModelSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModelSetup_IterationSetup(), this.getIterationSetup(), null, "iterationSetup", null, 1, -1, EngineeringModelSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEngineeringModelSetup_SourceEngineeringModelSetupIid(), theCommonDataPackage.getUuid(), "sourceEngineeringModelSetupIid", null, 0, 1, EngineeringModelSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipant_IsActive(), theCommonDataPackage.getBoolean(), "isActive", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticipant_Person(), this.getPerson(), null, "person", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticipant_Role(), this.getParticipantRole(), null, "role", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticipant_Domain(), this.getDomainOfExpertise(), null, "domain", null, 1, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParticipant_SelectedDomain(), this.getDomainOfExpertise(), null, "selectedDomain", null, 1, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelReferenceDataLibraryEClass, ModelReferenceDataLibrary.class, "ModelReferenceDataLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationSetupEClass, IterationSetup.class, "IterationSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIterationSetup_IterationIid(), theCommonDataPackage.getUuid(), "iterationIid", null, 1, 1, IterationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIterationSetup_IterationNumber(), theCommonDataPackage.getInteger(), "iterationNumber", null, 1, 1, IterationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIterationSetup_Description(), theCommonDataPackage.getString(), "description", null, 1, 1, IterationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIterationSetup_SourceIterationSetup(), this.getIterationSetup(), null, "sourceIterationSetup", null, 0, 1, IterationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIterationSetup_FrozenOn(), theCommonDataPackage.getDateTime(), "frozenOn", null, 0, 1, IterationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIterationSetup_IsDeleted(), theCommonDataPackage.getBoolean(), "isDeleted", null, 1, 1, IterationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(siteLogEntryEClass, SiteLogEntry.class, "SiteLogEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainOfExpertiseGroupEClass, DomainOfExpertiseGroup.class, "DomainOfExpertiseGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainOfExpertiseGroup_Domain(), this.getDomainOfExpertise(), null, "domain", null, 0, -1, DomainOfExpertiseGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(naturalLanguageEClass, NaturalLanguage.class, "NaturalLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNaturalLanguage_LanguageCode(), theCommonDataPackage.getLanguageCode(), "languageCode", null, 1, 1, NaturalLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNaturalLanguage_NativeName(), theCommonDataPackage.getString(), "nativeName", null, 1, 1, NaturalLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(binaryRelationshipRuleEClass, BinaryRelationshipRule.class, "BinaryRelationshipRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryRelationshipRule_RelationshipCategory(), this.getCategory(), null, "relationshipCategory", null, 1, 1, BinaryRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryRelationshipRule_SourceCategory(), this.getCategory(), null, "sourceCategory", null, 1, 1, BinaryRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryRelationshipRule_TargetCategory(), this.getCategory(), null, "targetCategory", null, 1, 1, BinaryRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBinaryRelationshipRule_ForwardRelationshipName(), theCommonDataPackage.getString(), "forwardRelationshipName", null, 1, 1, BinaryRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBinaryRelationshipRule_InverseRelationshipName(), theCommonDataPackage.getString(), "inverseRelationshipName", null, 1, 1, BinaryRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayParameterTypeEClass, ArrayParameterType.class, "ArrayParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayParameterType_Dimension(), theCommonDataPackage.getInteger(), "dimension", null, 1, -1, ArrayParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrayParameterType_IsTensor(), theCommonDataPackage.getBoolean(), "isTensor", null, 1, 1, ArrayParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrayParameterType_HasSingleComponentType(), theCommonDataPackage.getBoolean(), "hasSingleComponentType", null, 1, 1, ArrayParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArrayParameterType_Rank(), theCommonDataPackage.getInteger(), "rank", null, 1, 1, ArrayParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getArrayParameterType__HasValidNumberOfComponents__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidNumberOfComponents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compoundParameterTypeEClass, CompoundParameterType.class, "CompoundParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompoundParameterType_Component(), this.getParameterTypeComponent(), null, "component", null, 1, -1, CompoundParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundParameterType_IsFinalized(), theCommonDataPackage.getBoolean(), "isFinalized", null, 1, 1, CompoundParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterTypeComponentEClass, ParameterTypeComponent.class, "ParameterTypeComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterTypeComponent_ParameterType(), this.getParameterType(), null, "parameterType", null, 1, 1, ParameterTypeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterTypeComponent_Scale(), this.getMeasurementScale(), null, "scale", null, 0, 1, ParameterTypeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParameterTypeComponent__HasValidScale__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidScale", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cyclicRatioScaleEClass, CyclicRatioScale.class, "CyclicRatioScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCyclicRatioScale_Modulus(), theCommonDataPackage.getParameterValueType(), "modulus", null, 1, 1, CyclicRatioScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ratioScaleEClass, RatioScale.class, "RatioScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationParameterTypeEClass, EnumerationParameterType.class, "EnumerationParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationParameterType_AllowMultiSelect(), theCommonDataPackage.getBoolean(), "allowMultiSelect", null, 1, 1, EnumerationParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnumerationParameterType_ValueDefinition(), this.getEnumerationValueDefinition(), null, "valueDefinition", null, 1, -1, EnumerationParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationValueDefinitionEClass, EnumerationValueDefinition.class, "EnumerationValueDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ordinalScaleEClass, OrdinalScale.class, "OrdinalScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrdinalScale_UseShortNameValues(), theCommonDataPackage.getBoolean(), "useShortNameValues", null, 1, 1, OrdinalScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referencerRuleEClass, ReferencerRule.class, "ReferencerRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencerRule_ReferencingCategory(), this.getCategory(), null, "referencingCategory", null, 1, 1, ReferencerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferencerRule_ReferencedCategory(), this.getCategory(), null, "referencedCategory", null, 1, -1, ReferencerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferencerRule_MinReferenced(), theCommonDataPackage.getInteger(), "minReferenced", null, 1, 1, ReferencerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferencerRule_MaxReferenced(), theCommonDataPackage.getInteger(), "maxReferenced", null, 1, 1, ReferencerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanParameterTypeEClass, BooleanParameterType.class, "BooleanParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scaleReferenceQuantityValueEClass, ScaleReferenceQuantityValue.class, "ScaleReferenceQuantityValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScaleReferenceQuantityValue_Scale(), this.getMeasurementScale(), null, "scale", null, 1, 1, ScaleReferenceQuantityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getScaleReferenceQuantityValue_Value(), theCommonDataPackage.getParameterValueType(), "value", null, 1, 1, ScaleReferenceQuantityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dateParameterTypeEClass, DateParameterType.class, "DateParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linearConversionUnitEClass, LinearConversionUnit.class, "LinearConversionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conversionBasedUnitEClass, ConversionBasedUnit.class, "ConversionBasedUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConversionBasedUnit_ReferenceUnit(), this.getMeasurementUnit(), null, "referenceUnit", null, 1, 1, ConversionBasedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConversionBasedUnit_ConversionFactor(), theCommonDataPackage.getParameterValueType(), "conversionFactor", null, 1, 1, ConversionBasedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(derivedUnitEClass, DerivedUnit.class, "DerivedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedUnit_UnitFactor(), this.getUnitFactor(), null, "unitFactor", null, 1, -1, DerivedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFactorEClass, UnitFactor.class, "UnitFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitFactor_Unit(), this.getMeasurementUnit(), null, "unit", null, 1, 1, UnitFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFactor_Exponent(), theCommonDataPackage.getParameterValueType(), "exponent", null, 1, 1, UnitFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(quantityKindFactorEClass, QuantityKindFactor.class, "QuantityKindFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantityKindFactor_QuantityKind(), this.getQuantityKind(), null, "quantityKind", null, 1, 1, QuantityKindFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQuantityKindFactor_Exponent(), theCommonDataPackage.getParameterValueType(), "exponent", null, 1, 1, QuantityKindFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textParameterTypeEClass, TextParameterType.class, "TextParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalScaleEClass, IntervalScale.class, "IntervalScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specializedQuantityKindEClass, SpecializedQuantityKind.class, "SpecializedQuantityKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecializedQuantityKind_General(), this.getQuantityKind(), null, "general", null, 1, 1, SpecializedQuantityKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleUnitEClass, SimpleUnit.class, "SimpleUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiRelationshipRuleEClass, MultiRelationshipRule.class, "MultiRelationshipRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiRelationshipRule_RelationshipCategory(), this.getCategory(), null, "relationshipCategory", null, 1, 1, MultiRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiRelationshipRule_RelatedCategory(), this.getCategory(), null, "relatedCategory", null, 1, -1, MultiRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiRelationshipRule_MinRelated(), theCommonDataPackage.getInteger(), "minRelated", null, 1, 1, MultiRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiRelationshipRule_MaxRelated(), theCommonDataPackage.getInteger(), "maxRelated", null, 1, 1, MultiRelationshipRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleQuantityKindEClass, SimpleQuantityKind.class, "SimpleQuantityKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prefixedUnitEClass, PrefixedUnit.class, "PrefixedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrefixedUnit_Prefix(), this.getUnitPrefix(), null, "prefix", null, 1, 1, PrefixedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dateTimeParameterTypeEClass, DateTimeParameterType.class, "DateTimeParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeOfDayParameterTypeEClass, TimeOfDayParameterType.class, "TimeOfDayParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decompositionRuleEClass, DecompositionRule.class, "DecompositionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecompositionRule_ContainingCategory(), this.getCategory(), null, "containingCategory", null, 1, 1, DecompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDecompositionRule_ContainedCategory(), this.getCategory(), null, "containedCategory", null, 1, -1, DecompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDecompositionRule_MinContained(), theCommonDataPackage.getInteger(), "minContained", null, 1, 1, DecompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDecompositionRule_MaxContained(), theCommonDataPackage.getInteger(), "maxContained", null, 0, 1, DecompositionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(derivedQuantityKindEClass, DerivedQuantityKind.class, "DerivedQuantityKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedQuantityKind_QuantityKindFactor(), this.getQuantityKindFactor(), null, "quantityKindFactor", null, 1, -1, DerivedQuantityKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logarithmicScaleEClass, LogarithmicScale.class, "LogarithmicScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogarithmicScale_LogarithmBase(), this.getLogarithmBaseKind(), "logarithmBase", null, 1, 1, LogarithmicScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLogarithmicScale_Factor(), theCommonDataPackage.getParameterValueType(), "factor", null, 1, 1, LogarithmicScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLogarithmicScale_Exponent(), theCommonDataPackage.getParameterValueType(), "exponent", null, 1, 1, LogarithmicScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogarithmicScale_ReferenceQuantityKind(), this.getQuantityKind(), null, "referenceQuantityKind", null, 1, 1, LogarithmicScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogarithmicScale_ReferenceQuantityValue(), this.getScaleReferenceQuantityValue(), null, "referenceQuantityValue", null, 0, 1, LogarithmicScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterizedCategoryRuleEClass, ParameterizedCategoryRule.class, "ParameterizedCategoryRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedCategoryRule_Category(), this.getCategory(), null, "category", null, 1, 1, ParameterizedCategoryRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterizedCategoryRule_ParameterType(), this.getParameterType(), null, "parameterType", null, 1, -1, ParameterizedCategoryRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(vcardEmailAddressKindEEnum, VcardEmailAddressKind.class, "VcardEmailAddressKind");
		addEEnumLiteral(vcardEmailAddressKindEEnum, VcardEmailAddressKind.WORK);
		addEEnumLiteral(vcardEmailAddressKindEEnum, VcardEmailAddressKind.HOME);

		initEEnum(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.class, "VcardTelephoneNumberKind");
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.WORK);
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.HOME);
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.VOICE);
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.TEXT);
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.FAX);
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.CELL);
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.PAGER);
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.TEXTPHONE);
		addEEnumLiteral(vcardTelephoneNumberKindEEnum, VcardTelephoneNumberKind.VIDEO);

		initEEnum(numberSetKindEEnum, NumberSetKind.class, "NumberSetKind");
		addEEnumLiteral(numberSetKindEEnum, NumberSetKind.NATURAL_NUMBER_SET);
		addEEnumLiteral(numberSetKindEEnum, NumberSetKind.INTEGER_NUMBER_SET);
		addEEnumLiteral(numberSetKindEEnum, NumberSetKind.RATIONAL_NUMBER_SET);
		addEEnumLiteral(numberSetKindEEnum, NumberSetKind.REAL_NUMBER_SET);

		initEEnum(engineeringModelKindEEnum, EngineeringModelKind.class, "EngineeringModelKind");
		addEEnumLiteral(engineeringModelKindEEnum, EngineeringModelKind.STUDY_MODEL);
		addEEnumLiteral(engineeringModelKindEEnum, EngineeringModelKind.TEMPLATE_MODEL);
		addEEnumLiteral(engineeringModelKindEEnum, EngineeringModelKind.MODEL_CATALOGUE);
		addEEnumLiteral(engineeringModelKindEEnum, EngineeringModelKind.SCRATCH_MODEL);

		initEEnum(studyPhaseKindEEnum, StudyPhaseKind.class, "StudyPhaseKind");
		addEEnumLiteral(studyPhaseKindEEnum, StudyPhaseKind.PREPARATION_PHASE);
		addEEnumLiteral(studyPhaseKindEEnum, StudyPhaseKind.DESIGN_SESSION_PHASE);
		addEEnumLiteral(studyPhaseKindEEnum, StudyPhaseKind.REPORTING_PHASE);
		addEEnumLiteral(studyPhaseKindEEnum, StudyPhaseKind.COMPLETED_STUDY);

		initEEnum(logarithmBaseKindEEnum, LogarithmBaseKind.class, "LogarithmBaseKind");
		addEEnumLiteral(logarithmBaseKindEEnum, LogarithmBaseKind.NATURAL);
		addEEnumLiteral(logarithmBaseKindEEnum, LogarithmBaseKind.BASE2);
		addEEnumLiteral(logarithmBaseKindEEnum, LogarithmBaseKind.BASE10);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (getCategory__GetAllSupershelperoperation__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "originalName", "getAllSupers helper operation"
		   });
	}

} //SiteDirectoryDataPackageImpl
