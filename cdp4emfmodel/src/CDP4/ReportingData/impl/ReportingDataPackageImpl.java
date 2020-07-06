/**
 */
package CDP4.ReportingData.impl;

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

import CDP4.ReportingData.ActionItem;
import CDP4.ReportingData.AnnotationApprovalKind;
import CDP4.ReportingData.AnnotationClassificationKind;
import CDP4.ReportingData.AnnotationStatusKind;
import CDP4.ReportingData.Approval;
import CDP4.ReportingData.BinaryNote;
import CDP4.ReportingData.Book;
import CDP4.ReportingData.ChangeProposal;
import CDP4.ReportingData.ChangeRequest;
import CDP4.ReportingData.ContractChangeNotice;
import CDP4.ReportingData.ContractDeviation;
import CDP4.ReportingData.DiscussionItem;
import CDP4.ReportingData.EngineeringModelDataAnnotation;
import CDP4.ReportingData.EngineeringModelDataDiscussionItem;
import CDP4.ReportingData.EngineeringModelDataNote;
import CDP4.ReportingData.GenericAnnotation;
import CDP4.ReportingData.ModellingAnnotationItem;
import CDP4.ReportingData.ModellingThingReference;
import CDP4.ReportingData.Note;
import CDP4.ReportingData.Page;
import CDP4.ReportingData.ReportingDataFactory;
import CDP4.ReportingData.ReportingDataPackage;
import CDP4.ReportingData.RequestForDeviation;
import CDP4.ReportingData.RequestForWaiver;
import CDP4.ReportingData.ReviewItemDiscrepancy;
import CDP4.ReportingData.Section;
import CDP4.ReportingData.SiteDirectoryDataAnnotation;
import CDP4.ReportingData.SiteDirectoryDataDiscussionItem;
import CDP4.ReportingData.SiteDirectoryThingReference;
import CDP4.ReportingData.Solution;
import CDP4.ReportingData.TextualNote;
import CDP4.ReportingData.ThingReference;

import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import CDP4.SiteDirectoryData.impl.SiteDirectoryDataPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportingDataPackageImpl extends EPackageImpl implements ReportingDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringModelDataNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringModelDataAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modellingThingReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineeringModelDataDiscussionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discussionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modellingAnnotationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestForWaiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestForDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewItemDiscrepancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteDirectoryThingReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractChangeNoticeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteDirectoryDataDiscussionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siteDirectoryDataAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum annotationStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum annotationClassificationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum annotationApprovalKindEEnum = null;

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
	 * @see CDP4.ReportingData.ReportingDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReportingDataPackageImpl() {
		super(eNS_URI, ReportingDataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReportingDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReportingDataPackage init() {
		if (isInited) return (ReportingDataPackage)EPackage.Registry.INSTANCE.getEPackage(ReportingDataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReportingDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReportingDataPackageImpl theReportingDataPackage = registeredReportingDataPackage instanceof ReportingDataPackageImpl ? (ReportingDataPackageImpl)registeredReportingDataPackage : new ReportingDataPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDatabasePackage.eNS_URI);
		DeploymentDatabasePackageImpl theDeploymentDatabasePackage = (DeploymentDatabasePackageImpl)(registeredPackage instanceof DeploymentDatabasePackageImpl ? registeredPackage : DeploymentDatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SiteDirectoryDataPackage.eNS_URI);
		SiteDirectoryDataPackageImpl theSiteDirectoryDataPackage = (SiteDirectoryDataPackageImpl)(registeredPackage instanceof SiteDirectoryDataPackageImpl ? registeredPackage : SiteDirectoryDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonDataPackage.eNS_URI);
		CommonDataPackageImpl theCommonDataPackage = (CommonDataPackageImpl)(registeredPackage instanceof CommonDataPackageImpl ? registeredPackage : CommonDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EngineeringModelDataPackage.eNS_URI);
		EngineeringModelDataPackageImpl theEngineeringModelDataPackage = (EngineeringModelDataPackageImpl)(registeredPackage instanceof EngineeringModelDataPackageImpl ? registeredPackage : EngineeringModelDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DiagramDataPackage.eNS_URI);
		DiagramDataPackageImpl theDiagramDataPackage = (DiagramDataPackageImpl)(registeredPackage instanceof DiagramDataPackageImpl ? registeredPackage : DiagramDataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeploymentDistributedSessionPackage.eNS_URI);
		DeploymentDistributedSessionPackageImpl theDeploymentDistributedSessionPackage = (DeploymentDistributedSessionPackageImpl)(registeredPackage instanceof DeploymentDistributedSessionPackageImpl ? registeredPackage : DeploymentDistributedSessionPackage.eINSTANCE);

		// Create package meta-data objects
		theReportingDataPackage.createPackageContents();
		theDeploymentDatabasePackage.createPackageContents();
		theSiteDirectoryDataPackage.createPackageContents();
		theCommonDataPackage.createPackageContents();
		theEngineeringModelDataPackage.createPackageContents();
		theDiagramDataPackage.createPackageContents();
		theDeploymentDistributedSessionPackage.createPackageContents();

		// Initialize created meta-data
		theReportingDataPackage.initializePackageContents();
		theDeploymentDatabasePackage.initializePackageContents();
		theSiteDirectoryDataPackage.initializePackageContents();
		theCommonDataPackage.initializePackageContents();
		theEngineeringModelDataPackage.initializePackageContents();
		theDiagramDataPackage.initializePackageContents();
		theDeploymentDistributedSessionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReportingDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReportingDataPackage.eNS_URI, theReportingDataPackage);
		return theReportingDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBook() {
		return bookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBook_Section() {
		return (EReference)bookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringModelDataNote() {
		return engineeringModelDataNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringModelDataAnnotation() {
		return engineeringModelDataAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelDataAnnotation_RelatedThing() {
		return (EReference)engineeringModelDataAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelDataAnnotation_Author() {
		return (EReference)engineeringModelDataAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelDataAnnotation_PrimaryAnnotatedThing() {
		return (EReference)engineeringModelDataAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelDataAnnotation_Discussion() {
		return (EReference)engineeringModelDataAnnotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericAnnotation() {
		return genericAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModellingThingReference() {
		return modellingThingReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThingReference() {
		return thingReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingReference_ReferencedRevisionNumber() {
		return (EAttribute)thingReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingReference_ReferencedThing() {
		return (EReference)thingReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEngineeringModelDataDiscussionItem() {
		return engineeringModelDataDiscussionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEngineeringModelDataDiscussionItem_Author() {
		return (EReference)engineeringModelDataDiscussionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscussionItem() {
		return discussionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscussionItem_ReplyTo() {
		return (EReference)discussionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModellingAnnotationItem() {
		return modellingAnnotationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModellingAnnotationItem_Status() {
		return (EAttribute)modellingAnnotationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModellingAnnotationItem_Title() {
		return (EAttribute)modellingAnnotationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModellingAnnotationItem_Classification() {
		return (EAttribute)modellingAnnotationItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModellingAnnotationItem_ApprovedBy() {
		return (EReference)modellingAnnotationItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModellingAnnotationItem_SourceAnnotation() {
		return (EReference)modellingAnnotationItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApproval() {
		return approvalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApproval_Author() {
		return (EReference)approvalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApproval_Classification() {
		return (EAttribute)approvalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Page() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Note() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryNote() {
		return binaryNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryNote_Caption() {
		return (EAttribute)binaryNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryNote_FileType() {
		return (EReference)binaryNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualNote() {
		return textualNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualNote_Content() {
		return (EAttribute)textualNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualNote_LanguageCode() {
		return (EAttribute)textualNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractDeviation() {
		return contractDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestForWaiver() {
		return requestForWaiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestForDeviation() {
		return requestForDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeRequest() {
		return changeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReviewItemDiscrepancy() {
		return reviewItemDiscrepancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReviewItemDiscrepancy_Solution() {
		return (EReference)reviewItemDiscrepancyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Author() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionItem() {
		return actionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionItem_Actionee() {
		return (EReference)actionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionItem_DueDate() {
		return (EAttribute)actionItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionItem_CloseOutDate() {
		return (EAttribute)actionItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionItem_CloseOutStatement() {
		return (EAttribute)actionItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiteDirectoryThingReference() {
		return siteDirectoryThingReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeProposal() {
		return changeProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeProposal_ChangeRequest() {
		return (EReference)changeProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractChangeNotice() {
		return contractChangeNoticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractChangeNotice_ChangeProposal() {
		return (EReference)contractChangeNoticeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiteDirectoryDataDiscussionItem() {
		return siteDirectoryDataDiscussionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectoryDataDiscussionItem_Author() {
		return (EReference)siteDirectoryDataDiscussionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiteDirectoryDataAnnotation() {
		return siteDirectoryDataAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectoryDataAnnotation_RelatedThing() {
		return (EReference)siteDirectoryDataAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectoryDataAnnotation_Author() {
		return (EReference)siteDirectoryDataAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectoryDataAnnotation_PrimaryAnnotatedThing() {
		return (EReference)siteDirectoryDataAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiteDirectoryDataAnnotation_Discussion() {
		return (EReference)siteDirectoryDataAnnotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnnotationStatusKind() {
		return annotationStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnnotationClassificationKind() {
		return annotationClassificationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnnotationApprovalKind() {
		return annotationApprovalKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingDataFactory getReportingDataFactory() {
		return (ReportingDataFactory)getEFactoryInstance();
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
		bookEClass = createEClass(BOOK);
		createEReference(bookEClass, BOOK__SECTION);

		engineeringModelDataNoteEClass = createEClass(ENGINEERING_MODEL_DATA_NOTE);

		engineeringModelDataAnnotationEClass = createEClass(ENGINEERING_MODEL_DATA_ANNOTATION);
		createEReference(engineeringModelDataAnnotationEClass, ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING);
		createEReference(engineeringModelDataAnnotationEClass, ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR);
		createEReference(engineeringModelDataAnnotationEClass, ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING);
		createEReference(engineeringModelDataAnnotationEClass, ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION);

		genericAnnotationEClass = createEClass(GENERIC_ANNOTATION);

		modellingThingReferenceEClass = createEClass(MODELLING_THING_REFERENCE);

		thingReferenceEClass = createEClass(THING_REFERENCE);
		createEAttribute(thingReferenceEClass, THING_REFERENCE__REFERENCED_REVISION_NUMBER);
		createEReference(thingReferenceEClass, THING_REFERENCE__REFERENCED_THING);

		engineeringModelDataDiscussionItemEClass = createEClass(ENGINEERING_MODEL_DATA_DISCUSSION_ITEM);
		createEReference(engineeringModelDataDiscussionItemEClass, ENGINEERING_MODEL_DATA_DISCUSSION_ITEM__AUTHOR);

		discussionItemEClass = createEClass(DISCUSSION_ITEM);
		createEReference(discussionItemEClass, DISCUSSION_ITEM__REPLY_TO);

		modellingAnnotationItemEClass = createEClass(MODELLING_ANNOTATION_ITEM);
		createEAttribute(modellingAnnotationItemEClass, MODELLING_ANNOTATION_ITEM__STATUS);
		createEAttribute(modellingAnnotationItemEClass, MODELLING_ANNOTATION_ITEM__TITLE);
		createEAttribute(modellingAnnotationItemEClass, MODELLING_ANNOTATION_ITEM__CLASSIFICATION);
		createEReference(modellingAnnotationItemEClass, MODELLING_ANNOTATION_ITEM__APPROVED_BY);
		createEReference(modellingAnnotationItemEClass, MODELLING_ANNOTATION_ITEM__SOURCE_ANNOTATION);

		approvalEClass = createEClass(APPROVAL);
		createEReference(approvalEClass, APPROVAL__AUTHOR);
		createEAttribute(approvalEClass, APPROVAL__CLASSIFICATION);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__PAGE);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__NOTE);

		noteEClass = createEClass(NOTE);

		binaryNoteEClass = createEClass(BINARY_NOTE);
		createEAttribute(binaryNoteEClass, BINARY_NOTE__CAPTION);
		createEReference(binaryNoteEClass, BINARY_NOTE__FILE_TYPE);

		textualNoteEClass = createEClass(TEXTUAL_NOTE);
		createEAttribute(textualNoteEClass, TEXTUAL_NOTE__CONTENT);
		createEAttribute(textualNoteEClass, TEXTUAL_NOTE__LANGUAGE_CODE);

		contractDeviationEClass = createEClass(CONTRACT_DEVIATION);

		requestForWaiverEClass = createEClass(REQUEST_FOR_WAIVER);

		requestForDeviationEClass = createEClass(REQUEST_FOR_DEVIATION);

		changeRequestEClass = createEClass(CHANGE_REQUEST);

		reviewItemDiscrepancyEClass = createEClass(REVIEW_ITEM_DISCREPANCY);
		createEReference(reviewItemDiscrepancyEClass, REVIEW_ITEM_DISCREPANCY__SOLUTION);

		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__AUTHOR);

		actionItemEClass = createEClass(ACTION_ITEM);
		createEReference(actionItemEClass, ACTION_ITEM__ACTIONEE);
		createEAttribute(actionItemEClass, ACTION_ITEM__DUE_DATE);
		createEAttribute(actionItemEClass, ACTION_ITEM__CLOSE_OUT_DATE);
		createEAttribute(actionItemEClass, ACTION_ITEM__CLOSE_OUT_STATEMENT);

		siteDirectoryThingReferenceEClass = createEClass(SITE_DIRECTORY_THING_REFERENCE);

		changeProposalEClass = createEClass(CHANGE_PROPOSAL);
		createEReference(changeProposalEClass, CHANGE_PROPOSAL__CHANGE_REQUEST);

		contractChangeNoticeEClass = createEClass(CONTRACT_CHANGE_NOTICE);
		createEReference(contractChangeNoticeEClass, CONTRACT_CHANGE_NOTICE__CHANGE_PROPOSAL);

		siteDirectoryDataDiscussionItemEClass = createEClass(SITE_DIRECTORY_DATA_DISCUSSION_ITEM);
		createEReference(siteDirectoryDataDiscussionItemEClass, SITE_DIRECTORY_DATA_DISCUSSION_ITEM__AUTHOR);

		siteDirectoryDataAnnotationEClass = createEClass(SITE_DIRECTORY_DATA_ANNOTATION);
		createEReference(siteDirectoryDataAnnotationEClass, SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING);
		createEReference(siteDirectoryDataAnnotationEClass, SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR);
		createEReference(siteDirectoryDataAnnotationEClass, SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING);
		createEReference(siteDirectoryDataAnnotationEClass, SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION);

		// Create enums
		annotationStatusKindEEnum = createEEnum(ANNOTATION_STATUS_KIND);
		annotationClassificationKindEEnum = createEEnum(ANNOTATION_CLASSIFICATION_KIND);
		annotationApprovalKindEEnum = createEEnum(ANNOTATION_APPROVAL_KIND);
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
		EngineeringModelDataPackage theEngineeringModelDataPackage = (EngineeringModelDataPackage)EPackage.Registry.INSTANCE.getEPackage(EngineeringModelDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bookEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		bookEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		bookEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		bookEClass.getESuperTypes().add(theEngineeringModelDataPackage.getOwnedThing());
		bookEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		bookEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		engineeringModelDataNoteEClass.getESuperTypes().add(this.getEngineeringModelDataAnnotation());
		engineeringModelDataAnnotationEClass.getESuperTypes().add(this.getGenericAnnotation());
		genericAnnotationEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		genericAnnotationEClass.getESuperTypes().add(theCommonDataPackage.getAnnotation());
		genericAnnotationEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		modellingThingReferenceEClass.getESuperTypes().add(this.getThingReference());
		thingReferenceEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		engineeringModelDataDiscussionItemEClass.getESuperTypes().add(this.getDiscussionItem());
		discussionItemEClass.getESuperTypes().add(this.getGenericAnnotation());
		modellingAnnotationItemEClass.getESuperTypes().add(this.getEngineeringModelDataAnnotation());
		modellingAnnotationItemEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		modellingAnnotationItemEClass.getESuperTypes().add(theEngineeringModelDataPackage.getOwnedThing());
		modellingAnnotationItemEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		approvalEClass.getESuperTypes().add(this.getGenericAnnotation());
		approvalEClass.getESuperTypes().add(theEngineeringModelDataPackage.getOwnedThing());
		sectionEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		sectionEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		sectionEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		sectionEClass.getESuperTypes().add(theEngineeringModelDataPackage.getOwnedThing());
		sectionEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		sectionEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		pageEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		pageEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		pageEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		pageEClass.getESuperTypes().add(theEngineeringModelDataPackage.getOwnedThing());
		pageEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		pageEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		noteEClass.getESuperTypes().add(theCommonDataPackage.getThing());
		noteEClass.getESuperTypes().add(theSiteDirectoryDataPackage.getCategorizableThing());
		noteEClass.getESuperTypes().add(theCommonDataPackage.getNamedThing());
		noteEClass.getESuperTypes().add(theEngineeringModelDataPackage.getOwnedThing());
		noteEClass.getESuperTypes().add(theCommonDataPackage.getShortNamedThing());
		noteEClass.getESuperTypes().add(theCommonDataPackage.getTimeStampedThing());
		binaryNoteEClass.getESuperTypes().add(this.getNote());
		textualNoteEClass.getESuperTypes().add(this.getNote());
		contractDeviationEClass.getESuperTypes().add(this.getModellingAnnotationItem());
		requestForWaiverEClass.getESuperTypes().add(this.getContractDeviation());
		requestForDeviationEClass.getESuperTypes().add(this.getContractDeviation());
		changeRequestEClass.getESuperTypes().add(this.getContractDeviation());
		reviewItemDiscrepancyEClass.getESuperTypes().add(this.getModellingAnnotationItem());
		solutionEClass.getESuperTypes().add(this.getGenericAnnotation());
		solutionEClass.getESuperTypes().add(theEngineeringModelDataPackage.getOwnedThing());
		actionItemEClass.getESuperTypes().add(this.getModellingAnnotationItem());
		siteDirectoryThingReferenceEClass.getESuperTypes().add(this.getThingReference());
		changeProposalEClass.getESuperTypes().add(this.getModellingAnnotationItem());
		contractChangeNoticeEClass.getESuperTypes().add(this.getModellingAnnotationItem());
		siteDirectoryDataDiscussionItemEClass.getESuperTypes().add(this.getDiscussionItem());
		siteDirectoryDataAnnotationEClass.getESuperTypes().add(this.getGenericAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBook_Section(), this.getSection(), null, "section", null, 0, -1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineeringModelDataNoteEClass, EngineeringModelDataNote.class, "EngineeringModelDataNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(engineeringModelDataAnnotationEClass, EngineeringModelDataAnnotation.class, "EngineeringModelDataAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeringModelDataAnnotation_RelatedThing(), this.getModellingThingReference(), null, "relatedThing", null, 0, -1, EngineeringModelDataAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModelDataAnnotation_Author(), theSiteDirectoryDataPackage.getParticipant(), null, "author", null, 1, 1, EngineeringModelDataAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModelDataAnnotation_PrimaryAnnotatedThing(), this.getModellingThingReference(), null, "primaryAnnotatedThing", null, 0, 1, EngineeringModelDataAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEngineeringModelDataAnnotation_Discussion(), this.getEngineeringModelDataDiscussionItem(), null, "discussion", null, 0, -1, EngineeringModelDataAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genericAnnotationEClass, GenericAnnotation.class, "GenericAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modellingThingReferenceEClass, ModellingThingReference.class, "ModellingThingReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thingReferenceEClass, ThingReference.class, "ThingReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThingReference_ReferencedRevisionNumber(), theCommonDataPackage.getInteger(), "referencedRevisionNumber", null, 1, 1, ThingReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThingReference_ReferencedThing(), theCommonDataPackage.getThing(), null, "referencedThing", null, 1, 1, ThingReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(engineeringModelDataDiscussionItemEClass, EngineeringModelDataDiscussionItem.class, "EngineeringModelDataDiscussionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeringModelDataDiscussionItem_Author(), theSiteDirectoryDataPackage.getParticipant(), null, "author", null, 1, 1, EngineeringModelDataDiscussionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discussionItemEClass, DiscussionItem.class, "DiscussionItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscussionItem_ReplyTo(), this.getDiscussionItem(), null, "replyTo", null, 0, 1, DiscussionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modellingAnnotationItemEClass, ModellingAnnotationItem.class, "ModellingAnnotationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModellingAnnotationItem_Status(), this.getAnnotationStatusKind(), "status", null, 1, 1, ModellingAnnotationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModellingAnnotationItem_Title(), theCommonDataPackage.getString(), "title", null, 1, 1, ModellingAnnotationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModellingAnnotationItem_Classification(), this.getAnnotationClassificationKind(), "classification", null, 1, 1, ModellingAnnotationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModellingAnnotationItem_ApprovedBy(), this.getApproval(), null, "approvedBy", null, 0, -1, ModellingAnnotationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModellingAnnotationItem_SourceAnnotation(), this.getModellingAnnotationItem(), null, "sourceAnnotation", null, 0, -1, ModellingAnnotationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(approvalEClass, Approval.class, "Approval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApproval_Author(), theSiteDirectoryDataPackage.getParticipant(), null, "author", null, 1, 1, Approval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApproval_Classification(), this.getAnnotationApprovalKind(), "classification", null, 1, 1, Approval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Page(), this.getPage(), null, "page", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Note(), this.getNote(), null, "note", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryNoteEClass, BinaryNote.class, "BinaryNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryNote_Caption(), theCommonDataPackage.getString(), "caption", null, 1, 1, BinaryNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryNote_FileType(), theSiteDirectoryDataPackage.getFileType(), null, "fileType", null, 1, 1, BinaryNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textualNoteEClass, TextualNote.class, "TextualNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextualNote_Content(), theCommonDataPackage.getString(), "content", null, 1, 1, TextualNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTextualNote_LanguageCode(), theCommonDataPackage.getLanguageCode(), "languageCode", null, 1, 1, TextualNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contractDeviationEClass, ContractDeviation.class, "ContractDeviation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestForWaiverEClass, RequestForWaiver.class, "RequestForWaiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestForDeviationEClass, RequestForDeviation.class, "RequestForDeviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeRequestEClass, ChangeRequest.class, "ChangeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reviewItemDiscrepancyEClass, ReviewItemDiscrepancy.class, "ReviewItemDiscrepancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReviewItemDiscrepancy_Solution(), this.getSolution(), null, "solution", null, 0, 1, ReviewItemDiscrepancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolution_Author(), theSiteDirectoryDataPackage.getParticipant(), null, "author", null, 1, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionItemEClass, ActionItem.class, "ActionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionItem_Actionee(), theSiteDirectoryDataPackage.getParticipant(), null, "actionee", null, 1, 1, ActionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionItem_DueDate(), theCommonDataPackage.getDate(), "dueDate", null, 1, 1, ActionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionItem_CloseOutDate(), theCommonDataPackage.getDate(), "closeOutDate", null, 0, 1, ActionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionItem_CloseOutStatement(), theCommonDataPackage.getString(), "closeOutStatement", null, 0, 1, ActionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(siteDirectoryThingReferenceEClass, SiteDirectoryThingReference.class, "SiteDirectoryThingReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeProposalEClass, ChangeProposal.class, "ChangeProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeProposal_ChangeRequest(), this.getChangeRequest(), null, "changeRequest", null, 1, 1, ChangeProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contractChangeNoticeEClass, ContractChangeNotice.class, "ContractChangeNotice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContractChangeNotice_ChangeProposal(), this.getChangeProposal(), null, "changeProposal", null, 1, 1, ContractChangeNotice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(siteDirectoryDataDiscussionItemEClass, SiteDirectoryDataDiscussionItem.class, "SiteDirectoryDataDiscussionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiteDirectoryDataDiscussionItem_Author(), theSiteDirectoryDataPackage.getPerson(), null, "author", null, 1, 1, SiteDirectoryDataDiscussionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(siteDirectoryDataAnnotationEClass, SiteDirectoryDataAnnotation.class, "SiteDirectoryDataAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiteDirectoryDataAnnotation_RelatedThing(), this.getSiteDirectoryThingReference(), null, "relatedThing", null, 1, -1, SiteDirectoryDataAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectoryDataAnnotation_Author(), theSiteDirectoryDataPackage.getPerson(), null, "author", null, 1, 1, SiteDirectoryDataAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectoryDataAnnotation_PrimaryAnnotatedThing(), this.getSiteDirectoryThingReference(), null, "primaryAnnotatedThing", null, 1, 1, SiteDirectoryDataAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSiteDirectoryDataAnnotation_Discussion(), this.getSiteDirectoryDataDiscussionItem(), null, "discussion", null, 0, -1, SiteDirectoryDataAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(annotationStatusKindEEnum, AnnotationStatusKind.class, "AnnotationStatusKind");
		addEEnumLiteral(annotationStatusKindEEnum, AnnotationStatusKind.OPEN);
		addEEnumLiteral(annotationStatusKindEEnum, AnnotationStatusKind.DONE);
		addEEnumLiteral(annotationStatusKindEEnum, AnnotationStatusKind.CLOSED);
		addEEnumLiteral(annotationStatusKindEEnum, AnnotationStatusKind.INVALID);
		addEEnumLiteral(annotationStatusKindEEnum, AnnotationStatusKind.WONTFIX);
		addEEnumLiteral(annotationStatusKindEEnum, AnnotationStatusKind.NOT_APPLICABLE);

		initEEnum(annotationClassificationKindEEnum, AnnotationClassificationKind.class, "AnnotationClassificationKind");
		addEEnumLiteral(annotationClassificationKindEEnum, AnnotationClassificationKind.MAJOR);
		addEEnumLiteral(annotationClassificationKindEEnum, AnnotationClassificationKind.MINOR);

		initEEnum(annotationApprovalKindEEnum, AnnotationApprovalKind.class, "AnnotationApprovalKind");
		addEEnumLiteral(annotationApprovalKindEEnum, AnnotationApprovalKind.ACCEPTED);
		addEEnumLiteral(annotationApprovalKindEEnum, AnnotationApprovalKind.REJECTED);
		addEEnumLiteral(annotationApprovalKindEEnum, AnnotationApprovalKind.WITHDRAWN);

		// Create resource
		createResource(eNS_URI);
	}

} //ReportingDataPackageImpl
