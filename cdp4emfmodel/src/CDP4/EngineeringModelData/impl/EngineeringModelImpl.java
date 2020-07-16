/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.TopContainerImpl;

import CDP4.EngineeringModelData.CommonFileStore;
import CDP4.EngineeringModelData.EngineeringModel;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.Iteration;
import CDP4.EngineeringModelData.ModelLogEntry;

import CDP4.ReportingData.Book;
import CDP4.ReportingData.EngineeringModelDataNote;
import CDP4.ReportingData.ModellingAnnotationItem;

import CDP4.SiteDirectoryData.EngineeringModelSetup;

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
 * An implementation of the model object '<em><b>Engineering Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl#getEngineeringModelSetup <em>Engineering Model Setup</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl#getCommonFileStore <em>Common File Store</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl#getLogEntry <em>Log Entry</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl#getBook <em>Book</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl#getGenericNote <em>Generic Note</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.EngineeringModelImpl#getModellingAnnotation <em>Modelling Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineeringModelImpl extends TopContainerImpl implements EngineeringModel {
	/**
	 * The cached value of the '{@link #getEngineeringModelSetup() <em>Engineering Model Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineeringModelSetup()
	 * @generated
	 * @ordered
	 */
	protected EngineeringModelSetup engineeringModelSetup;

	/**
	 * The cached value of the '{@link #getCommonFileStore() <em>Common File Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonFileStore()
	 * @generated
	 * @ordered
	 */
	protected CommonFileStore commonFileStore;

	/**
	 * The cached value of the '{@link #getLogEntry() <em>Log Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelLogEntry> logEntry;

	/**
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected EList<Iteration> iteration;

	/**
	 * The cached value of the '{@link #getBook() <em>Book</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBook()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> book;

	/**
	 * The cached value of the '{@link #getGenericNote() <em>Generic Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericNote()
	 * @generated
	 * @ordered
	 */
	protected EList<EngineeringModelDataNote> genericNote;

	/**
	 * The cached value of the '{@link #getModellingAnnotation() <em>Modelling Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModellingAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<ModellingAnnotationItem> modellingAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeringModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.ENGINEERING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelSetup getEngineeringModelSetup() {
		if (engineeringModelSetup != null && engineeringModelSetup.eIsProxy()) {
			InternalEObject oldEngineeringModelSetup = (InternalEObject)engineeringModelSetup;
			engineeringModelSetup = (EngineeringModelSetup)eResolveProxy(oldEngineeringModelSetup);
			if (engineeringModelSetup != oldEngineeringModelSetup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP, oldEngineeringModelSetup, engineeringModelSetup));
			}
		}
		return engineeringModelSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelSetup basicGetEngineeringModelSetup() {
		return engineeringModelSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineeringModelSetup(EngineeringModelSetup newEngineeringModelSetup) {
		EngineeringModelSetup oldEngineeringModelSetup = engineeringModelSetup;
		engineeringModelSetup = newEngineeringModelSetup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP, oldEngineeringModelSetup, engineeringModelSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFileStore getCommonFileStore() {
		return commonFileStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommonFileStore(CommonFileStore newCommonFileStore, NotificationChain msgs) {
		CommonFileStore oldCommonFileStore = commonFileStore;
		commonFileStore = newCommonFileStore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE, oldCommonFileStore, newCommonFileStore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonFileStore(CommonFileStore newCommonFileStore) {
		if (newCommonFileStore != commonFileStore) {
			NotificationChain msgs = null;
			if (commonFileStore != null)
				msgs = ((InternalEObject)commonFileStore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE, null, msgs);
			if (newCommonFileStore != null)
				msgs = ((InternalEObject)newCommonFileStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE, null, msgs);
			msgs = basicSetCommonFileStore(newCommonFileStore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE, newCommonFileStore, newCommonFileStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelLogEntry> getLogEntry() {
		if (logEntry == null) {
			logEntry = new EObjectContainmentEList<ModelLogEntry>(ModelLogEntry.class, this, EngineeringModelDataPackage.ENGINEERING_MODEL__LOG_ENTRY);
		}
		return logEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iteration> getIteration() {
		if (iteration == null) {
			iteration = new EObjectContainmentEList<Iteration>(Iteration.class, this, EngineeringModelDataPackage.ENGINEERING_MODEL__ITERATION);
		}
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBook() {
		if (book == null) {
			book = new EObjectContainmentEList<Book>(Book.class, this, EngineeringModelDataPackage.ENGINEERING_MODEL__BOOK);
		}
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EngineeringModelDataNote> getGenericNote() {
		if (genericNote == null) {
			genericNote = new EObjectContainmentEList<EngineeringModelDataNote>(EngineeringModelDataNote.class, this, EngineeringModelDataPackage.ENGINEERING_MODEL__GENERIC_NOTE);
		}
		return genericNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModellingAnnotationItem> getModellingAnnotation() {
		if (modellingAnnotation == null) {
			modellingAnnotation = new EObjectContainmentEList<ModellingAnnotationItem>(ModellingAnnotationItem.class, this, EngineeringModelDataPackage.ENGINEERING_MODEL__MODELLING_ANNOTATION);
		}
		return modellingAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE:
				return basicSetCommonFileStore(null, msgs);
			case EngineeringModelDataPackage.ENGINEERING_MODEL__LOG_ENTRY:
				return ((InternalEList<?>)getLogEntry()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ITERATION:
				return ((InternalEList<?>)getIteration()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ENGINEERING_MODEL__BOOK:
				return ((InternalEList<?>)getBook()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ENGINEERING_MODEL__GENERIC_NOTE:
				return ((InternalEList<?>)getGenericNote()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ENGINEERING_MODEL__MODELLING_ANNOTATION:
				return ((InternalEList<?>)getModellingAnnotation()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP:
				if (resolve) return getEngineeringModelSetup();
				return basicGetEngineeringModelSetup();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE:
				return getCommonFileStore();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__LOG_ENTRY:
				return getLogEntry();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ITERATION:
				return getIteration();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__BOOK:
				return getBook();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__GENERIC_NOTE:
				return getGenericNote();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__MODELLING_ANNOTATION:
				return getModellingAnnotation();
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
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP:
				setEngineeringModelSetup((EngineeringModelSetup)newValue);
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE:
				setCommonFileStore((CommonFileStore)newValue);
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__LOG_ENTRY:
				getLogEntry().clear();
				getLogEntry().addAll((Collection<? extends ModelLogEntry>)newValue);
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ITERATION:
				getIteration().clear();
				getIteration().addAll((Collection<? extends Iteration>)newValue);
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__BOOK:
				getBook().clear();
				getBook().addAll((Collection<? extends Book>)newValue);
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__GENERIC_NOTE:
				getGenericNote().clear();
				getGenericNote().addAll((Collection<? extends EngineeringModelDataNote>)newValue);
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__MODELLING_ANNOTATION:
				getModellingAnnotation().clear();
				getModellingAnnotation().addAll((Collection<? extends ModellingAnnotationItem>)newValue);
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
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP:
				setEngineeringModelSetup((EngineeringModelSetup)null);
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE:
				setCommonFileStore((CommonFileStore)null);
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__LOG_ENTRY:
				getLogEntry().clear();
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ITERATION:
				getIteration().clear();
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__BOOK:
				getBook().clear();
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__GENERIC_NOTE:
				getGenericNote().clear();
				return;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__MODELLING_ANNOTATION:
				getModellingAnnotation().clear();
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
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ENGINEERING_MODEL_SETUP:
				return engineeringModelSetup != null;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__COMMON_FILE_STORE:
				return commonFileStore != null;
			case EngineeringModelDataPackage.ENGINEERING_MODEL__LOG_ENTRY:
				return logEntry != null && !logEntry.isEmpty();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__ITERATION:
				return iteration != null && !iteration.isEmpty();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__BOOK:
				return book != null && !book.isEmpty();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__GENERIC_NOTE:
				return genericNote != null && !genericNote.isEmpty();
			case EngineeringModelDataPackage.ENGINEERING_MODEL__MODELLING_ANNOTATION:
				return modellingAnnotation != null && !modellingAnnotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EngineeringModelImpl
