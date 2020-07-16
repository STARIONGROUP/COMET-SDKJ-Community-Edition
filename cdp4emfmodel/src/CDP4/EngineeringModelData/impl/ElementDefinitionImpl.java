/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.ElementDefinition;
import CDP4.EngineeringModelData.ElementUsage;
import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.NestedElement;
import CDP4.EngineeringModelData.Parameter;
import CDP4.EngineeringModelData.ParameterGroup;

import CDP4.EngineeringModelData.util.EngineeringModelDataValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ElementDefinitionImpl#getContainedElement <em>Contained Element</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ElementDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ElementDefinitionImpl#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.ElementDefinitionImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionImpl extends ElementBaseImpl implements ElementDefinition {
	/**
	 * The cached value of the '{@link #getContainedElement() <em>Contained Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementUsage> containedElement;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getParameterGroup() <em>Parameter Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterGroup> parameterGroup;

	/**
	 * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NestedElement> referencedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.ELEMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementUsage> getContainedElement() {
		if (containedElement == null) {
			containedElement = new EObjectContainmentEList<ElementUsage>(ElementUsage.class, this, EngineeringModelDataPackage.ELEMENT_DEFINITION__CONTAINED_ELEMENT);
		}
		return containedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterGroup> getParameterGroup() {
		if (parameterGroup == null) {
			parameterGroup = new EObjectContainmentEList<ParameterGroup>(ParameterGroup.class, this, EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER_GROUP);
		}
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NestedElement> getReferencedElement() {
		if (referencedElement == null) {
			referencedElement = new EObjectResolvingEList<NestedElement>(NestedElement.class, this, EngineeringModelDataPackage.ELEMENT_DEFINITION__REFERENCED_ELEMENT);
		}
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasUniqueParameterNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 EngineeringModelDataValidator.ELEMENT_DEFINITION__HAS_UNIQUE_PARAMETER_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasUniqueParameterNames", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean hasUniqueParameterShortNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 EngineeringModelDataValidator.ELEMENT_DEFINITION__HAS_UNIQUE_PARAMETER_SHORT_NAMES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasUniqueParameterShortNames", EObjectValidator.getObjectLabel(this, context) }),
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
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__CONTAINED_ELEMENT:
				return ((InternalEList<?>)getContainedElement()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER_GROUP:
				return ((InternalEList<?>)getParameterGroup()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__CONTAINED_ELEMENT:
				return getContainedElement();
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER:
				return getParameter();
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER_GROUP:
				return getParameterGroup();
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__REFERENCED_ELEMENT:
				return getReferencedElement();
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
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__CONTAINED_ELEMENT:
				getContainedElement().clear();
				getContainedElement().addAll((Collection<? extends ElementUsage>)newValue);
				return;
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER_GROUP:
				getParameterGroup().clear();
				getParameterGroup().addAll((Collection<? extends ParameterGroup>)newValue);
				return;
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__REFERENCED_ELEMENT:
				getReferencedElement().clear();
				getReferencedElement().addAll((Collection<? extends NestedElement>)newValue);
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
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__CONTAINED_ELEMENT:
				getContainedElement().clear();
				return;
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER_GROUP:
				getParameterGroup().clear();
				return;
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__REFERENCED_ELEMENT:
				getReferencedElement().clear();
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
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__CONTAINED_ELEMENT:
				return containedElement != null && !containedElement.isEmpty();
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__PARAMETER_GROUP:
				return parameterGroup != null && !parameterGroup.isEmpty();
			case EngineeringModelDataPackage.ELEMENT_DEFINITION__REFERENCED_ELEMENT:
				return referencedElement != null && !referencedElement.isEmpty();
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
			case EngineeringModelDataPackage.ELEMENT_DEFINITION___HAS_UNIQUE_PARAMETER_NAMES__DIAGNOSTICCHAIN_MAP:
				return hasUniqueParameterNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EngineeringModelDataPackage.ELEMENT_DEFINITION___HAS_UNIQUE_PARAMETER_SHORT_NAMES__DIAGNOSTICCHAIN_MAP:
				return hasUniqueParameterShortNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ElementDefinitionImpl
