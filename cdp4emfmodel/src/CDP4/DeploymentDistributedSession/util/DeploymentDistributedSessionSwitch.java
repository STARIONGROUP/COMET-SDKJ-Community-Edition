/**
 */
package CDP4.DeploymentDistributedSession.util;

import CDP4.DeploymentDistributedSession.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CDP4.DeploymentDistributedSession.DeploymentDistributedSessionPackage
 * @generated
 */
public class DeploymentDistributedSessionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeploymentDistributedSessionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentDistributedSessionSwitch() {
		if (modelPackage == null) {
			modelPackage = DeploymentDistributedSessionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DeploymentDistributedSessionPackage.CONCURRENT_ENGINEERING_SITE: {
				ConcurrentEngineeringSite concurrentEngineeringSite = (ConcurrentEngineeringSite)theEObject;
				T result = caseConcurrentEngineeringSite(concurrentEngineeringSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.DOMAIN_SPECIFIC_TOOL: {
				DomainSpecificTool domainSpecificTool = (DomainSpecificTool)theEObject;
				T result = caseDomainSpecificTool(domainSpecificTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.DOMAIN_SPECIFIC_TOOL_ADAPTER: {
				DomainSpecificToolAdapter domainSpecificToolAdapter = (DomainSpecificToolAdapter)theEObject;
				T result = caseDomainSpecificToolAdapter(domainSpecificToolAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.DOMAIN_SPECIFIC_TOOL_LIB: {
				DomainSpecificToolLib domainSpecificToolLib = (DomainSpecificToolLib)theEObject;
				T result = caseDomainSpecificToolLib(domainSpecificToolLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.EXCEL: {
				Excel excel = (Excel)theEObject;
				T result = caseExcel(excel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.EXCEL_ADMINISTRATOR_TOOL: {
				Excel_AdministratorTool excel_AdministratorTool = (Excel_AdministratorTool)theEObject;
				T result = caseExcel_AdministratorTool(excel_AdministratorTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.EXCEL_DESIGN_TOOL: {
				Excel_DesignTool excel_DesignTool = (Excel_DesignTool)theEObject;
				T result = caseExcel_DesignTool(excel_DesignTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.FIREWALL: {
				Firewall firewall = (Firewall)theEObject;
				T result = caseFirewall(firewall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.WEB_SERVICES_PROCESSOR: {
				WebServicesProcessor webServicesProcessor = (WebServicesProcessor)theEObject;
				T result = caseWebServicesProcessor(webServicesProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeploymentDistributedSessionPackage.MODEL_RDL: {
				ModelRDL modelRDL = (ModelRDL)theEObject;
				T result = caseModelRDL(modelRDL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrent Engineering Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrent Engineering Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrentEngineeringSite(ConcurrentEngineeringSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificTool(DomainSpecificTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Tool Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Tool Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificToolAdapter(DomainSpecificToolAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Specific Tool Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Specific Tool Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSpecificToolLib(DomainSpecificToolLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcel(Excel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excel Administrator Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excel Administrator Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcel_AdministratorTool(Excel_AdministratorTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excel Design Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excel Design Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcel_DesignTool(Excel_DesignTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firewall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firewall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirewall(Firewall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Services Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Services Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebServicesProcessor(WebServicesProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model RDL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model RDL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRDL(ModelRDL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DeploymentDistributedSessionSwitch
