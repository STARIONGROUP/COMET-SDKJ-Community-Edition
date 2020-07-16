/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.ArrayParameterType;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import CDP4.SiteDirectoryData.util.SiteDirectoryDataValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ArrayParameterTypeImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ArrayParameterTypeImpl#getIsTensor <em>Is Tensor</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ArrayParameterTypeImpl#getHasSingleComponentType <em>Has Single Component Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ArrayParameterTypeImpl#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayParameterTypeImpl extends CompoundParameterTypeImpl implements ArrayParameterType {
	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dimension;

	/**
	 * The default value of the '{@link #getIsTensor() <em>Is Tensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTensor()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TENSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTensor() <em>Is Tensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTensor()
	 * @generated
	 * @ordered
	 */
	protected Boolean isTensor = IS_TENSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasSingleComponentType() <em>Has Single Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSingleComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_SINGLE_COMPONENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasSingleComponentType() <em>Has Single Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSingleComponentType()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasSingleComponentType = HAS_SINGLE_COMPONENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RANK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected Integer rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.ARRAY_PARAMETER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDimension() {
		if (dimension == null) {
			dimension = new EDataTypeEList<Integer>(Integer.class, this, SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTensor() {
		return isTensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTensor(Boolean newIsTensor) {
		Boolean oldIsTensor = isTensor;
		isTensor = newIsTensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__IS_TENSOR, oldIsTensor, isTensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasSingleComponentType() {
		return hasSingleComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSingleComponentType(Boolean newHasSingleComponentType) {
		Boolean oldHasSingleComponentType = hasSingleComponentType;
		hasSingleComponentType = newHasSingleComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__HAS_SINGLE_COMPONENT_TYPE, oldHasSingleComponentType, hasSingleComponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(Integer newRank) {
		Integer oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasValidNumberOfComponents(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SiteDirectoryDataValidator.ARRAY_PARAMETER_TYPE__HAS_VALID_NUMBER_OF_COMPONENTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasValidNumberOfComponents", EObjectValidator.getObjectLabel(this, context) }),
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
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__DIMENSION:
				return getDimension();
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__IS_TENSOR:
				return getIsTensor();
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__HAS_SINGLE_COMPONENT_TYPE:
				return getHasSingleComponentType();
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__RANK:
				return getRank();
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
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends Integer>)newValue);
				return;
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__IS_TENSOR:
				setIsTensor((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__HAS_SINGLE_COMPONENT_TYPE:
				setHasSingleComponentType((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__RANK:
				setRank((Integer)newValue);
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
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__DIMENSION:
				getDimension().clear();
				return;
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__IS_TENSOR:
				setIsTensor(IS_TENSOR_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__HAS_SINGLE_COMPONENT_TYPE:
				setHasSingleComponentType(HAS_SINGLE_COMPONENT_TYPE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__RANK:
				setRank(RANK_EDEFAULT);
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
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__DIMENSION:
				return dimension != null && !dimension.isEmpty();
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__IS_TENSOR:
				return IS_TENSOR_EDEFAULT == null ? isTensor != null : !IS_TENSOR_EDEFAULT.equals(isTensor);
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__HAS_SINGLE_COMPONENT_TYPE:
				return HAS_SINGLE_COMPONENT_TYPE_EDEFAULT == null ? hasSingleComponentType != null : !HAS_SINGLE_COMPONENT_TYPE_EDEFAULT.equals(hasSingleComponentType);
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE__RANK:
				return RANK_EDEFAULT == null ? rank != null : !RANK_EDEFAULT.equals(rank);
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
			case SiteDirectoryDataPackage.ARRAY_PARAMETER_TYPE___HAS_VALID_NUMBER_OF_COMPONENTS__DIAGNOSTICCHAIN_MAP:
				return hasValidNumberOfComponents((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (dimension: ");
		result.append(dimension);
		result.append(", isTensor: ");
		result.append(isTensor);
		result.append(", hasSingleComponentType: ");
		result.append(hasSingleComponentType);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //ArrayParameterTypeImpl
