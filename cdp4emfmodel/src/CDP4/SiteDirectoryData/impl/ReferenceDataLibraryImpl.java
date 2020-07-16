/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.Constant;
import CDP4.SiteDirectoryData.FileType;
import CDP4.SiteDirectoryData.Glossary;
import CDP4.SiteDirectoryData.MeasurementScale;
import CDP4.SiteDirectoryData.MeasurementUnit;
import CDP4.SiteDirectoryData.ParameterType;
import CDP4.SiteDirectoryData.QuantityKind;
import CDP4.SiteDirectoryData.ReferenceDataLibrary;
import CDP4.SiteDirectoryData.ReferenceSource;
import CDP4.SiteDirectoryData.Rule;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.SiteReferenceDataLibrary;
import CDP4.SiteDirectoryData.UnitPrefix;

import CDP4.SiteDirectoryData.util.SiteDirectoryDataValidator;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Data Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getDefinedCategory <em>Defined Category</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getBaseQuantityKind <em>Base Quantity Kind</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getUnitPrefix <em>Unit Prefix</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getReferenceSource <em>Reference Source</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getRequiredRdl <em>Required Rdl</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ReferenceDataLibraryImpl#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceDataLibraryImpl extends DefinedThingImpl implements ReferenceDataLibrary {
	/**
	 * The cached value of the '{@link #getDefinedCategory() <em>Defined Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> definedCategory;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> parameterType;

	/**
	 * The cached value of the '{@link #getBaseQuantityKind() <em>Base Quantity Kind</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQuantityKind()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityKind> baseQuantityKind;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementScale> scale;

	/**
	 * The cached value of the '{@link #getUnitPrefix() <em>Unit Prefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrefix()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitPrefix> unitPrefix;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementUnit> unit;

	/**
	 * The cached value of the '{@link #getBaseUnit() <em>Base Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementUnit> baseUnit;

	/**
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected EList<FileType> fileType;

	/**
	 * The cached value of the '{@link #getGlossary() <em>Glossary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossary()
	 * @generated
	 * @ordered
	 */
	protected EList<Glossary> glossary;

	/**
	 * The cached value of the '{@link #getReferenceSource() <em>Reference Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceSource> referenceSource;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * The cached value of the '{@link #getRequiredRdl() <em>Required Rdl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRdl()
	 * @generated
	 * @ordered
	 */
	protected SiteReferenceDataLibrary requiredRdl;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceDataLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.REFERENCE_DATA_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getDefinedCategory() {
		if (definedCategory == null) {
			definedCategory = new EObjectContainmentEList<Category>(Category.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY);
		}
		return definedCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterType> getParameterType() {
		if (parameterType == null) {
			parameterType = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__PARAMETER_TYPE);
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantityKind> getBaseQuantityKind() {
		if (baseQuantityKind == null) {
			baseQuantityKind = new EObjectResolvingEList<QuantityKind>(QuantityKind.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND);
		}
		return baseQuantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementScale> getScale() {
		if (scale == null) {
			scale = new EObjectContainmentEList<MeasurementScale>(MeasurementScale.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__SCALE);
		}
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitPrefix> getUnitPrefix() {
		if (unitPrefix == null) {
			unitPrefix = new EObjectContainmentEList<UnitPrefix>(UnitPrefix.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT_PREFIX);
		}
		return unitPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementUnit> getUnit() {
		if (unit == null) {
			unit = new EObjectContainmentEList<MeasurementUnit>(MeasurementUnit.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT);
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementUnit> getBaseUnit() {
		if (baseUnit == null) {
			baseUnit = new EObjectResolvingEList<MeasurementUnit>(MeasurementUnit.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_UNIT);
		}
		return baseUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileType> getFileType() {
		if (fileType == null) {
			fileType = new EObjectContainmentEList<FileType>(FileType.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__FILE_TYPE);
		}
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Glossary> getGlossary() {
		if (glossary == null) {
			glossary = new EObjectContainmentEList<Glossary>(Glossary.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__GLOSSARY);
		}
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceSource> getReferenceSource() {
		if (referenceSource == null) {
			referenceSource = new EObjectContainmentEList<ReferenceSource>(ReferenceSource.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE);
		}
		return referenceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<Rule>(Rule.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteReferenceDataLibrary getRequiredRdl() {
		if (requiredRdl != null && requiredRdl.eIsProxy()) {
			InternalEObject oldRequiredRdl = (InternalEObject)requiredRdl;
			requiredRdl = (SiteReferenceDataLibrary)eResolveProxy(oldRequiredRdl);
			if (requiredRdl != oldRequiredRdl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REQUIRED_RDL, oldRequiredRdl, requiredRdl));
			}
		}
		return requiredRdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteReferenceDataLibrary basicGetRequiredRdl() {
		return requiredRdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRdl(SiteReferenceDataLibrary newRequiredRdl) {
		SiteReferenceDataLibrary oldRequiredRdl = requiredRdl;
		requiredRdl = newRequiredRdl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REQUIRED_RDL, oldRequiredRdl, requiredRdl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constant> getConstant() {
		if (constant == null) {
			constant = new EObjectContainmentEList<Constant>(Constant.class, this, SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasUniqueParameterTypeNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SiteDirectoryDataValidator.REFERENCE_DATA_LIBRARY__HAS_UNIQUE_PARAMETER_TYPE_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasUniqueParameterTypeNames", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean hasUniqueParameterTypeShortNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SiteDirectoryDataValidator.REFERENCE_DATA_LIBRARY__HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasUniqueParameterTypeShortNames", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean hasUniqueCategoryNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SiteDirectoryDataValidator.REFERENCE_DATA_LIBRARY__HAS_UNIQUE_CATEGORY_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasUniqueCategoryNames", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean hasUniqueCategoryShortNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 SiteDirectoryDataValidator.REFERENCE_DATA_LIBRARY__HAS_UNIQUE_CATEGORY_SHORT_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasUniqueCategoryShortNames", EObjectValidator.getObjectLabel(this, context) }),
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
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY:
				return ((InternalEList<?>)getDefinedCategory()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__PARAMETER_TYPE:
				return ((InternalEList<?>)getParameterType()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__SCALE:
				return ((InternalEList<?>)getScale()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT_PREFIX:
				return ((InternalEList<?>)getUnitPrefix()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT:
				return ((InternalEList<?>)getUnit()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__FILE_TYPE:
				return ((InternalEList<?>)getFileType()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__GLOSSARY:
				return ((InternalEList<?>)getGlossary()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE:
				return ((InternalEList<?>)getReferenceSource()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__CONSTANT:
				return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
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
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY:
				return getDefinedCategory();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__PARAMETER_TYPE:
				return getParameterType();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND:
				return getBaseQuantityKind();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__SCALE:
				return getScale();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT_PREFIX:
				return getUnitPrefix();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT:
				return getUnit();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_UNIT:
				return getBaseUnit();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__FILE_TYPE:
				return getFileType();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__GLOSSARY:
				return getGlossary();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE:
				return getReferenceSource();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__RULE:
				return getRule();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REQUIRED_RDL:
				if (resolve) return getRequiredRdl();
				return basicGetRequiredRdl();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__CONSTANT:
				return getConstant();
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
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY:
				getDefinedCategory().clear();
				getDefinedCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__PARAMETER_TYPE:
				getParameterType().clear();
				getParameterType().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND:
				getBaseQuantityKind().clear();
				getBaseQuantityKind().addAll((Collection<? extends QuantityKind>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__SCALE:
				getScale().clear();
				getScale().addAll((Collection<? extends MeasurementScale>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT_PREFIX:
				getUnitPrefix().clear();
				getUnitPrefix().addAll((Collection<? extends UnitPrefix>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT:
				getUnit().clear();
				getUnit().addAll((Collection<? extends MeasurementUnit>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_UNIT:
				getBaseUnit().clear();
				getBaseUnit().addAll((Collection<? extends MeasurementUnit>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__FILE_TYPE:
				getFileType().clear();
				getFileType().addAll((Collection<? extends FileType>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__GLOSSARY:
				getGlossary().clear();
				getGlossary().addAll((Collection<? extends Glossary>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE:
				getReferenceSource().clear();
				getReferenceSource().addAll((Collection<? extends ReferenceSource>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Rule>)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REQUIRED_RDL:
				setRequiredRdl((SiteReferenceDataLibrary)newValue);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Constant>)newValue);
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
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY:
				getDefinedCategory().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__PARAMETER_TYPE:
				getParameterType().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND:
				getBaseQuantityKind().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__SCALE:
				getScale().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT_PREFIX:
				getUnitPrefix().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT:
				getUnit().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_UNIT:
				getBaseUnit().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__FILE_TYPE:
				getFileType().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__GLOSSARY:
				getGlossary().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE:
				getReferenceSource().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__RULE:
				getRule().clear();
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REQUIRED_RDL:
				setRequiredRdl((SiteReferenceDataLibrary)null);
				return;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__CONSTANT:
				getConstant().clear();
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
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__DEFINED_CATEGORY:
				return definedCategory != null && !definedCategory.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__PARAMETER_TYPE:
				return parameterType != null && !parameterType.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_QUANTITY_KIND:
				return baseQuantityKind != null && !baseQuantityKind.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__SCALE:
				return scale != null && !scale.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT_PREFIX:
				return unitPrefix != null && !unitPrefix.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__UNIT:
				return unit != null && !unit.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__BASE_UNIT:
				return baseUnit != null && !baseUnit.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__FILE_TYPE:
				return fileType != null && !fileType.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__GLOSSARY:
				return glossary != null && !glossary.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REFERENCE_SOURCE:
				return referenceSource != null && !referenceSource.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__RULE:
				return rule != null && !rule.isEmpty();
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__REQUIRED_RDL:
				return requiredRdl != null;
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY__CONSTANT:
				return constant != null && !constant.isEmpty();
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
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_NAMES__DIAGNOSTICCHAIN_MAP:
				return hasUniqueParameterTypeNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY___HAS_UNIQUE_PARAMETER_TYPE_SHORT_NAMES__DIAGNOSTICCHAIN_MAP:
				return hasUniqueParameterTypeShortNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_NAMES__DIAGNOSTICCHAIN_MAP:
				return hasUniqueCategoryNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SiteDirectoryDataPackage.REFERENCE_DATA_LIBRARY___HAS_UNIQUE_CATEGORY_SHORT_NAMES__DIAGNOSTICCHAIN_MAP:
				return hasUniqueCategoryShortNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReferenceDataLibraryImpl
