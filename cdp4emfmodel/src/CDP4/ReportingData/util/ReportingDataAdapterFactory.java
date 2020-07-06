/**
 */
package CDP4.ReportingData.util;

import CDP4.CommonData.Annotation;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.EngineeringModelData.OwnedThing;

import CDP4.ReportingData.*;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.ReportingData.ReportingDataPackage
 * @generated
 */
public class ReportingDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReportingDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReportingDataPackage.eINSTANCE;
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
	protected ReportingDataSwitch<Adapter> modelSwitch =
		new ReportingDataSwitch<Adapter>() {
			@Override
			public Adapter caseBook(Book object) {
				return createBookAdapter();
			}
			@Override
			public Adapter caseEngineeringModelDataNote(EngineeringModelDataNote object) {
				return createEngineeringModelDataNoteAdapter();
			}
			@Override
			public Adapter caseEngineeringModelDataAnnotation(EngineeringModelDataAnnotation object) {
				return createEngineeringModelDataAnnotationAdapter();
			}
			@Override
			public Adapter caseGenericAnnotation(GenericAnnotation object) {
				return createGenericAnnotationAdapter();
			}
			@Override
			public Adapter caseModellingThingReference(ModellingThingReference object) {
				return createModellingThingReferenceAdapter();
			}
			@Override
			public Adapter caseThingReference(ThingReference object) {
				return createThingReferenceAdapter();
			}
			@Override
			public Adapter caseEngineeringModelDataDiscussionItem(EngineeringModelDataDiscussionItem object) {
				return createEngineeringModelDataDiscussionItemAdapter();
			}
			@Override
			public Adapter caseDiscussionItem(DiscussionItem object) {
				return createDiscussionItemAdapter();
			}
			@Override
			public Adapter caseModellingAnnotationItem(ModellingAnnotationItem object) {
				return createModellingAnnotationItemAdapter();
			}
			@Override
			public Adapter caseApproval(Approval object) {
				return createApprovalAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseNote(Note object) {
				return createNoteAdapter();
			}
			@Override
			public Adapter caseBinaryNote(BinaryNote object) {
				return createBinaryNoteAdapter();
			}
			@Override
			public Adapter caseTextualNote(TextualNote object) {
				return createTextualNoteAdapter();
			}
			@Override
			public Adapter caseContractDeviation(ContractDeviation object) {
				return createContractDeviationAdapter();
			}
			@Override
			public Adapter caseRequestForWaiver(RequestForWaiver object) {
				return createRequestForWaiverAdapter();
			}
			@Override
			public Adapter caseRequestForDeviation(RequestForDeviation object) {
				return createRequestForDeviationAdapter();
			}
			@Override
			public Adapter caseChangeRequest(ChangeRequest object) {
				return createChangeRequestAdapter();
			}
			@Override
			public Adapter caseReviewItemDiscrepancy(ReviewItemDiscrepancy object) {
				return createReviewItemDiscrepancyAdapter();
			}
			@Override
			public Adapter caseSolution(Solution object) {
				return createSolutionAdapter();
			}
			@Override
			public Adapter caseActionItem(ActionItem object) {
				return createActionItemAdapter();
			}
			@Override
			public Adapter caseSiteDirectoryThingReference(SiteDirectoryThingReference object) {
				return createSiteDirectoryThingReferenceAdapter();
			}
			@Override
			public Adapter caseChangeProposal(ChangeProposal object) {
				return createChangeProposalAdapter();
			}
			@Override
			public Adapter caseContractChangeNotice(ContractChangeNotice object) {
				return createContractChangeNoticeAdapter();
			}
			@Override
			public Adapter caseSiteDirectoryDataDiscussionItem(SiteDirectoryDataDiscussionItem object) {
				return createSiteDirectoryDataDiscussionItemAdapter();
			}
			@Override
			public Adapter caseSiteDirectoryDataAnnotation(SiteDirectoryDataAnnotation object) {
				return createSiteDirectoryDataAnnotationAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter caseCategorizableThing(CategorizableThing object) {
				return createCategorizableThingAdapter();
			}
			@Override
			public Adapter caseNamedThing(NamedThing object) {
				return createNamedThingAdapter();
			}
			@Override
			public Adapter caseOwnedThing(OwnedThing object) {
				return createOwnedThingAdapter();
			}
			@Override
			public Adapter caseShortNamedThing(ShortNamedThing object) {
				return createShortNamedThingAdapter();
			}
			@Override
			public Adapter caseTimeStampedThing(TimeStampedThing object) {
				return createTimeStampedThingAdapter();
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
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.Book
	 * @generated
	 */
	public Adapter createBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.EngineeringModelDataNote <em>Engineering Model Data Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.EngineeringModelDataNote
	 * @generated
	 */
	public Adapter createEngineeringModelDataNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.EngineeringModelDataAnnotation <em>Engineering Model Data Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.EngineeringModelDataAnnotation
	 * @generated
	 */
	public Adapter createEngineeringModelDataAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.GenericAnnotation <em>Generic Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.GenericAnnotation
	 * @generated
	 */
	public Adapter createGenericAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ModellingThingReference <em>Modelling Thing Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ModellingThingReference
	 * @generated
	 */
	public Adapter createModellingThingReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ThingReference <em>Thing Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ThingReference
	 * @generated
	 */
	public Adapter createThingReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.EngineeringModelDataDiscussionItem <em>Engineering Model Data Discussion Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.EngineeringModelDataDiscussionItem
	 * @generated
	 */
	public Adapter createEngineeringModelDataDiscussionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.DiscussionItem <em>Discussion Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.DiscussionItem
	 * @generated
	 */
	public Adapter createDiscussionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ModellingAnnotationItem <em>Modelling Annotation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ModellingAnnotationItem
	 * @generated
	 */
	public Adapter createModellingAnnotationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.Approval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.Approval
	 * @generated
	 */
	public Adapter createApprovalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.BinaryNote <em>Binary Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.BinaryNote
	 * @generated
	 */
	public Adapter createBinaryNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.TextualNote <em>Textual Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.TextualNote
	 * @generated
	 */
	public Adapter createTextualNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ContractDeviation <em>Contract Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ContractDeviation
	 * @generated
	 */
	public Adapter createContractDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.RequestForWaiver <em>Request For Waiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.RequestForWaiver
	 * @generated
	 */
	public Adapter createRequestForWaiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.RequestForDeviation <em>Request For Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.RequestForDeviation
	 * @generated
	 */
	public Adapter createRequestForDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ChangeRequest
	 * @generated
	 */
	public Adapter createChangeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ReviewItemDiscrepancy <em>Review Item Discrepancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ReviewItemDiscrepancy
	 * @generated
	 */
	public Adapter createReviewItemDiscrepancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.Solution
	 * @generated
	 */
	public Adapter createSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ActionItem <em>Action Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ActionItem
	 * @generated
	 */
	public Adapter createActionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.SiteDirectoryThingReference <em>Site Directory Thing Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.SiteDirectoryThingReference
	 * @generated
	 */
	public Adapter createSiteDirectoryThingReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ChangeProposal <em>Change Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ChangeProposal
	 * @generated
	 */
	public Adapter createChangeProposalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.ContractChangeNotice <em>Contract Change Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.ContractChangeNotice
	 * @generated
	 */
	public Adapter createContractChangeNoticeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.SiteDirectoryDataDiscussionItem <em>Site Directory Data Discussion Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.SiteDirectoryDataDiscussionItem
	 * @generated
	 */
	public Adapter createSiteDirectoryDataDiscussionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.ReportingData.SiteDirectoryDataAnnotation <em>Site Directory Data Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.ReportingData.SiteDirectoryDataAnnotation
	 * @generated
	 */
	public Adapter createSiteDirectoryDataAnnotationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.OwnedThing <em>Owned Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.OwnedThing
	 * @generated
	 */
	public Adapter createOwnedThingAdapter() {
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

} //ReportingDataAdapterFactory
