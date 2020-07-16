/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;

import CDP4.CommonData.impl.CommonDataPackageImpl;

import CDP4.DeploymentDatabase.DeploymentDatabasePackage;

import CDP4.DeploymentDatabase.impl.DeploymentDatabasePackageImpl;

import CDP4.DeploymentDistributedSession.DeploymentDistributedSessionPackage;

import CDP4.DeploymentDistributedSession.impl.DeploymentDistributedSessionPackageImpl;

import CDP4.DiagramData.DiagramDataPackage;

import CDP4.DiagramData.impl.DiagramDataPackageImpl;

import CDP4.EngineeringModelData.ActualFiniteState;
import CDP4.EngineeringModelData.ActualFiniteStateKind;
import CDP4.EngineeringModelData.ActualFiniteStateList;
import CDP4.EngineeringModelData.AndExpression;
import CDP4.EngineeringModelData.BinaryRelationship;
import CDP4.EngineeringModelData.BooleanExpression;
import CDP4.EngineeringModelData.BooleanOperatorKind;
import CDP4.EngineeringModelData.BuiltInRuleVerification;
import CDP4.EngineeringModelData.CommonFileStore;
import CDP4.EngineeringModelData.DomainFileStore;
import CDP4.EngineeringModelData.ElementBase;
import CDP4.EngineeringModelData.ElementDefinition;
import CDP4.EngineeringModelData.ElementUsage;
import CDP4.EngineeringModelData.EngineeringModel;
import CDP4.EngineeringModelData.EngineeringModelDataFactory;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.ExclusiveOrExpression;
import CDP4.EngineeringModelData.ExternalIdentifierMap;
import CDP4.EngineeringModelData.File;
import CDP4.EngineeringModelData.FileRevision;
import CDP4.EngineeringModelData.FileStore;
import CDP4.EngineeringModelData.Folder;
import CDP4.EngineeringModelData.Goal;
import CDP4.EngineeringModelData.IdCorrespondence;
import CDP4.EngineeringModelData.InterfaceEndKind;
import CDP4.EngineeringModelData.Iteration;
import CDP4.EngineeringModelData.ModelLogEntry;
import CDP4.EngineeringModelData.MultiRelationship;
import CDP4.EngineeringModelData.NestedElement;
import CDP4.EngineeringModelData.NestedParameter;
import CDP4.EngineeringModelData.NotExpression;
import CDP4.EngineeringModelData.Option;
import CDP4.EngineeringModelData.OptionDependentThing;
import CDP4.EngineeringModelData.OrExpression;
import CDP4.EngineeringModelData.OwnedThing;
import CDP4.EngineeringModelData.Parameter;
import CDP4.EngineeringModelData.ParameterBase;
import CDP4.EngineeringModelData.ParameterGroup;
import CDP4.EngineeringModelData.ParameterOrOverrideBase;
import CDP4.EngineeringModelData.ParameterOverride;
import CDP4.EngineeringModelData.ParameterOverrideValueSet;
import CDP4.EngineeringModelData.ParameterSubscription;
import CDP4.EngineeringModelData.ParameterSubscriptionValueSet;
import CDP4.EngineeringModelData.ParameterSwitchKind;
import CDP4.EngineeringModelData.ParameterValue;
import CDP4.EngineeringModelData.ParameterValueSet;
import CDP4.EngineeringModelData.ParameterValueSetBase;
import CDP4.EngineeringModelData.ParametricConstraint;
import CDP4.EngineeringModelData.PossibleFiniteState;
import CDP4.EngineeringModelData.PossibleFiniteStateList;
import CDP4.EngineeringModelData.Publication;
import CDP4.EngineeringModelData.RelationalExpression;
import CDP4.EngineeringModelData.RelationalOperatorKind;
import CDP4.EngineeringModelData.Relationship;
import CDP4.EngineeringModelData.RelationshipParameterValue;
import CDP4.EngineeringModelData.Requirement;
import CDP4.EngineeringModelData.RequirementsContainer;
import CDP4.EngineeringModelData.RequirementsContainerParameterValue;
import CDP4.EngineeringModelData.RequirementsGroup;
import CDP4.EngineeringModelData.RequirementsSpecification;
import CDP4.EngineeringModelData.RuleVerification;
import CDP4.EngineeringModelData.RuleVerificationList;
import CDP4.EngineeringModelData.RuleVerificationStatusKind;
import CDP4.EngineeringModelData.RuleViolation;
import CDP4.EngineeringModelData.SimpleParameterValue;
import CDP4.EngineeringModelData.SimpleParameterizableThing;
import CDP4.EngineeringModelData.StakeHolderValueMap;
import CDP4.EngineeringModelData.StakeHolderValueMapSettings;
import CDP4.EngineeringModelData.Stakeholder;
import CDP4.EngineeringModelData.StakeholderValue;
import CDP4.EngineeringModelData.UserRuleVerification;
import CDP4.EngineeringModelData.ValueGroup;

import CDP4.EngineeringModelData.util.EngineeringModelDataValidator;

import CDP4.ReportingData.ReportingDataPackage;

import CDP4.ReportingData.impl.ReportingDataPackageImpl;

import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl;

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
public class EngineeringModelDataPackageImpl extends EPackageImpl implements EngineeringModelDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibleFiniteStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterOrOverrideBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualFiniteStateListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionDependentThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterOverrideValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueSetBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualFiniteStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibleFiniteStateListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSubscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSubscriptionValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonFileStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalIdentifierMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsContainerParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleParameterizableThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametricConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainFileStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleVerificationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleVerificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleViolationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeHolderValueMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeHolderValueMapSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRuleVerificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInRuleVerificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownedThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceEndKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterSwitchKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actualFiniteStateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleVerificationStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorKindEEnum = null;

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
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EngineeringModelDataPackageImpl() {
		super(eNS_URI, EngineeringModelDataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EngineeringModelDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EngineeringModelDataPackage init() {
		if (isInited) return (EngineeringModelDataPackage)EPackage.Registry.INSTANCE.getEPackage(EngineeringModelDataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEngineeringModelDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EngineeringModelDataPackageImpl theEngineeringModelDataPackage = registeredEngineeringModelDataPackage instanceof EngineeringModelDataPackageImpl ? (EngineeringModelDataPackageImpl)registeredEngineeringModelDataPackage : new EngineeringModelDataPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDatabasePackage.eNS_URI);
		DeploymentDatabasePackageImpl theDeploymentDatabasePackage = (DeploymentDatabasePackageImpl)(registeredPackage instanceof DeploymentDatabasePackageImpl ? registeredPackage : DeploymentDatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SiteDirectoryDataPackage.eNS_URI);
		SiteDirectoryDataPackageImpl theSiteDirectoryDataPackage = (SiteDirectoryDataPackageImpl)(registeredPackage instanceof SiteDirectoryDataPackageImpl ? registeredPackage : SiteDirectoryDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonDataPackage.eNS_URI);
		CommonDataPackageImpl theCommonDataPackage = (CommonDataPackageImpl)(registeredPackage instanceof CommonDataPackageImpl ? registeredPackage : CommonDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReportingDataPackage.eNS_URI);
		ReportingDataPackageImpl theReportingDataPackage = (ReportingDataPackageImpl)(registeredPackage instanceof ReportingDataPackageImpl ? registeredPackage : ReportingDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiagramDataPackage.eNS_URI);
		DiagramDataPackageImpl theDiagramDataPackage = (DiagramDataPackageImpl)(registeredPackage instanceof DiagramDataPackageImpl ? registeredPackage : DiagramDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDistributedSessionPackage.eNS_URI);
		DeploymentDistributedSessionPackageImpl theDeploymentDistributedSessionPackage = (DeploymentDistributedSessionPackageImpl)(registeredPackage instanceof DeploymentDistributedSessionPackageImpl ? registeredPackage : DeploymentDistributedSessionPackage.eINSTANCE);

		// Create package meta-data objects
		theEngineeringModelDataPackage.createPackageContents();
		theDeploymentDatabasePackage.createPackageContents();
		theSiteDirectoryDataPackage.createPackageContents();
		theCommonDataPackage.createPackageContents();
		theReportingDataPackage.createPackageContents();
		theDiagramDataPackage.createPackageContents();
		theDeploymentDistributedSessionPackage.createPackageContents();

		// Initialize created meta-data
		theEngineeringModelDataPackage.initializePackageContents();
		theDeploymentDatabasePackage.initializePackageContents();
		theSiteDirectoryDataPackage.initializePackageContents();
		theCommonDataPackage.initializePackageContents();
		theReportingDataPackage.initializePackageContents();
		theDiagramDataPackage.initializePackageContents();
		theDeploymentDistributedSessionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEngineeringModelDataPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EngineeringModelDataValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEngineeringModelDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EngineeringModelDataPackage.eNS_URI, theEngineeringModelDataPackage);
		return theEngineeringModelDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossibleFiniteState() {
		return possibleFiniteStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_RequestedBy() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ValueSet() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_AllowDifferentOwnerOfOverride() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ExpectsOverride() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__HasValidScale__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterOrOverrideBase() {
		return parameterOrOverrideBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterOrOverrideBase_ParameterSubscription() {
		return (EReference)parameterOrOverrideBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBase() {
		return parameterBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBase_ParameterType() {
		return (EReference)parameterBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBase_Scale() {
		return (EReference)parameterBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBase_StateDependence() {
		return (EReference)parameterBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBase_Group() {
		return (EReference)parameterBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterBase_IsOptionDependent() {
		return (EAttribute)parameterBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualFiniteStateList() {
		return actualFiniteStateListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualFiniteStateList_PossibleFiniteStateList() {
		return (EReference)actualFiniteStateListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualFiniteStateList_ActualState() {
		return (EReference)actualFiniteStateListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionDependentThing() {
		return optionDependentThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionDependentThing_ExcludeOption() {
		return (EReference)optionDependentThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_NestedElement() {
		return (EReference)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedElement() {
		return nestedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedElement_RootElement() {
		return (EReference)nestedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedElement_ElementUsage() {
		return (EReference)nestedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedElement_NestedParameter() {
		return (EReference)nestedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinition() {
		return elementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ContainedElement() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Parameter() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ParameterGroup() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ReferencedElement() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementDefinition__HasUniqueParameterNames__DiagnosticChain_Map() {
		return elementDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementDefinition__HasUniqueParameterShortNames__DiagnosticChain_Map() {
		return elementDefinitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementBase() {
		return elementBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementUsage() {
		return elementUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementUsage_ElementDefinition() {
		return (EReference)elementUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementUsage_InterfaceEnd() {
		return (EAttribute)elementUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementUsage_ParameterOverride() {
		return (EReference)elementUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterOverride() {
		return parameterOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterOverride_Parameter() {
		return (EReference)parameterOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterOverride_ValueSet() {
		return (EReference)parameterOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterGroup() {
		return parameterGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterGroup_ContainingGroup() {
		return (EReference)parameterGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterOverrideValueSet() {
		return parameterOverrideValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterOverrideValueSet_ParameterValueSet() {
		return (EReference)parameterOverrideValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValueSetBase() {
		return parameterValueSetBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueSetBase_ValueSwitch() {
		return (EAttribute)parameterValueSetBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueSetBase_Published() {
		return (EAttribute)parameterValueSetBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueSetBase_Formula() {
		return (EAttribute)parameterValueSetBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueSetBase_Computed() {
		return (EAttribute)parameterValueSetBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueSetBase_Manual() {
		return (EAttribute)parameterValueSetBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueSetBase_Reference() {
		return (EAttribute)parameterValueSetBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValueSetBase_ActualValue() {
		return (EAttribute)parameterValueSetBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueSetBase_ActualState() {
		return (EReference)parameterValueSetBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValueSetBase_ActualOption() {
		return (EReference)parameterValueSetBaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualFiniteState() {
		return actualFiniteStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualFiniteState_PossibleState() {
		return (EReference)actualFiniteStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActualFiniteState_Kind() {
		return (EAttribute)actualFiniteStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValueSet() {
		return parameterValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedParameter() {
		return nestedParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedParameter_AssociatedParameter() {
		return (EReference)nestedParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedParameter_ActualState() {
		return (EReference)nestedParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedParameter_Path() {
		return (EAttribute)nestedParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedParameter_Formula() {
		return (EAttribute)nestedParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedParameter_ActualValue() {
		return (EAttribute)nestedParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossibleFiniteStateList() {
		return possibleFiniteStateListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPossibleFiniteStateList_PossibleState() {
		return (EReference)possibleFiniteStateListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPossibleFiniteStateList_DefaultState() {
		return (EReference)possibleFiniteStateListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSubscription() {
		return parameterSubscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSubscription_ValueSet() {
		return (EReference)parameterSubscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSubscriptionValueSet() {
		return parameterSubscriptionValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSubscriptionValueSet_ValueSwitch() {
		return (EAttribute)parameterSubscriptionValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSubscriptionValueSet_Computed() {
		return (EAttribute)parameterSubscriptionValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSubscriptionValueSet_Manual() {
		return (EAttribute)parameterSubscriptionValueSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSubscriptionValueSet_Reference() {
		return (EAttribute)parameterSubscriptionValueSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSubscriptionValueSet_ActualValue() {
		return (EAttribute)parameterSubscriptionValueSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSubscriptionValueSet_SubscribedValueSet() {
		return (EReference)parameterSubscriptionValueSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSubscriptionValueSet_ActualState() {
		return (EReference)parameterSubscriptionValueSetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSubscriptionValueSet_ActualOption() {
		return (EReference)parameterSubscriptionValueSetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileStore() {
		return fileStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileStore_Folder() {
		return (EReference)fileStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileStore_File() {
		return (EReference)fileStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_Creator() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_ContainingFolder() {
		return (EReference)folderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolder_Path() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_LockedBy() {
		return (EReference)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_FileRevision() {
		return (EReference)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileRevision() {
		return fileRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileRevision_ContentHash() {
		return (EAttribute)fileRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileRevision_Creator() {
		return (EReference)fileRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileRevision_ContainingFolder() {
		return (EReference)fileRevisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileRevision_FileType() {
		return (EReference)fileRevisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileRevision_Path() {
		return (EAttribute)fileRevisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublication() {
		return publicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublication_Domain() {
		return (EReference)publicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublication_PublishedParameter() {
		return (EReference)publicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringModel() {
		return engineeringModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModel_EngineeringModelSetup() {
		return (EReference)engineeringModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModel_CommonFileStore() {
		return (EReference)engineeringModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModel_LogEntry() {
		return (EReference)engineeringModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModel_Iteration() {
		return (EReference)engineeringModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModel_Book() {
		return (EReference)engineeringModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModel_GenericNote() {
		return (EReference)engineeringModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModel_ModellingAnnotation() {
		return (EReference)engineeringModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonFileStore() {
		return commonFileStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelLogEntry() {
		return modelLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteration() {
		return iterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_IterationSetup() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteration_SourceIterationIid() {
		return (EAttribute)iterationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_Option() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_Publication() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_PossibleFiniteStateList() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_TopElement() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_Element() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_Relationship() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_ExternalIdentifierMap() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_RequirementsSpecification() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_DomainFileStore() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_ActualFiniteStateList() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_DefaultOption() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_RuleVerificationList() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_Stakeholder() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_Goal() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_ValueGroup() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_StakeholderValue() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_StakeholderValueMap() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_SharedDiagramStyle() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteration_DiagramCanvas() {
		return (EReference)iterationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_ParameterValue() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipParameterValue() {
		return relationshipParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_ParameterType() {
		return (EReference)parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_Scale() {
		return (EReference)parameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValue_Value() {
		return (EAttribute)parameterValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalIdentifierMap() {
		return externalIdentifierMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalIdentifierMap_Correspondence() {
		return (EReference)externalIdentifierMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalIdentifierMap_ExternalModelName() {
		return (EAttribute)externalIdentifierMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalIdentifierMap_ExternalToolName() {
		return (EAttribute)externalIdentifierMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalIdentifierMap_ExternalToolVersion() {
		return (EAttribute)externalIdentifierMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalIdentifierMap_ExternalFormat() {
		return (EReference)externalIdentifierMapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdCorrespondence() {
		return idCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdCorrespondence_InternalThing() {
		return (EAttribute)idCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdCorrespondence_ExternalId() {
		return (EAttribute)idCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsSpecification() {
		return requirementsSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsSpecification_Requirement() {
		return (EReference)requirementsSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsContainer() {
		return requirementsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsContainer_Group() {
		return (EReference)requirementsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsContainer_ParameterValue() {
		return (EReference)requirementsContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsGroup() {
		return requirementsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsContainerParameterValue() {
		return requirementsContainerParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_ParametricConstraint() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Group() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleParameterizableThing() {
		return simpleParameterizableThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParameterizableThing_ParameterValue() {
		return (EReference)simpleParameterizableThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleParameterValue() {
		return simpleParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParameterValue_ParameterType() {
		return (EReference)simpleParameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleParameterValue_Value() {
		return (EAttribute)simpleParameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParameterValue_Scale() {
		return (EReference)simpleParameterValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametricConstraint() {
		return parametricConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametricConstraint_Expression() {
		return (EReference)parametricConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametricConstraint_TopExpression() {
		return (EReference)parametricConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainFileStore() {
		return domainFileStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainFileStore_IsHidden() {
		return (EAttribute)domainFileStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleVerificationList() {
		return ruleVerificationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVerificationList_RuleVerification() {
		return (EReference)ruleVerificationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleVerification() {
		return ruleVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVerification_IsActive() {
		return (EAttribute)ruleVerificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleVerification_Violation() {
		return (EReference)ruleVerificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVerification_ExecutedOn() {
		return (EAttribute)ruleVerificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleVerification_Status() {
		return (EAttribute)ruleVerificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleViolation() {
		return ruleViolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleViolation_Description() {
		return (EAttribute)ruleViolationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleViolation_ViolatingThing() {
		return (EAttribute)ruleViolationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeholder_StakeholderValue() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeholderValue() {
		return stakeholderValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueGroup() {
		return valueGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeHolderValueMap() {
		return stakeHolderValueMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolderValueMap_Goal() {
		return (EReference)stakeHolderValueMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolderValueMap_ValueGroup() {
		return (EReference)stakeHolderValueMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolderValueMap_StakeholderValue() {
		return (EReference)stakeHolderValueMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolderValueMap_Settings() {
		return (EReference)stakeHolderValueMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolderValueMap_Requirement() {
		return (EReference)stakeHolderValueMapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeHolderValueMapSettings() {
		return stakeHolderValueMapSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolderValueMapSettings_GoalToValueGroupRelationship() {
		return (EReference)stakeHolderValueMapSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolderValueMapSettings_ValueGroupToStakeholderValueRelationship() {
		return (EReference)stakeHolderValueMapSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeHolderValueMapSettings_StakeholderValueToRequirementRelationship() {
		return (EReference)stakeHolderValueMapSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiRelationship() {
		return multiRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiRelationship_RelatedThing() {
		return (EReference)multiRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryRelationship() {
		return binaryRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryRelationship_Source() {
		return (EReference)binaryRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryRelationship_Target() {
		return (EReference)binaryRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrExpression() {
		return orExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrExpression_Term() {
		return (EReference)orExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotExpression() {
		return notExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotExpression_Term() {
		return (EReference)notExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExpression() {
		return andExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndExpression_Term() {
		return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveOrExpression() {
		return exclusiveOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveOrExpression_Term() {
		return (EReference)exclusiveOrExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_ParameterType() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalExpression_RelationalOperator() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalExpression_Value() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalExpression_Scale() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRuleVerification() {
		return userRuleVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRuleVerification_Rule() {
		return (EReference)userRuleVerificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInRuleVerification() {
		return builtInRuleVerificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnedThing() {
		return ownedThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwnedThing_Owner() {
		return (EReference)ownedThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceEndKind() {
		return interfaceEndKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterSwitchKind() {
		return parameterSwitchKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActualFiniteStateKind() {
		return actualFiniteStateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleVerificationStatusKind() {
		return ruleVerificationStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanOperatorKind() {
		return booleanOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOperatorKind() {
		return relationalOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelDataFactory getEngineeringModelDataFactory() {
		return (EngineeringModelDataFactory)getEFactoryInstance();
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
		possibleFiniteStateEClass = createEClass(POSSIBLE_FINITE_STATE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__REQUESTED_BY);
		createEReference(parameterEClass, PARAMETER__VALUE_SET);
		createEAttribute(parameterEClass, PARAMETER__ALLOW_DIFFERENT_OWNER_OF_OVERRIDE);
		createEAttribute(parameterEClass, PARAMETER__EXPECTS_OVERRIDE);
		createEOperation(parameterEClass, PARAMETER___HAS_VALID_SCALE__DIAGNOSTICCHAIN_MAP);

		parameterOrOverrideBaseEClass = createEClass(PARAMETER_OR_OVERRIDE_BASE);
		createEReference(parameterOrOverrideBaseEClass, PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION);

		parameterBaseEClass = createEClass(PARAMETER_BASE);
		createEReference(parameterBaseEClass, PARAMETER_BASE__PARAMETER_TYPE);
		createEReference(parameterBaseEClass, PARAMETER_BASE__SCALE);
		createEReference(parameterBaseEClass, PARAMETER_BASE__STATE_DEPENDENCE);
		createEReference(parameterBaseEClass, PARAMETER_BASE__GROUP);
		createEAttribute(parameterBaseEClass, PARAMETER_BASE__IS_OPTION_DEPENDENT);

		actualFiniteStateListEClass = createEClass(ACTUAL_FINITE_STATE_LIST);
		createEReference(actualFiniteStateListEClass, ACTUAL_FINITE_STATE_LIST__POSSIBLE_FINITE_STATE_LIST);
		createEReference(actualFiniteStateListEClass, ACTUAL_FINITE_STATE_LIST__ACTUAL_STATE);

		optionDependentThingEClass = createEClass(OPTION_DEPENDENT_THING);
		createEReference(optionDependentThingEClass, OPTION_DEPENDENT_THING__EXCLUDE_OPTION);

		optionEClass = createEClass(OPTION);
		createEReference(optionEClass, OPTION__NESTED_ELEMENT);

		nestedElementEClass = createEClass(NESTED_ELEMENT);
		createEReference(nestedElementEClass, NESTED_ELEMENT__ROOT_ELEMENT);
		createEReference(nestedElementEClass, NESTED_ELEMENT__ELEMENT_USAGE);
		createEReference(nestedElementEClass, NESTED_ELEMENT__NESTED_PARAMETER);

		elementDefinitionEClass = createEClass(ELEMENT_DEFINITION);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__CONTAINED_ELEMENT);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__PARAMETER);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__PARAMETER_GROUP);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__REFERENCED_ELEMENT);
		createEOperation(elementDefinitionEClass, ELEMENT_DEFINITION___HAS_UNIQUE_PARAMETER_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementDefinitionEClass, ELEMENT_DEFINITION___HAS_UNIQUE_PARAMETER_SHORT_NAMES__DIAGNOSTICCHAIN_MAP);

		elementBaseEClass = createEClass(ELEMENT_BASE);

		elementUsageEClass = createEClass(ELEMENT_USAGE);
		createEReference(elementUsageEClass, ELEMENT_USAGE__ELEMENT_DEFINITION);
		createEAttribute(elementUsageEClass, ELEMENT_USAGE__INTERFACE_END);
		createEReference(elementUsageEClass, ELEMENT_USAGE__PARAMETER_OVERRIDE);

		parameterOverrideEClass = createEClass(PARAMETER_OVERRIDE);
		createEReference(parameterOverrideEClass, PARAMETER_OVERRIDE__PARAMETER);
		createEReference(parameterOverrideEClass, PARAMETER_OVERRIDE__VALUE_SET);

		parameterGroupEClass = createEClass(PARAMETER_GROUP);
		createEReference(parameterGroupEClass, PARAMETER_GROUP__CONTAINING_GROUP);

		parameterOverrideValueSetEClass = createEClass(PARAMETER_OVERRIDE_VALUE_SET);
		createEReference(parameterOverrideValueSetEClass, PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET);

		parameterValueSetBaseEClass = createEClass(PARAMETER_VALUE_SET_BASE);
		createEAttribute(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__VALUE_SWITCH);
		createEAttribute(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__PUBLISHED);
		createEAttribute(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__FORMULA);
		createEAttribute(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__COMPUTED);
		createEAttribute(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__MANUAL);
		createEAttribute(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__REFERENCE);
		createEAttribute(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__ACTUAL_VALUE);
		createEReference(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__ACTUAL_STATE);
		createEReference(parameterValueSetBaseEClass, PARAMETER_VALUE_SET_BASE__ACTUAL_OPTION);

		actualFiniteStateEClass = createEClass(ACTUAL_FINITE_STATE);
		createEReference(actualFiniteStateEClass, ACTUAL_FINITE_STATE__POSSIBLE_STATE);
		createEAttribute(actualFiniteStateEClass, ACTUAL_FINITE_STATE__KIND);

		parameterValueSetEClass = createEClass(PARAMETER_VALUE_SET);

		nestedParameterEClass = createEClass(NESTED_PARAMETER);
		createEReference(nestedParameterEClass, NESTED_PARAMETER__ASSOCIATED_PARAMETER);
		createEReference(nestedParameterEClass, NESTED_PARAMETER__ACTUAL_STATE);
		createEAttribute(nestedParameterEClass, NESTED_PARAMETER__PATH);
		createEAttribute(nestedParameterEClass, NESTED_PARAMETER__FORMULA);
		createEAttribute(nestedParameterEClass, NESTED_PARAMETER__ACTUAL_VALUE);

		possibleFiniteStateListEClass = createEClass(POSSIBLE_FINITE_STATE_LIST);
		createEReference(possibleFiniteStateListEClass, POSSIBLE_FINITE_STATE_LIST__POSSIBLE_STATE);
		createEReference(possibleFiniteStateListEClass, POSSIBLE_FINITE_STATE_LIST__DEFAULT_STATE);

		parameterSubscriptionEClass = createEClass(PARAMETER_SUBSCRIPTION);
		createEReference(parameterSubscriptionEClass, PARAMETER_SUBSCRIPTION__VALUE_SET);

		parameterSubscriptionValueSetEClass = createEClass(PARAMETER_SUBSCRIPTION_VALUE_SET);
		createEAttribute(parameterSubscriptionValueSetEClass, PARAMETER_SUBSCRIPTION_VALUE_SET__VALUE_SWITCH);
		createEAttribute(parameterSubscriptionValueSetEClass, PARAMETER_SUBSCRIPTION_VALUE_SET__COMPUTED);
		createEAttribute(parameterSubscriptionValueSetEClass, PARAMETER_SUBSCRIPTION_VALUE_SET__MANUAL);
		createEAttribute(parameterSubscriptionValueSetEClass, PARAMETER_SUBSCRIPTION_VALUE_SET__REFERENCE);
		createEAttribute(parameterSubscriptionValueSetEClass, PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_VALUE);
		createEReference(parameterSubscriptionValueSetEClass, PARAMETER_SUBSCRIPTION_VALUE_SET__SUBSCRIBED_VALUE_SET);
		createEReference(parameterSubscriptionValueSetEClass, PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_STATE);
		createEReference(parameterSubscriptionValueSetEClass, PARAMETER_SUBSCRIPTION_VALUE_SET__ACTUAL_OPTION);

		fileStoreEClass = createEClass(FILE_STORE);
		createEReference(fileStoreEClass, FILE_STORE__FOLDER);
		createEReference(fileStoreEClass, FILE_STORE__FILE);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__CREATOR);
		createEReference(folderEClass, FOLDER__CONTAINING_FOLDER);
		createEAttribute(folderEClass, FOLDER__PATH);

		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__LOCKED_BY);
		createEReference(fileEClass, FILE__FILE_REVISION);

		fileRevisionEClass = createEClass(FILE_REVISION);
		createEAttribute(fileRevisionEClass, FILE_REVISION__CONTENT_HASH);
		createEReference(fileRevisionEClass, FILE_REVISION__CREATOR);
		createEReference(fileRevisionEClass, FILE_REVISION__CONTAINING_FOLDER);
		createEReference(fileRevisionEClass, FILE_REVISION__FILE_TYPE);
		createEAttribute(fileRevisionEClass, FILE_REVISION__PATH);

		publicationEClass = createEClass(PUBLICATION);
		createEReference(publicationEClass, PUBLICATION__DOMAIN);
		createEReference(publicationEClass, PUBLICATION__PUBLISHED_PARAMETER);

		engineeringModelEClass = createEClass(ENGINEERING_MODEL);
		createEReference(engineeringModelEClass, ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP);
		createEReference(engineeringModelEClass, ENGINEERING_MODEL__COMMON_FILE_STORE);
		createEReference(engineeringModelEClass, ENGINEERING_MODEL__LOG_ENTRY);
		createEReference(engineeringModelEClass, ENGINEERING_MODEL__ITERATION);
		createEReference(engineeringModelEClass, ENGINEERING_MODEL__BOOK);
		createEReference(engineeringModelEClass, ENGINEERING_MODEL__GENERIC_NOTE);
		createEReference(engineeringModelEClass, ENGINEERING_MODEL__MODELLING_ANNOTATION);

		commonFileStoreEClass = createEClass(COMMON_FILE_STORE);

		modelLogEntryEClass = createEClass(MODEL_LOG_ENTRY);

		iterationEClass = createEClass(ITERATION);
		createEReference(iterationEClass, ITERATION__ITERATION_SETUP);
		createEAttribute(iterationEClass, ITERATION__SOURCE_ITERATION_IID);
		createEReference(iterationEClass, ITERATION__OPTION);
		createEReference(iterationEClass, ITERATION__PUBLICATION);
		createEReference(iterationEClass, ITERATION__POSSIBLE_FINITE_STATE_LIST);
		createEReference(iterationEClass, ITERATION__TOP_ELEMENT);
		createEReference(iterationEClass, ITERATION__ELEMENT);
		createEReference(iterationEClass, ITERATION__RELATIONSHIP);
		createEReference(iterationEClass, ITERATION__EXTERNAL_IDENTIFIER_MAP);
		createEReference(iterationEClass, ITERATION__REQUIREMENTS_SPECIFICATION);
		createEReference(iterationEClass, ITERATION__DOMAIN_FILE_STORE);
		createEReference(iterationEClass, ITERATION__ACTUAL_FINITE_STATE_LIST);
		createEReference(iterationEClass, ITERATION__DEFAULT_OPTION);
		createEReference(iterationEClass, ITERATION__RULE_VERIFICATION_LIST);
		createEReference(iterationEClass, ITERATION__STAKEHOLDER);
		createEReference(iterationEClass, ITERATION__GOAL);
		createEReference(iterationEClass, ITERATION__VALUE_GROUP);
		createEReference(iterationEClass, ITERATION__STAKEHOLDER_VALUE);
		createEReference(iterationEClass, ITERATION__STAKEHOLDER_VALUE_MAP);
		createEReference(iterationEClass, ITERATION__SHARED_DIAGRAM_STYLE);
		createEReference(iterationEClass, ITERATION__DIAGRAM_CANVAS);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__PARAMETER_VALUE);

		relationshipParameterValueEClass = createEClass(RELATIONSHIP_PARAMETER_VALUE);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__PARAMETER_TYPE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__SCALE);
		createEAttribute(parameterValueEClass, PARAMETER_VALUE__VALUE);

		externalIdentifierMapEClass = createEClass(EXTERNAL_IDENTIFIER_MAP);
		createEReference(externalIdentifierMapEClass, EXTERNAL_IDENTIFIER_MAP__CORRESPONDENCE);
		createEAttribute(externalIdentifierMapEClass, EXTERNAL_IDENTIFIER_MAP__EXTERNAL_MODEL_NAME);
		createEAttribute(externalIdentifierMapEClass, EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_NAME);
		createEAttribute(externalIdentifierMapEClass, EXTERNAL_IDENTIFIER_MAP__EXTERNAL_TOOL_VERSION);
		createEReference(externalIdentifierMapEClass, EXTERNAL_IDENTIFIER_MAP__EXTERNAL_FORMAT);

		idCorrespondenceEClass = createEClass(ID_CORRESPONDENCE);
		createEAttribute(idCorrespondenceEClass, ID_CORRESPONDENCE__INTERNAL_THING);
		createEAttribute(idCorrespondenceEClass, ID_CORRESPONDENCE__EXTERNAL_ID);

		requirementsSpecificationEClass = createEClass(REQUIREMENTS_SPECIFICATION);
		createEReference(requirementsSpecificationEClass, REQUIREMENTS_SPECIFICATION__REQUIREMENT);

		requirementsContainerEClass = createEClass(REQUIREMENTS_CONTAINER);
		createEReference(requirementsContainerEClass, REQUIREMENTS_CONTAINER__GROUP);
		createEReference(requirementsContainerEClass, REQUIREMENTS_CONTAINER__PARAMETER_VALUE);

		requirementsGroupEClass = createEClass(REQUIREMENTS_GROUP);

		requirementsContainerParameterValueEClass = createEClass(REQUIREMENTS_CONTAINER_PARAMETER_VALUE);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__PARAMETRIC_CONSTRAINT);
		createEReference(requirementEClass, REQUIREMENT__GROUP);

		simpleParameterizableThingEClass = createEClass(SIMPLE_PARAMETERIZABLE_THING);
		createEReference(simpleParameterizableThingEClass, SIMPLE_PARAMETERIZABLE_THING__PARAMETER_VALUE);

		simpleParameterValueEClass = createEClass(SIMPLE_PARAMETER_VALUE);
		createEReference(simpleParameterValueEClass, SIMPLE_PARAMETER_VALUE__PARAMETER_TYPE);
		createEAttribute(simpleParameterValueEClass, SIMPLE_PARAMETER_VALUE__VALUE);
		createEReference(simpleParameterValueEClass, SIMPLE_PARAMETER_VALUE__SCALE);

		parametricConstraintEClass = createEClass(PARAMETRIC_CONSTRAINT);
		createEReference(parametricConstraintEClass, PARAMETRIC_CONSTRAINT__EXPRESSION);
		createEReference(parametricConstraintEClass, PARAMETRIC_CONSTRAINT__TOP_EXPRESSION);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		domainFileStoreEClass = createEClass(DOMAIN_FILE_STORE);
		createEAttribute(domainFileStoreEClass, DOMAIN_FILE_STORE__IS_HIDDEN);

		ruleVerificationListEClass = createEClass(RULE_VERIFICATION_LIST);
		createEReference(ruleVerificationListEClass, RULE_VERIFICATION_LIST__RULE_VERIFICATION);

		ruleVerificationEClass = createEClass(RULE_VERIFICATION);
		createEAttribute(ruleVerificationEClass, RULE_VERIFICATION__IS_ACTIVE);
		createEReference(ruleVerificationEClass, RULE_VERIFICATION__VIOLATION);
		createEAttribute(ruleVerificationEClass, RULE_VERIFICATION__EXECUTED_ON);
		createEAttribute(ruleVerificationEClass, RULE_VERIFICATION__STATUS);

		ruleViolationEClass = createEClass(RULE_VIOLATION);
		createEAttribute(ruleViolationEClass, RULE_VIOLATION__DESCRIPTION);
		createEAttribute(ruleViolationEClass, RULE_VIOLATION__VIOLATING_THING);

		stakeholderEClass = createEClass(STAKEHOLDER);
		createEReference(stakeholderEClass, STAKEHOLDER__STAKEHOLDER_VALUE);

		stakeholderValueEClass = createEClass(STAKEHOLDER_VALUE);

		goalEClass = createEClass(GOAL);

		valueGroupEClass = createEClass(VALUE_GROUP);

		stakeHolderValueMapEClass = createEClass(STAKE_HOLDER_VALUE_MAP);
		createEReference(stakeHolderValueMapEClass, STAKE_HOLDER_VALUE_MAP__GOAL);
		createEReference(stakeHolderValueMapEClass, STAKE_HOLDER_VALUE_MAP__VALUE_GROUP);
		createEReference(stakeHolderValueMapEClass, STAKE_HOLDER_VALUE_MAP__STAKEHOLDER_VALUE);
		createEReference(stakeHolderValueMapEClass, STAKE_HOLDER_VALUE_MAP__SETTINGS);
		createEReference(stakeHolderValueMapEClass, STAKE_HOLDER_VALUE_MAP__REQUIREMENT);

		stakeHolderValueMapSettingsEClass = createEClass(STAKE_HOLDER_VALUE_MAP_SETTINGS);
		createEReference(stakeHolderValueMapSettingsEClass, STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP);
		createEReference(stakeHolderValueMapSettingsEClass, STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP);
		createEReference(stakeHolderValueMapSettingsEClass, STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP);

		multiRelationshipEClass = createEClass(MULTI_RELATIONSHIP);
		createEReference(multiRelationshipEClass, MULTI_RELATIONSHIP__RELATED_THING);

		binaryRelationshipEClass = createEClass(BINARY_RELATIONSHIP);
		createEReference(binaryRelationshipEClass, BINARY_RELATIONSHIP__SOURCE);
		createEReference(binaryRelationshipEClass, BINARY_RELATIONSHIP__TARGET);

		orExpressionEClass = createEClass(OR_EXPRESSION);
		createEReference(orExpressionEClass, OR_EXPRESSION__TERM);

		notExpressionEClass = createEClass(NOT_EXPRESSION);
		createEReference(notExpressionEClass, NOT_EXPRESSION__TERM);

		andExpressionEClass = createEClass(AND_EXPRESSION);
		createEReference(andExpressionEClass, AND_EXPRESSION__TERM);

		exclusiveOrExpressionEClass = createEClass(EXCLUSIVE_OR_EXPRESSION);
		createEReference(exclusiveOrExpressionEClass, EXCLUSIVE_OR_EXPRESSION__TERM);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__PARAMETER_TYPE);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__VALUE);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__SCALE);

		userRuleVerificationEClass = createEClass(USER_RULE_VERIFICATION);
		createEReference(userRuleVerificationEClass, USER_RULE_VERIFICATION__RULE);

		builtInRuleVerificationEClass = createEClass(BUILT_IN_RULE_VERIFICATION);

		ownedThingEClass = createEClass(OWNED_THING);
		createEReference(ownedThingEClass, OWNED_THING__OWNER);

		// Create enums
		interfaceEndKindEEnum = createEEnum(INTERFACE_END_KIND);
		parameterSwitchKindEEnum = createEEnum(PARAMETER_SWITCH_KIND);
		actualFiniteStateKindEEnum = createEEnum(ACTUAL_FINITE_STATE_KIND);
		ruleVerificationStatusKindEEnum = createEEnum(RULE_VERIFICATION_STATUS_KIND);
		booleanOperatorKindEEnum = createEEnum(BOOLEAN_OPERATOR_KIND);
		relationalOperatorKindEEnum = createEEnum(RELATIONAL_OPERATOR_KIND);
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
		SiteDirectoryDataPackage theSiteDirectoryDataPackage = (SiteDirectoryDataPackage)EPackage.Registry.INSTANCE.getEPackage(SiteDirectoryDataPackage.eNS_URI);
		ReportingDataPackage theReportingDataPackage = (ReportingDataPackage)EPackage.Registry.INSTANCE.getEPackage(ReportingDataPackage.eNS_URI);
		DiagramDataPackage theDiagramDataPackage = (DiagramDataPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		possibleFiniteStateEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		possibleFiniteStateEClass.getESuperTypes().add(this.getOwnedThing());
		parameterEClass.getESuperTypes().add(this.getParameterOrOverrideBase());
		parameterOrOverrideBaseEClass.getESuperTypes().add(this.getParameterBase());
		parameterBaseEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		parameterBaseEClass.getESuperTypes().add(this.getOwnedThing());
		actualFiniteStateListEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		actualFiniteStateListEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		actualFiniteStateListEClass.getESuperTypes().add(this.getOptionDependentThing());
		actualFiniteStateListEClass.getESuperTypes().add(this.getOwnedThing());
		actualFiniteStateListEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		optionEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		optionEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		nestedElementEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		nestedElementEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		nestedElementEClass.getESuperTypes().add(this.getOwnedThing());
		nestedElementEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		nestedElementEClass.getESuperTypes().add(theCommonDataPackage.getVolatileThing());
		elementDefinitionEClass.getESuperTypes().add(this.getElementBase());
		elementBaseEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		elementBaseEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		elementBaseEClass.getESuperTypes().add(this.getOwnedThing());
		elementUsageEClass.getESuperTypes().add(this.getElementBase());
		elementUsageEClass.getESuperTypes().add(this.getOptionDependentThing());
		parameterOverrideEClass.getESuperTypes().add(this.getParameterOrOverrideBase());
		parameterGroupEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		parameterGroupEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		parameterOverrideValueSetEClass.getESuperTypes().add(this.getParameterValueSetBase());
		parameterValueSetBaseEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		parameterValueSetBaseEClass.getESuperTypes().add(this.getOwnedThing());
		actualFiniteStateEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		actualFiniteStateEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		actualFiniteStateEClass.getESuperTypes().add(this.getOwnedThing());
		actualFiniteStateEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		parameterValueSetEClass.getESuperTypes().add(this.getParameterValueSetBase());
		nestedParameterEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		nestedParameterEClass.getESuperTypes().add(this.getOwnedThing());
		nestedParameterEClass.getESuperTypes().add(theCommonDataPackage.getVolatileThing());
		possibleFiniteStateListEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		possibleFiniteStateListEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		possibleFiniteStateListEClass.getESuperTypes().add(this.getOwnedThing());
		parameterSubscriptionEClass.getESuperTypes().add(this.getParameterBase());
		parameterSubscriptionValueSetEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		parameterSubscriptionValueSetEClass.getESuperTypes().add(this.getOwnedThing());
		fileStoreEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		fileStoreEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		fileStoreEClass.getESuperTypes().add(this.getOwnedThing());
		fileStoreEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		folderEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		folderEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		folderEClass.getESuperTypes().add(this.getOwnedThing());
		folderEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		fileEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		fileEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		fileEClass.getESuperTypes().add(this.getOwnedThing());
		fileRevisionEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		fileRevisionEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		fileRevisionEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		publicationEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		publicationEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		engineeringModelEClass.getESuperTypes().add(theCommonDataPackage.getTopContainer());
		commonFileStoreEClass.getESuperTypes().add(this.getFileStore());
		modelLogEntryEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		modelLogEntryEClass.getESuperTypes().add(theCommonDataPackage.getLogEntry());
		modelLogEntryEClass.getESuperTypes().add(theCommonDataPackage.getAnnotation());
		modelLogEntryEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		modelLogEntryEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		iterationEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		relationshipEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		relationshipEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		relationshipEClass.getESuperTypes().add(this.getOwnedThing());
		relationshipParameterValueEClass.getESuperTypes().add(this.getParameterValue());
		parameterValueEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		externalIdentifierMapEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		externalIdentifierMapEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		externalIdentifierMapEClass.getESuperTypes().add(this.getOwnedThing());
		idCorrespondenceEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		idCorrespondenceEClass.getESuperTypes().add(this.getOwnedThing());
		requirementsSpecificationEClass.getESuperTypes().add(this.getRequirementsContainer());
		requirementsSpecificationEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		requirementsContainerEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		requirementsContainerEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		requirementsContainerEClass.getESuperTypes().add(this.getOwnedThing());
		requirementsGroupEClass.getESuperTypes().add(this.getRequirementsContainer());
		requirementsContainerParameterValueEClass.getESuperTypes().add(this.getParameterValue());
		requirementEClass.getESuperTypes().add(this.getSimpleParameterizableThing());
		requirementEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		requirementEClass.getESuperTypes().add(theCommonDataPackage.getDeprecatableThing());
		simpleParameterizableThingEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		simpleParameterizableThingEClass.getESuperTypes().add(this.getOwnedThing());
		simpleParameterValueEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		simpleParameterValueEClass.getESuperTypes().add(this.getOwnedThing());
		parametricConstraintEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		parametricConstraintEClass.getESuperTypes().add(this.getOwnedThing());
		booleanExpressionEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		domainFileStoreEClass.getESuperTypes().add(this.getFileStore());
		ruleVerificationListEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		ruleVerificationListEClass.getESuperTypes().add(this.getOwnedThing());
		ruleVerificationEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		ruleVerificationEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		ruleVerificationEClass.getESuperTypes().add(this.getOwnedThing());
		ruleViolationEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		stakeholderEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		stakeholderEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		stakeholderValueEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		stakeholderValueEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		goalEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		goalEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		valueGroupEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		valueGroupEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		stakeHolderValueMapEClass.getESuperTypes().add(theCommonDataPackage.getDefinedThing());
		stakeHolderValueMapEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		stakeHolderValueMapSettingsEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		multiRelationshipEClass.getESuperTypes().add(this.getRelationship());
		binaryRelationshipEClass.getESuperTypes().add(this.getRelationship());
		orExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		notExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		andExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		exclusiveOrExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		relationalExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		userRuleVerificationEClass.getESuperTypes().add(this.getRuleVerification());
		builtInRuleVerificationEClass.getESuperTypes().add(this.getRuleVerification());

		// Initialize classes, features, and operations; add parameters
		initEClass(possibleFiniteStateEClass, PossibleFiniteState.class, "PossibleFiniteState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_RequestedBy(), theSiteDirectoryDataPackage.getDomainOfExpertise(), null, "requestedBy", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_ValueSet(), this.getParameterValueSet(), null, "valueSet", null, 1, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_AllowDifferentOwnerOfOverride(), theCommonDataPackage.getBoolean(), "allowDifferentOwnerOfOverride", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_ExpectsOverride(), theCommonDataPackage.getBoolean(), "expectsOverride", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getParameter__HasValidScale__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidScale", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterOrOverrideBaseEClass, ParameterOrOverrideBase.class, "ParameterOrOverrideBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterOrOverrideBase_ParameterSubscription(), this.getParameterSubscription(), null, "parameterSubscription", null, 0, -1, ParameterOrOverrideBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterBaseEClass, ParameterBase.class, "ParameterBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterBase_ParameterType(), theSiteDirectoryDataPackage.getParameterType(), null, "parameterType", null, 1, 1, ParameterBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterBase_Scale(), theSiteDirectoryDataPackage.getMeasurementScale(), null, "scale", null, 0, 1, ParameterBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterBase_StateDependence(), this.getActualFiniteStateList(), null, "stateDependence", null, 0, 1, ParameterBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterBase_Group(), this.getParameterGroup(), null, "group", null, 0, 1, ParameterBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameterBase_IsOptionDependent(), theCommonDataPackage.getBoolean(), "isOptionDependent", null, 1, 1, ParameterBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actualFiniteStateListEClass, ActualFiniteStateList.class, "ActualFiniteStateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualFiniteStateList_PossibleFiniteStateList(), this.getPossibleFiniteStateList(), null, "possibleFiniteStateList", null, 1, -1, ActualFiniteStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActualFiniteStateList_ActualState(), this.getActualFiniteState(), null, "actualState", null, 0, -1, ActualFiniteStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(optionDependentThingEClass, OptionDependentThing.class, "OptionDependentThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionDependentThing_ExcludeOption(), this.getOption(), null, "excludeOption", null, 0, -1, OptionDependentThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOption_NestedElement(), this.getNestedElement(), null, "nestedElement", null, 0, -1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nestedElementEClass, NestedElement.class, "NestedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedElement_RootElement(), this.getElementDefinition(), null, "rootElement", null, 1, 1, NestedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNestedElement_ElementUsage(), this.getElementUsage(), null, "elementUsage", null, 1, -1, NestedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNestedElement_NestedParameter(), this.getNestedParameter(), null, "nestedParameter", null, 0, -1, NestedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementDefinitionEClass, ElementDefinition.class, "ElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinition_ContainedElement(), this.getElementUsage(), null, "containedElement", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementDefinition_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementDefinition_ParameterGroup(), this.getParameterGroup(), null, "parameterGroup", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementDefinition_ReferencedElement(), this.getNestedElement(), null, "referencedElement", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getElementDefinition__HasUniqueParameterNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasUniqueParameterNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementDefinition__HasUniqueParameterShortNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasUniqueParameterShortNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementBaseEClass, ElementBase.class, "ElementBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementUsageEClass, ElementUsage.class, "ElementUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementUsage_ElementDefinition(), this.getElementDefinition(), null, "elementDefinition", null, 1, 1, ElementUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementUsage_InterfaceEnd(), this.getInterfaceEndKind(), "interfaceEnd", "NONE", 1, 1, ElementUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementUsage_ParameterOverride(), this.getParameterOverride(), null, "parameterOverride", null, 0, -1, ElementUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterOverrideEClass, ParameterOverride.class, "ParameterOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterOverride_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterOverride_ValueSet(), this.getParameterOverrideValueSet(), null, "valueSet", null, 1, -1, ParameterOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterGroupEClass, ParameterGroup.class, "ParameterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterGroup_ContainingGroup(), this.getParameterGroup(), null, "containingGroup", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterOverrideValueSetEClass, ParameterOverrideValueSet.class, "ParameterOverrideValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterOverrideValueSet_ParameterValueSet(), this.getParameterValueSet(), null, "parameterValueSet", null, 1, 1, ParameterOverrideValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterValueSetBaseEClass, ParameterValueSetBase.class, "ParameterValueSetBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterValueSetBase_ValueSwitch(), this.getParameterSwitchKind(), "valueSwitch", null, 1, 1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameterValueSetBase_Published(), theCommonDataPackage.getParameterValueType(), "published", null, 1, -1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterValueSetBase_Formula(), theCommonDataPackage.getParameterFormulaType(), "formula", null, 1, -1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterValueSetBase_Computed(), theCommonDataPackage.getParameterValueType(), "computed", null, 1, -1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterValueSetBase_Manual(), theCommonDataPackage.getParameterValueType(), "manual", null, 1, -1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterValueSetBase_Reference(), theCommonDataPackage.getParameterValueType(), "reference", null, 1, -1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterValueSetBase_ActualValue(), theCommonDataPackage.getParameterValueType(), "actualValue", null, 1, -1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValueSetBase_ActualState(), this.getActualFiniteState(), null, "actualState", null, 0, 1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterValueSetBase_ActualOption(), this.getOption(), null, "actualOption", null, 0, 1, ParameterValueSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actualFiniteStateEClass, ActualFiniteState.class, "ActualFiniteState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActualFiniteState_PossibleState(), this.getPossibleFiniteState(), null, "possibleState", null, 1, -1, ActualFiniteState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActualFiniteState_Kind(), this.getActualFiniteStateKind(), "kind", null, 1, 1, ActualFiniteState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterValueSetEClass, ParameterValueSet.class, "ParameterValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nestedParameterEClass, NestedParameter.class, "NestedParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedParameter_AssociatedParameter(), this.getParameterBase(), null, "associatedParameter", null, 1, 1, NestedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNestedParameter_ActualState(), this.getActualFiniteState(), null, "actualState", null, 0, 1, NestedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNestedParameter_Path(), theCommonDataPackage.getString(), "path", null, 1, 1, NestedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNestedParameter_Formula(), theCommonDataPackage.getParameterFormulaType(), "formula", null, 1, 1, NestedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNestedParameter_ActualValue(), theCommonDataPackage.getParameterValueType(), "actualValue", null, 1, 1, NestedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(possibleFiniteStateListEClass, PossibleFiniteStateList.class, "PossibleFiniteStateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPossibleFiniteStateList_PossibleState(), this.getPossibleFiniteState(), null, "possibleState", null, 1, -1, PossibleFiniteStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPossibleFiniteStateList_DefaultState(), this.getPossibleFiniteState(), null, "defaultState", null, 0, 1, PossibleFiniteStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterSubscriptionEClass, ParameterSubscription.class, "ParameterSubscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterSubscription_ValueSet(), this.getParameterSubscriptionValueSet(), null, "valueSet", null, 1, -1, ParameterSubscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterSubscriptionValueSetEClass, ParameterSubscriptionValueSet.class, "ParameterSubscriptionValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterSubscriptionValueSet_ValueSwitch(), this.getParameterSwitchKind(), "valueSwitch", null, 1, 1, ParameterSubscriptionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameterSubscriptionValueSet_Computed(), theCommonDataPackage.getParameterValueType(), "computed", null, 1, -1, ParameterSubscriptionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterSubscriptionValueSet_Manual(), theCommonDataPackage.getParameterValueType(), "manual", null, 1, -1, ParameterSubscriptionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterSubscriptionValueSet_Reference(), theCommonDataPackage.getParameterValueType(), "reference", null, 1, -1, ParameterSubscriptionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterSubscriptionValueSet_ActualValue(), theCommonDataPackage.getParameterValueType(), "actualValue", null, 1, -1, ParameterSubscriptionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterSubscriptionValueSet_SubscribedValueSet(), this.getParameterValueSetBase(), null, "subscribedValueSet", null, 1, 1, ParameterSubscriptionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterSubscriptionValueSet_ActualState(), this.getActualFiniteState(), null, "actualState", null, 0, 1, ParameterSubscriptionValueSet.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterSubscriptionValueSet_ActualOption(), this.getOption(), null, "actualOption", null, 0, 1, ParameterSubscriptionValueSet.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(fileStoreEClass, FileStore.class, "FileStore", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileStore_Folder(), this.getFolder(), null, "folder", null, 0, -1, FileStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFileStore_File(), this.getFile(), null, "file", null, 0, -1, FileStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_Creator(), theSiteDirectoryDataPackage.getParticipant(), null, "creator", null, 1, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFolder_ContainingFolder(), this.getFolder(), null, "containingFolder", null, 0, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFolder_Path(), theCommonDataPackage.getString(), "path", null, 1, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFile_LockedBy(), theSiteDirectoryDataPackage.getPerson(), null, "lockedBy", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFile_FileRevision(), this.getFileRevision(), null, "fileRevision", null, 1, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fileRevisionEClass, FileRevision.class, "FileRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileRevision_ContentHash(), theCommonDataPackage.getSha1HashType(), "contentHash", null, 1, 1, FileRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFileRevision_Creator(), theSiteDirectoryDataPackage.getParticipant(), null, "creator", null, 1, 1, FileRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFileRevision_ContainingFolder(), this.getFolder(), null, "containingFolder", null, 0, 1, FileRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFileRevision_FileType(), theSiteDirectoryDataPackage.getFileType(), null, "fileType", null, 1, -1, FileRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileRevision_Path(), theCommonDataPackage.getString(), "path", null, 1, 1, FileRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(publicationEClass, Publication.class, "Publication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublication_Domain(), theSiteDirectoryDataPackage.getDomainOfExpertise(), null, "domain", null, 0, -1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPublication_PublishedParameter(), this.getParameterOrOverrideBase(), null, "publishedParameter", null, 0, -1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(engineeringModelEClass, EngineeringModel.class, "EngineeringModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeringModel_EngineeringModelSetup(), theSiteDirectoryDataPackage.getEngineeringModelSetup(), null, "engineeringModelSetup", null, 1, 1, EngineeringModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModel_CommonFileStore(), this.getCommonFileStore(), null, "commonFileStore", null, 0, 1, EngineeringModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModel_LogEntry(), this.getModelLogEntry(), null, "logEntry", null, 0, -1, EngineeringModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModel_Iteration(), this.getIteration(), null, "iteration", null, 1, -1, EngineeringModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModel_Book(), theReportingDataPackage.getBook(), null, "book", null, 0, -1, EngineeringModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeringModel_GenericNote(), theReportingDataPackage.getEngineeringModelDataNote(), null, "genericNote", null, 0, -1, EngineeringModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModel_ModellingAnnotation(), theReportingDataPackage.getModellingAnnotationItem(), null, "modellingAnnotation", null, 0, -1, EngineeringModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(commonFileStoreEClass, CommonFileStore.class, "CommonFileStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelLogEntryEClass, ModelLogEntry.class, "ModelLogEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationEClass, Iteration.class, "Iteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIteration_IterationSetup(), theSiteDirectoryDataPackage.getIterationSetup(), null, "iterationSetup", null, 1, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIteration_SourceIterationIid(), theCommonDataPackage.getUuid(), "sourceIterationIid", null, 0, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_Option(), this.getOption(), null, "option", null, 1, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteration_Publication(), this.getPublication(), null, "publication", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_PossibleFiniteStateList(), this.getPossibleFiniteStateList(), null, "possibleFiniteStateList", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_TopElement(), this.getElementDefinition(), null, "topElement", null, 0, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_Element(), this.getElementDefinition(), null, "element", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_Relationship(), this.getRelationship(), null, "relationship", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_ExternalIdentifierMap(), this.getExternalIdentifierMap(), null, "externalIdentifierMap", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_RequirementsSpecification(), this.getRequirementsSpecification(), null, "requirementsSpecification", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_DomainFileStore(), this.getDomainFileStore(), null, "domainFileStore", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_ActualFiniteStateList(), this.getActualFiniteStateList(), null, "actualFiniteStateList", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_DefaultOption(), this.getOption(), null, "defaultOption", null, 0, 1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_RuleVerificationList(), this.getRuleVerificationList(), null, "ruleVerificationList", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_Stakeholder(), this.getStakeholder(), null, "stakeholder", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_Goal(), this.getGoal(), null, "goal", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_ValueGroup(), this.getValueGroup(), null, "valueGroup", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_StakeholderValue(), this.getStakeholderValue(), null, "stakeholderValue", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_StakeholderValueMap(), this.getStakeHolderValueMap(), null, "stakeholderValueMap", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_SharedDiagramStyle(), theDiagramDataPackage.getSharedStyle(), null, "sharedDiagramStyle", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIteration_DiagramCanvas(), theDiagramDataPackage.getDiagramCanvas(), null, "diagramCanvas", null, 0, -1, Iteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_ParameterValue(), this.getRelationshipParameterValue(), null, "parameterValue", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipParameterValueEClass, RelationshipParameterValue.class, "RelationshipParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_ParameterType(), theSiteDirectoryDataPackage.getParameterType(), null, "parameterType", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterValue_Scale(), theSiteDirectoryDataPackage.getMeasurementScale(), null, "scale", null, 0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameterValue_Value(), theCommonDataPackage.getParameterValueType(), "value", null, 1, -1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalIdentifierMapEClass, ExternalIdentifierMap.class, "ExternalIdentifierMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalIdentifierMap_Correspondence(), this.getIdCorrespondence(), null, "correspondence", null, 0, -1, ExternalIdentifierMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalIdentifierMap_ExternalModelName(), theCommonDataPackage.getString(), "externalModelName", null, 1, 1, ExternalIdentifierMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalIdentifierMap_ExternalToolName(), theCommonDataPackage.getString(), "externalToolName", null, 1, 1, ExternalIdentifierMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternalIdentifierMap_ExternalToolVersion(), theCommonDataPackage.getString(), "externalToolVersion", null, 0, 1, ExternalIdentifierMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExternalIdentifierMap_ExternalFormat(), theSiteDirectoryDataPackage.getReferenceSource(), null, "externalFormat", null, 0, 1, ExternalIdentifierMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(idCorrespondenceEClass, IdCorrespondence.class, "IdCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdCorrespondence_InternalThing(), theCommonDataPackage.getUuid(), "internalThing", null, 1, 1, IdCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdCorrespondence_ExternalId(), theCommonDataPackage.getString(), "externalId", null, 1, 1, IdCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requirementsSpecificationEClass, RequirementsSpecification.class, "RequirementsSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsSpecification_Requirement(), this.getRequirement(), null, "requirement", null, 0, -1, RequirementsSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requirementsContainerEClass, RequirementsContainer.class, "RequirementsContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsContainer_Group(), this.getRequirementsGroup(), null, "group", null, 0, -1, RequirementsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementsContainer_ParameterValue(), this.getRequirementsContainerParameterValue(), null, "parameterValue", null, 0, -1, RequirementsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requirementsGroupEClass, RequirementsGroup.class, "RequirementsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementsContainerParameterValueEClass, RequirementsContainerParameterValue.class, "RequirementsContainerParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_ParametricConstraint(), this.getParametricConstraint(), null, "parametricConstraint", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Group(), this.getRequirementsGroup(), null, "group", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleParameterizableThingEClass, SimpleParameterizableThing.class, "SimpleParameterizableThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleParameterizableThing_ParameterValue(), this.getSimpleParameterValue(), null, "parameterValue", null, 0, -1, SimpleParameterizableThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(simpleParameterValueEClass, SimpleParameterValue.class, "SimpleParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleParameterValue_ParameterType(), theSiteDirectoryDataPackage.getParameterType(), null, "parameterType", null, 1, 1, SimpleParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSimpleParameterValue_Value(), theCommonDataPackage.getParameterValueType(), "value", null, 1, -1, SimpleParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParameterValue_Scale(), theSiteDirectoryDataPackage.getMeasurementScale(), null, "scale", null, 0, 1, SimpleParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parametricConstraintEClass, ParametricConstraint.class, "ParametricConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametricConstraint_Expression(), this.getBooleanExpression(), null, "expression", null, 1, -1, ParametricConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParametricConstraint_TopExpression(), this.getBooleanExpression(), null, "topExpression", null, 0, 1, ParametricConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainFileStoreEClass, DomainFileStore.class, "DomainFileStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainFileStore_IsHidden(), theCommonDataPackage.getBoolean(), "isHidden", null, 1, 1, DomainFileStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ruleVerificationListEClass, RuleVerificationList.class, "RuleVerificationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleVerificationList_RuleVerification(), this.getRuleVerification(), null, "ruleVerification", null, 0, -1, RuleVerificationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleVerificationEClass, RuleVerification.class, "RuleVerification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleVerification_IsActive(), theCommonDataPackage.getBoolean(), "isActive", null, 1, 1, RuleVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRuleVerification_Violation(), this.getRuleViolation(), null, "violation", null, 0, -1, RuleVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRuleVerification_ExecutedOn(), theCommonDataPackage.getDateTime(), "executedOn", null, 0, 1, RuleVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRuleVerification_Status(), this.getRuleVerificationStatusKind(), "status", "NONE", 1, 1, RuleVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ruleViolationEClass, RuleViolation.class, "RuleViolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleViolation_Description(), theCommonDataPackage.getString(), "description", null, 1, 1, RuleViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRuleViolation_ViolatingThing(), theCommonDataPackage.getUuid(), "violatingThing", null, 0, -1, RuleViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeholder_StakeholderValue(), this.getStakeholderValue(), null, "stakeholderValue", null, 0, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stakeholderValueEClass, StakeholderValue.class, "StakeholderValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueGroupEClass, ValueGroup.class, "ValueGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stakeHolderValueMapEClass, StakeHolderValueMap.class, "StakeHolderValueMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeHolderValueMap_Goal(), this.getGoal(), null, "goal", null, 0, -1, StakeHolderValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStakeHolderValueMap_ValueGroup(), this.getValueGroup(), null, "valueGroup", null, 0, -1, StakeHolderValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStakeHolderValueMap_StakeholderValue(), this.getStakeholderValue(), null, "stakeholderValue", null, 0, -1, StakeHolderValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStakeHolderValueMap_Settings(), this.getStakeHolderValueMapSettings(), null, "settings", null, 1, 1, StakeHolderValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStakeHolderValueMap_Requirement(), this.getRequirement(), null, "requirement", null, 0, -1, StakeHolderValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stakeHolderValueMapSettingsEClass, StakeHolderValueMapSettings.class, "StakeHolderValueMapSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeHolderValueMapSettings_GoalToValueGroupRelationship(), theSiteDirectoryDataPackage.getBinaryRelationshipRule(), null, "goalToValueGroupRelationship", null, 0, 1, StakeHolderValueMapSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStakeHolderValueMapSettings_ValueGroupToStakeholderValueRelationship(), theSiteDirectoryDataPackage.getBinaryRelationshipRule(), null, "valueGroupToStakeholderValueRelationship", null, 0, 1, StakeHolderValueMapSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStakeHolderValueMapSettings_StakeholderValueToRequirementRelationship(), theSiteDirectoryDataPackage.getBinaryRelationshipRule(), null, "stakeholderValueToRequirementRelationship", null, 0, 1, StakeHolderValueMapSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(multiRelationshipEClass, MultiRelationship.class, "MultiRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiRelationship_RelatedThing(), theCommonDataPackage.getThing(), null, "relatedThing", null, 0, -1, MultiRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(binaryRelationshipEClass, BinaryRelationship.class, "BinaryRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryRelationship_Source(), theCommonDataPackage.getThing(), null, "source", null, 1, 1, BinaryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryRelationship_Target(), theCommonDataPackage.getThing(), null, "target", null, 1, 1, BinaryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrExpression_Term(), this.getBooleanExpression(), null, "term", null, 2, -1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotExpression_Term(), this.getBooleanExpression(), null, "term", null, 1, 1, NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndExpression_Term(), this.getBooleanExpression(), null, "term", null, 2, -1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exclusiveOrExpressionEClass, ExclusiveOrExpression.class, "ExclusiveOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExclusiveOrExpression_Term(), this.getBooleanExpression(), null, "term", null, 2, 2, ExclusiveOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalExpression_ParameterType(), theSiteDirectoryDataPackage.getParameterType(), null, "parameterType", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRelationalExpression_RelationalOperator(), this.getRelationalOperatorKind(), "relationalOperator", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRelationalExpression_Value(), theCommonDataPackage.getParameterValueType(), "value", null, 1, -1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_Scale(), theSiteDirectoryDataPackage.getMeasurementScale(), null, "scale", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userRuleVerificationEClass, UserRuleVerification.class, "UserRuleVerification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserRuleVerification_Rule(), theSiteDirectoryDataPackage.getRule(), null, "rule", null, 1, 1, UserRuleVerification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(builtInRuleVerificationEClass, BuiltInRuleVerification.class, "BuiltInRuleVerification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ownedThingEClass, OwnedThing.class, "OwnedThing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwnedThing_Owner(), theSiteDirectoryDataPackage.getDomainOfExpertise(), null, "owner", null, 1, 1, OwnedThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(interfaceEndKindEEnum, InterfaceEndKind.class, "InterfaceEndKind");
		addEEnumLiteral(interfaceEndKindEEnum, InterfaceEndKind.NONE);
		addEEnumLiteral(interfaceEndKindEEnum, InterfaceEndKind.UNDIRECTED);
		addEEnumLiteral(interfaceEndKindEEnum, InterfaceEndKind.INPUT);
		addEEnumLiteral(interfaceEndKindEEnum, InterfaceEndKind.OUTPUT);
		addEEnumLiteral(interfaceEndKindEEnum, InterfaceEndKind.IN_OUT);

		initEEnum(parameterSwitchKindEEnum, ParameterSwitchKind.class, "ParameterSwitchKind");
		addEEnumLiteral(parameterSwitchKindEEnum, ParameterSwitchKind.COMPUTED);
		addEEnumLiteral(parameterSwitchKindEEnum, ParameterSwitchKind.MANUAL);
		addEEnumLiteral(parameterSwitchKindEEnum, ParameterSwitchKind.REFERENCE);

		initEEnum(actualFiniteStateKindEEnum, ActualFiniteStateKind.class, "ActualFiniteStateKind");
		addEEnumLiteral(actualFiniteStateKindEEnum, ActualFiniteStateKind.MANDATORY);
		addEEnumLiteral(actualFiniteStateKindEEnum, ActualFiniteStateKind.FORBIDDEN);

		initEEnum(ruleVerificationStatusKindEEnum, RuleVerificationStatusKind.class, "RuleVerificationStatusKind");
		addEEnumLiteral(ruleVerificationStatusKindEEnum, RuleVerificationStatusKind.NONE);
		addEEnumLiteral(ruleVerificationStatusKindEEnum, RuleVerificationStatusKind.PASSED);
		addEEnumLiteral(ruleVerificationStatusKindEEnum, RuleVerificationStatusKind.FAILED);
		addEEnumLiteral(ruleVerificationStatusKindEEnum, RuleVerificationStatusKind.INCONCLUSIVE);

		initEEnum(booleanOperatorKindEEnum, BooleanOperatorKind.class, "BooleanOperatorKind");
		addEEnumLiteral(booleanOperatorKindEEnum, BooleanOperatorKind.AND);
		addEEnumLiteral(booleanOperatorKindEEnum, BooleanOperatorKind.OR);
		addEEnumLiteral(booleanOperatorKindEEnum, BooleanOperatorKind.XOR);

		initEEnum(relationalOperatorKindEEnum, RelationalOperatorKind.class, "RelationalOperatorKind");
		addEEnumLiteral(relationalOperatorKindEEnum, RelationalOperatorKind.EQ);
		addEEnumLiteral(relationalOperatorKindEEnum, RelationalOperatorKind.NE);
		addEEnumLiteral(relationalOperatorKindEEnum, RelationalOperatorKind.LT);
		addEEnumLiteral(relationalOperatorKindEEnum, RelationalOperatorKind.GT);
		addEEnumLiteral(relationalOperatorKindEEnum, RelationalOperatorKind.LE);
		addEEnumLiteral(relationalOperatorKindEEnum, RelationalOperatorKind.GE);

		// Create resource
		createResource(eNS_URI);
	}

} //EngineeringModelDataPackageImpl
