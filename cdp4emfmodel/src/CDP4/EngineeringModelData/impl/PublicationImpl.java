/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.TimeStampedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.ParameterOrOverrideBase;
import CDP4.EngineeringModelData.Publication;

import CDP4.SiteDirectoryData.DomainOfExpertise;

import java.time.OffsetDateTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.PublicationImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.PublicationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.PublicationImpl#getPublishedParameter <em>Published Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicationImpl extends ThingImpl implements Publication {
	/**
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime CREATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime createdOn = CREATED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOfExpertise> domain;

	/**
	 * The cached value of the '{@link #getPublishedParameter() <em>Published Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterOrOverrideBase> publishedParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.PUBLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedOn(OffsetDateTime newCreatedOn) {
		OffsetDateTime oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PUBLICATION__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainOfExpertise> getDomain() {
		if (domain == null) {
			domain = new EObjectResolvingEList<DomainOfExpertise>(DomainOfExpertise.class, this, EngineeringModelDataPackage.PUBLICATION__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterOrOverrideBase> getPublishedParameter() {
		if (publishedParameter == null) {
			publishedParameter = new EObjectResolvingEList<ParameterOrOverrideBase>(ParameterOrOverrideBase.class, this, EngineeringModelDataPackage.PUBLICATION__PUBLISHED_PARAMETER);
		}
		return publishedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.PUBLICATION__CREATED_ON:
				return getCreatedOn();
			case EngineeringModelDataPackage.PUBLICATION__DOMAIN:
				return getDomain();
			case EngineeringModelDataPackage.PUBLICATION__PUBLISHED_PARAMETER:
				return getPublishedParameter();
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
			case EngineeringModelDataPackage.PUBLICATION__CREATED_ON:
				setCreatedOn((OffsetDateTime)newValue);
				return;
			case EngineeringModelDataPackage.PUBLICATION__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends DomainOfExpertise>)newValue);
				return;
			case EngineeringModelDataPackage.PUBLICATION__PUBLISHED_PARAMETER:
				getPublishedParameter().clear();
				getPublishedParameter().addAll((Collection<? extends ParameterOrOverrideBase>)newValue);
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
			case EngineeringModelDataPackage.PUBLICATION__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case EngineeringModelDataPackage.PUBLICATION__DOMAIN:
				getDomain().clear();
				return;
			case EngineeringModelDataPackage.PUBLICATION__PUBLISHED_PARAMETER:
				getPublishedParameter().clear();
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
			case EngineeringModelDataPackage.PUBLICATION__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case EngineeringModelDataPackage.PUBLICATION__DOMAIN:
				return domain != null && !domain.isEmpty();
			case EngineeringModelDataPackage.PUBLICATION__PUBLISHED_PARAMETER:
				return publishedParameter != null && !publishedParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TimeStampedThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.PUBLICATION__CREATED_ON: return CommonDataPackage.TIME_STAMPED_THING__CREATED_ON;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TimeStampedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.TIME_STAMPED_THING__CREATED_ON: return EngineeringModelDataPackage.PUBLICATION__CREATED_ON;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (createdOn: ");
		result.append(createdOn);
		result.append(')');
		return result.toString();
	}

} //PublicationImpl
