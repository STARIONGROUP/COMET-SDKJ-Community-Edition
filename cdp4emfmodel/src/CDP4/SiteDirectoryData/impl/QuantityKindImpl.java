/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.QuantityKind;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.QuantityKindImpl#getPossibleScale <em>Possible Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.QuantityKindImpl#getDefaultScale <em>Default Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.QuantityKindImpl#getAllPossibleScale <em>All Possible Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.QuantityKindImpl#getQuantityDimensionSymbol <em>Quantity Dimension Symbol</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.QuantityKindImpl#getQuantityDimensionExponent <em>Quantity Dimension Exponent</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.QuantityKindImpl#getQuantityDimensionExpression <em>Quantity Dimension Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuantityKindImpl extends ScalarParameterTypeImpl implements QuantityKind {
	/**
	 * The cached value of the '{@link #getPossibleScale() <em>Possible Scale</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleScale()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementScale> possibleScale;

	/**
	 * The cached value of the '{@link #getDefaultScale() <em>Default Scale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultScale()
	 * @generated
	 * @ordered
	 */
	protected MeasurementScale defaultScale;

	/**
	 * The default value of the '{@link #getQuantityDimensionSymbol() <em>Quantity Dimension Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityDimensionSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_DIMENSION_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityDimensionSymbol() <em>Quantity Dimension Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityDimensionSymbol()
	 * @generated
	 * @ordered
	 */
	protected String quantityDimensionSymbol = QUANTITY_DIMENSION_SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuantityDimensionExponent() <em>Quantity Dimension Exponent</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityDimensionExponent()
	 * @generated
	 * @ordered
	 */
	protected EList<String> quantityDimensionExponent;

	/**
	 * The default value of the '{@link #getQuantityDimensionExpression() <em>Quantity Dimension Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityDimensionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_DIMENSION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityDimensionExpression() <em>Quantity Dimension Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityDimensionExpression()
	 * @generated
	 * @ordered
	 */
	protected String quantityDimensionExpression = QUANTITY_DIMENSION_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.QUANTITY_KIND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementScale> getPossibleScale() {
		if (possibleScale == null) {
			possibleScale = new EObjectResolvingEList<MeasurementScale>(MeasurementScale.class, this, SiteDirectoryDataPackage.QUANTITY_KIND__POSSIBLE_SCALE);
		}
		return possibleScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementScale getDefaultScale() {
		if (defaultScale != null && defaultScale.eIsProxy()) {
			InternalEObject oldDefaultScale = (InternalEObject)defaultScale;
			defaultScale = (MeasurementScale)eResolveProxy(oldDefaultScale);
			if (defaultScale != oldDefaultScale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.QUANTITY_KIND__DEFAULT_SCALE, oldDefaultScale, defaultScale));
			}
		}
		return defaultScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementScale basicGetDefaultScale() {
		return defaultScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultScale(MeasurementScale newDefaultScale) {
		MeasurementScale oldDefaultScale = defaultScale;
		defaultScale = newDefaultScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.QUANTITY_KIND__DEFAULT_SCALE, oldDefaultScale, defaultScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementScale> getAllPossibleScale() {
		// TODO: implement this method to return the 'All Possible Scale' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantityDimensionSymbol() {
		return quantityDimensionSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityDimensionSymbol(String newQuantityDimensionSymbol) {
		String oldQuantityDimensionSymbol = quantityDimensionSymbol;
		quantityDimensionSymbol = newQuantityDimensionSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL, oldQuantityDimensionSymbol, quantityDimensionSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getQuantityDimensionExponent() {
		if (quantityDimensionExponent == null) {
			quantityDimensionExponent = new EDataTypeEList<String>(String.class, this, SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT);
		}
		return quantityDimensionExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantityDimensionExpression() {
		return quantityDimensionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityDimensionExpression(String newQuantityDimensionExpression) {
		String oldQuantityDimensionExpression = quantityDimensionExpression;
		quantityDimensionExpression = newQuantityDimensionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION, oldQuantityDimensionExpression, quantityDimensionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.QUANTITY_KIND__POSSIBLE_SCALE:
				return getPossibleScale();
			case SiteDirectoryDataPackage.QUANTITY_KIND__DEFAULT_SCALE:
				if (resolve) return getDefaultScale();
				return basicGetDefaultScale();
			case SiteDirectoryDataPackage.QUANTITY_KIND__ALL_POSSIBLE_SCALE:
				return getAllPossibleScale();
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL:
				return getQuantityDimensionSymbol();
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT:
				return getQuantityDimensionExponent();
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION:
				return getQuantityDimensionExpression();
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
			case SiteDirectoryDataPackage.QUANTITY_KIND__POSSIBLE_SCALE:
				getPossibleScale().clear();
				getPossibleScale().addAll((Collection<? extends MeasurementScale>)newValue);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__DEFAULT_SCALE:
				setDefaultScale((MeasurementScale)newValue);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__ALL_POSSIBLE_SCALE:
				getAllPossibleScale().clear();
				getAllPossibleScale().addAll((Collection<? extends MeasurementScale>)newValue);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL:
				setQuantityDimensionSymbol((String)newValue);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT:
				getQuantityDimensionExponent().clear();
				getQuantityDimensionExponent().addAll((Collection<? extends String>)newValue);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION:
				setQuantityDimensionExpression((String)newValue);
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
			case SiteDirectoryDataPackage.QUANTITY_KIND__POSSIBLE_SCALE:
				getPossibleScale().clear();
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__DEFAULT_SCALE:
				setDefaultScale((MeasurementScale)null);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__ALL_POSSIBLE_SCALE:
				getAllPossibleScale().clear();
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL:
				setQuantityDimensionSymbol(QUANTITY_DIMENSION_SYMBOL_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT:
				getQuantityDimensionExponent().clear();
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION:
				setQuantityDimensionExpression(QUANTITY_DIMENSION_EXPRESSION_EDEFAULT);
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
			case SiteDirectoryDataPackage.QUANTITY_KIND__POSSIBLE_SCALE:
				return possibleScale != null && !possibleScale.isEmpty();
			case SiteDirectoryDataPackage.QUANTITY_KIND__DEFAULT_SCALE:
				return defaultScale != null;
			case SiteDirectoryDataPackage.QUANTITY_KIND__ALL_POSSIBLE_SCALE:
				return !getAllPossibleScale().isEmpty();
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_SYMBOL:
				return QUANTITY_DIMENSION_SYMBOL_EDEFAULT == null ? quantityDimensionSymbol != null : !QUANTITY_DIMENSION_SYMBOL_EDEFAULT.equals(quantityDimensionSymbol);
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPONENT:
				return quantityDimensionExponent != null && !quantityDimensionExponent.isEmpty();
			case SiteDirectoryDataPackage.QUANTITY_KIND__QUANTITY_DIMENSION_EXPRESSION:
				return QUANTITY_DIMENSION_EXPRESSION_EDEFAULT == null ? quantityDimensionExpression != null : !QUANTITY_DIMENSION_EXPRESSION_EDEFAULT.equals(quantityDimensionExpression);
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
		result.append(" (quantityDimensionSymbol: ");
		result.append(quantityDimensionSymbol);
		result.append(", quantityDimensionExponent: ");
		result.append(quantityDimensionExponent);
		result.append(", quantityDimensionExpression: ");
		result.append(quantityDimensionExpression);
		result.append(')');
		return result.toString();
	}

} //QuantityKindImpl
