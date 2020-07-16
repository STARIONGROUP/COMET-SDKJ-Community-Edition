/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.RelationalExpression;
import CDP4.EngineeringModelData.RelationalOperatorKind;

import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.ParameterType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.RelationalExpressionImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.RelationalExpressionImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.RelationalExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.RelationalExpressionImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationalExpressionImpl extends BooleanExpressionImpl implements RelationalExpression {
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
	 * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOperatorKind RELATIONAL_OPERATOR_EDEFAULT = RelationalOperatorKind.EQ;

	/**
	 * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperatorKind relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

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
	protected RelationalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.RELATIONAL_EXPRESSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.RELATIONAL_EXPRESSION__PARAMETER_TYPE, oldParameterType, parameterType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.RELATIONAL_EXPRESSION__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperatorKind getRelationalOperator() {
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationalOperator(RelationalOperatorKind newRelationalOperator) {
		RelationalOperatorKind oldRelationalOperator = relationalOperator;
		relationalOperator = newRelationalOperator == null ? RELATIONAL_OPERATOR_EDEFAULT : newRelationalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR, oldRelationalOperator, relationalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValue() {
		if (value == null) {
			value = new EDataTypeEList<String>(String.class, this, EngineeringModelDataPackage.RELATIONAL_EXPRESSION__VALUE);
		}
		return value;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.RELATIONAL_EXPRESSION__SCALE, oldScale, scale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.RELATIONAL_EXPRESSION__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				return getRelationalOperator();
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__VALUE:
				return getValue();
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__SCALE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__PARAMETER_TYPE:
				setParameterType((ParameterType)newValue);
				return;
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				setRelationalOperator((RelationalOperatorKind)newValue);
				return;
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends String>)newValue);
				return;
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__SCALE:
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
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__PARAMETER_TYPE:
				setParameterType((ParameterType)null);
				return;
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				setRelationalOperator(RELATIONAL_OPERATOR_EDEFAULT);
				return;
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__VALUE:
				getValue().clear();
				return;
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__SCALE:
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
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__PARAMETER_TYPE:
				return parameterType != null;
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				return relationalOperator != RELATIONAL_OPERATOR_EDEFAULT;
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__VALUE:
				return value != null && !value.isEmpty();
			case EngineeringModelDataPackage.RELATIONAL_EXPRESSION__SCALE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (relationalOperator: ");
		result.append(relationalOperator);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //RelationalExpressionImpl
