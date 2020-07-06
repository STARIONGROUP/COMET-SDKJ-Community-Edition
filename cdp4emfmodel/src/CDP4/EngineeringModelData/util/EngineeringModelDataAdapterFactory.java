/**
 */
package CDP4.EngineeringModelData.util;

import CDP4.CommonData.Annotation;
import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.LogEntry;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;
import CDP4.CommonData.TopContainer;
import CDP4.CommonData.VolatileThing;

import CDP4.EngineeringModelData.*;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage
 * @generated
 */
public class EngineeringModelDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EngineeringModelDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringModelDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EngineeringModelDataPackage.eINSTANCE;
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
	protected EngineeringModelDataSwitch<Adapter> modelSwitch =
		new EngineeringModelDataSwitch<Adapter>() {
			@Override
			public Adapter casePossibleFiniteState(PossibleFiniteState object) {
				return createPossibleFiniteStateAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterOrOverrideBase(ParameterOrOverrideBase object) {
				return createParameterOrOverrideBaseAdapter();
			}
			@Override
			public Adapter caseParameterBase(ParameterBase object) {
				return createParameterBaseAdapter();
			}
			@Override
			public Adapter caseActualFiniteStateList(ActualFiniteStateList object) {
				return createActualFiniteStateListAdapter();
			}
			@Override
			public Adapter caseOptionDependentThing(OptionDependentThing object) {
				return createOptionDependentThingAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseNestedElement(NestedElement object) {
				return createNestedElementAdapter();
			}
			@Override
			public Adapter caseElementDefinition(ElementDefinition object) {
				return createElementDefinitionAdapter();
			}
			@Override
			public Adapter caseElementBase(ElementBase object) {
				return createElementBaseAdapter();
			}
			@Override
			public Adapter caseElementUsage(ElementUsage object) {
				return createElementUsageAdapter();
			}
			@Override
			public Adapter caseParameterOverride(ParameterOverride object) {
				return createParameterOverrideAdapter();
			}
			@Override
			public Adapter caseParameterGroup(ParameterGroup object) {
				return createParameterGroupAdapter();
			}
			@Override
			public Adapter caseParameterOverrideValueSet(ParameterOverrideValueSet object) {
				return createParameterOverrideValueSetAdapter();
			}
			@Override
			public Adapter caseParameterValueSetBase(ParameterValueSetBase object) {
				return createParameterValueSetBaseAdapter();
			}
			@Override
			public Adapter caseActualFiniteState(ActualFiniteState object) {
				return createActualFiniteStateAdapter();
			}
			@Override
			public Adapter caseParameterValueSet(ParameterValueSet object) {
				return createParameterValueSetAdapter();
			}
			@Override
			public Adapter caseNestedParameter(NestedParameter object) {
				return createNestedParameterAdapter();
			}
			@Override
			public Adapter casePossibleFiniteStateList(PossibleFiniteStateList object) {
				return createPossibleFiniteStateListAdapter();
			}
			@Override
			public Adapter caseParameterSubscription(ParameterSubscription object) {
				return createParameterSubscriptionAdapter();
			}
			@Override
			public Adapter caseParameterSubscriptionValueSet(ParameterSubscriptionValueSet object) {
				return createParameterSubscriptionValueSetAdapter();
			}
			@Override
			public Adapter caseFileStore(FileStore object) {
				return createFileStoreAdapter();
			}
			@Override
			public Adapter caseFolder(Folder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseFileRevision(FileRevision object) {
				return createFileRevisionAdapter();
			}
			@Override
			public Adapter casePublication(Publication object) {
				return createPublicationAdapter();
			}
			@Override
			public Adapter caseEngineeringModel(EngineeringModel object) {
				return createEngineeringModelAdapter();
			}
			@Override
			public Adapter caseCommonFileStore(CommonFileStore object) {
				return createCommonFileStoreAdapter();
			}
			@Override
			public Adapter caseModelLogEntry(ModelLogEntry object) {
				return createModelLogEntryAdapter();
			}
			@Override
			public Adapter caseIteration(Iteration object) {
				return createIterationAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseRelationshipParameterValue(RelationshipParameterValue object) {
				return createRelationshipParameterValueAdapter();
			}
			@Override
			public Adapter caseParameterValue(ParameterValue object) {
				return createParameterValueAdapter();
			}
			@Override
			public Adapter caseExternalIdentifierMap(ExternalIdentifierMap object) {
				return createExternalIdentifierMapAdapter();
			}
			@Override
			public Adapter caseIdCorrespondence(IdCorrespondence object) {
				return createIdCorrespondenceAdapter();
			}
			@Override
			public Adapter caseRequirementsSpecification(RequirementsSpecification object) {
				return createRequirementsSpecificationAdapter();
			}
			@Override
			public Adapter caseRequirementsContainer(RequirementsContainer object) {
				return createRequirementsContainerAdapter();
			}
			@Override
			public Adapter caseRequirementsGroup(RequirementsGroup object) {
				return createRequirementsGroupAdapter();
			}
			@Override
			public Adapter caseRequirementsContainerParameterValue(RequirementsContainerParameterValue object) {
				return createRequirementsContainerParameterValueAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseSimpleParameterizableThing(SimpleParameterizableThing object) {
				return createSimpleParameterizableThingAdapter();
			}
			@Override
			public Adapter caseSimpleParameterValue(SimpleParameterValue object) {
				return createSimpleParameterValueAdapter();
			}
			@Override
			public Adapter caseParametricConstraint(ParametricConstraint object) {
				return createParametricConstraintAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseDomainFileStore(DomainFileStore object) {
				return createDomainFileStoreAdapter();
			}
			@Override
			public Adapter caseRuleVerificationList(RuleVerificationList object) {
				return createRuleVerificationListAdapter();
			}
			@Override
			public Adapter caseRuleVerification(RuleVerification object) {
				return createRuleVerificationAdapter();
			}
			@Override
			public Adapter caseRuleViolation(RuleViolation object) {
				return createRuleViolationAdapter();
			}
			@Override
			public Adapter caseStakeholder(Stakeholder object) {
				return createStakeholderAdapter();
			}
			@Override
			public Adapter caseStakeholderValue(StakeholderValue object) {
				return createStakeholderValueAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseValueGroup(ValueGroup object) {
				return createValueGroupAdapter();
			}
			@Override
			public Adapter caseStakeHolderValueMap(StakeHolderValueMap object) {
				return createStakeHolderValueMapAdapter();
			}
			@Override
			public Adapter caseStakeHolderValueMapSettings(StakeHolderValueMapSettings object) {
				return createStakeHolderValueMapSettingsAdapter();
			}
			@Override
			public Adapter caseMultiRelationship(MultiRelationship object) {
				return createMultiRelationshipAdapter();
			}
			@Override
			public Adapter caseBinaryRelationship(BinaryRelationship object) {
				return createBinaryRelationshipAdapter();
			}
			@Override
			public Adapter caseOrExpression(OrExpression object) {
				return createOrExpressionAdapter();
			}
			@Override
			public Adapter caseNotExpression(NotExpression object) {
				return createNotExpressionAdapter();
			}
			@Override
			public Adapter caseAndExpression(AndExpression object) {
				return createAndExpressionAdapter();
			}
			@Override
			public Adapter caseExclusiveOrExpression(ExclusiveOrExpression object) {
				return createExclusiveOrExpressionAdapter();
			}
			@Override
			public Adapter caseRelationalExpression(RelationalExpression object) {
				return createRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseUserRuleVerification(UserRuleVerification object) {
				return createUserRuleVerificationAdapter();
			}
			@Override
			public Adapter caseBuiltInRuleVerification(BuiltInRuleVerification object) {
				return createBuiltInRuleVerificationAdapter();
			}
			@Override
			public Adapter caseOwnedThing(OwnedThing object) {
				return createOwnedThingAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
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
			public Adapter caseDefinedThing(DefinedThing object) {
				return createDefinedThingAdapter();
			}
			@Override
			public Adapter caseCategorizableThing(CategorizableThing object) {
				return createCategorizableThingAdapter();
			}
			@Override
			public Adapter caseVolatileThing(VolatileThing object) {
				return createVolatileThingAdapter();
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
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseDeprecatableThing(DeprecatableThing object) {
				return createDeprecatableThingAdapter();
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
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.PossibleFiniteState <em>Possible Finite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.PossibleFiniteState
	 * @generated
	 */
	public Adapter createPossibleFiniteStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterOrOverrideBase <em>Parameter Or Override Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterOrOverrideBase
	 * @generated
	 */
	public Adapter createParameterOrOverrideBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterBase <em>Parameter Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterBase
	 * @generated
	 */
	public Adapter createParameterBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ActualFiniteStateList <em>Actual Finite State List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ActualFiniteStateList
	 * @generated
	 */
	public Adapter createActualFiniteStateListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.OptionDependentThing <em>Option Dependent Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.OptionDependentThing
	 * @generated
	 */
	public Adapter createOptionDependentThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.NestedElement <em>Nested Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.NestedElement
	 * @generated
	 */
	public Adapter createNestedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ElementDefinition
	 * @generated
	 */
	public Adapter createElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ElementBase <em>Element Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ElementBase
	 * @generated
	 */
	public Adapter createElementBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ElementUsage <em>Element Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ElementUsage
	 * @generated
	 */
	public Adapter createElementUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterOverride <em>Parameter Override</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterOverride
	 * @generated
	 */
	public Adapter createParameterOverrideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterGroup
	 * @generated
	 */
	public Adapter createParameterGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterOverrideValueSet <em>Parameter Override Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterOverrideValueSet
	 * @generated
	 */
	public Adapter createParameterOverrideValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterValueSetBase <em>Parameter Value Set Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterValueSetBase
	 * @generated
	 */
	public Adapter createParameterValueSetBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ActualFiniteState <em>Actual Finite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ActualFiniteState
	 * @generated
	 */
	public Adapter createActualFiniteStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterValueSet <em>Parameter Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterValueSet
	 * @generated
	 */
	public Adapter createParameterValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.NestedParameter <em>Nested Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.NestedParameter
	 * @generated
	 */
	public Adapter createNestedParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.PossibleFiniteStateList <em>Possible Finite State List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.PossibleFiniteStateList
	 * @generated
	 */
	public Adapter createPossibleFiniteStateListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterSubscription <em>Parameter Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterSubscription
	 * @generated
	 */
	public Adapter createParameterSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterSubscriptionValueSet <em>Parameter Subscription Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterSubscriptionValueSet
	 * @generated
	 */
	public Adapter createParameterSubscriptionValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.FileStore <em>File Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.FileStore
	 * @generated
	 */
	public Adapter createFileStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.FileRevision <em>File Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.FileRevision
	 * @generated
	 */
	public Adapter createFileRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Publication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Publication
	 * @generated
	 */
	public Adapter createPublicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.EngineeringModel <em>Engineering Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.EngineeringModel
	 * @generated
	 */
	public Adapter createEngineeringModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.CommonFileStore <em>Common File Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.CommonFileStore
	 * @generated
	 */
	public Adapter createCommonFileStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ModelLogEntry <em>Model Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ModelLogEntry
	 * @generated
	 */
	public Adapter createModelLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Iteration
	 * @generated
	 */
	public Adapter createIterationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RelationshipParameterValue <em>Relationship Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RelationshipParameterValue
	 * @generated
	 */
	public Adapter createRelationshipParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParameterValue
	 * @generated
	 */
	public Adapter createParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ExternalIdentifierMap <em>External Identifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ExternalIdentifierMap
	 * @generated
	 */
	public Adapter createExternalIdentifierMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.IdCorrespondence <em>Id Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.IdCorrespondence
	 * @generated
	 */
	public Adapter createIdCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RequirementsSpecification <em>Requirements Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RequirementsSpecification
	 * @generated
	 */
	public Adapter createRequirementsSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RequirementsContainer <em>Requirements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RequirementsContainer
	 * @generated
	 */
	public Adapter createRequirementsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RequirementsGroup <em>Requirements Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RequirementsGroup
	 * @generated
	 */
	public Adapter createRequirementsGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RequirementsContainerParameterValue <em>Requirements Container Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RequirementsContainerParameterValue
	 * @generated
	 */
	public Adapter createRequirementsContainerParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.SimpleParameterizableThing <em>Simple Parameterizable Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.SimpleParameterizableThing
	 * @generated
	 */
	public Adapter createSimpleParameterizableThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.SimpleParameterValue <em>Simple Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.SimpleParameterValue
	 * @generated
	 */
	public Adapter createSimpleParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ParametricConstraint <em>Parametric Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ParametricConstraint
	 * @generated
	 */
	public Adapter createParametricConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.DomainFileStore <em>Domain File Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.DomainFileStore
	 * @generated
	 */
	public Adapter createDomainFileStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RuleVerificationList <em>Rule Verification List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RuleVerificationList
	 * @generated
	 */
	public Adapter createRuleVerificationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RuleVerification <em>Rule Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RuleVerification
	 * @generated
	 */
	public Adapter createRuleVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RuleViolation <em>Rule Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RuleViolation
	 * @generated
	 */
	public Adapter createRuleViolationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Stakeholder
	 * @generated
	 */
	public Adapter createStakeholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.StakeholderValue <em>Stakeholder Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.StakeholderValue
	 * @generated
	 */
	public Adapter createStakeholderValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ValueGroup <em>Value Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ValueGroup
	 * @generated
	 */
	public Adapter createValueGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.StakeHolderValueMap <em>Stake Holder Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMap
	 * @generated
	 */
	public Adapter createStakeHolderValueMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings <em>Stake Holder Value Map Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.StakeHolderValueMapSettings
	 * @generated
	 */
	public Adapter createStakeHolderValueMapSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.MultiRelationship <em>Multi Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.MultiRelationship
	 * @generated
	 */
	public Adapter createMultiRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.BinaryRelationship <em>Binary Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.BinaryRelationship
	 * @generated
	 */
	public Adapter createBinaryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.OrExpression
	 * @generated
	 */
	public Adapter createOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.NotExpression
	 * @generated
	 */
	public Adapter createNotExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.AndExpression
	 * @generated
	 */
	public Adapter createAndExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.ExclusiveOrExpression
	 * @generated
	 */
	public Adapter createExclusiveOrExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.RelationalExpression
	 * @generated
	 */
	public Adapter createRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.UserRuleVerification <em>User Rule Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.UserRuleVerification
	 * @generated
	 */
	public Adapter createUserRuleVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.BuiltInRuleVerification <em>Built In Rule Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.BuiltInRuleVerification
	 * @generated
	 */
	public Adapter createBuiltInRuleVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CDP4.EngineeringModelData.OwnedThing <em>Owned Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.EngineeringModelData.OwnedThing
	 * @generated
	 */
	public Adapter createOwnedThingAdapter() {
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
	 * Creates a new adapter for an object of class '{@link CDP4.SiteDirectoryData.CategorizableThing <em>Categorizable Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CDP4.SiteDirectoryData.CategorizableThing
	 * @generated
	 */
	public Adapter createCategorizableThingAdapter() {
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

} //EngineeringModelDataAdapterFactory
