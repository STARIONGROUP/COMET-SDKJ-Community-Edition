/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.ShortNamedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.ParameterType;
import CDP4.SiteDirectoryData.ParameterTypeComponent;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import CDP4.SiteDirectoryData.util.SiteDirectoryDataValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParameterTypeComponentImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParameterTypeComponentImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParameterTypeComponentImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterTypeComponentImpl extends ThingImpl implements ParameterTypeComponent {
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
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType parameterType;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected MeasurementScale scale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterTypeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.PARAMETER_TYPE_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getParameterType() {
		if (parameterType != null && parameterType.eIsProxy()) {
			InternalEObject oldParameterType = (InternalEObject)parameterType;
			parameterType = (ParameterType)eResolveProxy(oldParameterType);
			if (parameterType != oldParameterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE, oldParameterType, parameterType));
			}
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType basicGetParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(ParameterType newParameterType) {
		ParameterType oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementScale getScale() {
		if (scale != null && scale.eIsProxy()) {
			InternalEObject oldScale = (InternalEObject)scale;
			scale = (MeasurementScale)eResolveProxy(oldScale);
			if (scale != oldScale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SCALE, oldScale, scale));
			}
		}
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementScale basicGetScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(MeasurementScale newScale) {
		MeasurementScale oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasValidScale(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SiteDirectoryDataValidator.DIAGNOSTIC_SOURCE,
						 SiteDirectoryDataValidator.PARAMETER_TYPE_COMPONENT__HAS_VALID_SCALE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasValidScale", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SHORT_NAME:
				return getShortName();
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SCALE:
				if (resolve) return getScale();
				return basicGetScale();
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
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE:
				setParameterType((ParameterType)newValue);
				return;
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SCALE:
				setScale((MeasurementScale)newValue);
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
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE:
				setParameterType((ParameterType)null);
				return;
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SCALE:
				setScale((MeasurementScale)null);
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
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__PARAMETER_TYPE:
				return parameterType != null;
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SCALE:
				return scale != null;
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
				case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
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
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT__SHORT_NAME;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SiteDirectoryDataPackage.PARAMETER_TYPE_COMPONENT___HAS_VALID_SCALE__DIAGNOSTICCHAIN_MAP:
				return hasValidScale((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //ParameterTypeComponentImpl
