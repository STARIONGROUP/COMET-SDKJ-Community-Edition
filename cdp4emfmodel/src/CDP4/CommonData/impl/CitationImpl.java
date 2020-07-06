/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.Citation;
import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.ShortNamedThing;

import CDP4.SiteDirectoryData.ReferenceSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.impl.CitationImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.CitationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.CitationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.CitationImpl#getIsAdaptation <em>Is Adaptation</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.CitationImpl#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationImpl extends ThingImpl implements Citation {
	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ReferenceSource source;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsAdaptation() <em>Is Adaptation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAdaptation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ADAPTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAdaptation() <em>Is Adaptation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAdaptation()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAdaptation = IS_ADAPTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected String remark = REMARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonDataPackage.Literals.CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.CITATION__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ReferenceSource)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonDataPackage.CITATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSource basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ReferenceSource newSource) {
		ReferenceSource oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.CITATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.CITATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAdaptation() {
		return isAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAdaptation(Boolean newIsAdaptation) {
		Boolean oldIsAdaptation = isAdaptation;
		isAdaptation = newIsAdaptation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.CITATION__IS_ADAPTATION, oldIsAdaptation, isAdaptation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemark(String newRemark) {
		String oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.CITATION__REMARK, oldRemark, remark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonDataPackage.CITATION__SHORT_NAME:
				return getShortName();
			case CommonDataPackage.CITATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CommonDataPackage.CITATION__LOCATION:
				return getLocation();
			case CommonDataPackage.CITATION__IS_ADAPTATION:
				return getIsAdaptation();
			case CommonDataPackage.CITATION__REMARK:
				return getRemark();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonDataPackage.CITATION__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case CommonDataPackage.CITATION__SOURCE:
				setSource((ReferenceSource)newValue);
				return;
			case CommonDataPackage.CITATION__LOCATION:
				setLocation((String)newValue);
				return;
			case CommonDataPackage.CITATION__IS_ADAPTATION:
				setIsAdaptation((Boolean)newValue);
				return;
			case CommonDataPackage.CITATION__REMARK:
				setRemark((String)newValue);
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
			case CommonDataPackage.CITATION__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case CommonDataPackage.CITATION__SOURCE:
				setSource((ReferenceSource)null);
				return;
			case CommonDataPackage.CITATION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case CommonDataPackage.CITATION__IS_ADAPTATION:
				setIsAdaptation(IS_ADAPTATION_EDEFAULT);
				return;
			case CommonDataPackage.CITATION__REMARK:
				setRemark(REMARK_EDEFAULT);
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
			case CommonDataPackage.CITATION__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case CommonDataPackage.CITATION__SOURCE:
				return source != null;
			case CommonDataPackage.CITATION__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case CommonDataPackage.CITATION__IS_ADAPTATION:
				return IS_ADAPTATION_EDEFAULT == null ? isAdaptation != null : !IS_ADAPTATION_EDEFAULT.equals(isAdaptation);
			case CommonDataPackage.CITATION__REMARK:
				return REMARK_EDEFAULT == null ? remark != null : !REMARK_EDEFAULT.equals(remark);
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
		if (baseClass == ShortNamedThing.class) {
			switch (derivedFeatureID) {
				case CommonDataPackage.CITATION__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
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
		if (baseClass == ShortNamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return CommonDataPackage.CITATION__SHORT_NAME;
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
		result.append(" (shortName: ");
		result.append(shortName);
		result.append(", location: ");
		result.append(location);
		result.append(", isAdaptation: ");
		result.append(isAdaptation);
		result.append(", remark: ");
		result.append(remark);
		result.append(')');
		return result.toString();
	}

} //CitationImpl
