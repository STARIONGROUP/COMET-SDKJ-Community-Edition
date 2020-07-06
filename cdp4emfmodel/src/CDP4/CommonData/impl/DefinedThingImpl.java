/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.Alias;
import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.Definition;
import CDP4.CommonData.HyperLink;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;

import CDP4.CommonData.util.CommonDataValidator;

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
 * An implementation of the model object '<em><b>Defined Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.impl.DefinedThingImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.DefinedThingImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.DefinedThingImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.DefinedThingImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.DefinedThingImpl#getHyperLink <em>Hyper Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DefinedThingImpl extends ThingImpl implements DefinedThing {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<Alias> alias;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> definition;

	/**
	 * The cached value of the '{@link #getHyperLink() <em>Hyper Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperLink()
	 * @generated
	 * @ordered
	 */
	protected EList<HyperLink> hyperLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinedThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonDataPackage.Literals.DEFINED_THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.DEFINED_THING__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.DEFINED_THING__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alias> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<Alias>(Alias.class, this, CommonDataPackage.DEFINED_THING__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Definition> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<Definition>(Definition.class, this, CommonDataPackage.DEFINED_THING__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HyperLink> getHyperLink() {
		if (hyperLink == null) {
			hyperLink = new EObjectContainmentEList<HyperLink>(HyperLink.class, this, CommonDataPackage.DEFINED_THING__HYPER_LINK);
		}
		return hyperLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasOneDefinitionPerLanguage(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CommonDataValidator.DIAGNOSTIC_SOURCE,
						 CommonDataValidator.DEFINED_THING__HAS_ONE_DEFINITION_PER_LANGUAGE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasOneDefinitionPerLanguage", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean hasOneDefinitionPerLanguage1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CommonDataValidator.DIAGNOSTIC_SOURCE,
						 CommonDataValidator.DEFINED_THING__HAS_ONE_DEFINITION_PER_LANGUAGE1,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasOneDefinitionPerLanguage1", EObjectValidator.getObjectLabel(this, context) }),
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
			case CommonDataPackage.DEFINED_THING__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case CommonDataPackage.DEFINED_THING__DEFINITION:
				return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
			case CommonDataPackage.DEFINED_THING__HYPER_LINK:
				return ((InternalEList<?>)getHyperLink()).basicRemove(otherEnd, msgs);
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
			case CommonDataPackage.DEFINED_THING__NAME:
				return getName();
			case CommonDataPackage.DEFINED_THING__SHORT_NAME:
				return getShortName();
			case CommonDataPackage.DEFINED_THING__ALIAS:
				return getAlias();
			case CommonDataPackage.DEFINED_THING__DEFINITION:
				return getDefinition();
			case CommonDataPackage.DEFINED_THING__HYPER_LINK:
				return getHyperLink();
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
			case CommonDataPackage.DEFINED_THING__NAME:
				setName((String)newValue);
				return;
			case CommonDataPackage.DEFINED_THING__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case CommonDataPackage.DEFINED_THING__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends Alias>)newValue);
				return;
			case CommonDataPackage.DEFINED_THING__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Definition>)newValue);
				return;
			case CommonDataPackage.DEFINED_THING__HYPER_LINK:
				getHyperLink().clear();
				getHyperLink().addAll((Collection<? extends HyperLink>)newValue);
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
			case CommonDataPackage.DEFINED_THING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonDataPackage.DEFINED_THING__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case CommonDataPackage.DEFINED_THING__ALIAS:
				getAlias().clear();
				return;
			case CommonDataPackage.DEFINED_THING__DEFINITION:
				getDefinition().clear();
				return;
			case CommonDataPackage.DEFINED_THING__HYPER_LINK:
				getHyperLink().clear();
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
			case CommonDataPackage.DEFINED_THING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonDataPackage.DEFINED_THING__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case CommonDataPackage.DEFINED_THING__ALIAS:
				return alias != null && !alias.isEmpty();
			case CommonDataPackage.DEFINED_THING__DEFINITION:
				return definition != null && !definition.isEmpty();
			case CommonDataPackage.DEFINED_THING__HYPER_LINK:
				return hyperLink != null && !hyperLink.isEmpty();
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
		if (baseClass == NamedThing.class) {
			switch (derivedFeatureID) {
				case CommonDataPackage.DEFINED_THING__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (derivedFeatureID) {
				case CommonDataPackage.DEFINED_THING__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
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
		if (baseClass == NamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.NAMED_THING__NAME: return CommonDataPackage.DEFINED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return CommonDataPackage.DEFINED_THING__SHORT_NAME;
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
			case CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE__DIAGNOSTICCHAIN_MAP:
				return hasOneDefinitionPerLanguage((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CommonDataPackage.DEFINED_THING___HAS_ONE_DEFINITION_PER_LANGUAGE1__DIAGNOSTICCHAIN_MAP:
				return hasOneDefinitionPerLanguage1((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(')');
		return result.toString();
	}

} //DefinedThingImpl
