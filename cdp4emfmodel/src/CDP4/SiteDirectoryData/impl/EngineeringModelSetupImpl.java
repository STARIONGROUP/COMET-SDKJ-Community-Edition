/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.EngineeringModelKind;
import CDP4.SiteDirectoryData.EngineeringModelSetup;
import CDP4.SiteDirectoryData.IterationSetup;
import CDP4.SiteDirectoryData.ModelReferenceDataLibrary;
import CDP4.SiteDirectoryData.Participant;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.StudyPhaseKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineering Model Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl#getActiveDomain <em>Active Domain</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl#getStudyPhase <em>Study Phase</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl#getRequiredRdl <em>Required Rdl</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl#getEngineeringModelIid <em>Engineering Model Iid</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl#getIterationSetup <em>Iteration Setup</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EngineeringModelSetupImpl#getSourceEngineeringModelSetupIid <em>Source Engineering Model Setup Iid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineeringModelSetupImpl extends DefinedThingImpl implements EngineeringModelSetup {
	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participant;

	/**
	 * The cached value of the '{@link #getActiveDomain() <em>Active Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOfExpertise> activeDomain;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final EngineeringModelKind KIND_EDEFAULT = EngineeringModelKind.STUDY_MODEL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected EngineeringModelKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudyPhase() <em>Study Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPhase()
	 * @generated
	 * @ordered
	 */
	protected static final StudyPhaseKind STUDY_PHASE_EDEFAULT = StudyPhaseKind.PREPARATION_PHASE;

	/**
	 * The cached value of the '{@link #getStudyPhase() <em>Study Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPhase()
	 * @generated
	 * @ordered
	 */
	protected StudyPhaseKind studyPhase = STUDY_PHASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredRdl() <em>Required Rdl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRdl()
	 * @generated
	 * @ordered
	 */
	protected ModelReferenceDataLibrary requiredRdl;

	/**
	 * The default value of the '{@link #getEngineeringModelIid() <em>Engineering Model Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineeringModelIid()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINEERING_MODEL_IID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineeringModelIid() <em>Engineering Model Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineeringModelIid()
	 * @generated
	 * @ordered
	 */
	protected String engineeringModelIid = ENGINEERING_MODEL_IID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIterationSetup() <em>Iteration Setup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationSetup()
	 * @generated
	 * @ordered
	 */
	protected EList<IterationSetup> iterationSetup;

	/**
	 * The default value of the '{@link #getSourceEngineeringModelSetupIid() <em>Source Engineering Model Setup Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEngineeringModelSetupIid()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ENGINEERING_MODEL_SETUP_IID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceEngineeringModelSetupIid() <em>Source Engineering Model Setup Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEngineeringModelSetupIid()
	 * @generated
	 * @ordered
	 */
	protected String sourceEngineeringModelSetupIid = SOURCE_ENGINEERING_MODEL_SETUP_IID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeringModelSetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.ENGINEERING_MODEL_SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<Participant>(Participant.class, this, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainOfExpertise> getActiveDomain() {
		if (activeDomain == null) {
			activeDomain = new EObjectResolvingEList<DomainOfExpertise>(DomainOfExpertise.class, this, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ACTIVE_DOMAIN);
		}
		return activeDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(EngineeringModelKind newKind) {
		EngineeringModelKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPhaseKind getStudyPhase() {
		return studyPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyPhase(StudyPhaseKind newStudyPhase) {
		StudyPhaseKind oldStudyPhase = studyPhase;
		studyPhase = newStudyPhase == null ? STUDY_PHASE_EDEFAULT : newStudyPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__STUDY_PHASE, oldStudyPhase, studyPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReferenceDataLibrary getRequiredRdl() {
		return requiredRdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredRdl(ModelReferenceDataLibrary newRequiredRdl, NotificationChain msgs) {
		ModelReferenceDataLibrary oldRequiredRdl = requiredRdl;
		requiredRdl = newRequiredRdl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL, oldRequiredRdl, newRequiredRdl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRdl(ModelReferenceDataLibrary newRequiredRdl) {
		if (newRequiredRdl != requiredRdl) {
			NotificationChain msgs = null;
			if (requiredRdl != null)
				msgs = ((InternalEObject)requiredRdl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL, null, msgs);
			if (newRequiredRdl != null)
				msgs = ((InternalEObject)newRequiredRdl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL, null, msgs);
			msgs = basicSetRequiredRdl(newRequiredRdl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL, newRequiredRdl, newRequiredRdl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineeringModelIid() {
		return engineeringModelIid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineeringModelIid(String newEngineeringModelIid) {
		String oldEngineeringModelIid = engineeringModelIid;
		engineeringModelIid = newEngineeringModelIid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ENGINEERING_MODEL_IID, oldEngineeringModelIid, engineeringModelIid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IterationSetup> getIterationSetup() {
		if (iterationSetup == null) {
			iterationSetup = new EObjectContainmentEList<IterationSetup>(IterationSetup.class, this, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ITERATION_SETUP);
		}
		return iterationSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceEngineeringModelSetupIid() {
		return sourceEngineeringModelSetupIid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEngineeringModelSetupIid(String newSourceEngineeringModelSetupIid) {
		String oldSourceEngineeringModelSetupIid = sourceEngineeringModelSetupIid;
		sourceEngineeringModelSetupIid = newSourceEngineeringModelSetupIid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__SOURCE_ENGINEERING_MODEL_SETUP_IID, oldSourceEngineeringModelSetupIid, sourceEngineeringModelSetupIid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL:
				return basicSetRequiredRdl(null, msgs);
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ITERATION_SETUP:
				return ((InternalEList<?>)getIterationSetup()).basicRemove(otherEnd, msgs);
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
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__PARTICIPANT:
				return getParticipant();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ACTIVE_DOMAIN:
				return getActiveDomain();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__KIND:
				return getKind();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__STUDY_PHASE:
				return getStudyPhase();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL:
				return getRequiredRdl();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ENGINEERING_MODEL_IID:
				return getEngineeringModelIid();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ITERATION_SETUP:
				return getIterationSetup();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__SOURCE_ENGINEERING_MODEL_SETUP_IID:
				return getSourceEngineeringModelSetupIid();
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
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant>)newValue);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ACTIVE_DOMAIN:
				getActiveDomain().clear();
				getActiveDomain().addAll((Collection<? extends DomainOfExpertise>)newValue);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__KIND:
				setKind((EngineeringModelKind)newValue);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__STUDY_PHASE:
				setStudyPhase((StudyPhaseKind)newValue);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL:
				setRequiredRdl((ModelReferenceDataLibrary)newValue);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ENGINEERING_MODEL_IID:
				setEngineeringModelIid((String)newValue);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ITERATION_SETUP:
				getIterationSetup().clear();
				getIterationSetup().addAll((Collection<? extends IterationSetup>)newValue);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__SOURCE_ENGINEERING_MODEL_SETUP_IID:
				setSourceEngineeringModelSetupIid((String)newValue);
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
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__PARTICIPANT:
				getParticipant().clear();
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ACTIVE_DOMAIN:
				getActiveDomain().clear();
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__STUDY_PHASE:
				setStudyPhase(STUDY_PHASE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL:
				setRequiredRdl((ModelReferenceDataLibrary)null);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ENGINEERING_MODEL_IID:
				setEngineeringModelIid(ENGINEERING_MODEL_IID_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ITERATION_SETUP:
				getIterationSetup().clear();
				return;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__SOURCE_ENGINEERING_MODEL_SETUP_IID:
				setSourceEngineeringModelSetupIid(SOURCE_ENGINEERING_MODEL_SETUP_IID_EDEFAULT);
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
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ACTIVE_DOMAIN:
				return activeDomain != null && !activeDomain.isEmpty();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__KIND:
				return kind != KIND_EDEFAULT;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__STUDY_PHASE:
				return studyPhase != STUDY_PHASE_EDEFAULT;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__REQUIRED_RDL:
				return requiredRdl != null;
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ENGINEERING_MODEL_IID:
				return ENGINEERING_MODEL_IID_EDEFAULT == null ? engineeringModelIid != null : !ENGINEERING_MODEL_IID_EDEFAULT.equals(engineeringModelIid);
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__ITERATION_SETUP:
				return iterationSetup != null && !iterationSetup.isEmpty();
			case SiteDirectoryDataPackage.ENGINEERING_MODEL_SETUP__SOURCE_ENGINEERING_MODEL_SETUP_IID:
				return SOURCE_ENGINEERING_MODEL_SETUP_IID_EDEFAULT == null ? sourceEngineeringModelSetupIid != null : !SOURCE_ENGINEERING_MODEL_SETUP_IID_EDEFAULT.equals(sourceEngineeringModelSetupIid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", studyPhase: ");
		result.append(studyPhase);
		result.append(", engineeringModelIid: ");
		result.append(engineeringModelIid);
		result.append(", sourceEngineeringModelSetupIid: ");
		result.append(sourceEngineeringModelSetupIid);
		result.append(')');
		return result.toString();
	}

} //EngineeringModelSetupImpl
