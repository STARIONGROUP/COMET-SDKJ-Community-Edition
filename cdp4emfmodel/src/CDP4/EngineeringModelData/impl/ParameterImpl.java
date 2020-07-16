/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.Parameter;
import CDP4.EngineeringModelData.ParameterValueSet;

import CDP4.EngineeringModelData.util.EngineeringModelDataValidator;

import CDP4.SiteDirectoryData.DomainOfExpertise;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterImpl#getRequestedBy <em>Requested By</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterImpl#getAllowDifferentOwnerOfOverride <em>Allow Different Owner Of Override</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterImpl#getExpectsOverride <em>Expects Override</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends ParameterOrOverrideBaseImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getRequestedBy() <em>Requested By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedBy()
	 * @generated
	 * @ordered
	 */
	protected DomainOfExpertise requestedBy;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValueSet> valueSet;

	/**
	 * The default value of the '{@link #getAllowDifferentOwnerOfOverride() <em>Allow Different Owner Of Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDifferentOwnerOfOverride()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_DIFFERENT_OWNER_OF_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowDifferentOwnerOfOverride() <em>Allow Different Owner Of Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDifferentOwnerOfOverride()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowDifferentOwnerOfOverride = ALLOW_DIFFERENT_OWNER_OF_OVERRIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectsOverride() <em>Expects Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectsOverride()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPECTS_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectsOverride() <em>Expects Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectsOverride()
	 * @generated
	 * @ordered
	 */
	protected Boolean expectsOverride = EXPECTS_OVERRIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise getRequestedBy() {
		if (requestedBy != null && requestedBy.eIsProxy()) {
			InternalEObject oldRequestedBy = (InternalEObject)requestedBy;
			requestedBy = (DomainOfExpertise)eResolveProxy(oldRequestedBy);
			if (requestedBy != oldRequestedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER__REQUESTED_BY, oldRequestedBy, requestedBy));
			}
		}
		return requestedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise basicGetRequestedBy() {
		return requestedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedBy(DomainOfExpertise newRequestedBy) {
		DomainOfExpertise oldRequestedBy = requestedBy;
		requestedBy = newRequestedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER__REQUESTED_BY, oldRequestedBy, requestedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValueSet> getValueSet() {
		if (valueSet == null) {
			valueSet = new EObjectContainmentEList<ParameterValueSet>(ParameterValueSet.class, this, EngineeringModelDataPackage.PARAMETER__VALUE_SET);
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowDifferentOwnerOfOverride() {
		return allowDifferentOwnerOfOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDifferentOwnerOfOverride(Boolean newAllowDifferentOwnerOfOverride) {
		Boolean oldAllowDifferentOwnerOfOverride = allowDifferentOwnerOfOverride;
		allowDifferentOwnerOfOverride = newAllowDifferentOwnerOfOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER__ALLOW_DIFFERENT_OWNER_OF_OVERRIDE, oldAllowDifferentOwnerOfOverride, allowDifferentOwnerOfOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExpectsOverride() {
		return expectsOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectsOverride(Boolean newExpectsOverride) {
		Boolean oldExpectsOverride = expectsOverride;
		expectsOverride = newExpectsOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER__EXPECTS_OVERRIDE, oldExpectsOverride, expectsOverride));
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
						 EngineeringModelDataValidator.DIAGNOSTIC_SOURCE,
						 EngineeringModelDataValidator.PARAMETER__HAS_VALID_SCALE,
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.PARAMETER__VALUE_SET:
				return ((InternalEList<?>)getValueSet()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.PARAMETER__REQUESTED_BY:
				if (resolve) return getRequestedBy();
				return basicGetRequestedBy();
			case EngineeringModelDataPackage.PARAMETER__VALUE_SET:
				return getValueSet();
			case EngineeringModelDataPackage.PARAMETER__ALLOW_DIFFERENT_OWNER_OF_OVERRIDE:
				return getAllowDifferentOwnerOfOverride();
			case EngineeringModelDataPackage.PARAMETER__EXPECTS_OVERRIDE:
				return getExpectsOverride();
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
			case EngineeringModelDataPackage.PARAMETER__REQUESTED_BY:
				setRequestedBy((DomainOfExpertise)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER__VALUE_SET:
				getValueSet().clear();
				getValueSet().addAll((Collection<? extends ParameterValueSet>)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER__ALLOW_DIFFERENT_OWNER_OF_OVERRIDE:
				setAllowDifferentOwnerOfOverride((Boolean)newValue);
				return;
			case EngineeringModelDataPackage.PARAMETER__EXPECTS_OVERRIDE:
				setExpectsOverride((Boolean)newValue);
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
			case EngineeringModelDataPackage.PARAMETER__REQUESTED_BY:
				setRequestedBy((DomainOfExpertise)null);
				return;
			case EngineeringModelDataPackage.PARAMETER__VALUE_SET:
				getValueSet().clear();
				return;
			case EngineeringModelDataPackage.PARAMETER__ALLOW_DIFFERENT_OWNER_OF_OVERRIDE:
				setAllowDifferentOwnerOfOverride(ALLOW_DIFFERENT_OWNER_OF_OVERRIDE_EDEFAULT);
				return;
			case EngineeringModelDataPackage.PARAMETER__EXPECTS_OVERRIDE:
				setExpectsOverride(EXPECTS_OVERRIDE_EDEFAULT);
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
			case EngineeringModelDataPackage.PARAMETER__REQUESTED_BY:
				return requestedBy != null;
			case EngineeringModelDataPackage.PARAMETER__VALUE_SET:
				return valueSet != null && !valueSet.isEmpty();
			case EngineeringModelDataPackage.PARAMETER__ALLOW_DIFFERENT_OWNER_OF_OVERRIDE:
				return ALLOW_DIFFERENT_OWNER_OF_OVERRIDE_EDEFAULT == null ? allowDifferentOwnerOfOverride != null : !ALLOW_DIFFERENT_OWNER_OF_OVERRIDE_EDEFAULT.equals(allowDifferentOwnerOfOverride);
			case EngineeringModelDataPackage.PARAMETER__EXPECTS_OVERRIDE:
				return EXPECTS_OVERRIDE_EDEFAULT == null ? expectsOverride != null : !EXPECTS_OVERRIDE_EDEFAULT.equals(expectsOverride);
		}
		return super.eIsSet(featureID);
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
			case EngineeringModelDataPackage.PARAMETER___HAS_VALID_SCALE__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (allowDifferentOwnerOfOverride: ");
		result.append(allowDifferentOwnerOfOverride);
		result.append(", expectsOverride: ");
		result.append(expectsOverride);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
