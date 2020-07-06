/**
 */
package CDP4.ReportingData.impl;

import CDP4.ReportingData.*;

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
public class ReportingDataFactoryImpl extends EFactoryImpl implements ReportingDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReportingDataFactory init() {
		try {
			ReportingDataFactory theReportingDataFactory = (ReportingDataFactory)EPackage.Registry.INSTANCE.getEFactory(ReportingDataPackage.eNS_URI);
			if (theReportingDataFactory != null) {
				return theReportingDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReportingDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingDataFactoryImpl() {
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
			case ReportingDataPackage.BOOK: return createBook();
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_NOTE: return createEngineeringModelDataNote();
			case ReportingDataPackage.MODELLING_THING_REFERENCE: return createModellingThingReference();
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_DISCUSSION_ITEM: return createEngineeringModelDataDiscussionItem();
			case ReportingDataPackage.APPROVAL: return createApproval();
			case ReportingDataPackage.SECTION: return createSection();
			case ReportingDataPackage.PAGE: return createPage();
			case ReportingDataPackage.BINARY_NOTE: return createBinaryNote();
			case ReportingDataPackage.TEXTUAL_NOTE: return createTextualNote();
			case ReportingDataPackage.REQUEST_FOR_WAIVER: return createRequestForWaiver();
			case ReportingDataPackage.REQUEST_FOR_DEVIATION: return createRequestForDeviation();
			case ReportingDataPackage.CHANGE_REQUEST: return createChangeRequest();
			case ReportingDataPackage.REVIEW_ITEM_DISCREPANCY: return createReviewItemDiscrepancy();
			case ReportingDataPackage.SOLUTION: return createSolution();
			case ReportingDataPackage.ACTION_ITEM: return createActionItem();
			case ReportingDataPackage.SITE_DIRECTORY_THING_REFERENCE: return createSiteDirectoryThingReference();
			case ReportingDataPackage.CHANGE_PROPOSAL: return createChangeProposal();
			case ReportingDataPackage.CONTRACT_CHANGE_NOTICE: return createContractChangeNotice();
			case ReportingDataPackage.SITE_DIRECTORY_DATA_DISCUSSION_ITEM: return createSiteDirectoryDataDiscussionItem();
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION: return createSiteDirectoryDataAnnotation();
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
			case ReportingDataPackage.ANNOTATION_STATUS_KIND:
				return createAnnotationStatusKindFromString(eDataType, initialValue);
			case ReportingDataPackage.ANNOTATION_CLASSIFICATION_KIND:
				return createAnnotationClassificationKindFromString(eDataType, initialValue);
			case ReportingDataPackage.ANNOTATION_APPROVAL_KIND:
				return createAnnotationApprovalKindFromString(eDataType, initialValue);
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
			case ReportingDataPackage.ANNOTATION_STATUS_KIND:
				return convertAnnotationStatusKindToString(eDataType, instanceValue);
			case ReportingDataPackage.ANNOTATION_CLASSIFICATION_KIND:
				return convertAnnotationClassificationKindToString(eDataType, instanceValue);
			case ReportingDataPackage.ANNOTATION_APPROVAL_KIND:
				return convertAnnotationApprovalKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelDataNote createEngineeringModelDataNote() {
		EngineeringModelDataNoteImpl engineeringModelDataNote = new EngineeringModelDataNoteImpl();
		return engineeringModelDataNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModellingThingReference createModellingThingReference() {
		ModellingThingReferenceImpl modellingThingReference = new ModellingThingReferenceImpl();
		return modellingThingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelDataDiscussionItem createEngineeringModelDataDiscussionItem() {
		EngineeringModelDataDiscussionItemImpl engineeringModelDataDiscussionItem = new EngineeringModelDataDiscussionItemImpl();
		return engineeringModelDataDiscussionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Approval createApproval() {
		ApprovalImpl approval = new ApprovalImpl();
		return approval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryNote createBinaryNote() {
		BinaryNoteImpl binaryNote = new BinaryNoteImpl();
		return binaryNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualNote createTextualNote() {
		TextualNoteImpl textualNote = new TextualNoteImpl();
		return textualNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestForWaiver createRequestForWaiver() {
		RequestForWaiverImpl requestForWaiver = new RequestForWaiverImpl();
		return requestForWaiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestForDeviation createRequestForDeviation() {
		RequestForDeviationImpl requestForDeviation = new RequestForDeviationImpl();
		return requestForDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequest createChangeRequest() {
		ChangeRequestImpl changeRequest = new ChangeRequestImpl();
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewItemDiscrepancy createReviewItemDiscrepancy() {
		ReviewItemDiscrepancyImpl reviewItemDiscrepancy = new ReviewItemDiscrepancyImpl();
		return reviewItemDiscrepancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionItem createActionItem() {
		ActionItemImpl actionItem = new ActionItemImpl();
		return actionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryThingReference createSiteDirectoryThingReference() {
		SiteDirectoryThingReferenceImpl siteDirectoryThingReference = new SiteDirectoryThingReferenceImpl();
		return siteDirectoryThingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeProposal createChangeProposal() {
		ChangeProposalImpl changeProposal = new ChangeProposalImpl();
		return changeProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractChangeNotice createContractChangeNotice() {
		ContractChangeNoticeImpl contractChangeNotice = new ContractChangeNoticeImpl();
		return contractChangeNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataDiscussionItem createSiteDirectoryDataDiscussionItem() {
		SiteDirectoryDataDiscussionItemImpl siteDirectoryDataDiscussionItem = new SiteDirectoryDataDiscussionItemImpl();
		return siteDirectoryDataDiscussionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryDataAnnotation createSiteDirectoryDataAnnotation() {
		SiteDirectoryDataAnnotationImpl siteDirectoryDataAnnotation = new SiteDirectoryDataAnnotationImpl();
		return siteDirectoryDataAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationStatusKind createAnnotationStatusKindFromString(EDataType eDataType, String initialValue) {
		AnnotationStatusKind result = AnnotationStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnotationStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationClassificationKind createAnnotationClassificationKindFromString(EDataType eDataType, String initialValue) {
		AnnotationClassificationKind result = AnnotationClassificationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnotationClassificationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationApprovalKind createAnnotationApprovalKindFromString(EDataType eDataType, String initialValue) {
		AnnotationApprovalKind result = AnnotationApprovalKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnotationApprovalKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingDataPackage getReportingDataPackage() {
		return (ReportingDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReportingDataPackage getPackage() {
		return ReportingDataPackage.eINSTANCE;
	}

} //ReportingDataFactoryImpl
