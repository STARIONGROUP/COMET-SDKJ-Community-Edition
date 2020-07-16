/**
 */
package CDP4.ReportingData.impl;

import CDP4.ReportingData.EngineeringModelDataAnnotation;
import CDP4.ReportingData.EngineeringModelDataDiscussionItem;
import CDP4.ReportingData.ModellingThingReference;
import CDP4.ReportingData.ReportingDataPackage;

import CDP4.SiteDirectoryData.Participant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineering Model Data Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.EngineeringModelDataAnnotationImpl#getRelatedThing <em>Related Thing</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.EngineeringModelDataAnnotationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.EngineeringModelDataAnnotationImpl#getPrimaryAnnotatedThing <em>Primary Annotated Thing</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.EngineeringModelDataAnnotationImpl#getDiscussion <em>Discussion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EngineeringModelDataAnnotationImpl extends GenericAnnotationImpl implements EngineeringModelDataAnnotation {
	/**
	 * The cached value of the '{@link #getRelatedThing() <em>Related Thing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedThing()
	 * @generated
	 * @ordered
	 */
	protected EList<ModellingThingReference> relatedThing;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Participant author;

	/**
	 * The cached value of the '{@link #getPrimaryAnnotatedThing() <em>Primary Annotated Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryAnnotatedThing()
	 * @generated
	 * @ordered
	 */
	protected ModellingThingReference primaryAnnotatedThing;

	/**
	 * The cached value of the '{@link #getDiscussion() <em>Discussion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussion()
	 * @generated
	 * @ordered
	 */
	protected EList<EngineeringModelDataDiscussionItem> discussion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeringModelDataAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.ENGINEERING_MODEL_DATA_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModellingThingReference> getRelatedThing() {
		if (relatedThing == null) {
			relatedThing = new EObjectContainmentEList<ModellingThingReference>(ModellingThingReference.class, this, ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING);
		}
		return relatedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Participant)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Participant newAuthor) {
		Participant oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModellingThingReference getPrimaryAnnotatedThing() {
		if (primaryAnnotatedThing != null && primaryAnnotatedThing.eIsProxy()) {
			InternalEObject oldPrimaryAnnotatedThing = (InternalEObject)primaryAnnotatedThing;
			primaryAnnotatedThing = (ModellingThingReference)eResolveProxy(oldPrimaryAnnotatedThing);
			if (primaryAnnotatedThing != oldPrimaryAnnotatedThing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING, oldPrimaryAnnotatedThing, primaryAnnotatedThing));
			}
		}
		return primaryAnnotatedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModellingThingReference basicGetPrimaryAnnotatedThing() {
		return primaryAnnotatedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryAnnotatedThing(ModellingThingReference newPrimaryAnnotatedThing) {
		ModellingThingReference oldPrimaryAnnotatedThing = primaryAnnotatedThing;
		primaryAnnotatedThing = newPrimaryAnnotatedThing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING, oldPrimaryAnnotatedThing, primaryAnnotatedThing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EngineeringModelDataDiscussionItem> getDiscussion() {
		if (discussion == null) {
			discussion = new EObjectContainmentEList<EngineeringModelDataDiscussionItem>(EngineeringModelDataDiscussionItem.class, this, ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION);
		}
		return discussion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING:
				return ((InternalEList<?>)getRelatedThing()).basicRemove(otherEnd, msgs);
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION:
				return ((InternalEList<?>)getDiscussion()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING:
				return getRelatedThing();
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING:
				if (resolve) return getPrimaryAnnotatedThing();
				return basicGetPrimaryAnnotatedThing();
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION:
				return getDiscussion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING:
				getRelatedThing().clear();
				getRelatedThing().addAll((Collection<? extends ModellingThingReference>)newValue);
				return;
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR:
				setAuthor((Participant)newValue);
				return;
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING:
				setPrimaryAnnotatedThing((ModellingThingReference)newValue);
				return;
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION:
				getDiscussion().clear();
				getDiscussion().addAll((Collection<? extends EngineeringModelDataDiscussionItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING:
				getRelatedThing().clear();
				return;
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR:
				setAuthor((Participant)null);
				return;
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING:
				setPrimaryAnnotatedThing((ModellingThingReference)null);
				return;
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION:
				getDiscussion().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__RELATED_THING:
				return relatedThing != null && !relatedThing.isEmpty();
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__AUTHOR:
				return author != null;
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING:
				return primaryAnnotatedThing != null;
			case ReportingDataPackage.ENGINEERING_MODEL_DATA_ANNOTATION__DISCUSSION:
				return discussion != null && !discussion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EngineeringModelDataAnnotationImpl
