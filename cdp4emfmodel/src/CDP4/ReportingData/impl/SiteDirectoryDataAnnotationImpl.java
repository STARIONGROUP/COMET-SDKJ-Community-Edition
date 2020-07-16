/**
 */
package CDP4.ReportingData.impl;

import CDP4.ReportingData.ReportingDataPackage;
import CDP4.ReportingData.SiteDirectoryDataAnnotation;
import CDP4.ReportingData.SiteDirectoryDataDiscussionItem;
import CDP4.ReportingData.SiteDirectoryThingReference;

import CDP4.SiteDirectoryData.Person;

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
 * An implementation of the model object '<em><b>Site Directory Data Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.SiteDirectoryDataAnnotationImpl#getRelatedThing <em>Related Thing</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.SiteDirectoryDataAnnotationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.SiteDirectoryDataAnnotationImpl#getPrimaryAnnotatedThing <em>Primary Annotated Thing</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.SiteDirectoryDataAnnotationImpl#getDiscussion <em>Discussion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteDirectoryDataAnnotationImpl extends GenericAnnotationImpl implements SiteDirectoryDataAnnotation {
	/**
	 * The cached value of the '{@link #getRelatedThing() <em>Related Thing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedThing()
	 * @generated
	 * @ordered
	 */
	protected EList<SiteDirectoryThingReference> relatedThing;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Person author;

	/**
	 * The cached value of the '{@link #getPrimaryAnnotatedThing() <em>Primary Annotated Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryAnnotatedThing()
	 * @generated
	 * @ordered
	 */
	protected SiteDirectoryThingReference primaryAnnotatedThing;

	/**
	 * The cached value of the '{@link #getDiscussion() <em>Discussion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussion()
	 * @generated
	 * @ordered
	 */
	protected EList<SiteDirectoryDataDiscussionItem> discussion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteDirectoryDataAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.SITE_DIRECTORY_DATA_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiteDirectoryThingReference> getRelatedThing() {
		if (relatedThing == null) {
			relatedThing = new EObjectContainmentEList<SiteDirectoryThingReference>(SiteDirectoryThingReference.class, this, ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING);
		}
		return relatedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Person)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Person newAuthor) {
		Person oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryThingReference getPrimaryAnnotatedThing() {
		if (primaryAnnotatedThing != null && primaryAnnotatedThing.eIsProxy()) {
			InternalEObject oldPrimaryAnnotatedThing = (InternalEObject)primaryAnnotatedThing;
			primaryAnnotatedThing = (SiteDirectoryThingReference)eResolveProxy(oldPrimaryAnnotatedThing);
			if (primaryAnnotatedThing != oldPrimaryAnnotatedThing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING, oldPrimaryAnnotatedThing, primaryAnnotatedThing));
			}
		}
		return primaryAnnotatedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteDirectoryThingReference basicGetPrimaryAnnotatedThing() {
		return primaryAnnotatedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryAnnotatedThing(SiteDirectoryThingReference newPrimaryAnnotatedThing) {
		SiteDirectoryThingReference oldPrimaryAnnotatedThing = primaryAnnotatedThing;
		primaryAnnotatedThing = newPrimaryAnnotatedThing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING, oldPrimaryAnnotatedThing, primaryAnnotatedThing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiteDirectoryDataDiscussionItem> getDiscussion() {
		if (discussion == null) {
			discussion = new EObjectContainmentEList<SiteDirectoryDataDiscussionItem>(SiteDirectoryDataDiscussionItem.class, this, ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION);
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
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING:
				return ((InternalEList<?>)getRelatedThing()).basicRemove(otherEnd, msgs);
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION:
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
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING:
				return getRelatedThing();
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING:
				if (resolve) return getPrimaryAnnotatedThing();
				return basicGetPrimaryAnnotatedThing();
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION:
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
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING:
				getRelatedThing().clear();
				getRelatedThing().addAll((Collection<? extends SiteDirectoryThingReference>)newValue);
				return;
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR:
				setAuthor((Person)newValue);
				return;
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING:
				setPrimaryAnnotatedThing((SiteDirectoryThingReference)newValue);
				return;
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION:
				getDiscussion().clear();
				getDiscussion().addAll((Collection<? extends SiteDirectoryDataDiscussionItem>)newValue);
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
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING:
				getRelatedThing().clear();
				return;
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR:
				setAuthor((Person)null);
				return;
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING:
				setPrimaryAnnotatedThing((SiteDirectoryThingReference)null);
				return;
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION:
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
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__RELATED_THING:
				return relatedThing != null && !relatedThing.isEmpty();
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__AUTHOR:
				return author != null;
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__PRIMARY_ANNOTATED_THING:
				return primaryAnnotatedThing != null;
			case ReportingDataPackage.SITE_DIRECTORY_DATA_ANNOTATION__DISCUSSION:
				return discussion != null && !discussion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiteDirectoryDataAnnotationImpl
