/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.Alias;
import CDP4.CommonData.Annotation;
import CDP4.CommonData.Citation;
import CDP4.CommonData.CommonDataFactory;
import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.Definition;
import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.FileContentType;
import CDP4.CommonData.HyperLink;
import CDP4.CommonData.LogEntry;
import CDP4.CommonData.LogLevelKind;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ParticipantAccessRightKind;
import CDP4.CommonData.PersonAccessRightKind;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;
import CDP4.CommonData.TopContainer;
import CDP4.CommonData.VolatileThing;

import CDP4.CommonData.util.CommonDataValidator;

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

import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl;

import java.time.OffsetDateTime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CommonDataPackageImpl extends EPackageImpl implements CommonDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortNamedThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deprecatableThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStampedThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volatileThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personAccessRightKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logLevelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantAccessRightKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classKindEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeOfDayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parameterFormulaTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parameterValueTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sha1HashTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longIntegerEDataType = null;

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
	 * @see CDP4.CommonData.CommonDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonDataPackageImpl() {
		super(eNS_URI, CommonDataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonDataPackage init() {
		if (isInited) return (CommonDataPackage)EPackage.Registry.INSTANCE.getEPackage(CommonDataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommonDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommonDataPackageImpl theCommonDataPackage = registeredCommonDataPackage instanceof CommonDataPackageImpl ? (CommonDataPackageImpl)registeredCommonDataPackage : new CommonDataPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDatabasePackage.eNS_URI);
		DeploymentDatabasePackageImpl theDeploymentDatabasePackage = (DeploymentDatabasePackageImpl)(registeredPackage instanceof DeploymentDatabasePackageImpl ? registeredPackage : DeploymentDatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SiteDirectoryDataPackage.eNS_URI);
		SiteDirectoryDataPackageImpl theSiteDirectoryDataPackage = (SiteDirectoryDataPackageImpl)(registeredPackage instanceof SiteDirectoryDataPackageImpl ? registeredPackage : SiteDirectoryDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReportingDataPackage.eNS_URI);
		ReportingDataPackageImpl theReportingDataPackage = (ReportingDataPackageImpl)(registeredPackage instanceof ReportingDataPackageImpl ? registeredPackage : ReportingDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EngineeringModelDataPackage.eNS_URI);
		EngineeringModelDataPackageImpl theEngineeringModelDataPackage = (EngineeringModelDataPackageImpl)(registeredPackage instanceof EngineeringModelDataPackageImpl ? registeredPackage : EngineeringModelDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiagramDataPackage.eNS_URI);
		DiagramDataPackageImpl theDiagramDataPackage = (DiagramDataPackageImpl)(registeredPackage instanceof DiagramDataPackageImpl ? registeredPackage : DiagramDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDistributedSessionPackage.eNS_URI);
		DeploymentDistributedSessionPackageImpl theDeploymentDistributedSessionPackage = (DeploymentDistributedSessionPackageImpl)(registeredPackage instanceof DeploymentDistributedSessionPackageImpl ? registeredPackage : DeploymentDistributedSessionPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonDataPackage.createPackageContents();
		theDeploymentDatabasePackage.createPackageContents();
		theSiteDirectoryDataPackage.createPackageContents();
		theReportingDataPackage.createPackageContents();
		theEngineeringModelDataPackage.createPackageContents();
		theDiagramDataPackage.createPackageContents();
		theDeploymentDistributedSessionPackage.createPackageContents();

		// Initialize created meta-data
		theCommonDataPackage.initializePackageContents();
		theDeploymentDatabasePackage.initializePackageContents();
		theSiteDirectoryDataPackage.initializePackageContents();
		theReportingDataPackage.initializePackageContents();
		theEngineeringModelDataPackage.initializePackageContents();
		theDiagramDataPackage.initializePackageContents();
		theDeploymentDistributedSessionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCommonDataPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CommonDataValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCommonDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonDataPackage.eNS_URI, theCommonDataPackage);
		return theCommonDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileContentType() {
		return fileContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinedThing() {
		return definedThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedThing_Alias() {
		return (EReference)definedThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedThing_Definition() {
		return (EReference)definedThingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedThing_HyperLink() {
		return (EReference)definedThingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinedThing__HasOneDefinitionPerLanguage__DiagnosticChain_Map() {
		return definedThingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDefinedThing__HasOneDefinitionPerLanguage1__DiagnosticChain_Map() {
		return definedThingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedThing() {
		return namedThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedThing_Name() {
		return (EAttribute)namedThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortNamedThing() {
		return shortNamedThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortNamedThing_ShortName() {
		return (EAttribute)shortNamedThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlias() {
		return aliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlias_IsSynonym() {
		return (EAttribute)aliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_LanguageCode() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Content() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_Citation() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_Note() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_Example() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitation() {
		return citationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitation_Source() {
		return (EReference)citationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitation_Location() {
		return (EAttribute)citationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitation_IsAdaptation() {
		return (EAttribute)citationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitation_Remark() {
		return (EAttribute)citationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeprecatableThing() {
		return deprecatableThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeprecatableThing_IsDeprecated() {
		return (EAttribute)deprecatableThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperLink() {
		return hyperLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHyperLink_Uri() {
		return (EAttribute)hyperLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStampedThing() {
		return timeStampedThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStampedThing_CreatedOn() {
		return (EAttribute)timeStampedThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopContainer() {
		return topContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopContainer_LastModifiedOn() {
		return (EAttribute)topContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogEntry() {
		return logEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogEntry_Author() {
		return (EReference)logEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogEntry_AffectedItemIid() {
		return (EAttribute)logEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogEntry_Level() {
		return (EAttribute)logEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolatileThing() {
		return volatileThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolatileThing_IsVolatile() {
		return (EAttribute)volatileThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Iid() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_RevisionNumber() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_ClassKind() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_ModifiedOn() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_ExcludedPerson() {
		return (EReference)thingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_ExcludedDomain() {
		return (EReference)thingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonAccessRightKind() {
		return personAccessRightKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogLevelKind() {
		return logLevelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantAccessRightKind() {
		return participantAccessRightKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUri() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLanguageCode() {
		return languageCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassKind() {
		return classKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeOfDay() {
		return timeOfDayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUuid() {
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParameterFormulaType() {
		return parameterFormulaTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParameterValueType() {
		return parameterValueTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSha1HashType() {
		return sha1HashTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongInteger() {
		return longIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonDataFactory getCommonDataFactory() {
		return (CommonDataFactory)getEFactoryInstance();
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
		fileContentTypeEClass = createEClass(FILE_CONTENT_TYPE);

		definedThingEClass = createEClass(DEFINED_THING);
		createEReference(definedThingEClass, DEFINED_THING__ALIAS);
		createEReference(definedThingEClass, DEFINED_THING__DEFINITION);
		createEReference(definedThingEClass, DEFINED_THING__HYPER_LINK);
		createEOperation(definedThingEClass, DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP);
		createEOperation(definedThingEClass, DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP);

		namedThingEClass = createEClass(NAMED_THING);
		createEAttribute(namedThingEClass, NAMED_THING__NAME);

		shortNamedThingEClass = createEClass(SHORT_NAMED_THING);
		createEAttribute(shortNamedThingEClass, SHORT_NAMED_THING__SHORT_NAME);

		aliasEClass = createEClass(ALIAS);
		createEAttribute(aliasEClass, ALIAS__IS_SYNONYM);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__LANGUAGE_CODE);
		createEAttribute(annotationEClass, ANNOTATION__CONTENT);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__CITATION);
		createEAttribute(definitionEClass, DEFINITION__NOTE);
		createEAttribute(definitionEClass, DEFINITION__EXAMPLE);

		citationEClass = createEClass(CITATION);
		createEReference(citationEClass, CITATION__SOURCE);
		createEAttribute(citationEClass, CITATION__LOCATION);
		createEAttribute(citationEClass, CITATION__IS_ADAPTATION);
		createEAttribute(citationEClass, CITATION__REMARK);

		deprecatableThingEClass = createEClass(DEPRECATABLE_THING);
		createEAttribute(deprecatableThingEClass, DEPRECATABLE_THING__IS_DEPRECATED);

		hyperLinkEClass = createEClass(HYPER_LINK);
		createEAttribute(hyperLinkEClass, HYPER_LINK__URI);

		timeStampedThingEClass = createEClass(TIME_STAMPED_THING);
		createEAttribute(timeStampedThingEClass, TIME_STAMPED_THING__CREATED_ON);

		topContainerEClass = createEClass(TOP_CONTAINER);
		createEAttribute(topContainerEClass, TOP_CONTAINER__LAST_MODIFIED_ON);

		logEntryEClass = createEClass(LOG_ENTRY);
		createEReference(logEntryEClass, LOG_ENTRY__AUTHOR);
		createEAttribute(logEntryEClass, LOG_ENTRY__AFFECTED_ITEM_IID);
		createEAttribute(logEntryEClass, LOG_ENTRY__LEVEL);

		volatileThingEClass = createEClass(VOLATILE_THING);
		createEAttribute(volatileThingEClass, VOLATILE_THING__IS_VOLATILE);

		thingEClass = createEClass(THING);
		createEAttribute(thingEClass, THING__IID);
		createEAttribute(thingEClass, THING__REVISION_NUMBER);
		createEAttribute(thingEClass, THING__CLASS_KIND);
		createEAttribute(thingEClass, THING__MODIFIED_ON);
		createEReference(thingEClass, THING__EXCLUDED_PERSON);
		createEReference(thingEClass, THING__EXCLUDED_DOMAIN);

		// Create enums
		personAccessRightKindEEnum = createEEnum(PERSON_ACCESS_RIGHT_KIND);
		logLevelKindEEnum = createEEnum(LOG_LEVEL_KIND);
		participantAccessRightKindEEnum = createEEnum(PARTICIPANT_ACCESS_RIGHT_KIND);

		// Create data types
		dateEDataType = createEDataType(DATE);
		stringEDataType = createEDataType(STRING);
		uriEDataType = createEDataType(URI);
		languageCodeEDataType = createEDataType(LANGUAGE_CODE);
		booleanEDataType = createEDataType(BOOLEAN);
		classKindEDataType = createEDataType(CLASS_KIND);
		integerEDataType = createEDataType(INTEGER);
		floatEDataType = createEDataType(FLOAT);
		timeOfDayEDataType = createEDataType(TIME_OF_DAY);
		dateTimeEDataType = createEDataType(DATE_TIME);
		uuidEDataType = createEDataType(UUID);
		parameterFormulaTypeEDataType = createEDataType(PARAMETER_FORMULA_TYPE);
		parameterValueTypeEDataType = createEDataType(PARAMETER_VALUE_TYPE);
		sha1HashTypeEDataType = createEDataType(SHA1_HASH_TYPE);
		longIntegerEDataType = createEDataType(LONG_INTEGER);
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
		SiteDirectoryDataPackage theSiteDirectoryDataPackage = (SiteDirectoryDataPackage)EPackage.Registry.INSTANCE.getEPackage(SiteDirectoryDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		definedThingEClass.getESuperTypes().add(this.getThing());
		definedThingEClass.getESuperTypes().add(this.getNamedThing());
		definedThingEClass.getESuperTypes().add(this.getShortNamedThing());
		aliasEClass.getESuperTypes().add(this.getThing());
		aliasEClass.getESuperTypes().add(this.getAnnotation());
		definitionEClass.getESuperTypes().add(this.getThing());
		definitionEClass.getESuperTypes().add(this.getAnnotation());
		citationEClass.getESuperTypes().add(this.getThing());
		citationEClass.getESuperTypes().add(this.getShortNamedThing());
		hyperLinkEClass.getESuperTypes().add(this.getThing());
		hyperLinkEClass.getESuperTypes().add(this.getAnnotation());
		topContainerEClass.getESuperTypes().add(this.getThing());

		// Initialize classes, features, and operations; add parameters
		initEClass(fileContentTypeEClass, FileContentType.class, "FileContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definedThingEClass, DefinedThing.class, "DefinedThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinedThing_Alias(), this.getAlias(), null, "alias", null, 0, -1, DefinedThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinedThing_Definition(), this.getDefinition(), null, "definition", null, 0, -1, DefinedThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinedThing_HyperLink(), this.getHyperLink(), null, "hyperLink", null, 0, -1, DefinedThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getDefinedThing__HasOneDefinitionPerLanguage__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasOneDefinitionPerLanguage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDefinedThing__HasOneDefinitionPerLanguage1__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasOneDefinitionPerLanguage1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedThingEClass, NamedThing.class, "NamedThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedThing_Name(), this.getString(), "name", null, 1, 1, NamedThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(shortNamedThingEClass, ShortNamedThing.class, "ShortNamedThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortNamedThing_ShortName(), this.getString(), "shortName", null, 1, 1, ShortNamedThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlias_IsSynonym(), this.getBoolean(), "isSynonym", null, 1, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_LanguageCode(), this.getLanguageCode(), "languageCode", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAnnotation_Content(), this.getString(), "content", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinition_Citation(), this.getCitation(), null, "citation", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDefinition_Note(), this.getString(), "note", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinition_Example(), this.getString(), "example", null, 0, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citationEClass, Citation.class, "Citation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCitation_Source(), theSiteDirectoryDataPackage.getReferenceSource(), null, "source", null, 1, 1, Citation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCitation_Location(), this.getString(), "location", null, 0, 1, Citation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCitation_IsAdaptation(), this.getBoolean(), "isAdaptation", null, 1, 1, Citation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCitation_Remark(), this.getString(), "remark", null, 0, 1, Citation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deprecatableThingEClass, DeprecatableThing.class, "DeprecatableThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeprecatableThing_IsDeprecated(), this.getBoolean(), "isDeprecated", null, 1, 1, DeprecatableThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hyperLinkEClass, HyperLink.class, "HyperLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHyperLink_Uri(), this.getUri(), "uri", null, 1, 1, HyperLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeStampedThingEClass, TimeStampedThing.class, "TimeStampedThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeStampedThing_CreatedOn(), this.getDateTime(), "createdOn", null, 1, 1, TimeStampedThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(topContainerEClass, TopContainer.class, "TopContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopContainer_LastModifiedOn(), this.getDateTime(), "lastModifiedOn", null, 1, 1, TopContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logEntryEClass, LogEntry.class, "LogEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogEntry_Author(), theSiteDirectoryDataPackage.getPerson(), null, "author", null, 0, 1, LogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLogEntry_AffectedItemIid(), this.getUuid(), "affectedItemIid", null, 0, -1, LogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLogEntry_Level(), this.getLogLevelKind(), "level", null, 1, 1, LogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(volatileThingEClass, VolatileThing.class, "VolatileThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolatileThing_IsVolatile(), this.getBoolean(), "isVolatile", null, 1, 1, VolatileThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(thingEClass, Thing.class, "Thing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThing_Iid(), this.getUuid(), "iid", null, 1, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getThing_RevisionNumber(), this.getInteger(), "revisionNumber", null, 1, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getThing_ClassKind(), this.getClassKind(), "classKind", null, 1, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getThing_ModifiedOn(), this.getDateTime(), "modifiedOn", null, 1, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThing_ExcludedPerson(), theSiteDirectoryDataPackage.getPerson(), null, "excludedPerson", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThing_ExcludedDomain(), theSiteDirectoryDataPackage.getDomainOfExpertise(), null, "excludedDomain", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(personAccessRightKindEEnum, PersonAccessRightKind.class, "PersonAccessRightKind");
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.NOT_APPLICABLE);
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.NONE);
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.SAME_AS_CONTAINER);
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.SAME_AS_SUPERCLASS);
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.READ);
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.MODIFY);
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.READ_IF_PARTICIPANT);
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.MODIFY_IF_PARTICIPANT);
		addEEnumLiteral(personAccessRightKindEEnum, PersonAccessRightKind.MODIFY_OWN_PERSON);

		initEEnum(logLevelKindEEnum, LogLevelKind.class, "LogLevelKind");
		addEEnumLiteral(logLevelKindEEnum, LogLevelKind.TRACE);
		addEEnumLiteral(logLevelKindEEnum, LogLevelKind.DEBUG);
		addEEnumLiteral(logLevelKindEEnum, LogLevelKind.INFO);
		addEEnumLiteral(logLevelKindEEnum, LogLevelKind.USER);

		initEEnum(participantAccessRightKindEEnum, ParticipantAccessRightKind.class, "ParticipantAccessRightKind");
		addEEnumLiteral(participantAccessRightKindEEnum, ParticipantAccessRightKind.NOT_APPLICABLE);
		addEEnumLiteral(participantAccessRightKindEEnum, ParticipantAccessRightKind.NONE);
		addEEnumLiteral(participantAccessRightKindEEnum, ParticipantAccessRightKind.SAME_AS_CONTAINER);
		addEEnumLiteral(participantAccessRightKindEEnum, ParticipantAccessRightKind.SAME_AS_SUPERCLASS);
		addEEnumLiteral(participantAccessRightKindEEnum, ParticipantAccessRightKind.READ);
		addEEnumLiteral(participantAccessRightKindEEnum, ParticipantAccessRightKind.MODIFY);
		addEEnumLiteral(participantAccessRightKindEEnum, ParticipantAccessRightKind.MODIFY_IF_OWNER);

		// Initialize data types
		initEDataType(dateEDataType, OffsetDateTime.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, String.class, "Uri", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(languageCodeEDataType, String.class, "LanguageCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(classKindEDataType, String.class, "ClassKind", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, Float.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeOfDayEDataType, String.class, "TimeOfDay", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimeEDataType, OffsetDateTime.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uuidEDataType, String.class, "Uuid", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(parameterFormulaTypeEDataType, String.class, "ParameterFormulaType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(parameterValueTypeEDataType, String.class, "ParameterValueType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sha1HashTypeEDataType, String.class, "Sha1HashType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longIntegerEDataType, Long.class, "LongInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonDataPackageImpl
