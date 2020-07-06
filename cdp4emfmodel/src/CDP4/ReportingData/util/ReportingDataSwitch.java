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
 * @see CDP4.ReportingData.ReportingDataPackage
 * @generated
 */
public class ReportingDataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReportingDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingDataSwitch() {
		if (modelPackage == null) {
			modelPackage = ReportingDataPackage.eINSTANCE;
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
			case ReportingDataPackage.BOOK: {
				Book book = (Book)theEObject;
				T result = caseBook(book);
				if (result == null) result = caseThing(book);
				if (result == null) result = caseCategorizableThing(book);
				if (result == null) result = caseNamedThing(book);
				if (result == null) result = caseOwnedThing(book);
				if (result == null) result = caseShortNamedThing(book);
				if (result == null) result = caseTimeStampedThing(book);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_NOTE: {
				EngineeringModelDataNote engineeringModelDataNote = (EngineeringModelDataNote)theEObject;
				T result = caseEngineeringModelDataNote(engineeringModelDataNote);
				if (result == null) result = caseEngineeringModelDataAnnotation(engineeringModelDataNote);
				if (result == null) result = caseGenericAnnotation(engineeringModelDataNote);
				if (result == null) result = caseThing(engineeringModelDataNote);
				if (result == null) result = caseAnnotation(engineeringModelDataNote);
				if (result == null) result = caseTimeStampedThing(engineeringModelDataNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION: {
				EngineeringModelDataAnnotation engineeringModelDataAnnotation = (EngineeringModelDataAnnotation)theEObject;
				T result = caseEngineeringModelDataAnnotation(engineeringModelDataAnnotation);
				if (result == null) result = caseGenericAnnotation(engineeringModelDataAnnotation);
				if (result == null) result = caseThing(engineeringModelDataAnnotation);
				if (result == null) result = caseAnnotation(engineeringModelDataAnnotation);
				if (result == null) result = caseTimeStampedThing(engineeringModelDataAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.GENERIC_ANNOTATION: {
				GenericAnnotation genericAnnotation = (GenericAnnotation)theEObject;
				T result = caseGenericAnnotation(genericAnnotation);
				if (result == null) result = caseThing(genericAnnotation);
				if (result == null) result = caseAnnotation(genericAnnotation);
				if (result == null) result = caseTimeStampedThing(genericAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.MODELLING_THING_REFERENCE: {
				ModellingThingReference modellingThingReference = (ModellingThingReference)theEObject;
				T result = caseModellingThingReference(modellingThingReference);
				if (result == null) result = caseThingReference(modellingThingReference);
				if (result == null) result = caseThing(modellingThingReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.THING_REFERENCE: {
				ThingReference thingReference = (ThingReference)theEObject;
				T result = caseThingReference(thingReference);
				if (result == null) result = caseThing(thingReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_DISCUSSION_ITEM: {
				EngineeringModelDataDiscussionItem engineeringModelDataDiscussionItem = (EngineeringModelDataDiscussionItem)theEObject;
				T result = caseEngineeringModelDataDiscussionItem(engineeringModelDataDiscussionItem);
				if (result == null) result = caseDiscussionItem(engineeringModelDataDiscussionItem);
				if (result == null) result = caseGenericAnnotation(engineeringModelDataDiscussionItem);
				if (result == null) result = caseThing(engineeringModelDataDiscussionItem);
				if (result == null) result = caseAnnotation(engineeringModelDataDiscussionItem);
				if (result == null) result = caseTimeStampedThing(engineeringModelDataDiscussionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.DISCUSSION_ITEM: {
				DiscussionItem discussionItem = (DiscussionItem)theEObject;
				T result = caseDiscussionItem(discussionItem);
				if (result == null) result = caseGenericAnnotation(discussionItem);
				if (result == null) result = caseThing(discussionItem);
				if (result == null) result = caseAnnotation(discussionItem);
				if (result == null) result = caseTimeStampedThing(discussionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.MODELLING_ANNOTATION_ITEM: {
				ModellingAnnotationItem modellingAnnotationItem = (ModellingAnnotationItem)theEObject;
				T result = caseModellingAnnotationItem(modellingAnnotationItem);
				if (result == null) result = caseEngineeringModelDataAnnotation(modellingAnnotationItem);
				if (result == null) result = caseCategorizableThing(modellingAnnotationItem);
				if (result == null) result = caseOwnedThing(modellingAnnotationItem);
				if (result == null) result = caseShortNamedThing(modellingAnnotationItem);
				if (result == null) result = caseGenericAnnotation(modellingAnnotationItem);
				if (result == null) result = caseThing(modellingAnnotationItem);
				if (result == null) result = caseAnnotation(modellingAnnotationItem);
				if (result == null) result = caseTimeStampedThing(modellingAnnotationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.APPROVAL: {
				Approval approval = (Approval)theEObject;
				T result = caseApproval(approval);
				if (result == null) result = caseGenericAnnotation(approval);
				if (result == null) result = caseOwnedThing(approval);
				if (result == null) result = caseThing(approval);
				if (result == null) result = caseAnnotation(approval);
				if (result == null) result = caseTimeStampedThing(approval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseThing(section);
				if (result == null) result = caseCategorizableThing(section);
				if (result == null) result = caseNamedThing(section);
				if (result == null) result = caseOwnedThing(section);
				if (result == null) result = caseShortNamedThing(section);
				if (result == null) result = caseTimeStampedThing(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseThing(page);
				if (result == null) result = caseCategorizableThing(page);
				if (result == null) result = caseNamedThing(page);
				if (result == null) result = caseOwnedThing(page);
				if (result == null) result = caseShortNamedThing(page);
				if (result == null) result = caseTimeStampedThing(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseThing(note);
				if (result == null) result = caseCategorizableThing(note);
				if (result == null) result = caseNamedThing(note);
				if (result == null) result = caseOwnedThing(note);
				if (result == null) result = caseShortNamedThing(note);
				if (result == null) result = caseTimeStampedThing(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.BINARY_NOTE: {
				BinaryNote binaryNote = (BinaryNote)theEObject;
				T result = caseBinaryNote(binaryNote);
				if (result == null) result = caseNote(binaryNote);
				if (result == null) result = caseThing(binaryNote);
				if (result == null) result = caseCategorizableThing(binaryNote);
				if (result == null) result = caseNamedThing(binaryNote);
				if (result == null) result = caseOwnedThing(binaryNote);
				if (result == null) result = caseShortNamedThing(binaryNote);
				if (result == null) result = caseTimeStampedThing(binaryNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.TEXTUAL_NOTE: {
				TextualNote textualNote = (TextualNote)theEObject;
				T result = caseTextualNote(textualNote);
				if (result == null) result = caseNote(textualNote);
				if (result == null) result = caseThing(textualNote);
				if (result == null) result = caseCategorizableThing(textualNote);
				if (result == null) result = caseNamedThing(textualNote);
				if (result == null) result = caseOwnedThing(textualNote);
				if (result == null) result = caseShortNamedThing(textualNote);
				if (result == null) result = caseTimeStampedThing(textualNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.CONTRACT_DEVIATION: {
				ContractDeviation contractDeviation = (ContractDeviation)theEObject;
				T result = caseContractDeviation(contractDeviation);
				if (result == null) result = caseModellingAnnotationItem(contractDeviation);
				if (result == null) result = caseEngineeringModelDataAnnotation(contractDeviation);
				if (result == null) result = caseCategorizableThing(contractDeviation);
				if (result == null) result = caseOwnedThing(contractDeviation);
				if (result == null) result = caseShortNamedThing(contractDeviation);
				if (result == null) result = caseGenericAnnotation(contractDeviation);
				if (result == null) result = caseThing(contractDeviation);
				if (result == null) result = caseAnnotation(contractDeviation);
				if (result == null) result = caseTimeStampedThing(contractDeviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.REQUEST_FOR_WAIVER: {
				RequestForWaiver requestForWaiver = (RequestForWaiver)theEObject;
				T result = caseRequestForWaiver(requestForWaiver);
				if (result == null) result = caseContractDeviation(requestForWaiver);
				if (result == null) result = caseModellingAnnotationItem(requestForWaiver);
				if (result == null) result = caseEngineeringModelDataAnnotation(requestForWaiver);
				if (result == null) result = caseCategorizableThing(requestForWaiver);
				if (result == null) result = caseOwnedThing(requestForWaiver);
				if (result == null) result = caseShortNamedThing(requestForWaiver);
				if (result == null) result = caseGenericAnnotation(requestForWaiver);
				if (result == null) result = caseThing(requestForWaiver);
				if (result == null) result = caseAnnotation(requestForWaiver);
				if (result == null) result = caseTimeStampedThing(requestForWaiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.REQUEST_FOR_DEVIATION: {
				RequestForDeviation requestForDeviation = (RequestForDeviation)theEObject;
				T result = caseRequestForDeviation(requestForDeviation);
				if (result == null) result = caseContractDeviation(requestForDeviation);
				if (result == null) result = caseModellingAnnotationItem(requestForDeviation);
				if (result == null) result = caseEngineeringModelDataAnnotation(requestForDeviation);
				if (result == null) result = caseCategorizableThing(requestForDeviation);
				if (result == null) result = caseOwnedThing(requestForDeviation);
				if (result == null) result = caseShortNamedThing(requestForDeviation);
				if (result == null) result = caseGenericAnnotation(requestForDeviation);
				if (result == null) result = caseThing(requestForDeviation);
				if (result == null) result = caseAnnotation(requestForDeviation);
				if (result == null) result = caseTimeStampedThing(requestForDeviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.CHANGE_REQUEST: {
				ChangeRequest changeRequest = (ChangeRequest)theEObject;
				T result = caseChangeRequest(changeRequest);
				if (result == null) result = caseContractDeviation(changeRequest);
				if (result == null) result = caseModellingAnnotationItem(changeRequest);
				if (result == null) result = caseEngineeringModelDataAnnotation(changeRequest);
				if (result == null) result = caseCategorizableThing(changeRequest);
				if (result == null) result = caseOwnedThing(changeRequest);
				if (result == null) result = caseShortNamedThing(changeRequest);
				if (result == null) result = caseGenericAnnotation(changeRequest);
				if (result == null) result = caseThing(changeRequest);
				if (result == null) result = caseAnnotation(changeRequest);
				if (result == null) result = caseTimeStampedThing(changeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.REVIEW_ITEM_DISCREPANCY: {
				ReviewItemDiscrepancy reviewItemDiscrepancy = (ReviewItemDiscrepancy)theEObject;
				T result = caseReviewItemDiscrepancy(reviewItemDiscrepancy);
				if (result == null) result = caseModellingAnnotationItem(reviewItemDiscrepancy);
				if (result == null) result = caseEngineeringModelDataAnnotation(reviewItemDiscrepancy);
				if (result == null) result = caseCategorizableThing(reviewItemDiscrepancy);
				if (result == null) result = caseOwnedThing(reviewItemDiscrepancy);
				if (result == null) result = caseShortNamedThing(reviewItemDiscrepancy);
				if (result == null) result = caseGenericAnnotation(reviewItemDiscrepancy);
				if (result == null) result = caseThing(reviewItemDiscrepancy);
				if (result == null) result = caseAnnotation(reviewItemDiscrepancy);
				if (result == null) result = caseTimeStampedThing(reviewItemDiscrepancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
				if (result == null) result = caseGenericAnnotation(solution);
				if (result == null) result = caseOwnedThing(solution);
				if (result == null) result = caseThing(solution);
				if (result == null) result = caseAnnotation(solution);
				if (result == null) result = caseTimeStampedThing(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.ACTION_ITEM: {
				ActionItem actionItem = (ActionItem)theEObject;
				T result = caseActionItem(actionItem);
				if (result == null) result = caseModellingAnnotationItem(actionItem);
				if (result == null) result = caseEngineeringModelDataAnnotation(actionItem);
				if (result == null) result = caseCategorizableThing(actionItem);
				if (result == null) result = caseOwnedThing(actionItem);
				if (result == null) result = caseShortNamedThing(actionItem);
				if (result == null) result = caseGenericAnnotation(actionItem);
				if (result == null) result = caseThing(actionItem);
				if (result == null) result = caseAnnotation(actionItem);
				if (result == null) result = caseTimeStampedThing(actionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.SITE_DIRECTORY_THING_REFERENCE: {
				SiteDirectoryThingReference siteDirectoryThingReference = (SiteDirectoryThingReference)theEObject;
				T result = caseSiteDirectoryThingReference(siteDirectoryThingReference);
				if (result == null) result = caseThingReference(siteDirectoryThingReference);
				if (result == null) result = caseThing(siteDirectoryThingReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.CHANGE_PROPOSAL: {
				ChangeProposal changeProposal = (ChangeProposal)theEObject;
				T result = caseChangeProposal(changeProposal);
				if (result == null) result = caseModellingAnnotationItem(changeProposal);
				if (result == null) result = caseEngineeringModelDataAnnotation(changeProposal);
				if (result == null) result = caseCategorizableThing(changeProposal);
				if (result == null) result = caseOwnedThing(changeProposal);
				if (result == null) result = caseShortNamedThing(changeProposal);
				if (result == null) result = caseGenericAnnotation(changeProposal);
				if (result == null) result = caseThing(changeProposal);
				if (result == null) result = caseAnnotation(changeProposal);
				if (result == null) result = caseTimeStampedThing(changeProposal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.CONTRACT_CHANGE_NOTICE: {
				ContractChangeNotice contractChangeNotice = (ContractChangeNotice)theEObject;
				T result = caseContractChangeNotice(contractChangeNotice);
				if (result == null) result = caseModellingAnnotationItem(contractChangeNotice);
				if (result == null) result = caseEngineeringModelDataAnnotation(contractChangeNotice);
				if (result == null) result = caseCategorizableThing(contractChangeNotice);
				if (result == null) result = caseOwnedThing(contractChangeNotice);
				if (result == null) result = caseShortNamedThing(contractChangeNotice);
				if (result == null) result = caseGenericAnnotation(contractChangeNotice);
				if (result == null) result = caseThing(contractChangeNotice);
				if (result == null) result = caseAnnotation(contractChangeNotice);
				if (result == null) result = caseTimeStampedThing(contractChangeNotice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.SITE_DIRECTORY_DATA_DISCUSSION_ITEM: {
				SiteDirectoryDataDiscussionItem siteDirectoryDataDiscussionItem = (SiteDirectoryDataDiscussionItem)theEObject;
				T result = caseSiteDirectoryDataDiscussionItem(siteDirectoryDataDiscussionItem);
				if (result == null) result = caseDiscussionItem(siteDirectoryDataDiscussionItem);
				if (result == null) result = caseGenericAnnotation(siteDirectoryDataDiscussionItem);
				if (result == null) result = caseThing(siteDirectoryDataDiscussionItem);
				if (result == null) result = caseAnnotation(siteDirectoryDataDiscussionItem);
				if (result == null) result = caseTimeStampedThing(siteDirectoryDataDiscussionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION: {
				SiteDirectoryDataAnnotation siteDirectoryDataAnnotation = (SiteDirectoryDataAnnotation)theEObject;
				T result = caseSiteDirectoryDataAnnotation(siteDirectoryDataAnnotation);
				if (result == null) result = caseGenericAnnotation(siteDirectoryDataAnnotation);
				if (result == null) result = caseThing(siteDirectoryDataAnnotation);
				if (result == null) result = caseAnnotation(siteDirectoryDataAnnotation);
				if (result == null) result = caseTimeStampedThing(siteDirectoryDataAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBook(Book object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Model Data Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Model Data Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringModelDataNote(EngineeringModelDataNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Model Data Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Model Data Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringModelDataAnnotation(EngineeringModelDataAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAnnotation(GenericAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelling Thing Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelling Thing Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModellingThingReference(ModellingThingReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThingReference(ThingReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Model Data Discussion Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Model Data Discussion Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringModelDataDiscussionItem(EngineeringModelDataDiscussionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discussion Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discussion Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscussionItem(DiscussionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelling Annotation Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelling Annotation Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModellingAnnotationItem(ModellingAnnotationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApproval(Approval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryNote(BinaryNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualNote(TextualNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractDeviation(ContractDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request For Waiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request For Waiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestForWaiver(RequestForWaiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request For Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request For Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestForDeviation(RequestForDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeRequest(ChangeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review Item Discrepancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review Item Discrepancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewItemDiscrepancy(ReviewItemDiscrepancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionItem(ActionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Directory Thing Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Directory Thing Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteDirectoryThingReference(SiteDirectoryThingReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Proposal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeProposal(ChangeProposal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Change Notice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Change Notice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractChangeNotice(ContractChangeNotice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Directory Data Discussion Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Directory Data Discussion Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteDirectoryDataDiscussionItem(SiteDirectoryDataDiscussionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site Directory Data Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site Directory Data Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiteDirectoryDataAnnotation(SiteDirectoryDataAnnotation object) {
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

} //ReportingDataSwitch
