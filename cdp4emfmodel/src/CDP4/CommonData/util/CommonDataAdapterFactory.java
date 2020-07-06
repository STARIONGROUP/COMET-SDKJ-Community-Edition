/**
 */
package CDP4.CommonData.util;

import CDP4.CommonData.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.CommonData.CommonDataPackage
 * @generated
 */
public class CommonDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommonDataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonDataSwitch<Adapter> modelSwitch =
		new CommonDataSwitch<Adapter>() {
			@Override
			public Adapter caseFileContentType(FileContentType object) {
				return createFileContentTypeAdapter();
			}
			@Override
			public Adapter caseDefinedThing(DefinedThing object) {
				return createDefinedThingAdapter();
			}
			@Override
			public Adapter caseNamedThing(NamedThing object) {
				return createNamedThingAdapter();
			}
			@Override
			public Adapter caseShortNamedThing(ShortNamedThing object) {
				return createShortNamedThingAdapter();
			}
			@Override
			public Adapter caseAlias(Alias object) {
				return createAliasAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseCitation(Citation object) {
				return createCitationAdapter();
			}
			@Override
			public Adapter caseDeprecatableThing(DeprecatableThing object) {
				return createDeprecatableThingAdapter();
			}
			@Override
			public Adapter caseHyperLink(HyperLink object) {
				return createHyperLinkAdapter();
			}
			@Override
			public Adapter caseTimeStampedThing(TimeStampedThing object) {
				return createTimeStampedThingAdapter();
			}
			@Override
			public Adapter caseTopContainer(TopContainer object) {
				return createTopContainerAdapter();
			}
			@Override
			public Adapter caseLogEntry(LogEntry object) {
				return createLogEntryAdapter();
			}
			@Override
			public Adapter caseVolatileThing(VolatileThing object) {
				return createVolatileThingAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.FileContentType <em>File Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.FileContentType
	 * @generated
	 */
	public Adapter createFileContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.DefinedThing <em>Defined Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.DefinedThing
	 * @generated
	 */
	public Adapter createDefinedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.NamedThing <em>Named Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.NamedThing
	 * @generated
	 */
	public Adapter createNamedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.ShortNamedThing <em>Short Named Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.ShortNamedThing
	 * @generated
	 */
	public Adapter createShortNamedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.Alias
	 * @generated
	 */
	public Adapter createAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.Citation
	 * @generated
	 */
	public Adapter createCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.DeprecatableThing <em>Deprecatable Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.DeprecatableThing
	 * @generated
	 */
	public Adapter createDeprecatableThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.HyperLink <em>Hyper Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.HyperLink
	 * @generated
	 */
	public Adapter createHyperLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.TimeStampedThing <em>Time Stamped Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.TimeStampedThing
	 * @generated
	 */
	public Adapter createTimeStampedThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.TopContainer <em>Top Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.TopContainer
	 * @generated
	 */
	public Adapter createTopContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.LogEntry <em>Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.LogEntry
	 * @generated
	 */
	public Adapter createLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.VolatileThing <em>Volatile Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.VolatileThing
	 * @generated
	 */
	public Adapter createVolatileThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.CommonData.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.CommonData.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CommonDataAdapterFactory
